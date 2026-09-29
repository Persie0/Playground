package com.lingq.feature.reader.old;

import com.lingq.core.datastore.C1368a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.nz9;
import p000.r08;
import p000.si7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$20", m4291f = "ReaderViewModel.kt", m4292l = {1088}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$20 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28855a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f28856b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderViewModel$20$2 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$20$2", m4291f = "ReaderViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23852 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28857a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2412n f28858b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23852(C2412n c2412n, Continuation continuation) {
            super(2, continuation);
            this.f28858b = c2412n;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23852 c23852 = new C23852(this.f28858b, continuation);
            c23852.f28857a = obj;
            return c23852;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23852 c23852 = (C23852) create((nz9) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23852.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            nz9 nz9Var = (nz9) this.f28857a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = this.f28858b.f29379k2;
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, nz9Var));
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$20(C2412n c2412n, Continuation continuation) {
        super(2, continuation);
        this.f28856b = c2412n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$20(this.f28856b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$20) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2412n c2412n = this.f28856b;
        si7 si7Var = c2412n.f29271E;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28855a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1368a c1368a = (C1368a) si7Var;
            r08 r08Var = new r08(new c83[]{c1368a.f18466z0, c1368a.f18335E0, c1368a.f18329C0, c1368a.f18326B0, c1368a.f18463y0, c2412n.f29298N.m8209a(), c2412n.f29387m2, c2412n.f29361g0, c2412n.f29365h0, c2412n.f29369i0, c2412n.f29373j0, c2412n.f29377k0, AbstractC3224d.m15536o(((C1368a) si7Var).f18324A1), AbstractC3224d.m15536o(((C1368a) si7Var).f18327B1)}, c2412n, 0);
            C23852 c23852 = new C23852(c2412n, null);
            this.f28855a = 1;
            if (AbstractC3224d.m15529h(r08Var, c23852, this) == coroutineSingletons) {
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
