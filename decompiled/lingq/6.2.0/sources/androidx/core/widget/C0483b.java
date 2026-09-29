package androidx.core.widget;

import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import androidx.core.remoteviews.R$layout;
import p000.fa4;
import p000.t58;
import p000.u58;
import p000.xnc;

/* JADX INFO: renamed from: androidx.core.widget.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C0483b implements RemoteViewsService.RemoteViewsFactory {

    /* JADX INFO: renamed from: e */
    public static final t58 f5557e = new t58(new long[0], new RemoteViews[0]);

    /* JADX INFO: renamed from: a */
    public final RemoteViewsCompatService f5558a;

    /* JADX INFO: renamed from: b */
    public final int f5559b;

    /* JADX INFO: renamed from: c */
    public final int f5560c;

    /* JADX INFO: renamed from: d */
    public t58 f5561d = f5557e;

    public C0483b(RemoteViewsCompatService remoteViewsCompatService, int i, int i2) {
        this.f5558a = remoteViewsCompatService;
        this.f5559b = i;
        this.f5560c = i2;
    }

    /* JADX INFO: renamed from: a */
    public final void m2023a() {
        Long lValueOf;
        RemoteViewsCompatService remoteViewsCompatService = this.f5558a;
        SharedPreferences sharedPreferences = remoteViewsCompatService.getSharedPreferences("androidx.core.widget.prefs.RemoteViewsCompat", 0);
        sharedPreferences.getClass();
        StringBuilder sb = new StringBuilder();
        int i = this.f5559b;
        sb.append(i);
        sb.append(':');
        sb.append(this.f5560c);
        t58 t58Var = null;
        String string = sharedPreferences.getString(sb.toString(), null);
        if (string == null) {
            Log.w("RemoteViewsCompatServic", "No collection items were stored for widget " + i);
        } else {
            byte[] bArrDecode = Base64.decode(string, 0);
            bArrDecode.getClass();
            u58 u58Var = (u58) xnc.m24622a(bArrDecode, C0481xea2b2da7.f5556b);
            if (fa4.m11650l(Build.VERSION.INCREMENTAL, u58Var.f63449b)) {
                try {
                    lValueOf = Long.valueOf(remoteViewsCompatService.getPackageManager().getPackageInfo(remoteViewsCompatService.getPackageName(), 0).getLongVersionCode());
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("RemoteViewsCompatServic", "Couldn't retrieve version code for " + remoteViewsCompatService.getPackageManager(), e);
                    lValueOf = null;
                }
                if (lValueOf == null) {
                    Log.w("RemoteViewsCompatServic", "Couldn't get version code, not using stored collection items for widget " + i);
                } else {
                    if (lValueOf.longValue() != u58Var.f63450c) {
                        Log.w("RemoteViewsCompatServic", "App version code has changed, not using stored collection items for widget " + i);
                    } else {
                        try {
                            t58Var = (t58) xnc.m24622a(u58Var.f63448a, C0480x9e24ce41.f5555b);
                        } catch (Throwable th) {
                            Log.e("RemoteViewsCompatServic", "Unable to deserialize stored collection items for widget " + i, th);
                        }
                    }
                }
            } else {
                Log.w("RemoteViewsCompatServic", "Android version code has changed, not using stored collection items for widget " + i);
            }
        }
        if (t58Var == null) {
            t58Var = f5557e;
        }
        this.f5561d = t58Var;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        return this.f5561d.f61880a.length;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i) {
        try {
            return this.f5561d.f61880a[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return -1L;
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final /* bridge */ /* synthetic */ RemoteViews getLoadingView() {
        return null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getViewAt(int i) {
        try {
            return this.f5561d.f61881b[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return new RemoteViews(this.f5558a.getPackageName(), R$layout.invalid_list_item);
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return this.f5561d.f61883d;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        return this.f5561d.f61882c;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
        m2023a();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() {
        m2023a();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
    }
}
