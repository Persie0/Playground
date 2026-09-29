package com.lingq.core.domain.model.library;

import p000.ey8;
import p000.fa4;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class CollectionsFilterLessonTag {
    public static final C1460b Companion = new C1460b();

    /* JADX INFO: renamed from: a */
    public String f19341a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CollectionsFilterLessonTag) && fa4.m11650l(this.f19341a, ((CollectionsFilterLessonTag) obj).f19341a);
    }

    public final int hashCode() {
        String str = this.f19341a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("CollectionsFilterLessonTag(title=", this.f19341a, ")");
    }
}
