package androidx.work.impl;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.work.impl.WorkerWrapper", m4291f = "WorkerWrapper.kt", m4292l = {296}, m4293m = "runWorker")
final class WorkerWrapper$runWorker$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f7191a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0778d f7192b;

    /* JADX INFO: renamed from: c */
    public int f7193c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkerWrapper$runWorker$1(C0778d c0778d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f7192b = c0778d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7191a = obj;
        this.f7193c |= Integer.MIN_VALUE;
        return C0778d.m2925a(this.f7192b, this);
    }
}
