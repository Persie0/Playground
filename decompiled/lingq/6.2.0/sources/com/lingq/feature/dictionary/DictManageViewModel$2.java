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
@c32(m4290c = "com.lingq.feature.dictionary.DictManageViewModel$2", m4291f = "DictManageViewModel.kt", m4292l = {253}, m4293m = "invokeSuspend", m4294v = 2)
final class DictManageViewModel$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25673a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2057b f25674b;

    /* JADX INFO: renamed from: com.lingq.feature.dictionary.DictManageViewModel$2$1 */
    @c32(m4290c = "com.lingq.feature.dictionary.DictManageViewModel$2$1", m4291f = "DictManageViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C20451 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2057b f25675a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20451(C2057b c2057b, Continuation continuation) {
            super(2, continuation);
            this.f25675a = c2057b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C20451(this.f25675a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C20451 c20451 = (C20451) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c20451.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C2057b c2057b = this.f25675a;
            C3244l c3244l = c2057b.f25801k;
            ArrayList arrayListM8964V2 = C2057b.m8964V2(c2057b);
            c3244l.getClass();
            c3244l.m15572j(null, arrayListM8964V2);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictManageViewModel$2(C2057b c2057b, Continuation continuation) {
        super(2, continuation);
        this.f25674b = c2057b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DictManageViewModel$2(this.f25674b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((DictManageViewModel$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25673a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2057b c2057b = this.f25674b;
            C3244l c3244l = c2057b.f25799i;
            C20451 c20451 = new C20451(c2057b, null);
            c3244l.getClass();
            this.f25673a = 1;
            if (AbstractC3224d.m15529h(c3244l, c20451, this) == coroutineSingletons) {
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
