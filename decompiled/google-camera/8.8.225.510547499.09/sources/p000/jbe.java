package p000;

import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jbe implements Runnable {

    /* JADX INFO: renamed from: c */
    private static final lqq f33655c = new lqq("RevokeAccessOperation");

    /* JADX INFO: renamed from: a */
    public final jge f33656a;

    /* JADX INFO: renamed from: b */
    private final String f33657b;

    public jbe(String str) {
        jib.m13203h(str);
        this.f33657b = str;
        this.f33656a = new jge(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Status status = Status.f7603c;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.f33657b).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f7601a;
            } else {
                f33655c.m15893f("Unable to revoke access!");
            }
            try {
                f33655c.m15892e("Response Code: " + responseCode);
            } catch (IOException e) {
                e = e;
                f33655c.m15893f("IOException when revoking access: ".concat(String.valueOf(e.toString())));
            } catch (Exception e2) {
                e = e2;
                f33655c.m15893f("Exception when revoking access: ".concat(String.valueOf(e.toString())));
            }
        } catch (IOException e3) {
            e = e3;
        } catch (Exception e4) {
            e = e4;
        }
        this.f33656a.m4649i(status);
    }
}
