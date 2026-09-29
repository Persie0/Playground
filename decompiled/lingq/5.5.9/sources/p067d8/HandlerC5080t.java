package p067d8;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import dm.C5207g;
import p173i8.C6205a;

/* JADX INFO: renamed from: d8.t */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC5080t extends Handler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractServiceConnectionC5081u f32999a;

    public HandlerC5080t(AbstractServiceConnectionC5081u abstractServiceConnectionC5081u) {
        this.f32999a = abstractServiceConnectionC5081u;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            C5207g.m11111f(message, "message");
            AbstractServiceConnectionC5081u abstractServiceConnectionC5081u = this.f32999a;
            abstractServiceConnectionC5081u.getClass();
            if (message.what == abstractServiceConnectionC5081u.f33006g) {
                Bundle data = message.getData();
                if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                    abstractServiceConnectionC5081u.m10799a(null);
                } else {
                    abstractServiceConnectionC5081u.m10799a(data);
                }
                try {
                    abstractServiceConnectionC5081u.f33000a.unbindService(abstractServiceConnectionC5081u);
                } catch (IllegalArgumentException unused) {
                }
            }
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }
}
