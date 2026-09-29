package p000;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes3.dex */
public final class b6a {

    /* JADX INFO: renamed from: a */
    public final y5a f8022a;

    /* JADX INFO: renamed from: b */
    public final Rect f8023b;

    /* JADX INFO: renamed from: c */
    public final Rect f8024c;

    /* JADX INFO: renamed from: d */
    public final boolean f8025d;

    /* JADX INFO: renamed from: e */
    public final boolean f8026e;

    /* JADX INFO: renamed from: f */
    public final boolean f8027f;

    /* JADX INFO: renamed from: g */
    public final ui3 f8028g;

    public b6a(y5a y5aVar, Rect rect, Rect rect2, boolean z, boolean z2, boolean z3, ui3 ui3Var) {
        y5aVar.getClass();
        rect.getClass();
        rect2.getClass();
        ui3Var.getClass();
        this.f8022a = y5aVar;
        this.f8023b = rect;
        this.f8024c = rect2;
        this.f8025d = z;
        this.f8026e = z2;
        this.f8027f = z3;
        this.f8028g = ui3Var;
    }

    /* JADX INFO: renamed from: a */
    public final ui3 m3371a() {
        return this.f8028g;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3372b() {
        return this.f8026e;
    }

    /* JADX INFO: renamed from: c */
    public final y5a m3373c() {
        return this.f8022a;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m3374d() {
        return this.f8027f;
    }

    /* JADX INFO: renamed from: e */
    public final Rect m3375e() {
        return this.f8024c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6a)) {
            return false;
        }
        b6a b6aVar = (b6a) obj;
        return fa4.m11650l(this.f8022a, b6aVar.f8022a) && fa4.m11650l(this.f8023b, b6aVar.f8023b) && fa4.m11650l(this.f8024c, b6aVar.f8024c) && this.f8025d == b6aVar.f8025d && this.f8026e == b6aVar.f8026e && this.f8027f == b6aVar.f8027f && this.f8028g.equals(b6aVar.f8028g);
    }

    /* JADX INFO: renamed from: f */
    public final Rect m3376f() {
        return this.f8023b;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m3377g() {
        return this.f8025d;
    }

    public final int hashCode() {
        return this.f8028g.hashCode() + g9a.m12428e(g9a.m12428e(g9a.m12428e((this.f8024c.hashCode() + ((this.f8023b.hashCode() + (this.f8022a.hashCode() * 31)) * 31)) * 961, 31, this.f8025d), 31, this.f8026e), 31, this.f8027f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TooltipData(tooltip=");
        sb.append(this.f8022a);
        sb.append(", viewRect=");
        sb.append(this.f8023b);
        sb.append(", tooltipRect=");
        sb.append(this.f8024c);
        sb.append(", parentView=null, withOverlay=");
        sb.append(this.f8025d);
        sb.append(", centered=");
        wq1.m24101A(sb, this.f8026e, ", tooltipFloat=", this.f8027f, ", action=");
        sb.append(this.f8028g);
        sb.append(")");
        return sb.toString();
    }
}
