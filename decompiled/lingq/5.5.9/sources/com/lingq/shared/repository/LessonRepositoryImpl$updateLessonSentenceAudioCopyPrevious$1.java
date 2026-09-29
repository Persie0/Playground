package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.TranslationSentence;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LessonRepositoryImpl", m19206f = "LessonRepository.kt", m19207l = {1330, 1332, 1334}, m19208m = "updateLessonSentenceAudioCopyPrevious")
final class LessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public LessonRepositoryImpl f20000d;

    /* JADX INFO: renamed from: e */
    public TranslationSentence f20001e;

    /* JADX INFO: renamed from: f */
    public int f20002f;

    /* JADX INFO: renamed from: g */
    public int f20003g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f20004h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ LessonRepositoryImpl f20005i;

    /* JADX INFO: renamed from: j */
    public int f20006j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1(LessonRepositoryImpl lessonRepositoryImpl, InterfaceC9968c<? super LessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20005i = lessonRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20004h = obj;
        this.f20006j |= Integer.MIN_VALUE;
        return this.f20005i.mo9499U(0, 0, this);
    }
}
