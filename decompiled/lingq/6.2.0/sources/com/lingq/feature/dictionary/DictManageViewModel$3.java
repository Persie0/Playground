package com.lingq.feature.dictionary;

import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.dictionary.DictManageViewModel$3", m4291f = "DictManageViewModel.kt", m4292l = {253}, m4293m = "invokeSuspend", m4294v = 2)
final class DictManageViewModel$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25676a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2057b f25677b;

    /* JADX INFO: renamed from: com.lingq.feature.dictionary.DictManageViewModel$3$1 */
    @c32(m4290c = "com.lingq.feature.dictionary.DictManageViewModel$3$1", m4291f = "DictManageViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C20461 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2057b f25678a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20461(C2057b c2057b, Continuation continuation) {
            super(2, continuation);
            this.f25678a = c2057b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C20461(this.f25678a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C20461 c20461 = (C20461) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c20461.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C2057b c2057b = this.f25678a;
            C3244l c3244l = c2057b.f25801k;
            ArrayList arrayListM8964V2 = C2057b.m8964V2(c2057b);
            c3244l.getClass();
            c3244l.m15572j(null, arrayListM8964V2);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictManageViewModel$3(C2057b c2057b, Continuation continuation) {
        super(2, continuation);
        this.f25677b = c2057b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DictManageViewModel$3(this.f25677b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((DictManageViewModel$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25676a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2057b c2057b = this.f25677b;
            C3244l c3244l = c2057b.f25797g;
            C20461 c20461 = new C20461(c2057b, null);
            c3244l.getClass();
            this.f25676a = 1;
            if (AbstractC3224d.m15529h(c3244l, c20461, this) == coroutineSingletons) {
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
