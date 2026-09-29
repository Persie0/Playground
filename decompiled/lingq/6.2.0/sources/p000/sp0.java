package p000;

import com.lingq.core.domain.model.milestones.Milestone;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sp0 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61138a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f61139b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f61140c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f61141d;

    public /* synthetic */ sp0(String str, int i, int i2, String str2) {
        this.f61138a = i2;
        this.f61139b = i;
        this.f61140c = str;
        this.f61141d = str2;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        int i = this.f61138a;
        xfa xfaVar = xfa.f68157a;
        String str = this.f61141d;
        String str2 = this.f61140c;
        int i2 = this.f61139b;
        bk8 bk8Var = (bk8) obj;
        switch (i) {
            case 0:
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("UPDATE ChallengeEntity SET participantsCount = ? WHERE language = ? AND code = ?");
                try {
                    ik8VarMo2873e0.mo2878j(1, i2);
                    ik8VarMo2873e0.mo2874C(2, str2);
                    ik8VarMo2873e0.mo2874C(3, str);
                    ik8VarMo2873e0.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e0.close();
                }
            case 1:
                bk8Var.getClass();
                ik8 ik8VarMo2873e1 = bk8Var.mo2873e0("UPDATE ChallengeRankingEntity SET rank = rank - 1 WHERE rank > ? AND language = ? AND challengeCode = ?");
                try {
                    ik8VarMo2873e1.mo2878j(1, i2);
                    ik8VarMo2873e1.mo2874C(2, str2);
                    ik8VarMo2873e1.mo2874C(3, str);
                    ik8VarMo2873e1.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e1.close();
                }
            case 2:
                bk8Var.getClass();
                ik8 ik8VarMo2873e2 = bk8Var.mo2873e0("UPDATE LanguageStatsEntity SET reading_change = reading_change + ?, reading_overall = reading_overall + ? WHERE language = ? AND period = ?");
                long j = i2;
                try {
                    ik8VarMo2873e2.mo2878j(1, j);
                    ik8VarMo2873e2.mo2878j(2, j);
                    ik8VarMo2873e2.mo2874C(3, str2);
                    ik8VarMo2873e2.mo2874C(4, str);
                    ik8VarMo2873e2.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e2.close();
                }
            case 3:
                bk8Var.getClass();
                ik8 ik8VarMo2873e3 = bk8Var.mo2873e0("UPDATE LanguageProgressEntity SET writtenWords = writtenWords + ? WHERE languageCode = ? AND interval = ?");
                try {
                    ik8VarMo2873e3.mo2878j(1, i2);
                    ik8VarMo2873e3.mo2874C(2, str2);
                    ik8VarMo2873e3.mo2874C(3, str);
                    ik8VarMo2873e3.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e3.close();
                }
            case 4:
                bk8Var.getClass();
                ik8 ik8VarMo2873e4 = bk8Var.mo2873e0("UPDATE LanguageProgressEntity SET readWords = readWords + ? WHERE languageCode = ? AND interval = ?");
                try {
                    ik8VarMo2873e4.mo2878j(1, i2);
                    ik8VarMo2873e4.mo2874C(2, str2);
                    ik8VarMo2873e4.mo2874C(3, str);
                    ik8VarMo2873e4.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e4.close();
                }
            case 5:
                bk8Var.getClass();
                ik8 ik8VarMo2873e5 = bk8Var.mo2873e0("DELETE FROM LibraryShelfAndContentJoin WHERE id = ? AND LibraryShelfAndContentJoin.codeWithLanguage LIKE ? || '%' AND LibraryShelfAndContentJoin.type = ?");
                try {
                    ik8VarMo2873e5.mo2878j(1, i2);
                    ik8VarMo2873e5.mo2874C(2, str2);
                    ik8VarMo2873e5.mo2874C(3, str);
                    ik8VarMo2873e5.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e5.close();
                }
            case 6:
                bk8Var.getClass();
                ik8 ik8VarMo2873e6 = bk8Var.mo2873e0("SELECT `language`, `slug`, `name`, `goal`, `stat` FROM (\n        SELECT * FROM MilestoneEntity \n        WHERE stat = \"daily_score\" AND goal <= ? AND date = ? AND language = ? AND \n        NOT EXISTS (\n            SELECT 1 FROM MilestoneMetEntity WHERE MilestoneEntity.languageAndSlug == MilestoneMetEntity.languageAndSlug\n        )\n        ORDER BY goal\n    )");
                try {
                    ik8VarMo2873e6.mo2878j(1, i2);
                    ik8VarMo2873e6.mo2874C(2, str2);
                    ik8VarMo2873e6.mo2874C(3, str);
                    ArrayList arrayList = new ArrayList();
                    while (ik8VarMo2873e6.mo2876a0()) {
                        arrayList.add(new Milestone((int) ik8VarMo2873e6.getLong(3), ik8VarMo2873e6.mo2875L(0), ik8VarMo2873e6.mo2875L(1), ik8VarMo2873e6.mo2875L(4), ik8VarMo2873e6.mo2875L(2)));
                    }
                    ik8VarMo2873e6.close();
                    return arrayList;
                } catch (Throwable th) {
                    ik8VarMo2873e6.close();
                    throw th;
                }
            default:
                bk8Var.getClass();
                ik8 ik8VarMo2873e7 = bk8Var.mo2873e0("\n    SELECT PlaylistEntity.pk FROM PlaylistEntity, LessonsWithPlaylistJoin \n    WHERE PlaylistEntity.pk == LessonsWithPlaylistJoin.playlistId \n    AND LessonsWithPlaylistJoin.contentId = ? AND PlaylistEntity.language =  ? AND PlaylistEntity.nameWithLanguage = ?");
                try {
                    ik8VarMo2873e7.mo2878j(1, i2);
                    ik8VarMo2873e7.mo2874C(2, str2);
                    ik8VarMo2873e7.mo2874C(3, str);
                    Integer numValueOf = null;
                    if (ik8VarMo2873e7.mo2876a0() && !ik8VarMo2873e7.isNull(0)) {
                        numValueOf = Integer.valueOf((int) ik8VarMo2873e7.getLong(0));
                        break;
                    }
                    return numValueOf;
                } finally {
                    ik8VarMo2873e7.close();
                }
        }
    }
}
