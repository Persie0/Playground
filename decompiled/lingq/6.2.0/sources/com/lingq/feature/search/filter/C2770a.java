package com.lingq.feature.search.filter;

import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.data.repository.C1295k;
import com.lingq.core.domain.model.ContentType;
import com.lingq.core.domain.model.LearningLevel;
import com.lingq.core.domain.model.library.Accent;
import com.lingq.core.domain.model.library.C1469k;
import com.lingq.core.domain.model.library.CollectionsFilter;
import com.lingq.core.domain.model.library.CollectionsFilterLessonTag;
import com.lingq.core.domain.model.library.LibrarySearchQuery;
import com.lingq.core.p012ui.R$string;
import com.lingq.feature.search.filter.model.FilterType;
import com.lingq.feature.search.filter.model.ViewKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.AbstractC3423or;
import p000.AbstractC3584sr;
import p000.aq8;
import p000.at8;
import p000.bq8;
import p000.bt8;
import p000.c18;
import p000.c29;
import p000.cq8;
import p000.ct8;
import p000.dq8;
import p000.et8;
import p000.ev8;
import p000.fa4;
import p000.ft8;
import p000.gm5;
import p000.gq8;
import p000.gt8;
import p000.iv8;
import p000.jq8;
import p000.js8;
import p000.lq8;
import p000.m23;
import p000.m83;
import p000.md0;
import p000.n23;
import p000.nn1;
import p000.pp8;
import p000.q05;
import p000.qj2;
import p000.ql4;
import p000.qp8;
import p000.qv7;
import p000.rp8;
import p000.s19;
import p000.sp8;
import p000.sx7;
import p000.u19;
import p000.u91;
import p000.un1;
import p000.v19;
import p000.v91;
import p000.vi3;
import p000.vk9;
import p000.vp8;
import p000.vz1;
import p000.wp8;
import p000.xi9;
import p000.xp8;
import p000.y19;
import p000.yp8;
import p000.ys2;
import p000.yu8;

