package com.google.android.gms.ads.identifier;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.ads.identifier.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2538a extends Thread {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Map f13794a;

    public C2538a(HashMap map) {
        this.f13794a = map;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Uri.Builder builderBuildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        Map map = this.f13794a;
        for (String str : map.keySet()) {
            builderBuildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        String string = builderBuildUpon.build().toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode >= 300) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 65);
                    sb2.append("Received non-success response code ");
                    sb2.append(responseCode);
                    sb2.append(" from pinging URL: ");
                    sb2.append(string);
                    Log.w("HttpUrlPinger", sb2.toString());
                }
                httpURLConnection.disconnect();
            } catch (Throwable th2) {
                httpURLConnection.disconnect();
                throw th2;
            }
        } catch (IOException e10) {
            e = e10;
            String message = e.getMessage();
            StringBuilder sb3 = new StringBuilder(String.valueOf(message).length() + String.valueOf(string).length() + 27);
            sb3.append("Error while pinging URL: ");
            sb3.append(string);
            sb3.append(". ");
            sb3.append(message);
            Log.w("HttpUrlPinger", sb3.toString(), e);
        } catch (IndexOutOfBoundsException e11) {
            String message2 = e11.getMessage();
            StringBuilder sb4 = new StringBuilder(String.valueOf(message2).length() + String.valueOf(string).length() + 32);
            sb4.append("Error while parsing ping URL: ");
            sb4.append(string);
            sb4.append(". ");
            sb4.append(message2);
            Log.w("HttpUrlPinger", sb4.toString(), e11);
        } catch (RuntimeException e12) {
            e = e12;
            String message3 = e.getMessage();
            StringBuilder sb5 = new StringBuilder(String.valueOf(message3).length() + String.valueOf(string).length() + 27);
            sb5.append("Error while pinging URL: ");
            sb5.append(string);
            sb5.append(". ");
            sb5.append(message3);
            Log.w("HttpUrlPinger", sb5.toString(), e);
        }
    }
}
