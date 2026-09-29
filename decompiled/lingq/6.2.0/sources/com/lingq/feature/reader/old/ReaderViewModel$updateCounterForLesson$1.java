package com.lingq.feature.reader.old;

import com.lingq.core.data.repository.C1296l;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.y95;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$updateCounterForLesson$1", m4291f = "ReaderViewModel.kt", m4292l = {2467}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$updateCounterForLesson$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29144a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f29145b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f29146c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$updateCounterForLesson$1(C2412n c2412n, List list, Continuation continuation) {
        super(2, continuation);
        this.f29145b = c2412n;
        this.f29146c = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$updateCounterForLesson$1(this.f29145b, this.f29146c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$updateCounterForLesson$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29144a;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C2412n c2412n = this.f29145b;
                y95 y95Var = c2412n.f29412v;
                String strMo4589b2 = c2412n.f29340b.mo4589b2();
                List list = this.f29146c;
                this.f29144a = 1;
                if (((C1296l) y95Var).m7311f(strMo4589b2, list, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
        } catch (Exception unused) {
        }
        return xfa.f68157a;
    }
}
