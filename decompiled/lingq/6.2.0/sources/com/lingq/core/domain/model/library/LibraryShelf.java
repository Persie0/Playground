package com.lingq.core.domain.model.library;

import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.hn1;
import p000.n3c;
import p000.uf4;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class LibraryShelf {
    public static final C1470l Companion = new C1470l();

    /* JADX INFO: renamed from: i */
    public static final cs4[] f19492i = {null, null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new uf4(22)), null, null, null, null, null};

    /* JADX INFO: renamed from: a */
    public final boolean f19493a;

    /* JADX INFO: renamed from: b */
    public final boolean f19494b;

    /* JADX INFO: renamed from: c */
    public final List f19495c;

    /* JADX INFO: renamed from: d */
    public final String f19496d;

    /* JADX INFO: renamed from: e */
    public final int f19497e;

    /* JADX INFO: renamed from: f */
    public final String f19498f;

    /* JADX INFO: renamed from: g */
    public final int f19499g;

    /* JADX INFO: renamed from: h */
    public final String f19500h;

    public /* synthetic */ LibraryShelf(int i, boolean z, boolean z2, List list, String str, int i2, String str2, int i3, String str3) {
        if (8 != (i & 8)) {
            n3c.m17204b(i, 8, LibraryShelf$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.f19493a = false;
        } else {
            this.f19493a = z;
        }
        if ((i & 2) == 0) {
            this.f19494b = false;
        } else {
            this.f19494b = z2;
        }
        if ((i & 4) == 0) {
            this.f19495c = EmptyList.f47638a;
        } else {
            this.f19495c = list;
        }
        this.f19496d = str;
        if ((i & 16) == 0) {
            this.f19497e = -1;
        } else {
            this.f19497e = i2;
        }
        if ((i & 32) == 0) {
            this.f19498f = "Search";
        } else {
            this.f19498f = str2;
        }
        if ((i & 64) == 0) {
            this.f19499g = 0;
        } else {
            this.f19499g = i3;
        }
        if ((i & 128) == 0) {
            this.f19500h = "Search";
        } else {
            this.f19500h = str3;
        }
    }

    /* JADX INFO: renamed from: a */
    public static LibraryShelf m8093a(LibraryShelf libraryShelf, ArrayList arrayList) {
        boolean z = libraryShelf.f19493a;
        boolean z2 = libraryShelf.f19494b;
        String str = libraryShelf.f19496d;
        int i = libraryShelf.f19497e;
        String str2 = libraryShelf.f19498f;
        int i2 = libraryShelf.f19499g;
        String str3 = libraryShelf.f19500h;
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new LibraryShelf(z, z2, arrayList, str, i, str2, i2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LibraryShelf)) {
            return false;
        }
        LibraryShelf libraryShelf = (LibraryShelf) obj;
        return this.f19493a == libraryShelf.f19493a && this.f19494b == libraryShelf.f19494b && fa4.m11650l(this.f19495c, libraryShelf.f19495c) && fa4.m11650l(this.f19496d, libraryShelf.f19496d) && this.f19497e == libraryShelf.f19497e && fa4.m11650l(this.f19498f, libraryShelf.f19498f) && this.f19499g == libraryShelf.f19499g && fa4.m11650l(this.f19500h, libraryShelf.f19500h);
    }

    public final int hashCode() {
        return this.f19500h.hashCode() + wq1.m24106b(this.f19499g, ux5.m22980c(wq1.m24106b(this.f19497e, ux5.m22980c(ux5.m22979b(g9a.m12428e(Boolean.hashCode(this.f19493a) * 31, 31, this.f19494b), 31, this.f19495c), this.f19496d, 31), 31), this.f19498f, 31), 31);
    }

    public final String toString() {
        StringBuilder sbM13357g = hn1.m13357g("LibraryShelf(pinned=", ", pinnedHard=", ", tabs=", this.f19493a, this.f19494b);
        wq1.m24130z(", code=", this.f19496d, ", id=", sbM13357g, this.f19495c);
        hn1.m13361k(this.f19497e, ", title=", this.f19498f, ", order=", sbM13357g);
        sbM13357g.append(this.f19499g);
        sbM13357g.append(", originalTitle=");
        sbM13357g.append(this.f19500h);
        sbM13357g.append(")");
        return sbM13357g.toString();
    }

    public LibraryShelf(boolean z, boolean z2, List list, String str, int i, String str2, int i2, String str3) {
        list.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.f19493a = z;
        this.f19494b = z2;
        this.f19495c = list;
        this.f19496d = str;
        this.f19497e = i;
        this.f19498f = str2;
        this.f19499g = i2;
        this.f19500h = str3;
    }

    public /* synthetic */ LibraryShelf(List list, String str) {
        this(false, false, list, str, -1, "Search", 0, "Search");
    }
}
