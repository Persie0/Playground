package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mwy implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    final mwx f41749a;

    public mwy(mwx mwxVar) {
        this.f41749a = mwxVar;
    }

    Object readResolve() {
        return this.f41749a.entrySet();
    }
}
