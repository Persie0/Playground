package com.facebook.login;

import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import p000.bd2;
import p000.kp3;
import p000.pp3;

/* JADX INFO: renamed from: com.facebook.login.a */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0927a implements kp3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11496a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DeviceAuthDialog f11497b;

    public /* synthetic */ C0927a(DeviceAuthDialog deviceAuthDialog, int i) {
        this.f11496a = i;
        this.f11497b = deviceAuthDialog;
    }

    @Override // p000.kp3
    /* JADX INFO: renamed from: a */
    public final void mo3204a(pp3 pp3Var) {
        int i = this.f11496a;
        DeviceAuthDialog deviceAuthDialog = this.f11497b;
        switch (i) {
            case 0:
                if (!deviceAuthDialog.f11428U0) {
                    FacebookRequestError facebookRequestError = pp3Var.f56629c;
                    if (facebookRequestError != null) {
                        FacebookException facebookException = facebookRequestError.f11365i;
                        if (facebookException == null) {
                            facebookException = new FacebookException();
                        }
                        deviceAuthDialog.m5208o0(facebookException);
                    } else {
                        JSONObject jSONObject = pp3Var.f56628b;
                        if (jSONObject == null) {
                            jSONObject = new JSONObject();
                        }
                        DeviceAuthDialog.RequestState requestState = new DeviceAuthDialog.RequestState();
                        try {
                            String string = jSONObject.getString("user_code");
                            requestState.f11432b = string;
                            requestState.f11431a = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", Arrays.copyOf(new Object[]{string}, 1));
                            requestState.f11433c = jSONObject.getString("code");
                            requestState.f11434d = jSONObject.getLong("interval");
                            deviceAuthDialog.m5212s0(requestState);
                        } catch (JSONException e) {
                            deviceAuthDialog.m5208o0(new FacebookException(e));
                            return;
                        }
                    }
                    break;
                }
                break;
            default:
                if (!deviceAuthDialog.f11424Q0.get()) {
                    FacebookRequestError facebookRequestError2 = pp3Var.f56629c;
                    if (facebookRequestError2 != null) {
                        int i2 = facebookRequestError2.f11359c;
                        if (i2 == 1349174 || i2 == 1349172) {
                            deviceAuthDialog.m5211r0();
                        } else if (i2 == 1349152) {
                            DeviceAuthDialog.RequestState requestState2 = deviceAuthDialog.f11427T0;
                            if (requestState2 != null) {
                                bd2.m3632a(requestState2.f11432b);
                            }
                            LoginClient.Request request = deviceAuthDialog.f11430W0;
                            if (request == null) {
                                deviceAuthDialog.m5207n0();
                            } else {
                                deviceAuthDialog.m5213t0(request);
                            }
                        } else if (i2 != 1349173) {
                            FacebookException facebookException2 = facebookRequestError2.f11365i;
                            if (facebookException2 == null) {
                                facebookException2 = new FacebookException();
                            }
                            deviceAuthDialog.m5208o0(facebookException2);
                        } else {
                            deviceAuthDialog.m5207n0();
                        }
                    } else {
                        try {
                            JSONObject jSONObject2 = pp3Var.f56628b;
                            if (jSONObject2 == null) {
                                jSONObject2 = new JSONObject();
                            }
                            String string2 = jSONObject2.getString("access_token");
                            string2.getClass();
                            deviceAuthDialog.m5209p0(string2, jSONObject2.getLong("expires_in"), Long.valueOf(jSONObject2.optLong("data_access_expiration_time")));
                        } catch (JSONException e2) {
                            deviceAuthDialog.m5208o0(new FacebookException(e2));
                        }
                    }
                    break;
                }
                break;
        }
    }
}
