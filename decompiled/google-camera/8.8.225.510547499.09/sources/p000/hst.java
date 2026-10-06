package p000;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hst implements fbp, fbj, fbg, ezt {

    /* JADX INFO: renamed from: a */
    public final jvd f29437a;

    /* JADX INFO: renamed from: b */
    public final dhv f29438b;

    /* JADX INFO: renamed from: c */
    public final jwn f29439c;

    /* JADX INFO: renamed from: d */
    public mhc f29440d;

    /* JADX INFO: renamed from: e */
    public hss f29441e;

    /* JADX INFO: renamed from: f */
    public View.OnScrollChangeListener f29442f;

    /* JADX INFO: renamed from: i */
    public NestedScrollView f29445i;

    /* JADX INFO: renamed from: l */
    public AmbientMode.AmbientController f29448l;

    /* JADX INFO: renamed from: n */
    private final fcp f29450n;

    /* JADX INFO: renamed from: p */
    private final Activity f29452p;

    /* JADX INFO: renamed from: r */
    private final kba f29454r;

    /* JADX INFO: renamed from: j */
    public int f29446j = 1;

    /* JADX INFO: renamed from: h */
    public long f29444h = 0;

    /* JADX INFO: renamed from: k */
    public nxl f29447k = nhk.f42331e.m18137O();

    /* JADX INFO: renamed from: q */
    private final List f29453q = new ArrayList();

    /* JADX INFO: renamed from: g */
    public int f29443g = -1;

    /* JADX INFO: renamed from: m */
    private final View.OnLayoutChangeListener f29449m = new hdf(this, 2);

    /* JADX INFO: renamed from: o */
    private final View.OnScrollChangeListener f29451o = new View.OnScrollChangeListener() { // from class: hsn
        @Override // android.view.View.OnScrollChangeListener
        public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
            View.OnScrollChangeListener onScrollChangeListener = this.f29424a.f29442f;
            if (onScrollChangeListener != null) {
                onScrollChangeListener.onScrollChange(view, i, i2, i3, i4);
            }
        }
    };

    public hst(jvd jvdVar, Activity activity, fba fbaVar, fcp fcpVar, dhv dhvVar, jwn jwnVar) {
        this.f29437a = jvdVar;
        this.f29452p = activity;
        this.f29439c = jwnVar;
        this.f29438b = dhvVar;
        this.f29450n = fcpVar;
        jvdVar.m13541c(new hri(this, fbaVar, 4));
        this.f29454r = jwnVar.mo3830a(new hmv(this, 14), not.INSTANCE);
    }

    @Override // p000.fbg
    /* JADX INFO: renamed from: bC */
    public final void mo3521bC() {
        kba kbaVar = this.f29454r;
        if (kbaVar != null) {
            kbaVar.close();
        }
    }

    @Override // p000.fbj
    /* JADX INFO: renamed from: bE */
    public final void mo3522bE() {
        m10708g();
    }

    /* JADX INFO: renamed from: c */
    public final int m10704c() {
        WindowManager windowManager = this.f29452p.getWindowManager();
        return ((windowManager.getCurrentWindowMetrics().getBounds().height() / 2) - windowManager.getCurrentWindowMetrics().getWindowInsets().getInsets(WindowInsets.Type.systemBars()).bottom) - ((int) this.f29452p.getResources().getDimension(C0100R.dimen.bottom_sheet_jarvis_top_margin));
    }

    /* JADX INFO: renamed from: d */
    public final ViewGroup m10705d(View view, Context context) {
        FrameLayout frameLayout;
        jvd.m13538a();
        m10708g();
        mhc mhcVar = new mhc(context);
        this.f29440d = mhcVar;
        mhcVar.setContentView(C0100R.layout.bottom_sheet_frame);
        mhcVar.f40479c = true;
        View viewInflate = View.inflate(context, C0100R.layout.handle_bar, null);
        FrameLayout frameLayout2 = (FrameLayout) mhcVar.findViewById(C0100R.id.bottomsheet_handle_bar_container);
        if (frameLayout2 != null) {
            frameLayout2.addView(viewInflate);
            frameLayout2.setVisibility(0);
        }
        Window window = mhcVar.getWindow();
        window.getClass();
        window.addFlags(1024);
        NestedScrollView nestedScrollView = (NestedScrollView) mhcVar.findViewById(C0100R.id.sheet_content);
        nestedScrollView.getClass();
        nestedScrollView.addOnLayoutChangeListener(this.f29449m);
        nestedScrollView.setOnScrollChangeListener(this.f29451o);
        if (view != null && (frameLayout = (FrameLayout) mhcVar.findViewById(C0100R.id.sheet_title_frame)) != null) {
            frameLayout.addView(view);
        }
        return nestedScrollView;
    }

    /* JADX INFO: renamed from: e */
    public final void m10706e(hsr hsrVar) {
        this.f29453q.add(hsrVar);
    }

    /* JADX INFO: renamed from: f */
    public final void m10707f(ViewGroup viewGroup) {
        hss hssVar = this.f29441e;
        if (hssVar != null) {
            hssVar.mo10363b(this.f29443g);
        }
        mhc mhcVar = this.f29440d;
        if (mhcVar == null) {
            return;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) mhcVar.findViewById(C0100R.id.sheet_content);
        nestedScrollView.getClass();
        this.f29445i = nestedScrollView;
        if (((hyd) this.f29439c.mo3831be()).f29901a.equals(hye.JARVIS)) {
            mhcVar.m16369a().f8109e = m10704c();
        }
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new hsq(viewGroup, new hri(this, mhcVar, 3), 0));
        mhcVar.m16369a().f8126v = true;
        mhcVar.m16369a().m4806A(true);
    }

    /* JADX INFO: renamed from: g */
    public final void m10708g() {
        this.f29437a.m13541c(new hps(this, 19));
    }

    /* JADX INFO: renamed from: h */
    public final void m10709h() {
        int i = this.f29446j;
        if (i == 1 || this.f29444h == 0) {
            return;
        }
        nxl nxlVar = this.f29447k;
        if (!nxlVar.f44974b.m18142ac()) {
            nxlVar.mo18106p();
        }
        nhk nhkVar = (nhk) nxlVar.f44974b;
        nhk nhkVar2 = nhk.f42331e;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        nhkVar.f42334b = i2;
        nhkVar.f42333a |= 1;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f29444h;
        if (!nxlVar.f44974b.m18142ac()) {
            nxlVar.mo18106p();
        }
        nhk nhkVar3 = (nhk) nxlVar.f44974b;
        nhkVar3.f42333a |= 2;
        nhkVar3.f42335c = jCurrentTimeMillis;
        AmbientMode.AmbientController ambientController = this.f29448l;
        if (ambientController != null) {
            nxl nxlVar2 = this.f29447k;
            epc epcVar = (epc) ambientController.f1697a;
            epcVar.m7610a();
            List list = epcVar.f14948a;
            if (!nxlVar2.f44974b.m18142ac()) {
                nxlVar2.mo18106p();
            }
            nhk nhkVar4 = (nhk) nxlVar2.f44974b;
            nxy nxyVar = nhkVar4.f42336d;
            if (!nxyVar.mo17770c()) {
                nhkVar4.f42336d = nxq.m18127U(nxyVar);
            }
            nwb.m17749e(list, nhkVar4.f42336d);
        }
        this.f29450n.mo8198r((nhk) this.f29447k.mo18103l());
    }

    /* JADX INFO: renamed from: i */
    public final void m10710i(hsr hsrVar) {
        this.f29453q.remove(hsrVar);
    }

    /* JADX INFO: renamed from: j */
    public final void m10711j(int i) {
        Iterator it = this.f29453q.iterator();
        while (it.hasNext()) {
            ((hsr) it.next()).mo8661x(i);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m10712k(int i) {
        Iterator it = this.f29453q.iterator();
        while (it.hasNext()) {
            ((hsr) it.next()).mo8662y(i);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m10713l(int i, int i2, View view) {
        m10714m(i, i2, view, null);
    }

    /* JADX INFO: renamed from: m */
    public final void m10714m(int i, int i2, View view, DialogInterface.OnDismissListener onDismissListener) {
        m10715n(i, i2, view, onDismissListener, null);
    }

    /* JADX INFO: renamed from: n */
    public final void m10715n(int i, int i2, View view, DialogInterface.OnDismissListener onDismissListener, AmbientMode.AmbientController ambientController) {
        if (this.f29438b.mo6184l(dib.f11326bg)) {
            return;
        }
        this.f29437a.execute(new hso(this, i2, view, onDismissListener, i, 0));
        this.f29446j = i;
        this.f29444h = System.currentTimeMillis();
        this.f29447k = nhk.f42331e.m18137O();
        this.f29448l = ambientController;
        m10712k(i);
    }

    @Override // p000.ezt
    /* JADX INFO: renamed from: y */
    public final void mo7784y(Configuration configuration) {
        this.f29443g = configuration.orientation;
    }
}
