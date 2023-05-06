package bank.domain.deposit.controller;

import bank.domain.deposit.dto.DepositDto;
import bank.domain.deposit.service.DepositService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DepositController {
    private final DepositService depositService;

    public boolean submit() {
        return depositService.save(DepositDto.builder().build());
    }
}