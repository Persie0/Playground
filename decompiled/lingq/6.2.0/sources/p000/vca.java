package p000;

import com.lingq.core.domain.model.token.TextToSpeechVoice;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vca implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f65196a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f65197b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f65198c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zca f65199d;

    public /* synthetic */ vca(String str, String str2, zca zcaVar, int i) {
        this.f65196a = i;
        this.f65197b = str;
        this.f65198c = str2;
        this.f65199d = zcaVar;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        TextToSpeechVoice textToSpeechVoice;
        Boolean boolValueOf;
        TextToSpeechVoice textToSpeechVoice2;
        Boolean boolValueOf2;
        int i = this.f65196a;
        zca zcaVar = this.f65199d;
        String str = this.f65198c;
        String str2 = this.f65197b;
        switch (i) {
            case 0:
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("\n        SELECT DISTINCT TtsVoiceEntity.* FROM TtsVoiceEntity\n        INNER JOIN LanguageAndTtsVoicesJoin ON code = ?\n        WHERE TtsVoiceEntity.name = LanguageAndTtsVoicesJoin.name\n        AND tags LIKE '%' || ? || '%' AND tags LIKE '%' || 'default' || '%'\n        ORDER BY voiceOrder ASC LIMIT 1");
                try {
                    ik8VarMo2873e0.mo2874C(1, str2);
                    ik8VarMo2873e0.mo2874C(2, str);
                    int iM14108v = AbstractC3122is.m14108v(ik8VarMo2873e0, "name");
                    int iM14108v2 = AbstractC3122is.m14108v(ik8VarMo2873e0, "title");
                    int iM14108v3 = AbstractC3122is.m14108v(ik8VarMo2873e0, "voicesByApp");
                    int iM14108v4 = AbstractC3122is.m14108v(ik8VarMo2873e0, "alternative");
                    int iM14108v5 = AbstractC3122is.m14108v(ik8VarMo2873e0, "isPremium");
                    int iM14108v6 = AbstractC3122is.m14108v(ik8VarMo2873e0, "freeTrial");
                    int iM14108v7 = AbstractC3122is.m14108v(ik8VarMo2873e0, "priority");
                    int iM14108v8 = AbstractC3122is.m14108v(ik8VarMo2873e0, "accentCode");
                    int iM14108v9 = AbstractC3122is.m14108v(ik8VarMo2873e0, "isSelectable");
                    int iM14108v10 = AbstractC3122is.m14108v(ik8VarMo2873e0, "tags");
                    if (ik8VarMo2873e0.mo2876a0()) {
                        String strMo2875L = ik8VarMo2873e0.mo2875L(iM14108v);
                        String strMo2875L2 = ik8VarMo2873e0.mo2875L(iM14108v2);
                        String strMo2875L3 = ik8VarMo2873e0.mo2875L(iM14108v3);
                        qn3 qn3Var = zcaVar.f71371M;
                        List listM20065T = qn3Var.m20065T(strMo2875L3);
                        Integer numValueOf = ik8VarMo2873e0.isNull(iM14108v4) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(iM14108v4));
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        } else {
                            boolValueOf = null;
                        }
                        boolean z = ((int) ik8VarMo2873e0.getLong(iM14108v5)) != 0;
                        boolean z2 = ((int) ik8VarMo2873e0.getLong(iM14108v6)) != 0;
                        List listM20058M = qn3Var.m20058M(ik8VarMo2873e0.isNull(iM14108v7) ? null : ik8VarMo2873e0.mo2875L(iM14108v7));
                        if (listM20058M == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        String strMo2875L4 = ik8VarMo2873e0.isNull(iM14108v8) ? null : ik8VarMo2873e0.mo2875L(iM14108v8);
                        boolean z3 = ((int) ik8VarMo2873e0.getLong(iM14108v9)) != 0;
                        List listM20058M2 = qn3Var.m20058M(ik8VarMo2873e0.isNull(iM14108v10) ? null : ik8VarMo2873e0.mo2875L(iM14108v10));
                        if (listM20058M2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        textToSpeechVoice = new TextToSpeechVoice(boolValueOf, strMo2875L, strMo2875L2, strMo2875L4, listM20065T, listM20058M, listM20058M2, z, z2, z3);
                    } else {
                        textToSpeechVoice = null;
                    }
                    ik8VarMo2873e0.close();
                    return textToSpeechVoice;
                } catch (Throwable th) {
                    ik8VarMo2873e0.close();
                    throw th;
                }
            default:
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                ik8 ik8VarMo2873e1 = bk8Var2.mo2873e0("\n        SELECT DISTINCT TtsVoiceEntity.* FROM TtsVoiceEntity\n        INNER JOIN LanguageAndTtsVoicesJoin ON code = ?\n        WHERE TtsVoiceEntity.name = LanguageAndTtsVoicesJoin.name\n        AND TtsVoiceEntity.name = ?\n        LIMIT 1");
                try {
                    ik8VarMo2873e1.mo2874C(1, str2);
                    ik8VarMo2873e1.mo2874C(2, str);
                    int iM14108v11 = AbstractC3122is.m14108v(ik8VarMo2873e1, "name");
                    int iM14108v12 = AbstractC3122is.m14108v(ik8VarMo2873e1, "title");
                    int iM14108v13 = AbstractC3122is.m14108v(ik8VarMo2873e1, "voicesByApp");
                    int iM14108v14 = AbstractC3122is.m14108v(ik8VarMo2873e1, "alternative");
                    int iM14108v15 = AbstractC3122is.m14108v(ik8VarMo2873e1, "isPremium");
                    int iM14108v16 = AbstractC3122is.m14108v(ik8VarMo2873e1, "freeTrial");
                    int iM14108v17 = AbstractC3122is.m14108v(ik8VarMo2873e1, "priority");
                    int iM14108v18 = AbstractC3122is.m14108v(ik8VarMo2873e1, "accentCode");
                    int iM14108v19 = AbstractC3122is.m14108v(ik8VarMo2873e1, "isSelectable");
                    int iM14108v20 = AbstractC3122is.m14108v(ik8VarMo2873e1, "tags");
                    if (ik8VarMo2873e1.mo2876a0()) {
                        String strMo2875L5 = ik8VarMo2873e1.mo2875L(iM14108v11);
                        String strMo2875L6 = ik8VarMo2873e1.mo2875L(iM14108v12);
                        String strMo2875L7 = ik8VarMo2873e1.mo2875L(iM14108v13);
                        qn3 qn3Var2 = zcaVar.f71371M;
                        List listM20065T2 = qn3Var2.m20065T(strMo2875L7);
                        Integer numValueOf2 = ik8VarMo2873e1.isNull(iM14108v14) ? null : Integer.valueOf((int) ik8VarMo2873e1.getLong(iM14108v14));
                        if (numValueOf2 != null) {
                            boolValueOf2 = Boolean.valueOf(numValueOf2.intValue() != 0);
                        } else {
                            boolValueOf2 = null;
                        }
                        boolean z4 = ((int) ik8VarMo2873e1.getLong(iM14108v15)) != 0;
                        boolean z5 = ((int) ik8VarMo2873e1.getLong(iM14108v16)) != 0;
                        List listM20058M3 = qn3Var2.m20058M(ik8VarMo2873e1.isNull(iM14108v17) ? null : ik8VarMo2873e1.mo2875L(iM14108v17));
                        if (listM20058M3 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        String strMo2875L8 = ik8VarMo2873e1.isNull(iM14108v18) ? null : ik8VarMo2873e1.mo2875L(iM14108v18);
                        boolean z6 = ((int) ik8VarMo2873e1.getLong(iM14108v19)) != 0;
                        List listM20058M4 = qn3Var2.m20058M(ik8VarMo2873e1.isNull(iM14108v20) ? null : ik8VarMo2873e1.mo2875L(iM14108v20));
                        if (listM20058M4 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        textToSpeechVoice2 = new TextToSpeechVoice(boolValueOf2, strMo2875L5, strMo2875L6, strMo2875L8, listM20065T2, listM20058M3, listM20058M4, z4, z5, z6);
                    } else {
                        textToSpeechVoice2 = null;
                    }
                    ik8VarMo2873e1.close();
                    return textToSpeechVoice2;
                } catch (Throwable th2) {
                    ik8VarMo2873e1.close();
                    throw th2;
                }
        }
    }
}
