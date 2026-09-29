package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2837s7 {

    /* JADX INFO: renamed from: c */
    public static final C2837s7 f14426c = new C2837s7();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f14428b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final C2646e7 f14427a = new C2646e7();

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: a */
    public final InterfaceC2876v7 m8253a(Class cls) {
        C2785o7 c2785o7;
        Class cls2;
        Charset charset = C2849t6.f14439a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f14428b;
        InterfaceC2876v7 interfaceC2876v7M8091C = (InterfaceC2876v7) concurrentHashMap.get(cls);
        if (interfaceC2876v7M8091C == null) {
            C2646e7 c2646e7 = this.f14427a;
            c2646e7.getClass();
            Class cls3 = C2889w7.f14495a;
            if (!AbstractC2771n6.class.isAssignableFrom(cls) && (cls2 = C2889w7.f14495a) != null) {
                if (!cls2.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                }
            }
            InterfaceC2702i7 interfaceC2702i7Mo7700a = c2646e7.f14172a.mo7700a(cls);
            if (interfaceC2702i7Mo7700a.mo7828c()) {
                if (AbstractC2771n6.class.isAssignableFrom(cls)) {
                    c2785o7 = new C2785o7(C2889w7.f14498d, C2631d6.f14151a, interfaceC2702i7Mo7700a.zza());
                } else {
                    AbstractC2675g8 abstractC2675g8 = C2889w7.f14496b;
                    AbstractC2603b6 abstractC2603b6 = C2631d6.f14152b;
                    if (abstractC2603b6 == null) {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                    c2785o7 = new C2785o7(abstractC2675g8, abstractC2603b6, interfaceC2702i7Mo7700a.zza());
                }
                interfaceC2876v7M8091C = c2785o7;
            } else {
                boolean z10 = false;
                if (AbstractC2771n6.class.isAssignableFrom(cls)) {
                    if (interfaceC2702i7Mo7700a.mo7829d() == 1) {
                        z10 = true;
                    }
                    if (z10) {
                        int i10 = C2811q7.f14398a;
                        C2914y6 c2914y6 = AbstractC2927z6.f14523b;
                        C2703i8 c2703i8 = C2889w7.f14498d;
                        C2617c6 c2617c6 = C2631d6.f14151a;
                        int i11 = C2688h7.f14233a;
                        interfaceC2876v7M8091C = C2772n7.m8091C(interfaceC2702i7Mo7700a, c2914y6, c2703i8, c2617c6);
                    } else {
                        int i12 = C2811q7.f14398a;
                        C2914y6 c2914y7 = AbstractC2927z6.f14523b;
                        C2703i8 c2703i9 = C2889w7.f14498d;
                        int i13 = C2688h7.f14233a;
                        interfaceC2876v7M8091C = C2772n7.m8091C(interfaceC2702i7Mo7700a, c2914y7, c2703i9, null);
                    }
                } else {
                    if (interfaceC2702i7Mo7700a.mo7829d() == 1) {
                        z10 = true;
                    }
                    if (z10) {
                        int i14 = C2811q7.f14398a;
                        C2901x6 c2901x6 = AbstractC2927z6.f14522a;
                        AbstractC2675g8 abstractC2675g9 = C2889w7.f14496b;
                        AbstractC2603b6 abstractC2603b7 = C2631d6.f14152b;
                        if (abstractC2603b7 == null) {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                        int i15 = C2688h7.f14233a;
                        interfaceC2876v7M8091C = C2772n7.m8091C(interfaceC2702i7Mo7700a, c2901x6, abstractC2675g9, abstractC2603b7);
                    } else {
                        int i16 = C2811q7.f14398a;
                        C2901x6 c2901x7 = AbstractC2927z6.f14522a;
                        AbstractC2675g8 abstractC2675g10 = C2889w7.f14497c;
                        int i17 = C2688h7.f14233a;
                        interfaceC2876v7M8091C = C2772n7.m8091C(interfaceC2702i7Mo7700a, c2901x7, abstractC2675g10, null);
                    }
                }
            }
            InterfaceC2876v7 interfaceC2876v7 = (InterfaceC2876v7) concurrentHashMap.putIfAbsent(cls, interfaceC2876v7M8091C);
            if (interfaceC2876v7 != null) {
                return interfaceC2876v7;
            }
        }
        return interfaceC2876v7M8091C;
    }
}
