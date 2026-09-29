package p479xa;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import androidx.datastore.preferences.PreferencesProto$Value;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: xa.s */
/* JADX INFO: loaded from: classes.dex */
public final class C10150s {

    /* JADX INFO: renamed from: e */
    public static C10150s f51429e;

    /* JADX INFO: renamed from: a */
    public final Handler f51430a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList<WeakReference<a>> f51431b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c */
    public final Object f51432c = new Object();

    /* JADX INFO: renamed from: d */
    public int f51433d = 0;

    /* JADX INFO: renamed from: xa.s$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo18382a(int i10);
    }

    /* JADX INFO: renamed from: xa.s$b */
    public final class b extends BroadcastReceiver {
        public b() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:22:0x0041  */
        /* JADX WARN: Code duplicated, block: B:24:0x0049  */
        /* JADX WARN: Code duplicated, block: B:25:0x004a  */
        /* JADX WARN: Code duplicated, block: B:26:0x004c  */
        /* JADX WARN: Code duplicated, block: B:28:0x0054  */
        /* JADX WARN: Code duplicated, block: B:29:0x0056  */
        /* JADX WARN: Code duplicated, block: B:30:0x0058  */
        /* JADX WARN: Code duplicated, block: B:31:0x005b  */
        /* JADX WARN: Code duplicated, block: B:32:0x005e  */
        /* JADX WARN: Code duplicated, block: B:33:0x0062  */
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            int i10;
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                i10 = 0;
            } else {
                try {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    i10 = 1;
                    if (activeNetworkInfo != null) {
                        if (activeNetworkInfo.isConnected()) {
                            int type = activeNetworkInfo.getType();
                            if (type == 0) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        i10 = 3;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case 17:
                                        i10 = 4;
                                        break;
                                    case 13:
                                        i10 = 5;
                                        break;
                                    case 16:
                                    case 19:
                                        i10 = 6;
                                        break;
                                    case 18:
                                        i10 = 2;
                                        break;
                                    case 20:
                                        if (C10134c0.f51354a >= 29) {
                                            i10 = 0;
                                        } else {
                                            i10 = 9;
                                        }
                                        break;
                                    default:
                                        i10 = 6;
                                        break;
                                }
                            } else if (type == 1) {
                                i10 = 2;
                            } else if (type == 4 || type == 5) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        i10 = 3;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case 17:
                                        i10 = 4;
                                        break;
                                    case 13:
                                        i10 = 5;
                                        break;
                                    case 16:
                                    case 19:
                                        i10 = 6;
                                        break;
                                    case 18:
                                        i10 = 2;
                                        break;
                                    case 20:
                                        if (C10134c0.f51354a >= 29) {
                                            i10 = 0;
                                        } else {
                                            i10 = 9;
                                        }
                                        break;
                                    default:
                                        i10 = 6;
                                        break;
                                }
                            } else if (type != 6) {
                                i10 = type != 9 ? 8 : 7;
                            } else {
                                i10 = 5;
                            }
                        }
                    }
                } catch (SecurityException unused) {
                }
            }
            int i11 = C10134c0.f51354a;
            C10150s c10150s = C10150s.this;
            if (i11 < 31 || i10 != 5) {
                C10150s.m19118a(c10150s, i10);
                return;
            }
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                telephonyManager.getClass();
                C10149r c10149r = new C10149r(c10150s);
                telephonyManager.registerTelephonyCallback(context.getMainExecutor(), c10149r);
                telephonyManager.unregisterTelephonyCallback(c10149r);
            } catch (RuntimeException unused2) {
                C10150s.m19118a(c10150s, 5);
            }
        }
    }

    public C10150s(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new b(), intentFilter);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static void m19118a(C10150s c10150s, int i10) {
        synchronized (c10150s.f51432c) {
            try {
                if (c10150s.f51433d == i10) {
                    return;
                }
                c10150s.f51433d = i10;
                for (WeakReference<a> weakReference : c10150s.f51431b) {
                    a aVar = weakReference.get();
                    if (aVar != null) {
                        aVar.mo18382a(i10);
                    } else {
                        c10150s.f51431b.remove(weakReference);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static synchronized C10150s m19119b(Context context) {
        if (f51429e == null) {
            f51429e = new C10150s(context);
        }
        return f51429e;
    }
}
