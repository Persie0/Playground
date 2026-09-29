package com.lingq.core.datastore;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.datastore.PreferenceStoreImpl", m4291f = "PreferenceStore.kt", m4292l = {392}, m4293m = "setTtsVoiceDirtyLanguages", m4294v = 2)
final class PreferenceStoreImpl$setTtsVoiceDirtyLanguages$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17704a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1368a f17705b;

    /* JADX INFO: renamed from: c */
    public int f17706c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceStoreImpl$setTtsVoiceDirtyLanguages$1(C1368a c1368a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f17705b = c1368a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f17704a = obj;
        this.f17706c |= Integer.MIN_VALUE;
        return this.f17705b.m7898p0(null, this);
    }
}
