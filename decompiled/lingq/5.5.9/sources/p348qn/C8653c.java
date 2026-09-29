package p348qn;

import dm.C5207g;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8847k0;
import p385sf.C9000b;
import p543do.AbstractC5257t;
import p543do.InterfaceC5246n0;

/* JADX INFO: renamed from: qn.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C8653c implements InterfaceC8652b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5246n0 f46229a;

    /* JADX INFO: renamed from: b */
    public NewCapturedTypeConstructor f46230b;

    public C8653c(InterfaceC5246n0 interfaceC5246n0) {
        C5207g.m11111f(interfaceC5246n0, "projection");
        this.f46229a = interfaceC5246n0;
        interfaceC5246n0.mo11237d();
        Variance variance = Variance.INVARIANT;
    }

    @Override // p348qn.InterfaceC8652b
    /* JADX INFO: renamed from: b */
    public final InterfaceC5246n0 mo14219b() {
        return this.f46229a;
    }

    @Override // p543do.InterfaceC5240k0
    /* JADX INFO: renamed from: o */
    public final AbstractC6795c mo11234o() {
        AbstractC6795c abstractC6795cMo11234o = this.f46229a.mo11236c().mo11250X0().mo11234o();
        C5207g.m11110e(abstractC6795cMo11234o, "projection.type.constructor.builtIns");
        return abstractC6795cMo11234o;
    }

    @Override // p543do.InterfaceC5240k0
    /* JADX INFO: renamed from: p */
    public final Collection<AbstractC5257t> mo11278p() {
        InterfaceC5246n0 interfaceC5246n0 = this.f46229a;
        AbstractC5257t abstractC5257tMo11236c = interfaceC5246n0.mo11237d() == Variance.OUT_VARIANCE ? interfaceC5246n0.mo11236c() : mo11234o().m13559p();
        C5207g.m11110e(abstractC5257tMo11236c, "if (projection.projectio… builtIns.nullableAnyType");
        return C9000b.m17251q(abstractC5257tMo11236c);
    }

    @Override // p543do.InterfaceC5240k0
    /* JADX INFO: renamed from: q */
    public final /* bridge */ /* synthetic */ InterfaceC8834e mo11235q() {
        return null;
    }

    @Override // p543do.InterfaceC5240k0
    /* JADX INFO: renamed from: r */
    public final List<InterfaceC8847k0> mo11260r() {
        return EmptyList.f38032a;
    }

    @Override // p543do.InterfaceC5240k0
    /* JADX INFO: renamed from: s */
    public final boolean mo11261s() {
        return false;
    }

    public final String toString() {
        return "CapturedTypeConstructor(" + this.f46229a + ')';
    }
}
