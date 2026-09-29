package p000;

import android.os.Bundle;
import android.os.Parcel;
import androidx.compose.runtime.internal.C0282a;
import androidx.glance.appwidget.AbstractC0661i;
import androidx.glance.appwidget.protobuf.ByteString;
import com.lingq.core.database.dao.C1321i;
import com.lingq.core.domain.model.lesson.LessonSentence;
import com.lingq.core.p012ui.dragdrop.C1919b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ek2 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37379a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f37380b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f37381c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f37382d;

    public /* synthetic */ ek2(int i, String str, bq1 bq1Var, int i2) {
        this.f37379a = i2;
        this.f37380b = i;
        this.f37381c = str;
        this.f37382d = bq1Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        Object obj2;
        LessonSentence lessonSentence;
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
        int i8 = this.f37379a;
        xfa xfaVar = xfa.f68157a;
        int i9 = 0;
        int i10 = this.f37380b;
        Object obj3 = this.f37382d;
        Object obj4 = this.f37381c;
        switch (i8) {
            case 0:
                C1919b c1919b = (C1919b) obj3;
                ((vi3) obj4).invoke(Boolean.TRUE);
                long j = ((gq6) obj).f41189a;
                Iterator it = c1919b.f23968a.m980j().f42985k.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        iv4 iv4Var = (iv4) next;
                        int i11 = iv4Var.f44662o;
                        int i12 = iv4Var.f44663p + i11;
                        int iIntBitsToFloat = ((int) Float.intBitsToFloat((int) (4294967295L & j))) - i10;
                        if (i11 <= iIntBitsToFloat && iIntBitsToFloat <= i12) {
                            obj2 = next;
                        }
                    } else {
                        obj2 = null;
                    }
                }
                iv4 iv4Var2 = (iv4) obj2;
                if (iv4Var2 != null) {
                    ((xc9) c1919b.f23976i).setValue(Integer.valueOf(iv4Var2.f44648a));
                    ((xc9) c1919b.f23975h).setValue(iv4Var2);
                    c1919b.f23972e.m21223i(iv4Var2.f44662o);
                }
                return xfaVar;
            case 1:
                br4 br4Var = (br4) obj;
                er4 er4VarM12015u = fr4.m12015u();
                String canonicalName = ((AbstractC0661i) obj4).getClass().getCanonicalName();
                er4VarM12015u.m23361c();
                fr4.m12011n((fr4) er4VarM12015u.f65532b, canonicalName);
                er4VarM12015u.m23361c();
                fr4.m12012o((fr4) er4VarM12015u.f65532b, i10);
                er4VarM12015u.m23361c();
                fr4.m12013p((fr4) er4VarM12015u.f65532b, (String) obj3);
                fr4 fr4Var = (fr4) er4VarM12015u.m23359a();
                br4Var.m23361c();
                or4.m18316q((or4) br4Var.f65532b, fr4Var);
                return xfaVar;
            case 2:
                br4 br4Var2 = (br4) obj;
                ir4 ir4VarM14624u = jr4.m14624u();
                String canonicalName2 = ((AbstractC0661i) obj4).getClass().getCanonicalName();
                ir4VarM14624u.m23361c();
                jr4.m14620n((jr4) ir4VarM14624u.f65532b, canonicalName2);
                ir4VarM14624u.m23361c();
                jr4.m14621o((jr4) ir4VarM14624u.f65532b, i10);
                Parcel parcelObtain = Parcel.obtain();
                ((Bundle) obj3).writeToParcel(parcelObtain, 0);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                ByteString byteStringM2261g = ByteString.m2261g(bArrMarshall, 0, bArrMarshall.length);
                ir4VarM14624u.m23361c();
                jr4.m14622p((jr4) ir4VarM14624u.f65532b, byteStringM2261g);
                jr4 jr4Var = (jr4) ir4VarM14624u.m23359a();
                br4Var2.m23361c();
                or4.m18314o((or4) br4Var2.f65532b, jr4Var);
                return xfaVar;
            case 3:
                String str6 = (String) obj4;
                q05 q05Var = (q05) obj3;
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT `tokens`, `text`, `normalizedText`, `index`, `timestamp`, `startParagraph`, `url`, `opentag` FROM (SELECT * FROM LessonSentenceEntity WHERE lessonId = ? AND normalizedText LIKE '%' ||? || '%' ORDER BY `index` LIMIT 1)");
                try {
                    ik8VarMo2873e0.mo2878j(1, i10);
                    ik8VarMo2873e0.mo2874C(2, str6);
                    if (ik8VarMo2873e0.mo2876a0()) {
                        List listM20063R = q05Var.f57073M.m20063R(ik8VarMo2873e0.mo2875L(0));
                        String strMo2875L3 = ik8VarMo2873e0.isNull(1) ? null : ik8VarMo2873e0.mo2875L(1);
                        String strMo2875L4 = ik8VarMo2873e0.isNull(2) ? null : ik8VarMo2873e0.mo2875L(2);
                        int i13 = (int) ik8VarMo2873e0.getLong(3);
                        String strMo2875L5 = ik8VarMo2873e0.isNull(4) ? null : ik8VarMo2873e0.mo2875L(4);
                        lessonSentence = new LessonSentence(listM20063R, strMo2875L3, strMo2875L4, i13, strMo2875L5 == null ? null : q05Var.f57073M.m20055J(strMo2875L5), ((int) ik8VarMo2873e0.getLong(5)) != 0, ik8VarMo2873e0.isNull(6) ? null : ik8VarMo2873e0.mo2875L(6), ik8VarMo2873e0.isNull(7) ? null : ik8VarMo2873e0.mo2875L(7));
                    } else {
                        lessonSentence = null;
                    }
                    return lessonSentence;
                } finally {
                    ik8VarMo2873e0.close();
                }
            case 4:
                String str7 = (String) obj4;
                C1321i c1321i = (C1321i) obj3;
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                ik8 ik8VarMo2873e1 = bk8Var2.mo2873e0("\n    SELECT DISTINCT LibraryDataEntity.* FROM LibraryDataEntity\n    INNER JOIN CoursesAndLessonsJoin ON LibraryDataEntity.id = CoursesAndLessonsJoin.contentId\n    WHERE CoursesAndLessonsJoin.pk = ? AND LibraryDataEntity.collectionId = ? AND LibraryDataEntity.type = ?\n    ORDER BY courseOrder ASC");
                long j2 = i10;
                try {
                    ik8VarMo2873e1.mo2878j(1, j2);
                    ik8VarMo2873e1.mo2878j(2, j2);
                    ik8VarMo2873e1.mo2874C(3, str7);
                    int iM14108v = AbstractC3122is.m14108v(ik8VarMo2873e1, "id");
                    int iM14108v2 = AbstractC3122is.m14108v(ik8VarMo2873e1, "type");
                    int iM14108v3 = AbstractC3122is.m14108v(ik8VarMo2873e1, "title");
                    int iM14108v4 = AbstractC3122is.m14108v(ik8VarMo2873e1, "description");
                    int iM14108v5 = AbstractC3122is.m14108v(ik8VarMo2873e1, "pos");
                    int iM14108v6 = AbstractC3122is.m14108v(ik8VarMo2873e1, "url");
                    int iM14108v7 = AbstractC3122is.m14108v(ik8VarMo2873e1, "sourceType");
                    int iM14108v8 = AbstractC3122is.m14108v(ik8VarMo2873e1, "sourceName");
                    int iM14108v9 = AbstractC3122is.m14108v(ik8VarMo2873e1, "sourceUrl");
                    int iM14108v10 = AbstractC3122is.m14108v(ik8VarMo2873e1, "imageUrl");
                    int iM14108v11 = AbstractC3122is.m14108v(ik8VarMo2873e1, "providerId");
                    int iM14108v12 = AbstractC3122is.m14108v(ik8VarMo2873e1, "providerName");
                    int iM14108v13 = AbstractC3122is.m14108v(ik8VarMo2873e1, "providerDescription");
                    int iM14108v14 = AbstractC3122is.m14108v(ik8VarMo2873e1, "originalImageUrl");
                    C1321i c1321i2 = c1321i;
                    int iM14108v15 = AbstractC3122is.m14108v(ik8VarMo2873e1, "providerImageUrl");
                    int iM14108v16 = AbstractC3122is.m14108v(ik8VarMo2873e1, "sharedById");
                    int iM14108v17 = AbstractC3122is.m14108v(ik8VarMo2873e1, "sharedByName");
                    int iM14108v18 = AbstractC3122is.m14108v(ik8VarMo2873e1, "sharedByImageUrl");
                    int iM14108v19 = AbstractC3122is.m14108v(ik8VarMo2873e1, "sharedByRole");
                    int iM14108v20 = AbstractC3122is.m14108v(ik8VarMo2873e1, "level");
                    int iM14108v21 = AbstractC3122is.m14108v(ik8VarMo2873e1, "newWordsCount");
                    int iM14108v22 = AbstractC3122is.m14108v(ik8VarMo2873e1, "lessonsCount");
                    int iM14108v23 = AbstractC3122is.m14108v(ik8VarMo2873e1, "owner");
                    int iM14108v24 = AbstractC3122is.m14108v(ik8VarMo2873e1, "price");
                    int iM14108v25 = AbstractC3122is.m14108v(ik8VarMo2873e1, "cardsCount");
                    int iM14108v26 = AbstractC3122is.m14108v(ik8VarMo2873e1, "rosesCount");
                    int iM14108v27 = AbstractC3122is.m14108v(ik8VarMo2873e1, "duration");
                    int iM14108v28 = AbstractC3122is.m14108v(ik8VarMo2873e1, "collectionId");
                    int iM14108v29 = AbstractC3122is.m14108v(ik8VarMo2873e1, "collectionTitle");
                    int iM14108v30 = AbstractC3122is.m14108v(ik8VarMo2873e1, "difficulty");
                    int iM14108v31 = AbstractC3122is.m14108v(ik8VarMo2873e1, "isAvailable");
                    int iM14108v32 = AbstractC3122is.m14108v(ik8VarMo2873e1, "tags");
                    int iM14108v33 = AbstractC3122is.m14108v(ik8VarMo2873e1, "status");
                    int iM14108v34 = AbstractC3122is.m14108v(ik8VarMo2873e1, "folders");
                    int iM14108v35 = AbstractC3122is.m14108v(ik8VarMo2873e1, "progress");
                    int iM14108v36 = AbstractC3122is.m14108v(ik8VarMo2873e1, "isTaken");
                    int iM14108v37 = AbstractC3122is.m14108v(ik8VarMo2873e1, "lessonPreview");
                    int iM14108v38 = AbstractC3122is.m14108v(ik8VarMo2873e1, "accent");
                    int iM14108v39 = AbstractC3122is.m14108v(ik8VarMo2873e1, "audioUrl");
                    int iM14108v40 = AbstractC3122is.m14108v(ik8VarMo2873e1, "listenTimes");
                    int iM14108v41 = AbstractC3122is.m14108v(ik8VarMo2873e1, "readTimes");
                    int iM14108v42 = AbstractC3122is.m14108v(ik8VarMo2873e1, "isCompleted");
                    int iM14108v43 = AbstractC3122is.m14108v(ik8VarMo2873e1, "isFavorite");
                    int iM14108v44 = AbstractC3122is.m14108v(ik8VarMo2873e1, "videoUrl");
                    int iM14108v45 = AbstractC3122is.m14108v(ik8VarMo2873e1, "isLocked");
                    int iM14108v46 = AbstractC3122is.m14108v(ik8VarMo2873e1, "lessonsSortBy");
                    int iM14108v47 = AbstractC3122is.m14108v(ik8VarMo2873e1, "isSubscribed");
                    int iM14108v48 = AbstractC3122is.m14108v(ik8VarMo2873e1, "originalUrl");
                    int iM14108v49 = AbstractC3122is.m14108v(ik8VarMo2873e1, "isArchived");
                    ArrayList arrayList = new ArrayList();
                    while (ik8VarMo2873e1.mo2876a0()) {
                        int i14 = iM14108v12;
                        int i15 = iM14108v14;
                        int i16 = (int) ik8VarMo2873e1.getLong(iM14108v);
                        String strMo2875L6 = ik8VarMo2873e1.mo2875L(iM14108v2);
                        String strMo2875L7 = ik8VarMo2873e1.isNull(iM14108v3) ? null : ik8VarMo2873e1.mo2875L(iM14108v3);
                        String strMo2875L8 = ik8VarMo2873e1.isNull(iM14108v4) ? null : ik8VarMo2873e1.mo2875L(iM14108v4);
                        int i17 = (int) ik8VarMo2873e1.getLong(iM14108v5);
                        String strMo2875L9 = ik8VarMo2873e1.isNull(iM14108v6) ? null : ik8VarMo2873e1.mo2875L(iM14108v6);
                        String strMo2875L10 = ik8VarMo2873e1.isNull(iM14108v7) ? null : ik8VarMo2873e1.mo2875L(iM14108v7);
                        String strMo2875L11 = ik8VarMo2873e1.isNull(iM14108v8) ? null : ik8VarMo2873e1.mo2875L(iM14108v8);
                        String strMo2875L12 = ik8VarMo2873e1.isNull(iM14108v9) ? null : ik8VarMo2873e1.mo2875L(iM14108v9);
                        String strMo2875L13 = ik8VarMo2873e1.isNull(iM14108v10) ? null : ik8VarMo2873e1.mo2875L(iM14108v10);
                        Integer numValueOf = ik8VarMo2873e1.isNull(iM14108v11) ? null : Integer.valueOf((int) ik8VarMo2873e1.getLong(iM14108v11));
                        String strMo2875L14 = ik8VarMo2873e1.isNull(i14) ? null : ik8VarMo2873e1.mo2875L(i14);
                        String strMo2875L15 = ik8VarMo2873e1.isNull(iM14108v13) ? null : ik8VarMo2873e1.mo2875L(iM14108v13);
                        if (ik8VarMo2873e1.isNull(i15)) {
                            i = iM14108v;
                            strMo2875L = null;
                        } else {
                            i = iM14108v;
                            strMo2875L = ik8VarMo2873e1.mo2875L(i15);
                        }
                        if (ik8VarMo2873e1.isNull(iM14108v15)) {
                            i2 = iM14108v16;
                            strMo2875L2 = null;
                        } else {
                            i2 = iM14108v16;
                            strMo2875L2 = ik8VarMo2873e1.mo2875L(iM14108v15);
                        }
                        if (ik8VarMo2873e1.isNull(i2)) {
                            i3 = iM14108v17;
                            str = null;
                        } else {
                            String strMo2875L16 = ik8VarMo2873e1.mo2875L(i2);
                            i3 = iM14108v17;
                            str = strMo2875L16;
                        }
                        if (ik8VarMo2873e1.isNull(i3)) {
                            i4 = iM14108v18;
                            str2 = null;
                        } else {
                            String strMo2875L17 = ik8VarMo2873e1.mo2875L(i3);
                            i4 = iM14108v18;
                            str2 = strMo2875L17;
                        }
                        if (ik8VarMo2873e1.isNull(i4)) {
                            i5 = iM14108v19;
                            str3 = null;
                        } else {
                            String strMo2875L18 = ik8VarMo2873e1.mo2875L(i4);
                            i5 = iM14108v19;
                            str3 = strMo2875L18;
                        }
                        if (ik8VarMo2873e1.isNull(i5)) {
                            i6 = iM14108v20;
                            str4 = null;
                        } else {
                            String strMo2875L19 = ik8VarMo2873e1.mo2875L(i5);
                            i6 = iM14108v20;
                            str4 = strMo2875L19;
                        }
                        if (ik8VarMo2873e1.isNull(i6)) {
                            i7 = iM14108v21;
                            str5 = null;
                        } else {
                            String strMo2875L20 = ik8VarMo2873e1.mo2875L(i6);
                            i7 = iM14108v21;
                            str5 = strMo2875L20;
                        }
                        int i18 = (int) ik8VarMo2873e1.getLong(i7);
                        int i19 = iM14108v22;
                        int i20 = iM14108v2;
                        int i21 = (int) ik8VarMo2873e1.getLong(i19);
                        int i22 = iM14108v23;
                        String strMo2875L21 = ik8VarMo2873e1.isNull(i22) ? null : ik8VarMo2873e1.mo2875L(i22);
                        int i23 = iM14108v24;
                        int i24 = (int) ik8VarMo2873e1.getLong(i23);
                        int i25 = iM14108v25;
                        int i26 = (int) ik8VarMo2873e1.getLong(i25);
                        int i27 = iM14108v26;
                        int i28 = (int) ik8VarMo2873e1.getLong(i27);
                        int i29 = iM14108v27;
                        Integer numValueOf2 = ik8VarMo2873e1.isNull(i29) ? null : Integer.valueOf((int) ik8VarMo2873e1.getLong(i29));
                        int i30 = iM14108v28;
                        Integer numValueOf3 = ik8VarMo2873e1.isNull(i30) ? null : Integer.valueOf((int) ik8VarMo2873e1.getLong(i30));
                        int i31 = iM14108v29;
                        String strMo2875L22 = ik8VarMo2873e1.isNull(i31) ? null : ik8VarMo2873e1.mo2875L(i31);
                        int i32 = iM14108v30;
                        double d = ik8VarMo2873e1.getDouble(i32);
                        iM14108v29 = i31;
                        iM14108v30 = i32;
                        int i33 = iM14108v31;
                        boolean z = ((int) ik8VarMo2873e1.getLong(i33)) != 0;
                        int i34 = iM14108v32;
                        iM14108v31 = i33;
                        iM14108v32 = i34;
                        C1321i c1321i3 = c1321i2;
                        List listM20058M = c1321i3.f17038O.m20058M(ik8VarMo2873e1.isNull(i34) ? null : ik8VarMo2873e1.mo2875L(i34));
                        int i35 = iM14108v33;
                        String strMo2875L23 = ik8VarMo2873e1.isNull(i35) ? null : ik8VarMo2873e1.mo2875L(i35);
                        int i36 = iM14108v34;
                        List listM20058M2 = c1321i3.f17038O.m20058M(ik8VarMo2873e1.isNull(i36) ? null : ik8VarMo2873e1.mo2875L(i36));
                        int i37 = iM14108v35;
                        Float fValueOf = ik8VarMo2873e1.isNull(i37) ? null : Float.valueOf((float) ik8VarMo2873e1.getDouble(i37));
                        int i38 = iM14108v36;
                        Integer numValueOf4 = ik8VarMo2873e1.isNull(i38) ? null : Integer.valueOf((int) ik8VarMo2873e1.getLong(i38));
                        Boolean boolValueOf = numValueOf4 != null ? Boolean.valueOf(numValueOf4.intValue() != 0) : null;
                        int i39 = iM14108v37;
                        String strMo2875L24 = ik8VarMo2873e1.mo2875L(i39);
                        int i40 = iM14108v38;
                        String strMo2875L25 = ik8VarMo2873e1.isNull(i40) ? null : ik8VarMo2873e1.mo2875L(i40);
                        int i41 = iM14108v39;
                        String strMo2875L26 = ik8VarMo2873e1.isNull(i41) ? null : ik8VarMo2873e1.mo2875L(i41);
                        iM14108v39 = i41;
                        int i42 = iM14108v40;
                        double d2 = ik8VarMo2873e1.getDouble(i42);
                        iM14108v40 = i42;
                        int i43 = iM14108v41;
                        double d3 = ik8VarMo2873e1.getDouble(i43);
                        iM14108v41 = i43;
                        int i44 = iM14108v42;
                        boolean z2 = ((int) ik8VarMo2873e1.getLong(i44)) != 0;
                        int i45 = iM14108v43;
                        boolean z3 = ((int) ik8VarMo2873e1.getLong(i45)) != 0;
                        int i46 = iM14108v44;
                        String strMo2875L27 = ik8VarMo2873e1.isNull(i46) ? null : ik8VarMo2873e1.mo2875L(i46);
                        int i47 = iM14108v45;
                        String strMo2875L28 = ik8VarMo2873e1.isNull(i47) ? null : ik8VarMo2873e1.mo2875L(i47);
                        int i48 = iM14108v46;
                        String strMo2875L29 = ik8VarMo2873e1.isNull(i48) ? null : ik8VarMo2873e1.mo2875L(i48);
                        iM14108v46 = i48;
                        int i49 = iM14108v47;
                        Integer numValueOf5 = ik8VarMo2873e1.isNull(i49) ? null : Integer.valueOf((int) ik8VarMo2873e1.getLong(i49));
                        Boolean boolValueOf2 = numValueOf5 != null ? Boolean.valueOf(numValueOf5.intValue() != 0) : null;
                        int i50 = iM14108v48;
                        int i51 = iM14108v49;
                        arrayList.add(new u85(i16, strMo2875L6, strMo2875L7, strMo2875L8, i17, strMo2875L9, strMo2875L10, strMo2875L11, strMo2875L12, strMo2875L13, numValueOf, strMo2875L14, strMo2875L15, strMo2875L, strMo2875L2, str, str2, str3, str4, str5, i18, i21, strMo2875L21, i24, i26, i28, numValueOf2, numValueOf3, strMo2875L22, d, z, listM20058M, strMo2875L23, listM20058M2, fValueOf, boolValueOf, strMo2875L24, strMo2875L25, strMo2875L26, d2, d3, z2, z3, strMo2875L27, strMo2875L28, strMo2875L29, boolValueOf2, ik8VarMo2873e1.isNull(i50) ? null : ik8VarMo2873e1.mo2875L(i50), ((int) ik8VarMo2873e1.getLong(i51)) != 0));
                        iM14108v27 = i29;
                        c1321i2 = c1321i3;
                        iM14108v36 = i38;
                        iM14108v38 = i40;
                        iM14108v47 = i49;
                        iM14108v = i;
                        iM14108v15 = iM14108v15;
                        iM14108v16 = i2;
                        iM14108v17 = i3;
                        iM14108v18 = i4;
                        iM14108v19 = i5;
                        iM14108v20 = i6;
                        iM14108v21 = i7;
                        iM14108v23 = i22;
                        iM14108v25 = i25;
                        iM14108v26 = i27;
                        iM14108v48 = i50;
                        iM14108v2 = i20;
                        iM14108v22 = i19;
                        iM14108v24 = i23;
                        iM14108v28 = i30;
                        iM14108v35 = i37;
                        iM14108v37 = i39;
                        iM14108v42 = i44;
                        iM14108v43 = i45;
                        iM14108v44 = i46;
                        iM14108v45 = i47;
                        iM14108v34 = i36;
                        iM14108v33 = i35;
                        iM14108v49 = i51;
                        iM14108v12 = i14;
                        iM14108v14 = i15;
                        iM14108v3 = iM14108v3;
                        break;
                    }
                    return arrayList;
                } finally {
                    ik8VarMo2873e1.close();
                }
            default:
                ArrayList arrayList2 = (ArrayList) obj4;
                ev4 ev4Var = (ev4) obj;
                ev4Var.getClass();
                int size = arrayList2.size();
                C0282a c0282a = new C0282a(-1708107944, true, new dj8(arrayList2, (C0282a) obj3, i10));
                for (int i52 = 0; i52 < size; i52++) {
                    arrayList2.get(i52);
                    ev4Var.f37936a.add(new Pair(Long.MIN_VALUE, new C0282a(499182208, true, new dv4(c0282a, i52, i9))));
                }
                return xfaVar;
        }
    }

    public /* synthetic */ ek2(AbstractC0661i abstractC0661i, int i, Object obj, int i2) {
        this.f37379a = i2;
        this.f37381c = abstractC0661i;
        this.f37380b = i;
        this.f37382d = obj;
    }

    public /* synthetic */ ek2(Object obj, int i, int i2, Object obj2) {
        this.f37379a = i2;
        this.f37381c = obj;
        this.f37382d = obj2;
        this.f37380b = i;
    }
}
