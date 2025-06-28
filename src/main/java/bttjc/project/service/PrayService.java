package bttjc.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bttjc.project.entity.PrayList;
import bttjc.project.repository.PrayListRepository;

@Service
public class PrayService {

    @Autowired
    private PrayListRepository prayListRepository;

    // ✅ 查詢全部禱告清單（Read）
    public List<PrayList> queryPrayList() {
        return prayListRepository.findAll();
    }

    // ✅ 新增一筆禱告清單（Create）
    public PrayList createPrayItem(String name, String shortTerm, String longTerm) {
        PrayList item = new PrayList();
        item.setName(name);
        item.setShortTerm(shortTerm);
        item.setLongTerm(longTerm);
        return prayListRepository.save(item);
    }

    // ✅ 更新一筆禱告清單（Update）
    public PrayList updatePrayItem(Long id, String name, String shortTerm, String longTerm) {
        Optional<PrayList> optional = prayListRepository.findById(id);
        if (optional.isPresent()) {
            PrayList item = optional.get();
            item.setName(name);
            item.setShortTerm(shortTerm);
            item.setLongTerm(longTerm);
            return prayListRepository.save(item);
        } else {
            throw new RuntimeException("找不到指定 ID 的禱告項目：" + id);
        }
    }
}