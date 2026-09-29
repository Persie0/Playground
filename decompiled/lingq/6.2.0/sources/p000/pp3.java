package p000;

import com.facebook.FacebookRequestError;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class pp3 {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f56626e = 0;

    /* JADX INFO: renamed from: a */
    public final HttpURLConnection f56627a;

    /* JADX INFO: renamed from: b */
    public final JSONObject f56628b;

    /* JADX INFO: renamed from: c */
    public final FacebookRequestError f56629c;

    /* JADX INFO: renamed from: d */
    public final JSONObject f56630d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pp3(mp3 mp3Var, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject) {
        this(mp3Var, httpURLConnection, jSONObject, null, null);
        mp3Var.getClass();
        str.getClass();
    }

    public final String toString() {
        String str;
        try {
            Locale locale = Locale.US;
            HttpURLConnection httpURLConnection = this.f56627a;
            str = String.format(locale, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(httpURLConnection != null ? httpURLConnection.getResponseCode() : 200)}, 1));
        } catch (IOException unused) {
            str = "unknown";
        }
        StringBuilder sbM17742q = AbstractC3393o1.m17742q("{Response:  responseCode: ", str, ", graphObject: ");
        sbM17742q.append(this.f56628b);
        sbM17742q.append(", error: ");
        sbM17742q.append(this.f56629c);
        sbM17742q.append("}");
        return sbM17742q.toString();
    }

    public pp3(mp3 mp3Var, HttpURLConnection httpURLConnection, JSONObject jSONObject, JSONArray jSONArray, FacebookRequestError facebookRequestError) {
        mp3Var.getClass();
        this.f56627a = httpURLConnection;
        this.f56628b = jSONObject;
        this.f56629c = facebookRequestError;
        this.f56630d = jSONObject;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pp3(mp3 mp3Var, HttpURLConnection httpURLConnection, FacebookRequestError facebookRequestError) {
        this(mp3Var, httpURLConnection, null, null, facebookRequestError);
        mp3Var.getClass();
    }
}
