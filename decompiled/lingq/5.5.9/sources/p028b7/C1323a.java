package p028b7;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.media.AbstractC0140a;
import androidx.activity.result.C0204c;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.product_config.CTProductConfigController;
import com.clevertap.android.sdk.validation.Validator;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p290o6.C7977q0;
import p290o6.C7985x;
import p475x6.C10101a;

/* JADX INFO: renamed from: b7.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1323a extends AbstractC1324b {

    /* JADX INFO: renamed from: b */
    public final CTProductConfigController f8076b;

    /* JADX INFO: renamed from: c */
    public final AbstractC0140a f8077c;

    /* JADX INFO: renamed from: d */
    public final CleverTapInstanceConfig f8078d;

    /* JADX INFO: renamed from: e */
    public final C2181a f8079e;

    /* JADX INFO: renamed from: f */
    public final C10101a f8080f;

    /* JADX INFO: renamed from: g */
    public final Validator f8081g;

    public C1323a(C1326d c1326d, CleverTapInstanceConfig cleverTapInstanceConfig, C10101a c10101a, Validator validator, C7985x c7985x) {
        this.f8077c = c1326d;
        this.f8078d = cleverTapInstanceConfig;
        this.f8076b = c7985x.f43438g;
        this.f8079e = cleverTapInstanceConfig.m6433b();
        this.f8080f = c10101a;
        this.f8081g = validator;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0059  */
    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: b0 */
    public final void mo591b0(JSONObject jSONObject, String str, Context context) {
        C2181a c2181a = this.f8079e;
        try {
            if (jSONObject.has("arp")) {
                JSONObject jSONObject2 = (JSONObject) jSONObject.get("arp");
                if (jSONObject2.length() > 0) {
                    CTProductConfigController cTProductConfigController = this.f8076b;
                    if (cTProductConfigController != null) {
                        cTProductConfigController.m6567j(jSONObject2);
                    }
                    try {
                        m4888m0(jSONObject2);
                    } catch (Throwable th2) {
                        String str2 = "Error handling discarded events response: " + th2.getLocalizedMessage();
                        c2181a.getClass();
                        C2181a.m6458k(str2);
                    }
                    m4887l0(context, jSONObject2);
                }
            }
        } catch (Throwable th3) {
            String str3 = this.f8078d.f10995a;
            c2181a.getClass();
            C2181a.m6461n(str3, "Failed to process ARP", th3);
        }
        this.f8077c.mo591b0(jSONObject, str, context);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m4887l0(Context context, JSONObject jSONObject) {
        String strM18951q0;
        if (jSONObject.length() == 0 || (strM18951q0 = this.f8080f.m18951q0()) == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = C7977q0.m15827e(context, strM18951q0).edit();
        Iterator<String> itKeys = jSONObject.keys();
        while (true) {
            boolean zHasNext = itKeys.hasNext();
            CleverTapInstanceConfig cleverTapInstanceConfig = this.f8078d;
            C2181a c2181a = this.f8079e;
            if (!zHasNext) {
                String str = cleverTapInstanceConfig.f10995a;
                StringBuilder sbM854m = C0204c.m854m("Stored ARP for namespace key: ", strM18951q0, " values: ");
                sbM854m.append(jSONObject.toString());
                String string = sbM854m.toString();
                c2181a.getClass();
                C2181a.m6460m(str, string);
                C7977q0.m15830h(editorEdit);
                return;
            }
            String next = itKeys.next();
            try {
                Object obj = jSONObject.get(next);
                if (obj instanceof Number) {
                    editorEdit.putInt(next, ((Number) obj).intValue());
                } else if (obj instanceof String) {
                    if (((String) obj).length() < 100) {
                        editorEdit.putString(next, (String) obj);
                    } else {
                        c2181a.getClass();
                        C2181a.m6460m(cleverTapInstanceConfig.f10995a, "ARP update for key " + next + " rejected (string value too long)");
                    }
                } else if (obj instanceof Boolean) {
                    editorEdit.putBoolean(next, ((Boolean) obj).booleanValue());
                } else {
                    c2181a.getClass();
                    C2181a.m6460m(cleverTapInstanceConfig.f10995a, "ARP update for key " + next + " rejected (invalid data type)");
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m4888m0(JSONObject jSONObject) {
        boolean zHas = jSONObject.has("d_e");
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f8078d;
        C2181a c2181a = this.f8079e;
        if (!zHas) {
            String str = cleverTapInstanceConfig.f10995a;
            c2181a.getClass();
            C2181a.m6460m(str, "ARP doesn't contain the Discarded Events key");
            return;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            JSONArray jSONArray = jSONObject.getJSONArray("d_e");
            if (jSONArray != null) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    arrayList.add(jSONArray.getString(i10));
                }
            }
            Validator validator = this.f8081g;
            if (validator != null) {
                validator.f11365a = arrayList;
                return;
            }
            String str2 = cleverTapInstanceConfig.f10995a;
            c2181a.getClass();
            C2181a.m6460m(str2, "Validator object is NULL");
        } catch (JSONException e10) {
            String str3 = cleverTapInstanceConfig.f10995a;
            String str4 = "Error parsing discarded events list" + e10.getLocalizedMessage();
            c2181a.getClass();
            C2181a.m6460m(str3, str4);
        }
    }
}
