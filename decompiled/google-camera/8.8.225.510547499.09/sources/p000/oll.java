package p000;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class oll implements Externalizable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    private Map f46259a;

    public oll() {
        throw null;
    }

    public oll(Map map) {
        this.f46259a = map;
    }

    private final Object readResolve() {
        return this.f46259a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws InvalidObjectException {
        objectInput.getClass();
        byte b = objectInput.readByte();
        if (b != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b));
        }
        int i = objectInput.readInt();
        if (i < 0) {
            throw new InvalidObjectException("Illegal size value: " + i + '.');
        }
        olh olhVar = new olh(i);
        for (int i2 = 0; i2 < i; i2++) {
            olhVar.put(objectInput.readObject(), objectInput.readObject());
        }
        olhVar.m18633k();
        this.f46259a = olhVar;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.getClass();
        objectOutput.writeByte(0);
        objectOutput.writeInt(((olh) this.f46259a).f46247e);
        for (Map.Entry entry : this.f46259a.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }
}
