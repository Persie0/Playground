package com.google.common.collect;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p000.AbstractC3489q9;
import p000.b14;
import p000.f14;

/* JADX INFO: renamed from: com.google.common.collect.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1097m {

    /* JADX INFO: renamed from: a */
    public Object[] f13473a;

    /* JADX INFO: renamed from: b */
    public int f13474b = 0;

    /* JADX INFO: renamed from: c */
    public f14 f13475c;

    public C1097m(int i) {
        this.f13473a = new Object[i * 2];
    }

    /* JADX INFO: renamed from: a */
    public final ImmutableMap m6339a(boolean z) {
        f14 f14Var;
        f14 f14Var2;
        if (z && (f14Var2 = this.f13475c) != null) {
            throw f14Var2.m11495a();
        }
        RegularImmutableMap regularImmutableMapM6320l = RegularImmutableMap.m6320l(this.f13474b, this.f13473a, this);
        if (!z || (f14Var = this.f13475c) == null) {
            return regularImmutableMapM6320l;
        }
        throw f14Var.m11495a();
    }

    /* JADX INFO: renamed from: b */
    public final void m6340b(Object obj, Object obj2) {
        int i = (this.f13474b + 1) * 2;
        Object[] objArr = this.f13473a;
        if (i > objArr.length) {
            this.f13473a = Arrays.copyOf(objArr, b14.m3155f(objArr.length, i));
        }
        AbstractC3489q9.m19778h(obj, obj2);
        Object[] objArr2 = this.f13473a;
        int i2 = this.f13474b;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.f13474b = i2 + 1;
    }

    /* JADX INFO: renamed from: c */
    public final void m6341c(Set set) {
        if (set instanceof Collection) {
            int size = (set.size() + this.f13474b) * 2;
            Object[] objArr = this.f13473a;
            if (size > objArr.length) {
                this.f13473a = Arrays.copyOf(objArr, b14.m3155f(objArr.length, size));
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            m6340b(entry.getKey(), entry.getValue());
        }
    }
}
