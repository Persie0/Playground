package com.lingq.feature.reader.content.state;

import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.lesson.C1384f;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.lesson.LessonSentence;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.lesson.ReaderBookmarkMode;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.core.domain.model.status.TokenStatus;
import com.lingq.core.domain.model.status.WordStatus;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.domain.token.C1533a;
import com.lingq.core.domain.token.C1535c;
import com.lingq.core.domain.token.C1536d;
import com.lingq.core.domain.token.C1537e;
import com.lingq.core.token.TokenFragmentData;
import com.lingq.feature.reader.content.C2260a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.text.Regex;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3184kh;
import p000.AbstractC3352my;
import p000.C3540rl;
import p000.afd;
import p000.au3;
import p000.bed;
import p000.c18;
import p000.c83;
import p000.cl9;
import p000.cx1;
import p000.d27;
import p000.fa4;
import p000.fm3;
import p000.l70;
import p000.m83;
import p000.mv7;
import p000.nha;
import p000.nwa;
import p000.ox7;
import p000.pl3;
import p000.ql3;
import p000.sm3;
import p000.u91;
import p000.un1;
import p000.uv7;
import p000.v08;
import p000.v72;
import p000.v91;
import p000.vk9;
import p000.vv7;
import p000.vz1;
import p000.wbd;
import p000.wfb;
import p000.wz0;
import p000.xa2;
import p000.xi9;
import p000.xz7;
import p000.y7d;
import p000.yz4;

