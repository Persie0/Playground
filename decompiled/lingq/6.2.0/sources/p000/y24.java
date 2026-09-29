package p000;

import com.facebook.appevents.iap.InAppPurchaseUtils$BillingClientVersion;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class y24 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f69127a;

    static {
        int[] iArr = new int[InAppPurchaseUtils$BillingClientVersion.values().length];
        try {
            iArr[InAppPurchaseUtils$BillingClientVersion.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InAppPurchaseUtils$BillingClientVersion.V1.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[InAppPurchaseUtils$BillingClientVersion.V2_V4.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[InAppPurchaseUtils$BillingClientVersion.V5_V7.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f69127a = iArr;
    }
}
