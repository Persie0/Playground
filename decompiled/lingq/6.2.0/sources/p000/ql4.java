package p000;

import androidx.compose.p002ui.semantics.AbstractC0426f;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.room.util.AbstractC0758a;
import androidx.work.impl.WorkDatabase;
import com.lingq.core.database.entity.PlaylistEntity;
import com.lingq.core.domain.model.language.LanguageToLearn;
import com.lingq.core.domain.model.library.Accent;
import com.lingq.core.domain.model.library.CollectionsFilterLessonTag;
import com.lingq.core.domain.model.library.LibrarySearchQuery;
import com.lingq.core.domain.model.milestones.Milestone;
import com.lingq.core.domain.model.playlist.Playlist;
import com.lingq.core.domain.model.token.TextToSpeechTokenUtterance;
import com.lingq.core.domain.model.token.TokenCwt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ql4 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57898a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f57899b;

    public /* synthetic */ ql4(String str, int i) {
        this.f57898a = i;
        this.f57899b = str;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        LanguageToLearn languageToLearn;
        zy5 zy5Var;
        zy5 zy5Var2;
        PlaylistEntity playlistEntity;
        Playlist playlist;
        Playlist playlist2;
        Integer numValueOf;
        Object obj2;
        TokenCwt tokenCwt;
        TextToSpeechTokenUtterance textToSpeechTokenUtterance;
        int i = this.f57898a;
        int i2 = 7;
        int i3 = 6;
        int i4 = 5;
        xfa xfaVar = xfa.f68157a;
        int i5 = 0;
        String str = this.f57899b;
        switch (i) {
            case 0:
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT `code`, `id`, `supported`, `title`, `lastUsed`, `knownWords`, `dictionaryLocaleActive`, `scheduledForDeletion` FROM (SELECT * FROM LanguageEntity WHERE code = ?)");
                try {
                    ik8VarMo2873e0.mo2874C(1, str);
                    if (ik8VarMo2873e0.mo2876a0()) {
                        String strMo2875L = ik8VarMo2873e0.mo2875L(0);
                        int i6 = (int) ik8VarMo2873e0.getLong(1);
                        languageToLearn = new LanguageToLearn(strMo2875L, ((int) ik8VarMo2873e0.getLong(2)) != 0, ik8VarMo2873e0.mo2875L(3), (int) ik8VarMo2873e0.getLong(5), i6, ik8VarMo2873e0.isNull(6) ? null : ik8VarMo2873e0.mo2875L(6), ik8VarMo2873e0.isNull(4) ? null : ik8VarMo2873e0.mo2875L(4), ((int) ik8VarMo2873e0.getLong(7)) != 0);
                    } else {
                        languageToLearn = null;
                    }
                    return languageToLearn;
                } finally {
                    ik8VarMo2873e0.close();
                }
            case 1:
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                ik8 ik8VarMo2873e1 = bk8Var2.mo2873e0("UPDATE StreakEntity SET isStreakBroken = 0 WHERE language = ?");
                try {
                    ik8VarMo2873e1.mo2874C(1, str);
                    ik8VarMo2873e1.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e1.close();
                }
            case 2:
                bk8 bk8Var3 = (bk8) obj;
                bk8Var3.getClass();
                ik8 ik8VarMo2873e2 = bk8Var3.mo2873e0("SELECT DISTINCT * FROM LessonTagEntity WHERE title LIKE ? || '%' ORDER BY title");
                try {
                    ik8VarMo2873e2.mo2874C(1, str);
                    int iM14108v = AbstractC3122is.m14108v(ik8VarMo2873e2, "title");
                    ArrayList arrayList = new ArrayList();
                    while (ik8VarMo2873e2.mo2876a0()) {
                        String strMo2875L2 = ik8VarMo2873e2.isNull(iM14108v) ? null : ik8VarMo2873e2.mo2875L(iM14108v);
                        CollectionsFilterLessonTag collectionsFilterLessonTag = new CollectionsFilterLessonTag();
                        collectionsFilterLessonTag.f19341a = strMo2875L2;
                        arrayList.add(collectionsFilterLessonTag);
                        break;
                    }
                    return arrayList;
                } finally {
                    ik8VarMo2873e2.close();
                }
            case 3:
                bk8 bk8Var4 = (bk8) obj;
                bk8Var4.getClass();
                ik8 ik8VarMo2873e3 = bk8Var4.mo2873e0("DELETE FROM LessonNextSuggestionEntity WHERE sourceUrl = ?");
                try {
                    ik8VarMo2873e3.mo2874C(1, str);
                    ik8VarMo2873e3.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e3.close();
                }
            case 4:
                tv8 tv8Var = (tv8) obj;
                tv8Var.getClass();
                AbstractC0426f.m1860d(tv8Var, str);
                return xfaVar;
            case 5:
                bk8 bk8Var5 = (bk8) obj;
                bk8Var5.getClass();
                ik8 ik8VarMo2873e4 = bk8Var5.mo2873e0("SELECT * FROM MilestoneStatsEntity WHERE language = ?");
                try {
                    ik8VarMo2873e4.mo2874C(1, str);
                    int iM14108v2 = AbstractC3122is.m14108v(ik8VarMo2873e4, "language");
                    int iM14108v3 = AbstractC3122is.m14108v(ik8VarMo2873e4, "knownWords");
                    int iM14108v4 = AbstractC3122is.m14108v(ik8VarMo2873e4, "lingqs");
                    int iM14108v5 = AbstractC3122is.m14108v(ik8VarMo2873e4, "dailyScore");
                    if (ik8VarMo2873e4.mo2876a0()) {
                        zy5Var = new zy5(ik8VarMo2873e4.mo2875L(iM14108v2), (int) ik8VarMo2873e4.getLong(iM14108v3), (int) ik8VarMo2873e4.getLong(iM14108v4), (int) ik8VarMo2873e4.getLong(iM14108v5));
                        break;
                    } else {
                        zy5Var = null;
                    }
                    return zy5Var;
                } finally {
                    ik8VarMo2873e4.close();
                }
            case 6:
                bk8 bk8Var6 = (bk8) obj;
                bk8Var6.getClass();
                ik8 ik8VarMo2873e5 = bk8Var6.mo2873e0("SELECT `language`, `slug`, `name`, `goal`, `stat` FROM (SELECT * FROM MilestoneEntity WHERE language = ? AND slug LIKE 'level.%')");
                try {
                    ik8VarMo2873e5.mo2874C(1, str);
                    ArrayList arrayList2 = new ArrayList();
                    while (ik8VarMo2873e5.mo2876a0()) {
                        arrayList2.add(new Milestone((int) ik8VarMo2873e5.getLong(3), ik8VarMo2873e5.mo2875L(0), ik8VarMo2873e5.mo2875L(1), ik8VarMo2873e5.mo2875L(4), ik8VarMo2873e5.mo2875L(2)));
                    }
                    ik8VarMo2873e5.close();
                    return arrayList2;
                } catch (Throwable th) {
                    ik8VarMo2873e5.close();
                    throw th;
                }
            case 7:
                bk8 bk8Var7 = (bk8) obj;
                bk8Var7.getClass();
                ik8 ik8VarMo2873e6 = bk8Var7.mo2873e0("SELECT * FROM MilestoneStatsEntity WHERE language = ?");
                try {
                    ik8VarMo2873e6.mo2874C(1, str);
                    int iM14108v6 = AbstractC3122is.m14108v(ik8VarMo2873e6, "language");
                    int iM14108v7 = AbstractC3122is.m14108v(ik8VarMo2873e6, "knownWords");
                    int iM14108v8 = AbstractC3122is.m14108v(ik8VarMo2873e6, "lingqs");
                    int iM14108v9 = AbstractC3122is.m14108v(ik8VarMo2873e6, "dailyScore");
                    if (ik8VarMo2873e6.mo2876a0()) {
                        zy5Var2 = new zy5(ik8VarMo2873e6.mo2875L(iM14108v6), (int) ik8VarMo2873e6.getLong(iM14108v7), (int) ik8VarMo2873e6.getLong(iM14108v8), (int) ik8VarMo2873e6.getLong(iM14108v9));
                        break;
                    } else {
                        zy5Var2 = null;
                    }
                    return zy5Var2;
                } finally {
                    ik8VarMo2873e6.close();
                }
            case 8:
                bk8 bk8Var8 = (bk8) obj;
                bk8Var8.getClass();
                ik8 ik8VarMo2873e7 = bk8Var8.mo2873e0("UPDATE NotificationEntity SET isNew = 0 WHERE language = ?");
                try {
                    ik8VarMo2873e7.mo2874C(1, str);
                    ik8VarMo2873e7.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e7.close();
                }
            case 9:
                bk8 bk8Var9 = (bk8) obj;
                bk8Var9.getClass();
                ik8 ik8VarMo2873e8 = bk8Var9.mo2873e0("SELECT `id`, `isDownloaded`, `downloadProgress`, `status`, `errorType`, `lastUpdated` FROM (SELECT * FROM LessonAudioDownloadEntity WHERE language = ?)");
                try {
                    ik8VarMo2873e8.mo2874C(1, str);
                    ArrayList arrayList3 = new ArrayList();
                    while (ik8VarMo2873e8.mo2876a0()) {
                        arrayList3.add(new vd7((int) ik8VarMo2873e8.getLong(0), ((int) ik8VarMo2873e8.getLong(1)) != 0, (int) ik8VarMo2873e8.getLong(2), ik8VarMo2873e8.mo2875L(3), ik8VarMo2873e8.isNull(4) ? null : ik8VarMo2873e8.mo2875L(4), ik8VarMo2873e8.getLong(5)));
                        break;
                    }
                    return arrayList3;
                } finally {
                    ik8VarMo2873e8.close();
                }
            case 10:
                bk8 bk8Var10 = (bk8) obj;
                bk8Var10.getClass();
                ik8 ik8VarMo2873e9 = bk8Var10.mo2873e0("DELETE FROM PlaylistAndLessonsJoin WHERE nameWithLanguage = ?");
                try {
                    ik8VarMo2873e9.mo2874C(1, str);
                    ik8VarMo2873e9.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e9.close();
                }
            case 11:
                bk8 bk8Var11 = (bk8) obj;
                bk8Var11.getClass();
                ik8 ik8VarMo2873e10 = bk8Var11.mo2873e0("SELECT contentId FROM PlaylistAndLessonsJoin WHERE nameWithLanguage = ? AND PlaylistAndLessonsJoin.isCourse = 1");
                try {
                    ik8VarMo2873e10.mo2874C(1, str);
                    ArrayList arrayList4 = new ArrayList();
                    while (ik8VarMo2873e10.mo2876a0()) {
                        arrayList4.add(Integer.valueOf((int) ik8VarMo2873e10.getLong(0)));
                    }
                    ik8VarMo2873e10.close();
                    return arrayList4;
                } catch (Throwable th2) {
                    ik8VarMo2873e10.close();
                    throw th2;
                }
            case 12:
                bk8 bk8Var12 = (bk8) obj;
                bk8Var12.getClass();
                ik8 ik8VarMo2873e11 = bk8Var12.mo2873e0("\n        SELECT DISTINCT\n            LibraryDataEntity.id,\n            LibraryDataEntity.url,\n            LibraryDataEntity.description,\n            LibraryDataEntity.pos,\n            LibraryDataEntity.originalImageUrl,\n            LibraryDataEntity.imageUrl,\n            PlaylistAndLessonsJoin.language AS language,\n            LibraryDataEntity.title,\n            LibraryDataEntity.collectionTitle,\n            LibraryDataEntity.collectionId,\n            LibraryDataEntity.listenTimes,\n            LibraryDataEntity.duration,\n            LibraryDataEntity.audioUrl,\n            LibraryDataEntity.videoUrl,\n            LibraryDataEntity.originalUrl,\n            PlaylistAndLessonsJoin.`order` AS playlistLessonOrder,\n            PlaylistAndLessonsJoin.isCourse AS isCourse,\n            0 AS isCourseLesson,\n            LibraryDataEntity.price,\n            LibraryDataEntity.level,\n            LibraryCounterEntity.listenTimes AS counterListenTimes,\n            LibraryCounterEntity.audioStart AS audioStart,\n            LibraryCounterEntity.audioEnd AS audioEnd,\n            IFNULL(IFNULL(LibraryCounterEntity.isTaken, LibraryDataEntity.isTaken), 0) AS isTaken\n        FROM PlaylistEntity\n            INNER JOIN PlaylistAndLessonsJoin ON PlaylistEntity.nameWithLanguage = PlaylistAndLessonsJoin.nameWithLanguage\n            INNER JOIN LibraryDataEntity ON LibraryDataEntity.id = PlaylistAndLessonsJoin.contentId\n            LEFT JOIN LibraryCounterEntity ON LibraryCounterEntity.id = PlaylistAndLessonsJoin.contentId\n        WHERE PlaylistEntity.nameWithLanguage = ?\n            AND PlaylistAndLessonsJoin.isCourse = 0 AND LibraryDataEntity.type = 'content'\n        ORDER BY playlistLessonOrder\n    ");
                try {
                    ik8VarMo2873e11.mo2874C(1, str);
                    ArrayList arrayList5 = new ArrayList();
                    while (ik8VarMo2873e11.mo2876a0()) {
                        int i7 = (int) ik8VarMo2873e11.getLong(0);
                        String strMo2875L3 = ik8VarMo2873e11.isNull(1) ? null : ik8VarMo2873e11.mo2875L(1);
                        String strMo2875L4 = ik8VarMo2873e11.isNull(2) ? null : ik8VarMo2873e11.mo2875L(2);
                        int i8 = (int) ik8VarMo2873e11.getLong(3);
                        String strMo2875L5 = ik8VarMo2873e11.isNull(4) ? null : ik8VarMo2873e11.mo2875L(4);
                        String strMo2875L6 = ik8VarMo2873e11.isNull(i4) ? null : ik8VarMo2873e11.mo2875L(i4);
                        String strMo2875L7 = ik8VarMo2873e11.isNull(i3) ? null : ik8VarMo2873e11.mo2875L(i3);
                        String strMo2875L8 = ik8VarMo2873e11.mo2875L(i2);
                        String strMo2875L9 = ik8VarMo2873e11.isNull(8) ? null : ik8VarMo2873e11.mo2875L(8);
                        int i9 = (int) ik8VarMo2873e11.getLong(9);
                        Double dValueOf = ik8VarMo2873e11.isNull(10) ? null : Double.valueOf(ik8VarMo2873e11.getDouble(10));
                        int i10 = (int) ik8VarMo2873e11.getLong(11);
                        String strMo2875L10 = ik8VarMo2873e11.isNull(12) ? null : ik8VarMo2873e11.mo2875L(12);
                        String strMo2875L11 = ik8VarMo2873e11.isNull(13) ? null : ik8VarMo2873e11.mo2875L(13);
                        String strMo2875L12 = ik8VarMo2873e11.isNull(14) ? null : ik8VarMo2873e11.mo2875L(14);
                        arrayList5.add(new ud7(i7, strMo2875L3, strMo2875L4, i8, strMo2875L5, strMo2875L6, strMo2875L7, strMo2875L8, strMo2875L9, i9, dValueOf, i10, strMo2875L10, strMo2875L11, ik8VarMo2873e11.isNull(15) ? null : Integer.valueOf((int) ik8VarMo2873e11.getLong(15)), ((int) ik8VarMo2873e11.getLong(16)) != 0, ((int) ik8VarMo2873e11.getLong(17)) != 0, (int) ik8VarMo2873e11.getLong(18), ik8VarMo2873e11.isNull(19) ? null : ik8VarMo2873e11.mo2875L(19), ik8VarMo2873e11.isNull(20) ? null : Double.valueOf(ik8VarMo2873e11.getDouble(20)), ((int) ik8VarMo2873e11.getLong(23)) != 0, strMo2875L12, ik8VarMo2873e11.isNull(21) ? null : Double.valueOf(ik8VarMo2873e11.getDouble(21)), ik8VarMo2873e11.isNull(22) ? null : Double.valueOf(ik8VarMo2873e11.getDouble(22))));
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    }
                    return arrayList5;
                } finally {
                    ik8VarMo2873e11.close();
                }
            case 13:
                bk8 bk8Var13 = (bk8) obj;
                bk8Var13.getClass();
                ik8 ik8VarMo2873e12 = bk8Var13.mo2873e0("SELECT * FROM PlaylistEntity WHERE nameWithLanguage = ?");
                try {
                    ik8VarMo2873e12.mo2874C(1, str);
                    int iM14108v10 = AbstractC3122is.m14108v(ik8VarMo2873e12, "nameWithLanguage");
                    int iM14108v11 = AbstractC3122is.m14108v(ik8VarMo2873e12, "language");
                    int iM14108v12 = AbstractC3122is.m14108v(ik8VarMo2873e12, "name");
                    int iM14108v13 = AbstractC3122is.m14108v(ik8VarMo2873e12, "pk");
                    int iM14108v14 = AbstractC3122is.m14108v(ik8VarMo2873e12, "isDefault");
                    int iM14108v15 = AbstractC3122is.m14108v(ik8VarMo2873e12, "isFeatured");
                    int iM14108v16 = AbstractC3122is.m14108v(ik8VarMo2873e12, "order");
                    if (ik8VarMo2873e12.mo2876a0()) {
                        playlistEntity = new PlaylistEntity((int) ik8VarMo2873e12.getLong(iM14108v13), (int) ik8VarMo2873e12.getLong(iM14108v16), ik8VarMo2873e12.mo2875L(iM14108v10), ik8VarMo2873e12.mo2875L(iM14108v11), ik8VarMo2873e12.mo2875L(iM14108v12), ((int) ik8VarMo2873e12.getLong(iM14108v14)) != 0, ((int) ik8VarMo2873e12.getLong(iM14108v15)) != 0);
                    } else {
                        playlistEntity = null;
                    }
                    return playlistEntity;
                } finally {
                    ik8VarMo2873e12.close();
                }
            case 14:
                bk8 bk8Var14 = (bk8) obj;
                bk8Var14.getClass();
                ik8 ik8VarMo2873e13 = bk8Var14.mo2873e0("SELECT `nameWithLanguage`, `language`, `name`, `pk`, `isDefault`, `isFeatured` FROM (SELECT * FROM PlaylistEntity WHERE nameWithLanguage = ?)");
                try {
                    ik8VarMo2873e13.mo2874C(1, str);
                    if (ik8VarMo2873e13.mo2876a0()) {
                        playlist = new Playlist((int) ik8VarMo2873e13.getLong(3), ik8VarMo2873e13.mo2875L(0), ik8VarMo2873e13.mo2875L(1), ik8VarMo2873e13.mo2875L(2), ((int) ik8VarMo2873e13.getLong(4)) != 0, ((int) ik8VarMo2873e13.getLong(5)) != 0);
                    } else {
                        playlist = null;
                    }
                    return playlist;
                } finally {
                    ik8VarMo2873e13.close();
                }
            case 15:
                bk8 bk8Var15 = (bk8) obj;
                bk8Var15.getClass();
                ik8 ik8VarMo2873e14 = bk8Var15.mo2873e0("SELECT `nameWithLanguage`, `language`, `name`, `pk`, `isDefault`, `isFeatured` FROM (SELECT * FROM PlaylistEntity WHERE language = ? ORDER BY `order`)");
                try {
                    ik8VarMo2873e14.mo2874C(1, str);
                    ArrayList arrayList6 = new ArrayList();
                    while (ik8VarMo2873e14.mo2876a0()) {
                        arrayList6.add(new Playlist((int) ik8VarMo2873e14.getLong(3), ik8VarMo2873e14.mo2875L(0), ik8VarMo2873e14.mo2875L(1), ik8VarMo2873e14.mo2875L(2), ((int) ik8VarMo2873e14.getLong(4)) != 0, ((int) ik8VarMo2873e14.getLong(5)) != 0));
                    }
                    ik8VarMo2873e14.close();
                    return arrayList6;
                } catch (Throwable th3) {
                    ik8VarMo2873e14.close();
                    throw th3;
                }
            case 16:
                bk8 bk8Var16 = (bk8) obj;
                bk8Var16.getClass();
                ik8 ik8VarMo2873e15 = bk8Var16.mo2873e0("SELECT `nameWithLanguage`, `language`, `name`, `pk`, `isDefault`, `isFeatured` FROM (SELECT * FROM PlaylistEntity WHERE language = ? AND isDefault = 1 ORDER BY `order` LIMIT 1)");
                try {
                    ik8VarMo2873e15.mo2874C(1, str);
                    if (ik8VarMo2873e15.mo2876a0()) {
                        playlist2 = new Playlist((int) ik8VarMo2873e15.getLong(3), ik8VarMo2873e15.mo2875L(0), ik8VarMo2873e15.mo2875L(1), ik8VarMo2873e15.mo2875L(2), ((int) ik8VarMo2873e15.getLong(4)) != 0, ((int) ik8VarMo2873e15.getLong(5)) != 0);
                    } else {
                        playlist2 = null;
                    }
                    return playlist2;
                } finally {
                    ik8VarMo2873e15.close();
                }
            case 17:
                bk8 bk8Var17 = (bk8) obj;
                bk8Var17.getClass();
                ik8 ik8VarMo2873e16 = bk8Var17.mo2873e0("\n    SELECT DISTINCT LibraryDataEntity.id, LibraryDataEntity.title, PlaylistAndLessonsJoin.`order` FROM PlaylistEntity, LibraryDataEntity\n    INNER JOIN PlaylistAndLessonsJoin ON LibraryDataEntity.id = PlaylistAndLessonsJoin.contentId\n    AND PlaylistEntity.nameWithLanguage = PlaylistAndLessonsJoin.nameWithLanguage\n    WHERE PlaylistEntity.nameWithLanguage = ? AND PlaylistAndLessonsJoin.isCourse = 1 AND LibraryDataEntity.type = 'collection'\n    ORDER BY PlaylistAndLessonsJoin.`order` ASC");
                try {
                    ik8VarMo2873e16.mo2874C(1, str);
                    ArrayList arrayList7 = new ArrayList();
                    while (ik8VarMo2873e16.mo2876a0()) {
                        arrayList7.add(new cd7((int) ik8VarMo2873e16.getLong(0), ik8VarMo2873e16.mo2875L(1), (int) ik8VarMo2873e16.getLong(2)));
                    }
                    ik8VarMo2873e16.close();
                    return arrayList7;
                } catch (Throwable th4) {
                    ik8VarMo2873e16.close();
                    throw th4;
                }
            case 18:
                bk8 bk8Var18 = (bk8) obj;
                bk8Var18.getClass();
                ik8 ik8VarMo2873e17 = bk8Var18.mo2873e0("SELECT `order` FROM PlaylistAndLessonsJoin WHERE nameWithLanguage = ? ORDER BY `order` DESC LIMIT 1");
                try {
                    ik8VarMo2873e17.mo2874C(1, str);
                    if (ik8VarMo2873e17.mo2876a0() && !ik8VarMo2873e17.isNull(0)) {
                        numValueOf = Integer.valueOf((int) ik8VarMo2873e17.getLong(0));
                        break;
                    } else {
                        numValueOf = null;
                    }
                    return numValueOf;
                } finally {
                    ik8VarMo2873e17.close();
                }
            case 19:
                q7b q7bVar = (q7b) obj;
                q7bVar.getClass();
                return vz1.m23609O(q7bVar.f57357a.f69008e, str);
            case 20:
                q7b q7bVar2 = (q7b) obj;
                q7bVar2.getClass();
                return vz1.m23609O(q7bVar2.f57357a.f69008e, str);
            case 21:
                LibrarySearchQuery librarySearchQuery = (LibrarySearchQuery) obj;
                librarySearchQuery.getClass();
                ArrayList arrayListM22624p1 = u91.m22624p1(librarySearchQuery.f19486h);
                if (arrayListM22624p1.contains(str)) {
                    arrayListM22624p1.remove(str);
                } else {
                    arrayListM22624p1.add(str);
                }
                return LibrarySearchQuery.m8091a(librarySearchQuery, null, null, null, arrayListM22624p1, null, null, null, false, 8063);
            case 22:
                LibrarySearchQuery librarySearchQuery2 = (LibrarySearchQuery) obj;
                librarySearchQuery2.getClass();
                ArrayList arrayListM22624p2 = u91.m22624p1(librarySearchQuery2.f19490l);
                Iterator<E> it = Accent.getEntries().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (fa4.m11650l(((Accent) next).getValue(), str)) {
                            obj2 = next;
                        }
                    } else {
                        obj2 = null;
                    }
                }
                Accent accent = (Accent) obj2;
                if (accent != null) {
                    if (arrayListM22624p2.contains(accent)) {
                        arrayListM22624p2.remove(accent);
                    } else {
                        arrayListM22624p2.add(accent);
                    }
                }
                return LibrarySearchQuery.m8091a(librarySearchQuery2, null, null, null, null, null, null, arrayListM22624p2, false, 6143);
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                AbstractC0426f.m1860d((tv8) obj, str);
                return xfaVar;
            case 24:
                AbstractC0426f.m1860d((tv8) obj, str);
                return xfaVar;
            case 25:
                WorkDatabase workDatabase = (WorkDatabase) obj;
                workDatabase.getClass();
                fg2 fg2Var = p8b.f55770A;
                u8b u8bVarMo2909z = workDatabase.mo2909z();
                u8bVarMo2909z.getClass();
                str.getClass();
                Object objApply = fg2Var.apply((List) AbstractC0758a.m2859b(u8bVarMo2909z.f63598a, true, true, new r8b(str, u8bVarMo2909z, i5)));
                objApply.getClass();
                return (List) objApply;
            case 26:
                String str2 = (String) obj;
                str2.getClass();
                if (vk9.m23391n0(str2)) {
                    return str2.length() < str.length() ? str : str2;
                }
                return str.concat(str2);
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                bk8 bk8Var19 = (bk8) obj;
                bk8Var19.getClass();
                ik8 ik8VarMo2873e18 = bk8Var19.mo2873e0("DELETE FROM SystemIdInfo where work_spec_id=?");
                try {
                    ik8VarMo2873e18.mo2874C(1, str);
                    ik8VarMo2873e18.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e18.close();
                }
            case 28:
                bk8 bk8Var20 = (bk8) obj;
                bk8Var20.getClass();
                ik8 ik8VarMo2873e19 = bk8Var20.mo2873e0("SELECT `word`, `sentence`, `languageSrc`, `languageDst`, `translation`, `sentenceIndex`, `sentenceTokenIndex` FROM (SELECT * FROM TokenCwtEntity WHERE id = ?)");
                try {
                    ik8VarMo2873e19.mo2874C(1, str);
                    if (ik8VarMo2873e19.mo2876a0()) {
                        tokenCwt = new TokenCwt((int) ik8VarMo2873e19.getLong(5), (int) ik8VarMo2873e19.getLong(6), ik8VarMo2873e19.mo2875L(0), ik8VarMo2873e19.mo2875L(1), ik8VarMo2873e19.mo2875L(2), ik8VarMo2873e19.mo2875L(3), ik8VarMo2873e19.mo2875L(4));
                    } else {
                        tokenCwt = null;
                    }
                    return tokenCwt;
                } finally {
                    ik8VarMo2873e19.close();
                }
            default:
                bk8 bk8Var21 = (bk8) obj;
                bk8Var21.getClass();
                ik8 ik8VarMo2873e20 = bk8Var21.mo2873e0("SELECT * FROM TtsUtteranceEntity WHERE idWithLanguageAndData = ?");
                try {
                    ik8VarMo2873e20.mo2874C(1, str);
                    int iM14108v17 = AbstractC3122is.m14108v(ik8VarMo2873e20, "idWithLanguageAndData");
                    int iM14108v18 = AbstractC3122is.m14108v(ik8VarMo2873e20, "utteranceId");
                    int iM14108v19 = AbstractC3122is.m14108v(ik8VarMo2873e20, "audio");
                    int iM14108v20 = AbstractC3122is.m14108v(ik8VarMo2873e20, "text");
                    if (ik8VarMo2873e20.mo2876a0()) {
                        textToSpeechTokenUtterance = new TextToSpeechTokenUtterance(ik8VarMo2873e20.mo2875L(iM14108v17), (int) ik8VarMo2873e20.getLong(iM14108v18), ik8VarMo2873e20.mo2875L(iM14108v19), ik8VarMo2873e20.mo2875L(iM14108v20));
                        break;
                    } else {
                        textToSpeechTokenUtterance = null;
                    }
                    return textToSpeechTokenUtterance;
                } finally {
                    ik8VarMo2873e20.close();
                }
        }
    }
}
