package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2610c {

    /* JADX INFO: renamed from: a */
    public C2596b f14074a;

    /* JADX INFO: renamed from: b */
    public C2596b f14075b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f14076c;

    public C2610c() {
        this.f14074a = new C2596b("", 0L, null);
        this.f14075b = new C2596b("", 0L, null);
        this.f14076c = new ArrayList();
    }

    public C2610c(C2596b c2596b) {
        this.f14074a = c2596b;
        this.f14075b = c2596b.clone();
        this.f14076c = new ArrayList();
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        C2610c c2610c = new C2610c(this.f14074a.clone());
        Iterator it = this.f14076c.iterator();
        while (it.hasNext()) {
            c2610c.f14076c.add(((C2596b) it.next()).clone());
        }
        return c2610c;
    }
}
