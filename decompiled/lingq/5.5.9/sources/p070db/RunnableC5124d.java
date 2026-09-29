package p070db;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import p152hb.C5986l;
import p176ib.C6272i;
import p220kb.C6653a;

/* JADX INFO: renamed from: db.d */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC5124d implements Runnable {

    /* JADX INFO: renamed from: c */
    public static final C6653a f33108c = new C6653a("RevokeAccessOperation", new String[0]);

    /* JADX INFO: renamed from: a */
    public final String f33109a;

    /* JADX INFO: renamed from: b */
    public final C5986l f33110b;

    public RunnableC5124d(String str) {
        C6272i.m12912f(str);
        this.f33109a = str;
        this.f33110b = new C5986l(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6653a c6653a = f33108c;
        Status status = Status.f13875h;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.f33109a).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f13873f;
            } else {
                c6653a.getClass();
                Log.e(c6653a.f37720a, c6653a.f37721b.concat("Unable to revoke access!"));
            }
            c6653a.m13287a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e10) {
            String strConcat = "IOException when revoking access: ".concat(String.valueOf(e10.toString()));
            c6653a.getClass();
            Log.e(c6653a.f37720a, c6653a.f37721b.concat(strConcat));
        } catch (Exception e11) {
            String strConcat2 = "Exception when revoking access: ".concat(String.valueOf(e11.toString()));
            c6653a.getClass();
            Log.e(c6653a.f37720a, c6653a.f37721b.concat(strConcat2));
        }
        this.f33110b.m7567f(status);
    }
}
