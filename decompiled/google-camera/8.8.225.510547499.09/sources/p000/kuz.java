package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kuz extends iux implements ServiceConnection, kuv {

    /* JADX INFO: renamed from: a */
    public final Executor f37266a;

    /* JADX INFO: renamed from: b */
    public final Context f37267b;

    /* JADX INFO: renamed from: c */
    public final kuu f37268c;

    /* JADX INFO: renamed from: d */
    public int f37269d;

    /* JADX INFO: renamed from: e */
    public int f37270e;

    /* JADX INFO: renamed from: f */
    public ivk f37271f;

    /* JADX INFO: renamed from: g */
    public ivj f37272g;

    /* JADX INFO: renamed from: h */
    public int f37273h;

    /* JADX INFO: renamed from: i */
    public iuv f37274i;

    /* JADX INFO: renamed from: j */
    public iuw f37275j;

    /* JADX INFO: renamed from: k */
    private final Executor f37276k;

    /* JADX INFO: renamed from: l */
    private final kuq f37277l;

    public kuz(Context context, kuu kuuVar, kuq kuqVar) {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(kuw.f37260a);
        this.f37266a = new kuy(new Handler(Looper.getMainLooper()), 0);
        this.f37269d = 1;
        this.f37273h = 1;
        this.f37267b = context;
        this.f37268c = kuuVar;
        this.f37277l = kuqVar;
        this.f37276k = executorServiceNewSingleThreadExecutor;
    }

    /* JADX INFO: renamed from: n */
    private static boolean m14918n(int i) {
        return i == 6 || i == 7 || i == 8;
    }

    /* JADX INFO: renamed from: o */
    private static boolean m14919o(int i) {
        return i == 5;
    }

    @Override // p000.kuv
    /* JADX INFO: renamed from: a */
    public final int mo14912a() {
        lle.m15692l();
        lle.m15693m(m14924l(), "Attempted to use lensServiceSession before ready.");
        return this.f37270e;
    }

    @Override // p000.iuy
    /* JADX INFO: renamed from: b */
    public final void mo11801b(byte[] bArr, iva ivaVar) {
        this.f37266a.execute(new kha(this, bArr, ivaVar, 4));
    }

    @Override // p000.kuv
    /* JADX INFO: renamed from: c */
    public final void mo14913c(byte[] bArr, iva ivaVar) {
        lle.m15692l();
        lle.m15693m(mo14916f(), "Attempted to use lensServiceSession before ready.");
        iuw iuwVar = this.f37275j;
        lle.m15694n(iuwVar);
        Parcel parcelM3398a = iuwVar.m3398a();
        parcelM3398a.writeByteArray(bArr);
        cbs.m3404c(parcelM3398a, ivaVar);
        iuwVar.m3397A(2, parcelM3398a);
    }

    @Override // p000.kuv
    /* JADX INFO: renamed from: d */
    public final void mo14914d() {
        lle.m15692l();
        lle.m15693m(mo14916f(), "Attempted to handover when not ready.");
        nxn nxnVar = (nxn) ivc.f32254c.m18137O();
        if (!nxnVar.f44974b.m18142ac()) {
            nxnVar.mo18106p();
        }
        ivc ivcVar = (ivc) nxnVar.f44974b;
        ivcVar.f32257b = 99;
        ivcVar.f32256a |= 1;
        ktz ktzVar = ivm.f32292a;
        nxl nxlVarM18137O = ivn.f32293c.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        ivn ivnVar = (ivn) nxlVarM18137O.f44974b;
        ivnVar.f32295a |= 1;
        ivnVar.f32296b = true;
        nxnVar.m18119aJ(ktzVar, (ivn) nxlVarM18137O.mo18103l());
        ivc ivcVar2 = (ivc) nxnVar.mo18103l();
        try {
            iuw iuwVar = this.f37275j;
            lle.m15694n(iuwVar);
            iuwVar.m11800e(ivcVar2.mo17760J());
        } catch (RemoteException | SecurityException e) {
            Log.e("LensServiceConnImpl", "Unable to stop Lens service session.", e);
        }
        this.f37273h = 12;
        m14921i(8);
    }

    @Override // p000.kuv
    /* JADX INFO: renamed from: e */
    public final boolean mo14915e() {
        lle.m15692l();
        return m14918n(this.f37269d);
    }

    @Override // p000.kuv
    /* JADX INFO: renamed from: f */
    public final boolean mo14916f() {
        lle.m15692l();
        return m14919o(this.f37269d);
    }

    @Override // p000.kuv
    /* JADX INFO: renamed from: g */
    public final int mo14917g() {
        lle.m15692l();
        boolean z = true;
        if (!mo14916f() && !mo14915e()) {
            z = false;
        }
        lle.m15693m(z, "Attempted to use ServerFlags before ready or dead.");
        return this.f37273h;
    }

    /* JADX INFO: renamed from: h */
    public final void m14920h() {
        lle.m15692l();
        if (this.f37275j == null) {
            this.f37273h = 11;
            m14921i(7);
        } else {
            this.f37273h = 11;
            m14921i(8);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m14921i(int i) {
        lle.m15692l();
        String.format("Transitioning from state %s to %s.", Integer.valueOf(this.f37269d), Integer.valueOf(i));
        int i2 = this.f37269d;
        this.f37269d = i;
        if (m14919o(i) && !m14919o(i2)) {
            kuu kuuVar = this.f37268c;
            lle.m15692l();
            ((kut) kuuVar).m14907b();
        }
        if (!m14918n(i) || m14918n(i2)) {
            return;
        }
        kuu kuuVar2 = this.f37268c;
        lle.m15692l();
        ((kut) kuuVar2).m14907b();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m14922j() {
        return this.f37269d == 2;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m14923k() {
        int i = this.f37269d;
        return i == 3 || i == 4 || i == 5 || i == 7 || i == 8;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m14924l() {
        int i = this.f37269d;
        return i == 5 || i == 8;
    }

    /* JADX INFO: renamed from: m */
    public final void m14925m() {
        lle.m15692l();
        if (m14922j() || m14923k()) {
            return;
        }
        m14921i(2);
        this.f37277l.m14903a(new kuo() { // from class: kux
            @Override // p000.kuo
            /* JADX INFO: renamed from: a */
            public final void mo14900a(kvb kvbVar) {
                kuz kuzVar = this.f37263a;
                int i = kvbVar.f37314d;
                int iM15691k = lle.m15691k(i);
                if (iM15691k == 0 || iM15691k != 2) {
                    int iM15691k2 = lle.m15691k(i);
                    if (iM15691k2 == 0) {
                        iM15691k2 = 1;
                    }
                    kuzVar.f37273h = iM15691k2;
                    kuzVar.m14921i(6);
                    return;
                }
                Intent intent = new Intent("com.google.android.apps.gsa.publicsearch.IPublicSearchService");
                intent.setPackage("com.google.android.googlequicksearchbox");
                try {
                    if (kuzVar.f37267b.bindService(intent, kuzVar, 65)) {
                        kuzVar.m14921i(3);
                        return;
                    }
                    Log.e("LensServiceConnImpl", "Unable to bind Lens service.");
                    kuzVar.f37273h = 11;
                    kuzVar.m14921i(7);
                } catch (SecurityException e) {
                    Log.e("LensServiceConnImpl", "Unable to bind Lens service due to security exception.", e);
                    kuzVar.f37273h = 11;
                    kuzVar.m14921i(7);
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        iuv iuvVar;
        lle.m15692l();
        if (iBinder == null) {
            iuvVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.gsa.publicsearch.IPublicSearchService");
            iuvVar = iInterfaceQueryLocalInterface instanceof iuv ? (iuv) iInterfaceQueryLocalInterface : new iuv(iBinder);
        }
        this.f37274i = iuvVar;
        this.f37276k.execute(new kds(this, iuvVar, 12));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        lle.m15692l();
        this.f37273h = 11;
        m14921i(7);
    }
}
