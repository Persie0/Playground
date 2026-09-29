package p000;

import com.lingq.feature.challenges.cup.data.CupLeaderboardTab;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class uw1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f64457a;

    static {
        int[] iArr = new int[CupLeaderboardTab.values().length];
        try {
            iArr[CupLeaderboardTab.Teams.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CupLeaderboardTab.Global.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f64457a = iArr;
    }
}
