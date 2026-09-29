package p000;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class uy2 extends g3b {

    /* JADX INFO: renamed from: K */
    public static final /* synthetic */ int f64517K = 0;

    /* JADX INFO: renamed from: J */
    public boolean f64518J;

    /* JADX INFO: renamed from: g */
    public static void m23009g(uy2 uy2Var) {
        super.cancel();
    }

    @Override // p000.g3b
    /* JADX INFO: renamed from: c */
    public final Bundle mo12345c(String str) {
        Bundle bundleM3964n0 = bna.m3964n0(Uri.parse(str).getQuery());
        String string = bundleM3964n0.getString("bridge_args");
        bundleM3964n0.remove("bridge_args");
        if (!bna.m3945d0(string)) {
            try {
                bundleM3964n0.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", sj0.m21399a(new JSONObject(string)));
            } catch (JSONException unused) {
                sy2 sy2Var = sy2.f61585a;
            }
        }
        String string2 = bundleM3964n0.getString("method_results");
        bundleM3964n0.remove("method_results");
        if (!bna.m3945d0(string2)) {
            try {
                bundleM3964n0.putBundle("com.facebook.platform.protocol.RESULT_ARGS", sj0.m21399a(new JSONObject(string2)));
            } catch (JSONException unused2) {
                sy2 sy2Var2 = sy2.f61585a;
            }
        }
        bundleM3964n0.remove("version");
        bundleM3964n0.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", s76.m21138h());
        return bundleM3964n0;
    }

    @Override // p000.g3b, android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        sc4 sc4Var = this.f40142d;
        if (!this.f40149k || this.f40147i || sc4Var == null || !sc4Var.isShown()) {
            super.cancel();
        } else {
            if (this.f64518J) {
                return;
            }
            this.f64518J = true;
            sc4Var.loadUrl("javascript:(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC3781y2(this, 20), 1500L);
        }
    }
}
