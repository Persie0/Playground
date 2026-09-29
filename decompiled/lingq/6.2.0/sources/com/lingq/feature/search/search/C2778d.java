package com.lingq.feature.search.search;

import com.lingq.core.domain.model.library.LibraryContentType;
import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.domain.model.library.LibraryItemCounter;
import com.lingq.core.domain.model.library.LibraryItemDownload;
import com.lingq.core.domain.model.library.LibraryItemType;
import com.lingq.core.domain.model.library.LibraryLessonAudioDownload;
import com.lingq.core.domain.model.library.LibrarySearchQuery;
import com.lingq.core.domain.model.library.LibraryShelf;
import com.lingq.core.domain.model.library.LibraryShelfType;
import com.lingq.core.domain.model.library.LibraryTab;
import com.lingq.core.domain.model.library.Sort;
import com.lingq.core.domain.model.library.SortType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.C3244l;
import p000.C2907cy;
import p000.C2981ey;
import p000.C3386nv;
import p000.InterfaceC3055gy;
import p000.ar8;
import p000.e83;
import p000.fa4;
import p000.jt8;
import p000.lda;
import p000.pq8;
import p000.qq8;
import p000.rq8;
import p000.sq8;
import p000.tq8;
import p000.u91;
import p000.uq8;
import p000.v91;
import p000.vq8;
import p000.vz1;
import p000.wfb;
import p000.wq8;
import p000.xfa;
import p000.xq8;
import p000.zjd;

