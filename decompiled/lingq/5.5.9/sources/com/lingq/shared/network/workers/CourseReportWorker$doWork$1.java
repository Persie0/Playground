package com.lingq.shared.network.workers;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.network.workers.CourseReportWorker", m19206f = "CourseReportWorker.kt", m19207l = {29}, m19208m = "doWork")
public final class CourseReportWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f19206d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ CourseReportWorker f19207e;

    /* JADX INFO: renamed from: f */
    public int f19208f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseReportWorker$doWork$1(CourseReportWorker courseReportWorker, InterfaceC9968c<? super CourseReportWorker$doWork$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19207e = courseReportWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19206d = obj;
        this.f19208f |= Integer.MIN_VALUE;
        return this.f19207e.mo4698g(this);
    }
}
