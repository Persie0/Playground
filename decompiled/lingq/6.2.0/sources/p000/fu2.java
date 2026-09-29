package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class fu2 {

    /* JADX INFO: renamed from: a */
    public final String f39638a;

    /* JADX INFO: renamed from: b */
    public final long f39639b;

    /* JADX INFO: renamed from: c */
    public final Map f39640c;

    public fu2(String str, long j, Map map) {
        map.getClass();
        this.f39638a = str;
        this.f39639b = j;
        this.f39640c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu2)) {
            return false;
        }
        fu2 fu2Var = (fu2) obj;
        return this.f39638a.equals(fu2Var.f39638a) && this.f39639b == fu2Var.f39639b && fa4.m11650l(this.f39640c, fu2Var.f39640c);
    }

    public final int hashCode() {
        return this.f39640c.hashCode() + ux5.m22981d(this.f39639b, this.f39638a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "EventMetadata(sessionId=" + this.f39638a + ", timestamp=" + this.f39639b + ", additionalCustomKeys=" + this.f39640c + ')';
    }
}
