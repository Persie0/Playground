package com.lingq.feature.edit;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.C3849zx;
import p000.c32;
import p000.kx8;
import p000.sca;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.edit.LessonEditViewModel$toggleAudioPlay$1", m4291f = "LessonEditViewModel.kt", m4292l = {377}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonEditViewModel$toggleAudioPlay$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25921a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2077c f25922b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kx8 f25923c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonEditViewModel$toggleAudioPlay$1(C2077c c2077c, kx8 kx8Var, Continuation continuation) {
        super(2, continuation);
        this.f25922b = c2077c;
        this.f25923c = kx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonEditViewModel$toggleAudioPlay$1(this.f25922b, this.f25923c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonEditViewModel$toggleAudioPlay$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25921a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f25921a = 1;
            if (AbstractC3208a.m15437d(100L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C2077c c2077c = this.f25922b;
        sca scaVar = c2077c.f25941k;
        int i2 = c2077c.f25942l;
        kx8 kx8Var = this.f25923c;
        C3849zx c3849zx = kx8Var.f48555h;
        scaVar.mo8483U0(i2, c3849zx != null ? c3849zx.f72327a : 0.0d, new Double(c3849zx != null ? c3849zx.f72328b : 0.0d), 1.0f, kx8Var.f48548a);
        return xfa.f68157a;
    }
}
