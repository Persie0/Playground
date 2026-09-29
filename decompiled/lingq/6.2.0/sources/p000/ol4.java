package p000;

import com.lingq.core.database.entity.LanguageContextEntity;
import com.lingq.core.domain.model.language.LanguageContextNotification;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ol4 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54530a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f54531b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ul4 f54532c;

    public /* synthetic */ ol4(String str, ul4 ul4Var, int i) {
        this.f54530a = i;
        this.f54531b = str;
        this.f54532c = ul4Var;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0276 A[Catch: all -> 0x0158, TryCatch #1 {all -> 0x0158, blocks: (B:24:0x006c, B:26:0x00ff, B:31:0x011b, B:35:0x012c, B:37:0x0134, B:43:0x0148, B:47:0x0151, B:51:0x015d, B:55:0x016c, B:59:0x0180, B:63:0x0191, B:65:0x0197, B:70:0x01aa, B:74:0x01b3, B:76:0x01bc, B:80:0x01cb, B:85:0x01dd, B:90:0x01f4, B:95:0x0206, B:99:0x0212, B:104:0x022b, B:108:0x0234, B:111:0x0240, B:113:0x0246, B:119:0x0256, B:120:0x0266, B:122:0x026c, B:127:0x0285, B:126:0x0276, B:102:0x0220, B:98:0x020e, B:94:0x01ff, B:89:0x01e8, B:84:0x01d6, B:79:0x01c5, B:68:0x019f, B:128:0x0291, B:129:0x0298, B:62:0x018d, B:58:0x0175, B:54:0x0166, B:40:0x013c, B:130:0x0299, B:131:0x02a0, B:34:0x0128, B:30:0x0114), top: B:157:0x006c }] */
    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        kp4 kp4Var;
        LanguageContextEntity languageContextEntity;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        int i;
        LanguageContextNotification languageContextNotification;
        LanguageContextNotification languageContextNotification2;
        kp4 kp4Var2;
        int i2 = this.f54530a;
        ul4 ul4Var = this.f54532c;
        String str = this.f54531b;
        switch (i2) {
            case 0:
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT * FROM LanguageCardsTagsEntity WHERE code = ?");
                try {
                    ik8VarMo2873e0.mo2874C(1, str);
                    int iM14108v = AbstractC3122is.m14108v(ik8VarMo2873e0, "code");
                    int iM14108v2 = AbstractC3122is.m14108v(ik8VarMo2873e0, "tags");
                    if (ik8VarMo2873e0.mo2876a0()) {
                        String strMo2875L = ik8VarMo2873e0.mo2875L(iM14108v);
                        List listM20058M = ul4Var.f64044M.m20058M(ik8VarMo2873e0.isNull(iM14108v2) ? null : ik8VarMo2873e0.mo2875L(iM14108v2));
                        if (listM20058M == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        kp4Var = new kp4(strMo2875L, listM20058M);
                    } else {
                        kp4Var = null;
                    }
                    ik8VarMo2873e0.close();
                    return kp4Var;
                } catch (Throwable th) {
                    ik8VarMo2873e0.close();
                    throw th;
                }
            case 1:
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                ik8 ik8VarMo2873e1 = bk8Var2.mo2873e0("SELECT * FROM LanguageContextEntity WHERE code = ?");
                try {
                    ik8VarMo2873e1.mo2874C(1, str);
                    int iM14108v3 = AbstractC3122is.m14108v(ik8VarMo2873e1, "code");
                    int iM14108v4 = AbstractC3122is.m14108v(ik8VarMo2873e1, "pk");
                    int iM14108v5 = AbstractC3122is.m14108v(ik8VarMo2873e1, "url");
                    int iM14108v6 = AbstractC3122is.m14108v(ik8VarMo2873e1, "repetitionLingQs");
                    int iM14108v7 = AbstractC3122is.m14108v(ik8VarMo2873e1, "lotdDates");
                    int iM14108v8 = AbstractC3122is.m14108v(ik8VarMo2873e1, "isUseFeed");
                    int iM14108v9 = AbstractC3122is.m14108v(ik8VarMo2873e1, "intense");
                    int iM14108v10 = AbstractC3122is.m14108v(ik8VarMo2873e1, "streakGoal");
                    int iM14108v11 = AbstractC3122is.m14108v(ik8VarMo2873e1, "streakDays");
                    int iM14108v12 = AbstractC3122is.m14108v(ik8VarMo2873e1, "tags");
                    int iM14108v13 = AbstractC3122is.m14108v(ik8VarMo2873e1, "supported");
                    int iM14108v14 = AbstractC3122is.m14108v(ik8VarMo2873e1, "title");
                    int iM14108v15 = AbstractC3122is.m14108v(ik8VarMo2873e1, "lastUsed");
                    int iM14108v16 = AbstractC3122is.m14108v(ik8VarMo2873e1, "knownWords");
                    int iM14108v17 = AbstractC3122is.m14108v(ik8VarMo2873e1, "grammarResourceSlug");
                    int iM14108v18 = AbstractC3122is.m14108v(ik8VarMo2873e1, "feedLevels");
                    int iM14108v19 = AbstractC3122is.m14108v(ik8VarMo2873e1, "scheduledForDeletion");
                    int iM14108v20 = AbstractC3122is.m14108v(ik8VarMo2873e1, "email_lotd");
                    int iM14108v21 = AbstractC3122is.m14108v(ik8VarMo2873e1, "email_weekly");
                    int iM14108v22 = AbstractC3122is.m14108v(ik8VarMo2873e1, "site_lotd");
                    int iM14108v23 = AbstractC3122is.m14108v(ik8VarMo2873e1, "site_weekly");
                    if (ik8VarMo2873e1.mo2876a0()) {
                        String strMo2875L2 = ik8VarMo2873e1.mo2875L(iM14108v3);
                        int i3 = (int) ik8VarMo2873e1.getLong(iM14108v4);
                        String strMo2875L3 = ik8VarMo2873e1.isNull(iM14108v5) ? null : ik8VarMo2873e1.mo2875L(iM14108v5);
                        int i4 = (int) ik8VarMo2873e1.getLong(iM14108v6);
                        String strMo2875L4 = ik8VarMo2873e1.isNull(iM14108v7) ? null : ik8VarMo2873e1.mo2875L(iM14108v7);
                        qn3 qn3Var = ul4Var.f64044M;
                        List listM20058M2 = qn3Var.m20058M(strMo2875L4);
                        if (listM20058M2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        Integer numValueOf = ik8VarMo2873e1.isNull(iM14108v8) ? null : Integer.valueOf((int) ik8VarMo2873e1.getLong(iM14108v8));
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        } else {
                            boolValueOf = null;
                        }
                        String strMo2875L5 = ik8VarMo2873e1.isNull(iM14108v9) ? null : ik8VarMo2873e1.mo2875L(iM14108v9);
                        Integer numValueOf2 = ik8VarMo2873e1.isNull(iM14108v10) ? null : Integer.valueOf((int) ik8VarMo2873e1.getLong(iM14108v10));
                        int i5 = (int) ik8VarMo2873e1.getLong(iM14108v11);
                        List listM20058M3 = qn3Var.m20058M(ik8VarMo2873e1.isNull(iM14108v12) ? null : ik8VarMo2873e1.mo2875L(iM14108v12));
                        if (listM20058M3 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        Integer numValueOf3 = ik8VarMo2873e1.isNull(iM14108v13) ? null : Integer.valueOf((int) ik8VarMo2873e1.getLong(iM14108v13));
                        if (numValueOf3 != null) {
                            boolValueOf2 = Boolean.valueOf(numValueOf3.intValue() != 0);
                        } else {
                            boolValueOf2 = null;
                        }
                        String strMo2875L6 = ik8VarMo2873e1.isNull(iM14108v14) ? null : ik8VarMo2873e1.mo2875L(iM14108v14);
                        String strMo2875L7 = ik8VarMo2873e1.isNull(iM14108v15) ? null : ik8VarMo2873e1.mo2875L(iM14108v15);
                        Integer numValueOf4 = ik8VarMo2873e1.isNull(iM14108v16) ? null : Integer.valueOf((int) ik8VarMo2873e1.getLong(iM14108v16));
                        String strMo2875L8 = ik8VarMo2873e1.isNull(iM14108v17) ? null : ik8VarMo2873e1.mo2875L(iM14108v17);
                        List listM20058M4 = qn3Var.m20058M(ik8VarMo2873e1.isNull(iM14108v18) ? null : ik8VarMo2873e1.mo2875L(iM14108v18));
                        Integer numValueOf5 = ik8VarMo2873e1.isNull(iM14108v19) ? null : Integer.valueOf((int) ik8VarMo2873e1.getLong(iM14108v19));
                        if (numValueOf5 != null) {
                            boolValueOf3 = Boolean.valueOf(numValueOf5.intValue() != 0);
                        } else {
                            boolValueOf3 = null;
                        }
                        if (ik8VarMo2873e1.isNull(iM14108v20)) {
                            i = iM14108v21;
                            if (ik8VarMo2873e1.isNull(i)) {
                                languageContextNotification = null;
                            }
                            if (ik8VarMo2873e1.isNull(iM14108v22) || !ik8VarMo2873e1.isNull(iM14108v23)) {
                                languageContextNotification2 = new LanguageContextNotification(ik8VarMo2873e1.mo2875L(iM14108v22), ik8VarMo2873e1.mo2875L(iM14108v23));
                            } else {
                                languageContextNotification2 = null;
                            }
                            languageContextEntity = new LanguageContextEntity(strMo2875L2, i3, strMo2875L3, i4, listM20058M2, languageContextNotification, languageContextNotification2, boolValueOf, strMo2875L5, numValueOf2, i5, listM20058M3, boolValueOf2, strMo2875L6, strMo2875L7, numValueOf4, strMo2875L8, listM20058M4, boolValueOf3);
                        } else {
                            i = iM14108v21;
                        }
                        languageContextNotification = new LanguageContextNotification(ik8VarMo2873e1.mo2875L(iM14108v20), ik8VarMo2873e1.mo2875L(i));
                        if (ik8VarMo2873e1.isNull(iM14108v22)) {
                            languageContextNotification2 = new LanguageContextNotification(ik8VarMo2873e1.mo2875L(iM14108v22), ik8VarMo2873e1.mo2875L(iM14108v23));
                        } else {
                            languageContextNotification2 = new LanguageContextNotification(ik8VarMo2873e1.mo2875L(iM14108v22), ik8VarMo2873e1.mo2875L(iM14108v23));
                        }
                        languageContextEntity = new LanguageContextEntity(strMo2875L2, i3, strMo2875L3, i4, listM20058M2, languageContextNotification, languageContextNotification2, boolValueOf, strMo2875L5, numValueOf2, i5, listM20058M3, boolValueOf2, strMo2875L6, strMo2875L7, numValueOf4, strMo2875L8, listM20058M4, boolValueOf3);
                    } else {
                        languageContextEntity = null;
                    }
                    ik8VarMo2873e1.close();
                    return languageContextEntity;
                } catch (Throwable th2) {
                    ik8VarMo2873e1.close();
                    throw th2;
                }
            default:
                bk8 bk8Var3 = (bk8) obj;
                bk8Var3.getClass();
                ik8 ik8VarMo2873e2 = bk8Var3.mo2873e0("SELECT * FROM LanguageCardsTagsEntity WHERE code = ?");
                try {
                    ik8VarMo2873e2.mo2874C(1, str);
                    int iM14108v24 = AbstractC3122is.m14108v(ik8VarMo2873e2, "code");
                    int iM14108v25 = AbstractC3122is.m14108v(ik8VarMo2873e2, "tags");
                    if (ik8VarMo2873e2.mo2876a0()) {
                        String strMo2875L9 = ik8VarMo2873e2.mo2875L(iM14108v24);
                        List listM20058M5 = ul4Var.f64044M.m20058M(ik8VarMo2873e2.isNull(iM14108v25) ? null : ik8VarMo2873e2.mo2875L(iM14108v25));
                        if (listM20058M5 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        kp4Var2 = new kp4(strMo2875L9, listM20058M5);
                    } else {
                        kp4Var2 = null;
                    }
                    ik8VarMo2873e2.close();
                    return kp4Var2;
                } catch (Throwable th3) {
                    ik8VarMo2873e2.close();
                    throw th3;
                }
        }
    }
}
