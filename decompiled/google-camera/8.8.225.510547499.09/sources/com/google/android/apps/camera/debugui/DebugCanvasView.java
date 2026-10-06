package com.google.android.apps.camera.debugui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.RectF;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.AttributeSet;
import java.util.List;
import p000.dng;
import p000.mqj;
import p000.mws;
import p000.mzr;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class DebugCanvasView extends dng {

    /* JADX INFO: renamed from: a */
    public volatile boolean f6610a;

    /* JADX INFO: renamed from: c */
    private final Paint f6611c;

    /* JADX INFO: renamed from: d */
    private final Paint f6612d;

    /* JADX INFO: renamed from: e */
    private final Paint f6613e;

    /* JADX INFO: renamed from: f */
    private final Paint f6614f;

    /* JADX INFO: renamed from: g */
    private final Paint f6615g;

    /* JADX INFO: renamed from: h */
    private final Paint f6616h;

    /* JADX INFO: renamed from: i */
    private final Paint f6617i;

    /* JADX INFO: renamed from: j */
    private final Paint f6618j;

    /* JADX INFO: renamed from: k */
    private final Paint f6619k;

    /* JADX INFO: renamed from: l */
    private final Paint f6620l;

    /* JADX INFO: renamed from: m */
    private volatile List f6621m;

    /* JADX INFO: renamed from: n */
    private volatile List f6622n;

    /* JADX INFO: renamed from: o */
    private volatile List f6623o;

    /* JADX INFO: renamed from: p */
    private volatile MeteringRectangle f6624p;

    /* JADX INFO: renamed from: q */
    private volatile mqj f6625q;

    /* JADX INFO: renamed from: r */
    private volatile List f6626r;

    /* JADX INFO: renamed from: s */
    private volatile List f6627s;

    /* JADX INFO: renamed from: t */
    private volatile List f6628t;

    public DebugCanvasView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f6611c = paint;
        Paint paint2 = new Paint();
        this.f6612d = paint2;
        Paint paint3 = new Paint();
        this.f6613e = paint3;
        Paint paint4 = new Paint();
        this.f6614f = paint4;
        Paint paint5 = new Paint();
        this.f6615g = paint5;
        Paint paint6 = new Paint();
        this.f6616h = paint6;
        Paint paint7 = new Paint();
        this.f6617i = paint7;
        Paint paint8 = new Paint();
        this.f6618j = paint8;
        Paint paint9 = new Paint();
        this.f6619k = paint9;
        Paint paint10 = new Paint();
        this.f6620l = paint10;
        int i = mws.f41739d;
        this.f6621m = mzr.f41857a;
        this.f6622n = mzr.f41857a;
        this.f6623o = mzr.f41857a;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3.0f);
        paint.setColor(-256);
        paint.setTextSize(48.0f);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setPathEffect(new DashPathEffect(new float[]{4.0f, 4.0f}, 0.0f));
        paint2.setStrokeWidth(3.0f);
        paint2.setColor(-16711936);
        paint3.setAntiAlias(true);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(3.0f);
        paint3.setColor(-1);
        paint3.setTextSize(30.0f);
        paint4.setAntiAlias(true);
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setStrokeWidth(6.0f);
        paint4.setStrokeMiter(0.6f);
        paint4.setColor(-16776961);
        paint4.setTextSize(64.0f);
        paint5.setColor(-65536);
        paint5.setStrokeWidth(16.0f);
        paint5.setStyle(Paint.Style.STROKE);
        paint6.setColor(-16711936);
        paint6.setStrokeWidth(3.0f);
        paint6.setStyle(Paint.Style.STROKE);
        paint6.setTextSize(48.0f);
        paint7.setColor(-1);
        paint7.setStrokeWidth(3.0f);
        paint7.setStyle(Paint.Style.STROKE);
        paint7.setTextSize(48.0f);
        paint8.setColor(-65536);
        paint8.setStrokeWidth(4.0f);
        paint8.setStyle(Paint.Style.STROKE);
        paint9.setColor(-1);
        paint9.setStrokeWidth(2.0f);
        paint9.setStyle(Paint.Style.STROKE);
        paint10.setColor(-1);
        paint10.setStrokeWidth(2.0f);
        paint10.setStyle(Paint.Style.STROKE);
        paint10.setTextSize(24.0f);
        new RectF();
        this.f6624p = null;
        this.f6625q = null;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        this.f12088b.m13970e();
    }
}
