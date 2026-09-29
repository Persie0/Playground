package p000;

import android.net.NetworkRequest;

/* JADX INFO: loaded from: classes2.dex */
public final class gk6 {

    /* JADX INFO: renamed from: b */
    public static final String f40911b = oj5.m18041h("NetworkRequestCompat");

    /* JADX INFO: renamed from: a */
    public final Object f40912a;

    public gk6(NetworkRequest networkRequest) {
        this.f40912a = networkRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gk6) && fa4.m11650l(this.f40912a, ((gk6) obj).f40912a);
    }

    public final int hashCode() {
        Object obj = this.f40912a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "NetworkRequestCompat(wrapped=" + this.f40912a + ')';
    }
}
