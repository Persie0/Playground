package com.lingq.shared.network.workers;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.network.workers.LessonCompleteWorker", m19206f = "LessonCompleteWorker.kt", m19207l = {33}, m19208m = "doWork")
public final class LessonCompleteWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f19263d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ LessonCompleteWorker f19264e;

    /* JADX INFO: renamed from: f */
    public int f19265f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteWorker$doWork$1(LessonCompleteWorker lessonCompleteWorker, InterfaceC9968c<? super LessonCompleteWorker$doWork$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19264e = lessonCompleteWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19263d = obj;
        this.f19265f |= Integer.MIN_VALUE;
        return this.f19264e.mo4698g(this);
    }
}
