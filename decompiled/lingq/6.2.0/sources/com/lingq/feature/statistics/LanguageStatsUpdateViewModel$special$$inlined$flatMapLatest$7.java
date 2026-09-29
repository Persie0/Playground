package com.lingq.feature.statistics;

import com.lingq.core.domain.model.language.Language;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.aj3;
import p000.bm3;
import p000.bn3;
import p000.c32;
import p000.cm3;
import p000.e83;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.statistics.LanguageStatsUpdateViewModel$special$$inlined$flatMapLatest$7", m4291f = "LanguageStatsUpdateViewModel.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class LanguageStatsUpdateViewModel$special$$inlined$flatMapLatest$7 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f33277a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f33278b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f33279c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ cm3 f33280d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsUpdateViewModel$special$$inlined$flatMapLatest$7(Continuation continuation, cm3 cm3Var) {
        super(3, continuation);
        this.f33280d = cm3Var;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LanguageStatsUpdateViewModel$special$$inlined$flatMapLatest$7 languageStatsUpdateViewModel$special$$inlined$flatMapLatest$7 = new LanguageStatsUpdateViewModel$special$$inlined$flatMapLatest$7((Continuation) obj3, this.f33280d);
        languageStatsUpdateViewModel$special$$inlined$flatMapLatest$7.f33278b = (e83) obj;
        languageStatsUpdateViewModel$special$$inlined$flatMapLatest$7.f33279c = obj2;
        return languageStatsUpdateViewModel$special$$inlined$flatMapLatest$7.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f33278b;
        Object obj2 = this.f33279c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33277a;
        xfa xfaVar = xfa.f68157a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        Language language = (Language) obj2;
        String str = language != null ? language.f19024a : null;
        if (str == null) {
            str = "";
        }
        bm3 bm3VarM4856b = cm3.m4856b(this.f33280d, str);
        this.f33278b = null;
        this.f33279c = null;
        this.f33277a = 1;
        AbstractC3224d.m15539r(e83Var);
        Object objCollect = bm3VarM4856b.collect(new bn3(e83Var, 5), this);
        if (objCollect != coroutineSingletons) {
            objCollect = xfaVar;
        }
        if (objCollect != coroutineSingletons) {
            objCollect = xfaVar;
        }
        return objCollect == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
