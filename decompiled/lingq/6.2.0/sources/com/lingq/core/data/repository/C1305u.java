package com.lingq.core.data.repository;

import androidx.room.AbstractC0747e;
import com.lingq.core.database.LingQDatabase;
import com.lingq.core.database.dao.AbstractC1320h;
import com.lingq.core.database.dao.C1321i;
import com.lingq.core.domain.model.library.LibraryItemType;
import com.lingq.core.network.api.result.ResultLesson;
import com.lingq.core.network.api.result.ResultLibraryCounter;
import com.lingq.core.network.api.result.ResultLibraryItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.AbstractC3122is;
import p000.AbstractC3352my;
import p000.C3386nv;
import p000.ca5;
import p000.cr8;
import p000.io1;
import p000.k65;
import p000.lda;
import p000.np8;
import p000.o7b;
import p000.si7;
import p000.u85;
import p000.un0;
import p000.xfa;
import p000.ys8;
import p000.zo1;

/* JADX INFO: renamed from: com.lingq.core.data.repository.u */
/* JADX INFO: loaded from: classes2.dex */
public final class C1305u implements cr8 {

    /* JADX INFO: renamed from: a */
    public final LingQDatabase f16547a;

    /* JADX INFO: renamed from: b */
    public final np8 f16548b;

    /* JADX INFO: renamed from: c */
    public final AbstractC1320h f16549c;

    /* JADX INFO: renamed from: d */
    public final un0 f16550d;

    /* JADX INFO: renamed from: e */
    public final o7b f16551e;

    /* JADX INFO: renamed from: f */
    public final io1 f16552f;

    /* JADX INFO: renamed from: g */
    public final C1321i f16553g;

    /* JADX INFO: renamed from: h */
    public final si7 f16554h;

    /* JADX INFO: renamed from: i */
    public final k65 f16555i;

    /* JADX INFO: renamed from: j */
    public final zo1 f16556j;

    /* JADX INFO: renamed from: k */
    public final ys8 f16557k;

    /* JADX INFO: renamed from: l */
    public final ca5 f16558l;

