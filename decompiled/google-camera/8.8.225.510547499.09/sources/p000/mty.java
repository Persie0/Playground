package p000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mty extends msx {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: e */
    transient int f41611e;

    private mty() {
        this(12, 3);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f41611e = 3;
        int i = objectInputStream.readInt();
        m16907k(new mun());
        mpw.m16756H(this, objectInputStream, i);
    }

    /* JADX INFO: renamed from: v */
    public static mty m16936v() {
        return new mty(12, 3);
    }

    /* JADX INFO: renamed from: w */
    public static mty m16937w(myv myvVar) {
        return new mty(myvVar);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        mpw.m16758J(this, objectOutputStream);
    }

    @Override // p000.msx, p000.mtm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Collection mo16884a() {
        return new ArrayList(this.f41611e);
    }

    private mty(int i, int i2) {
        super(mun.m16942e(i));
        lku.m15655i(i2, "expectedValuesPerKey");
        this.f41611e = i2;
    }

    private mty(myv myvVar) {
        this(myvVar.mo16913r().size(), ((mty) myvVar).f41611e);
        mtq mtqVar = (mtq) myvVar;
        Collection<Map.Entry> mywVar = mtqVar.f41603c;
        if (mywVar == null) {
            mywVar = new myw(mtqVar);
            mtqVar.f41603c = mywVar;
        }
        for (Map.Entry entry : mywVar) {
            mo16908p(entry.getKey(), entry.getValue());
        }
    }
}