/* JADX INFO: renamed from: com.lingq.feature.search.filter.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2770a {

    /* JADX INFO: renamed from: a */
    public final qj2 f32906a;

    /* JADX INFO: renamed from: b */
    public final m23 f32907b;

    /* JADX INFO: renamed from: c */
    public final n23 f32908c;

    /* JADX INFO: renamed from: d */
    public final qj2 f32909d;

    /* JADX INFO: renamed from: e */
    public final nn1 f32910e;

    /* JADX INFO: renamed from: f */
    public final un1 f32911f;

    /* JADX INFO: renamed from: g */
    public final C3244l f32912g;

    /* JADX INFO: renamed from: h */
    public final c18 f32913h;

    /* JADX INFO: renamed from: i */
    public final C3244l f32914i;

    /* JADX INFO: renamed from: j */
    public final c18 f32915j;

    /* JADX INFO: renamed from: k */
    public final C3244l f32916k;

    /* JADX INFO: renamed from: l */
    public String f32917l;

    /* JADX INFO: renamed from: m */
    public String f32918m;

    /* JADX INFO: renamed from: n */
    public boolean f32919n;

    public C2770a(qj2 qj2Var, m23 m23Var, n23 n23Var, qj2 qj2Var2, nn1 nn1Var, un1 un1Var) {
        un1Var.getClass();
        this.f32906a = qj2Var;
        this.f32907b = m23Var;
        this.f32908c = n23Var;
        this.f32909d = qj2Var2;
        this.f32910e = nn1Var;
        this.f32911f = un1Var;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(AbstractC3194a.m15360M());
        this.f32912g = c3244lM17114d;
        C3243k c3243k = xi9.f68262a;
        this.f32913h = AbstractC3224d.m15520B(c3244lM17114d, un1Var, c3243k, AbstractC3194a.m15360M());
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(new gt8());
        this.f32914i = c3244lM17114d2;
        this.f32915j = AbstractC3224d.m15520B(c3244lM17114d2, un1Var, c3243k, new gt8());
        this.f32916k = AbstractC3352my.m17114d(new yu8());
        this.f32917l = "";
        this.f32918m = "";
        this.f32919n = true;
    }

    /* JADX INFO: renamed from: a */
    public final LibrarySearchQuery m9684a(String str) {
        C3244l c3244l = this.f32912g;
        if (((Map) c3244l.getValue()).get(str) == null) {
            m9690g(str, new qv7(20));
        }
        LibrarySearchQuery librarySearchQuery = (LibrarySearchQuery) ((Map) c3244l.getValue()).get(str);
        if (librarySearchQuery != null) {
            return librarySearchQuery;
        }
        return new LibrarySearchQuery(null, null, 0, null, 8191);
    }

    /* JADX INFO: renamed from: b */
    public final void m9685b(ct8 ct8Var, String str, String str2, boolean z, js8 js8Var) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        ct8Var.getClass();
        str2.getClass();
        m9688e(str, str2, z);
        boolean z2 = ct8Var instanceof at8;
        final int i = 1;
        C3244l c3244l = this.f32914i;
        C3244l c3244l2 = this.f32916k;
        if (z2) {
            final sp8 sp8Var = ((at8) ct8Var).f7471a;
            if (sp8Var instanceof rp8) {
                final int i2 = 0;
                m9690g(this.f32917l, new vi3() { // from class: kq8
                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        Object next;
                        int i3 = i2;
                        sp8 sp8Var2 = sp8Var;
                        switch (i3) {
                            case 0:
                                LibrarySearchQuery librarySearchQuery = (LibrarySearchQuery) obj;
                                librarySearchQuery.getClass();
                                C1469k c1469k = LibrarySearchQuery.Companion;
                                rp8 rp8Var = (rp8) sp8Var2;
                                int i4 = rp8Var.f59685a;
                                int i5 = rp8Var.f59686b;
                                c1469k.getClass();
                                return LibrarySearchQuery.m8091a(librarySearchQuery, null, C1469k.m8095a(i4, i5), null, null, null, null, null, false, 8189);
                            default:
                                LibrarySearchQuery librarySearchQuery2 = (LibrarySearchQuery) obj;
                                librarySearchQuery2.getClass();
                                Iterator<E> it = ContentType.getEntries().iterator();
                                while (it.hasNext()) {
                                    next = it.next();
                                    if (AbstractC3423or.m18221F((ContentType) next) == ((pp8) sp8Var2).f56636a) {
                                        return LibrarySearchQuery.m8091a(librarySearchQuery2, null, null, null, null, (ContentType) next, null, null, false, 7935);
                                    }
                                }
                                next = null;
                                return LibrarySearchQuery.m8091a(librarySearchQuery2, null, null, null, null, (ContentType) next, null, null, false, 7935);
                        }
                    }
                });
                js8Var.mo0a();
                return;
            }
            if (sp8Var instanceof pp8) {
                m9690g(this.f32917l, new vi3() { // from class: kq8
                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        Object next;
                        int i3 = i;
                        sp8 sp8Var2 = sp8Var;
                        switch (i3) {
                            case 0:
                                LibrarySearchQuery librarySearchQuery = (LibrarySearchQuery) obj;
                                librarySearchQuery.getClass();
                                C1469k c1469k = LibrarySearchQuery.Companion;
                                rp8 rp8Var = (rp8) sp8Var2;
                                int i4 = rp8Var.f59685a;
                                int i5 = rp8Var.f59686b;
                                c1469k.getClass();
                                return LibrarySearchQuery.m8091a(librarySearchQuery, null, C1469k.m8095a(i4, i5), null, null, null, null, null, false, 8189);
                            default:
                                LibrarySearchQuery librarySearchQuery2 = (LibrarySearchQuery) obj;
                                librarySearchQuery2.getClass();
                                Iterator<E> it = ContentType.getEntries().iterator();
                                while (it.hasNext()) {
                                    next = it.next();
                                    if (AbstractC3423or.m18221F((ContentType) next) == ((pp8) sp8Var2).f56636a) {
                                        return LibrarySearchQuery.m8091a(librarySearchQuery2, null, null, null, null, (ContentType) next, null, null, false, 7935);
                                    }
                                }
                                next = null;
                                return LibrarySearchQuery.m8091a(librarySearchQuery2, null, null, null, null, (ContentType) next, null, null, false, 7935);
                        }
                    }
                });
                js8Var.mo0a();
                return;
            }
            if (!(sp8Var instanceof qp8)) {
                gm5.m12750e();
                return;
            }
            FilterType filterType = ((qp8) sp8Var).f58031a;
            yu8 yu8Var = new yu8();
            c3244l2.getClass();
            c3244l2.m15572j(null, yu8Var);
            do {
                value5 = c3244l.getValue();
            } while (!c3244l.m15570h(value5, gt8.m12861a((gt8) value5, false, ft8.f39631a, null, new gq8(), filterType, 5)));
            int i3 = lq8.f50009a[filterType.ordinal()];
            if (i3 == 1) {
                m9689f();
                return;
            }
            if (i3 == 2) {
                m9687d();
                return;
            } else if (i3 == 3) {
                m9687d();
                return;
            } else {
                gm5.m12750e();
                return;
            }
        }
        if (!(ct8Var instanceof bt8)) {
            gm5.m12750e();
            return;
        }
        dq8 dq8Var = ((bt8) ct8Var).f8992a;
        boolean zM11650l = fa4.m11650l(dq8Var, aq8.f7368a);
        et8 et8Var = et8.f37830a;
        if (zM11650l) {
            do {
                value4 = c3244l.getValue();
            } while (!c3244l.m15570h(value4, gt8.m12861a((gt8) value4, false, et8Var, null, null, null, 13)));
            return;
        }
        if (!(dq8Var instanceof cq8)) {
            if (!(dq8Var instanceof bq8)) {
                gm5.m12750e();
                return;
            }
            String str3 = ((bq8) dq8Var).f8873a;
            FilterType filterType2 = ((gt8) c3244l.getValue()).f41306e;
            int i4 = filterType2 == null ? -1 : lq8.f50009a[filterType2.ordinal()];
            if (i4 != -1) {
                int i5 = 21;
                if (i4 == 1) {
                    m9690g(this.f32917l, new sx7(i5, str3, this));
                    do {
                        value = c3244l.getValue();
                    } while (!c3244l.m15570h(value, gt8.m12861a((gt8) value, false, et8Var, null, null, null, 13)));
                    js8Var.mo0a();
                    return;
                }
                if (i4 == 2) {
                    m9690g(this.f32917l, new ql4(str3, 22));
                    js8Var.mo0a();
                    return;
                } else if (i4 != 3) {
                    gm5.m12750e();
                    return;
                } else {
                    m9690g(this.f32917l, new ql4(str3, i5));
                    js8Var.mo0a();
                    return;
                }
            }
            return;
        }
        do {
            value2 = c3244l2.getValue();
        } while (!c3244l2.m15570h(value2, yu8.m25345a((yu8) value2, vk9.m23376L0(((cq8) dq8Var).f34392a).toString(), false, false, null, null, 30)));
        FilterType filterType3 = ((gt8) c3244l.getValue()).f41306e;
        int i6 = filterType3 == null ? -1 : lq8.f50009a[filterType3.ordinal()];
        if (i6 != -1) {
            if (i6 == 1) {
                m9689f();
                return;
            }
            if (i6 == 2) {
                m9687d();
                return;
            }
            if (i6 != 3) {
                gm5.m12750e();
                return;
            }
            if (vk9.m23391n0(((yu8) c3244l2.getValue()).f70490a)) {
                do {
                    value3 = c3244l2.getValue();
                } while (!c3244l2.m15570h(value3, yu8.m25345a((yu8) value3, null, false, false, null, EmptyList.f47638a, 9)));
                m9687d();
                return;
            }
            String str4 = ((yu8) c3244l2.getValue()).f70490a;
            str4.getClass();
            m83 m83Var = new m83(new m83(((C1295k) this.f32907b.f50448a).m7258P(str4), new SearchFiltersStateHolder$observeLessonTags$1(this, null)), new SearchFiltersStateHolder$observeLessonTags$2(this, null), 2);
            un1 un1Var = this.f32911f;
            nn1 nn1Var = this.f32910e;
            AbstractC1263a.m7049d(m83Var, un1Var, "observeSearchLessonTags", nn1Var);
            AbstractC1263a.m7047b(un1Var, nn1Var, "fetchSearchLessonTags", new SearchFiltersStateHolder$fetchLessonTags$1(this, null));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m9686c() {
        C3244l c3244l;
        Object value;
        ContentType contentType;
        List list;
        CollectionsFilter collectionsFilter;
        CollectionsFilter collectionsFilter2;
        CollectionsFilter collectionsFilter3;
        List list2;
        if (vk9.m23391n0(this.f32917l)) {
            return;
        }
        LibrarySearchQuery librarySearchQuery = (LibrarySearchQuery) ((Map) this.f32912g.getValue()).get(this.f32917l);
        Pair pairM8092b = librarySearchQuery != null ? librarySearchQuery.m8092b() : new Pair(LearningLevel.Beginner1, LearningLevel.Advanced2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new v19(vz1.m23605K(Integer.valueOf(R$string.levels_beginner), Integer.valueOf(R$string.levels_intermediate), Integer.valueOf(R$string.levels_advanced)), ((LearningLevel) pairM8092b.f47623a).ordinal(), ((LearningLevel) pairM8092b.f47624b).ordinal(), ViewKeys.Levels, LearningLevel.getEntries().size() - 1.0f));
        arrayList.add(new c29(R$string.lingq_tags));
        ArrayList arrayList2 = null;
        String strM22596N0 = (librarySearchQuery == null || (list2 = librarySearchQuery.f19486h) == null) ? null : u91.m22596N0(list2, ",", null, null, null, 62);
        if (strM22596N0 == null) {
            strM22596N0 = "";
        }
        arrayList.add(new s19(strM22596N0, Integer.valueOf(com.lingq.feature.search.R$string.search_add_tags), null, ViewKeys.LessonTags, 4));
        arrayList.add(new c29(com.lingq.feature.search.R$string.search_provider_shared_by));
        arrayList.add(new y19((librarySearchQuery == null || (collectionsFilter3 = librarySearchQuery.f19489k) == null) ? null : collectionsFilter3.f19338b, (librarySearchQuery == null || (collectionsFilter2 = librarySearchQuery.f19489k) == null) ? null : collectionsFilter2.f19339c, (librarySearchQuery == null || (collectionsFilter = librarySearchQuery.f19489k) == null) ? null : collectionsFilter.f19340d, ViewKeys.ProviderSharedBy));
        if (AbstractC3423or.m18284x(this.f32918m) && this.f32919n) {
            arrayList.add(new c29(R$string.accent));
            if (librarySearchQuery != null && (list = librarySearchQuery.f19490l) != null) {
                List list3 = list;
                arrayList2 = new ArrayList(v91.m23189q0(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Integer.valueOf(AbstractC3423or.m18253f0((Accent) it.next(), this.f32918m)));
                }
            }
            arrayList.add(new s19(null, null, arrayList2, ViewKeys.Accent, 2));
        }
        arrayList.add(new c29(com.lingq.feature.search.R$string.search_content_type));
        ys2 entries = ContentType.getEntries();
        ArrayList arrayList3 = new ArrayList(v91.m23189q0(entries, 10));
        Iterator<E> it2 = entries.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Integer.valueOf(AbstractC3423or.m18221F((ContentType) it2.next())));
        }
        arrayList.add(new u19(arrayList3, (librarySearchQuery == null || (contentType = librarySearchQuery.f19487i) == null) ? 0 : contentType.ordinal(), ViewKeys.ContentTypes));
        do {
            c3244l = this.f32914i;
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, gt8.m12861a((gt8) value, false, null, new jq8(arrayList), null, null, 27)));
    }

    /* JADX INFO: renamed from: d */
    public final void m9687d() {
        ArrayList arrayList;
        LibrarySearchQuery librarySearchQuery;
        CollectionsFilter collectionsFilter;
        CollectionsFilter collectionsFilter2;
        Object value;
        List list;
        List list2;
        C3244l c3244l = this.f32914i;
        FilterType filterType = ((gt8) c3244l.getValue()).f41306e;
        if (filterType == null) {
            return;
        }
        yu8 yu8Var = (yu8) this.f32916k.getValue();
        int i = lq8.f50009a[filterType.ordinal()];
        C3244l c3244l2 = this.f32912g;
        if (i != 1) {
            List list3 = EmptyList.f47638a;
            if (i == 2) {
                LibrarySearchQuery librarySearchQuery2 = (LibrarySearchQuery) ((Map) c3244l2.getValue()).get(this.f32917l);
                if (librarySearchQuery2 != null && (list = librarySearchQuery2.f19490l) != null) {
                    list3 = list;
                }
                List<Accent> listM18280t = AbstractC3423or.m18280t(this.f32918m);
                ArrayList arrayList2 = new ArrayList(v91.m23189q0(listM18280t, 10));
                for (Accent accent : listM18280t) {
                    arrayList2.add(new xp8(new ev8(2, Integer.valueOf(AbstractC3423or.m18253f0(accent, this.f32918m)), null, accent.getValue(), list3.contains(accent))));
                }
                arrayList = arrayList2;
            } else {
                if (i != 3) {
                    gm5.m12750e();
                    return;
                }
                arrayList = new ArrayList();
                String str = yu8Var.f70490a;
                LibrarySearchQuery librarySearchQuery3 = (LibrarySearchQuery) ((Map) c3244l2.getValue()).get(this.f32917l);
                if (librarySearchQuery3 != null && (list2 = librarySearchQuery3.f19486h) != null) {
                    list3 = list2;
                }
                arrayList.add(new wp8(R$string.lingq_tags, str));
                if (vk9.m23391n0(str)) {
                    List<String> list4 = list3;
                    ArrayList arrayList3 = new ArrayList(v91.m23189q0(list4, 10));
                    for (String str2 : list4) {
                        arrayList3.add(new xp8(new ev8(1, null, str2, str2, true)));
                    }
                    arrayList.addAll(arrayList3);
                } else {
                    List list5 = yu8Var.f70494e;
                    ArrayList arrayList4 = new ArrayList(v91.m23189q0(list5, 10));
                    Iterator it = list5.iterator();
                    while (it.hasNext()) {
                        String str3 = ((CollectionsFilterLessonTag) it.next()).f19341a;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String str4 = str3;
                        arrayList4.add(new xp8(new ev8(1, null, str4, str4, list3.contains(str4))));
                    }
                    arrayList.addAll(arrayList4);
                }
                if (yu8Var.f70492c) {
                    arrayList.add(new vp8(com.lingq.feature.search.R$string.search_no_results));
                }
            }
        } else {
            arrayList = new ArrayList();
            String str5 = yu8Var.f70490a;
            boolean z = yu8Var.f70491b;
            LibrarySearchQuery librarySearchQuery4 = (LibrarySearchQuery) ((Map) c3244l2.getValue()).get(this.f32917l);
            String str6 = (librarySearchQuery4 == null || (collectionsFilter2 = librarySearchQuery4.f19489k) == null) ? null : collectionsFilter2.f19338b;
            arrayList.add(new wp8(R$string.welcome_username, str5));
            if (!z) {
                arrayList.add(new yp8(new iv8("All", null, str6 == null, "", null)));
            }
            if (vk9.m23391n0(str5) && (librarySearchQuery = (LibrarySearchQuery) ((Map) c3244l2.getValue()).get(this.f32917l)) != null && (collectionsFilter = librarySearchQuery.f19489k) != null) {
                String str7 = collectionsFilter.f19338b;
                arrayList.add(new yp8(new iv8(str7, collectionsFilter.f19339c, true, str7, collectionsFilter.f19340d)));
            }
            if (!z) {
                List list6 = yu8Var.f70493d;
                ArrayList<CollectionsFilter> arrayList5 = new ArrayList();
                for (Object obj : list6) {
                    if (!fa4.m11650l(((CollectionsFilter) obj).f19338b, str6) || !vk9.m23391n0(str5)) {
                        arrayList5.add(obj);
                    }
                }
                ArrayList arrayList6 = new ArrayList(v91.m23189q0(arrayList5, 10));
                for (CollectionsFilter collectionsFilter3 : arrayList5) {
                    String str8 = collectionsFilter3.f19338b;
                    arrayList6.add(new yp8(new iv8(str8, collectionsFilter3.f19339c, fa4.m11650l(str8, str6), collectionsFilter3.f19338b, collectionsFilter3.f19340d)));
                }
                arrayList.addAll(arrayList6);
            }
            if (yu8Var.f70492c) {
                arrayList.add(new vp8(com.lingq.feature.search.R$string.search_no_results));
            }
        }
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, gt8.m12861a((gt8) value, false, null, null, new gq8(arrayList, yu8Var.f70491b), null, 23)));
    }

    /* JADX INFO: renamed from: e */
    public final void m9688e(String str, String str2, boolean z) {
        str2.getClass();
        this.f32917l = str;
        this.f32918m = str2;
        this.f32919n = z;
        if (vk9.m23391n0(str)) {
            return;
        }
        if (((Map) this.f32912g.getValue()).get(str) == null) {
            m9690g(str, new qv7(20));
        } else {
            m9686c();
            m9687d();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m9689f() {
        String str = this.f32918m;
        String str2 = ((yu8) this.f32916k.getValue()).f70490a;
        str.getClass();
        str2.getClass();
        C1295k c1295k = (C1295k) this.f32906a.f57848a;
        c1295k.getClass();
        q05 q05Var = (q05) c1295k.f16498b;
        q05Var.getClass();
        m83 m83Var = new m83(new m83(AbstractC3224d.m15536o(AbstractC3584sr.m21590A(q05Var.f57071K, true, new String[]{"SharedByUserEntity", "SharedByUserAndQueryJoin"}, new md0(str2, 13, str))), new SearchFiltersStateHolder$observeSharedByUsers$1(this, null)), new SearchFiltersStateHolder$observeSharedByUsers$2(this, null), 2);
        un1 un1Var = this.f32911f;
        nn1 nn1Var = this.f32910e;
        AbstractC1263a.m7049d(m83Var, un1Var, "observeSearchSharedByUsers", nn1Var);
        AbstractC1263a.m7047b(un1Var, nn1Var, "fetchSearchSharedByUsers", new SearchFiltersStateHolder$fetchSharedByUsers$1(this, null));
    }

    /* JADX INFO: renamed from: g */
    public final void m9690g(String str, vi3 vi3Var) {
        C3244l c3244l;
        Object value;
        LinkedHashMap linkedHashMapM15372Y;
        LibrarySearchQuery librarySearchQuery;
        List list;
        List list2;
        Map map;
        Map map2;
        if (vk9.m23391n0(str)) {
            return;
        }
        do {
            c3244l = this.f32912g;
            value = c3244l.getValue();
            linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) value);
            LibrarySearchQuery librarySearchQuery2 = (LibrarySearchQuery) linkedHashMapM15372Y.get(str);
            if (librarySearchQuery2 != null) {
                LibrarySearchQuery librarySearchQuery3 = (LibrarySearchQuery) linkedHashMapM15372Y.get(str);
                LinkedHashMap linkedHashMap = (librarySearchQuery3 == null || (map2 = librarySearchQuery3.f19479a) == null) ? new LinkedHashMap() : new LinkedHashMap(map2);
                LibrarySearchQuery librarySearchQuery4 = (LibrarySearchQuery) linkedHashMapM15372Y.get(str);
                LinkedHashMap linkedHashMap2 = (librarySearchQuery4 == null || (map = librarySearchQuery4.f19480b) == null) ? new LinkedHashMap() : new LinkedHashMap(map);
                LibrarySearchQuery librarySearchQuery5 = (LibrarySearchQuery) linkedHashMapM15372Y.get(str);
                ArrayList arrayList = (librarySearchQuery5 == null || (list2 = librarySearchQuery5.f19486h) == null) ? new ArrayList() : new ArrayList(list2);
                LibrarySearchQuery librarySearchQuery6 = (LibrarySearchQuery) linkedHashMapM15372Y.get(str);
                librarySearchQuery = LibrarySearchQuery.m8091a(librarySearchQuery2, linkedHashMap, linkedHashMap2, null, arrayList, null, null, (librarySearchQuery6 == null || (list = librarySearchQuery6.f19490l) == null) ? new ArrayList() : new ArrayList(list), false, 6012);
            } else {
                C1469k c1469k = LibrarySearchQuery.Companion;
                int iOrdinal = LearningLevel.Beginner1.ordinal();
                int iOrdinal2 = LearningLevel.Advanced2.ordinal();
                c1469k.getClass();
                librarySearchQuery = new LibrarySearchQuery(null, C1469k.m8095a(iOrdinal, iOrdinal2), 0, null, 8189);
            }
            linkedHashMapM15372Y.put(str, vi3Var.invoke(librarySearchQuery));
        } while (!c3244l.m15570h(value, linkedHashMapM15372Y));
        m9686c();
        m9687d();
    }
}
