package com.lingq.feature.challenges.cup;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.m58;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.cup.CupViewModel$refresh$2", m4291f = "CupViewModel.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
final class CupViewModel$refresh$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24655a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1980g f24656b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CupViewModel$refresh$2(C1980g c1980g, Continuation continuation) {
        super(2, continuation);
        this.f24656b = c1980g;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CupViewModel$refresh$2(this.f24656b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CupViewModel$refresh$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24655a;
        C1980g c1980g = this.f24656b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            m58 m58Var = c1980g.f24708d;
            this.f24655a = 1;
            if (m58Var.m16644h(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3244l c3244l = c1980g.f24715k;
        do {
            value = c3244l.getValue();
            ((Boolean) value).getClass();
        } while (!c3244l.m15570h(value, Boolean.FALSE));
        return xfa.f68157a;
    }
}
