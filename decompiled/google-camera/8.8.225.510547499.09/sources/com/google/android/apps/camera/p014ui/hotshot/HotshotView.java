package com.google.android.apps.camera.p014ui.hotshot;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.params.Face;
import android.util.AttributeSet;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.ArrayList;
import java.util.List;
import p000.bgm;
import p000.bgp;
import p000.bgv;
import p000.dng;
import p000.fax;
import p000.hyv;
import p000.hyx;
import p000.hyy;
import p000.imx;
import p000.jwf;
import p000.jww;
import p000.kpe;
import p000.mws;
import p000.mzr;
import p000.nbh;
import p021j$.util.Collection$EL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class HotshotView extends dng {

    /* JADX INFO: renamed from: a */
    public static final nbh f7027a = nbh.m17259h("com/google/android/apps/camera/ui/hotshot/HotshotView");

    /* JADX INFO: renamed from: j */
    private static final int f7028j = Color.argb(255, 232, 200, 107);

    /* JADX INFO: renamed from: c */
    public final RectF f7029c;

    /* JADX INFO: renamed from: d */
    public hyv f7030d;

    /* JADX INFO: renamed from: e */
    public boolean f7031e;

    /* JADX INFO: renamed from: f */
    public float f7032f;

    /* JADX INFO: renamed from: g */
    public jww f7033g;

    /* JADX INFO: renamed from: h */
    public volatile List f7034h;

    /* JADX INFO: renamed from: i */
    public boolean f7035i;

    /* JADX INFO: renamed from: k */
    private final Paint f7036k;

    /* JADX INFO: renamed from: l */
    private final Paint f7037l;

    /* JADX INFO: renamed from: m */
    private final Paint f7038m;

    /* JADX INFO: renamed from: n */
    private final Paint f7039n;

    /* JADX INFO: renamed from: o */
    private final Paint f7040o;

    /* JADX INFO: renamed from: p */
    private final bgv f7041p;

    /* JADX INFO: renamed from: q */
    private final bgv f7042q;

    /* JADX INFO: renamed from: r */
    private final imx f7043r;

    /* JADX INFO: renamed from: s */
    private final List f7044s;

    /* JADX INFO: renamed from: t */
    private bgm f7045t;

    public HotshotView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7029c = new RectF();
        Paint paint = new Paint();
        this.f7036k = paint;
        Paint paint2 = new Paint();
        this.f7037l = paint2;
        new Paint();
        Paint paint3 = new Paint();
        this.f7038m = paint3;
        Paint paint4 = new Paint();
        this.f7039n = paint4;
        new Paint();
        Paint paint5 = new Paint();
        this.f7040o = paint5;
        new Paint();
        this.f7041p = new bgv();
        this.f7042q = new bgv();
        this.f7043r = new imx();
        this.f7030d = hyv.IDLE;
        this.f7031e = true;
        this.f7032f = 1.0f;
        this.f7033g = new jwf(new hyx[0]);
        int i = mws.f41739d;
        this.f7034h = mzr.f41857a;
        this.f7035i = false;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(6.0f);
        paint.setColor(-1);
        paint3.setAntiAlias(true);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(6.0f);
        paint3.setColor(-65536);
        paint4.setAntiAlias(true);
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setStrokeWidth(6.0f);
        paint4.setColor(f7028j);
        paint4.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(2.0f);
        paint2.setColor(-16777216);
        ArrayList arrayList = new ArrayList();
        this.f7044s = arrayList;
        arrayList.add(new hyy(hyv.DISTANCE_1, new Paint()));
        Collection$EL.forEach(arrayList, fax.f21161n);
        paint5.setAntiAlias(true);
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setStrokeWidth(2.0f);
        paint5.setColor(-16777216);
    }

    /* JADX INFO: renamed from: b */
    private final RectF m4369b(RectF rectF, boolean z) {
        RectF rectF2 = new RectF(rectF);
        m6431a().mapRect(rectF2);
        if (z) {
            RectF rectF3 = this.f12088b.f35560a;
            rectF3.getClass();
            rectF2.intersect(rectF3);
        }
        return rectF2;
    }

    /* JADX INFO: renamed from: c */
    private final void m4370c(float f) {
        if (this.f7045t == null) {
            return;
        }
        float f2 = (f / 300.0f) / getResources().getDisplayMetrics().density;
        Rect rect = this.f7045t.f3178g;
        this.f7041p.setBounds(new Rect(0, 0, (int) (rect.width() * f2), (int) (rect.height() * f2)));
        this.f7041p.f3207c = f2;
        this.f7042q.f3207c = f2;
    }

    /* JADX INFO: renamed from: d */
    private static final RectF m4371d(Rect rect) {
        RectF rectF = new RectF(rect);
        RectF rectF2 = new RectF(rectF);
        float fWidth = rectF.width() / 2.0f;
        float fHeight = rectF.height() / 2.0f;
        float f = fWidth * 1.6f;
        rectF2.left = rectF.centerX() - f;
        float f2 = fHeight * 1.6f;
        rectF2.top = rectF.centerY() - f2;
        rectF2.right = rectF.centerX() + f;
        rectF2.bottom = rectF.centerY() + f2;
        return rectF2;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x014a A[ADDED_TO_REGION, REMOVE] */
    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int i;
        boolean z = false;
        if (this.f7034h.isEmpty()) {
            this.f7033g.mo3415bf(new hyx[0]);
            return;
        }
        hyx[] hyxVarArr = new hyx[this.f7034h.size()];
        int i2 = 0;
        while (i2 < this.f7034h.size()) {
            Face face = (Face) this.f7034h.get(i2);
            RectF rectFM4369b = m4369b(m4371d(face.getBounds()), z);
            if (i2 == 0) {
                imx imxVar = this.f7043r;
                imxVar.f31559a.m11498a(rectFM4369b.centerX());
                imxVar.f31563e = imxVar.f31559a.f31556a;
                imxVar.f31560b.m11498a(rectFM4369b.centerY());
                imxVar.f31564f = imxVar.f31560b.f31556a;
                imxVar.f31561c.m11498a(rectFM4369b.width());
                imxVar.f31565g = imxVar.f31561c.f31556a;
                imxVar.f31562d.m11498a(rectFM4369b.height());
                imxVar.f31566h = imxVar.f31562d.f31556a;
                imx imxVar2 = this.f7043r;
                float f = imxVar2.f31563e;
                float f2 = imxVar2.f31565g / 2.0f;
                float f3 = imxVar2.f31564f;
                float f4 = imxVar2.f31566h / 2.0f;
                rectFM4369b = new RectF(f - f2, f3 - f4, f + f2, f3 + f4);
                i2 = 0;
            }
            float fMax = Math.max(rectFM4369b.width(), rectFM4369b.height()) / 2.0f;
            boolean z2 = true;
            RectF rectFM4369b2 = m4369b(m4371d(face.getBounds()), true);
            RectF rectFM4369b3 = m4369b(new RectF(face.getBounds()), true);
            if (rectFM4369b3.left == rectFM4369b2.left || rectFM4369b3.top == rectFM4369b2.top || rectFM4369b3.right == rectFM4369b2.right) {
                z2 = true;
            } else if (rectFM4369b3.bottom != rectFM4369b2.bottom) {
                float fWidth = rectFM4369b3.width() / rectFM4369b3.height();
                float fWidth2 = rectFM4369b2.width() / rectFM4369b2.height();
                float fAbs = Math.abs(rectFM4369b3.left - rectFM4369b2.left);
                float fAbs2 = Math.abs(rectFM4369b3.top - rectFM4369b2.top);
                float fAbs3 = fAbs - Math.abs(rectFM4369b3.right - rectFM4369b2.right);
                float fAbs4 = Math.abs(rectFM4369b3.bottom - rectFM4369b2.bottom);
                if (Math.abs(fAbs3) > 2.0f || Math.abs(fAbs2 - fAbs4) > 2.0f) {
                    z2 = true;
                } else {
                    float f5 = 1.0f;
                    if (this.f7035i && Math.abs(fWidth - 0.75f) <= 0.025f) {
                        f5 = 0.75f;
                    }
                    if (Math.abs(fWidth2 - f5) > 0.025f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
            }
            hyxVarArr[i2] = new hyx(kpe.m14671a(face), z2);
            float fCenterX = rectFM4369b.centerX();
            float fCenterY = rectFM4369b.centerY();
            boolean zEquals = this.f7030d.equals(hyv.READY_TO_CAPTURE);
            m4370c(fMax);
            bgv bgvVar = this.f7041p;
            if (zEquals) {
                bgvVar = this.f7042q;
                if (((int) bgvVar.f3206b.f3730d) == 0 && !bgvVar.m2449p()) {
                    this.f7042q.m2444k();
                }
            } else {
                this.f7042q.m2442i();
                this.f7042q.m2446m(0);
            }
            bgv bgvVar2 = this.f7041p;
            if (z2) {
                i = 0;
            } else {
                i = zEquals ? 40 : 20;
            }
            bgvVar2.m2446m(i);
            canvas.save();
            canvas.translate(fCenterX - (this.f7041p.getBounds().width() / 2.0f), fCenterY - (this.f7041p.getBounds().height() / 2.0f));
            bgvVar.draw(canvas);
            canvas.restore();
            i2++;
            z = false;
        }
        this.f7033g.mo3415bf(hyxVarArr);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        Object obj = bgp.m2422c(getContext(), C0100R.raw.hotshot_face_tracking_ring_animation).f3263a;
        obj.getClass();
        bgm bgmVar = (bgm) obj;
        this.f7045t = bgmVar;
        this.f7041p.m2450q(bgmVar);
        Object obj2 = bgp.m2422c(getContext(), C0100R.raw.hotshot_confirmation_single_pulse).f3263a;
        obj2.getClass();
        this.f7042q.m2450q((bgm) obj2);
        m4370c(300.0f);
    }
}
