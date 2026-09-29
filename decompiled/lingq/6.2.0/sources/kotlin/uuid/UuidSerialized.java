package kotlin.uuid;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/* JADX INFO: loaded from: classes3.dex */
final class UuidSerialized implements Externalizable {

    /* JADX INFO: renamed from: a */
    public long f47744a;

    /* JADX INFO: renamed from: b */
    public long f47745b;

    private final Object readResolve() {
        long j = this.f47744a;
        long j2 = this.f47745b;
        return (j == 0 && j2 == 0) ? Uuid.f47741c : new Uuid(j, j2);
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        objectInput.getClass();
        this.f47744a = objectInput.readLong();
        this.f47745b = objectInput.readLong();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.getClass();
        objectOutput.writeLong(this.f47744a);
        objectOutput.writeLong(this.f47745b);
    }
}
