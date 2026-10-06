package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nfh implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    private final String f42176a;

    /* JADX INFO: renamed from: b */
    private final int f42177b;

    public nfh(String str, int i) {
        this.f42176a = str;
        this.f42177b = i;
    }

    private Object readResolve() {
        return new nfi(this.f42176a, this.f42177b);
    }
}
