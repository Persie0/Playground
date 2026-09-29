package com.lingq.core.data.repository;

import androidx.room.AbstractC0746d;
import androidx.room.util.AbstractC0758a;
import com.lingq.core.database.dao.AbstractC1320h;
import com.lingq.core.database.dao.C1321i;
import com.lingq.core.database.dao.C1322j;
import com.lingq.core.domain.model.library.LibraryItemType;
import com.lingq.core.network.api.result.ResultPlaylist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3393o1;
import p000.C3386nv;
import p000.C3445p2;
import p000.bd7;
import p000.c32;
import p000.fa4;
import p000.h85;
import p000.n75;
import p000.pv0;
import p000.u85;
import p000.up0;
import p000.v91;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.PlaylistRepositoryImpl$fetchPlaylistLessons$2", m4291f = "PlaylistRepositoryImpl.kt", m4292l = {451, 452, 453, 454, 456, 461, 464}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistRepositoryImpl$fetchPlaylistLessons$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public ArrayList f15964a;

    /* JADX INFO: renamed from: b */
    public List f15965b;

    /* JADX INFO: renamed from: c */
    public List f15966c;

    /* JADX INFO: renamed from: d */
    public List f15967d;

    /* JADX INFO: renamed from: e */
    public int f15968e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ List f15969f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f15970g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f15971h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f15972i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C1302r f15973j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$fetchPlaylistLessons$2(List list, String str, String str2, int i, C1302r c1302r, Continuation continuation) {
        super(1, continuation);
        this.f15969f = list;
        this.f15970g = str;
        this.f15971h = str2;
        this.f15972i = i;
        this.f15973j = c1302r;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PlaylistRepositoryImpl$fetchPlaylistLessons$2(this.f15969f, this.f15970g, this.f15971h, this.f15972i, this.f15973j, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((PlaylistRepositoryImpl$fetchPlaylistLessons$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0211 A[LOOP:3: B:30:0x020b->B:32:0x0211, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x0235 A[PHI: r4 r7 r9 r20 r70
      0x0235: PHI (r4v6 java.util.List) = (r4v3 java.util.List), (r4v8 java.util.List) binds: [B:34:0x0231, B:12:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x0235: PHI (r7v5 java.util.List) = (r7v2 java.util.List), (r7v7 java.util.List) binds: [B:34:0x0231, B:12:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x0235: PHI (r9v13 java.util.ArrayList) = (r9v9 java.util.ArrayList), (r9v14 java.util.ArrayList) binds: [B:34:0x0231, B:12:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x0235: PHI (r20v4 java.util.List) = (r20v2 java.util.List), (r20v5 java.util.List) binds: [B:34:0x0231, B:12:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x0235: PHI (r70v6 java.lang.String) = (r70v4 java.lang.String), (r70v7 java.lang.String) binds: [B:34:0x0231, B:12:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x024b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0269  */
    /* JADX WARN: Code duplicated, block: B:46:0x026e A[PHI: r1 r9 r20 r70
      0x026e: PHI (r1v8 boolean) = (r1v5 boolean), (r1v13 boolean) binds: [B:44:0x026a, B:10:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r9v18 boolean) = (r9v16 boolean), (r9v20 boolean) binds: [B:44:0x026a, B:10:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r20v8 java.util.List) = (r20v6 java.util.List), (r20v9 java.util.List) binds: [B:44:0x026a, B:10:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r70v10 java.lang.String) = (r70v8 java.lang.String), (r70v11 java.lang.String) binds: [B:44:0x026a, B:10:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x0287 A[LOOP:2: B:47:0x0281->B:49:0x0287, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x02c3 A[PHI: r1 r4 r5 r9 r15
      0x02c3: PHI (r1v14 boolean) = (r1v8 boolean), (r1v19 boolean) binds: [B:51:0x02bf, B:9:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x02c3: PHI (r4v22 java.lang.Object) = (r4v21 java.lang.Object), (r4v24 java.lang.Object) binds: [B:51:0x02bf, B:9:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x02c3: PHI (r5v22 boolean) = (r5v18 boolean), (r5v23 boolean) binds: [B:51:0x02bf, B:9:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x02c3: PHI (r9v21 java.lang.String) = (r9v19 java.lang.String), (r9v0 java.lang.String) binds: [B:51:0x02bf, B:9:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x02c3: PHI (r15v4 java.util.ArrayList) = (r15v3 java.util.ArrayList), (r15v5 java.util.ArrayList) binds: [B:51:0x02bf, B:9:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:58:0x02e6 A[LOOP:1: B:56:0x02e0->B:58:0x02e6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x0321  */
    /* JADX WARN: Code duplicated, block: B:65:0x0325 A[PHI: r1 r4 r5 r9 r15
      0x0325: PHI (r1v20 boolean) = (r1v14 boolean), (r1v24 boolean) binds: [B:63:0x0322, B:8:0x0030] A[DONT_GENERATE, DONT_INLINE]
      0x0325: PHI (r4v25 java.util.List) = (r4v23 java.util.List), (r4v35 java.util.List) binds: [B:63:0x0322, B:8:0x0030] A[DONT_GENERATE, DONT_INLINE]
      0x0325: PHI (r5v24 boolean) = (r5v22 boolean), (r5v25 boolean) binds: [B:63:0x0322, B:8:0x0030] A[DONT_GENERATE, DONT_INLINE]
      0x0325: PHI (r9v22 java.lang.String) = (r9v21 java.lang.String), (r9v0 java.lang.String) binds: [B:63:0x0322, B:8:0x0030] A[DONT_GENERATE, DONT_INLINE]
      0x0325: PHI (r15v6 java.util.ArrayList) = (r15v4 java.util.ArrayList), (r15v7 java.util.ArrayList) binds: [B:63:0x0322, B:8:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x033c A[LOOP:0: B:66:0x0336->B:68:0x033c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x0375  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ArrayList arrayList;
        List list;
        String str;
        List list2;
        List list3;
        ArrayList arrayList2;
        Iterator it;
        ArrayList arrayList3;
        AbstractC1320h abstractC1320h;
        List list4;
        boolean z;
        boolean z2;
        Object objM2861d;
        ArrayList arrayList4;
        Iterator it2;
        ArrayList arrayList5;
        boolean z3;
        Object objM2861d2;
        List list5;
        ArrayList arrayList6;
        Iterator it3;
        Object objM2861d3;
        ArrayList arrayList7;
        Iterator it4;
        Object objM2861d4;
        C1302r c1302r = this.f15973j;
        C1322j c1322j = c1302r.f16534c;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f15968e;
        String str2 = this.f15970g;
        String str3 = this.f15971h;
        int i2 = this.f15972i;
        List<ResultPlaylist> list6 = this.f15969f;
        Object obj3 = xfa.f68157a;
        switch (i) {
            case 0:
                AbstractC3193b.m15359b(obj);
                arrayList = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                int i3 = 0;
                for (ResultPlaylist resultPlaylist : list6) {
                    int i4 = i3 + 1;
                    List list7 = list6;
                    if (fa4.m11650l(resultPlaylist.f21448o0, LibraryItemType.Collection.getValue())) {
                        arrayList9.add(new bd7(resultPlaylist.f21419a, new Integer(i3), this.f15970g, this.f15971h, true));
                    } else {
                        int i5 = resultPlaylist.f21419a;
                        String str4 = resultPlaylist.f21425d;
                        String str5 = resultPlaylist.f21427e;
                        int i6 = resultPlaylist.f21423c;
                        String str6 = resultPlaylist.f21421b;
                        String str7 = resultPlaylist.f21431g;
                        String str8 = resultPlaylist.f21420a0;
                        String str9 = resultPlaylist.f21422b0;
                        String str10 = resultPlaylist.f21428e0;
                        String str11 = resultPlaylist.f21417Y;
                        String str12 = resultPlaylist.f21440k0;
                        int i7 = resultPlaylist.f21402J;
                        int i8 = resultPlaylist.f21406N;
                        int i9 = resultPlaylist.f21403K;
                        int i10 = resultPlaylist.f21451r;
                        int i11 = resultPlaylist.f21435i;
                        String str13 = resultPlaylist.f21426d0;
                        List list8 = resultPlaylist.f21442l0;
                        String str14 = resultPlaylist.f21437j;
                        String str15 = resultPlaylist.f21448o0;
                        int i12 = resultPlaylist.f21454u;
                        String str16 = resultPlaylist.f21455v;
                        String str17 = resultPlaylist.f21433h;
                        double d = resultPlaylist.f21400H;
                        String str18 = resultPlaylist.f21424c0;
                        String str19 = resultPlaylist.f21430f0;
                        String str20 = resultPlaylist.f21412T;
                        String str21 = resultPlaylist.f21443m;
                        if (str21 == null) {
                            str21 = resultPlaylist.f21441l;
                        }
                        arrayList.add(new u85(i5, str15, str4, str5, i6, str6, null, null, null, str7, str11, str8, str9, str18, str13, str10, str19, str12, i7, 0, null, i8, i9, i10, Integer.valueOf(i11), Integer.valueOf(i12), str16, 0.0d, false, list8, str14, null, null, null, null, null, str17, d, str20, null, null, null, str21, false, 1616909760, 96062));
                        arrayList8.add(new n75(i2, str3, resultPlaylist.f21419a));
                        arrayList9.add(new bd7(resultPlaylist.f21419a, new Integer(i3), this.f15970g, this.f15971h, false));
                    }
                    i3 = i4;
                    list6 = list7;
                    str2 = str2;
                }
                list = list6;
                str = str2;
                C1321i c1321i = c1302r.f16536e;
                this.f15964a = arrayList;
                this.f15965b = arrayList8;
                this.f15966c = arrayList9;
                this.f15968e = 1;
                if (c1321i.mo4096w0(arrayList, this) != obj2) {
                    list2 = arrayList8;
                    list3 = arrayList9;
                    arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        AbstractC3393o1.m17749x(((u85) it.next()).f63562a, arrayList2);
                    }
                    arrayList3 = null;
                    this.f15964a = null;
                    this.f15965b = list2;
                    this.f15966c = list3;
                    this.f15968e = 2;
                    if (c1322j.m7514y0(arrayList2, this) != obj2) {
                        abstractC1320h = c1302r.f16533b;
                        this.f15964a = arrayList3;
                        this.f15965b = arrayList3;
                        this.f15966c = list3;
                        this.f15968e = 3;
                        if (abstractC1320h.mo7493J0(list2, this) != obj2) {
                            list4 = list3;
                            this.f15964a = arrayList3;
                            this.f15965b = arrayList3;
                            this.f15966c = arrayList3;
                            this.f15968e = 4;
                            AbstractC0746d abstractC0746d = c1322j.f17045K;
                            h85 h85Var = new h85(24, c1322j, list4);
                            z = false;
                            z2 = true;
                            objM2861d = AbstractC0758a.m2861d(h85Var, abstractC0746d, this, false, true);
                            if (objM2861d != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                objM2861d = obj3;
                            }
                            if (objM2861d != obj2) {
                                List list9 = list;
                                arrayList4 = new ArrayList(v91.m23189q0(list9, 10));
                                it2 = list9.iterator();
                                while (it2.hasNext()) {
                                    AbstractC3393o1.m17749x(((ResultPlaylist) it2.next()).f21419a, arrayList4);
                                }
                                this.f15964a = null;
                                this.f15965b = null;
                                this.f15966c = null;
                                this.f15968e = 5;
                                c1322j.getClass();
                                StringBuilder sb = new StringBuilder();
                                sb.append("SELECT * FROM PlaylistAndLessonsJoin WHERE language = ? AND nameWithLanguage = ? AND contentId NOT IN (");
                                arrayList5 = null;
                                z3 = z2;
                                str2 = str;
                                objM2861d2 = AbstractC0758a.m2861d(new C3445p2(AbstractC3393o1.m17736k(")", sb, arrayList4), str3, str2, (Object) arrayList4, 16), c1322j.f17045K, this, z3, z3);
                                if (objM2861d2 != obj2) {
                                    list5 = (List) objM2861d2;
                                    if (!list5.isEmpty()) {
                                        List list10 = list5;
                                        arrayList6 = new ArrayList(v91.m23189q0(list10, 10));
                                        it3 = list10.iterator();
                                        while (it3.hasNext()) {
                                            AbstractC3393o1.m17749x(((bd7) it3.next()).f8385c, arrayList6);
                                        }
                                        this.f15964a = arrayList5;
                                        this.f15965b = arrayList5;
                                        this.f15966c = arrayList5;
                                        this.f15967d = list5;
                                        this.f15968e = 6;
                                        c1322j.getClass();
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("DELETE FROM LessonsWithPlaylistJoin WHERE playlistId = ? AND contentId IN (");
                                        objM2861d3 = AbstractC0758a.m2861d(new pv0(i2, z3 ? 1 : 0, AbstractC3393o1.m17736k(")", sb2, arrayList6), arrayList6), c1322j.f17045K, this, z, z3);
                                        if (objM2861d3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                            objM2861d3 = obj3;
                                        }
                                        if (objM2861d3 != obj2) {
                                            List list11 = list5;
                                            arrayList7 = new ArrayList(v91.m23189q0(list11, 10));
                                            it4 = list11.iterator();
                                            while (it4.hasNext()) {
                                                AbstractC3393o1.m17749x(((bd7) it4.next()).f8385c, arrayList7);
                                            }
                                            this.f15964a = arrayList5;
                                            this.f15965b = arrayList5;
                                            this.f15966c = arrayList5;
                                            this.f15967d = arrayList5;
                                            this.f15968e = 7;
                                            c1322j.getClass();
                                            StringBuilder sb3 = new StringBuilder();
                                            sb3.append("DELETE FROM PlaylistAndLessonsJoin WHERE nameWithLanguage = ? AND contentId in (");
                                            objM2861d4 = AbstractC0758a.m2861d(new up0(AbstractC3393o1.m17736k(")", sb3, arrayList7), str2, arrayList7, 2), c1322j.f17045K, this, z, z3);
                                            if (objM2861d4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                                objM2861d4 = obj3;
                                            }
                                            if (objM2861d4 == obj2) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            case 1:
                list3 = this.f15966c;
                list2 = this.f15965b;
                arrayList = this.f15964a;
                AbstractC3193b.m15359b(obj);
                list = list6;
                str = str2;
                arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
                it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractC3393o1.m17749x(((u85) it.next()).f63562a, arrayList2);
                }
                arrayList3 = null;
                this.f15964a = null;
                this.f15965b = list2;
                this.f15966c = list3;
                this.f15968e = 2;
                if (c1322j.m7514y0(arrayList2, this) != obj2) {
                    abstractC1320h = c1302r.f16533b;
                    this.f15964a = arrayList3;
                    this.f15965b = arrayList3;
                    this.f15966c = list3;
                    this.f15968e = 3;
                    if (abstractC1320h.mo7493J0(list2, this) != obj2) {
                        list4 = list3;
                        this.f15964a = arrayList3;
                        this.f15965b = arrayList3;
                        this.f15966c = arrayList3;
                        this.f15968e = 4;
                        AbstractC0746d abstractC0746d2 = c1322j.f17045K;
                        h85 h85Var2 = new h85(24, c1322j, list4);
                        z = false;
                        z2 = true;
                        objM2861d = AbstractC0758a.m2861d(h85Var2, abstractC0746d2, this, false, true);
                        if (objM2861d != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            objM2861d = obj3;
                        }
                        if (objM2861d != obj2) {
                            List list12 = list;
                            arrayList4 = new ArrayList(v91.m23189q0(list12, 10));
                            it2 = list12.iterator();
                            while (it2.hasNext()) {
                                AbstractC3393o1.m17749x(((ResultPlaylist) it2.next()).f21419a, arrayList4);
                            }
                            this.f15964a = null;
                            this.f15965b = null;
                            this.f15966c = null;
                            this.f15968e = 5;
                            c1322j.getClass();
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("SELECT * FROM PlaylistAndLessonsJoin WHERE language = ? AND nameWithLanguage = ? AND contentId NOT IN (");
                            arrayList5 = null;
                            z3 = z2;
                            str2 = str;
                            objM2861d2 = AbstractC0758a.m2861d(new C3445p2(AbstractC3393o1.m17736k(")", sb4, arrayList4), str3, str2, (Object) arrayList4, 16), c1322j.f17045K, this, z3, z3);
                            if (objM2861d2 != obj2) {
                                list5 = (List) objM2861d2;
                                if (!list5.isEmpty()) {
                                    List list13 = list5;
                                    arrayList6 = new ArrayList(v91.m23189q0(list13, 10));
                                    it3 = list13.iterator();
                                    while (it3.hasNext()) {
                                        AbstractC3393o1.m17749x(((bd7) it3.next()).f8385c, arrayList6);
                                    }
                                    this.f15964a = arrayList5;
                                    this.f15965b = arrayList5;
                                    this.f15966c = arrayList5;
                                    this.f15967d = list5;
                                    this.f15968e = 6;
                                    c1322j.getClass();
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append("DELETE FROM LessonsWithPlaylistJoin WHERE playlistId = ? AND contentId IN (");
                                    objM2861d3 = AbstractC0758a.m2861d(new pv0(i2, z3 ? 1 : 0, AbstractC3393o1.m17736k(")", sb5, arrayList6), arrayList6), c1322j.f17045K, this, z, z3);
                                    if (objM2861d3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        objM2861d3 = obj3;
                                    }
                                    if (objM2861d3 != obj2) {
                                        List list14 = list5;
                                        arrayList7 = new ArrayList(v91.m23189q0(list14, 10));
                                        it4 = list14.iterator();
                                        while (it4.hasNext()) {
                                            AbstractC3393o1.m17749x(((bd7) it4.next()).f8385c, arrayList7);
                                        }
                                        this.f15964a = arrayList5;
                                        this.f15965b = arrayList5;
                                        this.f15966c = arrayList5;
                                        this.f15967d = arrayList5;
                                        this.f15968e = 7;
                                        c1322j.getClass();
                                        StringBuilder sb6 = new StringBuilder();
                                        sb6.append("DELETE FROM PlaylistAndLessonsJoin WHERE nameWithLanguage = ? AND contentId in (");
                                        objM2861d4 = AbstractC0758a.m2861d(new up0(AbstractC3393o1.m17736k(")", sb6, arrayList7), str2, arrayList7, 2), c1322j.f17045K, this, z, z3);
                                        if (objM2861d4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                            objM2861d4 = obj3;
                                        }
                                        if (objM2861d4 == obj2) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            case 2:
                list3 = this.f15966c;
                list2 = this.f15965b;
                AbstractC3193b.m15359b(obj);
                list = list6;
                str = str2;
                arrayList3 = null;
                abstractC1320h = c1302r.f16533b;
                this.f15964a = arrayList3;
                this.f15965b = arrayList3;
                this.f15966c = list3;
                this.f15968e = 3;
                if (abstractC1320h.mo7493J0(list2, this) != obj2) {
                    list4 = list3;
                    this.f15964a = arrayList3;
                    this.f15965b = arrayList3;
                    this.f15966c = arrayList3;
                    this.f15968e = 4;
                    AbstractC0746d abstractC0746d3 = c1322j.f17045K;
                    h85 h85Var3 = new h85(24, c1322j, list4);
                    z = false;
                    z2 = true;
                    objM2861d = AbstractC0758a.m2861d(h85Var3, abstractC0746d3, this, false, true);
                    if (objM2861d != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        objM2861d = obj3;
                    }
                    if (objM2861d != obj2) {
                        List list15 = list;
                        arrayList4 = new ArrayList(v91.m23189q0(list15, 10));
                        it2 = list15.iterator();
                        while (it2.hasNext()) {
                            AbstractC3393o1.m17749x(((ResultPlaylist) it2.next()).f21419a, arrayList4);
                        }
                        this.f15964a = null;
                        this.f15965b = null;
                        this.f15966c = null;
                        this.f15968e = 5;
                        c1322j.getClass();
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append("SELECT * FROM PlaylistAndLessonsJoin WHERE language = ? AND nameWithLanguage = ? AND contentId NOT IN (");
                        arrayList5 = null;
                        z3 = z2;
                        str2 = str;
                        objM2861d2 = AbstractC0758a.m2861d(new C3445p2(AbstractC3393o1.m17736k(")", sb7, arrayList4), str3, str2, (Object) arrayList4, 16), c1322j.f17045K, this, z3, z3);
                        if (objM2861d2 != obj2) {
                            list5 = (List) objM2861d2;
                            if (!list5.isEmpty()) {
                                List list16 = list5;
                                arrayList6 = new ArrayList(v91.m23189q0(list16, 10));
                                it3 = list16.iterator();
                                while (it3.hasNext()) {
                                    AbstractC3393o1.m17749x(((bd7) it3.next()).f8385c, arrayList6);
                                }
                                this.f15964a = arrayList5;
                                this.f15965b = arrayList5;
                                this.f15966c = arrayList5;
                                this.f15967d = list5;
                                this.f15968e = 6;
                                c1322j.getClass();
                                StringBuilder sb8 = new StringBuilder();
                                sb8.append("DELETE FROM LessonsWithPlaylistJoin WHERE playlistId = ? AND contentId IN (");
                                objM2861d3 = AbstractC0758a.m2861d(new pv0(i2, z3 ? 1 : 0, AbstractC3393o1.m17736k(")", sb8, arrayList6), arrayList6), c1322j.f17045K, this, z, z3);
                                if (objM2861d3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    objM2861d3 = obj3;
                                }
                                if (objM2861d3 != obj2) {
                                    List list17 = list5;
                                    arrayList7 = new ArrayList(v91.m23189q0(list17, 10));
                                    it4 = list17.iterator();
                                    while (it4.hasNext()) {
                                        AbstractC3393o1.m17749x(((bd7) it4.next()).f8385c, arrayList7);
                                    }
                                    this.f15964a = arrayList5;
                                    this.f15965b = arrayList5;
                                    this.f15966c = arrayList5;
                                    this.f15967d = arrayList5;
                                    this.f15968e = 7;
                                    c1322j.getClass();
                                    StringBuilder sb9 = new StringBuilder();
                                    sb9.append("DELETE FROM PlaylistAndLessonsJoin WHERE nameWithLanguage = ? AND contentId in (");
                                    objM2861d4 = AbstractC0758a.m2861d(new up0(AbstractC3393o1.m17736k(")", sb9, arrayList7), str2, arrayList7, 2), c1322j.f17045K, this, z, z3);
                                    if (objM2861d4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        objM2861d4 = obj3;
                                    }
                                    if (objM2861d4 == obj2) {
                                    }
                                }
                            }
                        }
                    }
                }
            case 3:
                list4 = this.f15966c;
                List list18 = this.f15965b;
                AbstractC3193b.m15359b(obj);
                list = list6;
                str = str2;
                arrayList3 = null;
                this.f15964a = arrayList3;
                this.f15965b = arrayList3;
                this.f15966c = arrayList3;
                this.f15968e = 4;
                AbstractC0746d abstractC0746d4 = c1322j.f17045K;
                h85 h85Var4 = new h85(24, c1322j, list4);
                z = false;
                z2 = true;
                objM2861d = AbstractC0758a.m2861d(h85Var4, abstractC0746d4, this, false, true);
                if (objM2861d != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    objM2861d = obj3;
                }
                if (objM2861d != obj2) {
                    List list19 = list;
                    arrayList4 = new ArrayList(v91.m23189q0(list19, 10));
                    it2 = list19.iterator();
                    while (it2.hasNext()) {
                        AbstractC3393o1.m17749x(((ResultPlaylist) it2.next()).f21419a, arrayList4);
                    }
                    this.f15964a = null;
                    this.f15965b = null;
                    this.f15966c = null;
                    this.f15968e = 5;
                    c1322j.getClass();
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append("SELECT * FROM PlaylistAndLessonsJoin WHERE language = ? AND nameWithLanguage = ? AND contentId NOT IN (");
                    arrayList5 = null;
                    z3 = z2;
                    str2 = str;
                    objM2861d2 = AbstractC0758a.m2861d(new C3445p2(AbstractC3393o1.m17736k(")", sb10, arrayList4), str3, str2, (Object) arrayList4, 16), c1322j.f17045K, this, z3, z3);
                    if (objM2861d2 != obj2) {
                        list5 = (List) objM2861d2;
                        if (!list5.isEmpty()) {
                            List list110 = list5;
                            arrayList6 = new ArrayList(v91.m23189q0(list110, 10));
                            it3 = list110.iterator();
                            while (it3.hasNext()) {
                                AbstractC3393o1.m17749x(((bd7) it3.next()).f8385c, arrayList6);
                            }
                            this.f15964a = arrayList5;
                            this.f15965b = arrayList5;
                            this.f15966c = arrayList5;
                            this.f15967d = list5;
                            this.f15968e = 6;
                            c1322j.getClass();
                            StringBuilder sb11 = new StringBuilder();
                            sb11.append("DELETE FROM LessonsWithPlaylistJoin WHERE playlistId = ? AND contentId IN (");
                            objM2861d3 = AbstractC0758a.m2861d(new pv0(i2, z3 ? 1 : 0, AbstractC3393o1.m17736k(")", sb11, arrayList6), arrayList6), c1322j.f17045K, this, z, z3);
                            if (objM2861d3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                objM2861d3 = obj3;
                            }
                            if (objM2861d3 != obj2) {
                                List list111 = list5;
                                arrayList7 = new ArrayList(v91.m23189q0(list111, 10));
                                it4 = list111.iterator();
                                while (it4.hasNext()) {
                                    AbstractC3393o1.m17749x(((bd7) it4.next()).f8385c, arrayList7);
                                }
                                this.f15964a = arrayList5;
                                this.f15965b = arrayList5;
                                this.f15966c = arrayList5;
                                this.f15967d = arrayList5;
                                this.f15968e = 7;
                                c1322j.getClass();
                                StringBuilder sb12 = new StringBuilder();
                                sb12.append("DELETE FROM PlaylistAndLessonsJoin WHERE nameWithLanguage = ? AND contentId in (");
                                objM2861d4 = AbstractC0758a.m2861d(new up0(AbstractC3393o1.m17736k(")", sb12, arrayList7), str2, arrayList7, 2), c1322j.f17045K, this, z, z3);
                                if (objM2861d4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    objM2861d4 = obj3;
                                }
                                if (objM2861d4 == obj2) {
                                }
                            }
                        }
                    }
                }
            case 4:
                List list20 = this.f15966c;
                List list21 = this.f15965b;
                AbstractC3193b.m15359b(obj);
                list = list6;
                str = str2;
                z = false;
                z2 = true;
                List list112 = list;
                arrayList4 = new ArrayList(v91.m23189q0(list112, 10));
                it2 = list112.iterator();
                while (it2.hasNext()) {
                    AbstractC3393o1.m17749x(((ResultPlaylist) it2.next()).f21419a, arrayList4);
                }
                this.f15964a = null;
                this.f15965b = null;
                this.f15966c = null;
                this.f15968e = 5;
                c1322j.getClass();
                StringBuilder sb13 = new StringBuilder();
                sb13.append("SELECT * FROM PlaylistAndLessonsJoin WHERE language = ? AND nameWithLanguage = ? AND contentId NOT IN (");
                arrayList5 = null;
                z3 = z2;
                str2 = str;
                objM2861d2 = AbstractC0758a.m2861d(new C3445p2(AbstractC3393o1.m17736k(")", sb13, arrayList4), str3, str2, (Object) arrayList4, 16), c1322j.f17045K, this, z3, z3);
                if (objM2861d2 != obj2) {
                    list5 = (List) objM2861d2;
                    if (!list5.isEmpty()) {
                        List list113 = list5;
                        arrayList6 = new ArrayList(v91.m23189q0(list113, 10));
                        it3 = list113.iterator();
                        while (it3.hasNext()) {
                            AbstractC3393o1.m17749x(((bd7) it3.next()).f8385c, arrayList6);
                        }
                        this.f15964a = arrayList5;
                        this.f15965b = arrayList5;
                        this.f15966c = arrayList5;
                        this.f15967d = list5;
                        this.f15968e = 6;
                        c1322j.getClass();
                        StringBuilder sb14 = new StringBuilder();
                        sb14.append("DELETE FROM LessonsWithPlaylistJoin WHERE playlistId = ? AND contentId IN (");
                        objM2861d3 = AbstractC0758a.m2861d(new pv0(i2, z3 ? 1 : 0, AbstractC3393o1.m17736k(")", sb14, arrayList6), arrayList6), c1322j.f17045K, this, z, z3);
                        if (objM2861d3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            objM2861d3 = obj3;
                        }
                        if (objM2861d3 != obj2) {
                            List list114 = list5;
                            arrayList7 = new ArrayList(v91.m23189q0(list114, 10));
                            it4 = list114.iterator();
                            while (it4.hasNext()) {
                                AbstractC3393o1.m17749x(((bd7) it4.next()).f8385c, arrayList7);
                            }
                            this.f15964a = arrayList5;
                            this.f15965b = arrayList5;
                            this.f15966c = arrayList5;
                            this.f15967d = arrayList5;
                            this.f15968e = 7;
                            c1322j.getClass();
                            StringBuilder sb15 = new StringBuilder();
                            sb15.append("DELETE FROM PlaylistAndLessonsJoin WHERE nameWithLanguage = ? AND contentId in (");
                            objM2861d4 = AbstractC0758a.m2861d(new up0(AbstractC3393o1.m17736k(")", sb15, arrayList7), str2, arrayList7, 2), c1322j.f17045K, this, z, z3);
                            if (objM2861d4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                objM2861d4 = obj3;
                            }
                            if (objM2861d4 == obj2) {
                            }
                        }
                    }
                }
            case 5:
                List list22 = this.f15966c;
                List list23 = this.f15965b;
                AbstractC3193b.m15359b(obj);
                objM2861d2 = obj;
                arrayList5 = null;
                z = false;
                z3 = true;
                list5 = (List) objM2861d2;
                if (!list5.isEmpty()) {
                    List list115 = list5;
                    arrayList6 = new ArrayList(v91.m23189q0(list115, 10));
                    it3 = list115.iterator();
                    while (it3.hasNext()) {
                        AbstractC3393o1.m17749x(((bd7) it3.next()).f8385c, arrayList6);
                    }
                    this.f15964a = arrayList5;
                    this.f15965b = arrayList5;
                    this.f15966c = arrayList5;
                    this.f15967d = list5;
                    this.f15968e = 6;
                    c1322j.getClass();
                    StringBuilder sb16 = new StringBuilder();
                    sb16.append("DELETE FROM LessonsWithPlaylistJoin WHERE playlistId = ? AND contentId IN (");
                    objM2861d3 = AbstractC0758a.m2861d(new pv0(i2, z3 ? 1 : 0, AbstractC3393o1.m17736k(")", sb16, arrayList6), arrayList6), c1322j.f17045K, this, z, z3);
                    if (objM2861d3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        objM2861d3 = obj3;
                    }
                    if (objM2861d3 != obj2) {
                        List list116 = list5;
                        arrayList7 = new ArrayList(v91.m23189q0(list116, 10));
                        it4 = list116.iterator();
                        while (it4.hasNext()) {
                            AbstractC3393o1.m17749x(((bd7) it4.next()).f8385c, arrayList7);
                        }
                        this.f15964a = arrayList5;
                        this.f15965b = arrayList5;
                        this.f15966c = arrayList5;
                        this.f15967d = arrayList5;
                        this.f15968e = 7;
                        c1322j.getClass();
                        StringBuilder sb17 = new StringBuilder();
                        sb17.append("DELETE FROM PlaylistAndLessonsJoin WHERE nameWithLanguage = ? AND contentId in (");
                        objM2861d4 = AbstractC0758a.m2861d(new up0(AbstractC3393o1.m17736k(")", sb17, arrayList7), str2, arrayList7, 2), c1322j.f17045K, this, z, z3);
                        if (objM2861d4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            objM2861d4 = obj3;
                        }
                        if (objM2861d4 == obj2) {
                        }
                    }
                }
            case 6:
                List list24 = this.f15967d;
                List list25 = this.f15966c;
                List list26 = this.f15965b;
                AbstractC3193b.m15359b(obj);
                list5 = list24;
                arrayList5 = null;
                z = false;
                z3 = true;
                List list117 = list5;
                arrayList7 = new ArrayList(v91.m23189q0(list117, 10));
                it4 = list117.iterator();
                while (it4.hasNext()) {
                    AbstractC3393o1.m17749x(((bd7) it4.next()).f8385c, arrayList7);
                }
                this.f15964a = arrayList5;
                this.f15965b = arrayList5;
                this.f15966c = arrayList5;
                this.f15967d = arrayList5;
                this.f15968e = 7;
                c1322j.getClass();
                StringBuilder sb18 = new StringBuilder();
                sb18.append("DELETE FROM PlaylistAndLessonsJoin WHERE nameWithLanguage = ? AND contentId in (");
                objM2861d4 = AbstractC0758a.m2861d(new up0(AbstractC3393o1.m17736k(")", sb18, arrayList7), str2, arrayList7, 2), c1322j.f17045K, this, z, z3);
                if (objM2861d4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    objM2861d4 = obj3;
                }
                return objM2861d4 == obj2 ? obj2 : obj3;
            case 7:
                List list27 = this.f15967d;
                List list28 = this.f15966c;
                List list29 = this.f15965b;
                AbstractC3193b.m15359b(obj);
                return obj3;
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
