package com.lingq.feature.search.search;

import com.lingq.core.data.repository.C1295k;
import com.lingq.core.domain.lesson.C1381c;
import com.lingq.core.domain.model.audio.DownloadItem;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.InterfaceC3812yx;
import p000.c32;
import p000.qj2;
import p000.u45;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.search.search.SearchCollectionsStateHolder$downloadCourseLessons$2", m4291f = "SearchCollectionsStateHolder.kt", m4292l = {411, 416, 426, 435}, m4293m = "invokeSuspend", m4294v = 2)
final class SearchCollectionsStateHolder$downloadCourseLessons$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public C2775b f32931a;

    /* JADX INFO: renamed from: b */
    public Iterator f32932b;

    /* JADX INFO: renamed from: c */
    public u45 f32933c;

    /* JADX INFO: renamed from: d */
    public String f32934d;

    /* JADX INFO: renamed from: e */
    public int f32935e;

    /* JADX INFO: renamed from: f */
    public int f32936f;

    /* JADX INFO: renamed from: g */
    public int f32937g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ List f32938h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C2775b f32939i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchCollectionsStateHolder$downloadCourseLessons$2(List list, C2775b c2775b, Continuation continuation) {
        super(1, continuation);
        this.f32938h = list;
        this.f32939i = c2775b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SearchCollectionsStateHolder$downloadCourseLessons$2(this.f32938h, this.f32939i, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((SearchCollectionsStateHolder$downloadCourseLessons$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0071  */
    /* JADX WARN: Code duplicated, block: B:25:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0091  */
    /* JADX WARN: Code duplicated, block: B:30:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f1 A[PHI: r5 r10 r11 r12 r13
      0x00f1: PHI (r5v2 int) = (r5v1 int), (r5v6 int), (r5v8 int) binds: [B:49:0x011a, B:37:0x00c4, B:44:0x00f6] A[DONT_GENERATE, DONT_INLINE]
      0x00f1: PHI (r10v3 int) = (r10v2 int), (r10v8 int), (r10v9 int) binds: [B:49:0x011a, B:37:0x00c4, B:44:0x00f6] A[DONT_GENERATE, DONT_INLINE]
      0x00f1: PHI (r11v1 u45) = (r11v0 u45), (r11v6 u45), (r11v8 u45) binds: [B:49:0x011a, B:37:0x00c4, B:44:0x00f6] A[DONT_GENERATE, DONT_INLINE]
      0x00f1: PHI (r12v2 java.util.Iterator) = (r12v1 java.util.Iterator), (r12v8 java.util.Iterator), (r12v9 java.util.Iterator) binds: [B:49:0x011a, B:37:0x00c4, B:44:0x00f6] A[DONT_GENERATE, DONT_INLINE]
      0x00f1: PHI (r13v2 com.lingq.feature.search.search.b) = 
      (r13v1 com.lingq.feature.search.search.b)
      (r13v6 com.lingq.feature.search.search.b)
      (r13v7 com.lingq.feature.search.search.b)
     binds: [B:49:0x011a, B:37:0x00c4, B:44:0x00f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:48:0x0119  */
    /* JADX WARN: Code duplicated, block: B:53:0x0140  */
    /* JADX WARN: Code duplicated, block: B:54:0x0141 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x0147 A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0141, code lost:
    
        if (r3 == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0021, code lost:
    
        if (r8 != r1) goto L9;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Iterator it;
        C2775b c2775b;
        int i;
        u45 u45Var;
        int i2;
        int i3;
        int i4;
        u45 u45Var2;
        Iterator it2;
        C2775b c2775b2;
        Object objM7286l;
        int i5;
        Object objM7991b;
        String str;
        InterfaceC3812yx interfaceC3812yx;
        DownloadItem downloadItem;
        String str2;
        int i6;
        String str3;
        InterfaceC3812yx interfaceC3812yx2;
        DownloadItem downloadItem2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = this.f32937g;
        xfa xfaVar = xfa.f68157a;
        int i8 = 1;
        if (i7 == 0) {
            AbstractC3193b.m15359b(obj);
            it = this.f32938h.iterator();
            c2775b = this.f32939i;
            i = 0;
            if (it.hasNext()) {
                return xfaVar;
            }
            u45Var = (u45) it.next();
            str2 = u45Var.f63399f;
            i6 = u45Var.f63394a;
            str3 = u45Var.f63400g;
            if (str2 != null || str2.length() <= 0) {
                if (str3 != null || str3.length() <= 0) {
                }
                if (str3.length() != 0) {
                    interfaceC3812yx2 = c2775b.f33081q;
                    downloadItem2 = new DownloadItem(c2775b.f33086v.f72109a, i6, str3);
                    this.f32931a = c2775b;
                    this.f32932b = it;
                    this.f32933c = u45Var;
                    this.f32934d = str3;
                    this.f32935e = i;
                    this.f32936f = 0;
                    this.f32937g = 3;
                    if (interfaceC3812yx2.mo8234r(downloadItem2, this) != coroutineSingletons) {
                        i2 = 0;
                        i3 = i2;
                        i4 = i;
                        u45Var2 = u45Var;
                        it2 = it;
                        c2775b2 = c2775b;
                        qj2 qj2Var = c2775b2.f33069e;
                        String str4 = c2775b2.f33086v.f72109a;
                        int i9 = u45Var2.f63394a;
                        this.f32931a = c2775b2;
                        this.f32932b = it2;
                        this.f32933c = null;
                        this.f32934d = null;
                        this.f32935e = i4;
                        this.f32936f = i3;
                        this.f32937g = 4;
                        objM7286l = ((C1295k) qj2Var.f57848a).m7286l(i9, str4, this);
                        if (objM7286l == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        }
                    }
                } else if (u45Var.f63398e == null) {
                    C1381c c1381c = c2775b.f33068d;
                    String str5 = c2775b.f33086v.f72109a;
                    this.f32931a = c2775b;
                    this.f32932b = it;
                    this.f32933c = u45Var;
                    this.f32934d = str3;
                    this.f32935e = i;
                    this.f32936f = 0;
                    this.f32937g = i8;
                    objM7991b = c1381c.m7991b(i6, str5, this);
                    if (objM7991b != coroutineSingletons) {
                        i3 = 0;
                        str = (String) objM7991b;
                        if (str.length() > 0) {
                            interfaceC3812yx = c2775b.f33081q;
                            downloadItem = new DownloadItem(c2775b.f33086v.f72109a, u45Var.f63394a, str);
                            this.f32931a = c2775b;
                            this.f32932b = it;
                            this.f32933c = u45Var;
                            this.f32934d = null;
                            this.f32935e = i;
                            this.f32936f = i3;
                            this.f32937g = 2;
                            if (interfaceC3812yx.mo8234r(downloadItem, this) != coroutineSingletons) {
                                i5 = i3;
                                i3 = i5;
                                i4 = i;
                                u45Var2 = u45Var;
                                it2 = it;
                                c2775b2 = c2775b;
                                qj2 qj2Var2 = c2775b2.f33069e;
                                String str6 = c2775b2.f33086v.f72109a;
                                int i10 = u45Var2.f63394a;
                                this.f32931a = c2775b2;
                                this.f32932b = it2;
                                this.f32933c = null;
                                this.f32934d = null;
                                this.f32935e = i4;
                                this.f32936f = i3;
                                this.f32937g = 4;
                                objM7286l = ((C1295k) qj2Var2.f57848a).m7286l(i10, str6, this);
                                if (objM7286l == CoroutineSingletons.COROUTINE_SUSPENDED) {
                                }
                            }
                        } else {
                            i4 = i;
                            u45Var2 = u45Var;
                            it2 = it;
                            c2775b2 = c2775b;
                            qj2 qj2Var3 = c2775b2.f33069e;
                            String str7 = c2775b2.f33086v.f72109a;
                            int i11 = u45Var2.f63394a;
                            this.f32931a = c2775b2;
                            this.f32932b = it2;
                            this.f32933c = null;
                            this.f32934d = null;
                            this.f32935e = i4;
                            this.f32936f = i3;
                            this.f32937g = 4;
                            objM7286l = ((C1295k) qj2Var3.f57848a).m7286l(i11, str7, this);
                            if (objM7286l == CoroutineSingletons.COROUTINE_SUSPENDED) {
                            }
                        }
                    }
                } else {
                    i3 = 0;
                    i4 = i;
                    u45Var2 = u45Var;
                    it2 = it;
                    c2775b2 = c2775b;
                    qj2 qj2Var4 = c2775b2.f33069e;
                    String str8 = c2775b2.f33086v.f72109a;
                    int i12 = u45Var2.f63394a;
                    this.f32931a = c2775b2;
                    this.f32932b = it2;
                    this.f32933c = null;
                    this.f32934d = null;
                    this.f32935e = i4;
                    this.f32936f = i3;
                    this.f32937g = 4;
                    objM7286l = ((C1295k) qj2Var4.f57848a).m7286l(i12, str8, this);
                    if (objM7286l == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    }
                }
                return coroutineSingletons;
            }
            str3 = u45Var.f63399f;
            if (str3 == null) {
            }
            if (str3.length() != 0) {
                interfaceC3812yx2 = c2775b.f33081q;
                downloadItem2 = new DownloadItem(c2775b.f33086v.f72109a, i6, str3);
                this.f32931a = c2775b;
                this.f32932b = it;
                this.f32933c = u45Var;
                this.f32934d = str3;
                this.f32935e = i;
                this.f32936f = 0;
                this.f32937g = 3;
                if (interfaceC3812yx2.mo8234r(downloadItem2, this) != coroutineSingletons) {
                    i2 = 0;
                    i3 = i2;
                    i4 = i;
                    u45Var2 = u45Var;
                    it2 = it;
                    c2775b2 = c2775b;
                    qj2 qj2Var5 = c2775b2.f33069e;
                    String str9 = c2775b2.f33086v.f72109a;
                    int i13 = u45Var2.f63394a;
                    this.f32931a = c2775b2;
                    this.f32932b = it2;
                    this.f32933c = null;
                    this.f32934d = null;
                    this.f32935e = i4;
                    this.f32936f = i3;
                    this.f32937g = 4;
                    objM7286l = ((C1295k) qj2Var5.f57848a).m7286l(i13, str9, this);
                    if (objM7286l == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    }
                }
            } else if (u45Var.f63398e == null) {
                C1381c c1381c2 = c2775b.f33068d;
                String str10 = c2775b.f33086v.f72109a;
                this.f32931a = c2775b;
                this.f32932b = it;
                this.f32933c = u45Var;
                this.f32934d = str3;
                this.f32935e = i;
                this.f32936f = 0;
                this.f32937g = i8;
                objM7991b = c1381c2.m7991b(i6, str10, this);
                if (objM7991b != coroutineSingletons) {
                    i3 = 0;
                    str = (String) objM7991b;
                    if (str.length() > 0) {
                        interfaceC3812yx = c2775b.f33081q;
                        downloadItem = new DownloadItem(c2775b.f33086v.f72109a, u45Var.f63394a, str);
                        this.f32931a = c2775b;
                        this.f32932b = it;
                        this.f32933c = u45Var;
                        this.f32934d = null;
                        this.f32935e = i;
                        this.f32936f = i3;
                        this.f32937g = 2;
                        if (interfaceC3812yx.mo8234r(downloadItem, this) != coroutineSingletons) {
                            i5 = i3;
                            i3 = i5;
                            i4 = i;
                            u45Var2 = u45Var;
                            it2 = it;
                            c2775b2 = c2775b;
                            qj2 qj2Var6 = c2775b2.f33069e;
                            String str11 = c2775b2.f33086v.f72109a;
                            int i14 = u45Var2.f63394a;
                            this.f32931a = c2775b2;
                            this.f32932b = it2;
                            this.f32933c = null;
                            this.f32934d = null;
                            this.f32935e = i4;
                            this.f32936f = i3;
                            this.f32937g = 4;
                            objM7286l = ((C1295k) qj2Var6.f57848a).m7286l(i14, str11, this);
                            if (objM7286l == CoroutineSingletons.COROUTINE_SUSPENDED) {
                            }
                        }
                    } else {
                        i4 = i;
                        u45Var2 = u45Var;
                        it2 = it;
                        c2775b2 = c2775b;
                        qj2 qj2Var7 = c2775b2.f33069e;
                        String str12 = c2775b2.f33086v.f72109a;
                        int i15 = u45Var2.f63394a;
                        this.f32931a = c2775b2;
                        this.f32932b = it2;
                        this.f32933c = null;
                        this.f32934d = null;
                        this.f32935e = i4;
                        this.f32936f = i3;
                        this.f32937g = 4;
                        objM7286l = ((C1295k) qj2Var7.f57848a).m7286l(i15, str12, this);
                        if (objM7286l == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        }
                    }
                }
            } else {
                i3 = 0;
                i4 = i;
                u45Var2 = u45Var;
                it2 = it;
                c2775b2 = c2775b;
                qj2 qj2Var8 = c2775b2.f33069e;
                String str13 = c2775b2.f33086v.f72109a;
                int i16 = u45Var2.f63394a;
                this.f32931a = c2775b2;
                this.f32932b = it2;
                this.f32933c = null;
                this.f32934d = null;
                this.f32935e = i4;
                this.f32936f = i3;
                this.f32937g = 4;
                objM7286l = ((C1295k) qj2Var8.f57848a).m7286l(i16, str13, this);
                if (objM7286l == CoroutineSingletons.COROUTINE_SUSPENDED) {
                }
            }
            return coroutineSingletons;
            str3 = "";
            if (str3.length() != 0) {
                interfaceC3812yx2 = c2775b.f33081q;
                downloadItem2 = new DownloadItem(c2775b.f33086v.f72109a, i6, str3);
                this.f32931a = c2775b;
                this.f32932b = it;
                this.f32933c = u45Var;
                this.f32934d = str3;
                this.f32935e = i;
                this.f32936f = 0;
                this.f32937g = 3;
                if (interfaceC3812yx2.mo8234r(downloadItem2, this) != coroutineSingletons) {
                    i2 = 0;
                    i3 = i2;
                    i4 = i;
                    u45Var2 = u45Var;
                    it2 = it;
                    c2775b2 = c2775b;
                    qj2 qj2Var9 = c2775b2.f33069e;
                    String str14 = c2775b2.f33086v.f72109a;
                    int i17 = u45Var2.f63394a;
                    this.f32931a = c2775b2;
                    this.f32932b = it2;
                    this.f32933c = null;
                    this.f32934d = null;
                    this.f32935e = i4;
                    this.f32936f = i3;
                    this.f32937g = 4;
                    objM7286l = ((C1295k) qj2Var9.f57848a).m7286l(i17, str14, this);
                    if (objM7286l == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    }
                }
            } else if (u45Var.f63398e == null) {
                C1381c c1381c3 = c2775b.f33068d;
                String str15 = c2775b.f33086v.f72109a;
                this.f32931a = c2775b;
                this.f32932b = it;
                this.f32933c = u45Var;
                this.f32934d = str3;
                this.f32935e = i;
                this.f32936f = 0;
                this.f32937g = i8;
                objM7991b = c1381c3.m7991b(i6, str15, this);
                if (objM7991b != coroutineSingletons) {
                    i3 = 0;
                    str = (String) objM7991b;
                    if (str.length() > 0) {
                        interfaceC3812yx = c2775b.f33081q;
                        downloadItem = new DownloadItem(c2775b.f33086v.f72109a, u45Var.f63394a, str);
                        this.f32931a = c2775b;
                        this.f32932b = it;
                        this.f32933c = u45Var;
                        this.f32934d = null;
                        this.f32935e = i;
                        this.f32936f = i3;
                        this.f32937g = 2;
                        if (interfaceC3812yx.mo8234r(downloadItem, this) != coroutineSingletons) {
                            i5 = i3;
                            i3 = i5;
                            i4 = i;
                            u45Var2 = u45Var;
                            it2 = it;
                            c2775b2 = c2775b;
                            qj2 qj2Var10 = c2775b2.f33069e;
                            String str16 = c2775b2.f33086v.f72109a;
                            int i18 = u45Var2.f63394a;
                            this.f32931a = c2775b2;
                            this.f32932b = it2;
                            this.f32933c = null;
                            this.f32934d = null;
                            this.f32935e = i4;
                            this.f32936f = i3;
                            this.f32937g = 4;
                            objM7286l = ((C1295k) qj2Var10.f57848a).m7286l(i18, str16, this);
                            if (objM7286l == CoroutineSingletons.COROUTINE_SUSPENDED) {
                            }
                        }
                    } else {
                        i4 = i;
                        u45Var2 = u45Var;
                        it2 = it;
                        c2775b2 = c2775b;
                        qj2 qj2Var11 = c2775b2.f33069e;
                        String str17 = c2775b2.f33086v.f72109a;
                        int i19 = u45Var2.f63394a;
                        this.f32931a = c2775b2;
                        this.f32932b = it2;
                        this.f32933c = null;
                        this.f32934d = null;
                        this.f32935e = i4;
                        this.f32936f = i3;
                        this.f32937g = 4;
                        objM7286l = ((C1295k) qj2Var11.f57848a).m7286l(i19, str17, this);
                        if (objM7286l == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        }
                    }
                }
            } else {
                i3 = 0;
                i4 = i;
                u45Var2 = u45Var;
                it2 = it;
                c2775b2 = c2775b;
                qj2 qj2Var12 = c2775b2.f33069e;
                String str18 = c2775b2.f33086v.f72109a;
                int i110 = u45Var2.f63394a;
                this.f32931a = c2775b2;
                this.f32932b = it2;
                this.f32933c = null;
                this.f32934d = null;
                this.f32935e = i4;
                this.f32936f = i3;
                this.f32937g = 4;
                objM7286l = ((C1295k) qj2Var12.f57848a).m7286l(i110, str18, this);
                if (objM7286l == CoroutineSingletons.COROUTINE_SUSPENDED) {
                }
            }
            return coroutineSingletons;
        }
        if (i7 == 1) {
            int i20 = this.f32936f;
            i = this.f32935e;
            u45Var = this.f32933c;
            it = this.f32932b;
            c2775b = this.f32931a;
            AbstractC3193b.m15359b(obj);
            i3 = i20;
            objM7991b = obj;
            str = (String) objM7991b;
            if (str.length() > 0) {
                interfaceC3812yx = c2775b.f33081q;
                downloadItem = new DownloadItem(c2775b.f33086v.f72109a, u45Var.f63394a, str);
                this.f32931a = c2775b;
                this.f32932b = it;
                this.f32933c = u45Var;
                this.f32934d = null;
                this.f32935e = i;
                this.f32936f = i3;
                this.f32937g = 2;
                if (interfaceC3812yx.mo8234r(downloadItem, this) != coroutineSingletons) {
                    i5 = i3;
                    i3 = i5;
                    i4 = i;
                    u45Var2 = u45Var;
                    it2 = it;
                    c2775b2 = c2775b;
                    qj2 qj2Var13 = c2775b2.f33069e;
                    String str19 = c2775b2.f33086v.f72109a;
                    int i111 = u45Var2.f63394a;
                    this.f32931a = c2775b2;
                    this.f32932b = it2;
                    this.f32933c = null;
                    this.f32934d = null;
                    this.f32935e = i4;
                    this.f32936f = i3;
                    this.f32937g = 4;
                    objM7286l = ((C1295k) qj2Var13.f57848a).m7286l(i111, str19, this);
                    if (objM7286l == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    }
                }
            } else {
                i4 = i;
                u45Var2 = u45Var;
                it2 = it;
                c2775b2 = c2775b;
                qj2 qj2Var14 = c2775b2.f33069e;
                String str110 = c2775b2.f33086v.f72109a;
                int i112 = u45Var2.f63394a;
                this.f32931a = c2775b2;
                this.f32932b = it2;
                this.f32933c = null;
                this.f32934d = null;
                this.f32935e = i4;
                this.f32936f = i3;
                this.f32937g = 4;
                objM7286l = ((C1295k) qj2Var14.f57848a).m7286l(i112, str110, this);
                if (objM7286l == CoroutineSingletons.COROUTINE_SUSPENDED) {
                }
            }
            return coroutineSingletons;
        }
        if (i7 == 2) {
            i5 = this.f32936f;
            i = this.f32935e;
            u45Var = this.f32933c;
            it = this.f32932b;
            c2775b = this.f32931a;
            AbstractC3193b.m15359b(obj);
            i3 = i5;
            i4 = i;
            u45Var2 = u45Var;
            it2 = it;
            c2775b2 = c2775b;
            qj2 qj2Var15 = c2775b2.f33069e;
            String str111 = c2775b2.f33086v.f72109a;
            int i113 = u45Var2.f63394a;
            this.f32931a = c2775b2;
            this.f32932b = it2;
            this.f32933c = null;
            this.f32934d = null;
            this.f32935e = i4;
            this.f32936f = i3;
            this.f32937g = 4;
            objM7286l = ((C1295k) qj2Var15.f57848a).m7286l(i113, str111, this);
            if (objM7286l == CoroutineSingletons.COROUTINE_SUSPENDED) {
            }
            return coroutineSingletons;
        }
        if (i7 == 3) {
            i2 = this.f32936f;
            i = this.f32935e;
            u45Var = this.f32933c;
            it = this.f32932b;
            c2775b = this.f32931a;
            AbstractC3193b.m15359b(obj);
            i3 = i2;
            i4 = i;
            u45Var2 = u45Var;
            it2 = it;
            c2775b2 = c2775b;
            qj2 qj2Var16 = c2775b2.f33069e;
            String str112 = c2775b2.f33086v.f72109a;
            int i114 = u45Var2.f63394a;
            this.f32931a = c2775b2;
            this.f32932b = it2;
            this.f32933c = null;
            this.f32934d = null;
            this.f32935e = i4;
            this.f32936f = i3;
            this.f32937g = 4;
            objM7286l = ((C1295k) qj2Var16.f57848a).m7286l(i114, str112, this);
            if (objM7286l == CoroutineSingletons.COROUTINE_SUSPENDED) {
            }
            return coroutineSingletons;
        }
        if (i7 != 4) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i4 = this.f32935e;
        it2 = this.f32932b;
        c2775b2 = this.f32931a;
        AbstractC3193b.m15359b(obj);
        it = it2;
        c2775b = c2775b2;
        i = i4;
        i8 = 1;
        if (it.hasNext()) {
            return xfaVar;
        }
        u45Var = (u45) it.next();
        str2 = u45Var.f63399f;
        i6 = u45Var.f63394a;
        str3 = u45Var.f63400g;
        if (str2 != null) {
            if (str3 != null) {
            }
        } else if (str3 != null) {
        }
        str3 = "";
        if (str3.length() != 0) {
            interfaceC3812yx2 = c2775b.f33081q;
            downloadItem2 = new DownloadItem(c2775b.f33086v.f72109a, i6, str3);
            this.f32931a = c2775b;
            this.f32932b = it;
            this.f32933c = u45Var;
            this.f32934d = str3;
            this.f32935e = i;
            this.f32936f = 0;
            this.f32937g = 3;
            if (interfaceC3812yx2.mo8234r(downloadItem2, this) != coroutineSingletons) {
                i2 = 0;
                i3 = i2;
                i4 = i;
                u45Var2 = u45Var;
                it2 = it;
                c2775b2 = c2775b;
                qj2 qj2Var17 = c2775b2.f33069e;
                String str113 = c2775b2.f33086v.f72109a;
                int i115 = u45Var2.f63394a;
                this.f32931a = c2775b2;
                this.f32932b = it2;
                this.f32933c = null;
                this.f32934d = null;
                this.f32935e = i4;
                this.f32936f = i3;
                this.f32937g = 4;
                objM7286l = ((C1295k) qj2Var17.f57848a).m7286l(i115, str113, this);
                if (objM7286l == CoroutineSingletons.COROUTINE_SUSPENDED) {
                }
            }
        } else if (u45Var.f63398e == null) {
            C1381c c1381c4 = c2775b.f33068d;
            String str114 = c2775b.f33086v.f72109a;
            this.f32931a = c2775b;
            this.f32932b = it;
            this.f32933c = u45Var;
            this.f32934d = str3;
            this.f32935e = i;
            this.f32936f = 0;
            this.f32937g = i8;
            objM7991b = c1381c4.m7991b(i6, str114, this);
            if (objM7991b != coroutineSingletons) {
                i3 = 0;
                str = (String) objM7991b;
                if (str.length() > 0) {
                    interfaceC3812yx = c2775b.f33081q;
                    downloadItem = new DownloadItem(c2775b.f33086v.f72109a, u45Var.f63394a, str);
                    this.f32931a = c2775b;
                    this.f32932b = it;
                    this.f32933c = u45Var;
                    this.f32934d = null;
                    this.f32935e = i;
                    this.f32936f = i3;
                    this.f32937g = 2;
                    if (interfaceC3812yx.mo8234r(downloadItem, this) != coroutineSingletons) {
                        i5 = i3;
                        i3 = i5;
                        i4 = i;
                        u45Var2 = u45Var;
                        it2 = it;
                        c2775b2 = c2775b;
                        qj2 qj2Var18 = c2775b2.f33069e;
                        String str115 = c2775b2.f33086v.f72109a;
                        int i116 = u45Var2.f63394a;
                        this.f32931a = c2775b2;
                        this.f32932b = it2;
                        this.f32933c = null;
                        this.f32934d = null;
                        this.f32935e = i4;
                        this.f32936f = i3;
                        this.f32937g = 4;
                        objM7286l = ((C1295k) qj2Var18.f57848a).m7286l(i116, str115, this);
                        if (objM7286l == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        }
                    }
                } else {
                    i4 = i;
                    u45Var2 = u45Var;
                    it2 = it;
                    c2775b2 = c2775b;
                    qj2 qj2Var19 = c2775b2.f33069e;
                    String str116 = c2775b2.f33086v.f72109a;
                    int i117 = u45Var2.f63394a;
                    this.f32931a = c2775b2;
                    this.f32932b = it2;
                    this.f32933c = null;
                    this.f32934d = null;
                    this.f32935e = i4;
                    this.f32936f = i3;
                    this.f32937g = 4;
                    objM7286l = ((C1295k) qj2Var19.f57848a).m7286l(i117, str116, this);
                    if (objM7286l == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    }
                }
            }
        } else {
            i3 = 0;
            i4 = i;
            u45Var2 = u45Var;
            it2 = it;
            c2775b2 = c2775b;
            qj2 qj2Var110 = c2775b2.f33069e;
            String str117 = c2775b2.f33086v.f72109a;
            int i118 = u45Var2.f63394a;
            this.f32931a = c2775b2;
            this.f32932b = it2;
            this.f32933c = null;
            this.f32934d = null;
            this.f32935e = i4;
            this.f32936f = i3;
            this.f32937g = 4;
            objM7286l = ((C1295k) qj2Var110.f57848a).m7286l(i118, str117, this);
            if (objM7286l == CoroutineSingletons.COROUTINE_SUSPENDED) {
            }
        }
        return coroutineSingletons;
    }
}
