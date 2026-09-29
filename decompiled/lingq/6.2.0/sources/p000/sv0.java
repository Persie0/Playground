package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.database.entity.ChatStatsEntity;
import com.lingq.core.database.entity.ChatSuggestionEntity;
import com.lingq.core.database.entity.CourseForImportEntity;
import com.lingq.core.database.entity.DictionaryDataEntity;
import com.lingq.core.database.entity.LessonAndCardsFromJoin;
import com.lingq.core.database.entity.LessonAndWordsFromJoin;
import com.lingq.core.database.entity.LessonBookmarkEntity;
import com.lingq.core.database.entity.LessonNextSuggestionEntity;
import com.lingq.core.database.entity.LessonStatsEntity;
import com.lingq.core.database.entity.LessonTagEntity;
import com.lingq.core.database.entity.LessonsSimplifiedJoin;
import com.lingq.core.database.entity.SharedByUserAndQueryJoin;
import com.lingq.core.database.entity.SharedByUserEntity;
import com.lingq.core.database.entity.StreakEntity;

/* JADX INFO: loaded from: classes.dex */
public final class sv0 extends r46 {

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f61452z;

    public /* synthetic */ sv0(int i) {
        this.f61452z = i;
    }

    @Override // p000.r46
    /* JADX INFO: renamed from: l */
    public final void mo17164l(ik8 ik8Var, Object obj) {
        Integer numValueOf;
        switch (this.f61452z) {
            case 0:
                no8 no8Var = (no8) obj;
                ik8Var.getClass();
                no8Var.getClass();
                ik8Var.mo2874C(1, no8Var.m17571b());
                ik8Var.mo2878j(2, no8Var.m17570a());
                break;
            case 1:
                qw0 qw0Var = (qw0) obj;
                ik8Var.getClass();
                qw0Var.getClass();
                ik8Var.mo2878j(1, qw0Var.m20184a());
                ik8Var.mo2878j(2, qw0Var.m20185b());
                ik8Var.mo2874C(3, qw0Var.m20186c());
                break;
            case 2:
                ay4 ay4Var = (ay4) obj;
                ik8Var.getClass();
                ay4Var.getClass();
                ik8Var.mo2878j(1, ay4Var.m3117b());
                ik8Var.mo2878j(2, ay4Var.m3116a());
                ik8Var.mo2878j(3, ay4Var.m3119d());
                ik8Var.mo2874C(4, ay4Var.m3118c());
                break;
            case 3:
                ChatSuggestionEntity chatSuggestionEntity = (ChatSuggestionEntity) obj;
                ik8Var.getClass();
                chatSuggestionEntity.getClass();
                ik8Var.mo2874C(1, chatSuggestionEntity.f17120a);
                ik8Var.mo2878j(2, chatSuggestionEntity.f17121b);
                ik8Var.mo2878j(3, chatSuggestionEntity.f17122c);
                ik8Var.mo2874C(4, chatSuggestionEntity.f17123d);
                ik8Var.mo2874C(5, chatSuggestionEntity.f17124e);
                break;
            case 4:
                ChatStatsEntity chatStatsEntity = (ChatStatsEntity) obj;
                ik8Var.getClass();
                chatStatsEntity.getClass();
                ik8Var.mo2878j(1, chatStatsEntity.m7580c());
                ik8Var.mo2878j(2, chatStatsEntity.m7582e());
                ik8Var.mo2878j(3, chatStatsEntity.m7581d());
                ik8Var.mo2878j(4, chatStatsEntity.m7583f());
                ik8Var.mo2878j(5, chatStatsEntity.m7584g());
                ik8Var.mo2878j(6, chatStatsEntity.m7578a());
                ik8Var.mo2877g(7, chatStatsEntity.m7579b());
                break;
            case 5:
                mw0 mw0Var = (mw0) obj;
                ik8Var.getClass();
                mw0Var.getClass();
                ik8Var.mo2878j(1, mw0Var.m17061a());
                ik8Var.mo2878j(2, mw0Var.m17062b());
                break;
            case 6:
                s91 s91Var = (s91) obj;
                ik8Var.getClass();
                s91Var.getClass();
                ik8Var.mo2878j(1, s91Var.m21163a());
                ik8Var.mo2874C(2, s91Var.m21164b());
                break;
            case 7:
                bp1 bp1Var = (bp1) obj;
                ik8Var.getClass();
                bp1Var.getClass();
                ik8Var.mo2878j(1, bp1Var.m4027b());
                ik8Var.mo2874C(2, bp1Var.m4026a());
                break;
            case 8:
                zn1 zn1Var = (zn1) obj;
                ik8Var.getClass();
                zn1Var.getClass();
                ik8Var.mo2878j(1, zn1Var.m25703a());
                ik8Var.mo2874C(2, zn1Var.m25704b());
                break;
            case 9:
                CourseForImportEntity courseForImportEntity = (CourseForImportEntity) obj;
                ik8Var.getClass();
                courseForImportEntity.getClass();
                ik8Var.mo2874C(1, courseForImportEntity.m7588a());
                ik8Var.mo2878j(2, courseForImportEntity.m7590c());
                ik8Var.mo2874C(3, courseForImportEntity.m7591d());
                ik8Var.mo2878j(4, courseForImportEntity.m7589b());
                break;
            case 10:
                DictionaryDataEntity dictionaryDataEntity = (DictionaryDataEntity) obj;
                ik8Var.getClass();
                dictionaryDataEntity.getClass();
                ik8Var.mo2878j(1, dictionaryDataEntity.f17132a);
                ik8Var.mo2874C(2, dictionaryDataEntity.f17133b);
                ik8Var.mo2878j(3, dictionaryDataEntity.f17134c);
                ik8Var.mo2874C(4, dictionaryDataEntity.f17135d);
                ik8Var.mo2874C(5, dictionaryDataEntity.f17136e);
                ik8Var.mo2878j(6, dictionaryDataEntity.f17137f ? 1L : 0L);
                ik8Var.mo2874C(7, dictionaryDataEntity.f17138g);
                ik8Var.mo2874C(8, dictionaryDataEntity.f17139h);
                ik8Var.mo2874C(9, dictionaryDataEntity.f17140i);
                ik8Var.mo2874C(10, dictionaryDataEntity.f17141j);
                ik8Var.mo2874C(11, dictionaryDataEntity.f17142k);
                ik8Var.mo2874C(12, dictionaryDataEntity.f17143l);
                ik8Var.mo2874C(13, dictionaryDataEntity.f17144m);
                break;
            case 11:
                jl4 jl4Var = (jl4) obj;
                ik8Var.getClass();
                jl4Var.getClass();
                ik8Var.mo2874C(1, jl4Var.f45669a);
                ik8Var.mo2878j(2, jl4Var.f45670b);
                break;
            case 12:
                ll4 ll4Var = (ll4) obj;
                ik8Var.getClass();
                ll4Var.getClass();
                ik8Var.mo2874C(1, ll4Var.f49795a);
                ik8Var.mo2878j(2, ll4Var.f49796b);
                break;
            case 13:
                wl4 wl4Var = (wl4) obj;
                ik8Var.getClass();
                wl4Var.getClass();
                ik8Var.mo2874C(1, wl4Var.f66998a);
                Integer num = wl4Var.f66999b;
                if (num == null) {
                    ik8Var.mo2880m(2);
                } else {
                    ik8Var.mo2878j(2, num.intValue());
                }
                Boolean bool = wl4Var.f67000c;
                Integer numValueOf2 = bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null;
                if (numValueOf2 == null) {
                    ik8Var.mo2880m(3);
                } else {
                    ik8Var.mo2878j(3, numValueOf2.intValue());
                }
                String str = wl4Var.f67001d;
                if (str == null) {
                    ik8Var.mo2880m(4);
                } else {
                    ik8Var.mo2874C(4, str);
                }
                String str2 = wl4Var.f67002e;
                if (str2 == null) {
                    ik8Var.mo2880m(5);
                } else {
                    ik8Var.mo2874C(5, str2);
                }
                ik8Var.mo2878j(6, wl4Var.f67003f.intValue());
                String str3 = wl4Var.f67004g;
                if (str3 == null) {
                    ik8Var.mo2880m(7);
                } else {
                    ik8Var.mo2874C(7, str3);
                }
                String str4 = wl4Var.f67005h;
                if (str4 == null) {
                    ik8Var.mo2880m(8);
                } else {
                    ik8Var.mo2874C(8, str4);
                }
                Boolean bool2 = wl4Var.f67006i;
                numValueOf = bool2 != null ? Integer.valueOf(bool2.booleanValue() ? 1 : 0) : null;
                if (numValueOf != null) {
                    ik8Var.mo2878j(9, numValueOf.intValue());
                } else {
                    ik8Var.mo2880m(9);
                }
                break;
            case 14:
                StreakEntity streakEntity = (StreakEntity) obj;
                ik8Var.getClass();
                streakEntity.getClass();
                ik8Var.mo2874C(1, streakEntity.f17455a);
                Integer num2 = streakEntity.f17456b;
                if (num2 == null) {
                    ik8Var.mo2880m(2);
                } else {
                    ik8Var.mo2878j(2, num2.intValue());
                }
                Double d = streakEntity.f17457c;
                if (d == null) {
                    ik8Var.mo2880m(3);
                } else {
                    ik8Var.mo2877g(3, d.doubleValue());
                }
                Integer num3 = streakEntity.f17458d;
                if (num3 == null) {
                    ik8Var.mo2880m(4);
                } else {
                    ik8Var.mo2878j(4, num3.intValue());
                }
                Boolean bool3 = streakEntity.f17459e;
                numValueOf = bool3 != null ? Integer.valueOf(bool3.booleanValue() ? 1 : 0) : null;
                if (numValueOf == null) {
                    ik8Var.mo2880m(5);
                } else {
                    ik8Var.mo2878j(5, numValueOf.intValue());
                }
                String str5 = streakEntity.f17460f;
                if (str5 != null) {
                    ik8Var.mo2874C(6, str5);
                } else {
                    ik8Var.mo2880m(6);
                }
                break;
            case 15:
                m75 m75Var = (m75) obj;
                ik8Var.getClass();
                m75Var.getClass();
                ik8Var.mo2878j(1, m75Var.m16665a());
                ik8Var.mo2874C(2, m75Var.m16666b());
                break;
            case 16:
                LessonBookmarkEntity lessonBookmarkEntity = (LessonBookmarkEntity) obj;
                ik8Var.getClass();
                lessonBookmarkEntity.getClass();
                ik8Var.mo2878j(1, lessonBookmarkEntity.m7638d());
                Integer numM7641g = lessonBookmarkEntity.m7641g();
                if (numM7641g == null) {
                    ik8Var.mo2880m(2);
                } else {
                    ik8Var.mo2878j(2, numM7641g.intValue());
                }
                Integer numM7637c = lessonBookmarkEntity.m7637c();
                if (numM7637c == null) {
                    ik8Var.mo2880m(3);
                } else {
                    ik8Var.mo2878j(3, numM7637c.intValue());
                }
                Double dM7635a = lessonBookmarkEntity.m7635a();
                if (dM7635a == null) {
                    ik8Var.mo2880m(4);
                } else {
                    ik8Var.mo2877g(4, dM7635a.doubleValue());
                }
                String strM7636b = lessonBookmarkEntity.m7636b();
                if (strM7636b == null) {
                    ik8Var.mo2880m(5);
                } else {
                    ik8Var.mo2874C(5, strM7636b);
                }
                String strM7640f = lessonBookmarkEntity.m7640f();
                if (strM7640f == null) {
                    ik8Var.mo2880m(6);
                } else {
                    ik8Var.mo2874C(6, strM7640f);
                }
                String strM7639e = lessonBookmarkEntity.m7639e();
                if (strM7639e != null) {
                    ik8Var.mo2874C(7, strM7639e);
                } else {
                    ik8Var.mo2880m(7);
                }
                break;
            case 17:
                LessonStatsEntity lessonStatsEntity = (LessonStatsEntity) obj;
                ik8Var.getClass();
                lessonStatsEntity.getClass();
                ik8Var.mo2878j(1, lessonStatsEntity.m7748b());
                ik8Var.mo2877g(2, lessonStatsEntity.m7753g());
                ik8Var.mo2877g(3, lessonStatsEntity.m7751e());
                ik8Var.mo2877g(4, lessonStatsEntity.m7750d());
                ik8Var.mo2877g(5, lessonStatsEntity.m7752f());
                ik8Var.mo2877g(6, lessonStatsEntity.m7747a());
                ik8Var.mo2877g(7, lessonStatsEntity.m7749c());
                ik8Var.mo2877g(8, lessonStatsEntity.m7754h());
                ik8Var.mo2877g(9, lessonStatsEntity.m7755i());
                break;
            case 18:
                n75 n75Var = (n75) obj;
                ik8Var.getClass();
                n75Var.getClass();
                ik8Var.mo2878j(1, n75Var.f52439a);
                ik8Var.mo2878j(2, n75Var.f52440b);
                ik8Var.mo2874C(3, n75Var.f52441c);
                break;
            case 19:
                LessonTagEntity lessonTagEntity = (LessonTagEntity) obj;
                ik8Var.getClass();
                lessonTagEntity.getClass();
                ik8Var.mo2874C(1, lessonTagEntity.m7756a());
                break;
            case 20:
                SharedByUserEntity sharedByUserEntity = (SharedByUserEntity) obj;
                ik8Var.getClass();
                sharedByUserEntity.getClass();
                ik8Var.mo2878j(1, sharedByUserEntity.m7802b());
                String strM7803c = sharedByUserEntity.m7803c();
                if (strM7803c == null) {
                    ik8Var.mo2880m(2);
                } else {
                    ik8Var.mo2874C(2, strM7803c);
                }
                String strM7801a = sharedByUserEntity.m7801a();
                if (strM7801a == null) {
                    ik8Var.mo2880m(3);
                } else {
                    ik8Var.mo2874C(3, strM7801a);
                }
                String strM7804d = sharedByUserEntity.m7804d();
                if (strM7804d == null) {
                    ik8Var.mo2880m(4);
                } else {
                    ik8Var.mo2874C(4, strM7804d);
                }
                String strM7805e = sharedByUserEntity.m7805e();
                if (strM7805e == null) {
                    ik8Var.mo2880m(5);
                } else {
                    ik8Var.mo2874C(5, strM7805e);
                }
                String strM7807g = sharedByUserEntity.m7807g();
                if (strM7807g == null) {
                    ik8Var.mo2880m(6);
                } else {
                    ik8Var.mo2874C(6, strM7807g);
                }
                String strM7806f = sharedByUserEntity.m7806f();
                if (strM7806f != null) {
                    ik8Var.mo2874C(7, strM7806f);
                } else {
                    ik8Var.mo2880m(7);
                }
                break;
            case 21:
                SharedByUserAndQueryJoin sharedByUserAndQueryJoin = (SharedByUserAndQueryJoin) obj;
                ik8Var.getClass();
                sharedByUserAndQueryJoin.getClass();
                ik8Var.mo2874C(1, sharedByUserAndQueryJoin.m7798a());
                ik8Var.mo2874C(2, sharedByUserAndQueryJoin.m7799b());
                ik8Var.mo2878j(3, sharedByUserAndQueryJoin.m7800c());
                break;
            case 22:
                LessonAndCardsFromJoin lessonAndCardsFromJoin = (LessonAndCardsFromJoin) obj;
                ik8Var.getClass();
                lessonAndCardsFromJoin.getClass();
                ik8Var.mo2878j(1, lessonAndCardsFromJoin.m7631a());
                ik8Var.mo2874C(2, lessonAndCardsFromJoin.m7632b());
                break;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                LessonAndWordsFromJoin lessonAndWordsFromJoin = (LessonAndWordsFromJoin) obj;
                ik8Var.getClass();
                lessonAndWordsFromJoin.getClass();
                ik8Var.mo2878j(1, lessonAndWordsFromJoin.m7633a());
                ik8Var.mo2874C(2, lessonAndWordsFromJoin.m7634b());
                break;
            case 24:
                LessonsSimplifiedJoin lessonsSimplifiedJoin = (LessonsSimplifiedJoin) obj;
                ik8Var.getClass();
                lessonsSimplifiedJoin.getClass();
                ik8Var.mo2878j(1, lessonsSimplifiedJoin.m7757a());
                Integer numM7758b = lessonsSimplifiedJoin.m7758b();
                if (numM7758b == null) {
                    ik8Var.mo2880m(2);
                } else {
                    ik8Var.mo2878j(2, numM7758b.intValue());
                }
                ik8Var.mo2878j(3, lessonsSimplifiedJoin.m7759c() ? 1L : 0L);
                break;
            case 25:
                LessonNextSuggestionEntity lessonNextSuggestionEntity = (LessonNextSuggestionEntity) obj;
                ik8Var.getClass();
                lessonNextSuggestionEntity.getClass();
                ik8Var.mo2878j(1, lessonNextSuggestionEntity.m7729a());
                ik8Var.mo2878j(2, lessonNextSuggestionEntity.m7731c());
                ik8Var.mo2874C(3, lessonNextSuggestionEntity.m7736h());
                String strM7730b = lessonNextSuggestionEntity.m7730b();
                if (strM7730b == null) {
                    ik8Var.mo2880m(4);
                } else {
                    ik8Var.mo2874C(4, strM7730b);
                }
                String strM7733e = lessonNextSuggestionEntity.m7733e();
                if (strM7733e == null) {
                    ik8Var.mo2880m(5);
                } else {
                    ik8Var.mo2874C(5, strM7733e);
                }
                String strM7732d = lessonNextSuggestionEntity.m7732d();
                if (strM7732d == null) {
                    ik8Var.mo2880m(6);
                } else {
                    ik8Var.mo2874C(6, strM7732d);
                }
                String strM7734f = lessonNextSuggestionEntity.m7734f();
                if (strM7734f == null) {
                    ik8Var.mo2880m(7);
                } else {
                    ik8Var.mo2874C(7, strM7734f);
                }
                String strM7735g = lessonNextSuggestionEntity.m7735g();
                if (strM7735g != null) {
                    ik8Var.mo2874C(8, strM7735g);
                } else {
                    ik8Var.mo2880m(8);
                }
                break;
            case 26:
                j65 j65Var = (j65) obj;
                ik8Var.getClass();
                j65Var.getClass();
                ik8Var.mo2878j(1, j65Var.m14304a());
                ik8Var.mo2878j(2, j65Var.m14305b());
                ik8Var.mo2874C(3, j65Var.m14306c());
                break;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                m55 m55Var = (m55) obj;
                ik8Var.getClass();
                m55Var.getClass();
                ik8Var.mo2878j(1, m55Var.m16634a());
                ik8Var.mo2874C(2, m55Var.m16635b());
                break;
            case 28:
                l75 l75Var = (l75) obj;
                ik8Var.getClass();
                l75Var.getClass();
                ik8Var.mo2878j(1, l75Var.m15964a());
                ik8Var.mo2874C(2, l75Var.m15965b());
                break;
            default:
                dp1 dp1Var = (dp1) obj;
                ik8Var.getClass();
                dp1Var.getClass();
                ik8Var.mo2878j(1, dp1Var.m10568c());
                ik8Var.mo2878j(2, dp1Var.m10566a());
                ik8Var.mo2878j(3, dp1Var.m10567b());
                ik8Var.mo2874C(4, dp1Var.m10569d());
                break;
        }
    }

