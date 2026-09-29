package com.lingq.feature.reader.content;

import com.lingq.core.domain.model.lesson.ReaderBookmarkMode;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.content.LessonContentStateHolder", m4291f = "LessonContentStateHolder.kt", m4292l = {467, 474}, m4293m = "handleModeResume", m4294v = 2)
final class LessonContentStateHolder$handleModeResume$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f27863a;

    /* JADX INFO: renamed from: b */
    public ReaderBookmarkMode f27864b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f27865c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2260a f27866d;

    /* JADX INFO: renamed from: e */
    public int f27867e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonContentStateHolder$handleModeResume$1(C2260a c2260a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27866d = c2260a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27865c = obj;
        this.f27867e |= Integer.MIN_VALUE;
        return this.f27866d.m9251d(0, null, this);
    }
}
