package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class juf extends jhh {

    /* JADX INFO: renamed from: A */
    private final khb f34815A;

    /* JADX INFO: renamed from: B */
    private final khb f34816B;

    /* JADX INFO: renamed from: C */
    private final khb f34817C;

    /* JADX INFO: renamed from: a */
    public final khb f34818a;

    /* JADX INFO: renamed from: t */
    private final juh f34819t;

    /* JADX INFO: renamed from: u */
    private final khb f34820u;

    /* JADX INFO: renamed from: v */
    private final khb f34821v;

    /* JADX INFO: renamed from: w */
    private final khb f34822w;

    /* JADX INFO: renamed from: x */
    private final khb f34823x;

    /* JADX INFO: renamed from: y */
    private final khb f34824y;

    /* JADX INFO: renamed from: z */
    private final khb f34825z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public juf(Context context, Looper looper, jea jeaVar, jeb jebVar, jgz jgzVar) {
        super(context, looper, 14, jgzVar, jeaVar, jebVar);
        jmv jmvVar = jmw.f34379a;
        ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        juh juhVarM13505a = juh.m13505a(context);
        this.f34820u = new khb((byte[]) null);
        this.f34821v = new khb((byte[]) null);
        this.f34822w = new khb((byte[]) null);
        this.f34823x = new khb((byte[]) null);
        this.f34824y = new khb((byte[]) null);
        this.f34818a = new khb((byte[]) null);
        this.f34825z = new khb((byte[]) null);
        this.f34815A = new khb((byte[]) null);
        this.f34816B = new khb((byte[]) null);
        this.f34817C = new khb((byte[]) null);
        new khb((byte[]) null);
        new khb((byte[]) null);
        jib.m13205j(executorServiceUnconfigurableExecutorService);
        this.f34819t = juhVarM13505a;
        lku.m15663q(new dfg(context, 10));
    }

    @Override // p000.jgw
    /* JADX INFO: renamed from: C */
    public final boolean mo13154C() {
        return true;
    }

    @Override // p000.jhh, p000.jgw, p000.jdu
    /* JADX INFO: renamed from: a */
    public final int mo12833a() {
        return 8600000;
    }

    @Override // p000.jgw
    /* JADX INFO: renamed from: b */
    protected final /* synthetic */ IInterface mo12834b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
        return iInterfaceQueryLocalInterface instanceof jtd ? (jtd) iInterfaceQueryLocalInterface : new jtd(iBinder);
    }

    @Override // p000.jgw
    /* JADX INFO: renamed from: c */
    protected final String mo12835c() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    @Override // p000.jgw
    /* JADX INFO: renamed from: d */
    protected final String mo12836d() {
        return "com.google.android.gms.wearable.BIND";
    }

    @Override // p000.jgw
    /* JADX INFO: renamed from: e */
    public final jcw[] mo12893e() {
        return jqu.f34622r;
    }

    @Override // p000.jgw, p000.jdu
    /* JADX INFO: renamed from: i */
    public final void mo12941i(jgr jgrVar) {
        if (!mo12946n()) {
            try {
                Bundle bundle = this.f33986c.getPackageManager().getApplicationInfo("com.google.android.wearable.app.cn", 128).metaData;
                int i = bundle != null ? bundle.getInt("com.google.android.wearable.api.version", 0) : 0;
                if (i < 8600000) {
                    Log.w("WearableClient", "The Wear OS app is out of date. Requires API version 8600000 but found " + i);
                    Context context = this.f33986c;
                    Intent intent = new Intent("com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR").setPackage("com.google.android.wearable.app.cn");
                    if (context.getPackageManager().resolveActivity(intent, 65536) == null) {
                        intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.wearable.app.cn").build());
                    }
                    m13173y(jgrVar, 6, jmv.m13375b(context, intent, 33554432));
                    return;
                }
            } catch (PackageManager.NameNotFoundException e) {
                m13173y(jgrVar, 16, null);
                return;
            }
        }
        super.mo12941i(jgrVar);
    }

    @Override // p000.jgw, p000.jdu
    /* JADX INFO: renamed from: n */
    public final boolean mo12946n() {
        return !this.f34819t.m13509b();
    }

    @Override // p000.jgw
    /* JADX INFO: renamed from: w */
    protected final String mo13171w() {
        return this.f34819t.m13509b() ? "com.google.android.wearable.app.cn" : "com.google.android.gms";
    }

    @Override // p000.jgw
    /* JADX INFO: renamed from: x */
    protected final void mo13172x(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (i == 0) {
            this.f34820u.m14241g(iBinder);
            this.f34821v.m14241g(iBinder);
            this.f34822w.m14241g(iBinder);
            this.f34824y.m14241g(iBinder);
            this.f34818a.m14241g(iBinder);
            this.f34825z.m14241g(iBinder);
            this.f34815A.m14241g(iBinder);
            this.f34816B.m14241g(iBinder);
            this.f34817C.m14241g(iBinder);
            this.f34823x.m14241g(iBinder);
            i = 0;
        }
        super.mo13172x(i, iBinder, bundle, i2);
    }
}
