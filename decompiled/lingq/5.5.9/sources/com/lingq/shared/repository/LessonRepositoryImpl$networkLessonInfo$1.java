package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LessonRepositoryImpl", m19206f = "LessonRepository.kt", m19207l = {517, 519}, m19208m = "networkLessonInfo")
final class LessonRepositoryImpl$networkLessonInfo$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public LessonRepositoryImpl f19888d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f19889e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonRepositoryImpl f19890f;

    /* JADX INFO: renamed from: g */
    public int f19891g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$networkLessonInfo$1(LessonRepositoryImpl lessonRepositoryImpl, InterfaceC9968c<? super LessonRepositoryImpl$networkLessonInfo$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19890f = lessonRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19889e = obj;
        this.f19891g |= Integer.MIN_VALUE;
        return this.f19890f.mo9522j(0, null, this);
    }
}
