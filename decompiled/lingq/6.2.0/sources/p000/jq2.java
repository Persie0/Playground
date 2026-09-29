package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class jq2 implements vp2 {

    /* JADX INFO: renamed from: a */
    public int f45995a;

    /* JADX INFO: renamed from: b */
    public final boolean f45996b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f45997c;

    public jq2(int i, int i2) {
        i = (i2 & 1) != 0 ? Integer.MAX_VALUE : i;
        boolean z = (i2 & 2) == 0;
        this.f45995a = i;
        this.f45996b = z;
        this.f45997c = new ArrayList();
    }

    /* JADX INFO: renamed from: c */
    public final String m14615c() {
        return wk9.m24028K(u91.m22596N0(this.f45997c, ",\n", null, null, null, 62), "  ");
    }
}