/* JADX INFO: renamed from: com.lingq.feature.search.search.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C2778d implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ e83 f33092a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2779e f33093b;

    public C2778d(e83 e83Var, C2779e c2779e) {
        this.f33092a = e83Var;
        this.f33093b = c2779e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [kotlin.coroutines.Continuation, kotlinx.coroutines.CoroutineStart] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r29v11 */
    /* JADX WARN: Type inference failed for: r29v3 */
    /* JADX WARN: Type inference failed for: r29v8 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v63 */
    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        SearchViewModel$special$$inlined$map$1$2$1 searchViewModel$special$$inlined$map$1$2$1;
        String str;
        ?? r5;
        Integer numValueOf;
        ?? r13;
        Object qq8Var;
        Integer numValueOf2;
        LibraryItem libraryItem;
        LibraryLessonAudioDownload libraryLessonAudioDownload;
        SortType sortType;
        Sort sort;
        String value;
        String value2;
        if (continuation instanceof SearchViewModel$special$$inlined$map$1$2$1) {
            searchViewModel$special$$inlined$map$1$2$1 = (SearchViewModel$special$$inlined$map$1$2$1) continuation;
            int i = searchViewModel$special$$inlined$map$1$2$1.f33058b;
            if ((i & Integer.MIN_VALUE) != 0) {
                searchViewModel$special$$inlined$map$1$2$1.f33058b = i - Integer.MIN_VALUE;
            } else {
                searchViewModel$special$$inlined$map$1$2$1 = new SearchViewModel$special$$inlined$map$1$2$1(this, continuation);
            }
        } else {
            searchViewModel$special$$inlined$map$1$2$1 = new SearchViewModel$special$$inlined$map$1$2$1(this, continuation);
        }
        Object obj2 = searchViewModel$special$$inlined$map$1$2$1.f33057a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = searchViewModel$special$$inlined$map$1$2$1.f33058b;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj2);
            ar8 ar8Var = (ar8) obj;
            C2779e c2779e = this.f33093b;
            LibrarySearchQuery librarySearchQuery = (LibrarySearchQuery) ((Map) ((C3244l) c2779e.f33107o.f32913h.f9311a).getValue()).get(c2779e.m9710a3(c2779e.f33094b.mo4589b2()));
            ArrayList arrayList = new ArrayList();
            LibraryShelf libraryShelf = c2779e.f33113u;
            List list = libraryShelf.f19495c;
            String str2 = libraryShelf.f19496d;
            if (list.size() > 1) {
                str = null;
                ArrayList arrayList2 = new ArrayList(v91.m23189q0(libraryShelf.f19495c, 10));
                int i3 = 0;
                for (Iterator it = r11.iterator(); it.hasNext(); it = it) {
                    Object next = it.next();
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        vz1.m23628e0();
                        throw null;
                    }
                    LibraryTab libraryTab = (LibraryTab) next;
                    String str3 = libraryTab.f19501a;
                    String str4 = libraryTab.f19502b;
                    LibraryContentType libraryContentType = LibraryContentType.Lessons;
                    if (fa4.m11650l(str4, libraryContentType.getValue())) {
                        value2 = libraryContentType.getValue();
                    } else {
                        LibraryContentType libraryContentType2 = LibraryContentType.Courses;
                        if (fa4.m11650l(str4, libraryContentType2.getValue())) {
                            value = libraryContentType2.getValue();
                        } else {
                            LibraryContentType libraryContentType3 = LibraryContentType.Mixed;
                            value = fa4.m11650l(str4, libraryContentType3.getValue()) ? libraryContentType3.getValue() : libraryContentType.getValue();
                        }
                        value2 = value;
                    }
                    int i5 = libraryTab.f19503c;
                    LibraryTab libraryTab2 = ar8Var.f7401m;
                    arrayList2.add(new LibraryTab(str3, value2, i5, fa4.m11650l(libraryTab2 != null ? libraryTab2.f19506f : null, libraryTab.f19506f), i3, libraryTab.f19506f));
                    i3 = i4;
                }
                arrayList.add(new tq8(arrayList2));
            } else {
                str = null;
            }
            if (!fa4.m11650l(str2, LibraryShelfType.Guided.getValue())) {
                arrayList.add(new xq8(fa4.m11650l(str2, LibraryShelfType.Search.getValue()) || fa4.m11650l(str2, LibraryShelfType.SourceSearch.getValue()), ar8Var.f7402n));
                if (fa4.m11650l(str2, LibraryShelfType.MyCourses.getValue()) || fa4.m11650l(str2, LibraryShelfType.MyLessons.getValue())) {
                    LibraryTab libraryTab3 = ar8Var.f7401m;
                    sortType = fa4.m11650l(libraryTab3 != null ? libraryTab3.f19502b : str, LibraryContentType.Courses.getValue()) ? SortType.MyCourses : SortType.MyLessons;
                } else {
                    sortType = SortType.New;
                }
                if (librarySearchQuery == null || (sort = librarySearchQuery.f19482d) == null) {
                    sort = (Sort) u91.m22589G0(zjd.m25681a(sortType));
                }
                arrayList.add(new sq8(sortType, sort, librarySearchQuery != null ? librarySearchQuery.m8092b() : ar8Var.f7403o, str2));
            }
            List list2 = ar8Var.f7390b;
            boolean z = ar8Var.f7396h;
            List list3 = list2;
            int iM15363P = AbstractC3194a.m15363P(v91.m23189q0(list3, 10));
            if (iM15363P < 16) {
                iM15363P = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM15363P);
            for (Object obj3 : list3) {
                linkedHashMap.put(Integer.valueOf(((LibraryItemCounter) obj3).f19455a), obj3);
            }
            List list4 = ar8Var.f7391c;
            int iM15363P2 = AbstractC3194a.m15363P(v91.m23189q0(list4, 10));
            if (iM15363P2 < 16) {
                iM15363P2 = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM15363P2);
            for (Object obj4 : list4) {
                linkedHashMap2.put(Integer.valueOf(((LibraryItemDownload) obj4).f19472a), obj4);
            }
            List list5 = ar8Var.f7392d;
            int iM15363P3 = AbstractC3194a.m15363P(v91.m23189q0(list5, 10));
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(iM15363P3 >= 16 ? iM15363P3 : 16);
            for (Object obj5 : list5) {
                linkedHashMap3.put(Integer.valueOf(((LibraryLessonAudioDownload) obj5).f19475a), obj5);
            }
            List list6 = ar8Var.f7389a;
            ArrayList arrayList3 = new ArrayList(v91.m23189q0(list6, 10));
            Iterator it2 = list6.iterator();
            ?? r29 = str;
            while (it2.hasNext()) {
                LibraryItem libraryItem2 = (LibraryItem) it2.next();
                String str5 = libraryItem2.f19428b;
                Iterator it3 = it2;
                int i6 = libraryItem2.f19426a;
                CoroutineSingletons coroutineSingletons2 = coroutineSingletons;
                if (fa4.m11650l(str5, LibraryItemType.Content.getValue())) {
                    if (!u91.m22633z0(ar8Var.f7394f, libraryItem2.f19447s) || libraryItem2.m8088c()) {
                        InterfaceC3055gy interfaceC3055gy = (InterfaceC3055gy) ar8Var.f7393e.get(Integer.valueOf(i6));
                        if (interfaceC3055gy instanceof C2907cy) {
                            libraryItem = libraryItem2;
                            libraryLessonAudioDownload = new LibraryLessonAudioDownload(i6, Math.max(1, ((C2907cy) interfaceC3055gy).f34700c), false);
                        } else {
                            libraryItem = libraryItem2;
                            libraryLessonAudioDownload = interfaceC3055gy instanceof C2981ey ? new LibraryLessonAudioDownload(i6, 1, false) : (LibraryLessonAudioDownload) linkedHashMap3.get(Integer.valueOf(i6));
                        }
                        qq8Var = new uq8(libraryItem, (LibraryItemCounter) linkedHashMap.get(Integer.valueOf(i6)), (LibraryItemDownload) linkedHashMap2.get(Integer.valueOf(i6)), libraryLessonAudioDownload, libraryShelf.f19500h, libraryShelf.f19496d);
                    } else {
                        qq8Var = new vq8(libraryItem2);
                    }
                    r13 = r29;
                    c2779e = c2779e;
                } else {
                    LibraryItemCounter libraryItemCounter = (LibraryItemCounter) linkedHashMap.get(Integer.valueOf(i6));
                    LibraryItemDownload libraryItemDownload = (LibraryItemDownload) linkedHashMap2.get(Integer.valueOf(i6));
                    if (libraryItemDownload != null) {
                        numValueOf2 = Integer.valueOf(libraryItemDownload.f19474c);
                    } else {
                        r5 = r29;
                    }
                    if (libraryItemCounter != null) {
                        r5 = numValueOf2;
                        numValueOf = Integer.valueOf(libraryItemCounter.f19463i);
                    } else {
                        r5 = numValueOf2;
                        numValueOf = libraryItem2.f19419T;
                    }
                    boolean zM11650l = fa4.m11650l(r5, numValueOf);
                    if (!zM11650l || libraryItemDownload == null || libraryItemDownload.f19473b || !c2779e.f33115w.add(Integer.valueOf(i6))) {
                        r13 = r29;
                    } else {
                        ?? r14 = r29;
                        wfb.m23926u(lda.m16103C(c2779e), c2779e.f33108p, r14, new SearchViewModel$buildLibraryAdapterItems$1$1(c2779e, libraryItem2, r14), 2);
                        r13 = r14;
                    }
                    qq8Var = ar8Var.f7395g.contains(Integer.valueOf(i6)) ? new qq8(libraryItem2) : new pq8(libraryItem2, libraryItemCounter, zM11650l, (libraryItemDownload == null || libraryItemDownload.f19473b) ? false : true, libraryShelf.f19500h, libraryShelf.f19496d);
                }
                arrayList3.add(qq8Var);
                c2779e = c2779e;
                r29 = r13;
                it2 = it3;
                coroutineSingletons = coroutineSingletons2;
                linkedHashMap3 = linkedHashMap3;
                linkedHashMap = linkedHashMap;
                linkedHashMap2 = linkedHashMap2;
            }
            CoroutineSingletons coroutineSingletons3 = coroutineSingletons;
            if (arrayList3.isEmpty() && z) {
                ArrayList arrayList4 = new ArrayList(3);
                for (int i7 = 0; i7 < 3; i7++) {
                    arrayList4.add(new wq8(i7));
                }
                arrayList.addAll(arrayList4);
            } else {
                arrayList.addAll(arrayList3);
            }
            if (ar8Var.f7398j) {
                arrayList.add(rq8.f59726a);
            }
            jt8 jt8Var = new jt8(arrayList, z, ar8Var.f7404p != null);
            searchViewModel$special$$inlined$map$1$2$1.f33058b = 1;
            if (this.f33092a.emit(jt8Var, searchViewModel$special$$inlined$map$1$2$1) == coroutineSingletons3) {
                return coroutineSingletons3;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj2);
        }
        return xfa.f68157a;
    }
}
