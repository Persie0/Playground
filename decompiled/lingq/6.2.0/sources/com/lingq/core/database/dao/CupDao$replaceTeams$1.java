package com.lingq.core.database.dao;

import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.database.dao.CupDao", m4291f = "CupDao.kt", m4292l = {49, 50}, m4293m = "replaceTeams$suspendImpl", m4294v = 2)
final class CupDao$replaceTeams$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C1317e f16893a;

    /* JADX INFO: renamed from: b */
    public ArrayList f16894b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f16895c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1317e f16896d;

    /* JADX INFO: renamed from: e */
    public int f16897e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CupDao$replaceTeams$1(C1317e c1317e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16896d = c1317e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16895c = obj;
        this.f16897e |= Integer.MIN_VALUE;
        return C1317e.m7469f(this.f16896d, null, this);
    }
}
