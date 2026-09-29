package com.lingq.feature.edit;

import com.lingq.feature.edit.domain.C2081a;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.u91;
import p000.un1;
import p000.w15;
import p000.xc9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.edit.LessonEditViewModel$onDone$1", m4291f = "LessonEditViewModel.kt", m4292l = {287}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonEditViewModel$onDone$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25900a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2077c f25901b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonEditViewModel$onDone$1(C2077c c2077c, Continuation continuation) {
        super(2, continuation);
        this.f25901b = c2077c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonEditViewModel$onDone$1(this.f25901b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonEditViewModel$onDone$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25900a;
        C2077c c2077c = this.f25901b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            ((xc9) c2077c.f25944n).setValue(w15.m23674a((w15) ((xc9) c2077c.f25944n).getValue(), null, true, 5));
            C2081a c2081a = c2077c.f25938h;
            String strMo4589b2 = c2077c.f25940j.mo4589b2();
            int i2 = c2077c.f25942l;
            List listM22622n1 = u91.m22622n1(c2077c.f25955y);
            this.f25900a = 1;
            if (c2081a.m8995b(strMo4589b2, i2, listM22622n1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        ((xc9) c2077c.f25944n).setValue(w15.m23674a((w15) ((xc9) c2077c.f25944n).getValue(), null, false, 1));
        return xfa.f68157a;
    }
}
