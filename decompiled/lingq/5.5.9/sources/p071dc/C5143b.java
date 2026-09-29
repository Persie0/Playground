package p071dc;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC2544c;
import com.google.android.gms.common.api.C2542a;
import ec.C5388a;
import p176ib.C6254b;

/* JADX INFO: renamed from: dc.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5143b extends C2542a.a<C5388a, C5142a> {
    @Override // com.google.android.gms.common.api.C2542a.a
    /* JADX INFO: renamed from: b */
    public final C2542a.e mo4928b(Context context, Looper looper, C6254b c6254b, C5142a c5142a, AbstractC2544c.a aVar, AbstractC2544c.b bVar) {
        Integer num = c6254b.f36446h;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c6254b.f36439a);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return new C5388a(context, looper, c6254b, bundle, aVar, bVar);
    }
}
