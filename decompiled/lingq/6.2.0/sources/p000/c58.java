package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class c58 {

    /* JADX INFO: renamed from: a */
    public final Map f9587a;

    /* JADX INFO: renamed from: b */
    public final long f9588b;

    public c58(Map map, long j) {
        this.f9587a = map;
        this.f9588b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c58)) {
            return false;
        }
        c58 c58Var = (c58) obj;
        return this.f9587a.equals(c58Var.f9587a) && this.f9588b == c58Var.f9588b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f9588b) + (this.f9587a.hashCode() * 31);
    }

    public final String toString() {
        return "ConfigData(config=" + this.f9587a + ", timestamp=" + this.f9588b + ')';
    }
}
