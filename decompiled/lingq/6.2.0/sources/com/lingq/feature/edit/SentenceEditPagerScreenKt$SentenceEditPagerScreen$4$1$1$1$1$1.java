package com.lingq.feature.edit;

import androidx.compose.foundation.pager.AbstractC0150d;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.edit.SentenceEditPagerScreenKt$SentenceEditPagerScreen$4$1$1$1$1$1", m4291f = "SentenceEditPagerScreen.kt", m4292l = {93}, m4293m = "invokeSuspend", m4294v = 2)
final class SentenceEditPagerScreenKt$SentenceEditPagerScreen$4$1$1$1$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25927a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0150d f25928b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f25929c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SentenceEditPagerScreenKt$SentenceEditPagerScreen$4$1$1$1$1$1(AbstractC0150d abstractC0150d, int i, Continuation continuation) {
        super(2, continuation);
        this.f25928b = abstractC0150d;
        this.f25929c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SentenceEditPagerScreenKt$SentenceEditPagerScreen$4$1$1$1$1$1(this.f25928b, this.f25929c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SentenceEditPagerScreenKt$SentenceEditPagerScreen$4$1$1$1$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25927a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f25927a = 1;
            if (AbstractC0150d.m1031u(this.f25928b, this.f25929c, this) == coroutineSingletons) {
                return coroutineSingletons;
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
