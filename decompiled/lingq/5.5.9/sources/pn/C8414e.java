package pn;

import dm.C5207g;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import mn.C7645b;
import mn.C7646c;
import mn.C7648e;
import p372rm.AbstractC8849l0;
import p372rm.C8858q;
import p372rm.InterfaceC8829b0;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8831c0;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8855o0;
import p543do.AbstractC5257t;
import p543do.AbstractC5265x;

/* JADX INFO: renamed from: pn.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C8414e {
    static {
        C7645b.m15203l(new C7646c("kotlin.jvm.JvmInline"));
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m16464a(InterfaceC6822c interfaceC6822c) {
        C5207g.m11111f(interfaceC6822c, "<this>");
        if (interfaceC6822c instanceof InterfaceC8831c0) {
            InterfaceC8829b0 interfaceC8829b0Mo13621K0 = ((InterfaceC8831c0) interfaceC6822c).mo13621K0();
            C5207g.m11110e(interfaceC8829b0Mo13621K0, "correspondingProperty");
            if (m16467d(interfaceC8829b0Mo13621K0)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m16465b(InterfaceC8838g interfaceC8838g) {
        C5207g.m11111f(interfaceC8838g, "<this>");
        return (interfaceC8838g instanceof InterfaceC8830c) && (((InterfaceC8830c) interfaceC8838g).mo13591I0() instanceof C8858q);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m16466c(AbstractC5257t abstractC5257t) {
        InterfaceC8834e interfaceC8834eMo11235q = abstractC5257t.mo11250X0().mo11235q();
        if (interfaceC8834eMo11235q != null) {
            return m16465b(interfaceC8834eMo11235q);
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m16467d(InterfaceC8855o0 interfaceC8855o0) {
        if (interfaceC8855o0.mo11896s0() == null) {
            InterfaceC8838g interfaceC8838gMo11876g = interfaceC8855o0.mo11876g();
            C7648e c7648e = null;
            InterfaceC8830c interfaceC8830c = interfaceC8838gMo11876g instanceof InterfaceC8830c ? (InterfaceC8830c) interfaceC8838gMo11876g : null;
            if (interfaceC8830c != null) {
                int i10 = DescriptorUtilsKt.f39656a;
                AbstractC8849l0<AbstractC5265x> abstractC8849l0Mo13591I0 = interfaceC8830c.mo13591I0();
                C8858q c8858q = abstractC8849l0Mo13591I0 instanceof C8858q ? (C8858q) abstractC8849l0Mo13591I0 : null;
                if (c8858q != null) {
                    c7648e = c8858q.f46762a;
                }
            }
            if (C5207g.m11106a(c7648e, interfaceC8855o0.mo11874a())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static final AbstractC5265x m16468e(AbstractC5257t abstractC5257t) {
        C5207g.m11111f(abstractC5257t, "<this>");
        InterfaceC8834e interfaceC8834eMo11235q = abstractC5257t.mo11250X0().mo11235q();
        if (!(interfaceC8834eMo11235q instanceof InterfaceC8830c)) {
            interfaceC8834eMo11235q = null;
        }
        InterfaceC8830c interfaceC8830c = (InterfaceC8830c) interfaceC8834eMo11235q;
        if (interfaceC8830c == null) {
            return null;
        }
        int i10 = DescriptorUtilsKt.f39656a;
        AbstractC8849l0<AbstractC5265x> abstractC8849l0Mo13591I0 = interfaceC8830c.mo13591I0();
        C8858q c8858q = abstractC8849l0Mo13591I0 instanceof C8858q ? (C8858q) abstractC8849l0Mo13591I0 : null;
        if (c8858q != null) {
            return (AbstractC5265x) c8858q.f46763b;
        }
        return null;
    }
}
