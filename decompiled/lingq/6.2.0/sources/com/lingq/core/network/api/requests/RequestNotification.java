package com.lingq.core.network.api.requests;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.cs4;
import p000.e65;
import p000.ey8;
import p000.fa4;
import p000.tx5;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class RequestNotification {
    public static final C1585l0 Companion = new C1585l0();

    /* JADX INFO: renamed from: b */
    public static final cs4[] f20411b = {AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new tx5(28))};

    /* JADX INFO: renamed from: a */
    public final List f20412a;

    public /* synthetic */ RequestNotification(int i, List list) {
        if ((i & 1) == 0) {
            this.f20412a = null;
        } else {
            this.f20412a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RequestNotification) && fa4.m11650l(this.f20412a, ((RequestNotification) obj).f20412a);
    }

    public final int hashCode() {
        List list = this.f20412a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return e65.m10874f("RequestNotification(notificationIds=", ")", this.f20412a);
    }

    public RequestNotification(List list) {
        this.f20412a = list;
    }
}
