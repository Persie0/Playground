package androidx.wear.ambient;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.clockwork.common.wearable.wearmaterial.list.FadingWearableRecyclerView;
import com.google.android.clockwork.common.wearable.wearmaterial.slider.WearInlineSlider;
import com.google.android.clockwork.common.wearable.wearmaterial.time.WearTimeText;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.play.core.common.wMe.NptsKnlVczSZ;
import java.io.File;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Map;
import p000.AbstractC0812ly;
import p000.C0111cq;
import p000.C0186fk;
import p000.C0192fq;
import p000.C0227gy;
import p000.C0259ic;
import p000.C0264ih;
import p000.C0272ip;
import p000.C0813lz;
import p000.C0818md;
import p000.C0829mo;
import p000.C1006tc;
import p000.C1058va;
import p000.C1091wg;
import p000.InterfaceC0962rm;
import p000.LayoutInflaterFactory2C0179fd;
import p000.aev;
import p000.aif;
import p000.bos;
import p000.cgm;
import p000.ckw;
import p000.cru;
import p000.dle;
import p000.dlf;
import p000.dlg;
import p000.epc;
import p000.exm;
import p000.ikw;
import p000.jbx;
import p000.jcu;
import p000.jfe;
import p000.jfj;
import p000.jfm;
import p000.jga;
import p000.jgb;
import p000.lbl;
import p000.lql;
import p000.ltp;
import p000.lxm;
import p000.mkx;
import p000.mpr;
import p000.nbe;
import p000.omn;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class AmbientMode extends Fragment {
    public static final String EXTRA_BURN_IN_PROTECTION = "com.google.android.wearable.compat.extra.BURN_IN_PROTECTION";
    public static final String EXTRA_LOWBIT_AMBIENT = "com.google.android.wearable.compat.extra.LOWBIT_AMBIENT";
    public static final String FRAGMENT_TAG = "android.support.wearable.ambient.AmbientMode";

    /* JADX INFO: renamed from: a */
    AmbientDelegate f1693a;

    /* JADX INFO: renamed from: b */
    AmbientCallback f1694b;

    /* JADX INFO: renamed from: c */
    private final AmbientDelegate.AmbientCallback f1695c = new AmbientDelegate.AmbientCallback() { // from class: androidx.wear.ambient.AmbientMode.1
        @Override // androidx.wear.ambient.AmbientDelegate.AmbientCallback
        public final void onAmbientOffloadInvalidated() {
        }

        @Override // androidx.wear.ambient.AmbientDelegate.AmbientCallback
        public final void onEnterAmbient(Bundle bundle) {
        }

        @Override // androidx.wear.ambient.AmbientDelegate.AmbientCallback
        public final void onExitAmbient() {
        }

        @Override // androidx.wear.ambient.AmbientDelegate.AmbientCallback
        public final void onUpdateAmbient() {
        }
    };

    /* JADX INFO: renamed from: d */
    private final AmbientController f1696d = new AmbientController(this);

    /* JADX INFO: compiled from: PG */
    public final class AmbientCallback {
        public final void onAmbientOffloadInvalidated() {
        }

        public final void onEnterAmbient(Bundle bundle) {
        }

        public final void onExitAmbient() {
        }

        public final void onUpdateAmbient() {
        }
    }

    /* JADX INFO: compiled from: PG */
    /* JADX INFO: loaded from: classes2.dex */
    public interface AmbientCallbackProvider {
        AmbientCallback getAmbientCallback();
    }

    /* JADX INFO: compiled from: PG */
    public final class AmbientController {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f1697a;

        public AmbientController() {
        }

        public AmbientController(aif aifVar) {
            this.f1697a = aifVar;
        }

        public AmbientController(Context context) {
            this.f1697a = context;
        }

        public AmbientController(RecyclerView recyclerView) {
            this.f1697a = recyclerView;
        }

        public AmbientController(Toolbar toolbar) {
            this.f1697a = toolbar;
        }

        public AmbientController(ProfileInstallReceiver profileInstallReceiver) {
            this.f1697a = profileInstallReceiver;
        }

        public AmbientController(AmbientMode ambientMode) {
            this.f1697a = ambientMode;
        }

        public AmbientController(bos bosVar) {
            this.f1697a = bosVar;
        }

        public AmbientController(cgm cgmVar) {
            this.f1697a = cgmVar;
        }

        public AmbientController(ckw ckwVar) {
            this.f1697a = ckwVar;
        }

        public AmbientController(FadingWearableRecyclerView fadingWearableRecyclerView) {
            this.f1697a = fadingWearableRecyclerView;
        }

        public AmbientController(WearInlineSlider wearInlineSlider) {
            this.f1697a = wearInlineSlider;
        }

        public AmbientController(WearTimeText wearTimeText) {
            this.f1697a = wearTimeText;
        }

        public AmbientController(CollapsingToolbarLayout collapsingToolbarLayout) {
            this.f1697a = collapsingToolbarLayout;
        }

        public AmbientController(FloatingActionButton floatingActionButton) {
            this.f1697a = floatingActionButton;
        }

        public AmbientController(C0111cq c0111cq) {
            this.f1697a = c0111cq;
        }

        public AmbientController(cru cruVar) {
            this.f1697a = cruVar;
        }

        public AmbientController(dlg dlgVar) {
            this.f1697a = dlgVar;
        }

        public /* synthetic */ AmbientController(epc epcVar) {
            this.f1697a = epcVar;
        }

        public AmbientController(exm exmVar) {
            this.f1697a = exmVar;
        }

        public AmbientController(LayoutInflaterFactory2C0179fd layoutInflaterFactory2C0179fd) {
            this.f1697a = layoutInflaterFactory2C0179fd;
        }

        public AmbientController(C0186fk c0186fk) {
            this.f1697a = c0186fk;
        }

        public AmbientController(C0192fq c0192fq) {
            this.f1697a = c0192fq;
        }

        public AmbientController(C0227gy c0227gy) {
            this.f1697a = c0227gy;
        }

        public AmbientController(C0259ic c0259ic) {
            this.f1697a = c0259ic;
        }

        public AmbientController(C0272ip c0272ip) {
            this.f1697a = c0272ip;
        }

        public AmbientController(File file) {
            this.f1697a = file;
        }

        public AmbientController(jfe jfeVar) {
            this.f1697a = jfeVar;
        }

        public AmbientController(jfj jfjVar) {
            this.f1697a = jfjVar;
        }

        public AmbientController(jfm jfmVar) {
            this.f1697a = jfmVar;
        }

        public AmbientController(jga jgaVar) {
            this.f1697a = jgaVar;
        }

        public AmbientController(jgb jgbVar) {
            this.f1697a = jgbVar;
        }

        public AmbientController(lbl lblVar) {
            this.f1697a = lblVar;
        }

        public /* synthetic */ AmbientController(lql lqlVar) {
            this.f1697a = lqlVar;
        }

        public AmbientController(ltp ltpVar) {
            this.f1697a = ltpVar;
        }

        public AmbientController(mkx mkxVar) {
            this.f1697a = mkxVar;
        }

        public AmbientController(mpr mprVar) {
            this.f1697a = mprVar;
        }

        public /* synthetic */ AmbientController(C1058va c1058va, byte[] bArr) {
            this.f1697a = c1058va;
        }

        public AmbientController(C1091wg c1091wg) {
            this.f1697a = c1091wg;
        }

        /* JADX INFO: renamed from: a */
        public final void m1628a(int i, Object obj) {
            String str;
            switch (i) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 9:
                default:
                    str = "";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            switch (i) {
                case 6:
                case 7:
                case 8:
                    Log.e("ProfileInstaller", str, (Throwable) obj);
                    break;
            }
            ((ProfileInstallReceiver) this.f1697a).setResultCode(i);
        }

        /* JADX INFO: renamed from: b */
        public final void m1629b(int i, double d, double d2) {
            String str;
            synchronized (this.f1697a) {
                for (dlf dlfVar : ((dlg) this.f1697a).f11935b) {
                    double d3 = d / d2;
                    Map map = dlfVar.f11930b;
                    Integer numValueOf = Integer.valueOf(i);
                    dle dleVar = (dle) map.get(numValueOf);
                    if (dleVar == null) {
                        dleVar = new dle();
                        dlfVar.f11930b.put(numValueOf, dleVar);
                    }
                    if (d3 < 1.5d) {
                        dleVar.f11925a++;
                    } else if (d3 < 2.5d) {
                        dleVar.f11926b++;
                    } else if (d3 < 5.0d) {
                        dleVar.f11927c++;
                    } else {
                        dleVar.f11928d++;
                    }
                }
            }
            nbe nbeVar = (nbe) ((nbe) dlg.f11934a.m17252c()).mo17276G(975);
            ikw ikwVar = ((dlg) this.f1697a).f11937d;
            switch (i) {
                case 0:
                    str = String.format("abs Δ(result sensor timestamp) = %.2f ms > %.2f ms", Double.valueOf(d), Double.valueOf(d2));
                    break;
                case 1:
                    str = String.format("rel Δ(result sensor timestamp) = %.2f > %.2f", Double.valueOf(d), Double.valueOf(d2));
                    break;
                case 2:
                    str = String.format("result sensor delay = %.2f > %.2f", Double.valueOf(d), Double.valueOf(d2));
                    break;
                case 3:
                    str = String.format("abs Δ(surface sensor timestamp) = %.2f ms > %.2f ms", Double.valueOf(d), Double.valueOf(d2));
                    break;
                case 4:
                    str = String.format("rel Δ(surface sensor timestamp) = %.2f > %.2f", Double.valueOf(d), Double.valueOf(d2));
                    break;
                case 5:
                    str = String.format("abs pipeline latency = %.2f ms > %.2f ms", Double.valueOf(d), Double.valueOf(d2));
                    break;
                default:
                    str = String.format("rel pipeline latency = %.2f > %.2f", Double.valueOf(d), Double.valueOf(d2));
                    break;
            }
            nbeVar.mo17301z("%s > %s", ikwVar, str);
        }

        /* JADX INFO: renamed from: c */
        public final void m1630c(InterfaceC0962rm interfaceC0962rm) {
            if (((C1006tc) interfaceC0962rm).f47648a) {
                return;
            }
            Object obj = this.f1697a;
            synchronized (((C1091wg) obj).f47920a) {
                ((C1091wg) obj).f47920a.remove(interfaceC0962rm);
            }
        }

        /* JADX INFO: renamed from: d */
        public final C0829mo m1631d(int i) {
            RecyclerView recyclerView = (RecyclerView) this.f1697a;
            int iM13611c = recyclerView.f1118h.m13611c();
            C0829mo c0829mo = null;
            for (int i2 = 0; i2 < iM13611c; i2++) {
                C0829mo c0829moM1197h = RecyclerView.m1197h(recyclerView.f1118h.m13614f(i2));
                if (c0829moM1197h != null && !c0829moM1197h.m16694u() && c0829moM1197h.f41157c == i) {
                    if (!recyclerView.f1118h.m13619k(c0829moM1197h.f41155a)) {
                        c0829mo = c0829moM1197h;
                        break;
                    }
                    c0829mo = c0829moM1197h;
                }
            }
            if (c0829mo == null || ((RecyclerView) this.f1697a).f1118h.m13619k(c0829mo.f41155a)) {
                return null;
            }
            return c0829mo;
        }

        /* JADX INFO: renamed from: e */
        public final void m1632e(C0264ih c0264ih) {
            switch (c0264ih.f30905a) {
                case 1:
                    ((RecyclerView) this.f1697a).f1124n.mo1114v(c0264ih.f30906b, c0264ih.f30908d);
                    break;
                case 2:
                    ((RecyclerView) this.f1697a).f1124n.mo1116x(c0264ih.f30906b, c0264ih.f30908d);
                    break;
                case 4:
                    AbstractC0812ly abstractC0812ly = ((RecyclerView) this.f1697a).f1124n;
                    int i = c0264ih.f30906b;
                    int i2 = c0264ih.f30908d;
                    Object obj = c0264ih.f30907c;
                    abstractC0812ly.mo1117y(i, i2);
                    break;
            }
        }

        /* JADX INFO: renamed from: f */
        public final void m1633f(int i, int i2, Object obj) {
            int i3;
            int i4;
            RecyclerView recyclerView = (RecyclerView) this.f1697a;
            int iM13611c = recyclerView.f1118h.m13611c();
            for (int i5 = 0; i5 < iM13611c; i5++) {
                View viewM13614f = recyclerView.f1118h.m13614f(i5);
                C0829mo c0829moM1197h = RecyclerView.m1197h(viewM13614f);
                if (c0829moM1197h != null && !c0829moM1197h.m16699z() && (i4 = c0829moM1197h.f41157c) >= i && i4 < i + i2) {
                    c0829moM1197h.m16678e(2);
                    c0829moM1197h.m16677d(obj);
                    ((C0813lz) viewM13614f.getLayoutParams()).f39587e = true;
                }
            }
            C0818md c0818md = recyclerView.f1116f;
            int i6 = i2 + i;
            for (int size = c0818md.f40023c.size() - 1; size >= 0; size--) {
                C0829mo c0829mo = (C0829mo) c0818md.f40023c.get(size);
                if (c0829mo != null && (i3 = c0829mo.f41157c) >= i && i3 < i6) {
                    c0829mo.m16678e(2);
                    c0818md.m16320i(size);
                }
            }
            ((RecyclerView) this.f1697a).f1077O = true;
        }

        /* JADX INFO: renamed from: g */
        public final void m1634g(int i, int i2) {
            RecyclerView recyclerView = (RecyclerView) this.f1697a;
            int iM13611c = recyclerView.f1118h.m13611c();
            for (int i3 = 0; i3 < iM13611c; i3++) {
                C0829mo c0829moM1197h = RecyclerView.m1197h(recyclerView.f1118h.m13614f(i3));
                if (c0829moM1197h != null && !c0829moM1197h.m16699z() && c0829moM1197h.f41157c >= i) {
                    c0829moM1197h.m16683j(i2, false);
                    recyclerView.f1075M.f40921f = true;
                }
            }
            C0818md c0818md = recyclerView.f1116f;
            int size = c0818md.f40023c.size();
            for (int i4 = 0; i4 < size; i4++) {
                C0829mo c0829mo = (C0829mo) c0818md.f40023c.get(i4);
                if (c0829mo != null && c0829mo.f41157c >= i) {
                    c0829mo.m16683j(i2, false);
                }
            }
            recyclerView.requestLayout();
            ((RecyclerView) this.f1697a).f1076N = true;
        }

        /* JADX INFO: renamed from: h */
        public final void m1635h(int i, int i2) {
            ((RecyclerView) this.f1697a).m1214M(i, i2, true);
            RecyclerView recyclerView = (RecyclerView) this.f1697a;
            recyclerView.f1076N = true;
            recyclerView.f1075M.f40918c += i2;
        }

        /* JADX INFO: renamed from: i */
        public final int m1636i() {
            return ((RecyclerView) this.f1697a).getChildCount();
        }

        public final boolean isAmbient() {
            AmbientDelegate ambientDelegate = ((AmbientMode) this.f1697a).f1693a;
            if (ambientDelegate == null) {
                return false;
            }
            return ambientDelegate.m1605h();
        }

        /* JADX INFO: renamed from: j */
        public final int m1637j(View view) {
            return ((RecyclerView) this.f1697a).indexOfChild(view);
        }

        /* JADX INFO: renamed from: k */
        public final View m1638k(int i) {
            return ((RecyclerView) this.f1697a).getChildAt(i);
        }

        /* JADX INFO: renamed from: l */
        public final void m1639l(View view) {
            C0829mo c0829moM1197h = RecyclerView.m1197h(view);
            if (c0829moM1197h != null) {
                ((RecyclerView) this.f1697a).m1242ar(c0829moM1197h, c0829moM1197h.f41169o);
                c0829moM1197h.f41169o = 0;
            }
        }

        /* JADX INFO: renamed from: m */
        public final void m1640m(int i) {
            View childAt = ((RecyclerView) this.f1697a).getChildAt(i);
            if (childAt != null) {
                ((RecyclerView) this.f1697a).m1265w(childAt);
                childAt.clearAnimation();
            }
            ((RecyclerView) this.f1697a).removeViewAt(i);
        }

        /* JADX INFO: renamed from: n */
        public final void m1641n(C0829mo c0829mo) {
            RecyclerView recyclerView = (RecyclerView) this.f1697a;
            recyclerView.f1124n.m16152aM(c0829mo.f41155a, recyclerView.f1116f);
        }

        /* JADX INFO: renamed from: o */
        public final void m1642o(C0829mo c0829mo, aev aevVar, aev aevVar2) {
            Object obj = this.f1697a;
            c0829mo.m16686m(false);
            RecyclerView recyclerView = (RecyclerView) obj;
            if (recyclerView.f1068F.mo16079p(c0829mo, aevVar, aevVar2)) {
                recyclerView.m1220S();
            }
        }

        /* JADX INFO: renamed from: p */
        public final void m1643p(C0829mo c0829mo, aev aevVar, aev aevVar2) {
            ((RecyclerView) this.f1697a).f1116f.m16324m(c0829mo);
            RecyclerView recyclerView = (RecyclerView) this.f1697a;
            recyclerView.m1258o(c0829mo);
            c0829mo.m16686m(false);
            if (recyclerView.f1068F.mo16081r(c0829mo, aevVar, aevVar2)) {
                recyclerView.m1220S();
            }
        }

        /* JADX INFO: renamed from: q */
        public final void m1644q(Drawable drawable) {
            if (drawable != null) {
                super/*mjf*/.setBackgroundDrawable(drawable);
            }
        }

        /* JADX INFO: renamed from: r */
        public final boolean m1645r() {
            return ((FloatingActionButton) this.f1697a).f8149b;
        }

        /* JADX INFO: renamed from: s */
        public final File m1646s(lxm lxmVar) {
            lxmVar.getClass();
            return omn.m18708m(omn.m18708m((File) this.f1697a, "resource_" + lxmVar.f39511a), "annotachment_" + lxmVar.f39521k);
        }

        public final void setAmbientOffloadEnabled(boolean z) {
            AmbientDelegate ambientDelegate = ((AmbientMode) this.f1697a).f1693a;
            if (ambientDelegate != null) {
                ambientDelegate.setAmbientOffloadEnabled(z);
            }
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, jga] */
        /* JADX INFO: renamed from: t */
        public final void m1647t(jcu jcuVar) {
            this.f1697a.mo13030i(jcuVar);
        }

        /* JADX INFO: renamed from: u */
        public final boolean m1648u() {
            WearInlineSlider wearInlineSlider = (WearInlineSlider) this.f1697a;
            float f = wearInlineSlider.f7537d;
            float f2 = wearInlineSlider.f7535b;
            if (f == f2) {
                return false;
            }
            wearInlineSlider.m4620m(jbx.m12864i(f - wearInlineSlider.f7534a, f2, wearInlineSlider.f7536c), false);
            return true;
        }

        /* JADX INFO: renamed from: v */
        public final boolean m1649v() {
            WearInlineSlider wearInlineSlider = (WearInlineSlider) this.f1697a;
            float f = wearInlineSlider.f7537d;
            float f2 = wearInlineSlider.f7536c;
            if (f == f2) {
                return false;
            }
            wearInlineSlider.m4620m(jbx.m12864i(f + wearInlineSlider.f7534a, wearInlineSlider.f7535b, f2), false);
            return true;
        }

        /* JADX INFO: renamed from: w */
        public final boolean m1650w(View view) {
            return view.getParent() == this.f1697a;
        }
    }

    public static AmbientController attachAmbientSupport(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        AmbientMode ambientMode = (AmbientMode) fragmentManager.findFragmentByTag("android.support.wearable.ambient.AmbientMode");
        if (ambientMode == null) {
            ambientMode = new AmbientMode();
            fragmentManager.beginTransaction().add(ambientMode, "android.support.wearable.ambient.AmbientMode").commit();
        }
        return ambientMode.f1696d;
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        AmbientDelegate ambientDelegate = this.f1693a;
        if (ambientDelegate != null) {
            ambientDelegate.m1595a(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f1693a = new AmbientDelegate(getActivity(), this.f1695c);
        if (context instanceof AmbientCallbackProvider) {
            this.f1694b = ((AmbientCallbackProvider) context).getAmbientCallback();
        } else {
            Log.w("AmbientMode", NptsKnlVczSZ.QfwmRMzHnIZFcQ);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1693a.m1599b();
        if (this.f1694b != null) {
            this.f1693a.m1604g();
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        this.f1693a.m1600c();
        super.onDestroy();
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        this.f1693a = null;
        super.onDetach();
    }

    @Override // android.app.Fragment
    public final void onPause() {
        this.f1693a.m1601d();
        super.onPause();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f1693a.m1602e();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        this.f1693a.m1603f();
        super.onStop();
    }
}
