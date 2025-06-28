package bttjc.project.controller;

import bttjc.project.entity.PrayList;
import bttjc.project.service.PrayService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pray")
public class PrayController {

    private final PrayService prayService;

    public PrayController(PrayService prayService) {
        this.prayService = prayService;
    }

    // ✅ 查詢所有禱告清單（GET /pray）
    @PostMapping("/query")
    public ResponseEntity<List<PrayList>> queryPrayList() {
        List<PrayList> result = prayService.queryPrayList();
        return ResponseEntity.ok(result);
    }

    // ✅ 新增禱告清單（POST /pray）
    @PostMapping("/create")
    public ResponseEntity<PrayList> createPrayItem(@RequestBody PrayList prayItem) {
        PrayList saved = prayService.createPrayItem(
            prayItem.getName(),
            prayItem.isShortTerm(),
            prayItem.isLongTerm()
        );
        return ResponseEntity.ok(saved);
    }

    // ✅ 更新禱告清單（PUT /pray/{id}）
    @PostMapping("/update")
    public ResponseEntity<PrayList> updatePrayItem(
        @PathVariable Long id,
        @RequestBody PrayList prayItem
    ) {
        PrayList updated = prayService.updatePrayItem(
            id,
            prayItem.getName(),
            prayItem.isShortTerm(),
            prayItem.isLongTerm()
        );
        return ResponseEntity.ok(updated);
    }
}
