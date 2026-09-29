package com.lingq.feature.statistics;

import com.lingq.core.data.repository.C1285a;
import com.lingq.core.domain.model.language.Language;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.statistics.LanguageStatsBadgesViewModel$special$$inlined$flatMapLatest$1", m4291f = "LanguageStatsBadgesViewModel.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class LanguageStatsBadgesViewModel$special$$inlined$flatMapLatest$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f33163a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f33164b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f33165c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2811b f33166d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsBadgesViewModel$special$$inlined$flatMapLatest$1(C2811b c2811b, Continuation continuation) {
        super(3, continuation);
        this.f33166d = c2811b;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LanguageStatsBadgesViewModel$special$$inlined$flatMapLatest$1 languageStatsBadgesViewModel$special$$inlined$flatMapLatest$1 = new LanguageStatsBadgesViewModel$special$$inlined$flatMapLatest$1(this.f33166d, (Continuation) obj3);
        languageStatsBadgesViewModel$special$$inlined$flatMapLatest$1.f33164b = (e83) obj;
        languageStatsBadgesViewModel$special$$inlined$flatMapLatest$1.f33165c = obj2;
        return languageStatsBadgesViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f33164b;
        Object obj2 = this.f33165c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33163a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            c83 c83VarM7098b = ((C1285a) this.f33166d.f33384c).m7098b(((Language) obj2).f19024a);
            this.f33164b = null;
            this.f33165c = null;
            this.f33163a = 1;
            if (AbstractC3224d.m15537p(e83Var, c83VarM7098b, this) == coroutineSingletons) {
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