    public C1305u(LingQDatabase lingQDatabase, np8 np8Var, AbstractC1320h abstractC1320h, un0 un0Var, o7b o7bVar, io1 io1Var, C1321i c1321i, si7 si7Var, k65 k65Var, zo1 zo1Var, ys8 ys8Var, ca5 ca5Var) {
        lingQDatabase.getClass();
        np8Var.getClass();
        abstractC1320h.getClass();
        un0Var.getClass();
        o7bVar.getClass();
        io1Var.getClass();
        c1321i.getClass();
        si7Var.getClass();
        k65Var.getClass();
        zo1Var.getClass();
        ys8Var.getClass();
        ca5Var.getClass();
        this.f16547a = lingQDatabase;
        this.f16548b = np8Var;
        this.f16549c = abstractC1320h;
        this.f16550d = un0Var;
        this.f16551e = o7bVar;
        this.f16552f = io1Var;
        this.f16553g = c1321i;
        this.f16554h = si7Var;
        this.f16555i = k65Var;
        this.f16556j = zo1Var;
        this.f16557k = ys8Var;
        this.f16558l = ca5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7370a(int i, String str, ContinuationImpl continuationImpl) throws Throwable {
        SearchRepositoryImpl$networkCourse$1 searchRepositoryImpl$networkCourse$1;
        if (continuationImpl instanceof SearchRepositoryImpl$networkCourse$1) {
            searchRepositoryImpl$networkCourse$1 = (SearchRepositoryImpl$networkCourse$1) continuationImpl;
            int i2 = searchRepositoryImpl$networkCourse$1.f16095d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                searchRepositoryImpl$networkCourse$1.f16095d = i2 - Integer.MIN_VALUE;
            } else {
                searchRepositoryImpl$networkCourse$1 = new SearchRepositoryImpl$networkCourse$1(this, continuationImpl);
            }
        } else {
            searchRepositoryImpl$networkCourse$1 = new SearchRepositoryImpl$networkCourse$1(this, continuationImpl);
        }
        Object objM25706a = searchRepositoryImpl$networkCourse$1.f16093b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = searchRepositoryImpl$networkCourse$1.f16095d;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM25706a);
            Integer num = new Integer(i);
            searchRepositoryImpl$networkCourse$1.f16092a = i;
            searchRepositoryImpl$networkCourse$1.f16095d = 1;
            objM25706a = this.f16556j.m25706a(str, num, searchRepositoryImpl$networkCourse$1);
            if (objM25706a != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            i = searchRepositoryImpl$networkCourse$1.f16092a;
            AbstractC3193b.m15359b(objM25706a);
        } else {
            if (i3 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM25706a);
        }
        lda.m16122h(((Number) objM25706a).longValue());
        return xfa.f68157a;
        ResultLibraryItem resultLibraryItem = (ResultLibraryItem) objM25706a;
        if (resultLibraryItem != null) {
            u85 u85VarM17121g0 = AbstractC3352my.m17121g0(resultLibraryItem, 0);
            searchRepositoryImpl$networkCourse$1.f16092a = i;
            searchRepositoryImpl$networkCourse$1.f16095d = 2;
            objM25706a = this.f16552f.mo4095v0(u85VarM17121g0, searchRepositoryImpl$networkCourse$1);
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
    
        if (r5.f16553g.m7508F0(r6, r0) == r1) goto L25;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7371b(String str, List list, ContinuationImpl continuationImpl) throws Throwable {
        SearchRepositoryImpl$networkCoursesCounters$1 searchRepositoryImpl$networkCoursesCounters$1;
        if (continuationImpl instanceof SearchRepositoryImpl$networkCoursesCounters$1) {
            searchRepositoryImpl$networkCoursesCounters$1 = (SearchRepositoryImpl$networkCoursesCounters$1) continuationImpl;
            int i = searchRepositoryImpl$networkCoursesCounters$1.f16098c;
            if ((i & Integer.MIN_VALUE) != 0) {
                searchRepositoryImpl$networkCoursesCounters$1.f16098c = i - Integer.MIN_VALUE;
            } else {
                searchRepositoryImpl$networkCoursesCounters$1 = new SearchRepositoryImpl$networkCoursesCounters$1(this, continuationImpl);
            }
        } else {
            searchRepositoryImpl$networkCoursesCounters$1 = new SearchRepositoryImpl$networkCoursesCounters$1(this, continuationImpl);
        }
        Object objM4469j = searchRepositoryImpl$networkCoursesCounters$1.f16096a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = searchRepositoryImpl$networkCoursesCounters$1.f16098c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM4469j);
            searchRepositoryImpl$networkCoursesCounters$1.f16098c = 1;
            objM4469j = this.f16558l.m4469j(str, list, searchRepositoryImpl$networkCoursesCounters$1);
            if (objM4469j != coroutineSingletons) {
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
        searchRepositoryImpl$networkCoursesCounters$1.f16098c = 2;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x01df  */
    /* JADX WARN: Code duplicated, block: B:70:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:72:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:75:0x03da  */
    /* JADX WARN: Code duplicated, block: B:78:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:81:0x0401  */
    /* JADX WARN: Code duplicated, block: B:85:0x0494  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x038e -> B:89:0x04cb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x0494 -> B:86:0x049e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x04b5 -> B:89:0x04cb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x04c3 -> B:89:0x04cb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: c */
    public final java.lang.Object m7372c(java.lang.String r102, java.lang.String r103, kotlin.coroutines.jvm.internal.ContinuationImpl r104) {
        /*
            Method dump skipped, instruction units count: 1608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.core.data.repository.C1305u.m7372c(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r5.m7508F0(r6, r0) == r1) goto L28;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7373d(String str, List list, ContinuationImpl continuationImpl) throws Throwable {
        SearchRepositoryImpl$networkLessonsCounters$1 searchRepositoryImpl$networkLessonsCounters$1;
        if (continuationImpl instanceof SearchRepositoryImpl$networkLessonsCounters$1) {
            searchRepositoryImpl$networkLessonsCounters$1 = (SearchRepositoryImpl$networkLessonsCounters$1) continuationImpl;
            int i = searchRepositoryImpl$networkLessonsCounters$1.f16115c;
            if ((i & Integer.MIN_VALUE) != 0) {
                searchRepositoryImpl$networkLessonsCounters$1.f16115c = i - Integer.MIN_VALUE;
            } else {
                searchRepositoryImpl$networkLessonsCounters$1 = new SearchRepositoryImpl$networkLessonsCounters$1(this, continuationImpl);
            }
        } else {
            searchRepositoryImpl$networkLessonsCounters$1 = new SearchRepositoryImpl$networkLessonsCounters$1(this, continuationImpl);
        }
        Object objM4463d = searchRepositoryImpl$networkLessonsCounters$1.f16113a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = searchRepositoryImpl$networkLessonsCounters$1.f16115c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(objM4463d);
                ca5 ca5Var = this.f16558l;
                searchRepositoryImpl$networkLessonsCounters$1.f16115c = 1;
                objM4463d = ca5Var.m4463d(str, list, searchRepositoryImpl$networkLessonsCounters$1);
                if (objM4463d == coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i2 == 1) {
                AbstractC3193b.m15359b(objM4463d);
            } else {
                if (i2 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objM4463d);
            }
            return xfa.f68157a;
            Map map = (Map) objM4463d;
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(AbstractC3122is.m14085D((ResultLibraryCounter) entry.getValue(), ((Number) entry.getKey()).intValue(), LibraryItemType.Content.getValue()));
            }
            C1321i c1321i = this.f16553g;
            searchRepositoryImpl$networkLessonsCounters$1.f16115c = 2;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0078  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0078 -> B:30:0x007b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: e */
    public final java.lang.Object m7374e(java.lang.String r10, java.util.List r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.lingq.core.data.repository.SearchRepositoryImpl$networkLoadCourses$1
            if (r0 == 0) goto L13
            r0 = r12
            com.lingq.core.data.repository.SearchRepositoryImpl$networkLoadCourses$1 r0 = (com.lingq.core.data.repository.SearchRepositoryImpl$networkLoadCourses$1) r0
            int r1 = r0.f16122g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16122g = r1
            goto L18
        L13:
            com.lingq.core.data.repository.SearchRepositoryImpl$networkLoadCourses$1 r0 = new com.lingq.core.data.repository.SearchRepositoryImpl$networkLoadCourses$1
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f16120e
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f16122g
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L46
            if (r2 == r4) goto L36
            if (r2 != r3) goto L30
            java.util.List r9 = r0.f16117b
            java.util.List r9 = (java.util.List) r9
            kotlin.AbstractC3193b.m15359b(r12)     // Catch: java.lang.Exception -> L98
            goto L9c
        L30:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r9)
            return r5
        L36:
            int r10 = r0.f16119d
            java.util.Iterator r11 = r0.f16118c
            java.util.List r2 = r0.f16117b
            java.util.List r2 = (java.util.List) r2
            java.lang.String r6 = r0.f16116a
            kotlin.AbstractC3193b.m15359b(r12)     // Catch: java.lang.Exception -> L44
            goto L7b
        L44:
            r12 = move-exception
            goto L85
        L46:
            kotlin.AbstractC3193b.m15359b(r12)
            r12 = r11
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r12 = r12.iterator()
            r2 = 0
            r8 = r12
            r12 = r11
            r11 = r8
        L54:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto L89
            java.lang.Object r6 = r11.next()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r0.f16116a = r10     // Catch: java.lang.Exception -> L7f
            r7 = r12
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Exception -> L7f
            r0.f16117b = r7     // Catch: java.lang.Exception -> L7f
            r0.f16118c = r11     // Catch: java.lang.Exception -> L7f
            r0.f16119d = r2     // Catch: java.lang.Exception -> L7f
            r0.f16122g = r4     // Catch: java.lang.Exception -> L7f
            java.lang.Object r6 = r9.m7370a(r6, r10, r0)     // Catch: java.lang.Exception -> L7f
            if (r6 != r1) goto L78
            goto L97
        L78:
            r6 = r10
            r10 = r2
            r2 = r12
        L7b:
            r12 = r2
            r2 = r10
            r10 = r6
            goto L54
        L7f:
            r6 = move-exception
            r8 = r6
            r6 = r10
            r10 = r2
            r2 = r12
            r12 = r8
        L85:
            r12.printStackTrace()
            goto L7b
        L89:
            r0.f16116a = r5     // Catch: java.lang.Exception -> L98
            r0.f16117b = r5     // Catch: java.lang.Exception -> L98
            r0.f16118c = r5     // Catch: java.lang.Exception -> L98
            r0.f16122g = r3     // Catch: java.lang.Exception -> L98
            java.lang.Object r9 = r9.m7371b(r10, r12, r0)     // Catch: java.lang.Exception -> L98
            if (r9 != r1) goto L9c
        L97:
            return r1
        L98:
            r9 = move-exception
            r9.printStackTrace()
        L9c:
            xfa r9 = p000.xfa.f68157a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.core.data.repository.C1305u.m7374e(java.lang.String, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m7375f(int i, String str, ContinuationImpl continuationImpl) throws Throwable {
        SearchRepositoryImpl$networkLoadLesson$1 searchRepositoryImpl$networkLoadLesson$1;
        if (continuationImpl instanceof SearchRepositoryImpl$networkLoadLesson$1) {
            searchRepositoryImpl$networkLoadLesson$1 = (SearchRepositoryImpl$networkLoadLesson$1) continuationImpl;
            int i2 = searchRepositoryImpl$networkLoadLesson$1.f16127e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                searchRepositoryImpl$networkLoadLesson$1.f16127e = i2 - Integer.MIN_VALUE;
            } else {
                searchRepositoryImpl$networkLoadLesson$1 = new SearchRepositoryImpl$networkLoadLesson$1(this, continuationImpl);
            }
        } else {
            searchRepositoryImpl$networkLoadLesson$1 = new SearchRepositoryImpl$networkLoadLesson$1(this, continuationImpl);
        }
        Object objM14908p = searchRepositoryImpl$networkLoadLesson$1.f16125c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = searchRepositoryImpl$networkLoadLesson$1.f16127e;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM14908p);
            Integer num = new Integer(i);
            searchRepositoryImpl$networkLoadLesson$1.f16123a = str;
            searchRepositoryImpl$networkLoadLesson$1.f16124b = i;
            searchRepositoryImpl$networkLoadLesson$1.f16127e = 1;
            objM14908p = this.f16555i.m14908p(str, num, true, searchRepositoryImpl$networkLoadLesson$1);
            if (objM14908p != coroutineSingletons) {
            }
        }
        if (i3 != 1) {
            if (i3 == 2) {
                AbstractC3193b.m15359b(objM14908p);
                return objM14908p;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = searchRepositoryImpl$networkLoadLesson$1.f16124b;
        str = searchRepositoryImpl$networkLoadLesson$1.f16123a;
        AbstractC3193b.m15359b(objM14908p);
        int i4 = i;
        SearchRepositoryImpl$networkLoadLesson$2 searchRepositoryImpl$networkLoadLesson$2 = new SearchRepositoryImpl$networkLoadLesson$2((ResultLesson) objM14908p, this, str, i4, null);
        searchRepositoryImpl$networkLoadLesson$1.f16123a = null;
        searchRepositoryImpl$networkLoadLesson$1.f16124b = i4;
        searchRepositoryImpl$networkLoadLesson$1.f16127e = 2;
        Object objM2849b = AbstractC0747e.m2849b(this.f16547a, searchRepositoryImpl$networkLoadLesson$2, searchRepositoryImpl$networkLoadLesson$1);
        return objM2849b == coroutineSingletons ? coroutineSingletons : objM2849b;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0078  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0078 -> B:30:0x007b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: g */
    public final java.lang.Object m7376g(java.lang.String r10, java.util.List r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.lingq.core.data.repository.SearchRepositoryImpl$networkLoadLessons$1
            if (r0 == 0) goto L13
            r0 = r12
            com.lingq.core.data.repository.SearchRepositoryImpl$networkLoadLessons$1 r0 = (com.lingq.core.data.repository.SearchRepositoryImpl$networkLoadLessons$1) r0
            int r1 = r0.f16142g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16142g = r1
            goto L18
        L13:
            com.lingq.core.data.repository.SearchRepositoryImpl$networkLoadLessons$1 r0 = new com.lingq.core.data.repository.SearchRepositoryImpl$networkLoadLessons$1
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f16140e
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f16142g
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L46
            if (r2 == r4) goto L36
            if (r2 != r3) goto L30
            java.util.List r9 = r0.f16137b
            java.util.List r9 = (java.util.List) r9
            kotlin.AbstractC3193b.m15359b(r12)     // Catch: java.lang.Exception -> L98
            goto L9c
        L30:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r9)
            return r5
        L36:
            int r10 = r0.f16139d
            java.util.Iterator r11 = r0.f16138c
            java.util.List r2 = r0.f16137b
            java.util.List r2 = (java.util.List) r2
            java.lang.String r6 = r0.f16136a
            kotlin.AbstractC3193b.m15359b(r12)     // Catch: java.lang.Exception -> L44
            goto L7b
        L44:
            r12 = move-exception
            goto L85
        L46:
            kotlin.AbstractC3193b.m15359b(r12)
            r12 = r11
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r12 = r12.iterator()
            r2 = 0
            r8 = r12
            r12 = r11
            r11 = r8
        L54:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto L89
            java.lang.Object r6 = r11.next()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r0.f16136a = r10     // Catch: java.lang.Exception -> L7f
            r7 = r12
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Exception -> L7f
            r0.f16137b = r7     // Catch: java.lang.Exception -> L7f
            r0.f16138c = r11     // Catch: java.lang.Exception -> L7f
            r0.f16139d = r2     // Catch: java.lang.Exception -> L7f
            r0.f16142g = r4     // Catch: java.lang.Exception -> L7f
            java.lang.Object r6 = r9.m7375f(r6, r10, r0)     // Catch: java.lang.Exception -> L7f
            if (r6 != r1) goto L78
            goto L97
        L78:
            r6 = r10
            r10 = r2
            r2 = r12
        L7b:
            r12 = r2
            r2 = r10
            r10 = r6
            goto L54
        L7f:
            r6 = move-exception
            r8 = r6
            r6 = r10
            r10 = r2
            r2 = r12
            r12 = r8
        L85:
            r12.printStackTrace()
            goto L7b
        L89:
            r0.f16136a = r5     // Catch: java.lang.Exception -> L98
            r0.f16137b = r5     // Catch: java.lang.Exception -> L98
            r0.f16138c = r5     // Catch: java.lang.Exception -> L98
            r0.f16142g = r3     // Catch: java.lang.Exception -> L98
            java.lang.Object r9 = r9.m7373d(r10, r12, r0)     // Catch: java.lang.Exception -> L98
            if (r9 != r1) goto L9c
        L97:
            return r1
        L98:
            r9 = move-exception
            r9.printStackTrace()
        L9c:
            xfa r9 = p000.xfa.f68157a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.core.data.repository.C1305u.m7376g(java.lang.String, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
