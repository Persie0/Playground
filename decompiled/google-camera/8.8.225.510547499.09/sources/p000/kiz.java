package p000;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kiz {

    /* JADX INFO: renamed from: a */
    public final int f36226a;

    /* JADX INFO: renamed from: b */
    public final Set f36227b;

    /* JADX INFO: renamed from: c */
    public final Set f36228c;

    /* JADX INFO: renamed from: d */
    public final Set f36229d;

    /* JADX INFO: renamed from: e */
    private final int f36230e;

    public kiz(int i, Set set, Set set2, Set set3) {
        int i2;
        this.f36226a = i;
        this.f36227b = mxk.m17134F(set);
        this.f36229d = mxk.m17134F(set2);
        this.f36228c = mxk.m17134F(set3);
        synchronized (kiu.class) {
            i2 = kiu.f36223f;
            kiu.f36223f = i2 + 1;
        }
        this.f36230e = i2;
    }

    public final String toString() {
        return "Request-" + this.f36230e;
    }
}
