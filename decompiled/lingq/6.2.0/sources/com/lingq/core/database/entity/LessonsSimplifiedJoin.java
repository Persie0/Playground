package com.lingq.core.database.entity;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.n3c;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LessonsSimplifiedJoin {
    public static final C1365x Companion = new C1365x();

    /* JADX INFO: renamed from: a */
    public final int f17354a;

    /* JADX INFO: renamed from: b */
    public final Integer f17355b;

    /* JADX INFO: renamed from: c */
    public final boolean f17356c;

    public /* synthetic */ LessonsSimplifiedJoin(int i, int i2, Integer num, boolean z) {
        if (1 != (i & 1)) {
            n3c.m17204b(i, 1, LessonsSimplifiedJoin$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f17354a = i2;
        if ((i & 2) == 0) {
            this.f17355b = null;
        } else {
            this.f17355b = num;
        }
        if ((i & 4) == 0) {
            this.f17356c = true;
        } else {
            this.f17356c = z;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m7757a() {
        return this.f17354a;
    }

    /* JADX INFO: renamed from: b */
    public final Integer m7758b() {
        return this.f17355b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m7759c() {
        return this.f17356c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonsSimplifiedJoin)) {
            return false;
        }
        LessonsSimplifiedJoin lessonsSimplifiedJoin = (LessonsSimplifiedJoin) obj;
        return this.f17354a == lessonsSimplifiedJoin.f17354a && fa4.m11650l(this.f17355b, lessonsSimplifiedJoin.f17355b) && this.f17356c == lessonsSimplifiedJoin.f17356c;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f17354a) * 31;
        Integer num = this.f17355b;
        return Boolean.hashCode(this.f17356c) + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LessonsSimplifiedJoin(fromId=");
        sb.append(this.f17354a);
        sb.append(", toId=");
        sb.append(this.f17355b);
        sb.append(", isLocked=");
        return AbstractC3393o1.m17740o(sb, this.f17356c, ")");
    }

    public LessonsSimplifiedJoin(int i, Integer num, boolean z) {
        this.f17354a = i;
        this.f17355b = num;
        this.f17356c = z;
    }

    public /* synthetic */ LessonsSimplifiedJoin(int i) {
        this(i, null, true);
    }
}
