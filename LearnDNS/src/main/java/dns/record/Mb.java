package dns.record;

import dns.Mailbox;


import java.io.IOException;
import java.nio.ByteBuffer;



public class Mb extends RecordData<Mb> {

	private final Mailbox mailbox;

	public Mb() {
		this(new Mailbox());
	}

	public Mb(Mailbox domain) {
		this.mailbox = domain;
	}

	public Mailbox getMailbox() {
		return mailbox;
	}

	@Override
	public Mb toBytes(ByteBuffer buf) throws IOException {
		mailbox.toBytes(buf);
		return this;
	}

	@Override
	public RecordData<Mb> fromBytes(ByteBuffer buf) throws IOException {
		mailbox.fromBytes(buf);
		return this;
	}

	@Override
	public String toString() {
		return "Mb [mailbox=" + mailbox + "]";
	}

}
