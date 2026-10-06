package com.google.android.clockwork.common.wearable.wearmaterial.selectioncontrol;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ToggleButton;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.iyr;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class WearToggle extends ToggleButton {
    public WearToggle(Context context) {
        this(context, null);
    }

    @Override // android.widget.CompoundButton
    public final Drawable getButtonDrawable() {
        Drawable buttonDrawable = super.getButtonDrawable();
        return buttonDrawable instanceof iyr ? ((iyr) buttonDrawable).getDrawable() : buttonDrawable;
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence stateDescription;
        if (accessibilityEvent.getEventType() == 32768 && (stateDescription = getStateDescription()) != null) {
            announceForAccessibility(stateDescription.toString());
        }
        super.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.widget.CompoundButton
    public final void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(new iyr(drawable));
    }

    public WearToggle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0100R.attr.wearToggleStyle);
    }

    public WearToggle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
