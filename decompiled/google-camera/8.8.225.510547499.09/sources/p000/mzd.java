package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mzd extends mza implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    private final Object f41828a;

    /* JADX INFO: renamed from: b */
    private final int f41829b;

    public mzd(Object obj, int i) {
        this.f41828a = obj;
        this.f41829b = i;
        lku.m15655i(i, "count");
    }

    @Override // p000.myx
    /* JADX INFO: renamed from: a */
    public final int mo17161a() {
        return this.f41829b;
    }

    @Override // p000.myx
    /* JADX INFO: renamed from: b */
    public final Object mo17162b() {
        return this.f41828a;
    }
}
