package p290o6;

import androidx.fragment.app.C0987y;
import com.clevertap.android.sdk.AnalyticsManager;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.validation.Validator;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p088e7.C5382b;
import p088e7.C5383c;

/* JADX INFO: renamed from: o6.i */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC7960i implements Callable<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f43339a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AnalyticsManager f43340b;

    public CallableC7960i(AnalyticsManager analyticsManager, String str) {
        this.f43340b = analyticsManager;
        this.f43339a = str;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        AnalyticsManager analyticsManager = this.f43340b;
        CleverTapInstanceConfig cleverTapInstanceConfig = analyticsManager.f10949e;
        String str = this.f43339a;
        if (str == null) {
            str = "";
        }
        try {
            analyticsManager.f10956l.getClass();
            C5382b c5382bM6589d = Validator.m6589d(str);
            String string = c5382bM6589d.f33799c.toString();
            boolean zIsEmpty = string.isEmpty();
            C5383c c5383c = analyticsManager.f10955k;
            if (zIsEmpty) {
                C5382b c5382bM3821c = C0987y.m3821c(512, 6, new String[0]);
                c5383c.m11556b(c5382bM3821c);
                C2181a c2181aM6433b = cleverTapInstanceConfig.m6433b();
                String str2 = cleverTapInstanceConfig.f10995a;
                String str3 = c5382bM3821c.f33798b;
                c2181aM6433b.getClass();
                C2181a.m6452d(str2, str3);
            } else {
                if (c5382bM6589d.f33797a != 0) {
                    c5383c.m11556b(c5382bM6589d);
                }
                if (string.toLowerCase().contains("identity")) {
                    C2181a c2181aM6433b2 = cleverTapInstanceConfig.m6433b();
                    c2181aM6433b2.getClass();
                    C2181a.m6460m(cleverTapInstanceConfig.f10995a, "Cannot remove value for key " + string + " from user profile");
                } else {
                    analyticsManager.f10954j.m15790j(string, Boolean.FALSE);
                    analyticsManager.f10947c.mo592c0(new JSONObject().put(string, new JSONObject().put("$delete", true)), true);
                    C2181a c2181aM6433b3 = cleverTapInstanceConfig.m6433b();
                    c2181aM6433b3.getClass();
                    C2181a.m6460m(cleverTapInstanceConfig.f10995a, "removing value for key " + string + " from user profile");
                }
            }
        } catch (Throwable th2) {
            cleverTapInstanceConfig.m6433b().getClass();
            C2181a.m6461n(cleverTapInstanceConfig.f10995a, "Failed to remove profile value for key " + str, th2);
        }
        return null;
    }
}
