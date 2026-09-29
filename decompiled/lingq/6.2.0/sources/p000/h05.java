package p000;

import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.lesson.LessonSentence;
import com.lingq.core.domain.model.lesson.LessonTranslationSentence;
import com.lingq.core.domain.model.lesson.LessonWord;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h05 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41610a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f41611b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ q05 f41612c;

    public /* synthetic */ h05(int i, q05 q05Var, int i2) {
        this.f41610a = i2;
        this.f41611b = i;
        this.f41612c = q05Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        int i = this.f41610a;
        q05 q05Var = this.f41612c;
        int i2 = this.f41611b;
        switch (i) {
            case 0:
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT CardEntity.* FROM LessonAndCardsFromJoin, CardEntity WHERE contentId = ? AND CardEntity.termWithLanguage = LessonAndCardsFromJoin.termWithLanguage ORDER BY `term`");
                try {
                    ik8VarMo2873e0.mo2878j(1, i2);
                    int iM14108v = AbstractC3122is.m14108v(ik8VarMo2873e0, "term");
                    int iM14108v2 = AbstractC3122is.m14108v(ik8VarMo2873e0, "termWithLanguage");
                    int iM14108v3 = AbstractC3122is.m14108v(ik8VarMo2873e0, "id");
                    int iM14108v4 = AbstractC3122is.m14108v(ik8VarMo2873e0, "url");
                    int iM14108v5 = AbstractC3122is.m14108v(ik8VarMo2873e0, "fragment");
                    int iM14108v6 = AbstractC3122is.m14108v(ik8VarMo2873e0, "status");
                    int iM14108v7 = AbstractC3122is.m14108v(ik8VarMo2873e0, "extendedStatus");
                    int iM14108v8 = AbstractC3122is.m14108v(ik8VarMo2873e0, "lastReviewedCorrect");
                    int iM14108v9 = AbstractC3122is.m14108v(ik8VarMo2873e0, "srsDueDate");
                    int iM14108v10 = AbstractC3122is.m14108v(ik8VarMo2873e0, "notes");
                    int iM14108v11 = AbstractC3122is.m14108v(ik8VarMo2873e0, "audio");
                    int iM14108v12 = AbstractC3122is.m14108v(ik8VarMo2873e0, "importance");
                    int iM14108v13 = AbstractC3122is.m14108v(ik8VarMo2873e0, "meanings");
                    q05 q05Var2 = q05Var;
                    int iM14108v14 = AbstractC3122is.m14108v(ik8VarMo2873e0, "meaningTerms");
                    int iM14108v15 = AbstractC3122is.m14108v(ik8VarMo2873e0, "tags");
                    int iM14108v16 = AbstractC3122is.m14108v(ik8VarMo2873e0, "gTags");
                    int iM14108v17 = AbstractC3122is.m14108v(ik8VarMo2873e0, "words");
                    int iM14108v18 = AbstractC3122is.m14108v(ik8VarMo2873e0, "hiragana");
                    int iM14108v19 = AbstractC3122is.m14108v(ik8VarMo2873e0, "romaji");
                    int iM14108v20 = AbstractC3122is.m14108v(ik8VarMo2873e0, "pinyin");
                    int iM14108v21 = AbstractC3122is.m14108v(ik8VarMo2873e0, "hant");
                    int iM14108v22 = AbstractC3122is.m14108v(ik8VarMo2873e0, "hans");
                    int iM14108v23 = AbstractC3122is.m14108v(ik8VarMo2873e0, "jyutping");
                    int iM14108v24 = AbstractC3122is.m14108v(ik8VarMo2873e0, "chunk");
                    int iM14108v25 = AbstractC3122is.m14108v(ik8VarMo2873e0, "furigana");
                    int iM14108v26 = AbstractC3122is.m14108v(ik8VarMo2873e0, "latin");
                    int iM14108v27 = AbstractC3122is.m14108v(ik8VarMo2873e0, "isPhrase");
                    int iM14108v28 = AbstractC3122is.m14108v(ik8VarMo2873e0, "creationDate");
                    ArrayList arrayList = new ArrayList();
                    while (ik8VarMo2873e0.mo2876a0()) {
                        String strMo2875L = ik8VarMo2873e0.mo2875L(iM14108v);
                        String strMo2875L2 = ik8VarMo2873e0.mo2875L(iM14108v2);
                        int i3 = iM14108v;
                        int i4 = iM14108v2;
                        int i5 = (int) ik8VarMo2873e0.getLong(iM14108v3);
                        String strMo2875L3 = ik8VarMo2873e0.isNull(iM14108v4) ? null : ik8VarMo2873e0.mo2875L(iM14108v4);
                        String strMo2875L4 = ik8VarMo2873e0.isNull(iM14108v5) ? null : ik8VarMo2873e0.mo2875L(iM14108v5);
                        int i6 = (int) ik8VarMo2873e0.getLong(iM14108v6);
                        Integer numValueOf = ik8VarMo2873e0.isNull(iM14108v7) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(iM14108v7));
                        String strMo2875L5 = ik8VarMo2873e0.isNull(iM14108v8) ? null : ik8VarMo2873e0.mo2875L(iM14108v8);
                        String strMo2875L6 = ik8VarMo2873e0.isNull(iM14108v9) ? null : ik8VarMo2873e0.mo2875L(iM14108v9);
                        String strMo2875L7 = ik8VarMo2873e0.isNull(iM14108v10) ? null : ik8VarMo2873e0.mo2875L(iM14108v10);
                        String strMo2875L8 = ik8VarMo2873e0.isNull(iM14108v11) ? null : ik8VarMo2873e0.mo2875L(iM14108v11);
                        int i7 = (int) ik8VarMo2873e0.getLong(iM14108v12);
                        String strMo2875L9 = ik8VarMo2873e0.mo2875L(iM14108v13);
                        int i8 = iM14108v7;
                        q05 q05Var3 = q05Var2;
                        int i9 = iM14108v13;
                        qn3 qn3Var = q05Var3.f57073M;
                        List listM20059N = qn3Var.m20059N(strMo2875L9);
                        int i10 = iM14108v14;
                        String strMo2875L10 = ik8VarMo2873e0.isNull(i10) ? null : ik8VarMo2873e0.mo2875L(i10);
                        iM14108v15 = iM14108v15;
                        List listM20058M = qn3Var.m20058M(ik8VarMo2873e0.isNull(iM14108v15) ? null : ik8VarMo2873e0.mo2875L(iM14108v15));
                        if (listM20058M == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        int i11 = iM14108v16;
                        List listM20058M2 = qn3Var.m20058M(ik8VarMo2873e0.isNull(i11) ? null : ik8VarMo2873e0.mo2875L(i11));
                        if (listM20058M2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        iM14108v17 = iM14108v17;
                        List listM20058M3 = qn3Var.m20058M(ik8VarMo2873e0.isNull(iM14108v17) ? null : ik8VarMo2873e0.mo2875L(iM14108v17));
                        int i12 = iM14108v18;
                        String strMo2875L11 = ik8VarMo2873e0.isNull(i12) ? null : ik8VarMo2873e0.mo2875L(i12);
                        int i13 = iM14108v19;
                        String strMo2875L12 = ik8VarMo2873e0.isNull(i13) ? null : ik8VarMo2873e0.mo2875L(i13);
                        iM14108v18 = i12;
                        int i14 = iM14108v20;
                        String strMo2875L13 = ik8VarMo2873e0.isNull(i14) ? null : ik8VarMo2873e0.mo2875L(i14);
                        iM14108v20 = i14;
                        int i15 = iM14108v21;
                        String strMo2875L14 = ik8VarMo2873e0.isNull(i15) ? null : ik8VarMo2873e0.mo2875L(i15);
                        iM14108v21 = i15;
                        int i16 = iM14108v22;
                        String strMo2875L15 = ik8VarMo2873e0.isNull(i16) ? null : ik8VarMo2873e0.mo2875L(i16);
                        iM14108v22 = i16;
                        int i17 = iM14108v23;
                        String strMo2875L16 = ik8VarMo2873e0.isNull(i17) ? null : ik8VarMo2873e0.mo2875L(i17);
                        iM14108v23 = i17;
                        int i18 = iM14108v24;
                        String strMo2875L17 = ik8VarMo2873e0.isNull(i18) ? null : ik8VarMo2873e0.mo2875L(i18);
                        iM14108v24 = i18;
                        iM14108v25 = iM14108v25;
                        int i19 = iM14108v28;
                        arrayList.add(new LessonCard(i7, i5, i6, numValueOf, strMo2875L, strMo2875L2, strMo2875L4, strMo2875L3, strMo2875L5, strMo2875L6, strMo2875L7, strMo2875L8, strMo2875L10, strMo2875L11, strMo2875L12, strMo2875L13, strMo2875L14, strMo2875L15, strMo2875L16, strMo2875L17, ik8VarMo2873e0.isNull(iM14108v25) ? null : ik8VarMo2873e0.mo2875L(iM14108v25), ik8VarMo2873e0.isNull(iM14108v26) ? null : ik8VarMo2873e0.mo2875L(iM14108v26), ik8VarMo2873e0.isNull(i19) ? null : ik8VarMo2873e0.mo2875L(i19), listM20058M, listM20058M2, listM20059N, listM20058M3, ((int) ik8VarMo2873e0.getLong(iM14108v27)) != 0));
                        iM14108v27 = iM14108v27;
                        iM14108v19 = i13;
                        iM14108v28 = i19;
                        iM14108v6 = iM14108v6;
                        iM14108v13 = i9;
                        iM14108v12 = iM14108v12;
                        iM14108v = i3;
                        iM14108v7 = i8;
                        iM14108v16 = i11;
                        q05Var2 = q05Var3;
                        iM14108v14 = i10;
                        iM14108v3 = iM14108v3;
                        iM14108v2 = i4;
                    }
                    ik8VarMo2873e0.close();
                    return arrayList;
                } catch (Throwable th) {
                    ik8VarMo2873e0.close();
                    throw th;
                }
            case 1:
                return q05.m19590U0(i2, q05Var, (bk8) obj);
            case 2:
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                ik8 ik8VarMo2873e1 = bk8Var2.mo2873e0("SELECT `tokens`, `text`, `normalizedText`, `index`, `timestamp`, `startParagraph`, `url`, `opentag` FROM (SELECT * FROM LessonSentenceEntity WHERE lessonId = ?)");
                try {
                    ik8VarMo2873e1.mo2878j(1, i2);
                    ArrayList arrayList2 = new ArrayList();
                    while (ik8VarMo2873e1.mo2876a0()) {
                        List listM20063R = q05Var.f57073M.m20063R(ik8VarMo2873e1.mo2875L(0));
                        String strMo2875L18 = ik8VarMo2873e1.isNull(1) ? null : ik8VarMo2873e1.mo2875L(1);
                        String strMo2875L19 = ik8VarMo2873e1.isNull(2) ? null : ik8VarMo2873e1.mo2875L(2);
                        int i20 = (int) ik8VarMo2873e1.getLong(3);
                        String strMo2875L20 = ik8VarMo2873e1.isNull(4) ? null : ik8VarMo2873e1.mo2875L(4);
                        arrayList2.add(new LessonSentence(listM20063R, strMo2875L18, strMo2875L19, i20, strMo2875L20 == null ? null : q05Var.f57073M.m20055J(strMo2875L20), ((int) ik8VarMo2873e1.getLong(5)) != 0, ik8VarMo2873e1.isNull(6) ? null : ik8VarMo2873e1.mo2875L(6), ik8VarMo2873e1.isNull(7) ? null : ik8VarMo2873e1.mo2875L(7)));
                        break;
                    }
                    return arrayList2;
                } finally {
                    ik8VarMo2873e1.close();
                }
            case 3:
                return q05.m19588S0(i2, q05Var, (bk8) obj);
            case 4:
                bk8 bk8Var3 = (bk8) obj;
                bk8Var3.getClass();
                ik8 ik8VarMo2873e2 = bk8Var3.mo2873e0("SELECT `termWithLanguage`, `term`, `id`, `status`, `importance`, `isPhrase`, `meanings`, `tags`, `gTags`, `romaji`, `hiragana`, `pinyin`, `hant`, `hans`, `jyutping` FROM (SELECT WordEntity.* FROM LessonAndWordsFromJoin, WordEntity WHERE contentId = ? AND WordEntity.termWithLanguage = LessonAndWordsFromJoin.termWithLanguage ORDER BY `term`)");
                try {
                    ik8VarMo2873e2.mo2878j(1, i2);
                    int iM14108v29 = AbstractC3122is.m14108v(ik8VarMo2873e2, "termWithLanguage");
                    int iM14108v30 = AbstractC3122is.m14108v(ik8VarMo2873e2, "term");
                    int iM14108v31 = AbstractC3122is.m14108v(ik8VarMo2873e2, "id");
                    int iM14108v32 = AbstractC3122is.m14108v(ik8VarMo2873e2, "status");
                    int iM14108v33 = AbstractC3122is.m14108v(ik8VarMo2873e2, "importance");
                    int iM14108v34 = AbstractC3122is.m14108v(ik8VarMo2873e2, "isPhrase");
                    int iM14108v35 = AbstractC3122is.m14108v(ik8VarMo2873e2, "meanings");
                    int iM14108v36 = AbstractC3122is.m14108v(ik8VarMo2873e2, "tags");
                    int iM14108v37 = AbstractC3122is.m14108v(ik8VarMo2873e2, "gTags");
                    int iM14108v38 = AbstractC3122is.m14108v(ik8VarMo2873e2, "romaji");
                    int iM14108v39 = AbstractC3122is.m14108v(ik8VarMo2873e2, "hiragana");
                    int iM14108v40 = AbstractC3122is.m14108v(ik8VarMo2873e2, "pinyin");
                    int iM14108v41 = AbstractC3122is.m14108v(ik8VarMo2873e2, "hant");
                    int iM14108v42 = AbstractC3122is.m14108v(ik8VarMo2873e2, "hans");
                    int iM14108v43 = AbstractC3122is.m14108v(ik8VarMo2873e2, "jyutping");
                    ArrayList arrayList3 = new ArrayList();
                    while (ik8VarMo2873e2.mo2876a0()) {
                        String strMo2875L21 = ik8VarMo2873e2.mo2875L(iM14108v29);
                        String strMo2875L22 = ik8VarMo2873e2.mo2875L(iM14108v30);
                        int i21 = iM14108v40;
                        int i22 = iM14108v41;
                        int i23 = (int) ik8VarMo2873e2.getLong(iM14108v31);
                        String strMo2875L23 = ik8VarMo2873e2.mo2875L(iM14108v32);
                        int i24 = iM14108v32;
                        int i25 = iM14108v31;
                        int i26 = (int) ik8VarMo2873e2.getLong(iM14108v33);
                        int i27 = iM14108v33;
                        boolean z = ((int) ik8VarMo2873e2.getLong(iM14108v34)) != 0;
                        String strMo2875L24 = ik8VarMo2873e2.mo2875L(iM14108v35);
                        qn3 qn3Var2 = q05Var.f57073M;
                        List listM20059N2 = qn3Var2.m20059N(strMo2875L24);
                        List listM20058M4 = qn3Var2.m20058M(ik8VarMo2873e2.isNull(iM14108v36) ? null : ik8VarMo2873e2.mo2875L(iM14108v36));
                        if (listM20058M4 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        List listM20058M5 = qn3Var2.m20058M(ik8VarMo2873e2.isNull(iM14108v37) ? null : ik8VarMo2873e2.mo2875L(iM14108v37));
                        if (listM20058M5 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        List listM20058M6 = qn3Var2.m20058M(ik8VarMo2873e2.isNull(iM14108v38) ? null : ik8VarMo2873e2.mo2875L(iM14108v38));
                        List listM20058M7 = qn3Var2.m20058M(ik8VarMo2873e2.isNull(iM14108v39) ? null : ik8VarMo2873e2.mo2875L(iM14108v39));
                        List listM20058M8 = qn3Var2.m20058M(ik8VarMo2873e2.isNull(i21) ? null : ik8VarMo2873e2.mo2875L(i21));
                        List listM20058M9 = qn3Var2.m20058M(ik8VarMo2873e2.isNull(i22) ? null : ik8VarMo2873e2.mo2875L(i22));
                        iM14108v42 = iM14108v42;
                        List listM20058M10 = qn3Var2.m20058M(ik8VarMo2873e2.isNull(iM14108v42) ? null : ik8VarMo2873e2.mo2875L(iM14108v42));
                        iM14108v43 = iM14108v43;
                        arrayList3.add(new LessonWord(strMo2875L22, z, listM20058M4, listM20058M5, strMo2875L21, listM20059N2, i26, i23, strMo2875L23, listM20058M6, listM20058M7, listM20058M8, listM20058M9, listM20058M10, qn3Var2.m20058M(ik8VarMo2873e2.isNull(iM14108v43) ? null : ik8VarMo2873e2.mo2875L(iM14108v43))));
                        iM14108v40 = i21;
                        iM14108v33 = i27;
                        iM14108v31 = i25;
                        iM14108v41 = i22;
                        iM14108v32 = i24;
                        iM14108v29 = iM14108v29;
                    }
                    ik8VarMo2873e2.close();
                    return arrayList3;
                } catch (Throwable th2) {
                    ik8VarMo2873e2.close();
                    throw th2;
                }
            case 5:
                qn3 qn3Var3 = q05Var.f57073M;
                bk8 bk8Var4 = (bk8) obj;
                bk8Var4.getClass();
                ik8 ik8VarMo2873e3 = bk8Var4.mo2873e0("SELECT `tokens`, `text`, `normalizedText`, `index`, `timestamp`, `startParagraph`, `url`, `opentag` FROM (SELECT * FROM LessonSentenceEntity WHERE lessonId = ?)");
                try {
                    ik8VarMo2873e3.mo2878j(1, i2);
                    ArrayList arrayList4 = new ArrayList();
                    while (ik8VarMo2873e3.mo2876a0()) {
                        List listM20063R2 = qn3Var3.m20063R(ik8VarMo2873e3.mo2875L(0));
                        String strMo2875L25 = ik8VarMo2873e3.isNull(1) ? null : ik8VarMo2873e3.mo2875L(1);
                        String strMo2875L26 = ik8VarMo2873e3.isNull(2) ? null : ik8VarMo2873e3.mo2875L(2);
                        int i28 = (int) ik8VarMo2873e3.getLong(3);
                        String strMo2875L27 = ik8VarMo2873e3.isNull(4) ? null : ik8VarMo2873e3.mo2875L(4);
                        arrayList4.add(new LessonSentence(listM20063R2, strMo2875L25, strMo2875L26, i28, strMo2875L27 == null ? null : qn3Var3.m20055J(strMo2875L27), ((int) ik8VarMo2873e3.getLong(5)) != 0, ik8VarMo2873e3.isNull(6) ? null : ik8VarMo2873e3.mo2875L(6), ik8VarMo2873e3.isNull(7) ? null : ik8VarMo2873e3.mo2875L(7)));
                        break;
                    }
                    return arrayList4;
                } finally {
                    ik8VarMo2873e3.close();
                }
            case 6:
                return q05.m19587R0(i2, q05Var, (bk8) obj);
            case 7:
                return q05.m19589T0(i2, q05Var, (bk8) obj);
            case 8:
                qn3 qn3Var4 = q05Var.f57073M;
                bk8 bk8Var5 = (bk8) obj;
                bk8Var5.getClass();
                ik8 ik8VarMo2873e4 = bk8Var5.mo2873e0("SELECT * FROM TranslationSentenceEntity WHERE lessonId = ? ORDER BY TranslationSentenceEntity.`index`");
                try {
                    ik8VarMo2873e4.mo2878j(1, i2);
                    int iM14108v44 = AbstractC3122is.m14108v(ik8VarMo2873e4, "index");
                    int iM14108v45 = AbstractC3122is.m14108v(ik8VarMo2873e4, "lessonId");
                    int iM14108v46 = AbstractC3122is.m14108v(ik8VarMo2873e4, "audio");
                    int iM14108v47 = AbstractC3122is.m14108v(ik8VarMo2873e4, "audioEnd");
                    int iM14108v48 = AbstractC3122is.m14108v(ik8VarMo2873e4, "text");
                    int iM14108v49 = AbstractC3122is.m14108v(ik8VarMo2873e4, "translations");
                    int iM14108v50 = AbstractC3122is.m14108v(ik8VarMo2873e4, "notes");
                    ArrayList arrayList5 = new ArrayList();
                    while (ik8VarMo2873e4.mo2876a0()) {
                        arrayList5.add(new LessonTranslationSentence((int) ik8VarMo2873e4.getLong(iM14108v44), (int) ik8VarMo2873e4.getLong(iM14108v45), ik8VarMo2873e4.isNull(iM14108v46) ? null : Double.valueOf(ik8VarMo2873e4.getDouble(iM14108v46)), ik8VarMo2873e4.isNull(iM14108v47) ? null : Double.valueOf(ik8VarMo2873e4.getDouble(iM14108v47)), ik8VarMo2873e4.mo2875L(iM14108v48), qn3Var4.m20064S(ik8VarMo2873e4.mo2875L(iM14108v49)), qn3Var4.m20060O(ik8VarMo2873e4.mo2875L(iM14108v50))));
                        break;
                    }
                    return arrayList5;
                } finally {
                    ik8VarMo2873e4.close();
                }
            case 9:
                return q05.m19585P0(i2, q05Var, (bk8) obj);
            default:
                return q05.m19586Q0(i2, q05Var, (bk8) obj);
        }
    }
}
