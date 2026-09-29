package p000;

import android.content.Context;
import android.os.AsyncTask;
import com.iterable.iterableapi.IterableFirebaseMessagingService;
import com.iterable.iterableapi.IterablePushRegistrationData$PushRegistrationAction;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class oc4 extends AsyncTask {

    /* JADX INFO: renamed from: a */
    public nc4 f54169a;

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0071  */
    /* JADX WARN: Code duplicated, block: B:30:0x0083  */
    /* JADX WARN: Code duplicated, block: B:31:0x0091  */
    /* JADX WARN: Code duplicated, block: B:32:0x0095  */
    /* JADX WARN: Code duplicated, block: B:34:0x0099  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c0 A[Catch: JSONException -> 0x00c6, TryCatch #0 {JSONException -> 0x00c6, blocks: (B:38:0x00b9, B:40:0x00c0, B:45:0x00d0, B:44:0x00cb), top: B:51:0x00b9 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00cb A[Catch: JSONException -> 0x00c6, TryCatch #0 {JSONException -> 0x00c6, blocks: (B:38:0x00b9, B:40:0x00c0, B:45:0x00d0, B:44:0x00cb), top: B:51:0x00b9 }] */
    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        C2920da c2920da;
        IterablePushRegistrationData$PushRegistrationAction iterablePushRegistrationData$PushRegistrationAction;
        fb4 fb4Var;
        String str;
        String str2;
        String str3;
        String str4;
        JSONObject jSONObject;
        fb4 fb4Var2;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        HashMap map;
        nc4 nc4Var = ((nc4[]) objArr)[0];
        this.f54169a = nc4Var;
        if (nc4Var.f52593c == null) {
            eh0.m11135p("IterablePush", "iterablePushRegistrationData has not been specified");
            return null;
        }
        try {
            Context context = fb4.f38769t.f38770a;
            if (context != null) {
                int identifier = context.getResources().getIdentifier("gcm_defaultSenderId", "string", context.getPackageName());
                if ((identifier != 0 ? context.getResources().getString(identifier) : null) == null) {
                    eh0.m11135p("IterablePushRegistration", "Could not find gcm_defaultSenderId, please check that Firebase SDK is set up properly");
                } else {
                    String strM6889f = IterableFirebaseMessagingService.m6889f();
                    c2920da = new C2920da();
                    c2920da.f35235b = strM6889f;
                }
                if (c2920da != null) {
                    iterablePushRegistrationData$PushRegistrationAction = this.f54169a.f52595e;
                    if (iterablePushRegistrationData$PushRegistrationAction == IterablePushRegistrationData$PushRegistrationAction.ENABLE) {
                        fb4Var2 = fb4.f38769t;
                        nc4 nc4Var2 = this.f54169a;
                        str5 = nc4Var2.f52591a;
                        str6 = nc4Var2.f52592b;
                        str7 = nc4Var2.f52594d;
                        str8 = nc4Var2.f52593c;
                        str9 = c2920da.f35235b;
                        map = fb4.f38769t.f38786q;
                        if (str9 != null) {
                            fb4Var2.getClass();
                        } else if (fb4Var2.m11690a() && fb4Var2.f38775f == null) {
                            fb4.f38769t.f38771b.getClass();
                        } else {
                            new Thread(new eb4(fb4Var2, str5, str6, str7, str8, str9, map)).start();
                        }
                    } else if (iterablePushRegistrationData$PushRegistrationAction == IterablePushRegistrationData$PushRegistrationAction.DISABLE) {
                        fb4Var = fb4.f38769t;
                        nc4 nc4Var3 = this.f54169a;
                        str = nc4Var3.f52591a;
                        str2 = nc4Var3.f52592b;
                        str3 = nc4Var3.f52594d;
                        str4 = c2920da.f35235b;
                        if (str4 == null) {
                            fb4Var.getClass();
                            eh0.m11133m("IterableApi", "device token not available");
                        } else {
                            bl2 bl2Var = fb4Var.f38780k;
                            jSONObject = new JSONObject();
                            try {
                                jSONObject.put("token", str4);
                                if (str != null) {
                                    jSONObject.put("email", str);
                                } else if (str2 != null) {
                                    jSONObject.put("userId", str2);
                                }
                                bl2Var.m3836Q("users/disableDevice", jSONObject, str3, null, null);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
                return null;
            }
            eh0.m11135p("IterablePushRegistration", "MainActivity Context is null");
        } catch (Exception e2) {
            eh0.m11136q("IterablePushRegistration", "Exception while retrieving the device token: check that firebase is added to the build dependencies", e2);
        }
        c2920da = null;
        if (c2920da != null) {
            iterablePushRegistrationData$PushRegistrationAction = this.f54169a.f52595e;
            if (iterablePushRegistrationData$PushRegistrationAction == IterablePushRegistrationData$PushRegistrationAction.ENABLE) {
                fb4Var2 = fb4.f38769t;
                nc4 nc4Var4 = this.f54169a;
                str5 = nc4Var4.f52591a;
                str6 = nc4Var4.f52592b;
                str7 = nc4Var4.f52594d;
                str8 = nc4Var4.f52593c;
                str9 = c2920da.f35235b;
                map = fb4.f38769t.f38786q;
                if (str9 != null) {
                    fb4Var2.getClass();
                } else if (fb4Var2.m11690a()) {
                    new Thread(new eb4(fb4Var2, str5, str6, str7, str8, str9, map)).start();
                } else {
                    new Thread(new eb4(fb4Var2, str5, str6, str7, str8, str9, map)).start();
                }
            } else if (iterablePushRegistrationData$PushRegistrationAction == IterablePushRegistrationData$PushRegistrationAction.DISABLE) {
                fb4Var = fb4.f38769t;
                nc4 nc4Var5 = this.f54169a;
                str = nc4Var5.f52591a;
                str2 = nc4Var5.f52592b;
                str3 = nc4Var5.f52594d;
                str4 = c2920da.f35235b;
                if (str4 == null) {
                    fb4Var.getClass();
                    eh0.m11133m("IterableApi", "device token not available");
                } else {
                    bl2 bl2Var2 = fb4Var.f38780k;
                    jSONObject = new JSONObject();
                    jSONObject.put("token", str4);
                    if (str != null) {
                        jSONObject.put("email", str);
                    } else if (str2 != null) {
                        jSONObject.put("userId", str2);
                    }
                    bl2Var2.m3836Q("users/disableDevice", jSONObject, str3, null, null);
                }
            }
        }
        return null;
    }
}
