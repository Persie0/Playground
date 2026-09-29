package com.google.android.gms.internal.measurement;

import androidx.activity.result.C0204c;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2596b {

    /* JADX INFO: renamed from: a */
    public String f14059a;

    /* JADX INFO: renamed from: b */
    public final long f14060b;

    /* JADX INFO: renamed from: c */
    public final HashMap f14061c;

    public C2596b(String str, long j10, HashMap map) {
        this.f14059a = str;
        this.f14060b = j10;
        HashMap map2 = new HashMap();
        this.f14061c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2596b clone() {
        return new C2596b(this.f14059a, this.f14060b, new HashMap(this.f14061c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2596b)) {
            return false;
        }
        C2596b c2596b = (C2596b) obj;
        if (this.f14060b == c2596b.f14060b && this.f14059a.equals(c2596b.f14059a)) {
            return this.f14061c.equals(c2596b.f14061c);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f14059a.hashCode() * 31;
        long j10 = this.f14060b;
        return ((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f14061c.hashCode();
    }

    public final String toString() {
        String str = this.f14059a;
        String string = this.f14061c.toString();
        StringBuilder sbM854m = C0204c.m854m("Event{name='", str, "', timestamp=");
        sbM854m.append(this.f14060b);
        sbM854m.append(", params=");
        sbM854m.append(string);
        sbM854m.append("}");
        return sbM854m.toString();
    }
}
