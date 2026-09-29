package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fd7 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38909a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f38910b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f38911c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f38912d;

    public /* synthetic */ fd7(int i, String str, int i2) {
        this.f38909a = 0;
        this.f38910b = i;
        this.f38912d = str;
        this.f38911c = i2;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        int i = this.f38909a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f38911c;
        int i3 = this.f38910b;
        String str = this.f38912d;
        bk8 bk8Var = (bk8) obj;
        switch (i) {
            case 0:
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("UPDATE PlaylistAndLessonsJoin SET `order` = ? WHERE nameWithLanguage= ? AND contentId= ?");
                try {
                    ik8VarMo2873e0.mo2878j(1, i3);
                    ik8VarMo2873e0.mo2874C(2, str);
                    ik8VarMo2873e0.mo2878j(3, i2);
                    ik8VarMo2873e0.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e0.close();
                }
            case 1:
                bk8Var.getClass();
                ik8 ik8VarMo2873e1 = bk8Var.mo2873e0("UPDATE PlaylistAndLessonsJoin SET `order` = (`order` - 1) WHERE `order` > ? AND `order` <= ? AND nameWithLanguage= ?");
                try {
                    ik8VarMo2873e1.mo2878j(1, i3);
                    ik8VarMo2873e1.mo2878j(2, i2);
                    ik8VarMo2873e1.mo2874C(3, str);
                    ik8VarMo2873e1.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e1.close();
                }
            case 2:
                bk8Var.getClass();
                ik8 ik8VarMo2873e2 = bk8Var.mo2873e0("UPDATE PlaylistAndLessonsJoin SET `order` = (`order` + 1) WHERE `order` < ? AND `order` >= ? AND nameWithLanguage= ?");
                try {
                    ik8VarMo2873e2.mo2878j(1, i3);
                    ik8VarMo2873e2.mo2878j(2, i2);
                    ik8VarMo2873e2.mo2874C(3, str);
                    ik8VarMo2873e2.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e2.close();
                }
            default:
                bk8Var.getClass();
                ik8 ik8VarMo2873e3 = bk8Var.mo2873e0("\n        SELECT termWithLanguage FROM VocabularyOrderEntity\n        WHERE termWithLanguage LIKE ? ESCAPE '\\'\n            AND sortPosition >= ?\n            AND sortPosition < ?\n        ");
                try {
                    ik8VarMo2873e3.mo2874C(1, str);
                    ik8VarMo2873e3.mo2878j(2, i3);
                    ik8VarMo2873e3.mo2878j(3, i2);
                    ArrayList arrayList = new ArrayList();
                    while (ik8VarMo2873e3.mo2876a0()) {
                        arrayList.add(ik8VarMo2873e3.mo2875L(0));
                    }
                    ik8VarMo2873e3.close();
                    return arrayList;
                } catch (Throwable th) {
                    ik8VarMo2873e3.close();
                    throw th;
                }
        }
    }

    public /* synthetic */ fd7(int i, int i2, int i3, String str) {
        this.f38909a = i3;
        this.f38910b = i;
        this.f38911c = i2;
        this.f38912d = str;
    }

    public /* synthetic */ fd7(String str, int i, int i2) {
        this.f38909a = 3;
        this.f38912d = str;
        this.f38910b = i;
        this.f38911c = i2;
    }
}
