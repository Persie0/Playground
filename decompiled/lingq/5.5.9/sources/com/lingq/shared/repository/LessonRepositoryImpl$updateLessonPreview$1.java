package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import so.AbstractC9107y;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LessonRepositoryImpl", m19206f = "LessonRepository.kt", m19207l = {663, 667, 673}, m19208m = "updateLessonPreview")
final class LessonRepositoryImpl$updateLessonPreview$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public LessonRepositoryImpl f19983d;

    /* JADX INFO: renamed from: e */
    public AbstractC9107y f19984e;

    /* JADX INFO: renamed from: f */
    public int f19985f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f19986g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ LessonRepositoryImpl f19987h;

    /* JADX INFO: renamed from: i */
    public int f19988i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$updateLessonPreview$1(LessonRepositoryImpl lessonRepositoryImpl, InterfaceC9968c<? super LessonRepositoryImpl$updateLessonPreview$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19987h = lessonRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19986g = obj;
        this.f19988i |= Integer.MIN_VALUE;
        return this.f19987h.mo9482D(0, null, this);
    }
}
