package p000;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import androidx.wear.ambient.AmbientMode;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class jgp extends jmx {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ jgw f33974a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgp(jgw jgwVar, Looper looper) {
        super(looper);
        this.f33974a = jgwVar;
    }

    /* JADX INFO: renamed from: b */
    private static final void m13146b(Message message) {
        jgq jgqVar = (jgq) message.obj;
        jgqVar.mo13143b();
        jgqVar.m13149f();
    }

    /* JADX INFO: renamed from: c */
    private static final boolean m13147c(Message message) {
        return message.what == 2 || message.what == 1 || message.what == 7;
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, jfe] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj;
        if (this.f33974a.f33998o.get() != message.arg1) {
            if (m13147c(message)) {
                m13146b(message);
                return;
            }
            return;
        }
        if ((message.what == 1 || message.what == 7 || message.what == 4 || message.what == 5) && !this.f33974a.m13163m()) {
            m13146b(message);
            return;
        }
        if (message.what == 4) {
            this.f33974a.f33995l = new jcu(message.arg2);
            jgw jgwVar = this.f33974a;
            if (!jgwVar.f33996m && !TextUtils.isEmpty(jgwVar.mo12835c()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(jgwVar.mo12835c());
                    jgw jgwVar2 = this.f33974a;
                    if (!jgwVar2.f33996m) {
                        jgwVar2.m13151K(3, null);
                        return;
                    }
                } catch (ClassNotFoundException e) {
                }
            }
            jcu jcuVar = this.f33974a.f33995l;
            if (jcuVar == null) {
                jcuVar = new jcu(8);
            }
            this.f33974a.f33990g.mo13037a(jcuVar);
            System.currentTimeMillis();
            return;
        }
        if (message.what == 5) {
            jcu jcuVar2 = this.f33974a.f33995l;
            if (jcuVar2 == null) {
                jcuVar2 = new jcu(8);
            }
            this.f33974a.f33990g.mo13037a(jcuVar2);
            System.currentTimeMillis();
            return;
        }
        if (message.what == 3) {
            this.f33974a.f33990g.mo13037a(new jcu(message.arg2, message.obj instanceof PendingIntent ? (PendingIntent) message.obj : null));
            System.currentTimeMillis();
            return;
        }
        if (message.what == 6) {
            this.f33974a.m13151K(5, null);
            AmbientMode.AmbientController ambientController = this.f33974a.f34001r;
            if (ambientController != null) {
                ambientController.f1697a.mo13014a(message.arg2);
            }
            jgw jgwVar3 = this.f33974a;
            int i = message.arg2;
            jgwVar3.mo13157G();
            this.f33974a.m13174z(5, 1, null);
            return;
        }
        if (message.what == 2 && !this.f33974a.m13162l()) {
            m13146b(message);
            return;
        }
        if (!m13147c(message)) {
            Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
            return;
        }
        jgq jgqVar = (jgq) message.obj;
        synchronized (jgqVar) {
            obj = jgqVar.f33975d;
            if (jgqVar.f33976e) {
                Log.w("GmsClient", "Callback proxy " + jgqVar.toString() + " being reused. This is not safe.");
            }
        }
        if (obj != null) {
            try {
                jgqVar.mo13145d();
            } catch (RuntimeException e2) {
                throw e2;
            }
        }
        synchronized (jgqVar) {
            jgqVar.f33976e = true;
        }
        jgqVar.m13149f();
    }
}
