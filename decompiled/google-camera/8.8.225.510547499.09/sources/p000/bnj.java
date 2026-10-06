package p000;

import android.hardware.Camera;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class bnj extends boi {

    /* JADX INFO: renamed from: a */
    private static final boo f3886a = new boo("AndCamSet");

    public bnj(bnj bnjVar) {
        super(bnjVar);
    }

    @Override // p000.boi
    /* JADX INFO: renamed from: a */
    public final boi mo2753a() {
        return new bnj(this);
    }

    public bnj(bob bobVar, Camera.Parameters parameters) {
        bnx bnxVar;
        bny bnyVar;
        bnz bnzVar;
        if (parameters == null) {
            bop.m2814c(f3886a, "Settings ctor requires a non-null Camera.Parameters.");
            return;
        }
        bzq bzqVar = bobVar.f3977w;
        this.f3990g = false;
        Camera.Size previewSize = parameters.getPreviewSize();
        m2799l(new bon(previewSize.width, previewSize.height));
        int previewFrameRate = parameters.getPreviewFrameRate();
        if (previewFrameRate > 0) {
            this.f3993j = previewFrameRate;
            this.f3992i = previewFrameRate;
            this.f3991h = previewFrameRate;
        }
        int[] iArr = new int[2];
        parameters.getPreviewFpsRange(iArr);
        m2797j(iArr[0], iArr[1]);
        this.f3995l = parameters.getPreviewFormat();
        if (bobVar.m2784d(bnw.ZOOM)) {
            this.f3999p = parameters.getZoomRatios().get(parameters.getZoom()).intValue() / 100.0f;
        } else {
            this.f3999p = 1.0f;
        }
        this.f4000q = parameters.getExposureCompensation();
        String flashMode = parameters.getFlashMode();
        if (flashMode == null) {
            bnxVar = bnx.values()[0];
        } else {
            try {
                bnxVar = (bnx) Enum.valueOf(bnx.class, bzq.m3234G(flashMode));
            } catch (IllegalArgumentException e) {
                bnxVar = bnx.values()[0];
            }
        }
        this.f4001r = bnxVar;
        String focusMode = parameters.getFocusMode();
        if (focusMode == null) {
            bnyVar = bny.values()[0];
        } else {
            try {
                bnyVar = (bny) Enum.valueOf(bny.class, bzq.m3234G(focusMode));
            } catch (IllegalArgumentException e2) {
                bnyVar = bny.values()[0];
            }
        }
        this.f4002s = bnyVar;
        String sceneMode = parameters.getSceneMode();
        if (sceneMode == null) {
            bnzVar = bnz.values()[0];
        } else {
            try {
                bnzVar = (bnz) Enum.valueOf(bnz.class, bzq.m3234G(sceneMode));
            } catch (IllegalArgumentException e3) {
                bnzVar = bnz.values()[0];
            }
        }
        this.f4003t = bnzVar;
        bobVar.m2784d(bnw.VIDEO_STABILIZATION);
        this.f4008y = "true".equals(parameters.get("recording-hint"));
        m2796i(parameters.getJpegQuality());
        Camera.Size pictureSize = parameters.getPictureSize();
        m2798k(new bon(pictureSize.width, pictureSize.height));
        this.f3998o = parameters.getPictureFormat();
    }
}
