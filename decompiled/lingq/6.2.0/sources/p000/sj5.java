package p000;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class sj5 {

    /* JADX INFO: renamed from: a */
    public volatile int f60929a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f60930b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f60931c;

    /* JADX INFO: renamed from: a */
    public final void m21420a(int i, Object obj, String str, String str2) {
        String string;
        int i2 = this.f60929a;
        if (!this.f60930b) {
            this.f60931c = Log.isLoggable("kochava.forcelogging", 2);
            this.f60930b = true;
        }
        if (this.f60931c || (i != 7 && i2 <= i)) {
            try {
                if (obj instanceof String) {
                    eg4 eg4VarM3214I = b34.m3214I(obj);
                    if (eg4VarM3214I != null) {
                        string = ((dg4) eg4VarM3214I).m10349s();
                    } else {
                        ff4 ff4VarM3212G = b34.m3212G(obj);
                        string = ff4VarM3212G != null ? ((ef4) ff4VarM3212G).m11094g() : (String) obj;
                    }
                } else if (obj instanceof eg4) {
                    string = ((dg4) ((eg4) obj)).m10349s();
                } else if (obj instanceof ff4) {
                    string = ((ef4) ((ff4) obj)).m11094g();
                } else if (obj instanceof Throwable) {
                    string = Log.getStackTraceString((Throwable) obj);
                } else {
                    string = obj == null ? "null" : obj.toString();
                }
            } catch (Throwable unused) {
                string = "";
            }
            String strM17734i = AbstractC3393o1.m17734i("KVA/", str);
            String[] strArrSplit = (str2 + ": " + string).split("\n");
            for (String str3 : strArrSplit) {
                Log.println(i, strM17734i, str3);
            }
        }
    }
}
