package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.database.entity.CardEntity;
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

/* JADX INFO: loaded from: classes.dex */
public final class qn0 extends ss5 {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f57956p;

    public /* synthetic */ qn0(int i) {
        this.f57956p = i;
    }

    @Override // p000.ss5
    /* JADX INFO: renamed from: m */
    public final void mo16668m(ik8 ik8Var, Object obj) {
        switch (this.f57956p) {
            case 0:
                CardEntity cardEntity = (CardEntity) obj;
                ik8Var.getClass();
                cardEntity.getClass();
                ik8Var.mo2874C(1, cardEntity.m7545z());
                break;
            case 1:
                no8 no8Var = (no8) obj;
                ik8Var.getClass();
                no8Var.getClass();
                ik8Var.mo2874C(1, no8Var.m17571b());
                ik8Var.mo2878j(2, no8Var.m17570a());
                ik8Var.mo2874C(3, no8Var.m17571b());
                ik8Var.mo2878j(4, no8Var.m17570a());
                break;
            case 2:
                qw0 qw0Var = (qw0) obj;
                ik8Var.getClass();
                qw0Var.getClass();
                ik8Var.mo2878j(1, qw0Var.m20184a());
                ik8Var.mo2878j(2, qw0Var.m20185b());
                ik8Var.mo2874C(3, qw0Var.m20186c());
                ik8Var.mo2878j(4, qw0Var.m20184a());
                ik8Var.mo2878j(5, qw0Var.m20185b());
                break;
            case 3:
                ay4 ay4Var = (ay4) obj;
                ik8Var.getClass();
                ay4Var.getClass();
                ik8Var.mo2878j(1, ay4Var.m3117b());
                ik8Var.mo2878j(2, ay4Var.m3116a());
                ik8Var.mo2878j(3, ay4Var.m3119d());
                ik8Var.mo2874C(4, ay4Var.m3118c());
                ik8Var.mo2878j(5, ay4Var.m3117b());
                break;
            case 4:
                ChatSuggestionEntity chatSuggestionEntity = (ChatSuggestionEntity) obj;
                ik8Var.getClass();
                chatSuggestionEntity.getClass();
                String str = chatSuggestionEntity.f17120a;
                ik8Var.mo2874C(1, str);
                long j = chatSuggestionEntity.f17121b;
                ik8Var.mo2878j(2, j);
                long j2 = chatSuggestionEntity.f17122c;
                ik8Var.mo2878j(3, j2);
                ik8Var.mo2874C(4, chatSuggestionEntity.f17123d);
                ik8Var.mo2874C(5, chatSuggestionEntity.f17124e);
                ik8Var.mo2874C(6, str);
                ik8Var.mo2878j(7, j);
                ik8Var.mo2878j(8, j2);
                break;
            case 5:
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
                ik8Var.mo2878j(8, chatStatsEntity.m7580c());
                break;
            case 6:
                mw0 mw0Var = (mw0) obj;
                ik8Var.getClass();
                mw0Var.getClass();
                ik8Var.mo2878j(1, mw0Var.m17061a());
                ik8Var.mo2878j(2, mw0Var.m17062b());
                ik8Var.mo2878j(3, mw0Var.m17061a());
                break;
            case 7:
                s91 s91Var = (s91) obj;
                ik8Var.getClass();
                s91Var.getClass();
                ik8Var.mo2878j(1, s91Var.m21163a());
                ik8Var.mo2874C(2, s91Var.m21164b());
                ik8Var.mo2878j(3, s91Var.m21163a());
                ik8Var.mo2874C(4, s91Var.m21164b());
                break;
            case 8:
                bp1 bp1Var = (bp1) obj;
                ik8Var.getClass();
                bp1Var.getClass();
                ik8Var.mo2878j(1, bp1Var.m4027b());
                ik8Var.mo2874C(2, bp1Var.m4026a());
                ik8Var.mo2878j(3, bp1Var.m4027b());
                ik8Var.mo2874C(4, bp1Var.m4026a());
                break;
            case 9:
                zn1 zn1Var = (zn1) obj;
                ik8Var.getClass();
                zn1Var.getClass();
                ik8Var.mo2878j(1, zn1Var.m25703a());
                ik8Var.mo2874C(2, zn1Var.m25704b());
                ik8Var.mo2878j(3, zn1Var.m25703a());
                ik8Var.mo2874C(4, zn1Var.m25704b());
                break;
            case 10:
                CourseForImportEntity courseForImportEntity = (CourseForImportEntity) obj;
                ik8Var.getClass();
                courseForImportEntity.getClass();
                ik8Var.mo2874C(1, courseForImportEntity.m7588a());
                ik8Var.mo2878j(2, courseForImportEntity.m7590c());
                ik8Var.mo2874C(3, courseForImportEntity.m7591d());
                ik8Var.mo2878j(4, courseForImportEntity.m7589b());
                ik8Var.mo2874C(5, courseForImportEntity.m7588a());
                ik8Var.mo2878j(6, courseForImportEntity.m7590c());
                break;
            case 11:
                jl4 jl4Var = (jl4) obj;
                ik8Var.getClass();
                jl4Var.getClass();
                ik8Var.mo2874C(1, jl4Var.f45669a);
                ik8Var.mo2878j(2, jl4Var.f45670b);
                break;
            case 12:
                DictionaryDataEntity dictionaryDataEntity = (DictionaryDataEntity) obj;
                ik8Var.getClass();
                dictionaryDataEntity.getClass();
                long j3 = dictionaryDataEntity.f17132a;
                ik8Var.mo2878j(1, j3);
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
                ik8Var.mo2878j(14, j3);
                break;
            case 13:
                jl4 jl4Var2 = (jl4) obj;
                ik8Var.getClass();
                jl4Var2.getClass();
                String str2 = jl4Var2.f45669a;
                ik8Var.mo2874C(1, str2);
                long j4 = jl4Var2.f45670b;
                ik8Var.mo2878j(2, j4);
                ik8Var.mo2874C(3, str2);
                ik8Var.mo2878j(4, j4);
                break;
            case 14:
                ll4 ll4Var = (ll4) obj;
                ik8Var.getClass();
                ll4Var.getClass();
                String str3 = ll4Var.f49795a;
                ik8Var.mo2874C(1, str3);
                long j5 = ll4Var.f49796b;
                ik8Var.mo2878j(2, j5);
                ik8Var.mo2874C(3, str3);
                ik8Var.mo2878j(4, j5);
                break;
            case 15:
                wl4 wl4Var = (wl4) obj;
                ik8Var.getClass();
                wl4Var.getClass();
                String str4 = wl4Var.f66998a;
                ik8Var.mo2874C(1, str4);
                Integer num = wl4Var.f66999b;
                if (num == null) {
                    ik8Var.mo2880m(2);
                } else {
                    ik8Var.mo2878j(2, num.intValue());
                }
                Boolean bool = wl4Var.f67000c;
                Integer numValueOf = bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null;
                if (numValueOf == null) {
                    ik8Var.mo2880m(3);
                } else {
                    ik8Var.mo2878j(3, numValueOf.intValue());
                }
                String str5 = wl4Var.f67001d;
                if (str5 == null) {
                    ik8Var.mo2880m(4);
                } else {
                    ik8Var.mo2874C(4, str5);
                }
                String str6 = wl4Var.f67002e;
                if (str6 == null) {
                    ik8Var.mo2880m(5);
                } else {
                    ik8Var.mo2874C(5, str6);
                }
                ik8Var.mo2878j(6, wl4Var.f67003f.intValue());
                String str7 = wl4Var.f67004g;
                if (str7 == null) {
                    ik8Var.mo2880m(7);
                } else {
                    ik8Var.mo2874C(7, str7);
                }
                String str8 = wl4Var.f67005h;
                if (str8 == null) {
                    ik8Var.mo2880m(8);
                } else {
                    ik8Var.mo2874C(8, str8);
                }
                Boolean bool2 = wl4Var.f67006i;
                Integer numValueOf2 = bool2 != null ? Integer.valueOf(bool2.booleanValue() ? 1 : 0) : null;
                if (numValueOf2 == null) {
                    ik8Var.mo2880m(9);
                } else {
                    ik8Var.mo2878j(9, numValueOf2.intValue());
                }
                ik8Var.mo2874C(10, str4);
                break;
            case 16:
                l75 l75Var = (l75) obj;
                ik8Var.getClass();
                l75Var.getClass();
                ik8Var.mo2878j(1, l75Var.m15964a());
                ik8Var.mo2874C(2, l75Var.m15965b());
                ik8Var.mo2878j(3, l75Var.m15964a());
                ik8Var.mo2874C(4, l75Var.m15965b());
                break;
            case 17:
                m75 m75Var = (m75) obj;
                ik8Var.getClass();
                m75Var.getClass();
                ik8Var.mo2878j(1, m75Var.m16665a());
                ik8Var.mo2874C(2, m75Var.m16666b());
                ik8Var.mo2878j(3, m75Var.m16665a());
                ik8Var.mo2874C(4, m75Var.m16666b());
                break;
            case 18:
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
                if (strM7639e == null) {
                    ik8Var.mo2880m(7);
                } else {
                    ik8Var.mo2874C(7, strM7639e);
                }
                ik8Var.mo2878j(8, lessonBookmarkEntity.m7638d());
                break;
            case 19:
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
                ik8Var.mo2878j(10, lessonStatsEntity.m7748b());
                break;
            case 20:
                n75 n75Var = (n75) obj;
                ik8Var.getClass();
                n75Var.getClass();
                long j6 = n75Var.f52439a;
                ik8Var.mo2878j(1, j6);
                long j7 = n75Var.f52440b;
                ik8Var.mo2878j(2, j7);
                ik8Var.mo2874C(3, n75Var.f52441c);
                ik8Var.mo2878j(4, j6);
                ik8Var.mo2878j(5, j7);
                break;
            case 21:
                LessonTagEntity lessonTagEntity = (LessonTagEntity) obj;
                ik8Var.getClass();
                lessonTagEntity.getClass();
                ik8Var.mo2874C(1, lessonTagEntity.m7756a());
                ik8Var.mo2874C(2, lessonTagEntity.m7756a());
                break;
            case 22:
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
                if (strM7806f == null) {
                    ik8Var.mo2880m(7);
                } else {
                    ik8Var.mo2874C(7, strM7806f);
                }
                ik8Var.mo2878j(8, sharedByUserEntity.m7802b());
                break;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                SharedByUserAndQueryJoin sharedByUserAndQueryJoin = (SharedByUserAndQueryJoin) obj;
                ik8Var.getClass();
                sharedByUserAndQueryJoin.getClass();
                ik8Var.mo2874C(1, sharedByUserAndQueryJoin.m7798a());
                ik8Var.mo2874C(2, sharedByUserAndQueryJoin.m7799b());
                ik8Var.mo2878j(3, sharedByUserAndQueryJoin.m7800c());
                ik8Var.mo2874C(4, sharedByUserAndQueryJoin.m7798a());
                ik8Var.mo2874C(5, sharedByUserAndQueryJoin.m7799b());
                ik8Var.mo2878j(6, sharedByUserAndQueryJoin.m7800c());
                break;
            case 24:
                LessonAndCardsFromJoin lessonAndCardsFromJoin = (LessonAndCardsFromJoin) obj;
                ik8Var.getClass();
                lessonAndCardsFromJoin.getClass();
                ik8Var.mo2878j(1, lessonAndCardsFromJoin.m7631a());
                ik8Var.mo2874C(2, lessonAndCardsFromJoin.m7632b());
                ik8Var.mo2878j(3, lessonAndCardsFromJoin.m7631a());
                ik8Var.mo2874C(4, lessonAndCardsFromJoin.m7632b());
                break;
            case 25:
                LessonAndWordsFromJoin lessonAndWordsFromJoin = (LessonAndWordsFromJoin) obj;
                ik8Var.getClass();
                lessonAndWordsFromJoin.getClass();
                ik8Var.mo2878j(1, lessonAndWordsFromJoin.m7633a());
                ik8Var.mo2874C(2, lessonAndWordsFromJoin.m7634b());
                ik8Var.mo2878j(3, lessonAndWordsFromJoin.m7633a());
                ik8Var.mo2874C(4, lessonAndWordsFromJoin.m7634b());
                break;
            case 26:
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
                ik8Var.mo2878j(4, lessonsSimplifiedJoin.m7757a());
                break;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
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
                if (strM7735g == null) {
                    ik8Var.mo2880m(8);
                } else {
                    ik8Var.mo2874C(8, strM7735g);
                }
                ik8Var.mo2878j(9, lessonNextSuggestionEntity.m7729a());
                break;
            case 28:
                j65 j65Var = (j65) obj;
                ik8Var.getClass();
                j65Var.getClass();
                ik8Var.mo2878j(1, j65Var.m14304a());
                ik8Var.mo2878j(2, j65Var.m14305b());
                ik8Var.mo2874C(3, j65Var.m14306c());
                ik8Var.mo2878j(4, j65Var.m14304a());
                ik8Var.mo2878j(5, j65Var.m14305b());
                break;
            default:
                m55 m55Var = (m55) obj;
                ik8Var.getClass();
                m55Var.getClass();
                ik8Var.mo2878j(1, m55Var.m16634a());
                ik8Var.mo2874C(2, m55Var.m16635b());
                ik8Var.mo2878j(3, m55Var.m16634a());
                break;
        }
    }

