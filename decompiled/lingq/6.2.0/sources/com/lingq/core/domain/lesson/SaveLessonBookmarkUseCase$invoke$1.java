package com.lingq.core.domain.lesson;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.lesson.ReaderBookmarkMode;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.lesson.SaveLessonBookmarkUseCase", m4291f = "SaveLessonBookmarkUseCase.kt", m4292l = {DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER, DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER, DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER, 49}, m4293m = "invoke", m4294v = 2)
final class SaveLessonBookmarkUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f18698a;

    /* JADX INFO: renamed from: b */
    public ReaderBookmarkMode f18699b;

    /* JADX INFO: renamed from: c */
    public Integer f18700c;

    /* JADX INFO: renamed from: d */
    public String f18701d;

    /* JADX INFO: renamed from: e */
    public int f18702e;

    /* JADX INFO: renamed from: f */
    public int f18703f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f18704g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1384f f18705h;

    /* JADX INFO: renamed from: i */
    public int f18706i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveLessonBookmarkUseCase$invoke$1(C1384f c1384f, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f18705h = c1384f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f18704g = obj;
        this.f18706i |= Integer.MIN_VALUE;
        return this.f18705h.m7995a(null, 0, 0, null, null, this);
    }
}
