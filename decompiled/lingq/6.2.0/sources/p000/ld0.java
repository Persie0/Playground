package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.database.entity.ChatSuggestionEntity;
import com.lingq.core.database.entity.PlaylistEntity;
import com.lingq.core.domain.model.language.DictionaryData;
import com.lingq.core.domain.model.library.LibraryItemCounter;
import com.lingq.core.domain.model.milestones.Milestone;
import com.lingq.core.domain.model.playlist.Playlist;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ld0 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49491a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f49492b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f49493c;

    public /* synthetic */ ld0(int i, String str, int i2) {
        this.f49491a = i2;
        this.f49492b = i;
        this.f49493c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    private final Object m16093d(Object obj) throws Exception {
        String str = this.f49493c;
        int i = this.f49492b;
        bk8 bk8Var = (bk8) obj;
        bk8Var.getClass();
        ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT * FROM LessonAudioDownloadEntity WHERE language = ? AND id = ?");
        try {
            ik8VarMo2873e0.mo2874C(1, str);
            ik8VarMo2873e0.mo2878j(2, i);
            int iM14108v = AbstractC3122is.m14108v(ik8VarMo2873e0, "id");
            int iM14108v2 = AbstractC3122is.m14108v(ik8VarMo2873e0, "language");
            int iM14108v3 = AbstractC3122is.m14108v(ik8VarMo2873e0, "isDownloaded");
            int iM14108v4 = AbstractC3122is.m14108v(ik8VarMo2873e0, "downloadProgress");
            int iM14108v5 = AbstractC3122is.m14108v(ik8VarMo2873e0, "status");
            int iM14108v6 = AbstractC3122is.m14108v(ik8VarMo2873e0, "errorType");
            int iM14108v7 = AbstractC3122is.m14108v(ik8VarMo2873e0, "lastUpdated");
            Object sx4Var = null;
            if (ik8VarMo2873e0.mo2876a0()) {
                sx4Var = new sx4((int) ik8VarMo2873e0.getLong(iM14108v), ik8VarMo2873e0.mo2875L(iM14108v2), ((int) ik8VarMo2873e0.getLong(iM14108v3)) != 0, (int) ik8VarMo2873e0.getLong(iM14108v4), ik8VarMo2873e0.mo2875L(iM14108v5), ik8VarMo2873e0.isNull(iM14108v6) ? null : ik8VarMo2873e0.mo2875L(iM14108v6), ik8VarMo2873e0.getLong(iM14108v7));
            }
            return sx4Var;
        } finally {
            ik8VarMo2873e0.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    private final Object m16094g(Object obj) throws Exception {
        int i = this.f49492b;
        String str = this.f49493c;
        bk8 bk8Var = (bk8) obj;
        bk8Var.getClass();
        ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT * FROM PlaylistAndLessonsJoin WHERE contentId = ? AND nameWithLanguage = ? AND isCourse = 1");
        try {
            ik8VarMo2873e0.mo2878j(1, i);
            ik8VarMo2873e0.mo2874C(2, str);
            int iM14108v = AbstractC3122is.m14108v(ik8VarMo2873e0, "nameWithLanguage");
            int iM14108v2 = AbstractC3122is.m14108v(ik8VarMo2873e0, "language");
            int iM14108v3 = AbstractC3122is.m14108v(ik8VarMo2873e0, "contentId");
            int iM14108v4 = AbstractC3122is.m14108v(ik8VarMo2873e0, "order");
            int iM14108v5 = AbstractC3122is.m14108v(ik8VarMo2873e0, "isCourse");
            Object bd7Var = null;
            if (ik8VarMo2873e0.mo2876a0()) {
                bd7Var = new bd7((int) ik8VarMo2873e0.getLong(iM14108v3), ik8VarMo2873e0.isNull(iM14108v4) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(iM14108v4)), ik8VarMo2873e0.mo2875L(iM14108v), ik8VarMo2873e0.mo2875L(iM14108v2), ((int) ik8VarMo2873e0.getLong(iM14108v5)) != 0);
            }
            return bd7Var;
        } finally {
            ik8VarMo2873e0.close();
        }
    }

    /* JADX INFO: renamed from: j */
    private final Object m16095j(Object obj) throws Exception {
        String str = this.f49493c;
        int i = this.f49492b;
        bk8 bk8Var = (bk8) obj;
        bk8Var.getClass();
        ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("DELETE FROM PlaylistAndLessonsJoin WHERE nameWithLanguage = ? AND contentId = ? AND isCourse = 0");
        try {
            ik8VarMo2873e0.mo2874C(1, str);
            ik8VarMo2873e0.mo2878j(2, i);
            ik8VarMo2873e0.mo2876a0();
            return xfa.f68157a;
        } finally {
            ik8VarMo2873e0.close();
        }
    }

    /* JADX INFO: renamed from: k */
    private final Object m16096k(Object obj) throws Exception {
        Playlist playlist;
        int i = this.f49492b;
        String str = this.f49493c;
        bk8 bk8Var = (bk8) obj;
        bk8Var.getClass();
        ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT `nameWithLanguage`, `language`, `name`, `pk`, `isDefault`, `isFeatured` FROM (\n    SELECT PlaylistEntity.* FROM PlaylistEntity, LessonsWithPlaylistJoin \n    WHERE PlaylistEntity.pk == LessonsWithPlaylistJoin.playlistId \n    AND LessonsWithPlaylistJoin.contentId = ? AND PlaylistEntity.language =  ?)");
        try {
            ik8VarMo2873e0.mo2878j(1, i);
            ik8VarMo2873e0.mo2874C(2, str);
            int iM14108v = AbstractC3122is.m14108v(ik8VarMo2873e0, "nameWithLanguage");
            int iM14108v2 = AbstractC3122is.m14108v(ik8VarMo2873e0, "language");
            int iM14108v3 = AbstractC3122is.m14108v(ik8VarMo2873e0, "name");
            int iM14108v4 = AbstractC3122is.m14108v(ik8VarMo2873e0, "pk");
            int iM14108v5 = AbstractC3122is.m14108v(ik8VarMo2873e0, "isDefault");
            int iM14108v6 = AbstractC3122is.m14108v(ik8VarMo2873e0, "isFeatured");
            if (ik8VarMo2873e0.mo2876a0()) {
                playlist = new Playlist((int) ik8VarMo2873e0.getLong(iM14108v4), ik8VarMo2873e0.mo2875L(iM14108v), ik8VarMo2873e0.mo2875L(iM14108v2), ik8VarMo2873e0.mo2875L(iM14108v3), ((int) ik8VarMo2873e0.getLong(iM14108v5)) != 0, ((int) ik8VarMo2873e0.getLong(iM14108v6)) != 0);
            } else {
                playlist = null;
            }
            return playlist;
        } finally {
            ik8VarMo2873e0.close();
        }
    }

    /* JADX INFO: renamed from: l */
    private final Object m16097l(Object obj) throws Exception {
        String str = this.f49493c;
        int i = this.f49492b;
        bk8 bk8Var = (bk8) obj;
        bk8Var.getClass();
        ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("DELETE FROM PlaylistAndLessonsJoin WHERE language = ? AND contentId = ? AND isCourse = 1");
        try {
            ik8VarMo2873e0.mo2874C(1, str);
            ik8VarMo2873e0.mo2878j(2, i);
            ik8VarMo2873e0.mo2876a0();
            return xfa.f68157a;
        } finally {
            ik8VarMo2873e0.close();
        }
    }

    /* JADX INFO: renamed from: m */
    private final Object m16098m(Object obj) throws Exception {
        int i = this.f49492b;
        String str = this.f49493c;
        bk8 bk8Var = (bk8) obj;
        bk8Var.getClass();
        ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("UPDATE PlaylistAndLessonsJoin SET `order` = (`order` - 1) WHERE `order` > ? AND nameWithLanguage= ?");
        try {
            ik8VarMo2873e0.mo2878j(1, i);
            ik8VarMo2873e0.mo2874C(2, str);
            ik8VarMo2873e0.mo2876a0();
            return xfa.f68157a;
        } finally {
            ik8VarMo2873e0.close();
        }
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        DictionaryData dictionaryData;
        LibraryItemCounter libraryItemCounter;
        Playlist playlist;
        bd7 bd7Var;
        vd7 vd7Var;
        PlaylistEntity playlistEntity;
        vd7 vd7Var2;
        int i = this.f49491a;
        xfa xfaVar = xfa.f68157a;
        String str = this.f49493c;
        int i2 = this.f49492b;
        switch (i) {
            case 0:
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT COUNT(*) FROM CourseBlacklistEntity WHERE language = ? AND id = ?");
                try {
                    ik8VarMo2873e0.mo2874C(1, str);
                    ik8VarMo2873e0.mo2878j(2, i2);
                    int i3 = ik8VarMo2873e0.mo2876a0() ? (int) ik8VarMo2873e0.getLong(0) : 0;
                    ik8VarMo2873e0.close();
                    return Integer.valueOf(i3);
                } catch (Throwable th) {
                    ik8VarMo2873e0.close();
                    throw th;
                }
            case 1:
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                ik8 ik8VarMo2873e1 = bk8Var2.mo2873e0("DELETE FROM CourseBlacklistEntity WHERE id = ? AND language = ?");
                try {
                    ik8VarMo2873e1.mo2878j(1, i2);
                    ik8VarMo2873e1.mo2874C(2, str);
                    ik8VarMo2873e1.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e1.close();
                }
            case 2:
                bk8 bk8Var3 = (bk8) obj;
                bk8Var3.getClass();
                ik8 ik8VarMo2873e2 = bk8Var3.mo2873e0("SELECT * FROM ChatSuggestionEntity WHERE language = ? AND chatId = ? ORDER BY position ASC");
                try {
                    ik8VarMo2873e2.mo2874C(1, str);
                    ik8VarMo2873e2.mo2878j(2, i2);
                    int iM14108v = AbstractC3122is.m14108v(ik8VarMo2873e2, "language");
                    int iM14108v2 = AbstractC3122is.m14108v(ik8VarMo2873e2, "chatId");
                    int iM14108v3 = AbstractC3122is.m14108v(ik8VarMo2873e2, "position");
                    int iM14108v4 = AbstractC3122is.m14108v(ik8VarMo2873e2, "source");
                    int iM14108v5 = AbstractC3122is.m14108v(ik8VarMo2873e2, "target");
                    ArrayList arrayList = new ArrayList();
                    while (ik8VarMo2873e2.mo2876a0()) {
                        arrayList.add(new ChatSuggestionEntity((int) ik8VarMo2873e2.getLong(iM14108v2), (int) ik8VarMo2873e2.getLong(iM14108v3), ik8VarMo2873e2.mo2875L(iM14108v), ik8VarMo2873e2.mo2875L(iM14108v4), ik8VarMo2873e2.mo2875L(iM14108v5)));
                    }
                    ik8VarMo2873e2.close();
                    return arrayList;
                } catch (Throwable th2) {
                    ik8VarMo2873e2.close();
                    throw th2;
                }
            case 3:
                bk8 bk8Var4 = (bk8) obj;
                bk8Var4.getClass();
                ik8 ik8VarMo2873e3 = bk8Var4.mo2873e0("SELECT EXISTS(SELECT 1 FROM CollectionSubscriptionEntity WHERE id = ? AND language = ?)");
                try {
                    ik8VarMo2873e3.mo2878j(1, i2);
                    ik8VarMo2873e3.mo2874C(2, str);
                    return Boolean.valueOf(ik8VarMo2873e3.mo2876a0() && ((int) ik8VarMo2873e3.getLong(0)) != 0);
                } finally {
                    ik8VarMo2873e3.close();
                }
            case 4:
                bk8 bk8Var5 = (bk8) obj;
                bk8Var5.getClass();
                ik8 ik8VarMo2873e4 = bk8Var5.mo2873e0("DELETE FROM CollectionSubscriptionEntity WHERE id = ? AND language = ?");
                try {
                    ik8VarMo2873e4.mo2878j(1, i2);
                    ik8VarMo2873e4.mo2874C(2, str);
                    ik8VarMo2873e4.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e4.close();
                }
            case 5:
                bk8 bk8Var6 = (bk8) obj;
                bk8Var6.getClass();
                ik8 ik8VarMo2873e5 = bk8Var6.mo2873e0("\n    SELECT DISTINCT LibraryDataEntity.id, LibraryDataEntity.title\n    FROM LibraryDataEntity\n    INNER JOIN CoursesAndLessonsJoin ON LibraryDataEntity.id = CoursesAndLessonsJoin.contentId \n    WHERE CoursesAndLessonsJoin.pk = ? AND LibraryDataEntity.collectionId = ? AND LibraryDataEntity.type = ?\n    ORDER BY courseOrder ASC");
                long j = i2;
                try {
                    ik8VarMo2873e5.mo2878j(1, j);
                    ik8VarMo2873e5.mo2878j(2, j);
                    ik8VarMo2873e5.mo2874C(3, str);
                    ArrayList arrayList2 = new ArrayList();
                    while (ik8VarMo2873e5.mo2876a0()) {
                        arrayList2.add(new wya((int) ik8VarMo2873e5.getLong(0), ik8VarMo2873e5.isNull(1) ? null : ik8VarMo2873e5.mo2875L(1)));
                        break;
                    }
                    return arrayList2;
                } finally {
                    ik8VarMo2873e5.close();
                }
            case 6:
                bk8 bk8Var7 = (bk8) obj;
                bk8Var7.getClass();
                ik8 ik8VarMo2873e6 = bk8Var7.mo2873e0("\n    SELECT DISTINCT DictionaryDataEntity.* FROM DictionaryDataEntity\n    INNER JOIN LanguageActiveDictionaryJoin ON LanguageActiveDictionaryJoin.code = ?\n    AND LanguageActiveDictionaryJoin.id = DictionaryDataEntity.id\n    ORDER BY DictionaryDataEntity.`order` LIMIT 1 OFFSET ? ");
                try {
                    ik8VarMo2873e6.mo2874C(1, str);
                    ik8VarMo2873e6.mo2878j(2, i2);
                    int iM14108v6 = AbstractC3122is.m14108v(ik8VarMo2873e6, "id");
                    int iM14108v7 = AbstractC3122is.m14108v(ik8VarMo2873e6, "name");
                    int iM14108v8 = AbstractC3122is.m14108v(ik8VarMo2873e6, "order");
                    int iM14108v9 = AbstractC3122is.m14108v(ik8VarMo2873e6, "urlToTransform");
                    int iM14108v10 = AbstractC3122is.m14108v(ik8VarMo2873e6, "urlDefinition");
                    int iM14108v11 = AbstractC3122is.m14108v(ik8VarMo2873e6, "isPopUpWindow");
                    int iM14108v12 = AbstractC3122is.m14108v(ik8VarMo2873e6, "languageTo");
                    int iM14108v13 = AbstractC3122is.m14108v(ik8VarMo2873e6, "urlVar1");
                    int iM14108v14 = AbstractC3122is.m14108v(ik8VarMo2873e6, "urlVar2");
                    int iM14108v15 = AbstractC3122is.m14108v(ik8VarMo2873e6, "urlVar3");
                    int iM14108v16 = AbstractC3122is.m14108v(ik8VarMo2873e6, "urlVar4");
                    int iM14108v17 = AbstractC3122is.m14108v(ik8VarMo2873e6, "urlVar5");
                    int iM14108v18 = AbstractC3122is.m14108v(ik8VarMo2873e6, "overrideUrl");
                    if (ik8VarMo2873e6.mo2876a0()) {
                        dictionaryData = new DictionaryData((int) ik8VarMo2873e6.getLong(iM14108v6), ik8VarMo2873e6.mo2875L(iM14108v7), (int) ik8VarMo2873e6.getLong(iM14108v8), ik8VarMo2873e6.mo2875L(iM14108v9), ik8VarMo2873e6.mo2875L(iM14108v10), ((int) ik8VarMo2873e6.getLong(iM14108v11)) != 0, ik8VarMo2873e6.mo2875L(iM14108v12), ik8VarMo2873e6.mo2875L(iM14108v13), ik8VarMo2873e6.mo2875L(iM14108v14), ik8VarMo2873e6.mo2875L(iM14108v15), ik8VarMo2873e6.mo2875L(iM14108v16), ik8VarMo2873e6.mo2875L(iM14108v17), ik8VarMo2873e6.mo2875L(iM14108v18));
                    } else {
                        dictionaryData = null;
                    }
                    return dictionaryData;
                } finally {
                    ik8VarMo2873e6.close();
                }
            case 7:
                bk8 bk8Var8 = (bk8) obj;
                bk8Var8.getClass();
                ik8 ik8VarMo2873e7 = bk8Var8.mo2873e0("UPDATE StudyStatsEntity SET streakDays = ? WHERE language = ?");
                try {
                    ik8VarMo2873e7.mo2878j(1, i2);
                    ik8VarMo2873e7.mo2874C(2, str);
                    ik8VarMo2873e7.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e7.close();
                }
            case 8:
                bk8 bk8Var9 = (bk8) obj;
                bk8Var9.getClass();
                ik8 ik8VarMo2873e8 = bk8Var9.mo2873e0("SELECT * FROM LessonAchievementEntity WHERE lessonId = ? AND language = ?");
                try {
                    ik8VarMo2873e8.mo2878j(1, i2);
                    ik8VarMo2873e8.mo2874C(2, str);
                    int iM14108v19 = AbstractC3122is.m14108v(ik8VarMo2873e8, "lessonId");
                    int iM14108v20 = AbstractC3122is.m14108v(ik8VarMo2873e8, "language");
                    int iM14108v21 = AbstractC3122is.m14108v(ik8VarMo2873e8, "type");
                    int iM14108v22 = AbstractC3122is.m14108v(ik8VarMo2873e8, "dataJson");
                    ArrayList arrayList3 = new ArrayList();
                    while (ik8VarMo2873e8.mo2876a0()) {
                        arrayList3.add(new jx4(ik8VarMo2873e8.mo2875L(iM14108v20), (int) ik8VarMo2873e8.getLong(iM14108v19), ik8VarMo2873e8.mo2875L(iM14108v21), ik8VarMo2873e8.mo2875L(iM14108v22)));
                    }
                    ik8VarMo2873e8.close();
                    return arrayList3;
                } catch (Throwable th3) {
                    ik8VarMo2873e8.close();
                    throw th3;
                }
            case 9:
                bk8 bk8Var10 = (bk8) obj;
                bk8Var10.getClass();
                ik8 ik8VarMo2873e9 = bk8Var10.mo2873e0("SELECT COUNT(*) FROM LessonAudioDownloadEntity WHERE language = ? AND id = ? AND isDownloaded = 1");
                try {
                    ik8VarMo2873e9.mo2874C(1, str);
                    ik8VarMo2873e9.mo2878j(2, i2);
                    return Integer.valueOf(ik8VarMo2873e9.mo2876a0() ? (int) ik8VarMo2873e9.getLong(0) : 0);
                } finally {
                    ik8VarMo2873e9.close();
                }
            case 10:
                bk8 bk8Var11 = (bk8) obj;
                bk8Var11.getClass();
                ik8 ik8VarMo2873e10 = bk8Var11.mo2873e0("DELETE FROM CoursesAndLessonsSortJoin WHERE pk = ? AND sort = ?");
                try {
                    ik8VarMo2873e10.mo2878j(1, i2);
                    ik8VarMo2873e10.mo2874C(2, str);
                    ik8VarMo2873e10.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e10.close();
                }
            case 11:
                bk8 bk8Var12 = (bk8) obj;
                bk8Var12.getClass();
                ik8 ik8VarMo2873e11 = bk8Var12.mo2873e0("SELECT `id`, `roseGiven`, `progress`, `listenTimes`, `readTimes`, `isTaken`, `difficulty`, `rosesCount`, `newWordsCount`, `knownWordsCount`, `cardsCount`, `lessonsCount`, `isCompletelyTaken`, `totalWordsCount`, `uniqueWordsCount`, `audioStart`, `audioEnd` FROM (SELECT DISTINCT * FROM LibraryCounterEntity WHERE id = ? AND type = ?)");
                try {
                    ik8VarMo2873e11.mo2878j(1, i2);
                    ik8VarMo2873e11.mo2874C(2, str);
                    if (ik8VarMo2873e11.mo2876a0()) {
                        libraryItemCounter = new LibraryItemCounter((int) ik8VarMo2873e11.getLong(0), ((int) ik8VarMo2873e11.getLong(1)) != 0, ik8VarMo2873e11.isNull(2) ? null : Float.valueOf((float) ik8VarMo2873e11.getDouble(2)), ik8VarMo2873e11.isNull(3) ? null : Double.valueOf(ik8VarMo2873e11.getDouble(3)), ik8VarMo2873e11.isNull(4) ? null : Double.valueOf(ik8VarMo2873e11.getDouble(4)), ((int) ik8VarMo2873e11.getLong(5)) != 0, (float) ik8VarMo2873e11.getDouble(6), (int) ik8VarMo2873e11.getLong(7), (int) ik8VarMo2873e11.getLong(11), (int) ik8VarMo2873e11.getLong(8), (int) ik8VarMo2873e11.getLong(9), (int) ik8VarMo2873e11.getLong(10), ((int) ik8VarMo2873e11.getLong(12)) != 0, (int) ik8VarMo2873e11.getLong(13), (int) ik8VarMo2873e11.getLong(14), ik8VarMo2873e11.isNull(15) ? null : Double.valueOf(ik8VarMo2873e11.getDouble(15)), ik8VarMo2873e11.isNull(16) ? null : Double.valueOf(ik8VarMo2873e11.getDouble(16)));
                    } else {
                        libraryItemCounter = null;
                    }
                    return libraryItemCounter;
                } finally {
                    ik8VarMo2873e11.close();
                }
            case 12:
                bk8 bk8Var13 = (bk8) obj;
                bk8Var13.getClass();
                ik8 ik8VarMo2873e12 = bk8Var13.mo2873e0("\n    SELECT DISTINCT LibraryDataEntity.id FROM LibraryDataEntity\n    INNER JOIN CoursesAndLessonsJoin ON LibraryDataEntity.id = CoursesAndLessonsJoin.contentId\n    WHERE CoursesAndLessonsJoin.pk = ? AND LibraryDataEntity.collectionId = ? AND LibraryDataEntity.type = ?\n    ORDER BY courseOrder ASC");
                long j2 = i2;
                try {
                    ik8VarMo2873e12.mo2878j(1, j2);
                    ik8VarMo2873e12.mo2878j(2, j2);
                    ik8VarMo2873e12.mo2874C(3, str);
                    ArrayList arrayList4 = new ArrayList();
                    while (ik8VarMo2873e12.mo2876a0()) {
                        arrayList4.add(Integer.valueOf((int) ik8VarMo2873e12.getLong(0)));
                    }
                    ik8VarMo2873e12.close();
                    return arrayList4;
                } catch (Throwable th4) {
                    ik8VarMo2873e12.close();
                    throw th4;
                }
            case 13:
                bk8 bk8Var14 = (bk8) obj;
                bk8Var14.getClass();
                ik8 ik8VarMo2873e13 = bk8Var14.mo2873e0("\n    SELECT DISTINCT COUNT(LibraryCounterEntity.id)\n    FROM LibraryDataEntity, LibraryCounterEntity\n    INNER JOIN CoursesAndLessonsJoin ON LibraryDataEntity.id = CoursesAndLessonsJoin.contentId AND LibraryCounterEntity.id = CoursesAndLessonsJoin.contentId \n    WHERE CoursesAndLessonsJoin.pk = ? AND LibraryDataEntity.collectionId = ? AND LibraryDataEntity.type = ? AND LibraryCounterEntity.isTaken = 1 AND LibraryCounterEntity.type = ?");
                long j3 = i2;
                try {
                    ik8VarMo2873e13.mo2878j(1, j3);
                    ik8VarMo2873e13.mo2878j(2, j3);
                    ik8VarMo2873e13.mo2874C(3, str);
                    ik8VarMo2873e13.mo2874C(4, str);
                    return Integer.valueOf(ik8VarMo2873e13.mo2876a0() ? (int) ik8VarMo2873e13.getLong(0) : 0);
                } finally {
                    ik8VarMo2873e13.close();
                }
            case 14:
                bk8 bk8Var15 = (bk8) obj;
                bk8Var15.getClass();
                ik8 ik8VarMo2873e14 = bk8Var15.mo2873e0("SELECT `language`, `slug`, `name`, `goal`, `stat` FROM (\n        SELECT * FROM MilestoneEntity \n        WHERE stat = \"known_words\" AND goal <= ? AND language = ? AND \n        NOT EXISTS (\n            SELECT 1 FROM MilestoneMetEntity WHERE MilestoneEntity.languageAndSlug == MilestoneMetEntity.languageAndSlug\n        ) \n    )");
                try {
                    ik8VarMo2873e14.mo2878j(1, i2);
                    ik8VarMo2873e14.mo2874C(2, str);
                    ArrayList arrayList5 = new ArrayList();
                    while (ik8VarMo2873e14.mo2876a0()) {
                        arrayList5.add(new Milestone((int) ik8VarMo2873e14.getLong(3), ik8VarMo2873e14.mo2875L(0), ik8VarMo2873e14.mo2875L(1), ik8VarMo2873e14.mo2875L(4), ik8VarMo2873e14.mo2875L(2)));
                    }
                    ik8VarMo2873e14.close();
                    return arrayList5;
                } catch (Throwable th5) {
                    ik8VarMo2873e14.close();
                    throw th5;
                }
            case 15:
                bk8 bk8Var16 = (bk8) obj;
                bk8Var16.getClass();
                ik8 ik8VarMo2873e15 = bk8Var16.mo2873e0("SELECT `language`, `slug`, `name`, `goal`, `stat` FROM (\n        SELECT * FROM MilestoneEntity \n        WHERE stat = \"streak_days\" AND goal == ? AND language = ? AND \n        NOT EXISTS (\n            SELECT 1 FROM MilestoneMetEntity WHERE MilestoneEntity.languageAndSlug == MilestoneMetEntity.languageAndSlug\n        )\n        ORDER BY goal\n    )");
                try {
                    ik8VarMo2873e15.mo2878j(1, i2);
                    ik8VarMo2873e15.mo2874C(2, str);
                    ArrayList arrayList6 = new ArrayList();
                    while (ik8VarMo2873e15.mo2876a0()) {
                        arrayList6.add(new Milestone((int) ik8VarMo2873e15.getLong(3), ik8VarMo2873e15.mo2875L(0), ik8VarMo2873e15.mo2875L(1), ik8VarMo2873e15.mo2875L(4), ik8VarMo2873e15.mo2875L(2)));
                    }
                    ik8VarMo2873e15.close();
                    return arrayList6;
                } catch (Throwable th6) {
                    ik8VarMo2873e15.close();
                    throw th6;
                }
            case 16:
                bk8 bk8Var17 = (bk8) obj;
                bk8Var17.getClass();
                ik8 ik8VarMo2873e16 = bk8Var17.mo2873e0("SELECT `pk`, `url`, `notificationLanguage`, `title`, `message`, `image`, `isNew`, `timestamp` FROM (SELECT * FROM NotificationEntity WHERE url IS NOT NULL AND language = ? ORDER BY timestamp DESC LIMIT ?)");
                try {
                    ik8VarMo2873e16.mo2874C(1, str);
                    ik8VarMo2873e16.mo2878j(2, i2);
                    ArrayList arrayList7 = new ArrayList();
                    while (ik8VarMo2873e16.mo2876a0()) {
                        arrayList7.add(new om6((int) ik8VarMo2873e16.getLong(0), ik8VarMo2873e16.mo2875L(3), ik8VarMo2873e16.isNull(4) ? null : ik8VarMo2873e16.mo2875L(4), ik8VarMo2873e16.isNull(5) ? null : ik8VarMo2873e16.mo2875L(5), ik8VarMo2873e16.isNull(1) ? null : ik8VarMo2873e16.mo2875L(1), ik8VarMo2873e16.isNull(2) ? null : ik8VarMo2873e16.mo2875L(2), ((int) ik8VarMo2873e16.getLong(6)) != 0, ik8VarMo2873e16.mo2875L(7)));
                        break;
                    }
                    return arrayList7;
                } finally {
                    ik8VarMo2873e16.close();
                }
            case 17:
                bk8 bk8Var18 = (bk8) obj;
                bk8Var18.getClass();
                ik8 ik8VarMo2873e17 = bk8Var18.mo2873e0("SELECT `nameWithLanguage`, `language`, `name`, `pk`, `isDefault`, `isFeatured` FROM (SELECT * FROM PlaylistEntity WHERE language = ? AND pk = ?)");
                try {
                    ik8VarMo2873e17.mo2874C(1, str);
                    ik8VarMo2873e17.mo2878j(2, i2);
                    if (ik8VarMo2873e17.mo2876a0()) {
                        playlist = new Playlist((int) ik8VarMo2873e17.getLong(3), ik8VarMo2873e17.mo2875L(0), ik8VarMo2873e17.mo2875L(1), ik8VarMo2873e17.mo2875L(2), ((int) ik8VarMo2873e17.getLong(4)) != 0, ((int) ik8VarMo2873e17.getLong(5)) != 0);
                    } else {
                        playlist = null;
                    }
                    return playlist;
                } finally {
                    ik8VarMo2873e17.close();
                }
            case 18:
                bk8 bk8Var19 = (bk8) obj;
                bk8Var19.getClass();
                ik8 ik8VarMo2873e18 = bk8Var19.mo2873e0("SELECT * FROM PlaylistAndLessonsJoin WHERE contentId = ? AND nameWithLanguage = ?");
                try {
                    ik8VarMo2873e18.mo2878j(1, i2);
                    ik8VarMo2873e18.mo2874C(2, str);
                    int iM14108v23 = AbstractC3122is.m14108v(ik8VarMo2873e18, "nameWithLanguage");
                    int iM14108v24 = AbstractC3122is.m14108v(ik8VarMo2873e18, "language");
                    int iM14108v25 = AbstractC3122is.m14108v(ik8VarMo2873e18, "contentId");
                    int iM14108v26 = AbstractC3122is.m14108v(ik8VarMo2873e18, "order");
                    int iM14108v27 = AbstractC3122is.m14108v(ik8VarMo2873e18, "isCourse");
                    if (ik8VarMo2873e18.mo2876a0()) {
                        bd7Var = new bd7((int) ik8VarMo2873e18.getLong(iM14108v25), ik8VarMo2873e18.isNull(iM14108v26) ? null : Integer.valueOf((int) ik8VarMo2873e18.getLong(iM14108v26)), ik8VarMo2873e18.mo2875L(iM14108v23), ik8VarMo2873e18.mo2875L(iM14108v24), ((int) ik8VarMo2873e18.getLong(iM14108v27)) != 0);
                    } else {
                        bd7Var = null;
                    }
                    return bd7Var;
                } finally {
                    ik8VarMo2873e18.close();
                }
            case 19:
                bk8 bk8Var20 = (bk8) obj;
                bk8Var20.getClass();
                ik8 ik8VarMo2873e19 = bk8Var20.mo2873e0("SELECT `id`, `isDownloaded`, `downloadProgress`, `status`, `errorType`, `lastUpdated` FROM (SELECT * FROM LessonAudioDownloadEntity WHERE language = ? AND id = ?)");
                try {
                    ik8VarMo2873e19.mo2874C(1, str);
                    ik8VarMo2873e19.mo2878j(2, i2);
                    if (ik8VarMo2873e19.mo2876a0()) {
                        vd7Var = new vd7((int) ik8VarMo2873e19.getLong(0), ((int) ik8VarMo2873e19.getLong(1)) != 0, (int) ik8VarMo2873e19.getLong(2), ik8VarMo2873e19.mo2875L(3), ik8VarMo2873e19.isNull(4) ? null : ik8VarMo2873e19.mo2875L(4), ik8VarMo2873e19.getLong(5));
                    } else {
                        vd7Var = null;
                    }
                    return vd7Var;
                } finally {
                    ik8VarMo2873e19.close();
                }
            case 20:
                bk8 bk8Var21 = (bk8) obj;
                bk8Var21.getClass();
                ik8 ik8VarMo2873e20 = bk8Var21.mo2873e0("SELECT * FROM PlaylistEntity WHERE language = ? AND pk = ?");
                try {
                    ik8VarMo2873e20.mo2874C(1, str);
                    ik8VarMo2873e20.mo2878j(2, i2);
                    int iM14108v28 = AbstractC3122is.m14108v(ik8VarMo2873e20, "nameWithLanguage");
                    int iM14108v29 = AbstractC3122is.m14108v(ik8VarMo2873e20, "language");
                    int iM14108v30 = AbstractC3122is.m14108v(ik8VarMo2873e20, "name");
                    int iM14108v31 = AbstractC3122is.m14108v(ik8VarMo2873e20, "pk");
                    int iM14108v32 = AbstractC3122is.m14108v(ik8VarMo2873e20, "isDefault");
                    int iM14108v33 = AbstractC3122is.m14108v(ik8VarMo2873e20, "isFeatured");
                    int iM14108v34 = AbstractC3122is.m14108v(ik8VarMo2873e20, "order");
                    if (ik8VarMo2873e20.mo2876a0()) {
                        playlistEntity = new PlaylistEntity((int) ik8VarMo2873e20.getLong(iM14108v31), (int) ik8VarMo2873e20.getLong(iM14108v34), ik8VarMo2873e20.mo2875L(iM14108v28), ik8VarMo2873e20.mo2875L(iM14108v29), ik8VarMo2873e20.mo2875L(iM14108v30), ((int) ik8VarMo2873e20.getLong(iM14108v32)) != 0, ((int) ik8VarMo2873e20.getLong(iM14108v33)) != 0);
                    } else {
                        playlistEntity = null;
                    }
                    return playlistEntity;
                } finally {
                    ik8VarMo2873e20.close();
                }
            case 21:
                return m16093d(obj);
            case 22:
                bk8 bk8Var22 = (bk8) obj;
                bk8Var22.getClass();
                ik8 ik8VarMo2873e21 = bk8Var22.mo2873e0("SELECT COUNT(*) FROM LessonsWithPlaylistJoin WHERE language = ? AND contentId = ?");
                try {
                    ik8VarMo2873e21.mo2874C(1, str);
                    ik8VarMo2873e21.mo2878j(2, i2);
                    return Integer.valueOf(ik8VarMo2873e21.mo2876a0() ? (int) ik8VarMo2873e21.getLong(0) : 0);
                } finally {
                    ik8VarMo2873e21.close();
                }
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return m16094g(obj);
            case 24:
                bk8 bk8Var23 = (bk8) obj;
                bk8Var23.getClass();
                ik8 ik8VarMo2873e22 = bk8Var23.mo2873e0("SELECT `id`, `isDownloaded`, `downloadProgress`, `status`, `errorType`, `lastUpdated` FROM (SELECT * FROM LessonAudioDownloadEntity WHERE language = ? AND id = ?)");
                try {
                    ik8VarMo2873e22.mo2874C(1, str);
                    ik8VarMo2873e22.mo2878j(2, i2);
                    if (ik8VarMo2873e22.mo2876a0()) {
                        vd7Var2 = new vd7((int) ik8VarMo2873e22.getLong(0), ((int) ik8VarMo2873e22.getLong(1)) != 0, (int) ik8VarMo2873e22.getLong(2), ik8VarMo2873e22.mo2875L(3), ik8VarMo2873e22.isNull(4) ? null : ik8VarMo2873e22.mo2875L(4), ik8VarMo2873e22.getLong(5));
                    } else {
                        vd7Var2 = null;
                    }
                    return vd7Var2;
                } finally {
                    ik8VarMo2873e22.close();
                }
            case 25:
                return m16095j(obj);
            case 26:
                return m16096k(obj);
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                return m16097l(obj);
            case 28:
                return m16098m(obj);
            default:
                bk8 bk8Var24 = (bk8) obj;
                bk8Var24.getClass();
                ik8 ik8VarMo2873e23 = bk8Var24.mo2873e0("UPDATE PlaylistEntity SET pk = ? WHERE nameWithLanguage = ?");
                try {
                    ik8VarMo2873e23.mo2878j(1, i2);
                    ik8VarMo2873e23.mo2874C(2, str);
                    ik8VarMo2873e23.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e23.close();
                }
        }
    }

    public /* synthetic */ ld0(String str, int i, int i2) {
        this.f49491a = i2;
        this.f49493c = str;
        this.f49492b = i;
    }
}
