package ag;

import android.util.Log;
import androidx.activity.result.C0204c;
import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.concurrent.ArrayBlockingQueue;
import p166i1.C6153k;
import p349qo.C8656b;
import p534zf.InterfaceC10484b;
import p534zf.InterfaceC10488f;

/* JADX INFO: renamed from: ag.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0075b {

    /* JADX INFO: renamed from: a */
    public final C6153k f199a = new C6153k(5, 4);

    /* JADX INFO: renamed from: b */
    public volatile int f200b = 4;

    /* JADX INFO: renamed from: c */
    public volatile boolean f201c = false;

    /* JADX INFO: renamed from: d */
    public volatile boolean f202d = false;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static String m455a(int i10, boolean z10) {
        switch (i10) {
            case 2:
                return z10 ? "Trace" : "T";
            case 3:
                return z10 ? "Debug" : "D";
            case 4:
                return z10 ? "Info" : "I";
            case 5:
                return z10 ? "Warn" : "W";
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                return z10 ? "Error" : "E";
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                return z10 ? "None" : "N";
            default:
                return z10 ? "Info" : "I";
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m456b(int i10, Object obj, String str, String str2) {
        String string;
        int i11 = this.f200b;
        if (!this.f201c) {
            this.f202d = Log.isLoggable("kochava.forcelogging", 2);
            this.f201c = true;
        }
        if (this.f202d || (i10 != 7 && i11 <= i10)) {
            try {
                if (obj instanceof String) {
                    InterfaceC10488f interfaceC10488fM16886M = C8656b.m16886M(obj);
                    if (interfaceC10488fM16886M != null) {
                        string = interfaceC10488fM16886M.mo19452b();
                    } else {
                        InterfaceC10484b interfaceC10484bM16885L = C8656b.m16885L(obj);
                        string = interfaceC10484bM16885L != null ? interfaceC10484bM16885L.mo19432b() : (String) obj;
                    }
                } else if (obj instanceof InterfaceC10488f) {
                    string = ((InterfaceC10488f) obj).mo19452b();
                } else if (obj instanceof InterfaceC10484b) {
                    string = ((InterfaceC10484b) obj).mo19432b();
                } else if (obj instanceof Throwable) {
                    string = Log.getStackTraceString((Throwable) obj);
                } else {
                    string = obj == null ? "null" : obj.toString();
                }
            } catch (Throwable unused) {
                string = "";
            }
            C0074a c0074a = new C0074a(i10, str, str2, string);
            if (i10 >= 4) {
                C6153k c6153k = this.f199a;
                synchronized (c6153k) {
                    try {
                        if (((ArrayBlockingQueue) c6153k.f35978b).size() == c6153k.f35977a) {
                            ((ArrayBlockingQueue) c6153k.f35978b).poll();
                        }
                        ((ArrayBlockingQueue) c6153k.f35978b).offer(c0074a);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            String strM852k = C0204c.m852k("KVA/", str);
            String[] strArrSplit = (str2 + ": " + string).split("\n");
            int length = strArrSplit.length;
            for (int i12 = 0; i12 < length; i12++) {
                Log.println(c0074a.f194a, strM852k, strArrSplit[i12]);
            }
        }
    }
}
