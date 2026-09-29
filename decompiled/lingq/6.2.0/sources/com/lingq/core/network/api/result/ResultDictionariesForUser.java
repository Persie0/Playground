package com.lingq.core.network.api.result;

import java.util.List;
import java.util.Map;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import p000.cs4;
import p000.e65;
import p000.ey8;
import p000.fa4;
import p000.ri5;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class ResultDictionariesForUser {
    public static final C1637d1 Companion = new C1637d1();

    /* JADX INFO: renamed from: d */
    public static final cs4[] f20821d;

    /* JADX INFO: renamed from: a */
    public final List f20822a;

    /* JADX INFO: renamed from: b */
    public final Map f20823b;

    /* JADX INFO: renamed from: c */
    public final Map f20824c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f20821d = new cs4[]{AbstractC3192a.m15357b(lazyThreadSafetyMode, new ri5(20)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new ri5(21)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new ri5(22))};
    }

    public /* synthetic */ ResultDictionariesForUser(int i, List list, Map map, Map map2) {
        this.f20822a = (i & 1) == 0 ? EmptyList.f47638a : list;
        if ((i & 2) == 0) {
            this.f20823b = AbstractC3194a.m15360M();
        } else {
            this.f20823b = map;
        }
        if ((i & 4) == 0) {
            this.f20824c = AbstractC3194a.m15360M();
        } else {
            this.f20824c = map2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultDictionariesForUser)) {
            return false;
        }
        ResultDictionariesForUser resultDictionariesForUser = (ResultDictionariesForUser) obj;
        return fa4.m11650l(this.f20822a, resultDictionariesForUser.f20822a) && fa4.m11650l(this.f20823b, resultDictionariesForUser.f20823b) && fa4.m11650l(this.f20824c, resultDictionariesForUser.f20824c);
    }

    public final int hashCode() {
        return this.f20824c.hashCode() + e65.m10869a(this.f20822a.hashCode() * 31, 31, this.f20823b);
    }

    public final String toString() {
        return "ResultDictionariesForUser(activeDictionaries=" + this.f20822a + ", availableDictionaries=" + this.f20823b + ", dictionaryLanguages=" + this.f20824c + ")";
    }
}
