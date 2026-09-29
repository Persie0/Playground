package p000;

import android.util.Log;
import com.google.firebase.crashlytics.internal.common.C1148a;
import com.google.firebase.crashlytics.internal.concurrency.C1149a;
import com.google.firebase.crashlytics.internal.settings.C1150a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ng1 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52699a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f52700b;

    public /* synthetic */ ng1(Object obj, int i) {
        this.f52699a = i;
        this.f52700b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        FileInputStream fileInputStreamOpenFileInput;
        boolean z = false;
        FileInputStream fileInputStream = null;
        sg1 sg1VarM21345a = null;
        switch (this.f52699a) {
            case 0:
                fh1 fh1Var = (fh1) this.f52700b;
                synchronized (fh1Var) {
                    try {
                        try {
                            fileInputStreamOpenFileInput = fh1Var.f39101a.openFileInput(fh1Var.f39102b);
                            try {
                                int iAvailable = fileInputStreamOpenFileInput.available();
                                byte[] bArr = new byte[iAvailable];
                                fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                                sg1VarM21345a = sg1.m21345a(new JSONObject(new String(bArr, "UTF-8")));
                                fileInputStreamOpenFileInput.close();
                            } catch (FileNotFoundException | JSONException unused) {
                                if (fileInputStreamOpenFileInput != null) {
                                    fileInputStreamOpenFileInput.close();
                                }
                            } catch (Throwable th) {
                                th = th;
                                fileInputStream = fileInputStreamOpenFileInput;
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    } catch (FileNotFoundException | JSONException unused2) {
                        fileInputStreamOpenFileInput = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                return sg1VarM21345a;
            case 1:
                C1148a c1148a = ((tp1) this.f52700b).f62660g;
                c1148a.getClass();
                C1149a.m6679a();
                b64 b64Var = c1148a.f13652c;
                t33 t33Var = (t33) b64Var.f8007b;
                String str = (String) b64Var.f8006a;
                t33Var.getClass();
                if (!new File((File) t33Var.f61788c, str).exists()) {
                    if (c1148a.m6675e() != null && c1148a.f13659j.m22850c()) {
                    }
                    return Boolean.valueOf(z);
                }
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                }
                t33 t33Var2 = (t33) b64Var.f8007b;
                t33Var2.getClass();
                new File((File) t33Var2.f61788c, str).delete();
                z = true;
                return Boolean.valueOf(z);
            case 2:
                return ((h58) this.f52700b).m13058b("firebase");
            default:
                C1150a c1150a = (C1150a) ((fs6) this.f52700b).f39591c;
                C0842cc c0842cc = c1150a.f13676f;
                s29 s29Var = c1150a.f13672b;
                String str2 = c0842cc.f9872b;
                C1149a.m6680b();
                try {
                    HashMap mapM4497b = C0842cc.m4497b(s29Var);
                    C3309ls c3309ls = new C3309ls(str2, mapM4497b);
                    c3309ls.m16485C("User-Agent", "Crashlytics Android SDK/20.0.6");
                    c3309ls.m16485C("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                    C0842cc.m4496a(c3309ls, s29Var);
                    String strConcat = "Requesting settings from ".concat(str2);
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", strConcat, null);
                    }
                    String str3 = "Settings query params were: " + mapM4497b;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str3, null);
                    }
                    return c0842cc.m4498c(c3309ls.m16512m());
                } catch (IOException e) {
                    Log.e("FirebaseCrashlytics", "Settings request failed.", e);
                    return null;
                }
        }
    }
}
