package com.amplitude.core.remoteconfig;

import kotlin.jvm.internal.Lambda;
import p000.d58;
import p000.vi3;

/* JADX INFO: loaded from: classes.dex */
final class RemoteConfigClientImpl$cleanupDeadReferencesLocked$1 extends Lambda implements vi3 {

    /* JADX INFO: renamed from: b */
    public static final RemoteConfigClientImpl$cleanupDeadReferencesLocked$1 f11161b = new RemoteConfigClientImpl$cleanupDeadReferencesLocked$1(1);

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        d58 d58Var = (d58) obj;
        d58Var.getClass();
        return Boolean.valueOf(!(d58Var.f35015a.get() != null));
    }
}
