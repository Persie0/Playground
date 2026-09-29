package p373rn;

import dm.C5207g;
import fo.C5602h;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import mn.C7645b;
import mn.C7648e;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8863u;
import p543do.AbstractC5257t;
import p543do.AbstractC5265x;
import pn.C8413d;

/* JADX INFO: renamed from: rn.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C8877i extends AbstractC8875g<Pair<? extends C7645b, ? extends C7648e>> {

    /* JADX INFO: renamed from: b */
    public final C7645b f46773b;

    /* JADX INFO: renamed from: c */
    public final C7648e f46774c;

    public C8877i(C7645b c7645b, C7648e c7648e) {
        super(new Pair(c7645b, c7648e));
        this.f46773b = c7645b;
        this.f46774c = c7648e;
    }

    @Override // p373rn.AbstractC8875g
    /* JADX INFO: renamed from: a */
    public final AbstractC5257t mo17121a(InterfaceC8863u interfaceC8863u) {
        C5207g.m11111f(interfaceC8863u, "module");
        C7645b c7645b = this.f46773b;
        InterfaceC8830c interfaceC8830cM13584a = FindClassInModuleKt.m13584a(interfaceC8863u, c7645b);
        AbstractC5265x abstractC5265xMo5316v = null;
        if (interfaceC8830cM13584a != null) {
            int i10 = C8413d.f45539a;
            if (!C8413d.m16455n(interfaceC8830cM13584a, ClassKind.ENUM_CLASS)) {
                interfaceC8830cM13584a = null;
            }
            if (interfaceC8830cM13584a != null) {
                abstractC5265xMo5316v = interfaceC8830cM13584a.mo5316v();
            }
        }
        if (abstractC5265xMo5316v != null) {
            return abstractC5265xMo5316v;
        }
        ErrorTypeKind errorTypeKind = ErrorTypeKind.ERROR_ENUM_TYPE;
        String string = c7645b.toString();
        C5207g.m11110e(string, "enumClassId.toString()");
        String str = this.f46774c.f42086a;
        C5207g.m11110e(str, "enumEntryName.toString()");
        return C5602h.m11912c(errorTypeKind, string, str);
    }

    @Override // p373rn.AbstractC8875g
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f46773b.m15210j());
        sb2.append('.');
        sb2.append(this.f46774c);
        return sb2.toString();
    }
}
