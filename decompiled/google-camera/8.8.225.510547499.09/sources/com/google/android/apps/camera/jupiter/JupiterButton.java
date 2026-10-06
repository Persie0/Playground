package com.google.android.apps.camera.jupiter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.bottombar.SideButtonCombineListener;
import p000.C0273iq;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class JupiterButton extends C0273iq implements SideButtonCombineListener {

    /* JADX INFO: renamed from: a */
    private final Drawable f6756a;

    public JupiterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6756a = context.getResources().getDrawable(C0100R.drawable.jupiter_button_background, null);
    }

    @Override // com.google.android.apps.camera.bottombar.SideButtonCombineListener
    public final void onCouple() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.apps.camera.bottombar.SideButtonCombineListener
    public final void onDecouple() {
        setBackground(this.f6756a);
    }
}
