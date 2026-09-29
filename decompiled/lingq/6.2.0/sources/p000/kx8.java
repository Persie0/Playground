package p000;

import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes2.dex */
public final class kx8 {

    /* JADX INFO: renamed from: a */
    public final String f48548a;

    /* JADX INFO: renamed from: b */
    public final zaa f48549b;

    /* JADX INFO: renamed from: c */
    public final List f48550c;

    /* JADX INFO: renamed from: d */
    public final zaa f48551d;

    /* JADX INFO: renamed from: e */
    public final List f48552e;

    /* JADX INFO: renamed from: f */
    public final boolean f48553f;

    /* JADX INFO: renamed from: g */
    public final List f48554g;

    /* JADX INFO: renamed from: h */
    public final C3849zx f48555h;

    /* JADX INFO: renamed from: i */
    public final boolean f48556i;

    /* JADX INFO: renamed from: j */
    public final List f48557j;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ kx8(String str, zaa zaaVar, zaa zaaVar2, C3849zx c3849zx, int i) {
        String str2 = (i & 1) != 0 ? "" : str;
        zaaVar = (i & 2) != 0 ? null : zaaVar;
        zaa zaaVar3 = (i & 8) != 0 ? null : zaaVar2;
        C3849zx c3849zx2 = (i & 128) != 0 ? null : c3849zx;
        EmptyList emptyList = EmptyList.f47638a;
        this(str2, zaaVar, emptyList, zaaVar3, emptyList, false, emptyList, c3849zx2, false, emptyList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kx8)) {
            return false;
        }
        kx8 kx8Var = (kx8) obj;
        return fa4.m11650l(this.f48548a, kx8Var.f48548a) && fa4.m11650l(this.f48549b, kx8Var.f48549b) && fa4.m11650l(this.f48550c, kx8Var.f48550c) && fa4.m11650l(this.f48551d, kx8Var.f48551d) && fa4.m11650l(this.f48552e, kx8Var.f48552e) && this.f48553f == kx8Var.f48553f && fa4.m11650l(this.f48554g, kx8Var.f48554g) && fa4.m11650l(this.f48555h, kx8Var.f48555h) && this.f48556i == kx8Var.f48556i && fa4.m11650l(this.f48557j, kx8Var.f48557j);
    }

    public final int hashCode() {
        int iHashCode = this.f48548a.hashCode() * 31;
        zaa zaaVar = this.f48549b;
        int iM22979b = ux5.m22979b((iHashCode + (zaaVar == null ? 0 : zaaVar.hashCode())) * 31, 31, this.f48550c);
        zaa zaaVar2 = this.f48551d;
        int iM22979b2 = ux5.m22979b(g9a.m12428e(ux5.m22979b((iM22979b + (zaaVar2 == null ? 0 : zaaVar2.hashCode())) * 31, 31, this.f48552e), 31, this.f48553f), 31, this.f48554g);
        C3849zx c3849zx = this.f48555h;
        return this.f48557j.hashCode() + g9a.m12428e((iM22979b2 + (c3849zx != null ? c3849zx.hashCode() : 0)) * 31, 31, this.f48556i);
    }

    public final String toString() {
        return "SentencePageState(sentenceText=" + this.f48548a + ", activeTranslation=" + this.f48549b + ", allTranslations=" + this.f48550c + ", activeNote=" + this.f48551d + ", allNotes=" + this.f48552e + ", showAllNotes=" + this.f48553f + ", availableLocalesForNoteAdd=" + this.f48554g + ", audioState=" + this.f48555h + ", showAllTranslations=" + this.f48556i + ", availableLocalesForAdd=" + this.f48557j + ")";
    }

    public kx8(String str, zaa zaaVar, List list, zaa zaaVar2, List list2, boolean z, List list3, C3849zx c3849zx, boolean z2, List list4) {
        str.getClass();
        this.f48548a = str;
        this.f48549b = zaaVar;
        this.f48550c = list;
        this.f48551d = zaaVar2;
        this.f48552e = list2;
        this.f48553f = z;
        this.f48554g = list3;
        this.f48555h = c3849zx;
        this.f48556i = z2;
        this.f48557j = list4;
    }
}
