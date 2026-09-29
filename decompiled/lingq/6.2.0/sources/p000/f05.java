package p000;

import com.lingq.core.database.entity.TranslationSentenceEntity;
import com.lingq.core.domain.model.lesson.LessonSentence;
import com.lingq.core.domain.model.lesson.LessonTranslationSentence;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f05 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38136a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f38137b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f38138c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ q05 f38139d;

    public /* synthetic */ f05(int i, int i2, q05 q05Var, int i3) {
        this.f38136a = i3;
        this.f38137b = i;
        this.f38138c = i2;
        this.f38139d = q05Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        LessonTranslationSentence lessonTranslationSentence;
        LessonSentence lessonSentence;
        TranslationSentenceEntity translationSentenceEntity;
        int i = this.f38136a;
        q05 q05Var = this.f38139d;
        int i2 = this.f38138c;
        int i3 = this.f38137b;
        switch (i) {
            case 0:
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT * FROM TranslationSentenceEntity WHERE lessonId = ? AND `index` = ?");
                try {
                    ik8VarMo2873e0.mo2878j(1, i3);
                    ik8VarMo2873e0.mo2878j(2, i2);
                    int iM14108v = AbstractC3122is.m14108v(ik8VarMo2873e0, "index");
                    int iM14108v2 = AbstractC3122is.m14108v(ik8VarMo2873e0, "lessonId");
                    int iM14108v3 = AbstractC3122is.m14108v(ik8VarMo2873e0, "audio");
                    int iM14108v4 = AbstractC3122is.m14108v(ik8VarMo2873e0, "audioEnd");
                    int iM14108v5 = AbstractC3122is.m14108v(ik8VarMo2873e0, "text");
                    int iM14108v6 = AbstractC3122is.m14108v(ik8VarMo2873e0, "translations");
                    int iM14108v7 = AbstractC3122is.m14108v(ik8VarMo2873e0, "notes");
                    if (ik8VarMo2873e0.mo2876a0()) {
                        lessonTranslationSentence = new LessonTranslationSentence((int) ik8VarMo2873e0.getLong(iM14108v), (int) ik8VarMo2873e0.getLong(iM14108v2), ik8VarMo2873e0.isNull(iM14108v3) ? null : Double.valueOf(ik8VarMo2873e0.getDouble(iM14108v3)), ik8VarMo2873e0.isNull(iM14108v4) ? null : Double.valueOf(ik8VarMo2873e0.getDouble(iM14108v4)), ik8VarMo2873e0.mo2875L(iM14108v5), q05Var.f57073M.m20064S(ik8VarMo2873e0.mo2875L(iM14108v6)), q05Var.f57073M.m20060O(ik8VarMo2873e0.mo2875L(iM14108v7)));
                    } else {
                        lessonTranslationSentence = null;
                    }
                    return lessonTranslationSentence;
                } finally {
                    ik8VarMo2873e0.close();
                }
            case 1:
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                ik8 ik8VarMo2873e1 = bk8Var2.mo2873e0("SELECT `tokens`, `text`, `normalizedText`, `index`, `timestamp`, `startParagraph`, `url`, `opentag` FROM (SELECT * FROM LessonSentenceEntity WHERE lessonId = ? AND `index` = ?)");
                try {
                    ik8VarMo2873e1.mo2878j(1, i3);
                    ik8VarMo2873e1.mo2878j(2, i2);
                    if (ik8VarMo2873e1.mo2876a0()) {
                        List listM20063R = q05Var.f57073M.m20063R(ik8VarMo2873e1.mo2875L(0));
                        String strMo2875L = ik8VarMo2873e1.isNull(1) ? null : ik8VarMo2873e1.mo2875L(1);
                        String strMo2875L2 = ik8VarMo2873e1.isNull(2) ? null : ik8VarMo2873e1.mo2875L(2);
                        int i4 = (int) ik8VarMo2873e1.getLong(3);
                        String strMo2875L3 = ik8VarMo2873e1.isNull(4) ? null : ik8VarMo2873e1.mo2875L(4);
                        lessonSentence = new LessonSentence(listM20063R, strMo2875L, strMo2875L2, i4, strMo2875L3 == null ? null : q05Var.f57073M.m20055J(strMo2875L3), ((int) ik8VarMo2873e1.getLong(5)) != 0, ik8VarMo2873e1.isNull(6) ? null : ik8VarMo2873e1.mo2875L(6), ik8VarMo2873e1.isNull(7) ? null : ik8VarMo2873e1.mo2875L(7));
                    } else {
                        lessonSentence = null;
                    }
                    return lessonSentence;
                } finally {
                    ik8VarMo2873e1.close();
                }
            default:
                qn3 qn3Var = q05Var.f57073M;
                bk8 bk8Var3 = (bk8) obj;
                bk8Var3.getClass();
                ik8 ik8VarMo2873e2 = bk8Var3.mo2873e0("SELECT * FROM TranslationSentenceEntity WHERE lessonId = ? AND `index` = ?");
                try {
                    ik8VarMo2873e2.mo2878j(1, i3);
                    ik8VarMo2873e2.mo2878j(2, i2);
                    int iM14108v8 = AbstractC3122is.m14108v(ik8VarMo2873e2, "index");
                    int iM14108v9 = AbstractC3122is.m14108v(ik8VarMo2873e2, "lessonId");
                    int iM14108v10 = AbstractC3122is.m14108v(ik8VarMo2873e2, "audio");
                    int iM14108v11 = AbstractC3122is.m14108v(ik8VarMo2873e2, "audioEnd");
                    int iM14108v12 = AbstractC3122is.m14108v(ik8VarMo2873e2, "text");
                    int iM14108v13 = AbstractC3122is.m14108v(ik8VarMo2873e2, "translations");
                    int iM14108v14 = AbstractC3122is.m14108v(ik8VarMo2873e2, "notes");
                    if (ik8VarMo2873e2.mo2876a0()) {
                        translationSentenceEntity = new TranslationSentenceEntity((int) ik8VarMo2873e2.getLong(iM14108v8), (int) ik8VarMo2873e2.getLong(iM14108v9), ik8VarMo2873e2.isNull(iM14108v10) ? null : Double.valueOf(ik8VarMo2873e2.getDouble(iM14108v10)), ik8VarMo2873e2.isNull(iM14108v11) ? null : Double.valueOf(ik8VarMo2873e2.getDouble(iM14108v11)), ik8VarMo2873e2.mo2875L(iM14108v12), qn3Var.m20064S(ik8VarMo2873e2.mo2875L(iM14108v13)), qn3Var.m20060O(ik8VarMo2873e2.mo2875L(iM14108v14)));
                    } else {
                        translationSentenceEntity = null;
                    }
                    return translationSentenceEntity;
                } finally {
                    ik8VarMo2873e2.close();
                }
        }
    }
}
