package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LessonRepositoryImpl", m19206f = "LessonRepository.kt", m19207l = {1096, 1114}, m19208m = "updateLessonSentenceTranslation")
final class LessonRepositoryImpl$updateLessonSentenceTranslation$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public LessonRepositoryImpl f20017d;

    /* JADX INFO: renamed from: e */
    public String f20018e;

    /* JADX INFO: renamed from: f */
    public String f20019f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f20020g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ LessonRepositoryImpl f20021h;

    /* JADX INFO: renamed from: i */
    public int f20022i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$updateLessonSentenceTranslation$1(LessonRepositoryImpl lessonRepositoryImpl, InterfaceC9968c<? super LessonRepositoryImpl$updateLessonSentenceTranslation$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20021h = lessonRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20020g = obj;
        this.f20022i |= Integer.MIN_VALUE;
        return this.f20021h.mo9504Z(0, 0, null, null, this);
    }
}
