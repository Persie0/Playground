package com.lingq.core.settings.domain;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.settings.ViewKeys;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.domain.UpdateReviewSettingUseCase", m4291f = "UpdateReviewSettingUseCase.kt", m4292l = {DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER, DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER, 38, DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER, DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER, 42, 43, DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER, DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER, 46, 47, 49, 50, 51, 52, 53, 55, 56, 57, 58, 59, 60, 63, 62, 69, 68, 75, 74}, m4293m = "updateStore", m4294v = 2)
final class UpdateReviewSettingUseCase$updateStore$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ViewKeys f22902a;

    /* JADX INFO: renamed from: b */
    public C1872k f22903b;

    /* JADX INFO: renamed from: c */
    public boolean f22904c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f22905d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1872k f22906e;

    /* JADX INFO: renamed from: f */
    public int f22907f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateReviewSettingUseCase$updateStore$1(C1872k c1872k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22906e = c1872k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22905d = obj;
        this.f22907f |= Integer.MIN_VALUE;
        return this.f22906e.m8642c(null, null, this, false);
    }
}
