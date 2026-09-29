package p000;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzbh;

/* JADX INFO: loaded from: classes.dex */
public final class bdc {

    /* JADX INFO: renamed from: a */
    public final String f8402a;

    /* JADX INFO: renamed from: b */
    public final String f8403b;

    /* JADX INFO: renamed from: c */
    public final long f8404c;

    /* JADX INFO: renamed from: d */
    public final long f8405d;

    /* JADX INFO: renamed from: e */
    public final Bundle f8406e;

    public bdc(long j, long j2, Bundle bundle, String str, String str2) {
        this.f8402a = str;
        this.f8403b = str2;
        this.f8406e = bundle;
        this.f8404c = j;
        this.f8405d = j2;
    }

    /* JADX INFO: renamed from: a */
    public static bdc m3653a(zzbh zzbhVar) {
        String str = zzbhVar.f12389a;
        String str2 = zzbhVar.f12391c;
        return new bdc(zzbhVar.f12392d, zzbhVar.f12393e, zzbhVar.f12390b.m5952g0(), str, str2);
    }

    /* JADX INFO: renamed from: b */
    public final zzbh m3654b() {
        zzbf zzbfVar = new zzbf(new Bundle(this.f8406e));
        return new zzbh(this.f8402a, zzbfVar, this.f8403b, this.f8404c, this.f8405d);
    }

    public final String toString() {
        String string = this.f8406e.toString();
        String str = this.f8403b;
        int length = String.valueOf(str).length();
        String str2 = this.f8402a;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + string.length());
        AbstractC3393o1.m17725C(sb, "origin=", str, ",name=", str2);
        return AbstractC3393o1.m17738m(sb, ",params=", string);
    }
}
