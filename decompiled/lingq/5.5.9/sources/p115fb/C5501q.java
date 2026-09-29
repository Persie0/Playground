package p115fb;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import p295ob.C8032b;

/* JADX INFO: renamed from: fb.q */
/* JADX INFO: loaded from: classes.dex */
public final class C5501q {

    /* JADX INFO: renamed from: a */
    public final Context f34111a;

    /* JADX INFO: renamed from: b */
    public int f34112b;

    /* JADX INFO: renamed from: c */
    public int f34113c = 0;

    public C5501q(Context context) {
        this.f34111a = context;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final synchronized int m11728a() {
        int i10 = this.f34113c;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = this.f34111a.getPackageManager();
        if (C8032b.m15902a(this.f34111a).f43660a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
        intent.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.f34113c = 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        this.f34113c = 2;
        return 2;
    }
}
