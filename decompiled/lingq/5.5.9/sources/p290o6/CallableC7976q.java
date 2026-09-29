package p290o6;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.InAppNotificationActivity;
import com.clevertap.android.sdk.inbox.CTInboxActivity;
import com.clevertap.android.sdk.pushnotification.C2260f;
import com.clevertap.android.sdk.pushnotification.CTNotificationIntentService;
import com.clevertap.android.sdk.pushnotification.CTPushNotificationReceiver;
import com.clevertap.android.sdk.pushnotification.PushConstants;
import com.clevertap.android.sdk.pushnotification.amp.CTBackgroundIntentService;
import com.clevertap.android.sdk.pushnotification.amp.CTBackgroundJobService;
import java.util.concurrent.Callable;
import p088e7.C5381a;
import p254m2.C7472a;

/* JADX INFO: renamed from: o6.q */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC7976q implements Callable<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CleverTapAPI f43401a;

    public CallableC7976q(CleverTapAPI cleverTapAPI) {
        this.f43401a = cleverTapAPI;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0085  */
    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        boolean z10;
        CleverTapAPI cleverTapAPI = this.f43401a;
        Context context = cleverTapAPI.f10980a;
        C7987z c7987z = cleverTapAPI.f10981b;
        C7951d0 c7951d0 = c7987z.f43472b;
        C2260f c2260f = c7987z.f43481k;
        boolean z11 = C7979r0.f43406a;
        try {
            z10 = C7472a.m14841a(context, "android.permission.INTERNET") == 0;
        } catch (Throwable unused) {
        }
        if (!z10) {
            C2181a.m6449a("Missing Permission: android.permission.INTERNET");
        }
        C2181a.m6454f("SDK Version Code is " + c7951d0.m15764h().f43314m);
        if (!C7954f.f43321a) {
            int i10 = CleverTapAPI.f10977c;
            if (!C7986y.f43446Q) {
                C2181a.m6454f("Activity Lifecycle Callback not registered. Either set the android:name in your AndroidManifest.xml application tag to com.clevertap.android.sdk.Application, \n or, if you have a custom Application class, call ActivityLifecycleCallback.register(this); before super.onCreate() in your class");
                String str = context.getApplicationInfo().className;
                if (str == null || str.isEmpty()) {
                    C2181a.m6454f("Unable to determine Application Class");
                } else if (str.equals("com.clevertap.android.sdk.Application")) {
                    C2181a.m6454f("AndroidManifest.xml uses the CleverTap Application class, be sure you have properly added the CleverTap Account ID and Token to your AndroidManifest.xml, \nor set them programmatically in the onCreate method of your custom application class prior to calling super.onCreate()");
                } else {
                    C2181a.m6454f("Application Class is ".concat(str));
                }
            }
        }
        try {
            C5381a.m11553b((Application) context.getApplicationContext(), CTPushNotificationReceiver.class.getName());
            C5381a.m11554c((Application) context.getApplicationContext(), CTNotificationIntentService.class.getName());
            C5381a.m11552a((Application) context.getApplicationContext(), InAppNotificationActivity.class);
            C5381a.m11552a((Application) context.getApplicationContext(), CTInboxActivity.class);
            C5381a.m11553b((Application) context.getApplicationContext(), "com.clevertap.android.geofence.CTGeofenceReceiver");
            C5381a.m11553b((Application) context.getApplicationContext(), "com.clevertap.android.geofence.CTLocationUpdateReceiver");
            C5381a.m11553b((Application) context.getApplicationContext(), "com.clevertap.android.geofence.CTGeofenceBootReceiver");
            C5381a.m11554c((Application) context.getApplicationContext(), CTBackgroundJobService.class.getName());
            C5381a.m11554c((Application) context.getApplicationContext(), CTBackgroundIntentService.class.getName());
        } catch (Exception e10) {
            C2181a.m6455h("Receiver/Service issue : " + e10.toString());
        }
        for (PushConstants.PushType pushType : c2260f.m6575e()) {
            if (pushType == PushConstants.PushType.FCM) {
                try {
                    C5381a.m11554c((Application) context.getApplicationContext(), "com.clevertap.android.sdk.pushnotification.fcm.FcmMessageListenerService");
                } catch (Error e11) {
                    C2181a.m6455h("FATAL : " + e11.getMessage());
                } catch (Exception e12) {
                    C2181a.m6455h("Receiver/Service issue : " + e12.toString());
                }
            } else if (pushType == PushConstants.PushType.HPS) {
                try {
                    C5381a.m11554c((Application) context.getApplicationContext(), "com.clevertap.android.hms.CTHmsMessageService");
                } catch (Error e13) {
                    C2181a.m6455h("FATAL : " + e13.getMessage());
                } catch (Exception e14) {
                    C2181a.m6455h("Receiver/Service issue : " + e14.toString());
                }
            } else if (pushType == PushConstants.PushType.XPS) {
                try {
                    C5381a.m11553b((Application) context.getApplicationContext(), "com.clevertap.android.xps.XiaomiMessageReceiver");
                } catch (Error e15) {
                    C2181a.m6455h("FATAL : " + e15.getMessage());
                } catch (Exception e16) {
                    C2181a.m6455h("Receiver/Service issue : " + e16.toString());
                }
            }
        }
        C7967l0.m15806h(context).getClass();
        if (!TextUtils.isEmpty(C7967l0.f43365H)) {
            C2181a.m6454f("We have noticed that your app is using a custom FCM Sender ID, this feature will be DISCONTINUED from the next version of the CleverTap Android SDK. With the next release, CleverTap Android SDK will only fetch the token using the google-services.json. Please reach out to CleverTap Support for any questions.");
        }
        return null;
    }
}
