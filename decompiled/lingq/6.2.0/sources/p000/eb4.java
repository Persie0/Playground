package p000;

import android.content.Context;
import androidx.core.app.NotificationManagerCompat;
import com.iterable.iterableapi.C1216l;
import com.iterable.iterableapi.IterableAPIMobileFrameworkType;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class eb4 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f36971a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f36972b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f36973c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f36974d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f36975e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ HashMap f36976f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ fb4 f36977g;

    public eb4(fb4 fb4Var, String str, String str2, String str3, String str4, String str5, HashMap map) {
        this.f36977g = fb4Var;
        this.f36971a = str;
        this.f36972b = str2;
        this.f36973c = str3;
        this.f36974d = str4;
        this.f36975e = str5;
        this.f36976f = map;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        IterableAPIMobileFrameworkType iterableAPIMobileFrameworkTypeM6946a;
        fb4 fb4Var = this.f36977g;
        String str = this.f36971a;
        String str2 = this.f36972b;
        String str3 = this.f36973c;
        String str4 = this.f36974d;
        String str5 = this.f36975e;
        HashMap map = this.f36976f;
        if (fb4Var.m11690a()) {
            if (str4 == null) {
                eh0.m11135p("IterableApi", "registerDeviceToken: applicationName is null, check that pushIntegrationName is set in IterableConfig");
            }
            fb4Var.f38771b.getClass();
            fb4Var.f38771b.getClass();
            bl2 bl2Var = fb4Var.f38780k;
            Context context = ((fb4) ((m58) bl2Var.f8655a).f50618b).f38770a;
            JSONObject jSONObject = new JSONObject();
            try {
                bl2Var.m3855l(jSONObject);
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry entry : map.entrySet()) {
                    jSONObject2.put((String) entry.getKey(), entry.getValue());
                }
                jSONObject2.put("tokenRegistrationType", "FCM");
                jSONObject2.put("firebaseCompatible", true);
                fb4.f38769t.f38771b.getClass();
                context.getClass();
                IterableAPIMobileFrameworkType iterableAPIMobileFrameworkType = C1216l.f14056b;
                if (iterableAPIMobileFrameworkType == null) {
                    synchronized (C1216l.f14055a) {
                        iterableAPIMobileFrameworkTypeM6946a = C1216l.f14056b;
                        if (iterableAPIMobileFrameworkTypeM6946a == null) {
                            iterableAPIMobileFrameworkTypeM6946a = C1216l.m6946a(context);
                            C1216l.f14056b = iterableAPIMobileFrameworkTypeM6946a;
                        }
                    }
                    iterableAPIMobileFrameworkType = iterableAPIMobileFrameworkTypeM6946a;
                }
                d32.m10036e0(jSONObject2, context, ((fb4) ((m58) bl2Var.f8655a).f50618b).m11693d(), new bl2(iterableAPIMobileFrameworkType, iterableAPIMobileFrameworkType == IterableAPIMobileFrameworkType.NATIVE ? "3.7.0" : null));
                jSONObject2.put("notificationsEnabled", NotificationManagerCompat.from(context).areNotificationsEnabled());
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("token", str5);
                jSONObject3.put("platform", "GCM");
                jSONObject3.put("applicationName", str4);
                jSONObject3.putOpt("dataFields", jSONObject2);
                jSONObject.put("device", jSONObject3);
                if (str == null && str2 != null) {
                    jSONObject.put("preferUserId", true);
                }
                bl2Var.m3836Q("users/registerDeviceToken", jSONObject, str3, null, null);
            } catch (JSONException e) {
                eh0.m11136q("IterableApiClient", "registerDeviceToken: exception", e);
            }
        }
    }
}
