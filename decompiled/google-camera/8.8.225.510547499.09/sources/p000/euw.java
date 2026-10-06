package p000;

import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.legacy.app.activity.main.kuX.PMZiHihxLGEy;
import com.google.android.apps.camera.p014ui.remotecontrol.RemoteControlView;
import com.google.android.apps.camera.zoomui.view.ZoomSliderView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class euw implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ float f20266a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f20267b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f20268c;

    public /* synthetic */ euw(cgn cgnVar, float f, int i) {
        this.f20268c = i;
        this.f20267b = cgnVar;
        this.f20266a = f;
    }

    public /* synthetic */ euw(ZoomSliderView zoomSliderView, float f, int i) {
        this.f20268c = i;
        this.f20267b = zoomSliderView;
        this.f20266a = f;
    }

    public /* synthetic */ euw(eux euxVar, float f, int i) {
        this.f20268c = i;
        this.f20267b = euxVar;
        this.f20266a = f;
    }

    public euw(gay gayVar, float f, int i) {
        this.f20268c = i;
        this.f20267b = gayVar;
        this.f20266a = f;
    }

    public /* synthetic */ euw(hqk hqkVar, float f, int i) {
        this.f20268c = i;
        this.f20267b = hqkVar;
        this.f20266a = f;
    }

    public /* synthetic */ euw(iex iexVar, float f, int i) {
        this.f20268c = i;
        this.f20267b = iexVar;
        this.f20266a = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        switch (this.f20268c) {
            case 0:
                Object obj = this.f20267b;
                float f = this.f20266a;
                eux euxVar = (eux) obj;
                euxVar.m7917g(f);
                euxVar.f20269a.f20317k.mo8588a();
                if (f == 1.0f) {
                    euxVar.f20269a.f20315i.mo11241m();
                    euxVar.f20269a.f20316j.mo10316b(C0100R.raw.camera_shutter);
                }
                break;
            case 1:
                Object obj2 = this.f20267b;
                float f2 = this.f20266a;
                ((cgn) obj2).f5643b.animate().setDuration(500L).scaleX(f2).scaleY(f2).start();
                break;
            case 2:
                ((fug) this.f20267b).mo7888f(this.f20266a, -1L);
                break;
            case 3:
                ((gay) this.f20267b).f24054a.mo9652b(kbb.m13896b(this.f20266a));
                break;
            case 4:
                ((hqk) this.f20267b).f29093p.mo11195C((int) (this.f20266a * 100.0f));
                break;
            case 5:
                Object obj3 = this.f20267b;
                float f3 = this.f20266a;
                iex iexVar = (iex) obj3;
                RemoteControlView remoteControlView = iexVar.f30574c;
                if (remoteControlView != null) {
                    boolean z = iexVar.f30580i;
                    if (f3 < 0.0f) {
                        remoteControlView.f7166c.setText("");
                    } else {
                        if (z) {
                            f3 *= 3.2808f;
                            str = PMZiHihxLGEy.ftpTscK;
                        } else {
                            str = "m";
                        }
                        remoteControlView.f7166c.setText(String.valueOf(String.format("%.1f", Float.valueOf(f3))).concat(str));
                        remoteControlView.f7168e.setVisibility(0);
                    }
                }
                break;
            case 6:
                Object obj4 = this.f20267b;
                float f4 = this.f20266a;
                iex iexVar2 = (iex) obj4;
                RemoteControlView remoteControlView2 = iexVar2.f30574c;
                if (remoteControlView2 != null) {
                    boolean z2 = iexVar2.f30580i;
                    if (f4 >= -100.0f && f4 <= 200.0f) {
                        if (z2) {
                            f4 = ((f4 * 9.0f) / 5.0f) + 32.0f;
                            str2 = "F";
                        } else {
                            str2 = "C";
                        }
                        remoteControlView2.f7167d.setText(String.valueOf(String.format("%.1f", Float.valueOf(f4))).concat(str2));
                        remoteControlView2.f7169f.setVisibility(0);
                    } else {
                        remoteControlView2.f7167d.setText("");
                    }
                }
                break;
            default:
                Object obj5 = this.f20267b;
                float f5 = this.f20266a;
                ZoomSliderView zoomSliderView = (ZoomSliderView) obj5;
                if (f5 >= zoomSliderView.f7381c && f5 <= zoomSliderView.f7382d) {
                    if (!zoomSliderView.f7393o.isFinished()) {
                        zoomSliderView.f7393o.forceFinished(true);
                    }
                    zoomSliderView.f7394p = true;
                    zoomSliderView.f7386h = f5;
                    float f6 = ((((int) (f5 * 25.0f)) - zoomSliderView.f7388j) / zoomSliderView.f7390l) * zoomSliderView.f7387i;
                    float f7 = zoomSliderView.f7391m;
                    int i = (int) (f6 - f7);
                    int i2 = (i * 2000) / ((int) zoomSliderView.f7389k);
                    if (i != 0) {
                        zoomSliderView.f7393o.startScroll((int) f7, 0, i, i2);
                    }
                    zoomSliderView.invalidate();
                } else {
                    ((nbe) ((nbe) ZoomSliderView.f7341a.m17251b()).mo17276G(4462)).mo17271B("The currentValue of %f is out of range: [%f, %f]", Float.valueOf(f5), Float.valueOf(zoomSliderView.f7381c), Float.valueOf(zoomSliderView.f7382d));
                }
                break;
        }
    }
}
