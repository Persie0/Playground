package p000;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class hg9 implements Continuation, vn1 {

    /* JADX INFO: renamed from: a */
    public final Continuation f42335a;

    /* JADX INFO: renamed from: b */
    public final kn1 f42336b;

    public hg9(kn1 kn1Var, Continuation continuation) {
        this.f42335a = continuation;
        this.f42336b = kn1Var;
    }

    @Override // p000.vn1
    public final vn1 getCallerFrame() {
        return (vn1) this.f42335a;
    }

    @Override // kotlin.coroutines.Continuation
    public final kn1 getContext() {
        return this.f42336b;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        this.f42335a.resumeWith(obj);
    }
}
