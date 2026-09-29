package p000;

import androidx.compose.p002ui.semantics.AbstractC0424d;
import androidx.compose.p002ui.semantics.AbstractC0426f;
import com.lingq.core.domain.model.language.DictionaryData;
import java.util.ArrayList;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jd0 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45434a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f45435b;

    public /* synthetic */ jd0(String str, int i) {
        this.f45434a = i;
        this.f45435b = str;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        jp4 jp4Var;
        Long lValueOf;
        int i = this.f45434a;
        xfa xfaVar = xfa.f68157a;
        String str = this.f45435b;
        switch (i) {
            case 0:
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT name FROM SourceBlacklistEntity WHERE language = ?");
                try {
                    ik8VarMo2873e0.mo2874C(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (ik8VarMo2873e0.mo2876a0()) {
                        arrayList.add(ik8VarMo2873e0.mo2875L(0));
                    }
                    ik8VarMo2873e0.close();
                    return arrayList;
                } catch (Throwable th) {
                    ik8VarMo2873e0.close();
                    throw th;
                }
            case 1:
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                ik8 ik8VarMo2873e1 = bk8Var2.mo2873e0("DELETE FROM SourceBlacklistEntity WHERE language = ?");
                try {
                    ik8VarMo2873e1.mo2874C(1, str);
                    ik8VarMo2873e1.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e1.close();
                }
            case 2:
                bk8 bk8Var3 = (bk8) obj;
                bk8Var3.getClass();
                ik8 ik8VarMo2873e2 = bk8Var3.mo2873e0("DELETE FROM CourseBlacklistEntity WHERE language = ?");
                try {
                    ik8VarMo2873e2.mo2874C(1, str);
                    ik8VarMo2873e2.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e2.close();
                }
            case 3:
                bk8 bk8Var4 = (bk8) obj;
                bk8Var4.getClass();
                ik8 ik8VarMo2873e3 = bk8Var4.mo2873e0("SELECT id FROM CourseBlacklistEntity WHERE language = ?");
                try {
                    ik8VarMo2873e3.mo2874C(1, str);
                    ArrayList arrayList2 = new ArrayList();
                    while (ik8VarMo2873e3.mo2876a0()) {
                        arrayList2.add(Integer.valueOf((int) ik8VarMo2873e3.getLong(0)));
                    }
                    ik8VarMo2873e3.close();
                    return arrayList2;
                } catch (Throwable th2) {
                    ik8VarMo2873e3.close();
                    throw th2;
                }
            case 4:
                bk8 bk8Var5 = (bk8) obj;
                bk8Var5.getClass();
                ik8 ik8VarMo2873e4 = bk8Var5.mo2873e0("SELECT id FROM CollectionSubscriptionEntity WHERE language = ?");
                try {
                    ik8VarMo2873e4.mo2874C(1, str);
                    ArrayList arrayList3 = new ArrayList();
                    while (ik8VarMo2873e4.mo2876a0()) {
                        arrayList3.add(Integer.valueOf((int) ik8VarMo2873e4.getLong(0)));
                    }
                    ik8VarMo2873e4.close();
                    return arrayList3;
                } catch (Throwable th3) {
                    ik8VarMo2873e4.close();
                    throw th3;
                }
            case 5:
                bk8 bk8Var6 = (bk8) obj;
                bk8Var6.getClass();
                ik8 ik8VarMo2873e5 = bk8Var6.mo2873e0("DELETE FROM CollectionSubscriptionEntity WHERE language = ?");
                try {
                    ik8VarMo2873e5.mo2874C(1, str);
                    ik8VarMo2873e5.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e5.close();
                }
            case 6:
                bk8 bk8Var7 = (bk8) obj;
                bk8Var7.getClass();
                ik8 ik8VarMo2873e6 = bk8Var7.mo2873e0("\n    SELECT DISTINCT DictionaryDataEntity.* FROM DictionaryDataEntity\n    INNER JOIN LanguageActiveDictionaryJoin ON LanguageActiveDictionaryJoin.code = ?\n    AND LanguageActiveDictionaryJoin.id = DictionaryDataEntity.id\n    ORDER BY DictionaryDataEntity.`order`");
                try {
                    ik8VarMo2873e6.mo2874C(1, str);
                    int iM14108v = AbstractC3122is.m14108v(ik8VarMo2873e6, "id");
                    int iM14108v2 = AbstractC3122is.m14108v(ik8VarMo2873e6, "name");
                    int iM14108v3 = AbstractC3122is.m14108v(ik8VarMo2873e6, "order");
                    int iM14108v4 = AbstractC3122is.m14108v(ik8VarMo2873e6, "urlToTransform");
                    int iM14108v5 = AbstractC3122is.m14108v(ik8VarMo2873e6, "urlDefinition");
                    int iM14108v6 = AbstractC3122is.m14108v(ik8VarMo2873e6, "isPopUpWindow");
                    int iM14108v7 = AbstractC3122is.m14108v(ik8VarMo2873e6, "languageTo");
                    int iM14108v8 = AbstractC3122is.m14108v(ik8VarMo2873e6, "urlVar1");
                    int iM14108v9 = AbstractC3122is.m14108v(ik8VarMo2873e6, "urlVar2");
                    int iM14108v10 = AbstractC3122is.m14108v(ik8VarMo2873e6, "urlVar3");
                    int iM14108v11 = AbstractC3122is.m14108v(ik8VarMo2873e6, "urlVar4");
                    int iM14108v12 = AbstractC3122is.m14108v(ik8VarMo2873e6, "urlVar5");
                    int iM14108v13 = AbstractC3122is.m14108v(ik8VarMo2873e6, "overrideUrl");
                    ArrayList arrayList4 = new ArrayList();
                    while (ik8VarMo2873e6.mo2876a0()) {
                        ArrayList arrayList5 = arrayList4;
                        int i2 = iM14108v2;
                        arrayList4 = arrayList5;
                        arrayList4.add(new DictionaryData((int) ik8VarMo2873e6.getLong(iM14108v), ik8VarMo2873e6.mo2875L(iM14108v2), (int) ik8VarMo2873e6.getLong(iM14108v3), ik8VarMo2873e6.mo2875L(iM14108v4), ik8VarMo2873e6.mo2875L(iM14108v5), ((int) ik8VarMo2873e6.getLong(iM14108v6)) != 0, ik8VarMo2873e6.mo2875L(iM14108v7), ik8VarMo2873e6.mo2875L(iM14108v8), ik8VarMo2873e6.mo2875L(iM14108v9), ik8VarMo2873e6.mo2875L(iM14108v10), ik8VarMo2873e6.mo2875L(iM14108v11), ik8VarMo2873e6.mo2875L(iM14108v12), ik8VarMo2873e6.mo2875L(iM14108v13)));
                        iM14108v2 = i2;
                    }
                    ik8VarMo2873e6.close();
                    return arrayList4;
                } catch (Throwable th4) {
                    ik8VarMo2873e6.close();
                    throw th4;
                }
            case 7:
                bk8 bk8Var8 = (bk8) obj;
                bk8Var8.getClass();
                ik8 ik8VarMo2873e7 = bk8Var8.mo2873e0("\n    SELECT DISTINCT DictionaryDataEntity.* FROM DictionaryDataEntity, LanguageContextEntity\n    INNER JOIN LanguageAvailableDictionaryJoin ON LanguageAvailableDictionaryJoin.code = LanguageContextEntity.code\n    AND LanguageAvailableDictionaryJoin.id = DictionaryDataEntity.id\n    WHERE LanguageContextEntity.code = ? ORDER BY DictionaryDataEntity.`order`");
                try {
                    ik8VarMo2873e7.mo2874C(1, str);
                    int iM14108v14 = AbstractC3122is.m14108v(ik8VarMo2873e7, "id");
                    int iM14108v15 = AbstractC3122is.m14108v(ik8VarMo2873e7, "name");
                    int iM14108v16 = AbstractC3122is.m14108v(ik8VarMo2873e7, "order");
                    int iM14108v17 = AbstractC3122is.m14108v(ik8VarMo2873e7, "urlToTransform");
                    int iM14108v18 = AbstractC3122is.m14108v(ik8VarMo2873e7, "urlDefinition");
                    int iM14108v19 = AbstractC3122is.m14108v(ik8VarMo2873e7, "isPopUpWindow");
                    int iM14108v20 = AbstractC3122is.m14108v(ik8VarMo2873e7, "languageTo");
                    int iM14108v21 = AbstractC3122is.m14108v(ik8VarMo2873e7, "urlVar1");
                    int iM14108v22 = AbstractC3122is.m14108v(ik8VarMo2873e7, "urlVar2");
                    int iM14108v23 = AbstractC3122is.m14108v(ik8VarMo2873e7, "urlVar3");
                    int iM14108v24 = AbstractC3122is.m14108v(ik8VarMo2873e7, "urlVar4");
                    int iM14108v25 = AbstractC3122is.m14108v(ik8VarMo2873e7, "urlVar5");
                    int iM14108v26 = AbstractC3122is.m14108v(ik8VarMo2873e7, "overrideUrl");
                    ArrayList arrayList6 = new ArrayList();
                    while (ik8VarMo2873e7.mo2876a0()) {
                        ArrayList arrayList7 = arrayList6;
                        int i3 = iM14108v15;
                        arrayList6 = arrayList7;
                        arrayList6.add(new DictionaryData((int) ik8VarMo2873e7.getLong(iM14108v14), ik8VarMo2873e7.mo2875L(iM14108v15), (int) ik8VarMo2873e7.getLong(iM14108v16), ik8VarMo2873e7.mo2875L(iM14108v17), ik8VarMo2873e7.mo2875L(iM14108v18), ((int) ik8VarMo2873e7.getLong(iM14108v19)) != 0, ik8VarMo2873e7.mo2875L(iM14108v20), ik8VarMo2873e7.mo2875L(iM14108v21), ik8VarMo2873e7.mo2875L(iM14108v22), ik8VarMo2873e7.mo2875L(iM14108v23), ik8VarMo2873e7.mo2875L(iM14108v24), ik8VarMo2873e7.mo2875L(iM14108v25), ik8VarMo2873e7.mo2875L(iM14108v26)));
                        iM14108v15 = i3;
                    }
                    ik8VarMo2873e7.close();
                    return arrayList6;
                } catch (Throwable th5) {
                    ik8VarMo2873e7.close();
                    throw th5;
                }
            case 8:
                Pair pair = (Pair) obj;
                pair.getClass();
                return Boolean.valueOf(fa4.m11650l(pair.f47623a, str));
            case 9:
                tv8 tv8Var = (tv8) obj;
                AbstractC0426f.m1860d(tv8Var, str);
                AbstractC0426f.m1864h(tv8Var, 5);
                return xfaVar;
            case 10:
                tv8 tv8Var2 = (tv8) obj;
                AbstractC0426f.m1860d(tv8Var2, str);
                AbstractC0426f.m1864h(tv8Var2, 5);
                return xfaVar;
            case 11:
                ((jv8) obj).f46235a.put(omd.f54598c, vz1.m23604J(str));
                return xfaVar;
            case 12:
                bk8 bk8Var9 = (bk8) obj;
                bk8Var9.getClass();
                ik8 ik8VarMo2873e8 = bk8Var9.mo2873e0("SELECT `language`, `coins`, `latestStreakDays`, `isStreakBroken`, `brokenStreakDate` FROM (SELECT * FROM StreakEntity WHERE language = ? LIMIT 1)");
                try {
                    ik8VarMo2873e8.mo2874C(1, str);
                    if (ik8VarMo2873e8.mo2876a0()) {
                        jp4Var = new jp4(ik8VarMo2873e8.mo2875L(0), (int) ik8VarMo2873e8.getLong(2), ((int) ik8VarMo2873e8.getLong(3)) != 0, ik8VarMo2873e8.getDouble(1), ik8VarMo2873e8.isNull(4) ? null : ik8VarMo2873e8.mo2875L(4));
                    } else {
                        jp4Var = null;
                    }
                    return jp4Var;
                } finally {
                    ik8VarMo2873e8.close();
                }
            case 13:
                bk8 bk8Var10 = (bk8) obj;
                bk8Var10.getClass();
                ik8 ik8VarMo2873e9 = bk8Var10.mo2873e0("DELETE FROM LibraryShelfAndContentJoin WHERE codeWithLanguage = ?");
                try {
                    ik8VarMo2873e9.mo2874C(1, str);
                    ik8VarMo2873e9.mo2876a0();
                    return Integer.valueOf(AbstractC3489q9.m19787q(bk8Var10));
                } finally {
                    ik8VarMo2873e9.close();
                }
            case 14:
                bk8 bk8Var11 = (bk8) obj;
                bk8Var11.getClass();
                ik8 ik8VarMo2873e10 = bk8Var11.mo2873e0("SELECT long_value FROM Preference where `key`=?");
                try {
                    ik8VarMo2873e10.mo2874C(1, str);
                    if (ik8VarMo2873e10.mo2876a0() && !ik8VarMo2873e10.isNull(0)) {
                        lValueOf = Long.valueOf(ik8VarMo2873e10.getLong(0));
                        break;
                    } else {
                        lValueOf = null;
                    }
                    return lValueOf;
                } finally {
                    ik8VarMo2873e10.close();
                }
            case 15:
                bh4[] bh4VarArr = AbstractC0426f.f5022a;
                ((tv8) obj).mo3709d(AbstractC0424d.f4989M, str);
                return xfaVar;
            default:
                tv8 tv8Var3 = (tv8) obj;
                AbstractC0426f.m1860d(tv8Var3, str);
                AbstractC0426f.m1864h(tv8Var3, 5);
                return xfaVar;
        }
    }
}
