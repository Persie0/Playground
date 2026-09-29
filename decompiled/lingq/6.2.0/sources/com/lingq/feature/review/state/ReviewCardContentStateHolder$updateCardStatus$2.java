package com.lingq.feature.review.state;

import com.lingq.core.data.repository.C1287c;
import com.lingq.core.domain.model.status.CardStatus;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.cma;
import p000.un1;
import p000.va2;
import p000.xa2;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.state.ReviewCardContentStateHolder$updateCardStatus$2", m4291f = "ReviewCardContentStateHolder.kt", m4292l = {177, 179}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewCardContentStateHolder$updateCardStatus$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32610a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f32611b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2761a f32612c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f32613d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Integer f32614e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewCardContentStateHolder$updateCardStatus$2(int i, C2761a c2761a, String str, Integer num, Continuation continuation) {
        super(2, continuation);
        this.f32611b = i;
        this.f32612c = c2761a;
        this.f32613d = str;
        this.f32614e = num;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewCardContentStateHolder$updateCardStatus$2(this.f32611b, this.f32612c, this.f32613d, this.f32614e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewCardContentStateHolder$updateCardStatus$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0064 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32610a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            int value = CardStatus.Ignored.getValue();
            C2761a c2761a = this.f32612c;
            cma cmaVar = c2761a.f32704a;
            int i2 = this.f32611b;
            if (i2 == value) {
                va2 va2Var = c2761a.f32712i;
                String strMo4589b2 = cmaVar.mo4589b2();
                this.f32610a = 1;
                Object objM7113b = ((C1287c) va2Var.f65121a).m7113b(i2, strMo4589b2, this.f32613d, this);
                if (objM7113b != coroutineSingletons) {
                    objM7113b = xfaVar;
                }
                if (objM7113b == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                xa2 xa2Var = c2761a.f32711h;
                String strMo4589b3 = cmaVar.mo4589b2();
                Integer num = this.f32614e;
                int iIntValue = num != null ? num.intValue() : 0;
                this.f32610a = 2;
                if (xa2Var.m24431a(strMo4589b3, this.f32613d, this.f32611b, iIntValue, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfaVar;
    }
}
