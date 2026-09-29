package com.lingq.feature.reader.reader;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.bj3;
import p000.c32;
import p000.l70;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$maxAllowedPage$2", m4291f = "ReaderComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderComposeViewModel$maxAllowedPage$2 extends SuspendLambda implements bj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f29964a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ int f29965b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ int f29966c;

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int iIntValue = ((Number) obj2).intValue();
        int iIntValue2 = ((Number) obj3).intValue();
        ReaderComposeViewModel$maxAllowedPage$2 readerComposeViewModel$maxAllowedPage$2 = new ReaderComposeViewModel$maxAllowedPage$2(4, (Continuation) obj4);
        readerComposeViewModel$maxAllowedPage$2.f29964a = zBooleanValue;
        readerComposeViewModel$maxAllowedPage$2.f29965b = iIntValue;
        readerComposeViewModel$maxAllowedPage$2.f29966c = iIntValue2;
        return readerComposeViewModel$maxAllowedPage$2.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int iM15945h;
        boolean z = this.f29964a;
        int i = this.f29965b;
        int i2 = this.f29966c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (!z || i2 <= 0 || i < 0) {
            int i3 = i2 - 1;
            iM15945h = i3 >= 0 ? i3 : 0;
        } else {
            iM15945h = l70.m15945h(i + 1, 0, i2 - 1);
        }
        return new Integer(iM15945h);
    }
}
