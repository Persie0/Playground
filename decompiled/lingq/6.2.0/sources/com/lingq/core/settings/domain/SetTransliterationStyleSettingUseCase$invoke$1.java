package com.lingq.core.settings.domain;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.domain.SetTransliterationStyleSettingUseCase", m4291f = "SetTransliterationStyleSettingUseCase.kt", m4292l = {21, 26, 32, 38, DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER, 51, 73}, m4293m = "invoke", m4294v = 2)
final class SetTransliterationStyleSettingUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f22854a;

    /* JADX INFO: renamed from: b */
    public String f22855b;

    /* JADX INFO: renamed from: c */
    public boolean f22856c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f22857d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1869h f22858e;

    /* JADX INFO: renamed from: f */
    public int f22859f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetTransliterationStyleSettingUseCase$invoke$1(C1869h c1869h, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22858e = c1869h;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22857d = obj;
        this.f22859f |= Integer.MIN_VALUE;
        return this.f22858e.m8633b(null, null, false, this);
    }
}
