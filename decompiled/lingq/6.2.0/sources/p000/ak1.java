package p000;

import android.net.NetworkRequest;
import androidx.work.NetworkType;
import java.util.Set;
import kotlin.collections.EmptySet;

/* JADX INFO: loaded from: classes2.dex */
public final class ak1 {

    /* JADX INFO: renamed from: j */
    public static final ak1 f751j = new ak1();

    /* JADX INFO: renamed from: a */
    public final NetworkType f752a;

    /* JADX INFO: renamed from: b */
    public final gk6 f753b;

    /* JADX INFO: renamed from: c */
    public final boolean f754c;

    /* JADX INFO: renamed from: d */
    public final boolean f755d;

    /* JADX INFO: renamed from: e */
    public final boolean f756e;

    /* JADX INFO: renamed from: f */
    public final boolean f757f;

    /* JADX INFO: renamed from: g */
    public final long f758g;

    /* JADX INFO: renamed from: h */
    public final long f759h;

    /* JADX INFO: renamed from: i */
    public final Set f760i;

    public ak1(ak1 ak1Var) {
        ak1Var.getClass();
        this.f754c = ak1Var.f754c;
        this.f755d = ak1Var.f755d;
        this.f753b = ak1Var.f753b;
        this.f752a = ak1Var.f752a;
        this.f756e = ak1Var.f756e;
        this.f757f = ak1Var.f757f;
        this.f760i = ak1Var.f760i;
        this.f758g = ak1Var.f758g;
        this.f759h = ak1Var.f759h;
    }

    /* JADX INFO: renamed from: a */
    public final long m513a() {
        return this.f759h;
    }

    /* JADX INFO: renamed from: b */
    public final long m514b() {
        return this.f758g;
    }

    /* JADX INFO: renamed from: c */
    public final Set m515c() {
        return this.f760i;
    }

    /* JADX INFO: renamed from: d */
    public final NetworkRequest m516d() {
        return (NetworkRequest) this.f753b.f40912a;
    }

    /* JADX INFO: renamed from: e */
    public final gk6 m517e() {
        return this.f753b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ak1.class.equals(obj.getClass())) {
            return false;
        }
        ak1 ak1Var = (ak1) obj;
        if (this.f754c == ak1Var.f754c && this.f755d == ak1Var.f755d && this.f756e == ak1Var.f756e && this.f757f == ak1Var.f757f && this.f758g == ak1Var.f758g && this.f759h == ak1Var.f759h && fa4.m11650l(m516d(), ak1Var.m516d()) && this.f752a == ak1Var.f752a) {
            return fa4.m11650l(this.f760i, ak1Var.f760i);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final NetworkType m518f() {
        return this.f752a;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m519g() {
        return !this.f760i.isEmpty();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m520h() {
        return this.f756e;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.f752a.hashCode() * 31) + (this.f754c ? 1 : 0)) * 31) + (this.f755d ? 1 : 0)) * 31) + (this.f756e ? 1 : 0)) * 31) + (this.f757f ? 1 : 0)) * 31;
        long j = this.f758g;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f759h;
        int iHashCode2 = (this.f760i.hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31;
        NetworkRequest networkRequestM516d = m516d();
        return iHashCode2 + (networkRequestM516d != null ? networkRequestM516d.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m521i() {
        return this.f754c;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m522j() {
        return this.f755d;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m523k() {
        return this.f757f;
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + this.f752a + ", requiresCharging=" + this.f754c + ", requiresDeviceIdle=" + this.f755d + ", requiresBatteryNotLow=" + this.f756e + ", requiresStorageNotLow=" + this.f757f + ", contentTriggerUpdateDelayMillis=" + this.f758g + ", contentTriggerMaxDelayMillis=" + this.f759h + ", contentUriTriggers=" + this.f760i + ", }";
    }

    public ak1(gk6 gk6Var, NetworkType networkType, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, Set set) {
        gk6Var.getClass();
        networkType.getClass();
        this.f753b = gk6Var;
        this.f752a = networkType;
        this.f754c = z;
        this.f755d = z2;
        this.f756e = z3;
        this.f757f = z4;
        this.f758g = j;
        this.f759h = j2;
        this.f760i = set;
    }

    public ak1() {
        NetworkType networkType = NetworkType.NOT_REQUIRED;
        networkType.getClass();
        this.f753b = new gk6(null);
        this.f752a = networkType;
        this.f754c = false;
        this.f755d = false;
        this.f756e = false;
        this.f757f = false;
        this.f758g = -1L;
        this.f759h = -1L;
        this.f760i = EmptySet.f47640a;
    }
}
