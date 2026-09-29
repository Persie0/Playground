package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LessonRepositoryImpl", m19206f = "LessonRepository.kt", m19207l = {874, 893}, m19208m = "updateLessonComplete")
final class LessonRepositoryImpl$updateLessonComplete$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public LessonRepositoryImpl f19961d;

    /* JADX INFO: renamed from: e */
    public String f19962e;

    /* JADX INFO: renamed from: f */
    public int f19963f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f19964g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ LessonRepositoryImpl f19965h;

    /* JADX INFO: renamed from: i */
    public int f19966i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$updateLessonComplete$1(LessonRepositoryImpl lessonRepositoryImpl, InterfaceC9968c<? super LessonRepositoryImpl$updateLessonComplete$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19965h = lessonRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19964g = obj;
        this.f19966i |= Integer.MIN_VALUE;
        return this.f19965h.mo9526n(0, null, this);
    }
}
