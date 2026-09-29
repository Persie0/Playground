package com.amplitude.core.remoteconfig;

import kotlin.jvm.internal.Lambda;
import p000.vi3;

/* JADX INFO: loaded from: classes.dex */
final class RemoteConfigClientImpl$buildRemoteConfigUrl$configKeysParam$1 extends Lambda implements vi3 {

    /* JADX INFO: renamed from: b */
    public static final RemoteConfigClientImpl$buildRemoteConfigUrl$configKeysParam$1 f11160b = new RemoteConfigClientImpl$buildRemoteConfigUrl$configKeysParam$1(1);

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        RemoteConfigClient$Key remoteConfigClient$Key = (RemoteConfigClient$Key) obj;
        remoteConfigClient$Key.getClass();
        return "config_keys=" + remoteConfigClient$Key.getValue();
    }
}
