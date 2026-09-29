package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LessonRepositoryImpl", m19206f = "LessonRepository.kt", m19207l = {1012, 1021}, m19208m = "networkSentenceTranslation")
final class LessonRepositoryImpl$networkSentenceTranslation$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public LessonRepositoryImpl f19908d;

    /* JADX INFO: renamed from: e */
    public int f19909e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f19910f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ LessonRepositoryImpl f19911g;

    /* JADX INFO: renamed from: h */
    public int f19912h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$networkSentenceTranslation$1(LessonRepositoryImpl lessonRepositoryImpl, InterfaceC9968c<? super LessonRepositoryImpl$networkSentenceTranslation$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19911g = lessonRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19910f = obj;
        this.f19912h |= Integer.MIN_VALUE;
        return this.f19911g.mo9536x(0, 0, null, null, this);
    }
}
