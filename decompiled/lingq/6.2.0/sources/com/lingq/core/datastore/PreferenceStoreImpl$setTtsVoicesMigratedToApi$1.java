package com.lingq.core.datastore;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.datastore.PreferenceStoreImpl", m4291f = "PreferenceStore.kt", m4292l = {387}, m4293m = "setTtsVoicesMigratedToApi", m4294v = 2)
final class PreferenceStoreImpl$setTtsVoicesMigratedToApi$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17713a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1368a f17714b;

    /* JADX INFO: renamed from: c */
    public int f17715c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceStoreImpl$setTtsVoicesMigratedToApi$1(C1368a c1368a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f17714b = c1368a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f17713a = obj;
        this.f17715c |= Integer.MIN_VALUE;
        return this.f17714b.m7902r0(false, this);
    }
}
