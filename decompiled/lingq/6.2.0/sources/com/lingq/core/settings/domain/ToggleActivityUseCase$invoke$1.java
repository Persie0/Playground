package com.lingq.core.settings.domain;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.settings.ViewKeys;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.domain.ToggleActivityUseCase", m4291f = "ToggleActivityUseCase.kt", m4292l = {26, 28, DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER, DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER, 38}, m4293m = "invoke", m4294v = 2)
final class ToggleActivityUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ViewKeys f22886a;

    /* JADX INFO: renamed from: b */
    public boolean f22887b;

    /* JADX INFO: renamed from: c */
    public boolean f22888c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f22889d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1870i f22890e;

    /* JADX INFO: renamed from: f */
    public int f22891f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToggleActivityUseCase$invoke$1(C1870i c1870i, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22890e = c1870i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22889d = obj;
        this.f22891f |= Integer.MIN_VALUE;
        return this.f22890e.m8637c(null, false, false, this);
    }
}
