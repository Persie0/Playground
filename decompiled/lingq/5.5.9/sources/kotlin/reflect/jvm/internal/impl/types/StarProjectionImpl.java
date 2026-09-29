package kotlin.reflect.jvm.internal.impl.types;

import cm.InterfaceC2041a;
import dm.C5207g;
import dm.C5212l;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import p102eo.AbstractC5439d;
import p372rm.InterfaceC8847k0;
import p543do.AbstractC5248o0;
import p543do.AbstractC5257t;
import p543do.InterfaceC5246n0;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
public final class StarProjectionImpl extends AbstractC5248o0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8847k0 f39879a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9070c f39880b;

    public StarProjectionImpl(InterfaceC8847k0 interfaceC8847k0) {
        C5207g.m11111f(interfaceC8847k0, "typeParameter");
        this.f39879a = interfaceC8847k0;
        this.f39880b = C6740a.m13373b(LazyThreadSafetyMode.PUBLICATION, new InterfaceC2041a<AbstractC5257t>() { // from class: kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl$_type$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC5257t mo807E() {
                return C5212l.m11164k0(this.f39881b.f39879a);
            }
        });
    }

    @Override // p543do.InterfaceC5246n0
    /* JADX INFO: renamed from: c */
    public final AbstractC5257t mo11236c() {
        return (AbstractC5257t) this.f39880b.getValue();
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
