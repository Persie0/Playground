package com.lingq.feature.dictionary;

import com.lingq.core.data.repository.C1292h;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.h23;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.dictionary.DictionariesManageViewModel$1", m4291f = "DictionariesManageViewModel.kt", m4292l = {74}, m4293m = "invokeSuspend", m4294v = 2)
final class DictionariesManageViewModel$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25743a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2066j f25744b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionariesManageViewModel$1(C2066j c2066j, Continuation continuation) {
        super(2, continuation);
        this.f25744b = c2066j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DictionariesManageViewModel$1(this.f25744b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((DictionariesManageViewModel$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25743a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2066j c2066j = this.f25744b;
            h23 h23Var = c2066j.f25838g;
            String strMo4589b2 = c2066j.f25833b.mo4589b2();
            this.f25743a = 1;
            Object objM7199e = ((C1292h) h23Var.f41694a).m7199e(strMo4589b2, this);
            if (objM7199e != coroutineSingletons) {
                objM7199e = xfaVar;
            }
            if (objM7199e == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfaVar;
    }
}
