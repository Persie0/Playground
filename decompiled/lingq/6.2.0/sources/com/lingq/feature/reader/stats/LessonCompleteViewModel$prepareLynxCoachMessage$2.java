package com.lingq.feature.reader.stats;

import com.lingq.core.data.repository.C1289e;
import kotlin.AbstractC3193b;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.a23;
import p000.c32;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.z13;
import p000.zi3;
import p000.zx4;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteViewModel$prepareLynxCoachMessage$2", m4291f = "LessonCompleteViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteViewModel$prepareLynxCoachMessage$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f30624a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f30625b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2535j f30626c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zx4 f30627d;

    /* JADX INFO: renamed from: com.lingq.feature.reader.stats.LessonCompleteViewModel$prepareLynxCoachMessage$2$1 */
    @c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteViewModel$prepareLynxCoachMessage$2$1", m4291f = "LessonCompleteViewModel.kt", m4292l = {598}, m4293m = "invokeSuspend", m4294v = 2)
    final class C25231 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f30628a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f30629b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C2535j f30630c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ zx4 f30631d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25231(C2535j c2535j, zx4 zx4Var, Continuation continuation) {
            super(2, continuation);
            this.f30630c = c2535j;
            this.f30631d = zx4Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C25231 c25231 = new C25231(this.f30630c, this.f30631d, continuation);
            c25231.f30629b = obj;
            return c25231;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C25231) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f30628a;
            xfa xfaVar = xfa.f68157a;
            try {
                if (i == 0) {
                    AbstractC3193b.m15359b(obj);
                    C2535j c2535j = this.f30630c;
                    zx4 zx4Var = this.f30631d;
                    a23 a23Var = c2535j.f30798H;
                    String strMo4589b2 = c2535j.f30818b.mo4589b2();
                    int i2 = zx4Var.f72337a;
                    this.f30629b = null;
                    this.f30628a = 1;
                    Object objM7159i = ((C1289e) a23Var.f90a).m7159i(i2, strMo4589b2, this);
                    if (objM7159i != coroutineSingletons) {
                        objM7159i = xfaVar;
                    }
                    if (objM7159i == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj);
                }
            } catch (Throwable th) {
                new Result.Failure(th);
            }
            return xfaVar;
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.reader.stats.LessonCompleteViewModel$prepareLynxCoachMessage$2$2 */
    @c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteViewModel$prepareLynxCoachMessage$2$2", m4291f = "LessonCompleteViewModel.kt", m4292l = {604}, m4293m = "invokeSuspend", m4294v = 2)
    final class C25242 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f30632a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f30633b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C2535j f30634c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ zx4 f30635d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25242(C2535j c2535j, zx4 zx4Var, Continuation continuation) {
            super(2, continuation);
            this.f30634c = c2535j;
            this.f30635d = zx4Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C25242 c25242 = new C25242(this.f30634c, this.f30635d, continuation);
            c25242.f30633b = obj;
            return c25242;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C25242) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C2535j c2535j = this.f30634c;
            C3244l c3244l = c2535j.f30814X;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f30632a;
            xfa xfaVar = xfa.f68157a;
            try {
                if (i == 0) {
                    AbstractC3193b.m15359b(obj);
                    zx4 zx4Var = this.f30635d;
                    z13 z13Var = c2535j.f30796F;
                    String strMo4589b2 = c2535j.f30818b.mo4589b2();
                    int i2 = zx4Var.f72337a;
                    int i3 = zx4Var.f72338b;
                    this.f30633b = null;
                    this.f30632a = 1;
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
            } catch (Throwable th) {
                new Result.Failure(th);
            } finally {
                Boolean bool = Boolean.FALSE;
                c3244l.getClass();
                c3244l.m15572j(null, bool);
            }
            return xfaVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteViewModel$prepareLynxCoachMessage$2(boolean z, C2535j c2535j, zx4 zx4Var, Continuation continuation) {
        super(2, continuation);
        this.f30625b = z;
        this.f30626c = c2535j;
        this.f30627d = zx4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LessonCompleteViewModel$prepareLynxCoachMessage$2 lessonCompleteViewModel$prepareLynxCoachMessage$2 = new LessonCompleteViewModel$prepareLynxCoachMessage$2(this.f30625b, this.f30626c, this.f30627d, continuation);
        lessonCompleteViewModel$prepareLynxCoachMessage$2.f30624a = obj;
        return lessonCompleteViewModel$prepareLynxCoachMessage$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        LessonCompleteViewModel$prepareLynxCoachMessage$2 lessonCompleteViewModel$prepareLynxCoachMessage$2 = (LessonCompleteViewModel$prepareLynxCoachMessage$2) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        lessonCompleteViewModel$prepareLynxCoachMessage$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        un1 un1Var = (un1) this.f30624a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C2535j c2535j = this.f30626c;
        zx4 zx4Var = this.f30627d;
        wfb.m23926u(un1Var, null, null, new C25231(c2535j, zx4Var, null), 3);
        if (this.f30625b) {
            wfb.m23926u(un1Var, null, null, new C25242(c2535j, zx4Var, null), 3);
        }
        return xfa.f68157a;
    }
}
