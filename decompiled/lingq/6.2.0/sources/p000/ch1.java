package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ch1 {

    /* JADX INFO: renamed from: s */
    public static final int[] f10062s = {2, 4, 8, 16, 32, 64, 128, 256};

    /* JADX INFO: renamed from: t */
    public static final Pattern f10063t = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f10064a;

    /* JADX INFO: renamed from: c */
    public int f10066c;

    /* JADX INFO: renamed from: f */
    public HttpURLConnection f10069f;

    /* JADX INFO: renamed from: g */
    public mg1 f10070g;

    /* JADX INFO: renamed from: h */
    public final ScheduledExecutorService f10071h;

    /* JADX INFO: renamed from: i */
    public final xg1 f10072i;

    /* JADX INFO: renamed from: j */
    public final q43 f10073j;

    /* JADX INFO: renamed from: k */
    public final x43 f10074k;

    /* JADX INFO: renamed from: l */
    public final qg1 f10075l;

    /* JADX INFO: renamed from: m */
    public final Context f10076m;

    /* JADX INFO: renamed from: n */
    public final String f10077n;

    /* JADX INFO: renamed from: q */
    public final eh1 f10080q;

    /* JADX INFO: renamed from: b */
    public boolean f10065b = false;

    /* JADX INFO: renamed from: o */
    public final Random f10078o = new Random();

    /* JADX INFO: renamed from: p */
    public final gr7 f10079p = gr7.f41237b;

    /* JADX INFO: renamed from: d */
    public boolean f10067d = false;

    /* JADX INFO: renamed from: e */
    public boolean f10068e = false;

    /* JADX INFO: renamed from: r */
    public final Object f10081r = new Object();

    public ch1(q43 q43Var, x43 x43Var, xg1 xg1Var, qg1 qg1Var, Context context, String str, LinkedHashSet linkedHashSet, eh1 eh1Var, ScheduledExecutorService scheduledExecutorService) {
        this.f10064a = linkedHashSet;
        this.f10071h = scheduledExecutorService;
        this.f10066c = Math.max(8 - eh1Var.m11148c().f44720b, 1);
        this.f10073j = q43Var;
        this.f10072i = xg1Var;
        this.f10074k = x43Var;
        this.f10075l = qg1Var;
        this.f10076m = context;
        this.f10077n = str;
        this.f10080q = eh1Var;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m4648d(int i) {
        return i == 408 || i == 429 || i == 502 || i == 503 || i == 504;
    }

    /* JADX INFO: renamed from: f */
    public static String m4649f(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
            }
        } catch (IOException unused) {
            if (sb.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m4650a() {
        return (this.f10064a.isEmpty() || this.f10065b || this.f10067d || this.f10068e) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public final void m4651b(InputStream inputStream, InputStream inputStream2) {
        HttpURLConnection httpURLConnection = this.f10069f;
        if (httpURLConnection != null && !this.f10068e) {
            httpURLConnection.disconnect();
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e);
            }
        }
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            } catch (IOException e2) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e2);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m4652c(String str) {
        q43 q43Var = this.f10073j;
        q43Var.m19644a();
        Matcher matcher = f10063t.matcher(q43Var.f57254c.f261b);
        return ux5.m22991n("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/", matcher.matches() ? matcher.group(1) : null, "/namespaces/", str, ":streamFetchInvalidations");
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m4653e(long j) {
        try {
            if (m4650a()) {
                int i = this.f10066c;
                if (i > 0) {
                    this.f10066c = i - 1;
                    this.f10071h.schedule(new RunnableC3468pp(this, 3), j, TimeUnit.MILLISECONDS);
                } else if (!this.f10068e) {
                    FirebaseRemoteConfigException.Code code = FirebaseRemoteConfigException.Code.UNKNOWN;
                    new FirebaseRemoteConfigClientException();
                    m4654g();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m4654g() {
        Iterator it = this.f10064a.iterator();
        while (it.hasNext()) {
            ((bh1) it.next()).m3710a();
        }
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m4655h() {
        this.f10079p.getClass();
        m4653e(Math.max(0L, ((Date) this.f10080q.m11148c().f44721c).getTime() - new Date(System.currentTimeMillis()).getTime()));
    }

    /* JADX INFO: renamed from: i */
    public final void m4656i(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        String strM19518n;
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
        q43 q43Var = this.f10073j;
        q43Var.m19644a();
        a53 a53Var = q43Var.f57254c;
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", a53Var.f260a);
        Context context = this.f10076m;
        httpURLConnection.setRequestProperty("X-Android-Package", context.getPackageName());
        try {
            byte[] bArrM11657s = fa4.m11657s(context, context.getPackageName());
            if (bArrM11657s == null) {
                Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + context.getPackageName());
                strM19518n = null;
            } else {
                strM19518n = pvc.m19518n(bArrM11657s);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i("FirebaseRemoteConfig", "No such package: " + context.getPackageName());
        }
        httpURLConnection.setRequestProperty("X-Android-Cert", strM19518n);
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        HashMap map = new HashMap();
        q43Var.m19644a();
        Matcher matcher = f10063t.matcher(a53Var.f261b);
        map.put("project", matcher.matches() ? matcher.group(1) : null);
        map.put("namespace", this.f10077n);
        map.put("lastKnownVersionNumber", Long.toString(((eh1) this.f10072i.f68172g).f37250a.getLong("last_template_version", 0L)));
        q43Var.m19644a();
        map.put("appId", a53Var.f261b);
        map.put("sdkVersion", "23.1.0");
        map.put("appInstanceId", str);
        byte[] bytes = new JSONObject(map).toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    /* JADX INFO: renamed from: j */
    public final synchronized mg1 m4657j(HttpURLConnection httpURLConnection) {
        return new mg1(httpURLConnection, this.f10072i, this.f10075l, this.f10064a, new bh1(this), this.f10071h, this.f10080q);
    }

    /* JADX INFO: renamed from: k */
    public final void m4658k(Date date) {
        eh1 eh1Var = this.f10080q;
        int i = eh1Var.m11148c().f44720b + 1;
        long millis = TimeUnit.MINUTES.toMillis(f10062s[(i < 8 ? i : 8) - 1]);
        eh1Var.m11150e(i, new Date(date.getTime() + (millis / 2) + ((long) this.f10078o.nextInt((int) millis))));
    }
}
