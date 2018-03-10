package entities;

import java.io.Serializable;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TxVout implements Serializable {

	private static final long serialVersionUID = -2969447956057942695L;

	@JsonProperty("txhash")
	@Column(name = "txhash")
	private String txhash;

	@JsonProperty("value")
	@Column(name = "value")
	private long value;

	protected TxVout() {
	}

	public TxVout(long value) {
		super();
		this.value = value;
	}

	public String getTxHash() {
		return txhash;
	}

	public void setTxHash(String txHash) {
		this.txhash = txHash;
	}

	public long getValue() {
		return value;
	}

	public void setValue(long value) {
		this.value = value;
	}
}