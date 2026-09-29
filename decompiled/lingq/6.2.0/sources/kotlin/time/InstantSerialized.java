package kotlin.time;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import p000.wfb;

/* JADX INFO: loaded from: classes3.dex */
final class InstantSerialized implements Externalizable {

    /* JADX INFO: renamed from: a */
    public long f47735a;

    /* JADX INFO: renamed from: b */
    public int f47736b;

    public InstantSerialized(int i, long j) {
        this.f47735a = j;
        this.f47736b = i;
    }

    private final Object readResolve() {
        Instant instant = Instant.f47731c;
        return wfb.m23920o(this.f47735a, this.f47736b);
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        objectInput.getClass();
        this.f47735a = objectInput.readLong();
        this.f47736b = objectInput.readInt();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.getClass();
        objectOutput.writeLong(this.f47735a);
        objectOutput.writeInt(this.f47736b);
    }
}
