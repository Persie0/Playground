package com.lingq.feature.reader.stats.p019ui.words;

import com.lingq.core.data.repository.C1295k;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.aj3;
import p000.bn3;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.ui.words.LessonCompleteDealBlueViewModel$hasCards$1", m4291f = "LessonCompleteDealBlueViewModel.kt", m4292l = {69}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteDealBlueViewModel$hasCards$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f31088a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f31089b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ int f31090c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2573c f31091d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteDealBlueViewModel$hasCards$1(C2573c c2573c, Continuation continuation) {
        super(3, continuation);
        this.f31091d = c2573c;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        LessonCompleteDealBlueViewModel$hasCards$1 lessonCompleteDealBlueViewModel$hasCards$1 = new LessonCompleteDealBlueViewModel$hasCards$1(this.f31091d, (Continuation) obj3);
        lessonCompleteDealBlueViewModel$hasCards$1.f31089b = (e83) obj;
        lessonCompleteDealBlueViewModel$hasCards$1.f31090c = iIntValue;
        return lessonCompleteDealBlueViewModel$hasCards$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f31089b;
        int i = this.f31090c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f31088a;
        xfa xfaVar = xfa.f68157a;
        if (i2 != 0) {
            if (i2 == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        c83 c83VarM7252J = ((C1295k) this.f31091d.f31123f).m7252J(i);
        this.f31089b = null;
        this.f31090c = i;
        this.f31088a = 1;
        AbstractC3224d.m15539r(e83Var);
        Object objCollect = c83VarM7252J.collect(new bn3(e83Var, 8), this);
        if (objCollect != coroutineSingletons) {
            objCollect = xfaVar;
        }
        if (objCollect != coroutineSingletons) {
            objCollect = xfaVar;
        }
        return objCollect == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
