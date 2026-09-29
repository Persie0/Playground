package com.amplitude.android.internal.gestures;

import kotlin.jvm.internal.Lambda;
import p000.kva;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
final class AutocaptureWindowCallback$2 extends Lambda implements vi3 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ WindowCallbackC0887b f10833b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutocaptureWindowCallback$2(WindowCallbackC0887b windowCallbackC0887b) {
        super(1);
        this.f10833b = windowCallbackC0887b;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        kva kvaVar = (kva) obj;
        kvaVar.getClass();
        this.f10833b.f10850h = kvaVar;
        return xfa.f68157a;
    }
}
