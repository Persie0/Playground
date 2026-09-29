package com.lingq.feature.reader.stats;

import com.lingq.core.data.repository.C1295k;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.c32;
import p000.o23;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteViewModel$4", m4291f = "LessonCompleteViewModel.kt", m4292l = {810, 811}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteViewModel$4 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f30553a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2535j f30554b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteViewModel$4(C2535j c2535j, Continuation continuation) {
        super(2, continuation);
        this.f30554b = c2535j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonCompleteViewModel$4(this.f30554b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonCompleteViewModel$4) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30553a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f30553a = 1;
            if (AbstractC3208a.m15437d(3000L, this) != coroutineSingletons) {
            }
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C2535j c2535j = this.f30554b;
        o23 o23Var = c2535j.f30858x;
        String strMo4589b2 = c2535j.f30818b.mo4589b2();
        int i2 = c2535j.f30803M;
        this.f30553a = 2;
        Object objM7300t = ((C1295k) o23Var.f53649a).m7300t(i2, strMo4589b2, this);
        if (objM7300t != coroutineSingletons) {
            objM7300t = xfaVar;
        }
        return objM7300t == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
