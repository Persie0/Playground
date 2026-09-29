package p000;

import android.os.AsyncTask;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class j33 extends AsyncTask {

    /* JADX INFO: renamed from: a */
    public final String f45002a;

    /* JADX INFO: renamed from: b */
    public final File f45003b;

    /* JADX INFO: renamed from: c */
    public final i33 f45004c;

    public j33(String str, File file, i33 i33Var) {
        str.getClass();
        this.f45002a = str;
        this.f45003b = file;
        this.f45004c = i33Var;
    }

    /* JADX INFO: renamed from: a */
    public final Boolean m14281a(String... strArr) {
        if (lp1.f49971a.contains(this)) {
            return null;
        }
        try {
            strArr.getClass();
            try {
                URL url = new URL(this.f45002a);
                int contentLength = ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection())).getContentLength();
                DataInputStream dataInputStream = new DataInputStream(FirebasePerfUrlConnection.openStream(url));
                byte[] bArr = new byte[contentLength];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.f45003b));
                dataOutputStream.write(bArr);
                dataOutputStream.flush();
                dataOutputStream.close();
                return Boolean.TRUE;
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        } catch (Throwable th) {
            lp1.m16420a(this, th);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        if (lp1.f49971a.contains(this)) {
            return null;
        }
        try {
            return m14281a((String[]) objArr);
        } catch (Throwable th) {
            lp1.m16420a(this, th);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Set set = lp1.f49971a;
        if (set.contains(this)) {
            return;
        }
        try {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            if (!set.contains(this) && zBooleanValue) {
                try {
                    this.f45004c.mo13636b(this.f45003b);
                } catch (Throwable th) {
                    lp1.m16420a(this, th);
                }
            }
        } catch (Throwable th2) {
            lp1.m16420a(this, th2);
        }
    }
}
