package com.google.android.apps.camera.zoomui.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Scroller;
import android.widget.TextView;
import com.google.android.apps.camera.app.silentfeedback.p004ip.TVkaNXnfP;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.uiutils.ViewSmoothRotationUtil$Rotatee;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Predicate;
import p000.cdp;
import p000.cwp;
import p000.dhv;
import p000.dib;
import p000.euw;
import p000.iso;
import p000.isz;
import p000.iug;
import p000.jzn;
import p000.kxk;
import p000.mkv;
import p000.muc;
import p000.mws;
import p000.mxi;
import p000.mxk;
import p000.nbh;
import p021j$.util.Collection$EL;
import p021j$.util.function.Predicate$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ZoomSliderView extends View implements ViewSmoothRotationUtil$Rotatee {

    /* JADX INFO: renamed from: a */
    public static final nbh f7341a = nbh.m17259h(TVkaNXnfP.AskRtNcD);

    /* JADX INFO: renamed from: A */
    private int f7342A;

    /* JADX INFO: renamed from: B */
    private int f7343B;

    /* JADX INFO: renamed from: C */
    private float f7344C;

    /* JADX INFO: renamed from: D */
    private float f7345D;

    /* JADX INFO: renamed from: E */
    private float f7346E;

    /* JADX INFO: renamed from: F */
    private float f7347F;

    /* JADX INFO: renamed from: G */
    private float f7348G;

    /* JADX INFO: renamed from: H */
    private float f7349H;

    /* JADX INFO: renamed from: I */
    private float f7350I;

    /* JADX INFO: renamed from: J */
    private float f7351J;

    /* JADX INFO: renamed from: K */
    private Paint f7352K;

    /* JADX INFO: renamed from: L */
    private float f7353L;

    /* JADX INFO: renamed from: M */
    private float f7354M;

    /* JADX INFO: renamed from: N */
    private float f7355N;

    /* JADX INFO: renamed from: O */
    private float f7356O;

    /* JADX INFO: renamed from: P */
    private int f7357P;

    /* JADX INFO: renamed from: Q */
    private float f7358Q;

    /* JADX INFO: renamed from: R */
    private int f7359R;

    /* JADX INFO: renamed from: S */
    private float f7360S;

    /* JADX INFO: renamed from: T */
    private int f7361T;

    /* JADX INFO: renamed from: U */
    private int f7362U;

    /* JADX INFO: renamed from: V */
    private float f7363V;

    /* JADX INFO: renamed from: W */
    private float f7364W;

    /* JADX INFO: renamed from: aa */
    private int f7365aa;

    /* JADX INFO: renamed from: ab */
    private float f7366ab;

    /* JADX INFO: renamed from: ac */
    private long f7367ac;

    /* JADX INFO: renamed from: ad */
    private Paint f7368ad;

    /* JADX INFO: renamed from: ae */
    private Paint f7369ae;

    /* JADX INFO: renamed from: af */
    private Paint f7370af;

    /* JADX INFO: renamed from: ag */
    private TextPaint f7371ag;

    /* JADX INFO: renamed from: ah */
    private VelocityTracker f7372ah;

    /* JADX INFO: renamed from: ai */
    private int f7373ai;

    /* JADX INFO: renamed from: aj */
    private int f7374aj;

    /* JADX INFO: renamed from: ak */
    private int f7375ak;

    /* JADX INFO: renamed from: al */
    private int f7376al;

    /* JADX INFO: renamed from: am */
    private int f7377am;

    /* JADX INFO: renamed from: an */
    private mws f7378an;

    /* JADX INFO: renamed from: ao */
    private mws f7379ao;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f7380b;

    /* JADX INFO: renamed from: c */
    public float f7381c;

    /* JADX INFO: renamed from: d */
    public float f7382d;

    /* JADX INFO: renamed from: e */
    public float f7383e;

    /* JADX INFO: renamed from: f */
    public float f7384f;

    /* JADX INFO: renamed from: g */
    public float f7385g;

    /* JADX INFO: renamed from: h */
    public float f7386h;

    /* JADX INFO: renamed from: i */
    public float f7387i;

    /* JADX INFO: renamed from: j */
    public int f7388j;

    /* JADX INFO: renamed from: k */
    public float f7389k;

    /* JADX INFO: renamed from: l */
    public int f7390l;

    /* JADX INFO: renamed from: m */
    public float f7391m;

    /* JADX INFO: renamed from: n */
    public float f7392n;

    /* JADX INFO: renamed from: o */
    public Scroller f7393o;

    /* JADX INFO: renamed from: p */
    public boolean f7394p;

    /* JADX INFO: renamed from: q */
    public boolean f7395q;

    /* JADX INFO: renamed from: r */
    public boolean f7396r;

    /* JADX INFO: renamed from: s */
    public mws f7397s;

    /* JADX INFO: renamed from: t */
    public mws f7398t;

    /* JADX INFO: renamed from: u */
    public isz f7399u;

    /* JADX INFO: renamed from: v */
    private final int f7400v;

    /* JADX INFO: renamed from: w */
    private final float f7401w;

    /* JADX INFO: renamed from: x */
    private final boolean f7402x;

    /* JADX INFO: renamed from: y */
    private final float f7403y;

    /* JADX INFO: renamed from: z */
    private final boolean f7404z;

    public ZoomSliderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: renamed from: n */
    private final int m4531n(int i) {
        double dLog = (Math.log(2.0f / this.f7383e) - Math.log(1.0f / this.f7383e)) / Math.log(this.f7384f / this.f7383e);
        double d = i;
        Double.isNaN(d);
        return Math.round((float) (d / dLog));
    }

    /* JADX INFO: renamed from: o */
    private final void m4532o() {
        float f = this.f7386h;
        float fMin = Math.min(Math.max(this.f7391m, 0.0f), this.f7389k);
        this.f7391m = fMin;
        this.f7386h = (this.f7388j + (Math.round(fMin / this.f7387i) * this.f7390l)) / 25.0f;
        if (this.f7399u != null) {
            mws mwsVar = this.f7398t;
            int size = mwsVar.size();
            for (int i = 0; i < size; i++) {
                float fIntValue = ((Integer) mwsVar.get(i)).intValue();
                if (Math.abs(this.f7386h - fIntValue) >= 0.05f) {
                    if (fIntValue == f) {
                        break;
                    }
                    if (Math.max(this.f7386h, fIntValue) == Math.min(fIntValue, f) || Math.min(this.f7386h, fIntValue) == Math.max(fIntValue, f)) {
                        this.f7399u.m11712a(fIntValue, this.f7394p);
                        this.f7386h = fIntValue;
                        break;
                    }
                } else {
                    this.f7386h = fIntValue;
                }
            }
            this.f7399u.m11712a(this.f7386h, this.f7394p);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: p */
    private final void m4533p(Canvas canvas, float f, float f2, float f3) {
        if (!this.f7404z) {
            canvas.drawCircle(f, f2, f3, this.f7369ae);
        } else {
            float f4 = f2 - this.f7344C;
            canvas.drawLine(f, f4 - f3, f, f4 + f3, this.f7369ae);
        }
    }

    /* JADX INFO: renamed from: q */
    private final void m4534q(Canvas canvas, float f, float f2, float f3) {
        if (this.f7404z) {
            canvas.drawLine(f, f2 - f3, f, f2 + f3, this.f7368ad);
        } else {
            canvas.drawCircle(f, f2, f3, this.f7368ad);
        }
    }

    @Override // com.google.android.apps.camera.uiutils.ViewSmoothRotationUtil$Rotatee
    /* JADX INFO: renamed from: a */
    public final float mo4510a() {
        return this.f7355N;
    }

    @Override // com.google.android.apps.camera.uiutils.ViewSmoothRotationUtil$Rotatee
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object mo4511b() {
        return this;
    }

    @Override // com.google.android.apps.camera.uiutils.ViewSmoothRotationUtil$Rotatee
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String mo4512c() {
        return "rotationDegree";
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.f7393o.computeScrollOffset()) {
            if (this.f7393o.getCurrX() != this.f7393o.getFinalX()) {
                this.f7391m = this.f7393o.getCurrX();
                m4532o();
            } else {
                isz iszVar = this.f7399u;
                iszVar.getClass();
                iszVar.m11713b();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final float m4535d(float f) {
        int i = 0;
        float fFloatValue = ((Float) this.f7378an.get(0)).floatValue();
        float f2 = 0.0f;
        while (i < this.f7378an.size()) {
            float fFloatValue2 = ((Float) this.f7378an.get(i)).floatValue();
            if (f2 != 0.0f) {
                int i2 = i - 1;
                if (f > ((Integer) this.f7398t.get(i2)).intValue() && f <= ((Integer) this.f7398t.get(i)).intValue()) {
                    fFloatValue = f2 * ((float) Math.pow(fFloatValue2 / f2, (f - ((Integer) this.f7398t.get(i2)).intValue()) / (((Integer) this.f7398t.get(i)).intValue() - ((Integer) this.f7398t.get(i2)).intValue())));
                }
            }
            i++;
            f2 = fFloatValue2;
        }
        return jzn.m13832t(fFloatValue, 5);
    }

    /* JADX INFO: renamed from: e */
    public final float m4536e(float f) {
        int i = 0;
        float fIntValue = 1.0f;
        float f2 = 0.0f;
        while (i < this.f7378an.size()) {
            float fFloatValue = ((Float) this.f7378an.get(i)).floatValue();
            if (f2 != 0.0f && f >= f2 && f <= fFloatValue) {
                int i2 = i - 1;
                fIntValue = ((Integer) this.f7398t.get(i2)).intValue() + (((float) (Math.log(f / f2) / Math.log(fFloatValue / f2))) * (((Integer) this.f7398t.get(i)).intValue() - ((Integer) this.f7398t.get(i2)).intValue()));
            }
            i++;
            f2 = fFloatValue;
        }
        return fIntValue;
    }

    /* JADX INFO: renamed from: f */
    public final int m4537f() {
        int iM4531n = m4531n(this.f7359R);
        float f = iM4531n;
        return (f > 22.0f || (f <= 22.0f && this.f7358Q > this.f7385g)) ? m4531n(this.f7359R - 1) : iM4531n;
    }

    /* JADX INFO: renamed from: g */
    public final void m4538g() {
        int i = (int) (this.f7381c * 25.0f);
        this.f7388j = i;
        int i2 = (int) (this.f7382d * 25.0f);
        this.f7362U = i2;
        float f = this.f7386h * 25.0f;
        int i3 = (int) (this.f7360S * 25.0f);
        this.f7390l = i3;
        float f2 = i3;
        float f3 = this.f7387i;
        this.f7391m = ((((int) f) - i) / f2) * f3;
        this.f7389k = ((i2 - i) / f2) * f3;
        int i4 = this.f7377am;
        if (i4 != 0) {
            this.f7365aa = (int) ((i4 / f3) * f2);
        }
    }

    @Override // android.view.View
    protected final float getLeftFadingEdgeStrength() {
        return 1.0f;
    }

    @Override // android.view.View
    protected final float getRightFadingEdgeStrength() {
        return 1.0f;
    }

    /* JADX INFO: renamed from: h */
    public final void m4539h() {
        setEnabled(false);
        setVisibility(4);
    }

    /* JADX INFO: renamed from: i */
    public final void m4540i() {
        mws mwsVar = this.f7378an;
        if (mwsVar != null && !mwsVar.isEmpty()) {
            float fFloatValue = ((Float) mkv.m16515W(this.f7378an)).floatValue();
            float f = this.f7385g;
            if (f < fFloatValue) {
                this.f7384f = f;
                m4541j(this.f7379ao);
            } else {
                m4541j(this.f7379ao);
            }
        }
        this.f7382d = m4537f() + 1;
        m4538g();
    }

    /* JADX INFO: renamed from: j */
    public final void m4541j(mws mwsVar) {
        this.f7379ao = mwsVar;
        mxi mxiVarM17132D = mxk.m17132D();
        mxiVarM17132D.m17129h(mwsVar);
        mws mwsVar2 = this.f7397s;
        if (mwsVar2 != null && !mwsVar2.isEmpty()) {
            float fFloatValue = ((Float) mkv.m16515W(this.f7397s)).floatValue();
            if (fFloatValue > ((Float) mkv.m16515W(mwsVar)).floatValue() && fFloatValue < this.f7384f) {
                mxiVarM17132D.m17129h(this.f7397s);
            }
        }
        mxiVarM17132D.mo17072d(Float.valueOf(this.f7384f));
        this.f7378an = mxiVarM17132D.mo17127f().mo17025v();
        m4543l();
    }

    /* JADX INFO: renamed from: k */
    public final void m4542k(float f) {
        this.f7384f = f;
        this.f7358Q = f;
        this.f7385g = f;
        m4544m();
    }

    /* JADX INFO: renamed from: l */
    public final void m4543l() {
        this.f7398t = (mws) Collection$EL.stream(this.f7378an).map(new cwp(this, 18)).collect(muc.f41626a);
    }

    /* JADX INFO: renamed from: m */
    public final void m4544m() {
        if (getVisibility() != 0) {
            this.f7382d = m4537f() + 1;
            m4538g();
        }
        mws mwsVar = this.f7378an;
        if (mwsVar == null || mwsVar.isEmpty()) {
            return;
        }
        if (this.f7384f >= ((Float) mkv.m16515W(this.f7378an)).floatValue()) {
            m4540i();
        } else if (getVisibility() == 8) {
            m4541j(this.f7379ao);
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        float height = (getHeight() / 2.0f) - this.f7366ab;
        if (this.f7404z) {
            height += this.f7353L;
        }
        float f = this.f7391m;
        float f2 = this.f7374aj;
        float f3 = this.f7387i;
        int i = this.f7390l;
        float f4 = i;
        int i2 = this.f7388j;
        float f5 = 25.0f;
        float f6 = 4.0f;
        int i3 = (int) ((i + i) * 25.0f * 4.0f);
        int i4 = (((int) ((f - f2) / (((f3 * 10.0f) * f4) / 10.0f))) + i2) - i3;
        if (i4 < i2) {
            i4 = i2;
        }
        int i5 = i4 + i3 + this.f7365aa;
        int i6 = this.f7362U;
        int i7 = i5 + i3;
        if (i7 <= i6) {
            i6 = i7;
        }
        int i8 = i * this.f7361T;
        float f7 = f2 - (f - (((i4 - i2) / f4) * f3));
        while (i4 <= i6) {
            if (i4 % i8 == 0) {
                final float f8 = i4 / f5;
                float f9 = this.f7377am - (((this.f7387i * f5) * f6) / 3.0f);
                if (Collection$EL.stream(this.f7398t).anyMatch(new Predicate() { // from class: ium
                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    public final /* synthetic */ Predicate negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    /* JADX INFO: renamed from: or */
                    public final /* synthetic */ Predicate m11799or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return ((float) ((Integer) obj).intValue()) == f8;
                    }
                })) {
                    float f10 = this.f7387i * f5;
                    if (f7 <= (f10 * f6) / 3.0f || f7 >= f9) {
                        i8 = i8;
                        if (f7 <= f10 / 2.0f || f7 >= f9 + ((f10 * 5.0f) / 6.0f)) {
                            m4533p(canvas, f7, height, this.f7348G);
                        } else {
                            m4533p(canvas, f7, height, this.f7349H);
                        }
                    } else {
                        m4533p(canvas, f7, height, this.f7345D);
                        float fM13832t = jzn.m13832t(m4535d(f8) / this.f7392n, 3);
                        if (fM13832t > this.f7403y) {
                            fM13832t = Math.round(fM13832t);
                        }
                        String strSubstring = (fM13832t < 1.0f && this.f7402x) ? String.format(Locale.getDefault(), "%.01f", Double.valueOf(Math.floor(fM13832t * 10.0f) / 10.0d)) : String.format(Locale.getDefault(), "%.01f", Float.valueOf(Math.round(fM13832t * 10.0f) / 10.0f));
                        if (fM13832t < 1.0f) {
                            strSubstring = strSubstring.substring(1, 3);
                        } else if (strSubstring.endsWith(".0")) {
                            strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
                        }
                        float fMeasureText = this.f7371ag.measureText(strSubstring) / 2.0f;
                        float f11 = f7 - fMeasureText;
                        float f12 = this.f7366ab;
                        float f13 = f12 + f12 + height;
                        if (this.f7404z) {
                            float f14 = this.f7354M + f13;
                            canvas.save();
                            canvas.rotate(this.f7355N, fMeasureText + f11, f14);
                        }
                        canvas.drawText(strSubstring, f11, f13, this.f7371ag);
                        if (this.f7404z) {
                            canvas.restore();
                        }
                    }
                } else {
                    i8 = i8;
                    float f15 = this.f7387i * 25.0f;
                    if (f7 > (f15 * 4.0f) / 3.0f && f7 < f9) {
                        m4534q(canvas, f7, height, this.f7344C);
                    } else if (f7 <= f15 / 2.0f || f7 >= f9 + ((f15 * 5.0f) / 6.0f)) {
                        m4534q(canvas, f7, height, this.f7347F);
                    } else {
                        m4534q(canvas, f7, height, this.f7346E);
                    }
                }
            } else {
                i8 = i8;
            }
            i4 += this.f7390l;
            f7 += this.f7387i;
            i8 = i8;
            f5 = 25.0f;
            f6 = 4.0f;
        }
        if (!this.f7404z) {
            canvas.drawCircle(this.f7374aj, height, this.f7345D, this.f7370af);
            return;
        }
        float f16 = height + this.f7344C;
        float f17 = this.f7350I;
        float f18 = f16 - f17;
        float f19 = this.f7374aj;
        float f20 = this.f7351J;
        canvas.drawRect(f19 - f20, f18 - f17, f19 + f20, f18 + f17, this.f7352K);
        float f21 = this.f7374aj;
        float f22 = this.f7351J;
        float f23 = this.f7350I;
        canvas.drawRect(f21 - f22, f18 - f23, f21 + f22, f18 + f23, this.f7370af);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        this.f7377am = size;
        this.f7374aj = size >> 1;
        if (this.f7365aa == 0) {
            this.f7365aa = (int) ((size / this.f7387i) * this.f7390l);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int i = 0;
        if (!isEnabled()) {
            return false;
        }
        if (this.f7372ah == null) {
            this.f7372ah = VelocityTracker.obtain();
        }
        this.f7372ah.addMovement(motionEvent);
        switch (action) {
            case 0:
                this.f7393o.forceFinished(true);
                this.f7373ai = x;
                this.f7395q = false;
                this.f7394p = true;
                isz iszVar = this.f7399u;
                iszVar.getClass();
                iszVar.f32042a.m11762m();
                iszVar.f32042a.f32054E.mo11684n();
                break;
            case 1:
                if (motionEvent.getEventTime() - this.f7367ac >= 200.0f) {
                    this.f7372ah.computeCurrentVelocity(1000, 1000.0f);
                    int xVelocity = (int) this.f7372ah.getXVelocity();
                    if (Math.abs(xVelocity) >= 1000) {
                        this.f7393o.fling((int) this.f7391m, 0, -xVelocity, 0, 0, (int) this.f7389k, 0, 0);
                        isz iszVar2 = this.f7399u;
                        iszVar2.getClass();
                        iszVar2.m11713b();
                        invalidate();
                    } else {
                        if (!this.f7395q) {
                            postDelayed(new euw(this, (this.f7388j + (Math.round((this.f7391m - ((this.f7377am / 2.0f) - this.f7373ai)) / this.f7387i) * this.f7390l)) / 25.0f, 7), 10L);
                        }
                        isz iszVar3 = this.f7399u;
                        iszVar3.getClass();
                        iszVar3.m11713b();
                    }
                    this.f7395q = false;
                    this.f7367ac = motionEvent.getEventTime();
                } else {
                    isz iszVar4 = this.f7399u;
                    iszVar4.getClass();
                    iszVar4.m11713b();
                }
                break;
            case 2:
                int i2 = x - this.f7375ak;
                if (!this.f7395q) {
                    if (Math.abs(i2) >= Math.abs(y - this.f7376al) && Math.abs(x - this.f7373ai) >= this.f7400v) {
                        this.f7395q = true;
                    }
                } else {
                    if (this.f7396r) {
                        float fMin = Math.min(Math.max(this.f7363V, 0.0f), this.f7389k);
                        this.f7363V = fMin;
                        this.f7386h = (this.f7388j + (Math.round(fMin / this.f7387i) * this.f7390l)) / 25.0f;
                        mws mwsVar = this.f7398t;
                        int size = mwsVar.size();
                        while (true) {
                            if (i < size) {
                                float fIntValue = ((Integer) mwsVar.get(i)).intValue();
                                i++;
                                if (Math.abs(this.f7386h - fIntValue) < 0.05f) {
                                    Math.abs(this.f7386h - fIntValue);
                                    if (Math.abs(this.f7364W) <= 25.0f) {
                                        this.f7364W += i2;
                                    }
                                }
                            }
                            float f = -i2;
                            float f2 = this.f7391m + f + f;
                            this.f7391m = f2;
                            this.f7363V = f2;
                            this.f7364W = 0.0f;
                        }
                    } else {
                        float f3 = -i2;
                        float f4 = this.f7391m + f3 + f3;
                        this.f7391m = f4;
                        this.f7363V = f4;
                        this.f7364W = 0.0f;
                    }
                    m4532o();
                }
                break;
            case 3:
                this.f7395q = false;
                isz iszVar5 = this.f7399u;
                iszVar5.getClass();
                iszVar5.m11713b();
                break;
        }
        this.f7375ak = x;
        this.f7376al = y;
        return true;
    }

    @Override // com.google.android.apps.camera.uiutils.ViewSmoothRotationUtil$Rotatee
    public final void setRotationDegree(float f) {
        this.f7355N = f;
        if (this.f7404z) {
            invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ZoomSliderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7380b = new AtomicReference(iug.MAIN_ONLY);
        this.f7355N = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iso.f31995a);
        this.f7342A = typedArrayObtainStyledAttributes.getColor(14, getResources().getColor(C0100R.color.zoom_slider_small_dot_color, null));
        this.f7343B = typedArrayObtainStyledAttributes.getColor(0, jzn.m13799B(this));
        this.f7344C = typedArrayObtainStyledAttributes.getDimension(15, getResources().getDimension(C0100R.dimen.zoom_slider_small_dot_radius));
        this.f7346E = typedArrayObtainStyledAttributes.getDimension(12, getResources().getDimension(C0100R.dimen.zoom_slider_mini_dot_radius));
        this.f7347F = typedArrayObtainStyledAttributes.getDimension(10, getResources().getDimension(C0100R.dimen.zoom_slider_micro_dot_radius));
        this.f7345D = typedArrayObtainStyledAttributes.getDimension(1, getResources().getDimension(C0100R.dimen.zoom_slider_big_dot_radius));
        this.f7356O = typedArrayObtainStyledAttributes.getDimension(16, getResources().getDimensionPixelSize(C0100R.dimen.zoom_icon_text_size));
        this.f7357P = typedArrayObtainStyledAttributes.getColor(7, kxk.m15024q(this, C0100R.attr.colorSecondary));
        this.f7381c = typedArrayObtainStyledAttributes.getFloat(11, 1.0f);
        this.f7382d = typedArrayObtainStyledAttributes.getFloat(9, 22.0f);
        this.f7386h = typedArrayObtainStyledAttributes.getFloat(2, 5.0f);
        this.f7360S = typedArrayObtainStyledAttributes.getFloat(4, 0.04f);
        this.f7361T = typedArrayObtainStyledAttributes.getInt(13, 25);
        this.f7387i = typedArrayObtainStyledAttributes.getDimension(5, getResources().getDimensionPixelSize(C0100R.dimen.zoom_slider_dot_gap) / 25.0f);
        this.f7366ab = getResources().getDimension(C0100R.dimen.zoom_slider_font_spacing);
        Float fValueOf = Float.valueOf(0.7f);
        Float fValueOf2 = Float.valueOf(1.0f);
        Float fValueOf3 = Float.valueOf(2.0f);
        this.f7378an = mxk.m17140L(fValueOf, fValueOf2, fValueOf3, Float.valueOf(4.0f), Float.valueOf(20.0f)).mo17025v();
        m4543l();
        this.f7379ao = mxk.m17139K(Float.valueOf(0.5f), fValueOf2, fValueOf3, Float.valueOf(5.0f)).mo17025v();
        this.f7359R = getResources().getInteger(C0100R.integer.zoom_slider_dots_between_1x_2x);
        this.f7394p = false;
        this.f7395q = false;
        this.f7396r = true;
        this.f7364W = 0.0f;
        float f = this.f7347F;
        this.f7348G = f + f;
        float f2 = this.f7346E;
        this.f7349H = f2 + f2;
        typedArrayObtainStyledAttributes.recycle();
        this.f7400v = ViewConfiguration.get(context).getScaledTouchSlop();
        float scrollFriction = ViewConfiguration.getScrollFriction();
        this.f7401w = scrollFriction;
        if (context instanceof cdp) {
            dhv dhvVarMo3499a = ((cdp) context).mo3499a();
            this.f7402x = dhvVarMo3499a.mo6184l(dib.f11277ak);
            this.f7403y = ((Float) dhvVarMo3499a.mo6180h(dib.f11278al).get()).floatValue();
            this.f7404z = jzn.m13833u(dhvVarMo3499a);
        } else {
            this.f7402x = false;
            this.f7403y = 22.0f;
            this.f7404z = false;
        }
        m4538g();
        Paint paint = new Paint(1);
        this.f7368ad = paint;
        paint.setColor(this.f7342A);
        Paint paint2 = new Paint(1);
        this.f7369ae = paint2;
        paint2.setColor(this.f7343B);
        Paint paint3 = new Paint(1);
        this.f7370af = paint3;
        paint3.setColor(this.f7357P);
        Typeface typefaceCreate = Typeface.create("google-sans-text", 0);
        TypedValue typedValue = new TypedValue();
        getResources().getValue(C0100R.dimen.zoom_slider_bar_letter_spacing, typedValue, true);
        float f3 = typedValue.getFloat();
        TextPaint textPaint = new TextPaint(1);
        this.f7371ag = textPaint;
        textPaint.setTextSize(this.f7356O);
        this.f7371ag.setColor(this.f7343B);
        this.f7371ag.setTypeface(typefaceCreate);
        this.f7371ag.setLetterSpacing(f3);
        Scroller scroller = new Scroller(context);
        this.f7393o = scroller;
        scroller.extendDuration(2000);
        this.f7393o.setFriction(scrollFriction + 0.01f);
        if (this.f7404z) {
            Resources resources = getResources();
            float dimension = resources.getDimension(C0100R.dimen.zoom_slider_stroke_width);
            int color = resources.getColor(C0100R.color.zoom_slider_stroke_color, null);
            float dimensionPixelSize = resources.getDimensionPixelSize(C0100R.dimen.zoom_slider_small_bar_half_height);
            this.f7344C = dimensionPixelSize;
            this.f7347F = dimensionPixelSize;
            this.f7346E = dimensionPixelSize;
            float dimensionPixelSize2 = resources.getDimensionPixelSize(C0100R.dimen.zoom_slider_big_bar_half_height);
            this.f7345D = dimensionPixelSize2;
            this.f7348G = dimensionPixelSize2;
            this.f7349H = dimensionPixelSize2;
            this.f7350I = resources.getDimensionPixelSize(C0100R.dimen.zoom_slider_indicator_bar_half_height);
            this.f7351J = resources.getDimensionPixelSize(C0100R.dimen.zoom_slider_indicator_bar_half_width);
            this.f7366ab = resources.getDimensionPixelOffset(C0100R.dimen.zoom_slider_bar_number_gap);
            this.f7353L = resources.getDimension(C0100R.dimen.zoom_slider_overall_shift);
            Paint paint4 = new Paint(1);
            this.f7352K = paint4;
            paint4.setColor(color);
            this.f7352K.setStyle(Paint.Style.STROKE);
            this.f7352K.setStrokeWidth(dimension);
            this.f7352K.setStrokeJoin(Paint.Join.ROUND);
            this.f7370af.setColor(jzn.m13799B(this));
            this.f7370af.setAntiAlias(false);
            this.f7370af.setStyle(Paint.Style.FILL);
            this.f7368ad.setColor(jzn.m13836x(this));
            this.f7368ad.setAntiAlias(false);
            this.f7368ad.setStyle(Paint.Style.STROKE);
            this.f7368ad.setStrokeWidth(resources.getDimension(C0100R.dimen.zoom_slider_small_bar_width));
            this.f7369ae.setColor(jzn.m13799B(this));
            this.f7369ae.setAntiAlias(false);
            this.f7369ae.setStyle(Paint.Style.STROKE);
            this.f7369ae.setStrokeWidth(resources.getDimension(C0100R.dimen.zoom_slider_big_bar_width));
            TextView textView = new TextView(getContext());
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(new int[]{C0100R.attr.textAppearanceLabelSmall});
            textView.setTextAppearance(typedArrayObtainStyledAttributes2.getResourceId(0, 0));
            textView.setTypeface(null, 1);
            typedArrayObtainStyledAttributes2.recycle();
            TypedValue typedValue2 = new TypedValue();
            resources.getValue(C0100R.dimen.zoom_slider_bar_letter_spacing_reeded_edge, typedValue2, true);
            TextPaint paint5 = textView.getPaint();
            this.f7371ag = paint5;
            paint5.setLetterSpacing(typedValue2.getFloat());
            this.f7371ag.setTextSize(resources.getDimension(C0100R.dimen.zoom_slider_number_size));
            this.f7371ag.setColor(jzn.m13799B(this));
            Paint.FontMetrics fontMetrics = this.f7371ag.getFontMetrics();
            this.f7354M = (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
        }
    }
}
