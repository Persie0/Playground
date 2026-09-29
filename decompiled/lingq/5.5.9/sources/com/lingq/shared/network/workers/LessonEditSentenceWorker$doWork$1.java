package com.lingq.shared.network.workers;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.network.workers.LessonEditSentenceWorker", m19206f = "LessonEditSentenceWorker.kt", m19207l = {34}, m19208m = "doWork")
public final class LessonEditSentenceWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f19275d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ LessonEditSentenceWorker f19276e;

    /* JADX INFO: renamed from: f */
    public int f19277f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonEditSentenceWorker$doWork$1(LessonEditSentenceWorker lessonEditSentenceWorker, InterfaceC9968c<? super LessonEditSentenceWorker$doWork$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19276e = lessonEditSentenceWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19275d = obj;
        this.f19277f |= Integer.MIN_VALUE;
        return this.f19276e.mo4698g(this);
    }
}
