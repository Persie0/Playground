package com.lingq.feature.reader.stats.p019ui.all;

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
@c32(m4290c = "com.lingq.feature.reader.stats.ui.all.LessonCompleteAllWordsViewModel$_words$1", m4291f = "LessonCompleteAllWordsViewModel.kt", m4292l = {73}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteAllWordsViewModel$_words$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f30917a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f30918b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ int f30919c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2556c f30920d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteAllWordsViewModel$_words$1(C2556c c2556c, Continuation continuation) {
        super(3, continuation);
        this.f30920d = c2556c;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        LessonCompleteAllWordsViewModel$_words$1 lessonCompleteAllWordsViewModel$_words$1 = new LessonCompleteAllWordsViewModel$_words$1(this.f30920d, (Continuation) obj3);
        lessonCompleteAllWordsViewModel$_words$1.f30918b = (e83) obj;
        lessonCompleteAllWordsViewModel$_words$1.f30919c = iIntValue;
        return lessonCompleteAllWordsViewModel$_words$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f30918b;
        int i = this.f30919c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f30917a;
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
        c83 c83VarM7256N = ((C1295k) this.f30920d.f30957e).m7256N(i);
        this.f30918b = null;
        this.f30919c = i;
        this.f30917a = 1;
        AbstractC3224d.m15539r(e83Var);
        Object objCollect = c83VarM7256N.collect(new bn3(e83Var, 7), this);
        if (objCollect != coroutineSingletons) {
            objCollect = xfaVar;
        }
        if (objCollect != coroutineSingletons) {
            objCollect = xfaVar;
        }
        return objCollect == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
