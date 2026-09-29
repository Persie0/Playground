package com.lingq.core.database.dao;

import androidx.room.AbstractC0746d;
import androidx.room.util.AbstractC0758a;
import com.lingq.core.database.entity.LibraryCounterEntity;
import com.lingq.core.domain.model.library.LibraryItemType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3393o1;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.C3485q5;
import p000.bl2;
import p000.bq1;
import p000.d32;
import p000.f85;
import p000.h85;
import p000.i85;
import p000.i93;
import p000.l85;
import p000.ld0;
import p000.m05;
import p000.mv0;
import p000.ov0;
import p000.p85;
import p000.q85;
import p000.qn3;
import p000.r85;
import p000.s85;
import p000.sv0;
import p000.t85;
import p000.u85;
import p000.ux5;
import p000.vi3;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.core.database.dao.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1321i extends bq1 {
    public static final t85 Companion = new t85();

    /* JADX INFO: renamed from: K */
    public final AbstractC0746d f17034K;

    /* JADX INFO: renamed from: N */
    public final bl2 f17037N;

    /* JADX INFO: renamed from: P */
    public final bl2 f17039P;

    /* JADX INFO: renamed from: Q */
    public final bl2 f17040Q;

    /* JADX INFO: renamed from: R */
    public final bl2 f17041R;

    /* JADX INFO: renamed from: S */
    public final bl2 f17042S;

    /* JADX INFO: renamed from: T */
    public final bl2 f17043T;

    /* JADX INFO: renamed from: U */
    public final bl2 f17044U;

    /* JADX INFO: renamed from: O */
    public final qn3 f17038O = new qn3(20);

    /* JADX INFO: renamed from: L */
    public final p85 f17035L = new p85(4);

    /* JADX INFO: renamed from: M */
    public final p85 f17036M = new p85(5);

    public C1321i(AbstractC0746d abstractC0746d) {
        this.f17034K = abstractC0746d;
        int i = 0;
        this.f17037N = new bl2(new r85(this, i), new s85(this, i));
        int i2 = 1;
        this.f17039P = new bl2(new r85(this, i2), new s85(this, i2));
        int i3 = 3;
        this.f17040Q = new bl2(new q85(i3), new p85(6));
        this.f17041R = new bl2(new sv0(29), new p85(i));
        this.f17042S = new bl2(new q85(i), new p85(i2));
        q85 q85Var = new q85(i2);
        int i4 = 2;
        this.f17043T = new bl2(q85Var, new p85(i4));
        this.f17044U = new bl2(new q85(i4), new p85(i3));
    }

    /* JADX INFO: renamed from: B0 */
    public static Object m7501B0(C1321i c1321i, int i, ContinuationImpl continuationImpl) {
        String value = LibraryItemType.Content.getValue();
        return AbstractC0758a.m2861d(new ld0(i, value, 12), c1321i.f17034K, continuationImpl, true, true);
    }

    /* JADX INFO: renamed from: H0 */
    public static i93 m7502H0(C1321i c1321i, List list) {
        String value = LibraryItemType.Content.getValue();
        c1321i.getClass();
        value.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("\n            SELECT DISTINCT LibraryDataEntity.id, Count(*) as downloadProgress, LibraryDownloadEntity.isDownloaded\n            FROM LibraryDataEntity, LibraryDownloadEntity\n            INNER JOIN CoursesAndLessonsJoin ON LibraryDataEntity.collectionId = CoursesAndLessonsJoin.pk AND LibraryDataEntity.id = CoursesAndLessonsJoin.contentId \n            WHERE LibraryDownloadEntity.id = LibraryDataEntity.id AND LibraryDownloadEntity.isDownloaded = 1 AND LibraryDataEntity.collectionId in (");
        int size = list.size();
        d32.m10005B(size, sb);
        sb.append(") AND LibraryDataEntity.type = ");
        sb.append("?");
        sb.append(" AND LibraryDownloadEntity.type = ");
        AbstractC3393o1.m17725C(sb, "?", "\n", "            GROUP BY LibraryDataEntity.id", "\n");
        sb.append("    ");
        return AbstractC3584sr.m21590A(c1321i.f17034K, true, new String[]{"LibraryDataEntity", "LibraryDownloadEntity", "CoursesAndLessonsJoin"}, new i85(sb.toString(), list, size, value, 1));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: z0 */
    public static Object m7503z0(C1321i c1321i, final int i, final List list, ContinuationImpl continuationImpl) throws Throwable {
        LibraryDao$deleteLessonsFromCourse$1 libraryDao$deleteLessonsFromCourse$1;
        final List list2;
        C1321i c1321i2;
        int i2;
        if (continuationImpl instanceof LibraryDao$deleteLessonsFromCourse$1) {
            libraryDao$deleteLessonsFromCourse$1 = (LibraryDao$deleteLessonsFromCourse$1) continuationImpl;
            int i3 = libraryDao$deleteLessonsFromCourse$1.f16975f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                libraryDao$deleteLessonsFromCourse$1.f16975f = i3 - Integer.MIN_VALUE;
            } else {
                libraryDao$deleteLessonsFromCourse$1 = new LibraryDao$deleteLessonsFromCourse$1(c1321i, continuationImpl);
            }
        } else {
            libraryDao$deleteLessonsFromCourse$1 = new LibraryDao$deleteLessonsFromCourse$1(c1321i, continuationImpl);
        }
        Object obj = libraryDao$deleteLessonsFromCourse$1.f16973d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = libraryDao$deleteLessonsFromCourse$1.f16975f;
        xfa xfaVar = xfa.f68157a;
        if (i4 == 0) {
            AbstractC3193b.m15359b(obj);
            libraryDao$deleteLessonsFromCourse$1.f16970a = c1321i;
            libraryDao$deleteLessonsFromCourse$1.f16971b = list;
            libraryDao$deleteLessonsFromCourse$1.f16972c = i;
            libraryDao$deleteLessonsFromCourse$1.f16975f = 1;
            StringBuilder sbM22997t = ux5.m22997t("DELETE FROM CoursesAndLessonsJoin WHERE contentId in (");
            final int size = list.size();
            d32.m10005B(size, sbM22997t);
            sbM22997t.append(") AND pk = ");
            sbM22997t.append("?");
            final String string = sbM22997t.toString();
            final int i5 = 1;
            Object objM2861d = AbstractC0758a.m2861d(new vi3() { // from class: g85
                @Override // p000.vi3
                public final Object invoke(Object obj2) throws Exception {
                    int i6 = i5;
                    xfa xfaVar2 = xfa.f68157a;
                    int i7 = i;
                    int i8 = size;
                    List list3 = list;
                    String str = string;
                    bk8 bk8Var = (bk8) obj2;
                    switch (i6) {
                        case 0:
                            bk8Var.getClass();
                            ik8 ik8VarMo2873e0 = bk8Var.mo2873e0(str);
                            try {
                                Iterator it = list3.iterator();
                                int i9 = 1;
                                while (it.hasNext()) {
                                    ik8VarMo2873e0.mo2878j(i9, ((Number) it.next()).intValue());
                                    i9++;
                                }
                                ik8VarMo2873e0.mo2878j(i8 + 1, i7);
                                ik8VarMo2873e0.mo2876a0();
                                return xfaVar2;
                            } finally {
                                ik8VarMo2873e0.close();
                            }
                        default:
                            bk8Var.getClass();
                            ik8 ik8VarMo2873e1 = bk8Var.mo2873e0(str);
                            try {
                                Iterator it2 = list3.iterator();
                                int i10 = 1;
                                while (it2.hasNext()) {
                                    ik8VarMo2873e1.mo2878j(i10, ((Number) it2.next()).intValue());
                                    i10++;
                                }
                                ik8VarMo2873e1.mo2878j(i8 + 1, i7);
                                ik8VarMo2873e1.mo2876a0();
                                return xfaVar2;
                            } finally {
                                ik8VarMo2873e1.close();
                            }
                    }
                }
            }, c1321i.f17034K, libraryDao$deleteLessonsFromCourse$1, false, true);
            if (objM2861d != coroutineSingletons) {
                objM2861d = xfaVar;
            }
            if (objM2861d != coroutineSingletons) {
                list2 = list;
                c1321i2 = c1321i;
                i2 = i;
            }
        }
        if (i4 != 1) {
            if (i4 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list3 = libraryDao$deleteLessonsFromCourse$1.f16971b;
            AbstractC3193b.m15359b(obj);
            return xfaVar;
        }
        i2 = libraryDao$deleteLessonsFromCourse$1.f16972c;
        List list4 = libraryDao$deleteLessonsFromCourse$1.f16971b;
        c1321i2 = libraryDao$deleteLessonsFromCourse$1.f16970a;
        AbstractC3193b.m15359b(obj);
        list2 = list4;
        libraryDao$deleteLessonsFromCourse$1.f16970a = null;
        libraryDao$deleteLessonsFromCourse$1.f16971b = null;
        libraryDao$deleteLessonsFromCourse$1.f16972c = i2;
        libraryDao$deleteLessonsFromCourse$1.f16975f = 2;
        c1321i2.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM CoursesAndLessonsSortJoin WHERE contentId in (");
        final int size2 = list2.size();
        d32.m10005B(size2, sb);
        sb.append(") AND pk = ");
        sb.append("?");
        final String string2 = sb.toString();
        final int i6 = 0;
        final int i7 = i2;
        Object objM2861d2 = AbstractC0758a.m2861d(new vi3() { // from class: g85
            @Override // p000.vi3
            public final Object invoke(Object obj2) throws Exception {
                int i8 = i6;
                xfa xfaVar2 = xfa.f68157a;
                int i9 = i7;
                int i10 = size2;
                List list5 = list2;
                String str = string2;
                bk8 bk8Var = (bk8) obj2;
                switch (i8) {
                    case 0:
                        bk8Var.getClass();
                        ik8 ik8VarMo2873e0 = bk8Var.mo2873e0(str);
                        try {
                            Iterator it = list5.iterator();
                            int i11 = 1;
                            while (it.hasNext()) {
                                ik8VarMo2873e0.mo2878j(i11, ((Number) it.next()).intValue());
                                i11++;
                            }
                            ik8VarMo2873e0.mo2878j(i10 + 1, i9);
                            ik8VarMo2873e0.mo2876a0();
                            return xfaVar2;
                        } finally {
                            ik8VarMo2873e0.close();
                        }
                    default:
                        bk8Var.getClass();
                        ik8 ik8VarMo2873e1 = bk8Var.mo2873e0(str);
                        try {
                            Iterator it2 = list5.iterator();
                            int i12 = 1;
                            while (it2.hasNext()) {
                                ik8VarMo2873e1.mo2878j(i12, ((Number) it2.next()).intValue());
                                i12++;
                            }
                            ik8VarMo2873e1.mo2878j(i10 + 1, i9);
                            ik8VarMo2873e1.mo2876a0();
                            return xfaVar2;
                        } finally {
                            ik8VarMo2873e1.close();
                        }
                }
            }
        }, c1321i2.f17034K, libraryDao$deleteLessonsFromCourse$1, false, true);
        if (objM2861d2 != coroutineSingletons) {
            objM2861d2 = xfaVar;
        }
        return objM2861d2 == coroutineSingletons ? coroutineSingletons : xfaVar;
    }

    /* JADX INFO: renamed from: A0 */
    public final Object m7504A0(ArrayList arrayList, SuspendLambda suspendLambda) {
        Object objM2861d = AbstractC0758a.m2861d(new m05(1, AbstractC3393o1.m17736k(")", ux5.m22997t("DELETE FROM LibraryDataEntity WHERE id in ("), arrayList), arrayList), this.f17034K, suspendLambda, false, true);
        return objM2861d == CoroutineSingletons.COROUTINE_SUSPENDED ? objM2861d : xfa.f68157a;
    }

    /* JADX INFO: renamed from: C0 */
    public final Object m7505C0(int i, ContinuationImpl continuationImpl) {
        return AbstractC0758a.m2861d(new l85(i, this, 1), this.f17034K, continuationImpl, true, false);
    }

    /* JADX INFO: renamed from: D0 */
    public final Object m7506D0(int i, String str, ContinuationImpl continuationImpl) {
        return AbstractC0758a.m2861d(new ov0(i, str), this.f17034K, continuationImpl, true, false);
    }

    /* JADX INFO: renamed from: E0 */
    public final Object m7507E0(String str, String str2, ContinuationImpl continuationImpl) {
        return AbstractC0758a.m2861d(new C3485q5(str, str2, this, 24), this.f17034K, continuationImpl, true, false);
    }

    /* JADX INFO: renamed from: F0 */
    public final Object m7508F0(List list, ContinuationImpl continuationImpl) {
        Object objM2861d = AbstractC0758a.m2861d(new f85(this, list, 1), this.f17034K, continuationImpl, false, true);
        return objM2861d == CoroutineSingletons.COROUTINE_SUSPENDED ? objM2861d : xfa.f68157a;
    }

    /* JADX INFO: renamed from: G0 */
    public final Object m7509G0(ArrayList arrayList, SuspendLambda suspendLambda) {
        Object objM2861d = AbstractC0758a.m2861d(new h85(0, this, arrayList), this.f17034K, suspendLambda, false, true);
        return objM2861d == CoroutineSingletons.COROUTINE_SUSPENDED ? objM2861d : xfa.f68157a;
    }

    /* JADX INFO: renamed from: I0 */
    public final Object m7510I0(LibraryCounterEntity libraryCounterEntity, ContinuationImpl continuationImpl) {
        Object objM2861d = AbstractC0758a.m2861d(new h85(1, this, libraryCounterEntity), this.f17034K, continuationImpl, false, true);
        return objM2861d == CoroutineSingletons.COROUTINE_SUSPENDED ? objM2861d : xfa.f68157a;
    }

    /* JADX INFO: renamed from: J0 */
    public final Object m7511J0(int i, ContinuationImpl continuationImpl) {
        Object objM2861d = AbstractC0758a.m2861d(new mv0(i, 16), this.f17034K, continuationImpl, false, true);
        return objM2861d == CoroutineSingletons.COROUTINE_SUSPENDED ? objM2861d : xfa.f68157a;
    }

    @Override // p000.bq1
    /* JADX INFO: renamed from: v0 */
    public final Object mo4095v0(Object obj, Continuation continuation) {
        return AbstractC0758a.m2861d(new h85(3, this, (u85) obj), this.f17034K, continuation, false, true);
    }

    @Override // p000.bq1
    /* JADX INFO: renamed from: w0 */
    public final Object mo4096w0(List list, Continuation continuation) {
        return AbstractC0758a.m2861d(new f85(this, list, 0), this.f17034K, continuation, false, true);
    }

    /* JADX INFO: renamed from: y0 */
    public final Object m7512y0(int i, List list, Continuation continuation) {
        Object objM2860c = AbstractC0758a.m2860c(new LibraryDao_Impl$deleteLessonsFromCourse$2(this, i, list, null), this.f17034K, continuation);
        return objM2860c == CoroutineSingletons.COROUTINE_SUSPENDED ? objM2860c : xfa.f68157a;
    }
}
