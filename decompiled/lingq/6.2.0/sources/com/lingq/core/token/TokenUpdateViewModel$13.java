package com.lingq.core.token;

import com.lingq.core.token.domain.C1906c;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.f5a;
import p000.lda;
import p000.m83;
import p000.u91;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$13", m4291f = "TokenUpdateViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenUpdateViewModel$13 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f23492a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1909e f23493b;

    /* JADX INFO: renamed from: com.lingq.core.token.TokenUpdateViewModel$13$1 */
    @c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$13$1", m4291f = "TokenUpdateViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C18941 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f23494a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1909e f23495b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18941(C1909e c1909e, Continuation continuation) {
            super(2, continuation);
            this.f23495b = c1909e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C18941 c18941 = new C18941(this.f23495b, continuation);
            c18941.f23494a = obj;
            return c18941;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C18941 c18941 = (C18941) create((String) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c18941.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            String str = (String) this.f23494a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = this.f23495b.f23885W;
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, f5a.m11558a((f5a) value, null, null, false, null, null, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, str, null, false, 0, false, false, false, false, false, false, false, false, false, null, false, null, null, null, false, false, null, null, false, null, null, null, -33554433, 2097151)));
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenUpdateViewModel$13(C1909e c1909e, Continuation continuation) {
        super(2, continuation);
        this.f23493b = c1909e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TokenUpdateViewModel$13 tokenUpdateViewModel$13 = new TokenUpdateViewModel$13(this.f23493b, continuation);
        tokenUpdateViewModel$13.f23492a = obj;
        return tokenUpdateViewModel$13;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        TokenUpdateViewModel$13 tokenUpdateViewModel$13 = (TokenUpdateViewModel$13) create((Pair) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        tokenUpdateViewModel$13.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Pair pair = (Pair) this.f23492a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        String str = (String) pair.f47623a;
        List list = (List) pair.f47624b;
        C1909e c1909e = this.f23493b;
        C1906c c1906c = c1909e.f23867E;
        String str2 = (String) u91.m22591I0(list);
        if (str2 == null) {
            str2 = "en";
        }
        AbstractC3224d.m15545x(new m83(c1906c.m8724d(str, str2, list), new C18941(c1909e, null), 2), lda.m16103C(c1909e));
        return xfa.f68157a;
    }
}
