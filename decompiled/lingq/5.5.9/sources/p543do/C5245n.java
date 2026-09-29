package p543do;

import dm.C5207g;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import sm.InterfaceC9077e;

/* JADX INFO: renamed from: do.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C5245n extends AbstractC5252q0 {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f33336d = 0;

    /* JADX INFO: renamed from: b */
    public final AbstractC5252q0 f33337b;

    /* JADX INFO: renamed from: c */
    public final AbstractC5252q0 f33338c;

    public C5245n(AbstractC5252q0 abstractC5252q0, AbstractC5252q0 abstractC5252q1) {
        this.f33337b = abstractC5252q0;
        this.f33338c = abstractC5252q1;
    }

    @Override // p543do.AbstractC5252q0
    /* JADX INFO: renamed from: a */
    public final boolean mo11274a() {
        if (!this.f33337b.mo11274a() && !this.f33338c.mo11274a()) {
            return false;
        }
        return true;
    }

    @Override // p543do.AbstractC5252q0
    /* JADX INFO: renamed from: b */
    public final boolean mo11282b() {
        if (!this.f33337b.mo11282b() && !this.f33338c.mo11282b()) {
            return false;
        }
        return true;
    }

    @Override // p543do.AbstractC5252q0
    /* JADX INFO: renamed from: c */
    public final InterfaceC9077e mo11275c(InterfaceC9077e interfaceC9077e) {
        C5207g.m11111f(interfaceC9077e, "annotations");
        return this.f33338c.mo11275c(this.f33337b.mo11275c(interfaceC9077e));
    }

    @Override // p543do.AbstractC5252q0
    /* JADX INFO: renamed from: d */
    public final InterfaceC5246n0 mo11279d(AbstractC5257t abstractC5257t) {
        InterfaceC5246n0 interfaceC5246n0Mo11279d = this.f33337b.mo11279d(abstractC5257t);
        if (interfaceC5246n0Mo11279d == null) {
            interfaceC5246n0Mo11279d = this.f33338c.mo11279d(abstractC5257t);
        }
        return interfaceC5246n0Mo11279d;
    }

    @Override // p543do.AbstractC5252q0
    /* JADX INFO: renamed from: f */
    public final AbstractC5257t mo11277f(AbstractC5257t abstractC5257t, Variance variance) {
        C5207g.m11111f(abstractC5257t, "topLevelType");
        C5207g.m11111f(variance, "position");
        return this.f33338c.mo11277f(this.f33337b.mo11277f(abstractC5257t, variance), variance);
    }
}
