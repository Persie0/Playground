package com.lingq.core.network.api.result;

import java.util.Date;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.x88;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultLessonUserLiked {
    public static final C1681k2 Companion = new C1681k2();

    /* JADX INFO: renamed from: c */
    public static final cs4[] f21208c = {null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new x88(20))};

    /* JADX INFO: renamed from: a */
    public final String f21209a;

    /* JADX INFO: renamed from: b */
    public final Date f21210b;

    public /* synthetic */ ResultLessonUserLiked(int i, String str, Date date) {
        if ((i & 1) == 0) {
            this.f21209a = null;
        } else {
            this.f21209a = str;
        }
        if ((i & 2) == 0) {
            this.f21210b = null;
        } else {
            this.f21210b = date;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultLessonUserLiked)) {
            return false;
        }
        ResultLessonUserLiked resultLessonUserLiked = (ResultLessonUserLiked) obj;
        return fa4.m11650l(this.f21209a, resultLessonUserLiked.f21209a) && fa4.m11650l(this.f21210b, resultLessonUserLiked.f21210b);
    }

    public final int hashCode() {
        String str = this.f21209a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Date date = this.f21210b;
        return iHashCode + (date != null ? date.hashCode() : 0);
    }

    public final String toString() {
        return "ResultLessonUserLiked(username=" + this.f21209a + ", liked=" + this.f21210b + ")";
    }
}
