package p291o7;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.GraphRequest;
import dm.C5207g;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p067d8.C5086z;
import p173i8.C6205a;

/* JADX INFO: renamed from: o7.r */
/* JADX INFO: loaded from: classes.dex */
public final class AsyncTaskC8008r extends AsyncTask<Void, Void, List<? extends C8010t>> {

    /* JADX INFO: renamed from: a */
    public final HttpURLConnection f43577a;

    /* JADX INFO: renamed from: b */
    public final C8009s f43578b;

    /* JADX INFO: renamed from: c */
    public Exception f43579c;

    public AsyncTaskC8008r(C8009s c8009s) {
        C5207g.m11111f(c8009s, "requests");
        this.f43577a = null;
        this.f43578b = c8009s;
    }

    /* JADX INFO: renamed from: a */
    public final void m15882a(List<C8010t> list) {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            C5207g.m11111f(list, "result");
            super.onPostExecute(list);
            Exception exc = this.f43579c;
            if (exc != null) {
                C5086z c5086z = C5086z.f33015a;
                String str = String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1));
                C5207g.m11110e(str, "java.lang.String.format(format, *args)");
                C5086z.m10807F("o7.r", str);
            }
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }

    @Override // android.os.AsyncTask
    public final List<? extends C8010t> doInBackground(Void[] voidArr) {
        ArrayList arrayListM6618d;
        if (C6205a.m12742b(this)) {
            return null;
        }
        try {
            Void[] voidArr2 = voidArr;
            if (C6205a.m12742b(this)) {
                return null;
            }
            try {
                C5207g.m11111f(voidArr2, "params");
                try {
                    HttpURLConnection httpURLConnection = this.f43577a;
                    C8009s c8009s = this.f43578b;
                    if (httpURLConnection == null) {
                        c8009s.getClass();
                        String str = GraphRequest.f11448j;
                        arrayListM6618d = GraphRequest.C2279c.m6617c(c8009s);
                    } else {
                        String str2 = GraphRequest.f11448j;
                        arrayListM6618d = GraphRequest.C2279c.m6618d(c8009s, httpURLConnection);
                    }
                    return arrayListM6618d;
                } catch (Exception e10) {
                    this.f43579c = e10;
                    return null;
                }
            } catch (Throwable th2) {
                C6205a.m12741a(this, th2);
                return null;
            }
        } catch (Throwable th3) {
            C6205a.m12741a(this, th3);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(List<? extends C8010t> list) {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            m15882a(list);
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            super.onPreExecute();
            C8004n c8004n = C8004n.f43550a;
            if (C8004n.f43559j) {
                C5086z c5086z = C5086z.f33015a;
                String str = String.format("execute async task: %s", Arrays.copyOf(new Object[]{this}, 1));
                C5207g.m11110e(str, "java.lang.String.format(format, *args)");
                C5086z.m10807F("o7.r", str);
            }
            if (this.f43578b.f43581a == null) {
                this.f43578b.f43581a = Thread.currentThread() instanceof HandlerThread ? new Handler() : new Handler(Looper.getMainLooper());
            }
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }

    public final String toString() {
        String str = "{RequestAsyncTask:  connection: " + this.f43577a + ", requests: " + this.f43578b + "}";
        C5207g.m11110e(str, "StringBuilder()\n        .append(\"{RequestAsyncTask: \")\n        .append(\" connection: \")\n        .append(connection)\n        .append(\", requests: \")\n        .append(requests)\n        .append(\"}\")\n        .toString()");
        return str;
    }
}
