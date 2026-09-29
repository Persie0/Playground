package com.amplitude.android.migration;

import com.amplitude.core.Storage$Constants;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.android.migration.AndroidStorageMigration", m4291f = "AndroidStorageMigration.kt", m4292l = {68, 74}, m4293m = "moveSimpleValue")
final class AndroidStorageMigration$moveSimpleValue$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0891a f10879a;

    /* JADX INFO: renamed from: b */
    public Storage$Constants f10880b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f10881c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0891a f10882d;

    /* JADX INFO: renamed from: e */
    public int f10883e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidStorageMigration$moveSimpleValue$1(C0891a c0891a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f10882d = c0891a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10881c = obj;
        this.f10883e |= Integer.MIN_VALUE;
        return this.f10882d.m5079c(null, this);
    }
}
