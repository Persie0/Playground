package com.lingq.feature.statistics;

import com.lingq.core.data.repository.C1285a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.b80;
import p000.c32;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.statistics.LanguageStatsBadgesViewModel$updateBadges$1", m4291f = "LanguageStatsBadgesViewModel.kt", m4292l = {68}, m4293m = "invokeSuspend", m4294v = 2)
final class LanguageStatsBadgesViewModel$updateBadges$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f33167a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2811b f33168b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsBadgesViewModel$updateBadges$1(C2811b c2811b, Continuation continuation) {
        super(1, continuation);
        this.f33168b = c2811b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LanguageStatsBadgesViewModel$updateBadges$1(this.f33168b, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((LanguageStatsBadgesViewModel$updateBadges$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33167a;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C2811b c2811b = this.f33168b;
                b80 b80Var = c2811b.f33384c;
                String strMo4589b2 = c2811b.f33383b.mo4589b2();
                this.f33167a = 1;
                if (((C1285a) b80Var).m7097a(strMo4589b2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return xfa.f68157a;
    }
}
