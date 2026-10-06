package p000;

import android.graphics.Point;
import android.graphics.Rect;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.smarts.SmartsUiGleamingView;
import com.google.android.apps.camera.stats.Instrumentation;
import com.google.android.apps.camera.stats.timing.TimingSession;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hea implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f27419a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f27420b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f27421c;

    public /* synthetic */ hea(View view, Runnable runnable, int i) {
        this.f27421c = i;
        this.f27419a = view;
        this.f27420b = runnable;
    }

    public /* synthetic */ hea(Instrumentation instrumentation, TimingSession timingSession, int i) {
        this.f27421c = i;
        this.f27419a = instrumentation;
        this.f27420b = timingSession;
    }

    public /* synthetic */ hea(hec hecVar, Point point, int i) {
        this.f27421c = i;
        this.f27420b = hecVar;
        this.f27419a = point;
    }

    public /* synthetic */ hea(hei heiVar, Runnable runnable, int i) {
        this.f27421c = i;
        this.f27419a = heiVar;
        this.f27420b = runnable;
    }

    public /* synthetic */ hea(hel helVar, Runnable runnable, int i) {
        this.f27421c = i;
        this.f27419a = helVar;
        this.f27420b = runnable;
    }

    public /* synthetic */ hea(heo heoVar, hev hevVar, int i) {
        this.f27421c = i;
        this.f27419a = heoVar;
        this.f27420b = hevVar;
    }

    public /* synthetic */ hea(hez hezVar, kpw kpwVar, int i) {
        this.f27421c = i;
        this.f27419a = hezVar;
        this.f27420b = kpwVar;
    }

    public /* synthetic */ hea(hff hffVar, chp chpVar, int i) {
        this.f27421c = i;
        this.f27420b = hffVar;
        this.f27419a = chpVar;
    }

    public /* synthetic */ hea(hio hioVar, ByteBuffer byteBuffer, int i) {
        this.f27421c = i;
        this.f27419a = hioVar;
        this.f27420b = byteBuffer;
    }

    public /* synthetic */ hea(hiz hizVar, View view, int i) {
        this.f27421c = i;
        this.f27420b = hizVar;
        this.f27419a = view;
    }

    public /* synthetic */ hea(hkh hkhVar, bkn bknVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f27421c = i;
        this.f27420b = hkhVar;
        this.f27419a = bknVar;
    }

    public /* synthetic */ hea(hmp hmpVar, hmo hmoVar, int i) {
        this.f27421c = i;
        this.f27420b = hmpVar;
        this.f27419a = hmoVar;
    }

    public /* synthetic */ hea(hmy hmyVar, Window window, int i) {
        this.f27421c = i;
        this.f27420b = hmyVar;
        this.f27419a = window;
    }

    public /* synthetic */ hea(hns hnsVar, PowerManager.OnThermalStatusChangedListener onThermalStatusChangedListener, int i) {
        this.f27421c = i;
        this.f27420b = hnsVar;
        this.f27419a = onThermalStatusChangedListener;
    }

    public /* synthetic */ hea(hrg hrgVar, Runnable runnable, int i) {
        this.f27421c = i;
        this.f27419a = hrgVar;
        this.f27420b = runnable;
    }

    public /* synthetic */ hea(oju ojuVar, Executor executor, int i) {
        this.f27421c = i;
        this.f27420b = ojuVar;
        this.f27419a = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [heo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kpw] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v38, types: [hmo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v42, types: [android.os.PowerManager$OnThermalStatusChangedListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v60, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, mpk] */
    /* JADX WARN: Type inference failed for: r2v34, types: [android.os.PowerManager$OnThermalStatusChangedListener, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27421c) {
            case 0:
                this.f27419a.mo10125r((hev) this.f27420b);
                return;
            case 1:
                Object obj = this.f27420b;
                Object obj2 = this.f27419a;
                SmartsUiGleamingView smartsUiGleamingView = ((hec) obj).f27426b;
                jvd.m13538a();
                Point pointM13568p = jvh.m13568p(smartsUiGleamingView);
                Point point = (Point) obj2;
                smartsUiGleamingView.f6947a.setBounds((point.x - smartsUiGleamingView.f6948b) - pointM13568p.x, (point.y - smartsUiGleamingView.f6948b) - pointM13568p.y, (point.x + smartsUiGleamingView.f6948b) - pointM13568p.x, (point.y + smartsUiGleamingView.f6948b) - pointM13568p.y);
                smartsUiGleamingView.f6947a.reset();
                smartsUiGleamingView.f6947a.start();
                smartsUiGleamingView.setVisibility(0);
                return;
            case 2:
                Object obj3 = this.f27419a;
                ?? r1 = this.f27420b;
                ((hei) obj3).m10152c();
                r1.run();
                return;
            case 3:
                Object obj4 = this.f27419a;
                ?? r2 = this.f27420b;
                ((hei) obj4).m10152c();
                r2.run();
                return;
            case 4:
                Object obj5 = this.f27419a;
                ?? r3 = this.f27420b;
                ((hei) obj5).m10152c();
                r3.run();
                return;
            case 5:
                Object obj6 = this.f27419a;
                ?? r4 = this.f27420b;
                ((hei) obj6).f27461a = null;
                if (r4 != 0) {
                    r4.run();
                    return;
                }
                return;
            case 6:
                Object obj7 = this.f27419a;
                ?? r5 = this.f27420b;
                ((hel) obj7).m10158g();
                r5.run();
                return;
            case 7:
                Object obj8 = this.f27419a;
                ?? r6 = this.f27420b;
                ArrayList arrayList = new ArrayList();
                synchronized (obj8) {
                    if (((hez) obj8).f27519a) {
                        ((hez) obj8).f27519a = false;
                        gsr gsrVarM6885a = ((dxx) ((hez) obj8).f27520b.mo16809c()).m6885a(r6.mo7248d());
                        if (((hez) obj8).f27521c.mo16813g()) {
                            mrm mrmVarMo10178a = ((hfe) ((hez) obj8).f27521c.mo16809c()).mo10178a(r6, gsrVarM6885a);
                            arrayList.addAll(((hez) obj8).f27522d);
                            int size = arrayList.size();
                            for (int i = 0; i < size; i++) {
                                ((hfc) arrayList.get(i)).mo10180a(mrmVarMo10178a);
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
            case 8:
                Object obj9 = this.f27419a;
                ?? r7 = this.f27420b;
                if (((View) obj9).getAlpha() == 1.0f) {
                    r7.run();
                    return;
                }
                return;
            case 9:
                Object obj10 = this.f27419a;
                ?? r8 = this.f27420b;
                View view = (View) obj10;
                view.getAlpha();
                if (view.getAlpha() == 0.0f) {
                    view.setVisibility(8);
                    r8.run();
                    return;
                }
                return;
            case 10:
                Object obj11 = this.f27420b;
                Object obj12 = this.f27419a;
                if (obj12 instanceof dkh) {
                    final hff hffVar = (hff) obj11;
                    MediaPlayer.OnInfoListener onInfoListener = new MediaPlayer.OnInfoListener() { // from class: hfp
                        @Override // android.media.MediaPlayer.OnInfoListener
                        public final boolean onInfo(MediaPlayer mediaPlayer, int i2, int i3) {
                            hff hffVar2 = hffVar;
                            if (i2 == 3) {
                                View view2 = hffVar2.f27543i;
                                view2.getClass();
                                view2.setVisibility(8);
                                return false;
                            }
                            if (i2 != 805 && i2 != 804) {
                                return false;
                            }
                            Toast.makeText(hffVar2.f27535a, C0100R.string.toast_cannot_play_video, 1).show();
                            hffVar2.m10185b();
                            return false;
                        }
                    };
                    ViewGroup viewGroup = hffVar.f27542h;
                    viewGroup.getClass();
                    Rect rect = hffVar.f27540f;
                    Uri uriMo3743c = ((dkh) obj12).f11832d.mo3743c();
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("no_seek_bar", false);
                    bundle.putBoolean("auto_loop_enabled", true);
                    bundle.putParcelable("video_view_padding", rect);
                    ioa ioaVarM11558c = ioa.m11558c(bundle, uriMo3743c);
                    ioaVarM11558c.f31626b = mrm.m16829i(onInfoListener);
                    AbstractC0118cx abstractC0118cxM5327i = hffVar.f27535a.m3206bA().m5327i();
                    abstractC0118cxM5327i.m5698n(viewGroup.getId(), ioaVarM11558c, "VIDEO_PLAYER_TAG");
                    abstractC0118cxM5327i.mo2015b();
                }
                FrameLayout frameLayout = ((hff) obj11).f27541g;
                frameLayout.getClass();
                frameLayout.announceForAccessibility(frameLayout.getResources().getText(C0100R.string.accessibility_open_social_share));
                return;
            case 11:
                Object obj13 = this.f27419a;
                Object obj14 = this.f27420b;
                hio hioVar = (hio) obj13;
                hioVar.f27928f.mo13961e("SEController#provideAudio");
                hioVar.f27934l.f33914a.mo16734c((ByteBuffer) obj14);
                hioVar.f27928f.mo13962f();
                return;
            case 12:
                Object obj15 = this.f27420b;
                ((View) this.f27419a).scrollTo(0, 0);
                ((hiz) obj15).f27970e = true;
                return;
            case 13:
                Object obj16 = this.f27420b;
                ?? r9 = this.f27419a;
                Iterator it = ((ohm) obj16).get().iterator();
                while (it.hasNext()) {
                    r9.execute((hjk) it.next());
                }
                return;
            case 14:
                ((Instrumentation) this.f27419a).m4298c(new WeakReference(this.f27420b));
                return;
            case 15:
                Object obj17 = this.f27420b;
                Object obj18 = this.f27419a;
                nxl nxlVarM18137O = nho.f42417av.m18137O();
                nhn nhnVar = nhn.CAPTURE_DONE;
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nxq nxqVar = nxlVarM18137O.f44974b;
                nho nhoVar = (nho) nxqVar;
                nhoVar.f42470d = nhnVar.f42416ar;
                nhoVar.f42445a = 1 | nhoVar.f42445a;
                Object obj19 = ((bkn) obj18).f3651a;
                if (!nxqVar.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nho nhoVar2 = (nho) nxlVarM18137O.f44974b;
                nhy nhyVar = (nhy) ((nxl) obj19).mo18103l();
                nhyVar.getClass();
                nhoVar2.f42473g = nhyVar;
                nhoVar2.f42445a |= 16;
                nho nhoVar3 = (nho) nxlVarM18137O.mo18103l();
                nxl nxlVar = (nxl) nhoVar3.m18143ad(5);
                nxlVar.m18108s(nhoVar3);
                hkh hkhVar = (hkh) obj17;
                hkhVar.m10421aF(nxlVar);
                hkhVar.f28147g.arriveAndDeregister();
                return;
            case 16:
                hmp hmpVar = (hmp) this.f27420b;
                jvh.m13562j(hmpVar.f28348c.m10469b(hmpVar.f28346a), new cdc(hmpVar, (hmo) this.f27419a, 9), hmpVar.f28346a);
                return;
            case 17:
                ((Window) this.f27419a).getDecorView().setOnSystemUiVisibilityChangeListener(((hmy) this.f27420b).f28376d);
                return;
            case 18:
                Object obj20 = this.f27420b;
                ?? r10 = this.f27419a;
                synchronized (obj20) {
                    if (((hns) obj20).f28526d) {
                        ((hns) obj20).f28524b.removeThermalStatusListener(r10);
                        return;
                    }
                    ((nbe) ((nbe) hns.f28523a.m17252c()).mo17276G(3757)).mo17290o("removeThermalStatusListener called, but listener not yet registered.");
                    lku.m15614I(((hns) obj20).f28525c, "Listener is neither registered, nor waiting to be registered.");
                    ((hns) obj20).f28525c = false;
                    return;
                }
            case 19:
                Object obj21 = this.f27420b;
                ?? r11 = this.f27419a;
                synchronized (obj21) {
                    if (!((hns) obj21).f28525c) {
                        ((nbe) ((nbe) hns.f28523a.m17252c()).mo17276G(3756)).mo17290o("removeThermalStatusListener already called. Not registering listener.");
                        return;
                    }
                    Trace.beginSection("AddThermalStatusListener");
                    ((hns) obj21).f28524b.addThermalStatusListener(((hns) obj21).f28527e, r11);
                    Trace.endSection();
                    ((hns) obj21).f28526d = true;
                    return;
                }
            default:
                Object obj22 = this.f27419a;
                this.f27420b.run();
                ((hrg) obj22).mo7498g();
                return;
        }
    }
}
