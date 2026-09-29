package com.lingq.core.data.repository;

import com.lingq.core.database.entity.TranslationSentenceEntity;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl", m4291f = "LessonRepositoryImpl.kt", m4292l = {1982, 1984, 1986}, m4293m = "updateLessonSentenceAudioCopyPrevious", m4294v = 2)
final class LessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public TranslationSentenceEntity f15627a;

    /* JADX INFO: renamed from: b */
    public int f15628b;

    /* JADX INFO: renamed from: c */
    public int f15629c;

    /* JADX INFO: renamed from: d */
    public int f15630d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f15631e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1295k f15632f;

    /* JADX INFO: renamed from: g */
    public int f15633g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$updateLessonSentenceAudioCopyPrevious$1(C1295k c1295k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15632f = c1295k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15631e = obj;
        this.f15633g |= Integer.MIN_VALUE;
        return this.f15632f.m7285k0(0, 0, this);
    }
}
