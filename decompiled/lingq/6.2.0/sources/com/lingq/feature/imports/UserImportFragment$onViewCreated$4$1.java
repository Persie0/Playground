package com.lingq.feature.imports;

import com.lingq.core.domain.model.lesson.Lesson;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3393o1;
import p000.C3386nv;
import p000.C3681vd;
import p000.c18;
import p000.c32;
import p000.fr5;
import p000.lda;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.xu3;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.imports.UserImportFragment$onViewCreated$4$1", m4291f = "UserImportFragment.kt", m4292l = {263}, m4293m = "invokeSuspend", m4294v = 2)
final class UserImportFragment$onViewCreated$4$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26012a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ UserImportFragment f26013b;

    /* JADX INFO: renamed from: com.lingq.feature.imports.UserImportFragment$onViewCreated$4$1$1 */
    @c32(m4290c = "com.lingq.feature.imports.UserImportFragment$onViewCreated$4$1$1", m4291f = "UserImportFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C20851 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f26014a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ UserImportFragment f26015b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20851(UserImportFragment userImportFragment, Continuation continuation) {
            super(2, continuation);
            this.f26015b = userImportFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C20851 c20851 = new C20851(this.f26015b, continuation);
            c20851.f26014a = obj;
            return c20851;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C20851 c20851 = (C20851) create((Lesson) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c20851.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Lesson lesson = (Lesson) this.f26014a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            if (lesson != null) {
                UserImportFragment userImportFragment = this.f26015b;
                if (((Boolean) ((C3244l) userImportFragment.m8997R0().f26188t.f9311a).getValue()).booleanValue() && userImportFragment.m2115q()) {
                    C2109f c2109fM8997R0 = userImportFragment.m8997R0();
                    c2109fM8997R0.getClass();
                    wfb.m23926u(lda.m16103C(c2109fM8997R0), null, null, new UserImportViewModel$openLesson$1(c2109fM8997R0, lesson, null), 3);
                } else {
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    fr5 fr5Var = new fr5(userImportFragment.m2090R(), 0);
                    fr5Var.m12027j(userImportFragment.m2111m(com.lingq.core.p012ui.R$string.feed_import));
                    String strM17735j = AbstractC3393o1.m17735j(userImportFragment.m2111m(R$string.imports_import_successful), " ", userImportFragment.m2111m(com.lingq.core.p012ui.R$string.imports_open_lesson));
                    C3681vd c3681vd = fr5Var.f71376a;
                    c3681vd.f65209g = strM17735j;
                    fr5Var.m12025h(com.lingq.core.p012ui.R$string.ui_yes, new DialogInterfaceOnClickListenerC2107d(userImportFragment, ref$ObjectRef, lesson));
                    int i = com.lingq.core.p012ui.R$string.ui_no;
                    xu3 xu3Var = new xu3(userImportFragment, ref$ObjectRef, 1);
                    c3681vd.f65214l = c3681vd.f65203a.getText(i);
                    c3681vd.f65215m = xu3Var;
                    ref$ObjectRef.f47718a = fr5Var.m25557a();
                }
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserImportFragment$onViewCreated$4$1(UserImportFragment userImportFragment, Continuation continuation) {
        super(2, continuation);
        this.f26013b = userImportFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserImportFragment$onViewCreated$4$1(this.f26013b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((UserImportFragment$onViewCreated$4$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26012a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            UserImportFragment userImportFragment = this.f26013b;
            c18 c18Var = userImportFragment.m8997R0().f26183o;
            C20851 c20851 = new C20851(userImportFragment, null);
            c18Var.getClass();
            this.f26012a = 1;
            if (AbstractC3224d.m15529h(c18Var, c20851, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3386nv.m17633t("SharedFlow never completes, this call should never return.");
        return null;
    }
}
