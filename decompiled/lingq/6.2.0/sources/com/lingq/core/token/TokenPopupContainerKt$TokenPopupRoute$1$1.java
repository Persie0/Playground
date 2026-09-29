package com.lingq.core.token;

import androidx.lifecycle.AbstractC0707a;
import androidx.lifecycle.AbstractC0708b;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.c32;
import p000.c83;
import p000.m83;
import p000.n2a;
import p000.ub5;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenPopupContainerKt$TokenPopupRoute$1$1", m4291f = "TokenPopupContainer.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenPopupContainerKt$TokenPopupRoute$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1909e f23427a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ub5 f23428b;

    /* JADX INFO: renamed from: com.lingq.core.token.TokenPopupContainerKt$TokenPopupRoute$1$1$1 */
    @c32(m4290c = "com.lingq.core.token.TokenPopupContainerKt$TokenPopupRoute$1$1$1", m4291f = "TokenPopupContainer.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C18901 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ boolean f23429a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1909e f23430b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18901(C1909e c1909e, Continuation continuation) {
            super(2, continuation);
            this.f23430b = c1909e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C18901 c18901 = new C18901(this.f23430b, continuation);
            c18901.f23429a = ((Boolean) obj).booleanValue();
            return c18901;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            C18901 c18901 = (C18901) create(bool, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c18901.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z = this.f23429a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            if (z) {
                this.f23430b.m8760d3(n2a.f52243a);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenPopupContainerKt$TokenPopupRoute$1$1(C1909e c1909e, ub5 ub5Var, Continuation continuation) {
        super(2, continuation);
        this.f23427a = c1909e;
        this.f23428b = ub5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TokenPopupContainerKt$TokenPopupRoute$1$1(this.f23427a, this.f23428b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        TokenPopupContainerKt$TokenPopupRoute$1$1 tokenPopupContainerKt$TokenPopupRoute$1$1 = (TokenPopupContainerKt$TokenPopupRoute$1$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        tokenPopupContainerKt$TokenPopupRoute$1$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C1909e c1909e = this.f23427a;
        c83 c83VarMo8770p1 = c1909e.f23868F.mo8770p1();
        ub5 ub5Var = this.f23428b;
        AbstractC3224d.m15545x(new m83(AbstractC0707a.m2507a(c83VarMo8770p1, ub5Var.mo256K()), new C18901(c1909e, null), 2), AbstractC0708b.m2508a(ub5Var));
        return xfa.f68157a;
    }
}
