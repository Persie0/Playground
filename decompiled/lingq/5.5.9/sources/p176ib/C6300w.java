package p176ib;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.AbstractC2544c;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p290o6.C7967l0;
import p412ub.HandlerC9517f;

/* JADX INFO: renamed from: ib.w */
/* JADX INFO: loaded from: classes.dex */
public final class C6300w implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    @NotOnlyInitialized
    public final InterfaceC6298v f36500a;

    /* JADX INFO: renamed from: h */
    public final HandlerC9517f f36507h;

    /* JADX INFO: renamed from: b */
    public final ArrayList<AbstractC2544c.a> f36501b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public final ArrayList<AbstractC2544c.a> f36502c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public final ArrayList<AbstractC2544c.b> f36503d = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    public volatile boolean f36504e = false;

    /* JADX INFO: renamed from: f */
    public final AtomicInteger f36505f = new AtomicInteger(0);

    /* JADX INFO: renamed from: g */
    public boolean f36506g = false;

    /* JADX INFO: renamed from: i */
    public final Object f36508i = new Object();

    public C6300w(Looper looper, C7967l0 c7967l0) {
        this.f36500a = c7967l0;
        this.f36507h = new HandlerC9517f(looper, this);
    }

    /* JADX INFO: renamed from: a */
    public final void m12930a(AbstractC2544c.b bVar) {
        C6272i.m12915i(bVar);
        synchronized (this.f36508i) {
            if (this.f36503d.contains(bVar)) {
                String strValueOf = String.valueOf(bVar);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 67);
                sb2.append("registerConnectionFailedListener(): listener ");
                sb2.append(strValueOf);
                sb2.append(" is already registered");
                Log.w("GmsClientEvents", sb2.toString());
            } else {
                this.f36503d.add(bVar);
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            StringBuilder sb2 = new StringBuilder(45);
            sb2.append("Don't know how to handle message: ");
            sb2.append(i10);
            Log.wtf("GmsClientEvents", sb2.toString(), new Exception());
            return false;
        }
        AbstractC2544c.a aVar = (AbstractC2544c.a) message.obj;
        synchronized (this.f36508i) {
            if (this.f36504e && this.f36500a.mo12929a() && this.f36501b.contains(aVar)) {
                aVar.mo12397b1(null);
            }
        }
        return true;
    }
}
