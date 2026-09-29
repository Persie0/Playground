package com.lingq.feature.review;

import com.lingq.core.data.repository.C1287c;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.ao0;
import p000.c32;
import p000.eg8;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.ReviewViewModel$reviewCard$1", m4291f = "ReviewViewModel.kt", m4292l = {519}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewViewModel$reviewCard$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31895a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2758f f31896b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewViewModel$reviewCard$1(C2758f c2758f, Continuation continuation) {
        super(2, continuation);
        this.f31896b = c2758f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewViewModel$reviewCard$1(this.f31896b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewViewModel$reviewCard$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31895a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2758f c2758f = this.f31896b;
            Object objM9609c3 = c2758f.m9609c3();
            if (objM9609c3 != null && (objM9609c3 instanceof eg8)) {
                ao0 ao0Var = c2758f.f32510f;
                String strMo4589b2 = c2758f.f32506b.mo4589b2();
                eg8 eg8Var = (eg8) objM9609c3;
                String str = eg8Var.mo10270a().f64672b;
                int i2 = eg8Var.mo10270a().f64671a;
                this.f31895a = 1;
                if (((C1287c) ao0Var).m7126p(i2, strMo4589b2, str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
