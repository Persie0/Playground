package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mxe implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    final mwx f41756a;

    public mxe(mwx mwxVar) {
        this.f41756a = mwxVar;
    }

    Object readResolve() {
        return this.f41756a.values();
    }
}
