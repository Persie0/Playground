package com.lingq.core.data.repository;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.room.AbstractC0746d;
import androidx.room.AbstractC0747e;
import androidx.room.util.AbstractC0758a;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.impl.C0773b;
import com.lingq.core.data.workers.ShelfUpdatePinnedWorker;
import com.lingq.core.database.LingQDatabase;
import com.lingq.core.database.dao.AbstractC1320h;
import com.lingq.core.database.dao.C1321i;
import com.lingq.core.database.dao.C1322j;
import com.lingq.core.database.entity.LibraryCounterEntity;
import com.lingq.core.domain.model.ContentType;
import com.lingq.core.domain.model.LearningLevel;
import com.lingq.core.domain.model.library.Accent;
import com.lingq.core.domain.model.library.CollectionsFilter;
import com.lingq.core.domain.model.library.CollectionsFilterProvider;
import com.lingq.core.domain.model.library.LibraryContentType;
import com.lingq.core.domain.model.library.LibraryItemType;
import com.lingq.core.domain.model.library.LibrarySearchQuery;
import com.lingq.core.domain.model.library.LibraryShelf;
import com.lingq.core.domain.model.library.LibraryShelfType;
import com.lingq.core.domain.model.library.Resources;
import com.lingq.core.domain.model.library.Sort;
import com.lingq.core.network.api.requests.RequestQuery;
import com.lingq.core.network.api.result.ResultLibraryCounter;
import com.lingq.core.network.api.result.Results;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3122is;
import p000.AbstractC3393o1;
import p000.AbstractC3423or;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.bx0;
import p000.c83;
import p000.ca5;
import p000.cl9;
import p000.d32;
import p000.ek2;
import p000.f5d;
import p000.fa4;
import p000.h85;
import p000.hi8;
import p000.i85;
import p000.i88;
import p000.l05;
import p000.l85;
import p000.ld0;
import p000.ll1;
import p000.m05;
import p000.m85;
import p000.mv0;
import p000.n85;
import p000.od0;
import p000.pl4;
import p000.q05;
import p000.tx6;
import p000.u85;
import p000.u91;
import p000.ux6;
import p000.v85;
import p000.v91;
import p000.vi3;
import p000.vk9;
import p000.vp0;
import p000.vz1;
import p000.xfa;
import p000.xj1;
import p000.y95;
import p000.yo1;
import p000.ys2;

