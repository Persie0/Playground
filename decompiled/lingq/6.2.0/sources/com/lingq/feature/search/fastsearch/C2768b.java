package com.lingq.feature.search.fastsearch;

import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.data.repository.C1305u;
import com.lingq.core.domain.model.library.LibraryContentType;
import com.lingq.core.domain.model.library.LibraryShelf;
import com.lingq.core.domain.model.library.LibraryShelfType;
import com.lingq.core.domain.model.library.LibraryTab;
import com.lingq.core.domain.model.user.ProfileAccount;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.AbstractC3584sr;
import p000.C3139j9;
import p000.a13;
import p000.b13;
import p000.bx0;
import p000.c13;
import p000.c18;
import p000.c83;
import p000.ck6;
import p000.cma;
import p000.cr8;
import p000.eh9;
import p000.g41;
import p000.gm5;
import p000.h03;
import p000.i03;
import p000.i23;
import p000.j03;
import p000.j23;
import p000.k03;
import p000.l03;
import p000.lda;
import p000.m03;
import p000.m68;
import p000.m83;
import p000.md0;
import p000.n03;
import p000.n23;
import p000.nl8;
import p000.nn1;
import p000.np8;
import p000.r23;
import p000.ux5;
import p000.vi3;
import p000.vj6;
import p000.vk9;
import p000.vz1;
import p000.vz2;
import p000.web;
import p000.wfb;
import p000.wta;
import p000.wz0;
import p000.xi9;

