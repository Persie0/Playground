package com.lingq.feature.reader.video;

import android.app.Activity;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.ReaderVideoScreenKt$ReaderVideoRoute$5$1", m4291f = "ReaderVideoScreen.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderVideoScreenKt$ReaderVideoRoute$5$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Activity f31333a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f31334b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f31335c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderVideoScreenKt$ReaderVideoRoute$5$1(Activity activity, boolean z, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.f31333a = activity;
        this.f31334b = z;
        this.f31335c = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderVideoScreenKt$ReaderVideoRoute$5$1(this.f31333a, this.f31334b, this.f31335c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReaderVideoScreenKt$ReaderVideoRoute$5$1 readerVideoScreenKt$ReaderVideoRoute$5$1 = (ReaderVideoScreenKt$ReaderVideoRoute$5$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        readerVideoScreenKt$ReaderVideoRoute$5$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        Activity activity = this.f31333a;
        if (activity != null) {
            if (this.f31334b) {
                i = 0;
            } else {
                i = this.f31335c ? 1 : -1;
            }
            activity.setRequestedOrientation(i);
        }
        return xfa.f68157a;
    }
}
