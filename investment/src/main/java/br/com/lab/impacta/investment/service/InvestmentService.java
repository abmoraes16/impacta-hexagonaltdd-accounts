package br.com.lab.impacta.investment.service;

import br.com.lab.impacta.investment.domain.model.Investment;

public interface InvestmentService {
    Investment invest(Long productId, Long accountId, Double valueInvestment);
}
