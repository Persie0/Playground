package com.lingq.feature.statistics;

import com.lingq.core.common.util.AbstractC1263a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.e83;
import p000.lda;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.statistics.LanguageStatsBadgesViewModel$badges$2", m4291f = "LanguageStatsBadgesViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LanguageStatsBadgesViewModel$badges$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2811b f33161a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsBadgesViewModel$badges$2(C2811b c2811b, Continuation continuation) {
        super(2, continuation);
        this.f33161a = c2811b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LanguageStatsBadgesViewModel$badges$2(this.f33161a, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        LanguageStatsBadgesViewModel$badges$2 languageStatsBadgesViewModel$badges$2 = (LanguageStatsBadgesViewModel$badges$2) create((e83) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        languageStatsBadgesViewModel$badges$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C2811b c2811b = this.f33161a;
        AbstractC1263a.m7047b(lda.m16103C(c2811b), c2811b.f33385d, "badges", new LanguageStatsBadgesViewModel$updateBadges$1(c2811b, null));
        return xfa.f68157a;
    }
}
