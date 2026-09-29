package com.lingq.feature.collections;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.data.repository.C1296l;
import com.lingq.core.database.dao.C1321i;
import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.domain.model.library.LibraryItemType;
import com.lingq.core.domain.model.library.Sort;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.b23;
import p000.bx0;
import p000.c32;
import p000.c61;
import p000.e83;
import p000.g9a;
import p000.l91;
import p000.lda;
import p000.m83;
import p000.u91;
import p000.un1;
import p000.v91;
import p000.vi3;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$observeCourseLessons$1", m4291f = "CollectionViewModel.kt", m4292l = {DescriptorProtos.Edition.EDITION_PROTO2_VALUE}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionViewModel$observeCourseLessons$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25431a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2034d f25432b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Sort f25433c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f25434d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ l91 f25435e;

    /* JADX INFO: renamed from: com.lingq.feature.collections.CollectionViewModel$observeCourseLessons$1$1 */
    @c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$observeCourseLessons$1$1", m4291f = "CollectionViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C20171 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2034d f25436a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f25437b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20171(C2034d c2034d, boolean z, Continuation continuation) {
            super(2, continuation);
            this.f25436a = c2034d;
            this.f25437b = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C20171(this.f25436a, this.f25437b, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C20171 c20171 = (C20171) create((e83) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c20171.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C2034d c2034d = this.f25436a;
            C3244l c3244l = c2034d.f25559R;
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, c61.m4341a((c61) value, null, null, null, null, false, false, false, false, false, false, true, false, false, false, false, false, null, 127999)));
            if (this.f25437b) {
                C3244l c3244l2 = c2034d.f25562U;
                c3244l2.getClass();
                EmptyList emptyList = EmptyList.f47638a;
                c3244l2.m15572j(null, emptyList);
                C3244l c3244l3 = c2034d.f25563V;
                c3244l3.getClass();
                c3244l3.m15572j(null, emptyList);
            }
            return xfa.f68157a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.collections.CollectionViewModel$observeCourseLessons$1$2 */
    @c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$observeCourseLessons$1$2", m4291f = "CollectionViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C20182 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f25438a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Sort f25439b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C2034d f25440c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f25441d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ l91 f25442e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20182(l91 l91Var, Sort sort, C2034d c2034d, Continuation continuation, boolean z) {
            super(2, continuation);
            this.f25439b = sort;
            this.f25440c = c2034d;
            this.f25441d = z;
            this.f25442e = l91Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C20182 c20182 = new C20182(this.f25442e, this.f25439b, this.f25440c, continuation, this.f25441d);
            c20182.f25438a = obj;
            return c20182;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C20182 c20182 = (C20182) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c20182.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ArrayList arrayList;
            Object value;
            List list = (List) this.f25438a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C2034d c2034d = this.f25440c;
            C3244l c3244l = c2034d.f25562U;
            C3244l c3244l2 = c2034d.f25559R;
            Sort sort = ((c61) c3244l2.getValue()).f9609d;
            xfa xfaVar = xfa.f68157a;
            if (this.f25439b != sort) {
                return xfaVar;
            }
            if (this.f25441d) {
                HashSet hashSet = new HashSet();
                arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (hashSet.add(new Integer(((LibraryItem) obj2).f19426a))) {
                        arrayList.add(obj2);
                    }
                }
            } else {
                ArrayList arrayListM22603U0 = u91.m22603U0(list, (Collection) c3244l.getValue());
                HashSet hashSet2 = new HashSet();
                arrayList = new ArrayList();
                for (Object obj3 : arrayListM22603U0) {
                    if (hashSet2.add(new Integer(((LibraryItem) obj3).f19426a))) {
                        arrayList.add(obj3);
                    }
                }
            }
            c3244l.getClass();
            c3244l.m15572j(null, arrayList);
            if (!((Collection) c3244l.getValue()).isEmpty()) {
                do {
                    value = c3244l2.getValue();
                } while (!c3244l2.m15570h(value, c61.m4341a((c61) value, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, null, 127999)));
            }
            l91 l91Var = this.f25442e;
            String str = l91Var.f49324a;
            String str2 = l91Var.f49324a;
            Iterable iterable = (Iterable) c3244l.getValue();
            ArrayList arrayList2 = new ArrayList(v91.m23189q0(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(((LibraryItem) it.next()).f19426a));
            }
            if (!arrayList2.isEmpty()) {
                AbstractC1263a.m7047b(lda.m16103C(c2034d), c2034d.f25553L, "observeCollectionLessonCounters-".concat(u91.m22596N0(arrayList2, ",", null, null, null, 62)), new CollectionViewModel$observeLessonCounters$1(c2034d, arrayList2, null));
                c2034d.m8948c3(g9a.m12431h("fetchCollectionLessonCounters-", c2034d.f25567Z, "-", str), new CollectionViewModel$observeLessonCounters$2(c2034d, str, arrayList2, null));
            }
            Iterable iterable2 = (Iterable) c3244l.getValue();
            ArrayList arrayList3 = new ArrayList(v91.m23189q0(iterable2, 10));
            Iterator it2 = iterable2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(Integer.valueOf(((LibraryItem) it2.next()).f19426a));
            }
            boolean zIsEmpty = arrayList3.isEmpty();
            EmptyList emptyList = EmptyList.f47638a;
            if (zIsEmpty) {
                C3244l c3244l3 = c2034d.f25564W;
                c3244l3.getClass();
                c3244l3.m15572j(null, emptyList);
            } else {
                wfb.m23926u(lda.m16103C(c2034d), null, null, new CollectionViewModel$observeLessonAudioDownloads$1(c2034d, str2, arrayList3, null), 3);
            }
            Iterable iterable3 = (Iterable) c3244l.getValue();
            ArrayList arrayList4 = new ArrayList(v91.m23189q0(iterable3, 10));
            Iterator it3 = iterable3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(Integer.valueOf(((LibraryItem) it3.next()).f19426a));
            }
            if (!arrayList4.isEmpty()) {
                wfb.m23926u(lda.m16103C(c2034d), null, null, new CollectionViewModel$observeLessonDataDownloads$1(c2034d, str2, arrayList4, null), 3);
                return xfaVar;
            }
            C3244l c3244l4 = c2034d.f25565X;
            c3244l4.getClass();
            c3244l4.m15572j(null, emptyList);
            return xfaVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionViewModel$observeCourseLessons$1(l91 l91Var, Sort sort, C2034d c2034d, Continuation continuation, boolean z) {
        super(2, continuation);
        this.f25432b = c2034d;
        this.f25433c = sort;
        this.f25434d = z;
        this.f25435e = l91Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CollectionViewModel$observeCourseLessons$1(this.f25435e, this.f25433c, this.f25432b, continuation, this.f25434d);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CollectionViewModel$observeCourseLessons$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25431a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2034d c2034d = this.f25432b;
            b23 b23Var = c2034d.f25581k;
            final int i2 = c2034d.f25567Z;
            int iIntValue = ((Number) c2034d.f25561T.getValue()).intValue();
            String value = this.f25433c.getValue();
            if (value == null) {
                value = "";
            }
            final String str = value;
            b23Var.getClass();
            C1296l c1296l = (C1296l) b23Var.f7790a;
            c1296l.getClass();
            final C1321i c1321i = c1296l.f16514d;
            final int i3 = (iIntValue - 1) * 20;
            final String value2 = LibraryItemType.Content.getValue();
            c1321i.getClass();
            value2.getClass();
            m83 m83Var = new m83(AbstractC3224d.m15536o(new bx0(AbstractC3584sr.m21590A(c1321i.f17034K, true, new String[]{"LibraryDataEntity", "CoursesAndLessonsJoin", "CoursesAndLessonsSortJoin"}, new vi3() { // from class: j85
                @Override // p000.vi3
                public final Object invoke(Object obj2) throws Exception {
                    Boolean boolValueOf;
                    Boolean boolValueOf2;
                    int i4 = i2;
                    String str2 = value2;
                    String str3 = str;
                    int i5 = i3;
                    C1321i c1321i2 = c1321i;
                    bk8 bk8Var = (bk8) obj2;
                    bk8Var.getClass();
                    ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("\n    SELECT DISTINCT LibraryDataEntity.* FROM LibraryDataEntity, CoursesAndLessonsJoin, CoursesAndLessonsSortJoin\n    WHERE CoursesAndLessonsJoin.contentId == LibraryDataEntity.id AND CoursesAndLessonsSortJoin.contentId == LibraryDataEntity.id \n    AND CoursesAndLessonsSortJoin.contentId == CoursesAndLessonsJoin.contentId \n    AND CoursesAndLessonsSortJoin.pk = ? AND LibraryDataEntity.collectionId = ? \n    AND LibraryDataEntity.type = ? AND CoursesAndLessonsSortJoin.sort = ?\n    ORDER BY CoursesAndLessonsSortJoin.courseOrder ASC\n    LIMIT ? OFFSET ?\n    ");
                    long j = i4;
                    try {
                        ik8VarMo2873e0.mo2878j(1, j);
                        ik8VarMo2873e0.mo2878j(2, j);
                        ik8VarMo2873e0.mo2874C(3, str2);
                        ik8VarMo2873e0.mo2874C(4, str3);
                        ik8VarMo2873e0.mo2878j(5, 20L);
                        ik8VarMo2873e0.mo2878j(6, i5);
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
                        C1321i c1321i3 = c1321i2;
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
                            ArrayList arrayList2 = arrayList;
                            int i6 = iM14108v14;
                            int i7 = (int) ik8VarMo2873e0.getLong(iM14108v);
                            String strMo2875L = ik8VarMo2873e0.mo2875L(iM14108v2);
                            String strMo2875L2 = ik8VarMo2873e0.isNull(iM14108v3) ? null : ik8VarMo2873e0.mo2875L(iM14108v3);
                            String strMo2875L3 = ik8VarMo2873e0.isNull(iM14108v4) ? null : ik8VarMo2873e0.mo2875L(iM14108v4);
                            int i8 = (int) ik8VarMo2873e0.getLong(iM14108v5);
                            String strMo2875L4 = ik8VarMo2873e0.isNull(iM14108v6) ? null : ik8VarMo2873e0.mo2875L(iM14108v6);
                            String strMo2875L5 = ik8VarMo2873e0.isNull(iM14108v7) ? null : ik8VarMo2873e0.mo2875L(iM14108v7);
                            String strMo2875L6 = ik8VarMo2873e0.isNull(iM14108v8) ? null : ik8VarMo2873e0.mo2875L(iM14108v8);
                            String strMo2875L7 = ik8VarMo2873e0.isNull(iM14108v9) ? null : ik8VarMo2873e0.mo2875L(iM14108v9);
                            String strMo2875L8 = ik8VarMo2873e0.isNull(iM14108v10) ? null : ik8VarMo2873e0.mo2875L(iM14108v10);
                            Integer numValueOf = ik8VarMo2873e0.isNull(iM14108v11) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(iM14108v11));
                            String strMo2875L9 = ik8VarMo2873e0.isNull(iM14108v12) ? null : ik8VarMo2873e0.mo2875L(iM14108v12);
                            String strMo2875L10 = ik8VarMo2873e0.isNull(iM14108v13) ? null : ik8VarMo2873e0.mo2875L(iM14108v13);
                            String strMo2875L11 = ik8VarMo2873e0.isNull(i6) ? null : ik8VarMo2873e0.mo2875L(i6);
                            int i9 = iM14108v15;
                            String strMo2875L12 = ik8VarMo2873e0.isNull(i9) ? null : ik8VarMo2873e0.mo2875L(i9);
                            int i10 = iM14108v16;
                            String strMo2875L13 = ik8VarMo2873e0.isNull(i10) ? null : ik8VarMo2873e0.mo2875L(i10);
                            iM14108v16 = i10;
                            int i11 = iM14108v17;
                            String strMo2875L14 = ik8VarMo2873e0.isNull(i11) ? null : ik8VarMo2873e0.mo2875L(i11);
                            iM14108v17 = i11;
                            int i12 = iM14108v18;
                            String strMo2875L15 = ik8VarMo2873e0.isNull(i12) ? null : ik8VarMo2873e0.mo2875L(i12);
                            iM14108v18 = i12;
                            int i13 = iM14108v19;
                            String strMo2875L16 = ik8VarMo2873e0.isNull(i13) ? null : ik8VarMo2873e0.mo2875L(i13);
                            iM14108v19 = i13;
                            iM14108v20 = iM14108v20;
                            String strMo2875L17 = ik8VarMo2873e0.isNull(iM14108v20) ? null : ik8VarMo2873e0.mo2875L(iM14108v20);
                            int i14 = iM14108v21;
                            int i15 = (int) ik8VarMo2873e0.getLong(i14);
                            int i16 = iM14108v22;
                            int i17 = (int) ik8VarMo2873e0.getLong(i16);
                            int i18 = iM14108v23;
                            String strMo2875L18 = ik8VarMo2873e0.isNull(i18) ? null : ik8VarMo2873e0.mo2875L(i18);
                            int i19 = (int) ik8VarMo2873e0.getLong(iM14108v24);
                            int i20 = iM14108v25;
                            int i21 = iM14108v24;
                            int i22 = (int) ik8VarMo2873e0.getLong(i20);
                            int i23 = iM14108v26;
                            int i24 = iM14108v2;
                            int i25 = (int) ik8VarMo2873e0.getLong(i23);
                            int i26 = iM14108v27;
                            Integer numValueOf2 = ik8VarMo2873e0.isNull(i26) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(i26));
                            int i27 = iM14108v28;
                            Integer numValueOf3 = ik8VarMo2873e0.isNull(i27) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(i27));
                            int i28 = iM14108v29;
                            String strMo2875L19 = ik8VarMo2873e0.isNull(i28) ? null : ik8VarMo2873e0.mo2875L(i28);
                            int i29 = iM14108v30;
                            double d = ik8VarMo2873e0.getDouble(i29);
                            iM14108v28 = i27;
                            iM14108v29 = i28;
                            iM14108v30 = i29;
                            int i30 = iM14108v31;
                            boolean z = ((int) ik8VarMo2873e0.getLong(i30)) != 0;
                            int i31 = iM14108v32;
                            iM14108v31 = i30;
                            C1321i c1321i4 = c1321i3;
                            List listM20058M = c1321i4.f17038O.m20058M(ik8VarMo2873e0.isNull(i31) ? null : ik8VarMo2873e0.mo2875L(i31));
                            int i32 = iM14108v33;
                            String strMo2875L20 = ik8VarMo2873e0.isNull(i32) ? null : ik8VarMo2873e0.mo2875L(i32);
                            int i33 = iM14108v34;
                            List listM20058M2 = c1321i4.f17038O.m20058M(ik8VarMo2873e0.isNull(i33) ? null : ik8VarMo2873e0.mo2875L(i33));
                            int i34 = iM14108v35;
                            Float fValueOf = ik8VarMo2873e0.isNull(i34) ? null : Float.valueOf((float) ik8VarMo2873e0.getDouble(i34));
                            int i35 = iM14108v36;
                            Integer numValueOf4 = ik8VarMo2873e0.isNull(i35) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(i35));
                            if (numValueOf4 != null) {
                                boolValueOf = Boolean.valueOf(numValueOf4.intValue() != 0);
                            } else {
                                boolValueOf = null;
                            }
                            int i36 = iM14108v37;
                            String strMo2875L21 = ik8VarMo2873e0.mo2875L(i36);
                            int i37 = iM14108v38;
                            String strMo2875L22 = ik8VarMo2873e0.isNull(i37) ? null : ik8VarMo2873e0.mo2875L(i37);
                            iM14108v37 = i36;
                            int i38 = iM14108v39;
                            String strMo2875L23 = ik8VarMo2873e0.isNull(i38) ? null : ik8VarMo2873e0.mo2875L(i38);
                            iM14108v39 = i38;
                            int i39 = iM14108v40;
                            double d2 = ik8VarMo2873e0.getDouble(i39);
                            iM14108v40 = i39;
                            int i40 = iM14108v41;
                            double d3 = ik8VarMo2873e0.getDouble(i40);
                            iM14108v41 = i40;
                            int i41 = iM14108v42;
                            boolean z2 = ((int) ik8VarMo2873e0.getLong(i41)) != 0;
                            int i42 = iM14108v43;
                            boolean z3 = ((int) ik8VarMo2873e0.getLong(i42)) != 0;
                            int i43 = iM14108v44;
                            String strMo2875L24 = ik8VarMo2873e0.isNull(i43) ? null : ik8VarMo2873e0.mo2875L(i43);
                            int i44 = iM14108v45;
                            String strMo2875L25 = ik8VarMo2873e0.isNull(i44) ? null : ik8VarMo2873e0.mo2875L(i44);
                            int i45 = iM14108v46;
                            String strMo2875L26 = ik8VarMo2873e0.isNull(i45) ? null : ik8VarMo2873e0.mo2875L(i45);
                            iM14108v46 = i45;
                            int i46 = iM14108v47;
                            Integer numValueOf5 = ik8VarMo2873e0.isNull(i46) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(i46));
                            if (numValueOf5 != null) {
                                boolValueOf2 = Boolean.valueOf(numValueOf5.intValue() != 0);
                            } else {
                                boolValueOf2 = null;
                            }
                            int i47 = iM14108v48;
                            int i48 = iM14108v49;
                            arrayList2.add(new u85(i7, strMo2875L, strMo2875L2, strMo2875L3, i8, strMo2875L4, strMo2875L5, strMo2875L6, strMo2875L7, strMo2875L8, numValueOf, strMo2875L9, strMo2875L10, strMo2875L11, strMo2875L12, strMo2875L13, strMo2875L14, strMo2875L15, strMo2875L16, strMo2875L17, i15, i17, strMo2875L18, i19, i22, i25, numValueOf2, numValueOf3, strMo2875L19, d, z, listM20058M, strMo2875L20, listM20058M2, fValueOf, boolValueOf, strMo2875L21, strMo2875L22, strMo2875L23, d2, d3, z2, z3, strMo2875L24, strMo2875L25, strMo2875L26, boolValueOf2, ik8VarMo2873e0.isNull(i47) ? null : ik8VarMo2873e0.mo2875L(i47), ((int) ik8VarMo2873e0.getLong(i48)) != 0));
                            iM14108v34 = i33;
                            iM14108v33 = i32;
                            arrayList = arrayList2;
                            iM14108v32 = i31;
                            c1321i3 = c1321i4;
                            iM14108v43 = i42;
                            iM14108v14 = i6;
                            iM14108v45 = i44;
                            iM14108v2 = i24;
                            iM14108v26 = i23;
                            iM14108v27 = i26;
                            iM14108v35 = i34;
                            iM14108v36 = i35;
                            iM14108v38 = i37;
                            iM14108v42 = i41;
                            iM14108v44 = i43;
                            iM14108v47 = i46;
                            iM14108v48 = i47;
                            iM14108v49 = i48;
                            iM14108v = iM14108v;
                            iM14108v15 = i9;
                            iM14108v21 = i14;
                            iM14108v22 = i16;
                            iM14108v23 = i18;
                            iM14108v24 = i21;
                            iM14108v25 = i20;
                        }
                        return arrayList;
                    } finally {
                        ik8VarMo2873e0.close();
                    }
                }
            }), 16)), new C20171(c2034d, this.f25434d, null));
            C20182 c20182 = new C20182(this.f25435e, this.f25433c, c2034d, null, this.f25434d);
            this.f25431a = 1;
            if (AbstractC3224d.m15529h(m83Var, c20182, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
