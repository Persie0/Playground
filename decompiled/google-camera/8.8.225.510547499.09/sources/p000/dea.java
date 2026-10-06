package p000;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dea {

    /* JADX INFO: renamed from: a */
    public String f10618a;

    /* JADX INFO: renamed from: b */
    public Runnable f10619b;

    /* JADX INFO: renamed from: c */
    public Drawable f10620c;

    /* JADX INFO: renamed from: d */
    public mrm f10621d;

    /* JADX INFO: renamed from: e */
    public int f10622e;

    /* JADX INFO: renamed from: f */
    public int f10623f;

    /* JADX INFO: renamed from: g */
    private long f10624g;

    /* JADX INFO: renamed from: h */
    private int f10625h;

    /* JADX INFO: renamed from: i */
    private int f10626i;

    /* JADX INFO: renamed from: j */
    private mrm f10627j;

    /* JADX INFO: renamed from: k */
    private boolean f10628k;

    /* JADX INFO: renamed from: l */
    private long f10629l;

    /* JADX INFO: renamed from: m */
    private byte f10630m;

    public dea() {
    }

    public dea(deb debVar) {
        mqu mquVar = mqu.f41450a;
        this.f10621d = mquVar;
        this.f10627j = mquVar;
        this.f10624g = debVar.f10631a;
        this.f10618a = debVar.f10632b;
        this.f10619b = debVar.f10633c;
        this.f10620c = debVar.f10634d;
        this.f10622e = debVar.f10641k;
        this.f10623f = debVar.f10642l;
        this.f10621d = debVar.f10635e;
        this.f10625h = debVar.f10636f;
        this.f10626i = debVar.f10637g;
        this.f10627j = debVar.f10638h;
        this.f10628k = debVar.f10639i;
        this.f10629l = debVar.f10640j;
        this.f10630m = (byte) 31;
    }

    public dea(byte[] bArr) {
        mqu mquVar = mqu.f41450a;
        this.f10621d = mquVar;
        this.f10627j = mquVar;
    }

    /* JADX INFO: renamed from: a */
    public final deb m5967a() {
        int i;
        int i2;
        if (this.f10630m == 31 && (i = this.f10622e) != 0 && (i2 = this.f10623f) != 0) {
            return new deb(this.f10624g, this.f10618a, this.f10619b, this.f10620c, i, i2, this.f10621d, this.f10625h, this.f10626i, this.f10627j, this.f10628k, this.f10629l);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f10630m & 1) == 0) {
            sb.append(" id");
        }
        if (this.f10622e == 0) {
            sb.append(" actionType");
        }
        if (this.f10623f == 0) {
            sb.append(" resultType");
        }
        if ((this.f10630m & 2) == 0) {
            sb.append(" barcodeValueFormat");
        }
        if ((this.f10630m & 4) == 0) {
            sb.append(" barcodeFormat");
        }
        if ((this.f10630m & 8) == 0) {
            sb.append(" gleamingEnabled");
        }
        if ((this.f10630m & 16) == 0) {
            sb.append(" timestamp");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final void m5968b(int i) {
        this.f10626i = i;
        this.f10630m = (byte) (this.f10630m | 4);
    }

    /* JADX INFO: renamed from: c */
    public final void m5969c(int i) {
        this.f10625h = i;
        this.f10630m = (byte) (this.f10630m | 2);
    }

    /* JADX INFO: renamed from: d */
    public final void m5970d(ddy ddyVar) {
        this.f10627j = mrm.m16828h(ddyVar);
    }

    /* JADX INFO: renamed from: e */
    public final void m5971e(boolean z) {
        this.f10628k = z;
        this.f10630m = (byte) (this.f10630m | 8);
    }

    /* JADX INFO: renamed from: f */
    public final void m5972f(long j) {
        this.f10624g = j;
        this.f10630m = (byte) (this.f10630m | 1);
    }

    /* JADX INFO: renamed from: g */
    public final void m5973g(long j) {
        this.f10629l = j;
        this.f10630m = (byte) (this.f10630m | 16);
    }
}
