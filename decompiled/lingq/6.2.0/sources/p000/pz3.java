package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
public final class pz3 implements Closeable {

    /* JADX INFO: renamed from: a */
    public final URL f57027a;

    /* JADX INFO: renamed from: b */
    public volatile Future f57028b;

    /* JADX INFO: renamed from: c */
    public tld f57029c;

    public pz3(URL url) {
        this.f57027a = url;
    }

    /* JADX INFO: renamed from: a */
    public final Bitmap m19576a() throws IOException {
        boolean zIsLoggable = Log.isLoggable("FirebaseMessaging", 4);
        URL url = this.f57027a;
        if (zIsLoggable) {
            Log.i("FirebaseMessaging", "Starting download of: " + url);
        }
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
            v63.m23133k("Content-Length exceeds max size of 1048576");
            return null;
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        try {
            byte[] bArrM10860d = e5d.m10860d(new tk0(inputStream));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                Log.v("FirebaseMessaging", "Downloaded " + bArrM10860d.length + " bytes from " + url);
            }
            if (bArrM10860d.length > 1048576) {
                v63.m23133k("Image exceeds max size of 1048576");
                return null;
            }
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrM10860d, 0, bArrM10860d.length);
            if (bitmapDecodeByteArray == null) {
                uk9.m22774h(url, "Failed to decode image: ");
                return null;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Successfully downloaded image: " + url);
            }
            return bitmapDecodeByteArray;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f57028b.cancel(true);
    }
}
