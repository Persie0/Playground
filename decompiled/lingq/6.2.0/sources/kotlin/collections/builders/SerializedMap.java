package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import p000.q77;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes3.dex */
final class SerializedMap implements Externalizable {

    /* JADX INFO: renamed from: a */
    public MapBuilder f47675a;

    public SerializedMap(MapBuilder mapBuilder) {
        this.f47675a = mapBuilder;
    }

    private final Object readResolve() {
        return this.f47675a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        objectInput.getClass();
        byte b = objectInput.readByte();
        if (b != 0) {
            throw new InvalidObjectException(ux5.m22988k(b, "Unsupported flags value: "));
        }
        int i = objectInput.readInt();
        if (i < 0) {
            throw new InvalidObjectException(wq1.m24114j("Illegal size value: ", i, '.'));
        }
        MapBuilder mapBuilder = new MapBuilder(i);
        for (int i2 = 0; i2 < i; i2++) {
            mapBuilder.put(objectInput.readObject(), objectInput.readObject());
        }
        this.f47675a = mapBuilder.m15392b();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.getClass();
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.f47675a.f47669i);
        for (Map.Entry entry : (q77) this.f47675a.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }
}
