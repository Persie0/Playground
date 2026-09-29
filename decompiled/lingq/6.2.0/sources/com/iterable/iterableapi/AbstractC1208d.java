package com.iterable.iterableapi;

/* JADX INFO: renamed from: com.iterable.iterableapi.d */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC1208d {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f13997a;

    static {
        int[] iArr = new int[InAppLayout.values().length];
        f13997a = iArr;
        try {
            iArr[InAppLayout.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f13997a[InAppLayout.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f13997a[InAppLayout.FULLSCREEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f13997a[InAppLayout.BOTTOM.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
