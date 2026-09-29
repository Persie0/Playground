package p000;

import android.graphics.Bitmap;
import coil.request.CachePolicy;
import coil.size.Precision;

/* JADX INFO: loaded from: classes.dex */
public final class s72 {

    /* JADX INFO: renamed from: a */
    public final nn1 f60448a;

    /* JADX INFO: renamed from: b */
    public final nn1 f60449b;

    /* JADX INFO: renamed from: c */
    public final nn1 f60450c;

    /* JADX INFO: renamed from: d */
    public final nn1 f60451d;

    /* JADX INFO: renamed from: e */
    public final zl6 f60452e;

    /* JADX INFO: renamed from: f */
    public final Precision f60453f;

    /* JADX INFO: renamed from: g */
    public final Bitmap.Config f60454g;

    /* JADX INFO: renamed from: h */
    public final boolean f60455h;

    /* JADX INFO: renamed from: i */
    public final CachePolicy f60456i;

    /* JADX INFO: renamed from: j */
    public final CachePolicy f60457j;

    /* JADX INFO: renamed from: k */
    public final CachePolicy f60458k;

    public s72() {
        v72 v72Var = ph2.f56212a;
        xq3 xq3Var = dp5.f36000a.f68538f;
        t62 t62Var = t62.f61909c;
        Precision precision = Precision.AUTOMATIC;
        Bitmap.Config config = AbstractC3057h.f41582b;
        CachePolicy cachePolicy = CachePolicy.ENABLED;
        this.f60448a = xq3Var;
        this.f60449b = t62Var;
        this.f60450c = t62Var;
        this.f60451d = t62Var;
        this.f60452e = zl6.f71703a;
        this.f60453f = precision;
        this.f60454g = config;
        this.f60455h = true;
        this.f60456i = cachePolicy;
        this.f60457j = cachePolicy;
        this.f60458k = cachePolicy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s72)) {
            return false;
        }
        s72 s72Var = (s72) obj;
        return fa4.m11650l(this.f60448a, s72Var.f60448a) && fa4.m11650l(this.f60449b, s72Var.f60449b) && fa4.m11650l(this.f60450c, s72Var.f60450c) && fa4.m11650l(this.f60451d, s72Var.f60451d) && fa4.m11650l(this.f60452e, s72Var.f60452e) && this.f60453f == s72Var.f60453f && this.f60454g == s72Var.f60454g && this.f60455h == s72Var.f60455h && this.f60456i == s72Var.f60456i && this.f60457j == s72Var.f60457j && this.f60458k == s72Var.f60458k;
    }

    public final int hashCode() {
        int iHashCode = (this.f60451d.hashCode() + ((this.f60450c.hashCode() + ((this.f60449b.hashCode() + (this.f60448a.hashCode() * 31)) * 31)) * 31)) * 31;
        this.f60452e.getClass();
        return this.f60458k.hashCode() + ((this.f60457j.hashCode() + ((this.f60456i.hashCode() + g9a.m12428e(g9a.m12428e((this.f60454g.hashCode() + ((this.f60453f.hashCode() + ((zl6.class.hashCode() + iHashCode) * 31)) * 31)) * 31, 31, this.f60455h), 923521, false)) * 31)) * 31);
    }
}
