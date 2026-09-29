package com.lingq.feature.edit;

import com.lingq.core.data.repository.C1295k;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.c32;
import p000.qj2;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.edit.LessonEditViewModel$onSentenceTextChanged$1", m4291f = "LessonEditViewModel.kt", m4292l = {296, 297}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonEditViewModel$onSentenceTextChanged$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25907a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2077c f25908b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f25909c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f25910d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonEditViewModel$onSentenceTextChanged$1(C2077c c2077c, int i, String str, Continuation continuation) {
        super(2, continuation);
        this.f25908b = c2077c;
        this.f25909c = i;
        this.f25910d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonEditViewModel$onSentenceTextChanged$1(this.f25908b, this.f25909c, this.f25910d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonEditViewModel$onSentenceTextChanged$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if (r9 == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25907a;
        int i2 = this.f25909c;
        xfa xfaVar = xfa.f68157a;
        C2077c c2077c = this.f25908b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f25907a = 1;
            if (AbstractC3208a.m15437d(500L, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
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
        c2077c.f25955y.add(new Integer(i2));
        return xfaVar;
        qj2 qj2Var = c2077c.f25935e;
        c2077c.f25940j.mo4589b2();
        int i3 = c2077c.f25942l;
        this.f25907a = 2;
        Object objM7281i0 = ((C1295k) qj2Var.f57848a).m7281i0(i3, i2, this.f25910d, this);
        if (objM7281i0 != coroutineSingletons) {
            objM7281i0 = xfaVar;
        }
    }
}
