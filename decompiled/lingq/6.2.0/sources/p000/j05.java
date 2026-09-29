package p000;

import com.lingq.core.database.entity.LessonSentenceEntity;
import com.lingq.core.domain.model.lesson.LessonTranslationSentence;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j05 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44839a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f44840b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f44841c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f44842d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ q05 f44843e;

    public /* synthetic */ j05(int i, int i2, int i3, q05 q05Var, int i4) {
        this.f44839a = i4;
        this.f44840b = i;
        this.f44841c = i2;
        this.f44842d = i3;
        this.f44843e = q05Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        int i = this.f44839a;
        q05 q05Var = this.f44843e;
        int i2 = this.f44842d;
        int i3 = this.f44841c;
        int i4 = this.f44840b;
        switch (i) {
            case 0:
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT * FROM TranslationSentenceEntity WHERE lessonId = ? AND (`index` = ? OR `index` = ?)");
                try {
                    ik8VarMo2873e0.mo2878j(1, i4);
                    ik8VarMo2873e0.mo2878j(2, i3);
                    ik8VarMo2873e0.mo2878j(3, i2);
                    int iM14108v = AbstractC3122is.m14108v(ik8VarMo2873e0, "index");
                    int iM14108v2 = AbstractC3122is.m14108v(ik8VarMo2873e0, "lessonId");
                    int iM14108v3 = AbstractC3122is.m14108v(ik8VarMo2873e0, "audio");
                    int iM14108v4 = AbstractC3122is.m14108v(ik8VarMo2873e0, "audioEnd");
                    int iM14108v5 = AbstractC3122is.m14108v(ik8VarMo2873e0, "text");
                    int iM14108v6 = AbstractC3122is.m14108v(ik8VarMo2873e0, "translations");
                    int iM14108v7 = AbstractC3122is.m14108v(ik8VarMo2873e0, "notes");
                    ArrayList arrayList = new ArrayList();
                    while (ik8VarMo2873e0.mo2876a0()) {
                        arrayList.add(new LessonTranslationSentence((int) ik8VarMo2873e0.getLong(iM14108v), (int) ik8VarMo2873e0.getLong(iM14108v2), ik8VarMo2873e0.isNull(iM14108v3) ? null : Double.valueOf(ik8VarMo2873e0.getDouble(iM14108v3)), ik8VarMo2873e0.isNull(iM14108v4) ? null : Double.valueOf(ik8VarMo2873e0.getDouble(iM14108v4)), ik8VarMo2873e0.mo2875L(iM14108v5), q05Var.f57073M.m20064S(ik8VarMo2873e0.mo2875L(iM14108v6)), q05Var.f57073M.m20060O(ik8VarMo2873e0.mo2875L(iM14108v7))));
                        break;
                    }
                    return arrayList;
                } finally {
                    ik8VarMo2873e0.close();
                }
            default:
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                ik8 ik8VarMo2873e1 = bk8Var2.mo2873e0("SELECT * FROM LessonSentenceEntity WHERE lessonId = ? AND `index` >= ? AND `index` < ?");
                try {
                    ik8VarMo2873e1.mo2878j(1, i4);
                    ik8VarMo2873e1.mo2878j(2, i3);
                    ik8VarMo2873e1.mo2878j(3, i2);
                    int iM14108v8 = AbstractC3122is.m14108v(ik8VarMo2873e1, "lessonId");
                    int iM14108v9 = AbstractC3122is.m14108v(ik8VarMo2873e1, "tokens");
                    int iM14108v10 = AbstractC3122is.m14108v(ik8VarMo2873e1, "text");
                    int iM14108v11 = AbstractC3122is.m14108v(ik8VarMo2873e1, "normalizedText");
                    int iM14108v12 = AbstractC3122is.m14108v(ik8VarMo2873e1, "index");
                    int iM14108v13 = AbstractC3122is.m14108v(ik8VarMo2873e1, "timestamp");
                    int iM14108v14 = AbstractC3122is.m14108v(ik8VarMo2873e1, "startParagraph");
                    int iM14108v15 = AbstractC3122is.m14108v(ik8VarMo2873e1, "url");
                    int iM14108v16 = AbstractC3122is.m14108v(ik8VarMo2873e1, "opentag");
                    ArrayList arrayList2 = new ArrayList();
                    while (ik8VarMo2873e1.mo2876a0()) {
                        int i5 = (int) ik8VarMo2873e1.getLong(iM14108v8);
                        List listM20063R = q05Var.f57073M.m20063R(ik8VarMo2873e1.mo2875L(iM14108v9));
                        String strMo2875L = ik8VarMo2873e1.isNull(iM14108v10) ? null : ik8VarMo2873e1.mo2875L(iM14108v10);
                        String strMo2875L2 = ik8VarMo2873e1.isNull(iM14108v11) ? null : ik8VarMo2873e1.mo2875L(iM14108v11);
                        q05 q05Var2 = q05Var;
                        int i6 = (int) ik8VarMo2873e1.getLong(iM14108v12);
                        String strMo2875L3 = ik8VarMo2873e1.isNull(iM14108v13) ? null : ik8VarMo2873e1.mo2875L(iM14108v13);
                        arrayList2.add(new LessonSentenceEntity(i5, listM20063R, strMo2875L, strMo2875L2, i6, strMo2875L3 == null ? null : q05Var2.f57073M.m20055J(strMo2875L3), ((int) ik8VarMo2873e1.getLong(iM14108v14)) != 0, ik8VarMo2873e1.isNull(iM14108v15) ? null : ik8VarMo2873e1.mo2875L(iM14108v15), ik8VarMo2873e1.isNull(iM14108v16) ? null : ik8VarMo2873e1.mo2875L(iM14108v16)));
                        iM14108v10 = iM14108v10;
                        iM14108v12 = iM14108v12;
                        q05Var = q05Var2;
                        break;
                    }
                    return arrayList2;
                } finally {
                    ik8VarMo2873e1.close();
                }
        }
    }
}
