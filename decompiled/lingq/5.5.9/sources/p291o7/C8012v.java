package p291o7;

import android.content.Intent;
import android.net.Uri;
import com.facebook.Profile;
import dm.C5207g;
import org.json.JSONException;
import org.json.JSONObject;
import p067d8.C5086z;
import p498y3.C10289a;

/* JADX INFO: renamed from: o7.v */
/* JADX INFO: loaded from: classes.dex */
public final class C8012v {

    /* JADX INFO: renamed from: d */
    public static final a f43591d = new a();

    /* JADX INFO: renamed from: e */
    public static volatile C8012v f43592e;

    /* JADX INFO: renamed from: a */
    public final C10289a f43593a;

    /* JADX INFO: renamed from: b */
    public final C8011u f43594b;

    /* JADX INFO: renamed from: c */
    public Profile f43595c;

    /* JADX INFO: renamed from: o7.v$a */
    public static final class a {
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public final synchronized C8012v m15888a() {
            C8012v c8012v;
            try {
                if (C8012v.f43592e == null) {
                    C10289a c10289aM19281a = C10289a.m19281a(C8004n.m15871a());
                    C5207g.m11110e(c10289aM19281a, "getInstance(applicationContext)");
                    C8012v.f43592e = new C8012v(c10289aM19281a, new C8011u());
                }
                c8012v = C8012v.f43592e;
                if (c8012v == null) {
                    C5207g.m11117l("instance");
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return c8012v;
        }
    }

    public C8012v(C10289a c10289a, C8011u c8011u) {
        this.f43593a = c10289a;
        this.f43594b = c8011u;
    }

    /* JADX INFO: renamed from: a */
    public final void m15887a(Profile profile, boolean z10) {
        Profile profile2 = this.f43595c;
        this.f43595c = profile;
        if (z10) {
            C8011u c8011u = this.f43594b;
            if (profile != null) {
                c8011u.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", profile.f11468a);
                    jSONObject.put("first_name", profile.f11469b);
                    jSONObject.put("middle_name", profile.f11470c);
                    jSONObject.put("last_name", profile.f11471d);
                    jSONObject.put("name", profile.f11472e);
                    Uri uri = profile.f11473f;
                    if (uri != null) {
                        jSONObject.put("link_uri", uri.toString());
                    }
                    Uri uri2 = profile.f11474g;
                    if (uri2 != null) {
                        jSONObject.put("picture_uri", uri2.toString());
                    }
                } catch (JSONException unused) {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    c8011u.f43590a.edit().putString("com.facebook.ProfileManager.CachedProfile", jSONObject.toString()).apply();
                }
            } else {
                c8011u.f43590a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
            }
        }
        if (C5086z.m10816a(profile2, profile)) {
            return;
        }
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", profile2);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", profile);
        this.f43593a.m19283c(intent);
    }
}
