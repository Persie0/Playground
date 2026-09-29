package p000;

import com.lingq.core.database.entity.CardEntity;
import com.lingq.core.domain.model.lesson.LessonCard;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pn0 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56488a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f56489b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f56490c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ un0 f56491d;

    public /* synthetic */ pn0(String str, ArrayList arrayList, un0 un0Var, int i) {
        this.f56488a = i;
        this.f56489b = str;
        this.f56490c = arrayList;
        this.f56491d = un0Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        int i = this.f56488a;
        String str = "meaningTerms";
        un0 un0Var = this.f56491d;
        ArrayList arrayList = this.f56490c;
        String str2 = this.f56489b;
        switch (i) {
            case 0:
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0(str2);
                try {
                    Iterator it = arrayList.iterator();
                    int i2 = 1;
                    while (it.hasNext()) {
                        ik8VarMo2873e0.mo2874C(i2, (String) it.next());
                        i2++;
                        str = str;
                    }
                    String str3 = str;
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
                    int iM14108v14 = AbstractC3122is.m14108v(ik8VarMo2873e0, str3);
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
                    ArrayList arrayList2 = new ArrayList();
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
                        un0 un0Var2 = un0Var;
                        int i8 = iM14108v3;
                        qn3 qn3Var = un0Var2.f64104N;
                        List listM20059N = qn3Var.m20059N(strMo2875L9);
                        String strMo2875L10 = ik8VarMo2873e0.isNull(iM14108v14) ? null : ik8VarMo2873e0.mo2875L(iM14108v14);
                        int i9 = iM14108v15;
                        List listM20058M = qn3Var.m20058M(ik8VarMo2873e0.isNull(i9) ? null : ik8VarMo2873e0.mo2875L(i9));
                        if (listM20058M == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        iM14108v16 = iM14108v16;
                        List listM20058M2 = qn3Var.m20058M(ik8VarMo2873e0.isNull(iM14108v16) ? null : ik8VarMo2873e0.mo2875L(iM14108v16));
                        if (listM20058M2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        int i10 = iM14108v17;
                        List listM20058M3 = qn3Var.m20058M(ik8VarMo2873e0.isNull(i10) ? null : ik8VarMo2873e0.mo2875L(i10));
                        int i11 = iM14108v18;
                        String strMo2875L11 = ik8VarMo2873e0.isNull(i11) ? null : ik8VarMo2873e0.mo2875L(i11);
                        int i12 = iM14108v19;
                        String strMo2875L12 = ik8VarMo2873e0.isNull(i12) ? null : ik8VarMo2873e0.mo2875L(i12);
                        iM14108v18 = i11;
                        int i13 = iM14108v20;
                        String strMo2875L13 = ik8VarMo2873e0.isNull(i13) ? null : ik8VarMo2873e0.mo2875L(i13);
                        iM14108v20 = i13;
                        int i14 = iM14108v21;
                        String strMo2875L14 = ik8VarMo2873e0.isNull(i14) ? null : ik8VarMo2873e0.mo2875L(i14);
                        iM14108v21 = i14;
                        int i15 = iM14108v22;
                        String strMo2875L15 = ik8VarMo2873e0.isNull(i15) ? null : ik8VarMo2873e0.mo2875L(i15);
                        iM14108v22 = i15;
                        int i16 = iM14108v23;
                        String strMo2875L16 = ik8VarMo2873e0.isNull(i16) ? null : ik8VarMo2873e0.mo2875L(i16);
                        iM14108v23 = i16;
                        int i17 = iM14108v24;
                        String strMo2875L17 = ik8VarMo2873e0.isNull(i17) ? null : ik8VarMo2873e0.mo2875L(i17);
                        iM14108v24 = i17;
                        int i18 = iM14108v25;
                        String strMo2875L18 = ik8VarMo2873e0.isNull(i18) ? null : ik8VarMo2873e0.mo2875L(i18);
                        iM14108v25 = i18;
                        int i19 = iM14108v26;
                        String strMo2875L19 = ik8VarMo2873e0.isNull(i19) ? null : ik8VarMo2873e0.mo2875L(i19);
                        iM14108v26 = i19;
                        iM14108v15 = i9;
                        iM14108v19 = i12;
                        int i20 = iM14108v27;
                        int i21 = iM14108v28;
                        arrayList2.add(new LessonCard(i7, i5, i6, numValueOf, strMo2875L, strMo2875L2, strMo2875L4, strMo2875L3, strMo2875L5, strMo2875L6, strMo2875L7, strMo2875L8, strMo2875L10, strMo2875L11, strMo2875L12, strMo2875L13, strMo2875L14, strMo2875L15, strMo2875L16, strMo2875L17, strMo2875L18, strMo2875L19, ik8VarMo2873e0.isNull(i21) ? null : ik8VarMo2873e0.mo2875L(i21), listM20058M, listM20058M2, listM20059N, listM20058M3, ((int) ik8VarMo2873e0.getLong(i20)) != 0));
                        iM14108v27 = i20;
                        iM14108v28 = i21;
                        iM14108v3 = i8;
                        iM14108v = i3;
                        iM14108v2 = i4;
                        un0Var = un0Var2;
                        iM14108v17 = i10;
                    }
                    ik8VarMo2873e0.close();
                    return arrayList2;
                } catch (Throwable th) {
                    ik8VarMo2873e0.close();
                    throw th;
                }
            case 1:
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                ik8 ik8VarMo2873e1 = bk8Var2.mo2873e0(str2);
                try {
                    Iterator it2 = arrayList.iterator();
                    int i22 = 1;
                    while (it2.hasNext()) {
                        ik8VarMo2873e1.mo2874C(i22, (String) it2.next());
                        i22++;
                        str = str;
                    }
                    String str4 = str;
                    int iM14108v29 = AbstractC3122is.m14108v(ik8VarMo2873e1, "term");
                    int iM14108v30 = AbstractC3122is.m14108v(ik8VarMo2873e1, "termWithLanguage");
                    int iM14108v31 = AbstractC3122is.m14108v(ik8VarMo2873e1, "id");
                    int iM14108v32 = AbstractC3122is.m14108v(ik8VarMo2873e1, "url");
                    int iM14108v33 = AbstractC3122is.m14108v(ik8VarMo2873e1, "fragment");
                    int iM14108v34 = AbstractC3122is.m14108v(ik8VarMo2873e1, "status");
                    int iM14108v35 = AbstractC3122is.m14108v(ik8VarMo2873e1, "extendedStatus");
                    int iM14108v36 = AbstractC3122is.m14108v(ik8VarMo2873e1, "lastReviewedCorrect");
                    int iM14108v37 = AbstractC3122is.m14108v(ik8VarMo2873e1, "srsDueDate");
                    int iM14108v38 = AbstractC3122is.m14108v(ik8VarMo2873e1, "notes");
                    int iM14108v39 = AbstractC3122is.m14108v(ik8VarMo2873e1, "audio");
                    int iM14108v40 = AbstractC3122is.m14108v(ik8VarMo2873e1, "importance");
                    int iM14108v41 = AbstractC3122is.m14108v(ik8VarMo2873e1, "meanings");
                    int iM14108v42 = AbstractC3122is.m14108v(ik8VarMo2873e1, str4);
                    int iM14108v43 = AbstractC3122is.m14108v(ik8VarMo2873e1, "tags");
                    int iM14108v44 = AbstractC3122is.m14108v(ik8VarMo2873e1, "gTags");
                    int iM14108v45 = AbstractC3122is.m14108v(ik8VarMo2873e1, "words");
                    int iM14108v46 = AbstractC3122is.m14108v(ik8VarMo2873e1, "hiragana");
                    int iM14108v47 = AbstractC3122is.m14108v(ik8VarMo2873e1, "romaji");
                    int iM14108v48 = AbstractC3122is.m14108v(ik8VarMo2873e1, "pinyin");
                    int iM14108v49 = AbstractC3122is.m14108v(ik8VarMo2873e1, "hant");
                    int iM14108v50 = AbstractC3122is.m14108v(ik8VarMo2873e1, "hans");
                    int iM14108v51 = AbstractC3122is.m14108v(ik8VarMo2873e1, "jyutping");
                    int iM14108v52 = AbstractC3122is.m14108v(ik8VarMo2873e1, "chunk");
                    int iM14108v53 = AbstractC3122is.m14108v(ik8VarMo2873e1, "furigana");
                    int iM14108v54 = AbstractC3122is.m14108v(ik8VarMo2873e1, "latin");
                    int iM14108v55 = AbstractC3122is.m14108v(ik8VarMo2873e1, "isPhrase");
                    int iM14108v56 = AbstractC3122is.m14108v(ik8VarMo2873e1, "creationDate");
                    ArrayList arrayList3 = new ArrayList();
                    while (ik8VarMo2873e1.mo2876a0()) {
                        String strMo2875L20 = ik8VarMo2873e1.mo2875L(iM14108v29);
                        String strMo2875L21 = ik8VarMo2873e1.mo2875L(iM14108v30);
                        int i23 = iM14108v29;
                        int i24 = iM14108v30;
                        int i25 = (int) ik8VarMo2873e1.getLong(iM14108v31);
                        String strMo2875L22 = ik8VarMo2873e1.isNull(iM14108v32) ? null : ik8VarMo2873e1.mo2875L(iM14108v32);
                        String strMo2875L23 = ik8VarMo2873e1.isNull(iM14108v33) ? null : ik8VarMo2873e1.mo2875L(iM14108v33);
                        int i26 = (int) ik8VarMo2873e1.getLong(iM14108v34);
                        Integer numValueOf2 = ik8VarMo2873e1.isNull(iM14108v35) ? null : Integer.valueOf((int) ik8VarMo2873e1.getLong(iM14108v35));
                        String strMo2875L24 = ik8VarMo2873e1.isNull(iM14108v36) ? null : ik8VarMo2873e1.mo2875L(iM14108v36);
                        String strMo2875L25 = ik8VarMo2873e1.isNull(iM14108v37) ? null : ik8VarMo2873e1.mo2875L(iM14108v37);
                        String strMo2875L26 = ik8VarMo2873e1.isNull(iM14108v38) ? null : ik8VarMo2873e1.mo2875L(iM14108v38);
                        String strMo2875L27 = ik8VarMo2873e1.isNull(iM14108v39) ? null : ik8VarMo2873e1.mo2875L(iM14108v39);
                        int i27 = (int) ik8VarMo2873e1.getLong(iM14108v40);
                        String strMo2875L28 = ik8VarMo2873e1.mo2875L(iM14108v41);
                        int i28 = iM14108v32;
                        un0 un0Var3 = un0Var;
                        qn3 qn3Var2 = un0Var3.f64104N;
                        List listM20059N2 = qn3Var2.m20059N(strMo2875L28);
                        String strMo2875L29 = ik8VarMo2873e1.isNull(iM14108v42) ? null : ik8VarMo2873e1.mo2875L(iM14108v42);
                        iM14108v43 = iM14108v43;
                        List listM20058M4 = qn3Var2.m20058M(ik8VarMo2873e1.isNull(iM14108v43) ? null : ik8VarMo2873e1.mo2875L(iM14108v43));
                        if (listM20058M4 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        iM14108v44 = iM14108v44;
                        List listM20058M5 = qn3Var2.m20058M(ik8VarMo2873e1.isNull(iM14108v44) ? null : ik8VarMo2873e1.mo2875L(iM14108v44));
                        if (listM20058M5 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        int i29 = iM14108v45;
                        List listM20058M6 = qn3Var2.m20058M(ik8VarMo2873e1.isNull(i29) ? null : ik8VarMo2873e1.mo2875L(i29));
                        int i30 = iM14108v46;
                        String strMo2875L30 = ik8VarMo2873e1.isNull(i30) ? null : ik8VarMo2873e1.mo2875L(i30);
                        iM14108v47 = iM14108v47;
                        String strMo2875L31 = ik8VarMo2873e1.isNull(iM14108v47) ? null : ik8VarMo2873e1.mo2875L(iM14108v47);
                        iM14108v46 = i30;
                        int i31 = iM14108v48;
                        String strMo2875L32 = ik8VarMo2873e1.isNull(i31) ? null : ik8VarMo2873e1.mo2875L(i31);
                        iM14108v48 = i31;
                        int i32 = iM14108v49;
                        String strMo2875L33 = ik8VarMo2873e1.isNull(i32) ? null : ik8VarMo2873e1.mo2875L(i32);
                        iM14108v49 = i32;
                        int i33 = iM14108v50;
                        String strMo2875L34 = ik8VarMo2873e1.isNull(i33) ? null : ik8VarMo2873e1.mo2875L(i33);
                        iM14108v50 = i33;
                        int i34 = iM14108v51;
                        String strMo2875L35 = ik8VarMo2873e1.isNull(i34) ? null : ik8VarMo2873e1.mo2875L(i34);
                        iM14108v51 = i34;
                        int i35 = iM14108v52;
                        String strMo2875L36 = ik8VarMo2873e1.isNull(i35) ? null : ik8VarMo2873e1.mo2875L(i35);
                        iM14108v52 = i35;
                        int i36 = iM14108v53;
                        String strMo2875L37 = ik8VarMo2873e1.isNull(i36) ? null : ik8VarMo2873e1.mo2875L(i36);
                        iM14108v53 = i36;
                        iM14108v54 = iM14108v54;
                        int i37 = iM14108v56;
                        arrayList3.add(new LessonCard(i27, i25, i26, numValueOf2, strMo2875L20, strMo2875L21, strMo2875L23, strMo2875L22, strMo2875L24, strMo2875L25, strMo2875L26, strMo2875L27, strMo2875L29, strMo2875L30, strMo2875L31, strMo2875L32, strMo2875L33, strMo2875L34, strMo2875L35, strMo2875L36, strMo2875L37, ik8VarMo2873e1.isNull(iM14108v54) ? null : ik8VarMo2873e1.mo2875L(iM14108v54), ik8VarMo2873e1.isNull(i37) ? null : ik8VarMo2873e1.mo2875L(i37), listM20058M4, listM20058M5, listM20059N2, listM20058M6, ((int) ik8VarMo2873e1.getLong(iM14108v55)) != 0));
                        iM14108v55 = iM14108v55;
                        iM14108v56 = i37;
                        iM14108v31 = iM14108v31;
                        iM14108v45 = i29;
                        iM14108v29 = i23;
                        iM14108v30 = i24;
                        un0Var = un0Var3;
                        iM14108v32 = i28;
                    }
                    ik8VarMo2873e1.close();
                    return arrayList3;
                } catch (Throwable th2) {
                    ik8VarMo2873e1.close();
                    throw th2;
                }
            default:
                bk8 bk8Var3 = (bk8) obj;
                bk8Var3.getClass();
                ik8 ik8VarMo2873e2 = bk8Var3.mo2873e0(str2);
                try {
                    Iterator it3 = arrayList.iterator();
                    int i38 = 1;
                    while (it3.hasNext()) {
                        ik8VarMo2873e2.mo2874C(i38, (String) it3.next());
                        i38++;
                        str = str;
                    }
                    String str5 = str;
                    int iM14108v57 = AbstractC3122is.m14108v(ik8VarMo2873e2, "term");
                    int iM14108v58 = AbstractC3122is.m14108v(ik8VarMo2873e2, "termWithLanguage");
                    int iM14108v59 = AbstractC3122is.m14108v(ik8VarMo2873e2, "id");
                    int iM14108v60 = AbstractC3122is.m14108v(ik8VarMo2873e2, "url");
                    int iM14108v61 = AbstractC3122is.m14108v(ik8VarMo2873e2, "fragment");
                    int iM14108v62 = AbstractC3122is.m14108v(ik8VarMo2873e2, "status");
                    int iM14108v63 = AbstractC3122is.m14108v(ik8VarMo2873e2, "extendedStatus");
                    int iM14108v64 = AbstractC3122is.m14108v(ik8VarMo2873e2, "lastReviewedCorrect");
                    int iM14108v65 = AbstractC3122is.m14108v(ik8VarMo2873e2, "srsDueDate");
                    int iM14108v66 = AbstractC3122is.m14108v(ik8VarMo2873e2, "notes");
                    int iM14108v67 = AbstractC3122is.m14108v(ik8VarMo2873e2, "audio");
                    int iM14108v68 = AbstractC3122is.m14108v(ik8VarMo2873e2, "importance");
                    int iM14108v69 = AbstractC3122is.m14108v(ik8VarMo2873e2, "meanings");
                    int iM14108v70 = AbstractC3122is.m14108v(ik8VarMo2873e2, str5);
                    int iM14108v71 = AbstractC3122is.m14108v(ik8VarMo2873e2, "tags");
                    int iM14108v72 = AbstractC3122is.m14108v(ik8VarMo2873e2, "gTags");
                    int iM14108v73 = AbstractC3122is.m14108v(ik8VarMo2873e2, "words");
                    int iM14108v74 = AbstractC3122is.m14108v(ik8VarMo2873e2, "hiragana");
                    int iM14108v75 = AbstractC3122is.m14108v(ik8VarMo2873e2, "romaji");
                    int iM14108v76 = AbstractC3122is.m14108v(ik8VarMo2873e2, "pinyin");
                    int iM14108v77 = AbstractC3122is.m14108v(ik8VarMo2873e2, "hant");
                    int iM14108v78 = AbstractC3122is.m14108v(ik8VarMo2873e2, "hans");
                    int iM14108v79 = AbstractC3122is.m14108v(ik8VarMo2873e2, "jyutping");
                    int iM14108v80 = AbstractC3122is.m14108v(ik8VarMo2873e2, "chunk");
                    int iM14108v81 = AbstractC3122is.m14108v(ik8VarMo2873e2, "furigana");
                    int iM14108v82 = AbstractC3122is.m14108v(ik8VarMo2873e2, "latin");
                    int iM14108v83 = AbstractC3122is.m14108v(ik8VarMo2873e2, "isPhrase");
                    int iM14108v84 = AbstractC3122is.m14108v(ik8VarMo2873e2, "creationDate");
                    ArrayList arrayList4 = new ArrayList();
                    while (ik8VarMo2873e2.mo2876a0()) {
                        String strMo2875L38 = ik8VarMo2873e2.mo2875L(iM14108v57);
                        String strMo2875L39 = ik8VarMo2873e2.mo2875L(iM14108v58);
                        int i39 = iM14108v57;
                        int i40 = iM14108v58;
                        int i41 = (int) ik8VarMo2873e2.getLong(iM14108v59);
                        String strMo2875L40 = ik8VarMo2873e2.isNull(iM14108v60) ? null : ik8VarMo2873e2.mo2875L(iM14108v60);
                        String strMo2875L41 = ik8VarMo2873e2.isNull(iM14108v61) ? null : ik8VarMo2873e2.mo2875L(iM14108v61);
                        int i42 = (int) ik8VarMo2873e2.getLong(iM14108v62);
                        Integer numValueOf3 = ik8VarMo2873e2.isNull(iM14108v63) ? null : Integer.valueOf((int) ik8VarMo2873e2.getLong(iM14108v63));
                        String strMo2875L42 = ik8VarMo2873e2.isNull(iM14108v64) ? null : ik8VarMo2873e2.mo2875L(iM14108v64);
                        String strMo2875L43 = ik8VarMo2873e2.isNull(iM14108v65) ? null : ik8VarMo2873e2.mo2875L(iM14108v65);
                        String strMo2875L44 = ik8VarMo2873e2.isNull(iM14108v66) ? null : ik8VarMo2873e2.mo2875L(iM14108v66);
                        String strMo2875L45 = ik8VarMo2873e2.isNull(iM14108v67) ? null : ik8VarMo2873e2.mo2875L(iM14108v67);
                        int i43 = (int) ik8VarMo2873e2.getLong(iM14108v68);
                        String strMo2875L46 = ik8VarMo2873e2.mo2875L(iM14108v69);
                        int i44 = iM14108v60;
                        un0 un0Var4 = un0Var;
                        qn3 qn3Var3 = un0Var4.f64104N;
                        List listM20059N3 = qn3Var3.m20059N(strMo2875L46);
                        String strMo2875L47 = ik8VarMo2873e2.mo2875L(iM14108v70);
                        iM14108v71 = iM14108v71;
                        List listM20058M7 = qn3Var3.m20058M(ik8VarMo2873e2.isNull(iM14108v71) ? null : ik8VarMo2873e2.mo2875L(iM14108v71));
                        if (listM20058M7 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        iM14108v72 = iM14108v72;
                        List listM20058M8 = qn3Var3.m20058M(ik8VarMo2873e2.isNull(iM14108v72) ? null : ik8VarMo2873e2.mo2875L(iM14108v72));
                        if (listM20058M8 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        int i45 = iM14108v73;
                        List listM20058M9 = qn3Var3.m20058M(ik8VarMo2873e2.isNull(i45) ? null : ik8VarMo2873e2.mo2875L(i45));
                        if (listM20058M9 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        int i46 = iM14108v74;
                        String strMo2875L48 = ik8VarMo2873e2.isNull(i46) ? null : ik8VarMo2873e2.mo2875L(i46);
                        iM14108v75 = iM14108v75;
                        String strMo2875L49 = ik8VarMo2873e2.isNull(iM14108v75) ? null : ik8VarMo2873e2.mo2875L(iM14108v75);
                        iM14108v74 = i46;
                        int i47 = iM14108v76;
                        String strMo2875L50 = ik8VarMo2873e2.isNull(i47) ? null : ik8VarMo2873e2.mo2875L(i47);
                        iM14108v76 = i47;
                        int i48 = iM14108v77;
                        String strMo2875L51 = ik8VarMo2873e2.isNull(i48) ? null : ik8VarMo2873e2.mo2875L(i48);
                        iM14108v77 = i48;
                        int i49 = iM14108v78;
                        String strMo2875L52 = ik8VarMo2873e2.isNull(i49) ? null : ik8VarMo2873e2.mo2875L(i49);
                        iM14108v78 = i49;
                        int i50 = iM14108v79;
                        String strMo2875L53 = ik8VarMo2873e2.isNull(i50) ? null : ik8VarMo2873e2.mo2875L(i50);
                        iM14108v79 = i50;
                        int i51 = iM14108v80;
                        String strMo2875L54 = ik8VarMo2873e2.isNull(i51) ? null : ik8VarMo2873e2.mo2875L(i51);
                        iM14108v80 = i51;
                        int i52 = iM14108v81;
                        String strMo2875L55 = ik8VarMo2873e2.isNull(i52) ? null : ik8VarMo2873e2.mo2875L(i52);
                        iM14108v81 = i52;
                        iM14108v82 = iM14108v82;
                        int i53 = iM14108v84;
                        arrayList4.add(new CardEntity(i41, i42, i43, numValueOf3, strMo2875L38, strMo2875L39, strMo2875L40, strMo2875L41, strMo2875L42, strMo2875L43, strMo2875L44, strMo2875L45, strMo2875L47, strMo2875L48, strMo2875L49, strMo2875L50, strMo2875L51, strMo2875L52, strMo2875L53, strMo2875L54, strMo2875L55, ik8VarMo2873e2.isNull(iM14108v82) ? null : ik8VarMo2873e2.mo2875L(iM14108v82), ik8VarMo2873e2.isNull(i53) ? null : ik8VarMo2873e2.mo2875L(i53), listM20059N3, listM20058M7, listM20058M8, listM20058M9, ((int) ik8VarMo2873e2.getLong(iM14108v83)) != 0));
                        iM14108v83 = iM14108v83;
                        iM14108v84 = i53;
                        iM14108v59 = iM14108v59;
                        iM14108v73 = i45;
                        iM14108v57 = i39;
                        iM14108v58 = i40;
                        un0Var = un0Var4;
                        iM14108v60 = i44;
                    }
                    ik8VarMo2873e2.close();
                    return arrayList4;
                } catch (Throwable th3) {
                    ik8VarMo2873e2.close();
                    throw th3;
                }
        }
    }
}
