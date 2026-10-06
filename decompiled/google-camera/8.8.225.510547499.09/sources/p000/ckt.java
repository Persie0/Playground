package p000;

import android.media.AudioManager;
import android.media.AudioRecord;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.gBCSQzBeB;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ckt implements ckr {

    /* JADX INFO: renamed from: a */
    private static final nbh f6000a = nbh.m17259h("com/google/android/apps/camera/audiozoom/AudioZoomControllerImpl");

    /* JADX INFO: renamed from: b */
    private final jwn f6001b;

    /* JADX INFO: renamed from: c */
    private final iuj f6002c;

    /* JADX INFO: renamed from: d */
    private final jww f6003d;

    /* JADX INFO: renamed from: e */
    private final float f6004e;

    /* JADX INFO: renamed from: f */
    private final float f6005f;

    /* JADX INFO: renamed from: g */
    private HandlerThread f6006g = null;

    /* JADX INFO: renamed from: h */
    private Handler f6007h;

    /* JADX INFO: renamed from: i */
    private final AudioManager f6008i;

    /* JADX INFO: renamed from: j */
    private int f6009j;

    /* JADX INFO: renamed from: k */
    private final cwd f6010k;

    public ckt(iuj iujVar, jwn jwnVar, cwd cwdVar, AudioManager audioManager, jww jwwVar, byte[] bArr) {
        this.f6001b = jwnVar;
        this.f6002c = iujVar;
        this.f6010k = cwdVar;
        this.f6008i = audioManager;
        this.f6003d = jwwVar;
        this.f6004e = iujVar.mo11753d();
        this.f6005f = iujVar.mo11754e();
    }

    @Override // p000.ckr
    /* JADX INFO: renamed from: a */
    public final void mo3844a() {
        HandlerThread handlerThread = this.f6006g;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f6006g = null;
        }
        HandlerThread handlerThread2 = new HandlerThread("audioZoomThread");
        this.f6006g = handlerThread2;
        handlerThread2.start();
        this.f6007h = new cks(this, this.f6006g.getLooper());
        this.f6002c.mo11760k(new ire(this, 1));
        this.f6010k.m5657d(cum.CAPTURE_SESSION).m13537d(this.f6001b.mo3830a(new cbx(this, 15), not.INSTANCE));
        this.f6010k.m5657d(cum.CAPTURE_SESSION).m13537d(this);
        this.f6009j = 1;
    }

    @Override // p000.ckr
    /* JADX INFO: renamed from: b */
    public final void mo3845b() {
        this.f6009j = 2;
        this.f6008i.setParameters("cal_devid=-2147483520;cal_moduleid=268435527;cal_instanceid=32768;cal_apptype=69940;cal_paramid=268435543;cal_topoid=268438458;cal_data=AQAAAA==");
        m3849f(m3847d());
    }

    @Override // p000.ckr
    /* JADX INFO: renamed from: c */
    public final void mo3846c() {
        this.f6009j = 3;
        Handler handler = this.f6007h;
        if (handler != null) {
            handler.removeMessages(0);
        }
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        this.f6009j = 1;
        HandlerThread handlerThread = this.f6006g;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.f6006g = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final float m3847d() {
        float fFloatValue = ((Float) this.f6001b.mo3831be()).floatValue();
        if (fFloatValue < 1.0f) {
            return 0.0f;
        }
        float fMax = Math.max(1.0f, this.f6005f);
        return (fFloatValue - fMax) / (this.f6004e - fMax);
    }

    /* JADX INFO: renamed from: e */
    public final void m3848e() {
        Handler handler = this.f6007h;
        if (handler == null || this.f6009j != 2) {
            return;
        }
        handler.sendEmptyMessage(0);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    /* JADX INFO: renamed from: f */
    public final void m3849f(float f) {
        if (((Boolean) this.f6003d.mo3831be()).booleanValue()) {
            AudioRecord audioRecordBuild = null;
            try {
                audioRecordBuild = new AudioRecord.Builder().build();
                if (audioRecordBuild != null) {
                    if (f == 0.0f) {
                        f = 0.001f;
                    }
                    try {
                        try {
                            if (!audioRecordBuild.setPreferredMicrophoneFieldDimension(f)) {
                                ((nbe) ((nbe) f6000a.m17251b()).mo17276G(214)).mo17293r("Failed to set audio zoom ratio, ratio = %g", Float.valueOf(f));
                            }
                        } catch (RuntimeException e) {
                            e = e;
                            ((nbe) ((nbe) f6000a.m17251b()).mo17276G(213)).mo17293r(gBCSQzBeB.pDZUK, e.getMessage());
                            if (audioRecordBuild == null) {
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (audioRecordBuild != null) {
                            audioRecordBuild.release();
                        }
                        throw th;
                    }
                }
                if (audioRecordBuild == null) {
                    return;
                }
            } catch (RuntimeException e2) {
                e = e2;
            } catch (Throwable th2) {
                th = th2;
                if (audioRecordBuild != null) {
                    audioRecordBuild.release();
                }
                throw th;
            }
            audioRecordBuild.release();
        }
    }
}
