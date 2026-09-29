package com.lingq.feature.chat.settings;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.bn3;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.settings.LynxSettingsViewModel$special$$inlined$map$1$2", m4291f = "LynxSettingsViewModel.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class LynxSettingsViewModel$special$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f25317a;

    /* JADX INFO: renamed from: b */
    public int f25318b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bn3 f25319c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxSettingsViewModel$special$$inlined$map$1$2$1(bn3 bn3Var, Continuation continuation) {
        super(continuation);
        this.f25319c = bn3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25317a = obj;
        this.f25318b |= Integer.MIN_VALUE;
        return this.f25319c.emit(null, this);
    }
}
