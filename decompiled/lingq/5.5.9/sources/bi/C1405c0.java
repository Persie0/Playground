package bi;

import com.lingq.entity.LessonTransliteration;
import com.lingq.entity.Meaning;
import com.lingq.entity.RelatedPhrase;
import com.lingq.entity.StudyStatsScores;
import com.lingq.entity.Tab;
import com.lingq.entity.TextToken;
import com.lingq.entity.Translation;
import com.lingq.entity.TranslationSentence;
import com.lingq.entity.TranslationSimple;
import com.lingq.entity.TtsAppVoice;
import com.lingq.shared.network.adapters.CardsAdapter;
import com.lingq.shared.network.adapters.ParagraphAdapter;
import com.lingq.shared.network.adapters.StudyParagraphAdapter;
import com.lingq.shared.network.adapters.WordsAdapter;
import com.lingq.shared.uimodel.TextToSpeechAppVoice;
import com.lingq.shared.uimodel.challenge.ChallengeSocialSettings;
import com.lingq.shared.uimodel.language.UserStudyStatsScore;
import com.lingq.shared.uimodel.lesson.LessonStudyTextToken;
import com.lingq.shared.uimodel.lesson.TranslationStudy;
import com.lingq.shared.uimodel.library.LibraryTab;
import com.lingq.shared.uimodel.token.TokenMeaning;
import com.lingq.shared.uimodel.token.TokenTranslationSimple;
import com.squareup.moshi.AbstractC4949k;
import com.squareup.moshi.C4955q;
import dm.C5207g;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.text.C7076b;
import p437vh.C9725c;
import tk.C9312p;
import uk.C9553b;

