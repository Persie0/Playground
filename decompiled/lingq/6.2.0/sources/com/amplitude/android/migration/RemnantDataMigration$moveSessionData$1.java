package com.amplitude.android.migration;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.android.migration.RemnantDataMigration", m4291f = "RemnantDataMigration.kt", m4292l = {77, 82, 87}, m4293m = "moveSessionData")
final class RemnantDataMigration$moveSessionData$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0893c f10918a;

    /* JADX INFO: renamed from: b */
    public Long f10919b;

    /* JADX INFO: renamed from: c */
    public Long f10920c;

    /* JADX INFO: renamed from: d */
    public Long f10921d;

    /* JADX INFO: renamed from: e */
    public Long f10922e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f10923f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0893c f10924g;

    /* JADX INFO: renamed from: h */
    public int f10925h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemnantDataMigration$moveSessionData$1(C0893c c0893c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f10924g = c0893c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10923f = obj;
        this.f10925h |= Integer.MIN_VALUE;
        return this.f10924g.m5088g(this);
    }
}
