package p386t;

import androidx.activity.result.C0204c;
import androidx.compose.p017ui.platform.AbstractC0664t0;
import androidx.compose.p017ui.unit.LayoutDirection;
import cm.InterfaceC2052l;
import dm.C5207g;
import kotlin.NoWhenBranchMatchedException;
import p260m8.C7499b;
import p327q0.InterfaceC8460f;
import p338qd.C8573r0;
import p338qd.C8584v;
import p375s0.C8939a;
import p375s0.C8942d;
import p375s0.C8943e;
import p375s0.C8944f;
import p387t0.AbstractC9134a0;
import p387t0.AbstractC9161o;
import p387t0.C9144f0;
import p387t0.C9151j;
import p387t0.C9169u;
import p387t0.InterfaceC9154k0;
import p424v0.C9623g;
import p424v0.InterfaceC9619c;
import p424v0.InterfaceC9621e;

/* JADX INFO: renamed from: t.b */
/* JADX INFO: loaded from: classes.dex */
public final class C9110b extends AbstractC0664t0 implements InterfaceC8460f {

    /* JADX INFO: renamed from: b */
    public final C9169u f47597b;

    /* JADX INFO: renamed from: c */
    public final AbstractC9161o f47598c;

    /* JADX INFO: renamed from: d */
    public final float f47599d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC9154k0 f47600e;

    /* JADX INFO: renamed from: f */
    public C8944f f47601f;

    /* JADX INFO: renamed from: g */
    public LayoutDirection f47602g;

    /* JADX INFO: renamed from: h */
    public AbstractC9134a0 f47603h;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C9110b() {
        throw null;
    }

    public C9110b(C9169u c9169u, InterfaceC9154k0 interfaceC9154k0, InterfaceC2052l interfaceC2052l) {
        super(interfaceC2052l);
        this.f47597b = c9169u;
        this.f47598c = null;
        this.f47599d = 1.0f;
        this.f47600e = interfaceC9154k0;
    }

