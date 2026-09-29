package p000;

import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.database.entity.ChatStatsEntity;
import com.lingq.core.network.api.result.ResultChatStats;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gqc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f41203a = new C0282a(1167437194, false, new fe1(25));

    /* JADX INFO: renamed from: b */
    public static final C0282a f41204b = new C0282a(373563566, false, new fe1(26));

    /* JADX INFO: renamed from: a */
    public static final ChatStatsEntity m12828a(ResultChatStats resultChatStats, int i) {
        resultChatStats.getClass();
        return new ChatStatsEntity(i, resultChatStats.f20759a, resultChatStats.f20760b, resultChatStats.f20761c, resultChatStats.f20762d, resultChatStats.f20763e, resultChatStats.f20764f);
    }
}
