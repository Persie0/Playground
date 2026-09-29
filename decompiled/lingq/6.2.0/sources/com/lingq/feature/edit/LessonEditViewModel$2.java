package com.lingq.feature.edit;

import com.lingq.feature.edit.domain.C2081a;
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
@c32(m4290c = "com.lingq.feature.edit.LessonEditViewModel$2", m4291f = "LessonEditViewModel.kt", m4292l = {201}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonEditViewModel$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25865a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2077c f25866b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonEditViewModel$2(C2077c c2077c, Continuation continuation) {
        super(2, continuation);
        this.f25866b = c2077c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonEditViewModel$2(this.f25866b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonEditViewModel$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25865a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2077c c2077c = this.f25866b;
            C2081a c2081a = c2077c.f25933c;
            String strMo4589b2 = c2077c.f25940j.mo4589b2();
            int i2 = c2077c.f25942l;
            this.f25865a = 1;
            if (c2081a.m8994a(i2, strMo4589b2, this) == coroutineSingletons) {
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
