package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LessonRepositoryImpl", m19206f = "LessonRepository.kt", m19207l = {1182, 1192}, m19208m = "updateLessonCounterLike")
public final class LessonRepositoryImpl$updateLessonCounterLike$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public LessonRepositoryImpl f19972d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f19973e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonRepositoryImpl f19974f;

    /* JADX INFO: renamed from: g */
    public int f19975g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$updateLessonCounterLike$1(LessonRepositoryImpl lessonRepositoryImpl, InterfaceC9968c<? super LessonRepositoryImpl$updateLessonCounterLike$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19974f = lessonRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19973e = obj;
        this.f19975g |= Integer.MIN_VALUE;
        return this.f19974f.m9520h0(0, this);
    }
}
