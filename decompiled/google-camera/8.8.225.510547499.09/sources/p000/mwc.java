package p000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mwc extends mtv {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: e */
    transient int f41721e;

    private mwc() {
        super(mun.m16942e(12));
        this.f41721e = 2;
        lku.m15669w(true);
        this.f41721e = 2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f41721e = 2;
        int i = objectInputStream.readInt();
        m16907k(mun.m16942e(12));
        mpw.m16756H(this, objectInputStream, i);
    }

    /* JADX INFO: renamed from: v */
    public static mwc m17057v() {
        return new mwc();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        mpw.m16758J(this, objectOutputStream);
    }

    @Override // p000.mtv, p000.mtm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Collection mo16884a() {
        return new mup(this.f41721e);
    }
}
