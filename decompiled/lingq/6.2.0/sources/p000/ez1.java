package p000;

import com.lingq.feature.challenges.cup.data.PrizeClaimUiState;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class ez1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f38100a;

    static {
        int[] iArr = new int[PrizeClaimUiState.values().length];
        try {
            iArr[PrizeClaimUiState.Claimable.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PrizeClaimUiState.Claimed.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PrizeClaimUiState.Anonymous.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PrizeClaimUiState.NoPrize.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f38100a = iArr;
    }
}
