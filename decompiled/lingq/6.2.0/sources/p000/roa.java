package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class roa extends toa implements Iterable, tg4 {

    /* JADX INFO: renamed from: a */
    public final String f59656a;

    /* JADX INFO: renamed from: b */
    public final float f59657b;

    /* JADX INFO: renamed from: c */
    public final float f59658c;

    /* JADX INFO: renamed from: d */
    public final float f59659d;

    /* JADX INFO: renamed from: e */
    public final float f59660e;

    /* JADX INFO: renamed from: f */
    public final float f59661f;

    /* JADX INFO: renamed from: g */
    public final float f59662g;

    /* JADX INFO: renamed from: h */
    public final float f59663h;

    /* JADX INFO: renamed from: i */
    public final List f59664i;

    /* JADX INFO: renamed from: j */
    public final List f59665j;

    public roa(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.f59656a = str;
        this.f59657b = f;
        this.f59658c = f2;
        this.f59659d = f3;
        this.f59660e = f4;
        this.f59661f = f5;
        this.f59662g = f6;
        this.f59663h = f7;
        this.f59664i = list;
        this.f59665j = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof roa)) {
            roa roaVar = (roa) obj;
            return fa4.m11650l(this.f59656a, roaVar.f59656a) && this.f59657b == roaVar.f59657b && this.f59658c == roaVar.f59658c && this.f59659d == roaVar.f59659d && this.f59660e == roaVar.f59660e && this.f59661f == roaVar.f59661f && this.f59662g == roaVar.f59662g && this.f59663h == roaVar.f59663h && fa4.m11650l(this.f59664i, roaVar.f59664i) && fa4.m11650l(this.f59665j, roaVar.f59665j);
        }
        return false;
    }

    public final int hashCode() {
        return this.f59665j.hashCode() + ux5.m22979b(wq1.m24105a(wq1.m24105a(wq1.m24105a(wq1.m24105a(wq1.m24105a(wq1.m24105a(wq1.m24105a(this.f59656a.hashCode() * 31, this.f59657b, 31), this.f59658c, 31), this.f59659d, 31), this.f59660e, 31), this.f59661f, 31), this.f59662g, 31), this.f59663h, 31), 31, this.f59664i);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new r77(this);
    }
}
