package p000;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.compose.runtime.internal.C0282a;
import androidx.work.WorkInfo$State;
import com.lingq.core.database.entity.CardEntity;
import com.lingq.core.database.entity.TranslationsEntity;
import com.lingq.core.database.entity.WordEntity;
import com.lingq.core.domain.model.lesson.TokenType;
import com.lingq.core.domain.model.token.TextToSpeechVoice;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.feature.imports.C2108e;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r3a implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58574a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f58575b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f58576c;

    public /* synthetic */ r3a(int i, Object obj, Object obj2) {
        this.f58574a = i;
        this.f58575b = obj;
        this.f58576c = obj2;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        Boolean boolValueOf;
        int i = this.f58574a;
        int i2 = 2;
        int i3 = 3;
        int i4 = 1;
        xfa xfaVar = xfa.f68157a;
        Object obj2 = this.f58576c;
        Object obj3 = this.f58575b;
        switch (i) {
            case 0:
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ((v3a) obj3).f64797b.m3841W(bk8Var, (TranslationsEntity) obj2);
                return xfaVar;
            case 1:
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                ((v3a) obj3).f64799d.m3841W(bk8Var2, (f4a) obj2);
                return xfaVar;
            case 2:
                bk8 bk8Var3 = (bk8) obj;
                bk8Var3.getClass();
                ((v3a) obj3).f64800e.m3841W(bk8Var3, (b5a) obj2);
                return xfaVar;
            case 3:
                TokenMeaning tokenMeaning = (TokenMeaning) obj3;
                vi3 vi3Var = (vi3) obj2;
                e28 e28Var = (e28) obj;
                e28Var.getClass();
                if (tokenMeaning.f19594a != -1) {
                    vi3Var.invoke(new f3a(e28Var, tokenMeaning));
                }
                return xfaVar;
            case 4:
                t66 t66Var = (t66) obj2;
                if (!((c7a) obj3).f9665b.m10800a(((gq6) obj).f41189a)) {
                    t66Var.setValue(Boolean.TRUE);
                }
                return xfaVar;
            case 5:
                Set set = (Set) obj3;
                vi3 vi3Var2 = (vi3) obj2;
                vu4 vu4Var = (vu4) obj;
                vu4Var.getClass();
                vu4.m23545g(vu4Var, null, lqc.f50019a, 3);
                vu4.m23545g(vu4Var, null, new C0282a(1278171227, true, new p7a(set, vi3Var2, 1)), 3);
                vu4.m23545g(vu4Var, null, lqc.f50020b, 3);
                vu4.m23545g(vu4Var, null, new C0282a(144347161, true, new p7a(set, vi3Var2, i2)), 3);
                vu4.m23545g(vu4Var, null, lqc.f50021c, 3);
                vu4.m23545g(vu4Var, null, new C0282a(-989476905, true, new p7a(set, vi3Var2, i3)), 3);
                return xfaVar;
            case 6:
                li3 li3Var = (li3) obj3;
                vi3 vi3Var3 = (vi3) obj2;
                vu4 vu4Var2 = (vu4) obj;
                vu4Var2.getClass();
                vu4.m23545g(vu4Var2, null, mqc.f51752a, 3);
                vu4.m23545g(vu4Var2, null, mqc.f51753b, 3);
                vu4.m23545g(vu4Var2, null, mqc.f51754c, 3);
                vu4.m23545g(vu4Var2, null, mqc.f51755d, 3);
                vu4.m23545g(vu4Var2, null, mqc.f51756e, 3);
                vu4.m23545g(vu4Var2, null, mqc.f51757f, 3);
                vu4.m23545g(vu4Var2, null, new C0282a(-1220362995, true, new gi3(li3Var, vi3Var3, i3)), 3);
                vu4.m23545g(vu4Var2, null, mqc.f51758g, 3);
                vu4.m23545g(vu4Var2, null, new C0282a(-356592881, true, new gi3(li3Var, vi3Var3, 1)), 3);
                vu4.m23545g(vu4Var2, null, mqc.f51759h, 3);
                return xfaVar;
            case 7:
                String str = (String) obj3;
                zca zcaVar = (zca) obj2;
                bk8 bk8Var4 = (bk8) obj;
                bk8Var4.getClass();
                ik8 ik8VarMo2873e0 = bk8Var4.mo2873e0("\n        SELECT DISTINCT TtsVoiceEntity.* FROM TtsVoiceEntity\n        INNER JOIN LanguageAndTtsVoicesJoin ON code = ?\n        WHERE TtsVoiceEntity.name = LanguageAndTtsVoicesJoin.name AND TtsVoiceEntity.alternative is NULL\n        ORDER BY voiceOrder ASC");
                try {
                    ik8VarMo2873e0.mo2874C(1, str);
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
                    ArrayList arrayList = new ArrayList();
                    while (ik8VarMo2873e0.mo2876a0()) {
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
                        arrayList.add(new TextToSpeechVoice(boolValueOf, strMo2875L, strMo2875L2, strMo2875L4, listM20065T, listM20058M, listM20058M2, z, z2, z3));
                        iM14108v2 = iM14108v2;
                        iM14108v3 = iM14108v3;
                    }
                    ik8VarMo2873e0.close();
                    return arrayList;
                } catch (Throwable th) {
                    ik8VarMo2873e0.close();
                    throw th;
                }
            case 8:
                bk8 bk8Var5 = (bk8) obj;
                bk8Var5.getClass();
                ((zca) obj3).f71372N.m3840V(bk8Var5, (List) obj2);
                return xfaVar;
            case 9:
                vi3 vi3Var4 = (vi3) obj3;
                C2108e c2108e = (C2108e) obj2;
                lla llaVar = (lla) obj;
                llaVar.getClass();
                if (llaVar.equals(kla.f47497a)) {
                    vi3Var4.invoke(tg6.f62255a);
                } else {
                    if (!llaVar.equals(jla.f45680a)) {
                        gm5.m12750e();
                        return null;
                    }
                    vi3Var4.invoke(new jh6(c2108e.f26160h.f8663a));
                }
                return xfaVar;
            case 10:
                bk8 bk8Var6 = (bk8) obj;
                bk8Var6.getClass();
                ((rxa) obj3).f60016N.m3840V(bk8Var6, (ArrayList) obj2);
                return xfaVar;
            case 11:
                String str2 = (String) obj3;
                rxa rxaVar = (rxa) obj2;
                bk8 bk8Var7 = (bk8) obj;
                bk8Var7.getClass();
                ik8 ik8VarMo2873e1 = bk8Var7.mo2873e0("SELECT * FROM CardEntity WHERE termWithLanguage LIKE ? || '\\_%' ESCAPE '\\'");
                try {
                    ik8VarMo2873e1.mo2874C(1, str2);
                    int iM14108v11 = AbstractC3122is.m14108v(ik8VarMo2873e1, "term");
                    int iM14108v12 = AbstractC3122is.m14108v(ik8VarMo2873e1, "termWithLanguage");
                    int iM14108v13 = AbstractC3122is.m14108v(ik8VarMo2873e1, "id");
                    int iM14108v14 = AbstractC3122is.m14108v(ik8VarMo2873e1, "url");
                    int iM14108v15 = AbstractC3122is.m14108v(ik8VarMo2873e1, "fragment");
                    int iM14108v16 = AbstractC3122is.m14108v(ik8VarMo2873e1, "status");
                    int iM14108v17 = AbstractC3122is.m14108v(ik8VarMo2873e1, "extendedStatus");
                    int iM14108v18 = AbstractC3122is.m14108v(ik8VarMo2873e1, "lastReviewedCorrect");
                    int iM14108v19 = AbstractC3122is.m14108v(ik8VarMo2873e1, "srsDueDate");
                    int iM14108v20 = AbstractC3122is.m14108v(ik8VarMo2873e1, "notes");
                    int iM14108v21 = AbstractC3122is.m14108v(ik8VarMo2873e1, "audio");
                    int iM14108v22 = AbstractC3122is.m14108v(ik8VarMo2873e1, "importance");
                    int iM14108v23 = AbstractC3122is.m14108v(ik8VarMo2873e1, "meanings");
                    rxa rxaVar2 = rxaVar;
                    int iM14108v24 = AbstractC3122is.m14108v(ik8VarMo2873e1, "meaningTerms");
                    int iM14108v25 = AbstractC3122is.m14108v(ik8VarMo2873e1, "tags");
                    int iM14108v26 = AbstractC3122is.m14108v(ik8VarMo2873e1, "gTags");
                    int iM14108v27 = AbstractC3122is.m14108v(ik8VarMo2873e1, "words");
                    int iM14108v28 = AbstractC3122is.m14108v(ik8VarMo2873e1, "hiragana");
                    int iM14108v29 = AbstractC3122is.m14108v(ik8VarMo2873e1, "romaji");
                    int iM14108v30 = AbstractC3122is.m14108v(ik8VarMo2873e1, "pinyin");
                    int iM14108v31 = AbstractC3122is.m14108v(ik8VarMo2873e1, "hant");
                    int iM14108v32 = AbstractC3122is.m14108v(ik8VarMo2873e1, "hans");
                    int iM14108v33 = AbstractC3122is.m14108v(ik8VarMo2873e1, "jyutping");
                    int iM14108v34 = AbstractC3122is.m14108v(ik8VarMo2873e1, "chunk");
                    int iM14108v35 = AbstractC3122is.m14108v(ik8VarMo2873e1, "furigana");
                    int iM14108v36 = AbstractC3122is.m14108v(ik8VarMo2873e1, "latin");
                    int iM14108v37 = AbstractC3122is.m14108v(ik8VarMo2873e1, "isPhrase");
                    int iM14108v38 = AbstractC3122is.m14108v(ik8VarMo2873e1, "creationDate");
                    ArrayList arrayList2 = new ArrayList();
                    while (ik8VarMo2873e1.mo2876a0()) {
                        String strMo2875L5 = ik8VarMo2873e1.mo2875L(iM14108v11);
                        String strMo2875L6 = ik8VarMo2873e1.mo2875L(iM14108v12);
                        ArrayList arrayList3 = arrayList2;
                        int i5 = iM14108v23;
                        int i6 = (int) ik8VarMo2873e1.getLong(iM14108v13);
                        String strMo2875L7 = ik8VarMo2873e1.isNull(iM14108v14) ? null : ik8VarMo2873e1.mo2875L(iM14108v14);
                        String strMo2875L8 = ik8VarMo2873e1.isNull(iM14108v15) ? null : ik8VarMo2873e1.mo2875L(iM14108v15);
                        int i7 = (int) ik8VarMo2873e1.getLong(iM14108v16);
                        Integer numValueOf2 = ik8VarMo2873e1.isNull(iM14108v17) ? null : Integer.valueOf((int) ik8VarMo2873e1.getLong(iM14108v17));
                        String strMo2875L9 = ik8VarMo2873e1.isNull(iM14108v18) ? null : ik8VarMo2873e1.mo2875L(iM14108v18);
                        String strMo2875L10 = ik8VarMo2873e1.isNull(iM14108v19) ? null : ik8VarMo2873e1.mo2875L(iM14108v19);
                        String strMo2875L11 = ik8VarMo2873e1.isNull(iM14108v20) ? null : ik8VarMo2873e1.mo2875L(iM14108v20);
                        String strMo2875L12 = ik8VarMo2873e1.isNull(iM14108v21) ? null : ik8VarMo2873e1.mo2875L(iM14108v21);
                        int i8 = (int) ik8VarMo2873e1.getLong(iM14108v22);
                        iM14108v23 = i5;
                        int i9 = iM14108v11;
                        String strMo2875L13 = ik8VarMo2873e1.mo2875L(iM14108v23);
                        int i10 = iM14108v20;
                        rxa rxaVar3 = rxaVar2;
                        qn3 qn3Var2 = rxaVar3.f60014L;
                        List listM20059N = qn3Var2.m20059N(strMo2875L13);
                        String strMo2875L14 = ik8VarMo2873e1.mo2875L(iM14108v24);
                        iM14108v25 = iM14108v25;
                        List listM20058M3 = qn3Var2.m20058M(ik8VarMo2873e1.isNull(iM14108v25) ? null : ik8VarMo2873e1.mo2875L(iM14108v25));
                        if (listM20058M3 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        int i11 = iM14108v26;
                        List listM20058M4 = qn3Var2.m20058M(ik8VarMo2873e1.isNull(i11) ? null : ik8VarMo2873e1.mo2875L(i11));
                        if (listM20058M4 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        iM14108v27 = iM14108v27;
                        List listM20058M5 = qn3Var2.m20058M(ik8VarMo2873e1.isNull(iM14108v27) ? null : ik8VarMo2873e1.mo2875L(iM14108v27));
                        if (listM20058M5 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        int i12 = iM14108v28;
                        String strMo2875L15 = ik8VarMo2873e1.isNull(i12) ? null : ik8VarMo2873e1.mo2875L(i12);
                        iM14108v29 = iM14108v29;
                        String strMo2875L16 = ik8VarMo2873e1.isNull(iM14108v29) ? null : ik8VarMo2873e1.mo2875L(iM14108v29);
                        iM14108v28 = i12;
                        int i13 = iM14108v30;
                        String strMo2875L17 = ik8VarMo2873e1.isNull(i13) ? null : ik8VarMo2873e1.mo2875L(i13);
                        iM14108v30 = i13;
                        int i14 = iM14108v31;
                        String strMo2875L18 = ik8VarMo2873e1.isNull(i14) ? null : ik8VarMo2873e1.mo2875L(i14);
                        iM14108v31 = i14;
                        int i15 = iM14108v32;
                        String strMo2875L19 = ik8VarMo2873e1.isNull(i15) ? null : ik8VarMo2873e1.mo2875L(i15);
                        iM14108v32 = i15;
                        int i16 = iM14108v33;
                        String strMo2875L20 = ik8VarMo2873e1.isNull(i16) ? null : ik8VarMo2873e1.mo2875L(i16);
                        iM14108v33 = i16;
                        int i17 = iM14108v34;
                        String strMo2875L21 = ik8VarMo2873e1.isNull(i17) ? null : ik8VarMo2873e1.mo2875L(i17);
                        iM14108v34 = i17;
                        int i18 = iM14108v35;
                        String strMo2875L22 = ik8VarMo2873e1.isNull(i18) ? null : ik8VarMo2873e1.mo2875L(i18);
                        iM14108v35 = i18;
                        iM14108v36 = iM14108v36;
                        String strMo2875L23 = ik8VarMo2873e1.isNull(iM14108v36) ? null : ik8VarMo2873e1.mo2875L(iM14108v36);
                        boolean z4 = ((int) ik8VarMo2873e1.getLong(iM14108v37)) != 0;
                        int i19 = iM14108v38;
                        iM14108v37 = iM14108v37;
                        arrayList3.add(new CardEntity(i6, i7, i8, numValueOf2, strMo2875L5, strMo2875L6, strMo2875L7, strMo2875L8, strMo2875L9, strMo2875L10, strMo2875L11, strMo2875L12, strMo2875L14, strMo2875L15, strMo2875L16, strMo2875L17, strMo2875L18, strMo2875L19, strMo2875L20, strMo2875L21, strMo2875L22, strMo2875L23, ik8VarMo2873e1.isNull(i19) ? null : ik8VarMo2873e1.mo2875L(i19), listM20059N, listM20058M3, listM20058M4, listM20058M5, z4));
                        iM14108v26 = i11;
                        rxaVar2 = rxaVar3;
                        arrayList2 = arrayList3;
                        iM14108v38 = i19;
                        iM14108v11 = i9;
                        iM14108v20 = i10;
                    }
                    ArrayList arrayList4 = arrayList2;
                    ik8VarMo2873e1.close();
                    return arrayList4;
                } catch (Throwable th2) {
                    ik8VarMo2873e1.close();
                    throw th2;
                }
            case 12:
                vu4 vu4Var3 = (vu4) obj;
                vu4Var3.getClass();
                List list = ((gza) obj3).f41577a;
                vu4Var3.m23547h(list.size(), null, new xf8(13, list), new C0282a(802480018, true, new df2(8, (vi3) obj2, list)));
                return xfaVar;
            case 13:
                vu4 vu4Var4 = (vu4) obj;
                vu4Var4.getClass();
                List list2 = ((g43) obj3).f40165b;
                vu4Var4.m23547h(list2.size(), null, new xf8(15, list2), new C0282a(802480018, true, new df2(9, (vi3) obj2, list2)));
                return xfaVar;
            case 14:
                r0b r0bVar = (r0b) obj3;
                vu4 vu4Var5 = (vu4) obj;
                vu4Var5.getClass();
                List listM22622n1 = u91.m22622n1(new i84(1, r0bVar.f58466b, 1));
                vu4Var5.m23547h(listM22622n1.size(), null, new xf8(17, listM22622n1), new C0282a(802480018, true, new ve0(listM22622n1, (vi3) obj2, r0bVar, 10)));
                return xfaVar;
            case 15:
                return n1b.m17171a((n1b) obj, null, null, null, null, null, false, false, false, false, new lxa((String) obj3, (TokenType) obj2), null, 1535);
            case 16:
                bk8 bk8Var8 = (bk8) obj;
                bk8Var8.getClass();
                ((o7b) obj3).f53958L.m21729K(bk8Var8, (p7b) obj2);
                return xfaVar;
            case 17:
                bk8 bk8Var9 = (bk8) obj;
                bk8Var9.getClass();
                return Long.valueOf(((o7b) obj3).f53960N.m3842X(bk8Var9, (WordEntity) obj2));
            case 18:
                bk8 bk8Var10 = (bk8) obj;
                bk8Var10.getClass();
                ((g8b) obj3).f40404b.m20400B(bk8Var10, (f8b) obj2);
                return xfaVar;
            case 19:
                WorkInfo$State workInfo$State = (WorkInfo$State) obj3;
                String str3 = (String) obj2;
                bk8 bk8Var11 = (bk8) obj;
                bk8Var11.getClass();
                ik8 ik8VarMo2873e2 = bk8Var11.mo2873e0("UPDATE workspec SET state=? WHERE id=?");
                try {
                    ik8VarMo2873e2.mo2878j(1, bcd.m3630l(workInfo$State));
                    ik8VarMo2873e2.mo2874C(2, str3);
                    ik8VarMo2873e2.mo2876a0();
                    return Integer.valueOf(AbstractC3489q9.m19787q(bk8Var11));
                } finally {
                    ik8VarMo2873e2.close();
                }
            case 20:
                sz1 sz1Var = (sz1) obj3;
                String str4 = (String) obj2;
                bk8 bk8Var12 = (bk8) obj;
                bk8Var12.getClass();
                ik8 ik8VarMo2873e3 = bk8Var12.mo2873e0("UPDATE workspec SET output=? WHERE id=?");
                try {
                    sz1 sz1Var2 = sz1.f61645b;
                    ik8VarMo2873e3.mo2879k(1, jad.m14369d(sz1Var));
                    ik8VarMo2873e3.mo2874C(2, str4);
                    ik8VarMo2873e3.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e3.close();
                }
            case 21:
                bk8 bk8Var13 = (bk8) obj;
                bk8Var13.getClass();
                ((w8b) obj3).f66538b.m20400B(bk8Var13, (v8b) obj2);
                return xfaVar;
            default:
                Context context = (Context) obj;
                context.getClass();
                WebView webView = new WebView(context);
                webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setDomStorageEnabled(true);
                webView.setWebChromeClient(new j3b(i4, (t66) obj3, (sc9) obj2));
                return webView;
        }
    }
}
