package p000;

import android.os.SystemClock;

/* JADX INFO: renamed from: sh */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0984sh {

    /* JADX INFO: renamed from: a */
    public final long f47580a;

    /* JADX INFO: renamed from: b */
    public final C0947qy f47581b;

    /* JADX INFO: renamed from: c */
    public final Throwable f47582c;

    /* JADX INFO: renamed from: d */
    public final int f47583d;

    public /* synthetic */ C0984sh(int i, C0947qy c0947qy, Throwable th, int i2) {
        long jElapsedRealtimeNanos = (i2 & 2) != 0 ? SystemClock.elapsedRealtimeNanos() : 0L;
        c0947qy = (i2 & 4) != 0 ? null : c0947qy;
        th = (i2 & 8) != 0 ? null : th;
        this.f47583d = i;
        this.f47580a = jElapsedRealtimeNanos;
        this.f47581b = c0947qy;
        this.f47582c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0984sh)) {
            return false;
        }
        C0984sh c0984sh = (C0984sh) obj;
        return this.f47583d == c0984sh.f47583d && this.f47580a == c0984sh.f47580a && ooc.m18737c(this.f47581b, c0984sh.f47581b) && ooc.m18737c(this.f47582c, c0984sh.f47582c);
    }

    public final int hashCode() {
        int i = this.f47583d * 31;
        int iM17510e = C0854nm.m17510e(this.f47580a);
        C0947qy c0947qy = this.f47581b;
        int i2 = (((i + iM17510e) * 31) + (c0947qy == null ? 0 : c0947qy.f47513a)) * 31;
        Throwable th = this.f47582c;
        return i2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "ClosingInfo(reason=" + ((Object) C0771kk.m14404c(this.f47583d)) + ", closingTimestamp=" + ((Object) C1069vl.m19505b(this.f47580a)) + ", errorCode=" + this.f47581b + ", exception=" + this.f47582c + ')';
    }
}
