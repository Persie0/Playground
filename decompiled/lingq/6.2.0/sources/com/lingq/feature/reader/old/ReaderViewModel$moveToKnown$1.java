package com.lingq.feature.reader.old;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.e83;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$moveToKnown$1", m4291f = "ReaderViewModel.kt", m4292l = {262}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$moveToKnown$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f28993a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f28994b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f28995c;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        ReaderViewModel$moveToKnown$1 readerViewModel$moveToKnown$1 = new ReaderViewModel$moveToKnown$1(3, (Continuation) obj3);
        readerViewModel$moveToKnown$1.f28994b = (e83) obj;
        readerViewModel$moveToKnown$1.f28995c = zBooleanValue;
        return readerViewModel$moveToKnown$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f28994b;
        boolean z = this.f28995c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28993a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            Boolean boolValueOf = Boolean.valueOf(z);
            this.f28994b = null;
            this.f28995c = z;
            this.f28993a = 1;
            if (e83Var.emit(boolValueOf, this) == coroutineSingletons) {
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
