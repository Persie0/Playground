package com.lingq.feature.reader.old;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3131j1;
import p000.C3386nv;
import p000.c32;
import p000.jq7;
import p000.s08;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$lippServiceRunning$1", m4291f = "ReaderViewModel.kt", m4292l = {1299}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$lippServiceRunning$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28982a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f28983b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$lippServiceRunning$1(C2412n c2412n, Continuation continuation) {
        super(2, continuation);
        this.f28983b = c2412n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$lippServiceRunning$1(this.f28983b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$lippServiceRunning$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        C2412n c2412n = this.f28983b;
        C3244l c3244l = c2412n.f29278G0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28982a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            if (((s08) c3244l.getValue()).f60142b != 0.0f || ((s08) c3244l.getValue()).f60141a) {
                int i2 = (int) ((s08) c3244l.getValue()).f60142b;
                AbstractC3131j1 abstractC3131j1 = jq7.f46011b;
                int iMo14353c = abstractC3131j1.mo14353c(i2, abstractC3131j1.mo14353c(5, 10) + i2) + i2;
                if (iMo14353c < 95) {
                    do {
                        value = c3244l.getValue();
                    } while (!c3244l.m15570h(value, new s08(iMo14353c, true)));
                }
            } else {
                do {
                    value2 = c3244l.getValue();
                } while (!c3244l.m15570h(value2, new s08(5.0f, true)));
            }
            long jMo14353c = jq7.f46011b.mo14353c(500, 1500);
            this.f28982a = 1;
            if (AbstractC3208a.m15437d(jMo14353c, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        c2412n.m9336p3(true);
        return xfa.f68157a;
    }
}
