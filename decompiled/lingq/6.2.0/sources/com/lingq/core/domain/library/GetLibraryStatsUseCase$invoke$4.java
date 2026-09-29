package com.lingq.core.domain.library;

import com.lingq.core.data.repository.C1294j;
import com.lingq.core.domain.model.language.LanguageProgressInterval;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.oo4;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.domain.library.GetLibraryStatsUseCase$invoke$4", m4291f = "GetLibraryStatsUseCase.kt", m4292l = {24}, m4293m = "invokeSuspend", m4294v = 2)
final class GetLibraryStatsUseCase$invoke$4 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f18758a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1387b f18759b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f18760c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLibraryStatsUseCase$invoke$4(C1387b c1387b, String str, Continuation continuation) {
        super(1, continuation);
        this.f18759b = c1387b;
        this.f18760c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new GetLibraryStatsUseCase$invoke$4(this.f18759b, this.f18760c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((GetLibraryStatsUseCase$invoke$4) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f18758a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            oo4 oo4Var = (oo4) this.f18759b.f18831a;
            LanguageProgressInterval languageProgressInterval = LanguageProgressInterval.Today;
            this.f18758a = 1;
            if (((C1294j) oo4Var).m7228b(this.f18760c, languageProgressInterval, this) == coroutineSingletons) {
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
