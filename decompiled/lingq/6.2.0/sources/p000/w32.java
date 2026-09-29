package p000;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public final class w32 implements Continuation {

    /* JADX INFO: renamed from: a */
    public aj3 f66325a;

    /* JADX INFO: renamed from: b */
    public Continuation f66326b;

    /* JADX INFO: renamed from: c */
    public Object f66327c;

    @Override // kotlin.coroutines.Continuation
    public final kn1 getContext() {
        return EmptyCoroutineContext.f47685a;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        this.f66326b = null;
        this.f66327c = obj;
    }
}
