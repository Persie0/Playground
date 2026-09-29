package p000;

import android.content.Context;
import android.webkit.WebView;
import androidx.compose.p002ui.semantics.AbstractC0424d;
import androidx.compose.p002ui.semantics.AbstractC0426f;
import androidx.compose.p002ui.semantics.C0427g;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.challenge.Challenge;
import com.lingq.core.domain.model.chat.ChatHistoryOld;
import com.lingq.core.domain.model.language.CourseForImport;
import com.lingq.core.domain.model.language.DictionaryLocale;
import com.lingq.core.domain.model.milestones.Badge;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t70 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61925a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f61926b;

    public /* synthetic */ t70(String str, int i) {
        this.f61925a = i;
        this.f61926b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        int i = this.f61925a;
        int i2 = 10;
        int i3 = 9;
        int i4 = 8;
        int i5 = 7;
        int i6 = 6;
        int i7 = 5;
        Object objValueOf = null;
        boolean z = false;
        xfa xfaVar = xfa.f68157a;
        String str = this.f61926b;
        switch (i) {
            case 0:
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT `languageAndSlug`, `language`, `slug`, `name`, `goal`, `gainedAt`, `imageUrl` FROM (SELECT * FROM BadgeEntity WHERE language = ?)");
                try {
                    ik8VarMo2873e0.mo2874C(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (ik8VarMo2873e0.mo2876a0()) {
                        arrayList.add(new Badge((int) ik8VarMo2873e0.getLong(4), ik8VarMo2873e0.mo2875L(0), ik8VarMo2873e0.mo2875L(1), ik8VarMo2873e0.mo2875L(2), ik8VarMo2873e0.mo2875L(3), ik8VarMo2873e0.mo2875L(5), ik8VarMo2873e0.isNull(6) ? null : ik8VarMo2873e0.mo2875L(6)));
                        break;
                    }
                    return arrayList;
                } finally {
                    ik8VarMo2873e0.close();
                }
            case 1:
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                ik8 ik8VarMo2873e1 = bk8Var2.mo2873e0("DELETE FROM BadgeEntity WHERE language = ?");
                try {
                    ik8VarMo2873e1.mo2874C(1, str);
                    ik8VarMo2873e1.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e1.close();
                }
            case 2:
                tv8 tv8Var = (tv8) obj;
                bh4[] bh4VarArr = AbstractC0426f.f5022a;
                C0427g c0427g = AbstractC0424d.f5004k;
                bh4 bh4Var = AbstractC0426f.f5022a[3];
                tv8Var.mo3709d(c0427g, new ch5(1));
                AbstractC0426f.m1861e(tv8Var, str);
                return xfaVar;
            case 3:
                pya pyaVar = (pya) obj;
                pyaVar.getClass();
                return str + "-" + pyaVar.f57001a;
            case 4:
                AbstractC0426f.m1860d((tv8) obj, str);
                return xfaVar;
            case 5:
                tv8 tv8Var2 = (tv8) obj;
                AbstractC0426f.m1861e(tv8Var2, str);
                C0427g c0427g2 = AbstractC0424d.f5014u;
                bh4 bh4Var2 = AbstractC0426f.f5022a[11];
                tv8Var2.mo3709d(c0427g2, Float.valueOf(0.0f));
                return xfaVar;
            case 6:
                bk8 bk8Var3 = (bk8) obj;
                bk8Var3.getClass();
                ik8 ik8VarMo2873e2 = bk8Var3.mo2873e0("DELETE FROM CardEntity WHERE termWithLanguage = ?");
                try {
                    ik8VarMo2873e2.mo2874C(1, str);
                    ik8VarMo2873e2.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e2.close();
                }
            case 7:
                bk8 bk8Var4 = (bk8) obj;
                bk8Var4.getClass();
                ik8 ik8VarMo2873e3 = bk8Var4.mo2873e0("SELECT `pk`, `code`, `title`, `challengeType`, `description`, `startDate`, `endDate`, `participantsCount`, `badgeUrl`, `isCompleted`, `isJoined`, `rank`, `challengeLanguage`, `status`, `signupDeadline` FROM (SELECT * FROM ChallengeEntity WHERE language = ? AND  (code LIKE  '%_' || ? OR (challengeType = 'monthlyLingQing' OR challengeType = 'hardcore90days' OR challengeType = 'monthly90days')) ORDER BY isJoined DESC, `order` LIMIT ?)");
                try {
                    ik8VarMo2873e3.mo2874C(1, str);
                    ik8VarMo2873e3.mo2874C(2, str);
                    ik8VarMo2873e3.mo2878j(3, 4L);
                    ArrayList arrayList2 = new ArrayList();
                    while (ik8VarMo2873e3.mo2876a0()) {
                        arrayList2.add(new Challenge((int) ik8VarMo2873e3.getLong(0), ik8VarMo2873e3.mo2875L(1), ik8VarMo2873e3.mo2875L(2), ik8VarMo2873e3.mo2875L(4), ik8VarMo2873e3.isNull(5) ? null : ik8VarMo2873e3.mo2875L(5), ik8VarMo2873e3.isNull(6) ? null : ik8VarMo2873e3.mo2875L(6), ik8VarMo2873e3.mo2875L(3), (int) ik8VarMo2873e3.getLong(7), ik8VarMo2873e3.isNull(8) ? null : ik8VarMo2873e3.mo2875L(8), ((int) ik8VarMo2873e3.getLong(10)) != 0, (int) ik8VarMo2873e3.getLong(11), ((int) ik8VarMo2873e3.getLong(9)) != 0, ik8VarMo2873e3.isNull(12) ? null : ik8VarMo2873e3.mo2875L(12), ik8VarMo2873e3.isNull(14) ? null : ik8VarMo2873e3.mo2875L(14), ik8VarMo2873e3.isNull(13) ? null : ik8VarMo2873e3.mo2875L(13)));
                        break;
                    }
                    return arrayList2;
                } finally {
                    ik8VarMo2873e3.close();
                }
            case 8:
                bk8 bk8Var5 = (bk8) obj;
                bk8Var5.getClass();
                ik8 ik8VarMo2873e4 = bk8Var5.mo2873e0("SELECT `order` FROM ChallengeEntity WHERE language = ? ORDER BY `order` DESC LIMIT 1");
                try {
                    ik8VarMo2873e4.mo2874C(1, str);
                    if (ik8VarMo2873e4.mo2876a0() && !ik8VarMo2873e4.isNull(0)) {
                        objValueOf = Integer.valueOf((int) ik8VarMo2873e4.getLong(0));
                        break;
                    }
                    return objValueOf;
                } finally {
                    ik8VarMo2873e4.close();
                }
            case 9:
                bk8 bk8Var6 = (bk8) obj;
                bk8Var6.getClass();
                ik8 ik8VarMo2873e5 = bk8Var6.mo2873e0("DELETE FROM ChallengeEntity WHERE code = ?");
                try {
                    ik8VarMo2873e5.mo2874C(1, str);
                    ik8VarMo2873e5.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e5.close();
                }
            case 10:
                bk8 bk8Var7 = (bk8) obj;
                bk8Var7.getClass();
                ik8 ik8VarMo2873e6 = bk8Var7.mo2873e0("SELECT `pk`, `code`, `title`, `challengeType`, `description`, `startDate`, `endDate`, `participantsCount`, `badgeUrl`, `isCompleted`, `isJoined`, `rank`, `challengeLanguage`, `status`, `signupDeadline` FROM (SELECT * FROM ChallengeEntity WHERE language = ? ORDER BY isJoined DESC, `order`)");
                try {
                    ik8VarMo2873e6.mo2874C(1, str);
                    ArrayList arrayList3 = new ArrayList();
                    while (ik8VarMo2873e6.mo2876a0()) {
                        arrayList3.add(new Challenge((int) ik8VarMo2873e6.getLong(0), ik8VarMo2873e6.mo2875L(1), ik8VarMo2873e6.mo2875L(2), ik8VarMo2873e6.mo2875L(4), ik8VarMo2873e6.isNull(5) ? null : ik8VarMo2873e6.mo2875L(5), ik8VarMo2873e6.isNull(6) ? null : ik8VarMo2873e6.mo2875L(6), ik8VarMo2873e6.mo2875L(3), (int) ik8VarMo2873e6.getLong(7), ik8VarMo2873e6.isNull(8) ? null : ik8VarMo2873e6.mo2875L(8), ((int) ik8VarMo2873e6.getLong(10)) != 0, (int) ik8VarMo2873e6.getLong(11), ((int) ik8VarMo2873e6.getLong(9)) != 0, ik8VarMo2873e6.isNull(12) ? null : ik8VarMo2873e6.mo2875L(12), ik8VarMo2873e6.isNull(14) ? null : ik8VarMo2873e6.mo2875L(14), ik8VarMo2873e6.isNull(13) ? null : ik8VarMo2873e6.mo2875L(13)));
                        break;
                    }
                    return arrayList3;
                } finally {
                    ik8VarMo2873e6.close();
                }
            case 11:
                bk8 bk8Var8 = (bk8) obj;
                bk8Var8.getClass();
                ik8 ik8VarMo2873e7 = bk8Var8.mo2873e0("SELECT `id`, `title`, `image`, `startedAt` FROM (SELECT * FROM ChatHistoryEntity WHERE targetLanguage = ? AND id != -1 ORDER BY startedAt DESC)");
                try {
                    ik8VarMo2873e7.mo2874C(1, str);
                    ArrayList arrayList4 = new ArrayList();
                    while (ik8VarMo2873e7.mo2876a0()) {
                        arrayList4.add(new ChatHistoryOld(ik8VarMo2873e7.mo2875L(1), (int) ik8VarMo2873e7.getLong(0), ik8VarMo2873e7.mo2875L(2), ik8VarMo2873e7.mo2875L(3)));
                    }
                    ik8VarMo2873e7.close();
                    return arrayList4;
                } catch (Throwable th) {
                    ik8VarMo2873e7.close();
                    throw th;
                }
            case 12:
                tv8 tv8Var3 = (tv8) obj;
                tv8Var3.getClass();
                AbstractC0426f.m1860d(tv8Var3, str);
                return xfaVar;
            case 13:
                bk8 bk8Var9 = (bk8) obj;
                bk8Var9.getClass();
                ik8 ik8VarMo2873e8 = bk8Var9.mo2873e0("SELECT `id`, `url`, `description`, `pos`, `originalImageUrl`, `imageUrl`, `language`, `title`, `collectionTitle`, `collectionId`, `listenTimes`, `duration`, `audioUrl`, `videoUrl`, `playlistLessonOrder`, `isCourse`, `isCourseLesson`, `price`, `level`, `counterListenTimes`, `audioStart`, `audioEnd`, `isTaken` FROM (\n        SELECT DISTINCT\n            LibraryDataEntity.id,\n            LibraryDataEntity.url,\n            LibraryDataEntity.description,\n            LibraryDataEntity.pos,\n            LibraryDataEntity.originalImageUrl,\n            LibraryDataEntity.imageUrl,\n            PlaylistAndLessonsJoin.language AS language,\n            LibraryDataEntity.title,\n            LibraryDataEntity.collectionTitle,\n            LibraryDataEntity.collectionId,\n            LibraryDataEntity.listenTimes,\n            LibraryDataEntity.duration,\n            LibraryDataEntity.audioUrl,\n            LibraryDataEntity.videoUrl,\n            LibraryDataEntity.sourceUrl,\n            CoursesAndLessonsJoin.courseOrder AS playlistLessonOrder,\n            0 AS isCourse,\n            1 AS isCourseLesson,\n            LibraryDataEntity.price,\n            LibraryDataEntity.level,\n            LibraryCounterEntity.listenTimes AS counterListenTimes,\n            LibraryCounterEntity.audioStart AS audioStart,\n            LibraryCounterEntity.audioEnd AS audioEnd,\n            IFNULL(IFNULL(LibraryCounterEntity.isTaken, LibraryDataEntity.isTaken), 0) AS isTaken\n        FROM LibraryDataEntity\n            INNER JOIN CoursesAndLessonsJoin ON LibraryDataEntity.id = CoursesAndLessonsJoin.contentId\n            INNER JOIN LibraryDataEntity AS lde ON LibraryDataEntity.collectionId = lde.id\n            INNER JOIN PlaylistAndLessonsJoin ON lde.id = PlaylistAndLessonsJoin.contentId\n            INNER JOIN PlaylistEntity ON PlaylistEntity.nameWithLanguage = PlaylistAndLessonsJoin.nameWithLanguage\n            LEFT JOIN LibraryCounterEntity ON LibraryCounterEntity.id = LibraryDataEntity.id\n        WHERE CoursesAndLessonsJoin.pk = LibraryDataEntity.collectionId\n            AND LibraryDataEntity.type = 'content' AND lde.type = 'collection'\n            AND PlaylistEntity.nameWithLanguage = ? AND PlaylistAndLessonsJoin.isCourse = 1\n        ORDER BY CoursesAndLessonsJoin.courseOrder ASC\n        )");
                try {
                    ik8VarMo2873e8.mo2874C(1, str);
                    ArrayList arrayList5 = new ArrayList();
                    while (ik8VarMo2873e8.mo2876a0()) {
                        arrayList5.add(new ud7((int) ik8VarMo2873e8.getLong(0), ik8VarMo2873e8.isNull(1) ? null : ik8VarMo2873e8.mo2875L(1), ik8VarMo2873e8.isNull(2) ? null : ik8VarMo2873e8.mo2875L(2), (int) ik8VarMo2873e8.getLong(3), ik8VarMo2873e8.isNull(4) ? null : ik8VarMo2873e8.mo2875L(4), ik8VarMo2873e8.isNull(i7) ? null : ik8VarMo2873e8.mo2875L(i7), ik8VarMo2873e8.isNull(i6) ? null : ik8VarMo2873e8.mo2875L(i6), ik8VarMo2873e8.mo2875L(i5), ik8VarMo2873e8.isNull(i4) ? null : ik8VarMo2873e8.mo2875L(i4), (int) ik8VarMo2873e8.getLong(i3), ik8VarMo2873e8.isNull(i2) ? null : Double.valueOf(ik8VarMo2873e8.getDouble(i2)), (int) ik8VarMo2873e8.getLong(11), ik8VarMo2873e8.isNull(12) ? null : ik8VarMo2873e8.mo2875L(12), ik8VarMo2873e8.isNull(13) ? null : ik8VarMo2873e8.mo2875L(13), ik8VarMo2873e8.isNull(14) ? null : Integer.valueOf((int) ik8VarMo2873e8.getLong(14)), ((int) ik8VarMo2873e8.getLong(15)) != 0, ((int) ik8VarMo2873e8.getLong(16)) != 0, (int) ik8VarMo2873e8.getLong(17), ik8VarMo2873e8.isNull(18) ? null : ik8VarMo2873e8.mo2875L(18), ik8VarMo2873e8.isNull(19) ? null : Double.valueOf(ik8VarMo2873e8.getDouble(19)), ((int) ik8VarMo2873e8.getLong(22)) != 0, null, ik8VarMo2873e8.isNull(20) ? null : Double.valueOf(ik8VarMo2873e8.getDouble(20)), ik8VarMo2873e8.isNull(21) ? null : Double.valueOf(ik8VarMo2873e8.getDouble(21))));
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        i5 = 7;
                        i6 = 6;
                        i7 = 5;
                        break;
                    }
                    return arrayList5;
                } finally {
                    ik8VarMo2873e8.close();
                }
            case 14:
                bk8 bk8Var10 = (bk8) obj;
                bk8Var10.getClass();
                ik8 ik8VarMo2873e9 = bk8Var10.mo2873e0("SELECT `language`, `pk`, `title` FROM (SELECT * FROM CourseForImportEntity WHERE language = ? ORDER BY `order`)");
                try {
                    ik8VarMo2873e9.mo2874C(1, str);
                    ArrayList arrayList6 = new ArrayList();
                    while (ik8VarMo2873e9.mo2876a0()) {
                        arrayList6.add(new CourseForImport(ik8VarMo2873e9.mo2875L(0), (int) ik8VarMo2873e9.getLong(1), ik8VarMo2873e9.mo2875L(2)));
                    }
                    ik8VarMo2873e9.close();
                    return arrayList6;
                } catch (Throwable th2) {
                    ik8VarMo2873e9.close();
                    throw th2;
                }
            case 15:
                bk8 bk8Var11 = (bk8) obj;
                bk8Var11.getClass();
                ik8 ik8VarMo2873e10 = bk8Var11.mo2873e0("SELECT * FROM CupContributorMeEntity WHERE scope = ?");
                try {
                    ik8VarMo2873e10.mo2874C(1, str);
                    int iM14108v = AbstractC3122is.m14108v(ik8VarMo2873e10, "scope");
                    int iM14108v2 = AbstractC3122is.m14108v(ik8VarMo2873e10, "rank");
                    int iM14108v3 = AbstractC3122is.m14108v(ik8VarMo2873e10, "score");
                    if (ik8VarMo2873e10.mo2876a0()) {
                        objValueOf = new dt1((int) ik8VarMo2873e10.getLong(iM14108v3), ik8VarMo2873e10.isNull(iM14108v2) ? null : Integer.valueOf((int) ik8VarMo2873e10.getLong(iM14108v2)), ik8VarMo2873e10.mo2875L(iM14108v));
                    }
                    return objValueOf;
                } finally {
                    ik8VarMo2873e10.close();
                }
            case 16:
                bk8 bk8Var12 = (bk8) obj;
                bk8Var12.getClass();
                ik8 ik8VarMo2873e11 = bk8Var12.mo2873e0("DELETE FROM CupContributorMeEntity WHERE scope = ?");
                try {
                    ik8VarMo2873e11.mo2874C(1, str);
                    ik8VarMo2873e11.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e11.close();
                }
            case 17:
                bk8 bk8Var13 = (bk8) obj;
                bk8Var13.getClass();
                ik8 ik8VarMo2873e12 = bk8Var13.mo2873e0("SELECT * FROM CupContributorEntity WHERE scope = ? ORDER BY rank ASC");
                try {
                    ik8VarMo2873e12.mo2874C(1, str);
                    int iM14108v4 = AbstractC3122is.m14108v(ik8VarMo2873e12, "scope");
                    int iM14108v5 = AbstractC3122is.m14108v(ik8VarMo2873e12, "profileId");
                    int iM14108v6 = AbstractC3122is.m14108v(ik8VarMo2873e12, "rank");
                    int iM14108v7 = AbstractC3122is.m14108v(ik8VarMo2873e12, "prevRank");
                    int iM14108v8 = AbstractC3122is.m14108v(ik8VarMo2873e12, "delta");
                    int iM14108v9 = AbstractC3122is.m14108v(ik8VarMo2873e12, "username");
                    int iM14108v10 = AbstractC3122is.m14108v(ik8VarMo2873e12, "photoUrl");
                    int iM14108v11 = AbstractC3122is.m14108v(ik8VarMo2873e12, "teamCode");
                    int iM14108v12 = AbstractC3122is.m14108v(ik8VarMo2873e12, "score");
                    ArrayList arrayList7 = new ArrayList();
                    while (ik8VarMo2873e12.mo2876a0()) {
                        arrayList7.add(new ct1(ik8VarMo2873e12.mo2875L(iM14108v4), (int) ik8VarMo2873e12.getLong(iM14108v5), (int) ik8VarMo2873e12.getLong(iM14108v6), ik8VarMo2873e12.isNull(iM14108v7) ? null : Integer.valueOf((int) ik8VarMo2873e12.getLong(iM14108v7)), ik8VarMo2873e12.isNull(iM14108v8) ? null : Integer.valueOf((int) ik8VarMo2873e12.getLong(iM14108v8)), ik8VarMo2873e12.mo2875L(iM14108v9), ik8VarMo2873e12.isNull(iM14108v10) ? null : ik8VarMo2873e12.mo2875L(iM14108v10), ik8VarMo2873e12.mo2875L(iM14108v11), (int) ik8VarMo2873e12.getLong(iM14108v12)));
                        break;
                    }
                    return arrayList7;
                } finally {
                    ik8VarMo2873e12.close();
                }
            case 18:
                bk8 bk8Var14 = (bk8) obj;
                bk8Var14.getClass();
                ik8 ik8VarMo2873e13 = bk8Var14.mo2873e0("DELETE FROM CupContributorEntity WHERE scope = ?");
                try {
                    ik8VarMo2873e13.mo2874C(1, str);
                    ik8VarMo2873e13.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e13.close();
                }
            case 19:
                AbstractC0426f.m1861e((tv8) obj, str);
                return xfaVar;
            case 20:
                bk8 bk8Var15 = (bk8) obj;
                bk8Var15.getClass();
                ik8 ik8VarMo2873e14 = bk8Var15.mo2873e0("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
                try {
                    ik8VarMo2873e14.mo2874C(1, str);
                    if (ik8VarMo2873e14.mo2876a0() && ((int) ik8VarMo2873e14.getLong(0)) != 0) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                } finally {
                    ik8VarMo2873e14.close();
                }
            case 21:
                bk8 bk8Var16 = (bk8) obj;
                bk8Var16.getClass();
                ik8 ik8VarMo2873e15 = bk8Var16.mo2873e0("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
                try {
                    ik8VarMo2873e15.mo2874C(1, str);
                    ArrayList arrayList8 = new ArrayList();
                    while (ik8VarMo2873e15.mo2876a0()) {
                        arrayList8.add(ik8VarMo2873e15.mo2875L(0));
                    }
                    ik8VarMo2873e15.close();
                    return arrayList8;
                } catch (Throwable th3) {
                    ik8VarMo2873e15.close();
                    throw th3;
                }
            case 22:
                bk8 bk8Var17 = (bk8) obj;
                bk8Var17.getClass();
                ik8 ik8VarMo2873e16 = bk8Var17.mo2873e0("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                try {
                    ik8VarMo2873e16.mo2874C(1, str);
                    if (ik8VarMo2873e16.mo2876a0() && ((int) ik8VarMo2873e16.getLong(0)) != 0) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                } finally {
                    ik8VarMo2873e16.close();
                }
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                WebView webView = (WebView) obj;
                webView.getClass();
                webView.loadUrl(str);
                return xfaVar;
            case 24:
                bk8 bk8Var18 = (bk8) obj;
                bk8Var18.getClass();
                ik8 ik8VarMo2873e17 = bk8Var18.mo2873e0("\n    SELECT `order` FROM DictionaryDataEntity\n    INNER JOIN LanguageActiveDictionaryJoin ON LanguageActiveDictionaryJoin.code = ?\n    AND LanguageActiveDictionaryJoin.id = DictionaryDataEntity.id\n    ORDER BY DictionaryDataEntity.`order` DESC LIMIT 1");
                try {
                    ik8VarMo2873e17.mo2874C(1, str);
                    if (ik8VarMo2873e17.mo2876a0() && !ik8VarMo2873e17.isNull(0)) {
                        objValueOf = Integer.valueOf((int) ik8VarMo2873e17.getLong(0));
                        break;
                    }
                    return objValueOf;
                } finally {
                    ik8VarMo2873e17.close();
                }
            case 25:
                bk8 bk8Var19 = (bk8) obj;
                bk8Var19.getClass();
                ik8 ik8VarMo2873e18 = bk8Var19.mo2873e0("\n    SELECT DISTINCT DictionaryLocaleEntity.* FROM DictionaryLocaleEntity\n    INNER JOIN LanguageDictionaryLocaleJoin ON LanguageDictionaryLocaleJoin.language = ?\n    AND LanguageDictionaryLocaleJoin.code = DictionaryLocaleEntity.code");
                try {
                    ik8VarMo2873e18.mo2874C(1, str);
                    int iM14108v13 = AbstractC3122is.m14108v(ik8VarMo2873e18, "code");
                    int iM14108v14 = AbstractC3122is.m14108v(ik8VarMo2873e18, "title");
                    ArrayList arrayList9 = new ArrayList();
                    while (ik8VarMo2873e18.mo2876a0()) {
                        arrayList9.add(new DictionaryLocale(ik8VarMo2873e18.mo2875L(iM14108v13), ik8VarMo2873e18.mo2875L(iM14108v14)));
                    }
                    ik8VarMo2873e18.close();
                    return arrayList9;
                } catch (Throwable th4) {
                    ik8VarMo2873e18.close();
                    throw th4;
                }
            case 26:
                Context context = (Context) obj;
                context.getClass();
                YouTubePlayerView youTubePlayerView = new YouTubePlayerView(context);
                youTubePlayerView.m9820a(new sp2(str, 0));
                return youTubePlayerView;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                Context context2 = (Context) obj;
                context2.getClass();
                YouTubePlayerView youTubePlayerView2 = new YouTubePlayerView(context2);
                youTubePlayerView2.m9820a(new sp2(str, 1));
                return youTubePlayerView2;
            case 28:
                bk8 bk8Var20 = (bk8) obj;
                bk8Var20.getClass();
                ik8 ik8VarMo2873e19 = bk8Var20.mo2873e0("DELETE FROM LanguageContextEntity WHERE code = ?");
                try {
                    ik8VarMo2873e19.mo2874C(1, str);
                    ik8VarMo2873e19.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e19.close();
                }
            default:
                bk8 bk8Var21 = (bk8) obj;
                bk8Var21.getClass();
                ik8 ik8VarMo2873e20 = bk8Var21.mo2873e0("UPDATE LanguageEntity SET lastUsed = NULL WHERE code = ?");
                try {
                    ik8VarMo2873e20.mo2874C(1, str);
                    ik8VarMo2873e20.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e20.close();
                }
        }
    }
}
