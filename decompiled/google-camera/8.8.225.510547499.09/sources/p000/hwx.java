package p000;

import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.libraries.performance.primes.transmitter.clearcut.Hbk.BcwGDRhrTsnlj;
import java.util.HashSet;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hwx implements hxc {

    /* JADX INFO: renamed from: a */
    public static final nbh f29742a = nbh.m17259h(BcwGDRhrTsnlj.ufedQQsFIXle);

    /* JADX INFO: renamed from: b */
    public final AccessibilityManager f29743b;

    /* JADX INFO: renamed from: c */
    public final dbr f29744c;

    /* JADX INFO: renamed from: d */
    public final dpx f29745d;

    /* JADX INFO: renamed from: e */
    public final dhv f29746e;

    /* JADX INFO: renamed from: f */
    public final jwn f29747f;

    /* JADX INFO: renamed from: g */
    public final jww f29748g;

    /* JADX INFO: renamed from: h */
    public final mrm f29749h;

    /* JADX INFO: renamed from: i */
    public final hnv f29750i;

    /* JADX INFO: renamed from: j */
    public final hnw f29751j;

    /* JADX INFO: renamed from: k */
    public final ges f29752k;

    /* JADX INFO: renamed from: l */
    public hxd f29753l;

    /* JADX INFO: renamed from: m */
    public mrm f29754m = mqu.f41450a;

    /* JADX INFO: renamed from: n */
    public hxa f29755n;

    /* JADX INFO: renamed from: o */
    public kfo f29756o;

    /* JADX INFO: renamed from: p */
    public final gtd f29757p;

    /* JADX INFO: renamed from: q */
    private final chj f29758q;

    /* JADX INFO: renamed from: r */
    private final dox f29759r;

    /* JADX INFO: renamed from: s */
    private final Handler f29760s;

    /* JADX INFO: renamed from: t */
    private final jwn f29761t;

    /* JADX INFO: renamed from: u */
    private final Context f29762u;

    public hwx(chk chkVar, cdu cduVar, dbr dbrVar, dox doxVar, dhv dhvVar, View view, gtd gtdVar, hah hahVar, jvd jvdVar, jww jwwVar, jwn jwnVar, dpx dpxVar, Context context, mrm mrmVar, hnv hnvVar, hnw hnwVar, ges gesVar, byte[] bArr, byte[] bArr2) {
        this.f29758q = chkVar;
        this.f29744c = dbrVar;
        this.f29746e = dhvVar;
        this.f29760s = jvh.m13558f(cduVar.m3529i(), "CountdownHandler");
        this.f29757p = gtdVar;
        this.f29761t = hahVar.mo10029a(gzy.f27060s);
        this.f29759r = doxVar;
        this.f29748g = jwwVar;
        this.f29747f = jwnVar;
        this.f29745d = dpxVar;
        this.f29762u = context;
        this.f29749h = mrmVar;
        this.f29750i = hnvVar;
        this.f29751j = hnwVar;
        this.f29752k = gesVar;
        Object systemService = view.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.f29743b = (AccessibilityManager) systemService;
        jvdVar.m13541c(new hri(this, view, 6));
    }

    /* JADX INFO: renamed from: a */
    public final void m10788a() {
        if (this.f29749h.mo16813g()) {
            ((clc) this.f29749h.mo16809c()).mo3873d();
        }
        this.f29753l.m10801a();
        this.f29745d.m6561c();
        this.f29760s.removeCallbacksAndMessages(null);
        m10789b(false, this.f29756o, true, true);
        this.f29752k.m9147e();
    }

    /* JADX INFO: renamed from: b */
    public final void m10789b(boolean z, kfo kfoVar, boolean z2, boolean z3) {
        if (!gtd.m9733e() || this.f29744c.m5901j() || !this.f29754m.mo16813g() || this.f29756o == null || !this.f29746e.mo6184l(dib.f11304bK) || !((Boolean) this.f29748g.mo3831be()).booleanValue() || ((Boolean) this.f29747f.mo3831be()).booleanValue() || this.f29751j.mo10518e().m10520a(this.f29750i)) {
            ((nbe) ((nbe) f29742a.m17251b()).mo17276G((char) 4011)).mo17290o("Unsupported to set torch on for countdown request");
            return;
        }
        try {
            kfj kfjVarMo14153b = kfoVar.mo14153b();
            HashSet hashSet = new HashSet();
            CaptureRequest.Key key = ivv.f32394c;
            Boolean boolValueOf = Boolean.valueOf(z);
            hashSet.add(kgq.m14215e(key, boolValueOf));
            CaptureRequest.Key key2 = ivv.f32393b;
            gtd gtdVar = this.f29757p;
            byte b = 0;
            int i = 1;
            int i2 = (((kpb) gtdVar.f26334a).m14668h() || ((kpb) gtdVar.f26334a).f36773f) ? 1 : 0;
            hashSet.add(kgq.m14215e(key2, Integer.valueOf(i2)));
            CaptureRequest.Key key3 = CaptureRequest.FLASH_MODE;
            if (true == z) {
                b = 2;
            }
            hashSet.add(kgq.m14215e(key3, Integer.valueOf(b)));
            hashSet.add(kgq.m14215e(ivv.f32409r, Byte.valueOf(b)));
            if (!((Boolean) ((jwf) this.f29759r.mo6467c()).f34942d).booleanValue()) {
                hashSet.add(kgq.m14215e(CaptureRequest.CONTROL_AE_LOCK, boolValueOf));
            }
            hashSet.add(kgq.m14215e(CaptureRequest.CONTROL_AWB_LOCK, boolValueOf));
            if (gcy.m9066a((String) ((jwf) this.f29761t).f34942d, gcy.OFF).equals(gcy.ON) && ((Boolean) ((jwf) this.f29759r.mo6465a()).f34942d).booleanValue()) {
                CaptureRequest.Key key4 = CaptureRequest.CONTROL_AE_MODE;
                if (true == z3) {
                    i = 3;
                }
                hashSet.add(kgq.m14215e(key4, Integer.valueOf(i)));
            }
            kfjVarMo14153b.mo14113e(hashSet);
            kfoVar.mo14158g(kfjVarMo14153b.mo14109a());
            if (z2) {
                kfoVar.close();
                this.f29756o = null;
            }
        } catch (CancellationException | kec e) {
            ((nbe) ((nbe) ((nbe) f29742a.m17251b()).mo17283h(e)).mo17276G(4012)).mo17293r("Countdown set torch failed: %s", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m10790c(boolean z, int i, boolean z2, boolean z3) {
        this.f29760s.postDelayed(new khi(this, z, z2, z3, 1), i);
    }

    /* JADX INFO: renamed from: d */
    public final void m10791d(int i) {
        chw chwVarMo3694h = this.f29758q.mo3694h();
        if (chwVarMo3694h.mo3786u() && chwVarMo3694h.mo3772bz().mo16813g()) {
            this.f29754m = ((fuc) chwVarMo3694h.mo3772bz().mo16809c()).mo8570d();
        } else {
            this.f29754m = mqu.f41450a;
        }
        this.f29752k.m9146d();
        hxd hxdVar = this.f29753l;
        boolean z = Settings.Global.getFloat(this.f29762u.getContentResolver(), "animator_duration_scale", 0.0f) != 0.0f;
        if (hxdVar.m10805e()) {
            hxdVar.m10801a();
        }
        hxdVar.m10803c();
        hxdVar.f29783d = z;
        hxdVar.f29782c.addView(hxdVar, -1);
        hxdVar.m10802b(true, i);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m10792e() {
        return this.f29753l.m10805e();
    }
}
