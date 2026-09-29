package p348qn;

import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8847k0;
import p543do.AbstractC5252q0;
import p543do.AbstractC5257t;
import p543do.C5239k;
import p543do.InterfaceC5246n0;

/* JADX INFO: renamed from: qn.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C8654d extends C5239k {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f46231c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8654d(AbstractC5252q0 abstractC5252q0, boolean z10) {
        super(abstractC5252q0);
        this.f46231c = z10;
    }

    @Override // p543do.AbstractC5252q0
    /* JADX INFO: renamed from: b */
    public final boolean mo11282b() {
        return this.f46231c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [rm.k0] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // p543do.AbstractC5252q0
    /* JADX INFO: renamed from: d */
    public final InterfaceC5246n0 mo11279d(AbstractC5257t abstractC5257t) {
        ?? r10;
        InterfaceC5246n0 interfaceC5246n0Mo11279d = this.f33331b.mo11279d(abstractC5257t);
        InterfaceC5246n0 interfaceC5246n0 = null;
        InterfaceC5246n0 interfaceC5246n0M14098a = interfaceC5246n0;
        if (interfaceC5246n0Mo11279d != null) {
            InterfaceC8834e interfaceC8834eMo11235q = abstractC5257t.mo11250X0().mo11235q();
            if (interfaceC8834eMo11235q instanceof InterfaceC8847k0) {
                r10 = interfaceC5246n0;
                r10 = (InterfaceC8847k0) interfaceC8834eMo11235q;
            }
            r10 = interfaceC5246n0;
            interfaceC5246n0M14098a = CapturedTypeConstructorKt.m14098a(interfaceC5246n0Mo11279d, r10);
        }
        return interfaceC5246n0M14098a;
    }
}
