package p000;

import android.content.SharedPreferences;
import com.facebook.FacebookRequestError;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.cloudbridge.SettingsAPIFields;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: wr */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3732wr implements kp3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67197a;

    public /* synthetic */ C3732wr(int i) {
        this.f67197a = i;
    }

    /* JADX INFO: renamed from: b */
    private final void m24131b(pp3 pp3Var) {
    }

    @Override // p000.kp3
    /* JADX INFO: renamed from: a */
    public final void mo3204a(pp3 pp3Var) {
        switch (this.f67197a) {
            case 0:
                int i = AbstractC3489q9.f57405B;
                FacebookRequestError facebookRequestError = pp3Var.f56629c;
                boolean zBooleanValue = false;
                Object obj = null;
                linkedHashMap = null;
                linkedHashMap = null;
                linkedHashMap = null;
                linkedHashMap = null;
                linkedHashMap = null;
                linkedHashMap = null;
                linkedHashMap = null;
                linkedHashMap = null;
                LinkedHashMap linkedHashMap = null;
                if (facebookRequestError != null) {
                    iy5 iy5Var = qj5.f57852d;
                    iy5.m14198n(LoggingBehavior.APP_EVENTS, "q9", " \n\nGraph Response Error: \n================\nResponse Error: %s\nResponse Error Exception: %s\n\n ", facebookRequestError.toString(), String.valueOf(facebookRequestError.f11365i));
                    if (!lp1.f49971a.contains(AbstractC3489q9.class)) {
                        try {
                            SharedPreferences sharedPreferences = sy2.m21766a().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
                            if (sharedPreferences != null) {
                                SettingsAPIFields settingsAPIFields = SettingsAPIFields.DATASETID;
                                String string = sharedPreferences.getString(settingsAPIFields.getRawValue(), null);
                                SettingsAPIFields settingsAPIFields2 = SettingsAPIFields.URL;
                                String string2 = sharedPreferences.getString(settingsAPIFields2.getRawValue(), null);
                                SettingsAPIFields settingsAPIFields3 = SettingsAPIFields.ACCESSKEY;
                                String string3 = sharedPreferences.getString(settingsAPIFields3.getRawValue(), null);
                                if (string != null && !vk9.m23391n0(string) && string2 != null && !vk9.m23391n0(string2) && string3 != null && !vk9.m23391n0(string3)) {
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                    linkedHashMap2.put(settingsAPIFields2.getRawValue(), string2);
                                    linkedHashMap2.put(settingsAPIFields.getRawValue(), string);
                                    linkedHashMap2.put(settingsAPIFields3.getRawValue(), string3);
                                    linkedHashMap = linkedHashMap2;
                                }
                            }
                        } catch (Throwable th) {
                            lp1.m16420a(AbstractC3489q9.class, th);
                        }
                    }
                    if (linkedHashMap != null) {
                        URL url = new URL(String.valueOf(linkedHashMap.get(SettingsAPIFields.URL.getRawValue())));
                        AbstractC2975es.m11324a(String.valueOf(linkedHashMap.get(SettingsAPIFields.DATASETID.getRawValue())), url.getProtocol() + "://" + url.getHost(), String.valueOf(linkedHashMap.get(SettingsAPIFields.ACCESSKEY.getRawValue())));
                        AbstractC3489q9.f57406a = true;
                    }
                } else {
                    iy5 iy5Var2 = qj5.f57852d;
                    LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
                    iy5.m14198n(loggingBehavior, "q9", " \n\nGraph Response Received: \n================\n%s\n\n ", pp3Var);
                    JSONObject jSONObject = pp3Var.f56628b;
                    if (jSONObject != null) {
                        try {
                            obj = jSONObject.get("data");
                        } catch (NullPointerException e) {
                            iy5 iy5Var3 = qj5.f57852d;
                            iy5.m14198n(LoggingBehavior.APP_EVENTS, "q9", "CloudBridge Settings API response is not a valid json: \n%s ", lda.m16112L(e));
                            return;
                        } catch (JSONException e2) {
                            iy5 iy5Var4 = qj5.f57852d;
                            iy5.m14198n(LoggingBehavior.APP_EVENTS, "q9", "CloudBridge Settings API response is not a valid json: \n%s ", lda.m16112L(e2));
                            return;
                        }
                    }
                    obj.getClass();
                    HashMap mapM3917F = bna.m3917F(new JSONObject((String) u91.m22591I0(bna.m3916E((JSONArray) obj))));
                    String str = (String) mapM3917F.get(SettingsAPIFields.URL.getRawValue());
                    String str2 = (String) mapM3917F.get(SettingsAPIFields.DATASETID.getRawValue());
                    String str3 = (String) mapM3917F.get(SettingsAPIFields.ACCESSKEY.getRawValue());
                    if (str == null || str2 == null || str3 == null) {
                        iy5.m14199o(loggingBehavior, "q9", "CloudBridge Settings API response doesn't have valid data");
                    } else {
                        try {
                            AbstractC2975es.m11324a(str2, str, str3);
                            AbstractC3489q9.m19767D(mapM3917F);
                            SettingsAPIFields settingsAPIFields4 = SettingsAPIFields.ENABLED;
                            if (mapM3917F.get(settingsAPIFields4.getRawValue()) != null) {
                                Object obj2 = mapM3917F.get(settingsAPIFields4.getRawValue());
                                obj2.getClass();
                                zBooleanValue = ((Boolean) obj2).booleanValue();
                            }
                            AbstractC3489q9.f57406a = zBooleanValue;
                        } catch (MalformedURLException e3) {
                            iy5 iy5Var5 = qj5.f57852d;
                            iy5.m14198n(LoggingBehavior.APP_EVENTS, "q9", "CloudBridge Settings API response doesn't have valid url\n %s ", lda.m16112L(e3));
                            return;
                        }
                    }
                }
                break;
            case 1:
                break;
            default:
                iy5 iy5Var6 = qj5.f57852d;
                iy5.m14197m(LoggingBehavior.APP_EVENTS, ota.m18508a(), "App index sent to FB!");
                break;
        }
    }
}
