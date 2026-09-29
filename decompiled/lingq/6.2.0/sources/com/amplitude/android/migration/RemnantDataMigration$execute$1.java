package com.amplitude.android.migration;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.android.migration.RemnantDataMigration", m4291f = "RemnantDataMigration.kt", m4292l = {DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER, 34, DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER, DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER, 38, DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m4293m = "execute")
final class RemnantDataMigration$execute$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0893c f10893a;

    /* JADX INFO: renamed from: b */
    public int f10894b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f10895c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0893c f10896d;

    /* JADX INFO: renamed from: e */
    public int f10897e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemnantDataMigration$execute$1(C0893c c0893c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f10896d = c0893c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10895c = obj;
        this.f10897e |= Integer.MIN_VALUE;
        return this.f10896d.m5083b(this);
    }
}
