package p000;

import com.lingq.core.domain.model.chat.ChatStats;
import com.lingq.core.domain.model.lesson.LessonBookmark;
import com.lingq.core.domain.model.lesson.LessonCompleteNext;
import com.lingq.core.domain.model.lesson.LessonStats;
import com.lingq.core.domain.model.lesson.LessonsSimplified;
import com.lingq.core.domain.model.library.C1469k;
import com.lingq.core.domain.model.library.LibrarySearchQuery;
import com.lingq.core.domain.model.playlist.Playlist;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mv0 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f51875a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f51876b;

    public /* synthetic */ mv0(int i, int i2) {
        this.f51875a = i2;
        this.f51876b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        int i = this.f51875a;
        xfa xfaVar = xfa.f68157a;
        Object by4Var = null;
        int i2 = this.f51876b;
        switch (i) {
            case 0:
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("DELETE FROM ChatHistoryEntity WHERE id = ?");
                try {
                    ik8VarMo2873e0.mo2878j(1, i2);
                    ik8VarMo2873e0.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e0.close();
                }
            case 1:
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                ik8 ik8VarMo2873e1 = bk8Var2.mo2873e0("SELECT `sentences`, `knownWords`, `totalWords`, `uniqueWords`, `cards`, `coins` FROM (SELECT * FROM ChatStatsEntity WHERE id = ?)");
                try {
                    ik8VarMo2873e1.mo2878j(1, i2);
                    return ik8VarMo2873e1.mo2876a0() ? new ChatStats((int) ik8VarMo2873e1.getLong(0), (int) ik8VarMo2873e1.getLong(1), (int) ik8VarMo2873e1.getLong(2), (int) ik8VarMo2873e1.getLong(3), (int) ik8VarMo2873e1.getLong(4), ik8VarMo2873e1.getDouble(5)) : null;
                } finally {
                    ik8VarMo2873e1.close();
                }
            case 2:
                bk8 bk8Var3 = (bk8) obj;
                bk8Var3.getClass();
                ik8 ik8VarMo2873e2 = bk8Var3.mo2873e0("SELECT coach.*, t.translation AS translation FROM LessonCoachChatEntity coach LEFT JOIN ChatMessageTranslationEntity t ON t.chatId = coach.chatId AND t.messageIndex = coach.messageIndex WHERE coach.lessonId = ?");
                try {
                    ik8VarMo2873e2.mo2878j(1, i2);
                    int iM14108v = AbstractC3122is.m14108v(ik8VarMo2873e2, "lessonId");
                    int iM14108v2 = AbstractC3122is.m14108v(ik8VarMo2873e2, "chatId");
                    int iM14108v3 = AbstractC3122is.m14108v(ik8VarMo2873e2, "messageIndex");
                    int iM14108v4 = AbstractC3122is.m14108v(ik8VarMo2873e2, "message");
                    int iM14108v5 = AbstractC3122is.m14108v(ik8VarMo2873e2, "translation");
                    if (ik8VarMo2873e2.mo2876a0()) {
                        by4Var = new by4(new ay4((int) ik8VarMo2873e2.getLong(iM14108v), (int) ik8VarMo2873e2.getLong(iM14108v2), (int) ik8VarMo2873e2.getLong(iM14108v3), ik8VarMo2873e2.mo2875L(iM14108v4)), ik8VarMo2873e2.isNull(iM14108v5) ? null : ik8VarMo2873e2.mo2875L(iM14108v5));
                    }
                    return by4Var;
                } finally {
                    ik8VarMo2873e2.close();
                }
            case 3:
                bk8 bk8Var4 = (bk8) obj;
                bk8Var4.getClass();
                ik8 ik8VarMo2873e3 = bk8Var4.mo2873e0("SELECT DISTINCT * FROM LessonBookmarkEntity WHERE contentId = ?");
                try {
                    ik8VarMo2873e3.mo2878j(1, i2);
                    int iM14108v6 = AbstractC3122is.m14108v(ik8VarMo2873e3, "contentId");
                    int iM14108v7 = AbstractC3122is.m14108v(ik8VarMo2873e3, "wordIndex");
                    int iM14108v8 = AbstractC3122is.m14108v(ik8VarMo2873e3, "completedWordIndex");
                    int iM14108v9 = AbstractC3122is.m14108v(ik8VarMo2873e3, "audioPosition");
                    int iM14108v10 = AbstractC3122is.m14108v(ik8VarMo2873e3, "client");
                    int iM14108v11 = AbstractC3122is.m14108v(ik8VarMo2873e3, "timestamp");
                    int iM14108v12 = AbstractC3122is.m14108v(ik8VarMo2873e3, "languageTimestamp");
                    if (ik8VarMo2873e3.mo2876a0()) {
                        by4Var = new LessonBookmark((int) ik8VarMo2873e3.getLong(iM14108v6), ik8VarMo2873e3.isNull(iM14108v9) ? null : Double.valueOf(ik8VarMo2873e3.getDouble(iM14108v9)), ik8VarMo2873e3.isNull(iM14108v7) ? null : Integer.valueOf((int) ik8VarMo2873e3.getLong(iM14108v7)), ik8VarMo2873e3.isNull(iM14108v8) ? null : Integer.valueOf((int) ik8VarMo2873e3.getLong(iM14108v8)), ik8VarMo2873e3.isNull(iM14108v10) ? null : ik8VarMo2873e3.mo2875L(iM14108v10), ik8VarMo2873e3.isNull(iM14108v11) ? null : ik8VarMo2873e3.mo2875L(iM14108v11), ik8VarMo2873e3.isNull(iM14108v12) ? null : ik8VarMo2873e3.mo2875L(iM14108v12));
                    }
                    return by4Var;
                } finally {
                    ik8VarMo2873e3.close();
                }
            case 4:
                bk8 bk8Var5 = (bk8) obj;
                bk8Var5.getClass();
                ik8 ik8VarMo2873e4 = bk8Var5.mo2873e0("SELECT `id`, `title`, `image`, `sourceType`, `sourceName`, `sourceUrl`, `status` FROM (SELECT * FROM LessonNextSuggestionEntity WHERE lessonId = ?)");
                try {
                    ik8VarMo2873e4.mo2878j(1, i2);
                    ArrayList arrayList = new ArrayList();
                    while (ik8VarMo2873e4.mo2876a0()) {
                        arrayList.add(new LessonCompleteNext((int) ik8VarMo2873e4.getLong(0), ik8VarMo2873e4.mo2875L(1), ik8VarMo2873e4.isNull(2) ? null : ik8VarMo2873e4.mo2875L(2), ik8VarMo2873e4.isNull(6) ? null : ik8VarMo2873e4.mo2875L(6), ik8VarMo2873e4.isNull(3) ? null : ik8VarMo2873e4.mo2875L(3), ik8VarMo2873e4.isNull(4) ? null : ik8VarMo2873e4.mo2875L(4), ik8VarMo2873e4.isNull(5) ? null : ik8VarMo2873e4.mo2875L(5)));
                        break;
                    }
                    return arrayList;
                } finally {
                    ik8VarMo2873e4.close();
                }
            case 5:
                bk8 bk8Var6 = (bk8) obj;
                bk8Var6.getClass();
                ik8 ik8VarMo2873e5 = bk8Var6.mo2873e0("SELECT DISTINCT * FROM LessonStatsEntity WHERE contentId = ?");
                try {
                    ik8VarMo2873e5.mo2878j(1, i2);
                    return ik8VarMo2873e5.mo2876a0() ? new LessonStats((int) ik8VarMo2873e5.getLong(AbstractC3122is.m14108v(ik8VarMo2873e5, "contentId")), ik8VarMo2873e5.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e5, "readWords")), ik8VarMo2873e5.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e5, "lingqsCreated")), ik8VarMo2873e5.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e5, "knownWords")), ik8VarMo2873e5.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e5, "listeningTime")), ik8VarMo2873e5.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e5, "coinsNew")), ik8VarMo2873e5.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e5, "earnedCoins")), ik8VarMo2873e5.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e5, "studyTime")), ik8VarMo2873e5.getDouble(AbstractC3122is.m14108v(ik8VarMo2873e5, "wpm"))) : null;
                } finally {
                    ik8VarMo2873e5.close();
                }
            case 6:
                bk8 bk8Var7 = (bk8) obj;
                bk8Var7.getClass();
                ik8 ik8VarMo2873e6 = bk8Var7.mo2873e0("SELECT * FROM LessonSentenceTranslationEntity WHERE lessonId = ? ORDER BY sentenceIndex");
                try {
                    ik8VarMo2873e6.mo2878j(1, i2);
                    int iM14108v13 = AbstractC3122is.m14108v(ik8VarMo2873e6, "lessonId");
                    int iM14108v14 = AbstractC3122is.m14108v(ik8VarMo2873e6, "sentenceIndex");
                    int iM14108v15 = AbstractC3122is.m14108v(ik8VarMo2873e6, "text");
                    ArrayList arrayList2 = new ArrayList();
                    while (ik8VarMo2873e6.mo2876a0()) {
                        arrayList2.add(new j65((int) ik8VarMo2873e6.getLong(iM14108v13), ik8VarMo2873e6.mo2875L(iM14108v15), (int) ik8VarMo2873e6.getLong(iM14108v14)));
                    }
                    ik8VarMo2873e6.close();
                    return arrayList2;
                } catch (Throwable th) {
                    ik8VarMo2873e6.close();
                    throw th;
                }
            case 7:
                bk8 bk8Var8 = (bk8) obj;
                bk8Var8.getClass();
                ik8 ik8VarMo2873e7 = bk8Var8.mo2873e0("SELECT * FROM LessonsSimplifiedJoin WHERE fromId = ?");
                try {
                    ik8VarMo2873e7.mo2878j(1, i2);
                    int iM14108v16 = AbstractC3122is.m14108v(ik8VarMo2873e7, "fromId");
                    int iM14108v17 = AbstractC3122is.m14108v(ik8VarMo2873e7, "toId");
                    int iM14108v18 = AbstractC3122is.m14108v(ik8VarMo2873e7, "isLocked");
                    if (ik8VarMo2873e7.mo2876a0()) {
                        by4Var = new LessonsSimplified((int) ik8VarMo2873e7.getLong(iM14108v16), ik8VarMo2873e7.isNull(iM14108v17) ? null : Integer.valueOf((int) ik8VarMo2873e7.getLong(iM14108v17)), ((int) ik8VarMo2873e7.getLong(iM14108v18)) != 0);
                    }
                    return by4Var;
                } finally {
                    ik8VarMo2873e7.close();
                }
            case 8:
                bk8 bk8Var9 = (bk8) obj;
                bk8Var9.getClass();
                ik8 ik8VarMo2873e8 = bk8Var9.mo2873e0("DELETE FROM LessonSentenceEntity WHERE lessonId = ?");
                try {
                    ik8VarMo2873e8.mo2878j(1, i2);
                    ik8VarMo2873e8.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e8.close();
                }
            case 9:
                bk8 bk8Var10 = (bk8) obj;
                bk8Var10.getClass();
                ik8 ik8VarMo2873e9 = bk8Var10.mo2873e0("SELECT * FROM LessonBookmarkEntity WHERE contentId = ?");
                try {
                    ik8VarMo2873e9.mo2878j(1, i2);
                    int iM14108v19 = AbstractC3122is.m14108v(ik8VarMo2873e9, "contentId");
                    int iM14108v20 = AbstractC3122is.m14108v(ik8VarMo2873e9, "wordIndex");
                    int iM14108v21 = AbstractC3122is.m14108v(ik8VarMo2873e9, "completedWordIndex");
                    int iM14108v22 = AbstractC3122is.m14108v(ik8VarMo2873e9, "audioPosition");
                    int iM14108v23 = AbstractC3122is.m14108v(ik8VarMo2873e9, "client");
                    int iM14108v24 = AbstractC3122is.m14108v(ik8VarMo2873e9, "timestamp");
                    int iM14108v25 = AbstractC3122is.m14108v(ik8VarMo2873e9, "languageTimestamp");
                    if (ik8VarMo2873e9.mo2876a0()) {
                        by4Var = new LessonBookmark((int) ik8VarMo2873e9.getLong(iM14108v19), ik8VarMo2873e9.isNull(iM14108v22) ? null : Double.valueOf(ik8VarMo2873e9.getDouble(iM14108v22)), ik8VarMo2873e9.isNull(iM14108v20) ? null : Integer.valueOf((int) ik8VarMo2873e9.getLong(iM14108v20)), ik8VarMo2873e9.isNull(iM14108v21) ? null : Integer.valueOf((int) ik8VarMo2873e9.getLong(iM14108v21)), ik8VarMo2873e9.isNull(iM14108v23) ? null : ik8VarMo2873e9.mo2875L(iM14108v23), ik8VarMo2873e9.isNull(iM14108v24) ? null : ik8VarMo2873e9.mo2875L(iM14108v24), ik8VarMo2873e9.isNull(iM14108v25) ? null : ik8VarMo2873e9.mo2875L(iM14108v25));
                    }
                    return by4Var;
                } finally {
                    ik8VarMo2873e9.close();
                }
            case 10:
                bk8 bk8Var11 = (bk8) obj;
                bk8Var11.getClass();
                ik8 ik8VarMo2873e10 = bk8Var11.mo2873e0("DELETE FROM LessonsAndWordsJoin WHERE contentId = ?");
                try {
                    ik8VarMo2873e10.mo2878j(1, i2);
                    ik8VarMo2873e10.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e10.close();
                }
            case 11:
                bk8 bk8Var12 = (bk8) obj;
                bk8Var12.getClass();
                ik8 ik8VarMo2873e11 = bk8Var12.mo2873e0("DELETE FROM LessonsAndCardsJoin WHERE contentId = ?");
                try {
                    ik8VarMo2873e11.mo2878j(1, i2);
                    ik8VarMo2873e11.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e11.close();
                }
            case 12:
                bk8 bk8Var13 = (bk8) obj;
                bk8Var13.getClass();
                ik8 ik8VarMo2873e12 = bk8Var13.mo2873e0("SELECT fromId FROM LessonsSimplifiedJoin WHERE toId = ?");
                try {
                    ik8VarMo2873e12.mo2878j(1, i2);
                    if (ik8VarMo2873e12.mo2876a0() && !ik8VarMo2873e12.isNull(0)) {
                        by4Var = Integer.valueOf((int) ik8VarMo2873e12.getLong(0));
                        break;
                    }
                    return by4Var;
                } finally {
                    ik8VarMo2873e12.close();
                }
            case 13:
                bk8 bk8Var14 = (bk8) obj;
                bk8Var14.getClass();
                ik8 ik8VarMo2873e13 = bk8Var14.mo2873e0("SELECT contentId FROM LessonsAndWordsJoin WHERE contentId = ? LIMIT 1");
                try {
                    ik8VarMo2873e13.mo2878j(1, i2);
                    if (ik8VarMo2873e13.mo2876a0() && !ik8VarMo2873e13.isNull(0)) {
                        by4Var = Integer.valueOf((int) ik8VarMo2873e13.getLong(0));
                        break;
                    }
                    return by4Var;
                } finally {
                    ik8VarMo2873e13.close();
                }
            case 14:
                bk8 bk8Var15 = (bk8) obj;
                bk8Var15.getClass();
                ik8 ik8VarMo2873e14 = bk8Var15.mo2873e0("SELECT preview FROM LessonPreviewEntity WHERE lessonId = ?");
                try {
                    ik8VarMo2873e14.mo2878j(1, i2);
                    if (ik8VarMo2873e14.mo2876a0() && !ik8VarMo2873e14.isNull(0)) {
                        by4Var = ik8VarMo2873e14.mo2875L(0);
                        break;
                    }
                    return by4Var;
                } finally {
                    ik8VarMo2873e14.close();
                }
            case 15:
                bk8 bk8Var16 = (bk8) obj;
                bk8Var16.getClass();
                ik8 ik8VarMo2873e15 = bk8Var16.mo2873e0("DELETE FROM LessonNextSuggestionEntity WHERE lessonId = ?");
                try {
                    ik8VarMo2873e15.mo2878j(1, i2);
                    ik8VarMo2873e15.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e15.close();
                }
            case 16:
                bk8 bk8Var17 = (bk8) obj;
                bk8Var17.getClass();
                ik8 ik8VarMo2873e16 = bk8Var17.mo2873e0("UPDATE LibraryDownloadEntity SET isDownloaded = 1 WHERE id = ?");
                try {
                    ik8VarMo2873e16.mo2878j(1, i2);
                    ik8VarMo2873e16.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e16.close();
                }
            case 17:
                bk8 bk8Var18 = (bk8) obj;
                bk8Var18.getClass();
                ik8 ik8VarMo2873e17 = bk8Var18.mo2873e0("UPDATE LibraryShelfEntity SET `order` = (`order` + 1) WHERE `order` < ? AND (pinned IS NULL OR pinned = 0)");
                try {
                    ik8VarMo2873e17.mo2878j(1, i2);
                    ik8VarMo2873e17.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e17.close();
                }
            case 18:
                bk8 bk8Var19 = (bk8) obj;
                bk8Var19.getClass();
                ik8 ik8VarMo2873e18 = bk8Var19.mo2873e0("UPDATE LibraryShelfEntity SET `order` = (`order` - 1) WHERE `order` > ? AND pinned = 1");
                try {
                    ik8VarMo2873e18.mo2878j(1, i2);
                    ik8VarMo2873e18.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e18.close();
                }
            case 19:
                bk8 bk8Var20 = (bk8) obj;
                bk8Var20.getClass();
                ik8 ik8VarMo2873e19 = bk8Var20.mo2873e0("SELECT `nameWithLanguage`, `language`, `name`, `pk`, `isDefault`, `isFeatured` FROM (SELECT * FROM PlaylistEntity WHERE PlaylistEntity.pk = ?)");
                try {
                    ik8VarMo2873e19.mo2878j(1, i2);
                    if (ik8VarMo2873e19.mo2876a0()) {
                        by4Var = new Playlist((int) ik8VarMo2873e19.getLong(3), ik8VarMo2873e19.mo2875L(0), ik8VarMo2873e19.mo2875L(1), ik8VarMo2873e19.mo2875L(2), ((int) ik8VarMo2873e19.getLong(4)) != 0, ((int) ik8VarMo2873e19.getLong(5)) != 0);
                    }
                    return by4Var;
                } finally {
                    ik8VarMo2873e19.close();
                }
            case 20:
                LibrarySearchQuery librarySearchQuery = (LibrarySearchQuery) obj;
                librarySearchQuery.getClass();
                LibrarySearchQuery.Companion.getClass();
                return LibrarySearchQuery.m8091a(librarySearchQuery, null, C1469k.m8095a(i2, i2), null, null, null, null, null, false, 8189);
            case 21:
                n1b n1bVar = (n1b) obj;
                n1bVar.getClass();
                return n1b.m17171a(n1bVar, null, null, null, r0b.m20229a(n1bVar.f52194d, i2 + 1, 0, 30), null, false, false, false, false, null, null, 2039);
            case 22:
                n1b n1bVar2 = (n1b) obj;
                n1bVar2.getClass();
                return n1b.m17171a(n1bVar2, null, null, null, r0b.m20229a(n1bVar2.f52194d, i2 - 1, 0, 30), null, false, false, false, false, null, null, 2039);
            default:
                n1b n1bVar3 = (n1b) obj;
                n1bVar3.getClass();
                return n1b.m17171a(n1bVar3, null, null, null, r0b.m20229a(n1bVar3.f52194d, i2, 0, 30), null, false, false, false, false, null, null, 2039);
        }
    }
}
