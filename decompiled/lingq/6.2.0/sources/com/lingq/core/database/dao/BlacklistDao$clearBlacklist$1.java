package com.lingq.core.database.dao;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.database.dao.BlacklistDao", m4291f = "BlacklistDao.kt", m4292l = {DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER, 46}, m4293m = "clearBlacklist$suspendImpl", m4294v = 2)
final class BlacklistDao$clearBlacklist$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C1314b f16853a;

    /* JADX INFO: renamed from: b */
    public String f16854b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f16855c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1314b f16856d;

    /* JADX INFO: renamed from: e */
    public int f16857e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlacklistDao$clearBlacklist$1(C1314b c1314b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16856d = c1314b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16855c = obj;
        this.f16857e |= Integer.MIN_VALUE;
        return C1314b.m7461b(this.f16856d, null, this);
    }
}
