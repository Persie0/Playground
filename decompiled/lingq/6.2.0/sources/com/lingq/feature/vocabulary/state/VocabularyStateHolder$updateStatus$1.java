package com.lingq.feature.vocabulary.state;

import com.lingq.core.data.repository.C1287c;
import com.lingq.core.domain.model.status.CardStatus;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.va2;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.state.VocabularyStateHolder$updateStatus$1", m4291f = "VocabularyStateHolder.kt", m4292l = {398, 400}, m4293m = "invokeSuspend", m4294v = 2)
final class VocabularyStateHolder$updateStatus$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33767a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f33768b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2862d f33769c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f33770d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyStateHolder$updateStatus$1(int i, C2862d c2862d, String str, Continuation continuation) {
        super(2, continuation);
        this.f33768b = i;
        this.f33769c = c2862d;
        this.f33770d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VocabularyStateHolder$updateStatus$1(this.f33768b, this.f33769c, this.f33770d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((VocabularyStateHolder$updateStatus$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x005f A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33767a;
        xfa xfaVar = xfa.f68157a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            if (i == 2) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        int value = CardStatus.Ignored.getValue();
        int i2 = this.f33768b;
        C2862d c2862d = this.f33769c;
        if (i2 == value) {
            va2 va2Var = c2862d.f33802h;
            String str = c2862d.f33810p;
            this.f33767a = 1;
            Object objM7113b = ((C1287c) va2Var.f65121a).m7113b(i2, str, this.f33770d, this);
            if (objM7113b != coroutineSingletons) {
                objM7113b = xfaVar;
            }
            if (objM7113b == coroutineSingletons) {
                return coroutineSingletons;
            }
            return xfaVar;
        }
        va2 va2Var2 = c2862d.f33803i;
        String str2 = c2862d.f33810p;
        this.f33767a = 2;
        Object objM7133w = ((C1287c) va2Var2.f65121a).m7133w(str2, this.f33770d, this.f33768b, null, this);
        if (objM7133w != coroutineSingletons) {
            objM7133w = xfaVar;
        }
        if (objM7133w == coroutineSingletons) {
            return coroutineSingletons;
        }
        return xfaVar;
    }
}
