package cc;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;

/* JADX INFO: renamed from: cc.l3 */
/* JADX INFO: loaded from: classes.dex */
public final class C1869l3 {

    /* JADX INFO: renamed from: a */
    public final String f9971a;

    /* JADX INFO: renamed from: b */
    public final String f9972b;

    /* JADX INFO: renamed from: c */
    public final long f9973c;

    /* JADX INFO: renamed from: d */
    public final Bundle f9974d;

    public C1869l3(long j10, Bundle bundle, String str, String str2) {
        this.f9971a = str;
        this.f9972b = str2;
        this.f9974d = bundle;
        this.f9973c = j10;
    }

    /* JADX INFO: renamed from: b */
    public static C1869l3 m5737b(zzaw zzawVar) {
        String str = zzawVar.f14613a;
        String str2 = zzawVar.f14615c;
        return new C1869l3(zzawVar.f14616d, zzawVar.f14614b.m8535q(), str, str2);
    }

    /* JADX INFO: renamed from: a */
    public final zzaw m5738a() {
        return new zzaw(this.f9971a, new zzau(new Bundle(this.f9974d)), this.f9972b, this.f9973c);
    }

    public final String toString() {
        return "origin=" + this.f9972b + ",name=" + this.f9971a + ",params=" + this.f9974d.toString();
    }
}
