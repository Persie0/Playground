package com.lingq.util;

import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.LinkedHashMap;
import kotlinx.coroutines.CoroutineDispatcher;
import no.C7828f;
import no.InterfaceC7875v0;
import no.InterfaceC7882z;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
public final class CoroutineJobManager {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f32075a = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final void m10414a(InterfaceC7882z interfaceC7882z, CoroutineDispatcher coroutineDispatcher, String str, InterfaceC2052l<? super InterfaceC9968c<? super C9072e>, ? extends Object> interfaceC2052l) {
        C5207g.m11111f(coroutineDispatcher, "dispatcher");
        C5207g.m11111f(str, "key");
        LinkedHashMap linkedHashMap = this.f32075a;
        C4924a.m10450b((InterfaceC7875v0) linkedHashMap.get(str));
        linkedHashMap.put(str, C7828f.m15570d(interfaceC7882z, coroutineDispatcher, null, new CoroutineJobManager$launchJob$1(interfaceC2052l, null), 2));
    }
}
