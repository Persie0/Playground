package com.google.android.apps.camera.p014ui.bottomsheet;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class BottomSheetButton extends MaterialButton {

    /* JADX INFO: renamed from: b */
    private final Context f6991b;

    public BottomSheetButton(Context context) {
        super(context);
        this.f6991b = context;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int dimensionPixelSize = configuration.orientation == 2 ? this.f6991b.getResources().getDimensionPixelSize(C0100R.dimen.bottom_sheet_button_width) : -1;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = dimensionPixelSize;
        setLayoutParams(layoutParams);
    }

    public BottomSheetButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6991b = context;
    }

    public BottomSheetButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6991b = context;
    }
}