/* JADX INFO: renamed from: com.lingq.feature.search.fastsearch.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2768b extends wta implements cma, m68 {
    public static final b13 Companion = new b13();

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f32878b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ m68 f32879c;

    /* JADX INFO: renamed from: d */
    public final j23 f32880d;

    /* JADX INFO: renamed from: e */
    public final i23 f32881e;

    /* JADX INFO: renamed from: f */
    public final ck6 f32882f;

    /* JADX INFO: renamed from: g */
    public final web f32883g;

    /* JADX INFO: renamed from: h */
    public final vj6 f32884h;

    /* JADX INFO: renamed from: i */
    public final j23 f32885i;

    /* JADX INFO: renamed from: j */
    public final i23 f32886j;

    /* JADX INFO: renamed from: k */
    public final r23 f32887k;

    /* JADX INFO: renamed from: l */
    public final n23 f32888l;

    /* JADX INFO: renamed from: m */
    public final C3139j9 f32889m;

    /* JADX INFO: renamed from: n */
    public final nn1 f32890n;

    /* JADX INFO: renamed from: o */
    public final nl8 f32891o;

    /* JADX INFO: renamed from: p */
    public final C3244l f32892p;

    /* JADX INFO: renamed from: q */
    public final c18 f32893q;

    public C2768b(j23 j23Var, i23 i23Var, ck6 ck6Var, web webVar, vj6 vj6Var, j23 j23Var2, i23 i23Var2, r23 r23Var, n23 n23Var, C3139j9 c3139j9, nn1 nn1Var, cma cmaVar, m68 m68Var, nl8 nl8Var) {
        cmaVar.getClass();
        m68Var.getClass();
        nl8Var.getClass();
        this.f32878b = cmaVar;
        this.f32879c = m68Var;
        this.f32880d = j23Var;
        this.f32881e = i23Var;
        this.f32882f = ck6Var;
        this.f32883g = webVar;
        this.f32884h = vj6Var;
        this.f32885i = j23Var2;
        this.f32886j = i23Var2;
        this.f32887k = r23Var;
        this.f32888l = n23Var;
        this.f32889m = c3139j9;
        this.f32890n = nn1Var;
        this.f32891o = nl8Var;
        String str = (String) nl8Var.m17488b("query");
        str = str == null ? "" : str;
        Map mapM15360M = AbstractC3194a.m15360M();
        EmptyList emptyList = EmptyList.f47638a;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(new vz2(str, false, true, emptyList, emptyList, emptyList, emptyList, mapM15360M, null));
        this.f32892p = c3244lM17114d;
        this.f32893q = AbstractC3224d.m15520B(new wz0(6, c3244lM17114d, this), lda.m16103C(this), xi9.f68262a, new a13("", emptyList, false, null));
        m9682Y2();
        AbstractC1263a.m7050e(new m83(AbstractC3224d.m15535n(AbstractC3224d.m15536o(new c13(c3244lM17114d, 0)), 600L), new FastSearchViewModel$2(this, null), 2), lda.m16103C(this), "queryDebounce");
    }

    /* JADX INFO: renamed from: V2 */
    public static LibraryTab m9679V2() {
        return new LibraryTab("Lessons", LibraryContentType.Lessons.getValue(), -1, true, 0, "/search/lessons");
    }

    /* JADX INFO: renamed from: W2 */
    public static LibraryShelf m9680W2() {
        return new LibraryShelf(vz1.m23605K(m9679V2(), new LibraryTab("Courses", LibraryContentType.Courses.getValue(), -1, true, 1, "/search/courses")), LibraryShelfType.Search.getValue());
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f32878b.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f32878b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f32878b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f32878b.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f32878b.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f32878b.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f32878b.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f32878b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f32878b.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f32878b.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f32878b.mo4581L0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f32878b.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f32878b.mo4583O1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f32878b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f32878b.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f32878b.mo4586T0();
    }

    @Override // p000.m68
    /* JADX INFO: renamed from: V */
    public final Object mo8941V(String str, int i, String str2, String str3, Continuation continuation) {
        return this.f32879c.mo8941V(str, i, str2, str3, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f32878b.mo4587X();
    }

    /* JADX INFO: renamed from: X2 */
    public final void m9681X2(n03 n03Var) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        n03Var.getClass();
        boolean z = n03Var instanceof j03;
        C3244l c3244l = this.f32892p;
        if (z) {
            do {
                value4 = c3244l.getValue();
            } while (!c3244l.m15570h(value4, vz2.m23657a((vz2) value4, ((j03) n03Var).f44836a, false, false, null, null, null, null, null, null, 510)));
            return;
        }
        if (n03Var.equals(k03.f46469a)) {
            m9682Y2();
            return;
        }
        boolean z2 = n03Var instanceof h03;
        nn1 nn1Var = this.f32890n;
        if (z2) {
            wfb.m23926u(lda.m16103C(this), nn1Var, null, new FastSearchViewModel$handleAction$2(this, n03Var, null), 2);
            return;
        }
        if (n03Var instanceof i03) {
            i03 i03Var = (i03) n03Var;
            int i = i03Var.f43276a;
            if (i03Var.f43277b) {
                AbstractC1263a.m7047b(lda.m16103C(this), nn1Var, ux5.m22988k(i, "updateSave "), new FastSearchViewModel$updateSave$1(this, i, true, null));
                return;
            } else {
                do {
                    value3 = c3244l.getValue();
                } while (!c3244l.m15570h(value3, vz2.m23657a((vz2) value3, null, false, false, null, null, null, null, null, Integer.valueOf(i), 255)));
                return;
            }
        }
        if (!n03Var.equals(l03.f48848a)) {
            if (!n03Var.equals(m03.f50377a)) {
                gm5.m12750e();
                return;
            } else {
                do {
                    value = c3244l.getValue();
                } while (!c3244l.m15570h(value, vz2.m23657a((vz2) value, null, false, false, null, null, null, null, null, null, 255)));
                return;
            }
        }
        Integer num = ((vz2) c3244l.getValue()).f66126i;
        if (num != null) {
            int iIntValue = num.intValue();
            do {
                value2 = c3244l.getValue();
            } while (!c3244l.m15570h(value2, vz2.m23657a((vz2) value2, null, false, false, null, null, null, null, null, null, 255)));
            AbstractC1263a.m7047b(lda.m16103C(this), nn1Var, ux5.m22988k(iIntValue, "updateSave "), new FastSearchViewModel$updateSave$1(this, iIntValue, false, null));
        }
    }

    /* JADX INFO: renamed from: Y2 */
    public final void m9682Y2() {
        Object value;
        EmptyList emptyList;
        C3244l c3244l = this.f32892p;
        final String str = ((vz2) c3244l.getValue()).f66118a;
        if (vk9.m23391n0(str)) {
            do {
                value = c3244l.getValue();
                emptyList = EmptyList.f47638a;
            } while (!c3244l.m15570h(value, vz2.m23657a((vz2) value, null, false, true, emptyList, emptyList, emptyList, emptyList, null, null, 385)));
            return;
        }
        cma cmaVar = this.f32878b;
        final String strMo4589b2 = cmaVar.mo4589b2();
        j23 j23Var = this.f32880d;
        j23Var.getClass();
        strMo4589b2.getClass();
        C1305u c1305u = (C1305u) j23Var.f44938a;
        c1305u.getClass();
        final np8 np8Var = c1305u.f16548b;
        np8Var.getClass();
        final int i = 1;
        m83 m83Var = new m83(new m83(AbstractC3224d.m15536o(new bx0(AbstractC3584sr.m21590A(np8Var.f53104K, true, new String[]{"LibraryFastSearchEntity", "LessonEntity"}, new vi3() { // from class: lp8
            @Override // p000.vi3
            public final Object invoke(Object obj) throws Exception {
                int i2;
                String strMo2875L;
                int i3;
                String strMo2875L2;
                int i4;
                String str2;
                int i5;
                String str3;
                int i6;
                String str4;
                int i7;
                String str5;
                int i8;
                String str6;
                Boolean boolValueOf;
                Boolean boolValueOf2;
                int i9 = i;
                np8 np8Var2 = np8Var;
                String str7 = str;
                String str8 = strMo4589b2;
                switch (i9) {
                    case 0:
                        bk8 bk8Var = (bk8) obj;
                        bk8Var.getClass();
                        ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("\n    SELECT LibraryDataEntity.* FROM LibraryFastSearchEntity, LibraryDataEntity WHERE \n    LibraryFastSearchEntity.language = ? AND LibraryFastSearchEntity.`query` = ? \n    AND LibraryFastSearchEntity.type = \"collection\" AND LibraryFastSearchEntity.id = LibraryDataEntity.id\n  ");
                        try {
                            ik8VarMo2873e0.mo2874C(1, str8);
                            ik8VarMo2873e0.mo2874C(2, str7);
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
                            np8 np8Var3 = np8Var2;
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
                                int i10 = iM14108v12;
                                int i11 = iM14108v13;
                                int i12 = (int) ik8VarMo2873e0.getLong(iM14108v);
                                String strMo2875L3 = ik8VarMo2873e0.mo2875L(iM14108v2);
                                String strMo2875L4 = ik8VarMo2873e0.isNull(iM14108v3) ? null : ik8VarMo2873e0.mo2875L(iM14108v3);
                                String strMo2875L5 = ik8VarMo2873e0.isNull(iM14108v4) ? null : ik8VarMo2873e0.mo2875L(iM14108v4);
                                int i13 = (int) ik8VarMo2873e0.getLong(iM14108v5);
                                String strMo2875L6 = ik8VarMo2873e0.isNull(iM14108v6) ? null : ik8VarMo2873e0.mo2875L(iM14108v6);
                                String strMo2875L7 = ik8VarMo2873e0.isNull(iM14108v7) ? null : ik8VarMo2873e0.mo2875L(iM14108v7);
                                String strMo2875L8 = ik8VarMo2873e0.isNull(iM14108v8) ? null : ik8VarMo2873e0.mo2875L(iM14108v8);
                                String strMo2875L9 = ik8VarMo2873e0.isNull(iM14108v9) ? null : ik8VarMo2873e0.mo2875L(iM14108v9);
                                String strMo2875L10 = ik8VarMo2873e0.isNull(iM14108v10) ? null : ik8VarMo2873e0.mo2875L(iM14108v10);
                                Integer numValueOf = ik8VarMo2873e0.isNull(iM14108v11) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(iM14108v11));
                                String strMo2875L11 = ik8VarMo2873e0.isNull(i10) ? null : ik8VarMo2873e0.mo2875L(i10);
                                String strMo2875L12 = ik8VarMo2873e0.isNull(i11) ? null : ik8VarMo2873e0.mo2875L(i11);
                                if (ik8VarMo2873e0.isNull(iM14108v14)) {
                                    i2 = iM14108v;
                                    strMo2875L = null;
                                } else {
                                    i2 = iM14108v;
                                    strMo2875L = ik8VarMo2873e0.mo2875L(iM14108v14);
                                }
                                if (ik8VarMo2873e0.isNull(iM14108v15)) {
                                    i3 = iM14108v16;
                                    strMo2875L2 = null;
                                } else {
                                    i3 = iM14108v16;
                                    strMo2875L2 = ik8VarMo2873e0.mo2875L(iM14108v15);
                                }
                                if (ik8VarMo2873e0.isNull(i3)) {
                                    i4 = iM14108v17;
                                    str2 = null;
                                } else {
                                    String strMo2875L13 = ik8VarMo2873e0.mo2875L(i3);
                                    i4 = iM14108v17;
                                    str2 = strMo2875L13;
                                }
                                if (ik8VarMo2873e0.isNull(i4)) {
                                    i5 = iM14108v18;
                                    str3 = null;
                                } else {
                                    String strMo2875L14 = ik8VarMo2873e0.mo2875L(i4);
                                    i5 = iM14108v18;
                                    str3 = strMo2875L14;
                                }
                                if (ik8VarMo2873e0.isNull(i5)) {
                                    i6 = iM14108v19;
                                    str4 = null;
                                } else {
                                    String strMo2875L15 = ik8VarMo2873e0.mo2875L(i5);
                                    i6 = iM14108v19;
                                    str4 = strMo2875L15;
                                }
                                if (ik8VarMo2873e0.isNull(i6)) {
                                    i7 = iM14108v20;
                                    str5 = null;
                                } else {
                                    String strMo2875L16 = ik8VarMo2873e0.mo2875L(i6);
                                    i7 = iM14108v20;
                                    str5 = strMo2875L16;
                                }
                                if (ik8VarMo2873e0.isNull(i7)) {
                                    i8 = iM14108v21;
                                    str6 = null;
                                } else {
                                    String strMo2875L17 = ik8VarMo2873e0.mo2875L(i7);
                                    i8 = iM14108v21;
                                    str6 = strMo2875L17;
                                }
                                int i14 = (int) ik8VarMo2873e0.getLong(i8);
                                int i15 = iM14108v22;
                                int i16 = (int) ik8VarMo2873e0.getLong(i15);
                                int i17 = iM14108v23;
                                String strMo2875L18 = ik8VarMo2873e0.isNull(i17) ? null : ik8VarMo2873e0.mo2875L(i17);
                                int i18 = iM14108v24;
                                int i19 = (int) ik8VarMo2873e0.getLong(i18);
                                int i20 = iM14108v25;
                                int i21 = (int) ik8VarMo2873e0.getLong(i20);
                                int i22 = iM14108v26;
                                int i23 = (int) ik8VarMo2873e0.getLong(i22);
                                int i24 = iM14108v27;
                                Integer numValueOf2 = ik8VarMo2873e0.isNull(i24) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(i24));
                                int i25 = iM14108v28;
                                Integer numValueOf3 = ik8VarMo2873e0.isNull(i25) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(i25));
                                int i26 = iM14108v29;
                                String strMo2875L19 = ik8VarMo2873e0.isNull(i26) ? null : ik8VarMo2873e0.mo2875L(i26);
                                int i27 = iM14108v30;
                                double d = ik8VarMo2873e0.getDouble(i27);
                                iM14108v29 = i26;
                                iM14108v30 = i27;
                                int i28 = iM14108v31;
                                boolean z = ((int) ik8VarMo2873e0.getLong(i28)) != 0;
                                int i29 = iM14108v32;
                                iM14108v31 = i28;
                                np8 np8Var4 = np8Var3;
                                List listM20058M = np8Var4.f53106M.m20058M(ik8VarMo2873e0.isNull(i29) ? null : ik8VarMo2873e0.mo2875L(i29));
                                int i30 = iM14108v33;
                                String strMo2875L20 = ik8VarMo2873e0.isNull(i30) ? null : ik8VarMo2873e0.mo2875L(i30);
                                int i31 = iM14108v34;
                                List listM20058M2 = np8Var4.f53106M.m20058M(ik8VarMo2873e0.isNull(i31) ? null : ik8VarMo2873e0.mo2875L(i31));
                                int i32 = iM14108v35;
                                Float fValueOf = ik8VarMo2873e0.isNull(i32) ? null : Float.valueOf((float) ik8VarMo2873e0.getDouble(i32));
                                int i33 = iM14108v36;
                                Integer numValueOf4 = ik8VarMo2873e0.isNull(i33) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(i33));
                                if (numValueOf4 != null) {
                                    boolValueOf = Boolean.valueOf(numValueOf4.intValue() != 0);
                                } else {
                                    boolValueOf = null;
                                }
                                int i34 = iM14108v37;
                                String strMo2875L21 = ik8VarMo2873e0.mo2875L(i34);
                                int i35 = iM14108v38;
                                String strMo2875L22 = ik8VarMo2873e0.isNull(i35) ? null : ik8VarMo2873e0.mo2875L(i35);
                                int i36 = iM14108v39;
                                String strMo2875L23 = ik8VarMo2873e0.isNull(i36) ? null : ik8VarMo2873e0.mo2875L(i36);
                                iM14108v39 = i36;
                                int i37 = iM14108v40;
                                double d2 = ik8VarMo2873e0.getDouble(i37);
                                iM14108v40 = i37;
                                int i38 = iM14108v41;
                                double d3 = ik8VarMo2873e0.getDouble(i38);
                                iM14108v41 = i38;
                                int i39 = iM14108v42;
                                boolean z2 = ((int) ik8VarMo2873e0.getLong(i39)) != 0;
                                int i40 = iM14108v43;
                                boolean z3 = ((int) ik8VarMo2873e0.getLong(i40)) != 0;
                                int i41 = iM14108v44;
                                String strMo2875L24 = ik8VarMo2873e0.isNull(i41) ? null : ik8VarMo2873e0.mo2875L(i41);
                                int i42 = iM14108v45;
                                String strMo2875L25 = ik8VarMo2873e0.isNull(i42) ? null : ik8VarMo2873e0.mo2875L(i42);
                                int i43 = iM14108v46;
                                String strMo2875L26 = ik8VarMo2873e0.isNull(i43) ? null : ik8VarMo2873e0.mo2875L(i43);
                                iM14108v46 = i43;
                                int i44 = iM14108v47;
                                Integer numValueOf5 = ik8VarMo2873e0.isNull(i44) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(i44));
                                if (numValueOf5 != null) {
                                    boolValueOf2 = Boolean.valueOf(numValueOf5.intValue() != 0);
                                } else {
                                    boolValueOf2 = null;
                                }
                                int i45 = iM14108v48;
                                int i46 = iM14108v49;
                                arrayList.add(new u85(i12, strMo2875L3, strMo2875L4, strMo2875L5, i13, strMo2875L6, strMo2875L7, strMo2875L8, strMo2875L9, strMo2875L10, numValueOf, strMo2875L11, strMo2875L12, strMo2875L, strMo2875L2, str2, str3, str4, str5, str6, i14, i16, strMo2875L18, i19, i21, i23, numValueOf2, numValueOf3, strMo2875L19, d, z, listM20058M, strMo2875L20, listM20058M2, fValueOf, boolValueOf, strMo2875L21, strMo2875L22, strMo2875L23, d2, d3, z2, z3, strMo2875L24, strMo2875L25, strMo2875L26, boolValueOf2, ik8VarMo2873e0.isNull(i45) ? null : ik8VarMo2873e0.mo2875L(i45), ((int) ik8VarMo2873e0.getLong(i46)) != 0));
                                iM14108v = i2;
                                iM14108v15 = iM14108v15;
                                iM14108v16 = i3;
                                iM14108v17 = i4;
                                iM14108v18 = i5;
                                iM14108v19 = i6;
                                iM14108v20 = i7;
                                iM14108v21 = i8;
                                iM14108v23 = i17;
                                iM14108v25 = i20;
                                iM14108v26 = i22;
                                iM14108v27 = i24;
                                iM14108v36 = i33;
                                iM14108v42 = i39;
                                iM14108v44 = i41;
                                iM14108v47 = i44;
                                iM14108v34 = i31;
                                iM14108v33 = i30;
                                iM14108v3 = iM14108v3;
                                iM14108v32 = i29;
                                iM14108v12 = i10;
                                iM14108v22 = i15;
                                iM14108v24 = i18;
                                iM14108v28 = i25;
                                np8Var3 = np8Var4;
                                iM14108v35 = i32;
                                iM14108v37 = i34;
                                iM14108v43 = i40;
                                iM14108v38 = i35;
                                iM14108v45 = i42;
                                iM14108v4 = iM14108v4;
                                iM14108v13 = i11;
                                iM14108v48 = i45;
                                iM14108v49 = i46;
                                iM14108v2 = iM14108v2;
                                iM14108v14 = iM14108v14;
                                break;
                            }
                            return arrayList;
                        } finally {
                            ik8VarMo2873e0.close();
                        }
                    default:
                        return np8.m17579y0(str8, str7, np8Var2, (bk8) obj);
                }
            }
        }), 22)), new FastSearchViewModel$observeLessons$1(this, null)), new FastSearchViewModel$observeLessons$2(this, null), 2);
        g41 g41VarM16103C = lda.m16103C(this);
        nn1 nn1Var = this.f32890n;
        AbstractC1263a.m7049d(m83Var, g41VarM16103C, "observeLessons", nn1Var);
        String strMo4589b3 = cmaVar.mo4589b2();
        i23 i23Var = this.f32881e;
        i23Var.getClass();
        strMo4589b3.getClass();
        C1305u c1305u2 = (C1305u) i23Var.f43380a;
        c1305u2.getClass();
        np8 np8Var2 = c1305u2.f16548b;
        np8Var2.getClass();
        AbstractC1263a.m7049d(new m83(AbstractC3224d.m15536o(AbstractC3584sr.m21590A(np8Var2.f53104K, true, new String[]{"LibraryCounterEntity", "LibraryFastSearchEntity"}, new md0(strMo4589b3, 17, str))), new FastSearchViewModel$observeLessonCounters$1(this, null), 2), lda.m16103C(this), "observeLessonCounters", nn1Var);
        final String strMo4589b4 = cmaVar.mo4589b2();
        ck6 ck6Var = this.f32882f;
        ck6Var.getClass();
        strMo4589b4.getClass();
        C1305u c1305u3 = (C1305u) ((cr8) ck6Var.f10194b);
        c1305u3.getClass();
        final np8 np8Var3 = c1305u3.f16548b;
        np8Var3.getClass();
        final int i2 = 0;
        AbstractC1263a.m7049d(new m83(new m83(AbstractC3224d.m15536o(new bx0(AbstractC3584sr.m21590A(np8Var3.f53104K, true, new String[]{"LibraryFastSearchEntity", "LibraryDataEntity"}, new vi3() { // from class: lp8
            @Override // p000.vi3
            public final Object invoke(Object obj) throws Exception {
                int i3;
                String strMo2875L;
                int i4;
                String strMo2875L2;
                int i5;
                String str2;
                int i6;
                String str3;
                int i7;
                String str4;
                int i8;
                String str5;
                int i9;
                String str6;
                Boolean boolValueOf;
                Boolean boolValueOf2;
                int i10 = i2;
                np8 np8Var4 = np8Var3;
                String str7 = str;
                String str8 = strMo4589b4;
                switch (i10) {
                    case 0:
                        bk8 bk8Var = (bk8) obj;
                        bk8Var.getClass();
                        ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("\n    SELECT LibraryDataEntity.* FROM LibraryFastSearchEntity, LibraryDataEntity WHERE \n    LibraryFastSearchEntity.language = ? AND LibraryFastSearchEntity.`query` = ? \n    AND LibraryFastSearchEntity.type = \"collection\" AND LibraryFastSearchEntity.id = LibraryDataEntity.id\n  ");
                        try {
                            ik8VarMo2873e0.mo2874C(1, str8);
                            ik8VarMo2873e0.mo2874C(2, str7);
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
                            np8 np8Var5 = np8Var4;
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
                                int i11 = iM14108v12;
                                int i12 = iM14108v13;
                                int i13 = (int) ik8VarMo2873e0.getLong(iM14108v);
                                String strMo2875L3 = ik8VarMo2873e0.mo2875L(iM14108v2);
                                String strMo2875L4 = ik8VarMo2873e0.isNull(iM14108v3) ? null : ik8VarMo2873e0.mo2875L(iM14108v3);
                                String strMo2875L5 = ik8VarMo2873e0.isNull(iM14108v4) ? null : ik8VarMo2873e0.mo2875L(iM14108v4);
                                int i14 = (int) ik8VarMo2873e0.getLong(iM14108v5);
                                String strMo2875L6 = ik8VarMo2873e0.isNull(iM14108v6) ? null : ik8VarMo2873e0.mo2875L(iM14108v6);
                                String strMo2875L7 = ik8VarMo2873e0.isNull(iM14108v7) ? null : ik8VarMo2873e0.mo2875L(iM14108v7);
                                String strMo2875L8 = ik8VarMo2873e0.isNull(iM14108v8) ? null : ik8VarMo2873e0.mo2875L(iM14108v8);
                                String strMo2875L9 = ik8VarMo2873e0.isNull(iM14108v9) ? null : ik8VarMo2873e0.mo2875L(iM14108v9);
                                String strMo2875L10 = ik8VarMo2873e0.isNull(iM14108v10) ? null : ik8VarMo2873e0.mo2875L(iM14108v10);
                                Integer numValueOf = ik8VarMo2873e0.isNull(iM14108v11) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(iM14108v11));
                                String strMo2875L11 = ik8VarMo2873e0.isNull(i11) ? null : ik8VarMo2873e0.mo2875L(i11);
                                String strMo2875L12 = ik8VarMo2873e0.isNull(i12) ? null : ik8VarMo2873e0.mo2875L(i12);
                                if (ik8VarMo2873e0.isNull(iM14108v14)) {
                                    i3 = iM14108v;
                                    strMo2875L = null;
                                } else {
                                    i3 = iM14108v;
                                    strMo2875L = ik8VarMo2873e0.mo2875L(iM14108v14);
                                }
                                if (ik8VarMo2873e0.isNull(iM14108v15)) {
                                    i4 = iM14108v16;
                                    strMo2875L2 = null;
                                } else {
                                    i4 = iM14108v16;
                                    strMo2875L2 = ik8VarMo2873e0.mo2875L(iM14108v15);
                                }
                                if (ik8VarMo2873e0.isNull(i4)) {
                                    i5 = iM14108v17;
                                    str2 = null;
                                } else {
                                    String strMo2875L13 = ik8VarMo2873e0.mo2875L(i4);
                                    i5 = iM14108v17;
                                    str2 = strMo2875L13;
                                }
                                if (ik8VarMo2873e0.isNull(i5)) {
                                    i6 = iM14108v18;
                                    str3 = null;
                                } else {
                                    String strMo2875L14 = ik8VarMo2873e0.mo2875L(i5);
                                    i6 = iM14108v18;
                                    str3 = strMo2875L14;
                                }
                                if (ik8VarMo2873e0.isNull(i6)) {
                                    i7 = iM14108v19;
                                    str4 = null;
                                } else {
                                    String strMo2875L15 = ik8VarMo2873e0.mo2875L(i6);
                                    i7 = iM14108v19;
                                    str4 = strMo2875L15;
                                }
                                if (ik8VarMo2873e0.isNull(i7)) {
                                    i8 = iM14108v20;
                                    str5 = null;
                                } else {
                                    String strMo2875L16 = ik8VarMo2873e0.mo2875L(i7);
                                    i8 = iM14108v20;
                                    str5 = strMo2875L16;
                                }
                                if (ik8VarMo2873e0.isNull(i8)) {
                                    i9 = iM14108v21;
                                    str6 = null;
                                } else {
                                    String strMo2875L17 = ik8VarMo2873e0.mo2875L(i8);
                                    i9 = iM14108v21;
                                    str6 = strMo2875L17;
                                }
                                int i15 = (int) ik8VarMo2873e0.getLong(i9);
                                int i16 = iM14108v22;
                                int i17 = (int) ik8VarMo2873e0.getLong(i16);
                                int i18 = iM14108v23;
                                String strMo2875L18 = ik8VarMo2873e0.isNull(i18) ? null : ik8VarMo2873e0.mo2875L(i18);
                                int i19 = iM14108v24;
                                int i110 = (int) ik8VarMo2873e0.getLong(i19);
                                int i20 = iM14108v25;
                                int i21 = (int) ik8VarMo2873e0.getLong(i20);
                                int i22 = iM14108v26;
                                int i23 = (int) ik8VarMo2873e0.getLong(i22);
                                int i24 = iM14108v27;
                                Integer numValueOf2 = ik8VarMo2873e0.isNull(i24) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(i24));
                                int i25 = iM14108v28;
                                Integer numValueOf3 = ik8VarMo2873e0.isNull(i25) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(i25));
                                int i26 = iM14108v29;
                                String strMo2875L19 = ik8VarMo2873e0.isNull(i26) ? null : ik8VarMo2873e0.mo2875L(i26);
                                int i27 = iM14108v30;
                                double d = ik8VarMo2873e0.getDouble(i27);
                                iM14108v29 = i26;
                                iM14108v30 = i27;
                                int i28 = iM14108v31;
                                boolean z = ((int) ik8VarMo2873e0.getLong(i28)) != 0;
                                int i29 = iM14108v32;
                                iM14108v31 = i28;
                                np8 np8Var6 = np8Var5;
                                List listM20058M = np8Var6.f53106M.m20058M(ik8VarMo2873e0.isNull(i29) ? null : ik8VarMo2873e0.mo2875L(i29));
                                int i30 = iM14108v33;
                                String strMo2875L20 = ik8VarMo2873e0.isNull(i30) ? null : ik8VarMo2873e0.mo2875L(i30);
                                int i31 = iM14108v34;
                                List listM20058M2 = np8Var6.f53106M.m20058M(ik8VarMo2873e0.isNull(i31) ? null : ik8VarMo2873e0.mo2875L(i31));
                                int i32 = iM14108v35;
                                Float fValueOf = ik8VarMo2873e0.isNull(i32) ? null : Float.valueOf((float) ik8VarMo2873e0.getDouble(i32));
                                int i33 = iM14108v36;
                                Integer numValueOf4 = ik8VarMo2873e0.isNull(i33) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(i33));
                                if (numValueOf4 != null) {
                                    boolValueOf = Boolean.valueOf(numValueOf4.intValue() != 0);
                                } else {
                                    boolValueOf = null;
                                }
                                int i34 = iM14108v37;
                                String strMo2875L21 = ik8VarMo2873e0.mo2875L(i34);
                                int i35 = iM14108v38;
                                String strMo2875L22 = ik8VarMo2873e0.isNull(i35) ? null : ik8VarMo2873e0.mo2875L(i35);
                                int i36 = iM14108v39;
                                String strMo2875L23 = ik8VarMo2873e0.isNull(i36) ? null : ik8VarMo2873e0.mo2875L(i36);
                                iM14108v39 = i36;
                                int i37 = iM14108v40;
                                double d2 = ik8VarMo2873e0.getDouble(i37);
                                iM14108v40 = i37;
                                int i38 = iM14108v41;
                                double d3 = ik8VarMo2873e0.getDouble(i38);
                                iM14108v41 = i38;
                                int i39 = iM14108v42;
                                boolean z2 = ((int) ik8VarMo2873e0.getLong(i39)) != 0;
                                int i40 = iM14108v43;
                                boolean z3 = ((int) ik8VarMo2873e0.getLong(i40)) != 0;
                                int i41 = iM14108v44;
                                String strMo2875L24 = ik8VarMo2873e0.isNull(i41) ? null : ik8VarMo2873e0.mo2875L(i41);
                                int i42 = iM14108v45;
                                String strMo2875L25 = ik8VarMo2873e0.isNull(i42) ? null : ik8VarMo2873e0.mo2875L(i42);
                                int i43 = iM14108v46;
                                String strMo2875L26 = ik8VarMo2873e0.isNull(i43) ? null : ik8VarMo2873e0.mo2875L(i43);
                                iM14108v46 = i43;
                                int i44 = iM14108v47;
                                Integer numValueOf5 = ik8VarMo2873e0.isNull(i44) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(i44));
                                if (numValueOf5 != null) {
                                    boolValueOf2 = Boolean.valueOf(numValueOf5.intValue() != 0);
                                } else {
                                    boolValueOf2 = null;
                                }
                                int i45 = iM14108v48;
                                int i46 = iM14108v49;
                                arrayList.add(new u85(i13, strMo2875L3, strMo2875L4, strMo2875L5, i14, strMo2875L6, strMo2875L7, strMo2875L8, strMo2875L9, strMo2875L10, numValueOf, strMo2875L11, strMo2875L12, strMo2875L, strMo2875L2, str2, str3, str4, str5, str6, i15, i17, strMo2875L18, i110, i21, i23, numValueOf2, numValueOf3, strMo2875L19, d, z, listM20058M, strMo2875L20, listM20058M2, fValueOf, boolValueOf, strMo2875L21, strMo2875L22, strMo2875L23, d2, d3, z2, z3, strMo2875L24, strMo2875L25, strMo2875L26, boolValueOf2, ik8VarMo2873e0.isNull(i45) ? null : ik8VarMo2873e0.mo2875L(i45), ((int) ik8VarMo2873e0.getLong(i46)) != 0));
                                iM14108v = i3;
                                iM14108v15 = iM14108v15;
                                iM14108v16 = i4;
                                iM14108v17 = i5;
                                iM14108v18 = i6;
                                iM14108v19 = i7;
                                iM14108v20 = i8;
                                iM14108v21 = i9;
                                iM14108v23 = i18;
                                iM14108v25 = i20;
                                iM14108v26 = i22;
                                iM14108v27 = i24;
                                iM14108v36 = i33;
                                iM14108v42 = i39;
                                iM14108v44 = i41;
                                iM14108v47 = i44;
                                iM14108v34 = i31;
                                iM14108v33 = i30;
                                iM14108v3 = iM14108v3;
                                iM14108v32 = i29;
                                iM14108v12 = i11;
                                iM14108v22 = i16;
                                iM14108v24 = i19;
                                iM14108v28 = i25;
                                np8Var5 = np8Var6;
                                iM14108v35 = i32;
                                iM14108v37 = i34;
                                iM14108v43 = i40;
                                iM14108v38 = i35;
                                iM14108v45 = i42;
                                iM14108v4 = iM14108v4;
                                iM14108v13 = i12;
                                iM14108v48 = i45;
                                iM14108v49 = i46;
                                iM14108v2 = iM14108v2;
                                iM14108v14 = iM14108v14;
                                break;
                            }
                            return arrayList;
                        } finally {
                            ik8VarMo2873e0.close();
                        }
                    default:
                        return np8.m17579y0(str8, str7, np8Var4, (bk8) obj);
                }
            }
        }), 20)), new FastSearchViewModel$observeCourses$1(this, null)), new FastSearchViewModel$observeCourses$2(this, null), 2), lda.m16103C(this), "observeCourses", nn1Var);
        String strMo4589b5 = cmaVar.mo4589b2();
        web webVar = this.f32883g;
        webVar.getClass();
        strMo4589b5.getClass();
        C1305u c1305u4 = (C1305u) ((cr8) webVar.f66742a);
        c1305u4.getClass();
        np8 np8Var4 = c1305u4.f16548b;
        np8Var4.getClass();
        AbstractC1263a.m7049d(new m83(AbstractC3224d.m15536o(new bx0(AbstractC3584sr.m21590A(np8Var4.f53104K, true, new String[]{"LibraryFastSearchEntity"}, new md0(strMo4589b5, 16, str)), 21)), new FastSearchViewModel$observeExtraData$1(this, null), 2), lda.m16103C(this), "observeExtraData", nn1Var);
        AbstractC1263a.m7047b(lda.m16103C(this), nn1Var, "fetchFastSearchNetwork", new FastSearchViewModel$fetchFromNetwork$1(this, str, null));
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f32878b.mo4588a0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f32878b.mo4589b2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f32878b.mo4590d0();
    }

    @Override // p000.m68
    /* JADX INFO: renamed from: f0 */
    public final void mo8951f0(String str, int i, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.f32879c.mo8951f0(str, i, str2, str3);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f32878b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.m68
    /* JADX INFO: renamed from: m */
    public final Object mo8953m(String str, int i, String str2, String str3, Continuation continuation) {
        return this.f32879c.mo8953m(str, i, str2, str3, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f32878b.mo4592m0();
    }

    @Override // p000.m68
    /* JADX INFO: renamed from: p */
    public final void mo8954p(String str, int i, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.f32879c.mo8954p(str, i, str2, str3);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f32878b.mo4593p0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f32878b.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f32878b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f32878b.mo4596t();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f32878b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f32878b.mo4598w2();
    }
}
