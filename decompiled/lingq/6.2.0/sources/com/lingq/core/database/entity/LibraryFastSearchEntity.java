package com.lingq.core.database.entity;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LibraryFastSearchEntity {
    public static final C1367z Companion = new C1367z();

    /* JADX INFO: renamed from: a */
    public final String f17375a;

    /* JADX INFO: renamed from: b */
    public final String f17376b;

    /* JADX INFO: renamed from: c */
    public final String f17377c;

    /* JADX INFO: renamed from: d */
    public final String f17378d;

    /* JADX INFO: renamed from: e */
    public final String f17379e;

    public /* synthetic */ LibraryFastSearchEntity(String str, int i, String str2, String str3, String str4, String str5) {
        if (31 != (i & 31)) {
            n3c.m17204b(i, 31, LibraryFastSearchEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f17375a = str;
        this.f17376b = str2;
        this.f17377c = str3;
        this.f17378d = str4;
        this.f17379e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LibraryFastSearchEntity)) {
            return false;
        }
        LibraryFastSearchEntity libraryFastSearchEntity = (LibraryFastSearchEntity) obj;
        return fa4.m11650l(this.f17375a, libraryFastSearchEntity.f17375a) && fa4.m11650l(this.f17376b, libraryFastSearchEntity.f17376b) && fa4.m11650l(this.f17377c, libraryFastSearchEntity.f17377c) && fa4.m11650l(this.f17378d, libraryFastSearchEntity.f17378d) && fa4.m11650l(this.f17379e, libraryFastSearchEntity.f17379e);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(ux5.m22980c(ux5.m22980c(this.f17375a.hashCode() * 31, this.f17376b, 31), this.f17377c, 31), this.f17378d, 31);
        String str = this.f17379e;
        return iM22980c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("LibraryFastSearchEntity(id=", this.f17375a, ", language=", this.f17376b, ", query=");
        AbstractC3393o1.m17725C(sbM23000w, this.f17377c, ", type=", this.f17378d, ", title=");
        return AbstractC3393o1.m17738m(sbM23000w, this.f17379e, ")");
    }

    public LibraryFastSearchEntity(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.f17375a = str;
        this.f17376b = str2;
        this.f17377c = str3;
        this.f17378d = str4;
        this.f17379e = str5;
    }
}
