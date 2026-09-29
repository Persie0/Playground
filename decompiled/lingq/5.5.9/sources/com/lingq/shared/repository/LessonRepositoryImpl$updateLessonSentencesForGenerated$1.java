package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LessonRepositoryImpl", m19206f = "LessonRepository.kt", m19207l = {614, 616, 627}, m19208m = "updateLessonSentencesForGenerated")
final class LessonRepositoryImpl$updateLessonSentencesForGenerated$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ LessonRepositoryImpl f20023H;

    /* JADX INFO: renamed from: I */
    public int f20024I;

    /* JADX INFO: renamed from: d */
    public LessonRepositoryImpl f20025d;

    /* JADX INFO: renamed from: e */
    public String f20026e;

    /* JADX INFO: renamed from: f */
    public List f20027f;

    /* JADX INFO: renamed from: g */
    public Iterator f20028g;

    /* JADX INFO: renamed from: h */
    public int f20029h;

    /* JADX INFO: renamed from: i */
    public int f20030i;

    /* JADX INFO: renamed from: j */
    public double f20031j;

    /* JADX INFO: renamed from: k */
    public double f20032k;

    /* JADX INFO: renamed from: l */
    public /* synthetic */ Object f20033l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$updateLessonSentencesForGenerated$1(LessonRepositoryImpl lessonRepositoryImpl, InterfaceC9968c<? super LessonRepositoryImpl$updateLessonSentencesForGenerated$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20023H = lessonRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20033l = obj;
        this.f20024I |= Integer.MIN_VALUE;
        return this.f20023H.mo9517g(0, null, null, this);
    }
}
