package com.lingq.core.domain.model.lesson;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.n3c;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LessonsSimplified {
    public static final C1456u Companion = new C1456u();

    /* JADX INFO: renamed from: a */
    public final int f19329a;

    /* JADX INFO: renamed from: b */
    public final Integer f19330b;

    /* JADX INFO: renamed from: c */
    public final boolean f19331c;

    public /* synthetic */ LessonsSimplified(int i, int i2, Integer num, boolean z) {
        if (1 != (i & 1)) {
            n3c.m17204b(i, 1, LessonsSimplified$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19329a = i2;
        if ((i & 2) == 0) {
            this.f19330b = null;
        } else {
            this.f19330b = num;
        }
        if ((i & 4) == 0) {
            this.f19331c = true;
        } else {
            this.f19331c = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonsSimplified)) {
            return false;
        }
        LessonsSimplified lessonsSimplified = (LessonsSimplified) obj;
        return this.f19329a == lessonsSimplified.f19329a && fa4.m11650l(this.f19330b, lessonsSimplified.f19330b) && this.f19331c == lessonsSimplified.f19331c;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f19329a) * 31;
        Integer num = this.f19330b;
        return Boolean.hashCode(this.f19331c) + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LessonsSimplified(fromId=");
        sb.append(this.f19329a);
        sb.append(", toId=");
        sb.append(this.f19330b);
        sb.append(", isLocked=");
        return AbstractC3393o1.m17740o(sb, this.f19331c, ")");
    }

    public LessonsSimplified(int i, Integer num, boolean z) {
        this.f19329a = i;
        this.f19330b = num;
        this.f19331c = z;
    }
}
