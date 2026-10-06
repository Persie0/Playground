package com.google.android.apps.camera.bottombar;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.apps.camera.p014ui.shutterbutton.ShutterButton;
import p000.ifi;
import p000.iga;
import p000.igg;
import p000.ill;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class SnapshotButton extends ShutterButton {
    public SnapshotButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.apps.camera.p014ui.shutterbutton.ShutterButton
    protected float getDefaultScale() {
        TypedValue typedValue = new TypedValue();
        getResources().getValue(C0100R.dimen.snapshot_button_scale, typedValue, true);
        return typedValue.getFloat();
    }

    @Override // com.google.android.apps.camera.p014ui.shutterbutton.ShutterButton
    protected float getOuterCircleStrokeWidth() {
        return ill.m11431b(2.0f);
    }

    @Override // com.google.android.apps.camera.p014ui.shutterbutton.ShutterButton
    public void setClickEnabled(boolean z) {
        super.setClickEnabled(z);
    }

    @Override // com.google.android.apps.camera.p014ui.shutterbutton.ShutterButton
    public void setMode(ifi ifiVar, iga igaVar) {
        if (ifiVar.equals(ifi.PHOTO_PRESSED)) {
            super.setMode(ifi.PHOTO_PRESSED, igaVar);
        } else {
            super.setMode(ifi.PHOTO_IDLE, igaVar);
        }
    }

    public void wirePressedStateAnimationListener() {
        final iga igaVar = new iga(this);
        setListener(new igg() { // from class: com.google.android.apps.camera.bottombar.SnapshotButton.1
            @Override // p000.igg, p000.igf
            public void onShutterButtonPressedStateChanged(boolean z) {
                SnapshotButton.this.runPressedStateAnimation(z, igaVar);
            }
        });
        setClickEnabled(true);
    }
}
