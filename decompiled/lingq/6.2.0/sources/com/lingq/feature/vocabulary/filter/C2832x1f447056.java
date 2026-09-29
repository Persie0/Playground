package com.lingq.feature.vocabulary.filter;

import com.lingq.core.domain.model.vocabulary.VocabularySearch;
import com.lingq.core.domain.model.vocabulary.VocabularySearchQuery;
import com.lingq.core.domain.model.vocabulary.VocabularySort;
import com.lingq.core.settings.FilterType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.aza;
import p000.bza;
import p000.cza;
import p000.f1b;
import p000.fa4;
import p000.gm5;
import p000.hza;
import p000.m1b;
import p000.pya;
import p000.u91;
import p000.uk9;
import p000.vi3;
import p000.vk9;
import p000.wya;
import p000.xfa;
import p000.zya;

/* JADX INFO: renamed from: com.lingq.feature.vocabulary.filter.VocabularyFilterSelectionScreenKt$VocabularyFilterSelectionRoute$1$1 */
/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class C2832x1f447056 extends FunctionReferenceImpl implements vi3 {
    /* JADX WARN: Code duplicated, block: B:46:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:69:0x0135  */
    /* JADX WARN: Code duplicated, block: B:70:0x013c  */
    @Override // p000.vi3
    public final Object invoke(Object obj) {
        VocabularySort vocabularySort;
        VocabularySearch vocabularySearch;
        Object next;
        pya pyaVar;
        Integer numValueOf;
        Pair pair;
        pya pyaVar2;
        Object next2;
        wya wyaVar;
        Integer numValueOf2;
        Pair pair2;
        wya wyaVar2;
        cza czaVar = (cza) obj;
        czaVar.getClass();
        C2850b c2850b = (C2850b) this.f47704b;
        FilterType filterType = c2850b.f33684i;
        C3244l c3244l = c2850b.f33701z;
        C3244l c3244l2 = c2850b.f33694s;
        if (czaVar instanceof aza) {
            String str = ((aza) czaVar).f7700a;
            C3244l c3244l3 = c2850b.f33696u;
            C3244l c3244l4 = c2850b.f33699x;
            int i = 0;
            switch (filterType == null ? -1 : hza.f43262a[filterType.ordinal()]) {
                case 2:
                    VocabularySearchQuery vocabularySearchQuery = (VocabularySearchQuery) c3244l.getValue();
                    if (vocabularySearchQuery != null) {
                        m1b m1bVar = VocabularySort.Companion;
                        VocabularySort[] vocabularySortArr = (VocabularySort[]) VocabularySort.class.getEnumConstants();
                        if (vocabularySortArr != null) {
                            int length = vocabularySortArr.length;
                            while (true) {
                                if (i >= length) {
                                    uk9.m22775i("Array contains no element matching the predicate.");
                                    return null;
                                }
                                vocabularySort = vocabularySortArr[i];
                                if (!fa4.m11650l(vocabularySort.getRoomColumnName(), str)) {
                                    i++;
                                }
                            }
                        } else {
                            vocabularySort = VocabularySort.AtoZ;
                            if (vocabularySort == null) {
                                C3386nv.m17635v("null cannot be cast to non-null type com.lingq.core.domain.model.vocabulary.VocabularySort");
                                return null;
                            }
                        }
                        vocabularySearchQuery.f19863e = vocabularySort;
                        c2850b.m9761W2(vocabularySearchQuery);
                    }
                    Boolean bool = Boolean.TRUE;
                    c3244l4.getClass();
                    c3244l4.m15572j(null, bool);
                    break;
                case 3:
                    VocabularySearchQuery vocabularySearchQuery2 = (VocabularySearchQuery) c3244l.getValue();
                    if (vocabularySearchQuery2 != null) {
                        f1b f1bVar = VocabularySearch.Companion;
                        VocabularySearch[] vocabularySearchArr = (VocabularySearch[]) VocabularySearch.class.getEnumConstants();
                        if (vocabularySearchArr != null) {
                            int length2 = vocabularySearchArr.length;
                            while (true) {
                                if (i >= length2) {
                                    uk9.m22775i("Array contains no element matching the predicate.");
                                    return null;
                                }
                                vocabularySearch = vocabularySearchArr[i];
                                if (!fa4.m11650l(vocabularySearch.getColumnName(), str)) {
                                    i++;
                                }
                            }
                        } else {
                            vocabularySearch = VocabularySearch.Contains;
                            if (vocabularySearch == null) {
                                C3386nv.m17635v("null cannot be cast to non-null type com.lingq.core.domain.model.vocabulary.VocabularySearch");
                                return null;
                            }
                        }
                        vocabularySearchQuery2.f19861c = vocabularySearch;
                        c2850b.m9761W2(vocabularySearchQuery2);
                    }
                    Boolean bool2 = Boolean.TRUE;
                    c3244l4.getClass();
                    c3244l4.m15572j(null, bool2);
                    break;
                case 4:
                    VocabularySearchQuery vocabularySearchQuery3 = (VocabularySearchQuery) c3244l.getValue();
                    if (vocabularySearchQuery3 != null) {
                        if (fa4.m11650l(str, "key_all")) {
                            pair = new Pair(null, null);
                        } else {
                            Iterator it = ((Iterable) c2850b.f33691p.getValue()).iterator();
                            do {
                                if (it.hasNext()) {
                                    next = it.next();
                                    pyaVar2 = (pya) next;
                                } else {
                                    next = null;
                                }
                                pyaVar = (pya) next;
                                if (pyaVar != null) {
                                    numValueOf = Integer.valueOf(pyaVar.f57001a);
                                } else {
                                    numValueOf = null;
                                }
                                pair = new Pair(str, numValueOf);
                            } while (!fa4.m11650l(pyaVar2 != null ? pyaVar2.f57002b : null, str));
                            pyaVar = (pya) next;
                            if (pyaVar != null) {
                                numValueOf = Integer.valueOf(pyaVar.f57001a);
                            } else {
                                numValueOf = null;
                            }
                            pair = new Pair(str, numValueOf);
                        }
                        vocabularySearchQuery3.f19867i = pair;
                        vocabularySearchQuery3.f19868j = new Pair(null, null);
                        c2850b.m9761W2(vocabularySearchQuery3);
                    }
                    Boolean bool3 = Boolean.TRUE;
                    c3244l4.getClass();
                    c3244l4.m15572j(null, bool3);
                    break;
                case 5:
                    VocabularySearchQuery vocabularySearchQuery4 = (VocabularySearchQuery) c3244l.getValue();
                    if (vocabularySearchQuery4 != null) {
                        if (fa4.m11650l(str, "key_all")) {
                            pair2 = new Pair(null, null);
                        } else {
                            Iterator it2 = ((Iterable) c2850b.f33692q.getValue()).iterator();
                            do {
                                if (it2.hasNext()) {
                                    next2 = it2.next();
                                    wyaVar2 = (wya) next2;
                                } else {
                                    next2 = null;
                                }
                                wyaVar = (wya) next2;
                                if (wyaVar != null) {
                                    numValueOf2 = Integer.valueOf(wyaVar.f67531a);
                                } else {
                                    numValueOf2 = null;
                                }
                                pair2 = new Pair(str, numValueOf2);
                            } while (!fa4.m11650l(wyaVar2 != null ? wyaVar2.f67532b : null, str));
                            wyaVar = (wya) next2;
                            if (wyaVar != null) {
                                numValueOf2 = Integer.valueOf(wyaVar.f67531a);
                            } else {
                                numValueOf2 = null;
                            }
                            pair2 = new Pair(str, numValueOf2);
                        }
                        vocabularySearchQuery4.f19868j = pair2;
                        c2850b.m9761W2(vocabularySearchQuery4);
                    }
                    Boolean bool4 = Boolean.TRUE;
                    c3244l4.getClass();
                    c3244l4.m15572j(null, bool4);
                    break;
                case 6:
                    ArrayList arrayListM22624p1 = u91.m22624p1((Collection) c3244l2.getValue());
                    if (fa4.m11650l(str, "key_all")) {
                        arrayListM22624p1.clear();
                    } else if (arrayListM22624p1.contains(str)) {
                        arrayListM22624p1.remove(str);
                    } else {
                        arrayListM22624p1.add(str);
                    }
                    c3244l2.m15572j(null, arrayListM22624p1);
                    VocabularySearchQuery vocabularySearchQuery5 = (VocabularySearchQuery) c3244l.getValue();
                    if (vocabularySearchQuery5 != null) {
                        vocabularySearchQuery5.f19865g = arrayListM22624p1;
                        c2850b.m9761W2(vocabularySearchQuery5);
                    }
                    break;
                case 7:
                    String str2 = (String) u91.m22591I0(vk9.m23365A0(str, new String[]{"T"}, 0, 6));
                    String str3 = str2 != null ? str2 : "";
                    c3244l3.getClass();
                    c3244l3.m15572j(null, str3);
                    VocabularySearchQuery vocabularySearchQuery6 = (VocabularySearchQuery) c3244l.getValue();
                    if (vocabularySearchQuery6 != null) {
                        String str4 = (String) c3244l3.getValue();
                        str4.getClass();
                        vocabularySearchQuery6.f19864f = str4;
                        c2850b.m9761W2(vocabularySearchQuery6);
                    }
                    break;
            }
        } else if (czaVar instanceof bza) {
            c2850b.f33685j.m15571i(vk9.m23376L0(((bza) czaVar).f9206a).toString());
        } else {
            if (!czaVar.equals(zya.f72396a)) {
                gm5.m12750e();
                return null;
            }
            c3244l2.getClass();
            c3244l2.m15572j(null, EmptyList.f47638a);
            VocabularySearchQuery vocabularySearchQuery7 = (VocabularySearchQuery) c3244l.getValue();
            if (vocabularySearchQuery7 != null) {
                if (filterType == FilterType.Tags) {
                    vocabularySearchQuery7.f19865g = u91.m22624p1((Collection) c3244l2.getValue());
                } else if (filterType == FilterType.SRSDate) {
                    vocabularySearchQuery7.f19864f = "";
                }
                c2850b.m9761W2(vocabularySearchQuery7);
            }
        }
        return xfa.f68157a;
    }
}
