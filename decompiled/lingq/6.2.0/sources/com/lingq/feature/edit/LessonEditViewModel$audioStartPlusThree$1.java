package com.lingq.feature.edit;

import com.lingq.core.data.repository.C1295k;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3139j9;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.edit.LessonEditViewModel$audioStartPlusThree$1", m4291f = "LessonEditViewModel.kt", m4292l = {398}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonEditViewModel$audioStartPlusThree$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25891a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2077c f25892b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f25893c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonEditViewModel$audioStartPlusThree$1(int i, C2077c c2077c, Continuation continuation) {
        super(2, continuation);
        this.f25892b = c2077c;
        this.f25893c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonEditViewModel$audioStartPlusThree$1(this.f25893c, this.f25892b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonEditViewModel$audioStartPlusThree$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25891a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f25893c;
        C2077c c2077c = this.f25892b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C3139j9 c3139j9 = c2077c.f25937g;
            c2077c.f25940j.mo4589b2();
            int i3 = c2077c.f25942l;
            this.f25891a = 1;
            Object objM7287l0 = ((C1295k) c3139j9.f45229a).m7287l0(i3, i2, this);
            if (objM7287l0 != coroutineSingletons) {
                objM7287l0 = xfaVar;
            }
            if (objM7287l0 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        c2077c.f25955y.add(new Integer(i2));
        return xfaVar;
    }
}
