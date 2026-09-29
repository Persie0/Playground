package com.lingq.feature.dictionary;

import com.lingq.core.data.repository.C1297m;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.dictionary.DictContentViewModel$updateAvailableLocales$1", m4291f = "DictContentViewModel.kt", m4292l = {139}, m4293m = "invokeSuspend", m4294v = 2)
final class DictContentViewModel$updateAvailableLocales$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25668a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2056a f25669b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictContentViewModel$updateAvailableLocales$1(C2056a c2056a, Continuation continuation) {
        super(2, continuation);
        this.f25669b = c2056a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DictContentViewModel$updateAvailableLocales$1(this.f25669b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((DictContentViewModel$updateAvailableLocales$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25668a;
        C2056a c2056a = this.f25669b;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C1297m c1297m = c2056a.f25782d;
                this.f25668a = 1;
                if (c1297m.m7328b(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
        } catch (Exception e) {
            c2056a.f25790l.mo4677k(e);
        }
        return xfa.f68157a;
    }
}
