package p000;

import com.lingq.core.domain.model.language.LanguageProgressMetric;
import com.lingq.core.p012ui.R$string;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ii9 {

    /* JADX INFO: renamed from: a */
    public static final cn4 f44149a = new cn4(LanguageProgressMetric.WordsOfReading, R$string.stats_reading_words, vz1.m23605K(new en4(com.lingq.feature.statistics.R$string.stats_detail_method, com.lingq.feature.statistics.R$string.stats_detail_reading_header_1, com.lingq.feature.statistics.R$string.stats_detail_reading_description_1, null, 8), new en4(com.lingq.feature.statistics.R$string.stats_detail_reading_2, com.lingq.feature.statistics.R$string.stats_detail_reading_header_2, com.lingq.feature.statistics.R$string.stats_detail_reading_description_2, null, 8), new en4(com.lingq.feature.statistics.R$string.stats_detail_reading_3, com.lingq.feature.statistics.R$string.stats_detail_reading_header_3, com.lingq.feature.statistics.R$string.stats_detail_reading_description_3, null, 8), new en4(com.lingq.feature.statistics.R$string.stats_detail_bottom_line, com.lingq.feature.statistics.R$string.stats_detail_reading_header_4, 0, null, 12)), 0, 56);

    /* JADX INFO: renamed from: b */
    public static final cn4 f44150b = new cn4(LanguageProgressMetric.ListeningHours, R$string.stats_listening_hours, vz1.m23605K(new en4(com.lingq.feature.statistics.R$string.stats_detail_method, com.lingq.feature.statistics.R$string.stats_detail_listening_header_1, com.lingq.feature.statistics.R$string.stats_detail_listening_description_1, null, 8), new en4(com.lingq.feature.statistics.R$string.stats_detail_listening_2, com.lingq.feature.statistics.R$string.stats_detail_listening_header_2, com.lingq.feature.statistics.R$string.stats_detail_listening_description_2, null, 8), new en4(com.lingq.feature.statistics.R$string.stats_detail_listening_3, com.lingq.feature.statistics.R$string.stats_detail_listening_header_3, com.lingq.feature.statistics.R$string.stats_detail_listening_description_3, null, 8), new en4(com.lingq.feature.statistics.R$string.stats_detail_bottom_line, com.lingq.feature.statistics.R$string.stats_detail_listening_header_4, 0, null, 12)), 0, 56);

    /* JADX INFO: renamed from: c */
    public static final cn4 f44151c;

    /* JADX INFO: renamed from: d */
    public static final cn4 f44152d;

    /* JADX INFO: renamed from: e */
    public static final cn4 f44153e;

    /* JADX INFO: renamed from: f */
    public static final cn4 f44154f;

    /* JADX INFO: renamed from: g */
    public static final cn4 f44155g;

    /* JADX INFO: renamed from: h */
    public static final cn4 f44156h;

    /* JADX INFO: renamed from: i */
    public static final cn4 f44157i;

    /* JADX INFO: renamed from: j */
    public static final cn4 f44158j;

    static {
        LanguageProgressMetric languageProgressMetric = LanguageProgressMetric.SpeakingHours;
        int i = R$string.stats_speaking_hours;
        int i2 = com.lingq.feature.statistics.R$string.stats_detail_method;
        int i3 = com.lingq.feature.statistics.R$string.stats_detail_speaking_header_1;
        int i4 = com.lingq.feature.statistics.R$string.stats_detail_speaking_description_1;
        dn4 dn4Var = dn4.f35895e;
        f44151c = new cn4(languageProgressMetric, i, vz1.m23605K(new en4(i2, i3, i4, vz1.m23604J(dn4Var)), new en4(com.lingq.feature.statistics.R$string.stats_detail_speaking_2, 0, com.lingq.feature.statistics.R$string.stats_detail_speaking_description_2, null, 10), new en4(com.lingq.feature.statistics.R$string.stats_detail_speaking_3, 0, com.lingq.feature.statistics.R$string.stats_detail_speaking_description_3, null, 10), new en4(com.lingq.feature.statistics.R$string.stats_detail_bottom_line, com.lingq.feature.statistics.R$string.stats_detail_speaking_header_4, 0, null, 12)), com.lingq.feature.statistics.R$string.stats_detail_speaking_recommended, com.lingq.feature.statistics.R$string.stats_detail_speaking_recommended_action, dn4Var);
        LanguageProgressMetric languageProgressMetric2 = LanguageProgressMetric.WrittenWords;
        int i5 = R$string.stats_writing_words;
        int i6 = com.lingq.feature.statistics.R$string.stats_detail_method;
        int i7 = com.lingq.feature.statistics.R$string.stats_detail_writing_header_1;
        int i8 = com.lingq.feature.statistics.R$string.stats_detail_writing_description_1;
        dn4 dn4Var2 = dn4.f35896f;
        f44152d = new cn4(languageProgressMetric2, i5, vz1.m23605K(new en4(i6, i7, i8, vz1.m23604J(dn4Var2)), new en4(com.lingq.feature.statistics.R$string.stats_detail_writing_2, 0, com.lingq.feature.statistics.R$string.stats_detail_writing_description_2, null, 10), new en4(com.lingq.feature.statistics.R$string.stats_detail_writing_3, com.lingq.feature.statistics.R$string.stats_detail_writing_header_3, com.lingq.feature.statistics.R$string.stats_detail_writing_description_3, vz1.m23604J(dn4Var2)), new en4(com.lingq.feature.statistics.R$string.stats_detail_bottom_line, com.lingq.feature.statistics.R$string.stats_detail_writing_header_4, 0, null, 12)), com.lingq.feature.statistics.R$string.stats_detail_writing_recommended, com.lingq.feature.statistics.R$string.stats_detail_writing_recommended_action, dn4Var2);
        f44153e = new cn4(LanguageProgressMetric.KnownWords, R$string.stats_known_words, vz1.m23605K(new en4(com.lingq.feature.statistics.R$string.stats_detail_method, com.lingq.feature.statistics.R$string.stats_detail_known_words_header_1, com.lingq.feature.statistics.R$string.stats_detail_known_words_description_1, null, 8), new en4(com.lingq.feature.statistics.R$string.stats_detail_known_words_2, 0, com.lingq.feature.statistics.R$string.stats_detail_known_words_description_2, null, 10), new en4(com.lingq.feature.statistics.R$string.stats_detail_bottom_line, com.lingq.feature.statistics.R$string.stats_detail_known_words_header_3, 0, null, 12)), 0, 56);
        f44154f = new cn4(LanguageProgressMetric.LingQsCreated, R$string.complete_lingqs_created, vz1.m23605K(new en4(com.lingq.feature.statistics.R$string.stats_detail_method, com.lingq.feature.statistics.R$string.stats_detail_lingqs_created_header_1, com.lingq.feature.statistics.R$string.stats_detail_lingqs_created_description_1, null, 8), new en4(com.lingq.feature.statistics.R$string.stats_detail_lingqs_created_2, 0, com.lingq.feature.statistics.R$string.stats_detail_lingqs_created_description_2, null, 10), new en4(com.lingq.feature.statistics.R$string.stats_detail_lingqs_created_3, 0, com.lingq.feature.statistics.R$string.stats_detail_lingqs_created_description_3, null, 10), new en4(com.lingq.feature.statistics.R$string.stats_detail_bottom_line, com.lingq.feature.statistics.R$string.stats_detail_lingqs_created_header_4, 0, null, 12)), 0, 56);
        f44155g = new cn4(LanguageProgressMetric.LearnedLingQs, R$string.stats_learned_lingqs, vz1.m23605K(new en4(com.lingq.feature.statistics.R$string.stats_detail_method, com.lingq.feature.statistics.R$string.stats_detail_lingqs_learned_header_1, com.lingq.feature.statistics.R$string.stats_detail_lingqs_learned_description_1, null, 8), new en4(com.lingq.feature.statistics.R$string.stats_detail_lingqs_learned_2, 0, com.lingq.feature.statistics.R$string.stats_detail_lingqs_learned_description_2, null, 10), new en4(com.lingq.feature.statistics.R$string.stats_detail_bottom_line, com.lingq.feature.statistics.R$string.stats_detail_lingqs_learned_header_3, 0, null, 12)), 0, 56);
        f44156h = new cn4(LanguageProgressMetric.CoinsEarned, R$string.stats_coins_earned, vz1.m23605K(new en4(com.lingq.feature.statistics.R$string.stats_detail_method, com.lingq.feature.statistics.R$string.stats_detail_coins_earned_header_1, com.lingq.feature.statistics.R$string.stats_detail_coins_earned_description_1, null, 8), new en4(com.lingq.feature.statistics.R$string.stats_detail_coins_earned_2, 0, com.lingq.feature.statistics.R$string.stats_detail_coins_earned_description_2, null, 10), new en4(com.lingq.feature.statistics.R$string.stats_detail_coins_earned_3, 0, com.lingq.feature.statistics.R$string.stats_detail_coins_earned_description_3, null, 10), new en4(com.lingq.feature.statistics.R$string.stats_detail_coins_earned_4, 0, com.lingq.feature.statistics.R$string.stats_detail_coins_earned_description_4, vz1.m23604J(dn4.f35891a), 2), new en4(com.lingq.feature.statistics.R$string.stats_detail_bottom_line, com.lingq.feature.statistics.R$string.stats_detail_coins_earned_header_5, 0, null, 12)), com.lingq.feature.statistics.R$string.stats_detail_coins_earned_recommended_action, 8);
        f44157i = new cn4(LanguageProgressMetric.StudyTime, R$string.stats_study_time, vz1.m23605K(new en4(com.lingq.feature.statistics.R$string.stats_detail_method, com.lingq.feature.statistics.R$string.stats_detail_study_time_header_1, com.lingq.feature.statistics.R$string.stats_detail_study_time_description_1, null, 8), new en4(com.lingq.feature.statistics.R$string.stats_detail_study_time_2, 0, com.lingq.feature.statistics.R$string.stats_detail_study_time_description_2, null, 10), new en4(com.lingq.feature.statistics.R$string.stats_detail_study_time_3, com.lingq.feature.statistics.R$string.stats_detail_study_time_header_3, com.lingq.feature.statistics.R$string.stats_detail_study_time_description_3, null, 8), new en4(com.lingq.feature.statistics.R$string.stats_detail_bottom_line, com.lingq.feature.statistics.R$string.stats_detail_study_time_header_4, 0, null, 12)), 0, 56);
        f44158j = new cn4(LanguageProgressMetric.ReadingSpeed, R$string.stats_reading_speed, vz1.m23605K(new en4(com.lingq.feature.statistics.R$string.stats_detail_method, com.lingq.feature.statistics.R$string.stats_detail_reading_speed_header_1, com.lingq.feature.statistics.R$string.stats_detail_reading_speed_description_1, null, 8), new en4(com.lingq.feature.statistics.R$string.stats_detail_reading_speed_2, 0, com.lingq.feature.statistics.R$string.stats_detail_reading_speed_description_2, null, 10), new en4(com.lingq.feature.statistics.R$string.stats_detail_reading_speed_3, 0, com.lingq.feature.statistics.R$string.stats_detail_reading_speed_description_3, null, 10), new en4(com.lingq.feature.statistics.R$string.stats_detail_bottom_line, com.lingq.feature.statistics.R$string.stats_detail_reading_speed_header_4, 0, null, 12)), 0, 56);
    }
}
