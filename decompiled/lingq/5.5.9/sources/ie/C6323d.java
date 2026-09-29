package ie;

import android.content.Context;
import android.util.Log;
import androidx.activity.result.C0204c;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: ie.d */
/* JADX INFO: loaded from: classes.dex */
public final class C6323d {

    /* JADX INFO: renamed from: a */
    public final Context f36550a;

    /* JADX INFO: renamed from: b */
    public a f36551b = null;

    /* JADX INFO: renamed from: ie.d$a */
    public class a {

        /* JADX INFO: renamed from: a */
        public final String f36552a;

        /* JADX INFO: renamed from: b */
        public final String f36553b;

        /* JADX WARN: Code duplicated, block: B:17:0x0065  */
        /* JADX WARN: Code duplicated, block: B:19:0x0074  */
        /* JADX WARN: Code duplicated, block: B:20:0x007b  */
        /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
        public a(C6323d c6323d) {
            boolean z10;
            int iM9154f = CommonUtils.m9154f(c6323d.f36550a, "com.google.firebase.crashlytics.unity_version", "string");
            Context context = c6323d.f36550a;
            if (iM9154f != 0) {
                this.f36552a = "Unity";
                String string = context.getResources().getString(iM9154f);
                this.f36553b = string;
                String strM852k = C0204c.m852k("Unity Editor version is: ", string);
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", strM852k, null);
                    return;
                }
                return;
            }
            if (context.getAssets() != null) {
                try {
                    InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                    }
                    z10 = true;
                } catch (IOException unused) {
                    z10 = false;
                }
                if (z10) {
                    this.f36552a = null;
                    this.f36553b = null;
                    return;
                }
                this.f36552a = "Flutter";
                this.f36553b = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                }
            }
            z10 = false;
            if (z10) {
                this.f36552a = null;
                this.f36553b = null;
                return;
            }
            this.f36552a = "Flutter";
            this.f36553b = null;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
            }
        }
    }

    public C6323d(Context context) {
        this.f36550a = context;
    }
}
