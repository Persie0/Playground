package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mwd implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    final mwj f41722a;

    public mwd(mwj mwjVar) {
        this.f41722a = mwjVar;
    }

    Object readResolve() {
        return this.f41722a.mo17025v();
    }
}
