package p000;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class btk {

    /* JADX INFO: renamed from: a */
    final Object f4428a;

    /* JADX INFO: renamed from: b */
    public List f4429b;

    /* JADX INFO: renamed from: c */
    btk f4430c;

    /* JADX INFO: renamed from: d */
    btk f4431d;

    btk() {
        this(null);
    }

    public btk(Object obj) {
        this.f4431d = this;
        this.f4430c = this;
        this.f4428a = obj;
    }

    /* JADX INFO: renamed from: a */
    public final int m3047a() {
        List list = this.f4429b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final Object m3048b() {
        int iM3047a = m3047a();
        if (iM3047a > 0) {
            return this.f4429b.remove(iM3047a - 1);
        }
        return null;
    }
}
