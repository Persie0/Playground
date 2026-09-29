package com.amplitude.android.migration;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.android.migration.AndroidStorageMigration", m4291f = "AndroidStorageMigration.kt", m4292l = {15, 16}, m4293m = "execute")
final class AndroidStorageMigration$execute$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0891a f10865a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f10866b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0891a f10867c;

    /* JADX INFO: renamed from: d */
    public int f10868d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidStorageMigration$execute$1(C0891a c0891a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f10867c = c0891a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10866b = obj;
        this.f10868d |= Integer.MIN_VALUE;
        return this.f10867c.m5077a(this);
    }
}
