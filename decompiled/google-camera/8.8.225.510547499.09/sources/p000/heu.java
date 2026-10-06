package p000;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class heu {

    /* JADX INFO: renamed from: a */
    public String f27492a;

    /* JADX INFO: renamed from: b */
    public Drawable f27493b;

    /* JADX INFO: renamed from: c */
    public Runnable f27494c;

    /* JADX INFO: renamed from: d */
    public Runnable f27495d;

    /* JADX INFO: renamed from: e */
    public String f27496e;

    /* JADX INFO: renamed from: f */
    public Runnable f27497f;

    /* JADX INFO: renamed from: g */
    public Runnable f27498g;

    /* JADX INFO: renamed from: h */
    public Runnable f27499h;

    /* JADX INFO: renamed from: i */
    public Runnable f27500i;

    /* JADX INFO: renamed from: j */
    private long f27501j;

    /* JADX INFO: renamed from: k */
    private boolean f27502k;

    /* JADX INFO: renamed from: l */
    private boolean f27503l;

    /* JADX INFO: renamed from: m */
    private byte f27504m;

    public heu() {
    }

    public heu(hev hevVar) {
        this.f27501j = hevVar.f27505a;
        this.f27502k = hevVar.f27506b;
        this.f27492a = hevVar.f27507c;
        this.f27493b = hevVar.f27508d;
        this.f27494c = hevVar.f27509e;
        this.f27495d = hevVar.f27510f;
        this.f27496e = hevVar.f27511g;
        this.f27497f = hevVar.f27512h;
        this.f27498g = hevVar.f27513i;
        this.f27499h = hevVar.f27514j;
        this.f27500i = hevVar.f27515k;
        this.f27503l = hevVar.f27516l;
        this.f27504m = (byte) 7;
    }

    /* JADX INFO: renamed from: a */
    public final hev m10160a() {
        hev hevVarM10161b = m10161b();
        boolean z = false;
        boolean z2 = (hevVarM10161b.f27507c == null && hevVarM10161b.f27508d == null) ? false : true;
        Runnable runnable = hevVarM10161b.f27509e;
        lku.m15613H(z2);
        if (runnable == null || z2) {
            z = true;
        }
        lku.m15613H(z);
        lku.m15613H(true);
        String str = hevVarM10161b.f27507c;
        if (str != null && hevVarM10161b.f27511g == null) {
            heu heuVarM10166b = hevVarM10161b.m10166b();
            heuVarM10166b.f27496e = str;
            hevVarM10161b = heuVarM10166b.m10161b();
        }
        if (hevVarM10161b.f27505a != 0) {
            return hevVarM10161b;
        }
        heu heuVarM10166b2 = hevVarM10161b.m10166b();
        heuVarM10166b2.m10163d(true);
        heuVarM10166b2.m10164e(-1L);
        return heuVarM10166b2.m10160a();
    }

    /* JADX INFO: renamed from: b */
    public final hev m10161b() {
        if (this.f27504m == 7) {
            return new hev(this.f27501j, this.f27502k, this.f27492a, this.f27493b, this.f27494c, this.f27495d, this.f27496e, this.f27497f, this.f27498g, this.f27499h, this.f27500i, this.f27503l);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f27504m & 1) == 0) {
            sb.append(" timeoutMillis");
        }
        if ((this.f27504m & 2) == 0) {
            sb.append(" autoHideOnClick");
        }
        if ((this.f27504m & 4) == 0) {
            sb.append(" sticky");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: c */
    public final void m10162c(boolean z) {
        this.f27502k = z;
        this.f27504m = (byte) (this.f27504m | 2);
    }

    /* JADX INFO: renamed from: d */
    public final void m10163d(boolean z) {
        this.f27503l = z;
        this.f27504m = (byte) (this.f27504m | 4);
    }

    /* JADX INFO: renamed from: e */
    public final void m10164e(long j) {
        this.f27501j = j;
        this.f27504m = (byte) (this.f27504m | 1);
    }
}
