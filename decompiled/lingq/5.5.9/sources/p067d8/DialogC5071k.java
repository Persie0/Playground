package p067d8;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.activity.RunnableC0183b;
import androidx.fragment.app.ActivityC0979t;
import dm.C5207g;
import org.json.JSONException;
import org.json.JSONObject;
import p173i8.C6205a;
import p291o7.C8004n;

/* JADX INFO: renamed from: d8.k */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC5071k extends DialogC5064e0 {

    /* JADX INFO: renamed from: J */
    public static final /* synthetic */ int f32957J = 0;

    /* JADX INFO: renamed from: I */
    public boolean f32958I;

    public DialogC5071k(ActivityC0979t activityC0979t, String str, String str2) {
        super(activityC0979t, str);
        this.f32921b = str2;
    }

    /* JADX INFO: renamed from: f */
    public static void m10767f(DialogC5071k dialogC5071k) {
        C5207g.m11111f(dialogC5071k, "this$0");
        super.cancel();
    }

    @Override // p067d8.DialogC5064e0
    /* JADX INFO: renamed from: b */
    public final Bundle mo10756b(String str) {
        Uri uri = Uri.parse(str);
        C5086z c5086z = C5086z.f33015a;
        Bundle bundleM10809H = C5086z.m10809H(uri.getQuery());
        String string = bundleM10809H.getString("bridge_args");
        bundleM10809H.remove("bridge_args");
        if (!C5086z.m10802A(string)) {
            try {
                bundleM10809H.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", C5059c.m10750a(new JSONObject(string)));
            } catch (JSONException e10) {
                C8004n c8004n = C8004n.f43550a;
                if (C8004n.f43559j && !C5086z.m10802A("d8.k")) {
                    Log.d("d8.k", "Unable to parse bridge_args JSON", e10);
                }
            }
        }
        String string2 = bundleM10809H.getString("method_results");
        bundleM10809H.remove("method_results");
        if (!C5086z.m10802A(string2)) {
            try {
                bundleM10809H.putBundle("com.facebook.platform.protocol.RESULT_ARGS", C5059c.m10750a(new JSONObject(string2)));
            } catch (JSONException e11) {
                C8004n c8004n2 = C8004n.f43550a;
                if (C8004n.f43559j && !C5086z.m10802A("d8.k")) {
                    Log.d("d8.k", "Unable to parse bridge_args JSON", e11);
                }
            }
        }
        bundleM10809H.remove("version");
        C5079s c5079s = C5079s.f32992a;
        int iIntValue = 0;
        if (!C6205a.m12742b(C5079s.class)) {
            try {
                iIntValue = C5079s.f32996e[0].intValue();
            } catch (Throwable th2) {
                C6205a.m12741a(C5079s.class, th2);
            }
        }
        bundleM10809H.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", iIntValue);
        return bundleM10809H;
    }

    @Override // p067d8.DialogC5064e0, android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        DialogC5064e0.f fVar = this.f32923d;
        if (this.f32930k && !this.f32928i && fVar != null) {
            if (fVar.isShown()) {
                if (this.f32958I) {
                    return;
                }
                this.f32958I = true;
                fVar.loadUrl(C5207g.m11116k("(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();", "javascript:"));
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0183b(9, this), 1500L);
                return;
            }
        }
        super.cancel();
    }
}
