package com.lingq.feature.imports;

import com.lingq.feature.imports.data.UserImportSourceType;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3352my;
import p000.C3386nv;
import p000.c18;
import p000.c32;
import p000.n02;
import p000.un1;
import p000.vk9;
import p000.wla;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.imports.UserImportTypeFragment$onViewCreated$1$1", m4291f = "UserImportTypeFragment.kt", m4292l = {81}, m4293m = "invokeSuspend", m4294v = 2)
final class UserImportTypeFragment$onViewCreated$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26082a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ UserImportTypeFragment f26083b;

    /* JADX INFO: renamed from: com.lingq.feature.imports.UserImportTypeFragment$onViewCreated$1$1$1 */
    @c32(m4290c = "com.lingq.feature.imports.UserImportTypeFragment$onViewCreated$1$1$1", m4291f = "UserImportTypeFragment.kt", m4292l = {53}, m4293m = "invokeSuspend", m4294v = 2)
    final class C20981 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f26084a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f26085b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ UserImportTypeFragment f26086c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20981(UserImportTypeFragment userImportTypeFragment, Continuation continuation) {
            super(2, continuation);
            this.f26086c = userImportTypeFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C20981 c20981 = new C20981(this.f26086c, continuation);
            c20981.f26085b = obj;
            return c20981;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C20981) create((n02) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            n02 n02Var = (n02) this.f26085b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f26084a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                if (n02Var != null) {
                    this.f26085b = n02Var;
                    this.f26084a = 1;
                    if (AbstractC3208a.m15437d(500L, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return xfa.f68157a;
            }
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            String str = n02Var.f52106a;
            String str2 = n02Var.f52108c;
            String str3 = n02Var.f52107b;
            if (!vk9.m23391n0(str) || !vk9.m23391n0(str3) || !vk9.m23391n0(str2)) {
                boolean zM17089H = AbstractC3352my.m17089H(str3);
                UserImportTypeFragment userImportTypeFragment = this.f26086c;
                if (zM17089H) {
                    userImportTypeFragment.m9000c0(n02Var, UserImportSourceType.URL);
                } else if (vk9.m23391n0(str2)) {
                    userImportTypeFragment.m9000c0(n02Var, UserImportSourceType.Text);
                } else {
                    userImportTypeFragment.m9000c0(n02Var, UserImportSourceType.File);
                }
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserImportTypeFragment$onViewCreated$1$1(UserImportTypeFragment userImportTypeFragment, Continuation continuation) {
        super(2, continuation);
        this.f26083b = userImportTypeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserImportTypeFragment$onViewCreated$1$1(this.f26083b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((UserImportTypeFragment$onViewCreated$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26082a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            UserImportTypeFragment userImportTypeFragment = this.f26083b;
            c18 c18Var = ((wla) userImportTypeFragment.f26071B0.getValue()).f67024e;
            C20981 c20981 = new C20981(userImportTypeFragment, null);
            c18Var.getClass();
            this.f26082a = 1;
            if (AbstractC3224d.m15529h(c18Var, c20981, this) == coroutineSingletons) {
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
