package com.lingq.core.datastore;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.datastore.ProfileStoreImpl", m4291f = "ProfileStore.kt", m4292l = {75, 76, 77, 78, 79, 80, 81}, m4293m = "clearProfile", m4294v = 2)
final class ProfileStoreImpl$clearProfile$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17941a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1369b f17942b;

    /* JADX INFO: renamed from: c */
    public int f17943c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileStoreImpl$clearProfile$1(C1369b c1369b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f17942b = c1369b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f17941a = obj;
        this.f17943c |= Integer.MIN_VALUE;
        return this.f17942b.m7914a(this);
    }
}
