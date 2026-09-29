package com.lingq.feature.vocabulary.state;

import com.lingq.core.domain.model.vocabulary.VocabularySearchQuery;
import com.lingq.core.settings.FilterType;
import com.lingq.feature.vocabulary.state.C2860b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.c18;
import p000.cma;
import p000.d65;
import p000.fa4;
import p000.fv8;
import p000.g43;
import p000.gm5;
import p000.i1b;
import p000.j1b;
import p000.jza;
import p000.kza;
import p000.lm4;
import p000.lza;
import p000.mza;
import p000.nn1;
import p000.nza;
import p000.ow8;
import p000.oza;
import p000.pg9;
import p000.pza;
import p000.qza;
import p000.rv0;
import p000.tza;
import p000.u91;
import p000.un1;
import p000.v91;
import p000.vi3;
import p000.vk9;
import p000.vma;
import p000.wfb;
import p000.wya;
import p000.wza;
import p000.xca;
import p000.xi9;
import p000.xo1;
import p000.y95;

/* JADX INFO: renamed from: com.lingq.feature.vocabulary.state.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2860b {

    /* JADX INFO: renamed from: a */
    public final vma f33772a;

    /* JADX INFO: renamed from: b */
    public final xo1 f33773b;

    /* JADX INFO: renamed from: c */
    public final d65 f33774c;

    /* JADX INFO: renamed from: d */
    public final lm4 f33775d;

    /* JADX INFO: renamed from: e */
    public final y95 f33776e;

    /* JADX INFO: renamed from: f */
    public final cma f33777f;

    /* JADX INFO: renamed from: g */
    public final nn1 f33778g;

    /* JADX INFO: renamed from: h */
    public final un1 f33779h;

    /* JADX INFO: renamed from: i */
    public final C3244l f33780i;

    /* JADX INFO: renamed from: j */
    public final c18 f33781j;

    /* JADX INFO: renamed from: k */
    public final C3244l f33782k;

    /* JADX INFO: renamed from: l */
    public final c18 f33783l;

    /* JADX INFO: renamed from: m */
    public VocabularySearchQuery f33784m;

    /* JADX INFO: renamed from: n */
    public pg9 f33785n;

    /* JADX INFO: renamed from: o */
    public pg9 f33786o;

    /* JADX INFO: renamed from: p */
    public final C3244l f33787p;

    /* JADX INFO: renamed from: q */
    public final C3244l f33788q;

    /* JADX INFO: renamed from: r */
    public final C3244l f33789r;

    /* JADX INFO: renamed from: s */
    public final C3244l f33790s;

    /* JADX INFO: renamed from: t */
    public final C3244l f33791t;

    /* JADX INFO: renamed from: u */
    public final C3244l f33792u;

    /* JADX INFO: renamed from: v */
    public final C3244l f33793v;

    public C2860b(vma vmaVar, xo1 xo1Var, d65 d65Var, lm4 lm4Var, y95 y95Var, cma cmaVar, nn1 nn1Var, un1 un1Var) {
        vmaVar.getClass();
        xo1Var.getClass();
        d65Var.getClass();
        lm4Var.getClass();
        y95Var.getClass();
        cmaVar.getClass();
        un1Var.getClass();
        this.f33772a = vmaVar;
        this.f33773b = xo1Var;
        this.f33774c = d65Var;
        this.f33775d = lm4Var;
        this.f33776e = y95Var;
        this.f33777f = cmaVar;
        this.f33778g = nn1Var;
        this.f33779h = un1Var;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(new tza(null));
        this.f33780i = c3244lM17114d;
        C3243k c3243k = xi9.f68262a;
        this.f33781j = AbstractC3224d.m15520B(c3244lM17114d, un1Var, c3243k, new tza(null));
        EmptyList emptyList = EmptyList.f47638a;
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(emptyList);
        this.f33782k = c3244lM17114d2;
        this.f33783l = AbstractC3224d.m15520B(c3244lM17114d2, un1Var, c3243k, emptyList);
        this.f33787p = AbstractC3352my.m17114d("");
        this.f33788q = AbstractC3352my.m17114d(emptyList);
        this.f33789r = AbstractC3352my.m17114d(emptyList);
        this.f33790s = AbstractC3352my.m17114d("");
        this.f33791t = AbstractC3352my.m17114d(emptyList);
        this.f33792u = AbstractC3352my.m17114d(emptyList);
        this.f33793v = AbstractC3352my.m17114d(emptyList);
    }

    /* JADX INFO: renamed from: a */
    public static final ArrayList m9762a(C2860b c2860b, ArrayList arrayList) {
        String str;
        Pair pair;
        c2860b.getClass();
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            wya wyaVar = (wya) it.next();
            String str2 = wyaVar.f67532b;
            String str3 = str2 == null ? "" : str2;
            VocabularySearchQuery vocabularySearchQuery = c2860b.f33784m;
            if (vocabularySearchQuery == null || (pair = vocabularySearchQuery.f19868j) == null || (str = (String) pair.f47623a) == null) {
                str = "All";
            }
            boolean zM11650l = fa4.m11650l(str2, str);
            String str4 = wyaVar.f67532b;
            if (str4 == null) {
                str4 = "key_all";
            }
            arrayList2.add(new fv8(1, null, str3, str4, zM11650l));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: b */
    public static final void m9763b(C2860b c2860b, boolean z) {
        Object value;
        g43 g43Var;
        C3244l c3244l = c2860b.f33780i;
        do {
            value = c3244l.getValue();
            g43Var = ((tza) value).f63152a;
        } while (!c3244l.m15570h(value, new tza(g43Var != null ? g43.m12349a(g43Var, null, z, 7) : null)));
    }

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
    /* JADX INFO: renamed from: c */
    public final void m9764c(qza qzaVar) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        g43 g43Var;
        qzaVar.getClass();
        int i = 4;
        if (qzaVar instanceof lza) {
            lza lzaVar = (lza) qzaVar;
            m9766e(new rv0(lzaVar.f50361a, lzaVar.f50362b, i));
        }
        boolean z = qzaVar instanceof kza;
        int i2 = 3;
        final int i3 = 0;
        C3244l c3244l = this.f33787p;
        final int i4 = 1;
        List list = EmptyList.f47638a;
        C3244l c3244l2 = this.f33780i;
        pg9 pg9VarM23926u = null;
        if (z) {
            FilterType filterType = ((kza) qzaVar).f48826a;
            c3244l.getClass();
            c3244l.m15572j(null, "");
            do {
                value7 = c3244l2.getValue();
                tza tzaVar = (tza) value7;
                g43Var = new g43(filterType, list, filterType == FilterType.Tags || filterType == FilterType.SRSDate, true);
                tzaVar.getClass();
            } while (!c3244l2.m15570h(value7, new tza(g43Var)));
            pg9 pg9Var = this.f33785n;
            if (pg9Var != null) {
                pg9Var.mo4537a(null);
            }
            int i5 = wza.f67574a[filterType.ordinal()];
            nn1 nn1Var = this.f33778g;
            un1 un1Var = this.f33779h;
            switch (i5) {
                case 1:
                    pg9VarM23926u = wfb.m23926u(un1Var, null, null, new VocabularyFilterSheetStateHolder$loadSortByItems$1(this, null), 3);
                    break;
                case 2:
                    pg9VarM23926u = wfb.m23926u(un1Var, null, null, new VocabularyFilterSheetStateHolder$loadSearchTermItems$1(this, null), 3);
                    break;
                case 3:
                    pg9VarM23926u = wfb.m23926u(un1Var, nn1Var, null, new VocabularyFilterSheetStateHolder$loadCourseItems$1(this, null), 2);
                    break;
                case 4:
                    pg9VarM23926u = wfb.m23926u(un1Var, nn1Var, null, new VocabularyFilterSheetStateHolder$loadLessonItems$1(this, null), 2);
                    break;
                case 5:
                    pg9VarM23926u = wfb.m23926u(un1Var, nn1Var, null, new VocabularyFilterSheetStateHolder$loadTagItems$1(this, null), 2);
                    break;
                case 6:
                    pg9VarM23926u = wfb.m23926u(un1Var, nn1Var, null, new VocabularyFilterSheetStateHolder$loadSrsDateItems$1(this, null), 2);
                    break;
            }
            this.f33785n = pg9VarM23926u;
            return;
        }
        boolean z2 = qzaVar instanceof oza;
        C3244l c3244l3 = this.f33790s;
        C3244l c3244l4 = this.f33789r;
        if (!z2) {
            if (qzaVar instanceof pza) {
                c3244l.m15571i(vk9.m23376L0(((pza) qzaVar).f57060a).toString());
                return;
            }
            if (qzaVar.equals(nza.f53480a)) {
                g43 g43Var2 = ((tza) c3244l2.getValue()).f63152a;
                if (g43Var2 == null) {
                    return;
                }
                int i6 = wza.f67574a[g43Var2.f40164a.ordinal()];
                if (i6 == 5) {
                    c3244l4.getClass();
                    c3244l4.m15572j(null, list);
                    m9766e(new ow8(28));
                    return;
                } else {
                    if (i6 != 6) {
                        return;
                    }
                    c3244l3.getClass();
                    c3244l3.m15572j(null, "");
                    m9766e(new ow8(29));
                    return;
                }
            }
            if (qzaVar.equals(mza.f52090a)) {
                do {
                    value2 = c3244l2.getValue();
                    ((tza) value2).getClass();
                } while (!c3244l2.m15570h(value2, new tza(null)));
                return;
            } else {
                if (!qzaVar.equals(jza.f46440a)) {
                    gm5.m12750e();
                    return;
                }
                do {
                    value = c3244l2.getValue();
                    ((tza) value).getClass();
                } while (!c3244l2.m15570h(value, new tza(null)));
                pg9 pg9Var2 = this.f33785n;
                if (pg9Var2 != null) {
                    pg9Var2.mo4537a(null);
                    return;
                }
                return;
            }
        }
        final String str = ((oza) qzaVar).f55339a;
        g43 g43Var3 = ((tza) c3244l2.getValue()).f63152a;
        if (g43Var3 == null) {
            return;
        }
        switch (wza.f67574a[g43Var3.f40164a.ordinal()]) {
            case 1:
                m9766e(new xca(str, i2));
                do {
                    value3 = c3244l2.getValue();
                    ((tza) value3).getClass();
                } while (!c3244l2.m15570h(value3, new tza(null)));
                break;
            case 2:
                m9766e(new xca(str, i));
                do {
                    value4 = c3244l2.getValue();
                    ((tza) value4).getClass();
                } while (!c3244l2.m15570h(value4, new tza(null)));
                break;
            case 3:
                m9766e(new vi3() { // from class: uza
                    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
                    /* JADX WARN: Code duplicated, block: B:40:0x0093  */
                    /* JADX WARN: Code duplicated, block: B:41:0x009a  */
                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        Object next;
                        pya pyaVar;
                        Integer numValueOf;
                        Pair pair;
                        pya pyaVar2;
                        Object next2;
                        Pair pair2;
                        wya wyaVar;
                        int i7 = i3;
                        xfa xfaVar = xfa.f68157a;
                        C2860b c2860b = this;
                        String str2 = str;
                        VocabularySearchQuery vocabularySearchQuery = (VocabularySearchQuery) obj;
                        switch (i7) {
                            case 0:
                                vocabularySearchQuery.getClass();
                                if (fa4.m11650l(str2, "key_all")) {
                                    pair = new Pair(null, null);
                                } else {
                                    Iterator it = ((Iterable) c2860b.f33792u.getValue()).iterator();
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
                                        pair = new Pair(str2, numValueOf);
                                    } while (!fa4.m11650l(pyaVar2 != null ? pyaVar2.f57002b : null, str2));
                                    pyaVar = (pya) next;
                                    if (pyaVar != null) {
                                        numValueOf = Integer.valueOf(pyaVar.f57001a);
                                    } else {
                                        numValueOf = null;
                                    }
                                    pair = new Pair(str2, numValueOf);
                                }
                                vocabularySearchQuery.f19867i = pair;
                                vocabularySearchQuery.f19868j = new Pair(null, null);
                                break;
                            default:
                                vocabularySearchQuery.getClass();
                                if (fa4.m11650l(str2, "key_all")) {
                                    pair2 = new Pair(null, null);
                                } else {
                                    Iterator it2 = ((Iterable) c2860b.f33793v.getValue()).iterator();
                                    do {
                                        if (it2.hasNext()) {
                                            next2 = it2.next();
                                            wyaVar = (wya) next2;
                                        } else {
                                            next2 = null;
                                        }
                                        wya wyaVar2 = (wya) next2;
                                        pair2 = new Pair(str2, wyaVar2 != null ? Integer.valueOf(wyaVar2.f67531a) : null);
                                    } while (!fa4.m11650l(wyaVar != null ? wyaVar.f67532b : null, str2));
                                    wya wyaVar3 = (wya) next2;
                                    pair2 = new Pair(str2, wyaVar3 != null ? Integer.valueOf(wyaVar3.f67531a) : null);
                                }
                                vocabularySearchQuery.f19868j = pair2;
                                break;
                        }
                        return xfaVar;
                    }
                });
                do {
                    value5 = c3244l2.getValue();
                    ((tza) value5).getClass();
                } while (!c3244l2.m15570h(value5, new tza(null)));
                break;
            case 4:
                m9766e(new vi3() { // from class: uza
                    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
                    /* JADX WARN: Code duplicated, block: B:40:0x0093  */
                    /* JADX WARN: Code duplicated, block: B:41:0x009a  */
                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        Object next;
                        pya pyaVar;
                        Integer numValueOf;
                        Pair pair;
                        pya pyaVar2;
                        Object next2;
                        Pair pair2;
                        wya wyaVar;
                        int i7 = i4;
                        xfa xfaVar = xfa.f68157a;
                        C2860b c2860b = this;
                        String str2 = str;
                        VocabularySearchQuery vocabularySearchQuery = (VocabularySearchQuery) obj;
                        switch (i7) {
                            case 0:
                                vocabularySearchQuery.getClass();
                                if (fa4.m11650l(str2, "key_all")) {
                                    pair = new Pair(null, null);
                                } else {
                                    Iterator it = ((Iterable) c2860b.f33792u.getValue()).iterator();
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
                                        pair = new Pair(str2, numValueOf);
                                    } while (!fa4.m11650l(pyaVar2 != null ? pyaVar2.f57002b : null, str2));
                                    pyaVar = (pya) next;
                                    if (pyaVar != null) {
                                        numValueOf = Integer.valueOf(pyaVar.f57001a);
                                    } else {
                                        numValueOf = null;
                                    }
                                    pair = new Pair(str2, numValueOf);
                                }
                                vocabularySearchQuery.f19867i = pair;
                                vocabularySearchQuery.f19868j = new Pair(null, null);
                                break;
                            default:
                                vocabularySearchQuery.getClass();
                                if (fa4.m11650l(str2, "key_all")) {
                                    pair2 = new Pair(null, null);
                                } else {
                                    Iterator it2 = ((Iterable) c2860b.f33793v.getValue()).iterator();
                                    do {
                                        if (it2.hasNext()) {
                                            next2 = it2.next();
                                            wyaVar = (wya) next2;
                                        } else {
                                            next2 = null;
                                        }
                                        wya wyaVar3 = (wya) next2;
                                        pair2 = new Pair(str2, wyaVar3 != null ? Integer.valueOf(wyaVar3.f67531a) : null);
                                    } while (!fa4.m11650l(wyaVar != null ? wyaVar.f67532b : null, str2));
                                    wya wyaVar4 = (wya) next2;
                                    pair2 = new Pair(str2, wyaVar4 != null ? Integer.valueOf(wyaVar4.f67531a) : null);
                                }
                                vocabularySearchQuery.f19868j = pair2;
                                break;
                        }
                        return xfaVar;
                    }
                });
                do {
                    value6 = c3244l2.getValue();
                    ((tza) value6).getClass();
                } while (!c3244l2.m15570h(value6, new tza(null)));
                break;
            case 5:
                ArrayList arrayListM22624p1 = u91.m22624p1((Collection) c3244l4.getValue());
                if (!fa4.m11650l(str, "key_all")) {
                    if (arrayListM22624p1.contains(str)) {
                        arrayListM22624p1.remove(str);
                    } else {
                        arrayListM22624p1.add(str);
                    }
                    list = arrayListM22624p1;
                }
                c3244l4.m15572j(null, list);
                m9766e(new vi3(this) { // from class: vza

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ C2860b f66146b;

                    {
                        this.f66146b = this;
                    }

                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        int i7 = i3;
                        xfa xfaVar = xfa.f68157a;
                        C2860b c2860b = this.f66146b;
                        VocabularySearchQuery vocabularySearchQuery = (VocabularySearchQuery) obj;
                        switch (i7) {
                            case 0:
                                vocabularySearchQuery.getClass();
                                vocabularySearchQuery.f19865g = u91.m22624p1((Collection) c2860b.f33789r.getValue());
                                break;
                            default:
                                vocabularySearchQuery.getClass();
                                String str2 = (String) c2860b.f33790s.getValue();
                                str2.getClass();
                                vocabularySearchQuery.f19864f = str2;
                                break;
                        }
                        return xfaVar;
                    }
                });
                break;
            case 6:
                String str2 = (String) u91.m22591I0(vk9.m23365A0(str, new String[]{"T"}, 0, 6));
                String str3 = str2 != null ? str2 : "";
                c3244l3.getClass();
                c3244l3.m15572j(null, str3);
                m9766e(new vi3(this) { // from class: vza

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ C2860b f66146b;

                    {
                        this.f66146b = this;
                    }

                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        int i7 = i4;
                        xfa xfaVar = xfa.f68157a;
                        C2860b c2860b = this.f66146b;
                        VocabularySearchQuery vocabularySearchQuery = (VocabularySearchQuery) obj;
                        switch (i7) {
                            case 0:
                                vocabularySearchQuery.getClass();
                                vocabularySearchQuery.f19865g = u91.m22624p1((Collection) c2860b.f33789r.getValue());
                                break;
                            default:
                                vocabularySearchQuery.getClass();
                                String str4 = (String) c2860b.f33790s.getValue();
                                str4.getClass();
                                vocabularySearchQuery.f19864f = str4;
                                break;
                        }
                        return xfaVar;
                    }
                });
                break;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m9765d() {
        wfb.m23926u(this.f33779h, this.f33778g, null, new VocabularyFilterSheetStateHolder$observeSearchQuery$1(this, null), 2);
    }

    /* JADX INFO: renamed from: e */
    public final void m9766e(vi3 vi3Var) {
        wfb.m23926u(this.f33779h, null, null, new VocabularyFilterSheetStateHolder$updateSearchQuery$1(this, vi3Var, null), 3);
    }

    /* JADX INFO: renamed from: f */
    public final void m9767f(List list) {
        Object value;
        g43 g43VarM12349a;
        C3244l c3244l = this.f33780i;
        g43 g43Var = ((tza) c3244l.getValue()).f63152a;
        if (g43Var == null) {
            return;
        }
        FilterType filterType = g43Var.f40164a;
        List list2 = list;
        ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new i1b((fv8) it.next()));
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (filterType == FilterType.Tags) {
            arrayList2.add(0, new j1b((String) this.f33787p.getValue()));
        }
        do {
            value = c3244l.getValue();
            g43VarM12349a = g43.m12349a(g43Var, arrayList2, false, 5);
            ((tza) value).getClass();
        } while (!c3244l.m15570h(value, new tza(g43VarM12349a)));
    }
}
