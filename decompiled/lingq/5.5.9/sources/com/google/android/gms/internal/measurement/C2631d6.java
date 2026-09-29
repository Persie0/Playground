package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2631d6 {

    /* JADX INFO: renamed from: a */
    public static final C2617c6 f14151a = new C2617c6();

    /* JADX INFO: renamed from: b */
    public static final AbstractC2603b6 f14152b;

    static {
        AbstractC2603b6 abstractC2603b6;
        try {
            abstractC2603b6 = (AbstractC2603b6) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            abstractC2603b6 = null;
        }
        f14152b = abstractC2603b6;
    }
}
