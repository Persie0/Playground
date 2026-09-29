package com.lingq.feature.onboarding.p014v2.pages.p023long;

import androidx.compose.foundation.gestures.AbstractC0117w;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p000.og7;
import p000.vi3;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.feature.onboarding.v2.pages.long.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2230a implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f27519a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f27520b;

    public C2230a(vi3 vi3Var, boolean z) {
        this.f27519a = z;
        this.f27520b = vi3Var;
    }

    @Override // androidx.compose.p002ui.input.pointer.PointerInputEventHandler
    public final Object invoke(og7 og7Var, Continuation continuation) {
        Object objM942e;
        return (this.f27519a && (objM942e = AbstractC0117w.m942e(og7Var, new CommitmentPageKt$FingerprintHold$1$1$1(this.f27520b, null), null, continuation, 11)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? objM942e : xfa.f68157a;
    }
}
