package com.lingq.feature.imports;

import com.lingq.core.common.util.AbstractC1263a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.lda;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.imports.UserImportSelectionViewModel$3", m4291f = "UserImportSelectionViewModel.kt", m4292l = {109}, m4293m = "invokeSuspend", m4294v = 2)
final class UserImportSelectionViewModel$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26047a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2108e f26048b;

    /* JADX INFO: renamed from: com.lingq.feature.imports.UserImportSelectionViewModel$3$1 */
    @c32(m4290c = "com.lingq.feature.imports.UserImportSelectionViewModel$3$1", m4291f = "UserImportSelectionViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C20941 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f26049a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2108e f26050b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20941(C2108e c2108e, Continuation continuation) {
            super(2, continuation);
            this.f26050b = c2108e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C20941 c20941 = new C20941(this.f26050b, continuation);
            c20941.f26049a = obj;
            return c20941;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C20941 c20941 = (C20941) create((String) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c20941.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str = (String) this.f26049a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C2108e c2108e = this.f26050b;
            AbstractC1263a.m7047b(lda.m16103C(c2108e), c2108e.f26159g, "tag_search", new UserImportSelectionViewModel$fetchTags$1(c2108e, str, null));
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserImportSelectionViewModel$3(C2108e c2108e, Continuation continuation) {
        super(2, continuation);
        this.f26048b = c2108e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserImportSelectionViewModel$3(this.f26048b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((UserImportSelectionViewModel$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26047a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2108e c2108e = this.f26048b;
            c83 c83VarM15535n = AbstractC3224d.m15535n(c2108e.f26164l, 600L);
            C20941 c20941 = new C20941(c2108e, null);
            this.f26047a = 1;
            if (AbstractC3224d.m15529h(c83VarM15535n, c20941, this) == coroutineSingletons) {
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
