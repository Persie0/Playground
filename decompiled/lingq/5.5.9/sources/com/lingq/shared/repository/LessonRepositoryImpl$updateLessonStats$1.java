package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.LibraryCounter;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LessonRepositoryImpl", m19206f = "LessonRepository.kt", m19207l = {770, 797, 800, 806, 819, 821, 853, 859}, m19208m = "updateLessonStats")
final class LessonRepositoryImpl$updateLessonStats$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: H */
    public boolean f20034H;

    /* JADX INFO: renamed from: I */
    public /* synthetic */ Object f20035I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ LessonRepositoryImpl f20036J;

    /* JADX INFO: renamed from: K */
    public int f20037K;

    /* JADX INFO: renamed from: d */
    public LessonRepositoryImpl f20038d;

    /* JADX INFO: renamed from: e */
    public String f20039e;

    /* JADX INFO: renamed from: f */
    public Object f20040f;

    /* JADX INFO: renamed from: g */
    public LibraryCounter f20041g;

    /* JADX INFO: renamed from: h */
    public int f20042h;

    /* JADX INFO: renamed from: i */
    public double f20043i;

    /* JADX INFO: renamed from: j */
    public double f20044j;

    /* JADX INFO: renamed from: k */
    public double f20045k;

    /* JADX INFO: renamed from: l */
    public double f20046l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$updateLessonStats$1(LessonRepositoryImpl lessonRepositoryImpl, InterfaceC9968c<? super LessonRepositoryImpl$updateLessonStats$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20036J = lessonRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20035I = obj;
        this.f20037K |= Integer.MIN_VALUE;
        return this.f20036J.mo9530r(0.0d, 0.0d, 0, null, this, false);
    }
}
