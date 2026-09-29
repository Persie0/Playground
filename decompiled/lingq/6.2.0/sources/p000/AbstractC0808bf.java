package p000;

import android.content.Context;
import android.provider.Settings;
import android.util.Pair;
import com.kochava.tracker.BuildConfig;

/* JADX INFO: renamed from: bf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0808bf {

    /* JADX INFO: renamed from: a */
    public static final sq5 f8448a;

    static {
        sj5 sj5VarM20396w = r46.m20396w();
        f8448a = ux5.m22983f(sj5VarM20396w, sj5VarM20396w, BuildConfig.SDK_MODULE_NAME, "AmazonUtil");
    }

    /* JADX INFO: renamed from: a */
    public static Pair m3677a(Context context) throws Exception {
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), "advertising_id");
            if (string == null) {
                throw new Exception();
            }
            int i = Settings.Secure.getInt(context.getContentResolver(), "limit_ad_tracking", -1);
            if (i >= 0) {
                return Pair.create(string, Boolean.valueOf(i != 0));
            }
            throw new Exception();
        } catch (Throwable unused) {
            throw new Exception("Cannot retrieve Amazon Kindle Fire Advertising ID. Not running on Kindle Fire Device.");
        }
    }
}
