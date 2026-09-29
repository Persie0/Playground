package kotlin.jvm.internal;

import p000.ah4;
import p000.sg4;
import p000.y38;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PropertyReference1 extends PropertyReference implements ah4 {
    @Override // p000.ah4
    /* JADX INFO: renamed from: c */
    public final void mo398c() {
        ((ah4) m15410k()).mo398c();
    }

    @Override // kotlin.jvm.internal.CallableReference
    /* JADX INFO: renamed from: d */
    public final sg4 mo15405d() {
        y38.f69246a.getClass();
        return this;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return get(obj);
    }
}