    @Override // p000.r46
    /* JADX INFO: renamed from: s */
    public final String mo17165s() {
        switch (this.f61452z) {
            case 0:
                return "INSERT INTO `SearchChatHistoryJoin` (`query`,`chatId`) VALUES (?,?)";
            case 1:
                return "INSERT INTO `ChatMessageTranslationEntity` (`chatId`,`messageIndex`,`translation`) VALUES (?,?,?)";
            case 2:
                return "INSERT INTO `LessonCoachChatEntity` (`lessonId`,`chatId`,`messageIndex`,`message`) VALUES (?,?,?,?)";
            case 3:
                return "INSERT INTO `ChatSuggestionEntity` (`language`,`chatId`,`position`,`source`,`target`) VALUES (?,?,?,?,?)";
            case 4:
                return "INSERT INTO `ChatStatsEntity` (`id`,`sentences`,`knownWords`,`totalWords`,`uniqueWords`,`cards`,`coins`) VALUES (?,?,?,?,?,?,?)";
            case 5:
                return "INSERT INTO `ChatLessonJoin` (`chatId`,`lessonId`) VALUES (?,?)";
            case 6:
                return "INSERT INTO `CollectionSubscriptionEntity` (`id`,`language`) VALUES (?,?)";
            case 7:
                return "INSERT INTO `CoursesAndLanguageJoin` (`pk`,`language`) VALUES (?,?)";
            case 8:
                return "INSERT INTO `CourseAndCardsJoin` (`pk`,`termWithLanguage`) VALUES (?,?)";
            case 9:
                return "INSERT INTO `CourseForImportEntity` (`language`,`pk`,`title`,`order`) VALUES (?,?,?,?)";
            case 10:
                return "INSERT INTO `DictionaryDataEntity` (`id`,`name`,`order`,`urlToTransform`,`urlDefinition`,`isPopUpWindow`,`languageTo`,`urlVar1`,`urlVar2`,`urlVar3`,`urlVar4`,`urlVar5`,`overrideUrl`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 11:
                return "INSERT INTO `LanguageActiveDictionaryJoin` (`code`,`id`) VALUES (?,?)";
            case 12:
                return "INSERT INTO `LanguageAvailableDictionaryJoin` (`code`,`id`) VALUES (?,?)";
            case 13:
                return "INSERT INTO `LanguageEntity` (`code`,`id`,`supported`,`title`,`lastUsed`,`knownWords`,`dictionaryLocaleActive`,`grammarResourceSlug`,`scheduledForDeletion`) VALUES (?,?,?,?,?,?,?,?,?)";
            case 14:
                return "INSERT INTO `StreakEntity` (`language`,`streakDays`,`coins`,`latestStreakDays`,`isStreakBroken`,`brokenStreakDate`) VALUES (?,?,?,?,?,?)";
            case 15:
                return "INSERT INTO `LessonsAndWordsJoin` (`contentId`,`termWithLanguage`) VALUES (?,?)";
            case 16:
                return "INSERT INTO `LessonBookmarkEntity` (`contentId`,`wordIndex`,`completedWordIndex`,`audioPosition`,`client`,`timestamp`,`languageTimestamp`) VALUES (?,?,?,?,?,?,?)";
            case 17:
                return "INSERT INTO `LessonStatsEntity` (`contentId`,`readWords`,`lingqsCreated`,`knownWords`,`listeningTime`,`coinsNew`,`earnedCoins`,`studyTime`,`wpm`) VALUES (?,?,?,?,?,?,?,?,?)";
            case 18:
                return "INSERT INTO `LessonsWithPlaylistJoin` (`playlistId`,`contentId`,`language`) VALUES (?,?,?)";
            case 19:
                return "INSERT INTO `LessonTagEntity` (`title`) VALUES (?)";
            case 20:
                return "INSERT INTO `SharedByUserEntity` (`id`,`language`,`firstName`,`lastName`,`photo`,`username`,`role`) VALUES (?,?,?,?,?,?,?)";
            case 21:
                return "INSERT INTO `SharedByUserAndQueryJoin` (`language`,`query`,`userId`) VALUES (?,?,?)";
            case 22:
                return "INSERT INTO `LessonAndCardsFromJoin` (`contentId`,`termWithLanguage`) VALUES (?,?)";
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return "INSERT INTO `LessonAndWordsFromJoin` (`contentId`,`termWithLanguage`) VALUES (?,?)";
            case 24:
                return "INSERT INTO `LessonsSimplifiedJoin` (`fromId`,`toId`,`isLocked`) VALUES (?,?,?)";
            case 25:
                return "INSERT INTO `LessonNextSuggestionEntity` (`id`,`lessonId`,`title`,`image`,`sourceType`,`sourceName`,`sourceUrl`,`status`) VALUES (?,?,?,?,?,?,?,?)";
            case 26:
                return "INSERT INTO `LessonSentenceTranslationEntity` (`lessonId`,`sentenceIndex`,`text`) VALUES (?,?,?)";
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                return "INSERT INTO `LessonPreviewEntity` (`lessonId`,`preview`) VALUES (?,?)";
            case 28:
                return "INSERT INTO `LessonsAndCardsJoin` (`contentId`,`termWithLanguage`) VALUES (?,?)";
            default:
                return "INSERT INTO `CoursesAndLessonsSortJoin` (`pk`,`contentId`,`courseOrder`,`sort`) VALUES (?,?,?,?)";
        }
    }
}
