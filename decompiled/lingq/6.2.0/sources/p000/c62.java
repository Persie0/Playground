package p000;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class c62 {

    /* JADX INFO: renamed from: b */
    public static c62 f9623b;

    /* JADX INFO: renamed from: a */
    public final Object f9624a;

    public c62(int i) {
        switch (i) {
            case 1:
                this.f9624a = new Object();
                new Handler(Looper.getMainLooper(), new cc9(this, 0));
                break;
            default:
                this.f9624a = new Object();
                break;
        }
    }
}
