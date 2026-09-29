package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2646e7 {

    /* JADX INFO: renamed from: b */
    public static final C2604b7 f14171b = new C2604b7();

    /* JADX INFO: renamed from: a */
    public final C2618c7 f14172a;

    public C2646e7() {
        InterfaceC2716j7 interfaceC2716j7;
        InterfaceC2716j7[] interfaceC2716j7Arr = new InterfaceC2716j7[2];
        interfaceC2716j7Arr[0] = C2701i6.f14252a;
        try {
            interfaceC2716j7 = (InterfaceC2716j7) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            interfaceC2716j7 = f14171b;
        }
        interfaceC2716j7Arr[1] = interfaceC2716j7;
        C2618c7 c2618c7 = new C2618c7(interfaceC2716j7Arr);
        Charset charset = C2849t6.f14439a;
        this.f14172a = c2618c7;
    }
}
