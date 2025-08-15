package com.investorhub.investorhub;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/investors")
@CrossOrigin(origins = "http://localhost:5173")
public class InvestorController {

    private final InvestorRepository repository;

    public InvestorController(InvestorRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Investor> getAllInvestors() {
        return repository.findAll();
    }

    @PostMapping
    public Investor createInvestor(@RequestBody Investor investor) {
        return repository.save(investor);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInvestor(@PathVariable Long id) {
    repository.deleteById(id);
    return ResponseEntity.noContent().build();
}

}
