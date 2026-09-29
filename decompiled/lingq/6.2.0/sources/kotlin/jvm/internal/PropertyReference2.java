package kotlin.jvm.internal;

import p000.sg4;
import p000.y38;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
public abstract class PropertyReference2 extends PropertyReference implements zi3 {
    @Override // kotlin.jvm.internal.CallableReference
    /* JADX INFO: renamed from: d */
    public final sg4 mo15405d() {
        y38.f69246a.getClass();
        return this;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        ((PropertyReference2Impl) this).m15411l();
        throw null;
    }

    /* JADX INFO: renamed from: l */
    public final void m15411l() {
        ((PropertyReference2) m15410k()).m15411l();
    }
}
