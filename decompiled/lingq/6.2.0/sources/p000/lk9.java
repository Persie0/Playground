package p000;

import kotlinx.serialization.json.internal.WriteMode;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class lk9 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f49780a;

    static {
        int[] iArr = new int[WriteMode.values().length];
        try {
            iArr[WriteMode.LIST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WriteMode.MAP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[WriteMode.POLY_OBJ.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f49780a = iArr;
    }
}
