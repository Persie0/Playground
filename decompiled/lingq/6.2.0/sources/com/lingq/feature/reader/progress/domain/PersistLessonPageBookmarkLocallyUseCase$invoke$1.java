package com.lingq.feature.reader.progress.domain;

import com.lingq.core.domain.model.lesson.LessonBookmark;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.progress.domain.PersistLessonPageBookmarkLocallyUseCase", m4291f = "PersistLessonPageBookmarkLocallyUseCase.kt", m4292l = {22, 24}, m4293m = "invoke", m4294v = 2)
final class PersistLessonPageBookmarkLocallyUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f29897a;

    /* JADX INFO: renamed from: b */
    public int f29898b;

    /* JADX INFO: renamed from: c */
    public LessonBookmark f29899c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f29900d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2473c f29901e;

    /* JADX INFO: renamed from: f */
    public int f29902f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersistLessonPageBookmarkLocallyUseCase$invoke$1(C2473c c2473c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f29901e = c2473c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29900d = obj;
        this.f29902f |= Integer.MIN_VALUE;
        return this.f29901e.m9381a(0, 0, this);
    }
}
