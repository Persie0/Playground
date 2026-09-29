package p000;

import com.lingq.core.database.dao.C1315c;
import com.lingq.core.database.dao.C1321i;
import com.lingq.core.database.entity.ChallengeRankingEntity;
import com.lingq.core.domain.model.challenge.ChallengeProfile;
import com.lingq.core.domain.model.chat.ChatMessagePhrases;
import com.lingq.core.domain.model.chat.ChatPhrase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vp0 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f65738a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f65739b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f65740c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f65741d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f65742e;

    public /* synthetic */ vp0(String str, int i, ArrayList arrayList, C1315c c1315c) {
        this.f65738a = 1;
        this.f65739b = str;
        this.f65740c = i;
        this.f65741d = arrayList;
        this.f65742e = c1315c;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        ChallengeProfile challengeProfile;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        int i = this.f65738a;
        int i2 = 2;
        Object obj2 = this.f65742e;
        int i3 = this.f65740c;
        Object obj3 = this.f65741d;
        Object obj4 = this.f65739b;
        switch (i) {
            case 0:
                String str = (String) obj4;
                String str2 = (String) obj3;
                yp0 yp0Var = (yp0) obj2;
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT * FROM ChallengeRankingEntity WHERE language = ? AND challengeCode = ? AND profile LIKE '%' ||? || '%'");
                try {
                    ik8VarMo2873e0.mo2874C(1, str);
                    ik8VarMo2873e0.mo2874C(2, str2);
                    ik8VarMo2873e0.mo2878j(3, i3);
                    int iM14108v = AbstractC3122is.m14108v(ik8VarMo2873e0, "challengeCode");
                    int iM14108v2 = AbstractC3122is.m14108v(ik8VarMo2873e0, "metric");
                    int iM14108v3 = AbstractC3122is.m14108v(ik8VarMo2873e0, "rank");
                    int iM14108v4 = AbstractC3122is.m14108v(ik8VarMo2873e0, "language");
                    int iM14108v5 = AbstractC3122is.m14108v(ik8VarMo2873e0, "profile");
                    int iM14108v6 = AbstractC3122is.m14108v(ik8VarMo2873e0, "score");
                    int iM14108v7 = AbstractC3122is.m14108v(ik8VarMo2873e0, "scoreBehindLeader");
                    int iM14108v8 = AbstractC3122is.m14108v(ik8VarMo2873e0, "isCompleted");
                    int iM14108v9 = AbstractC3122is.m14108v(ik8VarMo2873e0, "bookTitle");
                    int iM14108v10 = AbstractC3122is.m14108v(ik8VarMo2873e0, "bookLanguage");
                    ArrayList arrayList = new ArrayList();
                    while (ik8VarMo2873e0.mo2876a0()) {
                        String strMo2875L = ik8VarMo2873e0.mo2875L(iM14108v);
                        String strMo2875L2 = ik8VarMo2873e0.mo2875L(iM14108v2);
                        int i4 = (int) ik8VarMo2873e0.getLong(iM14108v3);
                        iM14108v4 = iM14108v4;
                        String strMo2875L3 = ik8VarMo2873e0.mo2875L(iM14108v4);
                        String strMo2875L4 = ik8VarMo2873e0.isNull(iM14108v5) ? null : ik8VarMo2873e0.mo2875L(iM14108v5);
                        qn3 qn3Var = yp0Var.f70237O;
                        if (strMo2875L4 != null) {
                            yf4 yf4Var = (yf4) qn3Var.f57974a;
                            yf4Var.getClass();
                            challengeProfile = (ChallengeProfile) yf4Var.m10321a(strMo2875L4, thb.m22059r(ChallengeProfile.Companion.serializer()));
                        } else {
                            qn3Var.getClass();
                            challengeProfile = null;
                        }
                        int i5 = iM14108v2;
                        arrayList.add(new ChallengeRankingEntity(strMo2875L, strMo2875L2, i4, strMo2875L3, challengeProfile, (int) ik8VarMo2873e0.getLong(iM14108v6), (int) ik8VarMo2873e0.getLong(iM14108v7), ((int) ik8VarMo2873e0.getLong(iM14108v8)) != 0, ik8VarMo2873e0.mo2875L(iM14108v9), ik8VarMo2873e0.mo2875L(iM14108v10)));
                        iM14108v2 = i5;
                        iM14108v = iM14108v;
                        break;
                    }
                    return arrayList;
                } finally {
                    ik8VarMo2873e0.close();
                }
            case 1:
                ArrayList arrayList2 = (ArrayList) obj3;
                C1315c c1315c = (C1315c) obj2;
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                ik8 ik8VarMo2873e1 = bk8Var2.mo2873e0((String) obj4);
                try {
                    ik8VarMo2873e1.mo2878j(1, i3);
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ik8VarMo2873e1.mo2878j(i2, ((Number) it.next()).intValue());
                        i2++;
                    }
                    int iM14108v11 = AbstractC3122is.m14108v(ik8VarMo2873e1, "chatId");
                    int iM14108v12 = AbstractC3122is.m14108v(ik8VarMo2873e1, "messageIndex");
                    int iM14108v13 = AbstractC3122is.m14108v(ik8VarMo2873e1, "phrases");
                    ArrayList arrayList3 = new ArrayList();
                    while (ik8VarMo2873e1.mo2876a0()) {
                        int i6 = (int) ik8VarMo2873e1.getLong(iM14108v11);
                        int i7 = (int) ik8VarMo2873e1.getLong(iM14108v12);
                        String strMo2875L5 = ik8VarMo2873e1.mo2875L(iM14108v13);
                        qn3 qn3Var2 = c1315c.f17003M;
                        qn3Var2.getClass();
                        strMo2875L5.getClass();
                        yf4 yf4Var2 = (yf4) qn3Var2.f57974a;
                        yf4Var2.getClass();
                        arrayList3.add(new ChatMessagePhrases(i6, i7, (List) yf4Var2.m10321a(strMo2875L5, new C2978ev(ChatPhrase.Companion.serializer()))));
                        break;
                    }
                    return arrayList3;
                } finally {
                    ik8VarMo2873e1.close();
                }
            case 2:
                qc9 qc9Var = (qc9) obj2;
                qc9Var.m19862i(((Float) obj).floatValue());
                ((vi3) obj4).invoke(((List) obj3).get(l70.m15945h((int) qc9Var.m19861h(), 0, i3)));
                return xfa.f68157a;
            default:
                String str3 = (String) obj4;
                String str4 = (String) obj3;
                C1321i c1321i = (C1321i) obj2;
                bk8 bk8Var3 = (bk8) obj;
                bk8Var3.getClass();
                ik8 ik8VarMo2873e2 = bk8Var3.mo2873e0("\n            SELECT DISTINCT LibraryDataEntity.* FROM LibraryDataEntity\n            INNER JOIN LibraryShelfAndContentJoin ON LibraryDataEntity.id = LibraryShelfAndContentJoin.id\n                AND LibraryDataEntity.type = LibraryShelfAndContentJoin.type\n            WHERE LibraryShelfAndContentJoin.codeWithLanguage = ? AND (LibraryShelfAndContentJoin.ofQuery = ? OR LibraryDataEntity.title LIKE ?)\n            ORDER BY LibraryShelfAndContentJoin.`order`ASC \n            LIMIT ?\n        ");
                try {
                    ik8VarMo2873e2.mo2874C(1, str3);
                    ik8VarMo2873e2.mo2874C(2, str4);
                    ik8VarMo2873e2.mo2874C(3, str4);
                    ik8VarMo2873e2.mo2878j(4, i3);
                    int iM14108v14 = AbstractC3122is.m14108v(ik8VarMo2873e2, "id");
                    int iM14108v15 = AbstractC3122is.m14108v(ik8VarMo2873e2, "type");
                    int iM14108v16 = AbstractC3122is.m14108v(ik8VarMo2873e2, "title");
                    int iM14108v17 = AbstractC3122is.m14108v(ik8VarMo2873e2, "description");
                    int iM14108v18 = AbstractC3122is.m14108v(ik8VarMo2873e2, "pos");
                    int iM14108v19 = AbstractC3122is.m14108v(ik8VarMo2873e2, "url");
                    int iM14108v20 = AbstractC3122is.m14108v(ik8VarMo2873e2, "sourceType");
                    int iM14108v21 = AbstractC3122is.m14108v(ik8VarMo2873e2, "sourceName");
                    int iM14108v22 = AbstractC3122is.m14108v(ik8VarMo2873e2, "sourceUrl");
                    int iM14108v23 = AbstractC3122is.m14108v(ik8VarMo2873e2, "imageUrl");
                    int iM14108v24 = AbstractC3122is.m14108v(ik8VarMo2873e2, "providerId");
                    int iM14108v25 = AbstractC3122is.m14108v(ik8VarMo2873e2, "providerName");
                    int iM14108v26 = AbstractC3122is.m14108v(ik8VarMo2873e2, "providerDescription");
                    C1321i c1321i2 = c1321i;
                    int iM14108v27 = AbstractC3122is.m14108v(ik8VarMo2873e2, "originalImageUrl");
                    int iM14108v28 = AbstractC3122is.m14108v(ik8VarMo2873e2, "providerImageUrl");
                    int iM14108v29 = AbstractC3122is.m14108v(ik8VarMo2873e2, "sharedById");
                    int iM14108v30 = AbstractC3122is.m14108v(ik8VarMo2873e2, "sharedByName");
                    int iM14108v31 = AbstractC3122is.m14108v(ik8VarMo2873e2, "sharedByImageUrl");
                    int iM14108v32 = AbstractC3122is.m14108v(ik8VarMo2873e2, "sharedByRole");
                    int iM14108v33 = AbstractC3122is.m14108v(ik8VarMo2873e2, "level");
                    int iM14108v34 = AbstractC3122is.m14108v(ik8VarMo2873e2, "newWordsCount");
                    int iM14108v35 = AbstractC3122is.m14108v(ik8VarMo2873e2, "lessonsCount");
                    int iM14108v36 = AbstractC3122is.m14108v(ik8VarMo2873e2, "owner");
                    int iM14108v37 = AbstractC3122is.m14108v(ik8VarMo2873e2, "price");
                    int iM14108v38 = AbstractC3122is.m14108v(ik8VarMo2873e2, "cardsCount");
                    int iM14108v39 = AbstractC3122is.m14108v(ik8VarMo2873e2, "rosesCount");
                    int iM14108v40 = AbstractC3122is.m14108v(ik8VarMo2873e2, "duration");
                    int iM14108v41 = AbstractC3122is.m14108v(ik8VarMo2873e2, "collectionId");
                    int iM14108v42 = AbstractC3122is.m14108v(ik8VarMo2873e2, "collectionTitle");
                    int iM14108v43 = AbstractC3122is.m14108v(ik8VarMo2873e2, "difficulty");
                    int iM14108v44 = AbstractC3122is.m14108v(ik8VarMo2873e2, "isAvailable");
                    int iM14108v45 = AbstractC3122is.m14108v(ik8VarMo2873e2, "tags");
                    int iM14108v46 = AbstractC3122is.m14108v(ik8VarMo2873e2, "status");
                    int iM14108v47 = AbstractC3122is.m14108v(ik8VarMo2873e2, "folders");
                    int iM14108v48 = AbstractC3122is.m14108v(ik8VarMo2873e2, "progress");
                    int iM14108v49 = AbstractC3122is.m14108v(ik8VarMo2873e2, "isTaken");
                    int iM14108v50 = AbstractC3122is.m14108v(ik8VarMo2873e2, "lessonPreview");
                    int iM14108v51 = AbstractC3122is.m14108v(ik8VarMo2873e2, "accent");
                    int iM14108v52 = AbstractC3122is.m14108v(ik8VarMo2873e2, "audioUrl");
                    int iM14108v53 = AbstractC3122is.m14108v(ik8VarMo2873e2, "listenTimes");
                    int iM14108v54 = AbstractC3122is.m14108v(ik8VarMo2873e2, "readTimes");
                    int iM14108v55 = AbstractC3122is.m14108v(ik8VarMo2873e2, "isCompleted");
                    int iM14108v56 = AbstractC3122is.m14108v(ik8VarMo2873e2, "isFavorite");
                    int iM14108v57 = AbstractC3122is.m14108v(ik8VarMo2873e2, "videoUrl");
                    int iM14108v58 = AbstractC3122is.m14108v(ik8VarMo2873e2, "isLocked");
                    int iM14108v59 = AbstractC3122is.m14108v(ik8VarMo2873e2, "lessonsSortBy");
                    int iM14108v60 = AbstractC3122is.m14108v(ik8VarMo2873e2, "isSubscribed");
                    int iM14108v61 = AbstractC3122is.m14108v(ik8VarMo2873e2, "originalUrl");
                    int iM14108v62 = AbstractC3122is.m14108v(ik8VarMo2873e2, "isArchived");
                    ArrayList arrayList4 = new ArrayList();
                    while (ik8VarMo2873e2.mo2876a0()) {
                        int i8 = iM14108v26;
                        int i9 = iM14108v54;
                        int i10 = (int) ik8VarMo2873e2.getLong(iM14108v14);
                        String strMo2875L6 = ik8VarMo2873e2.mo2875L(iM14108v15);
                        String strMo2875L7 = ik8VarMo2873e2.isNull(iM14108v16) ? null : ik8VarMo2873e2.mo2875L(iM14108v16);
                        String strMo2875L8 = ik8VarMo2873e2.isNull(iM14108v17) ? null : ik8VarMo2873e2.mo2875L(iM14108v17);
                        int i11 = (int) ik8VarMo2873e2.getLong(iM14108v18);
                        String strMo2875L9 = ik8VarMo2873e2.isNull(iM14108v19) ? null : ik8VarMo2873e2.mo2875L(iM14108v19);
                        String strMo2875L10 = ik8VarMo2873e2.isNull(iM14108v20) ? null : ik8VarMo2873e2.mo2875L(iM14108v20);
                        String strMo2875L11 = ik8VarMo2873e2.isNull(iM14108v21) ? null : ik8VarMo2873e2.mo2875L(iM14108v21);
                        String strMo2875L12 = ik8VarMo2873e2.isNull(iM14108v22) ? null : ik8VarMo2873e2.mo2875L(iM14108v22);
                        String strMo2875L13 = ik8VarMo2873e2.isNull(iM14108v23) ? null : ik8VarMo2873e2.mo2875L(iM14108v23);
                        Integer numValueOf = ik8VarMo2873e2.isNull(iM14108v24) ? null : Integer.valueOf((int) ik8VarMo2873e2.getLong(iM14108v24));
                        String strMo2875L14 = ik8VarMo2873e2.isNull(iM14108v25) ? null : ik8VarMo2873e2.mo2875L(iM14108v25);
                        iM14108v26 = i8;
                        String strMo2875L15 = ik8VarMo2873e2.isNull(iM14108v26) ? null : ik8VarMo2873e2.mo2875L(iM14108v26);
                        int i12 = iM14108v27;
                        String strMo2875L16 = ik8VarMo2873e2.isNull(i12) ? null : ik8VarMo2873e2.mo2875L(i12);
                        int i13 = iM14108v14;
                        int i14 = iM14108v28;
                        String strMo2875L17 = ik8VarMo2873e2.isNull(i14) ? null : ik8VarMo2873e2.mo2875L(i14);
                        iM14108v28 = i14;
                        int i15 = iM14108v29;
                        String strMo2875L18 = ik8VarMo2873e2.isNull(i15) ? null : ik8VarMo2873e2.mo2875L(i15);
                        iM14108v29 = i15;
                        int i16 = iM14108v30;
                        String strMo2875L19 = ik8VarMo2873e2.isNull(i16) ? null : ik8VarMo2873e2.mo2875L(i16);
                        iM14108v30 = i16;
                        int i17 = iM14108v31;
                        String strMo2875L20 = ik8VarMo2873e2.isNull(i17) ? null : ik8VarMo2873e2.mo2875L(i17);
                        iM14108v31 = i17;
                        int i18 = iM14108v32;
                        String strMo2875L21 = ik8VarMo2873e2.isNull(i18) ? null : ik8VarMo2873e2.mo2875L(i18);
                        iM14108v32 = i18;
                        iM14108v33 = iM14108v33;
                        String strMo2875L22 = ik8VarMo2873e2.isNull(iM14108v33) ? null : ik8VarMo2873e2.mo2875L(iM14108v33);
                        int i19 = iM14108v34;
                        int i20 = iM14108v15;
                        int i21 = (int) ik8VarMo2873e2.getLong(i19);
                        int i22 = iM14108v25;
                        int i23 = iM14108v35;
                        int i24 = iM14108v16;
                        int i25 = (int) ik8VarMo2873e2.getLong(i23);
                        int i26 = iM14108v36;
                        String strMo2875L23 = ik8VarMo2873e2.isNull(i26) ? null : ik8VarMo2873e2.mo2875L(i26);
                        int i27 = iM14108v37;
                        int i28 = (int) ik8VarMo2873e2.getLong(i27);
                        int i29 = iM14108v38;
                        int i30 = (int) ik8VarMo2873e2.getLong(i29);
                        int i31 = iM14108v39;
                        int i32 = (int) ik8VarMo2873e2.getLong(i31);
                        int i33 = iM14108v40;
                        Integer numValueOf2 = ik8VarMo2873e2.isNull(i33) ? null : Integer.valueOf((int) ik8VarMo2873e2.getLong(i33));
                        int i34 = iM14108v41;
                        Integer numValueOf3 = ik8VarMo2873e2.isNull(i34) ? null : Integer.valueOf((int) ik8VarMo2873e2.getLong(i34));
                        int i35 = iM14108v42;
                        String strMo2875L24 = ik8VarMo2873e2.isNull(i35) ? null : ik8VarMo2873e2.mo2875L(i35);
                        int i36 = iM14108v43;
                        double d = ik8VarMo2873e2.getDouble(i36);
                        iM14108v42 = i35;
                        iM14108v43 = i36;
                        int i37 = iM14108v44;
                        boolean z = ((int) ik8VarMo2873e2.getLong(i37)) != 0;
                        int i38 = iM14108v45;
                        iM14108v44 = i37;
                        iM14108v45 = i38;
                        C1321i c1321i3 = c1321i2;
                        List listM20058M = c1321i3.f17038O.m20058M(ik8VarMo2873e2.isNull(i38) ? null : ik8VarMo2873e2.mo2875L(i38));
                        int i39 = iM14108v46;
                        String strMo2875L25 = ik8VarMo2873e2.isNull(i39) ? null : ik8VarMo2873e2.mo2875L(i39);
                        int i40 = iM14108v47;
                        List listM20058M2 = c1321i3.f17038O.m20058M(ik8VarMo2873e2.isNull(i40) ? null : ik8VarMo2873e2.mo2875L(i40));
                        int i41 = iM14108v48;
                        Float fValueOf = ik8VarMo2873e2.isNull(i41) ? null : Float.valueOf((float) ik8VarMo2873e2.getDouble(i41));
                        int i42 = iM14108v49;
                        Integer numValueOf4 = ik8VarMo2873e2.isNull(i42) ? null : Integer.valueOf((int) ik8VarMo2873e2.getLong(i42));
                        if (numValueOf4 != null) {
                            boolValueOf = Boolean.valueOf(numValueOf4.intValue() != 0);
                        } else {
                            boolValueOf = null;
                        }
                        int i43 = iM14108v50;
                        String strMo2875L26 = ik8VarMo2873e2.mo2875L(i43);
                        int i44 = iM14108v51;
                        String strMo2875L27 = ik8VarMo2873e2.isNull(i44) ? null : ik8VarMo2873e2.mo2875L(i44);
                        int i45 = iM14108v52;
                        String strMo2875L28 = ik8VarMo2873e2.isNull(i45) ? null : ik8VarMo2873e2.mo2875L(i45);
                        iM14108v52 = i45;
                        int i46 = iM14108v53;
                        double d2 = ik8VarMo2873e2.getDouble(i46);
                        iM14108v53 = i46;
                        double d3 = ik8VarMo2873e2.getDouble(i9);
                        int i47 = iM14108v55;
                        boolean z2 = ((int) ik8VarMo2873e2.getLong(i47)) != 0;
                        int i48 = iM14108v56;
                        boolean z3 = ((int) ik8VarMo2873e2.getLong(i48)) != 0;
                        int i49 = iM14108v57;
                        String strMo2875L29 = ik8VarMo2873e2.isNull(i49) ? null : ik8VarMo2873e2.mo2875L(i49);
                        int i50 = iM14108v58;
                        String strMo2875L30 = ik8VarMo2873e2.isNull(i50) ? null : ik8VarMo2873e2.mo2875L(i50);
                        int i51 = iM14108v59;
                        String strMo2875L31 = ik8VarMo2873e2.isNull(i51) ? null : ik8VarMo2873e2.mo2875L(i51);
                        iM14108v59 = i51;
                        int i52 = iM14108v60;
                        Integer numValueOf5 = ik8VarMo2873e2.isNull(i52) ? null : Integer.valueOf((int) ik8VarMo2873e2.getLong(i52));
                        if (numValueOf5 != null) {
                            boolValueOf2 = Boolean.valueOf(numValueOf5.intValue() != 0);
                        } else {
                            boolValueOf2 = null;
                        }
                        int i53 = iM14108v61;
                        int i54 = iM14108v62;
                        arrayList4.add(new u85(i10, strMo2875L6, strMo2875L7, strMo2875L8, i11, strMo2875L9, strMo2875L10, strMo2875L11, strMo2875L12, strMo2875L13, numValueOf, strMo2875L14, strMo2875L15, strMo2875L16, strMo2875L17, strMo2875L18, strMo2875L19, strMo2875L20, strMo2875L21, strMo2875L22, i21, i25, strMo2875L23, i28, i30, i32, numValueOf2, numValueOf3, strMo2875L24, d, z, listM20058M, strMo2875L25, listM20058M2, fValueOf, boolValueOf, strMo2875L26, strMo2875L27, strMo2875L28, d2, d3, z2, z3, strMo2875L29, strMo2875L30, strMo2875L31, boolValueOf2, ik8VarMo2873e2.isNull(i53) ? null : ik8VarMo2873e2.mo2875L(i53), ((int) ik8VarMo2873e2.getLong(i54)) != 0));
                        iM14108v47 = i40;
                        iM14108v46 = i39;
                        iM14108v62 = i54;
                        iM14108v16 = i24;
                        iM14108v35 = i23;
                        iM14108v37 = i27;
                        iM14108v41 = i34;
                        iM14108v48 = i41;
                        iM14108v50 = i43;
                        iM14108v55 = i47;
                        iM14108v56 = i48;
                        iM14108v57 = i49;
                        iM14108v58 = i50;
                        iM14108v24 = iM14108v24;
                        iM14108v25 = i22;
                        iM14108v61 = i53;
                        iM14108v15 = i20;
                        iM14108v34 = i19;
                        iM14108v36 = i26;
                        iM14108v38 = i29;
                        iM14108v39 = i31;
                        iM14108v40 = i33;
                        c1321i2 = c1321i3;
                        iM14108v49 = i42;
                        iM14108v51 = i44;
                        iM14108v60 = i52;
                        iM14108v14 = i13;
                        iM14108v27 = i12;
                        iM14108v54 = i9;
                        break;
                    }
                    return arrayList4;
                } finally {
                    ik8VarMo2873e2.close();
                }
        }
    }

    public /* synthetic */ vp0(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.f65738a = i2;
        this.f65739b = obj;
        this.f65741d = obj2;
        this.f65740c = i;
        this.f65742e = obj3;
    }
}
