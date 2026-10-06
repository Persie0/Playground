package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mxj implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    final Object[] f41764a;

    public mxj(Object[] objArr) {
        this.f41764a = objArr;
    }

    Object readResolve() {
        return mxk.m17135G(this.f41764a);
    }
}
