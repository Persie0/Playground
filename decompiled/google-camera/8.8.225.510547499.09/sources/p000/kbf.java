package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kbf {

    /* JADX INFO: renamed from: a */
    private final kbe f35520a;

    /* JADX INFO: renamed from: b */
    private final ArrayList f35521b;

    /* JADX INFO: renamed from: c */
    private int f35522c;

    /* JADX INFO: renamed from: d */
    private int f35523d;

    public kbf(kbe kbeVar, int i) {
        this.f35520a = kbeVar;
        this.f35521b = new ArrayList(i);
        this.f35522c = i;
        for (int i2 = 0; i2 < i; i2++) {
            this.f35521b.add(kbeVar.mo13930a());
        }
        this.f35523d = i;
    }

    /* JADX INFO: renamed from: a */
    public final Object m13931a() {
        int i = this.f35522c;
        if (i <= 0) {
            return this.f35520a.mo13930a();
        }
        int i2 = i - 1;
        Object obj = this.f35521b.get(i2);
        this.f35521b.remove(i2);
        this.f35522c--;
        return obj;
    }

    /* JADX INFO: renamed from: b */
    public final void m13932b(Object obj) {
        int i = this.f35522c;
        int i2 = this.f35523d;
        if (i == i2) {
            this.f35521b.ensureCapacity(i2 + i2);
            int i3 = this.f35523d;
            this.f35523d = i3 + i3;
        }
        this.f35521b.add(obj);
        this.f35522c++;
    }
}
