package com.amplitude.android.migration;

import com.amplitude.android.C0880b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.android.migration.MigrationManager", m4291f = "MigrationManager.kt", m4292l = {42, 46, 49}, m4293m = "safePerformMigration$android_release")
final class MigrationManager$safePerformMigration$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0892b f10888a;

    /* JADX INFO: renamed from: b */
    public C0880b f10889b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f10890c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0892b f10891d;

    /* JADX INFO: renamed from: e */
    public int f10892e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MigrationManager$safePerformMigration$1(C0892b c0892b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f10891d = c0892b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10890c = obj;
        this.f10892e |= Integer.MIN_VALUE;
        return this.f10891d.m5081a(this);
    }
}
