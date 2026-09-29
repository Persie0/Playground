package p026b5;

import android.net.Uri;
import androidx.work.NetworkType;
import dm.C5207g;
import java.util.Set;
import kotlin.collections.EmptySet;

/* JADX INFO: renamed from: b5.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1309b {

    /* JADX INFO: renamed from: i */
    public static final C1309b f8045i = new C1309b(0);

    /* JADX INFO: renamed from: a */
    public final NetworkType f8046a;

    /* JADX INFO: renamed from: b */
    public final boolean f8047b;

    /* JADX INFO: renamed from: c */
    public final boolean f8048c;

    /* JADX INFO: renamed from: d */
    public final boolean f8049d;

    /* JADX INFO: renamed from: e */
    public final boolean f8050e;

    /* JADX INFO: renamed from: f */
    public final long f8051f;

    /* JADX INFO: renamed from: g */
    public final long f8052g;

    /* JADX INFO: renamed from: h */
    public final Set<a> f8053h;

    /* JADX INFO: renamed from: b5.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Uri f8054a;

        /* JADX INFO: renamed from: b */
        public final boolean f8055b;

        public a(boolean z10, Uri uri) {
            this.f8054a = uri;
            this.f8055b = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!C5207g.m11106a(a.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            C5207g.m11109d(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            a aVar = (a) obj;
            return C5207g.m11106a(this.f8054a, aVar.f8054a) && this.f8055b == aVar.f8055b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f8055b) + (this.f8054a.hashCode() * 31);
        }
    }

    public C1309b() {
        this(0);
    }

    public C1309b(int i10) {
        this(NetworkType.NOT_REQUIRED, false, false, false, false, -1L, -1L, EmptySet.f38034a);
    }

    public C1309b(NetworkType networkType, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, Set<a> set) {
        C5207g.m11111f(networkType, "requiredNetworkType");
        C5207g.m11111f(set, "contentUriTriggers");
        this.f8046a = networkType;
        this.f8047b = z10;
        this.f8048c = z11;
        this.f8049d = z12;
        this.f8050e = z13;
        this.f8051f = j10;
        this.f8052g = j11;
        this.f8053h = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean zM11106a = false;
        if (obj != null) {
            if (C5207g.m11106a(C1309b.class, obj.getClass())) {
                C1309b c1309b = (C1309b) obj;
                if (this.f8047b != c1309b.f8047b || this.f8048c != c1309b.f8048c || this.f8049d != c1309b.f8049d || this.f8050e != c1309b.f8050e || this.f8051f != c1309b.f8051f || this.f8052g != c1309b.f8052g) {
                    return false;
                }
                if (this.f8046a == c1309b.f8046a) {
                    zM11106a = C5207g.m11106a(this.f8053h, c1309b.f8053h);
                }
            }
        }
        return zM11106a;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.f8046a.hashCode() * 31) + (this.f8047b ? 1 : 0)) * 31) + (this.f8048c ? 1 : 0)) * 31) + (this.f8049d ? 1 : 0)) * 31) + (this.f8050e ? 1 : 0)) * 31;
        long j10 = this.f8051f;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f8052g;
        return this.f8053h.hashCode() + ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31);
    }
}
