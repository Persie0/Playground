package com.lingq.core.database.dao;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.dt1;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.database.dao.CupDao", m4291f = "CupDao.kt", m4292l = {77, 78, 79, 80}, m4293m = "replaceContributors$suspendImpl", m4294v = 2)
final class CupDao$replaceContributors$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C1317e f16881a;

    /* JADX INFO: renamed from: b */
    public String f16882b;

    /* JADX INFO: renamed from: c */
    public List f16883c;

    /* JADX INFO: renamed from: d */
    public dt1 f16884d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f16885e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1317e f16886f;

    /* JADX INFO: renamed from: g */
    public int f16887g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CupDao$replaceContributors$1(C1317e c1317e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16886f = c1317e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16885e = obj;
        this.f16887g |= Integer.MIN_VALUE;
        return C1317e.m7467b(this.f16886f, null, null, null, this);
    }
}
