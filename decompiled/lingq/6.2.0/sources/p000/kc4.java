package p000;

import android.app.Notification;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.core.graphics.drawable.IconCompat;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes2.dex */
public final class kc4 extends vm6 {

    /* JADX INFO: renamed from: v */
    public boolean f47023v;

    /* JADX INFO: renamed from: w */
    public String f47024w;

    /* JADX INFO: renamed from: x */
    public String f47025x;

    /* JADX INFO: renamed from: y */
    public int f47026y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [xm6] */
    /* JADX WARN: Type inference failed for: r3v12, types: [um6, xm6] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r6v0, types: [kc4, vm6] */
    @Override // p000.vm6
    /* JADX INFO: renamed from: c */
    public final Notification mo15108c() {
        ?? um6Var = 0;
        um6Var = 0;
        um6Var = 0;
        um6Var = 0;
        um6Var = 0;
        um6Var = 0;
        if (this.f47024w != null) {
            try {
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(this.f47024w).openConnection());
                uRLConnection.setDoInput(true);
                uRLConnection.connect();
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(uRLConnection.getInputStream());
                if (bitmapDecodeStream != null) {
                    tm6 tm6Var = new tm6();
                    try {
                        IconCompat iconCompat = new IconCompat(1);
                        iconCompat.f5505b = bitmapDecodeStream;
                        tm6Var.f62527d = iconCompat;
                        tm6Var.f68350b = vm6.m23410d(this.f47025x);
                        tm6Var.f68351c = true;
                        try {
                            IconCompat iconCompat2 = new IconCompat(1);
                            iconCompat2.f5505b = bitmapDecodeStream;
                            this.f65588h = iconCompat2;
                            um6Var = tm6Var;
                        } catch (MalformedURLException e) {
                            e = e;
                            um6Var = tm6Var;
                            eh0.m11135p("IterableNotification", e.toString());
                        } catch (IOException e2) {
                            e = e2;
                            um6Var = tm6Var;
                            eh0.m11135p("IterableNotification", e.toString());
                        }
                    } catch (MalformedURLException e3) {
                        e = e3;
                    } catch (IOException e4) {
                        e = e4;
                    }
                } else {
                    eh0.m11135p("IterableNotification", "Notification image could not be loaded from url: " + this.f47024w);
                }
            } catch (MalformedURLException e5) {
                e = e5;
            } catch (IOException e6) {
                e = e6;
            }
        }
        if (um6Var == 0) {
            um6Var = new um6();
            um6Var.f64076d = vm6.m23410d(this.f47025x);
        }
        m23423o(um6Var);
        return super.mo15108c();
    }
}
