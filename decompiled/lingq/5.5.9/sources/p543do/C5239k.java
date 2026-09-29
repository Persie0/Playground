package p543do;

import dm.C5207g;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import sm.InterfaceC9077e;

/* JADX INFO: renamed from: do.k */
/* JADX INFO: loaded from: classes2.dex */
public class C5239k extends AbstractC5252q0 {

    /* JADX INFO: renamed from: b */
    public final AbstractC5252q0 f33331b;

    public C5239k(AbstractC5252q0 abstractC5252q0) {
        this.f33331b = abstractC5252q0;
    }

    @Override // p543do.AbstractC5252q0
    /* JADX INFO: renamed from: a */
    public final boolean mo11274a() {
        return this.f33331b.mo11274a();
    }

    @Override // p543do.AbstractC5252q0
    /* JADX INFO: renamed from: c */
    public final InterfaceC9077e mo11275c(InterfaceC9077e interfaceC9077e) {
        C5207g.m11111f(interfaceC9077e, "annotations");
        return this.f33331b.mo11275c(interfaceC9077e);
    }

    @Override // p543do.AbstractC5252q0
    /* JADX INFO: renamed from: e */
    public final boolean mo11276e() {
        return this.f33331b.mo11276e();
    }

    @Override // p543do.AbstractC5252q0
    /* JADX INFO: renamed from: f */
    public final AbstractC5257t mo11277f(AbstractC5257t abstractC5257t, Variance variance) {
        C5207g.m11111f(abstractC5257t, "topLevelType");
        C5207g.m11111f(variance, "position");
        return this.f33331b.mo11277f(abstractC5257t, variance);
    }
}
