package p000;

import android.hardware.HardwareBuffer;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hcu implements kba {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f27275a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f27276b;

    public /* synthetic */ hcu(HardwareBuffer hardwareBuffer, int i) {
        this.f27276b = i;
        this.f27275a = hardwareBuffer;
    }

    public /* synthetic */ hcu(hfu hfuVar, int i) {
        this.f27276b = i;
        this.f27275a = hfuVar;
    }

    public /* synthetic */ hcu(hqk hqkVar, int i) {
        this.f27276b = i;
        this.f27275a = hqkVar;
    }

    public /* synthetic */ hcu(htb htbVar, int i, byte[] bArr) {
        this.f27276b = i;
        this.f27275a = htbVar;
    }

    public hcu(hty htyVar, int i) {
        this.f27276b = i;
        this.f27275a = htyVar;
    }

    public /* synthetic */ hcu(hue hueVar, int i) {
        this.f27276b = i;
        this.f27275a = hueVar;
    }

    public /* synthetic */ hcu(hwy hwyVar, int i) {
        this.f27276b = i;
        this.f27275a = hwyVar;
    }

    public /* synthetic */ hcu(hxk hxkVar, int i) {
        this.f27276b = i;
        this.f27275a = hxkVar;
    }

    public /* synthetic */ hcu(hxp hxpVar, int i) {
        this.f27276b = i;
        this.f27275a = hxpVar;
    }

    public /* synthetic */ hcu(icr icrVar, int i) {
        this.f27276b = i;
        this.f27275a = icrVar;
    }

    public /* synthetic */ hcu(igb igbVar, int i) {
        this.f27276b = i;
        this.f27275a = igbVar;
    }

    public /* synthetic */ hcu(ige igeVar, int i) {
        this.f27276b = i;
        this.f27275a = igeVar;
    }

    public /* synthetic */ hcu(ipg ipgVar, int i) {
        this.f27276b = i;
        this.f27275a = ipgVar;
    }

    public /* synthetic */ hcu(ite iteVar, int i) {
        this.f27276b = i;
        this.f27275a = iteVar;
    }

    public /* synthetic */ hcu(Future future, int i) {
        this.f27276b = i;
        this.f27275a = future;
    }

    public hcu(jfs jfsVar, int i, byte[] bArr, byte[] bArr2) {
        this.f27276b = i;
        this.f27275a = jfsVar;
        ((AtomicInteger) jfsVar.f33914a).incrementAndGet();
    }

    public /* synthetic */ hcu(jww jwwVar, int i) {
        this.f27276b = i;
        this.f27275a = jwwVar;
    }

    public /* synthetic */ hcu(kcc kccVar, int i) {
        this.f27276b = i;
        this.f27275a = kccVar;
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v36, types: [igb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, kcc] */
    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        switch (this.f27276b) {
            case 0:
                htb htbVar = (htb) this.f27275a;
                htbVar.m10730h(mqu.f41450a);
                htbVar.m10729g(mqu.f41450a);
                break;
            case 1:
                this.f27275a.cancel(false);
                break;
            case 2:
                hfu hfuVar = (hfu) this.f27275a;
                hfuVar.f27591g.mo3731d(hfuVar.f27589e);
                hfuVar.f27592h.m9973h(hfuVar.f27589e);
                hfuVar.f27589e.m10194b();
                break;
            case 3:
                hqk hqkVar = (hqk) this.f27275a;
                hqkVar.f29080c.removeListener(hqkVar.f29103z);
                break;
            case 4:
                hqk hqkVar2 = (hqk) this.f27275a;
                hqkVar2.f29094q.m7598b(hqkVar2.f29055C);
                break;
            case 5:
                hua huaVar = ((hty) this.f27275a).f29554a;
                huaVar.f29559a.execute(new hps(huaVar, 20));
                break;
            case 6:
                ((dpx) ((hue) this.f27275a).f29570b.f29576g.get()).m6561c();
                break;
            case 7:
                this.f27275a.mo3415bf("torch");
                break;
            case 8:
                ((hwy) this.f27275a).f29764b = null;
                break;
            case 9:
                ((hwy) this.f27275a).f29763a = null;
                break;
            case 10:
                ((hxk) this.f27275a).f29806d.f7206g = null;
                break;
            case 11:
                ((hxp) this.f27275a).m10837d(true);
                break;
            case 12:
                ((icr) this.f27275a).mo11090p(true);
                break;
            case 13:
                ((icr) this.f27275a).m11091q(1);
                break;
            case 14:
                this.f27275a.mo11197E(false);
                break;
            case 15:
                ((ige) this.f27275a).m11259an(true, false, true);
                break;
            case 16:
                ((AtomicInteger) ((jfs) this.f27275a).f33914a).decrementAndGet();
                break;
            case 17:
                ((HardwareBuffer) this.f27275a).close();
                break;
            case 18:
                this.f27275a.mo13952a();
                break;
            case 19:
                ipg ipgVar = (ipg) this.f27275a;
                if (!ipgVar.m11589i()) {
                    ipgVar.f31702f.mo14894e(Boolean.TRUE);
                    break;
                }
                break;
            default:
                ((ite) this.f27275a).mo11763n();
                break;
        }
    }
}
