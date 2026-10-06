package p000;

import android.os.SystemClock;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class hqe extends BottomBarListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ hqk f29045a;

    public hqe(hqk hqkVar) {
        this.f29045a = hqkVar;
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onCameraSwitchButtonClicked() {
        jfo jfoVar = this.f29045a.f29073U;
        jfoVar.getClass();
        hpm hpmVar = (hpm) jfoVar.f33911b;
        hpmVar.f28922g.m5899h(new hpi(hpmVar, 6));
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener, com.google.android.apps.camera.bottombar.PauseResumeButton.PauseResumeButtonListener
    public final void onPauseButtonClicked() {
        nps npsVarM14965K;
        jfo jfoVar = this.f29045a.f29073U;
        jfoVar.getClass();
        hpm hpmVar = (hpm) jfoVar.f33911b;
        if (((hor) hpmVar.f28925j.f34942d).equals(hor.STATE_RECORDING)) {
            hpmVar.f28923h.mo10316b(C0100R.raw.video_pause);
            hpmVar.f28938w.mo11163f();
            jvd jvdVar = hpmVar.f28931p;
            hqb hqbVar = hpmVar.f28884C;
            hqbVar.getClass();
            jvdVar.m13541c(new hpi(hqbVar, 13));
            hpg hpgVar = hpmVar.f28883B;
            if (hpgVar.f28811d.mo6184l(diy.f11747d)) {
                hpa hpaVar = hpgVar.f28828u;
                if (hpaVar.f28744n.get() > 1) {
                    hpaVar.f28733c.set(true);
                    hpaVar.f28745o.set(TimeUnit.MILLISECONDS.toNanos(SystemClock.uptimeMillis()));
                    npsVarM14965K = kxk.m14965K(null);
                } else {
                    synchronized (hpaVar.f28750t) {
                        hpaVar.f28755y = nqf.m17621g();
                        hpaVar.f28755y.mo2282d(new hmm(hpaVar, 16), jvh.m13554b());
                        npsVarM14965K = hpaVar.f28755y;
                    }
                }
                npsVarM14965K.mo2282d(new hmm(hpgVar, 17), not.INSTANCE);
            } else {
                hpgVar.f28817j.f28593c.set(false);
                hpgVar.f28799af.m13650a();
            }
            hpmVar.f28882A.f28654a.set(false);
        }
        this.f29045a.m10597c(false);
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener, com.google.android.apps.camera.bottombar.PauseResumeButton.PauseResumeButtonListener
    public final void onResumeButtonClicked() {
        jfo jfoVar = this.f29045a.f29073U;
        jfoVar.getClass();
        hpm hpmVar = (hpm) jfoVar.f33911b;
        if (((hor) hpmVar.f28925j.f34942d).equals(hor.STATE_RECORDING_PAUSE)) {
            hpmVar.f28923h.mo10316b(C0100R.raw.video_start);
            hpmVar.f28938w.mo11162e();
            jvd jvdVar = hpmVar.f28931p;
            hqb hqbVar = hpmVar.f28884C;
            hqbVar.getClass();
            jvdVar.m13541c(new hpi(hqbVar, 14));
            hpg hpgVar = hpmVar.f28883B;
            jxj jxjVar = hpgVar.f28799af;
            synchronized (jxjVar.f35023d) {
                lku.m15617L(jxjVar.f35024e == jxi.PAUSED, "%s is expected but we get %s", jxi.PAUSED, jxjVar.f35024e);
                jxjVar.f35024e = jxi.STARTED;
                kxk.m14975U(jxjVar.f35020a.mo13749h(), new djq(jxjVar, 19), jxjVar.f35021b);
            }
            if (hpgVar.f28811d.mo6184l(diy.f11747d)) {
                hpa hpaVar = hpgVar.f28828u;
                hpaVar.f28733c.set(false);
                hpaVar.m10566k();
                hpaVar.f28745o.set(0L);
            } else {
                hpgVar.f28817j.f28593c.set(true);
            }
            hpmVar.f28882A.f28654a.set(true);
        }
        this.f29045a.m10600f();
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onSnapshotButtonClicked() {
        this.f29045a.m10600f();
        hqk hqkVar = this.f29045a;
        hqkVar.f29080c.setSnapshotButtonClickEnabled(false);
        hqkVar.f29095r.mo3693g().mo3721k();
        jfo jfoVar = this.f29045a.f29073U;
        jfoVar.getClass();
        Object obj = jfoVar.f33911b;
        gyv gyvVarM10003a = gyv.m10003a(gyu.m10002a(), System.currentTimeMillis(), dlt.m6367a(gyw.VIDEO_SNAPSHOT, System.currentTimeMillis()), gyw.VIDEO_SNAPSHOT);
        hpm hpmVar = (hpm) obj;
        hpmVar.f28890I.mo6362j(gyvVarM10003a);
        kxk.m14975U(hpmVar.f28941z.mo5692a(gyvVarM10003a), new cmo(hpmVar, 18), hpmVar.f28931p);
    }
}