/* JADX INFO: renamed from: com.lingq.feature.reader.content.state.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2264a {

    /* JADX INFO: renamed from: A */
    public final c18 f28105A;

    /* JADX INFO: renamed from: B */
    public final c18 f28106B;

    /* JADX INFO: renamed from: C */
    public final C3244l f28107C;

    /* JADX INFO: renamed from: D */
    public final c18 f28108D;

    /* JADX INFO: renamed from: E */
    public final C3244l f28109E;

    /* JADX INFO: renamed from: F */
    public final c18 f28110F;

    /* JADX INFO: renamed from: G */
    public final c18 f28111G;

    /* JADX INFO: renamed from: a */
    public final C1533a f28112a;

    /* JADX INFO: renamed from: b */
    public final pl3 f28113b;

    /* JADX INFO: renamed from: c */
    public final C1537e f28114c;

    /* JADX INFO: renamed from: d */
    public final ql3 f28115d;

    /* JADX INFO: renamed from: e */
    public final C1384f f28116e;

    /* JADX INFO: renamed from: f */
    public final nha f28117f;

    /* JADX INFO: renamed from: g */
    public final xa2 f28118g;

    /* JADX INFO: renamed from: h */
    public final C1533a f28119h;

    /* JADX INFO: renamed from: i */
    public final C1536d f28120i;

    /* JADX INFO: renamed from: j */
    public final C1535c f28121j;

    /* JADX INFO: renamed from: k */
    public final C2260a f28122k;

    /* JADX INFO: renamed from: l */
    public final un1 f28123l;

    /* JADX INFO: renamed from: m */
    public final C3244l f28124m;

    /* JADX INFO: renamed from: n */
    public final C3244l f28125n;

    /* JADX INFO: renamed from: o */
    public final C3244l f28126o;

    /* JADX INFO: renamed from: p */
    public final C3244l f28127p;

    /* JADX INFO: renamed from: q */
    public boolean f28128q;

    /* JADX INFO: renamed from: r */
    public final LinkedHashSet f28129r;

    /* JADX INFO: renamed from: s */
    public final c18 f28130s;

    /* JADX INFO: renamed from: t */
    public final c18 f28131t;

    /* JADX INFO: renamed from: u */
    public final c18 f28132u;

    /* JADX INFO: renamed from: v */
    public final c18 f28133v;

    /* JADX INFO: renamed from: w */
    public final c18 f28134w;

    /* JADX INFO: renamed from: x */
    public final c18 f28135x;

    /* JADX INFO: renamed from: y */
    public final c18 f28136y;

    /* JADX INFO: renamed from: z */
    public final c18 f28137z;

    public C2264a(C1533a c1533a, pl3 pl3Var, C1537e c1537e, ql3 ql3Var, C1384f c1384f, nha nhaVar, xa2 xa2Var, C1533a c1533a2, C1536d c1536d, fm3 fm3Var, C1535c c1535c, C2260a c2260a, v72 v72Var, un1 un1Var) {
        c2260a.getClass();
        un1Var.getClass();
        this.f28112a = c1533a;
        this.f28113b = pl3Var;
        this.f28114c = c1537e;
        this.f28115d = ql3Var;
        this.f28116e = c1384f;
        this.f28117f = nhaVar;
        this.f28118g = xa2Var;
        this.f28119h = c1533a2;
        this.f28120i = c1536d;
        this.f28121j = c1535c;
        this.f28122k = c2260a;
        this.f28123l = un1Var;
        C3244l c3244lM17114d = AbstractC3352my.m17114d("");
        this.f28124m = c3244lM17114d;
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(0);
        this.f28125n = c3244lM17114d2;
        C3244l c3244lM17114d3 = AbstractC3352my.m17114d("");
        this.f28126o = c3244lM17114d3;
        C3244l c3244lM17114d4 = AbstractC3352my.m17114d(EmptyList.f47638a);
        this.f28127p = c3244lM17114d4;
        this.f28129r = new LinkedHashSet();
        c83 c83VarM15536o = AbstractC3224d.m15536o(((C1368a) fm3Var.f39280a).f18467z1);
        C3243k c3243k = xi9.f68262a;
        c18 c18VarM15520B = AbstractC3224d.m15520B(c83VarM15536o, un1Var, c3243k, Boolean.FALSE);
        this.f28130s = c18VarM15520B;
        c18 c18VarM15520B2 = AbstractC3224d.m15520B(AbstractC3224d.m15521C(new vv7(new C3228h(c3244lM17114d4, c3244lM17114d, new ReaderContentStateHolder$cards$1(3, null)), 0), new ReaderContentStateHolder$cards$3(this, null)), un1Var, c3243k, AbstractC3194a.m15360M());
        this.f28131t = c18VarM15520B2;
        c18 c18VarM15520B3 = AbstractC3224d.m15520B(AbstractC3224d.m15521C(new vv7(new C3228h(c3244lM17114d4, c3244lM17114d, new ReaderContentStateHolder$words$1(3, null)), 1), new ReaderContentStateHolder$words$3(this, null)), un1Var, c3243k, AbstractC3194a.m15360M());
        this.f28132u = c18VarM15520B3;
        c18 c18VarM15520B4 = AbstractC3224d.m15520B(AbstractC3224d.m15521C(new vv7(new C3228h(c3244lM17114d, c3244lM17114d2, new ReaderContentStateHolder$phrases$1(3, null)), 2), new ReaderContentStateHolder$special$$inlined$flatMapLatest$1(this, null)), un1Var, c3243k, AbstractC3194a.m15360M());
        c18 c18VarM15520B5 = AbstractC3224d.m15520B(AbstractC3224d.m15521C(new vv7(new C3228h(c3244lM17114d2, c3244lM17114d3, new ReaderContentStateHolder$lessonCwts$1(3, null)), 3), new ReaderContentStateHolder$special$$inlined$flatMapLatest$2(this, null)), un1Var, c3243k, AbstractC3194a.m15360M());
        this.f28133v = c18VarM15520B5;
        c18 c18VarM15520B6 = AbstractC3224d.m15520B(AbstractC3224d.m15536o(new C3228h(AbstractC3224d.m15530i(c18VarM15520B2, c18VarM15520B3, c18VarM15520B4, c18VarM15520B, c3244lM17114d3, new ReaderContentStateHolder$vocabSnapshot$1(null)), c18VarM15520B5, new ReaderContentStateHolder$vocabSnapshot$2(3, null))), un1Var, c3243k, new nwa(AbstractC3194a.m15360M(), AbstractC3194a.m15360M(), AbstractC3194a.m15360M(), false, "", AbstractC3194a.m15360M()));
        this.f28134w = c18VarM15520B6;
        c18 c18VarM15520B7 = AbstractC3224d.m15520B(new cx1(c18VarM15520B2, 2), un1Var, c3243k, 0);
        this.f28135x = c18VarM15520B7;
        c18 c18VarM15520B8 = AbstractC3224d.m15520B(new cx1(c18VarM15520B3, 3), un1Var, c3243k, 0);
        this.f28136y = c18VarM15520B8;
        c18 c18VarM15520B9 = AbstractC3224d.m15520B(new cx1(c18VarM15520B2, 4), un1Var, c3243k, 0);
        this.f28137z = c18VarM15520B9;
        c18 c18VarM15520B10 = AbstractC3224d.m15520B(new C3228h(c3244lM17114d4, c18VarM15520B3, new ReaderContentStateHolder$completionData$1(this, null)), un1Var, c3243k, new Pair(-1, 0));
        this.f28105A = c18VarM15520B10;
        this.f28106B = AbstractC3224d.m15520B(new cx1(c18VarM15520B10, 5), un1Var, c3243k, -1);
        C3244l c3244lM17114d5 = AbstractC3352my.m17114d(AbstractC3194a.m15360M());
        this.f28107C = c3244lM17114d5;
        this.f28108D = AbstractC3224d.m15520B(c3244lM17114d5, un1Var, c3243k, AbstractC3194a.m15360M());
        C3244l c3244lM17114d6 = AbstractC3352my.m17114d(AbstractC3194a.m15360M());
        this.f28109E = c3244lM17114d6;
        this.f28110F = AbstractC3224d.m15520B(c3244lM17114d6, un1Var, c3243k, AbstractC3194a.m15360M());
        this.f28111G = AbstractC3224d.m15520B(AbstractC3224d.m15530i(c3244lM17114d5, c3244lM17114d6, c18VarM15520B7, c18VarM15520B8, c18VarM15520B9, new ReaderContentStateHolder$vocabularyState$1(null)), un1Var, c3243k, new v08(AbstractC3194a.m15360M(), AbstractC3194a.m15360M(), 0, 0, 0));
        c18 c18VarM15520B11 = AbstractC3224d.m15520B(AbstractC3224d.m15536o(new mv7(c2260a.f27957w, 7)), un1Var, c3243k, 0);
        AbstractC3224d.m15545x(new m83(AbstractC3224d.m15544w(AbstractC3224d.m15546y(c3244lM17114d4, new ReaderContentStateHolder$startFlows$1(this, null)), v72Var), new ReaderContentStateHolder$startFlows$2(this, null), 2), un1Var);
        AbstractC3224d.m15545x(new m83(AbstractC3224d.m15544w(new C3540rl(new wz0(21, new C3228h(c18VarM15520B11, c18VarM15520B6, new ReaderContentStateHolder$startFlows$3(3, null)), this), 5), v72Var), new ReaderContentStateHolder$startFlows$5(this, null), 2), un1Var);
    }

    /* JADX INFO: renamed from: a */
    public static final Map m9259a(C2264a c2264a, List list, List list2, nwa nwaVar, Map map) {
        if (list2.isEmpty()) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            ox7 ox7Var = (ox7) u91.m22592J0(iIntValue, list);
            if (ox7Var != null) {
                int i = ox7Var.f55128a;
                Integer numValueOf = Integer.valueOf(i);
                ox7 ox7Var2 = (ox7) u91.m22592J0(iIntValue - 1, list);
                ox7 ox7Var3 = (ox7) u91.m22592J0(iIntValue + 1, list);
                Map map2 = nwaVar.f53336a;
                Map map3 = nwaVar.f53337b;
                Map map4 = nwaVar.f53338c;
                List list3 = ox7Var.f55132e;
                List list4 = list3;
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    LessonCard lessonCard = (LessonCard) map2.get(vz1.m23610P(((xz7) it2.next()).f69008e, c2264a.m9267i()));
                    if (lessonCard != null) {
                        arrayList.add(lessonCard);
                    }
                }
                int iM15363P = AbstractC3194a.m15363P(v91.m23189q0(arrayList, 10));
                if (iM15363P < 16) {
                    iM15363P = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM15363P);
                for (Object obj : arrayList) {
                    linkedHashMap2.put(vz1.m23610P(((LessonCard) obj).f19178a, c2264a.m9267i()), obj);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = list4.iterator();
                while (it3.hasNext()) {
                    LessonWord lessonWord = (LessonWord) map3.get(vz1.m23610P(((xz7) it3.next()).f69008e, c2264a.m9267i()));
                    if (lessonWord != null) {
                        arrayList2.add(lessonWord);
                    }
                }
                int iM15363P2 = AbstractC3194a.m15363P(v91.m23189q0(arrayList2, 10));
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iM15363P2 >= 16 ? iM15363P2 : 16);
                for (Object obj2 : arrayList2) {
                    linkedHashMap3.put(vz1.m23610P(((LessonWord) obj2).f19314a, c2264a.m9267i()), obj2);
                }
                ArrayList arrayListM23840a = wbd.m23840a(list3, linkedHashMap2, linkedHashMap3, c2264a.m9267i(), ox7Var.f55139l);
                List list5 = EmptyList.f47638a;
                ArrayList arrayListM22603U0 = u91.m22603U0(list4, ox7Var2 != null ? ox7Var2.f55132e : list5);
                if (ox7Var3 != null) {
                    list5 = ox7Var3.f55132e;
                }
                ArrayList arrayListM22603U1 = u91.m22603U0(list5, arrayListM22603U0);
                linkedHashMap.put(numValueOf, new d27(arrayListM23840a, afd.m361a(arrayListM22603U1, map4, c2264a.m9267i(), ox7Var.f55131d.length(), Integer.valueOf(i)), afd.m362b(arrayListM22603U1, map4, c2264a.m9267i(), Integer.valueOf(i))));
            }
        }
        return AbstractC3194a.m15371X(linkedHashMap);
    }

    /* JADX WARN: Code duplicated, block: B:135:0x0390  */
    /* JADX INFO: renamed from: b */
    public static final Map m9260b(C2264a c2264a, List list, List list2, nwa nwaVar, Map map) {
        Iterator it;
        Map map2;
        ArrayList arrayList;
        xz7 xz7Var;
        String str;
        Iterable iterableM22615g1;
        List list3;
        Map map3;
        int i;
        int i2;
        Iterator it2;
        if (list2.isEmpty()) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            ox7 ox7Var = (ox7) u91.m22592J0(((Number) it3.next()).intValue(), list);
            if (ox7Var == null) {
                it = it3;
            } else {
                Integer numValueOf = Integer.valueOf(ox7Var.f55128a);
                Map map4 = nwaVar.f53336a;
                Map map5 = nwaVar.f53337b;
                Map map6 = nwaVar.f53338c;
                boolean z = nwaVar.f53339d;
                String str2 = nwaVar.f53340e;
                Map map7 = nwaVar.f53341f;
                List list4 = ox7Var.f55132e;
                List list5 = list4;
                ArrayList arrayList2 = new ArrayList(v91.m23189q0(list5, 10));
                Iterator it4 = list5.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(vz1.m23610P(((xz7) it4.next()).f69008e, c2264a.m9267i()));
                }
                Collection collectionValues = map4.values();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : collectionValues) {
                    LessonCard lessonCard = (LessonCard) obj;
                    String str3 = lessonCard.f19178a;
                    int i3 = lessonCard.f19188k;
                    if (y7d.m24985d(str3)) {
                        it2 = it3;
                    } else {
                        it2 = it3;
                        if (i3 >= CardStatus.New.getValue() && i3 <= CardStatus.Familiar.getValue() && arrayList2.contains(vz1.m23610P(lessonCard.f19178a, c2264a.m9267i()))) {
                            arrayList3.add(obj);
                        }
                    }
                    it3 = it2;
                }
                it = it3;
                HashSet hashSet = new HashSet();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : arrayList3) {
                    if (hashSet.add(vz1.m23610P(((LessonCard) obj2).f19178a, c2264a.m9267i()))) {
                        arrayList4.add(obj2);
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Collection collectionValues2 = map6.values();
                ArrayList arrayList5 = new ArrayList();
                for (Object obj3 : collectionValues2) {
                    LessonCard lessonCard2 = (LessonCard) obj3;
                    boolean z2 = lessonCard2.f19182e;
                    int i4 = lessonCard2.f19188k;
                    if (z2 && i4 >= CardStatus.New.getValue() && i4 <= CardStatus.Familiar.getValue()) {
                        arrayList5.add(obj3);
                    }
                }
                Iterator it5 = arrayList5.iterator();
                while (it5.hasNext()) {
                    LessonCard lessonCard3 = (LessonCard) it5.next();
                    List listM15429h = new Regex("[ \\-]").m15429h(lessonCard3.f19178a);
                    if (listM15429h.isEmpty()) {
                        iterableM22615g1 = EmptyList.f47638a;
                        break;
                    }
                    ListIterator listIterator = listM15429h.listIterator(listM15429h.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            iterableM22615g1 = EmptyList.f47638a;
                            break;
                        }
                        if (((String) listIterator.previous()).length() != 0) {
                            iterableM22615g1 = u91.m22615g1(listM15429h, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                    Iterable iterable = iterableM22615g1;
                    Iterator it6 = it5;
                    ArrayList arrayList6 = new ArrayList(v91.m23189q0(iterable, 10));
                    Iterator it7 = iterable.iterator();
                    while (it7.hasNext()) {
                        arrayList6.add(vz1.m23610P((String) it7.next(), c2264a.m9267i()));
                    }
                    int size = arrayList2.size();
                    int i5 = 0;
                    int i6 = -1;
                    int i7 = 0;
                    int i8 = -1;
                    while (true) {
                        if (i5 >= size) {
                            list3 = list4;
                            map3 = map5;
                            break;
                        }
                        list3 = list4;
                        int i9 = ((xz7) list4.get(i5)).f69010g;
                        if (i7 <= 0 || i9 == i6) {
                            i = i7;
                        } else {
                            i = 0;
                            i6 = -1;
                            i8 = -1;
                        }
                        int i10 = size;
                        if (i < arrayList6.size()) {
                            int i11 = i;
                            map3 = map5;
                            if (cl9.m4834Q((String) arrayList2.get(i5), (String) arrayList6.get(i), true)) {
                                if (i11 == 0) {
                                    i8 = i5;
                                    i2 = i9;
                                } else {
                                    i2 = i6;
                                }
                                int i12 = i11 + 1;
                                if (i12 == arrayList6.size()) {
                                    linkedHashMap2.putIfAbsent(vz1.m23610P(lessonCard3.f19178a, c2264a.m9267i()), Integer.valueOf(i8));
                                    break;
                                }
                                i6 = i2;
                                i7 = i12;
                            }
                            i5++;
                            size = i10;
                            list4 = list3;
                            map5 = map3;
                        } else {
                            map3 = map5;
                        }
                        i6 = -1;
                        i7 = 0;
                        i8 = -1;
                        i5++;
                        size = i10;
                        list4 = list3;
                        map5 = map3;
                    }
                    it5 = it6;
                    list4 = list3;
                    map5 = map3;
                }
                List<xz7> list6 = list4;
                Map map8 = map5;
                Collection collectionValues3 = map6.values();
                ArrayList arrayList7 = new ArrayList();
                for (Object obj4 : collectionValues3) {
                    LessonCard lessonCard4 = (LessonCard) obj4;
                    if (lessonCard4.f19182e && linkedHashMap2.containsKey(vz1.m23610P(lessonCard4.f19178a, c2264a.m9267i()))) {
                        arrayList7.add(obj4);
                    }
                }
                HashSet hashSet2 = new HashSet();
                ArrayList arrayList8 = new ArrayList();
                for (Object obj5 : arrayList7) {
                    if (hashSet2.add(vz1.m23610P(((LessonCard) obj5).f19178a, c2264a.m9267i()))) {
                        arrayList8.add(obj5);
                    }
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it8 = arrayList4.iterator();
                while (it8.hasNext()) {
                    linkedHashSet.add(vz1.m23610P(((LessonCard) it8.next()).f19178a, c2264a.m9267i()));
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (xz7 xz7Var2 : list6) {
                    String strM23610P = vz1.m23610P(xz7Var2.f69008e, c2264a.m9267i());
                    if (!linkedHashMap3.containsKey(strM23610P)) {
                        linkedHashMap3.put(strM23610P, xz7Var2);
                    }
                }
                Collection collectionValues4 = map8.values();
                ArrayList arrayList9 = new ArrayList();
                Iterator it9 = collectionValues4.iterator();
                while (it9.hasNext()) {
                    Object next = it9.next();
                    LessonWord lessonWord = (LessonWord) next;
                    Iterator it10 = it9;
                    String strM23610P2 = vz1.m23610P(lessonWord.f19314a, c2264a.m9267i());
                    if (fa4.m11650l(lessonWord.f19322i, WordStatus.New.getValue()) && arrayList2.contains(strM23610P2) && !linkedHashSet.contains(strM23610P2)) {
                        arrayList9.add(next);
                    }
                    it9 = it10;
                }
                HashSet hashSet3 = new HashSet();
                ArrayList<LessonWord> arrayList10 = new ArrayList();
                for (Object obj6 : arrayList9) {
                    if (hashSet3.add(vz1.m23610P(((LessonWord) obj6).f19314a, c2264a.m9267i()))) {
                        arrayList10.add(obj6);
                    }
                }
                ArrayList arrayList11 = new ArrayList(v91.m23189q0(arrayList10, 10));
                for (LessonWord lessonWordM8073g : arrayList10) {
                    if (!z || str2.length() == 0 || !lessonWordM8073g.f19319f.isEmpty() || (xz7Var = (xz7) linkedHashMap3.get(vz1.m23610P(lessonWordM8073g.f19314a, c2264a.m9267i()))) == null || (str = (String) map7.get(new Pair(Integer.valueOf(xz7Var.f69010g), Integer.valueOf(xz7Var.f69011h)))) == null) {
                        map2 = map7;
                        arrayList = arrayList2;
                    } else {
                        if (vk9.m23391n0(str)) {
                            str = null;
                        }
                        if (str != null) {
                            map2 = map7;
                            arrayList = arrayList2;
                            lessonWordM8073g = LessonWord.m8073g(lessonWordM8073g, vz1.m23604J(new TokenMeaning(-33, str2, str, 0, false, str2, true, 0, 696)));
                        } else {
                            map2 = map7;
                            arrayList = arrayList2;
                        }
                    }
                    arrayList11.add(lessonWordM8073g);
                    arrayList2 = arrayList;
                    map7 = map2;
                    linkedHashMap3 = linkedHashMap3;
                }
                linkedHashMap.put(numValueOf, u91.m22614f1(u91.m22603U0(arrayList11, u91.m22603U0(arrayList8, arrayList4)), new uv7(c2264a, linkedHashMap2, arrayList2)));
            }
            it3 = it;
        }
        return AbstractC3194a.m15371X(linkedHashMap);
    }

    /* JADX INFO: renamed from: c */
    public static final void m9261c(C2264a c2264a, Set set) {
        LinkedHashSet linkedHashSet = c2264a.f28129r;
        if (c2264a.f28128q && !set.isEmpty() && ((Boolean) ((C3244l) c2264a.f28130s.f9311a).getValue()).booleanValue()) {
            String str = (String) c2264a.f28126o.getValue();
            int iIntValue = ((Number) c2264a.f28125n.getValue()).intValue();
            if (str.length() == 0 || iIntValue == 0) {
                return;
            }
            Map map = (Map) ((C3244l) c2264a.f28133v.f9311a).getValue();
            Map map2 = (Map) ((C3244l) c2264a.f28132u.f9311a).getValue();
            List list = (List) c2264a.f28127p.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (set.contains(Integer.valueOf(((ox7) obj).f55128a))) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                u91.m22630w0(((ox7) it.next()).f55132e, arrayList2);
            }
            ArrayList<xz7> arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                xz7 xz7Var = (xz7) next;
                Pair pair = new Pair(Integer.valueOf(xz7Var.f69010g), Integer.valueOf(xz7Var.f69011h));
                LessonWord lessonWord = (LessonWord) map2.get(vz1.m23610P(xz7Var.f69008e, c2264a.m9267i()));
                if (fa4.m11650l(lessonWord != null ? lessonWord.f19322i : null, WordStatus.New.getValue()) && !map.containsKey(pair) && !linkedHashSet.contains(pair)) {
                    arrayList3.add(next);
                }
            }
            ArrayList<sm3> arrayList4 = new ArrayList(v91.m23189q0(arrayList3, 10));
            for (xz7 xz7Var2 : arrayList3) {
                arrayList4.add(new sm3(xz7Var2.f69008e, xz7Var2.f69010g, xz7Var2.f69011h));
            }
            if (arrayList4.isEmpty()) {
                return;
            }
            for (sm3 sm3Var : arrayList4) {
                linkedHashSet.add(new Pair(Integer.valueOf(sm3Var.f61021b), Integer.valueOf(sm3Var.f61022c)));
            }
            wfb.m23926u(c2264a.f28123l, null, null, new ReaderContentStateHolder$fillMissingSentenceCwts$2(c2264a, str, iIntValue, arrayList4, null), 3);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final List m9262d(C2264a c2264a, List list, int i) {
        if (list.isEmpty()) {
            return EmptyList.f47638a;
        }
        int iM15945h = l70.m15945h(i, 0, list.size() - 1);
        ArrayList arrayListM23608N = vz1.m23608N(Integer.valueOf(iM15945h));
        int i2 = iM15945h - 1;
        int i3 = iM15945h + 1;
        if (i2 >= 0) {
            arrayListM23608N.add(Integer.valueOf(i2));
        }
        if (i3 <= list.size() - 1) {
            arrayListM23608N.add(Integer.valueOf(i3));
        }
        return arrayListM23608N;
    }

    /* JADX INFO: renamed from: e */
    public final void m9263e(LessonWord lessonWord) {
        lessonWord.getClass();
        wfb.m23926u(this.f28123l, null, null, new ReaderContentStateHolder$addWordAsCard$1(lessonWord, this, null), 3);
    }

    /* JADX INFO: renamed from: f */
    public final xz7 m9264f(int i, String str) {
        Object next;
        xz7 xz7Var;
        str.getClass();
        List list = (List) this.f28127p.getValue();
        if (!list.isEmpty() && i >= 0 && i < list.size()) {
            String strM23610P = vz1.m23610P(str, m9267i());
            ListBuilder listBuilderM23650t = vz1.m23650t();
            int i2 = i - 1;
            if (i2 >= 0) {
                listBuilderM23650t.add(Integer.valueOf(i2));
            }
            listBuilderM23650t.add(Integer.valueOf(i));
            int i3 = i + 1;
            if (i3 < list.size()) {
                listBuilderM23650t.add(Integer.valueOf(i3));
            }
            ListIterator listIterator = vz1.m23635i(listBuilderM23650t).listIterator(0);
            do {
                au3 au3Var = (au3) listIterator;
                if (au3Var.hasNext()) {
                    Iterator it = ((ox7) list.get(((Number) au3Var.next()).intValue())).f55132e.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!vz1.m23610P(((xz7) next).f69008e, m9267i()).equals(strM23610P));
                    xz7Var = (xz7) next;
                }
            } while (xz7Var == null);
            return xz7Var;
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final Integer m9265g(int i) {
        int i2;
        List list = (List) this.f28127p.getValue();
        xz7 xz7Var = null;
        if (i >= 0 && i < list.size()) {
            List list2 = ((ox7) list.get(i)).f55132e;
            xz7 xz7Var2 = (xz7) u91.m22591I0(list2);
            if (xz7Var2 != null) {
                if (list.size() > 1 && (i2 = i - 1) >= 0) {
                    xz7Var = (xz7) u91.m22598P0(((ox7) list.get(i2)).f55132e);
                }
                int i3 = xz7Var2.f69010g;
                int i4 = 1;
                while (i4 < list2.size() - 1 && ((xz7) list2.get(i4)).f69010g <= i3) {
                    i4++;
                }
                return (i4 >= list2.size() || xz7Var == null || i3 != xz7Var.f69010g) ? Integer.valueOf(((xz7) list2.get(i4 - 1)).f69009f) : Integer.valueOf(((xz7) list2.get(i4)).f69009f);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final TokenFragmentData m9266h(int i, List list) {
        Object next;
        String str;
        if (list.isEmpty()) {
            return new TokenFragmentData();
        }
        List list2 = (List) this.f28127p.getValue();
        if (list2.isEmpty() || i < 0 || i >= list2.size()) {
            return new TokenFragmentData();
        }
        ArrayList arrayList = new ArrayList();
        int i2 = i - 1;
        if (i2 >= 0) {
            arrayList.addAll(((ox7) list2.get(i2)).f55132e);
        }
        arrayList.addAll(((ox7) list2.get(i)).f55132e);
        int i3 = i + 1;
        if (i3 < list2.size()) {
            arrayList.addAll(((ox7) list2.get(i3)).f55132e);
        }
        int i4 = ((xz7) u91.m22589G0(list)).f69010g;
        Iterator it = ((yz4) ((C3244l) this.f28122k.f27957w.f9311a).getValue()).f70668b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((LessonSentence) next).f19256d != i4);
        LessonSentence lessonSentence = (LessonSentence) next;
        if (lessonSentence == null || (str = lessonSentence.f19254b) == null) {
            str = "";
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((xz7) obj).f69010g == i4) {
                arrayList2.add(obj);
            }
        }
        return bed.m3675a(arrayList2, list, str, AbstractC3184kh.m15194A((String) this.f28124m.getValue()));
    }

    /* JADX INFO: renamed from: i */
    public final Locale m9267i() {
        Locale localeForLanguageTag = Locale.forLanguageTag((String) this.f28124m.getValue());
        localeForLanguageTag.getClass();
        return localeForLanguageTag;
    }

    /* JADX INFO: renamed from: j */
    public final void m9268j(String str, String str2) {
        str.getClass();
        str2.getClass();
        wfb.m23926u(this.f28123l, null, null, new ReaderContentStateHolder$moveWordToKnownOrIgnored$1(this, str, str2, null), 3);
    }

    /* JADX INFO: renamed from: k */
    public final void m9269k(int i, ReaderBookmarkMode readerBookmarkMode) {
        readerBookmarkMode.getClass();
        wfb.m23926u(this.f28123l, null, null, new ReaderContentStateHolder$saveBookmark$1(this, i, readerBookmarkMode, null), 3);
    }

    /* JADX INFO: renamed from: l */
    public final void m9270l(String str, TokenStatus tokenStatus) {
        str.getClass();
        tokenStatus.getClass();
        wfb.m23926u(this.f28123l, null, null, new ReaderContentStateHolder$updateCardStatus$1(this, str, tokenStatus, null), 3);
    }
}
