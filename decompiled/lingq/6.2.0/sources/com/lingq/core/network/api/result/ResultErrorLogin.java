package com.lingq.core.network.api.result;

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
public final class ResultErrorLogin {
    public static final C1668i1 Companion = new C1668i1();

    /* JADX INFO: renamed from: c */
    public static final cs4[] f20845c = {null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new x88(6))};

    /* JADX INFO: renamed from: a */
    public final String f20846a;

    /* JADX INFO: renamed from: b */
    public final List f20847b;

    public /* synthetic */ ResultErrorLogin(int i, String str, List list) {
        this.f20846a = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.f20847b = EmptyList.f47638a;
        } else {
            this.f20847b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultErrorLogin)) {
            return false;
        }
        ResultErrorLogin resultErrorLogin = (ResultErrorLogin) obj;
        return fa4.m11650l(this.f20846a, resultErrorLogin.f20846a) && fa4.m11650l(this.f20847b, resultErrorLogin.f20847b);
    }

    public final int hashCode() {
        String str = this.f20846a;
        return this.f20847b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "ResultErrorLogin(detail=" + this.f20846a + ", nonFieldErrors=" + this.f20847b + ")";
    }
}
