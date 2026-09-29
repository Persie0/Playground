package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LessonRepositoryImpl", m19206f = "LessonRepository.kt", m19207l = {707}, m19208m = "updateLessonBookmark")
final class LessonRepositoryImpl$updateLessonBookmark$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public LessonRepositoryImpl f19953d;

    /* JADX INFO: renamed from: e */
    public String f19954e;

    /* JADX INFO: renamed from: f */
    public String f19955f;

    /* JADX INFO: renamed from: g */
    public int f19956g;

    /* JADX INFO: renamed from: h */
    public int f19957h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f19958i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ LessonRepositoryImpl f19959j;

    /* JADX INFO: renamed from: k */
    public int f19960k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$updateLessonBookmark$1(LessonRepositoryImpl lessonRepositoryImpl, InterfaceC9968c<? super LessonRepositoryImpl$updateLessonBookmark$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19959j = lessonRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19958i = obj;
        this.f19960k |= Integer.MIN_VALUE;
        return this.f19959j.mo9532t(0, 0, null, null, this);
    }
}
