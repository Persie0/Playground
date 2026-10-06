package p000;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class awx {

    /* JADX INFO: renamed from: a */
    public final List f2621a;

    public awx(List list) {
        this.f2621a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ooc.m18737c(getClass(), obj.getClass())) {
            return false;
        }
        return ooc.m18737c(this.f2621a, ((awx) obj).f2621a);
    }

    public final int hashCode() {
        return this.f2621a.hashCode();
    }

    public final String toString() {
        return omn.m18680T(this.f2621a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
