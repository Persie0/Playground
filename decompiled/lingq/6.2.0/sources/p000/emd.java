package p000;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class emd {

    /* JADX INFO: renamed from: a */
    public int f37535a;

    /* JADX INFO: renamed from: b */
    public final int f37536b;

    /* JADX INFO: renamed from: c */
    public emd f37537c;

    /* JADX INFO: renamed from: d */
    public final HashMap f37538d = new HashMap(0);

    public emd(int i, int i2) {
        if (i > i2) {
            ij6.m13959q();
            throw null;
        }
        this.f37535a = i;
        this.f37536b = i2;
        this.f37537c = null;
    }

    public final String toString() {
        int iIdentityHashCode = System.identityHashCode(this);
        return wq1.m24124t(new StringBuilder(String.valueOf(iIdentityHashCode).length() + 4), "Node", iIdentityHashCode);
    }
}
