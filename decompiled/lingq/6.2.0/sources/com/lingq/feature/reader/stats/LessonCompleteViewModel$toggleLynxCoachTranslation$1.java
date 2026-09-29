package com.lingq.feature.reader.stats;

import com.lingq.core.data.repository.C1289e;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.mn5;
import p000.un1;
import p000.xfa;
import p000.z13;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteViewModel$toggleLynxCoachTranslation$1", m4291f = "LessonCompleteViewModel.kt", m4292l = {637}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteViewModel$toggleLynxCoachTranslation$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f30708a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2535j f30709b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ mn5 f30710c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteViewModel$toggleLynxCoachTranslation$1(C2535j c2535j, mn5 mn5Var, Continuation continuation) {
        super(2, continuation);
        this.f30709b = c2535j;
        this.f30710c = mn5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonCompleteViewModel$toggleLynxCoachTranslation$1(this.f30709b, this.f30710c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonCompleteViewModel$toggleLynxCoachTranslation$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2535j c2535j = this.f30709b;
        C3244l c3244l = c2535j.f30814X;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30708a;
        xfa xfaVar = xfa.f68157a;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                Boolean bool = Boolean.TRUE;
                c3244l.getClass();
                c3244l.m15572j(null, bool);
                z13 z13Var = c2535j.f30796F;
                String strMo4589b2 = c2535j.f30818b.mo4589b2();
                mn5 mn5Var = this.f30710c;
                int i2 = mn5Var.f51567i;
                int i3 = mn5Var.f51568j;
                this.f30708a = 1;
                Object objM7163m = ((C1289e) z13Var.f70745a).m7163m(i2, i3, strMo4589b2, this);
                if (objM7163m != coroutineSingletons) {
                    objM7163m = xfaVar;
                }
                if (objM7163m == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            Boolean bool2 = Boolean.FALSE;
            c3244l.getClass();
            c3244l.m15572j(null, bool2);
            return xfaVar;
        } catch (Throwable th) {
            Boolean bool3 = Boolean.FALSE;
            c3244l.getClass();
            c3244l.m15572j(null, bool3);
            throw th;
        }
    }
}
