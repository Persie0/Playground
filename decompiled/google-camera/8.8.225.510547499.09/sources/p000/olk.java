package p000;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class olk implements Externalizable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    private Collection f46257a;

    /* JADX INFO: renamed from: b */
    private final int f46258b;

    public olk() {
        throw null;
    }

    public olk(Collection collection, int i) {
        this.f46257a = collection;
        this.f46258b = i;
    }

    private final Object readResolve() {
        return this.f46257a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws InvalidObjectException {
        Collection collection;
        objectInput.getClass();
        byte b = objectInput.readByte();
        int i = b & 1;
        if ((b & (-2)) != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b) + '.');
        }
        int i2 = objectInput.readInt();
        if (i2 < 0) {
            throw new InvalidObjectException("Illegal size value: " + i2 + '.');
        }
        int i3 = 0;
        switch (i) {
            case 0:
                olc olcVar = new olc(i2);
                while (i3 < i2) {
                    olcVar.add(objectInput.readObject());
                    i3++;
                }
                omn.m18681U(olcVar);
                collection = olcVar;
                break;
            default:
                olm olmVar = new olm(new olh(i2));
                while (i3 < i2) {
                    olmVar.add(objectInput.readObject());
                    i3++;
                }
                omn.m18720y(olmVar);
                collection = olmVar;
                break;
        }
        this.f46257a = collection;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.getClass();
        objectOutput.writeByte(this.f46258b);
        objectOutput.writeInt(this.f46257a.size());
        Iterator it = this.f46257a.iterator();
        while (it.hasNext()) {
            objectOutput.writeObject(it.next());
        }
    }
}
