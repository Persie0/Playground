package p000;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.C1043b;

/* JADX INFO: loaded from: classes.dex */
public final class gsc implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f41273a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f41274b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f41275c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f41276d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Bundle f41277e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f41278f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ boolean f41279g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f41280h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1043b f41281i;

    public gsc(C1043b c1043b, String str, String str2, long j, long j2, Bundle bundle, boolean z, boolean z2, boolean z3) {
        this.f41273a = str;
        this.f41274b = str2;
        this.f41275c = j;
        this.f41276d = j2;
        this.f41277e = bundle;
        this.f41278f = z;
        this.f41279g = z2;
        this.f41280h = z3;
        this.f41281i = c1043b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41281i.m5856M(this.f41273a, this.f41274b, this.f41275c, this.f41276d, this.f41277e, this.f41278f, this.f41279g, this.f41280h);
    }
}
