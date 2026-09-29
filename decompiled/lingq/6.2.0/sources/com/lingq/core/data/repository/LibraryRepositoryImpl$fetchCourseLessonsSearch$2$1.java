package com.lingq.core.data.repository;

import com.lingq.core.database.dao.C1321i;
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
import p000.u85;
import p000.v91;
import p000.vi3;
import p000.vz1;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LibraryRepositoryImpl$fetchCourseLessonsSearch$2$1", m4291f = "LibraryRepositoryImpl.kt", m4292l = {336, 339, 340, 342, 347}, m4293m = "invokeSuspend", m4294v = 2)
final class LibraryRepositoryImpl$fetchCourseLessonsSearch$2$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public C1296l f15703a;

    /* JADX INFO: renamed from: b */
    public ArrayList f15704b;

    /* JADX INFO: renamed from: c */
    public ArrayList f15705c;

    /* JADX INFO: renamed from: d */
    public List f15706d;

    /* JADX INFO: renamed from: e */
    public int f15707e;

    /* JADX INFO: renamed from: f */
    public int f15708f;

    /* JADX INFO: renamed from: g */
    public int f15709g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Results f15710h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1296l f15711i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f15712j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryRepositoryImpl$fetchCourseLessonsSearch$2$1(Results results, C1296l c1296l, int i, Continuation continuation) {
        super(1, continuation);
        this.f15710h = results;
        this.f15711i = c1296l;
        this.f15712j = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LibraryRepositoryImpl$fetchCourseLessonsSearch$2$1(this.f15710h, this.f15711i, this.f15712j, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((LibraryRepositoryImpl$fetchCourseLessonsSearch$2$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0133  */
    /* JADX WARN: Code duplicated, block: B:55:0x0150  */
    /* JADX WARN: Code duplicated, block: B:59:0x0169  */
    /* JADX WARN: Code duplicated, block: B:61:0x0171 A[LOOP:0: B:57:0x0163->B:61:0x0171, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x017f A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0196, code lost:
    
        if (r3.m7509G0(r4, r18) == r1) goto L66;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ArrayList arrayList;
        int i;
        Object objM7501B0;
        C1296l c1296l;
        int i2;
        List list;
        int i3;
        ArrayList arrayList2;
        Object next;
        C1321i c1321i;
        int i4;
        List list2;
        C1296l c1296l2;
        C1321i c1321i2;
        int i5;
        List list3;
        C1296l c1296l3;
        ArrayList arrayList3;
        int i6;
        int i7;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = this.f15709g;
        if (i8 == 0) {
            AbstractC3193b.m15359b(obj);
            List list4 = this.f15710h.f21739d;
            if (list4 == null) {
                return null;
            }
            List list5 = list4;
            arrayList = new ArrayList(v91.m23189q0(list5, 10));
            int i9 = 0;
            for (Object obj2 : list5) {
                int i10 = i9 + 1;
                if (i9 < 0) {
                    vz1.m23628e0();
                    throw null;
                }
                arrayList.add(AbstractC3352my.m17121g0((ResultLibraryItem) obj2, i9));
                i9 = i10;
            }
            C1296l c1296l4 = this.f15711i;
            C1321i c1321i3 = c1296l4.f16514d;
            this.f15703a = c1296l4;
            this.f15704b = arrayList;
            i = this.f15712j;
            this.f15707e = i;
            this.f15708f = 0;
            this.f15709g = 1;
            objM7501B0 = C1321i.m7501B0(c1321i3, i, this);
            if (objM7501B0 != coroutineSingletons) {
                c1296l = c1296l4;
                i2 = 0;
            }
            return coroutineSingletons;
        }
        if (i8 == 1) {
            i2 = this.f15708f;
            int i11 = this.f15707e;
            arrayList = this.f15704b;
            c1296l = this.f15703a;
            AbstractC3193b.m15359b(obj);
            i = i11;
            objM7501B0 = obj;
        } else {
            if (i8 == 2) {
                i2 = this.f15708f;
                i3 = this.f15707e;
                list = this.f15706d;
                arrayList2 = this.f15705c;
                c1296l = this.f15703a;
                AbstractC3193b.m15359b(obj);
                c1321i = c1296l.f16514d;
                this.f15703a = c1296l;
                this.f15704b = null;
                this.f15705c = null;
                this.f15706d = list;
                this.f15707e = i3;
                this.f15708f = i2;
                this.f15709g = 3;
                if (c1321i.m7512y0(i3, arrayList2, this) != coroutineSingletons) {
                    i4 = i3;
                    list2 = list;
                    c1296l2 = c1296l;
                    c1321i2 = c1296l2.f16514d;
                    this.f15703a = c1296l2;
                    this.f15704b = null;
                    this.f15705c = null;
                    this.f15706d = list2;
                    this.f15707e = i4;
                    this.f15708f = i2;
                    this.f15709g = 4;
                    if (c1321i2.mo4096w0(list2, this) != coroutineSingletons) {
                        i5 = i4;
                        list3 = list2;
                        c1296l3 = c1296l2;
                        List list6 = list3;
                        arrayList3 = new ArrayList(v91.m23189q0(list6, 10));
                        i6 = 0;
                        for (Object obj3 : list6) {
                            i7 = i6 + 1;
                            if (i6 >= 0) {
                                vz1.m23628e0();
                                throw null;
                            }
                            arrayList3.add(new cp1(i5, ((u85) obj3).f63562a, i6));
                            i6 = i7;
                        }
                        C1321i c1321i4 = c1296l3.f16514d;
                        this.f15703a = null;
                        this.f15704b = null;
                        this.f15705c = null;
                        this.f15706d = null;
                        this.f15707e = i2;
                        this.f15709g = 5;
                    }
                }
                return coroutineSingletons;
            }
            if (i8 == 3) {
                i2 = this.f15708f;
                i4 = this.f15707e;
                list2 = this.f15706d;
                c1296l2 = this.f15703a;
                AbstractC3193b.m15359b(obj);
                c1321i2 = c1296l2.f16514d;
                this.f15703a = c1296l2;
                this.f15704b = null;
                this.f15705c = null;
                this.f15706d = list2;
                this.f15707e = i4;
                this.f15708f = i2;
                this.f15709g = 4;
                if (c1321i2.mo4096w0(list2, this) != coroutineSingletons) {
                    i5 = i4;
                    list3 = list2;
                    c1296l3 = c1296l2;
                    List list7 = list3;
                    arrayList3 = new ArrayList(v91.m23189q0(list7, 10));
                    i6 = 0;
                    while (r3.hasNext()) {
                        i7 = i6 + 1;
                        if (i6 >= 0) {
                            vz1.m23628e0();
                            throw null;
                        }
                        arrayList3.add(new cp1(i5, ((u85) obj3).f63562a, i6));
                        i6 = i7;
                    }
                    C1321i c1321i5 = c1296l3.f16514d;
                    this.f15703a = null;
                    this.f15704b = null;
                    this.f15705c = null;
                    this.f15706d = null;
                    this.f15707e = i2;
                    this.f15709g = 5;
                }
                return coroutineSingletons;
            }
            if (i8 == 4) {
                i2 = this.f15708f;
                i5 = this.f15707e;
                list3 = this.f15706d;
                c1296l3 = this.f15703a;
                AbstractC3193b.m15359b(obj);
                List list8 = list3;
                arrayList3 = new ArrayList(v91.m23189q0(list8, 10));
                i6 = 0;
                while (r3.hasNext()) {
                    i7 = i6 + 1;
                    if (i6 >= 0) {
                        vz1.m23628e0();
                        throw null;
                    }
                    arrayList3.add(new cp1(i5, ((u85) obj3).f63562a, i6));
                    i6 = i7;
                }
                C1321i c1321i6 = c1296l3.f16514d;
                this.f15703a = null;
                this.f15704b = null;
                this.f15705c = null;
                this.f15706d = null;
                this.f15707e = i2;
                this.f15709g = 5;
            } else {
                if (i8 != 5) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                List list9 = this.f15706d;
                AbstractC3193b.m15359b(obj);
            }
        }
        return xfa.f68157a;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : (List) objM7501B0) {
            int iIntValue = ((Number) obj4).intValue();
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((u85) next).f63562a != iIntValue);
            if (next == null) {
                arrayList4.add(obj4);
            }
        }
        C1321i c1321i7 = c1296l.f16514d;
        this.f15703a = c1296l;
        this.f15704b = null;
        this.f15705c = arrayList4;
        this.f15706d = arrayList;
        this.f15707e = i;
        this.f15708f = i2;
        this.f15709g = 2;
        if (c1321i7.m7504A0(arrayList4, this) != coroutineSingletons) {
            list = arrayList;
            i3 = i;
            arrayList2 = arrayList4;
            c1321i = c1296l.f16514d;
            this.f15703a = c1296l;
            this.f15704b = null;
            this.f15705c = null;
            this.f15706d = list;
            this.f15707e = i3;
            this.f15708f = i2;
            this.f15709g = 3;
            if (c1321i.m7512y0(i3, arrayList2, this) != coroutineSingletons) {
                i4 = i3;
                list2 = list;
                c1296l2 = c1296l;
                c1321i2 = c1296l2.f16514d;
                this.f15703a = c1296l2;
                this.f15704b = null;
                this.f15705c = null;
                this.f15706d = list2;
                this.f15707e = i4;
                this.f15708f = i2;
                this.f15709g = 4;
                if (c1321i2.mo4096w0(list2, this) != coroutineSingletons) {
                    i5 = i4;
                    list3 = list2;
                    c1296l3 = c1296l2;
                    List list10 = list3;
                    arrayList3 = new ArrayList(v91.m23189q0(list10, 10));
                    i6 = 0;
                    while (r3.hasNext()) {
                        i7 = i6 + 1;
                        if (i6 >= 0) {
                            vz1.m23628e0();
                            throw null;
                        }
                        arrayList3.add(new cp1(i5, ((u85) obj3).f63562a, i6));
                        i6 = i7;
                    }
                    C1321i c1321i8 = c1296l3.f16514d;
                    this.f15703a = null;
                    this.f15704b = null;
                    this.f15705c = null;
                    this.f15706d = null;
                    this.f15707e = i2;
                    this.f15709g = 5;
                }
            }
        }
        return coroutineSingletons;
    }
}
