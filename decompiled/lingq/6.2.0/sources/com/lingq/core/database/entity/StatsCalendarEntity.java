package com.lingq.core.database.entity;

import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.AbstractC3393o1;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.hn1;
import p000.ks8;
import p000.n3c;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class StatsCalendarEntity {
    public static final C1347l0 Companion = new C1347l0();

    /* JADX INFO: renamed from: f */
    public static final cs4[] f17449f = {null, null, null, null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new ks8(13))};

    /* JADX INFO: renamed from: a */
    public final String f17450a;

    /* JADX INFO: renamed from: b */
    public final int f17451b;

    /* JADX INFO: renamed from: c */
    public final int f17452c;

    /* JADX INFO: renamed from: d */
    public final int f17453d;

    /* JADX INFO: renamed from: e */
    public final List f17454e;

    public /* synthetic */ StatsCalendarEntity(int i, String str, int i2, int i3, int i4, List list) {
        if (1 != (i & 1)) {
            n3c.m17204b(i, 1, StatsCalendarEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f17450a = str;
        if ((i & 2) == 0) {
            this.f17451b = 0;
        } else {
            this.f17451b = i2;
        }
        if ((i & 4) == 0) {
            this.f17452c = 0;
        } else {
            this.f17452c = i3;
        }
        if ((i & 8) == 0) {
            this.f17453d = 0;
        } else {
            this.f17453d = i4;
        }
        if ((i & 16) == 0) {
            this.f17454e = null;
        } else {
            this.f17454e = list;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m7808a() {
        return this.f17451b;
    }

    /* JADX INFO: renamed from: b */
    public final String m7809b() {
        return this.f17450a;
    }

    /* JADX INFO: renamed from: c */
    public final int m7810c() {
        return this.f17452c;
    }

    /* JADX INFO: renamed from: d */
    public final List m7811d() {
        return this.f17454e;
    }

    /* JADX INFO: renamed from: e */
    public final int m7812e() {
        return this.f17453d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatsCalendarEntity)) {
            return false;
        }
        StatsCalendarEntity statsCalendarEntity = (StatsCalendarEntity) obj;
        return fa4.m11650l(this.f17450a, statsCalendarEntity.f17450a) && this.f17451b == statsCalendarEntity.f17451b && this.f17452c == statsCalendarEntity.f17452c && this.f17453d == statsCalendarEntity.f17453d && fa4.m11650l(this.f17454e, statsCalendarEntity.f17454e);
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f17453d, wq1.m24106b(this.f17452c, wq1.m24106b(this.f17451b, this.f17450a.hashCode() * 31, 31), 31), 31);
        List list = this.f17454e;
        return iM24106b + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sbM17741p = AbstractC3393o1.m17741p(this.f17451b, "StatsCalendarEntity(language=", this.f17450a, ", dailyGoal=", ", month=");
        hn1.m13360j(this.f17452c, this.f17453d, ", year=", ", stats=", sbM17741p);
        return hn1.m13356f(sbM17741p, this.f17454e, ")");
    }

    public StatsCalendarEntity(String str, int i, int i2, int i3, ArrayList arrayList) {
        str.getClass();
        this.f17450a = str;
        this.f17451b = i;
        this.f17452c = i2;
        this.f17453d = i3;
        this.f17454e = arrayList;
    }
}
