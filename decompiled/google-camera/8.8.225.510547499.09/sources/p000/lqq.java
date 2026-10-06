package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.Log;
import android.widget.ListView;
import com.google.p020vr.vrcore.controller.api.ControllerServiceBridge;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lqq {

    /* JADX INFO: renamed from: d */
    private static boolean f39000d;

    /* JADX INFO: renamed from: a */
    public final int f39001a;

    /* JADX INFO: renamed from: b */
    public final Object f39002b;

    /* JADX INFO: renamed from: c */
    public final Object f39003c;

    public lqq(int i, lec lecVar, ldf ldfVar) {
        boolean z = true;
        if (ldfVar != null && ldfVar.f37976a.f37915b != lecVar.f38019a.f37915b) {
            z = false;
        }
        lku.m15669w(z);
        this.f39001a = i;
        this.f39003c = lecVar;
        this.f39002b = ldfVar;
    }

    public lqq(int i, oej oejVar, InputStream inputStream) {
        this.f39001a = i;
        this.f39003c = oejVar;
        this.f39002b = inputStream;
    }

    public lqq(Context context, dsx dsxVar, byte[] bArr, byte[] bArr2) {
        this.f39002b = context;
        this.f39003c = dsxVar;
        this.f39001a = 2;
    }

    public lqq(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f39003c = colorStateList;
        this.f39002b = configuration;
        this.f39001a = theme == null ? 0 : theme.hashCode();
    }

    public lqq(Bitmap bitmap, int i, kbc kbcVar) {
        this.f39002b = bitmap;
        this.f39001a = i;
        this.f39003c = kbcVar;
    }

    public lqq(ControllerServiceBridge.Callbacks callbacks, ogl oglVar, int i) {
        this.f39002b = callbacks;
        this.f39003c = oglVar;
        this.f39001a = i;
    }

    public lqq(Class cls, String str, int i) {
        this.f39002b = cls;
        this.f39003c = str;
        this.f39001a = i;
    }

    public lqq(String str) {
        this.f39002b = "";
        this.f39003c = str;
        int i = 2;
        jib.m13198c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        while (i <= 7 && !Log.isLoggable((String) this.f39003c, i)) {
            i++;
        }
        this.f39001a = i;
    }

    public lqq(jet jetVar, int i, jdz jdzVar) {
        this.f39003c = jetVar;
        this.f39001a = i;
        this.f39002b = jdzVar;
    }

    public lqq(C0800lm c0800lm, C0225gw c0225gw, int i) {
        this.f39002b = c0800lm;
        this.f39003c = c0225gw;
        this.f39001a = i;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, msi] */
    /* JADX INFO: renamed from: a */
    public final void m15888a() {
        synchronized (lqq.class) {
            if (!f39000d) {
                lmg lmgVar = new lmg(this, 10);
                long j = this.f39001a;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                npv npvVar = (npv) this.f39002b.mo6051a();
                lqi.m15856a(npvVar.schedule(new frn(lmgVar, npvVar, j, timeUnit, 4), j, timeUnit));
                f39000d = true;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m15889b() {
        String strM18415a = ((oej) this.f39003c).m18415a("X-GUploader-UploadID");
        return "HttpResponse:\n   " + this.f39001a + "  " + String.valueOf(this.f39003c) + (strM18415a == null ? "\n No upload id." : "\n Upload id: ".concat(strM18415a));
    }

    /* JADX INFO: renamed from: c */
    public final lct m15890c(ldx ldxVar) {
        lku.m15669w(((lec) this.f39003c).f38019a.f37915b == ldxVar.f37915b);
        return new lct(this.f39001a, (lec) this.f39003c, (ldf) this.f39002b, ldxVar, null);
    }

    /* JADX INFO: renamed from: d */
    protected final String m15891d(String str) {
        return ((String) this.f39002b).concat(str);
    }

    /* JADX INFO: renamed from: e */
    public final void m15892e(String str) {
        if (this.f39001a <= 3) {
            m15891d(str);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m15893f(String str) {
        Log.e((String) this.f39003c, m15891d(str));
    }

    /* JADX INFO: renamed from: g */
    public final ListView m15894g() {
        return ((C0794lg) this.f39002b).f38176e;
    }

    public lqq(msi msiVar) {
        ffw ffwVar = ffw.f21766l;
        this.f39002b = msiVar;
        this.f39001a = Math.max(5, 10);
        this.f39003c = ffwVar;
    }

    public lqq(int i) {
        this.f39001a = i;
        this.f39002b = kcl.CAMERA_ERROR_CODE_UNKNOWN;
        this.f39003c = kcl.CAMERA_ERROR_CODE_UNKNOWN.m13983c();
    }

    public lqq(int i, kcl kclVar, String str) {
        this.f39001a = i;
        this.f39002b = kclVar;
        this.f39003c = str == null ? kcl.CAMERA_ERROR_CODE_UNKNOWN.m13983c() : str;
    }
}
