package com.google.android.apps.camera.wear.wearappv2.p016ui;

import android.content.Context;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.View;
import java.text.DateFormat;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class ScalableBitmapView extends View {
    static {
        DateFormat.getDateTimeInstance(2, 3);
    }

    public ScalableBitmapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Matrix();
    }
}
