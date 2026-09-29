package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q6b {

    /* JADX INFO: renamed from: a */
    public final List f57330a;

    public q6b(List list) {
        this.f57330a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !q6b.class.equals(obj.getClass())) {
            return false;
        }
        return this.f57330a.equals(((q6b) obj).f57330a);
    }

    public final int hashCode() {
        return this.f57330a.hashCode();
    }

    public final String toString() {
        return u91.m22596N0(this.f57330a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
