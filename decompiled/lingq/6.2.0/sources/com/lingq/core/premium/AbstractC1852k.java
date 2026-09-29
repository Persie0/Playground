package com.lingq.core.premium;

import com.lingq.core.premium.delegate.UpgradeTier;

/* JADX INFO: renamed from: com.lingq.core.premium.k */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC1852k {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f22535a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f22536b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int[] f22537c;

    static {
        int[] iArr = new int[UpgradeUserType.values().length];
        try {
            iArr[UpgradeUserType.Free.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UpgradeUserType.Premium.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UpgradeUserType.Downgrade.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[UpgradeUserType.FreeTrial.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f22535a = iArr;
        int[] iArr2 = new int[OnboardingBillingPeriod.values().length];
        try {
            iArr2[OnboardingBillingPeriod.Monthly.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[OnboardingBillingPeriod.Yearly.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f22536b = iArr2;
        int[] iArr3 = new int[UpgradeTier.values().length];
        try {
            iArr3[UpgradeTier.PREMIUM_1_MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[UpgradeTier.PREMIUM_1_MONTH_PLUS.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[UpgradeTier.PREMIUM_6_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[UpgradeTier.PREMIUM_YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[UpgradeTier.PREMIUM_YEAR_PLUS.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        f22537c = iArr3;
    }
}
