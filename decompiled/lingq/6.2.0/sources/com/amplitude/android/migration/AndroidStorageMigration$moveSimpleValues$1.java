package com.amplitude.android.migration;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.android.migration.AndroidStorageMigration", m4291f = "AndroidStorageMigration.kt", m4292l = {51, 52, 53, 55, 56, 57, 58}, m4293m = "moveSimpleValues")
final class AndroidStorageMigration$moveSimpleValues$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0891a f10884a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f10885b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0891a f10886c;

    /* JADX INFO: renamed from: d */
    public int f10887d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidStorageMigration$moveSimpleValues$1(C0891a c0891a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f10886c = c0891a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10885b = obj;
        this.f10887d |= Integer.MIN_VALUE;
        return this.f10886c.m5080d(this);
    }
}
