package com.lingq.feature.reader.video;

import com.lingq.feature.reader.content.C2260a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.cma;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.ReaderVideoComposeViewModel$loadLesson$1", m4291f = "ReaderVideoComposeViewModel.kt", m4292l = {393}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderVideoComposeViewModel$loadLesson$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31199a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2583a f31200b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderVideoComposeViewModel$loadLesson$1(C2583a c2583a, Continuation continuation) {
        super(2, continuation);
        this.f31200b = c2583a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderVideoComposeViewModel$loadLesson$1(this.f31200b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderVideoComposeViewModel$loadLesson$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2583a c2583a = this.f31200b;
        cma cmaVar = c2583a.f31369b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31199a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2260a c2260a = c2583a.f31371d;
            String strMo4589b2 = cmaVar.mo4589b2();
            String strMo4580K1 = cmaVar.mo4580K1();
            int i2 = c2583a.f31348G;
            this.f31199a = 1;
            if (c2260a.m9252e(strMo4589b2, strMo4580K1, i2, false, false, false, this) == coroutineSingletons) {
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
