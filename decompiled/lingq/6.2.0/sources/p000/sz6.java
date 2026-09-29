package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import coil.request.CachePolicy;
import coil.size.Scale;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class sz6 {

    /* JADX INFO: renamed from: a */
    public final Context f61659a;

    /* JADX INFO: renamed from: b */
    public final Bitmap.Config f61660b;

    /* JADX INFO: renamed from: c */
    public final ColorSpace f61661c;

    /* JADX INFO: renamed from: d */
    public final w89 f61662d;

    /* JADX INFO: renamed from: e */
    public final Scale f61663e;

    /* JADX INFO: renamed from: f */
    public final boolean f61664f;

    /* JADX INFO: renamed from: g */
    public final boolean f61665g;

    /* JADX INFO: renamed from: h */
    public final boolean f61666h;

    /* JADX INFO: renamed from: i */
    public final String f61667i;

    /* JADX INFO: renamed from: j */
    public final qr3 f61668j;

    /* JADX INFO: renamed from: k */
    public final cr9 f61669k;

    /* JADX INFO: renamed from: l */
    public final z37 f61670l;

    /* JADX INFO: renamed from: m */
    public final CachePolicy f61671m;

    /* JADX INFO: renamed from: n */
    public final CachePolicy f61672n;

    /* JADX INFO: renamed from: o */
    public final CachePolicy f61673o;

    public sz6(Context context, Bitmap.Config config, ColorSpace colorSpace, w89 w89Var, Scale scale, boolean z, boolean z2, boolean z3, String str, qr3 qr3Var, cr9 cr9Var, z37 z37Var, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3) {
        this.f61659a = context;
        this.f61660b = config;
        this.f61661c = colorSpace;
        this.f61662d = w89Var;
        this.f61663e = scale;
        this.f61664f = z;
        this.f61665g = z2;
        this.f61666h = z3;
        this.f61667i = str;
        this.f61668j = qr3Var;
        this.f61669k = cr9Var;
        this.f61670l = z37Var;
        this.f61671m = cachePolicy;
        this.f61672n = cachePolicy2;
        this.f61673o = cachePolicy3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sz6)) {
            return false;
        }
        sz6 sz6Var = (sz6) obj;
        return fa4.m11650l(this.f61659a, sz6Var.f61659a) && this.f61660b == sz6Var.f61660b && fa4.m11650l(this.f61661c, sz6Var.f61661c) && fa4.m11650l(this.f61662d, sz6Var.f61662d) && this.f61663e == sz6Var.f61663e && this.f61664f == sz6Var.f61664f && this.f61665g == sz6Var.f61665g && this.f61666h == sz6Var.f61666h && fa4.m11650l(this.f61667i, sz6Var.f61667i) && fa4.m11650l(this.f61668j, sz6Var.f61668j) && fa4.m11650l(this.f61669k, sz6Var.f61669k) && fa4.m11650l(this.f61670l, sz6Var.f61670l) && this.f61671m == sz6Var.f61671m && this.f61672n == sz6Var.f61672n && this.f61673o == sz6Var.f61673o;
    }

    public final int hashCode() {
        int iHashCode = (this.f61660b.hashCode() + (this.f61659a.hashCode() * 31)) * 31;
        ColorSpace colorSpace = this.f61661c;
        int iM12428e = g9a.m12428e(g9a.m12428e(g9a.m12428e((this.f61663e.hashCode() + ((this.f61662d.hashCode() + ((iHashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.f61664f), 31, this.f61665g), 31, this.f61666h);
        String str = this.f61667i;
        return this.f61673o.hashCode() + ((this.f61672n.hashCode() + ((this.f61671m.hashCode() + e65.m10869a(e65.m10869a((((iM12428e + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f61668j.f58110a)) * 31, 31, this.f61669k.f34433a), 31, this.f61670l.f70835a)) * 31)) * 31);
    }
}
