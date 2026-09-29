package com.lingq.core.database.dao;

import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.database.dao.BadgeDao", m4291f = "BadgeDao.kt", m4292l = {24, 25}, m4293m = "replaceBadges$suspendImpl", m4294v = 2)
final class BadgeDao$replaceBadges$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C1313a f16844a;

    /* JADX INFO: renamed from: b */
    public ArrayList f16845b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f16846c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1313a f16847d;

    /* JADX INFO: renamed from: e */
    public int f16848e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeDao$replaceBadges$1(C1313a c1313a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16847d = c1313a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16846c = obj;
        this.f16848e |= Integer.MIN_VALUE;
        return C1313a.m7459z0(this.f16847d, null, null, this);
    }
}
