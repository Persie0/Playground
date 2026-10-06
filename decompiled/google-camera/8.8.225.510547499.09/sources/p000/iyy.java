package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.wear.ambient.AmbientMode;
import java.util.Calendar;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iyy extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ jwl f32694a;

    public iyy(jwl jwlVar, byte[] bArr) {
        this.f32694a = jwlVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        jwl jwlVar = this.f32694a;
        if ("android.intent.action.TIMEZONE_CHANGED".equals(intent.getAction())) {
            Object obj = ((AmbientMode.AmbientController) jwlVar.f34957d).f1697a;
            Calendar.getInstance();
        }
    }
}
