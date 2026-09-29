package cc;

import com.google.android.gms.internal.measurement.C2599b2;
import com.google.android.gms.internal.measurement.C2641e2;
import com.google.android.gms.internal.measurement.C2669g2;
import com.google.android.gms.internal.measurement.C2711j2;
import com.google.android.gms.internal.measurement.C2760m9;
import com.google.android.gms.internal.measurement.C2859u3;
import java.math.BigDecimal;

/* JADX INFO: renamed from: cc.x7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1981x7 extends AbstractC1972w7 {

    /* JADX INFO: renamed from: g */
    public final C2669g2 f10308g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1775b f10309h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1981x7(C1775b c1775b, String str, int i10, C2669g2 c2669g2) {
        super(str, i10);
        this.f10309h = c1775b;
        this.f10308g = c2669g2;
    }

    @Override // cc.AbstractC1972w7
    /* JADX INFO: renamed from: a */
    public final int mo5903a() {
        return this.f10308g.m7838t();
    }

    @Override // cc.AbstractC1972w7
    /* JADX INFO: renamed from: b */
    public final boolean mo5904b() {
        return false;
    }

    @Override // cc.AbstractC1972w7
    /* JADX INFO: renamed from: c */
    public final boolean mo5905c() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: g */
    public final boolean m5915g(Long l10, Long l11, C2859u3 c2859u3, boolean z10) {
        C2760m9.m8070a();
        C1775b c1775b = this.f10309h;
        boolean zM5582q = ((C1897o4) c1775b.f10430a).f10084g.m5582q(this.f10281a, C1985y2.f10335W);
        C2669g2 c2669g2 = this.f10308g;
        boolean zM7841z = c2669g2.m7841z();
        boolean zM7834A = c2669g2.m7834A();
        boolean zM7835B = c2669g2.m7835B();
        Object[] objArr = zM7841z || zM7834A || zM7835B;
        Boolean boolM5911f = null;
        boolM5909d = null;
        Boolean boolM5909d = null;
        Boolean boolM5909d2 = null;
        boolM5911f = null;
        boolM5911f = null;
        boolM5911f = null;
        Boolean boolM5909d3 = null;
        boolM5911f = null;
        InterfaceC1781b5 interfaceC1781b5 = c1775b.f10430a;
        if (z10 && objArr != true) {
            C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9938I.m5625c(Integer.valueOf(this.f10282b), c2669g2.m7836C() ? Integer.valueOf(c2669g2.m7838t()) : null, "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
        C2599b2 c2599b2M7839u = c2669g2.m7839u();
        boolean zM7663z = c2599b2M7839u.m7663z();
        if (c2859u3.m8281J()) {
            if (c2599b2M7839u.m7656B()) {
                try {
                    boolM5909d2 = AbstractC1972w7.m5909d(new BigDecimal(c2859u3.m8285u()), c2599b2M7839u.m7660v(), 0.0d);
                } catch (NumberFormatException unused) {
                }
                boolM5911f = AbstractC1972w7.m5911f(boolM5909d2, zM7663z);
            } else {
                C1860k3 c1860k4 = ((C1897o4) interfaceC1781b5).f10086i;
                C1897o4.m5776k(c1860k4);
                c1860k4.f9945i.m5624b(((C1897o4) interfaceC1781b5).f10057H.m5605f(c2859u3.m8287y()), "No number filter for long property. property");
            }
        } else if (c2859u3.m8280I()) {
            if (c2599b2M7839u.m7656B()) {
                double dM8284t = c2859u3.m8284t();
                try {
                    boolM5909d = AbstractC1972w7.m5909d(new BigDecimal(dM8284t), c2599b2M7839u.m7660v(), Math.ulp(dM8284t));
                } catch (NumberFormatException unused2) {
                }
                boolM5911f = AbstractC1972w7.m5911f(boolM5909d, zM7663z);
            } else {
                C1860k3 c1860k5 = ((C1897o4) interfaceC1781b5).f10086i;
                C1897o4.m5776k(c1860k5);
                c1860k5.f9945i.m5624b(((C1897o4) interfaceC1781b5).f10057H.m5605f(c2859u3.m8287y()), "No number filter for double property. property");
            }
        } else if (!c2859u3.m8283L()) {
            C1860k3 c1860k6 = ((C1897o4) interfaceC1781b5).f10086i;
            C1897o4.m5776k(c1860k6);
            c1860k6.f9945i.m5624b(((C1897o4) interfaceC1781b5).f10057H.m5605f(c2859u3.m8287y()), "User property has no value, property");
        } else if (c2599b2M7839u.m7658D()) {
            String strM8288z = c2859u3.m8288z();
            C2711j2 c2711j2M7661w = c2599b2M7839u.m7661w();
            C1860k3 c1860k7 = ((C1897o4) interfaceC1781b5).f10086i;
            C1897o4.m5776k(c1860k7);
            boolM5911f = AbstractC1972w7.m5911f(AbstractC1972w7.m5910e(strM8288z, c2711j2M7661w, c1860k7), zM7663z);
        } else if (!c2599b2M7839u.m7656B()) {
            C1860k3 c1860k8 = ((C1897o4) interfaceC1781b5).f10086i;
            C1897o4.m5776k(c1860k8);
            c1860k8.f9945i.m5624b(((C1897o4) interfaceC1781b5).f10057H.m5605f(c2859u3.m8287y()), "No string or number filter defined. property");
        } else if (C1864k7.m5714I(c2859u3.m8288z())) {
            String strM8288z2 = c2859u3.m8288z();
            C2641e2 c2641e2M7660v = c2599b2M7839u.m7660v();
            if (C1864k7.m5714I(strM8288z2)) {
                try {
                    boolM5909d3 = AbstractC1972w7.m5909d(new BigDecimal(strM8288z2), c2641e2M7660v, 0.0d);
                } catch (NumberFormatException unused3) {
                }
            }
            boolM5911f = AbstractC1972w7.m5911f(boolM5909d3, zM7663z);
        } else {
            C1860k3 c1860k9 = ((C1897o4) interfaceC1781b5).f10086i;
            C1897o4.m5776k(c1860k9);
            c1860k9.f9945i.m5625c(((C1897o4) interfaceC1781b5).f10057H.m5605f(c2859u3.m8287y()), c2859u3.m8288z(), "Invalid user property value for Numeric number filter. property, value");
        }
        C1860k3 c1860k10 = ((C1897o4) interfaceC1781b5).f10086i;
        C1897o4.m5776k(c1860k10);
        c1860k10.f9938I.m5624b(boolM5911f == null ? "null" : boolM5911f, "Property filter result");
        if (boolM5911f == null) {
            return false;
        }
        this.f10283c = Boolean.TRUE;
        if (zM7835B && !boolM5911f.booleanValue()) {
            return true;
        }
        if (!z10 || c2669g2.m7841z()) {
            this.f10284d = boolM5911f;
        }
        if (boolM5911f.booleanValue() && objArr != false && c2859u3.m8282K()) {
            long jM8286v = c2859u3.m8286v();
            if (l10 != null) {
                jM8286v = l10.longValue();
            }
            if (zM5582q && c2669g2.m7841z() && !c2669g2.m7834A() && l11 != null) {
                jM8286v = l11.longValue();
            }
            if (c2669g2.m7834A()) {
                this.f10286f = Long.valueOf(jM8286v);
            } else {
                this.f10285e = Long.valueOf(jM8286v);
            }
        }
        return true;
    }
}
