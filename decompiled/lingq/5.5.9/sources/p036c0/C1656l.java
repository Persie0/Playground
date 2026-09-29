package p036c0;

import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import p059d0.C5013n;
import p231l1.C7218l;

/* JADX INFO: renamed from: c0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1656l {

    /* JADX INFO: renamed from: a */
    public final C7218l f9264a;

    /* JADX INFO: renamed from: b */
    public final C7218l f9265b;

    /* JADX INFO: renamed from: c */
    public final C7218l f9266c;

    /* JADX INFO: renamed from: d */
    public final C7218l f9267d;

    /* JADX INFO: renamed from: e */
    public final C7218l f9268e;

    /* JADX INFO: renamed from: f */
    public final C7218l f9269f;

    /* JADX INFO: renamed from: g */
    public final C7218l f9270g;

    /* JADX INFO: renamed from: h */
    public final C7218l f9271h;

    /* JADX INFO: renamed from: i */
    public final C7218l f9272i;

    /* JADX INFO: renamed from: j */
    public final C7218l f9273j;

    /* JADX INFO: renamed from: k */
    public final C7218l f9274k;

    /* JADX INFO: renamed from: l */
    public final C7218l f9275l;

    /* JADX INFO: renamed from: m */
    public final C7218l f9276m;

    /* JADX INFO: renamed from: n */
    public final C7218l f9277n;

    /* JADX INFO: renamed from: o */
    public final C7218l f9278o;

    public C1656l() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 32767);
    }

    public C1656l(C7218l c7218l, C7218l c7218l2, C7218l c7218l3, C7218l c7218l4, C7218l c7218l5, C7218l c7218l6, C7218l c7218l7, C7218l c7218l8, C7218l c7218l9, C7218l c7218l10, C7218l c7218l11, C7218l c7218l12, int i10) {
        C7218l c7218l13 = (i10 & 1) != 0 ? C5013n.f32795d : null;
        C7218l c7218l14 = (i10 & 2) != 0 ? C5013n.f32796e : null;
        C7218l c7218l15 = (i10 & 4) != 0 ? C5013n.f32797f : null;
        C7218l c7218l16 = (i10 & 8) != 0 ? C5013n.f32798g : c7218l;
        C7218l c7218l17 = (i10 & 16) != 0 ? C5013n.f32799h : c7218l2;
        C7218l c7218l18 = (i10 & 32) != 0 ? C5013n.f32800i : c7218l3;
        C7218l c7218l19 = (i10 & 64) != 0 ? C5013n.f32804m : c7218l4;
        C7218l c7218l20 = (i10 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? C5013n.f32805n : c7218l5;
        C7218l c7218l21 = (i10 & 256) != 0 ? C5013n.f32806o : c7218l6;
        C7218l c7218l22 = (i10 & 512) != 0 ? C5013n.f32792a : c7218l7;
        C7218l c7218l23 = (i10 & 1024) != 0 ? C5013n.f32793b : c7218l8;
        C7218l c7218l24 = (i10 & 2048) != 0 ? C5013n.f32794c : c7218l9;
        C7218l c7218l25 = (i10 & 4096) != 0 ? C5013n.f32801j : c7218l10;
        C7218l c7218l26 = (i10 & 8192) != 0 ? C5013n.f32802k : c7218l11;
        C7218l c7218l27 = (i10 & 16384) != 0 ? C5013n.f32803l : c7218l12;
        C5207g.m11111f(c7218l13, "displayLarge");
        C5207g.m11111f(c7218l14, "displayMedium");
        C5207g.m11111f(c7218l15, "displaySmall");
        C5207g.m11111f(c7218l16, "headlineLarge");
        C5207g.m11111f(c7218l17, "headlineMedium");
        C5207g.m11111f(c7218l18, "headlineSmall");
        C5207g.m11111f(c7218l19, "titleLarge");
        C5207g.m11111f(c7218l20, "titleMedium");
        C5207g.m11111f(c7218l21, "titleSmall");
        C5207g.m11111f(c7218l22, "bodyLarge");
        C5207g.m11111f(c7218l23, "bodyMedium");
        C5207g.m11111f(c7218l24, "bodySmall");
        C5207g.m11111f(c7218l25, "labelLarge");
        C5207g.m11111f(c7218l26, "labelMedium");
        C5207g.m11111f(c7218l27, "labelSmall");
        this.f9264a = c7218l13;
        this.f9265b = c7218l14;
        this.f9266c = c7218l15;
        this.f9267d = c7218l16;
        this.f9268e = c7218l17;
        this.f9269f = c7218l18;
        this.f9270g = c7218l19;
        this.f9271h = c7218l20;
        this.f9272i = c7218l21;
        this.f9273j = c7218l22;
        this.f9274k = c7218l23;
        this.f9275l = c7218l24;
        this.f9276m = c7218l25;
        this.f9277n = c7218l26;
        this.f9278o = c7218l27;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1656l)) {
            return false;
        }
        C1656l c1656l = (C1656l) obj;
        if (C5207g.m11106a(this.f9264a, c1656l.f9264a) && C5207g.m11106a(this.f9265b, c1656l.f9265b) && C5207g.m11106a(this.f9266c, c1656l.f9266c) && C5207g.m11106a(this.f9267d, c1656l.f9267d) && C5207g.m11106a(this.f9268e, c1656l.f9268e) && C5207g.m11106a(this.f9269f, c1656l.f9269f) && C5207g.m11106a(this.f9270g, c1656l.f9270g) && C5207g.m11106a(this.f9271h, c1656l.f9271h) && C5207g.m11106a(this.f9272i, c1656l.f9272i) && C5207g.m11106a(this.f9273j, c1656l.f9273j) && C5207g.m11106a(this.f9274k, c1656l.f9274k) && C5207g.m11106a(this.f9275l, c1656l.f9275l) && C5207g.m11106a(this.f9276m, c1656l.f9276m) && C5207g.m11106a(this.f9277n, c1656l.f9277n) && C5207g.m11106a(this.f9278o, c1656l.f9278o)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9278o.hashCode() + ((this.f9277n.hashCode() + ((this.f9276m.hashCode() + ((this.f9275l.hashCode() + ((this.f9274k.hashCode() + ((this.f9273j.hashCode() + ((this.f9272i.hashCode() + ((this.f9271h.hashCode() + ((this.f9270g.hashCode() + ((this.f9269f.hashCode() + ((this.f9268e.hashCode() + ((this.f9267d.hashCode() + ((this.f9266c.hashCode() + ((this.f9265b.hashCode() + (this.f9264a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Typography(displayLarge=" + this.f9264a + ", displayMedium=" + this.f9265b + ",displaySmall=" + this.f9266c + ", headlineLarge=" + this.f9267d + ", headlineMedium=" + this.f9268e + ", headlineSmall=" + this.f9269f + ", titleLarge=" + this.f9270g + ", titleMedium=" + this.f9271h + ", titleSmall=" + this.f9272i + ", bodyLarge=" + this.f9273j + ", bodyMedium=" + this.f9274k + ", bodySmall=" + this.f9275l + ", labelLarge=" + this.f9276m + ", labelMedium=" + this.f9277n + ", labelSmall=" + this.f9278o + ')';
    }
}
