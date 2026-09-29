package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LessonRepositoryImpl", m19206f = "LessonRepository.kt", m19207l = {556, 562, 566, 569}, m19208m = "fetchLessonSentences")
final class LessonRepositoryImpl$fetchLessonSentences$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public LessonRepositoryImpl f19836d;

    /* JADX INFO: renamed from: e */
    public String f19837e;

    /* JADX INFO: renamed from: f */
    public int f19838f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f19839g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ LessonRepositoryImpl f19840h;

    /* JADX INFO: renamed from: i */
    public int f19841i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$fetchLessonSentences$1(LessonRepositoryImpl lessonRepositoryImpl, InterfaceC9968c<? super LessonRepositoryImpl$fetchLessonSentences$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19840h = lessonRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19839g = obj;
        this.f19841i |= Integer.MIN_VALUE;
        return this.f19840h.mo9501W(0, null, this);
    }
}
