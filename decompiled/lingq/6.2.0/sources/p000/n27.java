package p000;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public final class n27 implements it5 {

    /* JADX INFO: renamed from: a */
    public final List f52219a;

    /* JADX INFO: renamed from: b */
    public final int f52220b;

    /* JADX INFO: renamed from: c */
    public final int f52221c;

    /* JADX INFO: renamed from: d */
    public final int f52222d;

    /* JADX INFO: renamed from: e */
    public final Orientation f52223e;

    /* JADX INFO: renamed from: f */
    public final int f52224f;

    /* JADX INFO: renamed from: g */
    public final int f52225g;

    /* JADX INFO: renamed from: h */
    public final boolean f52226h;

    /* JADX INFO: renamed from: i */
    public final int f52227i;

    /* JADX INFO: renamed from: j */
    public final lt5 f52228j;

    /* JADX INFO: renamed from: k */
    public final lt5 f52229k;

    /* JADX INFO: renamed from: l */
    public final float f52230l;

    /* JADX INFO: renamed from: m */
    public final int f52231m;

    /* JADX INFO: renamed from: n */
    public final boolean f52232n;

    /* JADX INFO: renamed from: o */
    public final gz8 f52233o;

    /* JADX INFO: renamed from: p */
    public final it5 f52234p;

    /* JADX INFO: renamed from: q */
    public final boolean f52235q;

    /* JADX INFO: renamed from: r */
    public final List f52236r;

    /* JADX INFO: renamed from: s */
    public final List f52237s;

    /* JADX INFO: renamed from: t */
    public final un1 f52238t;

    /* JADX INFO: renamed from: u */
    public final fb2 f52239u;

    /* JADX INFO: renamed from: v */
    public final long f52240v;

    public n27(List list, int i, int i2, int i3, Orientation orientation, int i4, int i5, boolean z, int i6, lt5 lt5Var, lt5 lt5Var2, float f, int i7, boolean z2, gz8 gz8Var, it5 it5Var, boolean z3, List list2, List list3, un1 un1Var, fb2 fb2Var, long j) {
        this.f52219a = list;
        this.f52220b = i;
        this.f52221c = i2;
        this.f52222d = i3;
        this.f52223e = orientation;
        this.f52224f = i4;
        this.f52225g = i5;
        this.f52226h = z;
        this.f52227i = i6;
        this.f52228j = lt5Var;
        this.f52229k = lt5Var2;
        this.f52230l = f;
        this.f52231m = i7;
        this.f52232n = z2;
        this.f52233o = gz8Var;
        this.f52234p = it5Var;
        this.f52235q = z3;
        this.f52236r = list2;
        this.f52237s = list3;
        this.f52238t = un1Var;
        this.f52239u = fb2Var;
        this.f52240v = j;
    }

    @Override // p000.it5
    /* JADX INFO: renamed from: a */
    public final int mo10623a() {
        return this.f52234p.mo10623a();
    }

    @Override // p000.it5
    /* JADX INFO: renamed from: b */
    public final Map mo10624b() {
        return this.f52234p.mo10624b();
    }

    @Override // p000.it5
    /* JADX INFO: renamed from: c */
    public final void mo10625c() {
        this.f52234p.mo10625c();
    }

    @Override // p000.it5
    /* JADX INFO: renamed from: d */
    public final int mo10626d() {
        return this.f52234p.mo10626d();
    }

    @Override // p000.it5
    /* JADX INFO: renamed from: e */
    public final vi3 mo10691e() {
        return this.f52234p.mo10691e();
    }

    /* JADX INFO: renamed from: f */
    public final n27 m17187f(int i) {
        int i2;
        int i3 = this.f52220b + this.f52221c;
        if (this.f52235q) {
            return null;
        }
        List list = this.f52219a;
        if (list.isEmpty() || this.f52228j == null || (i2 = this.f52231m - i) < 0 || i2 >= i3) {
            return null;
        }
        float f = this.f52230l - (i3 != 0 ? i / i3 : 0.0f);
        if (this.f52229k == null || f >= 0.5f || f <= -0.5f) {
            return null;
        }
        lt5 lt5Var = (lt5) u91.m22589G0(list);
        lt5 lt5Var2 = (lt5) u91.m22597O0(list);
        int i4 = this.f52225g;
        int i5 = this.f52224f;
        if (i < 0) {
            if (Math.min((lt5Var.f50111l + i3) - i5, (lt5Var2.f50111l + i3) - i4) <= (-i)) {
                return null;
            }
        } else if (Math.min(i5 - lt5Var.f50111l, i4 - lt5Var2.f50111l) <= i) {
            return null;
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((lt5) list.get(i6)).m16540a(i);
        }
        List list2 = this.f52236r;
        int size2 = list2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            ((lt5) list2.get(i7)).m16540a(i);
        }
        List list3 = this.f52237s;
        int size3 = list3.size();
        for (int i8 = 0; i8 < size3; i8++) {
            ((lt5) list3.get(i8)).m16540a(i);
        }
        return new n27(this.f52219a, this.f52220b, this.f52221c, this.f52222d, this.f52223e, this.f52224f, this.f52225g, this.f52226h, this.f52227i, this.f52228j, this.f52229k, f, i2, this.f52232n || i > 0, this.f52233o, this.f52234p, this.f52235q, this.f52236r, this.f52237s, this.f52238t, this.f52239u, this.f52240v);
    }

    /* JADX INFO: renamed from: g */
    public final long m17188g() {
        it5 it5Var = this.f52234p;
        return (((long) it5Var.mo10626d()) << 32) | (((long) it5Var.mo10623a()) & 4294967295L);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ n27(int i, int i2, int i3, Orientation orientation, int i4, int i5, int i6, gz8 gz8Var, it5 it5Var, un1 un1Var, fb2 fb2Var, long j) {
        EmptyList emptyList = EmptyList.f47638a;
        this(emptyList, i, i2, i3, orientation, i4, i5, false, i6, null, null, 0.0f, 0, false, gz8Var, it5Var, false, emptyList, emptyList, un1Var, fb2Var, j);
    }
}
