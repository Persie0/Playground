package com.lingq.feature.challenges.cup;

import androidx.compose.material3.C0232g0;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.lt1;
import p000.un1;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.cup.CupDailyPrizeScreenKt$CupDailyPrizeScreen$1$1", m4291f = "CupDailyPrizeScreen.kt", m4292l = {87}, m4293m = "invokeSuspend", m4294v = 2)
final class CupDailyPrizeScreenKt$CupDailyPrizeScreen$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24582a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f24583b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0232g0 f24584c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vi3 f24585d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CupDailyPrizeScreenKt$CupDailyPrizeScreen$1$1(String str, C0232g0 c0232g0, vi3 vi3Var, Continuation continuation) {
        super(2, continuation);
        this.f24583b = str;
        this.f24584c = c0232g0;
        this.f24585d = vi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CupDailyPrizeScreenKt$CupDailyPrizeScreen$1$1(this.f24583b, this.f24584c, this.f24585d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CupDailyPrizeScreenKt$CupDailyPrizeScreen$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CupDailyPrizeScreenKt$CupDailyPrizeScreen$1$1 cupDailyPrizeScreenKt$CupDailyPrizeScreen$1$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24582a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            String str = this.f24583b;
            if (str != null) {
                this.f24582a = 1;
                cupDailyPrizeScreenKt$CupDailyPrizeScreen$1$1 = this;
                if (C0232g0.m1155b(this.f24584c, str, null, null, cupDailyPrizeScreenKt$CupDailyPrizeScreen$1$1, 14) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return xfa.f68157a;
        }
        if (i != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        cupDailyPrizeScreenKt$CupDailyPrizeScreen$1$1 = this;
        cupDailyPrizeScreenKt$CupDailyPrizeScreen$1$1.f24585d.invoke(lt1.f50095a);
        return xfa.f68157a;
    }
}
