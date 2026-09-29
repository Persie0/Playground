package com.lingq.feature.review;

import android.os.Bundle;
import com.lingq.core.analytics.C1240a;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.gxc;
import p000.id8;
import p000.nb8;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.ReviewViewModel$nextActivity$1", m4291f = "ReviewViewModel.kt", m4292l = {506}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewViewModel$nextActivity$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31893a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2758f f31894b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewViewModel$nextActivity$1(C2758f c2758f, Continuation continuation) {
        super(2, continuation);
        this.f31894b = c2758f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewViewModel$nextActivity$1(this.f31894b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewViewModel$nextActivity$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2758f c2758f = this.f31894b;
        C3211a c3211a = c2758f.f32486E;
        id8 id8Var = c2758f.f32516l;
        C3244l c3244l = c2758f.f32527w;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31893a;
        xfa xfaVar = xfa.f68157a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        if (((Number) c3244l.getValue()).intValue() < ((List) c2758f.f32521q.getValue()).size() - 1) {
            c3244l.m15572j(null, Integer.valueOf(((Number) c3244l.getValue()).intValue() + 1));
            nb8 nb8VarM9609c3 = c2758f.m9609c3();
            if (nb8VarM9609c3 != null) {
                this.f31893a = 1;
                return C2758f.m9602V2(c2758f, nb8VarM9609c3, this) == coroutineSingletons ? coroutineSingletons : xfaVar;
            }
            c3211a.mo4677k(xfaVar);
            return xfaVar;
        }
        Bundle bundle = new Bundle();
        bundle.putString("Review type", gxc.m12971c(id8Var.f43979b));
        bundle.putString("Review location", c2758f.f32517m);
        ((C1240a) c2758f.f32515k).m7025f("Review session completed", bundle);
        if (gxc.m12970b(id8Var.f43979b)) {
            c2758f.f32487F.mo4677k(xfaVar);
            return xfaVar;
        }
        c3211a.mo4677k(xfaVar);
        return xfaVar;
    }
}
