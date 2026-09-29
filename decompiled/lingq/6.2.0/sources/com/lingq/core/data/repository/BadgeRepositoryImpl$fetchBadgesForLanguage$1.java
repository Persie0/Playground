package com.lingq.core.data.repository;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.BadgeRepositoryImpl", m4291f = "BadgeRepositoryImpl.kt", m4292l = {DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER, 29}, m4293m = "fetchBadgesForLanguage", m4294v = 2)
final class BadgeRepositoryImpl$fetchBadgesForLanguage$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f14594a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f14595b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1285a f14596c;

    /* JADX INFO: renamed from: d */
    public int f14597d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeRepositoryImpl$fetchBadgesForLanguage$1(C1285a c1285a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14596c = c1285a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14595b = obj;
        this.f14597d |= Integer.MIN_VALUE;
        return this.f14596c.m7097a(null, this);
    }
}
