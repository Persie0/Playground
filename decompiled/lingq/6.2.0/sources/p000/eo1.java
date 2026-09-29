package p000;

import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.feature.vocabulary.state.C2862d;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class eo1 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37593a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f37594b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f37595c;

    public /* synthetic */ eo1(vi3 vi3Var, int i) {
        this.f37593a = 1;
        this.f37595c = vi3Var;
        this.f37594b = i;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        u85 u85Var;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        int i = this.f37593a;
        Object obj2 = this.f37595c;
        int i2 = this.f37594b;
        switch (i) {
            case 0:
                qn3 qn3Var = ((io1) obj2).f44345M;
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT * FROM LibraryDataEntity WHERE id = ? AND type = 'collection'");
                try {
                    ik8VarMo2873e0.mo2878j(1, i2);
                    int iM14108v = AbstractC3122is.m14108v(ik8VarMo2873e0, "id");
                    int iM14108v2 = AbstractC3122is.m14108v(ik8VarMo2873e0, "type");
                    int iM14108v3 = AbstractC3122is.m14108v(ik8VarMo2873e0, "title");
                    int iM14108v4 = AbstractC3122is.m14108v(ik8VarMo2873e0, "description");
                    int iM14108v5 = AbstractC3122is.m14108v(ik8VarMo2873e0, "pos");
                    int iM14108v6 = AbstractC3122is.m14108v(ik8VarMo2873e0, "url");
                    int iM14108v7 = AbstractC3122is.m14108v(ik8VarMo2873e0, "sourceType");
                    int iM14108v8 = AbstractC3122is.m14108v(ik8VarMo2873e0, "sourceName");
                    int iM14108v9 = AbstractC3122is.m14108v(ik8VarMo2873e0, "sourceUrl");
                    int iM14108v10 = AbstractC3122is.m14108v(ik8VarMo2873e0, "imageUrl");
                    int iM14108v11 = AbstractC3122is.m14108v(ik8VarMo2873e0, "providerId");
                    int iM14108v12 = AbstractC3122is.m14108v(ik8VarMo2873e0, "providerName");
                    int iM14108v13 = AbstractC3122is.m14108v(ik8VarMo2873e0, "providerDescription");
                    int iM14108v14 = AbstractC3122is.m14108v(ik8VarMo2873e0, "originalImageUrl");
                    int iM14108v15 = AbstractC3122is.m14108v(ik8VarMo2873e0, "providerImageUrl");
                    int iM14108v16 = AbstractC3122is.m14108v(ik8VarMo2873e0, "sharedById");
                    int iM14108v17 = AbstractC3122is.m14108v(ik8VarMo2873e0, "sharedByName");
                    int iM14108v18 = AbstractC3122is.m14108v(ik8VarMo2873e0, "sharedByImageUrl");
                    int iM14108v19 = AbstractC3122is.m14108v(ik8VarMo2873e0, "sharedByRole");
                    int iM14108v20 = AbstractC3122is.m14108v(ik8VarMo2873e0, "level");
                    int iM14108v21 = AbstractC3122is.m14108v(ik8VarMo2873e0, "newWordsCount");
                    int iM14108v22 = AbstractC3122is.m14108v(ik8VarMo2873e0, "lessonsCount");
                    int iM14108v23 = AbstractC3122is.m14108v(ik8VarMo2873e0, "owner");
                    int iM14108v24 = AbstractC3122is.m14108v(ik8VarMo2873e0, "price");
                    int iM14108v25 = AbstractC3122is.m14108v(ik8VarMo2873e0, "cardsCount");
                    int iM14108v26 = AbstractC3122is.m14108v(ik8VarMo2873e0, "rosesCount");
                    int iM14108v27 = AbstractC3122is.m14108v(ik8VarMo2873e0, "duration");
                    int iM14108v28 = AbstractC3122is.m14108v(ik8VarMo2873e0, "collectionId");
                    int iM14108v29 = AbstractC3122is.m14108v(ik8VarMo2873e0, "collectionTitle");
                    int iM14108v30 = AbstractC3122is.m14108v(ik8VarMo2873e0, "difficulty");
                    int iM14108v31 = AbstractC3122is.m14108v(ik8VarMo2873e0, "isAvailable");
                    int iM14108v32 = AbstractC3122is.m14108v(ik8VarMo2873e0, "tags");
                    int iM14108v33 = AbstractC3122is.m14108v(ik8VarMo2873e0, "status");
                    int iM14108v34 = AbstractC3122is.m14108v(ik8VarMo2873e0, "folders");
                    int iM14108v35 = AbstractC3122is.m14108v(ik8VarMo2873e0, "progress");
                    int iM14108v36 = AbstractC3122is.m14108v(ik8VarMo2873e0, "isTaken");
                    int iM14108v37 = AbstractC3122is.m14108v(ik8VarMo2873e0, "lessonPreview");
                    int iM14108v38 = AbstractC3122is.m14108v(ik8VarMo2873e0, "accent");
                    int iM14108v39 = AbstractC3122is.m14108v(ik8VarMo2873e0, "audioUrl");
                    int iM14108v40 = AbstractC3122is.m14108v(ik8VarMo2873e0, "listenTimes");
                    int iM14108v41 = AbstractC3122is.m14108v(ik8VarMo2873e0, "readTimes");
                    int iM14108v42 = AbstractC3122is.m14108v(ik8VarMo2873e0, "isCompleted");
                    int iM14108v43 = AbstractC3122is.m14108v(ik8VarMo2873e0, "isFavorite");
                    int iM14108v44 = AbstractC3122is.m14108v(ik8VarMo2873e0, "videoUrl");
                    int iM14108v45 = AbstractC3122is.m14108v(ik8VarMo2873e0, "isLocked");
                    int iM14108v46 = AbstractC3122is.m14108v(ik8VarMo2873e0, "lessonsSortBy");
                    int iM14108v47 = AbstractC3122is.m14108v(ik8VarMo2873e0, "isSubscribed");
                    int iM14108v48 = AbstractC3122is.m14108v(ik8VarMo2873e0, "originalUrl");
                    int iM14108v49 = AbstractC3122is.m14108v(ik8VarMo2873e0, "isArchived");
                    if (ik8VarMo2873e0.mo2876a0()) {
                        int i3 = (int) ik8VarMo2873e0.getLong(iM14108v);
                        String strMo2875L = ik8VarMo2873e0.mo2875L(iM14108v2);
                        String strMo2875L2 = ik8VarMo2873e0.isNull(iM14108v3) ? null : ik8VarMo2873e0.mo2875L(iM14108v3);
                        String strMo2875L3 = ik8VarMo2873e0.isNull(iM14108v4) ? null : ik8VarMo2873e0.mo2875L(iM14108v4);
                        int i4 = (int) ik8VarMo2873e0.getLong(iM14108v5);
                        String strMo2875L4 = ik8VarMo2873e0.isNull(iM14108v6) ? null : ik8VarMo2873e0.mo2875L(iM14108v6);
                        String strMo2875L5 = ik8VarMo2873e0.isNull(iM14108v7) ? null : ik8VarMo2873e0.mo2875L(iM14108v7);
                        String strMo2875L6 = ik8VarMo2873e0.isNull(iM14108v8) ? null : ik8VarMo2873e0.mo2875L(iM14108v8);
                        String strMo2875L7 = ik8VarMo2873e0.isNull(iM14108v9) ? null : ik8VarMo2873e0.mo2875L(iM14108v9);
                        String strMo2875L8 = ik8VarMo2873e0.isNull(iM14108v10) ? null : ik8VarMo2873e0.mo2875L(iM14108v10);
                        Integer numValueOf = ik8VarMo2873e0.isNull(iM14108v11) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(iM14108v11));
                        String strMo2875L9 = ik8VarMo2873e0.isNull(iM14108v12) ? null : ik8VarMo2873e0.mo2875L(iM14108v12);
                        String strMo2875L10 = ik8VarMo2873e0.isNull(iM14108v13) ? null : ik8VarMo2873e0.mo2875L(iM14108v13);
                        String strMo2875L11 = ik8VarMo2873e0.isNull(iM14108v14) ? null : ik8VarMo2873e0.mo2875L(iM14108v14);
                        String strMo2875L12 = ik8VarMo2873e0.isNull(iM14108v15) ? null : ik8VarMo2873e0.mo2875L(iM14108v15);
                        String strMo2875L13 = ik8VarMo2873e0.isNull(iM14108v16) ? null : ik8VarMo2873e0.mo2875L(iM14108v16);
                        String strMo2875L14 = ik8VarMo2873e0.isNull(iM14108v17) ? null : ik8VarMo2873e0.mo2875L(iM14108v17);
                        String strMo2875L15 = ik8VarMo2873e0.isNull(iM14108v18) ? null : ik8VarMo2873e0.mo2875L(iM14108v18);
                        String strMo2875L16 = ik8VarMo2873e0.isNull(iM14108v19) ? null : ik8VarMo2873e0.mo2875L(iM14108v19);
                        String strMo2875L17 = ik8VarMo2873e0.isNull(iM14108v20) ? null : ik8VarMo2873e0.mo2875L(iM14108v20);
                        int i5 = (int) ik8VarMo2873e0.getLong(iM14108v21);
                        int i6 = (int) ik8VarMo2873e0.getLong(iM14108v22);
                        String strMo2875L18 = ik8VarMo2873e0.isNull(iM14108v23) ? null : ik8VarMo2873e0.mo2875L(iM14108v23);
                        int i7 = (int) ik8VarMo2873e0.getLong(iM14108v24);
                        int i8 = (int) ik8VarMo2873e0.getLong(iM14108v25);
                        int i9 = (int) ik8VarMo2873e0.getLong(iM14108v26);
                        Integer numValueOf2 = ik8VarMo2873e0.isNull(iM14108v27) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(iM14108v27));
                        Integer numValueOf3 = ik8VarMo2873e0.isNull(iM14108v28) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(iM14108v28));
                        String strMo2875L19 = ik8VarMo2873e0.isNull(iM14108v29) ? null : ik8VarMo2873e0.mo2875L(iM14108v29);
                        double d = ik8VarMo2873e0.getDouble(iM14108v30);
                        boolean z = ((int) ik8VarMo2873e0.getLong(iM14108v31)) != 0;
                        List listM20058M = qn3Var.m20058M(ik8VarMo2873e0.isNull(iM14108v32) ? null : ik8VarMo2873e0.mo2875L(iM14108v32));
                        String strMo2875L20 = ik8VarMo2873e0.isNull(iM14108v33) ? null : ik8VarMo2873e0.mo2875L(iM14108v33);
                        List listM20058M2 = qn3Var.m20058M(ik8VarMo2873e0.isNull(iM14108v34) ? null : ik8VarMo2873e0.mo2875L(iM14108v34));
                        Float fValueOf = ik8VarMo2873e0.isNull(iM14108v35) ? null : Float.valueOf((float) ik8VarMo2873e0.getDouble(iM14108v35));
                        Integer numValueOf4 = ik8VarMo2873e0.isNull(iM14108v36) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(iM14108v36));
                        if (numValueOf4 != null) {
                            boolValueOf = Boolean.valueOf(numValueOf4.intValue() != 0);
                        } else {
                            boolValueOf = null;
                        }
                        String strMo2875L21 = ik8VarMo2873e0.mo2875L(iM14108v37);
                        String strMo2875L22 = ik8VarMo2873e0.isNull(iM14108v38) ? null : ik8VarMo2873e0.mo2875L(iM14108v38);
                        String strMo2875L23 = ik8VarMo2873e0.isNull(iM14108v39) ? null : ik8VarMo2873e0.mo2875L(iM14108v39);
                        double d2 = ik8VarMo2873e0.getDouble(iM14108v40);
                        double d3 = ik8VarMo2873e0.getDouble(iM14108v41);
                        boolean z2 = ((int) ik8VarMo2873e0.getLong(iM14108v42)) != 0;
                        boolean z3 = ((int) ik8VarMo2873e0.getLong(iM14108v43)) != 0;
                        String strMo2875L24 = ik8VarMo2873e0.isNull(iM14108v44) ? null : ik8VarMo2873e0.mo2875L(iM14108v44);
                        String strMo2875L25 = ik8VarMo2873e0.isNull(iM14108v45) ? null : ik8VarMo2873e0.mo2875L(iM14108v45);
                        String strMo2875L26 = ik8VarMo2873e0.isNull(iM14108v46) ? null : ik8VarMo2873e0.mo2875L(iM14108v46);
                        Integer numValueOf5 = ik8VarMo2873e0.isNull(iM14108v47) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(iM14108v47));
                        if (numValueOf5 != null) {
                            boolValueOf2 = Boolean.valueOf(numValueOf5.intValue() != 0);
                        } else {
                            boolValueOf2 = null;
                        }
                        u85Var = new u85(i3, strMo2875L, strMo2875L2, strMo2875L3, i4, strMo2875L4, strMo2875L5, strMo2875L6, strMo2875L7, strMo2875L8, numValueOf, strMo2875L9, strMo2875L10, strMo2875L11, strMo2875L12, strMo2875L13, strMo2875L14, strMo2875L15, strMo2875L16, strMo2875L17, i5, i6, strMo2875L18, i7, i8, i9, numValueOf2, numValueOf3, strMo2875L19, d, z, listM20058M, strMo2875L20, listM20058M2, fValueOf, boolValueOf, strMo2875L21, strMo2875L22, strMo2875L23, d2, d3, z2, z3, strMo2875L24, strMo2875L25, strMo2875L26, boolValueOf2, ik8VarMo2873e0.isNull(iM14108v48) ? null : ik8VarMo2873e0.mo2875L(iM14108v48), ((int) ik8VarMo2873e0.getLong(iM14108v49)) != 0);
                    } else {
                        u85Var = null;
                    }
                    return u85Var;
                } finally {
                    ik8VarMo2873e0.close();
                }
            case 1:
                TokenMeaning tokenMeaning = (TokenMeaning) obj;
                tokenMeaning.getClass();
                ((vi3) obj2).invoke(new u2a(tokenMeaning, i2));
                return xfa.f68157a;
            case 2:
                n1b n1bVar = (n1b) obj;
                return n1b.m17171a(n1bVar, null, zza.m25902a(n1bVar.f52192b, null, null, ((C2862d) obj2).f33812r, 3), null, r0b.m20229a(n1bVar.f52194d, 0, i2, 29), null, false, false, false, false, null, null, 2037);
            default:
                o7b o7bVar = (o7b) obj2;
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                ik8 ik8VarMo2873e1 = bk8Var2.mo2873e0("SELECT `termWithLanguage`, `term`, `id`, `status`, `importance`, `isPhrase`, `meanings`, `tags`, `gTags`, `romaji`, `hiragana`, `pinyin`, `hant`, `hans`, `jyutping` FROM (SELECT DISTINCT WordEntity.* FROM WordEntity JOIN LessonsAndWordsJoin ON contentId = ? AND WordEntity.termWithLanguage = LessonsAndWordsJoin.termWithLanguage)");
                try {
                    ik8VarMo2873e1.mo2878j(1, i2);
                    int iM14108v50 = AbstractC3122is.m14108v(ik8VarMo2873e1, "termWithLanguage");
                    int iM14108v51 = AbstractC3122is.m14108v(ik8VarMo2873e1, "term");
                    int iM14108v52 = AbstractC3122is.m14108v(ik8VarMo2873e1, "id");
                    int iM14108v53 = AbstractC3122is.m14108v(ik8VarMo2873e1, "status");
                    int iM14108v54 = AbstractC3122is.m14108v(ik8VarMo2873e1, "importance");
                    int iM14108v55 = AbstractC3122is.m14108v(ik8VarMo2873e1, "isPhrase");
                    int iM14108v56 = AbstractC3122is.m14108v(ik8VarMo2873e1, "meanings");
                    int iM14108v57 = AbstractC3122is.m14108v(ik8VarMo2873e1, "tags");
                    int iM14108v58 = AbstractC3122is.m14108v(ik8VarMo2873e1, "gTags");
                    int iM14108v59 = AbstractC3122is.m14108v(ik8VarMo2873e1, "romaji");
                    int iM14108v60 = AbstractC3122is.m14108v(ik8VarMo2873e1, "hiragana");
                    int iM14108v61 = AbstractC3122is.m14108v(ik8VarMo2873e1, "pinyin");
                    int iM14108v62 = AbstractC3122is.m14108v(ik8VarMo2873e1, "hant");
                    int iM14108v63 = AbstractC3122is.m14108v(ik8VarMo2873e1, "hans");
                    int iM14108v64 = AbstractC3122is.m14108v(ik8VarMo2873e1, "jyutping");
                    ArrayList arrayList = new ArrayList();
                    while (ik8VarMo2873e1.mo2876a0()) {
                        String strMo2875L27 = ik8VarMo2873e1.mo2875L(iM14108v50);
                        String strMo2875L28 = ik8VarMo2873e1.mo2875L(iM14108v51);
                        ArrayList arrayList2 = arrayList;
                        int i10 = iM14108v62;
                        int i11 = (int) ik8VarMo2873e1.getLong(iM14108v52);
                        String strMo2875L29 = ik8VarMo2873e1.mo2875L(iM14108v53);
                        int i12 = iM14108v53;
                        int i13 = iM14108v52;
                        int i14 = (int) ik8VarMo2873e1.getLong(iM14108v54);
                        boolean z4 = ((int) ik8VarMo2873e1.getLong(iM14108v55)) != 0;
                        String strMo2875L30 = ik8VarMo2873e1.mo2875L(iM14108v56);
                        qn3 qn3Var2 = o7bVar.f53959M;
                        List listM20059N = qn3Var2.m20059N(strMo2875L30);
                        List listM20058M3 = qn3Var2.m20058M(ik8VarMo2873e1.isNull(iM14108v57) ? null : ik8VarMo2873e1.mo2875L(iM14108v57));
                        if (listM20058M3 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        List listM20058M4 = qn3Var2.m20058M(ik8VarMo2873e1.isNull(iM14108v58) ? null : ik8VarMo2873e1.mo2875L(iM14108v58));
                        if (listM20058M4 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        int i15 = iM14108v63;
                        iM14108v64 = iM14108v64;
                        arrayList2.add(new LessonWord(strMo2875L28, z4, listM20058M3, listM20058M4, strMo2875L27, listM20059N, i14, i11, strMo2875L29, qn3Var2.m20058M(ik8VarMo2873e1.isNull(iM14108v59) ? null : ik8VarMo2873e1.mo2875L(iM14108v59)), qn3Var2.m20058M(ik8VarMo2873e1.isNull(iM14108v60) ? null : ik8VarMo2873e1.mo2875L(iM14108v60)), qn3Var2.m20058M(ik8VarMo2873e1.isNull(iM14108v61) ? null : ik8VarMo2873e1.mo2875L(iM14108v61)), qn3Var2.m20058M(ik8VarMo2873e1.isNull(i10) ? null : ik8VarMo2873e1.mo2875L(i10)), qn3Var2.m20058M(ik8VarMo2873e1.isNull(i15) ? null : ik8VarMo2873e1.mo2875L(i15)), qn3Var2.m20058M(ik8VarMo2873e1.isNull(iM14108v64) ? null : ik8VarMo2873e1.mo2875L(iM14108v64))));
                        arrayList = arrayList2;
                        iM14108v52 = i13;
                        iM14108v50 = iM14108v50;
                        iM14108v62 = i10;
                        iM14108v63 = i15;
                        iM14108v53 = i12;
                    }
                    ArrayList arrayList3 = arrayList;
                    ik8VarMo2873e1.close();
                    return arrayList3;
                } catch (Throwable th) {
                    ik8VarMo2873e1.close();
                    throw th;
                }
        }
    }

    public /* synthetic */ eo1(int i, Object obj, int i2) {
        this.f37593a = i2;
        this.f37594b = i;
        this.f37595c = obj;
    }
}
