package p000;

import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.database.entity.MilestoneStatsEntity;
import com.lingq.core.network.api.result.ResultMilestoneStats;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tsc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f62835a = new C0282a(-937803246, false, new he1(21));

    /* JADX INFO: renamed from: a */
    public static final MilestoneStatsEntity m22297a(ResultMilestoneStats resultMilestoneStats, String str) {
        str.getClass();
        return new MilestoneStatsEntity(str, resultMilestoneStats.f21330a, resultMilestoneStats.f21331b, resultMilestoneStats.f21332c);
    }
}
