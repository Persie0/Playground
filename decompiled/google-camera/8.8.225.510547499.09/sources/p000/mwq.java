package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mwq implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    final Object[] f41734a;

    public mwq(Object[] objArr) {
        this.f41734a = objArr;
    }

    Object readResolve() {
        return mws.m17096k(this.f41734a);
    }
}
