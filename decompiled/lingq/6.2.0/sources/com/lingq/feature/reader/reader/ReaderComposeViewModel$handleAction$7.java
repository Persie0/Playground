package com.lingq.feature.reader.reader;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.ar7;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$handleAction$7", m4291f = "ReaderComposeViewModel.kt", m4292l = {893}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderComposeViewModel$handleAction$7 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29958a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2493a f29959b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderComposeViewModel$handleAction$7(C2493a c2493a, Continuation continuation) {
        super(2, continuation);
        this.f29959b = c2493a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderComposeViewModel$handleAction$7(this.f29959b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderComposeViewModel$handleAction$7) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29958a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            ar7 ar7Var = this.f29959b.f30228r;
            this.f29958a = 1;
            if (ar7Var.mo3012w1(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
