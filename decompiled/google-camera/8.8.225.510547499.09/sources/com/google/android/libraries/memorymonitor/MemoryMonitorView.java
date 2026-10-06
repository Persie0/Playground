package com.google.android.libraries.memorymonitor;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import p000.kxl;
import p000.kxm;
import p000.kxo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class MemoryMonitorView extends View {

    /* JADX INFO: renamed from: a */
    public static final float f7928a;

    /* JADX INFO: renamed from: h */
    private static final Runtime f7929h;

    /* JADX INFO: renamed from: b */
    public final long f7930b;

    /* JADX INFO: renamed from: c */
    public final long f7931c;

    /* JADX INFO: renamed from: d */
    public final long f7932d;

    /* JADX INFO: renamed from: e */
    public final float f7933e;

    /* JADX INFO: renamed from: f */
    public final kxm f7934f;

    /* JADX INFO: renamed from: g */
    public volatile kxl f7935g;

    /* JADX INFO: renamed from: i */
    private final Resources f7936i;

    /* JADX INFO: renamed from: j */
    private int f7937j;

    /* JADX INFO: renamed from: k */
    private int f7938k;

    /* JADX INFO: renamed from: l */
    private final Paint f7939l;

    /* JADX INFO: renamed from: m */
    private final Paint f7940m;

    /* JADX INFO: renamed from: n */
    private final Paint f7941n;

    /* JADX INFO: renamed from: o */
    private float f7942o;

    /* JADX INFO: renamed from: p */
    private final float f7943p;

    /* JADX INFO: renamed from: q */
    private final float f7944q;

    /* JADX INFO: renamed from: r */
    private final GestureDetector f7945r;

    /* JADX INFO: renamed from: s */
    private final kxo f7946s;

    static {
        Runtime runtime = Runtime.getRuntime();
        f7929h = runtime;
        f7928a = m4700b(runtime.maxMemory());
    }

    public MemoryMonitorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7934f = new kxm();
        this.f7935g = new kxl();
        kxo kxoVar = new kxo(this);
        this.f7946s = kxoVar;
        Resources resources = context.getResources();
        this.f7936i = resources;
        this.f7937j = m4699a(context, 45);
        this.f7938k = m4699a(context, 140);
        this.f7939l = new Paint();
        Paint paint = new Paint();
        this.f7940m = paint;
        paint.setStrokeWidth(m4699a(context, 1));
        this.f7943p = m4699a(context, 2);
        float fM4699a = m4699a(context, 7);
        this.f7944q = fM4699a;
        Paint paint2 = new Paint();
        this.f7941n = paint2;
        paint2.setColor(-16777216);
        paint2.setTextSize(fM4699a);
        ActivityManager activityManager = (ActivityManager) getContext().getSystemService("activity");
        this.f7930b = activityManager.getMemoryClass();
        this.f7931c = activityManager.getLargeMemoryClass();
        this.f7932d = f7929h.maxMemory();
        this.f7933e = resources.getDisplayMetrics().heightPixels / 2;
        this.f7945r = new GestureDetector(context, kxoVar);
    }

    /* JADX INFO: renamed from: a */
    public static int m4699a(Context context, int i) {
        return Math.round(i * context.getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: renamed from: b */
    public static long m4700b(double d) {
        return Math.round(d / 1048576.0d);
    }

    /* JADX INFO: renamed from: c */
    private final float m4701c(long j) {
        long j2 = this.f7932d;
        if (j2 == 0) {
            return 0.0f;
        }
        return (j / j2) * this.f7942o;
    }

    /* JADX INFO: renamed from: d */
    private final float m4702d(long j, int i, int i2, Canvas canvas, int i3) {
        this.f7939l.setColor(i3);
        float fM4701c = m4701c(j);
        int width = getWidth() * i2;
        float height = (getHeight() - i) - fM4701c;
        float f = width / 3.0f;
        RectF rectF = new RectF(f, height, (getWidth() / 3.0f) + f, height + fM4701c);
        float f2 = this.f7943p;
        canvas.drawRoundRect(rectF, f2, f2, this.f7939l);
        float f3 = this.f7944q / 2.0f;
        canvas.drawText(m4700b(j) + "M", (i2 * getWidth()) / 3.0f, ((getHeight() - i) - fM4701c) + (fM4701c / 2.0f) + f3, this.f7941n);
        return fM4701c;
    }

    /* JADX INFO: renamed from: e */
    private final void m4703e(int i, Canvas canvas, int i2) {
        m4702d(0L, 0, i, canvas, i2);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        this.f7937j = m4699a(getContext(), 45);
        this.f7938k = m4699a(getContext(), 140);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.f7939l.setColor(-7829368);
        this.f7942o = getHeight() * 0.5f;
        RectF rectF = new RectF(0.0f, getHeight() - this.f7942o, getWidth(), getHeight());
        float f = this.f7943p;
        canvas.drawRoundRect(rectF, f, f, this.f7939l);
        kxl kxlVar = this.f7935g;
        long j = this.f7934f.f37657c;
        long j2 = kxlVar.f37658c;
        float fM4702d = m4702d(-j, 0, 0, canvas, -16711936) + 0.0f;
        if (j > 0) {
            m4702d(j, (int) fM4702d, 0, canvas, -2998243);
        }
        long j3 = kxlVar.f37652a;
        m4703e(1, canvas, -256);
        long j4 = kxlVar.f37653b;
        m4703e(2, canvas, -13068292);
        float height = getHeight();
        long j5 = kxlVar.f37659d;
        float fM4701c = height - m4701c(0L);
        this.f7940m.setColor(-16777216);
        canvas.drawLine(0.0f, fM4701c, getWidth() / 3.0f, fM4701c, this.f7940m);
        float height2 = getHeight();
        long j6 = kxlVar.f37660e;
        float fM4701c2 = height2 - m4701c(0L);
        this.f7940m.setColor(-2998243);
        canvas.drawLine(0.0f, fM4701c2, getWidth() / 3.0f, fM4701c2, this.f7940m);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            size = mode == Integer.MIN_VALUE ? Math.min(this.f7937j, size) : this.f7937j;
        }
        if (mode2 != 1073741824) {
            size2 = mode2 == Integer.MIN_VALUE ? Math.min(this.f7938k, size2) : this.f7938k;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            kxo kxoVar = this.f7946s;
            int i = kxo.f37661d;
            float f = kxoVar.f37663b;
            if (f != kxoVar.f37662a) {
                kxoVar.m15035a("Inflating heap utilization to %.2f%% (%.2f MB)", Float.valueOf(f * 100.0f), Float.valueOf(kxoVar.f37663b * f7928a));
                kxm kxmVar = kxoVar.f37664c.f7934f;
                long jM15034a = kxmVar.f37657c + ((long) ((kxoVar.f37663b - kxm.m15034a()) * kxmVar.f37655a));
                while (kxmVar.f37657c > jM15034a && !kxmVar.f37656b.isEmpty()) {
                    kxmVar.f37657c -= (long) ((byte[]) kxmVar.f37656b.pop()).length;
                }
                while (true) {
                    long j = kxmVar.f37657c;
                    if (j >= jM15034a) {
                        break;
                    }
                    int iMin = (int) Math.min(jM15034a - j, 1048576L);
                    kxmVar.f37656b.push(new byte[iMin]);
                    kxmVar.f37657c += (long) iMin;
                }
            } else {
                kxl kxlVar = kxoVar.f37664c.f7935g;
                long j2 = kxlVar.f37659d;
                long jM4700b = m4700b(0.0d);
                long j3 = kxlVar.f37660e;
                long jM4700b2 = m4700b(0.0d);
                long jM4700b3 = m4700b(kxoVar.f37664c.f7932d);
                MemoryMonitorView memoryMonitorView = kxoVar.f37664c;
                kxoVar.m15035a("Red: Artificially inflated Dalvik heap alloc.\nGreen: Dalvik heap alloc.\nYellow: Native heap alloc\nBlue: Other private dirty (GL RAM)\nBlack line: Dalvik heap size: " + jM4700b + "MB\nRed line: Max Dalvik heap memory: " + jM4700b2 + "MB\nGrey background bounds: large heap size: " + jM4700b3 + "MB (should be the same as the red line)\nDefault heap: " + memoryMonitorView.f7930b + " MB; large heap: " + memoryMonitorView.f7931c + " MB", new Object[0]);
            }
        }
        return this.f7945r.onTouchEvent(motionEvent);
    }
}
