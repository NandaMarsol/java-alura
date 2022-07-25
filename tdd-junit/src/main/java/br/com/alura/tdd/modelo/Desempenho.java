package br.com.alura.tdd.modelo;

import java.math.BigDecimal;

public enum Desempenho {

	// cada constante tem seu percentual de reajuste
	A_DESEJAR {
		@Override
		public BigDecimal percentualReajuste() {
			return new BigDecimal("0.03");
		}
	},
	BOM {
		@Override
		public BigDecimal percentualReajuste() {
			return new BigDecimal("0.15");
		}
	},
	OTIMO {
		@Override
		public BigDecimal percentualReajuste() {
			return new BigDecimal("0.20");
		}
	};

	// com um método abstrato, cada constante é obrigada a fornecer uma implementação
	public abstract BigDecimal percentualReajuste();

}
