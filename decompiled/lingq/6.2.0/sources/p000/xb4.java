package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class xb4 extends Handler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f68022a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f68023b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xb4(Object obj, Looper looper, int i) {
        super(looper);
        this.f68022a = i;
        this.f68023b = obj;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        p33[] p33VarArr;
        switch (this.f68022a) {
            case 0:
                if (message.what == 100) {
                    C3309ls c3309ls = (C3309ls) this.f68023b;
                    synchronized (c3309ls) {
                        c3309ls.m16492L();
                        synchronized (c3309ls) {
                            try {
                                File file = new File(((Context) c3309ls.f50066d).getFilesDir(), "com.iterable.sdk");
                                if (!file.exists()) {
                                    file.mkdirs();
                                }
                                File file2 = new File(file, "IterableInAppFileStorage");
                                if (!file2.exists()) {
                                    file2.mkdirs();
                                }
                                bq1.m4069x0(new File(file2, "itbl_inapp.json"), c3309ls.m16494N().toString());
                            } catch (Exception e) {
                                eh0.m11136q("IterableInAppFileStorage", "Error while saving in-app messages to file", e);
                            }
                            break;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                w41 w41Var = (w41) this.f68023b;
                while (true) {
                    synchronized (((HashMap) w41Var.f66369e)) {
                        try {
                            size = ((ArrayList) w41Var.f66367c).size();
                            if (size <= 0) {
                                return;
                            }
                            p33VarArr = new p33[size];
                            ((ArrayList) w41Var.f66367c).toArray(p33VarArr);
                            ((ArrayList) w41Var.f66367c).clear();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    for (int i = 0; i < size; i++) {
                        p33 p33Var = p33VarArr[i];
                        int size2 = ((ArrayList) p33Var.f55514c).size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            rh5 rh5Var = (rh5) ((ArrayList) p33Var.f55514c).get(i2);
                            if (!rh5Var.f59310d) {
                                rh5Var.f59308b.onReceive((Context) w41Var.f66365a, (Intent) p33Var.f55513b);
                            }
                        }
                    }
                }
                break;
        }
    }
}
