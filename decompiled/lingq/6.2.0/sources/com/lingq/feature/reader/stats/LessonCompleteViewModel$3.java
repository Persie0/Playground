package com.lingq.feature.reader.stats;

import com.lingq.core.data.repository.C1295k;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.o23;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteViewModel$3", m4291f = "LessonCompleteViewModel.kt", m4292l = {803}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteViewModel$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f30551a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2535j f30552b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteViewModel$3(C2535j c2535j, Continuation continuation) {
        super(2, continuation);
        this.f30552b = c2535j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonCompleteViewModel$3(this.f30552b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonCompleteViewModel$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30551a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2535j c2535j = this.f30552b;
            o23 o23Var = c2535j.f30858x;
            String strMo4589b2 = c2535j.f30818b.mo4589b2();
            int i2 = c2535j.f30803M;
            this.f30551a = 1;
            Object objM7300t = ((C1295k) o23Var.f53649a).m7300t(i2, strMo4589b2, this);
            if (objM7300t != coroutineSingletons) {
                objM7300t = xfaVar;
            }
            if (objM7300t == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfaVar;
    }
}
