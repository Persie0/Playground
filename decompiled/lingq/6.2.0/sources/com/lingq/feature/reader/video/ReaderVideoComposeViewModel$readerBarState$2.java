package com.lingq.feature.reader.video;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.bu7;
import p000.c32;
import p000.cu7;
import p000.dj3;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.ReaderVideoComposeViewModel$readerBarState$2", m4291f = "ReaderVideoComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderVideoComposeViewModel$readerBarState$2 extends SuspendLambda implements dj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f31261a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Integer f31262b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Integer f31263c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ int f31264d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ boolean f31265e;

    public ReaderVideoComposeViewModel$readerBarState$2(Continuation continuation) {
        super(6, continuation);
    }

    @Override // p000.dj3
    /* JADX INFO: renamed from: h */
    public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int iIntValue = ((Number) obj4).intValue();
        boolean zBooleanValue = ((Boolean) obj5).booleanValue();
        ReaderVideoComposeViewModel$readerBarState$2 readerVideoComposeViewModel$readerBarState$2 = new ReaderVideoComposeViewModel$readerBarState$2((Continuation) obj6);
        readerVideoComposeViewModel$readerBarState$2.f31261a = (List) obj;
        readerVideoComposeViewModel$readerBarState$2.f31262b = (Integer) obj2;
        readerVideoComposeViewModel$readerBarState$2.f31263c = (Integer) obj3;
        readerVideoComposeViewModel$readerBarState$2.f31264d = iIntValue;
        readerVideoComposeViewModel$readerBarState$2.f31265e = zBooleanValue;
        return readerVideoComposeViewModel$readerBarState$2.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int iIntValue;
        List list = this.f31261a;
        Integer num = this.f31262b;
        Integer num2 = this.f31263c;
        int i = this.f31264d;
        boolean z = this.f31265e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (list.isEmpty() || z) {
            return bu7.f9026a;
        }
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = num != null ? num.intValue() : 0;
        }
        int size = list.size();
        int i2 = iIntValue + 1;
        int size2 = list.size();
        if (i > size2) {
            i = size2;
        }
        return new cu7(size, i2, i);
    }
}
