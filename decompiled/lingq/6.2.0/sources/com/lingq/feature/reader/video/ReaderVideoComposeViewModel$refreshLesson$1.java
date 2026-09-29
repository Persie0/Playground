package com.lingq.feature.reader.video;

import com.lingq.feature.reader.content.C2260a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.ReaderVideoComposeViewModel$refreshLesson$1", m4291f = "ReaderVideoComposeViewModel.kt", m4292l = {374}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderVideoComposeViewModel$refreshLesson$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31266a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2583a f31267b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderVideoComposeViewModel$refreshLesson$1(C2583a c2583a, Continuation continuation) {
        super(2, continuation);
        this.f31267b = c2583a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderVideoComposeViewModel$refreshLesson$1(this.f31267b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderVideoComposeViewModel$refreshLesson$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31266a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2583a c2583a = this.f31267b;
            C2260a c2260a = c2583a.f31371d;
            String strMo4589b2 = c2583a.f31369b.mo4589b2();
            int i2 = c2583a.f31348G;
            this.f31266a = 1;
            if (c2260a.m9254g(i2, strMo4589b2, this) == coroutineSingletons) {
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
