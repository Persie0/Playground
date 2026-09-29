package com.lingq.commons.p053ui.views;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import com.linguist.R;
import dm.C5207g;
import java.util.List;
import kh.C6694u;
import kotlin.Metadata;
import p225kk.C6716m;
import p274n8.RunnableC7716a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001dJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0006J\b\u0010\n\u001a\u00020\u0006H\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006J\u0006\u0010\u000f\u001a\u00020\u0006J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006J\b\u0010\u0012\u001a\u00020\u0006H\u0007J\u0010\u0010\u0014\u001a\u00020\u00042\b\b\u0001\u0010\u0013\u001a\u00020\u0006J\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0006R$\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m13365d2 = {"Lcom/lingq/commons/ui/views/ScrollingPagerIndicator;", "Landroid/view/View;", "", "looped", "Lsl/e;", "setLooped", "", "getDotColor", "color", "setDotColor", "getSelectedDotColor", "setSelectedDotColor", "getVisibleDotCount", "visibleDotCount", "setVisibleDotCount", "getVisibleDotThreshold", "visibleDotThreshold", "setVisibleDotThreshold", "getOrientation", "orientation", "setOrientation", "position", "setCurrentPosition", "count", "getDotCount", "()I", "setDotCount", "(I)V", "dotCount", "a", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ScrollingPagerIndicator extends View {

    /* JADX INFO: renamed from: Q */
    public static final /* synthetic */ int f16790Q = 0;

    /* JADX INFO: renamed from: H */
    public int f16791H;

    /* JADX INFO: renamed from: I */
    public final Paint f16792I;

    /* JADX INFO: renamed from: J */
    public final ArgbEvaluator f16793J;

    /* JADX INFO: renamed from: K */
    public int f16794K;

    /* JADX INFO: renamed from: L */
    public int f16795L;

    /* JADX INFO: renamed from: M */
    public boolean f16796M;

    /* JADX INFO: renamed from: N */
    public RunnableC7716a f16797N;

    /* JADX INFO: renamed from: O */
    public InterfaceC3283a<?> f16798O;

    /* JADX INFO: renamed from: P */
    public boolean f16799P;

    /* JADX INFO: renamed from: a */
    public int f16800a;

    /* JADX INFO: renamed from: b */
    public final int f16801b;

    /* JADX INFO: renamed from: c */
    public final int f16802c;

    /* JADX INFO: renamed from: d */
    public final int f16803d;

    /* JADX INFO: renamed from: e */
    public final int f16804e;

    /* JADX INFO: renamed from: f */
    public int f16805f;

    /* JADX INFO: renamed from: g */
    public int f16806g;

    /* JADX INFO: renamed from: h */
    public int f16807h;

    /* JADX INFO: renamed from: i */
    public float f16808i;

    /* JADX INFO: renamed from: j */
    public float f16809j;

    /* JADX INFO: renamed from: k */
    public float f16810k;

    /* JADX INFO: renamed from: l */
    public SparseArray<Float> f16811l;

    /* JADX INFO: renamed from: com.lingq.commons.ui.views.ScrollingPagerIndicator$a */
    public interface InterfaceC3283a<T> {
        /* JADX INFO: renamed from: a */
        void mo9373a();

        /* JADX INFO: renamed from: b */
        void mo9374b(ScrollingPagerIndicator scrollingPagerIndicator, T t10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingPagerIndicator(Context context, AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet, R.attr.scrollingPagerIndicatorStyle);
        C5207g.m11111f(context, "context");
        int i10 = -1;
        this.f16801b = -1;
        this.f16806g = 2;
        this.f16793J = new ArgbEvaluator();
        List<Integer> list = C6716m.f37937a;
        this.f16794K = C6716m.m13333r(R.attr.backgroundSectionColor, context);
        this.f16795L = C6716m.m13333r(R.attr.yellowWordColor, context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6694u.f37845c, R.attr.scrollingPagerIndicatorStyle, R.style.ScrollingPagerIndicator);
        C5207g.m11110e(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…gPagerIndicator\n        )");
        this.f16794K = typedArrayObtainStyledAttributes.getColor(0, C6716m.m13333r(R.attr.backgroundSectionColor, context));
        this.f16795L = typedArrayObtainStyledAttributes.getColor(2, C6716m.m13333r(R.attr.yellowWordColor, context));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f16802c = dimensionPixelSize;
        this.f16803d = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        this.f16801b = dimensionPixelSize2 <= dimensionPixelSize ? dimensionPixelSize2 : i10;
        this.f16804e = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0) + dimensionPixelSize;
        this.f16796M = typedArrayObtainStyledAttributes.getBoolean(6, false);
        int i11 = typedArrayObtainStyledAttributes.getInt(8, 0);
        setVisibleDotCount(i11);
        this.f16806g = typedArrayObtainStyledAttributes.getInt(9, 2);
        this.f16807h = typedArrayObtainStyledAttributes.getInt(7, 0);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f16792I = paint;
        paint.setAntiAlias(true);
        if (isInEditMode()) {
            setDotCount(i11);
            m9370d(i11 / 2, 0.0f);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m9367a(int i10, float f3) {
        int i11 = this.f16791H;
        int i12 = this.f16805f;
        if (i11 <= i12) {
            this.f16808i = 0.0f;
            return;
        }
        boolean z10 = this.f16796M;
        int i13 = this.f16804e;
        if (z10 || i11 <= i12) {
            this.f16808i = ((i13 * f3) + m9369c(this.f16800a / 2)) - (this.f16809j / 2);
            return;
        }
        float f10 = i13 * f3;
        float f11 = 2;
        this.f16808i = (f10 + m9369c(i10)) - (this.f16809j / f11);
        int i14 = this.f16805f / 2;
        float fM9369c = m9369c((getDotCount() - 1) - i14);
        if ((this.f16809j / f11) + this.f16808i < m9369c(i14)) {
            this.f16808i = m9369c(i14) - (this.f16809j / f11);
            return;
        }
        float f12 = this.f16808i;
        float f13 = this.f16809j;
        if ((f13 / f11) + f12 > fM9369c) {
            this.f16808i = fM9369c - (f13 / f11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final <T> void m9368b(T t10, InterfaceC3283a<T> interfaceC3283a) {
        InterfaceC3283a<?> interfaceC3283a2 = this.f16798O;
        if (interfaceC3283a2 != null) {
            interfaceC3283a2.mo9373a();
            this.f16798O = null;
            this.f16797N = null;
        }
        this.f16799P = false;
        interfaceC3283a.mo9374b(this, t10);
        this.f16798O = interfaceC3283a;
        this.f16797N = new RunnableC7716a(5, this, t10, interfaceC3283a);
    }

    /* JADX INFO: renamed from: c */
    public final float m9369c(int i10) {
        return this.f16810k + (i10 * this.f16804e);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0039  */
    /* JADX WARN: Code duplicated, block: B:28:0x0042  */
    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX INFO: renamed from: d */
    public final void m9370d(int i10, float f3) {
        SparseArray<Float> sparseArray;
        int i11;
        if (!(f3 >= 0.0f && f3 <= 1.0f)) {
            throw new IllegalArgumentException("Offset must be [0, 1]".toString());
        }
        if (i10 < 0 || (i10 != 0 && i10 >= this.f16791H)) {
            throw new IndexOutOfBoundsException("page must be [0, adapter.getItemCount())");
        }
        if (this.f16796M) {
            int i12 = this.f16805f;
            int i13 = this.f16791H;
            if (2 <= i13 && i13 <= i12) {
                sparseArray = this.f16811l;
                if (sparseArray != null) {
                    sparseArray.clear();
                }
                if (this.f16807h == 0) {
                    m9372f(i10, f3);
                    i11 = this.f16791H;
                    if (i10 < i11 - 1) {
                        m9372f(i10 + 1, 1 - f3);
                    } else if (i11 > 1) {
                        m9372f(0, 1 - f3);
                    }
                } else {
                    m9372f(i10 - 1, f3);
                    m9372f(i10, 1 - f3);
                }
                invalidate();
            }
        } else {
            sparseArray = this.f16811l;
            if (sparseArray != null) {
                sparseArray.clear();
            }
            if (this.f16807h == 0) {
                m9372f(i10, f3);
                i11 = this.f16791H;
                if (i10 < i11 - 1) {
                    m9372f(i10 + 1, 1 - f3);
                } else if (i11 > 1) {
                    m9372f(0, 1 - f3);
                }
            } else {
                m9372f(i10 - 1, f3);
                m9372f(i10, 1 - f3);
            }
            invalidate();
        }
        if (this.f16807h == 0) {
            m9367a(i10, f3);
        } else {
            m9367a(i10 - 1, f3);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: e */
    public final void m9371e() throws Throwable {
        RunnableC7716a runnableC7716a = this.f16797N;
        if (runnableC7716a != null) {
            runnableC7716a.run();
            invalidate();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m9372f(int i10, float f3) {
        if (this.f16811l != null && getDotCount() != 0) {
            float fAbs = 1 - Math.abs(f3);
            if (fAbs == 0.0f) {
                SparseArray<Float> sparseArray = this.f16811l;
                if (sparseArray != null) {
                    sparseArray.remove(i10);
                    return;
                }
                return;
            }
            SparseArray<Float> sparseArray2 = this.f16811l;
            if (sparseArray2 != null) {
                sparseArray2.put(i10, Float.valueOf(fAbs));
            }
        }
    }

    public final int getDotColor() {
        return this.f16794K;
    }

    public final int getDotCount() {
        return (!this.f16796M || this.f16791H <= this.f16805f) ? this.f16791H : this.f16800a;
    }

    public final int getOrientation() {
        return this.f16807h;
    }

    /* JADX INFO: renamed from: getSelectedDotColor, reason: from getter */
    public final int getF16795L() {
        return this.f16795L;
    }

    public final int getVisibleDotCount() {
        return this.f16805f;
    }

    /* JADX INFO: renamed from: getVisibleDotThreshold, reason: from getter */
    public final int getF16806g() {
        return this.f16806g;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:66:0x0103  */
    /* JADX WARN: Code duplicated, block: B:70:0x012e  */
    /* JADX WARN: Code duplicated, block: B:71:0x013e  */
    /* JADX WARN: Code duplicated, block: B:72:0x014f  */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        float fFloatValue;
        Paint paint;
        int i12;
        float f3;
        int width;
        int i13;
        float f10;
        float f11;
        int i14;
        float f12;
        float f13;
        float f14;
        C5207g.m11111f(canvas, "canvas");
        int dotCount = getDotCount();
        if (dotCount < this.f16806g) {
            return;
        }
        int i15 = this.f16803d;
        int i16 = this.f16802c;
        int i17 = 2;
        int i18 = this.f16804e;
        float f15 = (((i15 - i16) / 2) + i18) * 0.7f;
        float f16 = i15 / 2;
        float f17 = i18 * 0.85714287f;
        float f18 = this.f16808i;
        int i19 = ((int) (f18 - this.f16810k)) / i18;
        int iM9369c = (((int) ((f18 + this.f16809j) - m9369c(i19))) / i18) + i19;
        if (i19 == 0 && iM9369c + 1 > dotCount) {
            iM9369c = dotCount - 1;
        }
        if (i19 > iM9369c) {
            return;
        }
        while (true) {
            float fM9369c = m9369c(i19);
            float f19 = this.f16808i;
            if (fM9369c >= f19) {
                float f20 = this.f16809j;
                if (fM9369c < f19 + f20) {
                    if (!this.f16796M || this.f16791H <= this.f16805f) {
                        SparseArray<Float> sparseArray = this.f16811l;
                        Float f21 = sparseArray != null ? sparseArray.get(i19) : null;
                        if (f21 != null) {
                            fFloatValue = f21.floatValue();
                        } else {
                            fFloatValue = 0.0f;
                        }
                    } else {
                        float f22 = (f20 / i17) + f19;
                        if (fM9369c >= f22 - f17 && fM9369c <= f22) {
                            fFloatValue = ((fM9369c - f22) + f17) / f17;
                        } else if (fM9369c <= f22 || fM9369c >= f22 + f17) {
                            fFloatValue = 0.0f;
                        } else {
                            fFloatValue = 1 - ((fM9369c - f22) / f17);
                        }
                    }
                    float f23 = ((i15 - i16) * fFloatValue) + i16;
                    if (this.f16791H > this.f16805f) {
                        if (this.f16796M) {
                            i12 = 1;
                        } else {
                            i12 = 1;
                            if (i19 == 0 || i19 == dotCount - 1) {
                                f3 = f16;
                            }
                            width = getWidth();
                            if (this.f16807h == i12) {
                                width = getHeight();
                            }
                            i13 = width;
                            f10 = this.f16808i;
                            f11 = fM9369c - f10;
                            i10 = dotCount;
                            i14 = this.f16801b;
                            if (f11 < f3) {
                                f14 = ((fM9369c - f10) * f23) / f3;
                                if (f14 <= i14) {
                                    f23 = i14;
                                } else if (f14 < f23) {
                                    i11 = i15;
                                    f23 = f14;
                                }
                            } else {
                                f12 = i13;
                                if (fM9369c - f10 > f12 - f3) {
                                    i11 = i15;
                                    f13 = ((((-fM9369c) + f10) + f12) * f23) / f3;
                                    if (f13 <= i14) {
                                        f23 = i14;
                                    } else if (f13 < f23) {
                                        f23 = f13;
                                    }
                                }
                            }
                            paint = this.f16792I;
                            Object objEvaluate = this.f16793J.evaluate(fFloatValue, Integer.valueOf(this.f16794K), Integer.valueOf(this.f16795L));
                            C5207g.m11109d(objEvaluate, "null cannot be cast to non-null type kotlin.Int");
                            paint.setColor(((Integer) objEvaluate).intValue());
                            if (this.f16807h == 0) {
                                i17 = 2;
                                canvas.drawCircle(fM9369c - this.f16808i, getMeasuredHeight() / 2, f23 / 2, paint);
                            } else {
                                i17 = 2;
                                canvas.drawCircle(getMeasuredWidth() / 2, fM9369c - this.f16808i, f23 / 2, paint);
                            }
                        }
                        f3 = f15;
                        width = getWidth();
                        if (this.f16807h == i12) {
                            width = getHeight();
                        }
                        i13 = width;
                        f10 = this.f16808i;
                        f11 = fM9369c - f10;
                        i10 = dotCount;
                        i14 = this.f16801b;
                        if (f11 < f3) {
                            f14 = ((fM9369c - f10) * f23) / f3;
                            if (f14 <= i14) {
                                f23 = i14;
                            } else if (f14 < f23) {
                                i11 = i15;
                                f23 = f14;
                            }
                        } else {
                            f12 = i13;
                            if (fM9369c - f10 > f12 - f3) {
                                i11 = i15;
                                f13 = ((((-fM9369c) + f10) + f12) * f23) / f3;
                                if (f13 <= i14) {
                                    f23 = i14;
                                } else if (f13 < f23) {
                                    f23 = f13;
                                }
                            }
                        }
                        paint = this.f16792I;
                        Object objEvaluate2 = this.f16793J.evaluate(fFloatValue, Integer.valueOf(this.f16794K), Integer.valueOf(this.f16795L));
                        C5207g.m11109d(objEvaluate2, "null cannot be cast to non-null type kotlin.Int");
                        paint.setColor(((Integer) objEvaluate2).intValue());
                        if (this.f16807h == 0) {
                            i17 = 2;
                            canvas.drawCircle(fM9369c - this.f16808i, getMeasuredHeight() / 2, f23 / 2, paint);
                        } else {
                            i17 = 2;
                            canvas.drawCircle(getMeasuredWidth() / 2, fM9369c - this.f16808i, f23 / 2, paint);
                        }
                    } else {
                        i10 = dotCount;
                    }
                    i11 = i15;
                    paint = this.f16792I;
                    Object objEvaluate3 = this.f16793J.evaluate(fFloatValue, Integer.valueOf(this.f16794K), Integer.valueOf(this.f16795L));
                    C5207g.m11109d(objEvaluate3, "null cannot be cast to non-null type kotlin.Int");
                    paint.setColor(((Integer) objEvaluate3).intValue());
                    if (this.f16807h == 0) {
                        i17 = 2;
                        canvas.drawCircle(fM9369c - this.f16808i, getMeasuredHeight() / 2, f23 / 2, paint);
                    } else {
                        i17 = 2;
                        canvas.drawCircle(getMeasuredWidth() / 2, fM9369c - this.f16808i, f23 / 2, paint);
                    }
                } else {
                    i10 = dotCount;
                    i11 = i15;
                }
            } else {
                i10 = dotCount;
                i11 = i15;
            }
            if (i19 == iM9369c) {
                return;
            }
            i19++;
            i15 = i11;
            dotCount = i10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0037 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x003a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    /* JADX WARN: Code duplicated, block: B:29:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0069  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r5 != 1073741824) goto L34;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size;
        int mode;
        int size2;
        int i13;
        int i14;
        int mode2;
        int i15 = this.f16807h;
        int i16 = this.f16804e;
        int i17 = this.f16803d;
        if (i15 == 0) {
            if (!isInEditMode()) {
                i14 = this.f16791H;
                if (i14 >= this.f16805f) {
                    i13 = (int) this.f16809j;
                }
                mode2 = View.MeasureSpec.getMode(i11);
                size = View.MeasureSpec.getSize(i11);
                if (mode2 != Integer.MIN_VALUE) {
                    if (i17 > size) {
                        i17 = size;
                    }
                }
                setMeasuredDimension(i13, i17);
            }
            i14 = this.f16805f;
            i13 = ((i14 - 1) * i16) + i17;
            mode2 = View.MeasureSpec.getMode(i11);
            size = View.MeasureSpec.getSize(i11);
            if (mode2 != Integer.MIN_VALUE) {
                if (i17 > size) {
                    i17 = size;
                }
            }
            setMeasuredDimension(i13, i17);
        }
        if (isInEditMode()) {
            i12 = this.f16805f;
        } else {
            i12 = this.f16791H;
            if (i12 >= this.f16805f) {
                size = (int) this.f16809j;
            }
            mode = View.MeasureSpec.getMode(i10);
            size2 = View.MeasureSpec.getSize(i10);
            if (mode != Integer.MIN_VALUE) {
                if (mode == 1073741824) {
                    i17 = size2;
                }
            } else if (i17 > size2) {
                i17 = size2;
            }
            i13 = i17;
        }
        size = ((i12 - 1) * i16) + i17;
        mode = View.MeasureSpec.getMode(i10);
        size2 = View.MeasureSpec.getSize(i10);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 1073741824) {
                i17 = size2;
            }
        } else if (i17 > size2) {
            i17 = size2;
        }
        i13 = i17;
        i17 = size;
        setMeasuredDimension(i13, i17);
    }

    public final void setCurrentPosition(int i10) {
        if (i10 != 0 && (i10 < 0 || i10 >= this.f16791H)) {
            throw new IndexOutOfBoundsException("Position must be [0, adapter.getItemCount()]");
        }
        if (this.f16791H == 0) {
            return;
        }
        m9367a(i10, 0.0f);
        if (!this.f16796M || this.f16791H < this.f16805f) {
            SparseArray<Float> sparseArray = this.f16811l;
            if (sparseArray != null) {
                sparseArray.clear();
            }
            SparseArray<Float> sparseArray2 = this.f16811l;
            if (sparseArray2 != null) {
                sparseArray2.put(i10, Float.valueOf(1.0f));
            }
            invalidate();
        }
    }

    public final void setDotColor(int i10) {
        this.f16794K = i10;
        invalidate();
    }

    public final void setDotCount(int i10) {
        if (this.f16791H == i10 && this.f16799P) {
            return;
        }
        this.f16791H = i10;
        this.f16799P = true;
        this.f16811l = new SparseArray<>();
        if (i10 < this.f16806g) {
            requestLayout();
            invalidate();
            return;
        }
        boolean z10 = this.f16796M;
        int i11 = this.f16803d;
        this.f16810k = (!z10 || this.f16791H <= this.f16805f) ? i11 / 2.0f : 0.0f;
        this.f16809j = ((this.f16805f - 1) * this.f16804e) + i11;
        requestLayout();
        invalidate();
    }

    public final void setLooped(boolean z10) throws Throwable {
        this.f16796M = z10;
        m9371e();
        invalidate();
    }

    public final void setOrientation(int i10) throws Throwable {
        this.f16807h = i10;
        if (this.f16797N != null) {
            m9371e();
        } else {
            requestLayout();
        }
    }

    public final void setSelectedDotColor(int i10) {
        this.f16795L = i10;
        invalidate();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final void setVisibleDotCount(int i10) throws Throwable {
        if (!(i10 % 2 != 0)) {
            throw new IllegalArgumentException("visibleDotCount must be odd".toString());
        }
        this.f16805f = i10;
        this.f16800a = i10 + 2;
        if (this.f16797N != null) {
            m9371e();
        } else {
            requestLayout();
        }
    }

    public final void setVisibleDotThreshold(int i10) throws Throwable {
        this.f16806g = i10;
        if (this.f16797N != null) {
            m9371e();
        } else {
            requestLayout();
        }
    }
}
