package p000;

import android.media.MediaFormat;
import android.os.HandlerThread;
import com.google.android.apps.camera.zoomui.view.WdNM.xPAWq;
import com.google.android.material.snackbar.VMX.rgoX;
import java.util.concurrent.atomic.AtomicBoolean;
import p021j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class fjo implements ohi {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f22273a;

    public fjo(int i) {
        this.f22273a = i;
    }

    /* JADX INFO: renamed from: a */
    public static MediaFormat m8491a() {
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", 48000, 2);
        mediaFormatCreateAudioFormat.setInteger("aac-profile", 2);
        mediaFormatCreateAudioFormat.setInteger("bitrate", 128000);
        mediaFormatCreateAudioFormat.setInteger(rgoX.bRJcPkpkyKTGXd, dyd.f12880a * 10);
        mediaFormatCreateAudioFormat.setInteger(xPAWq.XeFzPJyskOiqfxn, 1);
        mediaFormatCreateAudioFormat.getClass();
        return mediaFormatCreateAudioFormat;
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f22273a) {
            case 0:
                return new Object() { // from class: fji
                };
            case 1:
                return new bkn((byte[]) null, (byte[]) null, (short[]) null);
            case 2:
                return m8491a();
            case 3:
                return fxo.m8935i();
            case 4:
                return new jwf(false);
            case 5:
                return new jwf(false);
            case 6:
                return new AtomicBoolean(false);
            case 7:
                HandlerThread handlerThread = new HandlerThread("mv-timeout-handler");
                handlerThread.start();
                return jvh.m13557e(handlerThread.getLooper());
            case 8:
                return new jwf(true);
            case 9:
                return dtj.m6731b("feature.acmi.imu.camera-orientation");
            case 10:
                return dtj.m6731b("feature.acmi.imu.camera-pose");
            case 11:
                return new fky();
            case 12:
                return new fzn();
            case 13:
                return new flw();
            case 14:
                return new jwf(fnb.f22775a);
            case 15:
                return new jwf(false);
            case 16:
                return new jwf(true);
            case 17:
                return new jwf(cxk.DEFAULT);
            case 18:
                return new jwf(jxp.RES_UNKNOWN);
            case 19:
                return flu.m8560c();
            default:
                Optional.empty();
                return new fnj(Optional.ofNullable(ivx.f32450m));
        }
    }
}
