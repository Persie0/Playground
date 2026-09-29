package com.amplitude.android.migration;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.amplitude.android.migration.RemnantDataMigration", m4291f = "RemnantDataMigration.kt", m4292l = {146}, m4293m = "moveEvent")
final class RemnantDataMigration$moveEvent$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public FunctionReferenceImpl f10898a;

    /* JADX INFO: renamed from: b */
    public long f10899b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f10900c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0893c f10901d;

    /* JADX INFO: renamed from: e */
    public int f10902e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemnantDataMigration$moveEvent$1(C0893c c0893c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f10901d = c0893c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10900c = obj;
        this.f10902e |= Integer.MIN_VALUE;
        return this.f10901d.m5084c(null, null, null, this);
    }
}
