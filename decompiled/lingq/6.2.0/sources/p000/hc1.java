package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class hc1 {

    /* JADX INFO: renamed from: a */
    public final String f42153a;

    /* JADX INFO: renamed from: b */
    public final Set f42154b;

    /* JADX INFO: renamed from: c */
    public final Set f42155c;

    /* JADX INFO: renamed from: d */
    public final int f42156d;

    /* JADX INFO: renamed from: e */
    public final int f42157e;

    /* JADX INFO: renamed from: f */
    public final zc1 f42158f;

    /* JADX INFO: renamed from: g */
    public final Set f42159g;

    public hc1(String str, Set set, Set set2, int i, int i2, zc1 zc1Var, Set set3) {
        this.f42153a = str;
        this.f42154b = Collections.unmodifiableSet(set);
        this.f42155c = Collections.unmodifiableSet(set2);
        this.f42156d = i;
        this.f42157e = i2;
        this.f42158f = zc1Var;
        this.f42159g = Collections.unmodifiableSet(set3);
    }

    /* JADX INFO: renamed from: a */
    public static gc1 m13188a(rp7 rp7Var) {
        return new gc1(rp7Var, new rp7[0]);
    }

    /* JADX INFO: renamed from: b */
    public static gc1 m13189b(Class cls) {
        return new gc1(cls, new Class[0]);
    }

    /* JADX INFO: renamed from: c */
    public static hc1 m13190c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(rp7.m20740a(cls));
        for (Class cls2 : clsArr) {
            wfb.m23913h(cls2, "Null interface");
            hashSet.add(rp7.m20740a(cls2));
        }
        return new hc1(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new fc1(obj, 1), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f42154b.toArray()) + ">{" + this.f42156d + ", type=" + this.f42157e + ", deps=" + Arrays.toString(this.f42155c.toArray()) + "}";
    }
}
