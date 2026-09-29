package p543do;

import dm.C5207g;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p102eo.AbstractC5439d;

/* JADX INFO: renamed from: do.b0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5222b0 extends AbstractC5248o0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC5265x f33305a;

    public C5222b0(AbstractC6795c abstractC6795c) {
        C5207g.m11111f(abstractC6795c, "kotlinBuiltIns");
        this.f33305a = abstractC6795c.m13559p();
    }

    @Override // p543do.InterfaceC5246n0
    /* JADX INFO: renamed from: c */
    public final AbstractC5257t mo11236c() {
        return this.f33305a;
    }

    @Override // p543do.InterfaceC5246n0
    /* JADX INFO: renamed from: d */
    public final Variance mo11237d() {
        return Variance.OUT_VARIANCE;
    }

    @Override // p543do.InterfaceC5246n0
    /* JADX INFO: renamed from: e */
    public final InterfaceC5246n0 mo11238e(AbstractC5439d abstractC5439d) {
        C5207g.m11111f(abstractC5439d, "kotlinTypeRefiner");
        return this;
    }

    @Override // p543do.InterfaceC5246n0
    /* JADX INFO: renamed from: f */
    public final boolean mo11239f() {
        return true;
    }
}
