package p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzt;

/* JADX INFO: loaded from: classes2.dex */
public final class cc9 implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9892a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f9893b;

    public /* synthetic */ cc9(Object obj, int i) {
        this.f9892a = i;
        this.f9893b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f9892a) {
            case 0:
                if (message.what == 0) {
                    c62 c62Var = (c62) this.f9893b;
                    if (message.obj == null) {
                        synchronized (c62Var.f9624a) {
                            try {
                                throw null;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    ho2.m13383c();
                }
                return false;
            default:
                int i = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    Log.d("MessengerIpcClient", "Received response to request: " + i);
                }
                b9d b9dVar = (b9d) this.f9893b;
                synchronized (b9dVar) {
                    try {
                        ged gedVar = (ged) b9dVar.f8198e.get(i);
                        if (gedVar == null) {
                            Log.w("MessengerIpcClient", "Received response for unknown request: " + i);
                            return true;
                        }
                        b9dVar.f8198e.remove(i);
                        b9dVar.m3495c();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            gedVar.m12565b(new zzt("Not supported by GmsCore", null));
                            return true;
                        }
                        switch (gedVar.f40692e) {
                            case 0:
                                if (data.getBoolean("ack", false)) {
                                    gedVar.m12566c(null);
                                    return true;
                                }
                                gedVar.m12565b(new zzt("Invalid response to one way request", null));
                                return true;
                            default:
                                Bundle bundle = data.getBundle("data");
                                if (bundle == null) {
                                    bundle = Bundle.EMPTY;
                                }
                                gedVar.m12566c(bundle);
                                return true;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
        }
    }
}
