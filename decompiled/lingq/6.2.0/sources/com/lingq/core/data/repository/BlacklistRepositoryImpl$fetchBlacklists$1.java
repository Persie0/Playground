package com.lingq.core.data.repository;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.network.api.result.ResultBlacklist;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.data.repository.BlacklistRepositoryImpl", m4291f = "BlacklistRepositoryImpl.kt", m4292l = {DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER, DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER, 49, 60}, m4293m = "fetchBlacklists", m4294v = 2)
final class BlacklistRepositoryImpl$fetchBlacklists$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f14612a;

    /* JADX INFO: renamed from: b */
    public String f14613b;

    /* JADX INFO: renamed from: c */
    public ResultBlacklist f14614c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f14615d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1286b f14616e;

    /* JADX INFO: renamed from: f */
    public int f14617f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlacklistRepositoryImpl$fetchBlacklists$1(C1286b c1286b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14616e = c1286b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14615d = obj;
        this.f14617f |= Integer.MIN_VALUE;
        return this.f14616e.m7104f(0, null, this);
    }
}
