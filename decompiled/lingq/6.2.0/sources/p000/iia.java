package p000;

import com.lingq.core.premium.upgrade.UpgradeBadgeTier;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class iia {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f44159a;

    static {
        int[] iArr = new int[UpgradeBadgeTier.values().length];
        try {
            iArr[UpgradeBadgeTier.Premium.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UpgradeBadgeTier.PremiumPlus.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f44159a = iArr;
    }
}
