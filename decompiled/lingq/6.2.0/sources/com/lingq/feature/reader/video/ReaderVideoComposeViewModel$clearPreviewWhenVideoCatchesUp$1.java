package com.lingq.feature.reader.video;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.ReaderVideoComposeViewModel$clearPreviewWhenVideoCatchesUp$1", m4291f = "ReaderVideoComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderVideoComposeViewModel$clearPreviewWhenVideoCatchesUp$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Integer f31184a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Integer f31185b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2583a f31186c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderVideoComposeViewModel$clearPreviewWhenVideoCatchesUp$1(C2583a c2583a, Continuation continuation) {
        super(3, continuation);
        this.f31186c = c2583a;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        ReaderVideoComposeViewModel$clearPreviewWhenVideoCatchesUp$1 readerVideoComposeViewModel$clearPreviewWhenVideoCatchesUp$1 = new ReaderVideoComposeViewModel$clearPreviewWhenVideoCatchesUp$1(this.f31186c, (Continuation) obj3);
        readerVideoComposeViewModel$clearPreviewWhenVideoCatchesUp$1.f31184a = (Integer) obj;
        readerVideoComposeViewModel$clearPreviewWhenVideoCatchesUp$1.f31185b = (Integer) obj2;
        xfa xfaVar = xfa.f68157a;
        readerVideoComposeViewModel$clearPreviewWhenVideoCatchesUp$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Integer num = this.f31184a;
        Integer num2 = this.f31185b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (num2 != null && num != null && num.equals(num2)) {
            this.f31186c.f31356O.m15571i(null);
        }
        return xfa.f68157a;
    }
}
