package com.lingq.core.domain.library;

import com.lingq.core.domain.model.language.LanguageStudyStats;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.cj3;
import p000.jp4;
import p000.kad;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.domain.library.GetStreakInfoUseCase$invoke$1$1", m4291f = "GetStreakInfoUseCase.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class GetStreakInfoUseCase$invoke$1$1 extends SuspendLambda implements cj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ jp4 f18809a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ LanguageStudyStats f18810b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f18811c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Map f18812d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f18813e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetStreakInfoUseCase$invoke$1$1(String str, Continuation continuation) {
        super(5, continuation);
        this.f18813e = str;
    }

    @Override // p000.cj3
    /* JADX INFO: renamed from: i */
    public final Object mo1291i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        GetStreakInfoUseCase$invoke$1$1 getStreakInfoUseCase$invoke$1$1 = new GetStreakInfoUseCase$invoke$1$1(this.f18813e, (Continuation) obj5);
        getStreakInfoUseCase$invoke$1$1.f18809a = (jp4) obj;
        getStreakInfoUseCase$invoke$1$1.f18810b = (LanguageStudyStats) obj2;
        getStreakInfoUseCase$invoke$1$1.f18811c = zBooleanValue;
        getStreakInfoUseCase$invoke$1$1.f18812d = (Map) obj4;
        return getStreakInfoUseCase$invoke$1$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        jp4 jp4Var = this.f18809a;
        LanguageStudyStats languageStudyStats = this.f18810b;
        boolean z = this.f18811c;
        Map map = this.f18812d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        String str = (String) map.get(this.f18813e);
        if (jp4Var == null || languageStudyStats == null || !z || !jp4Var.f45958c) {
            return null;
        }
        if ((str == null || str.compareTo(kad.m15049b()) < 0) && jp4Var.f45959d > 5000.0d) {
            return new Pair(jp4Var, languageStudyStats);
        }
        return null;
    }
}
