package com.lingq.feature.reader.video.state;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.u91;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.state.VideoLippManager$start$2", m4291f = "VideoLippManager.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class VideoLippManager$start$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f31519a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2596b f31520b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoLippManager$start$2(C2596b c2596b, Continuation continuation) {
        super(2, continuation);
        this.f31520b = c2596b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        VideoLippManager$start$2 videoLippManager$start$2 = new VideoLippManager$start$2(this.f31520b, continuation);
        videoLippManager$start$2.f31519a = obj;
        return videoLippManager$start$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        VideoLippManager$start$2 videoLippManager$start$2 = (VideoLippManager$start$2) create((List) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        videoLippManager$start$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = (List) this.f31519a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C2596b c2596b = this.f31520b;
        LinkedHashSet linkedHashSet = c2596b.f31543c;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            int iIntValue = ((Number) obj2).intValue();
            if (iIntValue > 0 && !linkedHashSet.contains(Integer.valueOf(iIntValue))) {
                arrayList.add(obj2);
            }
        }
        if (!arrayList.isEmpty()) {
            int iIntValue2 = ((Number) u91.m22601S0(arrayList)).intValue();
            int iIntValue3 = (((Number) u91.m22600R0(arrayList)).intValue() - iIntValue2) + 1;
            linkedHashSet.addAll(arrayList);
            wfb.m23926u(c2596b.f31542b, null, null, new VideoLippManager$fetchIfNeeded$1(c2596b, iIntValue2, iIntValue3, null), 3);
        }
        return xfa.f68157a;
    }
}
