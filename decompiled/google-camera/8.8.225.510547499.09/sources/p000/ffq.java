package p000;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ffq implements ffr {

    /* JADX INFO: renamed from: a */
    public static final nbh f21721a = nbh.m17259h("com/google/android/apps/camera/microvideo/MicrovideoAppController");

    /* JADX INFO: renamed from: b */
    public final List f21722b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final List f21723c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final Object f21724d = new Object();

    /* JADX INFO: renamed from: e */
    public volatile int f21725e = 1;

    /* JADX INFO: renamed from: f */
    private final jww f21726f;

    /* JADX INFO: renamed from: g */
    private final dhv f21727g;

    /* JADX INFO: renamed from: h */
    private final hmw f21728h;

    /* JADX INFO: renamed from: i */
    private final eby f21729i;

    /* JADX INFO: renamed from: j */
    private final hah f21730j;

    /* JADX INFO: renamed from: k */
    private volatile fgk f21731k;

    /* JADX INFO: renamed from: l */
    private final msa f21732l;

    /* JADX INFO: renamed from: m */
    private final jwl f21733m;

    public ffq(jww jwwVar, jwl jwlVar, hmw hmwVar, msa msaVar, dhv dhvVar, eby ebyVar, hah hahVar, byte[] bArr, byte[] bArr2) {
        this.f21726f = jwwVar;
        this.f21733m = jwlVar;
        this.f21728h = hmwVar;
        this.f21732l = msaVar;
        this.f21727g = dhvVar;
        this.f21729i = ebyVar;
        this.f21730j = hahVar;
    }

    @Override // p000.fgu
    /* JADX INFO: renamed from: a */
    public final nkm mo8357a() {
        int i;
        glk glkVarM8367k = m8367k();
        if (glkVarM8367k == null) {
            return null;
        }
        nxl nxlVarM18137O = nkm.f43229n.m18137O();
        switch (jeu.m12986j(((Integer) this.f21730j.mo10031c(gzy.f27040ax)).intValue()) - 1) {
            case 0:
                i = 2;
                break;
            case 1:
                i = 3;
                break;
            default:
                i = 4;
                break;
        }
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nkm nkmVar = (nkm) nxlVarM18137O.f44974b;
        nkmVar.f43238h = i - 1;
        nkmVar.f43231a |= 64;
        int i2 = true == ((flc) glkVarM8367k.f25501b).m8543c() ? 5 : 3;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nkm nkmVar2 = (nkm) nxlVarM18137O.f44974b;
        nkmVar2.f43242l = i2 - 1;
        nkmVar2.f43231a |= 512;
        return (nkm) nxlVarM18137O.mo18103l();
    }

    @Override // p000.ffr
    /* JADX INFO: renamed from: b */
    public final void mo8358b() {
        boolean z;
        fdo fdoVar = new fdo(this, 14);
        synchronized (this.f21724d) {
            if (this.f21722b.isEmpty()) {
                this.f21723c.add(fdoVar);
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            return;
        }
        fdoVar.run();
    }

    @Override // p000.ffr
    /* JADX INFO: renamed from: c */
    public final void mo8359c() {
    }

    @Override // p000.fgu
    /* JADX INFO: renamed from: d */
    public final void mo8360d() {
        SystemClock.elapsedRealtime();
        dhv dhvVar = this.f21727g;
        dhx dhxVar = dii.f11525a;
        dhvVar.mo6177e();
        this.f21733m.m13629e();
    }

    @Override // p000.fgu
    /* JADX INFO: renamed from: e */
    public final void mo8361e() {
        dhv dhvVar = this.f21727g;
        dhx dhxVar = dii.f11525a;
        dhvVar.mo6177e();
    }

    @Override // p000.ffr
    /* JADX INFO: renamed from: f */
    public final void mo8362f(boolean z) {
        glk glkVarM8367k = m8367k();
        if (glkVarM8367k != null) {
            ((fie) glkVarM8367k.f25500a).m8458a(z);
        }
        if (z) {
            this.f21733m.m13629e();
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0031 A[Catch: all -> 0x007c, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0008, B:10:0x000e, B:12:0x001e, B:14:0x0026, B:19:0x0031, B:21:0x003f, B:23:0x0051, B:25:0x0063, B:27:0x0073), top: B:37:0x0001 }] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, jwn] */
    /* JADX INFO: renamed from: g */
    public final synchronized boolean m8363g() {
        fgk fgkVar = this.f21731k;
        if (fgkVar == null) {
            return false;
        }
        glk glkVarM8367k = m8367k();
        if (glkVarM8367k != null) {
            fxg fxgVar = (fxg) glkVarM8367k.f25503d.mo3831be();
            if (!fxgVar.equals(fxg.NORMAL_WITH_FLASH) && !fxgVar.equals(fxg.HDR_PLUS_WITH_TORCH) && !fxgVar.equals(fxg.HDR_PLUS)) {
                if (!((Boolean) this.f21726f.mo3831be()).booleanValue() && !((Boolean) this.f21728h.m10476a().mo3831be()).booleanValue() && !((Boolean) this.f21732l.m16852g().mo3831be()).booleanValue() && !((Boolean) this.f21729i.f13316b.mo3831be()).booleanValue() && fgkVar.m8391d()) {
                    return true;
                }
            }
        } else if (!((Boolean) this.f21726f.mo3831be()).booleanValue()) {
            return true;
        }
        return false;
    }

    @Override // p000.ffr
    /* JADX INFO: renamed from: h */
    public final void mo8364h(int i) {
        this.f21725e = i;
    }

    @Override // p000.ffr
    /* JADX INFO: renamed from: i */
    public final synchronized void mo8365i(fgk fgkVar) {
        if (this.f21731k == null) {
            this.f21731k = fgkVar;
        } else {
            ((nbe) ((nbe) f21721a.m17252c()).mo17276G((char) 2176)).mo17290o("Cannot attach UI controller when already attached!");
        }
    }

    @Override // p000.ffr
    /* JADX INFO: renamed from: j */
    public final synchronized void mo8366j(fgk fgkVar) {
        if (this.f21731k == fgkVar) {
            this.f21731k = null;
        } else {
            ((nbe) ((nbe) f21721a.m17252c()).mo17276G((char) 2178)).mo17290o("Cannot detach UI controller. Values mismatch.");
        }
    }

    /* JADX INFO: renamed from: k */
    public final glk m8367k() {
        synchronized (this.f21724d) {
            if (this.f21722b.isEmpty()) {
                return null;
            }
            return (glk) mkv.m16515W(this.f21722b);
        }
    }
}
