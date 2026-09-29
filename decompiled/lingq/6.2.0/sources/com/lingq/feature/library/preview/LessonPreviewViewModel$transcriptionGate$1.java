package com.lingq.feature.library.preview;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.library.preview.LessonPreviewViewModel", m4291f = "LessonPreviewViewModel.kt", m4292l = {64}, m4293m = "transcriptionGate$library", m4294v = 2)
final class LessonPreviewViewModel$transcriptionGate$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f26758a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f26759b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2155b f26760c;

    /* JADX INFO: renamed from: d */
    public int f26761d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonPreviewViewModel$transcriptionGate$1(C2155b c2155b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f26760c = c2155b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26759b = obj;
        this.f26761d |= Integer.MIN_VALUE;
        return this.f26760c.m9087V2(0, this);
    }
}
