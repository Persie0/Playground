package androidx.compose.p017ui.platform;

import android.graphics.Outline;
import android.os.Build;
import androidx.compose.p017ui.unit.LayoutDirection;
import dm.C5207g;
import kotlin.NoWhenBranchMatchedException;
import p260m8.C7499b;
import p338qd.C8573r0;
import p338qd.C8584v;
import p349qo.C8656b;
import p375s0.C8939a;
import p375s0.C8941c;
import p375s0.C8942d;
import p375s0.C8943e;
import p375s0.C8944f;
import p387t0.AbstractC9134a0;
import p387t0.C9144f0;
import p387t0.C9151j;
import p387t0.InterfaceC9138c0;
import p387t0.InterfaceC9154k0;
import p387t0.InterfaceC9165q;
import p470x1.InterfaceC10015c;

/* JADX INFO: renamed from: androidx.compose.ui.platform.w0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0673w0 {

    /* JADX INFO: renamed from: a */
    public InterfaceC10015c f4361a;

    /* JADX INFO: renamed from: b */
    public boolean f4362b;

    /* JADX INFO: renamed from: c */
    public final Outline f4363c;

    /* JADX INFO: renamed from: d */
    public long f4364d;

    /* JADX INFO: renamed from: e */
    public InterfaceC9154k0 f4365e;

    /* JADX INFO: renamed from: f */
    public C9151j f4366f;

    /* JADX INFO: renamed from: g */
    public InterfaceC9138c0 f4367g;

    /* JADX INFO: renamed from: h */
    public boolean f4368h;

    /* JADX INFO: renamed from: i */
    public boolean f4369i;

    /* JADX INFO: renamed from: j */
    public InterfaceC9138c0 f4370j;

    /* JADX INFO: renamed from: k */
    public C8943e f4371k;

    /* JADX INFO: renamed from: l */
    public float f4372l;

    /* JADX INFO: renamed from: m */
    public long f4373m;

    /* JADX INFO: renamed from: n */
    public long f4374n;

    /* JADX INFO: renamed from: o */
    public boolean f4375o;

    /* JADX INFO: renamed from: p */
    public LayoutDirection f4376p;

    /* JADX INFO: renamed from: q */
    public AbstractC9134a0 f4377q;

    public C0673w0(InterfaceC10015c interfaceC10015c) {
        C5207g.m11111f(interfaceC10015c, "density");
        this.f4361a = interfaceC10015c;
        this.f4362b = true;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f4363c = outline;
        long j10 = C8944f.f46906b;
        this.f4364d = j10;
        this.f4365e = C9144f0.f47650a;
        this.f4373m = C8941c.f46888b;
        this.f4374n = j10;
        this.f4376p = LayoutDirection.Ltr;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00db  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e2  */
    /* JADX INFO: renamed from: a */
    public final void m2497a(InterfaceC9165q interfaceC9165q) {
        C5207g.m11111f(interfaceC9165q, "canvas");
        m2501e();
        InterfaceC9138c0 interfaceC9138c0 = this.f4367g;
        if (interfaceC9138c0 != null) {
            interfaceC9165q.mo17417a(interfaceC9138c0, 1);
            return;
        }
        float f3 = this.f4372l;
        if (f3 <= 0.0f) {
            interfaceC9165q.mo17426m(C8941c.m17164c(this.f4373m), C8941c.m17165d(this.f4373m), C8944f.m17177d(this.f4374n) + C8941c.m17164c(this.f4373m), C8944f.m17175b(this.f4374n) + C8941c.m17165d(this.f4373m), 1);
            return;
        }
        InterfaceC9138c0 interfaceC9138c0M16758t = this.f4370j;
        C8943e c8943e = this.f4371k;
        if (interfaceC9138c0M16758t != null) {
            long j10 = this.f4373m;
            long j11 = this.f4374n;
            boolean z10 = false;
            if (c8943e != null && C8656b.m16877D(c8943e)) {
                if (c8943e.f46898a == C8941c.m17164c(j10)) {
                    if (c8943e.f46899b == C8941c.m17165d(j10)) {
                        if (c8943e.f46900c == C8944f.m17177d(j11) + C8941c.m17164c(j10)) {
                            if (c8943e.f46901d == C8944f.m17175b(j11) + C8941c.m17165d(j10)) {
                                if (C8939a.m17157b(c8943e.f46902e) == f3) {
                                    z10 = true;
                                }
                            }
                        }
                    }
                }
            }
            if (!z10) {
                float fM17164c = C8941c.m17164c(this.f4373m);
                float fM17165d = C8941c.m17165d(this.f4373m);
                float fM17177d = C8944f.m17177d(this.f4374n) + C8941c.m17164c(this.f4373m);
                float fM17175b = C8944f.m17175b(this.f4374n) + C8941c.m17165d(this.f4373m);
                float f10 = this.f4372l;
                C8943e c8943eM16897e = C8656b.m16897e(fM17164c, fM17165d, fM17177d, fM17175b, C8573r0.m16741n(f10, f10));
                if (interfaceC9138c0M16758t == null) {
                    interfaceC9138c0M16758t = C8573r0.m16758t();
                } else {
                    interfaceC9138c0M16758t.mo17407c();
                }
                interfaceC9138c0M16758t.mo17414j(c8943eM16897e);
                this.f4371k = c8943eM16897e;
                this.f4370j = interfaceC9138c0M16758t;
            }
        } else {
            float fM17164c2 = C8941c.m17164c(this.f4373m);
            float fM17165d2 = C8941c.m17165d(this.f4373m);
            float fM17177d2 = C8944f.m17177d(this.f4374n) + C8941c.m17164c(this.f4373m);
            float fM17175b2 = C8944f.m17175b(this.f4374n) + C8941c.m17165d(this.f4373m);
            float f11 = this.f4372l;
            C8943e c8943eM16897e2 = C8656b.m16897e(fM17164c2, fM17165d2, fM17177d2, fM17175b2, C8573r0.m16741n(f11, f11));
            if (interfaceC9138c0M16758t == null) {
                interfaceC9138c0M16758t = C8573r0.m16758t();
            } else {
                interfaceC9138c0M16758t.mo17407c();
            }
            interfaceC9138c0M16758t.mo17414j(c8943eM16897e2);
            this.f4371k = c8943eM16897e2;
            this.f4370j = interfaceC9138c0M16758t;
        }
        interfaceC9165q.mo17417a(interfaceC9138c0M16758t, 1);
    }

    /* JADX INFO: renamed from: b */
    public final Outline m2498b() {
        m2501e();
        if (this.f4375o && this.f4362b) {
            return this.f4363c;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a3  */
    /* JADX INFO: renamed from: c */
    public final boolean m2499c(long j10) {
        AbstractC9134a0 abstractC9134a0;
        boolean z10;
        if (!this.f4375o || (abstractC9134a0 = this.f4377q) == null) {
            return true;
        }
        float fM17164c = C8941c.m17164c(j10);
        float fM17165d = C8941c.m17165d(j10);
        if (abstractC9134a0 instanceof AbstractC9134a0.b) {
            C8942d c8942d = ((AbstractC9134a0.b) abstractC9134a0).f47641a;
            if (c8942d.f46894a <= fM17164c && fM17164c < c8942d.f46896c && c8942d.f46895b <= fM17165d && fM17165d < c8942d.f46897d) {
                return true;
            }
        } else {
            if (!(abstractC9134a0 instanceof AbstractC9134a0.c)) {
                if (!(abstractC9134a0 instanceof AbstractC9134a0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return C0623f1.m2350a(null, fM17164c, fM17165d);
            }
            C8943e c8943e = ((AbstractC9134a0.c) abstractC9134a0).f47642a;
            if (fM17164c >= c8943e.f46898a) {
                float f3 = c8943e.f46900c;
                if (fM17164c < f3) {
                    float f10 = c8943e.f46899b;
                    if (fM17165d >= f10) {
                        float f11 = c8943e.f46901d;
                        if (fM17165d < f11) {
                            long j11 = c8943e.f46902e;
                            float fM17157b = C8939a.m17157b(j11);
                            long j12 = c8943e.f46903f;
                            float fM17157b2 = C8939a.m17157b(j12) + fM17157b;
                            float f12 = c8943e.f46898a;
                            float f13 = f3 - f12;
                            long j13 = c8943e.f46904g;
                            long j14 = c8943e.f46905h;
                            if (fM17157b2 > f13) {
                                z10 = false;
                            } else if (C8939a.m17157b(j13) + C8939a.m17157b(j14) <= f13) {
                                float f14 = f11 - f10;
                                if (C8939a.m17158c(j14) + C8939a.m17158c(j11) > f14) {
                                    z10 = false;
                                } else if (C8939a.m17158c(j13) + C8939a.m17158c(j12) <= f14) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                            } else {
                                z10 = false;
                            }
                            if (!z10) {
                                C9151j c9151jM16758t = C8573r0.m16758t();
                                c9151jM16758t.mo17414j(c8943e);
                                return C0623f1.m2350a(c9151jM16758t, fM17164c, fM17165d);
                            }
                            float fM17157b3 = C8939a.m17157b(j11) + f12;
                            float fM17158c = C8939a.m17158c(j11) + f10;
                            float fM17157b4 = f3 - C8939a.m17157b(j12);
                            float fM17158c2 = C8939a.m17158c(j12) + f10;
                            float fM17157b5 = f3 - C8939a.m17157b(j13);
                            float fM17158c3 = f11 - C8939a.m17158c(j13);
                            float fM17158c4 = f11 - C8939a.m17158c(j14);
                            float fM17157b6 = C8939a.m17157b(j14) + f12;
                            if (fM17164c < fM17157b3 && fM17165d < fM17158c) {
                                return C0623f1.m2351b(fM17164c, fM17165d, fM17157b3, fM17158c, c8943e.f46902e);
                            }
                            if (fM17164c < fM17157b6 && fM17165d > fM17158c4) {
                                return C0623f1.m2351b(fM17164c, fM17165d, fM17157b6, fM17158c4, c8943e.f46905h);
                            }
                            if (fM17164c > fM17157b4 && fM17165d < fM17158c2) {
                                return C0623f1.m2351b(fM17164c, fM17165d, fM17157b4, fM17158c2, c8943e.f46903f);
                            }
                            if (fM17164c <= fM17157b5 || fM17165d <= fM17158c3) {
                                return true;
                            }
                            return C0623f1.m2351b(fM17164c, fM17165d, fM17157b5, fM17158c3, c8943e.f46904g);
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2500d(InterfaceC9154k0 interfaceC9154k0, float f3, boolean z10, float f10, LayoutDirection layoutDirection, InterfaceC10015c interfaceC10015c) {
        C5207g.m11111f(interfaceC9154k0, "shape");
        C5207g.m11111f(layoutDirection, "layoutDirection");
        C5207g.m11111f(interfaceC10015c, "density");
        this.f4363c.setAlpha(f3);
        boolean z11 = !C5207g.m11106a(this.f4365e, interfaceC9154k0);
        if (z11) {
            this.f4365e = interfaceC9154k0;
            this.f4368h = true;
        }
        boolean z12 = z10 || f10 > 0.0f;
        if (this.f4375o != z12) {
            this.f4375o = z12;
            this.f4368h = true;
        }
        if (this.f4376p != layoutDirection) {
            this.f4376p = layoutDirection;
            this.f4368h = true;
        }
        if (!C5207g.m11106a(this.f4361a, interfaceC10015c)) {
            this.f4361a = interfaceC10015c;
            this.f4368h = true;
        }
        return z11;
    }

    /* JADX INFO: renamed from: e */
    public final void m2501e() {
        if (this.f4368h) {
            this.f4373m = C8941c.f46888b;
            long j10 = this.f4364d;
            this.f4374n = j10;
            this.f4372l = 0.0f;
            this.f4367g = null;
            this.f4368h = false;
            this.f4369i = false;
            boolean z10 = this.f4375o;
            Outline outline = this.f4363c;
            if (!z10 || C8944f.m17177d(j10) <= 0.0f || C8944f.m17175b(this.f4364d) <= 0.0f) {
                outline.setEmpty();
            } else {
                this.f4362b = true;
                AbstractC9134a0 abstractC9134a0Mo17359a = this.f4365e.mo17359a(this.f4364d, this.f4376p, this.f4361a);
                this.f4377q = abstractC9134a0Mo17359a;
                if (abstractC9134a0Mo17359a instanceof AbstractC9134a0.b) {
                    C8942d c8942d = ((AbstractC9134a0.b) abstractC9134a0Mo17359a).f47641a;
                    float f3 = c8942d.f46894a;
                    float f10 = c8942d.f46895b;
                    this.f4373m = C7499b.m14932c(f3, f10);
                    float f11 = c8942d.f46896c;
                    float f12 = c8942d.f46894a;
                    float f13 = c8942d.f46897d;
                    this.f4374n = C8584v.m16788m(f11 - f12, f13 - f10);
                    outline.setRect(C8573r0.m16710Y0(f12), C8573r0.m16710Y0(f10), C8573r0.m16710Y0(f11), C8573r0.m16710Y0(f13));
                    return;
                }
                if (abstractC9134a0Mo17359a instanceof AbstractC9134a0.c) {
                    C8943e c8943e = ((AbstractC9134a0.c) abstractC9134a0Mo17359a).f47642a;
                    float fM17157b = C8939a.m17157b(c8943e.f46902e);
                    float f14 = c8943e.f46898a;
                    float f15 = c8943e.f46899b;
                    this.f4373m = C7499b.m14932c(f14, f15);
                    float f16 = c8943e.f46900c;
                    float f17 = c8943e.f46901d;
                    this.f4374n = C8584v.m16788m(f16 - f14, f17 - f15);
                    if (C8656b.m16877D(c8943e)) {
                        this.f4363c.setRoundRect(C8573r0.m16710Y0(f14), C8573r0.m16710Y0(f15), C8573r0.m16710Y0(f16), C8573r0.m16710Y0(f17), fM17157b);
                        this.f4372l = fM17157b;
                        return;
                    }
                    C9151j c9151jM16758t = this.f4366f;
                    if (c9151jM16758t == null) {
                        c9151jM16758t = C8573r0.m16758t();
                        this.f4366f = c9151jM16758t;
                    }
                    c9151jM16758t.mo17407c();
                    c9151jM16758t.mo17414j(c8943e);
                    m2502f(c9151jM16758t);
                    return;
                }
                if (abstractC9134a0Mo17359a instanceof AbstractC9134a0.a) {
                    ((AbstractC9134a0.a) abstractC9134a0Mo17359a).getClass();
                    m2502f(null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2502f(InterfaceC9138c0 interfaceC9138c0) {
        int i10 = Build.VERSION.SDK_INT;
        Outline outline = this.f4363c;
        if (i10 <= 28 && !interfaceC9138c0.mo17405a()) {
            this.f4362b = false;
            outline.setEmpty();
            this.f4369i = true;
        } else {
            if (!(interfaceC9138c0 instanceof C9151j)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            outline.setConvexPath(((C9151j) interfaceC9138c0).f47676a);
            this.f4369i = !outline.canClip();
        }
        this.f4367g = interfaceC9138c0;
    }
}
