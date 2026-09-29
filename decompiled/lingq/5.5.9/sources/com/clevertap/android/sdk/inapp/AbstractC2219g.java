package com.clevertap.android.sdk.inapp;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.widget.Button;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2219g extends AbstractC2213d {
    /* JADX INFO: renamed from: A0 */
    public final void m6529A0(Button button, CTInAppNotificationButton cTInAppNotificationButton, int i10) {
        ShapeDrawable shapeDrawable;
        int i11;
        if (cTInAppNotificationButton == null) {
            button.setVisibility(8);
            return;
        }
        button.setVisibility(0);
        button.setTag(Integer.valueOf(i10));
        button.setText(cTInAppNotificationButton.f11130h);
        button.setTextColor(Color.parseColor(cTInAppNotificationButton.f11131i));
        button.setOnClickListener(new AbstractC2211c.a());
        ShapeDrawable shapeDrawable2 = null;
        if (cTInAppNotificationButton.f11126d.isEmpty()) {
            shapeDrawable = null;
        } else {
            float f3 = Float.parseFloat(cTInAppNotificationButton.f11126d);
            WindowManager windowManager = (WindowManager) this.f11184x0.getSystemService("window");
            if (windowManager == null) {
                i11 = 0;
            } else if (Build.VERSION.SDK_INT >= 30) {
                i11 = this.f11184x0.getResources().getConfiguration().densityDpi;
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                i11 = displayMetrics.densityDpi;
            }
            float f10 = (480.0f / i11) * f3 * 2.0f;
            shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f10, f10, f10, f10, f10, f10, f10, f10}, null, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f}));
            shapeDrawable.getPaint().setColor(Color.parseColor(cTInAppNotificationButton.f11124b));
            shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
            shapeDrawable.getPaint().setAntiAlias(true);
            shapeDrawable2 = new ShapeDrawable(new RoundRectShape(new float[]{f10, f10, f10, f10, f10, f10, f10, f10}, null, new float[]{f10, f10, f10, f10, f10, f10, f10, f10}));
        }
        if (!cTInAppNotificationButton.f11125c.isEmpty() && shapeDrawable2 != null) {
            shapeDrawable2.getPaint().setColor(Color.parseColor(cTInAppNotificationButton.f11125c));
            shapeDrawable2.setPadding(1, 1, 1, 1);
            shapeDrawable2.getPaint().setStyle(Paint.Style.FILL);
        }
        if (shapeDrawable != null) {
            button.setBackground(new LayerDrawable(new Drawable[]{shapeDrawable2, shapeDrawable}));
        }
    }
}
