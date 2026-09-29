package p338qd;

import android.content.Context;
import android.content.pm.PackageManager;
import p290o6.C7967l0;

/* JADX INFO: renamed from: qd.i1 */
/* JADX INFO: loaded from: classes.dex */
public final class C8547i1 {

    /* JADX INFO: renamed from: c */
    public static final C7967l0 f45883c = new C7967l0("PackageStateCache");

    /* JADX INFO: renamed from: a */
    public final Context f45884a;

    /* JADX INFO: renamed from: b */
    public int f45885b = -1;

    public C8547i1(Context context) {
        this.f45884a = context;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized int m16652a() {
        try {
            if (this.f45885b == -1) {
                try {
                    this.f45885b = this.f45884a.getPackageManager().getPackageInfo(this.f45884a.getPackageName(), 0).versionCode;
                } catch (PackageManager.NameNotFoundException unused) {
                    f45883c.m15812m("The current version of the app could not be retrieved", new Object[0]);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f45885b;
    }
}
