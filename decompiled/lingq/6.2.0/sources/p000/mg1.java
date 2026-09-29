package p000;

import android.util.Log;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class mg1 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f51268a;

    /* JADX INFO: renamed from: b */
    public final HttpURLConnection f51269b;

    /* JADX INFO: renamed from: c */
    public final xg1 f51270c;

    /* JADX INFO: renamed from: d */
    public final qg1 f51271d;

    /* JADX INFO: renamed from: e */
    public final bh1 f51272e;

    /* JADX INFO: renamed from: f */
    public final ScheduledExecutorService f51273f;

    /* JADX INFO: renamed from: i */
    public final eh1 f51276i;

    /* JADX INFO: renamed from: g */
    public final Random f51274g = new Random();

    /* JADX INFO: renamed from: j */
    public boolean f51277j = false;

    /* JADX INFO: renamed from: h */
    public final gr7 f51275h = gr7.f41237b;

    public mg1(HttpURLConnection httpURLConnection, xg1 xg1Var, qg1 qg1Var, LinkedHashSet linkedHashSet, bh1 bh1Var, ScheduledExecutorService scheduledExecutorService, eh1 eh1Var) {
        this.f51269b = httpURLConnection;
        this.f51270c = xg1Var;
        this.f51271d = qg1Var;
        this.f51268a = linkedHashSet;
        this.f51272e = bh1Var;
        this.f51273f = scheduledExecutorService;
        this.f51276i = eh1Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m16819a(int i, long j) {
        if (i == 0) {
            FirebaseRemoteConfigException.Code code = FirebaseRemoteConfigException.Code.UNKNOWN;
            new FirebaseRemoteConfigServerException("Unable to fetch the latest version of the template.");
            m16822d();
        } else {
            this.f51273f.schedule(new lg1(this, i, j), this.f51274g.nextInt(4), TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m16820b(InputStream inputStream) throws IOException {
        boolean zIsEmpty;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        String strConcat = "";
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            strConcat = strConcat.concat(line);
            if (line.contains("}")) {
                int iIndexOf = strConcat.indexOf(123);
                int iLastIndexOf = strConcat.lastIndexOf(125);
                strConcat = (iIndexOf < 0 || iLastIndexOf < 0 || iIndexOf >= iLastIndexOf) ? "" : strConcat.substring(iIndexOf, iLastIndexOf + 1);
                if (strConcat.isEmpty()) {
                    continue;
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(strConcat);
                        if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                            bh1 bh1Var = this.f51272e;
                            FirebaseRemoteConfigException.Code code = FirebaseRemoteConfigException.Code.UNKNOWN;
                            new FirebaseRemoteConfigServerException("The server is temporarily unavailable. Try again in a few minutes.");
                            bh1Var.m3710a();
                            break;
                        }
                        synchronized (this) {
                            zIsEmpty = this.f51268a.isEmpty();
                        }
                        if (zIsEmpty) {
                            break;
                        }
                        if (jSONObject.has("latestTemplateVersionNumber")) {
                            long j = ((eh1) this.f51270c.f68172g).f37250a.getLong("last_template_version", 0L);
                            long j2 = jSONObject.getLong("latestTemplateVersionNumber");
                            if (j2 > j) {
                                m16819a(3, j2);
                            }
                        }
                        if (jSONObject.has("retryIntervalSeconds")) {
                            m16824f(jSONObject.getInt("retryIntervalSeconds"));
                        }
                        strConcat = "";
                    } catch (JSONException e) {
                        Throwable cause = e.getCause();
                        FirebaseRemoteConfigException.Code code2 = FirebaseRemoteConfigException.Code.UNKNOWN;
                        new FirebaseRemoteConfigClientException("Unable to parse config update message.", cause);
                        m16822d();
                        Log.e("FirebaseRemoteConfig", "Unable to parse latest config update message.", e);
                    }
                }
            }
        }
        bufferedReader.close();
    }

    /* JADX INFO: renamed from: c */
    public final void m16821c() {
        HttpURLConnection httpURLConnection = this.f51269b;
        if (httpURLConnection == null) {
            return;
        }
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = httpURLConnection.getInputStream();
                    m16820b(inputStream);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException e) {
                    Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e);
                }
            } catch (IOException e2) {
                if (!this.f51277j) {
                    Log.d("FirebaseRemoteConfig", "Real-time connection was closed due to an exception.", e2);
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e3);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m16822d() {
        Iterator it = this.f51268a.iterator();
        while (it.hasNext()) {
            ((bh1) it.next()).m3710a();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m16823e(boolean z) {
        this.f51277j = z;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m16824f(int i) {
        this.f51275h.getClass();
        Date date = new Date(new Date(System.currentTimeMillis()).getTime() + (((long) i) * 1000));
        eh1 eh1Var = this.f51276i;
        synchronized (eh1Var.f37253d) {
            eh1Var.f37250a.edit().putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}
