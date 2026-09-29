package com.lingq.feature.review;

import com.lingq.core.data.repository.C1308x;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.u0b;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.ReviewViewModel$cardsForAnswers$5", m4291f = "ReviewViewModel.kt", m4292l = {436}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewViewModel$cardsForAnswers$5 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31870a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2758f f31871b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f31872c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewViewModel$cardsForAnswers$5(C2758f c2758f, String str, Continuation continuation) {
        super(2, continuation);
        this.f31871b = c2758f;
        this.f31872c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewViewModel$cardsForAnswers$5(this.f31871b, this.f31872c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewViewModel$cardsForAnswers$5) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31870a;
        C2758f c2758f = this.f31871b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            u0b u0bVar = c2758f.f32509e;
            this.f31870a = 1;
            obj = ((C1308x) u0bVar).m7416j(this.f31872c, this);
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
        List list = (List) obj;
        C3244l c3244l = c2758f.f32526v;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, list));
        C3244l c3244l2 = c2758f.f32528x;
        do {
            value2 = c3244l2.getValue();
            ((Boolean) value2).getClass();
        } while (!c3244l2.m15570h(value2, Boolean.FALSE));
        return xfa.f68157a;
    }
}
