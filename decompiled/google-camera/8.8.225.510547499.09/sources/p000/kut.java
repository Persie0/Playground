package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.lens.sdk.PendingIntentConsumer;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kut implements kuu {

    /* JADX INFO: renamed from: a */
    public final kuv f37257a;

    /* JADX INFO: renamed from: b */
    public PendingIntentConsumer f37258b;

    /* JADX INFO: renamed from: c */
    private final Queue f37259c = new ArrayDeque();

    public kut(Context context, kuq kuqVar) {
        this.f37257a = new kuz(context, this, kuqVar);
    }

    /* JADX INFO: renamed from: g */
    private final boolean m14905g() {
        ivk ivkVarM14906a = m14906a();
        return (ivkVarM14906a.f32280a & 2) != 0 && this.f37257a.mo14912a() >= ivkVarM14906a.f32282c;
    }

    /* JADX INFO: renamed from: a */
    public final ivk m14906a() {
        lle.m15692l();
        lle.m15693m(this.f37257a.mo14916f(), "getServerFlags() called before ready.");
        if (!this.f37257a.mo14916f()) {
            return ivk.f32278f;
        }
        kuv kuvVar = this.f37257a;
        lle.m15692l();
        kuz kuzVar = (kuz) kuvVar;
        lle.m15693m(kuzVar.m14924l(), "Attempted to use ServerFlags before ready.");
        return kuzVar.f37271f;
    }

    /* JADX INFO: renamed from: b */
    public final void m14907b() {
        while (this.f37259c.peek() != null) {
            ((kus) this.f37259c.remove()).mo14904a(this.f37257a.mo14917g());
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m14908c(Bundle bundle) {
        lle.m15692l();
        if (!this.f37257a.mo14916f()) {
            return false;
        }
        nxn nxnVar = (nxn) ivc.f32254c.m18137O();
        if (!nxnVar.f44974b.m18142ac()) {
            nxnVar.mo18106p();
        }
        ivc ivcVar = (ivc) nxnVar.f44974b;
        ivcVar.f32257b = 341;
        ivcVar.f32256a |= 1;
        try {
            this.f37257a.mo14913c(((ivc) nxnVar.mo18103l()).mo17760J(), new iva(bundle));
            return true;
        } catch (RemoteException | SecurityException e) {
            Log.e("LensServiceBridge", "Failed to inject image.", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m14909d(kus kusVar) {
        lle.m15692l();
        if (this.f37257a.mo14916f() || this.f37257a.mo14915e()) {
            kusVar.mo14904a(this.f37257a.mo14917g());
            return;
        }
        this.f37259c.add(kusVar);
        kuz kuzVar = (kuz) this.f37257a;
        if (kuzVar.m14922j() || kuzVar.m14923k()) {
            return;
        }
        kuzVar.m14925m();
    }

    /* JADX INFO: renamed from: e */
    public final int m14910e() {
        lle.m15692l();
        if (this.f37257a.mo14916f()) {
            return m14905g() ? 2 : 13;
        }
        return this.f37257a.mo14917g();
    }

    /* JADX INFO: renamed from: f */
    public final int m14911f() {
        lle.m15692l();
        if (!this.f37257a.mo14916f()) {
            return this.f37257a.mo14917g();
        }
        if (!m14905g()) {
            return 13;
        }
        ivk ivkVarM14906a = m14906a();
        return ((ivkVarM14906a.f32280a & 8) == 0 || this.f37257a.mo14912a() < ivkVarM14906a.f32284e) ? 13 : 2;
    }
}
