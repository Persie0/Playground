package com.lingq.feature.reader.old;

import com.lingq.core.common.util.AbstractC1263a;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.lda;
import p000.p08;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$18", m4291f = "ReaderViewModel.kt", m4292l = {991}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$18 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28835a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f28836b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderViewModel$18$3 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$18$3", m4291f = "ReaderViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23813 extends SuspendLambda implements aj3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Map f28837a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Map f28838b;

        @Override // p000.aj3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            C23813 c23813 = new C23813(3, (Continuation) obj3);
            c23813.f28837a = (Map) obj;
            c23813.f28838b = (Map) obj2;
            return c23813.invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Map map = this.f28837a;
            Map map2 = this.f28838b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            return new Pair(map, map2);
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderViewModel$18$4 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$18$4", m4291f = "ReaderViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23824 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28839a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2412n f28840b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23824(C2412n c2412n, Continuation continuation) {
            super(2, continuation);
            this.f28840b = c2412n;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23824 c23824 = new C23824(this.f28840b, continuation);
            c23824.f28839a = obj;
            return c23824;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23824 c23824 = (C23824) create((Pair) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23824.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Pair pair = (Pair) this.f28839a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C2412n c2412n = this.f28840b;
            AbstractC1263a.m7046a(c2412n.f29315S1);
            c2412n.f29315S1 = wfb.m23926u(lda.m16103C(c2412n), c2412n.f29301O, null, new ReaderViewModel$updateLessonStats$1(c2412n, null), 2);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$18(C2412n c2412n, Continuation continuation) {
        super(2, continuation);
        this.f28836b = c2412n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$18(this.f28836b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$18) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28835a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2412n c2412n = this.f28836b;
            C3228h c3228h = new C3228h(new p08(c2412n.f29287J0, 3), new p08(c2412n.f29290K0, 4), new C23813(3, null));
            C23824 c23824 = new C23824(c2412n, null);
            this.f28835a = 1;
            if (AbstractC3224d.m15529h(c3228h, c23824, this) == coroutineSingletons) {
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