    public final boolean equals(Object obj) {
        C9110b c9110b = obj instanceof C9110b ? (C9110b) obj : null;
        if (c9110b != null && C5207g.m11106a(this.f47597b, c9110b.f47597b) && C5207g.m11106a(this.f47598c, c9110b.f47598c)) {
            return ((this.f47599d > c9110b.f47599d ? 1 : (this.f47599d == c9110b.f47599d ? 0 : -1)) == 0) && C5207g.m11106a(this.f47600e, c9110b.f47600e);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        C9169u c9169u = this.f47597b;
        int iHashCode2 = (c9169u != null ? Long.hashCode(c9169u.f47705a) : 0) * 31;
        AbstractC9161o abstractC9161o = this.f47598c;
        if (abstractC9161o != null) {
            iHashCode = abstractC9161o.hashCode();
        }
        return this.f47600e.hashCode() + C0204c.m846e(this.f47599d, (iHashCode2 + iHashCode) * 31, 31);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0126  */
    /* JADX WARN: Code duplicated, block: B:42:0x013b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0163  */
    /* JADX WARN: Code duplicated, block: B:45:0x0167  */
    /* JADX WARN: Code duplicated, block: B:47:0x016e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0170  */
    /* JADX WARN: Code duplicated, block: B:49:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:51:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:53:0x01b2  */
    @Override // p327q0.InterfaceC8460f
    /* JADX INFO: renamed from: s */
    public final void mo16542s(InterfaceC9619c interfaceC9619c) {
        AbstractC9134a0 abstractC9134a0Mo17359a;
        AbstractC9134a0 abstractC9134a0;
        float f3;
        C9623g c9623g;
        C9151j c9151j;
        AbstractC9134a0.c cVar;
        C9151j c9151j2;
        C9151j c9151j3;
        C5207g.m11111f(interfaceC9619c, "<this>");
        C9144f0.a aVar = C9144f0.f47650a;
        AbstractC9161o abstractC9161o = this.f47598c;
        C9169u c9169u = this.f47597b;
        InterfaceC9154k0 interfaceC9154k0 = this.f47600e;
        if (interfaceC9154k0 == aVar) {
            if (c9169u != null) {
                InterfaceC9621e.m18090U(interfaceC9619c, c9169u.f47705a, 0L, 126);
            }
            if (abstractC9161o != null) {
                InterfaceC9621e.m18092b0(interfaceC9619c, abstractC9161o, 0L, 0L, this.f47599d, null, 118);
            }
        } else {
            long jMo12674d = interfaceC9619c.mo12674d();
            C8944f c8944f = this.f47601f;
            int i10 = C8944f.f46908d;
            boolean z10 = false;
            if ((c8944f instanceof C8944f) && jMo12674d == c8944f.f46909a) {
                z10 = true;
            }
            if (z10 && interfaceC9619c.getLayoutDirection() == this.f47602g) {
                abstractC9134a0Mo17359a = this.f47603h;
                C5207g.m11108c(abstractC9134a0Mo17359a);
            } else {
                abstractC9134a0Mo17359a = interfaceC9154k0.mo17359a(interfaceC9619c.mo12674d(), interfaceC9619c.getLayoutDirection(), interfaceC9619c);
            }
            AbstractC9134a0 abstractC9134a1 = abstractC9134a0Mo17359a;
            String str = "style";
            String str2 = "outline";
            if (c9169u != null) {
                long j10 = c9169u.f47705a;
                C9623g c9623g2 = C9623g.f49295a;
                C5207g.m11111f(abstractC9134a1, "outline");
                C5207g.m11111f(c9623g2, "style");
                if (abstractC9134a1 instanceof AbstractC9134a0.b) {
                    C8942d c8942d = ((AbstractC9134a0.b) abstractC9134a1).f47641a;
                    interfaceC9619c.mo12675d0(j10, C7499b.m14932c(c8942d.f46894a, c8942d.f46895b), C8584v.m16788m(c8942d.f46896c - c8942d.f46894a, c8942d.f46897d - c8942d.f46895b), 1.0f, c9623g2, null, 3);
                } else {
                    str2 = "outline";
                    if (abstractC9134a1 instanceof AbstractC9134a0.c) {
                        AbstractC9134a0.c cVar2 = (AbstractC9134a0.c) abstractC9134a1;
                        c9151j3 = cVar2.f47643b;
                        if (c9151j3 != null) {
                            abstractC9134a0 = abstractC9134a1;
                        } else {
                            C8943e c8943e = cVar2.f47642a;
                            float fM17157b = C8939a.m17157b(c8943e.f46905h);
                            float f10 = c8943e.f46898a;
                            float f11 = c8943e.f46899b;
                            str = "style";
                            abstractC9134a0 = abstractC9134a1;
                            interfaceC9619c.mo12671Y(j10, C7499b.m14932c(f10, f11), C8584v.m16788m(c8943e.f46900c - f10, c8943e.f46901d - f11), C8573r0.m16741n(fM17157b, fM17157b), c9623g2, 1.0f, null, 3);
                        }
                    } else {
                        abstractC9134a0 = abstractC9134a1;
                        if (!(abstractC9134a0 instanceof AbstractC9134a0.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c9151j3 = null;
                    }
                    interfaceC9619c.mo12670S(c9151j3, j10, 1.0f, c9623g2, null, 3);
                }
                if (abstractC9161o != null) {
                    f3 = this.f47599d;
                    c9623g = C9623g.f49295a;
                    C5207g.m11111f(abstractC9134a0, str2);
                    C5207g.m11111f(c9623g, str);
                    if (abstractC9134a0 instanceof AbstractC9134a0.b) {
                        C8942d c8942d2 = ((AbstractC9134a0.b) abstractC9134a0).f47641a;
                        interfaceC9619c.mo12669L(abstractC9161o, C7499b.m14932c(c8942d2.f46894a, c8942d2.f46895b), C8584v.m16788m(c8942d2.f46896c - c8942d2.f46894a, c8942d2.f46897d - c8942d2.f46895b), f3, c9623g, null, 3);
                    } else {
                        if (abstractC9134a0 instanceof AbstractC9134a0.c) {
                            cVar = (AbstractC9134a0.c) abstractC9134a0;
                            c9151j2 = cVar.f47643b;
                            if (c9151j2 != null) {
                                c9151j = c9151j2;
                            } else {
                                C8943e c8943e2 = cVar.f47642a;
                                float fM17157b2 = C8939a.m17157b(c8943e2.f46905h);
                                float f12 = c8943e2.f46898a;
                                float f13 = c8943e2.f46899b;
                                interfaceC9619c.mo12679w0(abstractC9161o, C7499b.m14932c(f12, f13), C8584v.m16788m(c8943e2.f46900c - f12, c8943e2.f46901d - f13), C8573r0.m16741n(fM17157b2, fM17157b2), f3, c9623g, null, 3);
                            }
                        } else {
                            if (abstractC9134a0 instanceof AbstractC9134a0.a) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c9151j = null;
                        }
                        interfaceC9619c.mo12677p0(c9151j, abstractC9161o, f3, c9623g, null, 3);
                    }
                }
                this.f47603h = abstractC9134a0;
                this.f47601f = new C8944f(interfaceC9619c.mo12674d());
                this.f47602g = interfaceC9619c.getLayoutDirection();
            }
            str = "style";
            abstractC9134a0 = abstractC9134a1;
            if (abstractC9161o != null) {
                f3 = this.f47599d;
                c9623g = C9623g.f49295a;
                C5207g.m11111f(abstractC9134a0, str2);
                C5207g.m11111f(c9623g, str);
                if (abstractC9134a0 instanceof AbstractC9134a0.b) {
                    C8942d c8942d3 = ((AbstractC9134a0.b) abstractC9134a0).f47641a;
                    interfaceC9619c.mo12669L(abstractC9161o, C7499b.m14932c(c8942d3.f46894a, c8942d3.f46895b), C8584v.m16788m(c8942d3.f46896c - c8942d3.f46894a, c8942d3.f46897d - c8942d3.f46895b), f3, c9623g, null, 3);
                } else {
                    if (abstractC9134a0 instanceof AbstractC9134a0.c) {
                        cVar = (AbstractC9134a0.c) abstractC9134a0;
                        c9151j2 = cVar.f47643b;
                        if (c9151j2 != null) {
                            c9151j = c9151j2;
                        } else {
                            C8943e c8943e3 = cVar.f47642a;
                            float fM17157b3 = C8939a.m17157b(c8943e3.f46905h);
                            float f14 = c8943e3.f46898a;
                            float f15 = c8943e3.f46899b;
                            interfaceC9619c.mo12679w0(abstractC9161o, C7499b.m14932c(f14, f15), C8584v.m16788m(c8943e3.f46900c - f14, c8943e3.f46901d - f15), C8573r0.m16741n(fM17157b3, fM17157b3), f3, c9623g, null, 3);
                        }
                    } else {
                        if (abstractC9134a0 instanceof AbstractC9134a0.a) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c9151j = null;
                    }
                    interfaceC9619c.mo12677p0(c9151j, abstractC9161o, f3, c9623g, null, 3);
                }
            }
            this.f47603h = abstractC9134a0;
            this.f47601f = new C8944f(interfaceC9619c.mo12674d());
            this.f47602g = interfaceC9619c.getLayoutDirection();
        }
        interfaceC9619c.mo12668E0();
    }

    public final String toString() {
        return "Background(color=" + this.f47597b + ", brush=" + this.f47598c + ", alpha = " + this.f47599d + ", shape=" + this.f47600e + ')';
    }
}
