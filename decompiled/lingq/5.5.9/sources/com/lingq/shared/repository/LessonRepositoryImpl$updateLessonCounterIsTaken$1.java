package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LessonRepositoryImpl", m19206f = "LessonRepository.kt", m19207l = {1198, 1202}, m19208m = "updateLessonCounterIsTaken")
public final class LessonRepositoryImpl$updateLessonCounterIsTaken$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public LessonRepositoryImpl f19967d;

    /* JADX INFO: renamed from: e */
    public boolean f19968e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f19969f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ LessonRepositoryImpl f19970g;

    /* JADX INFO: renamed from: h */
    public int f19971h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$updateLessonCounterIsTaken$1(LessonRepositoryImpl lessonRepositoryImpl, InterfaceC9968c<? super LessonRepositoryImpl$updateLessonCounterIsTaken$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19970g = lessonRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19969f = obj;
        this.f19971h |= Integer.MIN_VALUE;
        return this.f19970g.mo9484F(0, false, this);
    }
}
