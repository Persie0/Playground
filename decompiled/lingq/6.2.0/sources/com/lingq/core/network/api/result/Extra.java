package com.lingq.core.network.api.result;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.wf1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class Extra {
    public static final C1654g Companion = new C1654g();

    /* JADX INFO: renamed from: c */
    public static final cs4[] f20521c = {null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new wf1(12))};

    /* JADX INFO: renamed from: a */
    public final Book f20522a;

    /* JADX INFO: renamed from: b */
    public final List f20523b;

    public /* synthetic */ Extra(int i, Book book, List list) {
        if ((i & 1) == 0) {
            this.f20522a = null;
        } else {
            this.f20522a = book;
        }
        if ((i & 2) == 0) {
            this.f20523b = null;
        } else {
            this.f20523b = list;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Book m8283a() {
        return this.f20522a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Extra)) {
            return false;
        }
        Extra extra = (Extra) obj;
        return fa4.m11650l(this.f20522a, extra.f20522a) && fa4.m11650l(this.f20523b, extra.f20523b);
    }

    public final int hashCode() {
        Book book = this.f20522a;
        int iHashCode = (book == null ? 0 : book.hashCode()) * 31;
        List list = this.f20523b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "Extra(book=" + this.f20522a + ", books=" + this.f20523b + ")";
    }

    public Extra() {
        this.f20522a = null;
        this.f20523b = null;
    }
}
