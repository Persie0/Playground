package com.lingq.feature.collections.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.u45;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.domain.DownloadCollectionCourseUseCase", m4291f = "DownloadCollectionCourseUseCase.kt", m4292l = {92, 97, 106}, m4293m = "downloadLesson", m4294v = 2)
final class DownloadCollectionCourseUseCase$downloadLesson$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f25603a;

    /* JADX INFO: renamed from: b */
    public u45 f25604b;

    /* JADX INFO: renamed from: c */
    public String f25605c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f25606d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2037c f25607e;

    /* JADX INFO: renamed from: f */
    public int f25608f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadCollectionCourseUseCase$downloadLesson$1(C2037c c2037c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25607e = c2037c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25606d = obj;
        this.f25608f |= Integer.MIN_VALUE;
        return this.f25607e.m8958b(null, null, this);
    }
}
