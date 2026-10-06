package p000;

import android.view.View;
import com.google.android.apps.camera.uiutils.ViewSmoothRotationUtil$Rotatee;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ilm implements ViewSmoothRotationUtil$Rotatee {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ View f31451a;

    public ilm(View view) {
        this.f31451a = view;
    }

    @Override // com.google.android.apps.camera.uiutils.ViewSmoothRotationUtil$Rotatee
    /* JADX INFO: renamed from: a */
    public final float mo4510a() {
        return this.f31451a.getRotation();
    }

    @Override // com.google.android.apps.camera.uiutils.ViewSmoothRotationUtil$Rotatee
    /* JADX INFO: renamed from: b */
    public final Object mo4511b() {
        return this.f31451a;
    }

    @Override // com.google.android.apps.camera.uiutils.ViewSmoothRotationUtil$Rotatee
    /* JADX INFO: renamed from: c */
    public final String mo4512c() {
        return "rotation";
    }

    @Override // com.google.android.apps.camera.uiutils.ViewSmoothRotationUtil$Rotatee
    public final void setRotationDegree(float f) {
        this.f31451a.setRotation(f);
    }
}
