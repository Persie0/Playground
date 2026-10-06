package p000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.EnumMap;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mvh extends msv {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: c */
    private transient Class f41681c;

    public mvh(Class cls) {
        super(new EnumMap(cls), mkv.m16493A(((Enum[]) cls.getEnumConstants()).length));
        this.f41681c = cls;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f41681c = (Class) objectInputStream.readObject();
        m16881i(new EnumMap(this.f41681c), new HashMap((((Enum[]) this.f41681c.getEnumConstants()).length * 3) / 2));
        mpw.m16755G(this, objectInputStream, objectInputStream.readInt());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f41681c);
        mpw.m16757I(this, objectOutputStream);
    }

    @Override // p000.msv
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object mo16875b(Object obj) {
        Enum r1 = (Enum) obj;
        r1.getClass();
        return r1;
    }

    @Override // p000.msv, p000.mvn, java.util.Map, p000.mtz
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        return super.put((Enum) obj, obj2);
    }
}
