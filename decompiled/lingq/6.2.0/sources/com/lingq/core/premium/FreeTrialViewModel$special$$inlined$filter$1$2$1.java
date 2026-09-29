package com.lingq.core.premium;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3475pw;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.premium.FreeTrialViewModel$special$$inlined$filter$1$2", m4291f = "FreeTrialViewModel.kt", m4292l = {50}, m4293m = "emit", m4294v = 2)
public final class FreeTrialViewModel$special$$inlined$filter$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f22340a;

    /* JADX INFO: renamed from: b */
    public int f22341b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3475pw f22342c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FreeTrialViewModel$special$$inlined$filter$1$2$1(C3475pw c3475pw, Continuation continuation) {
        super(continuation);
        this.f22342c = c3475pw;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22340a = obj;
        this.f22341b |= Integer.MIN_VALUE;
        return this.f22342c.emit(null, this);
    }
}
