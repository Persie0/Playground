package com.lingq.shared.uimodel.library;

import androidx.activity.result.C0204c;
import com.android.installreferrer.api.InstallReferrerClient;
import com.kochava.tracker.BuildConfig;
import com.lingq.shared.uimodel.ContentType;
import com.lingq.shared.uimodel.LearningLevel;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/shared/uimodel/library/LibrarySearchQuery;", "", "a", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class LibrarySearchQuery {

    /* JADX INFO: renamed from: a */
    public final Map<Resources, Boolean> f22024a;

    /* JADX INFO: renamed from: b */
    public Map<LearningLevel, Boolean> f22025b;

    /* JADX INFO: renamed from: c */
    public final int f22026c;

    /* JADX INFO: renamed from: d */
    public Sort f22027d;

    /* JADX INFO: renamed from: e */
    public final boolean f22028e;

    /* JADX INFO: renamed from: f */
    public final boolean f22029f;

    /* JADX INFO: renamed from: g */
    public final boolean f22030g;

    /* JADX INFO: renamed from: h */
    public List<String> f22031h;

    /* JADX INFO: renamed from: i */
    public ContentType f22032i;

    /* JADX INFO: renamed from: j */
    public final CollectionsFilterProvider f22033j;

    /* JADX INFO: renamed from: k */
    public CollectionsFilterUser f22034k;

    /* JADX INFO: renamed from: l */
    public List<Accent> f22035l;

    /* JADX INFO: renamed from: com.lingq.shared.uimodel.library.LibrarySearchQuery$a */
    public static final class C3403a {
        /* JADX INFO: renamed from: a */
        public static ArrayList m9705a() {
            int iOrdinal = LearningLevel.Beginner1.ordinal();
            int iOrdinal2 = LearningLevel.Advanced2.ordinal();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (LearningLevel learningLevel : LearningLevel.values()) {
                int iOrdinal3 = learningLevel.ordinal();
                linkedHashMap.put(learningLevel, Boolean.valueOf(iOrdinal <= iOrdinal3 && iOrdinal3 <= iOrdinal2));
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()));
            }
            return arrayList;
        }
    }

    public LibrarySearchQuery() {
        this(null, null, 0, null, false, false, false, null, null, null, null, null, 4095, null);
    }

    public LibrarySearchQuery(Map<Resources, Boolean> map, Map<LearningLevel, Boolean> map2, int i10, Sort sort, boolean z10, boolean z11, boolean z12, List<String> list, ContentType contentType, CollectionsFilterProvider collectionsFilterProvider, CollectionsFilterUser collectionsFilterUser, List<Accent> list2) {
        C5207g.m11111f(map, "resources");
        C5207g.m11111f(map2, "level");
        C5207g.m11111f(sort, "sortBy");
        C5207g.m11111f(list, "tags");
        C5207g.m11111f(list2, "accent");
        this.f22024a = map;
        this.f22025b = map2;
        this.f22026c = i10;
        this.f22027d = sort;
        this.f22028e = z10;
        this.f22029f = z11;
        this.f22030g = z12;
        this.f22031h = list;
        this.f22032i = contentType;
        this.f22033j = collectionsFilterProvider;
        this.f22034k = collectionsFilterUser;
        this.f22035l = list2;
    }

    public /* synthetic */ LibrarySearchQuery(Map map, Map map2, int i10, Sort sort, boolean z10, boolean z11, boolean z12, List list, ContentType contentType, CollectionsFilterProvider collectionsFilterProvider, CollectionsFilterUser collectionsFilterUser, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new LinkedHashMap() : map, (i11 & 2) != 0 ? new LinkedHashMap() : map2, (i11 & 4) != 0 ? 20 : i10, (i11 & 8) != 0 ? Sort.RecentlyOpened : sort, (i11 & 16) != 0 ? false : z10, (i11 & 32) != 0 ? false : z11, (i11 & 64) == 0 ? z12 : false, (i11 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? new ArrayList() : list, (i11 & 256) != 0 ? null : contentType, (i11 & 512) != 0 ? null : collectionsFilterProvider, (i11 & 1024) == 0 ? collectionsFilterUser : null, (i11 & 2048) != 0 ? new ArrayList() : list2);
    }

    /* JADX INFO: renamed from: a */
    public final Pair<LearningLevel, LearningLevel> m9704a() {
        LearningLevel learningLevel = LearningLevel.Beginner1;
        LearningLevel learningLevel2 = LearningLevel.Advanced2;
        while (true) {
            while (true) {
                Boolean bool = this.f22025b.get(learningLevel);
                Boolean bool2 = Boolean.FALSE;
                if (!C5207g.m11106a(bool, bool2) && !C5207g.m11106a(this.f22025b.get(learningLevel2), bool2)) {
                    return new Pair<>(learningLevel, learningLevel2);
                }
                if (C5207g.m11106a(this.f22025b.get(learningLevel), bool2)) {
                    learningLevel = LearningLevel.values()[learningLevel.ordinal() + 1];
                }
                if (C5207g.m11106a(this.f22025b.get(learningLevel2), bool2)) {
                    learningLevel2 = LearningLevel.values()[learningLevel2.ordinal() - 1];
                }
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
        return C5207g.m11106a(this.f22024a, librarySearchQuery.f22024a) && C5207g.m11106a(this.f22025b, librarySearchQuery.f22025b) && this.f22026c == librarySearchQuery.f22026c && this.f22027d == librarySearchQuery.f22027d && this.f22028e == librarySearchQuery.f22028e && this.f22029f == librarySearchQuery.f22029f && this.f22030g == librarySearchQuery.f22030g && C5207g.m11106a(this.f22031h, librarySearchQuery.f22031h) && this.f22032i == librarySearchQuery.f22032i && C5207g.m11106a(this.f22033j, librarySearchQuery.f22033j) && C5207g.m11106a(this.f22034k, librarySearchQuery.f22034k) && C5207g.m11106a(this.f22035l, librarySearchQuery.f22035l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    public final int hashCode() {
        int iHashCode = (this.f22027d.hashCode() + C0009a.m16d(this.f22026c, (this.f22025b.hashCode() + (this.f22024a.hashCode() * 31)) * 31, 31)) * 31;
        ?? r10 = 1;
        boolean z10 = this.f22028e;
        ?? r11 = z10;
        if (z10) {
            r11 = 1;
        }
        int i10 = (iHashCode + r11) * 31;
        boolean z11 = this.f22029f;
        ?? r12 = z11;
        if (z11) {
            r12 = 1;
        }
        int i11 = (i10 + r12) * 31;
        boolean z12 = this.f22030g;
        if (!z12) {
            r10 = z12;
        }
        int iM848g = C0204c.m848g(this.f22031h, (i11 + r10) * 31, 31);
        ContentType contentType = this.f22032i;
        int iHashCode2 = 0;
        int iHashCode3 = (iM848g + (contentType == null ? 0 : contentType.hashCode())) * 31;
        CollectionsFilterProvider collectionsFilterProvider = this.f22033j;
        int iHashCode4 = (iHashCode3 + (collectionsFilterProvider == null ? 0 : collectionsFilterProvider.hashCode())) * 31;
        CollectionsFilterUser collectionsFilterUser = this.f22034k;
        if (collectionsFilterUser != null) {
            iHashCode2 = collectionsFilterUser.hashCode();
        }
        return this.f22035l.hashCode() + ((iHashCode4 + iHashCode2) * 31);
    }

    public final String toString() {
        return "LibrarySearchQuery(resources=" + this.f22024a + ", level=" + this.f22025b + ", pageSize=" + this.f22026c + ", sortBy=" + this.f22027d + ", isFriendsOnly=" + this.f22028e + ", isIncludeMedia=" + this.f22029f + ", isImportsOnly=" + this.f22030g + ", tags=" + this.f22031h + ", contentType=" + this.f22032i + ", provider=" + this.f22033j + ", sharedBy=" + this.f22034k + ", accent=" + this.f22035l + ")";
    }
}
