package p000;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes2.dex */
public final class jeb implements Runnable {

    /* JADX INFO: renamed from: c */
    public static final C3299li f45491c = new C3299li("RevokeAccessOperation", new String[0]);

    /* JADX INFO: renamed from: a */
    public final String f45492a;

    /* JADX INFO: renamed from: b */
    public final pi9 f45493b;

    public jeb(String str) {
        lda.m16127m(str);
        this.f45492a = str;
        this.f45493b = new pi9(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3299li c3299li = f45491c;
        Status status = Status.f11659g;
        try {
            String str = this.f45492a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
            sb.append("https://accounts.google.com/o/oauth2/revoke?token=");
            sb.append(str);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(sb.toString()).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f11657e;
            } else {
                Log.e((String) c3299li.f49691b, ((String) c3299li.f49692c).concat("Unable to revoke access!"));
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(responseCode).length() + 15);
            sb2.append("Response Code: ");
            sb2.append(responseCode);
            String string = sb2.toString();
            if (c3299li.f49690a <= 3) {
                Log.d((String) c3299li.f49691b, ((String) c3299li.f49692c).concat(string));
            }
        } catch (IOException e) {
            Log.e((String) c3299li.f49691b, ((String) c3299li.f49692c).concat("IOException when revoking access: ".concat(String.valueOf(e.toString()))));
        } catch (Exception e2) {
            Log.e((String) c3299li.f49691b, ((String) c3299li.f49692c).concat("Exception when revoking access: ".concat(String.valueOf(e2.toString()))));
        }
        this.f45493b.m5286e(status);
    }
}
