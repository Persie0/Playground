package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraCharacteristics;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lji {

    /* JADX INFO: renamed from: a */
    public final int f38383a;

    /* JADX INFO: renamed from: b */
    public final Object f38384b;

    /* JADX INFO: renamed from: c */
    public final Object f38385c;

    /* JADX INFO: renamed from: d */
    public final Object f38386d;

    /* JADX INFO: renamed from: e */
    public final Object f38387e;

    /* JADX INFO: renamed from: f */
    public final Object f38388f;

    /* JADX INFO: renamed from: g */
    public final Object f38389g;

    /* JADX INFO: renamed from: h */
    public final Object f38390h;

    public lji(kfn kfnVar, mca mcaVar, jvb jvbVar, kbo kboVar, kbz kbzVar, lpe lpeVar, kme kmeVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f38389g = kfnVar;
        this.f38386d = mcaVar;
        this.f38384b = jvbVar;
        this.f38390h = kbzVar;
        this.f38385c = lpeVar;
        this.f38388f = kboVar.mo6314a("StreamMap");
        this.f38387e = ((kmc) kmeVar.mo13854a(kfnVar.f35837a)).f36526b;
        this.f38383a = 64 - ((Byte) kmeVar.mo13854a(kfnVar.f35837a).mo14560m(CameraCharacteristics.REQUEST_PIPELINE_MAX_DEPTH, (byte) 8)).byteValue();
    }

    public lji(Context context, mrm mrmVar, String str) throws Throwable {
        int i;
        this.f38384b = context;
        this.f38385c = context.getPackageName();
        ActivityManager activityManager = lib.f38291a;
        String packageName = context.getPackageName();
        String strM15376a = lib.m15376a();
        if (strM15376a != null && packageName != null && strM15376a.startsWith(packageName)) {
            int length = packageName.length();
            strM15376a = strM15376a.length() == length ? null : strM15376a.substring(length + 1);
        }
        this.f38386d = strM15376a;
        this.f38390h = mrmVar.mo16813g() ? ((liy) mrmVar.mo16809c()).m15506a() : null;
        this.f38387e = str;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
            i = 3;
        } else {
            i = packageManager.hasSystemFeature("android.software.leanback") ? 4 : 2;
        }
        this.f38383a = true == packageManager.hasSystemFeature("android.hardware.type.automotive") ? 5 : i;
        this.f38388f = new kui(context);
        this.f38389g = lku.m15663q(new dfg(this, 15));
    }
}
