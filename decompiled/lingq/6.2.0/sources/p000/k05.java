package p000;

import com.lingq.core.database.entity.TranslationSentenceEntity;
import com.lingq.core.domain.model.lesson.LessonTranslationSentence;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k05 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46477a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f46478b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f46479c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ List f46480d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ q05 f46481e;

    public /* synthetic */ k05(String str, int i, List list, q05 q05Var, int i2) {
        this.f46477a = i2;
        this.f46478b = str;
        this.f46479c = i;
        this.f46480d = list;
        this.f46481e = q05Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        int i = this.f46477a;
        int i2 = 2;
        q05 q05Var = this.f46481e;
        List list = this.f46480d;
        int i3 = this.f46479c;
        String str = this.f46478b;
        switch (i) {
            case 0:
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0(str);
                try {
                    ik8VarMo2873e0.mo2878j(1, i3);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ik8VarMo2873e0.mo2878j(i2, ((Number) it.next()).intValue());
                        i2++;
                    }
                    int iM14108v = AbstractC3122is.m14108v(ik8VarMo2873e0, "index");
                    int iM14108v2 = AbstractC3122is.m14108v(ik8VarMo2873e0, "lessonId");
                    int iM14108v3 = AbstractC3122is.m14108v(ik8VarMo2873e0, "audio");
                    int iM14108v4 = AbstractC3122is.m14108v(ik8VarMo2873e0, "audioEnd");
                    int iM14108v5 = AbstractC3122is.m14108v(ik8VarMo2873e0, "text");
                    int iM14108v6 = AbstractC3122is.m14108v(ik8VarMo2873e0, "translations");
                    int iM14108v7 = AbstractC3122is.m14108v(ik8VarMo2873e0, "notes");
                    ArrayList arrayList = new ArrayList();
                    while (ik8VarMo2873e0.mo2876a0()) {
                        arrayList.add(new TranslationSentenceEntity((int) ik8VarMo2873e0.getLong(iM14108v), (int) ik8VarMo2873e0.getLong(iM14108v2), ik8VarMo2873e0.isNull(iM14108v3) ? null : Double.valueOf(ik8VarMo2873e0.getDouble(iM14108v3)), ik8VarMo2873e0.isNull(iM14108v4) ? null : Double.valueOf(ik8VarMo2873e0.getDouble(iM14108v4)), ik8VarMo2873e0.mo2875L(iM14108v5), q05Var.f57073M.m20064S(ik8VarMo2873e0.mo2875L(iM14108v6)), q05Var.f57073M.m20060O(ik8VarMo2873e0.mo2875L(iM14108v7))));
                        break;
                    }
                    return arrayList;
                } finally {
                    ik8VarMo2873e0.close();
                }
            default:
                qn3 qn3Var = q05Var.f57073M;
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                ik8 ik8VarMo2873e1 = bk8Var2.mo2873e0(str);
                try {
                    ik8VarMo2873e1.mo2878j(1, i3);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ik8VarMo2873e1.mo2878j(i2, ((Number) it2.next()).intValue());
                        i2++;
                    }
                    int iM14108v8 = AbstractC3122is.m14108v(ik8VarMo2873e1, "index");
                    int iM14108v9 = AbstractC3122is.m14108v(ik8VarMo2873e1, "lessonId");
                    int iM14108v10 = AbstractC3122is.m14108v(ik8VarMo2873e1, "audio");
                    int iM14108v11 = AbstractC3122is.m14108v(ik8VarMo2873e1, "audioEnd");
                    int iM14108v12 = AbstractC3122is.m14108v(ik8VarMo2873e1, "text");
                    int iM14108v13 = AbstractC3122is.m14108v(ik8VarMo2873e1, "translations");
                    int iM14108v14 = AbstractC3122is.m14108v(ik8VarMo2873e1, "notes");
                    ArrayList arrayList2 = new ArrayList();
                    while (ik8VarMo2873e1.mo2876a0()) {
                        arrayList2.add(new LessonTranslationSentence((int) ik8VarMo2873e1.getLong(iM14108v8), (int) ik8VarMo2873e1.getLong(iM14108v9), ik8VarMo2873e1.isNull(iM14108v10) ? null : Double.valueOf(ik8VarMo2873e1.getDouble(iM14108v10)), ik8VarMo2873e1.isNull(iM14108v11) ? null : Double.valueOf(ik8VarMo2873e1.getDouble(iM14108v11)), ik8VarMo2873e1.mo2875L(iM14108v12), qn3Var.m20064S(ik8VarMo2873e1.mo2875L(iM14108v13)), qn3Var.m20060O(ik8VarMo2873e1.mo2875L(iM14108v14))));
                        break;
                    }
                    return arrayList2;
                } finally {
                    ik8VarMo2873e1.close();
                }
        }
    }
}