/* JADX INFO: renamed from: com.lingq.core.data.repository.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1296l implements y95 {

    /* JADX INFO: renamed from: a */
    public final LingQDatabase f16511a;

    /* JADX INFO: renamed from: b */
    public final ca5 f16512b;

    /* JADX INFO: renamed from: c */
    public final od0 f16513c;

    /* JADX INFO: renamed from: d */
    public final C1321i f16514d;

    /* JADX INFO: renamed from: e */
    public final AbstractC1320h f16515e;

    /* JADX INFO: renamed from: f */
    public final C1322j f16516f;

    /* JADX INFO: renamed from: g */
    public final C0773b f16517g;

    public C1296l(LingQDatabase lingQDatabase, ca5 ca5Var, od0 od0Var, C1321i c1321i, AbstractC1320h abstractC1320h, C1322j c1322j, C0773b c0773b) {
        lingQDatabase.getClass();
        ca5Var.getClass();
        od0Var.getClass();
        c1321i.getClass();
        abstractC1320h.getClass();
        c1322j.getClass();
        c0773b.getClass();
        this.f16511a = lingQDatabase;
        this.f16512b = ca5Var;
        this.f16513c = od0Var;
        this.f16514d = c1321i;
        this.f16515e = abstractC1320h;
        this.f16516f = c1322j;
        this.f16517g = c0773b;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0090 A[PHI: r0 r2
      0x0090: PHI (r0v4 int) = (r0v2 int), (r0v5 int) binds: [B:25:0x008c, B:16:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0090: PHI (r2v8 java.lang.Object) = (r2v7 java.lang.Object), (r2v1 java.lang.Object) binds: [B:25:0x008c, B:16:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x0095  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b3 A[PHI: r0
      0x00b3: PHI (r0v6 int) = (r0v4 int), (r0v4 int), (r0v7 int) binds: [B:28:0x0093, B:30:0x00af, B:15:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c2 A[PHI: r0 r2
      0x00c2: PHI (r0v8 int) = (r0v6 int), (r0v9 int) binds: [B:33:0x00be, B:14:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r2v11 java.lang.Object) = (r2v10 java.lang.Object), (r2v1 java.lang.Object) binds: [B:33:0x00be, B:14:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x00d9 A[LOOP:0: B:36:0x00d3->B:38:0x00d9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x0112  */
    /* JADX WARN: Code duplicated, block: B:45:0x0116 A[PHI: r0 r1
      0x0116: PHI (r0v10 int) = (r0v8 int), (r0v15 int) binds: [B:43:0x0113, B:13:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0116: PHI (r1v10 java.util.ArrayList) = (r1v9 java.util.ArrayList), (r1v12 java.util.ArrayList) binds: [B:43:0x0113, B:13:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x0149  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x014a, code lost:
    
        if (r6 == r4) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7307b(int i, String str, ContinuationImpl continuationImpl) throws Throwable {
        LibraryRepositoryImpl$buyCourse$1 libraryRepositoryImpl$buyCourse$1;
        int i2;
        LibraryCounterEntity libraryCounterEntity;
        LibraryCounterEntity libraryCounterEntityM7760a;
        ArrayList arrayList;
        Iterator it;
        Object objM2861d;
        Object objM2861d2;
        if (continuationImpl instanceof LibraryRepositoryImpl$buyCourse$1) {
            libraryRepositoryImpl$buyCourse$1 = (LibraryRepositoryImpl$buyCourse$1) continuationImpl;
            int i3 = libraryRepositoryImpl$buyCourse$1.f15694e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                libraryRepositoryImpl$buyCourse$1.f15694e = i3 - Integer.MIN_VALUE;
            } else {
                libraryRepositoryImpl$buyCourse$1 = new LibraryRepositoryImpl$buyCourse$1(this, continuationImpl);
            }
        } else {
            libraryRepositoryImpl$buyCourse$1 = new LibraryRepositoryImpl$buyCourse$1(this, continuationImpl);
        }
        Object objM7321p = libraryRepositoryImpl$buyCourse$1.f15692c;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = libraryRepositoryImpl$buyCourse$1.f15694e;
        Object obj2 = xfa.f68157a;
        AbstractC1320h abstractC1320h = this.f16515e;
        C1321i c1321i = this.f16514d;
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (i4) {
            case 0:
                AbstractC3193b.m15359b(objM7321p);
                libraryRepositoryImpl$buyCourse$1.f15690a = i;
                libraryRepositoryImpl$buyCourse$1.f15694e = 1;
                objM7321p = m7321p(i, str, libraryRepositoryImpl$buyCourse$1);
                if (objM7321p != obj) {
                    i2 = i;
                    if (((Boolean) objM7321p).booleanValue()) {
                        String value = LibraryItemType.Collection.getValue();
                        libraryRepositoryImpl$buyCourse$1.f15690a = i2;
                        libraryRepositoryImpl$buyCourse$1.f15694e = 2;
                        objM7321p = c1321i.m7506D0(i2, value, libraryRepositoryImpl$buyCourse$1);
                        if (objM7321p != obj) {
                            libraryCounterEntity = (LibraryCounterEntity) objM7321p;
                            if (libraryCounterEntity != null) {
                                libraryRepositoryImpl$buyCourse$1.f15691b = null;
                                libraryRepositoryImpl$buyCourse$1.f15690a = i2;
                                libraryRepositoryImpl$buyCourse$1.f15694e = 4;
                                objM7321p = C1321i.m7501B0(c1321i, i2, libraryRepositoryImpl$buyCourse$1);
                                if (objM7321p != obj) {
                                    Iterable iterable = (Iterable) objM7321p;
                                    arrayList = new ArrayList(v91.m23189q0(iterable, 10));
                                    it = iterable.iterator();
                                    while (it.hasNext()) {
                                        AbstractC3393o1.m17749x(((Number) it.next()).intValue(), arrayList);
                                    }
                                    libraryRepositoryImpl$buyCourse$1.f15691b = arrayList;
                                    libraryRepositoryImpl$buyCourse$1.f15690a = i2;
                                    libraryRepositoryImpl$buyCourse$1.f15694e = 5;
                                    q05 q05Var = (q05) abstractC1320h;
                                    q05Var.getClass();
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("UPDATE LibraryCounterEntity SET isTaken = 1 WHERE id IN (");
                                    objM2861d = AbstractC0758a.m2861d(new m05(objArr == true ? 1 : 0, AbstractC3393o1.m17736k(")", sb, arrayList), arrayList), q05Var.f57071K, libraryRepositoryImpl$buyCourse$1, false, true);
                                    if (objM2861d != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        objM2861d = obj2;
                                    }
                                    if (objM2861d != obj) {
                                        libraryRepositoryImpl$buyCourse$1.f15691b = null;
                                        libraryRepositoryImpl$buyCourse$1.f15690a = i2;
                                        libraryRepositoryImpl$buyCourse$1.f15694e = 6;
                                        q05 q05Var2 = (q05) abstractC1320h;
                                        q05Var2.getClass();
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("UPDATE LessonEntity SET isTaken = 1 WHERE id IN (");
                                        d32.m10005B(arrayList.size(), sb2);
                                        sb2.append(")");
                                        objM2861d2 = AbstractC0758a.m2861d(new l05(objArr2 == true ? 1 : 0, sb2.toString(), arrayList), q05Var2.f57071K, libraryRepositoryImpl$buyCourse$1, false, true);
                                        if (objM2861d2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                                            obj2 = objM2861d2;
                                        }
                                    }
                                }
                            } else {
                                libraryCounterEntityM7760a = LibraryCounterEntity.m7760a(libraryCounterEntity, false, null, null, true, 0, 253887);
                                libraryRepositoryImpl$buyCourse$1.f15691b = null;
                                libraryRepositoryImpl$buyCourse$1.f15690a = i2;
                                libraryRepositoryImpl$buyCourse$1.f15694e = 3;
                                if (c1321i.m7510I0(libraryCounterEntityM7760a, libraryRepositoryImpl$buyCourse$1) != obj) {
                                    libraryRepositoryImpl$buyCourse$1.f15691b = null;
                                    libraryRepositoryImpl$buyCourse$1.f15690a = i2;
                                    libraryRepositoryImpl$buyCourse$1.f15694e = 4;
                                    objM7321p = C1321i.m7501B0(c1321i, i2, libraryRepositoryImpl$buyCourse$1);
                                    if (objM7321p != obj) {
                                        Iterable iterable2 = (Iterable) objM7321p;
                                        arrayList = new ArrayList(v91.m23189q0(iterable2, 10));
                                        it = iterable2.iterator();
                                        while (it.hasNext()) {
                                            AbstractC3393o1.m17749x(((Number) it.next()).intValue(), arrayList);
                                        }
                                        libraryRepositoryImpl$buyCourse$1.f15691b = arrayList;
                                        libraryRepositoryImpl$buyCourse$1.f15690a = i2;
                                        libraryRepositoryImpl$buyCourse$1.f15694e = 5;
                                        q05 q05Var3 = (q05) abstractC1320h;
                                        q05Var3.getClass();
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append("UPDATE LibraryCounterEntity SET isTaken = 1 WHERE id IN (");
                                        objM2861d = AbstractC0758a.m2861d(new m05(objArr == true ? 1 : 0, AbstractC3393o1.m17736k(")", sb3, arrayList), arrayList), q05Var3.f57071K, libraryRepositoryImpl$buyCourse$1, false, true);
                                        if (objM2861d != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                            objM2861d = obj2;
                                        }
                                        if (objM2861d != obj) {
                                            libraryRepositoryImpl$buyCourse$1.f15691b = null;
                                            libraryRepositoryImpl$buyCourse$1.f15690a = i2;
                                            libraryRepositoryImpl$buyCourse$1.f15694e = 6;
                                            q05 q05Var4 = (q05) abstractC1320h;
                                            q05Var4.getClass();
                                            StringBuilder sb4 = new StringBuilder();
                                            sb4.append("UPDATE LessonEntity SET isTaken = 1 WHERE id IN (");
                                            d32.m10005B(arrayList.size(), sb4);
                                            sb4.append(")");
                                            objM2861d2 = AbstractC0758a.m2861d(new l05(objArr2 == true ? 1 : 0, sb4.toString(), arrayList), q05Var4.f57071K, libraryRepositoryImpl$buyCourse$1, false, true);
                                            if (objM2861d2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                                                obj2 = objM2861d2;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    }
                    return Boolean.valueOf(z);
                }
                return obj;
            case 1:
                i2 = libraryRepositoryImpl$buyCourse$1.f15690a;
                AbstractC3193b.m15359b(objM7321p);
                if (((Boolean) objM7321p).booleanValue()) {
                    String value2 = LibraryItemType.Collection.getValue();
                    libraryRepositoryImpl$buyCourse$1.f15690a = i2;
                    libraryRepositoryImpl$buyCourse$1.f15694e = 2;
                    objM7321p = c1321i.m7506D0(i2, value2, libraryRepositoryImpl$buyCourse$1);
                    if (objM7321p != obj) {
                        libraryCounterEntity = (LibraryCounterEntity) objM7321p;
                        if (libraryCounterEntity != null) {
                            libraryRepositoryImpl$buyCourse$1.f15691b = null;
                            libraryRepositoryImpl$buyCourse$1.f15690a = i2;
                            libraryRepositoryImpl$buyCourse$1.f15694e = 4;
                            objM7321p = C1321i.m7501B0(c1321i, i2, libraryRepositoryImpl$buyCourse$1);
                            if (objM7321p != obj) {
                                Iterable iterable3 = (Iterable) objM7321p;
                                arrayList = new ArrayList(v91.m23189q0(iterable3, 10));
                                it = iterable3.iterator();
                                while (it.hasNext()) {
                                    AbstractC3393o1.m17749x(((Number) it.next()).intValue(), arrayList);
                                }
                                libraryRepositoryImpl$buyCourse$1.f15691b = arrayList;
                                libraryRepositoryImpl$buyCourse$1.f15690a = i2;
                                libraryRepositoryImpl$buyCourse$1.f15694e = 5;
                                q05 q05Var5 = (q05) abstractC1320h;
                                q05Var5.getClass();
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append("UPDATE LibraryCounterEntity SET isTaken = 1 WHERE id IN (");
                                objM2861d = AbstractC0758a.m2861d(new m05(objArr == true ? 1 : 0, AbstractC3393o1.m17736k(")", sb5, arrayList), arrayList), q05Var5.f57071K, libraryRepositoryImpl$buyCourse$1, false, true);
                                if (objM2861d != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    objM2861d = obj2;
                                }
                                if (objM2861d != obj) {
                                    libraryRepositoryImpl$buyCourse$1.f15691b = null;
                                    libraryRepositoryImpl$buyCourse$1.f15690a = i2;
                                    libraryRepositoryImpl$buyCourse$1.f15694e = 6;
                                    q05 q05Var6 = (q05) abstractC1320h;
                                    q05Var6.getClass();
                                    StringBuilder sb6 = new StringBuilder();
                                    sb6.append("UPDATE LessonEntity SET isTaken = 1 WHERE id IN (");
                                    d32.m10005B(arrayList.size(), sb6);
                                    sb6.append(")");
                                    objM2861d2 = AbstractC0758a.m2861d(new l05(objArr2 == true ? 1 : 0, sb6.toString(), arrayList), q05Var6.f57071K, libraryRepositoryImpl$buyCourse$1, false, true);
                                    if (objM2861d2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        obj2 = objM2861d2;
                                    }
                                }
                            }
                        } else {
                            libraryCounterEntityM7760a = LibraryCounterEntity.m7760a(libraryCounterEntity, false, null, null, true, 0, 253887);
                            libraryRepositoryImpl$buyCourse$1.f15691b = null;
                            libraryRepositoryImpl$buyCourse$1.f15690a = i2;
                            libraryRepositoryImpl$buyCourse$1.f15694e = 3;
                            if (c1321i.m7510I0(libraryCounterEntityM7760a, libraryRepositoryImpl$buyCourse$1) != obj) {
                                libraryRepositoryImpl$buyCourse$1.f15691b = null;
                                libraryRepositoryImpl$buyCourse$1.f15690a = i2;
                                libraryRepositoryImpl$buyCourse$1.f15694e = 4;
                                objM7321p = C1321i.m7501B0(c1321i, i2, libraryRepositoryImpl$buyCourse$1);
                                if (objM7321p != obj) {
                                    Iterable iterable4 = (Iterable) objM7321p;
                                    arrayList = new ArrayList(v91.m23189q0(iterable4, 10));
                                    it = iterable4.iterator();
                                    while (it.hasNext()) {
                                        AbstractC3393o1.m17749x(((Number) it.next()).intValue(), arrayList);
                                    }
                                    libraryRepositoryImpl$buyCourse$1.f15691b = arrayList;
                                    libraryRepositoryImpl$buyCourse$1.f15690a = i2;
                                    libraryRepositoryImpl$buyCourse$1.f15694e = 5;
                                    q05 q05Var7 = (q05) abstractC1320h;
                                    q05Var7.getClass();
                                    StringBuilder sb7 = new StringBuilder();
                                    sb7.append("UPDATE LibraryCounterEntity SET isTaken = 1 WHERE id IN (");
                                    objM2861d = AbstractC0758a.m2861d(new m05(objArr == true ? 1 : 0, AbstractC3393o1.m17736k(")", sb7, arrayList), arrayList), q05Var7.f57071K, libraryRepositoryImpl$buyCourse$1, false, true);
                                    if (objM2861d != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        objM2861d = obj2;
                                    }
                                    if (objM2861d != obj) {
                                        libraryRepositoryImpl$buyCourse$1.f15691b = null;
                                        libraryRepositoryImpl$buyCourse$1.f15690a = i2;
                                        libraryRepositoryImpl$buyCourse$1.f15694e = 6;
                                        q05 q05Var8 = (q05) abstractC1320h;
                                        q05Var8.getClass();
                                        StringBuilder sb8 = new StringBuilder();
                                        sb8.append("UPDATE LessonEntity SET isTaken = 1 WHERE id IN (");
                                        d32.m10005B(arrayList.size(), sb8);
                                        sb8.append(")");
                                        objM2861d2 = AbstractC0758a.m2861d(new l05(objArr2 == true ? 1 : 0, sb8.toString(), arrayList), q05Var8.f57071K, libraryRepositoryImpl$buyCourse$1, false, true);
                                        if (objM2861d2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                                            obj2 = objM2861d2;
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    }
                    return obj;
                }
                return Boolean.valueOf(z);
            case 2:
                i2 = libraryRepositoryImpl$buyCourse$1.f15690a;
                AbstractC3193b.m15359b(objM7321p);
                libraryCounterEntity = (LibraryCounterEntity) objM7321p;
                if (libraryCounterEntity != null) {
                    libraryCounterEntityM7760a = LibraryCounterEntity.m7760a(libraryCounterEntity, false, null, null, true, 0, 253887);
                    libraryRepositoryImpl$buyCourse$1.f15691b = null;
                    libraryRepositoryImpl$buyCourse$1.f15690a = i2;
                    libraryRepositoryImpl$buyCourse$1.f15694e = 3;
                    if (c1321i.m7510I0(libraryCounterEntityM7760a, libraryRepositoryImpl$buyCourse$1) != obj) {
                        libraryRepositoryImpl$buyCourse$1.f15691b = null;
                        libraryRepositoryImpl$buyCourse$1.f15690a = i2;
                        libraryRepositoryImpl$buyCourse$1.f15694e = 4;
                        objM7321p = C1321i.m7501B0(c1321i, i2, libraryRepositoryImpl$buyCourse$1);
                        if (objM7321p != obj) {
                            Iterable iterable5 = (Iterable) objM7321p;
                            arrayList = new ArrayList(v91.m23189q0(iterable5, 10));
                            it = iterable5.iterator();
                            while (it.hasNext()) {
                                AbstractC3393o1.m17749x(((Number) it.next()).intValue(), arrayList);
                            }
                            libraryRepositoryImpl$buyCourse$1.f15691b = arrayList;
                            libraryRepositoryImpl$buyCourse$1.f15690a = i2;
                            libraryRepositoryImpl$buyCourse$1.f15694e = 5;
                            q05 q05Var9 = (q05) abstractC1320h;
                            q05Var9.getClass();
                            StringBuilder sb9 = new StringBuilder();
                            sb9.append("UPDATE LibraryCounterEntity SET isTaken = 1 WHERE id IN (");
                            objM2861d = AbstractC0758a.m2861d(new m05(objArr == true ? 1 : 0, AbstractC3393o1.m17736k(")", sb9, arrayList), arrayList), q05Var9.f57071K, libraryRepositoryImpl$buyCourse$1, false, true);
                            if (objM2861d != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                objM2861d = obj2;
                            }
                            if (objM2861d != obj) {
                                libraryRepositoryImpl$buyCourse$1.f15691b = null;
                                libraryRepositoryImpl$buyCourse$1.f15690a = i2;
                                libraryRepositoryImpl$buyCourse$1.f15694e = 6;
                                q05 q05Var10 = (q05) abstractC1320h;
                                q05Var10.getClass();
                                StringBuilder sb10 = new StringBuilder();
                                sb10.append("UPDATE LessonEntity SET isTaken = 1 WHERE id IN (");
                                d32.m10005B(arrayList.size(), sb10);
                                sb10.append(")");
                                objM2861d2 = AbstractC0758a.m2861d(new l05(objArr2 == true ? 1 : 0, sb10.toString(), arrayList), q05Var10.f57071K, libraryRepositoryImpl$buyCourse$1, false, true);
                                if (objM2861d2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    obj2 = objM2861d2;
                                }
                            }
                        }
                    }
                    break;
                } else {
                    libraryRepositoryImpl$buyCourse$1.f15691b = null;
                    libraryRepositoryImpl$buyCourse$1.f15690a = i2;
                    libraryRepositoryImpl$buyCourse$1.f15694e = 4;
                    objM7321p = C1321i.m7501B0(c1321i, i2, libraryRepositoryImpl$buyCourse$1);
                    if (objM7321p != obj) {
                        Iterable iterable6 = (Iterable) objM7321p;
                        arrayList = new ArrayList(v91.m23189q0(iterable6, 10));
                        it = iterable6.iterator();
                        while (it.hasNext()) {
                            AbstractC3393o1.m17749x(((Number) it.next()).intValue(), arrayList);
                        }
                        libraryRepositoryImpl$buyCourse$1.f15691b = arrayList;
                        libraryRepositoryImpl$buyCourse$1.f15690a = i2;
                        libraryRepositoryImpl$buyCourse$1.f15694e = 5;
                        q05 q05Var11 = (q05) abstractC1320h;
                        q05Var11.getClass();
                        StringBuilder sb11 = new StringBuilder();
                        sb11.append("UPDATE LibraryCounterEntity SET isTaken = 1 WHERE id IN (");
                        objM2861d = AbstractC0758a.m2861d(new m05(objArr == true ? 1 : 0, AbstractC3393o1.m17736k(")", sb11, arrayList), arrayList), q05Var11.f57071K, libraryRepositoryImpl$buyCourse$1, false, true);
                        if (objM2861d != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            objM2861d = obj2;
                        }
                        if (objM2861d != obj) {
                            libraryRepositoryImpl$buyCourse$1.f15691b = null;
                            libraryRepositoryImpl$buyCourse$1.f15690a = i2;
                            libraryRepositoryImpl$buyCourse$1.f15694e = 6;
                            q05 q05Var12 = (q05) abstractC1320h;
                            q05Var12.getClass();
                            StringBuilder sb12 = new StringBuilder();
                            sb12.append("UPDATE LessonEntity SET isTaken = 1 WHERE id IN (");
                            d32.m10005B(arrayList.size(), sb12);
                            sb12.append(")");
                            objM2861d2 = AbstractC0758a.m2861d(new l05(objArr2 == true ? 1 : 0, sb12.toString(), arrayList), q05Var12.f57071K, libraryRepositoryImpl$buyCourse$1, false, true);
                            if (objM2861d2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                                obj2 = objM2861d2;
                            }
                        }
                    }
                    break;
                }
                return obj;
            case 3:
                i2 = libraryRepositoryImpl$buyCourse$1.f15690a;
                AbstractC3193b.m15359b(objM7321p);
                libraryRepositoryImpl$buyCourse$1.f15691b = null;
                libraryRepositoryImpl$buyCourse$1.f15690a = i2;
                libraryRepositoryImpl$buyCourse$1.f15694e = 4;
                objM7321p = C1321i.m7501B0(c1321i, i2, libraryRepositoryImpl$buyCourse$1);
                if (objM7321p != obj) {
                    Iterable iterable7 = (Iterable) objM7321p;
                    arrayList = new ArrayList(v91.m23189q0(iterable7, 10));
                    it = iterable7.iterator();
                    while (it.hasNext()) {
                        AbstractC3393o1.m17749x(((Number) it.next()).intValue(), arrayList);
                    }
                    libraryRepositoryImpl$buyCourse$1.f15691b = arrayList;
                    libraryRepositoryImpl$buyCourse$1.f15690a = i2;
                    libraryRepositoryImpl$buyCourse$1.f15694e = 5;
                    q05 q05Var13 = (q05) abstractC1320h;
                    q05Var13.getClass();
                    StringBuilder sb13 = new StringBuilder();
                    sb13.append("UPDATE LibraryCounterEntity SET isTaken = 1 WHERE id IN (");
                    objM2861d = AbstractC0758a.m2861d(new m05(objArr == true ? 1 : 0, AbstractC3393o1.m17736k(")", sb13, arrayList), arrayList), q05Var13.f57071K, libraryRepositoryImpl$buyCourse$1, false, true);
                    if (objM2861d != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        objM2861d = obj2;
                    }
                    if (objM2861d != obj) {
                        libraryRepositoryImpl$buyCourse$1.f15691b = null;
                        libraryRepositoryImpl$buyCourse$1.f15690a = i2;
                        libraryRepositoryImpl$buyCourse$1.f15694e = 6;
                        q05 q05Var14 = (q05) abstractC1320h;
                        q05Var14.getClass();
                        StringBuilder sb14 = new StringBuilder();
                        sb14.append("UPDATE LessonEntity SET isTaken = 1 WHERE id IN (");
                        d32.m10005B(arrayList.size(), sb14);
                        sb14.append(")");
                        objM2861d2 = AbstractC0758a.m2861d(new l05(objArr2 == true ? 1 : 0, sb14.toString(), arrayList), q05Var14.f57071K, libraryRepositoryImpl$buyCourse$1, false, true);
                        if (objM2861d2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                            obj2 = objM2861d2;
                        }
                    }
                    break;
                }
                return obj;
            case 4:
                i2 = libraryRepositoryImpl$buyCourse$1.f15690a;
                AbstractC3193b.m15359b(objM7321p);
                Iterable iterable8 = (Iterable) objM7321p;
                arrayList = new ArrayList(v91.m23189q0(iterable8, 10));
                it = iterable8.iterator();
                while (it.hasNext()) {
                    AbstractC3393o1.m17749x(((Number) it.next()).intValue(), arrayList);
                }
                libraryRepositoryImpl$buyCourse$1.f15691b = arrayList;
                libraryRepositoryImpl$buyCourse$1.f15690a = i2;
                libraryRepositoryImpl$buyCourse$1.f15694e = 5;
                q05 q05Var15 = (q05) abstractC1320h;
                q05Var15.getClass();
                StringBuilder sb15 = new StringBuilder();
                sb15.append("UPDATE LibraryCounterEntity SET isTaken = 1 WHERE id IN (");
                objM2861d = AbstractC0758a.m2861d(new m05(objArr == true ? 1 : 0, AbstractC3393o1.m17736k(")", sb15, arrayList), arrayList), q05Var15.f57071K, libraryRepositoryImpl$buyCourse$1, false, true);
                if (objM2861d != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    objM2861d = obj2;
                }
                if (objM2861d != obj) {
                    libraryRepositoryImpl$buyCourse$1.f15691b = null;
                    libraryRepositoryImpl$buyCourse$1.f15690a = i2;
                    libraryRepositoryImpl$buyCourse$1.f15694e = 6;
                    q05 q05Var16 = (q05) abstractC1320h;
                    q05Var16.getClass();
                    StringBuilder sb16 = new StringBuilder();
                    sb16.append("UPDATE LessonEntity SET isTaken = 1 WHERE id IN (");
                    d32.m10005B(arrayList.size(), sb16);
                    sb16.append(")");
                    objM2861d2 = AbstractC0758a.m2861d(new l05(objArr2 == true ? 1 : 0, sb16.toString(), arrayList), q05Var16.f57071K, libraryRepositoryImpl$buyCourse$1, false, true);
                    if (objM2861d2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        obj2 = objM2861d2;
                    }
                    break;
                }
                return obj;
            case 5:
                i2 = libraryRepositoryImpl$buyCourse$1.f15690a;
                arrayList = libraryRepositoryImpl$buyCourse$1.f15691b;
                AbstractC3193b.m15359b(objM7321p);
                libraryRepositoryImpl$buyCourse$1.f15691b = null;
                libraryRepositoryImpl$buyCourse$1.f15690a = i2;
                libraryRepositoryImpl$buyCourse$1.f15694e = 6;
                q05 q05Var17 = (q05) abstractC1320h;
                q05Var17.getClass();
                StringBuilder sb17 = new StringBuilder();
                sb17.append("UPDATE LessonEntity SET isTaken = 1 WHERE id IN (");
                d32.m10005B(arrayList.size(), sb17);
                sb17.append(")");
                objM2861d2 = AbstractC0758a.m2861d(new l05(objArr2 == true ? 1 : 0, sb17.toString(), arrayList), q05Var17.f57071K, libraryRepositoryImpl$buyCourse$1, false, true);
                if (objM2861d2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    obj2 = objM2861d2;
                }
                break;
            case 6:
                AbstractC3193b.m15359b(objM7321p);
                z = true;
                return Boolean.valueOf(z);
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r5.m7508F0(r6, r0) == r1) goto L28;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7308c(String str, List list, ContinuationImpl continuationImpl) throws Throwable {
        LibraryRepositoryImpl$fetchCourseCounters$1 libraryRepositoryImpl$fetchCourseCounters$1;
        if (continuationImpl instanceof LibraryRepositoryImpl$fetchCourseCounters$1) {
            libraryRepositoryImpl$fetchCourseCounters$1 = (LibraryRepositoryImpl$fetchCourseCounters$1) continuationImpl;
            int i = libraryRepositoryImpl$fetchCourseCounters$1.f15697c;
            if ((i & Integer.MIN_VALUE) != 0) {
                libraryRepositoryImpl$fetchCourseCounters$1.f15697c = i - Integer.MIN_VALUE;
            } else {
                libraryRepositoryImpl$fetchCourseCounters$1 = new LibraryRepositoryImpl$fetchCourseCounters$1(this, continuationImpl);
            }
        } else {
            libraryRepositoryImpl$fetchCourseCounters$1 = new LibraryRepositoryImpl$fetchCourseCounters$1(this, continuationImpl);
        }
        Object objM4469j = libraryRepositoryImpl$fetchCourseCounters$1.f15695a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = libraryRepositoryImpl$fetchCourseCounters$1.f15697c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(objM4469j);
                ca5 ca5Var = this.f16512b;
                libraryRepositoryImpl$fetchCourseCounters$1.f15697c = 1;
                objM4469j = ca5Var.m4469j(str, list, libraryRepositoryImpl$fetchCourseCounters$1);
                if (objM4469j == coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i2 == 1) {
                AbstractC3193b.m15359b(objM4469j);
            } else {
                if (i2 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objM4469j);
            }
            return xfa.f68157a;
            Map map = (Map) objM4469j;
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(AbstractC3122is.m14085D((ResultLibraryCounter) entry.getValue(), ((Number) entry.getKey()).intValue(), LibraryItemType.Collection.getValue()));
            }
            C1321i c1321i = this.f16514d;
            libraryRepositoryImpl$fetchCourseCounters$1.f15697c = 2;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: d */
    public final Object m7309d(String str, int i, Sort sort, EmptyList emptyList, ContinuationImpl continuationImpl) throws Throwable {
        LibraryRepositoryImpl$fetchCourseLessonsSearch$1 libraryRepositoryImpl$fetchCourseLessonsSearch$1;
        Results results;
        Results results2;
        int size;
        List list;
        if (continuationImpl instanceof LibraryRepositoryImpl$fetchCourseLessonsSearch$1) {
            libraryRepositoryImpl$fetchCourseLessonsSearch$1 = (LibraryRepositoryImpl$fetchCourseLessonsSearch$1) continuationImpl;
            int i2 = libraryRepositoryImpl$fetchCourseLessonsSearch$1.f15702e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                libraryRepositoryImpl$fetchCourseLessonsSearch$1.f15702e = i2 - Integer.MIN_VALUE;
            } else {
                libraryRepositoryImpl$fetchCourseLessonsSearch$1 = new LibraryRepositoryImpl$fetchCourseLessonsSearch$1(this, continuationImpl);
            }
        } else {
            libraryRepositoryImpl$fetchCourseLessonsSearch$1 = new LibraryRepositoryImpl$fetchCourseLessonsSearch$1(this, continuationImpl);
        }
        LibraryRepositoryImpl$fetchCourseLessonsSearch$1 libraryRepositoryImpl$fetchCourseLessonsSearch$2 = libraryRepositoryImpl$fetchCourseLessonsSearch$1;
        Object objM4467h = libraryRepositoryImpl$fetchCourseLessonsSearch$2.f15700c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = libraryRepositoryImpl$fetchCourseLessonsSearch$2.f15702e;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM4467h);
            Integer num = new Integer(i);
            String value = sort.getValue();
            libraryRepositoryImpl$fetchCourseLessonsSearch$2.f15699b = i;
            libraryRepositoryImpl$fetchCourseLessonsSearch$2.f15702e = 1;
            objM4467h = this.f16512b.m4467h(str, num, value, LibraryItemType.Content.getValue(), DescriptorProtos.Edition.EDITION_2023_VALUE, 1, emptyList, libraryRepositoryImpl$fetchCourseLessonsSearch$2);
            if (objM4467h != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            i = libraryRepositoryImpl$fetchCourseLessonsSearch$2.f15699b;
            AbstractC3193b.m15359b(objM4467h);
        } else {
            if (i3 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            results2 = libraryRepositoryImpl$fetchCourseLessonsSearch$2.f15698a;
            AbstractC3193b.m15359b(objM4467h);
        }
        results = results2;
        if (results != null || (list = results.f21739d) == null) {
            size = 0;
        } else {
            size = list.size();
        }
        return new Integer(size);
        results = (Results) objM4467h;
        if (results != null) {
            LibraryRepositoryImpl$fetchCourseLessonsSearch$2$1 libraryRepositoryImpl$fetchCourseLessonsSearch$2$1 = new LibraryRepositoryImpl$fetchCourseLessonsSearch$2$1(results, this, i, null);
            libraryRepositoryImpl$fetchCourseLessonsSearch$2.f15698a = results;
            libraryRepositoryImpl$fetchCourseLessonsSearch$2.f15699b = i;
            libraryRepositoryImpl$fetchCourseLessonsSearch$2.f15702e = 2;
            objM4467h = AbstractC0747e.m2849b(this.f16511a, libraryRepositoryImpl$fetchCourseLessonsSearch$2$1, libraryRepositoryImpl$fetchCourseLessonsSearch$2);
            if (objM4467h != coroutineSingletons) {
                results2 = results;
                results = results2;
            }
            return coroutineSingletons;
        }
        if (results != null) {
            size = 0;
        } else {
            size = 0;
        }
        return new Integer(size);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: e */
    public final Object m7310e(String str, int i, Sort sort, EmptyList emptyList, int i2, ContinuationImpl continuationImpl) throws Throwable {
        LibraryRepositoryImpl$fetchCoursePageLessonsSearch$1 libraryRepositoryImpl$fetchCoursePageLessonsSearch$1;
        Results results;
        Results results2;
        int size;
        List list;
        if (continuationImpl instanceof LibraryRepositoryImpl$fetchCoursePageLessonsSearch$1) {
            libraryRepositoryImpl$fetchCoursePageLessonsSearch$1 = (LibraryRepositoryImpl$fetchCoursePageLessonsSearch$1) continuationImpl;
            int i3 = libraryRepositoryImpl$fetchCoursePageLessonsSearch$1.f15719g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                libraryRepositoryImpl$fetchCoursePageLessonsSearch$1.f15719g = i3 - Integer.MIN_VALUE;
            } else {
                libraryRepositoryImpl$fetchCoursePageLessonsSearch$1 = new LibraryRepositoryImpl$fetchCoursePageLessonsSearch$1(this, continuationImpl);
            }
        } else {
            libraryRepositoryImpl$fetchCoursePageLessonsSearch$1 = new LibraryRepositoryImpl$fetchCoursePageLessonsSearch$1(this, continuationImpl);
        }
        LibraryRepositoryImpl$fetchCoursePageLessonsSearch$1 libraryRepositoryImpl$fetchCoursePageLessonsSearch$2 = libraryRepositoryImpl$fetchCoursePageLessonsSearch$1;
        Object objM4467h = libraryRepositoryImpl$fetchCoursePageLessonsSearch$2.f15717e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = libraryRepositoryImpl$fetchCoursePageLessonsSearch$2.f15719g;
        if (i4 == 0) {
            AbstractC3193b.m15359b(objM4467h);
            Integer num = new Integer(i);
            String value = sort.getValue();
            libraryRepositoryImpl$fetchCoursePageLessonsSearch$2.f15713a = sort;
            libraryRepositoryImpl$fetchCoursePageLessonsSearch$2.f15715c = i;
            libraryRepositoryImpl$fetchCoursePageLessonsSearch$2.f15716d = i2;
            libraryRepositoryImpl$fetchCoursePageLessonsSearch$2.f15719g = 1;
            objM4467h = this.f16512b.m4467h(str, num, value, LibraryItemType.Content.getValue(), DescriptorProtos.Edition.EDITION_2023_VALUE, 1, emptyList, libraryRepositoryImpl$fetchCoursePageLessonsSearch$2);
            if (objM4467h != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i4 == 1) {
            i2 = libraryRepositoryImpl$fetchCoursePageLessonsSearch$2.f15716d;
            i = libraryRepositoryImpl$fetchCoursePageLessonsSearch$2.f15715c;
            sort = libraryRepositoryImpl$fetchCoursePageLessonsSearch$2.f15713a;
            AbstractC3193b.m15359b(objM4467h);
        } else {
            if (i4 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            results2 = libraryRepositoryImpl$fetchCoursePageLessonsSearch$2.f15714b;
            AbstractC3193b.m15359b(objM4467h);
        }
        results = results2;
        if (results != null || (list = results.f21739d) == null) {
            size = 0;
        } else {
            size = list.size();
        }
        return new Integer(size);
        Sort sort2 = sort;
        Object obj = objM4467h;
        int i5 = i;
        int i6 = i2;
        results = (Results) obj;
        if (results != null) {
            LibraryRepositoryImpl$fetchCoursePageLessonsSearch$2$1 libraryRepositoryImpl$fetchCoursePageLessonsSearch$2$1 = new LibraryRepositoryImpl$fetchCoursePageLessonsSearch$2$1(results, this, i5, sort2, null);
            libraryRepositoryImpl$fetchCoursePageLessonsSearch$2.f15713a = null;
            libraryRepositoryImpl$fetchCoursePageLessonsSearch$2.f15714b = results;
            libraryRepositoryImpl$fetchCoursePageLessonsSearch$2.f15715c = i5;
            libraryRepositoryImpl$fetchCoursePageLessonsSearch$2.f15716d = i6;
            libraryRepositoryImpl$fetchCoursePageLessonsSearch$2.f15719g = 2;
            objM4467h = AbstractC0747e.m2849b(this.f16511a, libraryRepositoryImpl$fetchCoursePageLessonsSearch$2$1, libraryRepositoryImpl$fetchCoursePageLessonsSearch$2);
            if (objM4467h != coroutineSingletons) {
                results2 = results;
                results = results2;
            }
            return coroutineSingletons;
        }
        if (results != null) {
            size = 0;
        } else {
            size = 0;
        }
        return new Integer(size);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0084 A[Catch: Exception -> 0x014d, TRY_ENTER, TryCatch #0 {Exception -> 0x014d, blocks: (B:13:0x002e, B:18:0x0049, B:33:0x00ba, B:35:0x00d8, B:37:0x00dc, B:39:0x00e9, B:41:0x00ed, B:43:0x00f6, B:45:0x0101, B:47:0x0105, B:49:0x010c, B:51:0x0110, B:53:0x0117, B:26:0x007c, B:29:0x0084, B:54:0x013a, B:19:0x004e, B:25:0x0065, B:22:0x0055), top: B:61:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d8 A[Catch: Exception -> 0x014d, TryCatch #0 {Exception -> 0x014d, blocks: (B:13:0x002e, B:18:0x0049, B:33:0x00ba, B:35:0x00d8, B:37:0x00dc, B:39:0x00e9, B:41:0x00ed, B:43:0x00f6, B:45:0x0101, B:47:0x0105, B:49:0x010c, B:51:0x0110, B:53:0x0117, B:26:0x007c, B:29:0x0084, B:54:0x013a, B:19:0x004e, B:25:0x0065, B:22:0x0055), top: B:61:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ed A[Catch: Exception -> 0x014d, TryCatch #0 {Exception -> 0x014d, blocks: (B:13:0x002e, B:18:0x0049, B:33:0x00ba, B:35:0x00d8, B:37:0x00dc, B:39:0x00e9, B:41:0x00ed, B:43:0x00f6, B:45:0x0101, B:47:0x0105, B:49:0x010c, B:51:0x0110, B:53:0x0117, B:26:0x007c, B:29:0x0084, B:54:0x013a, B:19:0x004e, B:25:0x0065, B:22:0x0055), top: B:61:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:45:0x0101 A[Catch: Exception -> 0x014d, TryCatch #0 {Exception -> 0x014d, blocks: (B:13:0x002e, B:18:0x0049, B:33:0x00ba, B:35:0x00d8, B:37:0x00dc, B:39:0x00e9, B:41:0x00ed, B:43:0x00f6, B:45:0x0101, B:47:0x0105, B:49:0x010c, B:51:0x0110, B:53:0x0117, B:26:0x007c, B:29:0x0084, B:54:0x013a, B:19:0x004e, B:25:0x0065, B:22:0x0055), top: B:61:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x010a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0110 A[Catch: Exception -> 0x014d, TryCatch #0 {Exception -> 0x014d, blocks: (B:13:0x002e, B:18:0x0049, B:33:0x00ba, B:35:0x00d8, B:37:0x00dc, B:39:0x00e9, B:41:0x00ed, B:43:0x00f6, B:45:0x0101, B:47:0x0105, B:49:0x010c, B:51:0x0110, B:53:0x0117, B:26:0x007c, B:29:0x0084, B:54:0x013a, B:19:0x004e, B:25:0x0065, B:22:0x0055), top: B:61:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0115  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00b6 -> B:33:0x00ba). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: f */
    public final java.lang.Object m7311f(java.lang.String r23, java.util.List r24, kotlin.coroutines.Continuation r25) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.core.data.repository.C1296l.m7311f(java.lang.String, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Serializable m7312g(int i, ContinuationImpl continuationImpl) throws Throwable {
        LibraryRepositoryImpl$getCourseLessonAudios$1 libraryRepositoryImpl$getCourseLessonAudios$1;
        if (continuationImpl instanceof LibraryRepositoryImpl$getCourseLessonAudios$1) {
            libraryRepositoryImpl$getCourseLessonAudios$1 = (LibraryRepositoryImpl$getCourseLessonAudios$1) continuationImpl;
            int i2 = libraryRepositoryImpl$getCourseLessonAudios$1.f15742c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                libraryRepositoryImpl$getCourseLessonAudios$1.f15742c = i2 - Integer.MIN_VALUE;
            } else {
                libraryRepositoryImpl$getCourseLessonAudios$1 = new LibraryRepositoryImpl$getCourseLessonAudios$1(this, continuationImpl);
            }
        } else {
            libraryRepositoryImpl$getCourseLessonAudios$1 = new LibraryRepositoryImpl$getCourseLessonAudios$1(this, continuationImpl);
        }
        Object objM2861d = libraryRepositoryImpl$getCourseLessonAudios$1.f15740a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = libraryRepositoryImpl$getCourseLessonAudios$1.f15742c;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM2861d);
            libraryRepositoryImpl$getCourseLessonAudios$1.f15742c = 1;
            String value = LibraryItemType.Content.getValue();
            C1321i c1321i = this.f16514d;
            objM2861d = AbstractC0758a.m2861d(new ek2(i, value, c1321i, 4), c1321i.f17034K, libraryRepositoryImpl$getCourseLessonAudios$1, true, true);
            if (objM2861d == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM2861d);
        }
        Iterable iterable = (Iterable) objM2861d;
        ArrayList arrayList = new ArrayList(v91.m23189q0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC3423or.m18271o0((u85) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m7313h(int i, ContinuationImpl continuationImpl) throws Throwable {
        LibraryRepositoryImpl$getLessonInfo$1 libraryRepositoryImpl$getLessonInfo$1;
        if (continuationImpl instanceof LibraryRepositoryImpl$getLessonInfo$1) {
            libraryRepositoryImpl$getLessonInfo$1 = (LibraryRepositoryImpl$getLessonInfo$1) continuationImpl;
            int i2 = libraryRepositoryImpl$getLessonInfo$1.f15745c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                libraryRepositoryImpl$getLessonInfo$1.f15745c = i2 - Integer.MIN_VALUE;
            } else {
                libraryRepositoryImpl$getLessonInfo$1 = new LibraryRepositoryImpl$getLessonInfo$1(this, continuationImpl);
            }
        } else {
            libraryRepositoryImpl$getLessonInfo$1 = new LibraryRepositoryImpl$getLessonInfo$1(this, continuationImpl);
        }
        Object objM2861d = libraryRepositoryImpl$getLessonInfo$1.f15743a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = libraryRepositoryImpl$getLessonInfo$1.f15745c;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM2861d);
            libraryRepositoryImpl$getLessonInfo$1.f15745c = 1;
            C1321i c1321i = this.f16514d;
            objM2861d = AbstractC0758a.m2861d(new l85(i, c1321i, 3), c1321i.f17034K, libraryRepositoryImpl$getLessonInfo$1, true, false);
            if (objM2861d == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM2861d);
        }
        u85 u85Var = (u85) objM2861d;
        if (u85Var != null) {
            return AbstractC3423or.m18267m0(u85Var);
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final c83 m7314i(int i) {
        String value = LibraryItemType.Content.getValue();
        C1321i c1321i = this.f16514d;
        c1321i.getClass();
        value.getClass();
        return AbstractC3224d.m15536o(AbstractC3584sr.m21590A(c1321i.f17034K, false, new String[]{"LibraryCounterEntity"}, new ld0(i, value, 11)));
    }

    /* JADX INFO: renamed from: j */
    public final c83 m7315j(int i) {
        C1321i c1321i = this.f16514d;
        return AbstractC3224d.m15536o(new bx0(AbstractC3584sr.m21590A(c1321i.f17034K, false, new String[]{"LibraryDataEntity"}, new l85(i, c1321i, 0)), 15));
    }

    /* JADX INFO: renamed from: k */
    public final c83 m7316k(List list) {
        C1321i c1321i = this.f16514d;
        c1321i.getClass();
        list.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `id`, `isDownloaded`, `downloadProgress` FROM (SELECT * FROM LessonAudioDownloadEntity WHERE id IN (");
        d32.m10005B(list.size(), sb);
        sb.append("))");
        return AbstractC3224d.m15536o(AbstractC3584sr.m21590A(c1321i.f17034K, true, new String[]{"LessonAudioDownloadEntity"}, new l05(1, sb.toString(), list)));
    }

    /* JADX INFO: renamed from: l */
    public final c83 m7317l(List list) {
        List<Pair> list2 = list;
        ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
        for (Pair pair : list2) {
            Object obj = pair.f47623a;
            Object obj2 = pair.f47624b;
            StringBuilder sb = new StringBuilder();
            sb.append(obj);
            sb.append(obj2);
            arrayList.add(sb.toString());
        }
        C1321i c1321i = this.f16514d;
        c1321i.getClass();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT `id`, `roseGiven`, `progress`, `listenTimes`, `readTimes`, `isTaken`, `difficulty`, `rosesCount`, `newWordsCount`, `knownWordsCount`, `cardsCount`, `lessonsCount`, `isCompletelyTaken`, `totalWordsCount`, `uniqueWordsCount`, `audioStart`, `audioEnd` FROM (SELECT DISTINCT LibraryCounterEntity.*, LibraryCounterEntity.id || LibraryCounterEntity.type AS idWithType FROM LibraryCounterEntity WHERE idWithType IN (");
        return AbstractC3224d.m15536o(AbstractC3584sr.m21590A(c1321i.f17034K, true, new String[]{"LibraryCounterEntity"}, new pl4(1, AbstractC3393o1.m17736k("))", sb2, arrayList), arrayList)));
    }

    /* JADX INFO: renamed from: m */
    public final c83 m7318m(List list) {
        String value = LibraryItemType.Content.getValue();
        C1321i c1321i = this.f16514d;
        c1321i.getClass();
        list.getClass();
        value.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `id`, `isDownloaded`, `downloadProgress` FROM (SELECT * FROM LibraryDownloadEntity WHERE id IN (");
        int size = list.size();
        d32.m10005B(size, sb);
        sb.append(") AND type = ");
        sb.append("?");
        sb.append(")");
        return AbstractC3224d.m15536o(AbstractC3584sr.m21590A(c1321i.f17034K, true, new String[]{"LibraryDownloadEntity"}, new i85(sb.toString(), list, size, value, 0)));
    }

    /* JADX INFO: renamed from: n */
    public final c83 m7319n(String str, int i, String str2, String str3) {
        str.getClass();
        String strM23629f = vz1.m23629f(str, str2);
        int length = str3.length();
        C1321i c1321i = this.f16514d;
        if (length == 0) {
            c1321i.getClass();
            return AbstractC3224d.m15536o(new yo1(AbstractC3584sr.m21590A(c1321i.f17034K, true, new String[]{"LibraryDataEntity", "LibraryShelfAndContentJoin"}, new m85(strM23629f, i, 0, c1321i)), 3));
        }
        c1321i.getClass();
        return AbstractC3224d.m15536o(new bx0(AbstractC3584sr.m21590A(c1321i.f17034K, true, new String[]{"LibraryDataEntity", "LibraryShelfAndContentJoin"}, new vp0(i, 3, strM23629f, str3, c1321i)), 18));
    }

    /* JADX INFO: renamed from: o */
    public final c83 m7320o(String str, List list) {
        str.getClass();
        String strM22596N0 = list != null ? u91.m22596N0(list, null, null, null, null, 63) : "";
        C1321i c1321i = this.f16514d;
        c1321i.getClass();
        return AbstractC3224d.m15536o(AbstractC3584sr.m21590A(c1321i.f17034K, true, new String[]{"LibraryShelfEntity"}, new n85(str, strM22596N0, c1321i, 1)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: p */
    public final Object m7321p(int i, String str, ContinuationImpl continuationImpl) throws Throwable {
        LibraryRepositoryImpl$syncBuyCourse$1 libraryRepositoryImpl$syncBuyCourse$1;
        if (continuationImpl instanceof LibraryRepositoryImpl$syncBuyCourse$1) {
            libraryRepositoryImpl$syncBuyCourse$1 = (LibraryRepositoryImpl$syncBuyCourse$1) continuationImpl;
            int i2 = libraryRepositoryImpl$syncBuyCourse$1.f15766c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                libraryRepositoryImpl$syncBuyCourse$1.f15766c = i2 - Integer.MIN_VALUE;
            } else {
                libraryRepositoryImpl$syncBuyCourse$1 = new LibraryRepositoryImpl$syncBuyCourse$1(this, continuationImpl);
            }
        } else {
            libraryRepositoryImpl$syncBuyCourse$1 = new LibraryRepositoryImpl$syncBuyCourse$1(this, continuationImpl);
        }
        Object objM4461a = libraryRepositoryImpl$syncBuyCourse$1.f15764a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = libraryRepositoryImpl$syncBuyCourse$1.f15766c;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM4461a);
            Integer num = new Integer(i);
            libraryRepositoryImpl$syncBuyCourse$1.f15766c = 1;
            objM4461a = this.f16512b.m4461a(str, num, libraryRepositoryImpl$syncBuyCourse$1);
            if (objM4461a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM4461a);
        }
        i88 i88Var = (i88) objM4461a;
        return Boolean.valueOf(i88Var != null ? i88Var.f43689a.f45200L : false);
    }

    /* JADX INFO: renamed from: q */
    public final Object m7322q(int i, String str, String str2, ContinuationImpl continuationImpl, boolean z) {
        xfa xfaVar = xfa.f68157a;
        C1321i c1321i = this.f16514d;
        if (z) {
            Object objM7511J0 = c1321i.m7511J0(i, continuationImpl);
            if (objM7511J0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objM7511J0;
            }
        } else {
            v85 v85Var = new v85(str, i, str2, z);
            Object objM2861d = AbstractC0758a.m2861d(new h85(4, c1321i, v85Var), c1321i.f17034K, continuationImpl, false, true);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (objM2861d != coroutineSingletons) {
                objM2861d = xfaVar;
            }
            if (objM2861d == coroutineSingletons) {
                return objM2861d;
            }
        }
        return xfaVar;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0278 A[LOOP:1: B:100:0x026e->B:102:0x0278, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:121:0x031c  */
    /* JADX WARN: Code duplicated, block: B:124:0x032d  */
    /* JADX WARN: Code duplicated, block: B:125:0x032f  */
    /* JADX WARN: Code duplicated, block: B:129:0x0386  */
    /* JADX WARN: Code duplicated, block: B:133:0x0398  */
    /* JADX WARN: Code duplicated, block: B:136:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:140:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:141:0x03da  */
    /* JADX WARN: Code duplicated, block: B:149:0x02b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x02d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x02fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x02d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x02f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x02a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:86:0x0202  */
    /* JADX WARN: Code duplicated, block: B:88:0x0208  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Code duplicated, block: B:90:0x0211  */
    /* JADX WARN: Code duplicated, block: B:93:0x0228 A[LOOP:3: B:91:0x0222->B:93:0x0228, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:97:0x023c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0248  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d3, code lost:
    
        if (r7 == r8) goto L28;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:102:0x0278, please report this as an issue */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7323r(String str, String str2, String str3, boolean z, String str4, String str5, String str6, LibrarySearchQuery librarySearchQuery, int i, ContinuationImpl continuationImpl) throws Throwable {
        LibraryRepositoryImpl$updateLibraryItems$1 libraryRepositoryImpl$updateLibraryItems$1;
        int i2;
        LibraryRepositoryImpl$updateLibraryItems$1 libraryRepositoryImpl$updateLibraryItems$2;
        String str7;
        String str8;
        String str9;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        CollectionsFilterProvider collectionsFilterProvider;
        Integer numM8084a;
        ArrayList arrayList;
        Iterator it;
        List listM23604J;
        CollectionsFilter collectionsFilter;
        Integer num;
        ArrayList arrayList2;
        Iterator<E> it2;
        String value;
        String str10;
        int i3;
        String str11;
        Object obj;
        String str12;
        String str13;
        boolean z2;
        int i4;
        String strM11559a;
        Results results;
        List list;
        LibraryRepositoryImpl$updateLibraryItems$2$1 libraryRepositoryImpl$updateLibraryItems$2$1;
        Results results2;
        List list2;
        int size;
        boolean z3 = z;
        if (continuationImpl instanceof LibraryRepositoryImpl$updateLibraryItems$1) {
            libraryRepositoryImpl$updateLibraryItems$1 = (LibraryRepositoryImpl$updateLibraryItems$1) continuationImpl;
            int i5 = libraryRepositoryImpl$updateLibraryItems$1.f15775i;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                libraryRepositoryImpl$updateLibraryItems$1.f15775i = i5 - Integer.MIN_VALUE;
            } else {
                libraryRepositoryImpl$updateLibraryItems$1 = new LibraryRepositoryImpl$updateLibraryItems$1(this, continuationImpl);
            }
        } else {
            libraryRepositoryImpl$updateLibraryItems$1 = new LibraryRepositoryImpl$updateLibraryItems$1(this, continuationImpl);
        }
        LibraryRepositoryImpl$updateLibraryItems$1 libraryRepositoryImpl$updateLibraryItems$3 = libraryRepositoryImpl$updateLibraryItems$1;
        Object objM4468i = libraryRepositoryImpl$updateLibraryItems$3.f15773g;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = libraryRepositoryImpl$updateLibraryItems$3.f15775i;
        if (i6 == 0) {
            AbstractC3193b.m15359b(objM4468i);
            if (z3 && vk9.m23380c0(str4, "/folders/", false)) {
                libraryRepositoryImpl$updateLibraryItems$3.f15767a = null;
                libraryRepositoryImpl$updateLibraryItems$3.f15768b = null;
                libraryRepositoryImpl$updateLibraryItems$3.f15769c = null;
                libraryRepositoryImpl$updateLibraryItems$3.f15771e = z3;
                libraryRepositoryImpl$updateLibraryItems$3.f15772f = i;
                libraryRepositoryImpl$updateLibraryItems$3.f15775i = 1;
                Object objM7324s = m7324s(i, str, str2, str3, str4, libraryRepositoryImpl$updateLibraryItems$3);
                if (objM7324s != obj2) {
                    return objM7324s;
                }
            } else {
                i2 = i;
                libraryRepositoryImpl$updateLibraryItems$2 = libraryRepositoryImpl$updateLibraryItems$3;
                str7 = str;
                str8 = str2;
                str9 = str3;
                if (!z3) {
                    int i7 = librarySearchQuery.f19481c;
                    ContentType contentType = librarySearchQuery.f19487i;
                    String value2 = librarySearchQuery.f19482d.getValue();
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Map map = librarySearchQuery.f19479a;
                    Resources resources = Resources.ResourceAttachments;
                    Boolean bool4 = Boolean.FALSE;
                    map.put(resources, bool4);
                    Resources resources2 = Resources.ResourceExercises;
                    map.put(resources2, bool4);
                    Resources resources3 = Resources.ResourceNotes;
                    map.put(resources3, bool4);
                    Resources resources4 = Resources.ResourceScript;
                    map.put(resources4, bool4);
                    Resources resources5 = Resources.ResourceTranslations;
                    map.put(resources5, bool4);
                    Resources resources6 = Resources.ResourceVideos;
                    map.put(resources6, bool4);
                    Object obj3 = map.get(resources);
                    Boolean bool5 = Boolean.TRUE;
                    if (fa4.m11650l(obj3, bool5)) {
                        linkedHashSet.add(resources.getValue());
                    }
                    if (fa4.m11650l(map.get(resources2), bool5)) {
                        linkedHashSet.add(resources.getValue());
                    }
                    if (fa4.m11650l(map.get(resources3), bool5)) {
                        linkedHashSet.add(resources3.getValue());
                    }
                    if (fa4.m11650l(map.get(resources5), bool5)) {
                        linkedHashSet.add(resources5.getValue());
                    }
                    if (fa4.m11650l(map.get(resources6), bool5)) {
                        linkedHashSet.add(resources6.getValue());
                    }
                    if (fa4.m11650l(map.get(resources4), bool5)) {
                        linkedHashSet.add(resources4.getValue());
                    }
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    for (LearningLevel learningLevel : LearningLevel.values()) {
                        if (fa4.m11650l(librarySearchQuery.f19480b.get(learningLevel), Boolean.TRUE)) {
                            linkedHashSet2.add(Integer.valueOf(learningLevel.ordinal() + 1));
                        }
                    }
                    ContentType.Companion.getClass();
                    int i8 = contentType == null ? -1 : ll1.f49793a[contentType.ordinal()];
                    if (i8 != 1) {
                        if (i8 != 2) {
                            bool2 = null;
                        } else {
                            bool = Boolean.FALSE;
                        }
                        bool3 = (vk9.m23380c0(str6, "_my_imports_", false) || contentType == ContentType.MyImports) ? Boolean.TRUE : null;
                        Boolean bool6 = bool3;
                        collectionsFilterProvider = librarySearchQuery.f19488j;
                        if (collectionsFilterProvider != null) {
                            numM8084a = collectionsFilterProvider.m8084a();
                        } else {
                            numM8084a = null;
                        }
                        List list3 = librarySearchQuery.f19486h;
                        if (f5d.m11559a(str8) != null) {
                            strM11559a = f5d.m11559a(str8);
                            if (strM11559a == null) {
                                strM11559a = "";
                            }
                            listM23604J = vz1.m23604J(strM11559a);
                        } else {
                            List list4 = librarySearchQuery.f19490l;
                            arrayList = new ArrayList(v91.m23189q0(list4, 10));
                            it = list4.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((Accent) it.next()).getValue());
                            }
                            listM23604J = arrayList;
                        }
                        collectionsFilter = librarySearchQuery.f19489k;
                        if (collectionsFilter != null) {
                            num = new Integer(collectionsFilter.m8082a());
                        } else {
                            num = null;
                        }
                        RequestQuery requestQuery = new RequestQuery(i7, value2, linkedHashSet, linkedHashSet2, bool2, bool6, numM8084a, list3, listM23604J, num, Boolean.valueOf(librarySearchQuery.f19491m));
                        ys2 entries = LibraryContentType.getEntries();
                        arrayList2 = new ArrayList(v91.m23189q0(entries, 10));
                        it2 = entries.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add("_type=" + ((LibraryContentType) it2.next()).getValue() + "_");
                        }
                        HashSet<String> hashSetM22620l1 = u91.m22620l1(arrayList2);
                        value = LibraryItemType.Content.getValue();
                        for (String str14 : hashSetM22620l1) {
                            if (vk9.m23380c0(str8, str14, false)) {
                                if (str14.equals("_type=" + LibraryContentType.Lessons.getValue() + "_")) {
                                    value = LibraryItemType.Content.getValue();
                                } else {
                                    String value3 = LibraryContentType.Courses.getValue();
                                    StringBuilder sb = new StringBuilder("_type=");
                                    sb.append(value3);
                                    sb.append("_");
                                    value = str14.equals(sb.toString()) ? LibraryItemType.Collection.getValue() : null;
                                }
                            }
                        }
                        String strM8268f = requestQuery.m8268f();
                        if (!fa4.m11650l(str5, LibraryShelfType.Search.getValue()) || fa4.m11650l(str5, LibraryShelfType.SourceSearch.getValue())) {
                            str10 = null;
                        } else {
                            str10 = str5;
                        }
                        Set<Integer> setM8264b = requestQuery.m8264b();
                        Set<String> setM8266d = requestQuery.m8266d();
                        i3 = 0;
                        if (str9.length() == 0) {
                            str11 = null;
                        } else {
                            str11 = str9;
                        }
                        Boolean boolM8270h = requestQuery.m8270h();
                        Boolean boolM8272j = requestQuery.m8272j();
                        Integer numM8265c = requestQuery.m8265c();
                        List<String> listM8269g = requestQuery.m8269g();
                        List<String> listM8263a = requestQuery.m8263a();
                        Integer numM8267e = requestQuery.m8267e();
                        Boolean boolM8271i = requestQuery.m8271i();
                        String str15 = value;
                        Integer num2 = new Integer(20);
                        libraryRepositoryImpl$updateLibraryItems$2.f15767a = str7;
                        libraryRepositoryImpl$updateLibraryItems$2.f15768b = str8;
                        libraryRepositoryImpl$updateLibraryItems$2.f15769c = str9;
                        libraryRepositoryImpl$updateLibraryItems$2.f15770d = null;
                        libraryRepositoryImpl$updateLibraryItems$2.f15771e = z;
                        libraryRepositoryImpl$updateLibraryItems$2.f15772f = i;
                        libraryRepositoryImpl$updateLibraryItems$2.f15775i = 3;
                        obj = obj2;
                        objM4468i = this.f16512b.m4468i(str7, num2, strM8268f, str15, setM8264b, str10, setM8266d, str11, boolM8270h, boolM8272j, numM8265c, listM8269g, listM8263a, numM8267e, boolM8271i, i, EmptyList.f47638a, libraryRepositoryImpl$updateLibraryItems$2);
                        libraryRepositoryImpl$updateLibraryItems$3 = libraryRepositoryImpl$updateLibraryItems$2;
                        if (objM4468i == obj) {
                            return obj;
                        }
                        str7 = str;
                        str12 = str2;
                        str13 = str3;
                        z2 = z;
                        i4 = i;
                        results = (Results) objM4468i;
                        i2 = i4;
                        z3 = z2;
                        list = results.f21739d;
                        if (list != null) {
                            libraryRepositoryImpl$updateLibraryItems$2$1 = new LibraryRepositoryImpl$updateLibraryItems$2$1(list, this, i2, vz1.m23629f(str7, str12), str13, str7, null);
                            libraryRepositoryImpl$updateLibraryItems$3.f15767a = null;
                            libraryRepositoryImpl$updateLibraryItems$3.f15768b = null;
                            libraryRepositoryImpl$updateLibraryItems$3.f15769c = null;
                            libraryRepositoryImpl$updateLibraryItems$3.f15770d = results;
                            libraryRepositoryImpl$updateLibraryItems$3.f15771e = z3;
                            libraryRepositoryImpl$updateLibraryItems$3.f15772f = i2;
                            libraryRepositoryImpl$updateLibraryItems$3.f15775i = 4;
                            if (AbstractC0747e.m2849b(this.f16511a, libraryRepositoryImpl$updateLibraryItems$2$1, libraryRepositoryImpl$updateLibraryItems$3) == obj) {
                                return obj;
                            }
                            results2 = results;
                        }
                        list2 = results.f21739d;
                        if (list2 != null) {
                            size = list2.size();
                        } else {
                            size = i3;
                        }
                        return new Integer(size);
                    }
                    bool = Boolean.TRUE;
                    bool2 = bool;
                    if (vk9.m23380c0(str6, "_my_imports_", false)) {
                        bool3 = Boolean.TRUE;
                    }
                    Boolean bool7 = bool3;
                    collectionsFilterProvider = librarySearchQuery.f19488j;
                    if (collectionsFilterProvider != null) {
                        numM8084a = collectionsFilterProvider.m8084a();
                    } else {
                        numM8084a = null;
                    }
                    List list5 = librarySearchQuery.f19486h;
                    if (f5d.m11559a(str8) != null) {
                        strM11559a = f5d.m11559a(str8);
                        if (strM11559a == null) {
                            strM11559a = "";
                        }
                        listM23604J = vz1.m23604J(strM11559a);
                    } else {
                        List list6 = librarySearchQuery.f19490l;
                        arrayList = new ArrayList(v91.m23189q0(list6, 10));
                        it = list6.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((Accent) it.next()).getValue());
                        }
                        listM23604J = arrayList;
                    }
                    collectionsFilter = librarySearchQuery.f19489k;
                    if (collectionsFilter != null) {
                        num = new Integer(collectionsFilter.m8082a());
                    } else {
                        num = null;
                    }
                    RequestQuery requestQuery2 = new RequestQuery(i7, value2, linkedHashSet, linkedHashSet2, bool2, bool7, numM8084a, list5, listM23604J, num, Boolean.valueOf(librarySearchQuery.f19491m));
                    ys2 entries2 = LibraryContentType.getEntries();
                    arrayList2 = new ArrayList(v91.m23189q0(entries2, 10));
                    it2 = entries2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add("_type=" + ((LibraryContentType) it2.next()).getValue() + "_");
                    }
                    HashSet<String> hashSetM22620l2 = u91.m22620l1(arrayList2);
                    value = LibraryItemType.Content.getValue();
                    while (r1.hasNext()) {
                        if (vk9.m23380c0(str8, str14, false)) {
                            if (str14.equals("_type=" + LibraryContentType.Lessons.getValue() + "_")) {
                                value = LibraryItemType.Content.getValue();
                            } else {
                                String value4 = LibraryContentType.Courses.getValue();
                                StringBuilder sb2 = new StringBuilder("_type=");
                                sb2.append(value4);
                                sb2.append("_");
                                if (str14.equals(sb2.toString())) {
                                }
                            }
                        }
                    }
                    String strM8268f2 = requestQuery2.m8268f();
                    if (fa4.m11650l(str5, LibraryShelfType.Search.getValue())) {
                        str10 = null;
                    } else {
                        str10 = null;
                    }
                    Set<Integer> setM8264b2 = requestQuery2.m8264b();
                    Set<String> setM8266d2 = requestQuery2.m8266d();
                    i3 = 0;
                    if (str9.length() == 0) {
                        str11 = null;
                    } else {
                        str11 = str9;
                    }
                    Boolean boolM8270h2 = requestQuery2.m8270h();
                    Boolean boolM8272j2 = requestQuery2.m8272j();
                    Integer numM8265c2 = requestQuery2.m8265c();
                    List<String> listM8269g2 = requestQuery2.m8269g();
                    List<String> listM8263a2 = requestQuery2.m8263a();
                    Integer numM8267e2 = requestQuery2.m8267e();
                    Boolean boolM8271i2 = requestQuery2.m8271i();
                    String str16 = value;
                    Integer num3 = new Integer(20);
                    libraryRepositoryImpl$updateLibraryItems$2.f15767a = str7;
                    libraryRepositoryImpl$updateLibraryItems$2.f15768b = str8;
                    libraryRepositoryImpl$updateLibraryItems$2.f15769c = str9;
                    libraryRepositoryImpl$updateLibraryItems$2.f15770d = null;
                    libraryRepositoryImpl$updateLibraryItems$2.f15771e = z;
                    libraryRepositoryImpl$updateLibraryItems$2.f15772f = i;
                    libraryRepositoryImpl$updateLibraryItems$2.f15775i = 3;
                    obj = obj2;
                    objM4468i = this.f16512b.m4468i(str7, num3, strM8268f2, str16, setM8264b2, str10, setM8266d2, str11, boolM8270h2, boolM8272j2, numM8265c2, listM8269g2, listM8263a2, numM8267e2, boolM8271i2, i, EmptyList.f47638a, libraryRepositoryImpl$updateLibraryItems$2);
                    libraryRepositoryImpl$updateLibraryItems$3 = libraryRepositoryImpl$updateLibraryItems$2;
                    if (objM4468i == obj) {
                        return obj;
                    }
                    str7 = str;
                    str12 = str2;
                    str13 = str3;
                    z2 = z;
                    i4 = i;
                    results = (Results) objM4468i;
                    i2 = i4;
                    z3 = z2;
                    list = results.f21739d;
                    if (list != null) {
                        libraryRepositoryImpl$updateLibraryItems$2$1 = new LibraryRepositoryImpl$updateLibraryItems$2$1(list, this, i2, vz1.m23629f(str7, str12), str13, str7, null);
                        libraryRepositoryImpl$updateLibraryItems$3.f15767a = null;
                        libraryRepositoryImpl$updateLibraryItems$3.f15768b = null;
                        libraryRepositoryImpl$updateLibraryItems$3.f15769c = null;
                        libraryRepositoryImpl$updateLibraryItems$3.f15770d = results;
                        libraryRepositoryImpl$updateLibraryItems$3.f15771e = z3;
                        libraryRepositoryImpl$updateLibraryItems$3.f15772f = i2;
                        libraryRepositoryImpl$updateLibraryItems$3.f15775i = 4;
                        if (AbstractC0747e.m2849b(this.f16511a, libraryRepositoryImpl$updateLibraryItems$2$1, libraryRepositoryImpl$updateLibraryItems$3) == obj) {
                            return obj;
                        }
                        results2 = results;
                    }
                    list2 = results.f21739d;
                    if (list2 != null) {
                        size = list2.size();
                    } else {
                        size = i3;
                    }
                    return new Integer(size);
                }
                String strM4839V = cl9.m4839V(cl9.m4839V(str4, "page_size=6", "page_size=18"), "random", "newest");
                libraryRepositoryImpl$updateLibraryItems$2.f15767a = str7;
                libraryRepositoryImpl$updateLibraryItems$2.f15768b = str8;
                libraryRepositoryImpl$updateLibraryItems$2.f15769c = str9;
                libraryRepositoryImpl$updateLibraryItems$2.f15771e = z3;
                libraryRepositoryImpl$updateLibraryItems$2.f15772f = i2;
                libraryRepositoryImpl$updateLibraryItems$2.f15775i = 2;
                objM4468i = this.f16512b.m4466g(strM4839V, libraryRepositoryImpl$updateLibraryItems$2);
            }
            return obj2;
        }
        if (i6 == 1) {
            AbstractC3193b.m15359b(objM4468i);
            return objM4468i;
        }
        if (i6 == 2) {
            int i9 = libraryRepositoryImpl$updateLibraryItems$3.f15772f;
            boolean z4 = libraryRepositoryImpl$updateLibraryItems$3.f15771e;
            String str17 = libraryRepositoryImpl$updateLibraryItems$3.f15769c;
            String str18 = libraryRepositoryImpl$updateLibraryItems$3.f15768b;
            str7 = libraryRepositoryImpl$updateLibraryItems$3.f15767a;
            AbstractC3193b.m15359b(objM4468i);
            i2 = i9;
            z3 = z4;
            libraryRepositoryImpl$updateLibraryItems$2 = libraryRepositoryImpl$updateLibraryItems$3;
            str8 = str18;
            str9 = str17;
            results = (Results) objM4468i;
            str13 = str9;
            str12 = str8;
            obj = obj2;
            libraryRepositoryImpl$updateLibraryItems$3 = libraryRepositoryImpl$updateLibraryItems$2;
            i3 = 0;
            list = results.f21739d;
            if (list != null) {
                libraryRepositoryImpl$updateLibraryItems$2$1 = new LibraryRepositoryImpl$updateLibraryItems$2$1(list, this, i2, vz1.m23629f(str7, str12), str13, str7, null);
                libraryRepositoryImpl$updateLibraryItems$3.f15767a = null;
                libraryRepositoryImpl$updateLibraryItems$3.f15768b = null;
                libraryRepositoryImpl$updateLibraryItems$3.f15769c = null;
                libraryRepositoryImpl$updateLibraryItems$3.f15770d = results;
                libraryRepositoryImpl$updateLibraryItems$3.f15771e = z3;
                libraryRepositoryImpl$updateLibraryItems$3.f15772f = i2;
                libraryRepositoryImpl$updateLibraryItems$3.f15775i = 4;
                if (AbstractC0747e.m2849b(this.f16511a, libraryRepositoryImpl$updateLibraryItems$2$1, libraryRepositoryImpl$updateLibraryItems$3) == obj) {
                    return obj;
                }
                results2 = results;
            }
            list2 = results.f21739d;
            if (list2 != null) {
                size = list2.size();
            } else {
                size = i3;
            }
            return new Integer(size);
        }
        if (i6 == 3) {
            i4 = libraryRepositoryImpl$updateLibraryItems$3.f15772f;
            z2 = libraryRepositoryImpl$updateLibraryItems$3.f15771e;
            str13 = libraryRepositoryImpl$updateLibraryItems$3.f15769c;
            str12 = libraryRepositoryImpl$updateLibraryItems$3.f15768b;
            str7 = libraryRepositoryImpl$updateLibraryItems$3.f15767a;
            AbstractC3193b.m15359b(objM4468i);
            obj = obj2;
            i3 = 0;
            results = (Results) objM4468i;
            i2 = i4;
            z3 = z2;
            list = results.f21739d;
            if (list != null) {
                libraryRepositoryImpl$updateLibraryItems$2$1 = new LibraryRepositoryImpl$updateLibraryItems$2$1(list, this, i2, vz1.m23629f(str7, str12), str13, str7, null);
                libraryRepositoryImpl$updateLibraryItems$3.f15767a = null;
                libraryRepositoryImpl$updateLibraryItems$3.f15768b = null;
                libraryRepositoryImpl$updateLibraryItems$3.f15769c = null;
                libraryRepositoryImpl$updateLibraryItems$3.f15770d = results;
                libraryRepositoryImpl$updateLibraryItems$3.f15771e = z3;
                libraryRepositoryImpl$updateLibraryItems$3.f15772f = i2;
                libraryRepositoryImpl$updateLibraryItems$3.f15775i = 4;
                if (AbstractC0747e.m2849b(this.f16511a, libraryRepositoryImpl$updateLibraryItems$2$1, libraryRepositoryImpl$updateLibraryItems$3) == obj) {
                    return obj;
                }
                results2 = results;
            }
            list2 = results.f21739d;
            if (list2 != null) {
                size = list2.size();
            } else {
                size = i3;
            }
            return new Integer(size);
        }
        if (i6 != 4) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        results2 = libraryRepositoryImpl$updateLibraryItems$3.f15770d;
        AbstractC3193b.m15359b(objM4468i);
        i3 = 0;
        results = results2;
        list2 = results.f21739d;
        if (list2 != null) {
            size = list2.size();
        } else {
            size = i3;
        }
        return new Integer(size);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: s */
    public final Object m7324s(int i, String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) throws Throwable {
        LibraryRepositoryImpl$updateLibraryPlaylists$1 libraryRepositoryImpl$updateLibraryPlaylists$1;
        int i2;
        String str5;
        String str6;
        String str7;
        List list;
        if (continuationImpl instanceof LibraryRepositoryImpl$updateLibraryPlaylists$1) {
            libraryRepositoryImpl$updateLibraryPlaylists$1 = (LibraryRepositoryImpl$updateLibraryPlaylists$1) continuationImpl;
            int i3 = libraryRepositoryImpl$updateLibraryPlaylists$1.f15792h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                libraryRepositoryImpl$updateLibraryPlaylists$1.f15792h = i3 - Integer.MIN_VALUE;
            } else {
                libraryRepositoryImpl$updateLibraryPlaylists$1 = new LibraryRepositoryImpl$updateLibraryPlaylists$1(this, continuationImpl);
            }
        } else {
            libraryRepositoryImpl$updateLibraryPlaylists$1 = new LibraryRepositoryImpl$updateLibraryPlaylists$1(this, continuationImpl);
        }
        LibraryRepositoryImpl$updateLibraryPlaylists$1 libraryRepositoryImpl$updateLibraryPlaylists$2 = libraryRepositoryImpl$updateLibraryPlaylists$1;
        Object objM4462b = libraryRepositoryImpl$updateLibraryPlaylists$2.f15790f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = libraryRepositoryImpl$updateLibraryPlaylists$2.f15792h;
        if (i4 != 0) {
            if (i4 == 1) {
                int i5 = libraryRepositoryImpl$updateLibraryPlaylists$2.f15789e;
                String str8 = libraryRepositoryImpl$updateLibraryPlaylists$2.f15787c;
                str6 = libraryRepositoryImpl$updateLibraryPlaylists$2.f15786b;
                str5 = libraryRepositoryImpl$updateLibraryPlaylists$2.f15785a;
                AbstractC3193b.m15359b(objM4462b);
                str7 = str8;
                i2 = i5;
            } else {
                if (i4 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list = libraryRepositoryImpl$updateLibraryPlaylists$2.f15788d;
                AbstractC3193b.m15359b(objM4462b);
            }
            return new Integer(list.size());
        }
        AbstractC3193b.m15359b(objM4462b);
        String strM4839V = cl9.m4839V(str4, "page_size=6", "page_size=18");
        if (i > 1) {
            strM4839V = strM4839V + "&page=" + i;
        }
        libraryRepositoryImpl$updateLibraryPlaylists$2.f15785a = str;
        libraryRepositoryImpl$updateLibraryPlaylists$2.f15786b = str2;
        libraryRepositoryImpl$updateLibraryPlaylists$2.f15787c = str3;
        libraryRepositoryImpl$updateLibraryPlaylists$2.f15789e = i;
        libraryRepositoryImpl$updateLibraryPlaylists$2.f15792h = 1;
        objM4462b = this.f16512b.m4462b(strM4839V, libraryRepositoryImpl$updateLibraryPlaylists$2);
        if (objM4462b != coroutineSingletons) {
            i2 = i;
            str5 = str;
            str6 = str2;
            str7 = str3;
        }
        return coroutineSingletons;
        List list2 = ((Results) objM4462b).f21739d;
        if (list2 == null) {
            list2 = EmptyList.f47638a;
        }
        List list3 = list2;
        LibraryRepositoryImpl$updateLibraryPlaylists$2 libraryRepositoryImpl$updateLibraryPlaylists$3 = new LibraryRepositoryImpl$updateLibraryPlaylists$2(list3, this, i2, vz1.m23629f(str5, str6), str7, null);
        libraryRepositoryImpl$updateLibraryPlaylists$2.f15785a = null;
        libraryRepositoryImpl$updateLibraryPlaylists$2.f15786b = null;
        libraryRepositoryImpl$updateLibraryPlaylists$2.f15787c = null;
        libraryRepositoryImpl$updateLibraryPlaylists$2.f15788d = list3;
        libraryRepositoryImpl$updateLibraryPlaylists$2.f15789e = i2;
        libraryRepositoryImpl$updateLibraryPlaylists$2.f15792h = 2;
        if (AbstractC0747e.m2849b(this.f16511a, libraryRepositoryImpl$updateLibraryPlaylists$3, libraryRepositoryImpl$updateLibraryPlaylists$2) != coroutineSingletons) {
            list = list3;
            return new Integer(list.size());
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e6, code lost:
    
        if (androidx.room.AbstractC0747e.m2849b(r10, r0, r7) == r8) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7325t(String str, List list, ContinuationImpl continuationImpl) throws Throwable {
        LibraryRepositoryImpl$updateLibraryShelves$1 libraryRepositoryImpl$updateLibraryShelves$1;
        String strM22596N0;
        Object objM4465f;
        Object objM2861d;
        String str2;
        List list2;
        String str3;
        String str4 = str;
        List list3 = list;
        if (continuationImpl instanceof LibraryRepositoryImpl$updateLibraryShelves$1) {
            libraryRepositoryImpl$updateLibraryShelves$1 = (LibraryRepositoryImpl$updateLibraryShelves$1) continuationImpl;
            int i = libraryRepositoryImpl$updateLibraryShelves$1.f15806g;
            if ((i & Integer.MIN_VALUE) != 0) {
                libraryRepositoryImpl$updateLibraryShelves$1.f15806g = i - Integer.MIN_VALUE;
            } else {
                libraryRepositoryImpl$updateLibraryShelves$1 = new LibraryRepositoryImpl$updateLibraryShelves$1(this, continuationImpl);
            }
        } else {
            libraryRepositoryImpl$updateLibraryShelves$1 = new LibraryRepositoryImpl$updateLibraryShelves$1(this, continuationImpl);
        }
        LibraryRepositoryImpl$updateLibraryShelves$1 libraryRepositoryImpl$updateLibraryShelves$2 = libraryRepositoryImpl$updateLibraryShelves$1;
        Object obj = libraryRepositoryImpl$updateLibraryShelves$2.f15804e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = libraryRepositoryImpl$updateLibraryShelves$2.f15806g;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                strM22596N0 = list3 != null ? u91.m22596N0(list3, null, null, null, null, 63) : "";
                ca5 ca5Var = this.f16512b;
                libraryRepositoryImpl$updateLibraryShelves$2.f15800a = str4;
                libraryRepositoryImpl$updateLibraryShelves$2.f15801b = list3;
                libraryRepositoryImpl$updateLibraryShelves$2.f15802c = strM22596N0;
                libraryRepositoryImpl$updateLibraryShelves$2.f15806g = 1;
                objM4465f = ca5Var.m4465f(str4, EmptyList.f47638a, list3, libraryRepositoryImpl$updateLibraryShelves$2);
                if (objM4465f == coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i2 == 1) {
                String str5 = libraryRepositoryImpl$updateLibraryShelves$2.f15802c;
                list3 = libraryRepositoryImpl$updateLibraryShelves$2.f15801b;
                String str6 = libraryRepositoryImpl$updateLibraryShelves$2.f15800a;
                AbstractC3193b.m15359b(obj);
                strM22596N0 = str5;
                str4 = str6;
                objM4465f = obj;
            } else if (i2 == 2) {
                List list4 = libraryRepositoryImpl$updateLibraryShelves$2.f15803d;
                String str7 = libraryRepositoryImpl$updateLibraryShelves$2.f15802c;
                List list5 = libraryRepositoryImpl$updateLibraryShelves$2.f15801b;
                str3 = libraryRepositoryImpl$updateLibraryShelves$2.f15800a;
                AbstractC3193b.m15359b(obj);
                str2 = str7;
                objM2861d = obj;
                list2 = list4;
                LingQDatabase lingQDatabase = this.f16511a;
                LibraryRepositoryImpl$updateLibraryShelves$2 libraryRepositoryImpl$updateLibraryShelves$3 = new LibraryRepositoryImpl$updateLibraryShelves$2((List) objM2861d, this, list2, str3, str2, null);
                libraryRepositoryImpl$updateLibraryShelves$2.f15800a = null;
                libraryRepositoryImpl$updateLibraryShelves$2.f15801b = null;
                libraryRepositoryImpl$updateLibraryShelves$2.f15802c = null;
                libraryRepositoryImpl$updateLibraryShelves$2.f15803d = null;
                libraryRepositoryImpl$updateLibraryShelves$2.f15806g = 3;
            } else {
                if (i2 != 3) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                List list6 = libraryRepositoryImpl$updateLibraryShelves$2.f15803d;
                List list7 = libraryRepositoryImpl$updateLibraryShelves$2.f15801b;
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
            List list8 = (List) objM4465f;
            C1321i c1321i = this.f16514d;
            String strM22596N1 = list3 != null ? u91.m22596N0(list3, null, null, null, null, 63) : "";
            libraryRepositoryImpl$updateLibraryShelves$2.f15800a = str4;
            libraryRepositoryImpl$updateLibraryShelves$2.f15801b = null;
            libraryRepositoryImpl$updateLibraryShelves$2.f15802c = strM22596N0;
            libraryRepositoryImpl$updateLibraryShelves$2.f15803d = list8;
            libraryRepositoryImpl$updateLibraryShelves$2.f15806g = 2;
            objM2861d = AbstractC0758a.m2861d(new n85(str4, strM22596N1, c1321i, 0), c1321i.f17034K, libraryRepositoryImpl$updateLibraryShelves$2, true, true);
            if (objM2861d != coroutineSingletons) {
                str2 = strM22596N0;
                list2 = list8;
                str3 = str4;
                LingQDatabase lingQDatabase2 = this.f16511a;
                LibraryRepositoryImpl$updateLibraryShelves$2 libraryRepositoryImpl$updateLibraryShelves$4 = new LibraryRepositoryImpl$updateLibraryShelves$2((List) objM2861d, this, list2, str3, str2, null);
                libraryRepositoryImpl$updateLibraryShelves$2.f15800a = null;
                libraryRepositoryImpl$updateLibraryShelves$2.f15801b = null;
                libraryRepositoryImpl$updateLibraryShelves$2.f15802c = null;
                libraryRepositoryImpl$updateLibraryShelves$2.f15803d = null;
                libraryRepositoryImpl$updateLibraryShelves$2.f15806g = 3;
            }
            return coroutineSingletons;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:41:0x0117  */
    /* JADX WARN: Code duplicated, block: B:46:0x0123  */
    /* JADX WARN: Code duplicated, block: B:49:0x013c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0146  */
    /* JADX WARN: Code duplicated, block: B:55:0x0169  */
    /* JADX WARN: Code duplicated, block: B:58:0x016d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0190  */
    /* JADX WARN: Code duplicated, block: B:67:0x01e5 A[LOOP:0: B:66:0x01e3->B:67:0x01e5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0118, code lost:
    
        if (r2 == r5) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011c, code lost:
    
        r4 = r12;
        r2 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0191, code lost:
    
        if (r2 == r5) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7326u(String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        LibraryRepositoryImpl$updatePinnedStatus$1 libraryRepositoryImpl$updatePinnedStatus$1;
        LibraryShelf libraryShelf;
        Object objM2861d;
        String str3;
        LibraryShelf libraryShelf2;
        final String str4;
        int i;
        Object objM2861d2;
        int i2;
        LibraryShelf libraryShelf3;
        final int i3;
        Object objM2861d3;
        final String str5;
        int i4;
        LibraryShelf libraryShelf4;
        int i5;
        Object objM2861d4;
        LibraryShelf libraryShelf5;
        int i6;
        Object objM2861d5;
        int i7;
        int i8;
        Pair[] pairArr;
        hi8 hi8Var;
        Object objM2861d6;
        String str6 = str;
        String str7 = str2;
        if (continuationImpl instanceof LibraryRepositoryImpl$updatePinnedStatus$1) {
            libraryRepositoryImpl$updatePinnedStatus$1 = (LibraryRepositoryImpl$updatePinnedStatus$1) continuationImpl;
            int i9 = libraryRepositoryImpl$updatePinnedStatus$1.f15821i;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                libraryRepositoryImpl$updatePinnedStatus$1.f15821i = i9 - Integer.MIN_VALUE;
            } else {
                libraryRepositoryImpl$updatePinnedStatus$1 = new LibraryRepositoryImpl$updatePinnedStatus$1(this, continuationImpl);
            }
        } else {
            libraryRepositoryImpl$updatePinnedStatus$1 = new LibraryRepositoryImpl$updatePinnedStatus$1(this, continuationImpl);
        }
        Object objM7507E0 = libraryRepositoryImpl$updatePinnedStatus$1.f15819g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = libraryRepositoryImpl$updatePinnedStatus$1.f15821i;
        xfa xfaVar = xfa.f68157a;
        C1321i c1321i = this.f16514d;
        Object[] objArr = 0;
        final boolean z = true;
        switch (i10) {
            case 0:
                AbstractC3193b.m15359b(objM7507E0);
                libraryRepositoryImpl$updatePinnedStatus$1.f15813a = str6;
                libraryRepositoryImpl$updatePinnedStatus$1.f15814b = str7;
                libraryRepositoryImpl$updatePinnedStatus$1.f15821i = 1;
                objM7507E0 = c1321i.m7507E0(str6, str7, libraryRepositoryImpl$updatePinnedStatus$1);
                if (objM7507E0 != coroutineSingletons) {
                    libraryShelf = (LibraryShelf) objM7507E0;
                    if (libraryShelf != null) {
                        if (!libraryShelf.f19493a) {
                            libraryRepositoryImpl$updatePinnedStatus$1.f15813a = str6;
                            libraryRepositoryImpl$updatePinnedStatus$1.f15814b = str7;
                            libraryRepositoryImpl$updatePinnedStatus$1.f15815c = libraryShelf;
                            libraryRepositoryImpl$updatePinnedStatus$1.f15816d = 0;
                            libraryRepositoryImpl$updatePinnedStatus$1.f15821i = 2;
                            objM2861d2 = AbstractC0758a.m2861d(new h85(str6, c1321i), c1321i.f17034K, libraryRepositoryImpl$updatePinnedStatus$1, true, false);
                            if (objM2861d2 != coroutineSingletons) {
                                str3 = str7;
                                libraryShelf2 = libraryShelf;
                                objM7507E0 = objM2861d2;
                                str4 = str6;
                                i2 = 0;
                                libraryShelf3 = (LibraryShelf) objM7507E0;
                                if (libraryShelf3 != null) {
                                    i3 = libraryShelf3.f19499g;
                                    int i11 = libraryShelf2.f19499g;
                                    libraryRepositoryImpl$updatePinnedStatus$1.f15813a = str4;
                                    libraryRepositoryImpl$updatePinnedStatus$1.f15814b = str3;
                                    libraryRepositoryImpl$updatePinnedStatus$1.f15815c = libraryShelf2;
                                    libraryRepositoryImpl$updatePinnedStatus$1.f15816d = i2;
                                    libraryRepositoryImpl$updatePinnedStatus$1.f15817e = i3;
                                    libraryRepositoryImpl$updatePinnedStatus$1.f15818f = 0;
                                    libraryRepositoryImpl$updatePinnedStatus$1.f15821i = 3;
                                    objM2861d3 = AbstractC0758a.m2861d(new mv0(i11, 18), c1321i.f17034K, libraryRepositoryImpl$updatePinnedStatus$1, false, true);
                                    if (objM2861d3 != coroutineSingletons) {
                                        objM2861d3 = xfaVar;
                                    }
                                    if (objM2861d3 != coroutineSingletons) {
                                        str5 = str3;
                                        i4 = i2;
                                        libraryShelf4 = libraryShelf2;
                                        i5 = 0;
                                        libraryRepositoryImpl$updatePinnedStatus$1.f15813a = str4;
                                        libraryRepositoryImpl$updatePinnedStatus$1.f15814b = str5;
                                        libraryRepositoryImpl$updatePinnedStatus$1.f15815c = libraryShelf4;
                                        libraryRepositoryImpl$updatePinnedStatus$1.f15816d = i4;
                                        libraryRepositoryImpl$updatePinnedStatus$1.f15817e = i3;
                                        libraryRepositoryImpl$updatePinnedStatus$1.f15818f = i5;
                                        libraryRepositoryImpl$updatePinnedStatus$1.f15821i = 4;
                                        AbstractC0746d abstractC0746d = c1321i.f17034K;
                                        final Object[] objArr2 = objArr == true ? 1 : 0;
                                        objM2861d4 = AbstractC0758a.m2861d(new vi3() { // from class: o85
                                            @Override // p000.vi3
                                            public final Object invoke(Object obj) throws Exception {
                                                boolean z2 = objArr2;
                                                int i12 = i3;
                                                String str8 = str4;
                                                String str9 = str5;
                                                bk8 bk8Var = (bk8) obj;
                                                bk8Var.getClass();
                                                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("UPDATE LibraryShelfEntity SET pinned = ?, `order` = ? WHERE language = ? AND code = ?");
                                                try {
                                                    ik8VarMo2873e0.mo2878j(1, z2 ? 1L : 0L);
                                                    ik8VarMo2873e0.mo2878j(2, i12);
                                                    ik8VarMo2873e0.mo2874C(3, str8);
                                                    ik8VarMo2873e0.mo2874C(4, str9);
                                                    ik8VarMo2873e0.mo2876a0();
                                                    return xfa.f68157a;
                                                } finally {
                                                    ik8VarMo2873e0.close();
                                                }
                                            }
                                        }, abstractC0746d, libraryRepositoryImpl$updatePinnedStatus$1, false, true);
                                        if (objM2861d4 != coroutineSingletons) {
                                            objM2861d4 = xfaVar;
                                        }
                                    }
                                }
                                boolean z2 = !libraryShelf2.f19493a;
                                xj1 xj1Var = new xj1();
                                xj1Var.m24558b(NetworkType.CONNECTED);
                                tx6 tx6Var = (tx6) ((tx6) new tx6(ShelfUpdatePinnedWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var.m24557a());
                                pairArr = new Pair[]{new Pair("language", str4), new Pair("shelfCode", str3), new Pair("pin", Boolean.valueOf(z2))};
                                hi8Var = new hi8(10);
                                for (int i12 = 0; i12 < 3; i12++) {
                                    Pair pair = pairArr[i12];
                                    hi8Var.m13287x(pair.f47624b, (String) pair.f47623a);
                                }
                                this.f16517g.m2912a((ux6) ((tx6) tx6Var.m15008g(hi8Var.m13282k())).m15004a());
                            }
                        } else {
                            libraryRepositoryImpl$updatePinnedStatus$1.f15813a = str6;
                            libraryRepositoryImpl$updatePinnedStatus$1.f15814b = str7;
                            libraryRepositoryImpl$updatePinnedStatus$1.f15815c = libraryShelf;
                            libraryRepositoryImpl$updatePinnedStatus$1.f15816d = 0;
                            libraryRepositoryImpl$updatePinnedStatus$1.f15821i = 5;
                            objM2861d = AbstractC0758a.m2861d(new h85(str6, c1321i), c1321i.f17034K, libraryRepositoryImpl$updatePinnedStatus$1, true, false);
                            if (objM2861d != coroutineSingletons) {
                                str3 = str7;
                                libraryShelf2 = libraryShelf;
                                objM7507E0 = objM2861d;
                                str4 = str6;
                                i = 0;
                                libraryShelf5 = (LibraryShelf) objM7507E0;
                                if (libraryShelf5 != null) {
                                    i6 = libraryShelf5.f19499g;
                                    int i13 = libraryShelf2.f19499g;
                                    libraryRepositoryImpl$updatePinnedStatus$1.f15813a = str4;
                                    libraryRepositoryImpl$updatePinnedStatus$1.f15814b = str3;
                                    libraryRepositoryImpl$updatePinnedStatus$1.f15815c = libraryShelf2;
                                    libraryRepositoryImpl$updatePinnedStatus$1.f15816d = i;
                                    libraryRepositoryImpl$updatePinnedStatus$1.f15817e = i6;
                                    libraryRepositoryImpl$updatePinnedStatus$1.f15818f = 0;
                                    libraryRepositoryImpl$updatePinnedStatus$1.f15821i = 6;
                                    objM2861d5 = AbstractC0758a.m2861d(new mv0(i13, 17), c1321i.f17034K, libraryRepositoryImpl$updatePinnedStatus$1, false, true);
                                    if (objM2861d5 != coroutineSingletons) {
                                        objM2861d5 = xfaVar;
                                    }
                                    if (objM2861d5 != coroutineSingletons) {
                                        str5 = str3;
                                        i7 = i;
                                        libraryShelf4 = libraryShelf2;
                                        i8 = 0;
                                        final int i14 = i6 + 1;
                                        libraryRepositoryImpl$updatePinnedStatus$1.f15813a = str4;
                                        libraryRepositoryImpl$updatePinnedStatus$1.f15814b = str5;
                                        libraryRepositoryImpl$updatePinnedStatus$1.f15815c = libraryShelf4;
                                        libraryRepositoryImpl$updatePinnedStatus$1.f15816d = i7;
                                        libraryRepositoryImpl$updatePinnedStatus$1.f15817e = i6;
                                        libraryRepositoryImpl$updatePinnedStatus$1.f15818f = i8;
                                        libraryRepositoryImpl$updatePinnedStatus$1.f15821i = 7;
                                        objM2861d6 = AbstractC0758a.m2861d(new vi3() { // from class: o85
                                            @Override // p000.vi3
                                            public final Object invoke(Object obj) throws Exception {
                                                boolean z3 = z;
                                                int i15 = i14;
                                                String str8 = str4;
                                                String str9 = str5;
                                                bk8 bk8Var = (bk8) obj;
                                                bk8Var.getClass();
                                                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("UPDATE LibraryShelfEntity SET pinned = ?, `order` = ? WHERE language = ? AND code = ?");
                                                try {
                                                    ik8VarMo2873e0.mo2878j(1, z3 ? 1L : 0L);
                                                    ik8VarMo2873e0.mo2878j(2, i15);
                                                    ik8VarMo2873e0.mo2874C(3, str8);
                                                    ik8VarMo2873e0.mo2874C(4, str9);
                                                    ik8VarMo2873e0.mo2876a0();
                                                    return xfa.f68157a;
                                                } finally {
                                                    ik8VarMo2873e0.close();
                                                }
                                            }
                                        }, c1321i.f17034K, libraryRepositoryImpl$updatePinnedStatus$1, false, true);
                                        if (objM2861d6 != coroutineSingletons) {
                                            objM2861d6 = xfaVar;
                                        }
                                    }
                                }
                                boolean z3 = !libraryShelf2.f19493a;
                                xj1 xj1Var2 = new xj1();
                                xj1Var2.m24558b(NetworkType.CONNECTED);
                                tx6 tx6Var2 = (tx6) ((tx6) new tx6(ShelfUpdatePinnedWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var2.m24557a());
                                pairArr = new Pair[]{new Pair("language", str4), new Pair("shelfCode", str3), new Pair("pin", Boolean.valueOf(z3))};
                                hi8Var = new hi8(10);
                                while (i12 < 3) {
                                    Pair pair2 = pairArr[i12];
                                    hi8Var.m13287x(pair2.f47624b, (String) pair2.f47623a);
                                }
                                this.f16517g.m2912a((ux6) ((tx6) tx6Var2.m15008g(hi8Var.m13282k())).m15004a());
                            }
                        }
                        break;
                    }
                    return xfaVar;
                }
                return coroutineSingletons;
            case 1:
                String str8 = libraryRepositoryImpl$updatePinnedStatus$1.f15814b;
                String str9 = libraryRepositoryImpl$updatePinnedStatus$1.f15813a;
                AbstractC3193b.m15359b(objM7507E0);
                str7 = str8;
                str6 = str9;
                libraryShelf = (LibraryShelf) objM7507E0;
                if (libraryShelf != null) {
                    if (!libraryShelf.f19493a) {
                        libraryRepositoryImpl$updatePinnedStatus$1.f15813a = str6;
                        libraryRepositoryImpl$updatePinnedStatus$1.f15814b = str7;
                        libraryRepositoryImpl$updatePinnedStatus$1.f15815c = libraryShelf;
                        libraryRepositoryImpl$updatePinnedStatus$1.f15816d = 0;
                        libraryRepositoryImpl$updatePinnedStatus$1.f15821i = 5;
                        objM2861d = AbstractC0758a.m2861d(new h85(str6, c1321i), c1321i.f17034K, libraryRepositoryImpl$updatePinnedStatus$1, true, false);
                        if (objM2861d != coroutineSingletons) {
                            str3 = str7;
                            libraryShelf2 = libraryShelf;
                            objM7507E0 = objM2861d;
                            str4 = str6;
                            i = 0;
                            libraryShelf5 = (LibraryShelf) objM7507E0;
                            if (libraryShelf5 != null) {
                                i6 = libraryShelf5.f19499g;
                                int i15 = libraryShelf2.f19499g;
                                libraryRepositoryImpl$updatePinnedStatus$1.f15813a = str4;
                                libraryRepositoryImpl$updatePinnedStatus$1.f15814b = str3;
                                libraryRepositoryImpl$updatePinnedStatus$1.f15815c = libraryShelf2;
                                libraryRepositoryImpl$updatePinnedStatus$1.f15816d = i;
                                libraryRepositoryImpl$updatePinnedStatus$1.f15817e = i6;
                                libraryRepositoryImpl$updatePinnedStatus$1.f15818f = 0;
                                libraryRepositoryImpl$updatePinnedStatus$1.f15821i = 6;
                                objM2861d5 = AbstractC0758a.m2861d(new mv0(i15, 17), c1321i.f17034K, libraryRepositoryImpl$updatePinnedStatus$1, false, true);
                                if (objM2861d5 != coroutineSingletons) {
                                    objM2861d5 = xfaVar;
                                }
                                if (objM2861d5 != coroutineSingletons) {
                                    str5 = str3;
                                    i7 = i;
                                    libraryShelf4 = libraryShelf2;
                                    i8 = 0;
                                    final int i16 = i6 + 1;
                                    libraryRepositoryImpl$updatePinnedStatus$1.f15813a = str4;
                                    libraryRepositoryImpl$updatePinnedStatus$1.f15814b = str5;
                                    libraryRepositoryImpl$updatePinnedStatus$1.f15815c = libraryShelf4;
                                    libraryRepositoryImpl$updatePinnedStatus$1.f15816d = i7;
                                    libraryRepositoryImpl$updatePinnedStatus$1.f15817e = i6;
                                    libraryRepositoryImpl$updatePinnedStatus$1.f15818f = i8;
                                    libraryRepositoryImpl$updatePinnedStatus$1.f15821i = 7;
                                    objM2861d6 = AbstractC0758a.m2861d(new vi3() { // from class: o85
                                        @Override // p000.vi3
                                        public final Object invoke(Object obj) throws Exception {
                                            boolean z4 = z;
                                            int i17 = i16;
                                            String str10 = str4;
                                            String str11 = str5;
                                            bk8 bk8Var = (bk8) obj;
                                            bk8Var.getClass();
                                            ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("UPDATE LibraryShelfEntity SET pinned = ?, `order` = ? WHERE language = ? AND code = ?");
                                            try {
                                                ik8VarMo2873e0.mo2878j(1, z4 ? 1L : 0L);
                                                ik8VarMo2873e0.mo2878j(2, i17);
                                                ik8VarMo2873e0.mo2874C(3, str10);
                                                ik8VarMo2873e0.mo2874C(4, str11);
                                                ik8VarMo2873e0.mo2876a0();
                                                return xfa.f68157a;
                                            } finally {
                                                ik8VarMo2873e0.close();
                                            }
                                        }
                                    }, c1321i.f17034K, libraryRepositoryImpl$updatePinnedStatus$1, false, true);
                                    if (objM2861d6 != coroutineSingletons) {
                                        objM2861d6 = xfaVar;
                                    }
                                }
                            }
                            boolean z4 = !libraryShelf2.f19493a;
                            xj1 xj1Var3 = new xj1();
                            xj1Var3.m24558b(NetworkType.CONNECTED);
                            tx6 tx6Var3 = (tx6) ((tx6) new tx6(ShelfUpdatePinnedWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var3.m24557a());
                            pairArr = new Pair[]{new Pair("language", str4), new Pair("shelfCode", str3), new Pair("pin", Boolean.valueOf(z4))};
                            hi8Var = new hi8(10);
                            while (i12 < 3) {
                                Pair pair3 = pairArr[i12];
                                hi8Var.m13287x(pair3.f47624b, (String) pair3.f47623a);
                            }
                            this.f16517g.m2912a((ux6) ((tx6) tx6Var3.m15008g(hi8Var.m13282k())).m15004a());
                        }
                        break;
                    } else {
                        libraryRepositoryImpl$updatePinnedStatus$1.f15813a = str6;
                        libraryRepositoryImpl$updatePinnedStatus$1.f15814b = str7;
                        libraryRepositoryImpl$updatePinnedStatus$1.f15815c = libraryShelf;
                        libraryRepositoryImpl$updatePinnedStatus$1.f15816d = 0;
                        libraryRepositoryImpl$updatePinnedStatus$1.f15821i = 2;
                        objM2861d2 = AbstractC0758a.m2861d(new h85(str6, c1321i), c1321i.f17034K, libraryRepositoryImpl$updatePinnedStatus$1, true, false);
                        if (objM2861d2 != coroutineSingletons) {
                            str3 = str7;
                            libraryShelf2 = libraryShelf;
                            objM7507E0 = objM2861d2;
                            str4 = str6;
                            i2 = 0;
                            libraryShelf3 = (LibraryShelf) objM7507E0;
                            if (libraryShelf3 != null) {
                                i3 = libraryShelf3.f19499g;
                                int i17 = libraryShelf2.f19499g;
                                libraryRepositoryImpl$updatePinnedStatus$1.f15813a = str4;
                                libraryRepositoryImpl$updatePinnedStatus$1.f15814b = str3;
                                libraryRepositoryImpl$updatePinnedStatus$1.f15815c = libraryShelf2;
                                libraryRepositoryImpl$updatePinnedStatus$1.f15816d = i2;
                                libraryRepositoryImpl$updatePinnedStatus$1.f15817e = i3;
                                libraryRepositoryImpl$updatePinnedStatus$1.f15818f = 0;
                                libraryRepositoryImpl$updatePinnedStatus$1.f15821i = 3;
                                objM2861d3 = AbstractC0758a.m2861d(new mv0(i17, 18), c1321i.f17034K, libraryRepositoryImpl$updatePinnedStatus$1, false, true);
                                if (objM2861d3 != coroutineSingletons) {
                                    objM2861d3 = xfaVar;
                                }
                                if (objM2861d3 != coroutineSingletons) {
                                    str5 = str3;
                                    i4 = i2;
                                    libraryShelf4 = libraryShelf2;
                                    i5 = 0;
                                    libraryRepositoryImpl$updatePinnedStatus$1.f15813a = str4;
                                    libraryRepositoryImpl$updatePinnedStatus$1.f15814b = str5;
                                    libraryRepositoryImpl$updatePinnedStatus$1.f15815c = libraryShelf4;
                                    libraryRepositoryImpl$updatePinnedStatus$1.f15816d = i4;
                                    libraryRepositoryImpl$updatePinnedStatus$1.f15817e = i3;
                                    libraryRepositoryImpl$updatePinnedStatus$1.f15818f = i5;
                                    libraryRepositoryImpl$updatePinnedStatus$1.f15821i = 4;
                                    AbstractC0746d abstractC0746d2 = c1321i.f17034K;
                                    final boolean objArr3 = objArr == true ? 1 : 0;
                                    objM2861d4 = AbstractC0758a.m2861d(new vi3() { // from class: o85
                                        @Override // p000.vi3
                                        public final Object invoke(Object obj) throws Exception {
                                            boolean z5 = objArr3;
                                            int i18 = i3;
                                            String str10 = str4;
                                            String str11 = str5;
                                            bk8 bk8Var = (bk8) obj;
                                            bk8Var.getClass();
                                            ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("UPDATE LibraryShelfEntity SET pinned = ?, `order` = ? WHERE language = ? AND code = ?");
                                            try {
                                                ik8VarMo2873e0.mo2878j(1, z5 ? 1L : 0L);
                                                ik8VarMo2873e0.mo2878j(2, i18);
                                                ik8VarMo2873e0.mo2874C(3, str10);
                                                ik8VarMo2873e0.mo2874C(4, str11);
                                                ik8VarMo2873e0.mo2876a0();
                                                return xfa.f68157a;
                                            } finally {
                                                ik8VarMo2873e0.close();
                                            }
                                        }
                                    }, abstractC0746d2, libraryRepositoryImpl$updatePinnedStatus$1, false, true);
                                    if (objM2861d4 != coroutineSingletons) {
                                        objM2861d4 = xfaVar;
                                    }
                                }
                            }
                            boolean z5 = !libraryShelf2.f19493a;
                            xj1 xj1Var4 = new xj1();
                            xj1Var4.m24558b(NetworkType.CONNECTED);
                            tx6 tx6Var4 = (tx6) ((tx6) new tx6(ShelfUpdatePinnedWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var4.m24557a());
                            pairArr = new Pair[]{new Pair("language", str4), new Pair("shelfCode", str3), new Pair("pin", Boolean.valueOf(z5))};
                            hi8Var = new hi8(10);
                            while (i12 < 3) {
                                Pair pair4 = pairArr[i12];
                                hi8Var.m13287x(pair4.f47624b, (String) pair4.f47623a);
                            }
                            this.f16517g.m2912a((ux6) ((tx6) tx6Var4.m15008g(hi8Var.m13282k())).m15004a());
                        }
                        break;
                    }
                    return coroutineSingletons;
                }
                return xfaVar;
            case 2:
                i2 = libraryRepositoryImpl$updatePinnedStatus$1.f15816d;
                libraryShelf2 = libraryRepositoryImpl$updatePinnedStatus$1.f15815c;
                str3 = libraryRepositoryImpl$updatePinnedStatus$1.f15814b;
                str4 = libraryRepositoryImpl$updatePinnedStatus$1.f15813a;
                AbstractC3193b.m15359b(objM7507E0);
                libraryShelf3 = (LibraryShelf) objM7507E0;
                if (libraryShelf3 != null) {
                    i3 = libraryShelf3.f19499g;
                    int i18 = libraryShelf2.f19499g;
                    libraryRepositoryImpl$updatePinnedStatus$1.f15813a = str4;
                    libraryRepositoryImpl$updatePinnedStatus$1.f15814b = str3;
                    libraryRepositoryImpl$updatePinnedStatus$1.f15815c = libraryShelf2;
                    libraryRepositoryImpl$updatePinnedStatus$1.f15816d = i2;
                    libraryRepositoryImpl$updatePinnedStatus$1.f15817e = i3;
                    libraryRepositoryImpl$updatePinnedStatus$1.f15818f = 0;
                    libraryRepositoryImpl$updatePinnedStatus$1.f15821i = 3;
                    objM2861d3 = AbstractC0758a.m2861d(new mv0(i18, 18), c1321i.f17034K, libraryRepositoryImpl$updatePinnedStatus$1, false, true);
                    if (objM2861d3 != coroutineSingletons) {
                        objM2861d3 = xfaVar;
                    }
                    if (objM2861d3 != coroutineSingletons) {
                        str5 = str3;
                        i4 = i2;
                        libraryShelf4 = libraryShelf2;
                        i5 = 0;
                        libraryRepositoryImpl$updatePinnedStatus$1.f15813a = str4;
                        libraryRepositoryImpl$updatePinnedStatus$1.f15814b = str5;
                        libraryRepositoryImpl$updatePinnedStatus$1.f15815c = libraryShelf4;
                        libraryRepositoryImpl$updatePinnedStatus$1.f15816d = i4;
                        libraryRepositoryImpl$updatePinnedStatus$1.f15817e = i3;
                        libraryRepositoryImpl$updatePinnedStatus$1.f15818f = i5;
                        libraryRepositoryImpl$updatePinnedStatus$1.f15821i = 4;
                        AbstractC0746d abstractC0746d3 = c1321i.f17034K;
                        final boolean objArr4 = objArr == true ? 1 : 0;
                        objM2861d4 = AbstractC0758a.m2861d(new vi3() { // from class: o85
                            @Override // p000.vi3
                            public final Object invoke(Object obj) throws Exception {
                                boolean z6 = objArr4;
                                int i19 = i3;
                                String str10 = str4;
                                String str11 = str5;
                                bk8 bk8Var = (bk8) obj;
                                bk8Var.getClass();
                                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("UPDATE LibraryShelfEntity SET pinned = ?, `order` = ? WHERE language = ? AND code = ?");
                                try {
                                    ik8VarMo2873e0.mo2878j(1, z6 ? 1L : 0L);
                                    ik8VarMo2873e0.mo2878j(2, i19);
                                    ik8VarMo2873e0.mo2874C(3, str10);
                                    ik8VarMo2873e0.mo2874C(4, str11);
                                    ik8VarMo2873e0.mo2876a0();
                                    return xfa.f68157a;
                                } finally {
                                    ik8VarMo2873e0.close();
                                }
                            }
                        }, abstractC0746d3, libraryRepositoryImpl$updatePinnedStatus$1, false, true);
                        if (objM2861d4 != coroutineSingletons) {
                            objM2861d4 = xfaVar;
                        }
                        break;
                    }
                    return coroutineSingletons;
                }
                boolean z6 = !libraryShelf2.f19493a;
                xj1 xj1Var5 = new xj1();
                xj1Var5.m24558b(NetworkType.CONNECTED);
                tx6 tx6Var5 = (tx6) ((tx6) new tx6(ShelfUpdatePinnedWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var5.m24557a());
                pairArr = new Pair[]{new Pair("language", str4), new Pair("shelfCode", str3), new Pair("pin", Boolean.valueOf(z6))};
                hi8Var = new hi8(10);
                while (i12 < 3) {
                    Pair pair5 = pairArr[i12];
                    hi8Var.m13287x(pair5.f47624b, (String) pair5.f47623a);
                }
                this.f16517g.m2912a((ux6) ((tx6) tx6Var5.m15008g(hi8Var.m13282k())).m15004a());
                return xfaVar;
            case 3:
                int i19 = libraryRepositoryImpl$updatePinnedStatus$1.f15818f;
                int i20 = libraryRepositoryImpl$updatePinnedStatus$1.f15817e;
                i4 = libraryRepositoryImpl$updatePinnedStatus$1.f15816d;
                LibraryShelf libraryShelf6 = libraryRepositoryImpl$updatePinnedStatus$1.f15815c;
                str5 = libraryRepositoryImpl$updatePinnedStatus$1.f15814b;
                String str10 = libraryRepositoryImpl$updatePinnedStatus$1.f15813a;
                AbstractC3193b.m15359b(objM7507E0);
                i3 = i20;
                i5 = i19;
                libraryShelf4 = libraryShelf6;
                str4 = str10;
                libraryRepositoryImpl$updatePinnedStatus$1.f15813a = str4;
                libraryRepositoryImpl$updatePinnedStatus$1.f15814b = str5;
                libraryRepositoryImpl$updatePinnedStatus$1.f15815c = libraryShelf4;
                libraryRepositoryImpl$updatePinnedStatus$1.f15816d = i4;
                libraryRepositoryImpl$updatePinnedStatus$1.f15817e = i3;
                libraryRepositoryImpl$updatePinnedStatus$1.f15818f = i5;
                libraryRepositoryImpl$updatePinnedStatus$1.f15821i = 4;
                AbstractC0746d abstractC0746d4 = c1321i.f17034K;
                final boolean objArr5 = objArr == true ? 1 : 0;
                objM2861d4 = AbstractC0758a.m2861d(new vi3() { // from class: o85
                    @Override // p000.vi3
                    public final Object invoke(Object obj) throws Exception {
                        boolean z7 = objArr5;
                        int i110 = i3;
                        String str11 = str4;
                        String str12 = str5;
                        bk8 bk8Var = (bk8) obj;
                        bk8Var.getClass();
                        ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("UPDATE LibraryShelfEntity SET pinned = ?, `order` = ? WHERE language = ? AND code = ?");
                        try {
                            ik8VarMo2873e0.mo2878j(1, z7 ? 1L : 0L);
                            ik8VarMo2873e0.mo2878j(2, i110);
                            ik8VarMo2873e0.mo2874C(3, str11);
                            ik8VarMo2873e0.mo2874C(4, str12);
                            ik8VarMo2873e0.mo2876a0();
                            return xfa.f68157a;
                        } finally {
                            ik8VarMo2873e0.close();
                        }
                    }
                }, abstractC0746d4, libraryRepositoryImpl$updatePinnedStatus$1, false, true);
                if (objM2861d4 != coroutineSingletons) {
                    objM2861d4 = xfaVar;
                }
                break;
            case 4:
            case 7:
                libraryShelf4 = libraryRepositoryImpl$updatePinnedStatus$1.f15815c;
                String str11 = libraryRepositoryImpl$updatePinnedStatus$1.f15814b;
                String str12 = libraryRepositoryImpl$updatePinnedStatus$1.f15813a;
                AbstractC3193b.m15359b(objM7507E0);
                str3 = str11;
                str4 = str12;
                libraryShelf2 = libraryShelf4;
                boolean z7 = !libraryShelf2.f19493a;
                xj1 xj1Var6 = new xj1();
                xj1Var6.m24558b(NetworkType.CONNECTED);
                tx6 tx6Var6 = (tx6) ((tx6) new tx6(ShelfUpdatePinnedWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var6.m24557a());
                pairArr = new Pair[]{new Pair("language", str4), new Pair("shelfCode", str3), new Pair("pin", Boolean.valueOf(z7))};
                hi8Var = new hi8(10);
                while (i12 < 3) {
                    Pair pair6 = pairArr[i12];
                    hi8Var.m13287x(pair6.f47624b, (String) pair6.f47623a);
                }
                this.f16517g.m2912a((ux6) ((tx6) tx6Var6.m15008g(hi8Var.m13282k())).m15004a());
                return xfaVar;
            case 5:
                i = libraryRepositoryImpl$updatePinnedStatus$1.f15816d;
                libraryShelf2 = libraryRepositoryImpl$updatePinnedStatus$1.f15815c;
                str3 = libraryRepositoryImpl$updatePinnedStatus$1.f15814b;
                str4 = libraryRepositoryImpl$updatePinnedStatus$1.f15813a;
                AbstractC3193b.m15359b(objM7507E0);
                libraryShelf5 = (LibraryShelf) objM7507E0;
                if (libraryShelf5 != null) {
                    i6 = libraryShelf5.f19499g;
                    int i110 = libraryShelf2.f19499g;
                    libraryRepositoryImpl$updatePinnedStatus$1.f15813a = str4;
                    libraryRepositoryImpl$updatePinnedStatus$1.f15814b = str3;
                    libraryRepositoryImpl$updatePinnedStatus$1.f15815c = libraryShelf2;
                    libraryRepositoryImpl$updatePinnedStatus$1.f15816d = i;
                    libraryRepositoryImpl$updatePinnedStatus$1.f15817e = i6;
                    libraryRepositoryImpl$updatePinnedStatus$1.f15818f = 0;
                    libraryRepositoryImpl$updatePinnedStatus$1.f15821i = 6;
                    objM2861d5 = AbstractC0758a.m2861d(new mv0(i110, 17), c1321i.f17034K, libraryRepositoryImpl$updatePinnedStatus$1, false, true);
                    if (objM2861d5 != coroutineSingletons) {
                        objM2861d5 = xfaVar;
                    }
                    if (objM2861d5 != coroutineSingletons) {
                        str5 = str3;
                        i7 = i;
                        libraryShelf4 = libraryShelf2;
                        i8 = 0;
                        final int i111 = i6 + 1;
                        libraryRepositoryImpl$updatePinnedStatus$1.f15813a = str4;
                        libraryRepositoryImpl$updatePinnedStatus$1.f15814b = str5;
                        libraryRepositoryImpl$updatePinnedStatus$1.f15815c = libraryShelf4;
                        libraryRepositoryImpl$updatePinnedStatus$1.f15816d = i7;
                        libraryRepositoryImpl$updatePinnedStatus$1.f15817e = i6;
                        libraryRepositoryImpl$updatePinnedStatus$1.f15818f = i8;
                        libraryRepositoryImpl$updatePinnedStatus$1.f15821i = 7;
                        objM2861d6 = AbstractC0758a.m2861d(new vi3() { // from class: o85
                            @Override // p000.vi3
                            public final Object invoke(Object obj) throws Exception {
                                boolean z8 = z;
                                int i112 = i111;
                                String str13 = str4;
                                String str14 = str5;
                                bk8 bk8Var = (bk8) obj;
                                bk8Var.getClass();
                                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("UPDATE LibraryShelfEntity SET pinned = ?, `order` = ? WHERE language = ? AND code = ?");
                                try {
                                    ik8VarMo2873e0.mo2878j(1, z8 ? 1L : 0L);
                                    ik8VarMo2873e0.mo2878j(2, i112);
                                    ik8VarMo2873e0.mo2874C(3, str13);
                                    ik8VarMo2873e0.mo2874C(4, str14);
                                    ik8VarMo2873e0.mo2876a0();
                                    return xfa.f68157a;
                                } finally {
                                    ik8VarMo2873e0.close();
                                }
                            }
                        }, c1321i.f17034K, libraryRepositoryImpl$updatePinnedStatus$1, false, true);
                        if (objM2861d6 != coroutineSingletons) {
                            objM2861d6 = xfaVar;
                        }
                        break;
                    }
                    return coroutineSingletons;
                }
                boolean z8 = !libraryShelf2.f19493a;
                xj1 xj1Var7 = new xj1();
                xj1Var7.m24558b(NetworkType.CONNECTED);
                tx6 tx6Var7 = (tx6) ((tx6) new tx6(ShelfUpdatePinnedWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var7.m24557a());
                pairArr = new Pair[]{new Pair("language", str4), new Pair("shelfCode", str3), new Pair("pin", Boolean.valueOf(z8))};
                hi8Var = new hi8(10);
                while (i12 < 3) {
                    Pair pair7 = pairArr[i12];
                    hi8Var.m13287x(pair7.f47624b, (String) pair7.f47623a);
                }
                this.f16517g.m2912a((ux6) ((tx6) tx6Var7.m15008g(hi8Var.m13282k())).m15004a());
                return xfaVar;
            case 6:
                int i21 = libraryRepositoryImpl$updatePinnedStatus$1.f15818f;
                int i22 = libraryRepositoryImpl$updatePinnedStatus$1.f15817e;
                i7 = libraryRepositoryImpl$updatePinnedStatus$1.f15816d;
                LibraryShelf libraryShelf7 = libraryRepositoryImpl$updatePinnedStatus$1.f15815c;
                str5 = libraryRepositoryImpl$updatePinnedStatus$1.f15814b;
                String str13 = libraryRepositoryImpl$updatePinnedStatus$1.f15813a;
                AbstractC3193b.m15359b(objM7507E0);
                i6 = i22;
                i8 = i21;
                libraryShelf4 = libraryShelf7;
                str4 = str13;
                final int i112 = i6 + 1;
                libraryRepositoryImpl$updatePinnedStatus$1.f15813a = str4;
                libraryRepositoryImpl$updatePinnedStatus$1.f15814b = str5;
                libraryRepositoryImpl$updatePinnedStatus$1.f15815c = libraryShelf4;
                libraryRepositoryImpl$updatePinnedStatus$1.f15816d = i7;
                libraryRepositoryImpl$updatePinnedStatus$1.f15817e = i6;
                libraryRepositoryImpl$updatePinnedStatus$1.f15818f = i8;
                libraryRepositoryImpl$updatePinnedStatus$1.f15821i = 7;
                objM2861d6 = AbstractC0758a.m2861d(new vi3() { // from class: o85
                    @Override // p000.vi3
                    public final Object invoke(Object obj) throws Exception {
                        boolean z9 = z;
                        int i113 = i112;
                        String str14 = str4;
                        String str15 = str5;
                        bk8 bk8Var = (bk8) obj;
                        bk8Var.getClass();
                        ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("UPDATE LibraryShelfEntity SET pinned = ?, `order` = ? WHERE language = ? AND code = ?");
                        try {
                            ik8VarMo2873e0.mo2878j(1, z9 ? 1L : 0L);
                            ik8VarMo2873e0.mo2878j(2, i113);
                            ik8VarMo2873e0.mo2874C(3, str14);
                            ik8VarMo2873e0.mo2874C(4, str15);
                            ik8VarMo2873e0.mo2876a0();
                            return xfa.f68157a;
                        } finally {
                            ik8VarMo2873e0.close();
                        }
                    }
                }, c1321i.f17034K, libraryRepositoryImpl$updatePinnedStatus$1, false, true);
                if (objM2861d6 != coroutineSingletons) {
                    objM2861d6 = xfaVar;
                }
                break;
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
