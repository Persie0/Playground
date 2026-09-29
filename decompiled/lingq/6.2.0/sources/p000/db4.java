package p000;

import android.content.SharedPreferences;
import android.os.Build;
import androidx.core.app.NotificationManagerCompat;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class db4 implements ab4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35354a = 1;

    /* JADX INFO: renamed from: b */
    public fb4 f35355b;

    public db4(fb4 fb4Var) {
        this.f35355b = fb4Var;
    }

    /* JADX INFO: renamed from: c */
    private final void m10267c() {
    }

    /* JADX INFO: renamed from: d */
    private final void m10268d() {
    }

    @Override // p000.ab4
    /* JADX INFO: renamed from: a */
    public final void mo231a() {
        int i = this.f35354a;
    }

    @Override // p000.ab4
    /* JADX INFO: renamed from: b */
    public final void mo232b() {
        switch (this.f35354a) {
            case 0:
                fb4 fb4Var = this.f35355b;
                if (!fb4Var.f38778i) {
                    fb4Var.f38778i = true;
                    if (fb4.f38769t.f38771b.f49395a && fb4.f38769t.m11698j()) {
                        fb4.f38769t.m11699l();
                    }
                    bl2 bl2Var = fb4Var.f38780k;
                    or3 or3Var = new or3(fb4Var);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.putOpt("platform", "Android");
                        jSONObject.putOpt("appPackageName", ((fb4) ((m58) bl2Var.f8655a).f50618b).f38770a.getPackageName());
                        jSONObject.put("SDKVersion", "3.7.0");
                        jSONObject.put("systemVersion", Build.VERSION.RELEASE);
                        l78 l78VarM3831L = bl2Var.m3831L();
                        fb4 fb4Var2 = (fb4) ((m58) bl2Var.f8655a).f50618b;
                        l78VarM3831L.mo6965c(fb4Var2.f38772c, "mobile/getRemoteConfiguration", jSONObject, fb4Var2.f38776g, or3Var);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                if (fb4Var.f38770a == null || fb4.f38769t.f38770a == null) {
                    eh0.m11121R("IterableApi", "onForeground: _applicationContext is null");
                } else {
                    boolean zAreNotificationsEnabled = NotificationManagerCompat.from(fb4Var.f38770a).areNotificationsEnabled();
                    SharedPreferences sharedPreferences = fb4.f38769t.f38770a.getSharedPreferences("com.iterable.iterableapi", 0);
                    boolean zContains = sharedPreferences.contains("itbl_notifications_enabled");
                    boolean z = sharedPreferences.getBoolean("itbl_notifications_enabled", false);
                    if (fb4.f38769t.m11698j()) {
                        te1.m21973F(fb4Var.f38770a);
                        if (fb4.f38769t.f38771b.f49395a && zContains && z != zAreNotificationsEnabled) {
                            fb4.f38769t.m11699l();
                        }
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putBoolean("itbl_notifications_enabled", zAreNotificationsEnabled);
                        editorEdit.apply();
                    }
                }
                break;
            default:
                System.currentTimeMillis();
                fb4 fb4Var3 = this.f35355b;
                if (!fb4Var3.m11690a() && fb4Var3.f38775f == null) {
                    fb4Var3.f38771b.getClass();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ db4() {
    }
}
