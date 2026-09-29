package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.internal.clearcut.zzge$zzv$zzb;

/* JADX INFO: loaded from: classes2.dex */
public final class m31 {

    /* JADX INFO: renamed from: j */
    public static final b64 f50488j = new b64("ClearcutLogger.API", new ncb(7), new p84(7));

    /* JADX INFO: renamed from: a */
    public final Context f50489a;

    /* JADX INFO: renamed from: b */
    public final String f50490b;

    /* JADX INFO: renamed from: c */
    public final int f50491c;

    /* JADX INFO: renamed from: d */
    public final String f50492d;

    /* JADX INFO: renamed from: e */
    public final int f50493e;

    /* JADX INFO: renamed from: f */
    public final zzge$zzv$zzb f50494f;

    /* JADX INFO: renamed from: g */
    public final xdb f50495g;

    /* JADX INFO: renamed from: h */
    public final gr7 f50496h;

    /* JADX INFO: renamed from: i */
    public final a9d f50497i;

    public m31(Context context) {
        xdb xdbVar = new xdb(context, f50488j, null, new mo3(new ho5(7), Looper.getMainLooper()));
        gr7 gr7Var = gr7.f41237b;
        a9d a9dVar = new a9d(context);
        this.f50493e = -1;
        this.f50494f = zzge$zzv$zzb.DEFAULT;
        this.f50489a = context;
        this.f50490b = context.getPackageName();
        int i = 0;
        try {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Log.wtf("ClearcutLogger", "This can't happen.", e);
        }
        this.f50491c = i;
        this.f50493e = -1;
        this.f50492d = "VISION";
        this.f50495g = xdbVar;
        this.f50496h = gr7Var;
        this.f50494f = zzge$zzv$zzb.DEFAULT;
        this.f50497i = a9dVar;
    }
}
