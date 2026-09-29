package com.lingq.shared.network.workers;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.network.workers.LessonDeleteFavoriteWorker", m19206f = "LessonDeleteFavoriteWorker.kt", m19207l = {30}, m19208m = "doWork")
public final class LessonDeleteFavoriteWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f19267d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ LessonDeleteFavoriteWorker f19268e;

    /* JADX INFO: renamed from: f */
    public int f19269f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonDeleteFavoriteWorker$doWork$1(LessonDeleteFavoriteWorker lessonDeleteFavoriteWorker, InterfaceC9968c<? super LessonDeleteFavoriteWorker$doWork$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19268e = lessonDeleteFavoriteWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19267d = obj;
        this.f19269f |= Integer.MIN_VALUE;
        return this.f19268e.mo4698g(this);
    }
}
