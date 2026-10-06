package p000;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lpt {

    /* JADX INFO: renamed from: a */
    public final Uri f38906a;

    /* JADX INFO: renamed from: b */
    public final String f38907b;

    /* JADX INFO: renamed from: c */
    public final String f38908c;

    /* JADX INFO: renamed from: d */
    public final boolean f38909d;

    /* JADX INFO: renamed from: e */
    public final boolean f38910e;

    /* JADX INFO: renamed from: f */
    public final boolean f38911f;

    public lpt(Uri uri) {
        this(uri, "", "", false, false, false);
    }

    public lpt(Uri uri, String str, String str2, boolean z, boolean z2, boolean z3) {
        this.f38906a = uri;
        this.f38907b = str;
        this.f38908c = str2;
        this.f38909d = z;
        this.f38910e = z2;
        this.f38911f = z3;
    }

    /* JADX INFO: renamed from: a */
    public final lpt m15832a() {
        return new lpt(this.f38906a, this.f38907b, this.f38908c, this.f38909d, true, this.f38911f);
    }

    /* JADX INFO: renamed from: b */
    public final lpt m15833b() {
        Uri uri = this.f38906a;
        if (uri != null) {
            return new lpt(uri, this.f38907b, this.f38908c, this.f38909d, this.f38910e, true);
        }
        throw new IllegalStateException("Cannot set enableAutoSubpackage on SharedPrefs-backed flags");
    }

    /* JADX INFO: renamed from: c */
    public final lpt m15834c() {
        if (this.f38907b.isEmpty()) {
            return new lpt(this.f38906a, this.f38907b, this.f38908c, true, this.f38910e, this.f38911f);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public final lpv m15835d(String str, boolean z) {
        return lpv.m15839b(this, str, Boolean.valueOf(z), false);
    }

    /* JADX INFO: renamed from: e */
    public final lpv m15836e(String str, long j) {
        return lpv.m15840c(this, str, Long.valueOf(j), true);
    }

    /* JADX INFO: renamed from: f */
    public final lpv m15837f(String str, String str2) {
        return lpv.m15841d(this, str, str2, true);
    }

    /* JADX INFO: renamed from: g */
    public final lpv m15838g(String str, boolean z) {
        return lpv.m15839b(this, str, Boolean.valueOf(z), true);
    }
}
