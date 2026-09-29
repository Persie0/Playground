package com.amplitude.android.storage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.b90;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.android.storage.AndroidStorageV2", m4291f = "AndroidStorageV2.kt", m4292l = {67}, m4293m = "writeEvent")
final class AndroidStorageV2$writeEvent$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0898b f10977a;

    /* JADX INFO: renamed from: b */
    public b90 f10978b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f10979c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0898b f10980d;

    /* JADX INFO: renamed from: e */
    public int f10981e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidStorageV2$writeEvent$1(C0898b c0898b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f10980d = c0898b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10979c = obj;
        this.f10981e |= Integer.MIN_VALUE;
        return this.f10980d.m5103h(null, this);
    }
}
