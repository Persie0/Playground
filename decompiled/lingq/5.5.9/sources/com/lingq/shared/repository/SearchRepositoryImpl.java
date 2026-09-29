package com.lingq.shared.repository;

import ae.C0062b;
import androidx.room.RoomDatabaseKt;
import bi.AbstractC1388a;
import bi.AbstractC1402b5;
import bi.AbstractC1413d0;
import bi.AbstractC1454i2;
import bi.AbstractC1495o1;
import bi.AbstractC1562x5;
import ci.InterfaceC2022o;
import com.lingq.entity.LibraryData;
import com.lingq.shared.network.result.ResultLesson;
import com.lingq.shared.network.result.ResultLibraryCounter;
import com.lingq.shared.network.result.ResultLibraryItem;
import com.lingq.shared.persistent.LingQDatabase;
import com.lingq.shared.uimodel.library.FastSearchData;
import com.lingq.shared.uimodel.library.LibraryItemCounter;
import com.lingq.shared.uimodel.library.LibraryItemType;
import dm.C5206f;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.InterfaceC7116c;
import p181ii.C6332a;
import p260m8.C7499b;
import p338qd.C8573r0;
import p460wh.InterfaceC9935c;
import p460wh.InterfaceC9938f;
import p460wh.InterfaceC9939g;
import p460wh.InterfaceC9947o;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class SearchRepositoryImpl implements InterfaceC2022o {

    /* JADX INFO: renamed from: a */
    public final LingQDatabase f20478a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1402b5 f20479b;

    /* JADX INFO: renamed from: c */
    public final AbstractC1495o1 f20480c;

    /* JADX INFO: renamed from: d */
    public final AbstractC1388a f20481d;

    /* JADX INFO: renamed from: e */
    public final AbstractC1562x5 f20482e;

    /* JADX INFO: renamed from: f */
    public final AbstractC1413d0 f20483f;

    /* JADX INFO: renamed from: g */
    public final AbstractC1454i2 f20484g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC9938f f20485h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC9935c f20486i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC9947o f20487j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC9939g f20488k;

    public SearchRepositoryImpl(LingQDatabase lingQDatabase, AbstractC1402b5 abstractC1402b5, AbstractC1495o1 abstractC1495o1, AbstractC1388a abstractC1388a, AbstractC1562x5 abstractC1562x5, AbstractC1413d0 abstractC1413d0, AbstractC1454i2 abstractC1454i2, InterfaceC9938f interfaceC9938f, InterfaceC9935c interfaceC9935c, InterfaceC9947o interfaceC9947o, InterfaceC9939g interfaceC9939g) {
        C5207g.m11111f(lingQDatabase, "db");
        C5207g.m11111f(abstractC1402b5, "searchDao");
        C5207g.m11111f(abstractC1495o1, "lessonDao");
        C5207g.m11111f(abstractC1388a, "cardDao");
        C5207g.m11111f(abstractC1562x5, "wordDao");
        C5207g.m11111f(abstractC1413d0, "courseDao");
        C5207g.m11111f(abstractC1454i2, "libraryDao");
        C5207g.m11111f(interfaceC9938f, "lessonService");
        C5207g.m11111f(interfaceC9935c, "courseService");
        C5207g.m11111f(interfaceC9947o, "searchService");
        C5207g.m11111f(interfaceC9939g, "libraryService");
        this.f20478a = lingQDatabase;
        this.f20479b = abstractC1402b5;
        this.f20480c = abstractC1495o1;
        this.f20481d = abstractC1388a;
        this.f20482e = abstractC1562x5;
        this.f20483f = abstractC1413d0;
        this.f20484g = abstractC1454i2;
        this.f20485h = interfaceC9938f;
        this.f20486i = interfaceC9935c;
        this.f20487j = interfaceC9947o;
        this.f20488k = interfaceC9939g;
    }

    @Override // ci.InterfaceC2022o
    /* JADX INFO: renamed from: a */
    public final InterfaceC7116c<List<C6332a>> mo6156a(String str, String str2) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(str2, "query");
        return C0062b.m273H0(this.f20479b.mo4985k0(str, str2));
    }

    @Override // ci.InterfaceC2022o
    /* JADX INFO: renamed from: b */
    public final InterfaceC7116c<List<FastSearchData>> mo6157b(String str, String str2) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(str2, "query");
        return C0062b.m273H0(this.f20479b.mo4986l0(str, str2));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x013e  */
    /* JADX WARN: Code duplicated, block: B:31:0x015b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0179 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x017a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0186  */
    /* JADX WARN: Code duplicated, block: B:39:0x0194  */
    /* JADX WARN: Code duplicated, block: B:40:0x0197  */
    /* JADX WARN: Code duplicated, block: B:43:0x02b2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:45:0x02bd A[PHI: r4 r5 r6 r7 r8 r12 r13 r14
      0x02bd: PHI (r4v18 java.util.Iterator) = 
      (r4v9 java.util.Iterator)
      (r4v11 java.util.Iterator)
      (r4v12 java.util.Iterator)
      (r4v12 java.util.Iterator)
      (r4v20 java.util.Iterator)
     binds: [B:86:0x02bd, B:53:0x02f5, B:36:0x0184, B:44:0x02b3, B:61:0x03ab] A[DONT_GENERATE, DONT_INLINE]
      0x02bd: PHI (r5v14 java.util.List) = (r5v6 java.util.List), (r5v8 java.util.List), (r5v9 java.util.List), (r5v9 java.util.List), (r5v16 java.util.List) binds: [B:86:0x02bd, B:53:0x02f5, B:36:0x0184, B:44:0x02b3, B:61:0x03ab] A[DONT_GENERATE, DONT_INLINE]
      0x02bd: PHI (r6v12 java.util.List) = (r6v6 java.util.List), (r6v8 java.util.List), (r6v9 java.util.List), (r6v9 java.util.List), (r6v13 java.util.List) binds: [B:86:0x02bd, B:53:0x02f5, B:36:0x0184, B:44:0x02b3, B:61:0x03ab] A[DONT_GENERATE, DONT_INLINE]
      0x02bd: PHI (r7v12 java.util.List) = (r7v4 java.util.List), (r7v6 java.util.List), (r7v7 java.util.List), (r7v7 java.util.List), (r7v14 java.util.List) binds: [B:86:0x02bd, B:53:0x02f5, B:36:0x0184, B:44:0x02b3, B:61:0x03ab] A[DONT_GENERATE, DONT_INLINE]
      0x02bd: PHI (r8v28 com.lingq.shared.network.result.ResultFastSearch) = 
      (r8v10 com.lingq.shared.network.result.ResultFastSearch)
      (r8v12 com.lingq.shared.network.result.ResultFastSearch)
      (r8v13 com.lingq.shared.network.result.ResultFastSearch)
      (r8v13 com.lingq.shared.network.result.ResultFastSearch)
      (r8v30 com.lingq.shared.network.result.ResultFastSearch)
     binds: [B:86:0x02bd, B:53:0x02f5, B:36:0x0184, B:44:0x02b3, B:61:0x03ab] A[DONT_GENERATE, DONT_INLINE]
      0x02bd: PHI (r12v13 java.lang.String) = 
      (r12v6 java.lang.String)
      (r12v9 java.lang.String)
      (r12v10 java.lang.String)
      (r12v10 java.lang.String)
      (r12v14 java.lang.String)
     binds: [B:86:0x02bd, B:53:0x02f5, B:36:0x0184, B:44:0x02b3, B:61:0x03ab] A[DONT_GENERATE, DONT_INLINE]
      0x02bd: PHI (r13v30 java.lang.String) = 
      (r13v3 java.lang.String)
      (r13v6 java.lang.String)
      (r13v7 java.lang.String)
      (r13v7 java.lang.String)
      (r13v31 java.lang.String)
     binds: [B:86:0x02bd, B:53:0x02f5, B:36:0x0184, B:44:0x02b3, B:61:0x03ab] A[DONT_GENERATE, DONT_INLINE]
      0x02bd: PHI (r14v23 com.lingq.shared.repository.SearchRepositoryImpl) = 
      (r14v3 com.lingq.shared.repository.SearchRepositoryImpl)
      (r14v6 com.lingq.shared.repository.SearchRepositoryImpl)
      (r14v7 com.lingq.shared.repository.SearchRepositoryImpl)
      (r14v7 com.lingq.shared.repository.SearchRepositoryImpl)
      (r14v24 com.lingq.shared.repository.SearchRepositoryImpl)
     binds: [B:86:0x02bd, B:53:0x02f5, B:36:0x0184, B:44:0x02b3, B:61:0x03ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:48:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:50:0x02ea A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:54:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:57:0x0305  */
    /* JADX WARN: Code duplicated, block: B:60:0x03aa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0184 -> B:45:0x02bd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x02ca -> B:63:0x03bc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x02f5 -> B:45:0x02bd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x03a8 -> B:61:0x03ab). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:51:0x02eb
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // ci.InterfaceC2022o
    /* JADX INFO: renamed from: c */
    public final java.io.Serializable mo6158c(java.lang.String r103, java.lang.String r104, p464wl.InterfaceC9968c r105) {
        /*
            Method dump skipped, instruction units count: 1292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.shared.repository.SearchRepositoryImpl.mo6158c(java.lang.String, java.lang.String, wl.c):java.io.Serializable");
    }

    @Override // ci.InterfaceC2022o
    /* JADX INFO: renamed from: d */
    public final InterfaceC7116c<List<LibraryItemCounter>> mo6159d(String str, String str2) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(str2, "query");
        return C0062b.m273H0(this.f20479b.mo4987m0(str, str2));
    }

    @Override // ci.InterfaceC2022o
    /* JADX INFO: renamed from: e */
    public final InterfaceC7116c<List<C6332a>> mo6160e(String str, String str2) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(str2, "query");
        return C0062b.m273H0(this.f20479b.mo4988n0(str, str2));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:25|40|26|(2:49|28)(1:51)|23) */
    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:? A[LOOP:0: B:23:0x0061->B:51:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0084, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0085, code lost:
    
        r2 = r12;
        r12 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
    
        r2.printStackTrace();
     */
    @Override // ci.InterfaceC2022o
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo6161f(String str, List<Integer> list, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        SearchRepositoryImpl$networkLoadLessons$1 searchRepositoryImpl$networkLoadLessons$1;
        SearchRepositoryImpl searchRepositoryImpl;
        String str2;
        Iterator it;
        List<Integer> list2;
        int iIntValue;
        if (interfaceC9968c instanceof SearchRepositoryImpl$networkLoadLessons$1) {
            searchRepositoryImpl$networkLoadLessons$1 = (SearchRepositoryImpl$networkLoadLessons$1) interfaceC9968c;
            int i10 = searchRepositoryImpl$networkLoadLessons$1.f20540j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                searchRepositoryImpl$networkLoadLessons$1.f20540j = i10 - Integer.MIN_VALUE;
            } else {
                searchRepositoryImpl$networkLoadLessons$1 = new SearchRepositoryImpl$networkLoadLessons$1(this, interfaceC9968c);
            }
        } else {
            searchRepositoryImpl$networkLoadLessons$1 = new SearchRepositoryImpl$networkLoadLessons$1(this, interfaceC9968c);
        }
        Object obj = searchRepositoryImpl$networkLoadLessons$1.f20538h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = searchRepositoryImpl$networkLoadLessons$1.f20540j;
        try {
            if (i11 == 0) {
                C7499b.m14977z0(obj);
                Iterator it2 = list.iterator();
                searchRepositoryImpl = this;
                str2 = str;
                it = it2;
                list2 = list;
                while (it.hasNext()) {
                    iIntValue = ((Number) it.next()).intValue();
                    searchRepositoryImpl$networkLoadLessons$1.f20534d = searchRepositoryImpl;
                    searchRepositoryImpl$networkLoadLessons$1.f20535e = str2;
                    searchRepositoryImpl$networkLoadLessons$1.f20536f = list2;
                    searchRepositoryImpl$networkLoadLessons$1.f20537g = it;
                    searchRepositoryImpl$networkLoadLessons$1.f20540j = 1;
                    if (searchRepositoryImpl.m9548k(iIntValue, str2, searchRepositoryImpl$networkLoadLessons$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                searchRepositoryImpl$networkLoadLessons$1.f20534d = null;
                searchRepositoryImpl$networkLoadLessons$1.f20535e = null;
                searchRepositoryImpl$networkLoadLessons$1.f20536f = null;
                searchRepositoryImpl$networkLoadLessons$1.f20537g = null;
                searchRepositoryImpl$networkLoadLessons$1.f20540j = 2;
                if (searchRepositoryImpl.m9547j(str2, list2, searchRepositoryImpl$networkLoadLessons$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i11 == 1) {
                it = searchRepositoryImpl$networkLoadLessons$1.f20537g;
                List<Integer> list3 = searchRepositoryImpl$networkLoadLessons$1.f20536f;
                String str3 = searchRepositoryImpl$networkLoadLessons$1.f20535e;
                searchRepositoryImpl = searchRepositoryImpl$networkLoadLessons$1.f20534d;
                try {
                    C7499b.m14977z0(obj);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                list2 = list3;
                str2 = str3;
                while (it.hasNext()) {
                    iIntValue = ((Number) it.next()).intValue();
                    searchRepositoryImpl$networkLoadLessons$1.f20534d = searchRepositoryImpl;
                    searchRepositoryImpl$networkLoadLessons$1.f20535e = str2;
                    searchRepositoryImpl$networkLoadLessons$1.f20536f = list2;
                    searchRepositoryImpl$networkLoadLessons$1.f20537g = it;
                    searchRepositoryImpl$networkLoadLessons$1.f20540j = 1;
                    if (searchRepositoryImpl.m9548k(iIntValue, str2, searchRepositoryImpl$networkLoadLessons$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                searchRepositoryImpl$networkLoadLessons$1.f20534d = null;
                searchRepositoryImpl$networkLoadLessons$1.f20535e = null;
                searchRepositoryImpl$networkLoadLessons$1.f20536f = null;
                searchRepositoryImpl$networkLoadLessons$1.f20537g = null;
                searchRepositoryImpl$networkLoadLessons$1.f20540j = 2;
                if (searchRepositoryImpl.m9547j(str2, list2, searchRepositoryImpl$networkLoadLessons$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:24|42|25|(2:48|27)(1:50)|22) */
    /* JADX WARN: Code duplicated, block: B:24:0x0068  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:? A[LOOP:0: B:22:0x0062->B:50:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0088, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0089, code lost:
    
        r2 = r13;
        r13 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008d, code lost:
    
        r2.printStackTrace();
     */
    @Override // ci.InterfaceC2022o
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo6162g(String str, List<Integer> list, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        SearchRepositoryImpl$networkLoadCourses$1 searchRepositoryImpl$networkLoadCourses$1;
        SearchRepositoryImpl searchRepositoryImpl;
        String str2;
        Iterator it;
        List<Integer> list2;
        int iIntValue;
        if (interfaceC9968c instanceof SearchRepositoryImpl$networkLoadCourses$1) {
            searchRepositoryImpl$networkLoadCourses$1 = (SearchRepositoryImpl$networkLoadCourses$1) interfaceC9968c;
            int i10 = searchRepositoryImpl$networkLoadCourses$1.f20520j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                searchRepositoryImpl$networkLoadCourses$1.f20520j = i10 - Integer.MIN_VALUE;
            } else {
                searchRepositoryImpl$networkLoadCourses$1 = new SearchRepositoryImpl$networkLoadCourses$1(this, interfaceC9968c);
            }
        } else {
            searchRepositoryImpl$networkLoadCourses$1 = new SearchRepositoryImpl$networkLoadCourses$1(this, interfaceC9968c);
        }
        Object obj = searchRepositoryImpl$networkLoadCourses$1.f20518h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = searchRepositoryImpl$networkLoadCourses$1.f20520j;
        try {
            if (i11 == 0) {
                C7499b.m14977z0(obj);
                Iterator it2 = list.iterator();
                searchRepositoryImpl = this;
                str2 = str;
                it = it2;
                list2 = list;
                while (it.hasNext()) {
                    iIntValue = ((Number) it.next()).intValue();
                    searchRepositoryImpl$networkLoadCourses$1.f20514d = searchRepositoryImpl;
                    searchRepositoryImpl$networkLoadCourses$1.f20515e = str2;
                    searchRepositoryImpl$networkLoadCourses$1.f20516f = list2;
                    searchRepositoryImpl$networkLoadCourses$1.f20517g = it;
                    searchRepositoryImpl$networkLoadCourses$1.f20520j = 1;
                    if (searchRepositoryImpl.m9545h(iIntValue, str2, searchRepositoryImpl$networkLoadCourses$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                searchRepositoryImpl$networkLoadCourses$1.f20514d = null;
                searchRepositoryImpl$networkLoadCourses$1.f20515e = null;
                searchRepositoryImpl$networkLoadCourses$1.f20516f = null;
                searchRepositoryImpl$networkLoadCourses$1.f20517g = null;
                searchRepositoryImpl$networkLoadCourses$1.f20520j = 2;
                if (searchRepositoryImpl.m9546i(str2, list2, searchRepositoryImpl$networkLoadCourses$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i11 == 1) {
                it = searchRepositoryImpl$networkLoadCourses$1.f20517g;
                List<Integer> list3 = searchRepositoryImpl$networkLoadCourses$1.f20516f;
                String str3 = searchRepositoryImpl$networkLoadCourses$1.f20515e;
                searchRepositoryImpl = searchRepositoryImpl$networkLoadCourses$1.f20514d;
                try {
                    C7499b.m14977z0(obj);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                list2 = list3;
                str2 = str3;
                while (it.hasNext()) {
                    iIntValue = ((Number) it.next()).intValue();
                    searchRepositoryImpl$networkLoadCourses$1.f20514d = searchRepositoryImpl;
                    searchRepositoryImpl$networkLoadCourses$1.f20515e = str2;
                    searchRepositoryImpl$networkLoadCourses$1.f20516f = list2;
                    searchRepositoryImpl$networkLoadCourses$1.f20517g = it;
                    searchRepositoryImpl$networkLoadCourses$1.f20520j = 1;
                    if (searchRepositoryImpl.m9545h(iIntValue, str2, searchRepositoryImpl$networkLoadCourses$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                searchRepositoryImpl$networkLoadCourses$1.f20514d = null;
                searchRepositoryImpl$networkLoadCourses$1.f20515e = null;
                searchRepositoryImpl$networkLoadCourses$1.f20516f = null;
                searchRepositoryImpl$networkLoadCourses$1.f20517g = null;
                searchRepositoryImpl$networkLoadCourses$1.f20520j = 2;
                if (searchRepositoryImpl.m9546i(str2, list2, searchRepositoryImpl$networkLoadCourses$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: h */
    public final Object m9545h(int i10, String str, InterfaceC9968c interfaceC9968c) throws Throwable {
        SearchRepositoryImpl$networkCourse$1 searchRepositoryImpl$networkCourse$1;
        SearchRepositoryImpl searchRepositoryImpl;
        if (interfaceC9968c instanceof SearchRepositoryImpl$networkCourse$1) {
            searchRepositoryImpl$networkCourse$1 = (SearchRepositoryImpl$networkCourse$1) interfaceC9968c;
            int i11 = searchRepositoryImpl$networkCourse$1.f20492g;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                searchRepositoryImpl$networkCourse$1.f20492g = i11 - Integer.MIN_VALUE;
            } else {
                searchRepositoryImpl$networkCourse$1 = new SearchRepositoryImpl$networkCourse$1(this, interfaceC9968c);
            }
        } else {
            searchRepositoryImpl$networkCourse$1 = new SearchRepositoryImpl$networkCourse$1(this, interfaceC9968c);
        }
        Object objM18432a = searchRepositoryImpl$networkCourse$1.f20490e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = searchRepositoryImpl$networkCourse$1.f20492g;
        if (i12 != 0) {
            if (i12 == 1) {
                searchRepositoryImpl = searchRepositoryImpl$networkCourse$1.f20489d;
                C7499b.m14977z0(objM18432a);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objM18432a);
            }
            C5206f.m11026v0(((Number) objM18432a).longValue());
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objM18432a);
        Integer num = new Integer(i10);
        searchRepositoryImpl$networkCourse$1.f20489d = this;
        searchRepositoryImpl$networkCourse$1.f20492g = 1;
        objM18432a = this.f20486i.m18432a(str, num, searchRepositoryImpl$networkCourse$1);
        if (objM18432a == coroutineSingletons) {
            return coroutineSingletons;
        }
        searchRepositoryImpl = this;
        ResultLibraryItem resultLibraryItem = (ResultLibraryItem) objM18432a;
        if (resultLibraryItem != null) {
            LibraryData libraryDataM294O = C0062b.m294O(resultLibraryItem);
            AbstractC1413d0 abstractC1413d0 = searchRepositoryImpl.f20483f;
            searchRepositoryImpl$networkCourse$1.f20489d = null;
            searchRepositoryImpl$networkCourse$1.f20492g = 2;
            objM18432a = abstractC1413d0.mo598h0(libraryDataM294O, searchRepositoryImpl$networkCourse$1);
            if (objM18432a == coroutineSingletons) {
                return coroutineSingletons;
            }
            C5206f.m11026v0(((Number) objM18432a).longValue());
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: i */
    public final Object m9546i(String str, List<Integer> list, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        SearchRepositoryImpl$networkCoursesCounters$1 searchRepositoryImpl$networkCoursesCounters$1;
        SearchRepositoryImpl searchRepositoryImpl;
        if (interfaceC9968c instanceof SearchRepositoryImpl$networkCoursesCounters$1) {
            searchRepositoryImpl$networkCoursesCounters$1 = (SearchRepositoryImpl$networkCoursesCounters$1) interfaceC9968c;
            int i10 = searchRepositoryImpl$networkCoursesCounters$1.f20496g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                searchRepositoryImpl$networkCoursesCounters$1.f20496g = i10 - Integer.MIN_VALUE;
            } else {
                searchRepositoryImpl$networkCoursesCounters$1 = new SearchRepositoryImpl$networkCoursesCounters$1(this, interfaceC9968c);
            }
        } else {
            searchRepositoryImpl$networkCoursesCounters$1 = new SearchRepositoryImpl$networkCoursesCounters$1(this, interfaceC9968c);
        }
        Object objM18485g = searchRepositoryImpl$networkCoursesCounters$1.f20494e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = searchRepositoryImpl$networkCoursesCounters$1.f20496g;
        if (i11 != 0) {
            if (i11 == 1) {
                searchRepositoryImpl = searchRepositoryImpl$networkCoursesCounters$1.f20493d;
                C7499b.m14977z0(objM18485g);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objM18485g);
            }
        }
        C7499b.m14977z0(objM18485g);
        searchRepositoryImpl$networkCoursesCounters$1.f20493d = this;
        searchRepositoryImpl$networkCoursesCounters$1.f20496g = 1;
        objM18485g = this.f20488k.m18485g(str, list, searchRepositoryImpl$networkCoursesCounters$1);
        if (objM18485g == coroutineSingletons) {
            return coroutineSingletons;
        }
        searchRepositoryImpl = this;
        Map map = (Map) objM18485g;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(C8573r0.m16715b0((ResultLibraryCounter) entry.getValue(), ((Number) entry.getKey()).intValue(), LibraryItemType.Collection.getValue()));
        }
        AbstractC1454i2 abstractC1454i2 = searchRepositoryImpl.f20484g;
        searchRepositoryImpl$networkCoursesCounters$1.f20493d = null;
        searchRepositoryImpl$networkCoursesCounters$1.f20496g = 2;
        return abstractC1454i2.mo5054E0(arrayList, searchRepositoryImpl$networkCoursesCounters$1) == coroutineSingletons ? coroutineSingletons : C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: j */
    public final Object m9547j(String str, List<Integer> list, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        SearchRepositoryImpl$networkLessonsCounters$1 searchRepositoryImpl$networkLessonsCounters$1;
        SearchRepositoryImpl searchRepositoryImpl;
        if (interfaceC9968c instanceof SearchRepositoryImpl$networkLessonsCounters$1) {
            searchRepositoryImpl$networkLessonsCounters$1 = (SearchRepositoryImpl$networkLessonsCounters$1) interfaceC9968c;
            int i10 = searchRepositoryImpl$networkLessonsCounters$1.f20513g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                searchRepositoryImpl$networkLessonsCounters$1.f20513g = i10 - Integer.MIN_VALUE;
            } else {
                searchRepositoryImpl$networkLessonsCounters$1 = new SearchRepositoryImpl$networkLessonsCounters$1(this, interfaceC9968c);
            }
        } else {
            searchRepositoryImpl$networkLessonsCounters$1 = new SearchRepositoryImpl$networkLessonsCounters$1(this, interfaceC9968c);
        }
        Object objM18480b = searchRepositoryImpl$networkLessonsCounters$1.f20511e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = searchRepositoryImpl$networkLessonsCounters$1.f20513g;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    searchRepositoryImpl = searchRepositoryImpl$networkLessonsCounters$1.f20510d;
                    C7499b.m14977z0(objM18480b);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(objM18480b);
                }
                return C9072e.f47360a;
            }
            C7499b.m14977z0(objM18480b);
            InterfaceC9939g interfaceC9939g = this.f20488k;
            searchRepositoryImpl$networkLessonsCounters$1.f20510d = this;
            searchRepositoryImpl$networkLessonsCounters$1.f20513g = 1;
            objM18480b = interfaceC9939g.m18480b(str, list, searchRepositoryImpl$networkLessonsCounters$1);
            if (objM18480b == coroutineSingletons) {
                return coroutineSingletons;
            }
            searchRepositoryImpl = this;
            Map map = (Map) objM18480b;
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(C8573r0.m16715b0((ResultLibraryCounter) entry.getValue(), ((Number) entry.getKey()).intValue(), LibraryItemType.Content.getValue()));
            }
            AbstractC1454i2 abstractC1454i2 = searchRepositoryImpl.f20484g;
            searchRepositoryImpl$networkLessonsCounters$1.f20510d = null;
            searchRepositoryImpl$networkLessonsCounters$1.f20513g = 2;
            if (abstractC1454i2.mo5054E0(arrayList, searchRepositoryImpl$networkLessonsCounters$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: k */
    public final Object m9548k(int i10, String str, InterfaceC9968c interfaceC9968c) throws Throwable {
        SearchRepositoryImpl$networkLoadLesson$1 searchRepositoryImpl$networkLoadLesson$1;
        SearchRepositoryImpl searchRepositoryImpl;
        int i11;
        String str2;
        if (interfaceC9968c instanceof SearchRepositoryImpl$networkLoadLesson$1) {
            searchRepositoryImpl$networkLoadLesson$1 = (SearchRepositoryImpl$networkLoadLesson$1) interfaceC9968c;
            int i12 = searchRepositoryImpl$networkLoadLesson$1.f20526i;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                searchRepositoryImpl$networkLoadLesson$1.f20526i = i12 - Integer.MIN_VALUE;
            } else {
                searchRepositoryImpl$networkLoadLesson$1 = new SearchRepositoryImpl$networkLoadLesson$1(this, interfaceC9968c);
            }
        } else {
            searchRepositoryImpl$networkLoadLesson$1 = new SearchRepositoryImpl$networkLoadLesson$1(this, interfaceC9968c);
        }
        Object objM18470l = searchRepositoryImpl$networkLoadLesson$1.f20524g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i13 = searchRepositoryImpl$networkLoadLesson$1.f20526i;
        if (i13 != 0) {
            if (i13 == 1) {
                int i14 = searchRepositoryImpl$networkLoadLesson$1.f20523f;
                String str3 = searchRepositoryImpl$networkLoadLesson$1.f20522e;
                SearchRepositoryImpl searchRepositoryImpl2 = searchRepositoryImpl$networkLoadLesson$1.f20521d;
                C7499b.m14977z0(objM18470l);
                i11 = i14;
                str2 = str3;
                searchRepositoryImpl = searchRepositoryImpl2;
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objM18470l);
            }
        }
        C7499b.m14977z0(objM18470l);
        Integer num = new Integer(i10);
        searchRepositoryImpl$networkLoadLesson$1.f20521d = this;
        searchRepositoryImpl$networkLoadLesson$1.f20522e = str;
        searchRepositoryImpl$networkLoadLesson$1.f20523f = i10;
        searchRepositoryImpl$networkLoadLesson$1.f20526i = 1;
        objM18470l = this.f20485h.m18470l(str, num, true, searchRepositoryImpl$networkLoadLesson$1);
        if (objM18470l == coroutineSingletons) {
            return coroutineSingletons;
        }
        searchRepositoryImpl = this;
        i11 = i10;
        str2 = str;
        LingQDatabase lingQDatabase = searchRepositoryImpl.f20478a;
        SearchRepositoryImpl$networkLoadLesson$2 searchRepositoryImpl$networkLoadLesson$2 = new SearchRepositoryImpl$networkLoadLesson$2((ResultLesson) objM18470l, searchRepositoryImpl, str2, i11, null);
        searchRepositoryImpl$networkLoadLesson$1.f20521d = null;
        searchRepositoryImpl$networkLoadLesson$1.f20522e = null;
        searchRepositoryImpl$networkLoadLesson$1.f20526i = 2;
        objM18470l = RoomDatabaseKt.m4573a(lingQDatabase, searchRepositoryImpl$networkLoadLesson$2, searchRepositoryImpl$networkLoadLesson$1);
        return objM18470l == coroutineSingletons ? coroutineSingletons : objM18470l;
    }
}
