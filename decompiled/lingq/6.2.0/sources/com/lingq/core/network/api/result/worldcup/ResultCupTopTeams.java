package com.lingq.core.network.api.result.worldcup;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.x88;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultCupTopTeams {
    public static final C1776u Companion = new C1776u();

    /* JADX INFO: renamed from: c */
    public static final cs4[] f21832c = {null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new x88(4))};

    /* JADX INFO: renamed from: a */
    public final String f21833a;

    /* JADX INFO: renamed from: b */
    public final List f21834b;

    public /* synthetic */ ResultCupTopTeams(int i, String str, List list) {
        this.f21833a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.f21834b = EmptyList.f47638a;
        } else {
            this.f21834b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultCupTopTeams)) {
            return false;
        }
        ResultCupTopTeams resultCupTopTeams = (ResultCupTopTeams) obj;
        return fa4.m11650l(this.f21833a, resultCupTopTeams.f21833a) && fa4.m11650l(this.f21834b, resultCupTopTeams.f21834b);
    }

    public final int hashCode() {
        return this.f21834b.hashCode() + (this.f21833a.hashCode() * 31);
    }

    public final String toString() {
        return "ResultCupTopTeams(date=" + this.f21833a + ", teams=" + this.f21834b + ")";
    }
}
