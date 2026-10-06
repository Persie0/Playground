package p000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mss extends msv {
    private static final long serialVersionUID = 0;

    public mss(Map map, msv msvVar) {
        super(map, msvVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f41564b = (msv) objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f41564b);
    }

    @Override // p000.msv
    /* JADX INFO: renamed from: b */
    public final Object mo16875b(Object obj) {
        return this.f41564b.mo16876d(obj);
    }

    @Override // p000.msv
    /* JADX INFO: renamed from: d */
    public final Object mo16876d(Object obj) {
        return this.f41564b.mo16875b(obj);
    }

    Object readResolve() {
        return this.f41564b.mo16877e();
    }
}
