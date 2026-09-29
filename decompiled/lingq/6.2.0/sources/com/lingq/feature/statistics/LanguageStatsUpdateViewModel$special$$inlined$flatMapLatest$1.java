package com.lingq.feature.statistics;

import com.lingq.core.domain.model.language.Language;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.internal.C3235e;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.e83;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.statistics.LanguageStatsUpdateViewModel$special$$inlined$flatMapLatest$1", m4291f = "LanguageStatsUpdateViewModel.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class LanguageStatsUpdateViewModel$special$$inlined$flatMapLatest$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f33253a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f33254b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f33255c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2817e f33256d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsUpdateViewModel$special$$inlined$flatMapLatest$1(C2817e c2817e, Continuation continuation) {
        super(3, continuation);
        this.f33256d = c2817e;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LanguageStatsUpdateViewModel$special$$inlined$flatMapLatest$1 languageStatsUpdateViewModel$special$$inlined$flatMapLatest$1 = new LanguageStatsUpdateViewModel$special$$inlined$flatMapLatest$1(this.f33256d, (Continuation) obj3);
        languageStatsUpdateViewModel$special$$inlined$flatMapLatest$1.f33254b = (e83) obj;
        languageStatsUpdateViewModel$special$$inlined$flatMapLatest$1.f33255c = obj2;
        return languageStatsUpdateViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f33254b;
        Object obj2 = this.f33255c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33253a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C3235e c3235eM9731b = this.f33256d.f33446l.m9731b(((Language) obj2).f19024a);
            this.f33254b = null;
            this.f33255c = null;
            this.f33253a = 1;
            if (AbstractC3224d.m15537p(e83Var, c3235eM9731b, this) == coroutineSingletons) {
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
