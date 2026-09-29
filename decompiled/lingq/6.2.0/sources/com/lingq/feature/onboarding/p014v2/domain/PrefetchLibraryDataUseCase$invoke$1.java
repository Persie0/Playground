package com.lingq.feature.onboarding.p014v2.domain;

import com.lingq.core.data.repository.C1293i;
import com.lingq.core.data.repository.C1296l;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.datastore.C1369b;
import com.lingq.core.domain.model.LearningLevel;
import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.library.LibraryShelf;
import com.lingq.core.domain.model.library.LibraryTab;
import com.lingq.core.domain.model.user.Profile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.l83;
import p000.m83;
import p000.qm7;
import p000.si7;
import p000.u91;
import p000.un1;
import p000.v91;
import p000.vz1;
import p000.wfb;
import p000.xfa;
import p000.y95;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.v2.domain.PrefetchLibraryDataUseCase$invoke$1", m4291f = "PrefetchLibraryDataUseCase.kt", m4292l = {42, 47, 51, 57, 62, 88}, m4293m = "invokeSuspend", m4294v = 2)
final class PrefetchLibraryDataUseCase$invoke$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public String f27435a;

    /* JADX INFO: renamed from: b */
    public Language f27436b;

    /* JADX INFO: renamed from: c */
    public int f27437c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2224e f27438d;

    /* JADX INFO: renamed from: com.lingq.feature.onboarding.v2.domain.PrefetchLibraryDataUseCase$invoke$1$2 */
    @c32(m4290c = "com.lingq.feature.onboarding.v2.domain.PrefetchLibraryDataUseCase$invoke$1$2", m4291f = "PrefetchLibraryDataUseCase.kt", m4292l = {79}, m4293m = "invokeSuspend", m4294v = 2)
    final class C22172 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f27439a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2224e f27440b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f27441c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ List f27442d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22172(C2224e c2224e, String str, List list, Continuation continuation) {
            super(2, continuation);
            this.f27440b = c2224e;
            this.f27441c = str;
            this.f27442d = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C22172(this.f27440b, this.f27441c, this.f27442d, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C22172) create((e83) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f27439a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                y95 y95Var = this.f27440b.f27476d;
                this.f27439a = 1;
                if (((C1296l) y95Var).m7325t(this.f27441c, this.f27442d, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.feature.onboarding.v2.domain.PrefetchLibraryDataUseCase$invoke$1$3 */
    @c32(m4290c = "com.lingq.feature.onboarding.v2.domain.PrefetchLibraryDataUseCase$invoke$1$3", m4291f = "PrefetchLibraryDataUseCase.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C22183 extends SuspendLambda implements aj3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Throwable f27443a;

        @Override // p000.aj3
        public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
            C22183 c22183 = new C22183(3, (Continuation) obj3);
            c22183.f27443a = (Throwable) obj2;
            xfa xfaVar = xfa.f68157a;
            c22183.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th = this.f27443a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            th.printStackTrace();
            return xfa.f68157a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.onboarding.v2.domain.PrefetchLibraryDataUseCase$invoke$1$4 */
    @c32(m4290c = "com.lingq.feature.onboarding.v2.domain.PrefetchLibraryDataUseCase$invoke$1$4", m4291f = "PrefetchLibraryDataUseCase.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C22194 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f27444a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2224e f27445b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f27446c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22194(C2224e c2224e, String str, Continuation continuation) {
            super(2, continuation);
            this.f27445b = c2224e;
            this.f27446c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C22194 c22194 = new C22194(this.f27445b, this.f27446c, continuation);
            c22194.f27444a = obj;
            return c22194;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C22194 c22194 = (C22194) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c22194.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object next;
            LibraryTab libraryTab;
            LibraryTab libraryTab2;
            List list = (List) this.f27444a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            for (LibraryShelf libraryShelf : u91.m22615g1(list, 3)) {
                for (LibraryTab libraryTab3 : libraryShelf.f19495c) {
                    List list2 = libraryShelf.f19495c;
                    if (list2.size() == 1) {
                        libraryTab2 = (LibraryTab) u91.m22589G0(list2);
                    } else {
                        Iterator it = list2.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!((LibraryTab) next).f19504d);
                        LibraryTab libraryTab4 = (LibraryTab) next;
                        if (libraryTab4 == null) {
                            libraryTab2 = (LibraryTab) u91.m22589G0(list2);
                        } else {
                            libraryTab = libraryTab4;
                        }
                        String str = libraryTab.f19506f;
                        C2224e c2224e = this.f27445b;
                        wfb.m23926u(c2224e.f27477e, null, null, new PrefetchLibraryDataUseCase$fetchShelfContent$1(c2224e, this.f27446c, libraryShelf, libraryTab, str, null), 3);
                    }
                    libraryTab = libraryTab2;
                    String str2 = libraryTab.f19506f;
                    C2224e c2224e2 = this.f27445b;
                    wfb.m23926u(c2224e2.f27477e, null, null, new PrefetchLibraryDataUseCase$fetchShelfContent$1(c2224e2, this.f27446c, libraryShelf, libraryTab, str2, null), 3);
                }
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrefetchLibraryDataUseCase$invoke$1(C2224e c2224e, Continuation continuation) {
        super(2, continuation);
        this.f27438d = c2224e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PrefetchLibraryDataUseCase$invoke$1(this.f27438d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PrefetchLibraryDataUseCase$invoke$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0071 A[PHI: r3 r15
      0x0071: PHI (r3v2 java.lang.String) = (r3v1 java.lang.String), (r3v3 java.lang.String) binds: [B:20:0x006d, B:11:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x0071: PHI (r15v12 java.lang.Object) = (r15v11 java.lang.Object), (r15v0 java.lang.Object) binds: [B:20:0x006d, B:11:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0077  */
    /* JADX WARN: Code duplicated, block: B:28:0x008a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0095  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ed A[PHI: r3
      0x00ed: PHI (r3v7 java.lang.String) = (r3v4 java.lang.String), (r3v4 java.lang.String), (r3v4 java.lang.String), (r3v8 java.lang.String) binds: [B:30:0x0093, B:32:0x0097, B:46:0x00e9, B:9:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x0100  */
    /* JADX WARN: Code duplicated, block: B:54:0x010b  */
    /* JADX WARN: Code duplicated, block: B:57:0x011e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0153 A[LOOP:1: B:61:0x014d->B:63:0x0153, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x0163  */
    /* JADX WARN: Code duplicated, block: B:68:0x017c A[LOOP:2: B:66:0x0176->B:68:0x017c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x0198  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ce A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:77:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v28, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v41, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        Language language;
        Object objM15541t;
        Language language2;
        List list;
        String str2;
        Map map;
        ?? arrayList;
        ArrayList arrayList2;
        Iterator it;
        c83 c83VarM15544w;
        C22194 c22194;
        LinkedHashMap linkedHashMap;
        Iterator it2;
        C2224e c2224e = this.f27438d;
        si7 si7Var = c2224e.f27474b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27437c;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                AbstractC3193b.m15359b(obj);
                qm7 qm7Var = ((C1369b) c2224e.f27473a).f18480m;
                this.f27437c = 1;
                obj = AbstractC3224d.m15541t(qm7Var, this);
                if (obj != coroutineSingletons) {
                    str = ((Profile) obj).f19666o;
                    if (str.length() != 0) {
                        c83 c83VarM7215l = ((C1293i) c2224e.f27475c).m7215l(str);
                        this.f27435a = str;
                        this.f27437c = 2;
                        obj = AbstractC3224d.m15541t(c83VarM7215l, this);
                        if (obj != coroutineSingletons) {
                            language = (Language) obj;
                            if (language != null) {
                                c83 c83Var = ((C1368a) si7Var).f18407f1;
                                this.f27435a = str;
                                this.f27436b = language;
                                this.f27437c = 3;
                                objM15541t = AbstractC3224d.m15541t(c83Var, this);
                                if (objM15541t != coroutineSingletons) {
                                    language2 = language;
                                    obj = objM15541t;
                                    if (((Map) obj).get(str) == null || (list = language2.f19041r) == null) {
                                        c83 c83Var2 = ((C1368a) si7Var).f18407f1;
                                        this.f27435a = str;
                                        this.f27436b = null;
                                        this.f27437c = 5;
                                        obj = AbstractC3224d.m15541t(c83Var2, this);
                                        if (obj != coroutineSingletons) {
                                            str2 = str;
                                            map = (Map) ((Map) obj).get(str2);
                                            if (map != null) {
                                                linkedHashMap = new LinkedHashMap();
                                                for (Map.Entry entry : map.entrySet()) {
                                                    if (((Boolean) entry.getValue()).booleanValue()) {
                                                        linkedHashMap.put(entry.getKey(), entry.getValue());
                                                    }
                                                }
                                                arrayList = new ArrayList(linkedHashMap.size());
                                                it2 = linkedHashMap.entrySet().iterator();
                                                while (it2.hasNext()) {
                                                    arrayList.add((LearningLevel) ((Map.Entry) it2.next()).getKey());
                                                }
                                            } else {
                                                arrayList = EmptyList.f47638a;
                                            }
                                            Iterable iterable = (Iterable) arrayList;
                                            arrayList2 = new ArrayList(v91.m23189q0(iterable, 10));
                                            it = iterable.iterator();
                                            while (it.hasNext()) {
                                                arrayList2.add(((LearningLevel) it.next()).getServerName());
                                            }
                                            if (arrayList2.size() == LearningLevel.getEntries().size()) {
                                                arrayList2 = null;
                                            }
                                            c83VarM15544w = AbstractC3224d.m15544w(new l83(new m83(((C1296l) c2224e.f27476d).m7320o(str2, arrayList2), new C22172(c2224e, str2, arrayList2, null)), new C22183(3, null), 1), c2224e.f27478f);
                                            c22194 = new C22194(c2224e, str2, null);
                                            this.f27435a = null;
                                            this.f27436b = null;
                                            this.f27437c = 6;
                                            if (AbstractC3224d.m15529h(c83VarM15544w, c22194, this) != coroutineSingletons) {
                                            }
                                        }
                                    } else {
                                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                        int i2 = 0;
                                        for (Object obj2 : LearningLevel.getEntries()) {
                                            int i3 = i2 + 1;
                                            if (i2 < 0) {
                                                vz1.m23628e0();
                                                throw null;
                                            }
                                            LearningLevel learningLevel = (LearningLevel) obj2;
                                            String str3 = (String) u91.m22592J0(i2, list);
                                            linkedHashMap2.put(learningLevel, Boolean.valueOf(str3 != null ? Boolean.parseBoolean(str3) : true));
                                            i2 = i3;
                                        }
                                        Map mapM15364Q = AbstractC3194a.m15364Q(new Pair(str, linkedHashMap2));
                                        this.f27435a = str;
                                        this.f27436b = null;
                                        this.f27437c = 4;
                                        if (((C1368a) si7Var).m7844C(mapM15364Q, this) != coroutineSingletons) {
                                            c83 c83Var3 = ((C1368a) si7Var).f18407f1;
                                            this.f27435a = str;
                                            this.f27436b = null;
                                            this.f27437c = 5;
                                            obj = AbstractC3224d.m15541t(c83Var3, this);
                                            if (obj != coroutineSingletons) {
                                                str2 = str;
                                                map = (Map) ((Map) obj).get(str2);
                                                if (map != null) {
                                                    linkedHashMap = new LinkedHashMap();
                                                    while (r15.hasNext()) {
                                                        if (((Boolean) entry.getValue()).booleanValue()) {
                                                            linkedHashMap.put(entry.getKey(), entry.getValue());
                                                        }
                                                    }
                                                    arrayList = new ArrayList(linkedHashMap.size());
                                                    it2 = linkedHashMap.entrySet().iterator();
                                                    while (it2.hasNext()) {
                                                        arrayList.add((LearningLevel) ((Map.Entry) it2.next()).getKey());
                                                    }
                                                } else {
                                                    arrayList = EmptyList.f47638a;
                                                }
                                                Iterable iterable2 = (Iterable) arrayList;
                                                arrayList2 = new ArrayList(v91.m23189q0(iterable2, 10));
                                                it = iterable2.iterator();
                                                while (it.hasNext()) {
                                                    arrayList2.add(((LearningLevel) it.next()).getServerName());
                                                }
                                                if (arrayList2.size() == LearningLevel.getEntries().size()) {
                                                    arrayList2 = null;
                                                }
                                                c83VarM15544w = AbstractC3224d.m15544w(new l83(new m83(((C1296l) c2224e.f27476d).m7320o(str2, arrayList2), new C22172(c2224e, str2, arrayList2, null)), new C22183(3, null), 1), c2224e.f27478f);
                                                c22194 = new C22194(c2224e, str2, null);
                                                this.f27435a = null;
                                                this.f27436b = null;
                                                this.f27437c = 6;
                                                if (AbstractC3224d.m15529h(c83VarM15544w, c22194, this) != coroutineSingletons) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return xfaVar;
                }
                return coroutineSingletons;
            case 1:
                AbstractC3193b.m15359b(obj);
                str = ((Profile) obj).f19666o;
                if (str.length() != 0) {
                    c83 c83VarM7215l2 = ((C1293i) c2224e.f27475c).m7215l(str);
                    this.f27435a = str;
                    this.f27437c = 2;
                    obj = AbstractC3224d.m15541t(c83VarM7215l2, this);
                    if (obj != coroutineSingletons) {
                        language = (Language) obj;
                        if (language != null) {
                            c83 c83Var4 = ((C1368a) si7Var).f18407f1;
                            this.f27435a = str;
                            this.f27436b = language;
                            this.f27437c = 3;
                            objM15541t = AbstractC3224d.m15541t(c83Var4, this);
                            if (objM15541t != coroutineSingletons) {
                                language2 = language;
                                obj = objM15541t;
                                if (((Map) obj).get(str) == null) {
                                    c83 c83Var5 = ((C1368a) si7Var).f18407f1;
                                    this.f27435a = str;
                                    this.f27436b = null;
                                    this.f27437c = 5;
                                    obj = AbstractC3224d.m15541t(c83Var5, this);
                                    if (obj != coroutineSingletons) {
                                        str2 = str;
                                        map = (Map) ((Map) obj).get(str2);
                                        if (map != null) {
                                            linkedHashMap = new LinkedHashMap();
                                            while (r15.hasNext()) {
                                                if (((Boolean) entry.getValue()).booleanValue()) {
                                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                                }
                                            }
                                            arrayList = new ArrayList(linkedHashMap.size());
                                            it2 = linkedHashMap.entrySet().iterator();
                                            while (it2.hasNext()) {
                                                arrayList.add((LearningLevel) ((Map.Entry) it2.next()).getKey());
                                            }
                                        } else {
                                            arrayList = EmptyList.f47638a;
                                        }
                                        Iterable iterable3 = (Iterable) arrayList;
                                        arrayList2 = new ArrayList(v91.m23189q0(iterable3, 10));
                                        it = iterable3.iterator();
                                        while (it.hasNext()) {
                                            arrayList2.add(((LearningLevel) it.next()).getServerName());
                                        }
                                        if (arrayList2.size() == LearningLevel.getEntries().size()) {
                                            arrayList2 = null;
                                        }
                                        c83VarM15544w = AbstractC3224d.m15544w(new l83(new m83(((C1296l) c2224e.f27476d).m7320o(str2, arrayList2), new C22172(c2224e, str2, arrayList2, null)), new C22183(3, null), 1), c2224e.f27478f);
                                        c22194 = new C22194(c2224e, str2, null);
                                        this.f27435a = null;
                                        this.f27436b = null;
                                        this.f27437c = 6;
                                        if (AbstractC3224d.m15529h(c83VarM15544w, c22194, this) != coroutineSingletons) {
                                        }
                                    }
                                } else {
                                    c83 c83Var6 = ((C1368a) si7Var).f18407f1;
                                    this.f27435a = str;
                                    this.f27436b = null;
                                    this.f27437c = 5;
                                    obj = AbstractC3224d.m15541t(c83Var6, this);
                                    if (obj != coroutineSingletons) {
                                        str2 = str;
                                        map = (Map) ((Map) obj).get(str2);
                                        if (map != null) {
                                            linkedHashMap = new LinkedHashMap();
                                            while (r15.hasNext()) {
                                                if (((Boolean) entry.getValue()).booleanValue()) {
                                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                                }
                                            }
                                            arrayList = new ArrayList(linkedHashMap.size());
                                            it2 = linkedHashMap.entrySet().iterator();
                                            while (it2.hasNext()) {
                                                arrayList.add((LearningLevel) ((Map.Entry) it2.next()).getKey());
                                            }
                                        } else {
                                            arrayList = EmptyList.f47638a;
                                        }
                                        Iterable iterable4 = (Iterable) arrayList;
                                        arrayList2 = new ArrayList(v91.m23189q0(iterable4, 10));
                                        it = iterable4.iterator();
                                        while (it.hasNext()) {
                                            arrayList2.add(((LearningLevel) it.next()).getServerName());
                                        }
                                        if (arrayList2.size() == LearningLevel.getEntries().size()) {
                                            arrayList2 = null;
                                        }
                                        c83VarM15544w = AbstractC3224d.m15544w(new l83(new m83(((C1296l) c2224e.f27476d).m7320o(str2, arrayList2), new C22172(c2224e, str2, arrayList2, null)), new C22183(3, null), 1), c2224e.f27478f);
                                        c22194 = new C22194(c2224e, str2, null);
                                        this.f27435a = null;
                                        this.f27436b = null;
                                        this.f27437c = 6;
                                        if (AbstractC3224d.m15529h(c83VarM15544w, c22194, this) != coroutineSingletons) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                return xfaVar;
            case 2:
                str = this.f27435a;
                AbstractC3193b.m15359b(obj);
                language = (Language) obj;
                if (language != null) {
                    c83 c83Var7 = ((C1368a) si7Var).f18407f1;
                    this.f27435a = str;
                    this.f27436b = language;
                    this.f27437c = 3;
                    objM15541t = AbstractC3224d.m15541t(c83Var7, this);
                    if (objM15541t != coroutineSingletons) {
                        language2 = language;
                        obj = objM15541t;
                        if (((Map) obj).get(str) == null) {
                            c83 c83Var8 = ((C1368a) si7Var).f18407f1;
                            this.f27435a = str;
                            this.f27436b = null;
                            this.f27437c = 5;
                            obj = AbstractC3224d.m15541t(c83Var8, this);
                            if (obj != coroutineSingletons) {
                                str2 = str;
                                map = (Map) ((Map) obj).get(str2);
                                if (map != null) {
                                    linkedHashMap = new LinkedHashMap();
                                    while (r15.hasNext()) {
                                        if (((Boolean) entry.getValue()).booleanValue()) {
                                            linkedHashMap.put(entry.getKey(), entry.getValue());
                                        }
                                    }
                                    arrayList = new ArrayList(linkedHashMap.size());
                                    it2 = linkedHashMap.entrySet().iterator();
                                    while (it2.hasNext()) {
                                        arrayList.add((LearningLevel) ((Map.Entry) it2.next()).getKey());
                                    }
                                } else {
                                    arrayList = EmptyList.f47638a;
                                }
                                Iterable iterable5 = (Iterable) arrayList;
                                arrayList2 = new ArrayList(v91.m23189q0(iterable5, 10));
                                it = iterable5.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(((LearningLevel) it.next()).getServerName());
                                }
                                if (arrayList2.size() == LearningLevel.getEntries().size()) {
                                    arrayList2 = null;
                                }
                                c83VarM15544w = AbstractC3224d.m15544w(new l83(new m83(((C1296l) c2224e.f27476d).m7320o(str2, arrayList2), new C22172(c2224e, str2, arrayList2, null)), new C22183(3, null), 1), c2224e.f27478f);
                                c22194 = new C22194(c2224e, str2, null);
                                this.f27435a = null;
                                this.f27436b = null;
                                this.f27437c = 6;
                                if (AbstractC3224d.m15529h(c83VarM15544w, c22194, this) != coroutineSingletons) {
                                }
                            }
                        } else {
                            c83 c83Var9 = ((C1368a) si7Var).f18407f1;
                            this.f27435a = str;
                            this.f27436b = null;
                            this.f27437c = 5;
                            obj = AbstractC3224d.m15541t(c83Var9, this);
                            if (obj != coroutineSingletons) {
                                str2 = str;
                                map = (Map) ((Map) obj).get(str2);
                                if (map != null) {
                                    linkedHashMap = new LinkedHashMap();
                                    while (r15.hasNext()) {
                                        if (((Boolean) entry.getValue()).booleanValue()) {
                                            linkedHashMap.put(entry.getKey(), entry.getValue());
                                        }
                                    }
                                    arrayList = new ArrayList(linkedHashMap.size());
                                    it2 = linkedHashMap.entrySet().iterator();
                                    while (it2.hasNext()) {
                                        arrayList.add((LearningLevel) ((Map.Entry) it2.next()).getKey());
                                    }
                                } else {
                                    arrayList = EmptyList.f47638a;
                                }
                                Iterable iterable6 = (Iterable) arrayList;
                                arrayList2 = new ArrayList(v91.m23189q0(iterable6, 10));
                                it = iterable6.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(((LearningLevel) it.next()).getServerName());
                                }
                                if (arrayList2.size() == LearningLevel.getEntries().size()) {
                                    arrayList2 = null;
                                }
                                c83VarM15544w = AbstractC3224d.m15544w(new l83(new m83(((C1296l) c2224e.f27476d).m7320o(str2, arrayList2), new C22172(c2224e, str2, arrayList2, null)), new C22183(3, null), 1), c2224e.f27478f);
                                c22194 = new C22194(c2224e, str2, null);
                                this.f27435a = null;
                                this.f27436b = null;
                                this.f27437c = 6;
                                if (AbstractC3224d.m15529h(c83VarM15544w, c22194, this) != coroutineSingletons) {
                                }
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                return xfaVar;
            case 3:
                Language language3 = this.f27436b;
                String str4 = this.f27435a;
                AbstractC3193b.m15359b(obj);
                language2 = language3;
                str = str4;
                if (((Map) obj).get(str) == null) {
                    c83 c83Var10 = ((C1368a) si7Var).f18407f1;
                    this.f27435a = str;
                    this.f27436b = null;
                    this.f27437c = 5;
                    obj = AbstractC3224d.m15541t(c83Var10, this);
                    if (obj != coroutineSingletons) {
                        str2 = str;
                        map = (Map) ((Map) obj).get(str2);
                        if (map != null) {
                            linkedHashMap = new LinkedHashMap();
                            while (r15.hasNext()) {
                                if (((Boolean) entry.getValue()).booleanValue()) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                            arrayList = new ArrayList(linkedHashMap.size());
                            it2 = linkedHashMap.entrySet().iterator();
                            while (it2.hasNext()) {
                                arrayList.add((LearningLevel) ((Map.Entry) it2.next()).getKey());
                            }
                        } else {
                            arrayList = EmptyList.f47638a;
                        }
                        Iterable iterable7 = (Iterable) arrayList;
                        arrayList2 = new ArrayList(v91.m23189q0(iterable7, 10));
                        it = iterable7.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((LearningLevel) it.next()).getServerName());
                        }
                        if (arrayList2.size() == LearningLevel.getEntries().size()) {
                            arrayList2 = null;
                        }
                        c83VarM15544w = AbstractC3224d.m15544w(new l83(new m83(((C1296l) c2224e.f27476d).m7320o(str2, arrayList2), new C22172(c2224e, str2, arrayList2, null)), new C22183(3, null), 1), c2224e.f27478f);
                        c22194 = new C22194(c2224e, str2, null);
                        this.f27435a = null;
                        this.f27436b = null;
                        this.f27437c = 6;
                        if (AbstractC3224d.m15529h(c83VarM15544w, c22194, this) != coroutineSingletons) {
                            return xfaVar;
                        }
                    }
                } else {
                    c83 c83Var11 = ((C1368a) si7Var).f18407f1;
                    this.f27435a = str;
                    this.f27436b = null;
                    this.f27437c = 5;
                    obj = AbstractC3224d.m15541t(c83Var11, this);
                    if (obj != coroutineSingletons) {
                        str2 = str;
                        map = (Map) ((Map) obj).get(str2);
                        if (map != null) {
                            linkedHashMap = new LinkedHashMap();
                            while (r15.hasNext()) {
                                if (((Boolean) entry.getValue()).booleanValue()) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                            arrayList = new ArrayList(linkedHashMap.size());
                            it2 = linkedHashMap.entrySet().iterator();
                            while (it2.hasNext()) {
                                arrayList.add((LearningLevel) ((Map.Entry) it2.next()).getKey());
                            }
                        } else {
                            arrayList = EmptyList.f47638a;
                        }
                        Iterable iterable8 = (Iterable) arrayList;
                        arrayList2 = new ArrayList(v91.m23189q0(iterable8, 10));
                        it = iterable8.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((LearningLevel) it.next()).getServerName());
                        }
                        if (arrayList2.size() == LearningLevel.getEntries().size()) {
                            arrayList2 = null;
                        }
                        c83VarM15544w = AbstractC3224d.m15544w(new l83(new m83(((C1296l) c2224e.f27476d).m7320o(str2, arrayList2), new C22172(c2224e, str2, arrayList2, null)), new C22183(3, null), 1), c2224e.f27478f);
                        c22194 = new C22194(c2224e, str2, null);
                        this.f27435a = null;
                        this.f27436b = null;
                        this.f27437c = 6;
                        if (AbstractC3224d.m15529h(c83VarM15544w, c22194, this) != coroutineSingletons) {
                            return xfaVar;
                        }
                    }
                }
                return coroutineSingletons;
            case 4:
                str = this.f27435a;
                AbstractC3193b.m15359b(obj);
                c83 c83Var12 = ((C1368a) si7Var).f18407f1;
                this.f27435a = str;
                this.f27436b = null;
                this.f27437c = 5;
                obj = AbstractC3224d.m15541t(c83Var12, this);
                if (obj != coroutineSingletons) {
                    str2 = str;
                    map = (Map) ((Map) obj).get(str2);
                    if (map != null) {
                        linkedHashMap = new LinkedHashMap();
                        while (r15.hasNext()) {
                            if (((Boolean) entry.getValue()).booleanValue()) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        arrayList = new ArrayList(linkedHashMap.size());
                        it2 = linkedHashMap.entrySet().iterator();
                        while (it2.hasNext()) {
                            arrayList.add((LearningLevel) ((Map.Entry) it2.next()).getKey());
                        }
                    } else {
                        arrayList = EmptyList.f47638a;
                    }
                    Iterable iterable9 = (Iterable) arrayList;
                    arrayList2 = new ArrayList(v91.m23189q0(iterable9, 10));
                    it = iterable9.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((LearningLevel) it.next()).getServerName());
                    }
                    if (arrayList2.size() == LearningLevel.getEntries().size()) {
                        arrayList2 = null;
                    }
                    c83VarM15544w = AbstractC3224d.m15544w(new l83(new m83(((C1296l) c2224e.f27476d).m7320o(str2, arrayList2), new C22172(c2224e, str2, arrayList2, null)), new C22183(3, null), 1), c2224e.f27478f);
                    c22194 = new C22194(c2224e, str2, null);
                    this.f27435a = null;
                    this.f27436b = null;
                    this.f27437c = 6;
                    if (AbstractC3224d.m15529h(c83VarM15544w, c22194, this) != coroutineSingletons) {
                        return xfaVar;
                    }
                }
                return coroutineSingletons;
            case 5:
                str2 = this.f27435a;
                AbstractC3193b.m15359b(obj);
                map = (Map) ((Map) obj).get(str2);
                if (map != null) {
                    linkedHashMap = new LinkedHashMap();
                    while (r15.hasNext()) {
                        if (((Boolean) entry.getValue()).booleanValue()) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    arrayList = new ArrayList(linkedHashMap.size());
                    it2 = linkedHashMap.entrySet().iterator();
                    while (it2.hasNext()) {
                        arrayList.add((LearningLevel) ((Map.Entry) it2.next()).getKey());
                    }
                } else {
                    arrayList = EmptyList.f47638a;
                }
                Iterable iterable10 = (Iterable) arrayList;
                arrayList2 = new ArrayList(v91.m23189q0(iterable10, 10));
                it = iterable10.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((LearningLevel) it.next()).getServerName());
                }
                if (arrayList2.size() == LearningLevel.getEntries().size()) {
                    arrayList2 = null;
                }
                c83VarM15544w = AbstractC3224d.m15544w(new l83(new m83(((C1296l) c2224e.f27476d).m7320o(str2, arrayList2), new C22172(c2224e, str2, arrayList2, null)), new C22183(3, null), 1), c2224e.f27478f);
                c22194 = new C22194(c2224e, str2, null);
                this.f27435a = null;
                this.f27436b = null;
                this.f27437c = 6;
                if (AbstractC3224d.m15529h(c83VarM15544w, c22194, this) != coroutineSingletons) {
                    return coroutineSingletons;
                }
                return xfaVar;
            case 6:
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
