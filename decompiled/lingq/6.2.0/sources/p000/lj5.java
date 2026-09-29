package p000;

import android.util.Log;
import com.amplitude.common.Logger$LogMode;

/* JADX INFO: loaded from: classes.dex */
public final class lj5 implements pj5 {

    /* JADX INFO: renamed from: c */
    public static final lj5 f49738c = new lj5();

    /* JADX INFO: renamed from: a */
    public final Logger$LogMode f49739a = Logger$LogMode.INFO;

    /* JADX INFO: renamed from: b */
    public final String f49740b = "Amplitude";

    @Override // p000.pj5
    /* JADX INFO: renamed from: a */
    public final void mo16255a(String str) {
        if (this.f49739a.compareTo(Logger$LogMode.ERROR) <= 0) {
            Log.e(this.f49740b, str);
        }
    }

    @Override // p000.pj5
    /* JADX INFO: renamed from: b */
    public final void mo16256b(String str) {
        if (this.f49739a.compareTo(Logger$LogMode.DEBUG) <= 0) {
            Log.d(this.f49740b, str);
        }
    }

    @Override // p000.pj5
    /* JADX INFO: renamed from: c */
    public final void mo16257c(String str) {
        if (this.f49739a.compareTo(Logger$LogMode.WARN) <= 0) {
            Log.w(this.f49740b, str);
        }
    }
}
