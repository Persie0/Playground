package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.Lesson;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LessonRepositoryImpl", m19206f = "LessonRepository.kt", m19207l = {713, 715, 729, 730, 743}, m19208m = "updateLessonLike")
final class LessonRepositoryImpl$updateLessonLike$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public LessonRepositoryImpl f19976d;

    /* JADX INFO: renamed from: e */
    public String f19977e;

    /* JADX INFO: renamed from: f */
    public Lesson f19978f;

    /* JADX INFO: renamed from: g */
    public int f19979g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f19980h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ LessonRepositoryImpl f19981i;

    /* JADX INFO: renamed from: j */
    public int f19982j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$updateLessonLike$1(LessonRepositoryImpl lessonRepositoryImpl, InterfaceC9968c<? super LessonRepositoryImpl$updateLessonLike$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19981i = lessonRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19980h = obj;
        this.f19982j |= Integer.MIN_VALUE;
        return this.f19981i.mo9531s(0, null, this);
    }
}
