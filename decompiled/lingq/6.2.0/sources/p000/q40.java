package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class q40 {

    /* JADX INFO: renamed from: a */
    public final String f57239a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f57240b;

    public q40(String str, ArrayList arrayList) {
        if (str == null) {
            C3386nv.m17635v("Null userAgent");
            throw null;
        }
        this.f57239a = str;
        this.f57240b = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static q40 m19633a(String str, ArrayList arrayList) {
        return new q40(str, arrayList);
    }

    /* JADX INFO: renamed from: b */
    public final List m19634b() {
        return this.f57240b;
    }

    /* JADX INFO: renamed from: c */
    public final String m19635c() {
        return this.f57239a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q40)) {
            return false;
        }
        q40 q40Var = (q40) obj;
        return this.f57239a.equals(q40Var.f57239a) && this.f57240b.equals(q40Var.f57240b);
    }

    public final int hashCode() {
        return this.f57240b.hashCode() ^ ((this.f57239a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f57239a + ", usedDates=" + this.f57240b + "}";
    }
}
