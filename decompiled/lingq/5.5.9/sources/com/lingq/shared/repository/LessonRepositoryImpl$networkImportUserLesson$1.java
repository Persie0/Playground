package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.network.result.ResultLesson;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LessonRepositoryImpl", m19206f = "LessonRepository.kt", m19207l = {941, 943, 945}, m19208m = "networkImportUserLesson")
public final class LessonRepositoryImpl$networkImportUserLesson$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public LessonRepositoryImpl f19878d;

    /* JADX INFO: renamed from: e */
    public ResultLesson f19879e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f19880f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ LessonRepositoryImpl f19881g;

    /* JADX INFO: renamed from: h */
    public int f19882h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$networkImportUserLesson$1(LessonRepositoryImpl lessonRepositoryImpl, InterfaceC9968c<? super LessonRepositoryImpl$networkImportUserLesson$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19881g = lessonRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19880f = obj;
        this.f19882h |= Integer.MIN_VALUE;
        return this.f19881g.mo9529q(null, null, null, null, false, 0, null, this);
    }
}
