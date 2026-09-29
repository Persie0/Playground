package com.lingq.feature.collections.domain;

import com.lingq.core.data.repository.C1295k;
import com.lingq.core.data.repository.C1296l;
import com.lingq.core.domain.lesson.C1381c;
import com.lingq.core.domain.model.audio.DownloadItem;
import com.lingq.core.domain.model.library.LibraryItemType;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3139j9;
import p000.C3386nv;
import p000.InterfaceC3812yx;
import p000.e23;
import p000.ej2;
import p000.gj2;
import p000.h0a;
import p000.nn1;
import p000.r23;
import p000.rm5;
import p000.sm5;
import p000.u45;
import p000.un1;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.feature.collections.domain.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C2037c {
    private static final ej2 Companion = new ej2();

    /* JADX INFO: renamed from: h */
    public static final ConcurrentHashMap f25643h = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final r23 f25644a;

    /* JADX INFO: renamed from: b */
    public final e23 f25645b;

    /* JADX INFO: renamed from: c */
    public final C3139j9 f25646c;

    /* JADX INFO: renamed from: d */
    public final C1381c f25647d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC3812yx f25648e;

    /* JADX INFO: renamed from: f */
    public final un1 f25649f;

    /* JADX INFO: renamed from: g */
    public final nn1 f25650g;

    public C2037c(r23 r23Var, e23 e23Var, C3139j9 c3139j9, C1381c c1381c, InterfaceC3812yx interfaceC3812yx, un1 un1Var, nn1 nn1Var) {
        interfaceC3812yx.getClass();
        un1Var.getClass();
        this.f25644a = r23Var;
        this.f25645b = e23Var;
        this.f25646c = c3139j9;
        this.f25647d = c1381c;
        this.f25648e = interfaceC3812yx;
        this.f25649f = un1Var;
        this.f25650g = nn1Var;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:? A[LOOP:0: B:35:0x00a5->B:52:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00c5 -> B:35:0x00a5). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    public static final Object m8957a(C2037c c2037c, String str, int i, ContinuationImpl continuationImpl) throws Throwable {
        DownloadCollectionCourseUseCase$runCourseDownload$1 downloadCollectionCourseUseCase$runCourseDownload$1;
        int i2;
        String str2;
        int i3;
        Iterator it;
        String str3;
        int i4;
        int i5;
        u45 u45Var;
        if (continuationImpl instanceof DownloadCollectionCourseUseCase$runCourseDownload$1) {
            downloadCollectionCourseUseCase$runCourseDownload$1 = (DownloadCollectionCourseUseCase$runCourseDownload$1) continuationImpl;
            int i6 = downloadCollectionCourseUseCase$runCourseDownload$1.f25622h;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                downloadCollectionCourseUseCase$runCourseDownload$1.f25622h = i6 - Integer.MIN_VALUE;
            } else {
                downloadCollectionCourseUseCase$runCourseDownload$1 = new DownloadCollectionCourseUseCase$runCourseDownload$1(c2037c, continuationImpl);
            }
        } else {
            downloadCollectionCourseUseCase$runCourseDownload$1 = new DownloadCollectionCourseUseCase$runCourseDownload$1(c2037c, continuationImpl);
        }
        DownloadCollectionCourseUseCase$runCourseDownload$1 downloadCollectionCourseUseCase$runCourseDownload$2 = downloadCollectionCourseUseCase$runCourseDownload$1;
        Object obj = downloadCollectionCourseUseCase$runCourseDownload$2.f25620f;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = downloadCollectionCourseUseCase$runCourseDownload$2.f25622h;
        Object obj3 = xfa.f68157a;
        if (i7 == 0) {
            AbstractC3193b.m15359b(obj);
            e23 e23Var = c2037c.f25645b;
            String value = LibraryItemType.Collection.getValue();
            downloadCollectionCourseUseCase$runCourseDownload$2.f25615a = str;
            downloadCollectionCourseUseCase$runCourseDownload$2.f25618d = i;
            downloadCollectionCourseUseCase$runCourseDownload$2.f25622h = 1;
            Object objM7322q = ((C1296l) e23Var.f36613a).m7322q(i, str, value, downloadCollectionCourseUseCase$runCourseDownload$2, false);
            if (objM7322q != obj2) {
                objM7322q = obj3;
            }
            if (objM7322q == obj2) {
                return obj2;
            }
            i2 = i;
        } else {
            if (i7 != 1) {
                if (i7 == 2) {
                    i3 = downloadCollectionCourseUseCase$runCourseDownload$2.f25618d;
                    str2 = downloadCollectionCourseUseCase$runCourseDownload$2.f25615a;
                    AbstractC3193b.m15359b(obj);
                    it = ((Iterable) obj).iterator();
                    str3 = str2;
                    i4 = i3;
                    i5 = 0;
                    while (it.hasNext()) {
                        u45Var = (u45) it.next();
                        downloadCollectionCourseUseCase$runCourseDownload$2.f25615a = str3;
                        downloadCollectionCourseUseCase$runCourseDownload$2.f25616b = it;
                        downloadCollectionCourseUseCase$runCourseDownload$2.f25617c = u45Var;
                        downloadCollectionCourseUseCase$runCourseDownload$2.f25618d = i4;
                        downloadCollectionCourseUseCase$runCourseDownload$2.f25619e = i5;
                        downloadCollectionCourseUseCase$runCourseDownload$2.f25622h = 3;
                        if (c2037c.m8958b(str3, u45Var, downloadCollectionCourseUseCase$runCourseDownload$2) == obj2) {
                            return obj2;
                        }
                    }
                    return obj3;
                }
                if (i7 != 3) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i5 = downloadCollectionCourseUseCase$runCourseDownload$2.f25619e;
                i4 = downloadCollectionCourseUseCase$runCourseDownload$2.f25618d;
                u45Var = downloadCollectionCourseUseCase$runCourseDownload$2.f25617c;
                it = downloadCollectionCourseUseCase$runCourseDownload$2.f25616b;
                str3 = downloadCollectionCourseUseCase$runCourseDownload$2.f25615a;
                try {
                    AbstractC3193b.m15359b(obj);
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    rm5 rm5Var = sm5.Companion;
                    String str4 = "Course download: lesson " + u45Var.f63394a + " failed - " + e2.getMessage();
                    rm5Var.getClass();
                    h0a.f41641a.mo11431b(str4, new Object[0]);
                }
                while (it.hasNext()) {
                    u45Var = (u45) it.next();
                    downloadCollectionCourseUseCase$runCourseDownload$2.f25615a = str3;
                    downloadCollectionCourseUseCase$runCourseDownload$2.f25616b = it;
                    downloadCollectionCourseUseCase$runCourseDownload$2.f25617c = u45Var;
                    downloadCollectionCourseUseCase$runCourseDownload$2.f25618d = i4;
                    downloadCollectionCourseUseCase$runCourseDownload$2.f25619e = i5;
                    downloadCollectionCourseUseCase$runCourseDownload$2.f25622h = 3;
                    if (c2037c.m8958b(str3, u45Var, downloadCollectionCourseUseCase$runCourseDownload$2) == obj2) {
                        return obj2;
                    }
                }
                return obj3;
            }
            int i8 = downloadCollectionCourseUseCase$runCourseDownload$2.f25618d;
            String str5 = downloadCollectionCourseUseCase$runCourseDownload$2.f25615a;
            AbstractC3193b.m15359b(obj);
            i2 = i8;
            str = str5;
        }
        r23 r23Var = c2037c.f25644a;
        downloadCollectionCourseUseCase$runCourseDownload$2.f25615a = str;
        downloadCollectionCourseUseCase$runCourseDownload$2.f25618d = i2;
        downloadCollectionCourseUseCase$runCourseDownload$2.f25622h = 2;
        Object objM7312g = ((C1296l) r23Var.f58517a).m7312g(i2, downloadCollectionCourseUseCase$runCourseDownload$2);
        if (objM7312g == obj2) {
            return obj2;
        }
        str2 = str;
        i3 = i2;
        obj = objM7312g;
        it = ((Iterable) obj).iterator();
        str3 = str2;
        i4 = i3;
        i5 = 0;
        while (it.hasNext()) {
            u45Var = (u45) it.next();
            downloadCollectionCourseUseCase$runCourseDownload$2.f25615a = str3;
            downloadCollectionCourseUseCase$runCourseDownload$2.f25616b = it;
            downloadCollectionCourseUseCase$runCourseDownload$2.f25617c = u45Var;
            downloadCollectionCourseUseCase$runCourseDownload$2.f25618d = i4;
            downloadCollectionCourseUseCase$runCourseDownload$2.f25619e = i5;
            downloadCollectionCourseUseCase$runCourseDownload$2.f25622h = 3;
            if (c2037c.m8958b(str3, u45Var, downloadCollectionCourseUseCase$runCourseDownload$2) == obj2) {
                return obj2;
            }
        }
        return obj3;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0061  */
    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    /* JADX WARN: Code duplicated, block: B:32:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0097  */
    /* JADX WARN: Code duplicated, block: B:47:0x00af  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b5 A[PHI: r11 r12
      0x00b5: PHI (r11v4 java.lang.String) = (r11v1 java.lang.String), (r11v6 java.lang.String) binds: [B:43:0x0095, B:48:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x00b5: PHI (r12v4 u45) = (r12v1 u45), (r12v7 u45) binds: [B:43:0x0095, B:48:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008c, code lost:
    
        if (r2 == r1) goto L54;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8958b(String str, u45 u45Var, ContinuationImpl continuationImpl) throws Throwable {
        DownloadCollectionCourseUseCase$downloadLesson$1 downloadCollectionCourseUseCase$downloadLesson$1;
        String str2;
        String str3;
        Object objM7991b;
        DownloadItem downloadItem;
        String str4;
        u45 u45Var2;
        Object objM7286l;
        if (continuationImpl instanceof DownloadCollectionCourseUseCase$downloadLesson$1) {
            downloadCollectionCourseUseCase$downloadLesson$1 = (DownloadCollectionCourseUseCase$downloadLesson$1) continuationImpl;
            int i = downloadCollectionCourseUseCase$downloadLesson$1.f25608f;
            if ((i & Integer.MIN_VALUE) != 0) {
                downloadCollectionCourseUseCase$downloadLesson$1.f25608f = i - Integer.MIN_VALUE;
            } else {
                downloadCollectionCourseUseCase$downloadLesson$1 = new DownloadCollectionCourseUseCase$downloadLesson$1(this, continuationImpl);
            }
        } else {
            downloadCollectionCourseUseCase$downloadLesson$1 = new DownloadCollectionCourseUseCase$downloadLesson$1(this, continuationImpl);
        }
        Object obj = downloadCollectionCourseUseCase$downloadLesson$1.f25606d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = downloadCollectionCourseUseCase$downloadLesson$1.f25608f;
        xfa xfaVar = xfa.f68157a;
        if (i2 != 0) {
            if (i2 == 1) {
                String str5 = downloadCollectionCourseUseCase$downloadLesson$1.f25605c;
                u45Var = downloadCollectionCourseUseCase$downloadLesson$1.f25604b;
                String str6 = downloadCollectionCourseUseCase$downloadLesson$1.f25603a;
                AbstractC3193b.m15359b(obj);
                str2 = str5;
                str = str6;
                objM7991b = obj;
            } else if (i2 == 2) {
                u45Var2 = downloadCollectionCourseUseCase$downloadLesson$1.f25604b;
                str4 = downloadCollectionCourseUseCase$downloadLesson$1.f25603a;
                AbstractC3193b.m15359b(obj);
                String str7 = str4;
                u45Var = u45Var2;
                str = str7;
                int i3 = u45Var.f63394a;
                downloadCollectionCourseUseCase$downloadLesson$1.f25603a = null;
                downloadCollectionCourseUseCase$downloadLesson$1.f25604b = null;
                downloadCollectionCourseUseCase$downloadLesson$1.f25605c = null;
                downloadCollectionCourseUseCase$downloadLesson$1.f25608f = 3;
                objM7286l = ((C1295k) this.f25646c.f45229a).m7286l(i3, str, downloadCollectionCourseUseCase$downloadLesson$1);
                if (objM7286l != coroutineSingletons) {
                    objM7286l = xfaVar;
                }
                if (objM7286l == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 3) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfaVar;
        }
        AbstractC3193b.m15359b(obj);
        str2 = u45Var.f63399f;
        str3 = "";
        if (str2 == null) {
            str2 = u45Var.f63400g;
            if (str2 != null || str2.length() <= 0) {
                str2 = null;
            }
            if (str2 == null) {
                str2 = "";
            }
        } else {
            if (str2.length() <= 0) {
                str2 = null;
            }
            if (str2 == null) {
                str2 = u45Var.f63400g;
                if (str2 != null) {
                    str2 = null;
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    str2 = "";
                }
            }
        }
        if (str2.length() <= 0) {
            if (u45Var.f63398e == null) {
                int i4 = u45Var.f63394a;
                downloadCollectionCourseUseCase$downloadLesson$1.f25603a = str;
                downloadCollectionCourseUseCase$downloadLesson$1.f25604b = u45Var;
                downloadCollectionCourseUseCase$downloadLesson$1.f25605c = str2;
                downloadCollectionCourseUseCase$downloadLesson$1.f25608f = 1;
                objM7991b = this.f25647d.m7991b(i4, str, downloadCollectionCourseUseCase$downloadLesson$1);
            }
            return coroutineSingletons;
        }
        str3 = str2;
        if (str3.length() > 0) {
            downloadItem = new DownloadItem(str, u45Var.f63394a, str3);
            downloadCollectionCourseUseCase$downloadLesson$1.f25603a = str;
            downloadCollectionCourseUseCase$downloadLesson$1.f25604b = u45Var;
            downloadCollectionCourseUseCase$downloadLesson$1.f25605c = str2;
            downloadCollectionCourseUseCase$downloadLesson$1.f25608f = 2;
            if (this.f25648e.mo8234r(downloadItem, downloadCollectionCourseUseCase$downloadLesson$1) != coroutineSingletons) {
                u45 u45Var3 = u45Var;
                str4 = str;
                u45Var2 = u45Var3;
                String str8 = str4;
                u45Var = u45Var2;
                str = str8;
                int i5 = u45Var.f63394a;
                downloadCollectionCourseUseCase$downloadLesson$1.f25603a = null;
                downloadCollectionCourseUseCase$downloadLesson$1.f25604b = null;
                downloadCollectionCourseUseCase$downloadLesson$1.f25605c = null;
                downloadCollectionCourseUseCase$downloadLesson$1.f25608f = 3;
                objM7286l = ((C1295k) this.f25646c.f45229a).m7286l(i5, str, downloadCollectionCourseUseCase$downloadLesson$1);
                if (objM7286l != coroutineSingletons) {
                    objM7286l = xfaVar;
                }
                if (objM7286l == coroutineSingletons) {
                    return xfaVar;
                }
            }
        } else {
            int i6 = u45Var.f63394a;
            downloadCollectionCourseUseCase$downloadLesson$1.f25603a = null;
            downloadCollectionCourseUseCase$downloadLesson$1.f25604b = null;
            downloadCollectionCourseUseCase$downloadLesson$1.f25605c = null;
            downloadCollectionCourseUseCase$downloadLesson$1.f25608f = 3;
            objM7286l = ((C1295k) this.f25646c.f45229a).m7286l(i6, str, downloadCollectionCourseUseCase$downloadLesson$1);
            if (objM7286l != coroutineSingletons) {
                objM7286l = xfaVar;
            }
            if (objM7286l == coroutineSingletons) {
                return xfaVar;
            }
        }
        return coroutineSingletons;
        str3 = (String) objM7991b;
        if (str3.length() > 0) {
            downloadItem = new DownloadItem(str, u45Var.f63394a, str3);
            downloadCollectionCourseUseCase$downloadLesson$1.f25603a = str;
            downloadCollectionCourseUseCase$downloadLesson$1.f25604b = u45Var;
            downloadCollectionCourseUseCase$downloadLesson$1.f25605c = str2;
            downloadCollectionCourseUseCase$downloadLesson$1.f25608f = 2;
            if (this.f25648e.mo8234r(downloadItem, downloadCollectionCourseUseCase$downloadLesson$1) != coroutineSingletons) {
                u45 u45Var4 = u45Var;
                str4 = str;
                u45Var2 = u45Var4;
                String str9 = str4;
                u45Var = u45Var2;
                str = str9;
                int i7 = u45Var.f63394a;
                downloadCollectionCourseUseCase$downloadLesson$1.f25603a = null;
                downloadCollectionCourseUseCase$downloadLesson$1.f25604b = null;
                downloadCollectionCourseUseCase$downloadLesson$1.f25605c = null;
                downloadCollectionCourseUseCase$downloadLesson$1.f25608f = 3;
                objM7286l = ((C1295k) this.f25646c.f45229a).m7286l(i7, str, downloadCollectionCourseUseCase$downloadLesson$1);
                if (objM7286l != coroutineSingletons) {
                    objM7286l = xfaVar;
                }
                if (objM7286l == coroutineSingletons) {
                    return xfaVar;
                }
            }
        } else {
            int i8 = u45Var.f63394a;
            downloadCollectionCourseUseCase$downloadLesson$1.f25603a = null;
            downloadCollectionCourseUseCase$downloadLesson$1.f25604b = null;
            downloadCollectionCourseUseCase$downloadLesson$1.f25605c = null;
            downloadCollectionCourseUseCase$downloadLesson$1.f25608f = 3;
            objM7286l = ((C1295k) this.f25646c.f45229a).m7286l(i8, str, downloadCollectionCourseUseCase$downloadLesson$1);
            if (objM7286l != coroutineSingletons) {
                objM7286l = xfaVar;
            }
            if (objM7286l == coroutineSingletons) {
                return xfaVar;
            }
        }
        return coroutineSingletons;
    }

    /* JADX INFO: renamed from: c */
    public final void m8959c(int i, String str) {
        str.getClass();
        Companion.getClass();
        String str2 = "collection-course-download " + str + " " + i;
        f25643h.compute(str2, new gj2(2, new C2036b(this, i, str, str2)));
    }
}
