package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.wear.ambient.AmbientDelegate;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: jp */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0749jp {

    /* JADX INFO: renamed from: b */
    public Typeface f34510b;

    /* JADX INFO: renamed from: c */
    public boolean f34511c;

    /* JADX INFO: renamed from: d */
    private final TextView f34512d;

    /* JADX INFO: renamed from: e */
    private C0850ni f34513e;

    /* JADX INFO: renamed from: f */
    private C0850ni f34514f;

    /* JADX INFO: renamed from: g */
    private C0850ni f34515g;

    /* JADX INFO: renamed from: h */
    private C0850ni f34516h;

    /* JADX INFO: renamed from: i */
    private C0850ni f34517i;

    /* JADX INFO: renamed from: j */
    private C0850ni f34518j;

    /* JADX INFO: renamed from: k */
    private final C0753jt f34519k;

    /* JADX INFO: renamed from: a */
    public int f34509a = 0;

    /* JADX INFO: renamed from: l */
    private int f34520l = -1;

    public C0749jp(TextView textView) {
        this.f34512d = textView;
        this.f34519k = new C0753jt(textView);
    }

    /* JADX INFO: renamed from: e */
    private static C0850ni m13413e(Context context, C0271io c0271io, int i) {
        ColorStateList colorStateListM11554a = c0271io.m11554a(context, i);
        if (colorStateListM11554a == null) {
            return null;
        }
        C0850ni c0850ni = new C0850ni();
        c0850ni.f42636d = true;
        c0850ni.f42633a = colorStateListM11554a;
        return c0850ni;
    }

    /* JADX INFO: renamed from: f */
    private final void m13414f(Drawable drawable, C0850ni c0850ni) {
        if (drawable == null || c0850ni == null) {
            return;
        }
        C0833ms.m16838h(drawable, c0850ni, this.f34512d.getDrawableState());
    }

    /* JADX INFO: renamed from: g */
    private final void m13415g(Context context, AmbientDelegate ambientDelegate) {
        String strM1621x;
        Typeface typeface;
        int[] iArr = C0193fr.f23257a;
        this.f34509a = ambientDelegate.m1613p(2, this.f34509a);
        int iM1613p = ambientDelegate.m1613p(14, -1);
        this.f34520l = iM1613p;
        if (iM1613p != -1) {
            this.f34509a &= 2;
        }
        if (!ambientDelegate.m1575A(10) && !ambientDelegate.m1575A(15)) {
            if (ambientDelegate.m1575A(1)) {
                this.f34511c = false;
                switch (ambientDelegate.m1613p(1, 1)) {
                    case 1:
                        typeface = Typeface.SANS_SERIF;
                        break;
                    case 2:
                        typeface = Typeface.SERIF;
                        break;
                    case 3:
                        typeface = Typeface.MONOSPACE;
                        break;
                    default:
                        return;
                }
                this.f34510b = typeface;
                return;
            }
            return;
        }
        Typeface typefaceM207b = null;
        this.f34510b = null;
        int i = true != ambientDelegate.m1575A(15) ? 10 : 15;
        int i2 = this.f34520l;
        int i3 = this.f34509a;
        if (!context.isRestricted()) {
            C0744jk c0744jk = new C0744jk(this, i2, i3, new WeakReference(this.f34512d));
            try {
                int i4 = this.f34509a;
                int resourceId = ((TypedArray) ambientDelegate.f1686b).getResourceId(i, 0);
                if (resourceId != 0) {
                    if (ambientDelegate.f1685a == null) {
                        ambientDelegate.f1685a = new TypedValue();
                    }
                    Object obj = ambientDelegate.f1687c;
                    Object obj2 = ambientDelegate.f1685a;
                    ThreadLocal threadLocal = acn.f88a;
                    if (!((Context) obj).isRestricted()) {
                        typefaceM207b = acn.m207b((Context) obj, resourceId, (TypedValue) obj2, i4, c0744jk, true, false);
                    }
                }
                if (typefaceM207b != null) {
                    if (this.f34520l != -1) {
                        this.f34510b = C0748jo.m13399a(Typeface.create(typefaceM207b, 0), this.f34520l, (this.f34509a & 2) != 0);
                    } else {
                        this.f34510b = typefaceM207b;
                    }
                }
                this.f34511c = this.f34510b == null;
            } catch (Resources.NotFoundException e) {
            } catch (UnsupportedOperationException e2) {
            }
        }
        if (this.f34510b != null || (strM1621x = ambientDelegate.m1621x(i)) == null) {
            return;
        }
        if (this.f34520l != -1) {
            this.f34510b = C0748jo.m13399a(Typeface.create(strM1621x, 0), this.f34520l, (2 & this.f34509a) != 0);
        } else {
            this.f34510b = Typeface.create(strM1621x, this.f34509a);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m13416a() {
        if (this.f34513e != null || this.f34514f != null || this.f34515g != null || this.f34516h != null) {
            Drawable[] compoundDrawables = this.f34512d.getCompoundDrawables();
            m13414f(compoundDrawables[0], this.f34513e);
            m13414f(compoundDrawables[1], this.f34514f);
            m13414f(compoundDrawables[2], this.f34515g);
            m13414f(compoundDrawables[3], this.f34516h);
        }
        if (this.f34517i == null && this.f34518j == null) {
            return;
        }
        Drawable[] drawableArrM13331c = C0745jl.m13331c(this.f34512d);
        m13414f(drawableArrM13331c[0], this.f34517i);
        m13414f(drawableArrM13331c[2], this.f34518j);
    }

    /* JADX INFO: renamed from: b */
    public final void m13417b(AttributeSet attributeSet, int i) {
        String strM1621x;
        String strM1621x2;
        boolean zM1623z;
        boolean z;
        int i2;
        int resourceId;
        Context context = this.f34512d.getContext();
        C0271io c0271ioM11552d = C0271io.m11552d();
        AmbientDelegate ambientDelegateM1568D = AmbientDelegate.m1568D(context, attributeSet, C0193fr.f23264h, i, 0);
        TextView textView = this.f34512d;
        afn.m536c(textView, textView.getContext(), C0193fr.f23264h, attributeSet, (TypedArray) ambientDelegateM1568D.f1686b, i, 0);
        int iM1616s = ambientDelegateM1568D.m1616s(0, -1);
        if (ambientDelegateM1568D.m1575A(3)) {
            this.f34513e = m13413e(context, c0271ioM11552d, ambientDelegateM1568D.m1616s(3, 0));
        }
        if (ambientDelegateM1568D.m1575A(1)) {
            this.f34514f = m13413e(context, c0271ioM11552d, ambientDelegateM1568D.m1616s(1, 0));
        }
        if (ambientDelegateM1568D.m1575A(4)) {
            this.f34515g = m13413e(context, c0271ioM11552d, ambientDelegateM1568D.m1616s(4, 0));
        }
        if (ambientDelegateM1568D.m1575A(2)) {
            this.f34516h = m13413e(context, c0271ioM11552d, ambientDelegateM1568D.m1616s(2, 0));
        }
        if (ambientDelegateM1568D.m1575A(5)) {
            this.f34517i = m13413e(context, c0271ioM11552d, ambientDelegateM1568D.m1616s(5, 0));
        }
        if (ambientDelegateM1568D.m1575A(6)) {
            this.f34518j = m13413e(context, c0271ioM11552d, ambientDelegateM1568D.m1616s(6, 0));
        }
        ambientDelegateM1568D.m1622y();
        boolean z2 = this.f34512d.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (iM1616s != -1) {
            AmbientDelegate ambientDelegateM1566B = AmbientDelegate.m1566B(context, iM1616s, C0193fr.f23279w);
            if (z2 || !ambientDelegateM1566B.m1575A(17)) {
                zM1623z = false;
                z = false;
            } else {
                zM1623z = ambientDelegateM1566B.m1623z(17, false);
                z = true;
            }
            m13415g(context, ambientDelegateM1566B);
            strM1621x = ambientDelegateM1566B.m1575A(18) ? ambientDelegateM1566B.m1621x(18) : null;
            strM1621x2 = ambientDelegateM1566B.m1575A(16) ? ambientDelegateM1566B.m1621x(16) : null;
            ambientDelegateM1566B.m1622y();
        } else {
            strM1621x = null;
            strM1621x2 = null;
            zM1623z = false;
            z = false;
        }
        AmbientDelegate ambientDelegateM1568D2 = AmbientDelegate.m1568D(context, attributeSet, C0193fr.f23279w, i, 0);
        if (!z2 && ambientDelegateM1568D2.m1575A(17)) {
            zM1623z = ambientDelegateM1568D2.m1623z(17, false);
            z = true;
        }
        if (ambientDelegateM1568D2.m1575A(18)) {
            strM1621x = ambientDelegateM1568D2.m1621x(18);
        }
        String strM1621x3 = ambientDelegateM1568D2.m1575A(16) ? ambientDelegateM1568D2.m1621x(16) : strM1621x2;
        if (ambientDelegateM1568D2.m1575A(0) && ambientDelegateM1568D2.m1612o(0, -1) == 0) {
            this.f34512d.setTextSize(0, 0.0f);
        }
        m13415g(context, ambientDelegateM1568D2);
        ambientDelegateM1568D2.m1622y();
        if (!z2 && z) {
            m13419d(zM1623z);
        }
        Typeface typeface = this.f34510b;
        if (typeface != null) {
            if (this.f34520l == -1) {
                this.f34512d.setTypeface(typeface, this.f34509a);
            } else {
                this.f34512d.setTypeface(typeface);
            }
        }
        if (strM1621x3 != null) {
            C0747jn.m13384d(this.f34512d, strM1621x3);
        }
        if (strM1621x != null) {
            C0746jm.m13347b(this.f34512d, C0746jm.m13346a(strM1621x));
        }
        C0753jt c0753jt = this.f34519k;
        TypedArray typedArrayObtainStyledAttributes = c0753jt.f34759h.obtainStyledAttributes(attributeSet, C0193fr.f23265i, i, 0);
        TextView textView2 = c0753jt.f34758g;
        afn.m536c(textView2, textView2.getContext(), C0193fr.f23265i, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            c0753jt.f34752a = typedArrayObtainStyledAttributes.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(4) ? typedArrayObtainStyledAttributes.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(2) ? typedArrayObtainStyledAttributes.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(1) ? typedArrayObtainStyledAttributes.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(3) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr = new int[length];
            if (length > 0) {
                for (int i3 = 0; i3 < length; i3++) {
                    iArr[i3] = typedArrayObtainTypedArray.getDimensionPixelSize(i3, -1);
                }
                c0753jt.f34756e = C0753jt.m13499b(iArr);
                int[] iArr2 = c0753jt.f34756e;
                int length2 = iArr2.length;
                boolean z3 = length2 > 0;
                c0753jt.f34757f = z3;
                if (z3) {
                    c0753jt.f34752a = 1;
                    c0753jt.f34754c = iArr2[0];
                    c0753jt.f34755d = iArr2[length2 - 1];
                    c0753jt.f34753b = -1.0f;
                }
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!c0753jt.m13500a()) {
            c0753jt.f34752a = 0;
        } else if (c0753jt.f34752a == 1) {
            if (!c0753jt.f34757f) {
                DisplayMetrics displayMetrics = c0753jt.f34759h.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i2 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i2 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                if (dimension2 <= 0.0f) {
                    throw new IllegalArgumentException("Minimum auto-size text size (" + dimension2 + "px) is less or equal to (0px)");
                }
                if (dimension3 <= dimension2) {
                    throw new IllegalArgumentException("Maximum auto-size text size (" + dimension3 + "px) is less or equal to minimum auto-size text size (" + dimension2 + "px)");
                }
                if (dimension <= 0.0f) {
                    throw new IllegalArgumentException("The auto-size step granularity (" + dimension + "px) is less or equal to (0px)");
                }
                c0753jt.f34752a = 1;
                c0753jt.f34754c = dimension2;
                c0753jt.f34755d = dimension3;
                c0753jt.f34753b = dimension;
                c0753jt.f34757f = false;
            }
            if (c0753jt.m13500a() && c0753jt.f34752a == 1 && (!c0753jt.f34757f || c0753jt.f34756e.length == 0)) {
                int iFloor = ((int) Math.floor((c0753jt.f34755d - c0753jt.f34754c) / c0753jt.f34753b)) + 1;
                int[] iArr3 = new int[iFloor];
                for (int i4 = 0; i4 < iFloor; i4++) {
                    iArr3[i4] = Math.round(c0753jt.f34754c + (i4 * c0753jt.f34753b));
                }
                c0753jt.f34756e = C0753jt.m13499b(iArr3);
            }
        }
        Method method = C0864nw.f44818a;
        C0753jt c0753jt2 = this.f34519k;
        if (c0753jt2.f34752a != 0) {
            int[] iArr4 = c0753jt2.f34756e;
            if (iArr4.length > 0) {
                if (C0747jn.m13381a(this.f34512d) != -1.0f) {
                    C0747jn.m13382b(this.f34512d, Math.round(this.f34519k.f34754c), Math.round(this.f34519k.f34755d), Math.round(this.f34519k.f34753b), 0);
                } else {
                    C0747jn.m13383c(this.f34512d, iArr4, 0);
                }
            }
        }
        AmbientDelegate ambientDelegateM1567C = AmbientDelegate.m1567C(context, attributeSet, C0193fr.f23265i);
        int iM1616s2 = ambientDelegateM1567C.m1616s(8, -1);
        Drawable drawableM11555c = iM1616s2 != -1 ? c0271ioM11552d.m11555c(context, iM1616s2) : null;
        int iM1616s3 = ambientDelegateM1567C.m1616s(13, -1);
        Drawable drawableM11555c2 = iM1616s3 != -1 ? c0271ioM11552d.m11555c(context, iM1616s3) : null;
        int iM1616s4 = ambientDelegateM1567C.m1616s(9, -1);
        Drawable drawableM11555c3 = iM1616s4 != -1 ? c0271ioM11552d.m11555c(context, iM1616s4) : null;
        int iM1616s5 = ambientDelegateM1567C.m1616s(6, -1);
        Drawable drawableM11555c4 = iM1616s5 != -1 ? c0271ioM11552d.m11555c(context, iM1616s5) : null;
        int iM1616s6 = ambientDelegateM1567C.m1616s(10, -1);
        Drawable drawableM11555c5 = iM1616s6 != -1 ? c0271ioM11552d.m11555c(context, iM1616s6) : null;
        int iM1616s7 = ambientDelegateM1567C.m1616s(7, -1);
        Drawable drawableM11555c6 = iM1616s7 != -1 ? c0271ioM11552d.m11555c(context, iM1616s7) : null;
        if (drawableM11555c5 != null || drawableM11555c6 != null) {
            Drawable[] drawableArrM13331c = C0745jl.m13331c(this.f34512d);
            TextView textView3 = this.f34512d;
            if (drawableM11555c5 == null) {
                drawableM11555c5 = drawableArrM13331c[0];
            }
            if (drawableM11555c2 == null) {
                drawableM11555c2 = drawableArrM13331c[1];
            }
            if (drawableM11555c6 == null) {
                drawableM11555c6 = drawableArrM13331c[2];
            }
            if (drawableM11555c4 == null) {
                drawableM11555c4 = drawableArrM13331c[3];
            }
            C0745jl.m13329a(textView3, drawableM11555c5, drawableM11555c2, drawableM11555c6, drawableM11555c4);
        } else if (drawableM11555c != null || drawableM11555c2 != null || drawableM11555c3 != null || drawableM11555c4 != null) {
            Drawable[] drawableArrM13331c2 = C0745jl.m13331c(this.f34512d);
            Drawable drawable = drawableArrM13331c2[0];
            if (drawable == null && drawableArrM13331c2[2] == null) {
                Drawable[] compoundDrawables = this.f34512d.getCompoundDrawables();
                TextView textView4 = this.f34512d;
                if (drawableM11555c == null) {
                    drawableM11555c = compoundDrawables[0];
                }
                if (drawableM11555c2 == null) {
                    drawableM11555c2 = compoundDrawables[1];
                }
                if (drawableM11555c3 == null) {
                    drawableM11555c3 = compoundDrawables[2];
                }
                if (drawableM11555c4 == null) {
                    drawableM11555c4 = compoundDrawables[3];
                }
                textView4.setCompoundDrawablesWithIntrinsicBounds(drawableM11555c, drawableM11555c2, drawableM11555c3, drawableM11555c4);
            } else {
                TextView textView5 = this.f34512d;
                if (drawableM11555c2 == null) {
                    drawableM11555c2 = drawableArrM13331c2[1];
                }
                Drawable drawable2 = drawableArrM13331c2[2];
                if (drawableM11555c4 == null) {
                    drawableM11555c4 = drawableArrM13331c2[3];
                }
                C0745jl.m13329a(textView5, drawable, drawableM11555c2, drawable2, drawableM11555c4);
            }
        }
        if (ambientDelegateM1567C.m1575A(11)) {
            ahs.m701f(this.f34512d, ambientDelegateM1567C.m1617t(11));
        }
        if (ambientDelegateM1567C.m1575A(12)) {
            ahs.m702g(this.f34512d, C0768kh.m14230a(ambientDelegateM1567C.m1613p(12, -1), null));
        }
        int iM1612o = ambientDelegateM1567C.m1612o(15, -1);
        int iM1612o2 = ambientDelegateM1567C.m1612o(18, -1);
        int iM1612o3 = ambientDelegateM1567C.m1612o(19, -1);
        ambientDelegateM1567C.m1622y();
        if (iM1612o != -1) {
            TextView textView6 = this.f34512d;
            abf.m89b(iM1612o);
            aht.m705b(textView6, iM1612o);
        }
        if (iM1612o2 != -1) {
            TextView textView7 = this.f34512d;
            abf.m89b(iM1612o2);
            Paint.FontMetricsInt fontMetricsInt = textView7.getPaint().getFontMetricsInt();
            int i5 = ahq.m687c(textView7) ? fontMetricsInt.bottom : fontMetricsInt.descent;
            if (iM1612o2 > Math.abs(i5)) {
                textView7.setPadding(textView7.getPaddingLeft(), textView7.getPaddingTop(), textView7.getPaddingRight(), iM1612o2 - i5);
            }
        }
        if (iM1612o3 != -1) {
            abm.m138e(this.f34512d, iM1612o3);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m13418c(Context context, int i) {
        String strM1621x;
        AmbientDelegate ambientDelegateM1566B = AmbientDelegate.m1566B(context, i, C0193fr.f23279w);
        if (ambientDelegateM1566B.m1575A(17)) {
            m13419d(ambientDelegateM1566B.m1623z(17, false));
        }
        if (ambientDelegateM1566B.m1575A(0) && ambientDelegateM1566B.m1612o(0, -1) == 0) {
            this.f34512d.setTextSize(0, 0.0f);
        }
        m13415g(context, ambientDelegateM1566B);
        if (ambientDelegateM1566B.m1575A(16) && (strM1621x = ambientDelegateM1566B.m1621x(16)) != null) {
            C0747jn.m13384d(this.f34512d, strM1621x);
        }
        ambientDelegateM1566B.m1622y();
        Typeface typeface = this.f34510b;
        if (typeface != null) {
            this.f34512d.setTypeface(typeface, this.f34509a);
        }
    }

    /* JADX INFO: renamed from: d */
    final void m13419d(boolean z) {
        this.f34512d.setAllCaps(z);
    }
}
