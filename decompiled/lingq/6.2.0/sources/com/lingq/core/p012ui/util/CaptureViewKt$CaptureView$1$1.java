package com.lingq.core.p012ui.util;

import androidx.compose.p002ui.platform.ComposeView;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.RunnableC0806bd;
import p000.c32;
import p000.t66;
import p000.un1;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.ui.util.CaptureViewKt$CaptureView$1$1", m4291f = "CaptureView.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class CaptureViewKt$CaptureView$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f24151a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ComposeView f24152b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f24153c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vi3 f24154d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureViewKt$CaptureView$1$1(boolean z, ComposeView composeView, t66 t66Var, vi3 vi3Var, Continuation continuation) {
        super(2, continuation);
        this.f24151a = z;
        this.f24152b = composeView;
        this.f24153c = t66Var;
        this.f24154d = vi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CaptureViewKt$CaptureView$1$1(this.f24151a, this.f24152b, this.f24153c, this.f24154d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        CaptureViewKt$CaptureView$1$1 captureViewKt$CaptureView$1$1 = (CaptureViewKt$CaptureView$1$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        captureViewKt$CaptureView$1$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (this.f24151a && ((Boolean) this.f24153c.getValue()).booleanValue()) {
            vi3 vi3Var = this.f24154d;
            ComposeView composeView = this.f24152b;
            composeView.post(new RunnableC0806bd(14, vi3Var, composeView));
        }
        return xfa.f68157a;
    }
}
