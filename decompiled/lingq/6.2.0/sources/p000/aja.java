package p000;

import com.lingq.core.premium.delegate.UpgradeTier;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class aja {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f732a;

    static {
        int[] iArr = new int[UpgradeTier.values().length];
        try {
            iArr[UpgradeTier.PREMIUM_1_MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UpgradeTier.PREMIUM_6_MONTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UpgradeTier.PREMIUM_1_MONTH_PLUS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[UpgradeTier.PREMIUM_YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[UpgradeTier.PREMIUM_YEAR_PLUS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f732a = iArr;
    }
}
