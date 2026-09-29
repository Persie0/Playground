package p000;

import com.lingq.feature.challenges.cup.data.CupLeaderboardTab;

/* JADX INFO: loaded from: classes2.dex */
public final class iw1 implements jw1 {

    /* JADX INFO: renamed from: a */
    public final CupLeaderboardTab f44697a;

    public iw1(CupLeaderboardTab cupLeaderboardTab) {
        cupLeaderboardTab.getClass();
        this.f44697a = cupLeaderboardTab;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iw1) && this.f44697a == ((iw1) obj).f44697a;
    }

    public final int hashCode() {
        return this.f44697a.hashCode();
    }

    public final String toString() {
        return "OnTabSelected(tab=" + this.f44697a + ")";
    }
}
