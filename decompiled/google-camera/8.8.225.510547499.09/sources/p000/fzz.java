package p000;

import android.R;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.cameravisionkit.olQ.BEeWZPor;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuContainer;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuView;
import java.util.concurrent.atomic.AtomicBoolean;
import p021j$.util.Collection$EL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fzz implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f24008a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f24009b;

    public /* synthetic */ fzz(eip eipVar, int i, byte[] bArr) {
        this.f24009b = i;
        this.f24008a = eipVar;
    }

    public /* synthetic */ fzz(gae gaeVar, int i) {
        this.f24009b = i;
        this.f24008a = gaeVar;
    }

    public /* synthetic */ fzz(gao gaoVar, int i) {
        this.f24009b = i;
        this.f24008a = gaoVar;
    }

    public /* synthetic */ fzz(gap gapVar, int i) {
        this.f24009b = i;
        this.f24008a = gapVar;
    }

    public /* synthetic */ fzz(gaq gaqVar, int i) {
        this.f24009b = i;
        this.f24008a = gaqVar;
    }

    public /* synthetic */ fzz(gar garVar, int i) {
        this.f24009b = i;
        this.f24008a = garVar;
    }

    public /* synthetic */ fzz(gbl gblVar, int i) {
        this.f24009b = i;
        this.f24008a = gblVar;
    }

    public fzz(gdn gdnVar, int i) {
        this.f24009b = i;
        this.f24008a = gdnVar;
    }

    public /* synthetic */ fzz(geo geoVar, int i) {
        this.f24009b = i;
        this.f24008a = geoVar;
    }

    public /* synthetic */ fzz(ggr ggrVar, int i) {
        this.f24009b = i;
        this.f24008a = ggrVar;
    }

    public fzz(ghn ghnVar, int i) {
        this.f24009b = i;
        this.f24008a = ghnVar;
    }

    public /* synthetic */ fzz(kba kbaVar, int i) {
        this.f24009b = i;
        this.f24008a = kbaVar;
    }

    public /* synthetic */ fzz(kov kovVar, int i) {
        this.f24009b = i;
        this.f24008a = kovVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kba] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kba] */
    /* JADX WARN: Type inference failed for: r0v45, types: [fbp, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 4;
        boolean z = true;
        switch (this.f24009b) {
            case 0:
                this.f24008a.close();
                return;
            case 1:
                this.f24008a.close();
                return;
            case 2:
                gae gaeVar = (gae) this.f24008a;
                gaeVar.f24016a.mo13961e("Low Priority OneCamera Shutdown");
                gaeVar.m8994a();
                gaeVar.f24016a.mo13962f();
                return;
            case 3:
                gar garVar = (gar) this.f24008a;
                if (garVar.f24050c.getAndSet(false)) {
                    garVar.f24048a.f23574b.mo7883a();
                    return;
                }
                return;
            case 4:
                ((gao) this.f24008a).m9006i();
                return;
            case 5:
                ((gao) this.f24008a).m9000c();
                return;
            case 6:
                ((gao) this.f24008a).m9001d();
                return;
            case 7:
                ((gap) this.f24008a).m9007c();
                return;
            case 8:
                Object obj = this.f24008a;
                gap gapVar = (gap) obj;
                gapVar.m9007c();
                if (gapVar.f24043d.f24050c.get()) {
                    synchronized (obj) {
                        int i2 = ((gap) obj).f24041b + 1;
                        ((gap) obj).f24041b = i2;
                        if (i2 > ((gap) obj).f24040a) {
                            z = false;
                        }
                        lku.m15613H(z);
                        float f = ((gap) obj).f24041b / ((gap) obj).f24040a;
                        if (f == 1.0f) {
                            ((gap) obj).f24043d.f24050c.set(false);
                        }
                        long j = ((gap) obj).f24042c;
                        if (j > 0) {
                            ((gap) obj).f24043d.f24048a.f23574b.mo7888f(f, j);
                        } else {
                            ((gap) obj).f24043d.f24048a.f23574b.mo7887e(f, ((gap) obj).f24040a - ((gap) obj).f24041b);
                        }
                        break;
                    }
                    return;
                }
                return;
            case 9:
                gaq gaqVar = (gaq) this.f24008a;
                if (gaqVar.f24046a || !gaqVar.f24047b.f24050c.get()) {
                    return;
                }
                gaqVar.f24046a = true;
                gaqVar.f24047b.m9014g();
                return;
            case 10:
                jws jwsVar = ((gbl) this.f24008a).f24105c;
                lku.m15662p(jwsVar);
                jwsVar.m13643c();
                return;
            case 11:
                fcp fcpVar = ((gdn) this.f24008a).f24326a;
                int i3 = mws.f41739d;
                mws mwsVar = mzr.f41857a;
                fcpVar.mo8147V(1, "api2_lost_images", null, -1, -1, 0, mwsVar, mwsVar, kcl.CAMERA_ERROR_CODE_UNKNOWN, false);
                return;
            case 12:
                geo geoVar = (geo) this.f24008a;
                Collection$EL.forEach(geoVar.f24411o, new fvi(geoVar, 5));
                geoVar.f24410n.m9098i(geoVar.m9103B());
                return;
            case 13:
                geo geoVar2 = (geo) this.f24008a;
                geoVar2.f24400d.mo13961e("updateOptionsBar");
                ikw ikwVar = (ikw) geoVar2.f24398b.mo3831be();
                geoVar2.f24407k.get();
                geoVar2.f24407k.set(false);
                geoVar2.f24408l.clear();
                boolean zIsEnabled = geoVar2.f24405i.isEnabled();
                geoVar2.f24405i.m4241h();
                OptionsMenuContainer optionsMenuContainer = geoVar2.f24405i;
                if (optionsMenuContainer.f6828f.getParent() != null) {
                    ((ViewManager) optionsMenuContainer.f6828f.getParent()).removeView(optionsMenuContainer.f6828f);
                }
                OptionsMenuView optionsMenuViewM4238e = geoVar2.f24405i.m4238e();
                synchronized (optionsMenuViewM4238e) {
                    LinearLayout linearLayout = optionsMenuViewM4238e.f6847g;
                    linearLayout.getClass();
                    linearLayout.removeAllViews();
                    optionsMenuViewM4238e.f6842b.clear();
                    break;
                }
                if (ikwVar == ikw.IMAGE_INTENT || ikwVar == ikw.VIDEO_INTENT) {
                    OptionsMenuContainer optionsMenuContainer2 = geoVar2.f24405i;
                    gey geyVar = geoVar2.f24402f;
                    int color = optionsMenuContainer2.f6829g.getResources().getColor(R.color.transparent, null);
                    optionsMenuContainer2.f6828f.setImageResource(C0100R.drawable.options_menu_close_button);
                    optionsMenuContainer2.f6828f.setContentDescription(optionsMenuContainer2.f6829g.getResources().getString(C0100R.string.accessibility_close_button));
                    optionsMenuContainer2.f6828f.setBackgroundColor(color);
                    optionsMenuContainer2.f6828f.setOnClickListener(new flr(geyVar, 4));
                    optionsMenuContainer2.f6828f.setOnTouchListener(ggc.f24643a);
                    int i4 = optionsMenuContainer2.f6833k;
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i4, i4);
                    layoutParams.addRule(17, optionsMenuContainer2.m4237d().getId());
                    optionsMenuContainer2.f6828f.setLayoutParams(layoutParams);
                    optionsMenuContainer2.m4237d().addView(optionsMenuContainer2.f6828f);
                }
                OptionsMenuContainer optionsMenuContainer3 = geoVar2.f24405i;
                optionsMenuContainer3.m4235b().setBackground(null);
                int dimensionPixelOffset = optionsMenuContainer3.getResources().getDimensionPixelOffset(C0100R.dimen.options_menu_internal_side_padding);
                int dimensionPixelOffset2 = optionsMenuContainer3.getResources().getDimensionPixelOffset(C0100R.dimen.options_menu_internal_vertical_padding);
                optionsMenuContainer3.m4238e().setBackgroundResource(C0100R.drawable.options_menu_background);
                optionsMenuContainer3.m4238e().setPadding(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2);
                ViewGroup.LayoutParams layoutParams2 = optionsMenuContainer3.m4238e().getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams.leftMargin = 0;
                    marginLayoutParams.rightMargin = 0;
                    optionsMenuContainer3.m4238e().setLayoutParams(layoutParams2);
                }
                optionsMenuContainer3.m4238e().setAlpha(1.0f);
                optionsMenuContainer3.m4238e().setVisibility(0);
                optionsMenuContainer3.m4236c().setVisibility(0);
                geoVar2.m9120f(Collection$EL.stream(geoVar2.f24411o));
                naz nazVarListIterator = geoVar2.f24411o.listIterator();
                while (nazVarListIterator.hasNext()) {
                    geoVar2.m9137x((gfb) nazVarListIterator.next());
                }
                if (zIsEnabled) {
                    geoVar2.f24405i.m4242i();
                }
                geoVar2.f24400d.mo13962f();
                return;
            case 14:
                geo geoVar3 = (geo) this.f24008a;
                mxk mxkVarM17134F = mxk.m17134F(geoVar3.f24408l);
                geoVar3.f24408l.clear();
                Collection$EL.forEach(mxkVarM17134F, new fvi(geoVar3, 8));
                geoVar3.m9120f(Collection$EL.stream(geoVar3.f24411o).filter(new dam(mxkVarM17134F, 14)));
                Collection$EL.stream(geoVar3.f24411o).filter(new dam(mxkVarM17134F, 15)).forEach(new fvi(geoVar3, i));
                return;
            case 15:
                Object obj2 = this.f24008a;
                synchronized (((kov) obj2).f36716c) {
                    int i5 = ((kov) obj2).f36721h;
                    if (i5 > 0) {
                        i5--;
                        ((kov) obj2).f36721h = i5;
                    }
                    if (i5 == 0) {
                        ((kov) obj2).f36717d.disable();
                    }
                    break;
                }
                return;
            case 16:
                Object obj3 = this.f24008a;
                synchronized (((kov) obj3).f36716c) {
                    ((kov) obj3).f36721h++;
                    ((kov) obj3).f36717d.enable();
                    break;
                }
                return;
            case 17:
                ?? r0 = this.f24008a;
                final ggr ggrVar = (ggr) r0;
                ggp.m9224a(ggrVar.f24696a);
                ggrVar.f24698c.m3798a(new cid() { // from class: ggq
                    @Override // p000.cid
                    /* JADX INFO: renamed from: a */
                    public final void mo3797a(Throwable th) {
                        ggrVar.m9225a();
                    }
                });
                fdh.m8264d(ggrVar.f24699d, ggrVar.f24697b, r0);
                return;
            case 18:
                Context context = ((ggr) this.f24008a).f24696a;
                jon jonVarM13408a = jok.m13408a(context);
                String strValueOf = String.valueOf(context.getPackageName());
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                if (jor.f34491a == -1) {
                    synchronized (jgj.f33964a) {
                        break;
                    }
                }
                jpd.m13420a(3, jonVarM13408a, BEeWZPor.llcFNIdmuh.concat(strValueOf), atomicBoolean, Math.max(jor.f34491a, 2000L));
                return;
            case 19:
                ghn ghnVar = (ghn) this.f24008a;
                ghnVar.f24764a.m3466c(ghnVar.f24767d);
                nqf nqfVar = ((ghn) this.f24008a).f24766c;
                if (nqfVar != null) {
                    nqfVar.mo14894e(null);
                    return;
                }
                return;
            default:
                ghn ghnVar2 = (ghn) this.f24008a;
                ghnVar2.f24764a.m3465b(ghnVar2.f24767d);
                return;
        }
    }
}
