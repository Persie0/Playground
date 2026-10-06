package com.google.android.apps.camera.bottombar;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import p000.npk;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class CameraSwitchButton extends ScalableButton implements SideButtonCombineListener {
    private Animatable buttonAnimatable;
    private final Drawable coupleSwitchAnimationDrawable;
    private final Drawable decoupleSwitchAnimationDrawable;
    private View.OnClickListener onClickListener;
    private final Drawable switchButtonBackground;

    public CameraSwitchButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.switchButtonBackground = context.getResources().getDrawable(C0100R.drawable.camera_switch_button_background, null);
        this.coupleSwitchAnimationDrawable = context.getResources().getDrawable(C0100R.drawable.front_back_switch_button_18px_animation, null);
        this.decoupleSwitchAnimationDrawable = context.getResources().getDrawable(C0100R.drawable.front_back_switch_button_animation, null);
        initialize();
    }

    private void initialize() {
        super.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.apps.camera.bottombar.CameraSwitchButton$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m4059xe6907538(view);
            }
        });
        setFocusable(false);
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            Drawable drawableMutate = background.getConstantState().newDrawable().mutate();
            ((RippleDrawable) drawableMutate).setRadius(getResources().getDimensionPixelSize(C0100R.dimen.camera_switch_button_ripple_diameter) / 2);
            setBackground(drawableMutate);
        }
    }

    /* JADX INFO: renamed from: lambda$initialize$0$com-google-android-apps-camera-bottombar-CameraSwitchButton */
    public /* synthetic */ void m4059xe6907538(View view) {
        this.buttonAnimatable = (Animatable) getDrawable();
        View.OnClickListener onClickListener = this.onClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        npk.m17604h(this);
        Animatable animatable = this.buttonAnimatable;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // com.google.android.apps.camera.bottombar.SideButtonCombineListener
    public void onCouple() {
        setImageDrawable(this.coupleSwitchAnimationDrawable);
        setBackgroundColor(0);
    }

    @Override // com.google.android.apps.camera.bottombar.SideButtonCombineListener
    public void onDecouple() {
        setImageDrawable(this.decoupleSwitchAnimationDrawable);
        setBackground(this.switchButtonBackground);
    }

    public void setFrontFacing(boolean z) {
        setEnabled(false);
        setContentDescription(z ? getResources().getString(C0100R.string.camera_id_front_desc) : getResources().getString(C0100R.string.camera_id_back_desc));
        setEnabled(true);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }
}
