package p000;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.HttpMethod;
import com.facebook.LoggingBehavior;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class mp3 {

    /* JADX INFO: renamed from: j */
    public static final String f51688j;

    /* JADX INFO: renamed from: k */
    public static final Pattern f51689k;

    /* JADX INFO: renamed from: l */
    public static volatile String f51690l;

    /* JADX INFO: renamed from: a */
    public final AccessToken f51691a;

    /* JADX INFO: renamed from: b */
    public final String f51692b;

    /* JADX INFO: renamed from: c */
    public JSONObject f51693c;

    /* JADX INFO: renamed from: d */
    public Bundle f51694d;

    /* JADX INFO: renamed from: e */
    public String f51695e;

    /* JADX INFO: renamed from: f */
    public final String f51696f;

    /* JADX INFO: renamed from: g */
    public kp3 f51697g;

    /* JADX INFO: renamed from: h */
    public HttpMethod f51698h;

    /* JADX INFO: renamed from: i */
    public boolean f51699i;

    static {
        char[] cArr = {'-', '_', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int iNextInt = secureRandom.nextInt(11) + 30;
        for (int i = 0; i < iNextInt; i++) {
            sb.append(cArr[secureRandom.nextInt(64)]);
        }
        f51688j = sb.toString();
        f51689k = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    public mp3(AccessToken accessToken, String str, Bundle bundle, HttpMethod httpMethod, kp3 kp3Var) {
        this.f51691a = accessToken;
        this.f51692b = str;
        this.f51696f = null;
        m16988j(kp3Var);
        m16989k(httpMethod);
        if (bundle != null) {
            this.f51694d = new Bundle(bundle);
        } else {
            this.f51694d = new Bundle();
        }
        this.f51696f = sy2.m21769d();
    }

    /* JADX INFO: renamed from: f */
    public static String m16979f() {
        String strM21767b = sy2.m21767b();
        eda.m11074g();
        String str = sy2.f61592h;
        if (str == null) {
            throw new FacebookException("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
        }
        if (strM21767b.length() <= 0 || str.length() <= 0) {
            return null;
        }
        return strM21767b + '|' + str;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX INFO: renamed from: a */
    public final void m16980a() {
        Bundle bundle = this.f51694d;
        String strM16984e = m16984e();
        boolean zM23380c0 = strM16984e != null ? vk9.m23380c0(strM16984e, "|", false) : false;
        if (strM16984e == null || !cl9.m4842Y(strM16984e, "IG", false) || zM23380c0 || !m16987i()) {
            if ((fa4.m11650l(sy2.m21770e(), "instagram.com") ? true ^ m16987i() : true) || zM23380c0) {
                String strM16984e2 = m16984e();
                if (strM16984e2 != null) {
                    bundle.putString("access_token", strM16984e2);
                }
            } else {
                bundle.putString("access_token", m16979f());
            }
        } else {
            bundle.putString("access_token", m16979f());
        }
        if (!bundle.containsKey("access_token")) {
            sy2 sy2Var = sy2.f61585a;
            eda.m11074g();
            String str = sy2.f61592h;
            if (str == null) {
                throw new FacebookException("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
            }
            if (bna.m3945d0(str)) {
                Log.w("mp3", "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change.");
            }
        }
        bundle.putString("sdk", "android");
        bundle.putString("format", "json");
        sy2.m21773h(LoggingBehavior.GRAPH_API_DEBUG_INFO);
        sy2.m21773h(LoggingBehavior.GRAPH_API_DEBUG_WARNING);
    }

    /* JADX INFO: renamed from: b */
    public final String m16981b(String str, boolean z) {
        if (!z && this.f51698h == HttpMethod.POST) {
            return str;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.f51694d.keySet()) {
            Object obj = this.f51694d.get(str2);
            if (obj == null) {
                obj = "";
            }
            if (s46.m21067o(obj)) {
                builderBuildUpon.appendQueryParameter(str2, s46.m21058b(obj).toString());
            } else if (this.f51698h != HttpMethod.GET) {
                C3386nv.m17626m(String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1)));
                return null;
            }
        }
        String string = builderBuildUpon.toString();
        string.getClass();
        return string;
    }

    /* JADX INFO: renamed from: c */
    public final pp3 m16982c() {
        ArrayList arrayListM21064l = s46.m21064l(new op3(AbstractC3550rv.m20852t0(new mp3[]{this})));
        if (arrayListM21064l.size() == 1) {
            return (pp3) arrayListM21064l.get(0);
        }
        throw new FacebookException("invalid state: expected a single response");
    }

    /* JADX INFO: renamed from: d */
    public final np3 m16983d() {
        op3 op3Var = new op3(AbstractC3550rv.m20852t0(new mp3[]{this}));
        eda.m11072e(op3Var);
        np3 np3Var = new np3(op3Var);
        np3Var.executeOnExecutor(sy2.m21768c(), new Void[0]);
        return np3Var;
    }

    /* JADX INFO: renamed from: e */
    public final String m16984e() {
        Bundle bundle = this.f51694d;
        AccessToken accessToken = this.f51691a;
        if (accessToken != null) {
            if (!bundle.containsKey("access_token")) {
                String str = accessToken.f11311e;
                qj5.f57852d.m14206q(str);
                return str;
            }
        } else if (!bundle.containsKey("access_token")) {
            return m16979f();
        }
        return this.f51694d.getString("access_token");
    }

    /* JADX INFO: renamed from: g */
    public final String m16985g() {
        String str;
        String str2;
        if (this.f51698h == HttpMethod.POST && (str2 = this.f51692b) != null && cl9.m4833P(str2, "/videos", false)) {
            str = String.format("https://graph-video.%s", Arrays.copyOf(new Object[]{sy2.m21770e()}, 1));
        } else {
            String strM21770e = sy2.m21770e();
            strM21770e.getClass();
            str = String.format("https://graph.%s", Arrays.copyOf(new Object[]{strM21770e}, 1));
        }
        String strM16986h = m16986h(str);
        m16980a();
        return m16981b(strM16986h, false);
    }

    /* JADX INFO: renamed from: h */
    public final String m16986h(String str) {
        if (!(!fa4.m11650l(sy2.m21770e(), "instagram.com") ? true : !m16987i())) {
            str = String.format("https://graph.%s", Arrays.copyOf(new Object[]{sy2.f61603s}, 1));
        }
        Pattern pattern = f51689k;
        String str2 = this.f51692b;
        if (!pattern.matcher(str2).matches()) {
            str2 = String.format("%s/%s", Arrays.copyOf(new Object[]{this.f51696f, str2}, 2));
        }
        return String.format("%s/%s", Arrays.copyOf(new Object[]{str, str2}, 2));
    }

    /* JADX INFO: renamed from: i */
    public final boolean m16987i() {
        String str = this.f51692b;
        if (str == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder("^/?");
        sb.append(sy2.m21767b());
        sb.append("/?.*");
        return this.f51699i || Pattern.matches(sb.toString(), str) || Pattern.matches("^/?app/?.*", str);
    }

    /* JADX INFO: renamed from: j */
    public final void m16988j(kp3 kp3Var) {
        sy2.m21773h(LoggingBehavior.GRAPH_API_DEBUG_INFO);
        sy2.m21773h(LoggingBehavior.GRAPH_API_DEBUG_WARNING);
        this.f51697g = kp3Var;
    }

    /* JADX INFO: renamed from: k */
    public final void m16989k(HttpMethod httpMethod) {
        if (httpMethod == null) {
            httpMethod = HttpMethod.GET;
        }
        this.f51698h = httpMethod;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{Request:  accessToken: ");
        Object obj = this.f51691a;
        if (obj == null) {
            obj = "null";
        }
        sb.append(obj);
        sb.append(", graphPath: ");
        sb.append(this.f51692b);
        sb.append(", graphObject: ");
        sb.append(this.f51693c);
        sb.append(", httpMethod: ");
        sb.append(this.f51698h);
        sb.append(", parameters: ");
        sb.append(this.f51694d);
        sb.append("}");
        return sb.toString();
    }
}
