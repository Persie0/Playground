package com.lingq.core.data.repository;

import androidx.room.util.AbstractC0758a;
import com.lingq.core.database.dao.C1321i;
import com.lingq.core.domain.model.library.Sort;
import com.lingq.core.network.api.result.ResultLibraryItem;
import com.lingq.core.network.api.result.Results;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3352my;
import p000.C3386nv;
import p000.c32;
import p000.cp1;
import p000.dp1;
import p000.ke2;
import p000.ld0;
import p000.u85;
import p000.v91;
import p000.vi3;
import p000.vz1;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LibraryRepositoryImpl$fetchCoursePageLessonsSearch$2$1", m4291f = "LibraryRepositoryImpl.kt", m4292l = {376, 379, 380, 382, 397, 398}, m4293m = "invokeSuspend", m4294v = 2)
final class LibraryRepositoryImpl$fetchCoursePageLessonsSearch$2$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public C1296l f15720a;

    /* JADX INFO: renamed from: b */
    public Sort f15721b;

    /* JADX INFO: renamed from: c */
    public ArrayList f15722c;

    /* JADX INFO: renamed from: d */
    public List f15723d;

    /* JADX INFO: renamed from: e */
    public int f15724e;

    /* JADX INFO: renamed from: f */
    public int f15725f;

    /* JADX INFO: renamed from: g */
    public int f15726g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Results f15727h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1296l f15728i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f15729j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Sort f15730k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryRepositoryImpl$fetchCoursePageLessonsSearch$2$1(Results results, C1296l c1296l, int i, Sort sort, Continuation continuation) {
        super(1, continuation);
        this.f15727h = results;
        this.f15728i = c1296l;
        this.f15729j = i;
        this.f15730k = sort;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LibraryRepositoryImpl$fetchCoursePageLessonsSearch$2$1(this.f15727h, this.f15728i, this.f15729j, this.f15730k, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((LibraryRepositoryImpl$fetchCoursePageLessonsSearch$2$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:33:0x0101  */
    /* JADX WARN: Code duplicated, block: B:39:0x0114  */
    /* JADX WARN: Code duplicated, block: B:44:0x0133  */
    /* JADX WARN: Code duplicated, block: B:47:0x013f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0164  */
    /* JADX WARN: Code duplicated, block: B:54:0x0169 A[PHI: r2 r9 r10 r11 r12
      0x0169: PHI (r2v18 int) = (r2v16 int), (r2v19 int) binds: [B:52:0x0165, B:10:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x0169: PHI (r9v8 int) = (r9v6 int), (r9v9 int) binds: [B:52:0x0165, B:10:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x0169: PHI (r10v12 java.util.List) = (r10v9 java.util.List), (r10v14 java.util.List) binds: [B:52:0x0165, B:10:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x0169: PHI (r11v10 com.lingq.core.domain.model.library.Sort) = (r11v8 com.lingq.core.domain.model.library.Sort), (r11v11 com.lingq.core.domain.model.library.Sort) binds: [B:52:0x0165, B:10:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x0169: PHI (r12v9 com.lingq.core.data.repository.l) = (r12v7 com.lingq.core.data.repository.l), (r12v10 com.lingq.core.data.repository.l) binds: [B:52:0x0165, B:10:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0185 A[PHI: r2 r9 r10 r11 r12
      0x0185: PHI (r2v20 int) = (r2v18 int), (r2v21 int) binds: [B:55:0x0181, B:9:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x0185: PHI (r9v10 int) = (r9v8 int), (r9v11 int) binds: [B:55:0x0181, B:9:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x0185: PHI (r10v15 java.util.List) = (r10v12 java.util.List), (r10v24 java.util.List) binds: [B:55:0x0181, B:9:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x0185: PHI (r11v12 com.lingq.core.domain.model.library.Sort) = (r11v10 com.lingq.core.domain.model.library.Sort), (r11v13 com.lingq.core.domain.model.library.Sort) binds: [B:55:0x0181, B:9:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x0185: PHI (r12v11 com.lingq.core.data.repository.l) = (r12v9 com.lingq.core.data.repository.l), (r12v12 com.lingq.core.data.repository.l) binds: [B:55:0x0181, B:9:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:71:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:75:0x0221  */
    /* JADX WARN: Code duplicated, block: B:78:0x0225 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:82:0x01dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x01c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.lingq.core.domain.model.library.Sort, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.lingq.core.data.repository.l, com.lingq.core.domain.model.library.Sort, java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        Object objM7501B0;
        C1296l c1296l;
        Sort sort;
        List list;
        int i2;
        ArrayList arrayList;
        C1321i c1321i;
        int i3;
        int i4;
        Sort sort2;
        C1296l c1296l2;
        int iIntValue;
        Iterator it;
        Object next;
        String value;
        Object objM2861d;
        C1321i c1321i2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i5;
        C1321i c1321i3;
        ?? r4;
        List list2;
        int i6;
        String str;
        String value2;
        ?? r5;
        Object objM2861d2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = this.f15726g;
        String str2 = "";
        int i8 = 10;
        xfa xfaVar = xfa.f68157a;
        Throwable th = null;
        switch (i7) {
            case 0:
                AbstractC3193b.m15359b(obj);
                List list3 = this.f15727h.f21739d;
                if (list3 == null) {
                    return null;
                }
                List list4 = list3;
                ArrayList arrayList5 = new ArrayList(v91.m23189q0(list4, 10));
                int i9 = 0;
                for (Object obj2 : list4) {
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        vz1.m23628e0();
                        throw null;
                    }
                    arrayList5.add(AbstractC3352my.m17121g0((ResultLibraryItem) obj2, i9));
                    i9 = i10;
                }
                C1296l c1296l3 = this.f15728i;
                C1321i c1321i4 = c1296l3.f16514d;
                this.f15720a = c1296l3;
                Sort sort3 = this.f15730k;
                this.f15721b = sort3;
                this.f15722c = arrayList5;
                i = this.f15729j;
                this.f15724e = i;
                this.f15725f = 0;
                this.f15726g = 1;
                objM7501B0 = C1321i.m7501B0(c1321i4, i, this);
                if (objM7501B0 != coroutineSingletons) {
                    c1296l = c1296l3;
                    sort = sort3;
                    list = arrayList5;
                    i2 = 0;
                    arrayList = new ArrayList();
                    for (Object obj3 : (List) objM7501B0) {
                        iIntValue = ((Number) obj3).intValue();
                        it = list.iterator();
                        do {
                            if (it.hasNext()) {
                                next = it.next();
                            } else {
                                next = null;
                            }
                            if (next == null) {
                                arrayList.add(obj3);
                            }
                        } while (((u85) next).f63562a != iIntValue);
                        if (next == null) {
                            arrayList.add(obj3);
                        }
                    }
                    c1321i = c1296l.f16514d;
                    this.f15720a = c1296l;
                    this.f15721b = sort;
                    this.f15722c = null;
                    this.f15723d = list;
                    this.f15724e = i;
                    this.f15725f = i2;
                    this.f15726g = 2;
                    if (c1321i.m7504A0(arrayList, this) != coroutineSingletons) {
                        i3 = i2;
                        i4 = i;
                        sort2 = sort;
                        c1296l2 = c1296l;
                        C1321i c1321i5 = c1296l2.f16514d;
                        value = sort2.getValue();
                        if (value == null) {
                            value = "";
                        }
                        this.f15720a = c1296l2;
                        this.f15721b = sort2;
                        this.f15722c = null;
                        this.f15723d = list;
                        this.f15724e = i4;
                        this.f15725f = i3;
                        this.f15726g = 3;
                        objM2861d = AbstractC0758a.m2861d(new ld0(i4, value, i8), c1321i5.f17034K, this, false, true);
                        if (objM2861d != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            objM2861d = xfaVar;
                        }
                        if (objM2861d != coroutineSingletons) {
                            c1321i2 = c1296l2.f16514d;
                            this.f15720a = c1296l2;
                            this.f15721b = sort2;
                            this.f15722c = null;
                            this.f15723d = list;
                            this.f15724e = i4;
                            this.f15725f = i3;
                            this.f15726g = 4;
                            if (c1321i2.mo4096w0(list, this) != coroutineSingletons) {
                                arrayList2 = new ArrayList();
                                arrayList3 = new ArrayList();
                                List list5 = list;
                                arrayList4 = new ArrayList(v91.m23189q0(list5, 10));
                                i5 = 0;
                                for (Object obj4 : list5) {
                                    i6 = i5 + 1;
                                    if (i5 < 0) {
                                        Throwable th2 = th;
                                        vz1.m23628e0();
                                        throw th2;
                                    }
                                    u85 u85Var = (u85) obj4;
                                    Throwable th3 = th;
                                    str = str2;
                                    arrayList2.add(new cp1(i4, u85Var.f63562a, i5));
                                    int i11 = u85Var.f63562a;
                                    value2 = sort2.getValue();
                                    if (value2 == null) {
                                        value2 = str;
                                    }
                                    arrayList4.add(Boolean.valueOf(arrayList3.add(new dp1(i4, i11, i5, value2))));
                                    i5 = i6;
                                    th = th3;
                                    str2 = str;
                                }
                                c1321i3 = c1296l2.f16514d;
                                this.f15720a = c1296l2;
                                r4 = th;
                                this.f15721b = r4;
                                this.f15722c = r4;
                                this.f15723d = arrayList3;
                                this.f15724e = i3;
                                this.f15726g = 5;
                                if (c1321i3.m7509G0(arrayList2, this) != coroutineSingletons) {
                                    list2 = arrayList3;
                                    r5 = r4;
                                    C1321i c1321i6 = c1296l2.f16514d;
                                    this.f15720a = r5;
                                    this.f15721b = r5;
                                    this.f15722c = r5;
                                    this.f15723d = r5;
                                    this.f15724e = i3;
                                    this.f15726g = 6;
                                    objM2861d2 = AbstractC0758a.m2861d(new ke2(29, c1321i6, list2), c1321i6.f17034K, this, false, true);
                                    if (objM2861d2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        objM2861d2 = xfaVar;
                                    }
                                    if (objM2861d2 != coroutineSingletons) {
                                        return xfaVar;
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                int i12 = this.f15725f;
                int i13 = this.f15724e;
                list = this.f15722c;
                Sort sort4 = this.f15721b;
                C1296l c1296l4 = this.f15720a;
                AbstractC3193b.m15359b(obj);
                c1296l = c1296l4;
                sort = sort4;
                i = i13;
                i2 = i12;
                objM7501B0 = obj;
                arrayList = new ArrayList();
                while (r2.hasNext()) {
                    iIntValue = ((Number) obj3).intValue();
                    it = list.iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            next = null;
                        }
                        if (next == null) {
                            arrayList.add(obj3);
                        }
                    } while (((u85) next).f63562a != iIntValue);
                    if (next == null) {
                        arrayList.add(obj3);
                    }
                }
                c1321i = c1296l.f16514d;
                this.f15720a = c1296l;
                this.f15721b = sort;
                this.f15722c = null;
                this.f15723d = list;
                this.f15724e = i;
                this.f15725f = i2;
                this.f15726g = 2;
                if (c1321i.m7504A0(arrayList, this) != coroutineSingletons) {
                    i3 = i2;
                    i4 = i;
                    sort2 = sort;
                    c1296l2 = c1296l;
                    C1321i c1321i7 = c1296l2.f16514d;
                    value = sort2.getValue();
                    if (value == null) {
                        value = "";
                    }
                    this.f15720a = c1296l2;
                    this.f15721b = sort2;
                    this.f15722c = null;
                    this.f15723d = list;
                    this.f15724e = i4;
                    this.f15725f = i3;
                    this.f15726g = 3;
                    objM2861d = AbstractC0758a.m2861d(new ld0(i4, value, i8), c1321i7.f17034K, this, false, true);
                    if (objM2861d != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        objM2861d = xfaVar;
                    }
                    if (objM2861d != coroutineSingletons) {
                        c1321i2 = c1296l2.f16514d;
                        this.f15720a = c1296l2;
                        this.f15721b = sort2;
                        this.f15722c = null;
                        this.f15723d = list;
                        this.f15724e = i4;
                        this.f15725f = i3;
                        this.f15726g = 4;
                        if (c1321i2.mo4096w0(list, this) != coroutineSingletons) {
                            arrayList2 = new ArrayList();
                            arrayList3 = new ArrayList();
                            List list6 = list;
                            arrayList4 = new ArrayList(v91.m23189q0(list6, 10));
                            i5 = 0;
                            while (r4.hasNext()) {
                                i6 = i5 + 1;
                                if (i5 < 0) {
                                    Throwable th4 = th;
                                    vz1.m23628e0();
                                    throw th4;
                                }
                                u85 u85Var2 = (u85) obj4;
                                Throwable th5 = th;
                                str = str2;
                                arrayList2.add(new cp1(i4, u85Var2.f63562a, i5));
                                int i14 = u85Var2.f63562a;
                                value2 = sort2.getValue();
                                if (value2 == null) {
                                    value2 = str;
                                }
                                arrayList4.add(Boolean.valueOf(arrayList3.add(new dp1(i4, i14, i5, value2))));
                                i5 = i6;
                                th = th5;
                                str2 = str;
                            }
                            c1321i3 = c1296l2.f16514d;
                            this.f15720a = c1296l2;
                            r4 = th;
                            this.f15721b = r4;
                            this.f15722c = r4;
                            this.f15723d = arrayList3;
                            this.f15724e = i3;
                            this.f15726g = 5;
                            if (c1321i3.m7509G0(arrayList2, this) != coroutineSingletons) {
                                list2 = arrayList3;
                                r5 = r4;
                                C1321i c1321i8 = c1296l2.f16514d;
                                this.f15720a = r5;
                                this.f15721b = r5;
                                this.f15722c = r5;
                                this.f15723d = r5;
                                this.f15724e = i3;
                                this.f15726g = 6;
                                objM2861d2 = AbstractC0758a.m2861d(new ke2(29, c1321i8, list2), c1321i8.f17034K, this, false, true);
                                if (objM2861d2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    objM2861d2 = xfaVar;
                                }
                                if (objM2861d2 != coroutineSingletons) {
                                    return xfaVar;
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 2:
                i3 = this.f15725f;
                i4 = this.f15724e;
                list = this.f15723d;
                sort2 = this.f15721b;
                c1296l2 = this.f15720a;
                AbstractC3193b.m15359b(obj);
                C1321i c1321i9 = c1296l2.f16514d;
                value = sort2.getValue();
                if (value == null) {
                    value = "";
                }
                this.f15720a = c1296l2;
                this.f15721b = sort2;
                this.f15722c = null;
                this.f15723d = list;
                this.f15724e = i4;
                this.f15725f = i3;
                this.f15726g = 3;
                objM2861d = AbstractC0758a.m2861d(new ld0(i4, value, i8), c1321i9.f17034K, this, false, true);
                if (objM2861d != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    objM2861d = xfaVar;
                }
                if (objM2861d != coroutineSingletons) {
                    c1321i2 = c1296l2.f16514d;
                    this.f15720a = c1296l2;
                    this.f15721b = sort2;
                    this.f15722c = null;
                    this.f15723d = list;
                    this.f15724e = i4;
                    this.f15725f = i3;
                    this.f15726g = 4;
                    if (c1321i2.mo4096w0(list, this) != coroutineSingletons) {
                        arrayList2 = new ArrayList();
                        arrayList3 = new ArrayList();
                        List list7 = list;
                        arrayList4 = new ArrayList(v91.m23189q0(list7, 10));
                        i5 = 0;
                        while (r4.hasNext()) {
                            i6 = i5 + 1;
                            if (i5 < 0) {
                                Throwable th6 = th;
                                vz1.m23628e0();
                                throw th6;
                            }
                            u85 u85Var3 = (u85) obj4;
                            Throwable th7 = th;
                            str = str2;
                            arrayList2.add(new cp1(i4, u85Var3.f63562a, i5));
                            int i15 = u85Var3.f63562a;
                            value2 = sort2.getValue();
                            if (value2 == null) {
                                value2 = str;
                            }
                            arrayList4.add(Boolean.valueOf(arrayList3.add(new dp1(i4, i15, i5, value2))));
                            i5 = i6;
                            th = th7;
                            str2 = str;
                        }
                        c1321i3 = c1296l2.f16514d;
                        this.f15720a = c1296l2;
                        r4 = th;
                        this.f15721b = r4;
                        this.f15722c = r4;
                        this.f15723d = arrayList3;
                        this.f15724e = i3;
                        this.f15726g = 5;
                        if (c1321i3.m7509G0(arrayList2, this) != coroutineSingletons) {
                            list2 = arrayList3;
                            r5 = r4;
                            C1321i c1321i10 = c1296l2.f16514d;
                            this.f15720a = r5;
                            this.f15721b = r5;
                            this.f15722c = r5;
                            this.f15723d = r5;
                            this.f15724e = i3;
                            this.f15726g = 6;
                            objM2861d2 = AbstractC0758a.m2861d(new ke2(29, c1321i10, list2), c1321i10.f17034K, this, false, true);
                            if (objM2861d2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                objM2861d2 = xfaVar;
                            }
                            if (objM2861d2 != coroutineSingletons) {
                                return xfaVar;
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 3:
                i3 = this.f15725f;
                i4 = this.f15724e;
                list = this.f15723d;
                sort2 = this.f15721b;
                c1296l2 = this.f15720a;
                AbstractC3193b.m15359b(obj);
                c1321i2 = c1296l2.f16514d;
                this.f15720a = c1296l2;
                this.f15721b = sort2;
                this.f15722c = null;
                this.f15723d = list;
                this.f15724e = i4;
                this.f15725f = i3;
                this.f15726g = 4;
                if (c1321i2.mo4096w0(list, this) != coroutineSingletons) {
                    arrayList2 = new ArrayList();
                    arrayList3 = new ArrayList();
                    List list8 = list;
                    arrayList4 = new ArrayList(v91.m23189q0(list8, 10));
                    i5 = 0;
                    while (r4.hasNext()) {
                        i6 = i5 + 1;
                        if (i5 < 0) {
                            Throwable th8 = th;
                            vz1.m23628e0();
                            throw th8;
                        }
                        u85 u85Var4 = (u85) obj4;
                        Throwable th9 = th;
                        str = str2;
                        arrayList2.add(new cp1(i4, u85Var4.f63562a, i5));
                        int i16 = u85Var4.f63562a;
                        value2 = sort2.getValue();
                        if (value2 == null) {
                            value2 = str;
                        }
                        arrayList4.add(Boolean.valueOf(arrayList3.add(new dp1(i4, i16, i5, value2))));
                        i5 = i6;
                        th = th9;
                        str2 = str;
                    }
                    c1321i3 = c1296l2.f16514d;
                    this.f15720a = c1296l2;
                    r4 = th;
                    this.f15721b = r4;
                    this.f15722c = r4;
                    this.f15723d = arrayList3;
                    this.f15724e = i3;
                    this.f15726g = 5;
                    if (c1321i3.m7509G0(arrayList2, this) != coroutineSingletons) {
                        list2 = arrayList3;
                        r5 = r4;
                        C1321i c1321i11 = c1296l2.f16514d;
                        this.f15720a = r5;
                        this.f15721b = r5;
                        this.f15722c = r5;
                        this.f15723d = r5;
                        this.f15724e = i3;
                        this.f15726g = 6;
                        objM2861d2 = AbstractC0758a.m2861d(new ke2(29, c1321i11, list2), c1321i11.f17034K, this, false, true);
                        if (objM2861d2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            objM2861d2 = xfaVar;
                        }
                        if (objM2861d2 != coroutineSingletons) {
                            return xfaVar;
                        }
                    }
                }
                return coroutineSingletons;
            case 4:
                i3 = this.f15725f;
                i4 = this.f15724e;
                list = this.f15723d;
                sort2 = this.f15721b;
                c1296l2 = this.f15720a;
                AbstractC3193b.m15359b(obj);
                arrayList2 = new ArrayList();
                arrayList3 = new ArrayList();
                List list9 = list;
                arrayList4 = new ArrayList(v91.m23189q0(list9, 10));
                i5 = 0;
                while (r4.hasNext()) {
                    i6 = i5 + 1;
                    if (i5 < 0) {
                        Throwable th10 = th;
                        vz1.m23628e0();
                        throw th10;
                    }
                    u85 u85Var5 = (u85) obj4;
                    Throwable th11 = th;
                    str = str2;
                    arrayList2.add(new cp1(i4, u85Var5.f63562a, i5));
                    int i17 = u85Var5.f63562a;
                    value2 = sort2.getValue();
                    if (value2 == null) {
                        value2 = str;
                    }
                    arrayList4.add(Boolean.valueOf(arrayList3.add(new dp1(i4, i17, i5, value2))));
                    i5 = i6;
                    th = th11;
                    str2 = str;
                }
                c1321i3 = c1296l2.f16514d;
                this.f15720a = c1296l2;
                r4 = th;
                this.f15721b = r4;
                this.f15722c = r4;
                this.f15723d = arrayList3;
                this.f15724e = i3;
                this.f15726g = 5;
                if (c1321i3.m7509G0(arrayList2, this) != coroutineSingletons) {
                    list2 = arrayList3;
                    r5 = r4;
                    C1321i c1321i12 = c1296l2.f16514d;
                    this.f15720a = r5;
                    this.f15721b = r5;
                    this.f15722c = r5;
                    this.f15723d = r5;
                    this.f15724e = i3;
                    this.f15726g = 6;
                    objM2861d2 = AbstractC0758a.m2861d(new ke2(29, c1321i12, list2), c1321i12.f17034K, this, false, true);
                    if (objM2861d2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        objM2861d2 = xfaVar;
                    }
                    if (objM2861d2 != coroutineSingletons) {
                        return xfaVar;
                    }
                }
                return coroutineSingletons;
            case 5:
                i3 = this.f15724e;
                list2 = this.f15723d;
                C1296l c1296l5 = this.f15720a;
                AbstractC3193b.m15359b(obj);
                c1296l2 = c1296l5;
                r5 = 0;
                C1321i c1321i13 = c1296l2.f16514d;
                this.f15720a = r5;
                this.f15721b = r5;
                this.f15722c = r5;
                this.f15723d = r5;
                this.f15724e = i3;
                this.f15726g = 6;
                objM2861d2 = AbstractC0758a.m2861d(new ke2(29, c1321i13, list2), c1321i13.f17034K, this, false, true);
                if (objM2861d2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    objM2861d2 = xfaVar;
                }
                if (objM2861d2 != coroutineSingletons) {
                    return coroutineSingletons;
                }
                return xfaVar;
            case 6:
                List list10 = this.f15723d;
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
