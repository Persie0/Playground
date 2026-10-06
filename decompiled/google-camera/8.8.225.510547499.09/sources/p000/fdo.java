package p000;

import android.content.Context;
import android.hardware.Sensor;
import android.os.Trace;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.views.MainActivityLayout;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fdo implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f21457a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f21458b;

    public /* synthetic */ fdo(fdp fdpVar, int i) {
        this.f21458b = i;
        this.f21457a = fdpVar;
    }

    public /* synthetic */ fdo(fdq fdqVar, int i) {
        this.f21458b = i;
        this.f21457a = fdqVar;
    }

    public /* synthetic */ fdo(ffh ffhVar, int i) {
        this.f21458b = i;
        this.f21457a = ffhVar;
    }

    public /* synthetic */ fdo(ffj ffjVar, int i) {
        this.f21458b = i;
        this.f21457a = ffjVar;
    }

    public /* synthetic */ fdo(ffq ffqVar, int i) {
        this.f21458b = i;
        this.f21457a = ffqVar;
    }

    public /* synthetic */ fdo(fhh fhhVar, int i) {
        this.f21458b = i;
        this.f21457a = fhhVar;
    }

    public /* synthetic */ fdo(fip fipVar, int i) {
        this.f21458b = i;
        this.f21457a = fipVar;
    }

    public /* synthetic */ fdo(fiv fivVar, int i) {
        this.f21458b = i;
        this.f21457a = fivVar;
    }

    public /* synthetic */ fdo(iey ieyVar, int i) {
        this.f21458b = i;
        this.f21457a = ieyVar;
    }

    public /* synthetic */ fdo(jww jwwVar, int i) {
        this.f21458b = i;
        this.f21457a = jwwVar;
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [iey, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [iey, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, jww] */
    @Override // java.lang.Runnable
    public final void run() {
        kba ezcVar;
        ArrayList arrayListM16499G;
        byte[] bArr = null;
        int i = 0;
        switch (this.f21458b) {
            case 0:
                ((fdp) this.f21457a).m8276c();
                return;
            case 1:
                ((fdp) this.f21457a).f21460b.mo8564b(ikw.LONG_EXPOSURE);
                return;
            case 2:
                ((fdq) this.f21457a).f21471b.mo8564b(ikw.LONG_EXPOSURE);
                return;
            case 3:
                ((fdq) this.f21457a).f21476g.mo3953f(ikw.LONG_EXPOSURE);
                return;
            case 4:
                fdq fdqVar = (fdq) this.f21457a;
                fdqVar.f21472c.unregisterListener(fdqVar.f21475f);
                return;
            case 5:
                Object obj = this.f21457a;
                Trace.beginSection("Register Gravity and Gyro Sensors listeners");
                fdq fdqVar2 = (fdq) obj;
                Sensor sensor = fdqVar2.f21473d;
                if (sensor != null) {
                    fdqVar2.f21472c.registerListener(fdqVar2.f21475f, sensor, 3);
                }
                Sensor sensor2 = fdqVar2.f21474e;
                if (sensor2 != null) {
                    fdqVar2.f21472c.registerListener(fdqVar2.f21475f, sensor2, 3);
                }
                Trace.endSection();
                return;
            case 6:
                ((ffh) this.f21457a).m8336b();
                return;
            case 7:
                ((ffj) this.f21457a).m8347a();
                return;
            case 8:
                ffj ffjVar = (ffj) this.f21457a;
                gtd gtdVar = ffjVar.f21639e;
                MainActivityLayout mainActivityLayout = ffjVar.f21635a.f31066c;
                elx elxVar = ffjVar.f21636b;
                if (((Boolean) gtdVar.f26335b.mo3831be()).booleanValue()) {
                    ezcVar = cgw.f5707t;
                } else {
                    FrameLayout frameLayout = new FrameLayout((Context) gtdVar.f26334a);
                    View.inflate((Context) gtdVar.f26334a, C0100R.layout.longshot_edu_toast_view, frameLayout);
                    ImageView imageView = (ImageView) frameLayout.findViewById(C0100R.id.longshot_edu_image);
                    TextView textView = (TextView) frameLayout.findViewById(C0100R.id.longshot_edu_zoom_text);
                    TextView textView2 = (TextView) frameLayout.findViewById(C0100R.id.longshot_edu_handsfree_text);
                    textView.setText(((Context) gtdVar.f26334a).getText(C0100R.string.longshot_edu_panel_zoom));
                    textView2.setText(((Context) gtdVar.f26334a).getText(C0100R.string.longshot_edu_panel_lock));
                    imageView.setImageDrawable(((Context) gtdVar.f26334a).getDrawable(C0100R.drawable.ic_ls_useredu_portrait));
                    hrf hrfVar = new hrf();
                    hrfVar.f29268c = frameLayout;
                    hrfVar.f29267b = mainActivityLayout;
                    hrfVar.f29266a = Duration.ofSeconds(4L);
                    hrfVar.f29271f = elxVar;
                    hrfVar.f29273h = 1;
                    hrg hrgVarM10649a = hrfVar.m10649a();
                    int i2 = 9;
                    hrgVarM10649a.f29278d = new hea(hrgVarM10649a, new fit(gtdVar, i2, bArr, bArr), 20);
                    hrgVarM10649a.mo7501j();
                    ezcVar = new ezc(hrgVarM10649a, i2);
                }
                ffjVar.f21638d = ezcVar;
                return;
            case 9:
                ffj ffjVar2 = (ffj) this.f21457a;
                ffjVar2.f21637c.post(new fdo(ffjVar2, 8));
                return;
            case 10:
                this.f21457a.mo11164g();
                return;
            case 11:
                this.f21457a.mo11165i();
                return;
            case 12:
                this.f21457a.mo3415bf(true);
                return;
            case 13:
                this.f21457a.mo3415bf(false);
                return;
            case 14:
                glk glkVarM8367k = ((ffq) this.f21457a).m8367k();
                if (glkVarM8367k == null) {
                    ((nbe) ((nbe) ffq.f21721a.m17251b()).mo17276G((char) 2179)).mo17290o("Unable to signal long press end. Resources unexpectedly null.");
                    return;
                }
                Object obj2 = glkVarM8367k.f25501b;
                flc flcVar = (flc) obj2;
                long jM8535a = flcVar.f22457b.m8535a();
                synchronized (obj2) {
                    ((flc) obj2).f22461f = TimeUnit.NANOSECONDS.toMicros(jM8535a);
                    ((flc) obj2).f22460e = false;
                    arrayListM16499G = mkv.m16499G(((flc) obj2).f22459d);
                    break;
                }
                flcVar.f22456a.mo13940b("onLongPressEnded at " + jM8535a);
                int size = arrayListM16499G.size();
                while (i < size) {
                    ((flb) arrayListM16499G.get(i)).m8540c(TimeUnit.NANOSECONDS.toMicros(jM8535a));
                    i++;
                }
                return;
            case 15:
                ((dyc) ((fhh) this.f21457a).f21976a.mo16809c()).m6918a();
                return;
            case 16:
                Object obj3 = this.f21457a;
                synchronized (obj3) {
                    ((fhh) obj3).f21977b.getLooper().quitSafely();
                    ((fhh) obj3).f21977b.removeCallbacksAndMessages(null);
                    if (((fhh) obj3).f21976a.mo16813g()) {
                        ((dyc) ((fhh) obj3).f21976a.mo16809c()).close();
                    }
                    break;
                }
                return;
            case 17:
                ((fhh) this.f21457a).m8421c();
                return;
            case 18:
                ((fip) this.f21457a).m8465c();
                return;
            case 19:
                fiv fivVar = (fiv) this.f21457a;
                if (!fivVar.f22187s) {
                    fivVar.m8475f();
                    return;
                } else {
                    fivVar.f22186r = true;
                    fivVar.m8476g();
                    return;
                }
            default:
                fiv fivVar2 = (fiv) this.f21457a;
                fivVar2.m8477h();
                fivVar2.f22172d.post(new fit(fivVar2, i));
                return;
        }
    }
}
