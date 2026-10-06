package p000;

import android.media.AudioManager;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hpg {

    /* JADX INFO: renamed from: a */
    public static final nbh f28767a = nbh.m17259h("com/google/android/apps/camera/timelapse/TimelapseFrameServer");

    /* JADX INFO: renamed from: A */
    public final jwn f28768A;

    /* JADX INFO: renamed from: D */
    public ScheduledFuture f28771D;

    /* JADX INFO: renamed from: E */
    public gyv f28772E;

    /* JADX INFO: renamed from: F */
    public jxe f28773F;

    /* JADX INFO: renamed from: G */
    public kmg f28774G;

    /* JADX INFO: renamed from: H */
    public kmg f28775H;

    /* JADX INFO: renamed from: I */
    public kmd f28776I;

    /* JADX INFO: renamed from: L */
    public gaf f28779L;

    /* JADX INFO: renamed from: M */
    public kmq f28780M;

    /* JADX INFO: renamed from: N */
    public kfc f28781N;

    /* JADX INFO: renamed from: O */
    public jvb f28782O;

    /* JADX INFO: renamed from: P */
    public geg f28783P;

    /* JADX INFO: renamed from: R */
    public kgg f28785R;

    /* JADX INFO: renamed from: S */
    public final inm f28786S;

    /* JADX INFO: renamed from: T */
    public ctp f28787T;

    /* JADX INFO: renamed from: U */
    public ctp f28788U;

    /* JADX INFO: renamed from: V */
    public kgg f28789V;

    /* JADX INFO: renamed from: W */
    public hqo f28790W;

    /* JADX INFO: renamed from: X */
    public hqm f28791X;

    /* JADX INFO: renamed from: Y */
    public hqq f28792Y;

    /* JADX INFO: renamed from: Z */
    public int f28793Z;

    /* JADX INFO: renamed from: aa */
    public kfb f28794aa;

    /* JADX INFO: renamed from: ab */
    public kfk f28795ab;

    /* JADX INFO: renamed from: ac */
    public final khy f28796ac;

    /* JADX INFO: renamed from: ad */
    public kho f28797ad;

    /* JADX INFO: renamed from: ae */
    public kho f28798ae;

    /* JADX INFO: renamed from: af */
    public jxj f28799af;

    /* JADX INFO: renamed from: ag */
    public hpl f28800ag;

    /* JADX INFO: renamed from: ah */
    public final drj f28801ah;

    /* JADX INFO: renamed from: aj */
    public final jzn f28803aj;

    /* JADX INFO: renamed from: ak */
    public final fws f28804ak;

    /* JADX INFO: renamed from: al */
    public final jzn f28805al;

    /* JADX INFO: renamed from: am */
    public final djm f28806am;

    /* JADX INFO: renamed from: an */
    public final cvy f28807an;

    /* JADX INFO: renamed from: ao */
    private kfc f28808ao;

    /* JADX INFO: renamed from: b */
    public final kpa f28809b;

    /* JADX INFO: renamed from: c */
    public final AudioManager f28810c;

    /* JADX INFO: renamed from: d */
    public final dhv f28811d;

    /* JADX INFO: renamed from: f */
    public final jxh f28813f;

    /* JADX INFO: renamed from: g */
    public final dbr f28814g;

    /* JADX INFO: renamed from: h */
    public final kme f28815h;

    /* JADX INFO: renamed from: i */
    public final Executor f28816i;

    /* JADX INFO: renamed from: j */
    public final hoj f28817j;

    /* JADX INFO: renamed from: k */
    public final fca f28818k;

    /* JADX INFO: renamed from: l */
    public final jvd f28819l;

    /* JADX INFO: renamed from: n */
    public final ggm f28821n;

    /* JADX INFO: renamed from: o */
    public final jww f28822o;

    /* JADX INFO: renamed from: p */
    public final float f28823p;

    /* JADX INFO: renamed from: q */
    public final jwn f28824q;

    /* JADX INFO: renamed from: r */
    public final ccs f28825r;

    /* JADX INFO: renamed from: s */
    public final cgb f28826s;

    /* JADX INFO: renamed from: t */
    public final hot f28827t;

    /* JADX INFO: renamed from: u */
    public final hpa f28828u;

    /* JADX INFO: renamed from: v */
    public final kbz f28829v;

    /* JADX INFO: renamed from: w */
    public final iuj f28830w;

    /* JADX INFO: renamed from: x */
    public final boolean f28831x;

    /* JADX INFO: renamed from: y */
    public final dlw f28832y;

    /* JADX INFO: renamed from: z */
    public final ScheduledExecutorService f28833z;

    /* JADX INFO: renamed from: m */
    public final Object f28820m = new Object();

    /* JADX INFO: renamed from: ai */
    public final kfv f28802ai = new hpc(this);

    /* JADX INFO: renamed from: B */
    public final ArrayList f28769B = new ArrayList();

    /* JADX INFO: renamed from: C */
    public final List f28770C = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: Q */
    public mrm f28784Q = mqu.f41450a;

    /* JADX INFO: renamed from: e */
    public final jwf f28812e = new jwf(false);

    /* JADX INFO: renamed from: J */
    public jxn f28777J = jxn.FPS_30;

    /* JADX INFO: renamed from: K */
    public jxp f28778K = jxp.RES_1080P;

    public hpg(kpa kpaVar, AudioManager audioManager, dhv dhvVar, fws fwsVar, jxh jxhVar, jzn jznVar, dbr dbrVar, kme kmeVar, Executor executor, hoj hojVar, fca fcaVar, jvd jvdVar, ggm ggmVar, jzn jznVar2, khy khyVar, float f, jwn jwnVar, ccs ccsVar, cgb cgbVar, hot hotVar, hpa hpaVar, kbz kbzVar, djm djmVar, cvy cvyVar, drj drjVar, iuj iujVar, boolean z, dlw dlwVar, ScheduledExecutorService scheduledExecutorService, inm inmVar, jww jwwVar, jwn jwnVar2, hqo hqoVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f28809b = kpaVar;
        this.f28810c = audioManager;
        this.f28811d = dhvVar;
        this.f28813f = jxhVar;
        this.f28804ak = fwsVar;
        this.f28803aj = jznVar;
        this.f28814g = dbrVar;
        this.f28815h = kmeVar;
        this.f28823p = f;
        this.f28817j = hojVar;
        this.f28831x = z;
        this.f28818k = fcaVar;
        this.f28819l = jvdVar;
        this.f28821n = ggmVar;
        this.f28805al = jznVar2;
        this.f28796ac = khyVar;
        this.f28825r = ccsVar;
        this.f28826s = cgbVar;
        this.f28827t = hotVar;
        this.f28816i = executor;
        this.f28828u = hpaVar;
        this.f28829v = kbzVar;
        this.f28806am = djmVar;
        this.f28807an = cvyVar;
        this.f28801ah = drjVar;
        this.f28824q = jwnVar;
        this.f28830w = iujVar;
        this.f28832y = dlwVar;
        this.f28833z = scheduledExecutorService;
        this.f28786S = inmVar;
        this.f28822o = jwwVar;
        this.f28768A = jwnVar2;
        this.f28790W = hqoVar;
    }

    /* JADX INFO: renamed from: a */
    public final int m10574a(kay kayVar, inm inmVar, kmq kmqVar, dhv dhvVar) {
        return cem.m3563a(dhvVar.mo6184l(dib.f11315bV) ? ((Integer) this.f28822o.mo3831be()).intValue() : this.f28793Z, kayVar.f35503e, inmVar, kmqVar.equals(kmq.f36557a), dhvVar);
    }

    /* JADX INFO: renamed from: b */
    final kbc m10575b(jxp jxpVar) {
        kbc kbcVarM13661b;
        if (!((Boolean) this.f28768A.mo3831be()).booleanValue()) {
            hnp hnpVar = hnp.OFF;
            jxp jxpVar2 = jxp.RES_UNKNOWN;
            switch (jxpVar.ordinal()) {
                case 6:
                    kbcVarM13661b = jxp.RES_720P.m13661b();
                    break;
                case 7:
                    kbcVarM13661b = jxp.RES_720P_3X4.m13661b();
                    break;
                case 8:
                case 10:
                default:
                    kbcVarM13661b = jxp.RES_1080P.m13661b();
                    break;
                case 9:
                    kbcVarM13661b = jxp.RES_1080P_3X4.m13661b();
                    break;
                case 11:
                    kbcVarM13661b = jxp.RES_2160P_3X4.m13661b();
                    break;
            }
        } else {
            kbcVarM13661b = kan.m13873j(jxpVar.m13661b()).m13883m(kan.f35488c) ? jxp.RES_720P_3X4.m13661b() : jxp.RES_720P.m13661b();
        }
        kmd kmdVar = this.f28776I;
        kmdVar.getClass();
        List listMo14572y = kmdVar.mo14572y();
        lku.m15610E(listMo14572y.contains(kbcVarM13661b), "Unable to find suitable viewfinder size %s from supported list: %s", kbcVarM13661b, listMo14572y);
        return kbcVarM13661b;
    }

    /* JADX INFO: renamed from: c */
    public final void m10576c() {
        gyv gyvVarM10003a = gyv.m10003a(gyu.m10002a(), System.currentTimeMillis(), dlt.m6367a(gyw.TIMELAPSE, System.currentTimeMillis()), gyw.TIMELAPSE);
        this.f28772E = gyvVarM10003a;
        this.f28770C.add(gyvVarM10003a);
        this.f28832y.mo6362j(this.f28772E);
    }

    /* JADX INFO: renamed from: d */
    public final void m10577d() {
        kfk kfkVar = this.f28795ab;
        if (kfkVar == null) {
            return;
        }
        kho khoVar = this.f28798ae;
        khoVar.getClass();
        synchronized (this.f28820m) {
            this.f28808ao = kfkVar.mo14131r(khoVar, 1);
            jvb jvbVar = this.f28782O;
            jvbVar.getClass();
            kfc kfcVar = this.f28808ao;
            kfcVar.getClass();
            jvbVar.m13537d(kfcVar);
        }
        dtb dtbVar = new dtb(this, 6);
        synchronized (this.f28820m) {
            kfc kfcVar2 = this.f28808ao;
            lku.m15662p(kfcVar2);
            kfcVar2.mo9411k(dtbVar);
        }
    }

    /* JADX INFO: renamed from: e */
    final void m10578e() {
        this.f28812e.mo3415bf(false);
        jvb jvbVar = this.f28782O;
        if (jvbVar != null) {
            jvbVar.close();
            this.f28782O = null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m10579f() {
        synchronized (this.f28820m) {
            kfc kfcVar = this.f28808ao;
            if (kfcVar != null) {
                kfcVar.close();
                this.f28808ao = null;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m10580g() {
        kfk kfkVar = this.f28795ab;
        if (kfkVar != null) {
            kfkVar.mo14120g();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m10581h() {
        hot hotVar = this.f28827t;
        if (hotVar.f28667n.mo14539H()) {
            hotVar.f28658e.mo6468d();
        }
        hotVar.f28654a.set(false);
        hotVar.f28655b.set(false);
        hotVar.f28656c.set(false);
        hotVar.f28675v.m6626f();
        this.f28830w.mo11734O(mqu.f41450a, false);
        if (this.f28784Q.mo16813g()) {
            ((Surface) this.f28784Q.mo16809c()).release();
        }
        m10578e();
        ctp ctpVar = this.f28787T;
        if (ctpVar != null) {
            ctpVar.close();
            this.f28787T = null;
        }
        if (this.f28811d.mo6184l(diy.f11747d)) {
            return;
        }
        this.f28817j.m10539e();
    }
}
