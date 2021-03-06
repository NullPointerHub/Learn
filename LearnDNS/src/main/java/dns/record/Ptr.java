package dns.record;



import dns.Domain;

import java.io.IOException;
import java.nio.ByteBuffer;



public class Ptr extends RecordData<Ptr> {

	private final Domain domain;

	public Ptr() {
		this(new Domain());
	}

	public Ptr(Domain domain) {
		this.domain = domain;
	}

	public Domain getDomain() {
		return domain;
	}

	@Override
	public RecordData<Ptr> toBytes(ByteBuffer buf) throws IOException {
		domain.toBytes(buf);
		return this;
	}

	@Override
	public RecordData<Ptr> fromBytes(ByteBuffer buf) throws IOException {
		domain.fromBytes(buf);
		return this;
	}

	@Override
	public String toString() {
		return "Ptr [domain=" + domain + "]";
	}

}
