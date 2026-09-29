package com.lingq.feature.reader.progress.domain;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.progress.domain.CompleteLessonUseCase", m4291f = "CompleteLessonUseCase.kt", m4292l = {33, DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER, 46, 47, 52}, m4293m = "invoke", m4294v = 2)
final class CompleteLessonUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f29867a;

    /* JADX INFO: renamed from: b */
    public List f29868b;

    /* JADX INFO: renamed from: c */
    public int f29869c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f29870d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2471a f29871e;

    /* JADX INFO: renamed from: f */
    public int f29872f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompleteLessonUseCase$invoke$1(C2471a c2471a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f29871e = c2471a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29870d = obj;
        this.f29872f |= Integer.MIN_VALUE;
        return this.f29871e.m9376a(null, 0, null, this);
    }
}
