package p176ib;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.session.C0166e;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import p455wb.HandlerC9898d;

/* JADX INFO: renamed from: ib.o0 */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC6285o0 extends HandlerC9898d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC6251a f36479a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC6285o0(AbstractC6251a abstractC6251a, Looper looper) {
        super(looper);
        this.f36479a = abstractC6251a;
    }

    /* JADX WARN: Code duplicated, block: B:156:0x020f  */
    /* JADX WARN: Code duplicated, block: B:173:0x0218 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0223 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        AbstractC6287p0 abstractC6287p0;
        Object obj;
        boolean z10 = false;
        if (this.f36479a.f36415W.get() != message.arg1) {
            int i10 = message.what;
            if (i10 == 2 || i10 == 1 || i10 == 7) {
                AbstractC6287p0 abstractC6287p1 = (AbstractC6287p0) message.obj;
                abstractC6287p1.mo12902b();
                synchronized (abstractC6287p1) {
                    abstractC6287p1.f36483a = null;
                }
                synchronized (abstractC6287p1.f36485c.f36404L) {
                    abstractC6287p1.f36485c.f36404L.remove(abstractC6287p1);
                }
                return;
            }
            return;
        }
        int i11 = message.what;
        if (i11 != 1 && i11 != 7) {
            if (i11 == 4) {
                this.f36479a.getClass();
            } else if (i11 == 5) {
            }
            if (!this.f36479a.m12880g()) {
                abstractC6287p0 = (AbstractC6287p0) message.obj;
                abstractC6287p0.mo12902b();
                synchronized (abstractC6287p0) {
                    abstractC6287p0.f36483a = null;
                    synchronized (abstractC6287p0.f36485c.f36404L) {
                        abstractC6287p0.f36485c.f36404L.remove(abstractC6287p0);
                        return;
                    }
                }
            }
        } else if (!this.f36479a.m12880g()) {
            abstractC6287p0 = (AbstractC6287p0) message.obj;
            abstractC6287p0.mo12902b();
            synchronized (abstractC6287p0) {
                try {
                    abstractC6287p0.f36483a = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            synchronized (abstractC6287p0.f36485c.f36404L) {
                abstractC6287p0.f36485c.f36404L.remove(abstractC6287p0);
            }
            return;
        }
        int i12 = message.what;
        if (i12 == 4) {
            this.f36479a.f36412T = new ConnectionResult(message.arg2);
            AbstractC6251a abstractC6251a = this.f36479a;
            if (!abstractC6251a.f36413U && !TextUtils.isEmpty(abstractC6251a.mo5606D()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(abstractC6251a.mo5606D());
                    z10 = true;
                } catch (ClassNotFoundException unused) {
                }
            }
            if (z10) {
                AbstractC6251a abstractC6251a2 = this.f36479a;
                if (!abstractC6251a2.f36413U) {
                    abstractC6251a2.m12874I(3, null);
                    return;
                }
            }
            ConnectionResult connectionResult = this.f36479a.f36412T;
            if (connectionResult == null) {
                connectionResult = new ConnectionResult(8);
            }
            this.f36479a.f36402J.mo12467a(connectionResult);
            this.f36479a.m12873G(connectionResult);
            return;
        }
        if (i12 == 5) {
            ConnectionResult connectionResult2 = this.f36479a.f36412T;
            if (connectionResult2 == null) {
                connectionResult2 = new ConnectionResult(8);
            }
            this.f36479a.f36402J.mo12467a(connectionResult2);
            this.f36479a.m12873G(connectionResult2);
            return;
        }
        if (i12 == 3) {
            Object obj2 = message.obj;
            ConnectionResult connectionResult3 = new ConnectionResult(message.arg2, obj2 instanceof PendingIntent ? (PendingIntent) obj2 : null);
            this.f36479a.f36402J.mo12467a(connectionResult3);
            this.f36479a.m12873G(connectionResult3);
            return;
        }
        if (i12 == 6) {
            this.f36479a.m12874I(5, null);
            AbstractC6251a.a aVar = this.f36479a.f36407O;
            if (aVar != null) {
                aVar.mo5742h(message.arg2);
            }
            AbstractC6251a abstractC6251a3 = this.f36479a;
            abstractC6251a3.f36416a = message.arg2;
            abstractC6251a3.f36417b = System.currentTimeMillis();
            AbstractC6251a.m12869H(this.f36479a, 5, 1, null);
            return;
        }
        if (i12 == 2 && !this.f36479a.m12875a()) {
            AbstractC6287p0 abstractC6287p2 = (AbstractC6287p0) message.obj;
            abstractC6287p2.mo12902b();
            synchronized (abstractC6287p2) {
                try {
                    abstractC6287p2.f36483a = null;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            synchronized (abstractC6287p2.f36485c.f36404L) {
                abstractC6287p2.f36485c.f36404L.remove(abstractC6287p2);
            }
            return;
        }
        int i13 = message.what;
        if (!(i13 == 2 || i13 == 1 || i13 == 7)) {
            Log.wtf("GmsClient", C0166e.m761g("Don't know how to handle message: ", i13), new Exception());
            return;
        }
        AbstractC6287p0 abstractC6287p3 = (AbstractC6287p0) message.obj;
        synchronized (abstractC6287p3) {
            try {
                obj = abstractC6287p3.f36483a;
                if (abstractC6287p3.f36484b) {
                    Log.w("GmsClient", "Callback proxy " + abstractC6287p3.toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (obj != null) {
            abstractC6287p3.mo12901a();
        }
        synchronized (abstractC6287p3) {
            abstractC6287p3.f36484b = true;
        }
        synchronized (abstractC6287p3) {
            abstractC6287p3.f36483a = null;
        }
        synchronized (abstractC6287p3.f36485c.f36404L) {
            abstractC6287p3.f36485c.f36404L.remove(abstractC6287p3);
        }
    }
}
