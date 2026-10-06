package p000;

import android.app.Notification;
import android.view.View;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class abn {
    /* JADX INFO: renamed from: a */
    public static Notification.Action.Builder m141a(Notification.Action.Builder builder, boolean z) {
        return builder.setAuthenticationRequired(z);
    }

    /* JADX INFO: renamed from: b */
    static Notification.Builder m142b(Notification.Builder builder, int i) {
        return builder.setForegroundServiceBehavior(i);
    }

    /* JADX INFO: renamed from: c */
    public static final void m143c(View view) {
        Iterator itMo18817a = ooc.m18743i(new afv(view, null)).mo18817a();
        while (itMo18817a.hasNext()) {
            m144d((View) itMo18817a.next()).m2592m();
        }
    }

    /* JADX INFO: renamed from: d */
    public static final bkn m144d(View view) {
        bkn bknVar = (bkn) view.getTag(C0100R.id.pooling_container_listener_holder_tag);
        if (bknVar != null) {
            return bknVar;
        }
        bkn bknVar2 = new bkn((byte[]) null, (byte[]) null, (byte[]) null);
        view.setTag(C0100R.id.pooling_container_listener_holder_tag, bknVar2);
        return bknVar2;
    }
}
