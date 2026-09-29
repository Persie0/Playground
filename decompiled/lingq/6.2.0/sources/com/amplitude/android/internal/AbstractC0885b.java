package com.amplitude.android.internal;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import p000.cl9;
import p000.kva;
import p000.u91;
import p000.vk9;

/* JADX INFO: renamed from: com.amplitude.android.internal.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0885b {
    /* JADX INFO: renamed from: a */
    public static final Map m5073a(kva kvaVar, String str) {
        kvaVar.getClass();
        str.getClass();
        return AbstractC3194a.m15365R(new Pair("[Amplitude] Action", "touch"), new Pair("[Amplitude] Target Class", kvaVar.f48478b), new Pair("[Amplitude] Target Resource", kvaVar.f48479c), new Pair("[Amplitude] Target Tag", kvaVar.f48480d), new Pair("[Amplitude] Target Text", kvaVar.f48481e), new Pair("[Amplitude] Target Accessibility Label", kvaVar.f48482f), new Pair("[Amplitude] Target Source", u91.m22596N0(vk9.m23365A0(cl9.m4839V(kvaVar.f48483g, "_", " "), new String[]{" "}, 0, 6), " ", null, null, ViewTargetKt$buildElementInteractedProperties$1.f10832b, 30)), new Pair("[Amplitude] Hierarchy", kvaVar.f48484h), new Pair("[Amplitude] Screen Name", str));
    }
}
