package p000;

import coil.request.CachePolicy;
import coil.size.Precision;
import coil.size.Scale;

/* JADX INFO: loaded from: classes.dex */
public final class ba2 {

    /* JADX INFO: renamed from: a */
    public final i99 f8213a;

    /* JADX INFO: renamed from: b */
    public final Scale f8214b;

    /* JADX INFO: renamed from: c */
    public final zl6 f8215c;

    /* JADX INFO: renamed from: d */
    public final Precision f8216d;

    /* JADX INFO: renamed from: e */
    public final Boolean f8217e;

    /* JADX INFO: renamed from: f */
    public final CachePolicy f8218f;

    public ba2(i99 i99Var, Scale scale, zl6 zl6Var, Precision precision, Boolean bool, CachePolicy cachePolicy) {
        this.f8213a = i99Var;
        this.f8214b = scale;
        this.f8215c = zl6Var;
        this.f8216d = precision;
        this.f8217e = bool;
        this.f8218f = cachePolicy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba2)) {
            return false;
        }
        ba2 ba2Var = (ba2) obj;
        return fa4.m11650l(this.f8213a, ba2Var.f8213a) && this.f8214b == ba2Var.f8214b && fa4.m11650l(this.f8215c, ba2Var.f8215c) && this.f8216d == ba2Var.f8216d && fa4.m11650l(this.f8217e, ba2Var.f8217e) && this.f8218f == ba2Var.f8218f;
    }

    public final int hashCode() {
        i99 i99Var = this.f8213a;
        int iHashCode = (i99Var != null ? i99Var.hashCode() : 0) * 31;
        Scale scale = this.f8214b;
        int iHashCode2 = (iHashCode + (scale != null ? scale.hashCode() : 0)) * 28629151;
        zl6 zl6Var = this.f8215c;
        int iHashCode3 = (iHashCode2 + (zl6Var != null ? zl6Var.hashCode() : 0)) * 31;
        Precision precision = this.f8216d;
        int iHashCode4 = (iHashCode3 + (precision != null ? precision.hashCode() : 0)) * 961;
        Boolean bool = this.f8217e;
        int iHashCode5 = (iHashCode4 + (bool != null ? bool.hashCode() : 0)) * 29791;
        CachePolicy cachePolicy = this.f8218f;
        return (iHashCode5 + (cachePolicy != null ? cachePolicy.hashCode() : 0)) * 31;
    }
}
