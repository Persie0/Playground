package com.lingq.core.settings.domain;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.user.ProfileSettingType;
import com.lingq.core.settings.ViewKeys;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.domain.SyncProfileSettingUseCase", m4291f = "SyncProfileSettingUseCase.kt", m4292l = {16, DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER}, m4293m = "invoke", m4294v = 2)
final class SyncProfileSettingUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ViewKeys f22868a;

    /* JADX INFO: renamed from: b */
    public ProfileSettingType f22869b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f22870c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1862a f22871d;

    /* JADX INFO: renamed from: e */
    public int f22872e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncProfileSettingUseCase$invoke$1(C1862a c1862a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22871d = c1862a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22870c = obj;
        this.f22872e |= Integer.MIN_VALUE;
        return this.f22871d.m8616b(null, null, this);
    }
}
