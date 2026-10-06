package com.google.android.apps.camera.faceboxes;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.HashMap;
import p000.drg;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class FaceView extends drg {

    /* JADX INFO: renamed from: b */
    private final Paint f6660b;

    public FaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getResources();
        Paint paint = new Paint();
        this.f6660b = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(resources.getDimension(C0100R.dimen.face_rectangle_stroke));
        paint.setColor(resources.getColor(C0100R.color.face_rectangle_color, null));
        new HashMap();
    }
}
