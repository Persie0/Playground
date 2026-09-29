package com.lingq.core.domain.model.library;

import com.lingq.core.domain.model.LearningLevel;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.hn1;
import p000.n3c;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class LibraryTab {
    public static final C1471m Companion = new C1471m();

    /* JADX INFO: renamed from: a */
    public final String f19501a;

    /* JADX INFO: renamed from: b */
    public final String f19502b;

    /* JADX INFO: renamed from: c */
    public final int f19503c;

    /* JADX INFO: renamed from: d */
    public final boolean f19504d;

    /* JADX INFO: renamed from: e */
    public final int f19505e;

    /* JADX INFO: renamed from: f */
    public final String f19506f;

    public /* synthetic */ LibraryTab(int i, String str, String str2, int i2, boolean z, int i3, String str3) {
        if (34 != (i & 34)) {
            n3c.m17204b(i, 34, LibraryTab$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19501a = (i & 1) == 0 ? "Lessons" : str;
        this.f19502b = str2;
        if ((i & 4) == 0) {
            this.f19503c = LearningLevel.Beginner1.ordinal();
        } else {
            this.f19503c = i2;
        }
        if ((i & 8) == 0) {
            this.f19504d = false;
        } else {
            this.f19504d = z;
        }
        if ((i & 16) == 0) {
            this.f19505e = 0;
        } else {
            this.f19505e = i3;
        }
        this.f19506f = str3;
    }

    /* JADX INFO: renamed from: a */
    public static LibraryTab m8094a(LibraryTab libraryTab, boolean z, int i, int i2) {
        String str = libraryTab.f19501a;
        String str2 = libraryTab.f19502b;
        int i3 = libraryTab.f19503c;
        if ((i2 & 8) != 0) {
            z = libraryTab.f19504d;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            i = libraryTab.f19505e;
        }
        String str3 = libraryTab.f19506f;
        libraryTab.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new LibraryTab(str, str2, i3, z2, i, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LibraryTab)) {
            return false;
        }
        LibraryTab libraryTab = (LibraryTab) obj;
        return fa4.m11650l(this.f19501a, libraryTab.f19501a) && fa4.m11650l(this.f19502b, libraryTab.f19502b) && this.f19503c == libraryTab.f19503c && this.f19504d == libraryTab.f19504d && this.f19505e == libraryTab.f19505e && fa4.m11650l(this.f19506f, libraryTab.f19506f);
    }

    public final int hashCode() {
        return this.f19506f.hashCode() + wq1.m24106b(this.f19505e, g9a.m12428e(wq1.m24106b(this.f19503c, ux5.m22980c(this.f19501a.hashCode() * 31, this.f19502b, 31), 31), 31, this.f19504d), 31);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("LibraryTab(title=", this.f19501a, ", display=", this.f19502b, ", level=");
        hn1.m13368r(sbM23000w, this.f19503c, ", selected=", this.f19504d, ", index=");
        sbM23000w.append(this.f19505e);
        sbM23000w.append(", apiUrl=");
        sbM23000w.append(this.f19506f);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }

    public LibraryTab(String str, String str2, int i, boolean z, int i2, String str3) {
        ux5.m22974A(str, str2, str3);
        this.f19501a = str;
        this.f19502b = str2;
        this.f19503c = i;
        this.f19504d = z;
        this.f19505e = i2;
        this.f19506f = str3;
    }
}
