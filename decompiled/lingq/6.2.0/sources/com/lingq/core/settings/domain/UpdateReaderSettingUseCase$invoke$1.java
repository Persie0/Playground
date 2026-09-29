package com.lingq.core.settings.domain;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.eda;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.domain.UpdateReaderSettingUseCase", m4291f = "UpdateReaderSettingUseCase.kt", m4292l = {DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER, 28, DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER, DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER, 42, DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER, DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER, eda.f37086g, 49, 52, 53, 56, 57, 59, 60, 61, 63, 64, 66, 68, 69, 72, 73, 75, 77, 79, 81, 89, 95}, m4293m = "invoke", m4294v = 2)
final class UpdateReaderSettingUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public boolean f22892a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f22893b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1871j f22894c;

    /* JADX INFO: renamed from: d */
    public int f22895d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateReaderSettingUseCase$invoke$1(C1871j c1871j, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22894c = c1871j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22893b = obj;
        this.f22895d |= Integer.MIN_VALUE;
        return this.f22894c.m8639a(null, false, this);
    }
}
