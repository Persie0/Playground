package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.camcorder.p008ui.stabilization.StabilizationUi;
import com.google.android.apps.camera.p014ui.popupmenu.PopupMenuButton;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dav implements dax {

    /* JADX INFO: renamed from: A */
    public final jfs f10313A;

    /* JADX INFO: renamed from: B */
    private final iuj f10314B;

    /* JADX INFO: renamed from: C */
    private View f10315C;

    /* JADX INFO: renamed from: D */
    private idb f10316D;

    /* JADX INFO: renamed from: E */
    private idb f10317E;

    /* JADX INFO: renamed from: F */
    private kba f10318F;

    /* JADX INFO: renamed from: G */
    private final jvb f10319G;

    /* JADX INFO: renamed from: a */
    public final dbg f10320a;

    /* JADX INFO: renamed from: b */
    public final dbb f10321b;

    /* JADX INFO: renamed from: c */
    public final elx f10322c;

    /* JADX INFO: renamed from: d */
    public final hsk f10323d;

    /* JADX INFO: renamed from: e */
    public final jvd f10324e;

    /* JADX INFO: renamed from: f */
    public final Context f10325f;

    /* JADX INFO: renamed from: g */
    public final ggm f10326g;

    /* JADX INFO: renamed from: h */
    public final dhv f10327h;

    /* JADX INFO: renamed from: j */
    public final hai f10329j;

    /* JADX INFO: renamed from: k */
    public final gfa f10330k;

    /* JADX INFO: renamed from: m */
    public StabilizationUi f10332m;

    /* JADX INFO: renamed from: o */
    public idb f10334o;

    /* JADX INFO: renamed from: p */
    public idb f10335p;

    /* JADX INFO: renamed from: u */
    public kba f10340u;

    /* JADX INFO: renamed from: x */
    public final htb f10343x;

    /* JADX INFO: renamed from: z */
    public AmbientModeSupport.AmbientController f10345z;

    /* JADX INFO: renamed from: i */
    public final AtomicBoolean f10328i = new AtomicBoolean(false);

    /* JADX INFO: renamed from: l */
    public final gfg f10331l = new hre(this, 1);

    /* JADX INFO: renamed from: n */
    public daw f10333n = daw.DISABLED_HIDDEN;

    /* JADX INFO: renamed from: q */
    public dbh f10336q = dbh.STANDARD;

    /* JADX INFO: renamed from: r */
    public hzj f10337r = hzj.PHONE_LAYOUT;

    /* JADX INFO: renamed from: s */
    public ilk f10338s = ilk.PORTRAIT;

    /* JADX INFO: renamed from: t */
    public final kos f10339t = new das(this, 0);

    /* JADX INFO: renamed from: y */
    public final AmbientModeSupport.AmbientController f10344y = new AmbientModeSupport.AmbientController(this);

    /* JADX INFO: renamed from: v */
    public int f10341v = -1;

    /* JADX INFO: renamed from: w */
    public final Object f10342w = new Object();

    public dav(dbg dbgVar, dbb dbbVar, elx elxVar, jfs jfsVar, hsk hskVar, jvd jvdVar, Context context, ggm ggmVar, htb htbVar, dhv dhvVar, cdu cduVar, hai haiVar, gfa gfaVar, iuj iujVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f10320a = dbgVar;
        this.f10321b = dbbVar;
        this.f10322c = elxVar;
        this.f10313A = jfsVar;
        this.f10323d = hskVar;
        this.f10324e = jvdVar;
        this.f10325f = context;
        this.f10326g = ggmVar;
        this.f10343x = htbVar;
        this.f10327h = dhvVar;
        this.f10319G = cduVar.m3529i();
        this.f10329j = haiVar;
        this.f10330k = gfaVar;
        this.f10314B = iujVar;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m5843r(kay kayVar) {
        return kayVar.equals(kay.CLOCKWISE_90) || kayVar.equals(kay.CLOCKWISE_270);
    }

    /* JADX INFO: renamed from: t */
    private final void m5844t() {
        m5849d();
        this.f10332m.setVisibility(8);
        m5852g();
        ((daz) this.f10321b).f29465f.m10708g();
    }

    /* JADX INFO: renamed from: u */
    private final void m5845u() {
        lku.m15614I(this.f10333n.f10351e, "Stabilization button is not visible");
        this.f10332m.setVisibility(0);
    }

    @Override // p000.dax
    /* JADX INFO: renamed from: a */
    public final dbg mo5846a() {
        return this.f10320a;
    }

    @Override // p000.dax
    /* JADX INFO: renamed from: b */
    public final void mo5847b() {
        synchronized (this.f10342w) {
            idb idbVar = this.f10317E;
            if (idbVar != null) {
                this.f10322c.mo7485g(idbVar);
                this.f10317E = null;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5848c() {
        synchronized (this.f10342w) {
            if (this.f10318F == null) {
                this.f10318F = this.f10322c.mo7483e(ely.NOTIFICATION_CHIP);
            }
        }
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        m5844t();
        this.f10333n = daw.DISABLED_HIDDEN;
    }

    /* JADX INFO: renamed from: d */
    public final void m5849d() {
        kba kbaVar = this.f10340u;
        if (kbaVar != null) {
            kbaVar.close();
            this.f10340u = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m5850e() {
        this.f10314B.mo11728I(false);
        this.f10314B.mo11763n();
    }

    @Override // p000.dax
    /* JADX INFO: renamed from: f */
    public final void mo5851f(ViewStub viewStub) {
        if (this.f10332m == null) {
            this.f10332m = (StabilizationUi) viewStub.inflate();
        }
        this.f10316D = jpd.m13426g(true, 3000, null, null, this.f10325f.getResources().getString(C0100R.string.locked_mode_before_recording), this.f10325f, false, -1, 12);
        this.f10334o = jpd.m13426g(true, 3000, null, null, this.f10325f.getResources().getString(C0100R.string.locked_mode_will_exit_warning), this.f10325f, false, -1, 12);
        this.f10335p = jpd.m13426g(false, 3000, null, null, this.f10325f.getResources().getString(C0100R.string.locked_mode_exit_message), this.f10325f, false, -1, 12);
        FrameLayout frameLayout = this.f10332m.f6584c;
        this.f10315C = frameLayout;
        frameLayout.setAccessibilityDelegate(new dat(this));
        this.f10315C.setOnClickListener(new ViewOnClickListenerC0250hu(this, 7));
        if (this.f10327h.mo6184l(dib.f11361co)) {
            dbg dbgVar = this.f10320a;
            View view = this.f10315C;
            dbe dbeVar = (dbe) dbgVar;
            if (dbeVar.f10367b.mo6184l(dib.f11361co)) {
                ArrayList arrayList = new ArrayList();
                dbh dbhVar = dbh.STANDARD;
                String string = dbeVar.f10366a.getString(C0100R.string.stabilization_title_enhanced);
                String string2 = dbeVar.f10366a.getString(C0100R.string.stabilization_description_enhanced);
                arrayList.add(new idw(dbhVar, string, C0100R.drawable.quantum_gm_ic_stabilization_white_24, string2, string2));
                if (dbeVar.f10367b.mo6184l(dhh.f11069V)) {
                    dbh dbhVar2 = dbh.LOCKED;
                    String string3 = dbeVar.f10366a.getString(C0100R.string.stabilization_title_locking);
                    String string4 = dbeVar.f10366a.getString(C0100R.string.stabilization_description_locking);
                    arrayList.add(new idw(dbhVar2, string3, C0100R.drawable.quantum_gm_ic_stabilization_lock_white_24, string4, string4));
                }
                if (dbeVar.f10367b.mo6184l(dhh.f11070W)) {
                    dbh dbhVar3 = dbh.ACTIVE;
                    String string5 = dbeVar.f10366a.getString(C0100R.string.stabilization_title_action);
                    String string6 = dbeVar.f10366a.getString(C0100R.string.stabilization_description_action);
                    arrayList.add(new idw(dbhVar3, string5, C0100R.drawable.quantum_gm_ic_stabilization_action_white_24, string6, string6));
                }
                if (dbeVar.f10367b.mo6184l(dhh.f11071X)) {
                    dbh dbhVar4 = dbh.CINEMATIC;
                    String string7 = dbeVar.f10366a.getString(C0100R.string.stabilization_title_panning);
                    String string8 = dbeVar.f10366a.getString(C0100R.string.stabilization_description_panning);
                    arrayList.add(new idw(dbhVar4, string7, C0100R.drawable.quantum_gm_ic_stabilization_pan_white_24, string8, string8));
                }
                dbeVar.f10371f = new idu(dbeVar.f10366a, view, new idv(arrayList, dbh.STANDARD));
                dbeVar.f10371f.m11137c(C0100R.string.stab_menu_header);
                dbeVar.f10371f.setOnDismissListener(new dbd(dbeVar, 0));
            }
        }
        dbg dbgVar2 = this.f10320a;
        AmbientModeSupport.AmbientController ambientController = new AmbientModeSupport.AmbientController(this);
        dbe dbeVar2 = (dbe) dbgVar2;
        int i = 1;
        byte[] bArr = null;
        if (dbeVar2.f10367b.mo6184l(dib.f11361co)) {
            dbeVar2.f10371f.m11138d(new ViewOnClickListenerC0250hu(ambientController, 8, bArr));
            dbeVar2.f10371f.f30509d = new iah(ambientController, i, bArr);
        } else {
            dbeVar2.f10368c.f7094b.setOnClickListener(new ViewOnClickListenerC0250hu(ambientController, 9, bArr));
            dbeVar2.f10372g.m11125a(new iag(ambientController, i, bArr), true);
        }
        this.f10319G.m13537d(this.f10320a.mo5870a(new dau(this)));
        jvb jvbVar = this.f10319G;
        this.f10330k.mo9121g(this.f10331l);
        jvbVar.m13537d(new cft(this, 19));
    }

    /* JADX INFO: renamed from: g */
    public final void m5852g() {
        synchronized (this.f10342w) {
            this.f10341v = -1;
        }
        this.f10326g.mo9222l(this.f10344y);
        this.f10326g.mo9218h(this.f10339t);
        dbe dbeVar = (dbe) this.f10320a;
        if (dbeVar.f10367b.mo6184l(dib.f11361co)) {
            dbeVar.f10371f.m11139e(dbh.STANDARD);
            dbeVar.f10371f.dismiss();
        } else {
            dbeVar.f10372g.m11127c(dbh.STANDARD);
            dbeVar.mo5871b();
        }
        m5855j(dbh.STANDARD);
    }

    /* JADX INFO: renamed from: h */
    public final void m5853h() {
        synchronized (this.f10342w) {
            kba kbaVar = this.f10318F;
            if (kbaVar != null) {
                kbaVar.close();
                this.f10318F = null;
            }
        }
    }

    @Override // p000.dax
    /* JADX INFO: renamed from: i */
    public final synchronized void mo5854i(daw dawVar) {
        this.f10333n = dawVar;
        this.f10332m.f6583b.setAlpha(true != dawVar.f10350d ? 0.3f : 1.0f);
        if (!dawVar.f10351e) {
            m5844t();
            return;
        }
        m5845u();
        if (dawVar.f10350d) {
            int iIntValue = ((Integer) ((jwf) this.f10329j.mo10030b(gzy.f26999K)).f34942d).intValue() + 1;
            this.f10329j.mo10033e(gzy.f26999K, Integer.valueOf(iIntValue));
            if ((!((Boolean) ((jwf) this.f10329j.mo10030b(gzy.f27000L)).f34942d).booleanValue() && iIntValue == 2) || iIntValue == 10) {
                if (this.f10340u == null) {
                    FrameLayout frameLayout = this.f10332m.f6584c;
                    frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(new hsq(this, frameLayout, 1));
                }
                this.f10329j.mo10033e(gzy.f27000L, true);
                this.f10329j.mo10033e(gzy.f26999K, 0);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m5855j(dbh dbhVar) {
        this.f10336q = dbhVar;
        StabilizationUi stabilizationUi = this.f10332m;
        PopupMenuButton popupMenuButton = stabilizationUi.f6583b;
        Integer num = (Integer) stabilizationUi.f6582a.get(dbhVar);
        num.getClass();
        popupMenuButton.setImageResource(num.intValue());
    }

    @Override // p000.dax
    /* JADX INFO: renamed from: k */
    public final void mo5856k(hzj hzjVar, ilk ilkVar) {
        this.f10337r = hzjVar;
        this.f10338s = ilkVar;
        idu iduVar = ((dbe) this.f10320a).f10371f;
        iduVar.f30508c = hzjVar;
        if (iduVar.f30508c.equals(hzj.f30014d)) {
            iduVar.getContentView().findViewById(C0100R.id.popup_background).setBackgroundResource(C0100R.drawable.menu_tabletop_background);
        } else {
            iduVar.getContentView().findViewById(C0100R.id.popup_background).setBackgroundResource(C0100R.drawable.menu_background);
        }
        if (this.f10320a.mo5872c()) {
            if (bzq.m3253Z(hzjVar, ilkVar) && this.f10336q == dbh.STANDARD) {
                m5850e();
            } else {
                m5860o();
            }
        }
    }

    @Override // p000.dax
    /* JADX INFO: renamed from: l */
    public final void mo5857l(ilk ilkVar) {
        this.f10332m.m4081a(ilkVar);
        dbe dbeVar = (dbe) this.f10320a;
        if (dbeVar.f10367b.mo6184l(dib.f11361co)) {
            dbeVar.f10371f.m11141g(ilkVar);
        } else {
            dbeVar.f10369d.m4409a(ilkVar);
            dbeVar.f10368c.m4405a(ilkVar);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m5858m(idb idbVar) {
        synchronized (this.f10342w) {
            mo5847b();
            this.f10317E = idbVar;
            elx elxVar = this.f10322c;
            idbVar.getClass();
            elxVar.mo7482d(idbVar);
        }
    }

    @Override // p000.dax
    /* JADX INFO: renamed from: n */
    public final void mo5859n() {
        synchronized (this.f10342w) {
            if (this.f10336q.equals(dbh.LOCKED) && !this.f10328i.get()) {
                m5858m(this.f10316D);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m5860o() {
        this.f10314B.mo11728I(true);
        this.f10314B.mo11765p();
    }

    @Override // p000.dax
    /* JADX INFO: renamed from: p */
    public final void mo5861p() {
        this.f10328i.set(true);
        daw dawVar = this.f10333n;
        if (!dawVar.f10350d) {
            if (dawVar.f10351e) {
                m5844t();
            }
        } else {
            this.f10320a.mo5871b();
            this.f10332m.m4082b(true, this.f10327h.mo6184l(dhh.f11068U));
            if (this.f10336q.equals(dbh.LOCKED)) {
                this.f10343x.m10723a(htd.ACTIVE);
                mo5847b();
            }
            m5849d();
        }
    }

    @Override // p000.dax
    /* JADX INFO: renamed from: q */
    public final void mo5862q() {
        this.f10328i.set(false);
        daw dawVar = this.f10333n;
        if (!dawVar.f10350d) {
            if (dawVar.f10351e) {
                m5845u();
                return;
            }
            return;
        }
        this.f10332m.m4082b(false, this.f10327h.mo6184l(dhh.f11068U));
        if (this.f10336q.equals(dbh.LOCKED)) {
            this.f10343x.m10723a(htd.IDLE);
            mo5859n();
            synchronized (this.f10342w) {
                this.f10341v = -1;
            }
        }
    }

    @Override // p000.dax
    /* JADX INFO: renamed from: s */
    public final void mo5863s(AmbientModeSupport.AmbientController ambientController) {
        this.f10345z = ambientController;
    }
}
