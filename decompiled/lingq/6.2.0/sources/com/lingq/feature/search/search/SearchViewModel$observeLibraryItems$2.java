package com.lingq.feature.search.search;

import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.data.repository.C1296l;
import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.domain.model.library.LibraryItemType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3393o1;
import p000.ar8;
import p000.c32;
import p000.fa4;
import p000.lda;
import p000.m83;
import p000.nn1;
import p000.v91;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.search.search.SearchViewModel$observeLibraryItems$2", m4291f = "SearchViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class SearchViewModel$observeLibraryItems$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f33053a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f33054b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2779e f33055c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f33056d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$observeLibraryItems$2(long j, C2779e c2779e, int i, Continuation continuation) {
        super(2, continuation);
        this.f33054b = j;
        this.f33055c = c2779e;
        this.f33056d = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SearchViewModel$observeLibraryItems$2 searchViewModel$observeLibraryItems$2 = new SearchViewModel$observeLibraryItems$2(this.f33054b, this.f33055c, this.f33056d, continuation);
        searchViewModel$observeLibraryItems$2.f33053a = obj;
        return searchViewModel$observeLibraryItems$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        SearchViewModel$observeLibraryItems$2 searchViewModel$observeLibraryItems$2 = (SearchViewModel$observeLibraryItems$2) create((List) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        searchViewModel$observeLibraryItems$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2779e c2779e;
        C3244l c3244l;
        Object obj2;
        nn1 nn1Var;
        ar8 ar8VarM3015a;
        SearchViewModel$observeLibraryItems$2 searchViewModel$observeLibraryItems$2 = this;
        List list = (List) searchViewModel$observeLibraryItems$2.f33053a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C2779e c2779e2 = searchViewModel$observeLibraryItems$2.f33055c;
        nn1 nn1Var2 = c2779e2.f33108p;
        long jLongValue = ((Number) c2779e2.f33117y.getValue()).longValue();
        long j = searchViewModel$observeLibraryItems$2.f33054b;
        xfa xfaVar = xfa.f68157a;
        if (j == jLongValue) {
            C3244l c3244l2 = c2779e2.f33114v;
            while (true) {
                Object value = c3244l2.getValue();
                nn1 nn1Var3 = nn1Var2;
                ar8 ar8Var = (ar8) value;
                if (list.isEmpty() && !c2779e2.f33110r.m17895i() && searchViewModel$observeLibraryItems$2.f33056d == 1) {
                    nn1Var = nn1Var3;
                    c3244l = c3244l2;
                    c2779e = c2779e2;
                    obj2 = value;
                    ar8VarM3015a = ar8.m3015a(ar8Var, list, null, null, null, null, null, null, false, false, true, false, 0, null, null, null, null, 64894);
                } else {
                    c2779e = c2779e2;
                    c3244l = c3244l2;
                    obj2 = value;
                    nn1Var = nn1Var3;
                    ar8VarM3015a = !list.isEmpty() ? ar8.m3015a(ar8Var, list, null, null, null, null, null, null, false, false, false, false, 0, null, null, null, null, 65406) : ar8.m3015a(ar8Var, list, null, null, null, null, null, null, false, false, false, false, 0, null, null, null, null, 65534);
                }
                if (c3244l.m15570h(obj2, ar8VarM3015a)) {
                    break;
                }
                c3244l2 = c3244l;
                nn1Var2 = nn1Var;
                c2779e2 = c2779e;
                searchViewModel$observeLibraryItems$2 = this;
            }
            List<LibraryItem> list2 = list;
            ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
            for (LibraryItem libraryItem : list2) {
                arrayList.add(new Pair(new Integer(libraryItem.f19426a), libraryItem.f19428b));
            }
            C2779e c2779e3 = c2779e;
            nn1 nn1Var4 = nn1Var;
            AbstractC1263a.m7049d(new m83(AbstractC3224d.m15536o(((C1296l) c2779e3.f33098f.f36613a).m7317l(arrayList)), new SearchViewModel$observeCounters$1(c2779e3, null), 2), lda.m16103C(c2779e3), "libraryCounters", nn1Var4);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (fa4.m11650l(((Pair) obj3).f47624b, LibraryItemType.Content.getValue())) {
                    arrayList2.add(obj3);
                }
            }
            ArrayList arrayList3 = new ArrayList(v91.m23189q0(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(Integer.valueOf(((Number) ((Pair) it.next()).f47623a).intValue()));
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : arrayList) {
                if (fa4.m11650l(((Pair) obj4).f47624b, LibraryItemType.Collection.getValue())) {
                    arrayList4.add(obj4);
                }
            }
            ArrayList arrayList5 = new ArrayList(v91.m23189q0(arrayList4, 10));
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                arrayList5.add(Integer.valueOf(((Number) ((Pair) it2.next()).f47623a).intValue()));
            }
            AbstractC1263a.m7047b(lda.m16103C(c2779e3), nn1Var4, "fetchLessonCounters", new SearchViewModel$observeCounters$2(c2779e3, arrayList3, null));
            AbstractC1263a.m7047b(lda.m16103C(c2779e3), nn1Var4, "fetchCourseCounters", new SearchViewModel$observeCounters$3(c2779e3, arrayList5, null));
            ArrayList arrayList6 = new ArrayList(v91.m23189q0(list2, 10));
            for (LibraryItem libraryItem2 : list2) {
                arrayList6.add(new Pair(new Integer(libraryItem2.f19426a), libraryItem2.f19428b));
            }
            ArrayList arrayList7 = new ArrayList();
            for (Object obj5 : arrayList6) {
                if (fa4.m11650l(((Pair) obj5).f47624b, LibraryItemType.Content.getValue())) {
                    arrayList7.add(obj5);
                }
            }
            ArrayList arrayList8 = new ArrayList(v91.m23189q0(arrayList7, 10));
            Iterator it3 = arrayList7.iterator();
            while (it3.hasNext()) {
                arrayList8.add(Integer.valueOf(((Number) ((Pair) it3.next()).f47623a).intValue()));
            }
            if (!arrayList8.isEmpty()) {
                AbstractC1263a.m7047b(lda.m16103C(c2779e3), nn1Var4, "libraryDownloads", new SearchViewModel$observeDownloads$1(c2779e3, arrayList8, null));
            }
            ArrayList arrayList9 = new ArrayList();
            for (Object obj6 : list2) {
                if (fa4.m11650l(((LibraryItem) obj6).f19428b, LibraryItemType.Content.getValue())) {
                    arrayList9.add(obj6);
                }
            }
            ArrayList arrayList10 = new ArrayList(v91.m23189q0(arrayList9, 10));
            Iterator it4 = arrayList9.iterator();
            while (it4.hasNext()) {
                AbstractC3393o1.m17749x(((LibraryItem) it4.next()).f19426a, arrayList10);
            }
            if (!arrayList10.isEmpty()) {
                AbstractC1263a.m7047b(lda.m16103C(c2779e3), nn1Var4, "audioDownloads", new SearchViewModel$observeAudioDownloads$1(c2779e3, arrayList10, null));
                return xfaVar;
            }
        }
        return xfaVar;
    }
}
