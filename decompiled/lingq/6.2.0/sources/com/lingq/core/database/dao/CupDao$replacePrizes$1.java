package com.lingq.core.database.dao;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.database.dao.CupDao", m4291f = "CupDao.kt", m4292l = {34, DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER}, m4293m = "replacePrizes$suspendImpl", m4294v = 2)
final class CupDao$replacePrizes$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C1317e f16888a;

    /* JADX INFO: renamed from: b */
    public ArrayList f16889b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f16890c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1317e f16891d;

    /* JADX INFO: renamed from: e */
    public int f16892e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CupDao$replacePrizes$1(C1317e c1317e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16891d = c1317e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16890c = obj;
        this.f16892e |= Integer.MIN_VALUE;
        return C1317e.m7468d(this.f16891d, null, this);
    }
}
