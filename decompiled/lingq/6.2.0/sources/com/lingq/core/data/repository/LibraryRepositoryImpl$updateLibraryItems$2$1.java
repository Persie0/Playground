package com.lingq.core.data.repository;

import androidx.room.util.AbstractC0758a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.lingq.core.database.dao.AbstractC1320h;
import com.lingq.core.database.dao.C1321i;
import com.lingq.core.database.dao.C1322j;
import com.lingq.core.network.api.result.ResultLibraryItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3352my;
import p000.AbstractC3393o1;
import p000.C3386nv;
import p000.c32;
import p000.da5;
import p000.jd0;
import p000.k85;
import p000.n75;
import p000.u85;
import p000.v91;
import p000.vi3;
import p000.vz1;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.data.repository.LibraryRepositoryImpl$updateLibraryItems$2$1", m4291f = "LibraryRepositoryImpl.kt", m4292l = {ModuleDescriptor.MODULE_VERSION, 188, 195, 212, 213}, m4293m = "invokeSuspend", m4294v = 2)
final class LibraryRepositoryImpl$updateLibraryItems$2$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public List f15776a;

    /* JADX INFO: renamed from: b */
    public ArrayList f15777b;

    /* JADX INFO: renamed from: c */
    public int f15778c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ List f15779d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1296l f15780e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f15781f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f15782g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f15783h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f15784i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryRepositoryImpl$updateLibraryItems$2$1(List list, C1296l c1296l, int i, String str, String str2, String str3, Continuation continuation) {
        super(1, continuation);
        this.f15779d = list;
        this.f15780e = c1296l;
        this.f15781f = i;
        this.f15782g = str;
        this.f15783h = str2;
        this.f15784i = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LibraryRepositoryImpl$updateLibraryItems$2$1(this.f15779d, this.f15780e, this.f15781f, this.f15782g, this.f15783h, this.f15784i, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((LibraryRepositoryImpl$updateLibraryItems$2$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b9 A[PHI: r4
      0x00b9: PHI (r4v7 java.util.List) = (r4v6 java.util.List), (r4v6 java.util.List), (r4v13 java.util.List) binds: [B:28:0x009e, B:30:0x00b5, B:14:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d7 A[LOOP:3: B:33:0x00c9->B:37:0x00d7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0120  */
    /* JADX WARN: Code duplicated, block: B:46:0x0125  */
    /* JADX WARN: Code duplicated, block: B:50:0x0137  */
    /* JADX WARN: Code duplicated, block: B:55:0x0158 A[LOOP:1: B:53:0x0152->B:55:0x0158, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x018d A[LOOP:2: B:59:0x0187->B:61:0x018d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ba A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list;
        ArrayList arrayList;
        int i;
        Throwable th;
        Object objM2861d;
        List list2;
        int i2;
        ArrayList arrayList2;
        C1322j c1322j;
        ArrayList arrayList3;
        Iterator it;
        ?? r8;
        ArrayList arrayList4;
        List list3;
        ArrayList arrayList5;
        Iterator it2;
        ?? r9;
        AbstractC1320h abstractC1320h;
        C1296l c1296l = this.f15780e;
        C1321i c1321i = c1296l.f16514d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.f15778c;
        xfa xfaVar = xfa.f68157a;
        String str = this.f15782g;
        int i4 = this.f15781f;
        List list4 = this.f15779d;
        boolean z = true;
        Throwable th2 = null;
        if (i3 == 0) {
            AbstractC3193b.m15359b(obj);
            List list5 = list4;
            ArrayList arrayList6 = new ArrayList(v91.m23189q0(list5, 10));
            int i5 = 0;
            for (Object obj2 : list5) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    vz1.m23628e0();
                    throw null;
                }
                arrayList6.add(AbstractC3352my.m17121g0((ResultLibraryItem) obj2, i5));
                i5 = i6;
            }
            this.f15776a = arrayList6;
            this.f15778c = 1;
            if (c1321i.mo4096w0(arrayList6, this) != coroutineSingletons) {
                list = arrayList6;
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            list = this.f15776a;
            AbstractC3193b.m15359b(obj);
        } else {
            if (i3 == 2) {
                list = this.f15776a;
                AbstractC3193b.m15359b(obj);
                List list6 = list4;
                arrayList = new ArrayList(v91.m23189q0(list6, 10));
                i = 0;
                for (Object obj3 : list6) {
                    i2 = i + 1;
                    if (i < 0) {
                        Throwable th3 = th2;
                        vz1.m23628e0();
                        throw th3;
                    }
                    ResultLibraryItem resultLibraryItem = (ResultLibraryItem) obj3;
                    arrayList.add(new da5(resultLibraryItem.f21256a, ((i4 - 1) * 20) + i, str, resultLibraryItem.f21258b, this.f15783h));
                    i = i2;
                    th2 = th2;
                    z = true;
                }
                th = th2;
                this.f15776a = list;
                this.f15778c = 3;
                objM2861d = AbstractC0758a.m2861d(new k85(c1321i, arrayList, 1), c1321i.f17034K, this, false, true);
                if (objM2861d != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    objM2861d = xfaVar;
                }
                if (objM2861d != coroutineSingletons) {
                    list2 = list;
                    arrayList2 = new ArrayList();
                    List<u85> list7 = list2;
                    for (u85 u85Var : list7) {
                        list3 = u85Var.f63546H;
                        if (list3 != null) {
                            List list8 = list3;
                            arrayList5 = new ArrayList(v91.m23189q0(list8, 10));
                            it2 = list8.iterator();
                            while (it2.hasNext()) {
                                arrayList5.add(new n75(Integer.parseInt((String) it2.next()), this.f15784i, u85Var.f63562a));
                            }
                            arrayList2.addAll(arrayList5);
                        }
                    }
                    c1322j = c1296l.f16516f;
                    arrayList3 = new ArrayList(v91.m23189q0(list7, 10));
                    it = list7.iterator();
                    while (it.hasNext()) {
                        AbstractC3393o1.m17749x(((u85) it.next()).f63562a, arrayList3);
                    }
                    r8 = th;
                    this.f15776a = r8;
                    this.f15777b = arrayList2;
                    this.f15778c = 4;
                    if (c1322j.m7514y0(arrayList3, this) != coroutineSingletons) {
                        arrayList4 = arrayList2;
                        r9 = r8;
                        abstractC1320h = c1296l.f16515e;
                        this.f15776a = r9;
                        this.f15777b = r9;
                        this.f15778c = 5;
                        if (abstractC1320h.mo7493J0(arrayList4, this) == coroutineSingletons) {
                        }
                    }
                }
                return coroutineSingletons;
            }
            if (i3 == 3) {
                list2 = this.f15776a;
                AbstractC3193b.m15359b(obj);
                th = null;
                arrayList2 = new ArrayList();
                List<u85> list9 = list2;
                while (r6.hasNext()) {
                    list3 = u85Var.f63546H;
                    if (list3 != null) {
                        List list10 = list3;
                        arrayList5 = new ArrayList(v91.m23189q0(list10, 10));
                        it2 = list10.iterator();
                        while (it2.hasNext()) {
                            arrayList5.add(new n75(Integer.parseInt((String) it2.next()), this.f15784i, u85Var.f63562a));
                        }
                        arrayList2.addAll(arrayList5);
                    }
                }
                c1322j = c1296l.f16516f;
                arrayList3 = new ArrayList(v91.m23189q0(list9, 10));
                it = list9.iterator();
                while (it.hasNext()) {
                    AbstractC3393o1.m17749x(((u85) it.next()).f63562a, arrayList3);
                }
                r8 = th;
                this.f15776a = r8;
                this.f15777b = arrayList2;
                this.f15778c = 4;
                if (c1322j.m7514y0(arrayList3, this) != coroutineSingletons) {
                    arrayList4 = arrayList2;
                    r9 = r8;
                    abstractC1320h = c1296l.f16515e;
                    this.f15776a = r9;
                    this.f15777b = r9;
                    this.f15778c = 5;
                    if (abstractC1320h.mo7493J0(arrayList4, this) == coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i3 == 4) {
                arrayList4 = this.f15777b;
                List list11 = this.f15776a;
                AbstractC3193b.m15359b(obj);
                r9 = 0;
                abstractC1320h = c1296l.f16515e;
                this.f15776a = r9;
                this.f15777b = r9;
                this.f15778c = 5;
                if (abstractC1320h.mo7493J0(arrayList4, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i3 != 5) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                List list12 = this.f15776a;
                AbstractC3193b.m15359b(obj);
            }
        }
        return xfaVar;
        if (i4 == 1) {
            this.f15776a = list;
            this.f15778c = 2;
            if (AbstractC0758a.m2861d(new jd0(str, 13), c1321i.f17034K, this, false, true) != coroutineSingletons) {
                List list13 = list4;
                arrayList = new ArrayList(v91.m23189q0(list13, 10));
                i = 0;
                while (r15.hasNext()) {
                    i2 = i + 1;
                    if (i < 0) {
                        Throwable th4 = th2;
                        vz1.m23628e0();
                        throw th4;
                    }
                    ResultLibraryItem resultLibraryItem2 = (ResultLibraryItem) obj3;
                    arrayList.add(new da5(resultLibraryItem2.f21256a, ((i4 - 1) * 20) + i, str, resultLibraryItem2.f21258b, this.f15783h));
                    i = i2;
                    th2 = th2;
                    z = true;
                }
                th = th2;
                this.f15776a = list;
                this.f15778c = 3;
                objM2861d = AbstractC0758a.m2861d(new k85(c1321i, arrayList, 1), c1321i.f17034K, this, false, true);
                if (objM2861d != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    objM2861d = xfaVar;
                }
                if (objM2861d != coroutineSingletons) {
                    list2 = list;
                    arrayList2 = new ArrayList();
                    List<u85> list14 = list2;
                    while (r6.hasNext()) {
                        list3 = u85Var.f63546H;
                        if (list3 != null) {
                            List list15 = list3;
                            arrayList5 = new ArrayList(v91.m23189q0(list15, 10));
                            it2 = list15.iterator();
                            while (it2.hasNext()) {
                                arrayList5.add(new n75(Integer.parseInt((String) it2.next()), this.f15784i, u85Var.f63562a));
                            }
                            arrayList2.addAll(arrayList5);
                        }
                    }
                    c1322j = c1296l.f16516f;
                    arrayList3 = new ArrayList(v91.m23189q0(list14, 10));
                    it = list14.iterator();
                    while (it.hasNext()) {
                        AbstractC3393o1.m17749x(((u85) it.next()).f63562a, arrayList3);
                    }
                    r8 = th;
                    this.f15776a = r8;
                    this.f15777b = arrayList2;
                    this.f15778c = 4;
                    if (c1322j.m7514y0(arrayList3, this) != coroutineSingletons) {
                        arrayList4 = arrayList2;
                        r9 = r8;
                        abstractC1320h = c1296l.f16515e;
                        this.f15776a = r9;
                        this.f15777b = r9;
                        this.f15778c = 5;
                        if (abstractC1320h.mo7493J0(arrayList4, this) == coroutineSingletons) {
                            return xfaVar;
                        }
                    }
                }
            }
        } else {
            List list16 = list4;
            arrayList = new ArrayList(v91.m23189q0(list16, 10));
            i = 0;
            while (r15.hasNext()) {
                i2 = i + 1;
                if (i < 0) {
                    Throwable th5 = th2;
                    vz1.m23628e0();
                    throw th5;
                }
                ResultLibraryItem resultLibraryItem3 = (ResultLibraryItem) obj3;
                arrayList.add(new da5(resultLibraryItem3.f21256a, ((i4 - 1) * 20) + i, str, resultLibraryItem3.f21258b, this.f15783h));
                i = i2;
                th2 = th2;
                z = true;
            }
            th = th2;
            this.f15776a = list;
            this.f15778c = 3;
            objM2861d = AbstractC0758a.m2861d(new k85(c1321i, arrayList, 1), c1321i.f17034K, this, false, true);
            if (objM2861d != CoroutineSingletons.COROUTINE_SUSPENDED) {
                objM2861d = xfaVar;
            }
            if (objM2861d != coroutineSingletons) {
                list2 = list;
                arrayList2 = new ArrayList();
                List<u85> list17 = list2;
                while (r6.hasNext()) {
                    list3 = u85Var.f63546H;
                    if (list3 != null) {
                        List list18 = list3;
                        arrayList5 = new ArrayList(v91.m23189q0(list18, 10));
                        it2 = list18.iterator();
                        while (it2.hasNext()) {
                            arrayList5.add(new n75(Integer.parseInt((String) it2.next()), this.f15784i, u85Var.f63562a));
                        }
                        arrayList2.addAll(arrayList5);
                    }
                }
                c1322j = c1296l.f16516f;
                arrayList3 = new ArrayList(v91.m23189q0(list17, 10));
                it = list17.iterator();
                while (it.hasNext()) {
                    AbstractC3393o1.m17749x(((u85) it.next()).f63562a, arrayList3);
                }
                r8 = th;
                this.f15776a = r8;
                this.f15777b = arrayList2;
                this.f15778c = 4;
                if (c1322j.m7514y0(arrayList3, this) != coroutineSingletons) {
                    arrayList4 = arrayList2;
                    r9 = r8;
                    abstractC1320h = c1296l.f16515e;
                    this.f15776a = r9;
                    this.f15777b = r9;
                    this.f15778c = 5;
                    if (abstractC1320h.mo7493J0(arrayList4, this) == coroutineSingletons) {
                        return xfaVar;
                    }
                }
            }
        }
        return coroutineSingletons;
    }
}