    @Override // p000.ss5
    /* JADX INFO: renamed from: s */
    public final String mo16669s() {
        switch (this.f57956p) {
            case 0:
                return "DELETE FROM `CardEntity` WHERE `termWithLanguage` = ?";
            case 1:
                return "UPDATE `SearchChatHistoryJoin` SET `query` = ?,`chatId` = ? WHERE `query` = ? AND `chatId` = ?";
            case 2:
                return "UPDATE `ChatMessageTranslationEntity` SET `chatId` = ?,`messageIndex` = ?,`translation` = ? WHERE `chatId` = ? AND `messageIndex` = ?";
            case 3:
                return "UPDATE `LessonCoachChatEntity` SET `lessonId` = ?,`chatId` = ?,`messageIndex` = ?,`message` = ? WHERE `lessonId` = ?";
            case 4:
                return "UPDATE `ChatSuggestionEntity` SET `language` = ?,`chatId` = ?,`position` = ?,`source` = ?,`target` = ? WHERE `language` = ? AND `chatId` = ? AND `position` = ?";
            case 5:
                return "UPDATE `ChatStatsEntity` SET `id` = ?,`sentences` = ?,`knownWords` = ?,`totalWords` = ?,`uniqueWords` = ?,`cards` = ?,`coins` = ? WHERE `id` = ?";
            case 6:
                return "UPDATE `ChatLessonJoin` SET `chatId` = ?,`lessonId` = ? WHERE `chatId` = ?";
            case 7:
                return "UPDATE `CollectionSubscriptionEntity` SET `id` = ?,`language` = ? WHERE `id` = ? AND `language` = ?";
            case 8:
                return "UPDATE `CoursesAndLanguageJoin` SET `pk` = ?,`language` = ? WHERE `pk` = ? AND `language` = ?";
            case 9:
                return "UPDATE `CourseAndCardsJoin` SET `pk` = ?,`termWithLanguage` = ? WHERE `pk` = ? AND `termWithLanguage` = ?";
            case 10:
                return "UPDATE `CourseForImportEntity` SET `language` = ?,`pk` = ?,`title` = ?,`order` = ? WHERE `language` = ? AND `pk` = ?";
            case 11:
                return "DELETE FROM `LanguageActiveDictionaryJoin` WHERE `code` = ? AND `id` = ?";
            case 12:
                return "UPDATE `DictionaryDataEntity` SET `id` = ?,`name` = ?,`order` = ?,`urlToTransform` = ?,`urlDefinition` = ?,`isPopUpWindow` = ?,`languageTo` = ?,`urlVar1` = ?,`urlVar2` = ?,`urlVar3` = ?,`urlVar4` = ?,`urlVar5` = ?,`overrideUrl` = ? WHERE `id` = ?";
            case 13:
                return "UPDATE `LanguageActiveDictionaryJoin` SET `code` = ?,`id` = ? WHERE `code` = ? AND `id` = ?";
            case 14:
                return "UPDATE `LanguageAvailableDictionaryJoin` SET `code` = ?,`id` = ? WHERE `code` = ? AND `id` = ?";
            case 15:
                return "UPDATE `LanguageEntity` SET `code` = ?,`id` = ?,`supported` = ?,`title` = ?,`lastUsed` = ?,`knownWords` = ?,`dictionaryLocaleActive` = ?,`grammarResourceSlug` = ?,`scheduledForDeletion` = ? WHERE `code` = ?";
            case 16:
                return "UPDATE `LessonsAndCardsJoin` SET `contentId` = ?,`termWithLanguage` = ? WHERE `contentId` = ? AND `termWithLanguage` = ?";
            case 17:
                return "UPDATE `LessonsAndWordsJoin` SET `contentId` = ?,`termWithLanguage` = ? WHERE `contentId` = ? AND `termWithLanguage` = ?";
            case 18:
                return "UPDATE `LessonBookmarkEntity` SET `contentId` = ?,`wordIndex` = ?,`completedWordIndex` = ?,`audioPosition` = ?,`client` = ?,`timestamp` = ?,`languageTimestamp` = ? WHERE `contentId` = ?";
            case 19:
                return "UPDATE `LessonStatsEntity` SET `contentId` = ?,`readWords` = ?,`lingqsCreated` = ?,`knownWords` = ?,`listeningTime` = ?,`coinsNew` = ?,`earnedCoins` = ?,`studyTime` = ?,`wpm` = ? WHERE `contentId` = ?";
            case 20:
                return "UPDATE `LessonsWithPlaylistJoin` SET `playlistId` = ?,`contentId` = ?,`language` = ? WHERE `playlistId` = ? AND `contentId` = ?";
            case 21:
                return "UPDATE `LessonTagEntity` SET `title` = ? WHERE `title` = ?";
            case 22:
                return "UPDATE `SharedByUserEntity` SET `id` = ?,`language` = ?,`firstName` = ?,`lastName` = ?,`photo` = ?,`username` = ?,`role` = ? WHERE `id` = ?";
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return "UPDATE `SharedByUserAndQueryJoin` SET `language` = ?,`query` = ?,`userId` = ? WHERE `language` = ? AND `query` = ? AND `userId` = ?";
            case 24:
                return "UPDATE `LessonAndCardsFromJoin` SET `contentId` = ?,`termWithLanguage` = ? WHERE `contentId` = ? AND `termWithLanguage` = ?";
            case 25:
                return "UPDATE `LessonAndWordsFromJoin` SET `contentId` = ?,`termWithLanguage` = ? WHERE `contentId` = ? AND `termWithLanguage` = ?";
            case 26:
                return "UPDATE `LessonsSimplifiedJoin` SET `fromId` = ?,`toId` = ?,`isLocked` = ? WHERE `fromId` = ?";
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                return "UPDATE `LessonNextSuggestionEntity` SET `id` = ?,`lessonId` = ?,`title` = ?,`image` = ?,`sourceType` = ?,`sourceName` = ?,`sourceUrl` = ?,`status` = ? WHERE `id` = ?";
            case 28:
                return "UPDATE `LessonSentenceTranslationEntity` SET `lessonId` = ?,`sentenceIndex` = ?,`text` = ? WHERE `lessonId` = ? AND `sentenceIndex` = ?";
            default:
                return "UPDATE `LessonPreviewEntity` SET `lessonId` = ?,`preview` = ? WHERE `lessonId` = ?";
        }
    }
}
