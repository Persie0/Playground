package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c8 */
/* JADX INFO: loaded from: classes.dex */
public final class C2619c8 implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f14094a = -1;

    /* JADX INFO: renamed from: b */
    public boolean f14095b;

    /* JADX INFO: renamed from: c */
    public Iterator f14096c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2647e8 f14097d;

    /* JADX INFO: renamed from: a */
    public final Iterator m7740a() {
        if (this.f14096c == null) {
            this.f14096c = this.f14097d.f14176c.entrySet().iterator();
        }
        return this.f14096c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f14094a + 1;
        C2647e8 c2647e8 = this.f14097d;
        if (i10 < c2647e8.f14175b.size()) {
            return true;
        }
        if (!c2647e8.f14176c.isEmpty() && m7740a().hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f14095b = true;
        int i10 = this.f14094a + 1;
        this.f14094a = i10;
        C2647e8 c2647e8 = this.f14097d;
        return i10 < c2647e8.f14175b.size() ? (Map.Entry) c2647e8.f14175b.get(this.f14094a) : (Map.Entry) m7740a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f14095b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f14095b = false;
        int i10 = C2647e8.f14173g;
        C2647e8 c2647e8 = this.f14097d;
        c2647e8.m7779g();
        if (this.f14094a >= c2647e8.f14175b.size()) {
            m7740a().remove();
            return;
        }
        int i11 = this.f14094a;
        this.f14094a = i11 - 1;
        c2647e8.m7777e(i11);
    }
}