/* JADX INFO: renamed from: bi.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1405c0 {

    /* JADX INFO: renamed from: a */
    public final C4955q f8356a;

    public C1405c0() {
        C4955q.a aVar = new C4955q.a();
        aVar.m10567a(C9725c.f49743b);
        aVar.m10568b(new ParagraphAdapter());
        aVar.m10568b(new StudyParagraphAdapter());
        aVar.m10568b(new CardsAdapter());
        aVar.m10568b(new WordsAdapter());
        aVar.m10569c(new C9553b());
        this.f8356a = new C4955q(aVar);
    }

    /* JADX INFO: renamed from: a */
    public static Long m4990a(Date date) {
        if (date != null) {
            return Long.valueOf(date.getTime());
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static String m4991d(List list) {
        StringBuilder sb2 = new StringBuilder();
        if (list == null) {
            return null;
        }
        sb2.append(",");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            sb2.append(",");
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: l */
    public static List m4992l(String str) {
        if (str != null) {
            return C7076b.m14299s3(C7076b.m14294n3(",", C7076b.m14292l3(",", str)), new String[]{","}, 0, 6);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final String m4993b(List<Float> list) {
        C5207g.m11111f(list, "data");
        return this.f8356a.m10564b(C9312p.m17659d(List.class, Float.class)).m10535e(list);
    }

    /* JADX INFO: renamed from: c */
    public final String m4994c(List<LessonTransliteration> list) {
        C5207g.m11111f(list, "data");
        return this.f8356a.m10564b(C9312p.m17659d(List.class, LessonTransliteration.class)).m10535e(list);
    }

    /* JADX INFO: renamed from: e */
    public final String m4995e(List<Meaning> list) {
        C5207g.m11111f(list, "data");
        return this.f8356a.m10564b(C9312p.m17659d(List.class, Meaning.class)).m10535e(list);
    }

    /* JADX INFO: renamed from: f */
    public final String m4996f(List<RelatedPhrase> list) {
        C5207g.m11111f(list, "data");
        return this.f8356a.m10564b(C9312p.m17659d(List.class, RelatedPhrase.class)).m10535e(list);
    }

    /* JADX INFO: renamed from: g */
    public final String m4997g(List<TranslationSentence> list) {
        C5207g.m11111f(list, "data");
        return this.f8356a.m10564b(C9312p.m17659d(List.class, TranslationSentence.class)).m10535e(list);
    }

    /* JADX INFO: renamed from: h */
    public final ChallengeSocialSettings m4998h(String str) throws IOException {
        C5207g.m11111f(str, "data");
        AbstractC4949k abstractC4949kM10563a = this.f8356a.m10563a(ChallengeSocialSettings.class);
        C5207g.m11110e(abstractC4949kM10563a, "moshi.adapter(ChallengeSocialSettings::class.java)");
        Object objM10532b = abstractC4949kM10563a.m10532b(str);
        C5207g.m11108c(objM10532b);
        return (ChallengeSocialSettings) objM10532b;
    }

    /* JADX INFO: renamed from: i */
    public final List<Float> m4999i(String str) throws IOException {
        C5207g.m11111f(str, "data");
        Object objM10532b = this.f8356a.m10564b(C9312p.m17659d(List.class, Float.class)).m10532b(str);
        C5207g.m11108c(objM10532b);
        return (List) objM10532b;
    }

    /* JADX INFO: renamed from: j */
    public final List<LessonTransliteration> m5000j(String str) throws IOException {
        C5207g.m11111f(str, "data");
        Object objM10532b = this.f8356a.m10564b(C9312p.m17659d(List.class, LessonTransliteration.class)).m10532b(str);
        C5207g.m11108c(objM10532b);
        return (List) objM10532b;
    }

    /* JADX INFO: renamed from: k */
    public final List<LibraryTab> m5001k(String str) throws IOException {
        C5207g.m11111f(str, "data");
        Object objM10532b = this.f8356a.m10564b(C9312p.m17659d(List.class, LibraryTab.class)).m10532b(str);
        C5207g.m11108c(objM10532b);
        return (List) objM10532b;
    }

    /* JADX INFO: renamed from: m */
    public final List<Meaning> m5002m(String str) throws IOException {
        C5207g.m11111f(str, "data");
        Object objM10532b = this.f8356a.m10564b(C9312p.m17659d(List.class, Meaning.class)).m10532b(str);
        C5207g.m11108c(objM10532b);
        return (List) objM10532b;
    }

    /* JADX INFO: renamed from: n */
    public final List<LessonStudyTextToken> m5003n(String str) throws IOException {
        C5207g.m11111f(str, "data");
        Object objM10532b = this.f8356a.m10564b(C9312p.m17659d(List.class, LessonStudyTextToken.class)).m10532b(str);
        C5207g.m11108c(objM10532b);
        return (List) objM10532b;
    }

    /* JADX INFO: renamed from: o */
    public final List<TranslationStudy> m5004o(String str) throws IOException {
        C5207g.m11111f(str, "data");
        Object objM10532b = this.f8356a.m10564b(C9312p.m17659d(List.class, TranslationStudy.class)).m10532b(str);
        C5207g.m11108c(objM10532b);
        return (List) objM10532b;
    }

    /* JADX INFO: renamed from: p */
    public final List<TokenTranslationSimple> m5005p(String str) throws IOException {
        C5207g.m11111f(str, "data");
        Object objM10532b = this.f8356a.m10564b(C9312p.m17659d(List.class, TokenTranslationSimple.class)).m10532b(str);
        C5207g.m11108c(objM10532b);
        return (List) objM10532b;
    }

    /* JADX INFO: renamed from: q */
    public final List<TextToSpeechAppVoice> m5006q(String str) throws IOException {
        C5207g.m11111f(str, "data");
        Object objM10532b = this.f8356a.m10564b(C9312p.m17659d(List.class, TextToSpeechAppVoice.class)).m10532b(str);
        C5207g.m11108c(objM10532b);
        return (List) objM10532b;
    }

    /* JADX INFO: renamed from: r */
    public final List<TokenMeaning> m5007r(String str) throws IOException {
        C5207g.m11111f(str, "data");
        Object objM10532b = this.f8356a.m10564b(C9312p.m17659d(List.class, TokenMeaning.class)).m10532b(str);
        C5207g.m11108c(objM10532b);
        return (List) objM10532b;
    }

    /* JADX INFO: renamed from: s */
    public final List<UserStudyStatsScore> m5008s(String str) throws IOException {
        C5207g.m11111f(str, "data");
        Object objM10532b = this.f8356a.m10564b(C9312p.m17659d(List.class, UserStudyStatsScore.class)).m10532b(str);
        C5207g.m11108c(objM10532b);
        return (List) objM10532b;
    }

    /* JADX INFO: renamed from: t */
    public final String m5009t(List<StudyStatsScores> list) {
        C5207g.m11111f(list, "data");
        return this.f8356a.m10564b(C9312p.m17659d(List.class, StudyStatsScores.class)).m10535e(list);
    }

    /* JADX INFO: renamed from: u */
    public final String m5010u(List<Tab> list) {
        C5207g.m11111f(list, "data");
        return this.f8356a.m10564b(C9312p.m17659d(List.class, Tab.class)).m10535e(list);
    }

    /* JADX INFO: renamed from: v */
    public final String m5011v(List<TextToken> list) {
        C5207g.m11111f(list, "data");
        return this.f8356a.m10564b(C9312p.m17659d(List.class, TextToken.class)).m10535e(list);
    }

    /* JADX INFO: renamed from: w */
    public final String m5012w(List<TranslationSimple> list) {
        C5207g.m11111f(list, "data");
        return this.f8356a.m10564b(C9312p.m17659d(List.class, TranslationSimple.class)).m10535e(list);
    }

    /* JADX INFO: renamed from: x */
    public final String m5013x(List<Translation> list) {
        C5207g.m11111f(list, "data");
        return this.f8356a.m10564b(C9312p.m17659d(List.class, Translation.class)).m10535e(list);
    }

    /* JADX INFO: renamed from: y */
    public final String m5014y(List<TtsAppVoice> list) {
        C5207g.m11111f(list, "data");
        return this.f8356a.m10564b(C9312p.m17659d(List.class, TtsAppVoice.class)).m10535e(list);
    }
}
