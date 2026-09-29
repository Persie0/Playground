package androidx.compose.p002ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.compose.p002ui.R$id;
import androidx.compose.p002ui.node.C0358h;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.AbstractC0279g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p000.AbstractC3393o1;
import p000.AbstractC3489q9;
import p000.C3042gl;
import p000.C3110ig;
import p000.C3115il;
import p000.C3610tg;
import p000.a02;
import p000.b64;
import p000.bn0;
import p000.cb9;
import p000.ci8;
import p000.d32;
import p000.di2;
import p000.dr3;
import p000.dua;
import p000.fa4;
import p000.fb9;
import p000.fs6;
import p000.gi5;
import p000.gr7;
import p000.jl8;
import p000.kf1;
import p000.kl8;
import p000.li5;
import p000.mc1;
import p000.nw4;
import p000.pa3;
import p000.pk9;
import p000.pv3;
import p000.pvc;
import p000.q04;
import p000.s04;
import p000.s46;
import p000.t66;
import p000.tg4;
import p000.tj3;
import p000.ub5;
import p000.ue1;
import p000.ui3;
import p000.vh9;
import p000.vi3;
import p000.vl8;
import p000.vva;
import p000.we1;
import p000.x18;
import p000.x64;
import p000.x87;
import p000.xc9;
import p000.xfa;
import p000.y78;
import p000.ye1;
import p000.yg4;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.ui.platform.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0401m {

    /* JADX INFO: renamed from: a */
    public final View f4786a;

    /* JADX INFO: renamed from: b */
    public final kf1 f4787b;

    /* JADX INFO: renamed from: c */
    public final ub5 f4788c;

    /* JADX INFO: renamed from: d */
    public final vl8 f4789d;

    /* JADX INFO: renamed from: e */
    public final dua f4790e;

    /* JADX INFO: renamed from: f */
    public final s04 f4791f;

    /* JADX INFO: renamed from: g */
    public final y78 f4792g;

    /* JADX INFO: renamed from: h */
    public final Configuration f4793h;

    /* JADX INFO: renamed from: i */
    public final t66 f4794i;

    /* JADX INFO: renamed from: j */
    public final C3110ig f4795j;

    /* JADX INFO: renamed from: k */
    public final C3042gl f4796k;

    /* JADX INFO: renamed from: l */
    public final b64 f4797l;

    /* JADX INFO: renamed from: m */
    public final C3610tg f4798m;

    /* JADX INFO: renamed from: n */
    public final pa3 f4799n;

    /* JADX INFO: renamed from: o */
    public final t66 f4800o;

    /* JADX INFO: renamed from: p */
    public final dr3 f4801p;

    /* JADX INFO: renamed from: q */
    public final C3115il f4802q;

    /* JADX INFO: renamed from: r */
    public final C0358h f4803r;

    /* JADX INFO: renamed from: s */
    public final nw4 f4804s;

    /* JADX INFO: renamed from: t */
    public final bn0 f4805t;

    /* JADX INFO: renamed from: u */
    public int f4806u;

    /* JADX INFO: renamed from: v */
    public final ui3 f4807v;

    /* JADX INFO: renamed from: w */
    public final ue1 f4808w;

    public C0401m(C0401m c0401m, View view, kf1 kf1Var, ub5 ub5Var, vl8 vl8Var, dua duaVar) {
        s04 s04Var;
        Configuration configuration;
        t66 t66VarM1260j;
        C3110ig c3110ig;
        C3042gl c3042gl;
        b64 b64Var;
        C3610tg c3610tg;
        pa3 gr7Var;
        t66 t66VarM1259i;
        C3115il c3115il;
        bn0 bn0Var;
        C0358h c0358h;
        y78 y78Var;
        View view2;
        boolean zM11650l = fa4.m11650l((c0401m == null || (view2 = c0401m.f4786a) == null) ? null : view2.getContext(), view.getContext());
        this.f4786a = view;
        this.f4787b = kf1Var;
        this.f4788c = ub5Var;
        this.f4789d = vl8Var;
        this.f4790e = duaVar;
        if (zM11650l) {
            c0401m.getClass();
            s04Var = c0401m.f4791f;
        } else {
            s04Var = new s04();
        }
        this.f4791f = s04Var;
        this.f4792g = (c0401m == null || (y78Var = c0401m.f4792g) == null) ? new y78() : y78Var;
        if (zM11650l) {
            c0401m.getClass();
            configuration = c0401m.f4793h;
        } else {
            configuration = new Configuration(view.getContext().getResources().getConfiguration());
        }
        this.f4793h = configuration;
        if (zM11650l) {
            c0401m.getClass();
            t66VarM1260j = c0401m.f4794i;
        } else {
            t66VarM1260j = AbstractC0278f.m1260j(new Configuration(configuration));
        }
        this.f4794i = t66VarM1260j;
        if (zM11650l) {
            c0401m.getClass();
            c3110ig = c0401m.f4795j;
        } else {
            c3110ig = new C3110ig(view.getContext());
        }
        this.f4795j = c3110ig;
        if (zM11650l) {
            c0401m.getClass();
            c3042gl = c0401m.f4796k;
        } else {
            c3042gl = new C3042gl(view.getContext());
        }
        this.f4796k = c3042gl;
        if (zM11650l) {
            c0401m.getClass();
            b64Var = c0401m.f4797l;
        } else {
            b64Var = new b64(view.getContext(), 4);
        }
        this.f4797l = b64Var;
        if (zM11650l) {
            c0401m.getClass();
            c3610tg = c0401m.f4798m;
        } else {
            c3610tg = new C3610tg(b64Var);
        }
        this.f4798m = c3610tg;
        if (zM11650l) {
            c0401m.getClass();
            gr7Var = c0401m.f4799n;
        } else {
            view.getContext();
            gr7Var = new gr7(6);
        }
        this.f4799n = gr7Var;
        if (zM11650l) {
            c0401m.getClass();
            t66VarM1259i = c0401m.f4800o;
        } else {
            t66VarM1259i = AbstractC0278f.m1259i(AbstractC3489q9.m19780j(view.getContext()), s46.f60290e);
        }
        this.f4800o = t66VarM1259i;
        this.f4801p = view == (c0401m != null ? c0401m.f4786a : null) ? c0401m.f4801p : new x87(view);
        if (zM11650l) {
            c0401m.getClass();
            c3115il = c0401m.f4802q;
        } else {
            c3115il = new C3115il(ViewConfiguration.get(view.getContext()));
        }
        this.f4802q = c3115il;
        this.f4803r = (c0401m == null || (c0358h = c0401m.f4803r) == null) ? new C0358h() : c0358h;
        this.f4804s = new nw4();
        this.f4805t = (c0401m == null || (bn0Var = c0401m.f4805t) == null) ? new bn0() : bn0Var;
        this.f4807v = new ComposeViewContext$calculateWindowSizeLambda$1(this);
        this.f4808w = new ue1(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m1800a(final ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c, final zi3 zi3Var, ye1 ye1Var, final int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(123858079);
        int i2 = (tj3Var.m22124i(viewTreeObserverOnGlobalLayoutListenerC0391c) ? 4 : 2) | i | (tj3Var.m22124i(zi3Var) ? 32 : 16) | (tj3Var.m22124i(this) ? 256 : 128);
        boolean z = true;
        char c = 1;
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            Object tag = viewTreeObserverOnGlobalLayoutListenerC0391c.getTag(R$id.inspection_slot_table_set);
            LinkedHashMap linkedHashMap = null;
            Set set = (!(tag instanceof Set) || ((tag instanceof tg4) && !(tag instanceof yg4))) ? null : (Set) tag;
            if (set == null) {
                ViewParent parent = viewTreeObserverOnGlobalLayoutListenerC0391c.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(R$id.inspection_slot_table_set) : null;
                set = (!(tag2 instanceof Set) || ((tag2 instanceof tg4) && !(tag2 instanceof yg4))) ? null : (Set) tag2;
            }
            if (set != null) {
                set.add(tj3Var.m22148z());
                tj3Var.f62403q = true;
                tj3Var.f62368C = true;
                tj3Var.f62389c.m4490f();
                tj3Var.f62373H.m4490f();
                fb9 fb9Var = tj3Var.f62374I;
                cb9 cb9Var = fb9Var.f38800a;
                fb9Var.f38804e = cb9Var.f9851j;
                fb9Var.f38805f = cb9Var.f9852k;
            }
            Object objM22097O = tj3Var.m22097O();
            vl8 vl8Var = this.f4789d;
            Object obj = we1.f66679a;
            if (objM22097O == obj) {
                ViewParent parent2 = viewTreeObserverOnGlobalLayoutListenerC0391c.getParent();
                parent2.getClass();
                View view2 = (View) parent2;
                Object tag3 = view2.getTag(R$id.compose_view_saveable_id_tag);
                String strValueOf = tag3 instanceof String ? (String) tag3 : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view2.getId());
                }
                String strM17734i = AbstractC3393o1.m17734i("SaveableStateRegistry:", strValueOf);
                fs6 fs6VarMo2118t = vl8Var.mo2118t();
                Bundle bundleM12108m = fs6VarMo2118t.m12108m(strM17734i);
                if (bundleM12108m != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str : bundleM12108m.keySet()) {
                        ArrayList parcelableArrayList = bundleM12108m.getParcelableArrayList(str);
                        parcelableArrayList.getClass();
                        linkedHashMap.put(str, parcelableArrayList);
                    }
                }
                vh9 vh9Var = kl8.f47496a;
                jl8 jl8Var = new jl8(linkedHashMap, C0380xcceb09c3.f4572b);
                if (fs6VarMo2118t.m12116w(strM17734i) != null) {
                    z = false;
                } else {
                    try {
                        fs6VarMo2118t.m12094I(strM17734i, new mc1(jl8Var, c == true ? 1 : 0));
                    } catch (IllegalArgumentException unused) {
                        z = false;
                    }
                }
                Object di2Var = new di2(jl8Var, new C0379xec1ea390(z, fs6VarMo2118t, strM17734i));
                tj3Var.m22131l0(di2Var);
                objM22097O = di2Var;
            }
            final di2 di2Var2 = (di2) objM22097O;
            boolean zM22124i = tj3Var.m22124i(di2Var2);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22124i || objM22097O2 == obj) {
                objM22097O2 = new vi3() { // from class: androidx.compose.ui.platform.ComposeViewContext$ProvideCompositionLocals$1$1
                    {
                        super(1);
                    }

                    @Override // p000.vi3
                    public final Object invoke(Object obj2) {
                        return new C0400l(di2Var2);
                    }
                };
                tj3Var.m22131l0(objM22097O2);
            }
            d32.m10041h(xfa.f68157a, (vi3) objM22097O2, tj3Var);
            AbstractC0279g abstractC0279g = AbstractC0402n.f4832x;
            boolean zBooleanValue = ((Boolean) tj3Var.m22128k(abstractC0279g)).booleanValue() | viewTreeObserverOnGlobalLayoutListenerC0391c.getScrollCaptureInProgress$ui();
            boolean zM22120g = tj3Var.m22120g(viewTreeObserverOnGlobalLayoutListenerC0391c.getView());
            Object objM22097O3 = tj3Var.m22097O();
            if (zM22120g || objM22097O3 == obj) {
                objM22097O3 = new vva(viewTreeObserverOnGlobalLayoutListenerC0391c.getView());
                tj3Var.m22131l0(objM22097O3);
            }
            pvc.m19508d(new a02[]{gi5.f40854a.mo1265a(this.f4788c), li5.f49717a.mo1265a(vl8Var), AbstractC0394f.f4763d.mo1265a(this.f4791f), AbstractC0394f.f4764e.mo1265a(this.f4792g), AbstractC0394f.f4761b.mo1265a(viewTreeObserverOnGlobalLayoutListenerC0391c.getContext()), x64.f67818a.mo1265a(set), AbstractC0394f.f4760a.mo1265a(viewTreeObserverOnGlobalLayoutListenerC0391c.getConfiguration()), kl8.f47496a.mo1265a(di2Var2), AbstractC0394f.f4765f.mo1265a(viewTreeObserverOnGlobalLayoutListenerC0391c.getView()), abstractC0279g.mo1265a(Boolean.valueOf(zBooleanValue)), AbstractC0402n.f4829u.mo1265a(viewTreeObserverOnGlobalLayoutListenerC0391c.getViewConfiguration()), pv3.f56852a.mo1265a((vva) objM22097O3)}, ci8.m4703P(1317454175, new zi3() { // from class: androidx.compose.ui.platform.ComposeViewContext$ProvideCompositionLocals$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj2, Object obj3) {
                    ye1 ye1Var2 = (ye1) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    tj3 tj3Var2 = (tj3) ye1Var2;
                    if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        tj3Var2.m22111b0(866651995);
                        AbstractC0402n.m1804a(viewTreeObserverOnGlobalLayoutListenerC0391c, this.f4796k, zi3Var, tj3Var2, 0);
                        tj3Var2.m22139q(false);
                    } else {
                        tj3Var2.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var), tj3Var, 56);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(viewTreeObserverOnGlobalLayoutListenerC0391c, zi3Var, i) { // from class: androidx.compose.ui.platform.ComposeViewContext$ProvideCompositionLocals$3

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0391c f4538c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ zi3 f4539d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj2, Object obj3) {
                    ((Number) obj3).intValue();
                    int iM19383z = pk9.m19383z(1);
                    this.f4537b.m1800a(this.f4538c, this.f4539d, (ye1) obj2, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1801b() {
        int i = this.f4806u - 1;
        this.f4806u = i;
        if (i < 0) {
            Log.e("ComposeViewContext", "View count has dropped below 0");
            this.f4806u = 0;
        }
        if (this.f4806u == 0) {
            View view = this.f4786a;
            Context context = view.getContext();
            ue1 ue1Var = this.f4808w;
            context.unregisterComponentCallbacks(ue1Var);
            nw4 nw4Var = this.f4804s;
            if (nw4Var.f53324b == null) {
                nw4Var.f53323a = null;
            }
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(ue1Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1802c() {
        int i = this.f4806u + 1;
        this.f4806u = i;
        if (i == 1) {
            View view = this.f4786a;
            Context context = view.getContext();
            ue1 ue1Var = this.f4808w;
            context.registerComponentCallbacks(ue1Var);
            m1803d(view.getResources().getConfiguration());
            boolean zHasWindowFocus = view.hasWindowFocus();
            nw4 nw4Var = this.f4804s;
            ((xc9) nw4Var.f53325c).setValue(Boolean.valueOf(zHasWindowFocus));
            t66 t66Var = nw4Var.f53324b;
            ui3 ui3Var = this.f4807v;
            if (t66Var == null) {
                nw4Var.f53323a = ui3Var;
            }
            if (t66Var != null) {
                ((xc9) t66Var).setValue(((ComposeViewContext$calculateWindowSizeLambda$1) ui3Var).mo0a());
            }
            view.getViewTreeObserver().addOnWindowFocusChangeListener(ue1Var);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1803d(Configuration configuration) {
        int iUpdateFrom = this.f4793h.updateFrom(configuration);
        if (iUpdateFrom != 0) {
            Iterator it = this.f4791f.f60130a.entrySet().iterator();
            while (it.hasNext()) {
                q04 q04Var = (q04) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (q04Var == null || Configuration.needNewResources(iUpdateFrom, q04Var.f57070b)) {
                    it.remove();
                }
            }
            this.f4794i.setValue(new Configuration(configuration));
            y78 y78Var = this.f4792g;
            synchronized (y78Var) {
                y78Var.f69418a.m21844c();
            }
            if ((268435456 & iUpdateFrom) != 0) {
                this.f4800o.setValue(AbstractC3489q9.m19780j(this.f4786a.getContext()));
            }
            if ((805248384 & iUpdateFrom) != 0) {
                nw4 nw4Var = this.f4804s;
                ui3 ui3Var = this.f4807v;
                t66 t66Var = nw4Var.f53324b;
                if (t66Var != null) {
                    ((xc9) t66Var).setValue(((ComposeViewContext$calculateWindowSizeLambda$1) ui3Var).mo0a());
                }
            }
        }
    }
}
