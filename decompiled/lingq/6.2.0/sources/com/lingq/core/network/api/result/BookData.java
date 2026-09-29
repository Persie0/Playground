package com.lingq.core.network.api.result;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class BookData {
    public static final C1621b Companion = new C1621b();

    /* JADX INFO: renamed from: a */
    public final String f20500a;

    /* JADX INFO: renamed from: b */
    public final Double f20501b;

    /* JADX INFO: renamed from: c */
    public final String f20502c;

    public /* synthetic */ BookData(int i, String str, Double d, String str2) {
        if ((i & 1) == 0) {
            this.f20500a = null;
        } else {
            this.f20500a = str;
        }
        if ((i & 2) == 0) {
            this.f20501b = null;
        } else {
            this.f20501b = d;
        }
        if ((i & 4) == 0) {
            this.f20502c = null;
        } else {
            this.f20502c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookData)) {
            return false;
        }
        BookData bookData = (BookData) obj;
        return fa4.m11650l(this.f20500a, bookData.f20500a) && fa4.m11650l(this.f20501b, bookData.f20501b) && fa4.m11650l(this.f20502c, bookData.f20502c);
    }

    public final int hashCode() {
        String str = this.f20500a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d = this.f20501b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.f20502c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BookData(language=");
        sb.append(this.f20500a);
        sb.append(", readProgress=");
        sb.append(this.f20501b);
        sb.append(", status=");
        return AbstractC3393o1.m17738m(sb, this.f20502c, ")");
    }
}
