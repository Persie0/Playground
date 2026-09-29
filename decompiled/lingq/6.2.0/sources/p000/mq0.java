package p000;

import com.lingq.core.p012ui.challenges.LeaderboardMetric;

/* JADX INFO: loaded from: classes2.dex */
public final class mq0 implements rq0 {

    /* JADX INFO: renamed from: a */
    public final LeaderboardMetric f51717a;

    public mq0(LeaderboardMetric leaderboardMetric) {
        this.f51717a = leaderboardMetric;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mq0) && this.f51717a == ((mq0) obj).f51717a;
    }

    public final int hashCode() {
        return this.f51717a.hashCode();
    }

    public final String toString() {
        return "ChangeMetric(metric=" + this.f51717a + ")";
    }
}
