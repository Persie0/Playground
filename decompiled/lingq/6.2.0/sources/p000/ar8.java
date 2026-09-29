package p000;

import com.lingq.core.domain.model.library.LibraryTab;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class ar8 {

    /* JADX INFO: renamed from: a */
    public final List f7389a;

    /* JADX INFO: renamed from: b */
    public final List f7390b;

    /* JADX INFO: renamed from: c */
    public final List f7391c;

    /* JADX INFO: renamed from: d */
    public final List f7392d;

    /* JADX INFO: renamed from: e */
    public final Map f7393e;

    /* JADX INFO: renamed from: f */
    public final HashSet f7394f;

    /* JADX INFO: renamed from: g */
    public final HashSet f7395g;

    /* JADX INFO: renamed from: h */
    public final boolean f7396h;

    /* JADX INFO: renamed from: i */
    public final boolean f7397i;

    /* JADX INFO: renamed from: j */
    public final boolean f7398j;

    /* JADX INFO: renamed from: k */
    public final boolean f7399k;

    /* JADX INFO: renamed from: l */
    public final int f7400l;

    /* JADX INFO: renamed from: m */
    public final LibraryTab f7401m;

    /* JADX INFO: renamed from: n */
    public final String f7402n;

    /* JADX INFO: renamed from: o */
    public final Pair f7403o;

    /* JADX INFO: renamed from: p */
    public final gp8 f7404p;

    public ar8(List list, List list2, List list3, List list4, Map map, HashSet hashSet, HashSet hashSet2, boolean z, boolean z2, boolean z3, boolean z4, int i, LibraryTab libraryTab, String str, Pair pair, gp8 gp8Var) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.f7389a = list;
        this.f7390b = list2;
        this.f7391c = list3;
        this.f7392d = list4;
        this.f7393e = map;
        this.f7394f = hashSet;
        this.f7395g = hashSet2;
        this.f7396h = z;
        this.f7397i = z2;
        this.f7398j = z3;
        this.f7399k = z4;
        this.f7400l = i;
        this.f7401m = libraryTab;
        this.f7402n = str;
        this.f7403o = pair;
        this.f7404p = gp8Var;
    }

    /* JADX INFO: renamed from: a */
    public static ar8 m3015a(ar8 ar8Var, List list, List list2, List list3, List list4, Map map, HashSet hashSet, HashSet hashSet2, boolean z, boolean z2, boolean z3, boolean z4, int i, LibraryTab libraryTab, String str, Pair pair, gp8 gp8Var, int i2) {
        List list5 = (i2 & 1) != 0 ? ar8Var.f7389a : list;
        List list6 = (i2 & 2) != 0 ? ar8Var.f7390b : list2;
        List list7 = (i2 & 4) != 0 ? ar8Var.f7391c : list3;
        List list8 = (i2 & 8) != 0 ? ar8Var.f7392d : list4;
        Map map2 = (i2 & 16) != 0 ? ar8Var.f7393e : map;
        HashSet hashSet3 = (i2 & 32) != 0 ? ar8Var.f7394f : hashSet;
        HashSet hashSet4 = (i2 & 64) != 0 ? ar8Var.f7395g : hashSet2;
        boolean z5 = (i2 & 128) != 0 ? ar8Var.f7396h : z;
        boolean z6 = (i2 & 256) != 0 ? ar8Var.f7397i : z2;
        boolean z7 = (i2 & 512) != 0 ? ar8Var.f7398j : z3;
        boolean z8 = (i2 & 1024) != 0 ? ar8Var.f7399k : z4;
        int i3 = (i2 & 2048) != 0 ? ar8Var.f7400l : i;
        LibraryTab libraryTab2 = (i2 & 4096) != 0 ? ar8Var.f7401m : libraryTab;
        String str2 = (i2 & 8192) != 0 ? ar8Var.f7402n : str;
        List list9 = list5;
        Pair pair2 = (i2 & 16384) != 0 ? ar8Var.f7403o : pair;
        gp8 gp8Var2 = (i2 & 32768) != 0 ? ar8Var.f7404p : gp8Var;
        ar8Var.getClass();
        list9.getClass();
        list6.getClass();
        list7.getClass();
        list8.getClass();
        map2.getClass();
        str2.getClass();
        pair2.getClass();
        return new ar8(list9, list6, list7, list8, map2, hashSet3, hashSet4, z5, z6, z7, z8, i3, libraryTab2, str2, pair2, gp8Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ar8)) {
            return false;
        }
        ar8 ar8Var = (ar8) obj;
        return fa4.m11650l(this.f7389a, ar8Var.f7389a) && fa4.m11650l(this.f7390b, ar8Var.f7390b) && fa4.m11650l(this.f7391c, ar8Var.f7391c) && fa4.m11650l(this.f7392d, ar8Var.f7392d) && this.f7393e.equals(ar8Var.f7393e) && this.f7394f.equals(ar8Var.f7394f) && this.f7395g.equals(ar8Var.f7395g) && this.f7396h == ar8Var.f7396h && this.f7397i == ar8Var.f7397i && this.f7398j == ar8Var.f7398j && this.f7399k == ar8Var.f7399k && this.f7400l == ar8Var.f7400l && fa4.m11650l(this.f7401m, ar8Var.f7401m) && this.f7402n.equals(ar8Var.f7402n) && this.f7403o.equals(ar8Var.f7403o) && fa4.m11650l(this.f7404p, ar8Var.f7404p);
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f7400l, g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e((this.f7395g.hashCode() + ((this.f7394f.hashCode() + e65.m10869a(ux5.m22979b(ux5.m22979b(ux5.m22979b(this.f7389a.hashCode() * 31, 31, this.f7390b), 31, this.f7391c), 31, this.f7392d), 31, this.f7393e)) * 31)) * 31, 31, this.f7396h), 31, this.f7397i), 31, this.f7398j), 31, this.f7399k), 31);
        LibraryTab libraryTab = this.f7401m;
        int iHashCode = (this.f7403o.hashCode() + ux5.m22980c((iM24106b + (libraryTab == null ? 0 : libraryTab.hashCode())) * 31, this.f7402n, 31)) * 31;
        gp8 gp8Var = this.f7404p;
        return iHashCode + (gp8Var != null ? gp8Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchLibraryDataState(libraryItems=");
        sb.append(this.f7389a);
        sb.append(", libraryCounters=");
        sb.append(this.f7390b);
        sb.append(", libraryItemsDownloads=");
        hn1.m13372v(sb, this.f7391c, ", lessonsAudioDownloads=", this.f7392d, ", activeDownloadProgress=");
        sb.append(this.f7393e);
        sb.append(", blacklistedSources=");
        sb.append(this.f7394f);
        sb.append(", blacklistedCourses=");
        sb.append(this.f7395g);
        sb.append(", isLoading=");
        sb.append(this.f7396h);
        sb.append(", isNetworkLoadInProgress=");
        wq1.m24101A(sb, this.f7397i, ", searchIsEmpty=", this.f7398j, ", hasMorePages=");
        hn1.m13373w(sb, this.f7399k, ", pageToLoad=", this.f7400l, ", tabSelected=");
        sb.append(this.f7401m);
        sb.append(", query=");
        sb.append(this.f7402n);
        sb.append(", currentLevels=");
        sb.append(this.f7403o);
        sb.append(", pendingRemoveLessonAction=");
        sb.append(this.f7404p);
        sb.append(")");
        return sb.toString();
    }
}
