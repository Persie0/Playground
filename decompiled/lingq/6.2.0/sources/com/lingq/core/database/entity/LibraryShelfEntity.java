package com.lingq.core.database.entity;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.AbstractC3393o1;
import p000.cs4;
import p000.e65;
import p000.ey8;
import p000.fa4;
import p000.hn1;
import p000.n3c;
import p000.uf4;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class LibraryShelfEntity {
    public static final C1325a0 Companion = new C1325a0();

    /* JADX INFO: renamed from: l */
    public static final cs4[] f17380l = {null, null, null, null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new uf4(23)), null, null, null, null, null, null};

    /* JADX INFO: renamed from: a */
    public final String f17381a;

    /* JADX INFO: renamed from: b */
    public final String f17382b;

    /* JADX INFO: renamed from: c */
    public final Boolean f17383c;

    /* JADX INFO: renamed from: d */
    public final Boolean f17384d;

    /* JADX INFO: renamed from: e */
    public final List f17385e;

    /* JADX INFO: renamed from: f */
    public final String f17386f;

    /* JADX INFO: renamed from: g */
    public final int f17387g;

    /* JADX INFO: renamed from: h */
    public final String f17388h;

    /* JADX INFO: renamed from: i */
    public final int f17389i;

    /* JADX INFO: renamed from: j */
    public final String f17390j;

    /* JADX INFO: renamed from: k */
    public final String f17391k;

    public /* synthetic */ LibraryShelfEntity(int i, String str, String str2, Boolean bool, Boolean bool2, List list, String str3, int i2, String str4, int i3, String str5, String str6) {
        if (495 != (i & 495)) {
            n3c.m17204b(i, 495, LibraryShelfEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f17381a = str;
        this.f17382b = str2;
        this.f17383c = bool;
        this.f17384d = bool2;
        if ((i & 16) == 0) {
            this.f17385e = EmptyList.f47638a;
        } else {
            this.f17385e = list;
        }
        this.f17386f = str3;
        this.f17387g = i2;
        this.f17388h = str4;
        this.f17389i = i3;
        if ((i & 512) == 0) {
            this.f17390j = "";
        } else {
            this.f17390j = str5;
        }
        if ((i & 1024) == 0) {
            this.f17391k = "";
        } else {
            this.f17391k = str6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LibraryShelfEntity)) {
            return false;
        }
        LibraryShelfEntity libraryShelfEntity = (LibraryShelfEntity) obj;
        return fa4.m11650l(this.f17381a, libraryShelfEntity.f17381a) && fa4.m11650l(this.f17382b, libraryShelfEntity.f17382b) && fa4.m11650l(this.f17383c, libraryShelfEntity.f17383c) && fa4.m11650l(this.f17384d, libraryShelfEntity.f17384d) && fa4.m11650l(this.f17385e, libraryShelfEntity.f17385e) && fa4.m11650l(this.f17386f, libraryShelfEntity.f17386f) && this.f17387g == libraryShelfEntity.f17387g && fa4.m11650l(this.f17388h, libraryShelfEntity.f17388h) && this.f17389i == libraryShelfEntity.f17389i && fa4.m11650l(this.f17390j, libraryShelfEntity.f17390j) && fa4.m11650l(this.f17391k, libraryShelfEntity.f17391k);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(this.f17381a.hashCode() * 31, this.f17382b, 31);
        Boolean bool = this.f17383c;
        int iHashCode = (iM22980c + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f17384d;
        return this.f17391k.hashCode() + ux5.m22980c(wq1.m24106b(this.f17389i, ux5.m22980c(wq1.m24106b(this.f17387g, ux5.m22980c(ux5.m22979b((iHashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31, 31, this.f17385e), this.f17386f, 31), 31), this.f17388h, 31), 31), this.f17390j, 31);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("LibraryShelfEntity(codeWithLanguage=", this.f17381a, ", language=", this.f17382b, ", pinned=");
        e65.m10882n(sbM23000w, this.f17383c, ", pinnedHard=", this.f17384d, ", tabs=");
        wq1.m24130z(", code=", this.f17386f, ", id=", sbM23000w, this.f17385e);
        hn1.m13361k(this.f17387g, ", title=", this.f17388h, ", order=", sbM23000w);
        hn1.m13361k(this.f17389i, ", levels=", this.f17390j, ", originalTitle=", sbM23000w);
        return AbstractC3393o1.m17738m(sbM23000w, this.f17391k, ")");
    }

    public LibraryShelfEntity(String str, String str2, Boolean bool, Boolean bool2, List list, String str3, int i, String str4, int i2, String str5, String str6) {
        str.getClass();
        str2.getClass();
        list.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        this.f17381a = str;
        this.f17382b = str2;
        this.f17383c = bool;
        this.f17384d = bool2;
        this.f17385e = list;
        this.f17386f = str3;
        this.f17387g = i;
        this.f17388h = str4;
        this.f17389i = i2;
        this.f17390j = str5;
        this.f17391k = str6;
    }
}
