package p000;

import androidx.compose.p002ui.semantics.AbstractC0426f;
import com.lingq.core.database.entity.LanguageStatsEntity;
import com.lingq.core.database.entity.LibraryFastSearchEntity;
import com.lingq.core.domain.model.challenge.Challenge;
import com.lingq.core.domain.model.chat.ChatHistoryOld;
import com.lingq.core.domain.model.language.DictionaryData;
import com.lingq.core.domain.model.language.LanguageStatValue;
import com.lingq.core.domain.model.library.CollectionsFilter;
import com.lingq.core.domain.model.library.LibraryItemCounter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class md0 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f51096a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f51097b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f51098c;

    public /* synthetic */ md0(String str, int i, String str2) {
        this.f51096a = i;
        this.f51097b = str;
        this.f51098c = str2;
    }

    /* JADX INFO: renamed from: d */
    private final Object m16780d(Object obj) throws Exception {
        String str = this.f51097b;
        String str2 = this.f51098c;
        bk8 bk8Var = (bk8) obj;
        bk8Var.getClass();
        ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT * FROM LanguageStatsEntity WHERE language = ? AND period = ?");
        try {
            ik8VarMo2873e0.mo2874C(1, str);
            ik8VarMo2873e0.mo2874C(2, str2);
            return ik8VarMo2873e0.mo2876a0() ? new LanguageStatsEntity(ik8VarMo2873e0.mo2875L(AbstractC3122is.m14108v(ik8VarMo2873e0, "languageAndPeriod")), ik8VarMo2873e0.mo2875L(AbstractC3122is.m14108v(ik8VarMo2873e0, "language")), ik8VarMo2873e0.mo2875L(AbstractC3122is.m14108v(ik8VarMo2873e0, "period")), new LanguageStatValue(ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "lessonCompleted_overall")), ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "lessonCompleted_change"))), new LanguageStatValue(ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "speakingUsage_overall")), ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "speakingUsage_change"))), new LanguageStatValue(ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "coinWords_overall")), ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "coinWords_change"))), new LanguageStatValue(ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "lessonShared_overall")), ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "lessonShared_change"))), new LanguageStatValue(ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "translationsShared_overall")), ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "translationsShared_change"))), new LanguageStatValue(ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "lessonPublished_overall")), ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "lessonPublished_change"))), new LanguageStatValue(ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "studyTime_overall")), ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "studyTime_change"))), new LanguageStatValue(ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "wpm_overall")), ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "wpm_change"))), new LanguageStatValue(ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "lessonTaken_overall")), ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "lessonTaken_change"))), new LanguageStatValue(ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "translationsCreated_overall")), ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "translationsCreated_change"))), new LanguageStatValue(ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "learnedWords_overall")), ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "learnedWords_change"))), new LanguageStatValue(ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "readingUsage_overall")), ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "readingUsage_change"))), new LanguageStatValue(ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "listening_overall")), ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "listening_change"))), new LanguageStatValue(ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "earnedCoins_overall")), ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "earnedCoins_change"))), new LanguageStatValue(ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "coinsRead_overall")), ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "coinsRead_change"))), new LanguageStatValue(ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "reviewUsage_overall")), ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "reviewUsage_change"))), new LanguageStatValue(ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "listeningUsage_overall")), ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "listeningUsage_change"))), new LanguageStatValue(ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "writing_overall")), ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "writing_change"))), new LanguageStatValue(ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "createdLingQs_overall")), ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "createdLingQs_change"))), new LanguageStatValue(ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "knownWords_overall")), ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "knownWords_change"))), new LanguageStatValue(ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "lessonImported_overall")), ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "lessonImported_change"))), new LanguageStatValue(ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "translationsUsed_overall")), ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "translationsUsed_change"))), new LanguageStatValue(ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "reading_overall")), ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "reading_change"))), new LanguageStatValue(ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "coinsListen_overall")), ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "coinsListen_change"))), new LanguageStatValue(ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "speaking_overall")), ik8VarMo2873e0.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e0, "speaking_change")))) : null;
        } finally {
            ik8VarMo2873e0.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        int i = this.f51096a;
        int i2 = 7;
        int i3 = 6;
        int i4 = 5;
        int i5 = 4;
        xfa xfaVar = xfa.f68157a;
        Object challenge = null;
        String str = this.f51098c;
        String str2 = this.f51097b;
        switch (i) {
            case 0:
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("DELETE FROM SourceBlacklistEntity WHERE name = ? AND language = ?");
                try {
                    ik8VarMo2873e0.mo2874C(1, str2);
                    ik8VarMo2873e0.mo2874C(2, str);
                    ik8VarMo2873e0.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e0.close();
                }
            case 1:
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                ik8 ik8VarMo2873e1 = bk8Var2.mo2873e0("UPDATE ChallengeEntity SET isJoined = 1, status = 'Joined', rank = 0 WHERE language = ? AND code = ?");
                try {
                    ik8VarMo2873e1.mo2874C(1, str2);
                    ik8VarMo2873e1.mo2874C(2, str);
                    ik8VarMo2873e1.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e1.close();
                }
            case 2:
                bk8 bk8Var3 = (bk8) obj;
                bk8Var3.getClass();
                ik8 ik8VarMo2873e2 = bk8Var3.mo2873e0("SELECT `pk`, `code`, `title`, `challengeType`, `description`, `startDate`, `endDate`, `participantsCount`, `badgeUrl`, `isCompleted`, `isJoined`, `rank`, `challengeLanguage`, `status`, `signupDeadline` FROM (SELECT * FROM ChallengeEntity WHERE language = ? AND code = ?)");
                try {
                    ik8VarMo2873e2.mo2874C(1, str2);
                    ik8VarMo2873e2.mo2874C(2, str);
                    if (ik8VarMo2873e2.mo2876a0()) {
                        challenge = new Challenge((int) ik8VarMo2873e2.getLong(0), ik8VarMo2873e2.mo2875L(1), ik8VarMo2873e2.mo2875L(2), ik8VarMo2873e2.mo2875L(4), ik8VarMo2873e2.isNull(5) ? null : ik8VarMo2873e2.mo2875L(5), ik8VarMo2873e2.isNull(6) ? null : ik8VarMo2873e2.mo2875L(6), ik8VarMo2873e2.mo2875L(3), (int) ik8VarMo2873e2.getLong(7), ik8VarMo2873e2.isNull(8) ? null : ik8VarMo2873e2.mo2875L(8), ((int) ik8VarMo2873e2.getLong(10)) != 0, (int) ik8VarMo2873e2.getLong(11), ((int) ik8VarMo2873e2.getLong(9)) != 0, ik8VarMo2873e2.isNull(12) ? null : ik8VarMo2873e2.mo2875L(12), ik8VarMo2873e2.isNull(14) ? null : ik8VarMo2873e2.mo2875L(14), ik8VarMo2873e2.isNull(13) ? null : ik8VarMo2873e2.mo2875L(13));
                    }
                    return challenge;
                } finally {
                    ik8VarMo2873e2.close();
                }
            case 3:
                bk8 bk8Var4 = (bk8) obj;
                bk8Var4.getClass();
                ik8 ik8VarMo2873e3 = bk8Var4.mo2873e0("UPDATE ChallengeEntity SET isJoined = 0, status = 'CanJoin' WHERE language = ? AND code = ?");
                try {
                    ik8VarMo2873e3.mo2874C(1, str2);
                    ik8VarMo2873e3.mo2874C(2, str);
                    ik8VarMo2873e3.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e3.close();
                }
            case 4:
                bk8 bk8Var5 = (bk8) obj;
                bk8Var5.getClass();
                ik8 ik8VarMo2873e4 = bk8Var5.mo2873e0("SELECT `order` FROM ChallengeEntity WHERE language = ? AND code = ? LIMIT 1");
                try {
                    ik8VarMo2873e4.mo2874C(1, str2);
                    ik8VarMo2873e4.mo2874C(2, str);
                    if (ik8VarMo2873e4.mo2876a0() && !ik8VarMo2873e4.isNull(0)) {
                        challenge = Integer.valueOf((int) ik8VarMo2873e4.getLong(0));
                        break;
                    }
                    return challenge;
                } finally {
                    ik8VarMo2873e4.close();
                }
            case 5:
                bk8 bk8Var6 = (bk8) obj;
                bk8Var6.getClass();
                ik8 ik8VarMo2873e5 = bk8Var6.mo2873e0("SELECT `pk`, `code`, `title`, `challengeType`, `description`, `startDate`, `endDate`, `participantsCount`, `badgeUrl`, `isCompleted`, `isJoined`, `rank`, `challengeLanguage`, `status`, `signupDeadline` FROM (SELECT * FROM ChallengeEntity WHERE language = ? AND code = ?)");
                try {
                    ik8VarMo2873e5.mo2874C(1, str2);
                    ik8VarMo2873e5.mo2874C(2, str);
                    if (ik8VarMo2873e5.mo2876a0()) {
                        challenge = new Challenge((int) ik8VarMo2873e5.getLong(0), ik8VarMo2873e5.mo2875L(1), ik8VarMo2873e5.mo2875L(2), ik8VarMo2873e5.mo2875L(4), ik8VarMo2873e5.isNull(5) ? null : ik8VarMo2873e5.mo2875L(5), ik8VarMo2873e5.isNull(6) ? null : ik8VarMo2873e5.mo2875L(6), ik8VarMo2873e5.mo2875L(3), (int) ik8VarMo2873e5.getLong(7), ik8VarMo2873e5.isNull(8) ? null : ik8VarMo2873e5.mo2875L(8), ((int) ik8VarMo2873e5.getLong(10)) != 0, (int) ik8VarMo2873e5.getLong(11), ((int) ik8VarMo2873e5.getLong(9)) != 0, ik8VarMo2873e5.isNull(12) ? null : ik8VarMo2873e5.mo2875L(12), ik8VarMo2873e5.isNull(14) ? null : ik8VarMo2873e5.mo2875L(14), ik8VarMo2873e5.isNull(13) ? null : ik8VarMo2873e5.mo2875L(13));
                    }
                    return challenge;
                } finally {
                    ik8VarMo2873e5.close();
                }
            case 6:
                bk8 bk8Var7 = (bk8) obj;
                bk8Var7.getClass();
                ik8 ik8VarMo2873e6 = bk8Var7.mo2873e0("SELECT `language`, `code`, `title`, `progress`, `actual`, `target`, `bookId`, `bookImage`, `bookLanguage` FROM (SELECT * FROM ChallengeStatsEntity WHERE language = ? AND challengeCode = ?)");
                try {
                    ik8VarMo2873e6.mo2874C(1, str2);
                    ik8VarMo2873e6.mo2874C(2, str);
                    ArrayList arrayList = new ArrayList();
                    while (ik8VarMo2873e6.mo2876a0()) {
                        arrayList.add(new jr0(ik8VarMo2873e6.mo2875L(2), ik8VarMo2873e6.mo2875L(1), ik8VarMo2873e6.getDouble(3), ik8VarMo2873e6.getDouble(4), ik8VarMo2873e6.getDouble(5), ik8VarMo2873e6.mo2875L(0), (int) ik8VarMo2873e6.getLong(6), ik8VarMo2873e6.mo2875L(7), ik8VarMo2873e6.mo2875L(8)));
                    }
                    ik8VarMo2873e6.close();
                    return arrayList;
                } catch (Throwable th) {
                    ik8VarMo2873e6.close();
                    throw th;
                }
            case 7:
                bk8 bk8Var8 = (bk8) obj;
                bk8Var8.getClass();
                ik8 ik8VarMo2873e7 = bk8Var8.mo2873e0("SELECT `id`, `title`, `imageUrl`, `collectionTitle` FROM (\n    SELECT DISTINCT LibraryDataEntity.* FROM LibraryDataEntity\n    INNER JOIN LibraryShelfAndContentJoin ON LibraryDataEntity.id = LibraryShelfAndContentJoin.id\n    WHERE LibraryShelfAndContentJoin.codeWithLanguage LIKE ? AND LibraryDataEntity.type = ?\n    ORDER BY LibraryShelfAndContentJoin.`order` ASC \n    LIMIT ?\n  )");
                try {
                    ik8VarMo2873e7.mo2874C(1, str2);
                    ik8VarMo2873e7.mo2874C(2, str);
                    ik8VarMo2873e7.mo2878j(3, 10L);
                    int iM14108v = AbstractC3122is.m14108v(ik8VarMo2873e7, "id");
                    int iM14108v2 = AbstractC3122is.m14108v(ik8VarMo2873e7, "title");
                    int iM14108v3 = AbstractC3122is.m14108v(ik8VarMo2873e7, "imageUrl");
                    int iM14108v4 = AbstractC3122is.m14108v(ik8VarMo2873e7, "collectionTitle");
                    ArrayList arrayList2 = new ArrayList();
                    while (ik8VarMo2873e7.mo2876a0()) {
                        arrayList2.add(new nw0(ik8VarMo2873e7.mo2875L(iM14108v2), (int) ik8VarMo2873e7.getLong(iM14108v), ik8VarMo2873e7.isNull(iM14108v3) ? null : ik8VarMo2873e7.mo2875L(iM14108v3), ik8VarMo2873e7.isNull(iM14108v4) ? null : ik8VarMo2873e7.mo2875L(iM14108v4)));
                        break;
                    }
                    return arrayList2;
                } finally {
                    ik8VarMo2873e7.close();
                }
            case 8:
                bk8 bk8Var9 = (bk8) obj;
                bk8Var9.getClass();
                ik8 ik8VarMo2873e8 = bk8Var9.mo2873e0("SELECT `id`, `title`, `image`, `startedAt` FROM (SELECT * FROM ChatHistoryEntity INNER JOIN SearchChatHistoryJoin ON ChatHistoryEntity.id = SearchChatHistoryJoin.chatId WHERE SearchChatHistoryJoin.`query` = ? AND targetLanguage = ? ORDER BY startedAt DESC)");
                try {
                    ik8VarMo2873e8.mo2874C(1, str2);
                    ik8VarMo2873e8.mo2874C(2, str);
                    ArrayList arrayList3 = new ArrayList();
                    while (ik8VarMo2873e8.mo2876a0()) {
                        arrayList3.add(new ChatHistoryOld(ik8VarMo2873e8.mo2875L(1), (int) ik8VarMo2873e8.getLong(0), ik8VarMo2873e8.mo2875L(2), ik8VarMo2873e8.mo2875L(3)));
                    }
                    ik8VarMo2873e8.close();
                    return arrayList3;
                } catch (Throwable th2) {
                    ik8VarMo2873e8.close();
                    throw th2;
                }
            case 9:
                bk8 bk8Var10 = (bk8) obj;
                bk8Var10.getClass();
                ik8 ik8VarMo2873e9 = bk8Var10.mo2873e0("SELECT `id`, `title` FROM (\n        SELECT LibraryDataEntity.* FROM LibraryDataEntity\n        INNER JOIN CoursesAndLanguageJoin ON CoursesAndLanguageJoin.pk = LibraryDataEntity.id\n        WHERE LibraryDataEntity.type = ? AND CoursesAndLanguageJoin.language = ?\n        )");
                try {
                    ik8VarMo2873e9.mo2874C(1, str2);
                    ik8VarMo2873e9.mo2874C(2, str);
                    int iM14108v5 = AbstractC3122is.m14108v(ik8VarMo2873e9, "id");
                    int iM14108v6 = AbstractC3122is.m14108v(ik8VarMo2873e9, "title");
                    ArrayList arrayList4 = new ArrayList();
                    while (ik8VarMo2873e9.mo2876a0()) {
                        arrayList4.add(new pya((int) ik8VarMo2873e9.getLong(iM14108v5), ik8VarMo2873e9.isNull(iM14108v6) ? null : ik8VarMo2873e9.mo2875L(iM14108v6)));
                        break;
                    }
                    return arrayList4;
                } finally {
                    ik8VarMo2873e9.close();
                }
            case 10:
                bk8 bk8Var11 = (bk8) obj;
                bk8Var11.getClass();
                ik8 ik8VarMo2873e10 = bk8Var11.mo2873e0("\n    SELECT DISTINCT DictionaryDataEntity.* FROM DictionaryDataEntity, LanguageContextEntity\n    INNER JOIN LanguageAvailableDictionaryJoin ON LanguageAvailableDictionaryJoin.code = LanguageContextEntity.code\n    AND LanguageAvailableDictionaryJoin.id = DictionaryDataEntity.id\n    WHERE DictionaryDataEntity.languageTo = ? and LanguageContextEntity.code = ? and DictionaryDataEntity.`order` = - 1 ORDER BY DictionaryDataEntity.name COLLATE NOCASE");
                try {
                    ik8VarMo2873e10.mo2874C(1, str2);
                    ik8VarMo2873e10.mo2874C(2, str);
                    int iM14108v7 = AbstractC3122is.m14108v(ik8VarMo2873e10, "id");
                    int iM14108v8 = AbstractC3122is.m14108v(ik8VarMo2873e10, "name");
                    int iM14108v9 = AbstractC3122is.m14108v(ik8VarMo2873e10, "order");
                    int iM14108v10 = AbstractC3122is.m14108v(ik8VarMo2873e10, "urlToTransform");
                    int iM14108v11 = AbstractC3122is.m14108v(ik8VarMo2873e10, "urlDefinition");
                    int iM14108v12 = AbstractC3122is.m14108v(ik8VarMo2873e10, "isPopUpWindow");
                    int iM14108v13 = AbstractC3122is.m14108v(ik8VarMo2873e10, "languageTo");
                    int iM14108v14 = AbstractC3122is.m14108v(ik8VarMo2873e10, "urlVar1");
                    int iM14108v15 = AbstractC3122is.m14108v(ik8VarMo2873e10, "urlVar2");
                    int iM14108v16 = AbstractC3122is.m14108v(ik8VarMo2873e10, "urlVar3");
                    int iM14108v17 = AbstractC3122is.m14108v(ik8VarMo2873e10, "urlVar4");
                    int iM14108v18 = AbstractC3122is.m14108v(ik8VarMo2873e10, "urlVar5");
                    int iM14108v19 = AbstractC3122is.m14108v(ik8VarMo2873e10, "overrideUrl");
                    ArrayList arrayList5 = new ArrayList();
                    while (ik8VarMo2873e10.mo2876a0()) {
                        iM14108v11 = iM14108v11;
                        int i6 = iM14108v8;
                        int i7 = iM14108v9;
                        arrayList5.add(new DictionaryData((int) ik8VarMo2873e10.getLong(iM14108v7), ik8VarMo2873e10.mo2875L(iM14108v8), (int) ik8VarMo2873e10.getLong(iM14108v9), ik8VarMo2873e10.mo2875L(iM14108v10), ik8VarMo2873e10.mo2875L(iM14108v11), ((int) ik8VarMo2873e10.getLong(iM14108v12)) != 0, ik8VarMo2873e10.mo2875L(iM14108v13), ik8VarMo2873e10.mo2875L(iM14108v14), ik8VarMo2873e10.mo2875L(iM14108v15), ik8VarMo2873e10.mo2875L(iM14108v16), ik8VarMo2873e10.mo2875L(iM14108v17), ik8VarMo2873e10.mo2875L(iM14108v18), ik8VarMo2873e10.mo2875L(iM14108v19)));
                        iM14108v8 = i6;
                        iM14108v9 = i7;
                    }
                    ik8VarMo2873e10.close();
                    return arrayList5;
                } catch (Throwable th3) {
                    ik8VarMo2873e10.close();
                    throw th3;
                }
            case 11:
                tv8 tv8Var = (tv8) obj;
                tv8Var.getClass();
                AbstractC0426f.m1860d(tv8Var, str2 + ": " + str);
                return xfaVar;
            case 12:
                return m16780d(obj);
            case 13:
                bk8 bk8Var12 = (bk8) obj;
                bk8Var12.getClass();
                ik8 ik8VarMo2873e11 = bk8Var12.mo2873e0("SELECT `id`, `photo`, `username`, `role` FROM (\n    SELECT DISTINCT * FROM SharedByUserEntity \n    WHERE id IN (\n        SELECT userId FROM SharedByUserAndQueryJoin WHERE `query` = ? AND language = ?\n    ) \n    LIMIT ?\n  )");
                try {
                    ik8VarMo2873e11.mo2874C(1, str2);
                    ik8VarMo2873e11.mo2874C(2, str);
                    ik8VarMo2873e11.mo2878j(3, 25L);
                    ArrayList arrayList6 = new ArrayList();
                    while (ik8VarMo2873e11.mo2876a0()) {
                        arrayList6.add(new CollectionsFilter(ik8VarMo2873e11.mo2875L(2), (int) ik8VarMo2873e11.getLong(0), ik8VarMo2873e11.mo2875L(1), ik8VarMo2873e11.isNull(3) ? null : ik8VarMo2873e11.mo2875L(3)));
                        break;
                    }
                    return arrayList6;
                } finally {
                    ik8VarMo2873e11.close();
                }
            case 14:
                bk8 bk8Var13 = (bk8) obj;
                bk8Var13.getClass();
                ik8 ik8VarMo2873e12 = bk8Var13.mo2873e0("SELECT `id`, `title` FROM (\n    SELECT DISTINCT LibraryDataEntity.* FROM LibraryDataEntity\n    INNER JOIN LibraryShelfAndContentJoin ON LibraryDataEntity.id = LibraryShelfAndContentJoin.id\n    WHERE LibraryShelfAndContentJoin.codeWithLanguage = ? AND LibraryDataEntity.type = ?\n    ORDER BY LibraryShelfAndContentJoin.`order` ASC \n    LIMIT ?\n  )");
                try {
                    ik8VarMo2873e12.mo2874C(1, str2);
                    ik8VarMo2873e12.mo2874C(2, str);
                    ik8VarMo2873e12.mo2878j(3, 50L);
                    int iM14108v20 = AbstractC3122is.m14108v(ik8VarMo2873e12, "id");
                    int iM14108v21 = AbstractC3122is.m14108v(ik8VarMo2873e12, "title");
                    ArrayList arrayList7 = new ArrayList();
                    while (ik8VarMo2873e12.mo2876a0()) {
                        arrayList7.add(new wya((int) ik8VarMo2873e12.getLong(iM14108v20), ik8VarMo2873e12.isNull(iM14108v21) ? null : ik8VarMo2873e12.mo2875L(iM14108v21)));
                        break;
                    }
                    return arrayList7;
                } finally {
                    ik8VarMo2873e12.close();
                }
            case 15:
                bk8 bk8Var14 = (bk8) obj;
                bk8Var14.getClass();
                ik8 ik8VarMo2873e13 = bk8Var14.mo2873e0("UPDATE OR REPLACE PlaylistAndLessonsJoin SET nameWithLanguage = ? WHERE nameWithLanguage = ?");
                try {
                    ik8VarMo2873e13.mo2874C(1, str2);
                    ik8VarMo2873e13.mo2874C(2, str);
                    ik8VarMo2873e13.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e13.close();
                }
            case 16:
                bk8 bk8Var15 = (bk8) obj;
                bk8Var15.getClass();
                ik8 ik8VarMo2873e14 = bk8Var15.mo2873e0("\n    SELECT * FROM LibraryFastSearchEntity \n    WHERE language = ? AND `query` = ? \n    AND type != \"collection\" AND type != \"content\" \n  ");
                try {
                    ik8VarMo2873e14.mo2874C(1, str2);
                    ik8VarMo2873e14.mo2874C(2, str);
                    int iM14108v22 = AbstractC3122is.m14108v(ik8VarMo2873e14, "id");
                    int iM14108v23 = AbstractC3122is.m14108v(ik8VarMo2873e14, "language");
                    int iM14108v24 = AbstractC3122is.m14108v(ik8VarMo2873e14, "query");
                    int iM14108v25 = AbstractC3122is.m14108v(ik8VarMo2873e14, "type");
                    int iM14108v26 = AbstractC3122is.m14108v(ik8VarMo2873e14, "title");
                    ArrayList arrayList8 = new ArrayList();
                    while (ik8VarMo2873e14.mo2876a0()) {
                        arrayList8.add(new LibraryFastSearchEntity(ik8VarMo2873e14.mo2875L(iM14108v22), ik8VarMo2873e14.mo2875L(iM14108v23), ik8VarMo2873e14.mo2875L(iM14108v24), ik8VarMo2873e14.mo2875L(iM14108v25), ik8VarMo2873e14.isNull(iM14108v26) ? null : ik8VarMo2873e14.mo2875L(iM14108v26)));
                        break;
                    }
                    return arrayList8;
                } finally {
                    ik8VarMo2873e14.close();
                }
            default:
                bk8 bk8Var16 = (bk8) obj;
                bk8Var16.getClass();
                ik8 ik8VarMo2873e15 = bk8Var16.mo2873e0("SELECT `id`, `roseGiven`, `progress`, `listenTimes`, `readTimes`, `isTaken`, `difficulty`, `rosesCount`, `newWordsCount`, `knownWordsCount`, `cardsCount`, `lessonsCount`, `isCompletelyTaken`, `totalWordsCount`, `uniqueWordsCount`, `audioStart`, `audioEnd` FROM (\n      SELECT * FROM LibraryCounterEntity WHERE id in (\n        SELECT id FROM LibraryFastSearchEntity \n        WHERE LibraryFastSearchEntity.language = ? AND LibraryFastSearchEntity.`query` = ? \n        AND LibraryFastSearchEntity.type = \"content\"\n      )\n    )");
                try {
                    ik8VarMo2873e15.mo2874C(1, str2);
                    ik8VarMo2873e15.mo2874C(2, str);
                    ArrayList arrayList9 = new ArrayList();
                    while (ik8VarMo2873e15.mo2876a0()) {
                        arrayList9.add(new LibraryItemCounter((int) ik8VarMo2873e15.getLong(0), ((int) ik8VarMo2873e15.getLong(1)) != 0, ik8VarMo2873e15.isNull(2) ? null : Float.valueOf((float) ik8VarMo2873e15.getDouble(2)), ik8VarMo2873e15.isNull(3) ? null : Double.valueOf(ik8VarMo2873e15.getDouble(3)), ik8VarMo2873e15.isNull(i5) ? null : Double.valueOf(ik8VarMo2873e15.getDouble(i5)), ((int) ik8VarMo2873e15.getLong(i4)) != 0, (float) ik8VarMo2873e15.getDouble(i3), (int) ik8VarMo2873e15.getLong(i2), (int) ik8VarMo2873e15.getLong(11), (int) ik8VarMo2873e15.getLong(8), (int) ik8VarMo2873e15.getLong(9), (int) ik8VarMo2873e15.getLong(10), ((int) ik8VarMo2873e15.getLong(12)) != 0, (int) ik8VarMo2873e15.getLong(13), (int) ik8VarMo2873e15.getLong(14), ik8VarMo2873e15.isNull(15) ? null : Double.valueOf(ik8VarMo2873e15.getDouble(15)), ik8VarMo2873e15.isNull(16) ? null : Double.valueOf(ik8VarMo2873e15.getDouble(16))));
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        i5 = 4;
                        break;
                    }
                    return arrayList9;
                } finally {
                    ik8VarMo2873e15.close();
                }
        }
    }
}
