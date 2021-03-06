package entities;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TxVin implements Serializable {

	private static final long serialVersionUID = 3510862926366378424L;

	@JsonProperty("txhash")
	private String txhash;

	@JsonProperty("coinbase")
	private String coinbase;

	@JsonProperty("txid")
	private String txid;

	@JsonProperty("sequence")
	private long sequence;

	@JsonProperty("vout")
	private long vout;

	@JsonProperty("scriptSig")
	private ScriptSig scriptSig;

	protected TxVin() {
	}

	public TxVin(String coinbase, long vinsequence) {
		super();
		this.coinbase = coinbase;
		this.sequence = vinsequence;
	}

	public TxVin(String txid, long vout, long vinsequence) {
		super();
		this.txid = txid;
		this.vout = vout;
		this.sequence = vinsequence;
	}

	public boolean isCoinbase() {
		return coinbase == null ? false : true;
	}

	public String getTxhash() {
		return txhash;
	}

	public void setTxhash(String txhash) {
		this.txhash = txhash;
	}

	public String getCoinbase() {
		return coinbase;
	}

	public void setCoinbase(String coinbase) {
		this.coinbase = coinbase;
	}

	public String getTxid() {
		return txid;
	}

	public void setTxid(String txid) {
		this.txid = txid;
	}

	public long getSequence() {
		return sequence;
	}

	public void setSequence(long sequence) {
		this.sequence = sequence;
	}

	public long getVout() {
		return vout;
	}

	public void setVout(long vout) {
		this.vout = vout;
	}

	public ScriptSig getScriptSig() {
		return scriptSig;
	}

	public void setScriptSig(ScriptSig scriptSig) {
		this.scriptSig = scriptSig;
	}

}
