package com.lingq.feature.reader.old;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.c32;
import p000.d65;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$updateLessonStats$1", m4291f = "ReaderViewModel.kt", m4292l = {1121, 1123}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$updateLessonStats$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29156a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f29157b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$updateLessonStats$1(C2412n c2412n, Continuation continuation) {
        super(2, continuation);
        this.f29157b = c2412n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$updateLessonStats$1(this.f29157b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$updateLessonStats$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (((com.lingq.core.data.repository.C1295k) r3).m7300t(r1, r6, r5) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29156a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f29156a = 1;
            if (AbstractC3208a.m15437d(1000L, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
        C2412n c2412n = this.f29157b;
        int iIntValue = ((Number) c2412n.f29310R.getValue()).intValue();
        d65 d65Var = c2412n.f29394p;
        String strMo4589b2 = c2412n.f29340b.mo4589b2();
        this.f29156a = 2;
    }
}
