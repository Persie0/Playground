package com.lingq.feature.reader.old;

import com.lingq.core.datastore.C1371d;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$2", m4291f = "ReaderViewModel.kt", m4292l = {778}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28851a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f28852b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderViewModel$2$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$2$1", m4291f = "ReaderViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23841 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28853a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2412n f28854b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23841(C2412n c2412n, Continuation continuation) {
            super(2, continuation);
            this.f28854b = c2412n;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23841 c23841 = new C23841(this.f28854b, continuation);
            c23841.f28853a = obj;
            return c23841;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23841 c23841 = (C23841) create((Map) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23841.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Map map = (Map) this.f28853a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C2412n c2412n = this.f28854b;
            c2412n.f29266C0.m15571i(map.get(new Integer(c2412n.m9332l3())));
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$2(C2412n c2412n, Continuation continuation) {
        super(2, continuation);
        this.f28852b = c2412n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$2(this.f28852b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28851a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2412n c2412n = this.f28852b;
            c83 c83VarM15536o = AbstractC3224d.m15536o(((C1371d) c2412n.f29277G).f18583t);
            C23841 c23841 = new C23841(c2412n, null);
            this.f28851a = 1;
            if (AbstractC3224d.m15529h(c83VarM15536o, c23841, this) == coroutineSingletons) {
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
