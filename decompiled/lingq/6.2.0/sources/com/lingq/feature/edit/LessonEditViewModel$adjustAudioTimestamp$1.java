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
@c32(m4290c = "com.lingq.feature.edit.LessonEditViewModel$adjustAudioTimestamp$1", m4291f = "LessonEditViewModel.kt", m4292l = {357}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonEditViewModel$adjustAudioTimestamp$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25883a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2077c f25884b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f25885c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f25886d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f25887e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonEditViewModel$adjustAudioTimestamp$1(C2077c c2077c, int i, int i2, int i3, Continuation continuation) {
        super(2, continuation);
        this.f25884b = c2077c;
        this.f25885c = i;
        this.f25886d = i2;
        this.f25887e = i3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonEditViewModel$adjustAudioTimestamp$1(this.f25884b, this.f25885c, this.f25886d, this.f25887e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonEditViewModel$adjustAudioTimestamp$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        LessonEditViewModel$adjustAudioTimestamp$1 lessonEditViewModel$adjustAudioTimestamp$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25883a;
        xfa xfaVar = xfa.f68157a;
        C2077c c2077c = this.f25884b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C3139j9 c3139j9 = c2077c.f25937g;
            c2077c.f25940j.mo4589b2();
            int i2 = c2077c.f25942l;
            this.f25883a = 1;
            lessonEditViewModel$adjustAudioTimestamp$1 = this;
            Object objM7283j0 = ((C1295k) c3139j9.f45229a).m7283j0(i2, this.f25885c, this.f25886d, this.f25887e, lessonEditViewModel$adjustAudioTimestamp$1);
            if (objM7283j0 != coroutineSingletons) {
                objM7283j0 = xfaVar;
            }
            if (objM7283j0 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            lessonEditViewModel$adjustAudioTimestamp$1 = this;
        }
        c2077c.f25955y.add(new Integer(lessonEditViewModel$adjustAudioTimestamp$1.f25885c));
        return xfaVar;
    }
}
