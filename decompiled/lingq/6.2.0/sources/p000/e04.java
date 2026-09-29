package p000;

import android.content.Context;
import android.graphics.Bitmap;
import coil.request.CachePolicy;
import coil.size.Precision;
import coil.size.Scale;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e04 {

    /* JADX INFO: renamed from: A */
    public final s72 f36501A;

    /* JADX INFO: renamed from: a */
    public final Context f36502a;

    /* JADX INFO: renamed from: b */
    public final Object f36503b;

    /* JADX INFO: renamed from: c */
    public final lr9 f36504c;

    /* JADX INFO: renamed from: d */
    public final Bitmap.Config f36505d;

    /* JADX INFO: renamed from: e */
    public final Precision f36506e;

    /* JADX INFO: renamed from: f */
    public final List f36507f;

    /* JADX INFO: renamed from: g */
    public final zl6 f36508g;

    /* JADX INFO: renamed from: h */
    public final qr3 f36509h;

    /* JADX INFO: renamed from: i */
    public final cr9 f36510i;

    /* JADX INFO: renamed from: j */
    public final boolean f36511j;

    /* JADX INFO: renamed from: k */
    public final boolean f36512k;

    /* JADX INFO: renamed from: l */
    public final boolean f36513l;

    /* JADX INFO: renamed from: m */
    public final boolean f36514m;

    /* JADX INFO: renamed from: n */
    public final CachePolicy f36515n;

    /* JADX INFO: renamed from: o */
    public final CachePolicy f36516o;

    /* JADX INFO: renamed from: p */
    public final CachePolicy f36517p;

    /* JADX INFO: renamed from: q */
    public final nn1 f36518q;

    /* JADX INFO: renamed from: r */
    public final nn1 f36519r;

    /* JADX INFO: renamed from: s */
    public final nn1 f36520s;

    /* JADX INFO: renamed from: t */
    public final nn1 f36521t;

    /* JADX INFO: renamed from: u */
    public final AbstractC3572sf f36522u;

    /* JADX INFO: renamed from: v */
    public final i99 f36523v;

    /* JADX INFO: renamed from: w */
    public final Scale f36524w;

    /* JADX INFO: renamed from: x */
    public final z37 f36525x;

    /* JADX INFO: renamed from: y */
    public final Integer f36526y;

    /* JADX INFO: renamed from: z */
    public final ba2 f36527z;

    public e04(Context context, Object obj, lr9 lr9Var, Bitmap.Config config, Precision precision, List list, zl6 zl6Var, qr3 qr3Var, cr9 cr9Var, boolean z, boolean z2, boolean z3, boolean z4, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, nn1 nn1Var, nn1 nn1Var2, nn1 nn1Var3, nn1 nn1Var4, AbstractC3572sf abstractC3572sf, i99 i99Var, Scale scale, z37 z37Var, Integer num, ba2 ba2Var, s72 s72Var) {
        this.f36502a = context;
        this.f36503b = obj;
        this.f36504c = lr9Var;
        this.f36505d = config;
        this.f36506e = precision;
        this.f36507f = list;
        this.f36508g = zl6Var;
        this.f36509h = qr3Var;
        this.f36510i = cr9Var;
        this.f36511j = z;
        this.f36512k = z2;
        this.f36513l = z3;
        this.f36514m = z4;
        this.f36515n = cachePolicy;
        this.f36516o = cachePolicy2;
        this.f36517p = cachePolicy3;
        this.f36518q = nn1Var;
        this.f36519r = nn1Var2;
        this.f36520s = nn1Var3;
        this.f36521t = nn1Var4;
        this.f36522u = abstractC3572sf;
        this.f36523v = i99Var;
        this.f36524w = scale;
        this.f36525x = z37Var;
        this.f36526y = num;
        this.f36527z = ba2Var;
        this.f36501A = s72Var;
    }

    /* JADX INFO: renamed from: a */
    public static d04 m10778a(e04 e04Var) {
        Context context = e04Var.f36502a;
        e04Var.getClass();
        return new d04(e04Var, context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e04)) {
            return false;
        }
        e04 e04Var = (e04) obj;
        return fa4.m11650l(this.f36502a, e04Var.f36502a) && this.f36503b.equals(e04Var.f36503b) && fa4.m11650l(this.f36504c, e04Var.f36504c) && this.f36505d == e04Var.f36505d && this.f36506e == e04Var.f36506e && fa4.m11650l(this.f36507f, e04Var.f36507f) && fa4.m11650l(this.f36508g, e04Var.f36508g) && fa4.m11650l(this.f36509h, e04Var.f36509h) && fa4.m11650l(this.f36510i, e04Var.f36510i) && this.f36511j == e04Var.f36511j && this.f36512k == e04Var.f36512k && this.f36513l == e04Var.f36513l && this.f36514m == e04Var.f36514m && this.f36515n == e04Var.f36515n && this.f36516o == e04Var.f36516o && this.f36517p == e04Var.f36517p && fa4.m11650l(this.f36518q, e04Var.f36518q) && fa4.m11650l(this.f36519r, e04Var.f36519r) && fa4.m11650l(this.f36520s, e04Var.f36520s) && fa4.m11650l(this.f36521t, e04Var.f36521t) && fa4.m11650l(this.f36526y, e04Var.f36526y) && fa4.m11650l(this.f36522u, e04Var.f36522u) && this.f36523v.equals(e04Var.f36523v) && this.f36524w == e04Var.f36524w && fa4.m11650l(this.f36525x, e04Var.f36525x) && this.f36527z.equals(e04Var.f36527z) && fa4.m11650l(this.f36501A, e04Var.f36501A);
    }

    public final int hashCode() {
        int iHashCode = (this.f36503b.hashCode() + (this.f36502a.hashCode() * 31)) * 31;
        lr9 lr9Var = this.f36504c;
        int iM10869a = e65.m10869a((this.f36524w.hashCode() + ((this.f36523v.hashCode() + ((this.f36522u.hashCode() + ((this.f36521t.hashCode() + ((this.f36520s.hashCode() + ((this.f36519r.hashCode() + ((this.f36518q.hashCode() + ((this.f36517p.hashCode() + ((this.f36516o.hashCode() + ((this.f36515n.hashCode() + g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(e65.m10869a((((this.f36508g.hashCode() + ux5.m22979b((this.f36506e.hashCode() + ((this.f36505d.hashCode() + ((iHashCode + (lr9Var != null ? lr9Var.hashCode() : 0)) * 923521)) * 961)) * 29791, 31, this.f36507f)) * 31) + Arrays.hashCode(this.f36509h.f58110a)) * 31, 31, this.f36510i.f34433a), 31, this.f36511j), 31, this.f36512k), 31, this.f36513l), 31, this.f36514m)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 961, this.f36525x.f70835a);
        Integer num = this.f36526y;
        return this.f36501A.hashCode() + ((this.f36527z.hashCode() + ((iM10869a + (num != null ? num.hashCode() : 0)) * 887503681)) * 31);
    }
}
