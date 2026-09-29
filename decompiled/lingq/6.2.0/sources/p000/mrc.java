package p000;

import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.database.entity.LanguageStatsEntity;
import com.lingq.core.domain.model.language.LanguageStatValue;
import com.lingq.core.network.api.result.ResultLanguageStatValue;
import com.lingq.core.network.api.result.ResultLanguageStats;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mrc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f51785a = new C0282a(-1864975849, false, new he1(4));

    /* JADX INFO: renamed from: b */
    public static final C0282a f51786b = new C0282a(54945609, false, new ge1(23));

    /* JADX INFO: renamed from: c */
    public static final C0282a f51787c = new C0282a(-88847677, false, new ge1(24));

    /* JADX INFO: renamed from: d */
    public static final C0282a f51788d = new C0282a(-1901710692, false, new he1(5));

    /* JADX INFO: renamed from: e */
    public static final C0282a f51789e = new C0282a(-1804446268, false, new ge1(25));

    /* JADX INFO: renamed from: f */
    public static final C0282a f51790f = new C0282a(677658013, false, new he1(6));

    /* JADX INFO: renamed from: g */
    public static final C0282a f51791g = new C0282a(-76366276, false, new he1(7));

    /* JADX INFO: renamed from: h */
    public static final C0282a f51792h = new C0282a(-1179344353, false, new ge1(26));

    /* JADX INFO: renamed from: a */
    public static final LanguageStatsEntity m17029a(ResultLanguageStats resultLanguageStats, String str, String str2) {
        resultLanguageStats.getClass();
        str.getClass();
        str2.getClass();
        return new LanguageStatsEntity(vz1.m23629f(str2, str), str, str2, m17030b(resultLanguageStats.f20916a), m17030b(resultLanguageStats.f20917b), m17030b(resultLanguageStats.f20918c), m17030b(resultLanguageStats.f20919d), m17030b(resultLanguageStats.f20920e), m17030b(resultLanguageStats.f20921f), m17030b(resultLanguageStats.f20922g), m17030b(resultLanguageStats.f20923h), m17030b(resultLanguageStats.f20924i), m17030b(resultLanguageStats.f20925j), m17030b(resultLanguageStats.f20926k), m17030b(resultLanguageStats.f20927l), m17030b(resultLanguageStats.f20928m), m17030b(resultLanguageStats.f20929n), m17030b(resultLanguageStats.f20930o), m17030b(resultLanguageStats.f20931p), m17030b(resultLanguageStats.f20932q), m17030b(resultLanguageStats.f20933r), m17030b(resultLanguageStats.f20934s), m17030b(resultLanguageStats.f20935t), m17030b(resultLanguageStats.f20936u), m17030b(resultLanguageStats.f20937v), m17030b(resultLanguageStats.f20938w), m17030b(resultLanguageStats.f20939x), m17030b(resultLanguageStats.f20940y));
    }

    /* JADX INFO: renamed from: b */
    public static final LanguageStatValue m17030b(ResultLanguageStatValue resultLanguageStatValue) {
        resultLanguageStatValue.getClass();
        return new LanguageStatValue(resultLanguageStatValue.f20914a, resultLanguageStatValue.f20915b);
    }
}
