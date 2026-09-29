package p000;

import android.os.Trace;
import android.util.Log;
import androidx.concurrent.futures.C0464b;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wq6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67178a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f67179b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f67180c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f67181d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f67182e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f67183f;

    public /* synthetic */ wq6(iy5 iy5Var, String str, ui3 ui3Var, w56 w56Var, C0464b c0464b) {
        this.f67180c = iy5Var;
        this.f67179b = str;
        this.f67181d = ui3Var;
        this.f67182e = w56Var;
        this.f67183f = c0464b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f67178a;
        Object obj = this.f67183f;
        Object obj2 = this.f67182e;
        Object obj3 = this.f67181d;
        String str = this.f67179b;
        Object obj4 = this.f67180c;
        switch (i) {
            case 0:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj3;
                ReentrantLock reentrantLock = (ReentrantLock) obj2;
                Condition condition = (Condition) obj;
                str.getClass();
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(((URL) obj4).openConnection());
                uRLConnection.getClass();
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
                try {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        inputStream.getClass();
                        String strM4066s0 = bq1.m4066s0(new BufferedReader(new InputStreamReader(inputStream, yu0.f70463a), 8192));
                        httpURLConnection.getInputStream().close();
                        ref$ObjectRef.f47718a = new JSONObject(strM4066s0).optString(str);
                        httpURLConnection.disconnect();
                        reentrantLock.lock();
                        try {
                            condition.signal();
                        } finally {
                            reentrantLock.unlock();
                        }
                        break;
                    } catch (Throwable th) {
                        httpURLConnection.disconnect();
                        reentrantLock.lock();
                        try {
                            condition.signal();
                            throw th;
                        } finally {
                            reentrantLock.unlock();
                        }
                    }
                } catch (Exception e) {
                    String name = xq6.class.getName();
                    String message = e.getMessage();
                    if (message == null) {
                        message = "Error getting public key";
                    }
                    Log.d(name, message);
                    httpURLConnection.disconnect();
                    reentrantLock.lock();
                    try {
                        condition.signal();
                    } finally {
                        reentrantLock.unlock();
                    }
                    break;
                }
                return;
            default:
                ui3 ui3Var = (ui3) obj3;
                w56 w56Var = (w56) obj2;
                C0464b c0464b = (C0464b) obj;
                ((iy5) obj4).getClass();
                boolean zIsEnabled = Trace.isEnabled();
                if (zIsEnabled) {
                    try {
                        pvc.m19517m(str);
                    } catch (Throwable th2) {
                        if (zIsEnabled) {
                            Trace.endSection();
                        }
                        throw th2;
                    }
                }
                try {
                    ui3Var.mo0a();
                    az6 az6Var = web.f66740c;
                    w56Var.m23764g(az6Var);
                    c0464b.m1908a(az6Var);
                    break;
                } catch (Throwable th3) {
                    w56Var.m23764g(new zy6(th3));
                    c0464b.m1909b(th3);
                    break;
                }
                if (zIsEnabled) {
                    Trace.endSection();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ wq6(URL url, Ref$ObjectRef ref$ObjectRef, String str, ReentrantLock reentrantLock, Condition condition) {
        this.f67180c = url;
        this.f67181d = ref$ObjectRef;
        this.f67179b = str;
        this.f67182e = reentrantLock;
        this.f67183f = condition;
    }
}
