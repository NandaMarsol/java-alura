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

	// com um m�todo abstrato, cada constante � obrigada a fornecer uma implementa��o
	public abstract BigDecimal percentualReajuste();

}
