package com.lingq.feature.reader.old;

import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.core.domain.model.lesson.LessonBookmark;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel", m4291f = "ReaderViewModel.kt", m4292l = {1203, 1219, 1229}, m4293m = "handleLessonLoadSuccess", m4294v = 2)
final class ReaderViewModel$handleLessonLoadSuccess$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Lesson f28960a;

    /* JADX INFO: renamed from: b */
    public LessonBookmark f28961b;

    /* JADX INFO: renamed from: c */
    public List f28962c;

    /* JADX INFO: renamed from: d */
    public boolean f28963d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f28964e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2412n f28965f;

    /* JADX INFO: renamed from: g */
    public int f28966g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$handleLessonLoadSuccess$1(C2412n c2412n, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f28965f = c2412n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28964e = obj;
        this.f28966g |= Integer.MIN_VALUE;
        return this.f28965f.m9327g3(null, null, null, this);
    }
}
