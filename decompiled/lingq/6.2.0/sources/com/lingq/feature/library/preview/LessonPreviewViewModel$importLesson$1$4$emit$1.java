package com.lingq.feature.library.preview;

import com.lingq.core.domain.model.lesson.Lesson;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.library.preview.LessonPreviewViewModel$importLesson$1$4", m4291f = "LessonPreviewViewModel.kt", m4292l = {121, 123, 124, 137, 140}, m4293m = "emit", m4294v = 2)
final class LessonPreviewViewModel$importLesson$1$4$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Lesson f26749a;

    /* JADX INFO: renamed from: b */
    public C2155b f26750b;

    /* JADX INFO: renamed from: c */
    public Object f26751c;

    /* JADX INFO: renamed from: d */
    public Lesson f26752d;

    /* JADX INFO: renamed from: e */
    public int f26753e;

    /* JADX INFO: renamed from: f */
    public int f26754f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f26755g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C2154a f26756h;

    /* JADX INFO: renamed from: i */
    public int f26757i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonPreviewViewModel$importLesson$1$4$emit$1(C2154a c2154a, Continuation continuation) {
        super(continuation);
        this.f26756h = c2154a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26755g = obj;
        this.f26757i |= Integer.MIN_VALUE;
        return this.f26756h.emit(null, this);
    }
}
