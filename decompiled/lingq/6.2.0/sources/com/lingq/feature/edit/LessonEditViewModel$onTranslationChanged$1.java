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
@c32(m4290c = "com.lingq.feature.edit.LessonEditViewModel$onTranslationChanged$1", m4291f = "LessonEditViewModel.kt", m4292l = {307, 308}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonEditViewModel$onTranslationChanged$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25911a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2077c f25912b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f25913c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f25914d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f25915e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonEditViewModel$onTranslationChanged$1(C2077c c2077c, int i, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f25912b = c2077c;
        this.f25913c = i;
        this.f25914d = str;
        this.f25915e = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonEditViewModel$onTranslationChanged$1(this.f25912b, this.f25913c, this.f25914d, this.f25915e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonEditViewModel$onTranslationChanged$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r13 == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        LessonEditViewModel$onTranslationChanged$1 lessonEditViewModel$onTranslationChanged$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25911a;
        xfa xfaVar = xfa.f68157a;
        C2077c c2077c = this.f25912b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f25911a = 1;
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
            lessonEditViewModel$onTranslationChanged$1 = this;
        }
        c2077c.f25955y.add(new Integer(lessonEditViewModel$onTranslationChanged$1.f25913c));
        return xfaVar;
        m23 m23Var = c2077c.f25936f;
        c2077c.f25940j.mo4589b2();
        int i2 = c2077c.f25942l;
        this.f25911a = 2;
        lessonEditViewModel$onTranslationChanged$1 = this;
        Object objM7291n0 = ((C1295k) m23Var.f50448a).m7291n0(i2, this.f25913c, this.f25914d, this.f25915e, false, lessonEditViewModel$onTranslationChanged$1);
        if (objM7291n0 != coroutineSingletons) {
            objM7291n0 = xfaVar;
        }
    }
}
