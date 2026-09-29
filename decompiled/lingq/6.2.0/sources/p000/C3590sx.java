package p000;

import android.os.Build;
import com.google.common.collect.C1098n;
import com.google.common.collect.ImmutableSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: sx */
/* JADX INFO: loaded from: classes.dex */
public final class C3590sx {

    /* JADX INFO: renamed from: d */
    public static final C3590sx f61524d;

    /* JADX INFO: renamed from: a */
    public final int f61525a;

    /* JADX INFO: renamed from: b */
    public final int f61526b;

    /* JADX INFO: renamed from: c */
    public final ImmutableSet f61527c;

    static {
        C3590sx c3590sx;
        if (Build.VERSION.SDK_INT >= 33) {
            C1098n c1098n = new C1098n(4);
            for (int i = 1; i <= 10; i++) {
                c1098n.m3157b(Integer.valueOf(uma.m22818m(i)));
            }
            c3590sx = new C3590sx(2, c1098n.mo6343h());
        } else {
            c3590sx = new C3590sx(2, 10);
        }
        f61524d = c3590sx;
    }

    public C3590sx(int i, Set set) {
        this.f61525a = i;
        ImmutableSet immutableSetM6308n = ImmutableSet.m6308n(set);
        this.f61527c = immutableSetM6308n;
        bga it = immutableSetM6308n.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.f61526b = iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3590sx)) {
            return false;
        }
        C3590sx c3590sx = (C3590sx) obj;
        return this.f61525a == c3590sx.f61525a && this.f61526b == c3590sx.f61526b && Objects.equals(this.f61527c, c3590sx.f61527c);
    }

    public final int hashCode() {
        int i = ((this.f61525a * 31) + this.f61526b) * 31;
        ImmutableSet immutableSet = this.f61527c;
        return i + (immutableSet == null ? 0 : immutableSet.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.f61525a + ", maxChannelCount=" + this.f61526b + ", channelMasks=" + this.f61527c + "]";
    }

    public C3590sx(int i, int i2) {
        this.f61525a = i;
        this.f61526b = i2;
        this.f61527c = null;
    }
}
