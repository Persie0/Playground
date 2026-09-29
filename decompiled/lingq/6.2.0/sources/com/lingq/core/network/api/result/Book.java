package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class Book {
    public static final C1614a Companion = new C1614a();

    /* JADX INFO: renamed from: a */
    public final ContentType f20496a;

    /* JADX INFO: renamed from: b */
    public final String f20497b;

    /* JADX INFO: renamed from: c */
    public final BookObject f20498c;

    /* JADX INFO: renamed from: d */
    public final BookData f20499d;

    public /* synthetic */ Book(int i, ContentType contentType, String str, BookObject bookObject, BookData bookData) {
        this.f20496a = (i & 1) == 0 ? new ContentType() : contentType;
        if ((i & 2) == 0) {
            this.f20497b = "";
        } else {
            this.f20497b = str;
        }
        if ((i & 4) == 0) {
            this.f20498c = new BookObject();
        } else {
            this.f20498c = bookObject;
        }
        if ((i & 8) == 0) {
            this.f20499d = null;
        } else {
            this.f20499d = bookData;
        }
    }

    /* JADX INFO: renamed from: a */
    public final BookObject m8275a() {
        return this.f20498c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Book)) {
            return false;
        }
        Book book = (Book) obj;
        return fa4.m11650l(this.f20496a, book.f20496a) && fa4.m11650l(this.f20497b, book.f20497b) && fa4.m11650l(this.f20498c, book.f20498c) && fa4.m11650l(this.f20499d, book.f20499d);
    }

    public final int hashCode() {
        ContentType contentType = this.f20496a;
        int iHashCode = (contentType == null ? 0 : contentType.hashCode()) * 31;
        String str = this.f20497b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        BookObject bookObject = this.f20498c;
        int iHashCode3 = (iHashCode2 + (bookObject == null ? 0 : bookObject.hashCode())) * 31;
        BookData bookData = this.f20499d;
        return iHashCode3 + (bookData != null ? bookData.hashCode() : 0);
    }

    public final String toString() {
        return "Book(contentType=" + this.f20496a + ", mtime=" + this.f20497b + ", bookObject=" + this.f20498c + ", data=" + this.f20499d + ")";
    }
}
