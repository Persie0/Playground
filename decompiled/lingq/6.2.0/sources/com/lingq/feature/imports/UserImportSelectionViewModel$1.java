package com.lingq.feature.imports;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.eh9;
import p000.ika;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.imports.UserImportSelectionViewModel$1", m4291f = "UserImportSelectionViewModel.kt", m4292l = {290}, m4293m = "invokeSuspend", m4294v = 2)
final class UserImportSelectionViewModel$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26041a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2108e f26042b;

    /* JADX INFO: renamed from: com.lingq.feature.imports.UserImportSelectionViewModel$1$1 */
    @c32(m4290c = "com.lingq.feature.imports.UserImportSelectionViewModel$1$1", m4291f = "UserImportSelectionViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C20921 extends SuspendLambda implements zi3 {
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C20921(2, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C20921 c20921 = (C20921) create((ika) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c20921.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserImportSelectionViewModel$1(C2108e c2108e, Continuation continuation) {
        super(2, continuation);
        this.f26042b = c2108e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserImportSelectionViewModel$1(this.f26042b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((UserImportSelectionViewModel$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26041a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            eh9 eh9VarMo9014u2 = this.f26042b.f26154b.mo9014u2();
            C20921 c20921 = new C20921(2, null);
            eh9VarMo9014u2.getClass();
            this.f26041a = 1;
            if (AbstractC3224d.m15529h(eh9VarMo9014u2, c20921, this) == coroutineSingletons) {
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
