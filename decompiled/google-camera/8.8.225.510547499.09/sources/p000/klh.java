package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class klh extends CameraCaptureSession.CaptureCallback {

    /* JADX INFO: renamed from: a */
    private final kpg f36473a;

    public klh(kpg kpgVar) {
        this.f36473a = kpgVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        try {
            kpg kpgVar = this.f36473a;
            Long lM14421g = kki.m14421g(new klm(captureRequest));
            kbz kbzVar = ((kkh) kpgVar).f36352c.f36353a;
            StringBuilder sb = new StringBuilder();
            sb.append("onCaptureBufferLost_");
            sb.append(lM14421g);
            kbzVar.mo13961e("onCaptureBufferLost_".concat(lM14421g.toString()));
            kgg kggVar = (kgg) ((kkh) kpgVar).f36351b.get(surface);
            kggVar.getClass();
            kfv kfvVar = (kfv) ((kkh) kpgVar).f36350a.get(lM14421g);
            kfvVar.getClass();
            kfvVar.mo5454aZ(kggVar, j);
            synchronized (((kkh) kpgVar).f36352c) {
                ((kkh) kpgVar).f36352c.m14431i(lM14421g.longValue());
            }
            ((kkh) kpgVar).f36352c.f36353a.mo13962f();
        } catch (Throwable th) {
            khb.m14233e(th);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        try {
            kpg kpgVar = this.f36473a;
            klm klmVar = new klm(captureRequest);
            kma kmaVar = new kma(totalCaptureResult);
            Long lM14421g = kki.m14421g(klmVar);
            kbz kbzVar = ((kkh) kpgVar).f36352c.f36353a;
            StringBuilder sb = new StringBuilder();
            sb.append("onCaptureCompleted_");
            sb.append(lM14421g);
            kbzVar.mo13961e("onCaptureCompleted_".concat(lM14421g.toString()));
            kfv kfvVar = (kfv) ((kkh) kpgVar).f36350a.get(lM14421g);
            kfvVar.getClass();
            kfvVar.mo3408bu(kmaVar);
            synchronized (((kkh) kpgVar).f36352c) {
                ((kkh) kpgVar).f36352c.m14431i(lM14421g.longValue());
            }
            ((kkh) kpgVar).f36352c.f36353a.mo13962f();
        } catch (Throwable th) {
            khb.m14233e(th);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        try {
            this.f36473a.mo14420b(new klm(captureRequest), new kll(captureFailure));
        } catch (Throwable th) {
            khb.m14233e(th);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        try {
            kpg kpgVar = this.f36473a;
            klm klmVar = new klm(captureRequest);
            klp klpVar = new klp(captureResult);
            Long lM14421g = kki.m14421g(klmVar);
            kbz kbzVar = ((kkh) kpgVar).f36352c.f36353a;
            StringBuilder sb = new StringBuilder();
            sb.append("onCaptureProgressed_");
            sb.append(lM14421g);
            kbzVar.mo13961e("onCaptureProgressed_".concat(lM14421g.toString()));
            kfv kfvVar = (kfv) ((kkh) kpgVar).f36350a.get(lM14421g);
            kfvVar.getClass();
            kfvVar.mo6427bj(klpVar);
            ((kkh) kpgVar).f36352c.f36353a.mo13962f();
        } catch (Throwable th) {
            khb.m14233e(th);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        try {
            kpg kpgVar = this.f36473a;
            ((kkh) kpgVar).f36352c.f36353a.mo13961e("onCaptureSequenceAborted_" + i);
            naz nazVarListIterator = ((kkh) kpgVar).f36350a.entrySet().listIterator();
            while (nazVarListIterator.hasNext()) {
                Map.Entry entry = (Map.Entry) nazVarListIterator.next();
                ((kfv) entry.getValue()).mo9226bk(((Long) entry.getKey()).longValue(), i);
            }
            ((kkh) kpgVar).f36352c.f36353a.mo13962f();
        } catch (Throwable th) {
            khb.m14233e(th);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        try {
            kpg kpgVar = this.f36473a;
            ((kkh) kpgVar).f36352c.f36353a.mo13961e("onCaptureSequenceCompleted_" + i);
            naz nazVarListIterator = ((kkh) kpgVar).f36350a.entrySet().listIterator();
            while (nazVarListIterator.hasNext()) {
                Map.Entry entry = (Map.Entry) nazVarListIterator.next();
                ((kfv) entry.getValue()).mo9227bl(((Long) entry.getKey()).longValue(), i, j);
            }
            ((kkh) kpgVar).f36352c.f36353a.mo13962f();
        } catch (Throwable th) {
            khb.m14233e(th);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        try {
            kpg kpgVar = this.f36473a;
            Long lM14421g = kki.m14421g(new klm(captureRequest));
            kbz kbzVar = ((kkh) kpgVar).f36352c.f36353a;
            StringBuilder sb = new StringBuilder();
            sb.append("onCaptureStarted_");
            sb.append(lM14421g);
            kbzVar.mo13961e("onCaptureStarted_".concat(lM14421g.toString()));
            kfd kfdVar = new kfd(j, j2, ((kkh) kpgVar).f36352c.m14429f());
            kfv kfvVar = (kfv) ((kkh) kpgVar).f36350a.get(lM14421g);
            kfvVar.getClass();
            kfvVar.mo8901bn(kfdVar);
            ((kkh) kpgVar).f36352c.f36353a.mo13962f();
        } catch (Throwable th) {
            khb.m14233e(th);
        }
    }
}
