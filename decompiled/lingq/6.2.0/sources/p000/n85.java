package p000;

import com.lingq.core.database.dao.C1321i;
import com.lingq.core.database.entity.LibraryShelfEntity;
import com.lingq.core.domain.model.library.LibraryShelf;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n85 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52483a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f52484b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f52485c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1321i f52486d;

    public /* synthetic */ n85(String str, String str2, C1321i c1321i, int i) {
        this.f52483a = i;
        this.f52484b = str;
        this.f52485c = str2;
        this.f52486d = c1321i;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        Boolean boolValueOf;
        int i = this.f52483a;
        C1321i c1321i = this.f52486d;
        String str = this.f52485c;
        String str2 = this.f52484b;
        switch (i) {
            case 0:
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT * FROM LibraryShelfEntity WHERE language = ? AND levels = ? ORDER BY LibraryShelfEntity.`order` ASC");
                try {
                    ik8VarMo2873e0.mo2874C(1, str2);
                    ik8VarMo2873e0.mo2874C(2, str);
                    int iM14108v = AbstractC3122is.m14108v(ik8VarMo2873e0, "codeWithLanguage");
                    int iM14108v2 = AbstractC3122is.m14108v(ik8VarMo2873e0, "language");
                    int iM14108v3 = AbstractC3122is.m14108v(ik8VarMo2873e0, "pinned");
                    int iM14108v4 = AbstractC3122is.m14108v(ik8VarMo2873e0, "pinnedHard");
                    int iM14108v5 = AbstractC3122is.m14108v(ik8VarMo2873e0, "tabs");
                    int iM14108v6 = AbstractC3122is.m14108v(ik8VarMo2873e0, "code");
                    int iM14108v7 = AbstractC3122is.m14108v(ik8VarMo2873e0, "id");
                    int iM14108v8 = AbstractC3122is.m14108v(ik8VarMo2873e0, "title");
                    int iM14108v9 = AbstractC3122is.m14108v(ik8VarMo2873e0, "order");
                    int iM14108v10 = AbstractC3122is.m14108v(ik8VarMo2873e0, "levels");
                    int iM14108v11 = AbstractC3122is.m14108v(ik8VarMo2873e0, "originalTitle");
                    ArrayList arrayList = new ArrayList();
                    while (ik8VarMo2873e0.mo2876a0()) {
                        String strMo2875L = ik8VarMo2873e0.mo2875L(iM14108v);
                        String strMo2875L2 = ik8VarMo2873e0.mo2875L(iM14108v2);
                        Boolean boolValueOf2 = null;
                        Integer numValueOf = ik8VarMo2873e0.isNull(iM14108v3) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(iM14108v3));
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        } else {
                            boolValueOf = null;
                        }
                        Integer numValueOf2 = ik8VarMo2873e0.isNull(iM14108v4) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(iM14108v4));
                        if (numValueOf2 != null) {
                            boolValueOf2 = Boolean.valueOf(numValueOf2.intValue() != 0);
                        }
                        arrayList.add(new LibraryShelfEntity(strMo2875L, strMo2875L2, boolValueOf, boolValueOf2, c1321i.f17038O.m20057L(ik8VarMo2873e0.mo2875L(iM14108v5)), ik8VarMo2873e0.mo2875L(iM14108v6), (int) ik8VarMo2873e0.getLong(iM14108v7), ik8VarMo2873e0.mo2875L(iM14108v8), (int) ik8VarMo2873e0.getLong(iM14108v9), ik8VarMo2873e0.mo2875L(iM14108v10), ik8VarMo2873e0.mo2875L(iM14108v11)));
                        break;
                    }
                    return arrayList;
                } finally {
                    ik8VarMo2873e0.close();
                }
            default:
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                ik8 ik8VarMo2873e1 = bk8Var2.mo2873e0("SELECT `pinned`, `pinnedHard`, `tabs`, `code`, `id`, `title`, `order`, `originalTitle` FROM (SELECT * FROM LibraryShelfEntity WHERE language = ? AND levels = ? ORDER BY LibraryShelfEntity.`order` ASC)");
                try {
                    ik8VarMo2873e1.mo2874C(1, str2);
                    ik8VarMo2873e1.mo2874C(2, str);
                    ArrayList arrayList2 = new ArrayList();
                    while (ik8VarMo2873e1.mo2876a0()) {
                        arrayList2.add(new LibraryShelf(((int) ik8VarMo2873e1.getLong(0)) != 0, ((int) ik8VarMo2873e1.getLong(1)) != 0, c1321i.f17038O.m20057L(ik8VarMo2873e1.mo2875L(2)), ik8VarMo2873e1.mo2875L(3), (int) ik8VarMo2873e1.getLong(4), ik8VarMo2873e1.mo2875L(5), (int) ik8VarMo2873e1.getLong(6), ik8VarMo2873e1.mo2875L(7)));
                    }
                    ik8VarMo2873e1.close();
                    return arrayList2;
                } catch (Throwable th) {
                    ik8VarMo2873e1.close();
                    throw th;
                }
        }
    }
}
