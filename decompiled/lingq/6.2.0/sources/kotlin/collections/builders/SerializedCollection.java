package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.AbstractCollection;
import java.util.Iterator;
import p000.AbstractC3489q9;
import p000.vz1;
import p000.wq1;

/* JADX INFO: loaded from: classes3.dex */
public final class SerializedCollection implements Externalizable {

    /* JADX INFO: renamed from: a */
    public AbstractCollection f47673a;

    /* JADX INFO: renamed from: b */
    public final int f47674b;

    public SerializedCollection(AbstractCollection abstractCollection, int i) {
        this.f47673a = abstractCollection;
        this.f47674b = i;
    }

    private final Object readResolve() {
        return this.f47673a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        AbstractCollection abstractCollectionM23635i;
        objectInput.getClass();
        byte b = objectInput.readByte();
        int i = b & 1;
        if ((b & (-2)) != 0) {
            throw new InvalidObjectException(wq1.m24114j("Unsupported flags value: ", b, '.'));
        }
        int i2 = objectInput.readInt();
        if (i2 < 0) {
            throw new InvalidObjectException(wq1.m24114j("Illegal size value: ", i2, '.'));
        }
        int i3 = 0;
        if (i == 0) {
            ListBuilder listBuilder = new ListBuilder(i2);
            while (i3 < i2) {
                listBuilder.add(objectInput.readObject());
                i3++;
            }
            abstractCollectionM23635i = vz1.m23635i(listBuilder);
        } else {
            if (i != 1) {
                throw new InvalidObjectException(wq1.m24114j("Unsupported collection type tag: ", i, '.'));
            }
            SetBuilder setBuilder = new SetBuilder(i2);
            while (i3 < i2) {
                setBuilder.add(objectInput.readObject());
                i3++;
            }
            abstractCollectionM23635i = AbstractC3489q9.m19776f(setBuilder);
        }
        this.f47673a = abstractCollectionM23635i;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.getClass();
        objectOutput.writeByte(this.f47674b);
        objectOutput.writeInt(this.f47673a.size());
        Iterator it = this.f47673a.iterator();
        while (it.hasNext()) {
            objectOutput.writeObject(it.next());
        }
    }
}
