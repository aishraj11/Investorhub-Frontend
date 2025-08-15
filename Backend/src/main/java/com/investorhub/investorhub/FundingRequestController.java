package com.investorhub.investorhub;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/funding-requests")
@CrossOrigin(origins = "http://localhost:5173")
public class FundingRequestController {

    private final FundingRequestRepository repository;

    public FundingRequestController(FundingRequestRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<FundingRequest> getAllRequests() {
        return repository.findAll();
    }

    @PostMapping
    public FundingRequest createRequest(@RequestBody FundingRequest request) {
        return repository.save(request);
    }
}
