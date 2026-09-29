package com.lingq.feature.imports;

import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;
import com.lingq.core.domain.model.lesson.Lesson;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.b34;
import p000.c32;
import p000.du0;
import p000.fa4;
import p000.ja6;
import p000.un1;
import p000.w41;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.imports.UserImportFragment$onViewCreated$4$2", m4291f = "UserImportFragment.kt", m4292l = {213}, m4293m = "invokeSuspend", m4294v = 2)
final class UserImportFragment$onViewCreated$4$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26016a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ UserImportFragment f26017b;

    /* JADX INFO: renamed from: com.lingq.feature.imports.UserImportFragment$onViewCreated$4$2$1 */
    @c32(m4290c = "com.lingq.feature.imports.UserImportFragment$onViewCreated$4$2$1", m4291f = "UserImportFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C20861 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f26018a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ UserImportFragment f26019b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20861(UserImportFragment userImportFragment, Continuation continuation) {
            super(2, continuation);
            this.f26019b = userImportFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C20861 c20861 = new C20861(this.f26019b, continuation);
            c20861.f26018a = obj;
            return c20861;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C20861 c20861 = (C20861) create((Lesson) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c20861.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Lesson lesson = (Lesson) this.f26018a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            UserImportFragment userImportFragment = this.f26019b;
            b34.m3244j(userImportFragment).m22690g(R$id.nav_graph_user_import, true);
            w41 w41Var = userImportFragment.f26005G0;
            if (w41Var == null) {
                fa4.m11636J("navGraphController");
                throw null;
            }
            int i = lesson.f19142a;
            int i2 = lesson.f19149h;
            String str = lesson.f19150i;
            if (str == null) {
                str = "";
            }
            w41Var.m23737z(new ja6(i, i2, str, LqAnalyticsValues$LessonPath.Unknown.f14315a));
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserImportFragment$onViewCreated$4$2(UserImportFragment userImportFragment, Continuation continuation) {
        super(2, continuation);
        this.f26017b = userImportFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserImportFragment$onViewCreated$4$2(this.f26017b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((UserImportFragment$onViewCreated$4$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26016a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            UserImportFragment userImportFragment = this.f26017b;
            du0 du0Var = userImportFragment.m8997R0().f26191w;
            C20861 c20861 = new C20861(userImportFragment, null);
            this.f26016a = 1;
            if (AbstractC3224d.m15529h(du0Var, c20861, this) == coroutineSingletons) {
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
