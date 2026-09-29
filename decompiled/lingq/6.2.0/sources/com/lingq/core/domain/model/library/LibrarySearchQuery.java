package com.lingq.core.domain.model.library;

import com.lingq.core.domain.model.ContentType;
import com.lingq.core.domain.model.LearningLevel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import p000.AbstractC3393o1;
import p000.cs4;
import p000.e65;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.uf4;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class LibrarySearchQuery {
    public static final C1469k Companion = new C1469k();

    /* JADX INFO: renamed from: n */
    public static final cs4[] f19478n;

    /* JADX INFO: renamed from: a */
    public final Map f19479a;

    /* JADX INFO: renamed from: b */
    public final Map f19480b;

    /* JADX INFO: renamed from: c */
    public final int f19481c;

    /* JADX INFO: renamed from: d */
    public final Sort f19482d;

    /* JADX INFO: renamed from: e */
    public final boolean f19483e;

    /* JADX INFO: renamed from: f */
    public final boolean f19484f;

    /* JADX INFO: renamed from: g */
    public final boolean f19485g;

    /* JADX INFO: renamed from: h */
    public final List f19486h;

    /* JADX INFO: renamed from: i */
    public final ContentType f19487i;

    /* JADX INFO: renamed from: j */
    public final CollectionsFilterProvider f19488j;

    /* JADX INFO: renamed from: k */
    public final CollectionsFilter f19489k;

    /* JADX INFO: renamed from: l */
    public final List f19490l;

    /* JADX INFO: renamed from: m */
    public final boolean f19491m;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f19478n = new cs4[]{AbstractC3192a.m15357b(lazyThreadSafetyMode, new uf4(16)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new uf4(17)), null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new uf4(18)), null, null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new uf4(19)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new uf4(20)), null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new uf4(21)), null};
    }

    public /* synthetic */ LibrarySearchQuery(int i, Map map, Map map2, int i2, Sort sort, boolean z, boolean z2, boolean z3, List list, ContentType contentType, CollectionsFilterProvider collectionsFilterProvider, CollectionsFilter collectionsFilter, List list2, boolean z4) {
        this.f19479a = (i & 1) == 0 ? new LinkedHashMap() : map;
        if ((i & 2) == 0) {
            this.f19480b = new LinkedHashMap();
        } else {
            this.f19480b = map2;
        }
        if ((i & 4) == 0) {
            this.f19481c = 20;
        } else {
            this.f19481c = i2;
        }
        if ((i & 8) == 0) {
            this.f19482d = Sort.Newest;
        } else {
            this.f19482d = sort;
        }
        if ((i & 16) == 0) {
            this.f19483e = false;
        } else {
            this.f19483e = z;
        }
        if ((i & 32) == 0) {
            this.f19484f = false;
        } else {
            this.f19484f = z2;
        }
        if ((i & 64) == 0) {
            this.f19485g = false;
        } else {
            this.f19485g = z3;
        }
        if ((i & 128) == 0) {
            this.f19486h = new ArrayList();
        } else {
            this.f19486h = list;
        }
        if ((i & 256) == 0) {
            this.f19487i = null;
        } else {
            this.f19487i = contentType;
        }
        if ((i & 512) == 0) {
            this.f19488j = null;
        } else {
            this.f19488j = collectionsFilterProvider;
        }
        if ((i & 1024) == 0) {
            this.f19489k = null;
        } else {
            this.f19489k = collectionsFilter;
        }
        if ((i & 2048) == 0) {
            this.f19490l = new ArrayList();
        } else {
            this.f19490l = list2;
        }
        if ((i & 4096) == 0) {
            this.f19491m = false;
        } else {
            this.f19491m = z4;
        }
    }

    /* JADX INFO: renamed from: a */
    public static LibrarySearchQuery m8091a(LibrarySearchQuery librarySearchQuery, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, Sort sort, ArrayList arrayList, ContentType contentType, CollectionsFilter collectionsFilter, ArrayList arrayList2, boolean z, int i) {
        Map map = (i & 1) != 0 ? librarySearchQuery.f19479a : linkedHashMap;
        Map map2 = (i & 2) != 0 ? librarySearchQuery.f19480b : linkedHashMap2;
        int i2 = librarySearchQuery.f19481c;
        Sort sort2 = (i & 8) != 0 ? librarySearchQuery.f19482d : sort;
        boolean z2 = librarySearchQuery.f19483e;
        boolean z3 = librarySearchQuery.f19484f;
        boolean z4 = librarySearchQuery.f19485g;
        List list = (i & 128) != 0 ? librarySearchQuery.f19486h : arrayList;
        ContentType contentType2 = (i & 256) != 0 ? librarySearchQuery.f19487i : contentType;
        CollectionsFilterProvider collectionsFilterProvider = librarySearchQuery.f19488j;
        CollectionsFilter collectionsFilter2 = (i & 1024) != 0 ? librarySearchQuery.f19489k : collectionsFilter;
        List list2 = (i & 2048) != 0 ? librarySearchQuery.f19490l : arrayList2;
        boolean z5 = (i & 4096) != 0 ? librarySearchQuery.f19491m : z;
        librarySearchQuery.getClass();
        map.getClass();
        map2.getClass();
        sort2.getClass();
        list.getClass();
        list2.getClass();
        return new LibrarySearchQuery(map, map2, i2, sort2, z2, z3, z4, list, contentType2, collectionsFilterProvider, collectionsFilter2, list2, z5);
    }

    /* JADX INFO: renamed from: b */
    public final Pair m8092b() {
        LearningLevel learningLevel = LearningLevel.Beginner1;
        LearningLevel learningLevel2 = LearningLevel.Advanced2;
        while (true) {
            Map map = this.f19480b;
            Object obj = map.get(learningLevel);
            Boolean bool = Boolean.FALSE;
            if (!fa4.m11650l(obj, bool) && !fa4.m11650l(map.get(learningLevel2), bool)) {
                return new Pair(learningLevel, learningLevel2);
            }
            if (fa4.m11650l(map.get(learningLevel), bool)) {
                int iOrdinal = learningLevel.ordinal() + 1;
                if (iOrdinal >= LearningLevel.getEntries().size()) {
                    LearningLevel learningLevel3 = LearningLevel.Beginner1;
                    return new Pair(learningLevel3, learningLevel3);
                }
                learningLevel = ((LearningLevel[]) LearningLevel.getEntries().toArray(new LearningLevel[0]))[iOrdinal];
            }
            if (fa4.m11650l(map.get(learningLevel2), bool)) {
                int iOrdinal2 = learningLevel2.ordinal() - 1;
                if (iOrdinal2 < 0) {
                    LearningLevel learningLevel4 = LearningLevel.Beginner1;
                    return new Pair(learningLevel4, learningLevel4);
                }
                learningLevel2 = ((LearningLevel[]) LearningLevel.getEntries().toArray(new LearningLevel[0]))[iOrdinal2];
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LibrarySearchQuery)) {
            return false;
        }
        LibrarySearchQuery librarySearchQuery = (LibrarySearchQuery) obj;
        return fa4.m11650l(this.f19479a, librarySearchQuery.f19479a) && fa4.m11650l(this.f19480b, librarySearchQuery.f19480b) && this.f19481c == librarySearchQuery.f19481c && this.f19482d == librarySearchQuery.f19482d && this.f19483e == librarySearchQuery.f19483e && this.f19484f == librarySearchQuery.f19484f && this.f19485g == librarySearchQuery.f19485g && fa4.m11650l(this.f19486h, librarySearchQuery.f19486h) && this.f19487i == librarySearchQuery.f19487i && fa4.m11650l(this.f19488j, librarySearchQuery.f19488j) && fa4.m11650l(this.f19489k, librarySearchQuery.f19489k) && fa4.m11650l(this.f19490l, librarySearchQuery.f19490l) && this.f19491m == librarySearchQuery.f19491m;
    }

    public final int hashCode() {
        int iM22979b = ux5.m22979b(g9a.m12428e(g9a.m12428e(g9a.m12428e((this.f19482d.hashCode() + wq1.m24106b(this.f19481c, e65.m10869a(this.f19479a.hashCode() * 31, 31, this.f19480b), 31)) * 31, 31, this.f19483e), 31, this.f19484f), 31, this.f19485g), 31, this.f19486h);
        ContentType contentType = this.f19487i;
        int iHashCode = (iM22979b + (contentType == null ? 0 : contentType.hashCode())) * 31;
        CollectionsFilterProvider collectionsFilterProvider = this.f19488j;
        int iHashCode2 = (iHashCode + (collectionsFilterProvider == null ? 0 : collectionsFilterProvider.hashCode())) * 31;
        CollectionsFilter collectionsFilter = this.f19489k;
        return Boolean.hashCode(this.f19491m) + ux5.m22979b((iHashCode2 + (collectionsFilter != null ? collectionsFilter.hashCode() : 0)) * 31, 31, this.f19490l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibrarySearchQuery(resources=");
        sb.append(this.f19479a);
        sb.append(", level=");
        sb.append(this.f19480b);
        sb.append(", pageSize=");
        sb.append(this.f19481c);
        sb.append(", sortBy=");
        sb.append(this.f19482d);
        sb.append(", isFriendsOnly=");
        wq1.m24101A(sb, this.f19483e, ", isIncludeMedia=", this.f19484f, ", isImportsOnly=");
        sb.append(this.f19485g);
        sb.append(", tags=");
        sb.append(this.f19486h);
        sb.append(", contentType=");
        sb.append(this.f19487i);
        sb.append(", provider=");
        sb.append(this.f19488j);
        sb.append(", sharedBy=");
        sb.append(this.f19489k);
        sb.append(", accent=");
        sb.append(this.f19490l);
        sb.append(", isPending=");
        return AbstractC3393o1.m17740o(sb, this.f19491m, ")");
    }

    public LibrarySearchQuery(Map map, Map map2, int i, Sort sort, boolean z, boolean z2, boolean z3, List list, ContentType contentType, CollectionsFilterProvider collectionsFilterProvider, CollectionsFilter collectionsFilter, List list2, boolean z4) {
        map.getClass();
        map2.getClass();
        sort.getClass();
        this.f19479a = map;
        this.f19480b = map2;
        this.f19481c = i;
        this.f19482d = sort;
        this.f19483e = z;
        this.f19484f = z2;
        this.f19485g = z3;
        this.f19486h = list;
        this.f19487i = contentType;
        this.f19488j = collectionsFilterProvider;
        this.f19489k = collectionsFilter;
        this.f19490l = list2;
        this.f19491m = z4;
    }

    public /* synthetic */ LibrarySearchQuery(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, int i, Sort sort, int i2) {
        this((i2 & 1) != 0 ? new LinkedHashMap() : linkedHashMap, (i2 & 2) != 0 ? new LinkedHashMap() : linkedHashMap2, (i2 & 4) != 0 ? 20 : i, (i2 & 8) != 0 ? Sort.Newest : sort, false, false, false, new ArrayList(), null, null, null, new ArrayList(), false);
    }
}
