package com.lingq.core.network.api.result;

import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.cs4;
import p000.e65;
import p000.ey8;
import p000.fa4;
import p000.m78;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultCardsChat {
    public static final C1789z Companion = new C1789z();

    /* JADX INFO: renamed from: b */
    public static final cs4[] f20656b = {AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new m78(22))};

    /* JADX INFO: renamed from: a */
    public final List f20657a;

    public /* synthetic */ ResultCardsChat(int i, List list) {
        if ((i & 1) == 0) {
            this.f20657a = EmptyList.f47638a;
        } else {
            this.f20657a = list;
        }
    }

    /* JADX INFO: renamed from: a */
    public final List m8332a() {
        return this.f20657a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResultCardsChat) && fa4.m11650l(this.f20657a, ((ResultCardsChat) obj).f20657a);
    }

    public final int hashCode() {
        return this.f20657a.hashCode();
    }

    public final String toString() {
        return e65.m10874f("ResultCardsChat(cards=", ")", this.f20657a);
    }

    public ResultCardsChat(ArrayList arrayList) {
        this.f20657a = arrayList;
    }
}
