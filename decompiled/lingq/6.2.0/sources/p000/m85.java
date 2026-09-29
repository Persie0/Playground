package p000;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p002ui.layout.AbstractC0343j;
import com.lingq.core.database.dao.C1321i;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m85 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50751a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f50752b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f50753c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f50754d;

    public /* synthetic */ m85(rpa rpaVar, l87 l87Var, int i) {
        this.f50751a = 3;
        this.f50753c = rpaVar;
        this.f50754d = l87Var;
        this.f50752b = i;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        int i;
        String strMo2875L;
        int i2;
        String strMo2875L2;
        int i3;
        String str;
        int i4;
        String str2;
        int i5;
        String str3;
        int i6;
        String str4;
        int i7;
        String str5;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        jf1 jf1Var;
        long[] jArr;
        jf1 jf1Var2;
        long[] jArr2;
        int i8;
        int i9 = this.f50751a;
        xfa xfaVar = xfa.f68157a;
        int i10 = 0;
        int i11 = this.f50752b;
        Object obj2 = this.f50754d;
        Object obj3 = this.f50753c;
        switch (i9) {
            case 0:
                String str6 = (String) obj3;
                C1321i c1321i = (C1321i) obj2;
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("\n            SELECT DISTINCT LibraryDataEntity.* FROM LibraryDataEntity\n            INNER JOIN LibraryShelfAndContentJoin ON LibraryDataEntity.id = LibraryShelfAndContentJoin.id\n                AND LibraryDataEntity.type = LibraryShelfAndContentJoin.type\n            WHERE LibraryShelfAndContentJoin.codeWithLanguage = ?\n            ORDER BY LibraryShelfAndContentJoin.`order`ASC \n            LIMIT ?\n        ");
                try {
                    ik8VarMo2873e0.mo2874C(1, str6);
                    ik8VarMo2873e0.mo2878j(2, i11);
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
                    C1321i c1321i2 = c1321i;
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
                    ArrayList arrayList = new ArrayList();
                    while (ik8VarMo2873e0.mo2876a0()) {
                        int i12 = iM14108v13;
                        int i13 = iM14108v14;
                        int i14 = (int) ik8VarMo2873e0.getLong(iM14108v);
                        String strMo2875L3 = ik8VarMo2873e0.mo2875L(iM14108v2);
                        String strMo2875L4 = ik8VarMo2873e0.isNull(iM14108v3) ? null : ik8VarMo2873e0.mo2875L(iM14108v3);
                        String strMo2875L5 = ik8VarMo2873e0.isNull(iM14108v4) ? null : ik8VarMo2873e0.mo2875L(iM14108v4);
                        int i15 = (int) ik8VarMo2873e0.getLong(iM14108v5);
                        String strMo2875L6 = ik8VarMo2873e0.isNull(iM14108v6) ? null : ik8VarMo2873e0.mo2875L(iM14108v6);
                        String strMo2875L7 = ik8VarMo2873e0.isNull(iM14108v7) ? null : ik8VarMo2873e0.mo2875L(iM14108v7);
                        String strMo2875L8 = ik8VarMo2873e0.isNull(iM14108v8) ? null : ik8VarMo2873e0.mo2875L(iM14108v8);
                        String strMo2875L9 = ik8VarMo2873e0.isNull(iM14108v9) ? null : ik8VarMo2873e0.mo2875L(iM14108v9);
                        String strMo2875L10 = ik8VarMo2873e0.isNull(iM14108v10) ? null : ik8VarMo2873e0.mo2875L(iM14108v10);
                        Integer numValueOf = ik8VarMo2873e0.isNull(iM14108v11) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(iM14108v11));
                        String strMo2875L11 = ik8VarMo2873e0.isNull(iM14108v12) ? null : ik8VarMo2873e0.mo2875L(iM14108v12);
                        String strMo2875L12 = ik8VarMo2873e0.isNull(i12) ? null : ik8VarMo2873e0.mo2875L(i12);
                        if (ik8VarMo2873e0.isNull(i13)) {
                            i = iM14108v;
                            strMo2875L = null;
                        } else {
                            i = iM14108v;
                            strMo2875L = ik8VarMo2873e0.mo2875L(i13);
                        }
                        if (ik8VarMo2873e0.isNull(iM14108v15)) {
                            i2 = iM14108v16;
                            strMo2875L2 = null;
                        } else {
                            i2 = iM14108v16;
                            strMo2875L2 = ik8VarMo2873e0.mo2875L(iM14108v15);
                        }
                        if (ik8VarMo2873e0.isNull(i2)) {
                            i3 = iM14108v17;
                            str = null;
                        } else {
                            String strMo2875L13 = ik8VarMo2873e0.mo2875L(i2);
                            i3 = iM14108v17;
                            str = strMo2875L13;
                        }
                        if (ik8VarMo2873e0.isNull(i3)) {
                            i4 = iM14108v18;
                            str2 = null;
                        } else {
                            String strMo2875L14 = ik8VarMo2873e0.mo2875L(i3);
                            i4 = iM14108v18;
                            str2 = strMo2875L14;
                        }
                        if (ik8VarMo2873e0.isNull(i4)) {
                            i5 = iM14108v19;
                            str3 = null;
                        } else {
                            String strMo2875L15 = ik8VarMo2873e0.mo2875L(i4);
                            i5 = iM14108v19;
                            str3 = strMo2875L15;
                        }
                        if (ik8VarMo2873e0.isNull(i5)) {
                            i6 = iM14108v20;
                            str4 = null;
                        } else {
                            String strMo2875L16 = ik8VarMo2873e0.mo2875L(i5);
                            i6 = iM14108v20;
                            str4 = strMo2875L16;
                        }
                        if (ik8VarMo2873e0.isNull(i6)) {
                            i7 = iM14108v21;
                            str5 = null;
                        } else {
                            String strMo2875L17 = ik8VarMo2873e0.mo2875L(i6);
                            i7 = iM14108v21;
                            str5 = strMo2875L17;
                        }
                        int i16 = (int) ik8VarMo2873e0.getLong(i7);
                        int i17 = iM14108v2;
                        int i18 = iM14108v22;
                        int i19 = iM14108v3;
                        int i20 = (int) ik8VarMo2873e0.getLong(i18);
                        int i21 = iM14108v23;
                        String strMo2875L18 = ik8VarMo2873e0.isNull(i21) ? null : ik8VarMo2873e0.mo2875L(i21);
                        int i22 = iM14108v24;
                        int i23 = (int) ik8VarMo2873e0.getLong(i22);
                        int i24 = iM14108v25;
                        int i25 = (int) ik8VarMo2873e0.getLong(i24);
                        int i26 = iM14108v26;
                        int i27 = (int) ik8VarMo2873e0.getLong(i26);
                        int i28 = iM14108v27;
                        Integer numValueOf2 = ik8VarMo2873e0.isNull(i28) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(i28));
                        int i29 = iM14108v28;
                        Integer numValueOf3 = ik8VarMo2873e0.isNull(i29) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(i29));
                        int i30 = iM14108v29;
                        String strMo2875L19 = ik8VarMo2873e0.isNull(i30) ? null : ik8VarMo2873e0.mo2875L(i30);
                        int i31 = iM14108v30;
                        double d = ik8VarMo2873e0.getDouble(i31);
                        iM14108v29 = i30;
                        iM14108v30 = i31;
                        int i32 = iM14108v31;
                        boolean z = ((int) ik8VarMo2873e0.getLong(i32)) != 0;
                        int i33 = iM14108v32;
                        iM14108v31 = i32;
                        iM14108v32 = i33;
                        C1321i c1321i3 = c1321i2;
                        List listM20058M = c1321i3.f17038O.m20058M(ik8VarMo2873e0.isNull(i33) ? null : ik8VarMo2873e0.mo2875L(i33));
                        int i34 = iM14108v33;
                        String strMo2875L20 = ik8VarMo2873e0.isNull(i34) ? null : ik8VarMo2873e0.mo2875L(i34);
                        int i35 = iM14108v34;
                        List listM20058M2 = c1321i3.f17038O.m20058M(ik8VarMo2873e0.isNull(i35) ? null : ik8VarMo2873e0.mo2875L(i35));
                        int i36 = iM14108v35;
                        Float fValueOf = ik8VarMo2873e0.isNull(i36) ? null : Float.valueOf((float) ik8VarMo2873e0.getDouble(i36));
                        int i37 = iM14108v36;
                        Integer numValueOf4 = ik8VarMo2873e0.isNull(i37) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(i37));
                        if (numValueOf4 != null) {
                            boolValueOf = Boolean.valueOf(numValueOf4.intValue() != 0);
                        } else {
                            boolValueOf = null;
                        }
                        int i38 = iM14108v37;
                        String strMo2875L21 = ik8VarMo2873e0.mo2875L(i38);
                        int i39 = iM14108v38;
                        String strMo2875L22 = ik8VarMo2873e0.isNull(i39) ? null : ik8VarMo2873e0.mo2875L(i39);
                        int i40 = iM14108v39;
                        String strMo2875L23 = ik8VarMo2873e0.isNull(i40) ? null : ik8VarMo2873e0.mo2875L(i40);
                        iM14108v39 = i40;
                        int i41 = iM14108v40;
                        double d2 = ik8VarMo2873e0.getDouble(i41);
                        iM14108v40 = i41;
                        int i42 = iM14108v41;
                        double d3 = ik8VarMo2873e0.getDouble(i42);
                        iM14108v41 = i42;
                        int i43 = iM14108v42;
                        boolean z2 = ((int) ik8VarMo2873e0.getLong(i43)) != 0;
                        int i44 = iM14108v43;
                        boolean z3 = ((int) ik8VarMo2873e0.getLong(i44)) != 0;
                        int i45 = iM14108v44;
                        String strMo2875L24 = ik8VarMo2873e0.isNull(i45) ? null : ik8VarMo2873e0.mo2875L(i45);
                        int i46 = iM14108v45;
                        String strMo2875L25 = ik8VarMo2873e0.isNull(i46) ? null : ik8VarMo2873e0.mo2875L(i46);
                        int i47 = iM14108v46;
                        String strMo2875L26 = ik8VarMo2873e0.isNull(i47) ? null : ik8VarMo2873e0.mo2875L(i47);
                        iM14108v46 = i47;
                        int i48 = iM14108v47;
                        Integer numValueOf5 = ik8VarMo2873e0.isNull(i48) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(i48));
                        if (numValueOf5 != null) {
                            boolValueOf2 = Boolean.valueOf(numValueOf5.intValue() != 0);
                        } else {
                            boolValueOf2 = null;
                        }
                        int i49 = iM14108v48;
                        int i50 = iM14108v49;
                        arrayList.add(new u85(i14, strMo2875L3, strMo2875L4, strMo2875L5, i15, strMo2875L6, strMo2875L7, strMo2875L8, strMo2875L9, strMo2875L10, numValueOf, strMo2875L11, strMo2875L12, strMo2875L, strMo2875L2, str, str2, str3, str4, str5, i16, i20, strMo2875L18, i23, i25, i27, numValueOf2, numValueOf3, strMo2875L19, d, z, listM20058M, strMo2875L20, listM20058M2, fValueOf, boolValueOf, strMo2875L21, strMo2875L22, strMo2875L23, d2, d3, z2, z3, strMo2875L24, strMo2875L25, strMo2875L26, boolValueOf2, ik8VarMo2873e0.isNull(i49) ? null : ik8VarMo2873e0.mo2875L(i49), ((int) ik8VarMo2873e0.getLong(i50)) != 0));
                        iM14108v27 = i28;
                        c1321i2 = c1321i3;
                        iM14108v36 = i37;
                        iM14108v38 = i39;
                        iM14108v47 = i48;
                        iM14108v = i;
                        iM14108v15 = iM14108v15;
                        iM14108v16 = i2;
                        iM14108v17 = i3;
                        iM14108v18 = i4;
                        iM14108v19 = i5;
                        iM14108v20 = i6;
                        iM14108v21 = i7;
                        iM14108v23 = i21;
                        iM14108v25 = i24;
                        iM14108v26 = i26;
                        iM14108v34 = i35;
                        iM14108v33 = i34;
                        iM14108v49 = i50;
                        iM14108v3 = i19;
                        iM14108v22 = i18;
                        iM14108v24 = i22;
                        iM14108v28 = i29;
                        iM14108v35 = i36;
                        iM14108v37 = i38;
                        iM14108v42 = i43;
                        iM14108v43 = i44;
                        iM14108v44 = i45;
                        iM14108v45 = i46;
                        iM14108v13 = i12;
                        iM14108v14 = i13;
                        iM14108v48 = i49;
                        iM14108v2 = i17;
                        break;
                    }
                    return arrayList;
                } finally {
                    ik8VarMo2873e0.close();
                }
            case 1:
                x18 x18Var = (x18) obj3;
                d66 d66Var = (d66) obj2;
                jf1 jf1Var3 = (jf1) obj;
                if (x18Var.f67643e == i11 && fa4.m11650l(d66Var, x18Var.f67644f) && (jf1Var3 instanceof pf1)) {
                    long[] jArr3 = d66Var.f35034a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i51 = 0;
                        while (true) {
                            long j = jArr3[i51];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i52 = 8;
                                int i53 = 8 - ((~(i51 - length)) >>> 31);
                                int i54 = i10;
                                while (i54 < i53) {
                                    if ((255 & j) < 128) {
                                        int i55 = (i51 << 3) + i54;
                                        Object obj4 = d66Var.f35035b[i55];
                                        boolean z4 = d66Var.f35036c[i55] != i11;
                                        if (z4) {
                                            i8 = i52;
                                            pf1 pf1Var = (pf1) jf1Var3;
                                            jf1Var2 = jf1Var3;
                                            n66 n66Var = pf1Var.f56044g;
                                            fa4.m11632F(n66Var, obj4, x18Var);
                                            jArr2 = jArr3;
                                            if (obj4 instanceof gc2) {
                                                gc2 gc2Var = (gc2) obj4;
                                                if (!n66Var.m17251c(gc2Var)) {
                                                    fa4.m11633G(pf1Var.f56047j, gc2Var);
                                                }
                                                n66 n66Var2 = x18Var.f67645g;
                                                if (n66Var2 != null) {
                                                    n66Var2.m17259k(obj4);
                                                }
                                            }
                                        } else {
                                            jf1Var2 = jf1Var3;
                                            jArr2 = jArr3;
                                            i8 = i52;
                                        }
                                        if (z4) {
                                            d66Var.m10127f(i55);
                                        }
                                    } else {
                                        jf1Var2 = jf1Var3;
                                        jArr2 = jArr3;
                                        i8 = i52;
                                    }
                                    j >>= i8;
                                    i54++;
                                    i52 = i8;
                                    jf1Var3 = jf1Var2;
                                    jArr3 = jArr2;
                                }
                                jf1Var = jf1Var3;
                                jArr = jArr3;
                                if (i53 == i52) {
                                }
                            } else {
                                jf1Var = jf1Var3;
                                jArr = jArr3;
                            }
                            if (i51 != length) {
                                i51++;
                                jf1Var3 = jf1Var;
                                jArr3 = jArr;
                                i10 = 0;
                            }
                        }
                    }
                }
                return xfaVar;
            case 2:
                un8 un8Var = (un8) obj3;
                l87 l87Var = (l87) obj2;
                AbstractC0343j abstractC0343j = (AbstractC0343j) obj;
                int iM21222h = un8Var.f64111J.f70117a.m21222h();
                if (iM21222h < 0) {
                    iM21222h = 0;
                }
                if (iM21222h <= i11) {
                    i11 = iM21222h;
                }
                int i56 = -i11;
                boolean z5 = un8Var.f64112K;
                int i57 = z5 ? 0 : i56;
                int i58 = z5 ? i56 : 0;
                abstractC0343j.f4216a = true;
                AbstractC0343j.m1522l(abstractC0343j, l87Var, i57, i58, null, 12);
                abstractC0343j.f4216a = false;
                return xfaVar;
            default:
                rpa rpaVar = (rpa) obj3;
                l87 l87Var2 = (l87) obj2;
                AbstractC0343j abstractC0343j2 = (AbstractC0343j) obj;
                int i59 = rpaVar.f59691b;
                mv9 mv9Var = rpaVar.f59690a;
                n9a n9aVar = rpaVar.f59692c;
                sw9 sw9Var = (sw9) rpaVar.f59693d.mo0a();
                mv9Var.m17057a(Orientation.Vertical, AbstractC3423or.m18256h(abstractC0343j2, i59, n9aVar, sw9Var != null ? sw9Var.f61519a : null, false, l87Var2.f49301a), i11, l87Var2.f49302b);
                AbstractC0343j.m1521j(abstractC0343j2, l87Var2, 0, Math.round(-mv9Var.f51891a.m19861h()));
                return xfaVar;
        }
    }

    public /* synthetic */ m85(Object obj, int i, int i2, Object obj2) {
        this.f50751a = i2;
        this.f50753c = obj;
        this.f50752b = i;
        this.f50754d = obj2;
    }
}
