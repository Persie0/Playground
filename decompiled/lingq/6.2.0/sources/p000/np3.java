package p000;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class np3 extends AsyncTask {

    /* JADX INFO: renamed from: a */
    public final op3 f53091a;

    /* JADX INFO: renamed from: b */
    public Exception f53092b;

    public np3(op3 op3Var) {
        this.f53091a = op3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.ArrayList] */
    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        Set set = lp1.f49971a;
        if (!set.contains(this)) {
            try {
                Void[] voidArr = (Void[]) objArr;
                if (!set.contains(this)) {
                    try {
                        voidArr.getClass();
                        try {
                            op3 op3Var = this.f53091a;
                            op3Var.getClass();
                            String str = mp3.f51688j;
                            this = s46.m21064l(op3Var);
                            return this;
                        } catch (Exception e) {
                            this.f53092b = e;
                        }
                    } catch (Throwable th) {
                        lp1.m16420a(this, th);
                    }
                }
            } catch (Throwable th2) {
                lp1.m16420a(this, th2);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [sy2] */
    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Set set = lp1.f49971a;
        if (set.contains(this)) {
            return;
        }
        try {
            List list = (List) obj;
            if (set.contains(this)) {
                return;
            }
            try {
                list.getClass();
                super.onPostExecute(list);
                Exception exc = this.f53092b;
                if (exc != null) {
                    String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1));
                    this = sy2.f61585a;
                    return;
                }
                return;
            } catch (Throwable th) {
                lp1.m16420a(this, th);
                return;
            }
            lp1.m16420a(this, th);
        } catch (Throwable th2) {
            lp1.m16420a(this, th2);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        op3 op3Var = this.f53091a;
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            super.onPreExecute();
            sy2 sy2Var = sy2.f61585a;
            if (op3Var.f54676a == null) {
                op3Var.f54676a = Thread.currentThread() instanceof HandlerThread ? new Handler() : new Handler(Looper.getMainLooper());
            }
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }

    public final String toString() {
        return "{RequestAsyncTask:  connection: null, requests: " + this.f53091a + "}";
    }
}
