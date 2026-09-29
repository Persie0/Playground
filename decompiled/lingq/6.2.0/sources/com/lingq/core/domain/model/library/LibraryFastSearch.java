package com.lingq.core.domain.model.library;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LibraryFastSearch {
    public static final C1464f Companion = new C1464f();

    /* JADX INFO: renamed from: a */
    public final String f19394a;

    /* JADX INFO: renamed from: b */
    public final String f19395b;

    /* JADX INFO: renamed from: c */
    public final String f19396c;

    /* JADX INFO: renamed from: d */
    public final String f19397d;

    /* JADX INFO: renamed from: e */
    public final String f19398e;

    public /* synthetic */ LibraryFastSearch(String str, int i, String str2, String str3, String str4, String str5) {
        if (3 != (i & 3)) {
            n3c.m17204b(i, 3, LibraryFastSearch$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19394a = str;
        this.f19395b = str2;
        if ((i & 4) == 0) {
            this.f19396c = "";
        } else {
            this.f19396c = str3;
        }
        if ((i & 8) == 0) {
            this.f19397d = "";
        } else {
            this.f19397d = str4;
        }
        if ((i & 16) == 0) {
            this.f19398e = "";
        } else {
            this.f19398e = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LibraryFastSearch)) {
            return false;
        }
        LibraryFastSearch libraryFastSearch = (LibraryFastSearch) obj;
        return fa4.m11650l(this.f19394a, libraryFastSearch.f19394a) && fa4.m11650l(this.f19395b, libraryFastSearch.f19395b) && fa4.m11650l(this.f19396c, libraryFastSearch.f19396c) && fa4.m11650l(this.f19397d, libraryFastSearch.f19397d) && fa4.m11650l(this.f19398e, libraryFastSearch.f19398e);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(ux5.m22980c(ux5.m22980c(this.f19394a.hashCode() * 31, this.f19395b, 31), this.f19396c, 31), this.f19397d, 31);
        String str = this.f19398e;
        return iM22980c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("LibraryFastSearch(id=", this.f19394a, ", language=", this.f19395b, ", type=");
        AbstractC3393o1.m17725C(sbM23000w, this.f19396c, ", title=", this.f19397d, ", imageUrl=");
        return AbstractC3393o1.m17738m(sbM23000w, this.f19398e, ")");
    }

    public LibraryFastSearch(String str, String str2, String str3, String str4) {
        ux5.m22974A(str, str2, str3);
        this.f19394a = str;
        this.f19395b = str2;
        this.f19396c = str3;
        this.f19397d = str4;
        this.f19398e = null;
    }
}
