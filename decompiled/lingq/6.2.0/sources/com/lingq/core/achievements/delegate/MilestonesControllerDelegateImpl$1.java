package com.lingq.core.achievements.delegate;

import com.lingq.core.domain.model.language.Language;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.eh9;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.achievements.delegate.MilestonesControllerDelegateImpl$1", m4291f = "MilestonesControllerDelegate.kt", m4292l = {55}, m4293m = "invokeSuspend", m4294v = 2)
final class MilestonesControllerDelegateImpl$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f14240a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1238a f14241b;

    /* JADX INFO: renamed from: com.lingq.core.achievements.delegate.MilestonesControllerDelegateImpl$1$1 */
    @c32(m4290c = "com.lingq.core.achievements.delegate.MilestonesControllerDelegateImpl$1$1", m4291f = "MilestonesControllerDelegate.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C12371 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1238a f14242a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12371(C1238a c1238a, Continuation continuation) {
            super(2, continuation);
            this.f14242a = c1238a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C12371(this.f14242a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C12371 c12371 = (C12371) create((Language) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c12371.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C1238a c1238a = this.f14242a;
            c1238a.f14266c.clear();
            c1238a.f14267d.clear();
            c1238a.f14268e.m15571i(null);
            C3244l c3244l = c1238a.f14271h;
            c3244l.getClass();
            c3244l.m15572j(null, EmptyList.f47638a);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MilestonesControllerDelegateImpl$1(C1238a c1238a, Continuation continuation) {
        super(2, continuation);
        this.f14241b = c1238a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MilestonesControllerDelegateImpl$1(this.f14241b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((MilestonesControllerDelegateImpl$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f14240a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1238a c1238a = this.f14241b;
            eh9 eh9VarMo4572B0 = c1238a.f14264a.mo4572B0();
            C12371 c12371 = new C12371(c1238a, null);
            this.f14240a = 1;
            if (AbstractC3224d.m15529h(eh9VarMo4572B0, c12371, this) == coroutineSingletons) {
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
