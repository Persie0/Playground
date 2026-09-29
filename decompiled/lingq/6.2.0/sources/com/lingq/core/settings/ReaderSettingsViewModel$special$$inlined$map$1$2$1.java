package com.lingq.core.settings;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.wv7;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.core.settings.ReaderSettingsViewModel$special$$inlined$map$1$2", m4291f = "ReaderSettingsViewModel.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class ReaderSettingsViewModel$special$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f22623a;

    /* JADX INFO: renamed from: b */
    public int f22624b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wv7 f22625c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderSettingsViewModel$special$$inlined$map$1$2$1(wv7 wv7Var, Continuation continuation) {
        super(continuation);
        this.f22625c = wv7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22623a = obj;
        this.f22624b |= Integer.MIN_VALUE;
        return this.f22625c.emit(null, this);
    }
}
