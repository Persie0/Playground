package com.clevertap.android.sdk.customviews;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatImageView;
import com.clevertap.android.sdk.C2181a;

/* JADX INFO: loaded from: classes.dex */
public final class CloseImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: d */
    public final int f11022d;

    @SuppressLint({"ResourceType"})
    public CloseImageView(Context context) {
        super(context, null);
        this.f11022d = (int) TypedValue.applyDimension(1, 40, getResources().getDisplayMetrics());
        setId(199272);
    }

    @SuppressLint({"ResourceType"})
    public CloseImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11022d = (int) TypedValue.applyDimension(1, 40, getResources().getDisplayMetrics());
        setId(199272);
    }

    @Override // android.widget.ImageView, android.view.View
    @SuppressLint({"DrawAllocation"})
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        try {
            Context context = getContext();
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), context.getResources().getIdentifier("ct_close", "drawable", context.getPackageName()), null);
            if (bitmapDecodeResource != null) {
                int i10 = this.f11022d;
                canvas.drawBitmap(Bitmap.createScaledBitmap(bitmapDecodeResource, i10, i10, true), 0.0f, 0.0f, new Paint());
            } else {
                C2181a.m6455h("Unable to find inapp notif close button image");
            }
        } catch (Throwable th2) {
            C2181a.m6457j("Error displaying the inapp notif close button image:", th2);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = this.f11022d;
        setMeasuredDimension(i12, i12);
    }
}
