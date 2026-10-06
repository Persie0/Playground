package p000;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Looper;
import android.os.Message;
import android.view.SurfaceHolder;
import com.google.android.apps.camera.rectiface.jni.cxx.hsSUWRJfoeC;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bnc extends bol implements Camera.ErrorCallback {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ bnh f3861a;

    /* JADX INFO: renamed from: b */
    private final bnu f3862b;

    /* JADX INFO: renamed from: c */
    private Camera f3863c;

    /* JADX INFO: renamed from: d */
    private int f3864d;

    /* JADX INFO: renamed from: e */
    private bnd f3865e;

    /* JADX INFO: renamed from: f */
    private int f3866f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bnc(bnh bnhVar, bnu bnuVar, Looper looper) {
        super(looper);
        this.f3861a = bnhVar;
        this.f3864d = -1;
        this.f3866f = 0;
        this.f3862b = bnuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v74, types: [android.hardware.Camera$PictureCallback, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v87, types: [android.hardware.Camera$ShutterCallback, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v37, types: [android.hardware.Camera$PictureCallback, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10, types: [android.hardware.Camera$PictureCallback, java.lang.Object] */
    @Override // p000.bol, android.os.Handler
    public final void handleMessage(Message message) {
        bnz bnzVar;
        super.handleMessage(message);
        if (this.f3861a.f3880e.m2803d()) {
            boo booVar = bnh.f3875a;
            bzq.m3235H(message.what);
            bop.m2818g(booVar);
            return;
        }
        boo booVar2 = bnh.f3875a;
        bzq.m3235H(message.what);
        bop.m2818g(booVar2);
        int i = message.what;
        try {
            try {
                switch (i) {
                    case 1:
                        bnm bnmVar = (bnm) message.obj;
                        int i2 = message.arg1;
                        if (this.f3861a.f3880e.m2800a() == 1) {
                            bop.m2817f(bnh.f3875a);
                            Camera cameraOpen = Camera.open(i2);
                            this.f3863c = cameraOpen;
                            if (cameraOpen != null) {
                                this.f3864d = i2;
                                this.f3865e = new bnd(cameraOpen);
                                this.f3861a.f3877b = bmy.m2760c().mo2715b(i2);
                                this.f3861a.f3878c = new bni(this.f3865e.m2763a());
                                this.f3863c.setErrorCallback(this);
                                this.f3861a.f3880e.m2802c(2);
                                if (bnmVar != null) {
                                    bnh bnhVar = this.f3861a;
                                    bnmVar.mo2770b(new bnb(bnhVar, this.f3862b, i2, this.f3863c, bnhVar.f3878c));
                                }
                            } else if (bnmVar != null) {
                                bnmVar.mo2771c(i2, m2808c(i2));
                            }
                        } else {
                            bnmVar.mo2772d(i2, m2808c(i2));
                        }
                        break;
                    case 2:
                        Camera camera = this.f3863c;
                        if (camera == null) {
                            bop.m2814c(bnh.f3875a, "Releasing camera without any camera opened.");
                        } else {
                            camera.release();
                            this.f3861a.f3880e.m2802c(1);
                            this.f3863c = null;
                            this.f3864d = -1;
                        }
                        break;
                    case 3:
                        bnn bnnVar = (bnn) message.obj;
                        int i3 = message.arg1;
                        try {
                            this.f3863c.reconnect();
                            this.f3861a.f3880e.m2802c(2);
                            if (bnnVar != null) {
                                bnh bnhVar2 = this.f3861a;
                                bnnVar.mo2770b(new bnb(bnhVar2, bnhVar2, i3, this.f3863c, bnhVar2.f3878c));
                            }
                        } catch (IOException e) {
                            if (bnnVar != null) {
                                bnnVar.f3887a.post(new bey(bnnVar, m2808c(this.f3864d), 9));
                            }
                        }
                        break;
                    case 4:
                        this.f3863c.unlock();
                        this.f3861a.f3880e.m2802c(4);
                        break;
                    case 5:
                        this.f3863c.lock();
                        this.f3861a.f3880e.m2802c(2);
                        break;
                    case 101:
                        try {
                            this.f3863c.setPreviewTexture((SurfaceTexture) message.obj);
                        } catch (IOException e2) {
                            bop.m2813b(bnh.f3875a, "Could not set preview texture", e2);
                        }
                        break;
                    case 102:
                        bns bnsVar = (bns) message.obj;
                        this.f3863c.startPreview();
                        if (bnsVar != null) {
                            bnsVar.mo2777a();
                        }
                        break;
                    case 103:
                        this.f3863c.stopPreview();
                        break;
                    case 104:
                        this.f3863c.setPreviewCallbackWithBuffer((Camera.PreviewCallback) message.obj);
                        break;
                    case 105:
                        this.f3863c.addCallbackBuffer((byte[]) message.obj);
                        break;
                    case 106:
                        try {
                            this.f3863c.setPreviewDisplay((SurfaceHolder) message.obj);
                        } catch (IOException e3) {
                            throw new RuntimeException(e3);
                        }
                        break;
                    case 107:
                        this.f3863c.setPreviewCallback((Camera.PreviewCallback) message.obj);
                        break;
                    case 108:
                        this.f3863c.setOneShotPreviewCallback((Camera.PreviewCallback) message.obj);
                        break;
                    case 201:
                        Camera.Parameters parametersM2763a = this.f3865e.m2763a();
                        parametersM2763a.unflatten((String) message.obj);
                        this.f3863c.setParameters(parametersM2763a);
                        this.f3865e.m2764b();
                        break;
                    case 202:
                        ((Camera.Parameters[]) message.obj)[0] = this.f3865e.m2763a();
                        break;
                    case 203:
                        this.f3865e.m2764b();
                        break;
                    case 204:
                        Camera.Parameters parametersM2763a2 = this.f3865e.m2763a();
                        boi boiVar = (boi) message.obj;
                        bzq bzqVar = this.f3861a.f3878c.f3977w;
                        bon bonVarM2792e = boiVar.m2792e();
                        parametersM2763a2.setPictureSize(bonVarM2792e.m2811b(), bonVarM2792e.m2810a());
                        bon bonVarM2793f = boiVar.m2793f();
                        parametersM2763a2.setPreviewSize(bonVarM2793f.m2811b(), bonVarM2793f.m2810a());
                        int i4 = boiVar.f3993j;
                        if (i4 == -1) {
                            parametersM2763a2.setPreviewFpsRange(boiVar.f3991h, boiVar.f3992i);
                        } else {
                            parametersM2763a2.setPreviewFrameRate(i4);
                        }
                        parametersM2763a2.setPreviewFormat(boiVar.f3995l);
                        parametersM2763a2.setJpegQuality(boiVar.f3997n);
                        if (this.f3861a.f3878c.m2784d(bnw.ZOOM)) {
                            float f = boiVar.f3999p;
                            List<Integer> zoomRatios = parametersM2763a2.getZoomRatios();
                            int iBinarySearch = Collections.binarySearch(zoomRatios, Integer.valueOf((int) (f * 100.0f)));
                            if (iBinarySearch < 0 && (iBinarySearch = -(iBinarySearch + 1)) == zoomRatios.size()) {
                                iBinarySearch--;
                            }
                            parametersM2763a2.setZoom(iBinarySearch);
                        }
                        parametersM2763a2.setExposureCompensation(boiVar.f4000q);
                        if (this.f3861a.f3878c.m2784d(bnw.AUTO_EXPOSURE_LOCK)) {
                            parametersM2763a2.setAutoExposureLock(boiVar.f4006w);
                        }
                        parametersM2763a2.setFocusMode(bzq.m3233F(boiVar.f4002s.name()));
                        if (this.f3861a.f3878c.m2784d(bnw.AUTO_WHITE_BALANCE_LOCK)) {
                            parametersM2763a2.setAutoWhiteBalanceLock(boiVar.f4007x);
                        }
                        if (this.f3861a.f3878c.m2784d(bnw.FOCUS_AREA)) {
                            if (boiVar.m2794g().size() != 0) {
                                parametersM2763a2.setFocusAreas(boiVar.m2794g());
                            } else {
                                parametersM2763a2.setFocusAreas(null);
                            }
                        }
                        if (this.f3861a.f3878c.m2784d(bnw.METERING_AREA)) {
                            if (boiVar.m2795h().size() != 0) {
                                parametersM2763a2.setMeteringAreas(boiVar.m2795h());
                            } else {
                                parametersM2763a2.setMeteringAreas(null);
                            }
                        }
                        if (boiVar.f4001r != bnx.NO_FLASH) {
                            parametersM2763a2.setFlashMode(bzq.m3233F(boiVar.f4001r.name()));
                        }
                        if (boiVar.f4003t != bnz.NO_SCENE_MODE && (bnzVar = boiVar.f4003t) != null) {
                            parametersM2763a2.setSceneMode(bzq.m3233F(bnzVar.name()));
                        }
                        parametersM2763a2.setRecordingHint(boiVar.f4008y);
                        bon bonVar = boiVar.f4009z;
                        bon bonVar2 = bonVar == null ? null : new bon(bonVar);
                        if (bonVar2 != null) {
                            parametersM2763a2.setJpegThumbnailSize(bonVar2.m2811b(), bonVar2.m2810a());
                        }
                        parametersM2763a2.setPictureFormat(boiVar.f3998o);
                        parametersM2763a2.removeGpsData();
                        this.f3863c.setParameters(parametersM2763a2);
                        this.f3865e.m2764b();
                        break;
                    case 301:
                        if (this.f3866f <= 0) {
                            this.f3861a.f3880e.m2802c(16);
                            this.f3863c.autoFocus((Camera.AutoFocusCallback) message.obj);
                        } else {
                            bop.m2818g(bnh.f3875a);
                        }
                        break;
                    case 302:
                        this.f3866f++;
                        this.f3863c.cancelAutoFocus();
                        this.f3861a.f3880e.m2802c(2);
                        break;
                    case 303:
                        try {
                            this.f3863c.setAutoFocusMoveCallback((Camera.AutoFocusMoveCallback) message.obj);
                        } catch (RuntimeException e4) {
                            bop.m2814c(bnh.f3875a, e4.getMessage());
                        }
                        break;
                    case 304:
                        this.f3863c.setZoomChangeListener((Camera.OnZoomChangeListener) message.obj);
                        break;
                    case 305:
                        this.f3866f--;
                        break;
                    case 461:
                        this.f3863c.setFaceDetectionListener((Camera.FaceDetectionListener) message.obj);
                        break;
                    case 462:
                        this.f3863c.startFaceDetection();
                        break;
                    case 463:
                        this.f3863c.stopFaceDetection();
                        break;
                    case 501:
                        this.f3863c.enableShutterSound(message.arg1 == 1);
                        break;
                    case 502:
                        this.f3863c.setDisplayOrientation(this.f3861a.f3877b.m2788e(message.arg1, true));
                        Camera.Parameters parametersM2763a3 = this.f3865e.m2763a();
                        parametersM2763a3.setRotation(message.arg2 > 0 ? this.f3861a.f3877b.m2787d(message.arg1) : 0);
                        this.f3863c.setParameters(parametersM2763a3);
                        this.f3865e.m2764b();
                        break;
                    case 503:
                        Camera.Parameters parametersM2763a4 = this.f3865e.m2763a();
                        parametersM2763a4.setRotation(message.arg1);
                        this.f3863c.setParameters(parametersM2763a4);
                        this.f3865e.m2764b();
                        break;
                    case 601:
                        this.f3861a.f3880e.m2802c(8);
                        cvy cvyVar = (cvy) message.obj;
                        this.f3863c.takePicture(cvyVar.f9844a, cvyVar.f9845b, cvyVar.f9847d, cvyVar.f9846c);
                        break;
                    default:
                        bop.m2812a(bnh.f3875a, "Invalid CameraProxy message=" + message.what);
                        break;
                }
            } catch (Throwable th) {
                bnt.m2778a(message);
                throw th;
            }
        } catch (RuntimeException e5) {
            int iM2800a = this.f3861a.f3880e.m2800a();
            String str = hsSUWRJfoeC.yTjNHYpCfvdyT + bzq.m3235H(i) + "] at CameraState[" + iM2800a + "]";
            bop.m2813b(bnh.f3875a, "RuntimeException during " + str, e5);
            this.f3861a.f3880e.m2801b();
            if (this.f3863c != null) {
                bop.m2817f(bnh.f3875a);
                try {
                    this.f3863c.release();
                } catch (Exception e6) {
                    bop.m2813b(bnh.f3875a, "Fail when calling Camera.release().", e6);
                } finally {
                    this.f3863c = null;
                }
            }
            if (message.what == 1 && this.f3863c == null) {
                int i5 = message.arg1;
                if (message.obj != null) {
                    ((bnm) message.obj).mo2771c(message.arg1, m2808c(i5));
                }
            } else {
                ((bnh) this.f3862b).f3882g.mo2758b(e5, m2808c(this.f3864d), i, iM2800a);
            }
        }
        bnt.m2778a(message);
    }

    @Override // android.hardware.Camera.ErrorCallback
    public final void onError(int i, Camera camera) {
        this.f3861a.f3882g.mo2757a(i);
        if (i == 100) {
            this.f3861a.f3882g.mo2758b(new RuntimeException("Media server died."), m2808c(this.f3864d), ((Integer) this.f4018r.peekLast()).intValue(), this.f3861a.f3880e.m2800a());
        }
    }
}
