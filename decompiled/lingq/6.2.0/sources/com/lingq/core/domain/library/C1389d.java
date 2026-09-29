package com.lingq.core.domain.library;

import com.lingq.core.data.repository.C1286b;
import com.lingq.core.datastore.C1371d;
import com.lingq.core.domain.model.LearningLevel;
import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.library.LibrarySearchQuery;
import com.lingq.core.domain.model.library.LibraryShelf;
import com.lingq.core.domain.model.library.LibraryShelfType;
import com.lingq.core.domain.model.library.LibraryTab;
import com.lingq.core.domain.model.library.Resources;
import com.lingq.core.domain.model.library.Sort;
import com.lingq.core.domain.util.AbstractC1543a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3423or;
import p000.C3386nv;
import p000.bq1;
import p000.c83;
import p000.fa4;
import p000.m83;
import p000.r60;
import p000.v91;
import p000.vk9;
import p000.vma;
import p000.xfa;
import p000.xm3;
import p000.y95;

/* JADX INFO: renamed from: com.lingq.core.domain.library.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1389d {

    /* JADX INFO: renamed from: a */
    public final y95 f18834a;

    /* JADX INFO: renamed from: b */
    public final Object f18835b;

    public C1389d(y95 y95Var, C1286b c1286b) {
        y95Var.getClass();
        c1286b.getClass();
        this.f18834a = y95Var;
        this.f18835b = c1286b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c7, code lost:
    
        if (((com.lingq.core.datastore.C1371d) r0).m7969i(r6, r1) == r10) goto L30;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m8005a(C1389d c1389d, List list, String str, Set set, ContinuationImpl continuationImpl) throws Throwable {
        GetLibraryStructureUseCase$initiateSearchSettings$1 getLibraryStructureUseCase$initiateSearchSettings$1;
        vma vmaVar = (vma) c1389d.f18835b;
        if (continuationImpl instanceof GetLibraryStructureUseCase$initiateSearchSettings$1) {
            getLibraryStructureUseCase$initiateSearchSettings$1 = (GetLibraryStructureUseCase$initiateSearchSettings$1) continuationImpl;
            int i = getLibraryStructureUseCase$initiateSearchSettings$1.f18768f;
            if ((i & Integer.MIN_VALUE) != 0) {
                getLibraryStructureUseCase$initiateSearchSettings$1.f18768f = i - Integer.MIN_VALUE;
            } else {
                getLibraryStructureUseCase$initiateSearchSettings$1 = new GetLibraryStructureUseCase$initiateSearchSettings$1(c1389d, continuationImpl);
            }
        } else {
            getLibraryStructureUseCase$initiateSearchSettings$1 = new GetLibraryStructureUseCase$initiateSearchSettings$1(c1389d, continuationImpl);
        }
        Object objM15541t = getLibraryStructureUseCase$initiateSearchSettings$1.f18766d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getLibraryStructureUseCase$initiateSearchSettings$1.f18768f;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            c83 c83Var = ((C1371d) vmaVar).f18585v;
            getLibraryStructureUseCase$initiateSearchSettings$1.f18763a = list;
            getLibraryStructureUseCase$initiateSearchSettings$1.f18764b = str;
            getLibraryStructureUseCase$initiateSearchSettings$1.f18765c = set;
            getLibraryStructureUseCase$initiateSearchSettings$1.f18768f = 1;
            objM15541t = AbstractC3224d.m15541t(c83Var, getLibraryStructureUseCase$initiateSearchSettings$1);
            if (objM15541t != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            set = getLibraryStructureUseCase$initiateSearchSettings$1.f18765c;
            str = getLibraryStructureUseCase$initiateSearchSettings$1.f18764b;
            list = getLibraryStructureUseCase$initiateSearchSettings$1.f18763a;
            AbstractC3193b.m15359b(objM15541t);
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM15541t);
        }
        return xfa.f68157a;
        LinkedHashMap linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) objM15541t);
        for (LibraryShelf libraryShelf : set) {
            if (((LibrarySearchQuery) linkedHashMapM15372Y.get(AbstractC3423or.m18243a0(libraryShelf, null, str))) == null) {
                linkedHashMapM15372Y.put(AbstractC3423or.m18243a0(libraryShelf, null, str), m8006d(libraryShelf.f19496d, list));
            }
        }
        LibraryShelfType libraryShelfType = LibraryShelfType.Search;
        if (((LibrarySearchQuery) linkedHashMapM15372Y.get(bq1.m4048X(libraryShelfType.getValue(), str))) == null) {
            linkedHashMapM15372Y.put(bq1.m4048X(libraryShelfType.getValue(), str), m8006d(libraryShelfType.getValue(), list));
        }
        getLibraryStructureUseCase$initiateSearchSettings$1.f18763a = null;
        getLibraryStructureUseCase$initiateSearchSettings$1.f18764b = null;
        getLibraryStructureUseCase$initiateSearchSettings$1.f18765c = null;
        getLibraryStructureUseCase$initiateSearchSettings$1.f18768f = 2;
    }

    /* JADX INFO: renamed from: d */
    public static LibrarySearchQuery m8006d(String str, List list) {
        Sort sort;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LibraryShelfType libraryShelfType = LibraryShelfType.Trending;
        if (!fa4.m11650l(str, libraryShelfType.getValue())) {
            Resources resources = Resources.ResourceAttachments;
            Boolean bool = Boolean.FALSE;
            linkedHashMap.put(resources, bool);
            linkedHashMap.put(Resources.ResourceExercises, bool);
            linkedHashMap.put(Resources.ResourceNotes, bool);
            linkedHashMap.put(Resources.ResourceScript, bool);
            linkedHashMap.put(Resources.ResourceTranslations, bool);
            linkedHashMap.put(Resources.ResourceVideos, bool);
        }
        if (fa4.m11650l(str, LibraryShelfType.MyCourses.getValue())) {
            sort = Sort.Opened;
        } else if (fa4.m11650l(str, LibraryShelfType.Guided.getValue()) || fa4.m11650l(str, LibraryShelfType.MiniStories.getValue())) {
            sort = Sort.Position;
        } else if (fa4.m11650l(str, LibraryShelfType.MyLessons.getValue())) {
            sort = Sort.Opened;
        } else if (fa4.m11650l(str, libraryShelfType.getValue())) {
            sort = Sort.Position;
        } else {
            sort = (!fa4.m11650l(str, LibraryShelfType.Media.getValue()) && fa4.m11650l(str, LibraryShelfType.Search.getValue())) ? Sort.Liked : Sort.Newest;
        }
        Sort sort2 = sort;
        int i = fa4.m11650l(str, LibraryShelfType.MiniStories.getValue()) ? 60 : 20;
        for (LearningLevel learningLevel : LearningLevel.values()) {
            linkedHashMap2.put(learningLevel, Boolean.valueOf(list.contains(learningLevel)));
        }
        return new LibrarySearchQuery(linkedHashMap, linkedHashMap2, i, sort2, 8176);
    }

    /* JADX INFO: renamed from: b */
    public c83 m8007b(Language language, List list) {
        language.getClass();
        list.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((LearningLevel) it.next()).getServerName());
        }
        if (arrayList.size() == LearningLevel.getEntries().size()) {
            arrayList = null;
        }
        return AbstractC3224d.m15536o(new m83(AbstractC1543a.m8226a(new r60(this, language, arrayList, 5), new GetLibraryStructureUseCase$invoke$2(this, language, arrayList, null)), new GetLibraryStructureUseCase$invoke$3(this, language, list, null), 2));
    }

    /* JADX INFO: renamed from: c */
    public c83 m8008c(LibraryShelf libraryShelf, LibraryTab libraryTab, String str) {
        str.getClass();
        libraryTab.getClass();
        String strM18220E = AbstractC3423or.m18220E(libraryShelf, libraryTab);
        return AbstractC3224d.m15536o(AbstractC3224d.m15521C(AbstractC1543a.m8227b(new xm3(this, str, strM18220E, vk9.m23380c0(strM18220E, LibraryShelfType.MiniStories.getValue(), false) ? 60 : 18), new GetShelfContentUseCase$invoke$2(this, str, strM18220E, libraryTab, libraryShelf, null)), new GetShelfContentUseCase$invoke$$inlined$flatMapLatest$1(null, this, str)));
    }

    public C1389d(y95 y95Var, vma vmaVar) {
        y95Var.getClass();
        vmaVar.getClass();
        this.f18834a = y95Var;
        this.f18835b = vmaVar;
    }
}
