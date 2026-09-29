package p000;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzaf;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ckb {

    /* JADX INFO: renamed from: a */
    public static final Uri f10199a = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* JADX INFO: renamed from: a */
    public static Intent m4817a(Context context, n3d n3dVar) throws zzaf {
        Bundle bundleCall;
        String str = n3dVar.f52305a;
        Intent intent = null;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (n3dVar.f52307c) {
            Bundle bundleM12429f = g9a.m12429f("serviceActionBundleKey", str);
            try {
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(f10199a);
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    throw new RemoteException("Failed to acquire ContentProviderClient");
                }
                try {
                    bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("serviceIntentCall", null, bundleM12429f);
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    if (bundleCall != null) {
                        Intent intent2 = (Intent) bundleCall.getParcelable("serviceResponseIntentKey");
                        if (intent2 != null) {
                            intent = intent2;
                        } else {
                            PendingIntent pendingIntent = (PendingIntent) bundleCall.getParcelable("serviceMissingResolutionIntentKey");
                            if (pendingIntent != null) {
                                StringBuilder sb = new StringBuilder(str.length() + 72);
                                sb.append("Dynamic lookup for intent failed for action ");
                                sb.append(str);
                                sb.append(" but has possible resolution");
                                Log.w("ServiceBindIntentUtils", sb.toString());
                                throw new zzaf(new ConnectionResult(25, pendingIntent, null));
                            }
                        }
                    }
                    if (intent == null) {
                        Log.w("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action: ".concat(str));
                    }
                } catch (Throwable th) {
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    throw th;
                }
            } catch (RemoteException | IllegalArgumentException e) {
                Log.w("ServiceBindIntentUtils", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundleCall = null;
            }
        }
        return intent == null ? new Intent(str).setPackage(n3dVar.f52306b) : intent;
    }
}
