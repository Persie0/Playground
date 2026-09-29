package p000;

import com.lingq.core.database.dao.C1321i;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l85 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49296a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f49297b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1321i f49298c;

    public /* synthetic */ l85(int i, C1321i c1321i, int i2) {
        this.f49296a = i2;
        this.f49297b = i;
        this.f49298c = c1321i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    private final Object m16020d(Object obj) throws Exception {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        int i = this.f49297b;
        qn3 qn3Var = this.f49298c.f17038O;
        bk8 bk8Var = (bk8) obj;
        bk8Var.getClass();
        ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT * FROM LibraryDataEntity WHERE id = ?");
        try {
            ik8VarMo2873e0.mo2878j(1, i);
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
            Object u85Var = null;
            if (ik8VarMo2873e0.mo2876a0()) {
                int i2 = (int) ik8VarMo2873e0.getLong(iM14108v);
                String strMo2875L = ik8VarMo2873e0.mo2875L(iM14108v2);
                String strMo2875L2 = ik8VarMo2873e0.isNull(iM14108v3) ? null : ik8VarMo2873e0.mo2875L(iM14108v3);
                String strMo2875L3 = ik8VarMo2873e0.isNull(iM14108v4) ? null : ik8VarMo2873e0.mo2875L(iM14108v4);
                int i3 = (int) ik8VarMo2873e0.getLong(iM14108v5);
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
                int i4 = (int) ik8VarMo2873e0.getLong(iM14108v21);
                int i5 = (int) ik8VarMo2873e0.getLong(iM14108v22);
                String strMo2875L18 = ik8VarMo2873e0.isNull(iM14108v23) ? null : ik8VarMo2873e0.mo2875L(iM14108v23);
                int i6 = (int) ik8VarMo2873e0.getLong(iM14108v24);
                int i7 = (int) ik8VarMo2873e0.getLong(iM14108v25);
                int i8 = (int) ik8VarMo2873e0.getLong(iM14108v26);
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
                u85Var = new u85(i2, strMo2875L, strMo2875L2, strMo2875L3, i3, strMo2875L4, strMo2875L5, strMo2875L6, strMo2875L7, strMo2875L8, numValueOf, strMo2875L9, strMo2875L10, strMo2875L11, strMo2875L12, strMo2875L13, strMo2875L14, strMo2875L15, strMo2875L16, strMo2875L17, i4, i5, strMo2875L18, i6, i7, i8, numValueOf2, numValueOf3, strMo2875L19, d, z, listM20058M, strMo2875L20, listM20058M2, fValueOf, boolValueOf, strMo2875L21, strMo2875L22, strMo2875L23, d2, d3, z2, z3, strMo2875L24, strMo2875L25, strMo2875L26, boolValueOf2, ik8VarMo2873e0.isNull(iM14108v48) ? null : ik8VarMo2873e0.mo2875L(iM14108v48), ((int) ik8VarMo2873e0.getLong(iM14108v49)) != 0);
            }
            return u85Var;
        } finally {
            ik8VarMo2873e0.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    private final Object m16021g(Object obj) throws Exception {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        int i = this.f49297b;
        C1321i c1321i = this.f49298c;
        bk8 bk8Var = (bk8) obj;
        bk8Var.getClass();
        ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT * FROM LibraryDataEntity WHERE id = ? AND type = 'collection'");
        try {
            ik8VarMo2873e0.mo2878j(1, i);
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
            Object u85Var = null;
            if (ik8VarMo2873e0.mo2876a0()) {
                int i2 = (int) ik8VarMo2873e0.getLong(iM14108v);
                String strMo2875L = ik8VarMo2873e0.mo2875L(iM14108v2);
                String strMo2875L2 = ik8VarMo2873e0.isNull(iM14108v3) ? null : ik8VarMo2873e0.mo2875L(iM14108v3);
                String strMo2875L3 = ik8VarMo2873e0.isNull(iM14108v4) ? null : ik8VarMo2873e0.mo2875L(iM14108v4);
                int i3 = (int) ik8VarMo2873e0.getLong(iM14108v5);
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
                int i4 = (int) ik8VarMo2873e0.getLong(iM14108v21);
                int i5 = (int) ik8VarMo2873e0.getLong(iM14108v22);
                String strMo2875L18 = ik8VarMo2873e0.isNull(iM14108v23) ? null : ik8VarMo2873e0.mo2875L(iM14108v23);
                int i6 = (int) ik8VarMo2873e0.getLong(iM14108v24);
                int i7 = (int) ik8VarMo2873e0.getLong(iM14108v25);
                int i8 = (int) ik8VarMo2873e0.getLong(iM14108v26);
                Integer numValueOf2 = ik8VarMo2873e0.isNull(iM14108v27) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(iM14108v27));
                Integer numValueOf3 = ik8VarMo2873e0.isNull(iM14108v28) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(iM14108v28));
                String strMo2875L19 = ik8VarMo2873e0.isNull(iM14108v29) ? null : ik8VarMo2873e0.mo2875L(iM14108v29);
                double d = ik8VarMo2873e0.getDouble(iM14108v30);
                boolean z = ((int) ik8VarMo2873e0.getLong(iM14108v31)) != 0;
                List listM20058M = c1321i.f17038O.m20058M(ik8VarMo2873e0.isNull(iM14108v32) ? null : ik8VarMo2873e0.mo2875L(iM14108v32));
                String strMo2875L20 = ik8VarMo2873e0.isNull(iM14108v33) ? null : ik8VarMo2873e0.mo2875L(iM14108v33);
                List listM20058M2 = c1321i.f17038O.m20058M(ik8VarMo2873e0.isNull(iM14108v34) ? null : ik8VarMo2873e0.mo2875L(iM14108v34));
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
                u85Var = new u85(i2, strMo2875L, strMo2875L2, strMo2875L3, i3, strMo2875L4, strMo2875L5, strMo2875L6, strMo2875L7, strMo2875L8, numValueOf, strMo2875L9, strMo2875L10, strMo2875L11, strMo2875L12, strMo2875L13, strMo2875L14, strMo2875L15, strMo2875L16, strMo2875L17, i4, i5, strMo2875L18, i6, i7, i8, numValueOf2, numValueOf3, strMo2875L19, d, z, listM20058M, strMo2875L20, listM20058M2, fValueOf, boolValueOf, strMo2875L21, strMo2875L22, strMo2875L23, d2, d3, z2, z3, strMo2875L24, strMo2875L25, strMo2875L26, boolValueOf2, ik8VarMo2873e0.isNull(iM14108v48) ? null : ik8VarMo2873e0.mo2875L(iM14108v48), ((int) ik8VarMo2873e0.getLong(iM14108v49)) != 0);
            }
            return u85Var;
        } finally {
            ik8VarMo2873e0.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    private final Object m16022j(Object obj) throws Exception {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        int i = this.f49297b;
        C1321i c1321i = this.f49298c;
        bk8 bk8Var = (bk8) obj;
        bk8Var.getClass();
        ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT * FROM LibraryDataEntity WHERE id = ?");
        try {
            ik8VarMo2873e0.mo2878j(1, i);
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
            Object u85Var = null;
            if (ik8VarMo2873e0.mo2876a0()) {
                int i2 = (int) ik8VarMo2873e0.getLong(iM14108v);
                String strMo2875L = ik8VarMo2873e0.mo2875L(iM14108v2);
                String strMo2875L2 = ik8VarMo2873e0.isNull(iM14108v3) ? null : ik8VarMo2873e0.mo2875L(iM14108v3);
                String strMo2875L3 = ik8VarMo2873e0.isNull(iM14108v4) ? null : ik8VarMo2873e0.mo2875L(iM14108v4);
                int i3 = (int) ik8VarMo2873e0.getLong(iM14108v5);
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
                int i4 = (int) ik8VarMo2873e0.getLong(iM14108v21);
                int i5 = (int) ik8VarMo2873e0.getLong(iM14108v22);
                String strMo2875L18 = ik8VarMo2873e0.isNull(iM14108v23) ? null : ik8VarMo2873e0.mo2875L(iM14108v23);
                int i6 = (int) ik8VarMo2873e0.getLong(iM14108v24);
                int i7 = (int) ik8VarMo2873e0.getLong(iM14108v25);
                int i8 = (int) ik8VarMo2873e0.getLong(iM14108v26);
                Integer numValueOf2 = ik8VarMo2873e0.isNull(iM14108v27) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(iM14108v27));
                Integer numValueOf3 = ik8VarMo2873e0.isNull(iM14108v28) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(iM14108v28));
                String strMo2875L19 = ik8VarMo2873e0.isNull(iM14108v29) ? null : ik8VarMo2873e0.mo2875L(iM14108v29);
                double d = ik8VarMo2873e0.getDouble(iM14108v30);
                boolean z = ((int) ik8VarMo2873e0.getLong(iM14108v31)) != 0;
                List listM20058M = c1321i.f17038O.m20058M(ik8VarMo2873e0.isNull(iM14108v32) ? null : ik8VarMo2873e0.mo2875L(iM14108v32));
                String strMo2875L20 = ik8VarMo2873e0.isNull(iM14108v33) ? null : ik8VarMo2873e0.mo2875L(iM14108v33);
                List listM20058M2 = c1321i.f17038O.m20058M(ik8VarMo2873e0.isNull(iM14108v34) ? null : ik8VarMo2873e0.mo2875L(iM14108v34));
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
                u85Var = new u85(i2, strMo2875L, strMo2875L2, strMo2875L3, i3, strMo2875L4, strMo2875L5, strMo2875L6, strMo2875L7, strMo2875L8, numValueOf, strMo2875L9, strMo2875L10, strMo2875L11, strMo2875L12, strMo2875L13, strMo2875L14, strMo2875L15, strMo2875L16, strMo2875L17, i4, i5, strMo2875L18, i6, i7, i8, numValueOf2, numValueOf3, strMo2875L19, d, z, listM20058M, strMo2875L20, listM20058M2, fValueOf, boolValueOf, strMo2875L21, strMo2875L22, strMo2875L23, d2, d3, z2, z3, strMo2875L24, strMo2875L25, strMo2875L26, boolValueOf2, ik8VarMo2873e0.isNull(iM14108v48) ? null : ik8VarMo2873e0.mo2875L(iM14108v48), ((int) ik8VarMo2873e0.getLong(iM14108v49)) != 0);
            }
            return u85Var;
        } finally {
            ik8VarMo2873e0.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    private final Object m16023k(Object obj) throws Exception {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        int i = this.f49297b;
        C1321i c1321i = this.f49298c;
        bk8 bk8Var = (bk8) obj;
        bk8Var.getClass();
        ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT * FROM LibraryDataEntity WHERE id = ?");
        try {
            ik8VarMo2873e0.mo2878j(1, i);
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
            Object u85Var = null;
            if (ik8VarMo2873e0.mo2876a0()) {
                int i2 = (int) ik8VarMo2873e0.getLong(iM14108v);
                String strMo2875L = ik8VarMo2873e0.mo2875L(iM14108v2);
                String strMo2875L2 = ik8VarMo2873e0.isNull(iM14108v3) ? null : ik8VarMo2873e0.mo2875L(iM14108v3);
                String strMo2875L3 = ik8VarMo2873e0.isNull(iM14108v4) ? null : ik8VarMo2873e0.mo2875L(iM14108v4);
                int i3 = (int) ik8VarMo2873e0.getLong(iM14108v5);
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
                int i4 = (int) ik8VarMo2873e0.getLong(iM14108v21);
                int i5 = (int) ik8VarMo2873e0.getLong(iM14108v22);
                String strMo2875L18 = ik8VarMo2873e0.isNull(iM14108v23) ? null : ik8VarMo2873e0.mo2875L(iM14108v23);
                int i6 = (int) ik8VarMo2873e0.getLong(iM14108v24);
                int i7 = (int) ik8VarMo2873e0.getLong(iM14108v25);
                int i8 = (int) ik8VarMo2873e0.getLong(iM14108v26);
                Integer numValueOf2 = ik8VarMo2873e0.isNull(iM14108v27) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(iM14108v27));
                Integer numValueOf3 = ik8VarMo2873e0.isNull(iM14108v28) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(iM14108v28));
                String strMo2875L19 = ik8VarMo2873e0.isNull(iM14108v29) ? null : ik8VarMo2873e0.mo2875L(iM14108v29);
                double d = ik8VarMo2873e0.getDouble(iM14108v30);
                boolean z = ((int) ik8VarMo2873e0.getLong(iM14108v31)) != 0;
                List listM20058M = c1321i.f17038O.m20058M(ik8VarMo2873e0.isNull(iM14108v32) ? null : ik8VarMo2873e0.mo2875L(iM14108v32));
                String strMo2875L20 = ik8VarMo2873e0.isNull(iM14108v33) ? null : ik8VarMo2873e0.mo2875L(iM14108v33);
                List listM20058M2 = c1321i.f17038O.m20058M(ik8VarMo2873e0.isNull(iM14108v34) ? null : ik8VarMo2873e0.mo2875L(iM14108v34));
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
                u85Var = new u85(i2, strMo2875L, strMo2875L2, strMo2875L3, i3, strMo2875L4, strMo2875L5, strMo2875L6, strMo2875L7, strMo2875L8, numValueOf, strMo2875L9, strMo2875L10, strMo2875L11, strMo2875L12, strMo2875L13, strMo2875L14, strMo2875L15, strMo2875L16, strMo2875L17, i4, i5, strMo2875L18, i6, i7, i8, numValueOf2, numValueOf3, strMo2875L19, d, z, listM20058M, strMo2875L20, listM20058M2, fValueOf, boolValueOf, strMo2875L21, strMo2875L22, strMo2875L23, d2, d3, z2, z3, strMo2875L24, strMo2875L25, strMo2875L26, boolValueOf2, ik8VarMo2873e0.isNull(iM14108v48) ? null : ik8VarMo2873e0.mo2875L(iM14108v48), ((int) ik8VarMo2873e0.getLong(iM14108v49)) != 0);
            }
            return u85Var;
        } finally {
            ik8VarMo2873e0.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        switch (this.f49296a) {
            case 0:
                return m16021g(obj);
            case 1:
                return m16020d(obj);
            case 2:
                return m16022j(obj);
            case 3:
                return m16023k(obj);
            default:
                int i = this.f49297b;
                C1321i c1321i = this.f49298c;
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT * FROM LibraryDataEntity WHERE id = ?");
                try {
                    ik8VarMo2873e0.mo2878j(1, i);
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
                    Object u85Var = null;
                    if (ik8VarMo2873e0.mo2876a0()) {
                        int i2 = (int) ik8VarMo2873e0.getLong(iM14108v);
                        String strMo2875L = ik8VarMo2873e0.mo2875L(iM14108v2);
                        String strMo2875L2 = ik8VarMo2873e0.isNull(iM14108v3) ? null : ik8VarMo2873e0.mo2875L(iM14108v3);
                        String strMo2875L3 = ik8VarMo2873e0.isNull(iM14108v4) ? null : ik8VarMo2873e0.mo2875L(iM14108v4);
                        int i3 = (int) ik8VarMo2873e0.getLong(iM14108v5);
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
                        int i4 = (int) ik8VarMo2873e0.getLong(iM14108v21);
                        int i5 = (int) ik8VarMo2873e0.getLong(iM14108v22);
                        String strMo2875L18 = ik8VarMo2873e0.isNull(iM14108v23) ? null : ik8VarMo2873e0.mo2875L(iM14108v23);
                        int i6 = (int) ik8VarMo2873e0.getLong(iM14108v24);
                        int i7 = (int) ik8VarMo2873e0.getLong(iM14108v25);
                        int i8 = (int) ik8VarMo2873e0.getLong(iM14108v26);
                        Integer numValueOf2 = ik8VarMo2873e0.isNull(iM14108v27) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(iM14108v27));
                        Integer numValueOf3 = ik8VarMo2873e0.isNull(iM14108v28) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(iM14108v28));
                        String strMo2875L19 = ik8VarMo2873e0.isNull(iM14108v29) ? null : ik8VarMo2873e0.mo2875L(iM14108v29);
                        double d = ik8VarMo2873e0.getDouble(iM14108v30);
                        boolean z = ((int) ik8VarMo2873e0.getLong(iM14108v31)) != 0;
                        List listM20058M = c1321i.f17038O.m20058M(ik8VarMo2873e0.isNull(iM14108v32) ? null : ik8VarMo2873e0.mo2875L(iM14108v32));
                        String strMo2875L20 = ik8VarMo2873e0.isNull(iM14108v33) ? null : ik8VarMo2873e0.mo2875L(iM14108v33);
                        List listM20058M2 = c1321i.f17038O.m20058M(ik8VarMo2873e0.isNull(iM14108v34) ? null : ik8VarMo2873e0.mo2875L(iM14108v34));
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
                        u85Var = new u85(i2, strMo2875L, strMo2875L2, strMo2875L3, i3, strMo2875L4, strMo2875L5, strMo2875L6, strMo2875L7, strMo2875L8, numValueOf, strMo2875L9, strMo2875L10, strMo2875L11, strMo2875L12, strMo2875L13, strMo2875L14, strMo2875L15, strMo2875L16, strMo2875L17, i4, i5, strMo2875L18, i6, i7, i8, numValueOf2, numValueOf3, strMo2875L19, d, z, listM20058M, strMo2875L20, listM20058M2, fValueOf, boolValueOf, strMo2875L21, strMo2875L22, strMo2875L23, d2, d3, z2, z3, strMo2875L24, strMo2875L25, strMo2875L26, boolValueOf2, ik8VarMo2873e0.isNull(iM14108v48) ? null : ik8VarMo2873e0.mo2875L(iM14108v48), ((int) ik8VarMo2873e0.getLong(iM14108v49)) != 0);
                    }
                    return u85Var;
                } finally {
                    ik8VarMo2873e0.close();
                }
        }
    }
}
