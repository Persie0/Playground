package p000;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.apps.camera.coach.CameraCoachHudView;
import com.google.android.apps.camera.uiutils.ViewSmoothRotationUtil$Rotatee;
import com.google.android.apps.camera.zoomui.view.ZoomUi;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.OisMetadata;
import java.io.IOException;
import java.io.OutputStream;
import java.util.function.Consumer;
import java.util.function.Supplier;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class idi implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f30448a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f30449b;

    public /* synthetic */ idi(CameraCoachHudView cameraCoachHudView, int i) {
        this.f30449b = i;
        this.f30448a = cameraCoachHudView;
    }

    public /* synthetic */ idi(ZoomUi zoomUi, int i) {
        this.f30449b = i;
        this.f30448a = zoomUi;
    }

    public /* synthetic */ idi(FrameMetadata frameMetadata, int i) {
        this.f30449b = i;
        this.f30448a = frameMetadata;
    }

    public /* synthetic */ idi(htf htfVar, int i) {
        this.f30449b = i;
        this.f30448a = htfVar;
    }

    public /* synthetic */ idi(idl idlVar, int i) {
        this.f30449b = i;
        this.f30448a = idlVar;
    }

    public /* synthetic */ idi(iga igaVar, int i) {
        this.f30449b = i;
        this.f30448a = igaVar;
    }

    public /* synthetic */ idi(igq igqVar, int i) {
        this.f30449b = i;
        this.f30448a = igqVar;
    }

    public /* synthetic */ idi(ilk ilkVar, int i) {
        this.f30449b = i;
        this.f30448a = ilkVar;
    }

    public /* synthetic */ idi(liv livVar, int i, byte[] bArr) {
        this.f30449b = i;
        this.f30448a = livVar;
    }

    public /* synthetic */ idi(byte[] bArr, int i) {
        this.f30449b = i;
        this.f30448a = bArr;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f30449b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [htf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, mpv] */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f30449b) {
            case 0:
                ((idl) this.f30448a).m11116a((idk) obj);
                break;
            case 1:
                this.f30448a.mo10742j((Supplier) obj);
                break;
            case 2:
                ((iga) this.f30448a).f30701b.resetTo(ifi.PHOTO_IDLE);
                break;
            case 3:
                ((igq) this.f30448a).f30852a.f30933p = ((Integer) obj).intValue();
                break;
            case 4:
                jvh.m13578z((View) obj, (ilk) this.f30448a);
                break;
            case 5:
                Object obj2 = this.f30448a;
                int iIntValue = ((Integer) obj).intValue();
                CameraCoachHudView cameraCoachHudView = (CameraCoachHudView) obj2;
                if (cameraCoachHudView.f6593d.mo16813g()) {
                    ((dgd) cameraCoachHudView.f6593d.mo16809c()).f10880o = iIntValue;
                }
                break;
            case 6:
                jvh.m13578z((View) obj, ((ZoomUi) this.f30448a).f7409e);
                break;
            case 7:
                Object obj3 = this.f30448a;
                View view = (View) obj;
                if (!(view instanceof ViewSmoothRotationUtil$Rotatee)) {
                    jvh.m13578z(view, ((ZoomUi) obj3).f7409e);
                } else {
                    mrm mrmVarM13575w = jvh.m13575w((ViewSmoothRotationUtil$Rotatee) view, ((ZoomUi) obj3).f7409e);
                    if (mrmVarM13575w.mo16813g()) {
                        ((ValueAnimator) mrmVarM13575w.mo16809c()).start();
                    }
                }
                break;
            case 8:
                ((inr) obj).mo10341a((byte[]) this.f30448a);
                break;
            case 9:
                Object obj4 = this.f30448a;
                try {
                    ((OutputStream) obj).write((byte[]) obj4);
                } catch (IOException e) {
                    ((nbe) ((nbe) ((nbe) mpr.f41274a.m17251b()).mo17283h(e)).mo17276G(4582)).mo17291p("Failed to write %d bytes of processed audio to the output stream.", ((byte[]) obj4).length);
                    return;
                }
                break;
            case 10:
                ((liv) this.f30448a).f38339a.provideVideoFrame((mqi) obj);
                break;
            default:
                OisMetadata oisMetadata = (OisMetadata) obj;
                FrameMetadata frameMetadata = (FrameMetadata) this.f30448a;
                GcamModuleJNI.FrameMetadata_ois_metadata_set(frameMetadata.f8263a, frameMetadata, oisMetadata == null ? 0L : oisMetadata.f8324a, oisMetadata);
                break;
        }
    }
}
