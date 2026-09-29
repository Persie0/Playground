package p000;

import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes.dex */
public final class k8a {

    /* JADX INFO: renamed from: d */
    public static final k8a f46867d = new k8a(new j8a[0]);

    /* JADX INFO: renamed from: a */
    public final int f46868a;

    /* JADX INFO: renamed from: b */
    public final ImmutableList f46869b;

    /* JADX INFO: renamed from: c */
    public int f46870c;

    static {
        uma.m22828w(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k8a(j8a... j8aVarArr) {
        ImmutableList immutableListM6288s = ImmutableList.m6288s(j8aVarArr);
        this.f46869b = immutableListM6288s;
        this.f46868a = j8aVarArr.length;
        int i = 0;
        while (i < immutableListM6288s.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < immutableListM6288s.size(); i3++) {
                if (((j8a) immutableListM6288s.get(i)).equals(immutableListM6288s.get(i3))) {
                    ss5.m21724v("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final j8a m15003a(int i) {
        return (j8a) this.f46869b.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k8a.class == obj.getClass()) {
            k8a k8aVar = (k8a) obj;
            if (this.f46868a == k8aVar.f46868a && this.f46869b.equals(k8aVar.f46869b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f46870c == 0) {
            this.f46870c = this.f46869b.hashCode();
        }
        return this.f46870c;
    }

    public final String toString() {
        return this.f46869b.toString();
    }
}
