package p000;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.toast.ToastView;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p021j$.util.Collection$EL;
import p021j$.util.stream.Collectors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hps implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f28992a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f28993b;

    public /* synthetic */ hps(ToastView toastView, int i) {
        this.f28993b = i;
        this.f28992a = toastView;
    }

    public /* synthetic */ hps(hpu hpuVar, int i) {
        this.f28993b = i;
        this.f28992a = hpuVar;
    }

    public /* synthetic */ hps(hqk hqkVar, int i) {
        this.f28993b = i;
        this.f28992a = hqkVar;
    }

    public /* synthetic */ hps(hrk hrkVar, int i) {
        this.f28993b = i;
        this.f28992a = hrkVar;
    }

    public /* synthetic */ hps(hrp hrpVar, int i) {
        this.f28993b = i;
        this.f28992a = hrpVar;
    }

    public /* synthetic */ hps(hru hruVar, int i) {
        this.f28993b = i;
        this.f28992a = hruVar;
    }

    public /* synthetic */ hps(hrz hrzVar, int i) {
        this.f28993b = i;
        this.f28992a = hrzVar;
    }

    public /* synthetic */ hps(hst hstVar, int i) {
        this.f28993b = i;
        this.f28992a = hstVar;
    }

    public hps(hua huaVar, int i) {
        this.f28993b = i;
        this.f28992a = huaVar;
    }

    public /* synthetic */ hps(kba kbaVar, int i) {
        this.f28993b = i;
        this.f28992a = kbaVar;
    }

    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, kba] */
    /* JADX WARN: Type inference failed for: r0v52, types: [hrz, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        mws mwsVarM17081f;
        int i = 8;
        int i2 = 2;
        switch (this.f28993b) {
            case 0:
                Object obj = this.f28992a;
                ((nbe) ((nbe) hpu.f28995a.m17252c()).mo17276G((char) 3874)).mo17290o("Device temperature is too high to do recording.");
                hpu hpuVar = (hpu) obj;
                hpuVar.f29004j.m10595a();
                hpuVar.f29001g.m11119d(hpuVar.f29004j.m10605k() ? idk.RECORDING_STOPPED : idk.RECORDING_DISABLED);
                jfo jfoVar = hpuVar.f29008n;
                ((hpm) jfoVar.f33911b).f28920e.set(true);
                ((hpm) jfoVar.f33911b).m10590h();
                break;
            case 1:
                hpu hpuVar2 = (hpu) this.f28992a;
                hpuVar2.f29004j.m10596b();
                hpuVar2.f29001g.m11116a(idk.RECORDING_STOPPED);
                hpuVar2.f29001g.m11116a(idk.RECORDING_DISABLED);
                ((hpm) hpuVar2.f29008n.f33911b).f28920e.set(false);
                break;
            case 2:
                hqk hqkVar = (hqk) this.f28992a;
                if (hqkVar.f29070R.indexOfChild(hqkVar.f29066N) != -1) {
                    idb idbVar = hqkVar.f29059G;
                    if (idbVar != null) {
                        hqkVar.f29089l.mo7482d(idbVar);
                    }
                    hqkVar.f29066N.setAlpha(0.0f);
                    hqkVar.f29066N.setVisibility(0);
                    hqkVar.f29067O.setAlpha(0.0f);
                    hqkVar.f29067O.bringToFront();
                    hqkVar.f29067O.setVisibility(0);
                    hqkVar.f29060H = ObjectAnimator.ofFloat(hqkVar.f29066N, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(5000L);
                    hqkVar.f29060H.start();
                    dhv dhvVar = hqkVar.f29086i;
                    dhw dhwVar = diy.f11744a;
                    dhvVar.mo6175c();
                    hqkVar.f29063K = hqkVar.f29092o.schedule(new hps(hqkVar, 9), 600L, TimeUnit.SECONDS);
                    break;
                }
                break;
            case 3:
                hqk hqkVar2 = (hqk) this.f28992a;
                dbr dbrVar = hqkVar2.f29081d;
                Context context = hqkVar2.f29083f;
                dhv dhvVar2 = hqkVar2.f29086i;
                djm djmVar = hqkVar2.f29074V;
                mwn mwnVar = new mwn();
                if (!dhvVar2.mo6184l(diy.f11746c) || !dhvVar2.mo6184l(diy.f11747d)) {
                    mwnVar.m17082g(jxp.RES_720P);
                    mwsVarM17081f = mwnVar.m17081f();
                } else if (djmVar.m6238m(context, dbrVar.mo5895d())) {
                    mwnVar.m17082g(jxp.RES_1080P);
                    mwnVar.m17082g(jxp.RES_2160P);
                    mwsVarM17081f = mwnVar.m17081f();
                } else {
                    mwnVar.m17082g(jxp.RES_1080P);
                    mwsVarM17081f = mwnVar.m17081f();
                }
                hqkVar2.f29097t.mo3415bf(Boolean.valueOf(((List) Collection$EL.stream(mwsVarM17081f).map(hgq.f27723q).filter(fjv.f22324r).map(hgq.f27722p).collect(Collectors.toList())).size() > 1 && hqkVar2.f29086i.mo6184l(diy.f11747d)));
                break;
            case 4:
                ((hqk) this.f28992a).f29102y.mo9213a(hqk.class);
                break;
            case 5:
                hqk hqkVar3 = (hqk) this.f28992a;
                if (hqkVar3.f29068P.indexOfChild(hqkVar3.f29058F) != -1) {
                    hqkVar3.f29058F.setAlpha(0.0f);
                    hqkVar3.f29058F.bringToFront();
                    hqkVar3.f29058F.setVisibility(0);
                    hqkVar3.f29060H = ObjectAnimator.ofFloat(hqkVar3.f29058F, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(3000L);
                    hqkVar3.f29060H.start();
                    hqkVar3.f29063K = hqkVar3.f29092o.scheduleAtFixedRate(new hps(hqkVar3, i), 60L, 60L, TimeUnit.SECONDS);
                    break;
                }
                break;
            case 6:
                hqk hqkVar4 = (hqk) this.f28992a;
                TextView textView = hqkVar4.f29064L;
                if (textView != null && hqkVar4.f29058F.indexOfChild(textView) != -1) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) hqkVar4.f29064L.getLayoutParams();
                    int i3 = layoutParams.topMargin;
                    if (i3 - hqkVar4.f29071S >= 30) {
                        layoutParams.topMargin = i3 - 30;
                    } else {
                        layoutParams.topMargin = i3 + 30;
                    }
                    hqkVar4.f29064L.setLayoutParams(layoutParams);
                }
                break;
            case 7:
                hqk hqkVar5 = (hqk) this.f28992a;
                hqkVar5.f29088k.m13541c(new hps(hqkVar5, i2));
                break;
            case 8:
                hqk hqkVar6 = (hqk) this.f28992a;
                hqkVar6.f29088k.m13541c(new hps(hqkVar6, 6));
                break;
            case 9:
                hqk hqkVar7 = (hqk) this.f28992a;
                hqkVar7.f29088k.m13541c(new hps(hqkVar7, 5));
                break;
            case 10:
                ((hqk) this.f28992a).f29102y.mo9214b(hqk.class);
                break;
            case 11:
                ToastView toastView = (ToastView) this.f28992a;
                toastView.animate().alpha(0.0f).withEndAction(toastView.f6987k).setDuration(ToastView.f6980e.toMillis()).translationYBy(toastView.f6983g).start();
                break;
            case 12:
                Object obj2 = this.f28992a;
                ToastView toastView2 = (ToastView) obj2;
                toastView2.mo4310c();
                try {
                    ((ToastView) obj2).f6989m.showAtLocation(((ToastView) obj2).f6990n, 0, 0, 0);
                } catch (RuntimeException e) {
                    ((nbe) ((nbe) ToastView.f6981f.m17251b()).mo17276G((char) 3916)).mo17293r("Cannot show the toast. Error = %s", e.getMessage());
                }
                toastView2.postDelayed(toastView2.f6985i, toastView2.f6984h);
                break;
            case 13:
                hrk hrkVar = (hrk) this.f28992a;
                boolean zBooleanValue = ((Boolean) hrkVar.f29301f.mo10031c(gzy.f27043b)).booleanValue();
                boolean z = ((Integer) hrkVar.f29301f.mo10031c(gzy.f27040ax)).intValue() == 1;
                if (!zBooleanValue && !z) {
                    hrkVar.f29298c.mo3415bf(true);
                } else if (hrkVar.f29303h == null) {
                    hrkVar.f29299d.mo9128n(hrkVar.f29304i);
                    jvd.m13538a();
                    mhs mhsVar = new mhs(hrkVar.f29296a, C0100R.style.Theme_Camera_MaterialAlertDialog);
                    mhsVar.m16389q(C0100R.string.first_run_done, new cdo(hrkVar, 18));
                    mhsVar.m16391s(C0100R.string.first_run_title);
                    hrn hrnVar = new hrn(hrkVar.f29296a);
                    chk chkVar = hrkVar.f29297b;
                    gfa gfaVar = hrkVar.f29299d;
                    ceb cebVar = hrkVar.f29300e;
                    fls flsVar = hrkVar.f29302g;
                    if (!hrnVar.f29322a) {
                        jvd.m13538a();
                        View.inflate(hrnVar.getContext(), C0100R.layout.first_run_education_view_layout, hrnVar);
                        LinearLayout linearLayout = (LinearLayout) hrnVar.findViewById(C0100R.id.first_run_contents);
                        if (cebVar.mo3542c() && zBooleanValue) {
                            ((TextView) hrnVar.findViewById(C0100R.id.settings_btn)).setOnClickListener(new flr(chkVar, 10));
                        } else {
                            linearLayout.removeView(hrnVar.findViewById(C0100R.id.location_entry));
                        }
                        if (z) {
                            ((TextView) hrnVar.findViewById(C0100R.id.options_btn)).setOnClickListener(new flr(gfaVar, 11));
                            hrnVar.findViewById(C0100R.id.motion_help).setOnClickListener(new flr(flsVar, 12));
                        } else {
                            linearLayout.removeView(hrnVar.findViewById(C0100R.id.motion_entry));
                        }
                        hrnVar.f29322a = true;
                    }
                    mhsVar.m16393u(hrnVar);
                    hrkVar.f29299d.mo9121g(hrkVar.f29304i);
                    hrkVar.f29303h = mhsVar.mo7256b();
                    DialogInterfaceC0155eg dialogInterfaceC0155eg = hrkVar.f29303h;
                    dialogInterfaceC0155eg.getClass();
                    dialogInterfaceC0155eg.setCanceledOnTouchOutside(false);
                    hrkVar.m10654c();
                } else {
                    hrkVar.m10654c();
                }
                break;
            case 14:
                this.f28992a.close();
                break;
            case 15:
                ((hrp) this.f28992a).mo10662h();
                break;
            case 16:
                this.f28992a.close();
                break;
            case 17:
                ((hru) this.f28992a).m10668k(true);
                break;
            case 18:
                ((hru) this.f28992a).m10668k(false);
                break;
            case 19:
                mhc mhcVar = ((hst) this.f28992a).f29440d;
                if (mhcVar != null) {
                    NestedScrollView nestedScrollView = (NestedScrollView) mhcVar.findViewById(C0100R.id.sheet_content);
                    nestedScrollView.getClass();
                    nestedScrollView.removeAllViews();
                    mhcVar.cancel();
                    View viewFindViewById = mhcVar.findViewById(C0100R.id.bottomsheet_container);
                    viewFindViewById.getClass();
                    viewFindViewById.setVisibility(8);
                }
                break;
            default:
                ((htx) this.f28992a).mo10752a();
                break;
        }
    }
}
