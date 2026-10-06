package com.google.android.apps.camera.bottombar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class SideButtonContainer extends ConstraintLayout implements SideButtonCombineListener {
    private final Drawable containerBackground;

    public SideButtonContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.containerBackground = context.getResources().getDrawable(C0100R.drawable.side_button_container_background, null);
    }

    @Override // com.google.android.apps.camera.bottombar.SideButtonCombineListener
    public void onCouple() {
        setBackground(this.containerBackground);
    }

    @Override // com.google.android.apps.camera.bottombar.SideButtonCombineListener
    public void onDecouple() {
        setBackgroundColor(0);
    }
}
