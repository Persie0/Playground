package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mzo implements Serializable {

    /* JADX INFO: renamed from: a */
    final mzj f41848a;

    /* JADX INFO: renamed from: b */
    final mve f41849b;

    public mzo(mzj mzjVar, mve mveVar) {
        this.f41848a = mzjVar;
        this.f41849b = mveVar;
    }

    private Object readResolve() {
        return new mzp(this.f41848a, this.f41849b);
    }
}
