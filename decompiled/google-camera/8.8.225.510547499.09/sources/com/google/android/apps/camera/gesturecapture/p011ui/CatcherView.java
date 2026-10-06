package com.google.android.apps.camera.gesturecapture.p011ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.dng;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class CatcherView extends dng {

    /* JADX INFO: renamed from: a */
    private final Paint f6717a;

    /* JADX INFO: renamed from: c */
    private final Paint f6718c;

    /* JADX INFO: renamed from: d */
    private final Context f6719d;

    /* JADX INFO: renamed from: e */
    private final Rect f6720e;

    /* JADX INFO: renamed from: f */
    private final int f6721f;

    public CatcherView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6717a = new Paint();
        this.f6721f = 4;
        this.f6719d = context;
        this.f6720e = new Rect();
        this.f6718c = new Paint(1);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        if (this.f6721f == 2) {
            canvas.drawRect(this.f6720e, this.f6718c);
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.f6717a.setColor(-1);
        this.f6717a.setStrokeWidth(4.0f);
        this.f6717a.setStyle(Paint.Style.STROKE);
        this.f6718c.setStyle(Paint.Style.STROKE);
        this.f6718c.setStrokeWidth(4.0f);
        this.f6718c.setColor(this.f6719d.getColor(C0100R.color.gesture_confirm_state_color));
    }
}
