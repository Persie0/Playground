package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mvf implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    private final mve f41680a;

    public mvf(mve mveVar) {
        this.f41680a = mveVar;
    }

    private Object readResolve() {
        return new mvg(this.f41680a);
    }
}
