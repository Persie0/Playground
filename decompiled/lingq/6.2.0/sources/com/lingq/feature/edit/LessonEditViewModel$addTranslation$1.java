package com.lingq.feature.edit;

import com.lingq.core.data.repository.C1295k;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.c32;
import p000.m23;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.edit.LessonEditViewModel$addTranslation$1", m4291f = "LessonEditViewModel.kt", m4292l = {337, 338}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonEditViewModel$addTranslation$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25879a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2077c f25880b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f25881c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f25882d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonEditViewModel$addTranslation$1(C2077c c2077c, int i, String str, Continuation continuation) {
        super(2, continuation);
        this.f25880b = c2077c;
        this.f25881c = i;
        this.f25882d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonEditViewModel$addTranslation$1(this.f25880b, this.f25881c, this.f25882d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonEditViewModel$addTranslation$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r13 == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        LessonEditViewModel$addTranslation$1 lessonEditViewModel$addTranslation$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25879a;
        xfa xfaVar = xfa.f68157a;
        C2077c c2077c = this.f25880b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f25879a = 1;
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
            lessonEditViewModel$addTranslation$1 = this;
        }
        c2077c.f25955y.add(new Integer(lessonEditViewModel$addTranslation$1.f25881c));
        return xfaVar;
        m23 m23Var = c2077c.f25936f;
        c2077c.f25940j.mo4589b2();
        int i2 = c2077c.f25942l;
        this.f25879a = 2;
        lessonEditViewModel$addTranslation$1 = this;
        Object objM7291n0 = ((C1295k) m23Var.f50448a).m7291n0(i2, this.f25881c, this.f25882d, "", false, lessonEditViewModel$addTranslation$1);
        if (objM7291n0 != coroutineSingletons) {
            objM7291n0 = xfaVar;
        }
    }
}
