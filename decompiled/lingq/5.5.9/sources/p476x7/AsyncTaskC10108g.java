package p476x7;

import android.os.AsyncTask;
import dm.C5207g;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import p173i8.C6205a;

/* JADX INFO: renamed from: x7.g */
/* JADX INFO: loaded from: classes.dex */
public final class AsyncTaskC10108g extends AsyncTask<String, Void, Boolean> {

    /* JADX INFO: renamed from: a */
    public final String f51268a;

    /* JADX INFO: renamed from: b */
    public final File f51269b;

    /* JADX INFO: renamed from: c */
    public final a f51270c;

    /* JADX INFO: renamed from: x7.g$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo17198a(File file);
    }

    public AsyncTaskC10108g(String str, File file, a aVar) {
        C5207g.m11111f(str, "uriStr");
        this.f51268a = str;
        this.f51269b = file;
        this.f51270c = aVar;
    }

    /* JADX INFO: renamed from: a */
    public final Boolean m18966a(String... strArr) {
        if (C6205a.m12742b(this)) {
            return null;
        }
        try {
            C5207g.m11111f(strArr, "args");
            try {
                URL url = new URL(this.f51268a);
                int contentLength = url.openConnection().getContentLength();
                DataInputStream dataInputStream = new DataInputStream(url.openStream());
                byte[] bArr = new byte[contentLength];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.f51269b));
                dataOutputStream.write(bArr);
                dataOutputStream.flush();
                dataOutputStream.close();
                return Boolean.TRUE;
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Boolean doInBackground(String[] strArr) {
        if (C6205a.m12742b(this)) {
            return null;
        }
        try {
            return m18966a(strArr);
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Boolean bool) {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            boolean zBooleanValue = bool.booleanValue();
            if (C6205a.m12742b(this)) {
                return;
            }
            if (zBooleanValue) {
                try {
                    this.f51270c.mo17198a(this.f51269b);
                } catch (Throwable th2) {
                    C6205a.m12741a(this, th2);
                }
            }
        } catch (Throwable th3) {
            C6205a.m12741a(this, th3);
        }
    }
}
