package com.lingq.feature.reader.old.tutorial;

import com.lingq.core.data.repository.C1306v;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.cma;
import p000.un1;
import p000.w3a;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.tutorial.LessonMoveKnownViewModel$updateTokenTranslation$1", m4291f = "LessonMoveKnownViewModel.kt", m4292l = {176}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonMoveKnownViewModel$updateTokenTranslation$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29640a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2458c f29641b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f29642c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonMoveKnownViewModel$updateTokenTranslation$1(C2458c c2458c, String str, Continuation continuation) {
        super(2, continuation);
        this.f29641b = c2458c;
        this.f29642c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonMoveKnownViewModel$updateTokenTranslation$1(this.f29641b, this.f29642c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonMoveKnownViewModel$updateTokenTranslation$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2458c c2458c = this.f29641b;
        cma cmaVar = c2458c.f29660c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29640a;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                w3a w3aVar = c2458c.f29665h;
                String strMo4589b2 = cmaVar.mo4589b2();
                String strMo4580K1 = cmaVar.mo4580K1();
                String str = this.f29642c;
                this.f29640a = 1;
                if (((C1306v) w3aVar).m7380f(strMo4589b2, strMo4580K1, str, null, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
        } catch (Exception unused) {
        }
        return xfa.f68157a;
    }
}
