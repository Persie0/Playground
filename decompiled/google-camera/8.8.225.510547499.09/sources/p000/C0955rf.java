package p000;

import android.content.Context;

/* JADX INFO: renamed from: rf */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0955rf {

    /* JADX INFO: renamed from: a */
    public final Context f47538a;

    /* JADX INFO: renamed from: b */
    public final C0956rg f47539b;

    /* JADX INFO: renamed from: c */
    public final C0954re f47540c;

    /* JADX INFO: renamed from: d */
    public final bkn f47541d;

    /* JADX INFO: renamed from: e */
    public final bkn f47542e;

    public C0955rf(Context context, C0956rg c0956rg, bkn bknVar, bkn bknVar2, C0954re c0954re, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f47538a = context;
        this.f47539b = c0956rg;
        this.f47541d = bknVar;
        this.f47542e = bknVar2;
        this.f47540c = c0954re;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0955rf)) {
            return false;
        }
        C0955rf c0955rf = (C0955rf) obj;
        return ooc.m18737c(this.f47538a, c0955rf.f47538a) && ooc.m18737c(this.f47539b, c0955rf.f47539b) && ooc.m18737c(this.f47541d, c0955rf.f47541d) && ooc.m18737c(this.f47542e, c0955rf.f47542e) && ooc.m18737c(this.f47540c, c0955rf.f47540c);
    }

    public final int hashCode() {
        return ((((this.f47538a.hashCode() * 961) + this.f47541d.hashCode()) * 31) + this.f47542e.hashCode()) * 31;
    }

    public final String toString() {
        return "Config(appContext=" + this.f47538a + ", threadConfig=" + this.f47539b + ", cameraMetadataConfig=" + this.f47541d + ", cameraBackendConfig=" + this.f47542e + ", cameraInteropConfig=" + this.f47540c + ')';
    }
}
