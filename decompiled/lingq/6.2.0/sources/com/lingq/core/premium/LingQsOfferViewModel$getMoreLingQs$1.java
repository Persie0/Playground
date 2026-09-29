package com.lingq.core.premium;

import android.os.Bundle;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.data.profile.C1267a;
import com.lingq.core.domain.model.user.LingQsOffer;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.ce5;
import p000.km7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.premium.LingQsOfferViewModel$getMoreLingQs$1", m4291f = "LingQsOfferViewModel.kt", m4292l = {49}, m4293m = "invokeSuspend", m4294v = 2)
final class LingQsOfferViewModel$getMoreLingQs$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22376a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ce5 f22377b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LingQsOffer f22378c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f22379d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LingQsOfferViewModel$getMoreLingQs$1(ce5 ce5Var, LingQsOffer lingQsOffer, long j, Continuation continuation) {
        super(2, continuation);
        this.f22377b = ce5Var;
        this.f22378c = lingQsOffer;
        this.f22379d = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LingQsOfferViewModel$getMoreLingQs$1(this.f22377b, this.f22378c, this.f22379d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LingQsOfferViewModel$getMoreLingQs$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ce5 ce5Var = this.f22377b;
        C3244l c3244l = ce5Var.f9977f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22376a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            Boolean bool = Boolean.TRUE;
            c3244l.getClass();
            c3244l.m15572j(null, bool);
            km7 km7Var = ce5Var.f9975d;
            int iAmount = this.f22378c.amount();
            this.f22376a = 1;
            obj = ((C1267a) km7Var).m7075d(iAmount, this.f22379d, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Boolean bool2 = Boolean.FALSE;
        c3244l.getClass();
        c3244l.m15572j(null, bool2);
        xfa xfaVar = xfa.f68157a;
        if (!zBooleanValue) {
            ce5Var.f9981j.mo4677k(xfaVar);
            return xfaVar;
        }
        Bundle bundle = new Bundle();
        LingQsOffer lingQsOffer = LingQsOffer.LimitOffer;
        bundle.putInt("LingQs Added", lingQsOffer.amount());
        ((C1240a) ce5Var.f9976e).m7025f("Add More LingQs", bundle);
        ce5Var.f9979h.mo4677k(new Integer(lingQsOffer.amount()));
        return xfaVar;
    }
}
