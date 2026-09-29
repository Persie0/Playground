package com.lingq.feature.reader.old;

import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.theme.TextHighlightStyle;
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
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$10", m4291f = "ReaderViewModel.kt", m4292l = {918}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$10 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28791a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f28792b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderViewModel$10$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$10$1", m4291f = "ReaderViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23711 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28793a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2412n f28794b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23711(C2412n c2412n, Continuation continuation) {
            super(2, continuation);
            this.f28794b = c2412n;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23711 c23711 = new C23711(this.f28794b, continuation);
            c23711.f28793a = obj;
            return c23711;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23711 c23711 = (C23711) create((TextHighlightStyle) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23711.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            TextHighlightStyle textHighlightStyle = (TextHighlightStyle) this.f28793a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            this.f28794b.f29282H1.m15571i(textHighlightStyle);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$10(C2412n c2412n, Continuation continuation) {
        super(2, continuation);
        this.f28792b = c2412n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$10(this.f28792b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$10) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28791a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2412n c2412n = this.f28792b;
            c83 c83VarM15536o = AbstractC3224d.m15536o(((C1368a) c2412n.f29271E).f18326B0);
            C23711 c23711 = new C23711(c2412n, null);
            this.f28791a = 1;
            if (AbstractC3224d.m15529h(c83VarM15536o, c23711, this) == coroutineSingletons) {
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
