package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LessonRepositoryImpl", m19206f = "LessonRepository.kt", m19207l = {1029, 1032}, m19208m = "networkGetLessonTags")
public final class LessonRepositoryImpl$networkGetLessonTags$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public Object f19869d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f19870e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonRepositoryImpl f19871f;

    /* JADX INFO: renamed from: g */
    public int f19872g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$networkGetLessonTags$1(LessonRepositoryImpl lessonRepositoryImpl, InterfaceC9968c<? super LessonRepositoryImpl$networkGetLessonTags$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19871f = lessonRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19870e = obj;
        this.f19872g |= Integer.MIN_VALUE;
        return this.f19871f.mo9515f(null, this);
    }
}
