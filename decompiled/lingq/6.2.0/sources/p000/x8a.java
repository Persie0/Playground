package p000;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class x8a {

    /* JADX INFO: renamed from: a */
    public HashSet f67936a;

    /* JADX INFO: renamed from: a */
    public final boolean m24410a(String str) {
        return !this.f67936a.contains(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x8a.class.equals(obj.getClass())) {
            return fa4.m11650l(((x8a) obj).f67936a, this.f67936a);
        }
        return false;
    }
}
