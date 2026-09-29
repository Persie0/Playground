package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import androidx.constraintlayout.core.widgets.analyzer.AbstractC0473h;
import androidx.constraintlayout.core.widgets.analyzer.C0470e;
import androidx.constraintlayout.core.widgets.analyzer.C0472g;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC3423or;
import p000.C3309ls;
import p000.ck1;
import p000.eda;
import p000.ej1;
import p000.ewa;
import p000.gd5;
import p000.gj1;
import p000.gq3;
import p000.h59;
import p000.hj1;
import p000.hq3;
import p000.ij1;
import p000.jj1;
import p000.kj1;
import p000.l80;
import p000.lj1;
import p000.mp0;
import p000.os3;
import p000.sb2;
import p000.sj1;
import p000.vj1;
import p000.wj1;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: K */
    public static h59 f5445K;

    /* JADX INFO: renamed from: H */
    public HashMap f5446H;

    /* JADX INFO: renamed from: I */
    public final SparseArray f5447I;

    /* JADX INFO: renamed from: J */
    public final ij1 f5448J;

    /* JADX INFO: renamed from: a */
    public final SparseArray f5449a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f5450b;

    /* JADX INFO: renamed from: c */
    public final wj1 f5451c;

    /* JADX INFO: renamed from: d */
    public int f5452d;

    /* JADX INFO: renamed from: e */
    public int f5453e;

    /* JADX INFO: renamed from: f */
    public int f5454f;

    /* JADX INFO: renamed from: g */
    public int f5455g;

    /* JADX INFO: renamed from: h */
    public boolean f5456h;

    /* JADX INFO: renamed from: i */
    public int f5457i;

    /* JADX INFO: renamed from: j */
    public sj1 f5458j;

    /* JADX INFO: renamed from: k */
    public lj1 f5459k;

    /* JADX INFO: renamed from: l */
    public int f5460l;

    public ConstraintLayout(Context context) {
        super(context);
        this.f5449a = new SparseArray();
        this.f5450b = new ArrayList(4);
        this.f5451c = new wj1();
        this.f5452d = 0;
        this.f5453e = 0;
        this.f5454f = Integer.MAX_VALUE;
        this.f5455g = Integer.MAX_VALUE;
        this.f5456h = true;
        this.f5457i = 257;
        this.f5458j = null;
        this.f5459k = null;
        this.f5460l = -1;
        this.f5446H = new HashMap();
        this.f5447I = new SparseArray();
        this.f5448J = new ij1(this, this);
        m1967i(null, 0, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static h59 getSharedValues() {
        if (f5445K == null) {
            f5445K = new h59();
        }
        return f5445K;
    }

    /* JADX WARN: Code duplicated, block: B:148:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:75:0x0179  */
    /* JADX WARN: Code duplicated, block: B:78:0x0181  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:148:0x02a9 -> B:149:0x02aa). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    public final void m1965a(boolean z, View view, vj1 vj1Var, hj1 hj1Var, SparseArray sparseArray) {
        vj1 vj1Var2;
        vj1 vj1Var3;
        vj1 vj1Var4;
        vj1 vj1Var5;
        hj1 hj1Var2;
        vj1 vj1Var6;
        float f;
        int i;
        float fAbs;
        int i2;
        vj1 vj1Var7 = vj1Var;
        hj1Var.m13292a();
        vj1Var7.f65473h0 = view.getVisibility();
        vj1Var7.f65471g0 = view;
        if (view instanceof ej1) {
            ((ej1) view).mo1932j(vj1Var7, this.f5451c.f66922y0);
        }
        int i3 = -1;
        if (hj1Var.f42449d0) {
            gq3 gq3Var = (gq3) vj1Var7;
            int i4 = hj1Var.f42467m0;
            int i5 = hj1Var.f42469n0;
            float f2 = hj1Var.f42471o0;
            if (f2 != -1.0f) {
                if (f2 > -1.0f) {
                    gq3Var.f41179t0 = f2;
                    gq3Var.f41180u0 = -1;
                    gq3Var.f41181v0 = -1;
                    return;
                }
                return;
            }
            if (i4 != -1) {
                if (i4 > -1) {
                    gq3Var.f41179t0 = -1.0f;
                    gq3Var.f41180u0 = i4;
                    gq3Var.f41181v0 = -1;
                    return;
                }
                return;
            }
            if (i5 == -1 || i5 <= -1) {
                return;
            }
            gq3Var.f41179t0 = -1.0f;
            gq3Var.f41180u0 = -1;
            gq3Var.f41181v0 = i5;
            return;
        }
        int i6 = hj1Var.f42453f0;
        int i7 = hj1Var.f42455g0;
        int i8 = hj1Var.f42457h0;
        int i9 = hj1Var.f42459i0;
        int i10 = hj1Var.f42461j0;
        int i11 = hj1Var.f42463k0;
        float f3 = hj1Var.f42465l0;
        int i12 = hj1Var.f42472p;
        if (i12 != -1) {
            vj1 vj1Var8 = (vj1) sparseArray.get(i12);
            if (vj1Var8 != null) {
                float f4 = hj1Var.f42475r;
                int i13 = hj1Var.f42474q;
                ConstraintAnchor$Type constraintAnchor$Type = ConstraintAnchor$Type.CENTER;
                vj1Var.m23331w(constraintAnchor$Type, vj1Var8, constraintAnchor$Type, i13, 0);
                vj1Var7 = vj1Var;
                vj1Var7.f65435D = f4;
            }
            vj1Var6 = vj1Var7;
            hj1Var2 = hj1Var;
        } else {
            if (i6 != -1) {
                vj1 vj1Var9 = (vj1) sparseArray.get(i6);
                if (vj1Var9 != null) {
                    ConstraintAnchor$Type constraintAnchor$Type2 = ConstraintAnchor$Type.LEFT;
                    vj1Var.m23331w(constraintAnchor$Type2, vj1Var9, constraintAnchor$Type2, ((ViewGroup.MarginLayoutParams) hj1Var).leftMargin, i10);
                }
            } else if (i7 != -1 && (vj1Var2 = (vj1) sparseArray.get(i7)) != null) {
                vj1Var.m23331w(ConstraintAnchor$Type.LEFT, vj1Var2, ConstraintAnchor$Type.RIGHT, ((ViewGroup.MarginLayoutParams) hj1Var).leftMargin, i10);
            }
            if (i8 != -1) {
                vj1 vj1Var10 = (vj1) sparseArray.get(i8);
                if (vj1Var10 != null) {
                    vj1Var.m23331w(ConstraintAnchor$Type.RIGHT, vj1Var10, ConstraintAnchor$Type.LEFT, ((ViewGroup.MarginLayoutParams) hj1Var).rightMargin, i11);
                }
            } else if (i9 != -1 && (vj1Var3 = (vj1) sparseArray.get(i9)) != null) {
                ConstraintAnchor$Type constraintAnchor$Type3 = ConstraintAnchor$Type.RIGHT;
                vj1Var.m23331w(constraintAnchor$Type3, vj1Var3, constraintAnchor$Type3, ((ViewGroup.MarginLayoutParams) hj1Var).rightMargin, i11);
            }
            int i14 = hj1Var.f42458i;
            if (i14 != -1) {
                vj1 vj1Var11 = (vj1) sparseArray.get(i14);
                if (vj1Var11 != null) {
                    ConstraintAnchor$Type constraintAnchor$Type4 = ConstraintAnchor$Type.TOP;
                    vj1Var.m23331w(constraintAnchor$Type4, vj1Var11, constraintAnchor$Type4, ((ViewGroup.MarginLayoutParams) hj1Var).topMargin, hj1Var.f42481x);
                }
            } else {
                int i15 = hj1Var.f42460j;
                if (i15 != -1 && (vj1Var4 = (vj1) sparseArray.get(i15)) != null) {
                    vj1Var.m23331w(ConstraintAnchor$Type.TOP, vj1Var4, ConstraintAnchor$Type.BOTTOM, ((ViewGroup.MarginLayoutParams) hj1Var).topMargin, hj1Var.f42481x);
                }
            }
            int i16 = hj1Var.f42462k;
            if (i16 != -1) {
                vj1 vj1Var12 = (vj1) sparseArray.get(i16);
                if (vj1Var12 != null) {
                    vj1Var.m23331w(ConstraintAnchor$Type.BOTTOM, vj1Var12, ConstraintAnchor$Type.TOP, ((ViewGroup.MarginLayoutParams) hj1Var).bottomMargin, hj1Var.f42483z);
                }
            } else {
                int i17 = hj1Var.f42464l;
                if (i17 != -1 && (vj1Var5 = (vj1) sparseArray.get(i17)) != null) {
                    ConstraintAnchor$Type constraintAnchor$Type5 = ConstraintAnchor$Type.BOTTOM;
                    vj1Var.m23331w(constraintAnchor$Type5, vj1Var5, constraintAnchor$Type5, ((ViewGroup.MarginLayoutParams) hj1Var).bottomMargin, hj1Var.f42483z);
                }
            }
            int i18 = hj1Var.f42466m;
            if (i18 != -1) {
                hj1Var2 = hj1Var;
                m1971n(vj1Var, hj1Var2, sparseArray, i18, ConstraintAnchor$Type.BASELINE);
            } else {
                hj1Var2 = hj1Var;
                int i19 = hj1Var2.f42468n;
                if (i19 != -1) {
                    m1971n(vj1Var, hj1Var2, sparseArray, i19, ConstraintAnchor$Type.TOP);
                } else {
                    int i20 = hj1Var2.f42470o;
                    if (i20 != -1) {
                        m1971n(vj1Var, hj1Var2, sparseArray, i20, ConstraintAnchor$Type.BOTTOM);
                        vj1Var6 = vj1Var;
                    }
                    if (f3 >= 0.0f) {
                        vj1Var6.f65467e0 = f3;
                    }
                    f = hj1Var2.f42421F;
                    if (f >= 0.0f) {
                        vj1Var6.f65469f0 = f;
                    }
                }
            }
            vj1Var6 = vj1Var;
            if (f3 >= 0.0f) {
                vj1Var6.f65467e0 = f3;
            }
            f = hj1Var2.f42421F;
            if (f >= 0.0f) {
                vj1Var6.f65469f0 = f;
            }
        }
        if (z && ((i2 = hj1Var2.f42435T) != -1 || hj1Var2.f42436U != -1)) {
            int i21 = hj1Var2.f42436U;
            vj1Var6.f65457Z = i2;
            vj1Var6.f65459a0 = i21;
        }
        if (hj1Var2.f42443a0) {
            vj1Var6.m23311N(ConstraintWidget$DimensionBehaviour.FIXED);
            vj1Var6.m23313P(((ViewGroup.MarginLayoutParams) hj1Var2).width);
            if (((ViewGroup.MarginLayoutParams) hj1Var2).width == -2) {
                vj1Var6.m23311N(ConstraintWidget$DimensionBehaviour.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) hj1Var2).width == -1) {
            if (hj1Var2.f42438W) {
                vj1Var6.m23311N(ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT);
            } else {
                vj1Var6.m23311N(ConstraintWidget$DimensionBehaviour.MATCH_PARENT);
            }
            vj1Var6.mo12819j(ConstraintAnchor$Type.LEFT).f8583g = ((ViewGroup.MarginLayoutParams) hj1Var2).leftMargin;
            vj1Var6.mo12819j(ConstraintAnchor$Type.RIGHT).f8583g = ((ViewGroup.MarginLayoutParams) hj1Var2).rightMargin;
        } else {
            vj1Var6.m23311N(ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT);
            vj1Var6.m23313P(0);
        }
        if (hj1Var2.f42445b0) {
            vj1Var6.m23312O(ConstraintWidget$DimensionBehaviour.FIXED);
            vj1Var6.m23310M(((ViewGroup.MarginLayoutParams) hj1Var2).height);
            if (((ViewGroup.MarginLayoutParams) hj1Var2).height == -2) {
                vj1Var6.m23312O(ConstraintWidget$DimensionBehaviour.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) hj1Var2).height == -1) {
            if (hj1Var2.f42439X) {
                vj1Var6.m23312O(ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT);
            } else {
                vj1Var6.m23312O(ConstraintWidget$DimensionBehaviour.MATCH_PARENT);
            }
            vj1Var6.mo12819j(ConstraintAnchor$Type.TOP).f8583g = ((ViewGroup.MarginLayoutParams) hj1Var2).topMargin;
            vj1Var6.mo12819j(ConstraintAnchor$Type.BOTTOM).f8583g = ((ViewGroup.MarginLayoutParams) hj1Var2).bottomMargin;
        } else {
            vj1Var6.m23312O(ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT);
            vj1Var6.m23310M(0);
        }
        String str = hj1Var2.f42422G;
        if (str == null || str.length() == 0) {
            vj1Var6.f65455X = 0.0f;
        } else {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                i = 0;
            } else {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    i3 = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    i3 = 1;
                }
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        fAbs = Float.parseFloat(strSubstring2);
                    } else {
                        fAbs = 0.0f;
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                        fAbs = 0.0f;
                    } else {
                        float f5 = Float.parseFloat(strSubstring3);
                        float f6 = Float.parseFloat(strSubstring4);
                        if (f5 <= 0.0f || f6 <= 0.0f) {
                            fAbs = 0.0f;
                        } else {
                            fAbs = i3 == 1 ? Math.abs(f6 / f5) : Math.abs(f5 / f6);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
            if (fAbs > 0.0f) {
                vj1Var6.f65455X = fAbs;
                vj1Var6.f65456Y = i3;
            }
        }
        float f7 = hj1Var2.f42423H;
        float[] fArr = vj1Var6.f65483m0;
        fArr[0] = f7;
        fArr[1] = hj1Var2.f42424I;
        vj1Var6.f65479k0 = hj1Var2.f42425J;
        vj1Var6.f65481l0 = hj1Var2.f42426K;
        int i22 = hj1Var2.f42441Z;
        if (i22 >= 0 && i22 <= 3) {
            vj1Var6.f65490q = i22;
        }
        int i23 = hj1Var2.f42427L;
        int i24 = hj1Var2.f42429N;
        int i25 = hj1Var2.f42431P;
        float f8 = hj1Var2.f42433R;
        vj1Var6.f65492r = i23;
        vj1Var6.f65497u = i24;
        if (i25 == Integer.MAX_VALUE) {
            i25 = 0;
        }
        vj1Var6.f65498v = i25;
        vj1Var6.f65499w = f8;
        if (f8 > 0.0f && f8 < 1.0f && i23 == 0) {
            vj1Var6.f65492r = 2;
        }
        int i26 = hj1Var2.f42428M;
        int i27 = hj1Var2.f42430O;
        int i28 = hj1Var2.f42432Q;
        float f9 = hj1Var2.f42434S;
        vj1Var6.f65494s = i26;
        vj1Var6.f65500x = i27;
        vj1Var6.f65501y = i28 != Integer.MAX_VALUE ? i28 : 0;
        vj1Var6.f65502z = f9;
        if (f9 <= 0.0f || f9 >= 1.0f || i26 != 0) {
            return;
        }
        vj1Var6.f65494s = 2;
    }

    /* JADX INFO: renamed from: b */
    public final vj1 m1966b(View view) {
        if (view == this) {
            return this.f5451c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof hj1) {
            return ((hj1) view.getLayoutParams()).f42473p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof hj1) {
            return ((hj1) view.getLayoutParams()).f42473p0;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof hj1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f5450b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((ej1) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        int i8 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + i8;
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f5456h = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new hj1();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        hj1 hj1Var = new hj1(context, attributeSet);
        hj1Var.f42442a = -1;
        hj1Var.f42444b = -1;
        hj1Var.f42446c = -1.0f;
        hj1Var.f42448d = true;
        hj1Var.f42450e = -1;
        hj1Var.f42452f = -1;
        hj1Var.f42454g = -1;
        hj1Var.f42456h = -1;
        hj1Var.f42458i = -1;
        hj1Var.f42460j = -1;
        hj1Var.f42462k = -1;
        hj1Var.f42464l = -1;
        hj1Var.f42466m = -1;
        hj1Var.f42468n = -1;
        hj1Var.f42470o = -1;
        hj1Var.f42472p = -1;
        hj1Var.f42474q = 0;
        hj1Var.f42475r = 0.0f;
        hj1Var.f42476s = -1;
        hj1Var.f42477t = -1;
        hj1Var.f42478u = -1;
        hj1Var.f42479v = -1;
        hj1Var.f42480w = Integer.MIN_VALUE;
        hj1Var.f42481x = Integer.MIN_VALUE;
        hj1Var.f42482y = Integer.MIN_VALUE;
        hj1Var.f42483z = Integer.MIN_VALUE;
        hj1Var.f42416A = Integer.MIN_VALUE;
        hj1Var.f42417B = Integer.MIN_VALUE;
        hj1Var.f42418C = Integer.MIN_VALUE;
        hj1Var.f42419D = 0;
        hj1Var.f42420E = 0.5f;
        hj1Var.f42421F = 0.5f;
        hj1Var.f42422G = null;
        hj1Var.f42423H = -1.0f;
        hj1Var.f42424I = -1.0f;
        hj1Var.f42425J = 0;
        hj1Var.f42426K = 0;
        hj1Var.f42427L = 0;
        hj1Var.f42428M = 0;
        hj1Var.f42429N = 0;
        hj1Var.f42430O = 0;
        hj1Var.f42431P = 0;
        hj1Var.f42432Q = 0;
        hj1Var.f42433R = 1.0f;
        hj1Var.f42434S = 1.0f;
        hj1Var.f42435T = -1;
        hj1Var.f42436U = -1;
        hj1Var.f42437V = -1;
        hj1Var.f42438W = false;
        hj1Var.f42439X = false;
        hj1Var.f42440Y = null;
        hj1Var.f42441Z = 0;
        hj1Var.f42443a0 = true;
        hj1Var.f42445b0 = true;
        hj1Var.f42447c0 = false;
        hj1Var.f42449d0 = false;
        hj1Var.f42451e0 = false;
        hj1Var.f42453f0 = -1;
        hj1Var.f42455g0 = -1;
        hj1Var.f42457h0 = -1;
        hj1Var.f42459i0 = -1;
        hj1Var.f42461j0 = Integer.MIN_VALUE;
        hj1Var.f42463k0 = Integer.MIN_VALUE;
        hj1Var.f42465l0 = 0.5f;
        hj1Var.f42473p0 = new vj1();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            int i2 = gj1.f40869a.get(index);
            switch (i2) {
                case 1:
                    hj1Var.f42437V = typedArrayObtainStyledAttributes.getInt(index, hj1Var.f42437V);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, hj1Var.f42472p);
                    hj1Var.f42472p = resourceId;
                    if (resourceId == -1) {
                        hj1Var.f42472p = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    hj1Var.f42474q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hj1Var.f42474q);
                    break;
                case 4:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, hj1Var.f42475r) % 360.0f;
                    hj1Var.f42475r = f;
                    if (f < 0.0f) {
                        hj1Var.f42475r = (360.0f - f) % 360.0f;
                    }
                    break;
                case 5:
                    hj1Var.f42442a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, hj1Var.f42442a);
                    break;
                case 6:
                    hj1Var.f42444b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, hj1Var.f42444b);
                    break;
                case 7:
                    hj1Var.f42446c = typedArrayObtainStyledAttributes.getFloat(index, hj1Var.f42446c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, hj1Var.f42450e);
                    hj1Var.f42450e = resourceId2;
                    if (resourceId2 == -1) {
                        hj1Var.f42450e = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, hj1Var.f42452f);
                    hj1Var.f42452f = resourceId3;
                    if (resourceId3 == -1) {
                        hj1Var.f42452f = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, hj1Var.f42454g);
                    hj1Var.f42454g = resourceId4;
                    if (resourceId4 == -1) {
                        hj1Var.f42454g = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, hj1Var.f42456h);
                    hj1Var.f42456h = resourceId5;
                    if (resourceId5 == -1) {
                        hj1Var.f42456h = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, hj1Var.f42458i);
                    hj1Var.f42458i = resourceId6;
                    if (resourceId6 == -1) {
                        hj1Var.f42458i = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, hj1Var.f42460j);
                    hj1Var.f42460j = resourceId7;
                    if (resourceId7 == -1) {
                        hj1Var.f42460j = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, hj1Var.f42462k);
                    hj1Var.f42462k = resourceId8;
                    if (resourceId8 == -1) {
                        hj1Var.f42462k = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, hj1Var.f42464l);
                    hj1Var.f42464l = resourceId9;
                    if (resourceId9 == -1) {
                        hj1Var.f42464l = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, hj1Var.f42466m);
                    hj1Var.f42466m = resourceId10;
                    if (resourceId10 == -1) {
                        hj1Var.f42466m = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, hj1Var.f42476s);
                    hj1Var.f42476s = resourceId11;
                    if (resourceId11 == -1) {
                        hj1Var.f42476s = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, hj1Var.f42477t);
                    hj1Var.f42477t = resourceId12;
                    if (resourceId12 == -1) {
                        hj1Var.f42477t = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, hj1Var.f42478u);
                    hj1Var.f42478u = resourceId13;
                    if (resourceId13 == -1) {
                        hj1Var.f42478u = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, hj1Var.f42479v);
                    hj1Var.f42479v = resourceId14;
                    if (resourceId14 == -1) {
                        hj1Var.f42479v = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 21:
                    hj1Var.f42480w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hj1Var.f42480w);
                    break;
                case 22:
                    hj1Var.f42481x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hj1Var.f42481x);
                    break;
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    hj1Var.f42482y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hj1Var.f42482y);
                    break;
                case 24:
                    hj1Var.f42483z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hj1Var.f42483z);
                    break;
                case 25:
                    hj1Var.f42416A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hj1Var.f42416A);
                    break;
                case 26:
                    hj1Var.f42417B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hj1Var.f42417B);
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    hj1Var.f42438W = typedArrayObtainStyledAttributes.getBoolean(index, hj1Var.f42438W);
                    break;
                case 28:
                    hj1Var.f42439X = typedArrayObtainStyledAttributes.getBoolean(index, hj1Var.f42439X);
                    break;
                case 29:
                    hj1Var.f42420E = typedArrayObtainStyledAttributes.getFloat(index, hj1Var.f42420E);
                    break;
                case 30:
                    hj1Var.f42421F = typedArrayObtainStyledAttributes.getFloat(index, hj1Var.f42421F);
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    hj1Var.f42427L = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                    }
                    break;
                case 32:
                    int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    hj1Var.f42428M = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                    }
                    break;
                case 33:
                    try {
                        hj1Var.f42429N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hj1Var.f42429N);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, hj1Var.f42429N) == -2) {
                            hj1Var.f42429N = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        hj1Var.f42431P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hj1Var.f42431P);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, hj1Var.f42431P) == -2) {
                            hj1Var.f42431P = -2;
                        }
                    }
                    break;
                case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    hj1Var.f42433R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, hj1Var.f42433R));
                    hj1Var.f42427L = 2;
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    try {
                        hj1Var.f42430O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hj1Var.f42430O);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, hj1Var.f42430O) == -2) {
                            hj1Var.f42430O = -2;
                        }
                    }
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    try {
                        hj1Var.f42432Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hj1Var.f42432Q);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, hj1Var.f42432Q) == -2) {
                            hj1Var.f42432Q = -2;
                        }
                    }
                    break;
                case 38:
                    hj1Var.f42434S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, hj1Var.f42434S));
                    hj1Var.f42428M = 2;
                    break;
                default:
                    switch (i2) {
                        case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                            sj1.m21405n(hj1Var, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                            hj1Var.f42423H = typedArrayObtainStyledAttributes.getFloat(index, hj1Var.f42423H);
                            break;
                        case 46:
                            hj1Var.f42424I = typedArrayObtainStyledAttributes.getFloat(index, hj1Var.f42424I);
                            break;
                        case 47:
                            hj1Var.f42425J = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case eda.f37086g /* 48 */:
                            hj1Var.f42426K = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            hj1Var.f42435T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, hj1Var.f42435T);
                            break;
                        case 50:
                            hj1Var.f42436U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, hj1Var.f42436U);
                            break;
                        case 51:
                            hj1Var.f42440Y = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, hj1Var.f42468n);
                            hj1Var.f42468n = resourceId15;
                            if (resourceId15 == -1) {
                                hj1Var.f42468n = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, hj1Var.f42470o);
                            hj1Var.f42470o = resourceId16;
                            if (resourceId16 == -1) {
                                hj1Var.f42470o = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 54:
                            hj1Var.f42419D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hj1Var.f42419D);
                            break;
                        case 55:
                            hj1Var.f42418C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hj1Var.f42418C);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    sj1.m21404m(hj1Var, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    sj1.m21404m(hj1Var, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    hj1Var.f42441Z = typedArrayObtainStyledAttributes.getInt(index, hj1Var.f42441Z);
                                    break;
                                case 67:
                                    hj1Var.f42448d = typedArrayObtainStyledAttributes.getBoolean(index, hj1Var.f42448d);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        hj1Var.m13292a();
        return hj1Var;
    }

    public int getMaxHeight() {
        return this.f5455g;
    }

    public int getMaxWidth() {
        return this.f5454f;
    }

    public int getMinHeight() {
        return this.f5453e;
    }

    public int getMinWidth() {
        return this.f5452d;
    }

    public int getOptimizationLevel() {
        return this.f5451c.f66908G0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        wj1 wj1Var = this.f5451c;
        if (wj1Var.f65476j == null) {
            int id2 = getId();
            if (id2 != -1) {
                wj1Var.f65476j = getContext().getResources().getResourceEntryName(id2);
            } else {
                wj1Var.f65476j = "parent";
            }
        }
        if (wj1Var.f65477j0 == null) {
            wj1Var.f65477j0 = wj1Var.f65476j;
            Log.v("ConstraintLayout", " setDebugName " + wj1Var.f65477j0);
        }
        for (vj1 vj1Var : wj1Var.f66917t0) {
            View view = vj1Var.f65471g0;
            if (view != null) {
                if (vj1Var.f65476j == null && (id = view.getId()) != -1) {
                    vj1Var.f65476j = getContext().getResources().getResourceEntryName(id);
                }
                if (vj1Var.f65477j0 == null) {
                    vj1Var.f65477j0 = vj1Var.f65476j;
                    Log.v("ConstraintLayout", " setDebugName " + vj1Var.f65477j0);
                }
            }
        }
        wj1Var.mo23325o(sb);
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    public final void m1967i(AttributeSet attributeSet, int i, int i2) {
        wj1 wj1Var = this.f5451c;
        wj1Var.f65471g0 = this;
        ij1 ij1Var = this.f5448J;
        wj1Var.f66921x0 = ij1Var;
        wj1Var.f66919v0.f60618h = ij1Var;
        this.f5449a.put(getId(), this);
        this.f5458j = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout, i, i2);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == R$styleable.ConstraintLayout_Layout_android_minWidth) {
                    this.f5452d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f5452d);
                } else if (index == R$styleable.ConstraintLayout_Layout_android_minHeight) {
                    this.f5453e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f5453e);
                } else if (index == R$styleable.ConstraintLayout_Layout_android_maxWidth) {
                    this.f5454f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f5454f);
                } else if (index == R$styleable.ConstraintLayout_Layout_android_maxHeight) {
                    this.f5455g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f5455g);
                } else if (index == R$styleable.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.f5457i = typedArrayObtainStyledAttributes.getInt(index, this.f5457i);
                } else if (index == R$styleable.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            mo1938k(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f5459k = null;
                        }
                    }
                } else if (index == R$styleable.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        sj1 sj1Var = new sj1();
                        this.f5458j = sj1Var;
                        sj1Var.m21413j(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f5458j = null;
                    }
                    this.f5460l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        wj1Var.f66908G0 = this.f5457i;
        gd5.f40570q = wj1Var.m24008X(512);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m1968j() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    /* JADX INFO: renamed from: k */
    public void mo1938k(int i) {
        String str;
        Context context = getContext();
        lj1 lj1Var = new lj1();
        lj1Var.f49731a = -1;
        lj1Var.f49732b = -1;
        lj1Var.f49734d = new SparseArray();
        lj1Var.f49735e = new SparseArray();
        lj1Var.f49733c = this;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            jj1 jj1Var = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                lj1Var.m16250f(context, xml);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                jj1 jj1Var2 = new jj1(context, xml);
                                ((SparseArray) lj1Var.f49734d).put(jj1Var2.f45601a, jj1Var2);
                                jj1Var = jj1Var2;
                            }
                            break;
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                kj1 kj1Var = new kj1(context, xml);
                                if (jj1Var != null) {
                                    jj1Var.m14493a(kj1Var);
                                }
                            }
                            break;
                    }
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e2);
        }
        this.f5459k = lj1Var;
    }

    /* JADX INFO: renamed from: l */
    public final void m1969l(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        ij1 ij1Var = this.f5448J;
        int i5 = ij1Var.f44177e;
        int iResolveSizeAndState = View.resolveSizeAndState(i3 + ij1Var.f44176d, i, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215;
        int iMin = Math.min(this.f5454f, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.f5455g, iResolveSizeAndState2);
        if (z) {
            iMin |= 16777216;
        }
        if (z2) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b4 A[PHI: r12
      0x00b4: PHI (r12v6 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour) = 
      (r12v5 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour)
      (r12v1 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour)
     binds: [B:33:0x00c1, B:29:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: m */
    public final void m1970m(wj1 wj1Var, int i, int i2, int i3) {
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2;
        int i4;
        int iMin;
        int iMax;
        int iMax2;
        int i5;
        boolean z;
        boolean z2;
        ij1 ij1Var;
        int i6;
        boolean zM24006U;
        int i7;
        ArrayList arrayList;
        ij1 ij1Var2;
        boolean z3;
        boolean z4;
        boolean z5;
        ij1 ij1Var3;
        int i8;
        boolean z6;
        int i9;
        C0470e c0470e;
        C0472g c0472g;
        boolean z7;
        int i10;
        int i11;
        int i12;
        boolean z8;
        boolean z9;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int iMax3 = Math.max(0, getPaddingTop());
        int iMax4 = Math.max(0, getPaddingBottom());
        int i13 = iMax3 + iMax4;
        int paddingWidth = getPaddingWidth();
        ij1 ij1Var4 = this.f5448J;
        ij1Var4.f44174b = iMax3;
        ij1Var4.f44175c = iMax4;
        ij1Var4.f44176d = paddingWidth;
        ij1Var4.f44177e = i13;
        ij1Var4.f44178f = i2;
        ij1Var4.f44179g = i3;
        int iMax5 = Math.max(0, getPaddingStart());
        int iMax6 = Math.max(0, getPaddingEnd());
        if (iMax5 <= 0 && iMax6 <= 0) {
            iMax5 = Math.max(0, getPaddingLeft());
        } else if (m1968j()) {
            iMax5 = iMax6;
        }
        int i14 = size - paddingWidth;
        int i15 = size2 - i13;
        int i16 = ij1Var4.f44177e;
        int i17 = ij1Var4.f44176d;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = ConstraintWidget$DimensionBehaviour.FIXED;
        int childCount = getChildCount();
        if (mode == Integer.MIN_VALUE) {
            constraintWidget$DimensionBehaviour = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                iMax = Math.max(0, this.f5452d);
                int i18 = iMax;
                constraintWidget$DimensionBehaviour2 = constraintWidget$DimensionBehaviour;
                iMin = i18;
                i4 = Integer.MIN_VALUE;
            } else {
                constraintWidget$DimensionBehaviour2 = constraintWidget$DimensionBehaviour;
                i4 = Integer.MIN_VALUE;
                iMin = i14;
            }
        } else if (mode != 0) {
            iMin = mode != 1073741824 ? 0 : Math.min(this.f5454f - i17, i14);
            i4 = Integer.MIN_VALUE;
            constraintWidget$DimensionBehaviour2 = constraintWidget$DimensionBehaviour3;
        } else {
            constraintWidget$DimensionBehaviour = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                iMax = Math.max(0, this.f5452d);
                int i19 = iMax;
                constraintWidget$DimensionBehaviour2 = constraintWidget$DimensionBehaviour;
                iMin = i19;
                i4 = Integer.MIN_VALUE;
            } else {
                iMin = 0;
                i4 = Integer.MIN_VALUE;
                constraintWidget$DimensionBehaviour2 = constraintWidget$DimensionBehaviour;
            }
        }
        if (mode2 == i4) {
            constraintWidget$DimensionBehaviour3 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
            iMax2 = childCount == 0 ? Math.max(0, this.f5453e) : i15;
        } else if (mode2 == 0) {
            constraintWidget$DimensionBehaviour3 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                iMax2 = Math.max(0, this.f5453e);
            } else {
                iMax2 = 0;
            }
        } else if (mode2 != 1073741824) {
            iMax2 = 0;
        } else {
            iMax2 = Math.min(this.f5455g - i16, i15);
        }
        int iM23326r = wj1Var.m23326r();
        sb2 sb2Var = wj1Var.f66919v0;
        if (iMin != iM23326r || iMax2 != wj1Var.m23322l()) {
            sb2Var.f60613c = true;
        }
        wj1Var.f65457Z = 0;
        wj1Var.f65459a0 = 0;
        int i20 = this.f5454f - i17;
        int[] iArr = wj1Var.f65434C;
        iArr[0] = i20;
        iArr[1] = this.f5455g - i16;
        wj1Var.f65463c0 = 0;
        wj1Var.f65465d0 = 0;
        wj1Var.m23311N(constraintWidget$DimensionBehaviour2);
        wj1Var.m23313P(iMin);
        wj1Var.m23312O(constraintWidget$DimensionBehaviour3);
        wj1Var.m23310M(iMax2);
        int i21 = this.f5452d - i17;
        if (i21 < 0) {
            wj1Var.f65463c0 = 0;
        } else {
            wj1Var.f65463c0 = i21;
        }
        int i22 = this.f5453e - i16;
        if (i22 < 0) {
            wj1Var.f65465d0 = 0;
        } else {
            wj1Var.f65465d0 = i22;
        }
        wj1Var.f66902A0 = iMax5;
        wj1Var.f66903B0 = iMax3;
        C3309ls c3309ls = wj1Var.f66918u0;
        wj1 wj1Var2 = (wj1) c3309ls.f50066d;
        ArrayList arrayList2 = (ArrayList) c3309ls.f50064b;
        ij1 ij1Var5 = wj1Var.f66921x0;
        int size3 = wj1Var.f66917t0.size();
        int iM23326r2 = wj1Var.m23326r();
        int iM23322l = wj1Var.m23322l();
        boolean zM18270o = AbstractC3423or.m18270o(i, 128);
        boolean z10 = zM18270o || AbstractC3423or.m18270o(i, 64);
        if (z10) {
            int i23 = 0;
            while (true) {
                if (i23 < size3) {
                    boolean z11 = z10;
                    vj1 vj1Var = (vj1) wj1Var.f66917t0.get(i23);
                    i5 = size3;
                    ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = vj1Var.f65451T;
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = constraintWidget$DimensionBehaviourArr[0];
                    int i24 = i23;
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour5 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                    boolean z12 = (constraintWidget$DimensionBehaviour4 == constraintWidget$DimensionBehaviour5) && (constraintWidget$DimensionBehaviourArr[1] == constraintWidget$DimensionBehaviour5) && vj1Var.f65455X > 0.0f;
                    if ((vj1Var.m23333y() && z12) || ((vj1Var.m23334z() && z12) || (vj1Var instanceof ewa) || vj1Var.m23333y() || vj1Var.m23334z())) {
                        z = false;
                    } else {
                        i23 = i24 + 1;
                        z10 = z11;
                        size3 = i5;
                    }
                } else {
                    i5 = size3;
                    z = z10;
                }
            }
        } else {
            i5 = size3;
            z = z10;
        }
        boolean z13 = z & ((mode == 1073741824 && mode2 == 1073741824) || zM18270o);
        if (z13) {
            int iMin2 = Math.min(wj1Var.f65434C[0], i14);
            int iMin3 = Math.min(wj1Var.f65434C[1], i15);
            if (mode != 1073741824 || wj1Var.m23326r() == iMin2) {
                z7 = true;
            } else {
                wj1Var.m23313P(iMin2);
                z7 = true;
                sb2Var.f60612b = true;
            }
            if (mode2 == 1073741824 && wj1Var.m23322l() != iMin3) {
                wj1Var.m23310M(iMin3);
                sb2Var.f60612b = z7;
            }
            if (mode == 1073741824 && mode2 == 1073741824) {
                ArrayList<AbstractC0473h> arrayList3 = (ArrayList) sb2Var.f60616f;
                wj1 wj1Var3 = (wj1) sb2Var.f60614d;
                if (sb2Var.f60612b || sb2Var.f60613c) {
                    for (vj1 vj1Var2 : wj1Var3.f66917t0) {
                        vj1Var2.m23320i();
                        vj1Var2.f65458a = false;
                        vj1Var2.f65464d.m1921n();
                        vj1Var2.f65466e.m1922m();
                        z13 = z13;
                    }
                    z2 = z13;
                    wj1Var3.m23320i();
                    i12 = 0;
                    wj1Var3.f65458a = false;
                    wj1Var3.f65464d.m1921n();
                    wj1Var3.f65466e.m1922m();
                    sb2Var.f60613c = false;
                } else {
                    z2 = z13;
                    i12 = 0;
                }
                sb2Var.m21195c((wj1) sb2Var.f60615e);
                wj1Var3.f65457Z = i12;
                wj1Var3.f65459a0 = i12;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviourM23321k = wj1Var3.m23321k(i12);
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviourM23321k2 = wj1Var3.m23321k(1);
                if (sb2Var.f60612b) {
                    sb2Var.m21196d();
                }
                int iM23327s = wj1Var3.m23327s();
                int iM23328t = wj1Var3.m23328t();
                ij1Var = ij1Var5;
                wj1Var3.f65464d.f5357h.mo1914d(iM23327s);
                wj1Var3.f65466e.f5357h.mo1914d(iM23328t);
                sb2Var.m21200i();
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour6 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                if (constraintWidget$DimensionBehaviourM23321k == constraintWidget$DimensionBehaviour6 || constraintWidget$DimensionBehaviourM23321k2 == constraintWidget$DimensionBehaviour6) {
                    if (zM18270o) {
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            if (!((AbstractC0473h) it.next()).mo1918k()) {
                                zM18270o = false;
                                break;
                            }
                        }
                    }
                    if (zM18270o && constraintWidget$DimensionBehaviourM23321k == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT) {
                        wj1Var3.m23311N(ConstraintWidget$DimensionBehaviour.FIXED);
                        wj1Var3.m23313P(sb2Var.m21197e(wj1Var3, 0));
                        wj1Var3.f65464d.f5354e.mo1914d(wj1Var3.m23326r());
                    }
                    if (zM18270o && constraintWidget$DimensionBehaviourM23321k2 == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT) {
                        wj1Var3.m23312O(ConstraintWidget$DimensionBehaviour.FIXED);
                        wj1Var3.m23310M(sb2Var.m21197e(wj1Var3, 1));
                        wj1Var3.f65466e.f5354e.mo1914d(wj1Var3.m23322l());
                    }
                } else {
                    iM23327s = iM23327s;
                }
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour7 = wj1Var3.f65451T[0];
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour8 = ConstraintWidget$DimensionBehaviour.FIXED;
                if (constraintWidget$DimensionBehaviour7 == constraintWidget$DimensionBehaviour8 || constraintWidget$DimensionBehaviour7 == ConstraintWidget$DimensionBehaviour.MATCH_PARENT) {
                    int iM23326r3 = wj1Var3.m23326r() + iM23327s;
                    wj1Var3.f65464d.f5358i.mo1914d(iM23326r3);
                    wj1Var3.f65464d.f5354e.mo1914d(iM23326r3 - iM23327s);
                    sb2Var.m21200i();
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour9 = wj1Var3.f65451T[1];
                    if (constraintWidget$DimensionBehaviour9 == constraintWidget$DimensionBehaviour8 || constraintWidget$DimensionBehaviour9 == ConstraintWidget$DimensionBehaviour.MATCH_PARENT) {
                        int iM23322l2 = wj1Var3.m23322l() + iM23328t;
                        wj1Var3.f65466e.f5358i.mo1914d(iM23322l2);
                        wj1Var3.f65466e.f5354e.mo1914d(iM23322l2 - iM23328t);
                    }
                    sb2Var.m21200i();
                    z8 = true;
                } else {
                    z8 = false;
                }
                for (AbstractC0473h abstractC0473h : arrayList3) {
                    if (abstractC0473h.f5351b != wj1Var3 || abstractC0473h.f5356g) {
                        abstractC0473h.mo1916e();
                    }
                }
                Iterator it2 = arrayList3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z9 = true;
                        break;
                    }
                    AbstractC0473h abstractC0473h2 = (AbstractC0473h) it2.next();
                    if (z8 || abstractC0473h2.f5351b != wj1Var3) {
                        if (!abstractC0473h2.f5357h.f5341j || ((!abstractC0473h2.f5358i.f5341j && !(abstractC0473h2 instanceof hq3)) || (!abstractC0473h2.f5354e.f5341j && !(abstractC0473h2 instanceof mp0) && !(abstractC0473h2 instanceof hq3)))) {
                            z9 = false;
                            break;
                        }
                    }
                }
                wj1Var3.m23311N(constraintWidget$DimensionBehaviourM23321k);
                wj1Var3.m23312O(constraintWidget$DimensionBehaviourM23321k2);
                zM24006U = z9;
                i6 = 2;
                i11 = 1073741824;
            } else {
                z2 = z13;
                ij1Var = ij1Var5;
                wj1 wj1Var4 = (wj1) sb2Var.f60614d;
                if (sb2Var.f60612b) {
                    for (vj1 vj1Var3 : wj1Var4.f66917t0) {
                        vj1Var3.m23320i();
                        vj1Var3.f65458a = false;
                        C0470e c0470e2 = vj1Var3.f65464d;
                        c0470e2.f5354e.f5341j = false;
                        c0470e2.f5356g = false;
                        c0470e2.m1921n();
                        C0472g c0472g2 = vj1Var3.f65466e;
                        c0472g2.f5354e.f5341j = false;
                        c0472g2.f5356g = false;
                        c0472g2.m1922m();
                    }
                    i10 = 0;
                    wj1Var4.m23320i();
                    wj1Var4.f65458a = false;
                    C0470e c0470e3 = wj1Var4.f65464d;
                    c0470e3.f5354e.f5341j = false;
                    c0470e3.f5356g = false;
                    c0470e3.m1921n();
                    C0472g c0472g3 = wj1Var4.f65466e;
                    c0472g3.f5354e.f5341j = false;
                    c0472g3.f5356g = false;
                    c0472g3.m1922m();
                    sb2Var.m21196d();
                } else {
                    i10 = 0;
                }
                sb2Var.m21195c((wj1) sb2Var.f60615e);
                wj1Var4.f65457Z = i10;
                wj1Var4.f65459a0 = i10;
                wj1Var4.f65464d.f5357h.mo1914d(i10);
                wj1Var4.f65466e.f5357h.mo1914d(i10);
                i11 = 1073741824;
                if (mode == 1073741824) {
                    zM24006U = wj1Var.m24006U(i10, zM18270o);
                    i6 = 1;
                } else {
                    i6 = 0;
                    zM24006U = true;
                }
                if (mode2 == 1073741824) {
                    zM24006U &= wj1Var.m24006U(1, zM18270o);
                    i6++;
                }
            }
            if (zM24006U) {
                wj1Var.mo23314Q(mode == i11, mode2 == i11);
            }
        } else {
            z2 = z13;
            ij1Var = ij1Var5;
            i6 = 0;
            zM24006U = false;
        }
        if (zM24006U && i6 == 2) {
            return;
        }
        int i25 = wj1Var.f66908G0;
        if (i5 > 0) {
            int size4 = wj1Var.f66917t0.size();
            boolean zM24008X = wj1Var.m24008X(64);
            ij1 ij1Var6 = wj1Var.f66921x0;
            int i26 = 0;
            while (i26 < size4) {
                vj1 vj1Var4 = (vj1) wj1Var.f66917t0.get(i26);
                if ((vj1Var4 instanceof gq3) || (vj1Var4 instanceof l80) || vj1Var4.f65437F || (zM24008X && (c0470e = vj1Var4.f65464d) != null && (c0472g = vj1Var4.f65466e) != null && c0470e.f5354e.f5341j && c0472g.f5354e.f5341j)) {
                    i9 = size4;
                } else {
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviourM23321k3 = vj1Var4.m23321k(0);
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviourM23321k4 = vj1Var4.m23321k(1);
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour10 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                    i9 = size4;
                    boolean z14 = constraintWidget$DimensionBehaviourM23321k3 == constraintWidget$DimensionBehaviour10 && vj1Var4.f65492r != 1 && constraintWidget$DimensionBehaviourM23321k4 == constraintWidget$DimensionBehaviour10 && vj1Var4.f65494s != 1;
                    if (!z14 && wj1Var.m24008X(1) && !(vj1Var4 instanceof ewa)) {
                        if (constraintWidget$DimensionBehaviourM23321k3 == constraintWidget$DimensionBehaviour10 && vj1Var4.f65492r == 0 && constraintWidget$DimensionBehaviourM23321k4 != constraintWidget$DimensionBehaviour10 && !vj1Var4.m23333y()) {
                            z14 = true;
                        }
                        if (constraintWidget$DimensionBehaviourM23321k4 == constraintWidget$DimensionBehaviour10 && vj1Var4.f65494s == 0 && constraintWidget$DimensionBehaviourM23321k3 != constraintWidget$DimensionBehaviour10 && !vj1Var4.m23333y()) {
                            z14 = true;
                        }
                        if ((constraintWidget$DimensionBehaviourM23321k3 == constraintWidget$DimensionBehaviour10 || constraintWidget$DimensionBehaviourM23321k4 == constraintWidget$DimensionBehaviour10) && vj1Var4.f65455X > 0.0f) {
                            z14 = true;
                        }
                    }
                    if (!z14) {
                        c3309ls.m16488F(0, ij1Var6, vj1Var4);
                    }
                }
                i26++;
                size4 = i9;
            }
            ConstraintLayout constraintLayout = ij1Var6.f44173a;
            int childCount2 = constraintLayout.getChildCount();
            ArrayList arrayList4 = constraintLayout.f5450b;
            for (int i27 = 0; i27 < childCount2; i27++) {
                constraintLayout.getChildAt(i27);
            }
            int size5 = arrayList4.size();
            if (size5 > 0) {
                for (int i28 = 0; i28 < size5; i28++) {
                    ((ej1) arrayList4.get(i28)).getClass();
                }
            }
        }
        c3309ls.m16503W(wj1Var);
        int size6 = arrayList2.size();
        if (i5 > 0) {
            c3309ls.m16502V(wj1Var, 0, iM23326r2, iM23322l);
        }
        if (size6 > 0) {
            ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr2 = wj1Var.f65451T;
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour11 = constraintWidget$DimensionBehaviourArr2[0];
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour12 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
            boolean z15 = constraintWidget$DimensionBehaviour11 == constraintWidget$DimensionBehaviour12;
            boolean z16 = constraintWidget$DimensionBehaviourArr2[1] == constraintWidget$DimensionBehaviour12;
            int iMax7 = Math.max(wj1Var.m23326r(), wj1Var2.f65463c0);
            int iMax8 = Math.max(wj1Var.m23322l(), wj1Var2.f65465d0);
            int i29 = 0;
            boolean z17 = false;
            while (i29 < size6) {
                vj1 vj1Var5 = (vj1) arrayList2.get(i29);
                if (vj1Var5 instanceof ewa) {
                    int iM23326r4 = vj1Var5.m23326r();
                    int iM23322l3 = vj1Var5.m23322l();
                    z4 = z16;
                    z5 = z15;
                    ij1Var3 = ij1Var;
                    boolean zM16488F = z17 | c3309ls.m16488F(1, ij1Var3, vj1Var5);
                    int iM23326r5 = vj1Var5.m23326r();
                    int iM23322l4 = vj1Var5.m23322l();
                    if (iM23326r5 != iM23326r4) {
                        vj1Var5.m23313P(iM23326r5);
                        if (z5 && vj1Var5.m23327s() + vj1Var5.f65453V > iMax7) {
                            iMax7 = Math.max(iMax7, vj1Var5.mo12819j(ConstraintAnchor$Type.RIGHT).m3761e() + vj1Var5.m23327s() + vj1Var5.f65453V);
                        }
                        i8 = iMax7;
                        z6 = true;
                    } else {
                        i8 = iMax7;
                        z6 = zM16488F;
                    }
                    if (iM23322l4 != iM23322l3) {
                        vj1Var5.m23310M(iM23322l4);
                        if (z4 && vj1Var5.m23328t() + vj1Var5.f65454W > iMax8) {
                            iMax8 = Math.max(iMax8, vj1Var5.mo12819j(ConstraintAnchor$Type.BOTTOM).m3761e() + vj1Var5.m23328t() + vj1Var5.f65454W);
                        }
                        z6 = true;
                    }
                    boolean z18 = ((ewa) vj1Var5).f38000B0 | z6;
                    iMax7 = i8;
                    z17 = z18;
                } else {
                    z4 = z16;
                    z5 = z15;
                    ij1Var3 = ij1Var;
                }
                i29++;
                z15 = z5;
                ij1Var = ij1Var3;
                z16 = z4;
            }
            boolean z19 = z16;
            boolean z20 = z15;
            int i30 = 0;
            while (true) {
                ij1 ij1Var7 = ij1Var;
                if (i30 >= 2) {
                    break;
                }
                int i31 = 0;
                while (i31 < size6) {
                    vj1 vj1Var6 = (vj1) arrayList2.get(i31);
                    if (((vj1Var6 instanceof os3) && !(vj1Var6 instanceof ewa)) || (vj1Var6 instanceof gq3) || vj1Var6.f65473h0 == 8 || ((z2 && vj1Var6.f65464d.f5354e.f5341j && vj1Var6.f65466e.f5354e.f5341j) || (vj1Var6 instanceof ewa))) {
                        i7 = size6;
                        ij1Var2 = ij1Var7;
                        arrayList = arrayList2;
                    } else {
                        int iM23326r6 = vj1Var6.m23326r();
                        int iM23322l5 = vj1Var6.m23322l();
                        i7 = size6;
                        int i32 = vj1Var6.f65461b0;
                        arrayList = arrayList2;
                        boolean zM16488F2 = c3309ls.m16488F(i30 == 1 ? 2 : 1, ij1Var7, vj1Var6) | z17;
                        int iM23326r7 = vj1Var6.m23326r();
                        ij1Var2 = ij1Var7;
                        int iM23322l6 = vj1Var6.m23322l();
                        if (iM23326r7 != iM23326r6) {
                            vj1Var6.m23313P(iM23326r7);
                            if (z20 && vj1Var6.m23327s() + vj1Var6.f65453V > iMax7) {
                                iMax7 = Math.max(iMax7, vj1Var6.mo12819j(ConstraintAnchor$Type.RIGHT).m3761e() + vj1Var6.m23327s() + vj1Var6.f65453V);
                            }
                            zM16488F2 = true;
                        }
                        if (iM23322l6 != iM23322l5) {
                            vj1Var6.m23310M(iM23322l6);
                            if (z19 && vj1Var6.m23328t() + vj1Var6.f65454W > iMax8) {
                                iMax8 = Math.max(iMax8, vj1Var6.mo12819j(ConstraintAnchor$Type.BOTTOM).m3761e() + vj1Var6.m23328t() + vj1Var6.f65454W);
                            }
                            z3 = true;
                        } else {
                            z3 = zM16488F2;
                        }
                        z17 = (!vj1Var6.f65436E || i32 == vj1Var6.f65461b0) ? z3 : true;
                    }
                    i31++;
                    size6 = i7;
                    arrayList2 = arrayList;
                    ij1Var7 = ij1Var2;
                }
                int i33 = size6;
                ij1Var = ij1Var7;
                ArrayList arrayList5 = arrayList2;
                if (!z17) {
                    break;
                }
                i30++;
                c3309ls.m16502V(wj1Var, i30, iM23326r2, iM23322l);
                size6 = i33;
                arrayList2 = arrayList5;
                z17 = false;
            }
        }
        wj1Var.f66908G0 = i25;
        gd5.f40570q = wj1Var.m24008X(512);
    }

    /* JADX INFO: renamed from: n */
    public final void m1971n(vj1 vj1Var, hj1 hj1Var, SparseArray sparseArray, int i, ConstraintAnchor$Type constraintAnchor$Type) {
        View view = (View) this.f5449a.get(i);
        vj1 vj1Var2 = (vj1) sparseArray.get(i);
        if (vj1Var2 == null || view == null || !(view.getLayoutParams() instanceof hj1)) {
            return;
        }
        hj1Var.f42447c0 = true;
        ConstraintAnchor$Type constraintAnchor$Type2 = ConstraintAnchor$Type.BASELINE;
        if (constraintAnchor$Type == constraintAnchor$Type2) {
            hj1 hj1Var2 = (hj1) view.getLayoutParams();
            hj1Var2.f42447c0 = true;
            hj1Var2.f42473p0.f65436E = true;
        }
        vj1Var.mo12819j(constraintAnchor$Type2).m3758b(vj1Var2.mo12819j(constraintAnchor$Type), hj1Var.f42419D, hj1Var.f42418C, true);
        vj1Var.f65436E = true;
        vj1Var.mo12819j(ConstraintAnchor$Type.TOP).m3766j();
        vj1Var.mo12819j(ConstraintAnchor$Type.BOTTOM).m3766j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            hj1 hj1Var = (hj1) childAt.getLayoutParams();
            vj1 vj1Var = hj1Var.f42473p0;
            if (childAt.getVisibility() != 8 || hj1Var.f42449d0 || hj1Var.f42451e0 || zIsInEditMode) {
                int iM23327s = vj1Var.m23327s();
                int iM23328t = vj1Var.m23328t();
                childAt.layout(iM23327s, iM23328t, vj1Var.m23326r() + iM23327s, vj1Var.m23322l() + iM23328t);
            }
        }
        ArrayList arrayList = this.f5450b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((ej1) arrayList.get(i6)).getClass();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        String str;
        int iM11170f;
        vj1 vj1Var;
        boolean z2 = this.f5456h;
        this.f5456h = z2;
        if (!z2) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                if (getChildAt(i3).isLayoutRequested()) {
                    this.f5456h = true;
                    break;
                }
            }
        }
        boolean zM1968j = m1968j();
        wj1 wj1Var = this.f5451c;
        wj1Var.f66922y0 = zM1968j;
        if (this.f5456h) {
            this.f5456h = false;
            int childCount2 = getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 >= childCount2) {
                    z = false;
                    break;
                } else {
                    if (getChildAt(i4).isLayoutRequested()) {
                        z = true;
                        break;
                    }
                    i4++;
                }
            }
            if (z) {
                boolean zIsInEditMode = isInEditMode();
                int childCount3 = getChildCount();
                for (int i5 = 0; i5 < childCount3; i5++) {
                    vj1 vj1VarM1966b = m1966b(getChildAt(i5));
                    if (vj1VarM1966b != null) {
                        vj1VarM1966b.mo23303D();
                    }
                }
                Object obj = null;
                SparseArray sparseArray = this.f5449a;
                if (zIsInEditMode) {
                    for (int i6 = 0; i6 < childCount3; i6++) {
                        View childAt = getChildAt(i6);
                        try {
                            String resourceName = getResources().getResourceName(childAt.getId());
                            Integer numValueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                if (this.f5446H == null) {
                                    this.f5446H = new HashMap();
                                }
                                int iIndexOf = resourceName.indexOf("/");
                                this.f5446H.put(iIndexOf != -1 ? resourceName.substring(iIndexOf + 1) : resourceName, numValueOf);
                            }
                            int iIndexOf2 = resourceName.indexOf(47);
                            if (iIndexOf2 != -1) {
                                resourceName = resourceName.substring(iIndexOf2 + 1);
                            }
                            int id = childAt.getId();
                            if (id != 0) {
                                View viewFindViewById = (View) sparseArray.get(id);
                                if (viewFindViewById == null && (viewFindViewById = findViewById(id)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
                                    onViewAdded(viewFindViewById);
                                }
                                vj1Var = viewFindViewById == this ? wj1Var : viewFindViewById == null ? null : ((hj1) viewFindViewById.getLayoutParams()).f42473p0;
                            }
                            vj1Var.f65477j0 = resourceName;
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                }
                if (this.f5460l != -1) {
                    for (int i7 = 0; i7 < childCount3; i7++) {
                        getChildAt(i7).getId();
                    }
                }
                sj1 sj1Var = this.f5458j;
                if (sj1Var != null) {
                    sj1Var.m21409c(this);
                }
                wj1Var.f66917t0.clear();
                ArrayList arrayList = this.f5450b;
                int size = arrayList.size();
                if (size > 0) {
                    int i8 = 0;
                    while (i8 < size) {
                        ej1 ej1Var = (ej1) arrayList.get(i8);
                        HashMap map = ej1Var.f37324g;
                        if (ej1Var.isInEditMode()) {
                            ej1Var.setIds(ej1Var.f37322e);
                        }
                        os3 os3Var = ej1Var.f37321d;
                        if (os3Var != null) {
                            os3Var.f54931u0 = 0;
                            Arrays.fill(os3Var.f54930t0, obj);
                            for (int i9 = 0; i9 < ej1Var.f37319b; i9++) {
                                int i10 = ej1Var.f37318a[i9];
                                View view = (View) sparseArray.get(i10);
                                if (view == null && (iM11170f = ej1Var.m11170f(this, (str = (String) map.get(Integer.valueOf(i10))))) != 0) {
                                    ej1Var.f37318a[i9] = iM11170f;
                                    map.put(Integer.valueOf(iM11170f), str);
                                    view = (View) sparseArray.get(iM11170f);
                                }
                                if (view != null) {
                                    ej1Var.f37321d.m18460S(m1966b(view));
                                }
                            }
                            ej1Var.f37321d.mo11369U();
                        }
                        i8++;
                        obj = null;
                    }
                }
                for (int i11 = 0; i11 < childCount3; i11++) {
                    getChildAt(i11);
                }
                SparseArray sparseArray2 = this.f5447I;
                sparseArray2.clear();
                sparseArray2.put(0, wj1Var);
                sparseArray2.put(getId(), wj1Var);
                for (int i12 = 0; i12 < childCount3; i12++) {
                    View childAt2 = getChildAt(i12);
                    sparseArray2.put(childAt2.getId(), m1966b(childAt2));
                }
                for (int i13 = 0; i13 < childCount3; i13++) {
                    View childAt3 = getChildAt(i13);
                    vj1 vj1VarM1966b2 = m1966b(childAt3);
                    if (vj1VarM1966b2 != null) {
                        hj1 hj1Var = (hj1) childAt3.getLayoutParams();
                        wj1Var.f66917t0.add(vj1VarM1966b2);
                        vj1 vj1Var2 = vj1VarM1966b2.f65452U;
                        if (vj1Var2 != null) {
                            ((wj1) vj1Var2).f66917t0.remove(vj1VarM1966b2);
                            vj1VarM1966b2.mo23303D();
                        }
                        vj1VarM1966b2.f65452U = wj1Var;
                        m1965a(zIsInEditMode, childAt3, vj1VarM1966b2, hj1Var, sparseArray2);
                    }
                }
            }
            if (z) {
                wj1Var.f66918u0.m16503W(wj1Var);
            }
        }
        wj1Var.f66923z0.getClass();
        m1970m(wj1Var, this.f5457i, i, i2);
        m1969l(i, i2, wj1Var.m23326r(), wj1Var.m23322l(), wj1Var.f66909H0, wj1Var.f66910I0);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        vj1 vj1VarM1966b = m1966b(view);
        if ((view instanceof Guideline) && !(vj1VarM1966b instanceof gq3)) {
            hj1 hj1Var = (hj1) view.getLayoutParams();
            gq3 gq3Var = new gq3();
            hj1Var.f42473p0 = gq3Var;
            hj1Var.f42449d0 = true;
            gq3Var.m12817T(hj1Var.f42437V);
        }
        if (view instanceof ej1) {
            ej1 ej1Var = (ej1) view;
            ej1Var.m11172k();
            ((hj1) view.getLayoutParams()).f42451e0 = true;
            ArrayList arrayList = this.f5450b;
            if (!arrayList.contains(ej1Var)) {
                arrayList.add(ej1Var);
            }
        }
        this.f5449a.put(view.getId(), view);
        this.f5456h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f5449a.remove(view.getId());
        vj1 vj1VarM1966b = m1966b(view);
        this.f5451c.f66917t0.remove(vj1VarM1966b);
        vj1VarM1966b.mo23303D();
        this.f5450b.remove(view);
        this.f5456h = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f5456h = true;
        super.requestLayout();
    }

    public void setConstraintSet(sj1 sj1Var) {
        this.f5458j = sj1Var;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f5449a;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f5455g) {
            return;
        }
        this.f5455g = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f5454f) {
            return;
        }
        this.f5454f = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f5453e) {
            return;
        }
        this.f5453e = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f5452d) {
            return;
        }
        this.f5452d = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(ck1 ck1Var) {
        lj1 lj1Var = this.f5459k;
        if (lj1Var != null) {
            lj1Var.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f5457i = i;
        wj1 wj1Var = this.f5451c;
        wj1Var.f66908G0 = i;
        gd5.f40570q = wj1Var.m24008X(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5449a = new SparseArray();
        this.f5450b = new ArrayList(4);
        this.f5451c = new wj1();
        this.f5452d = 0;
        this.f5453e = 0;
        this.f5454f = Integer.MAX_VALUE;
        this.f5455g = Integer.MAX_VALUE;
        this.f5456h = true;
        this.f5457i = 257;
        this.f5458j = null;
        this.f5459k = null;
        this.f5460l = -1;
        this.f5446H = new HashMap();
        this.f5447I = new SparseArray();
        this.f5448J = new ij1(this, this);
        m1967i(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5449a = new SparseArray();
        this.f5450b = new ArrayList(4);
        this.f5451c = new wj1();
        this.f5452d = 0;
        this.f5453e = 0;
        this.f5454f = Integer.MAX_VALUE;
        this.f5455g = Integer.MAX_VALUE;
        this.f5456h = true;
        this.f5457i = 257;
        this.f5458j = null;
        this.f5459k = null;
        this.f5460l = -1;
        this.f5446H = new HashMap();
        this.f5447I = new SparseArray();
        this.f5448J = new ij1(this, this);
        m1967i(attributeSet, i, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f5449a = new SparseArray();
        this.f5450b = new ArrayList(4);
        this.f5451c = new wj1();
        this.f5452d = 0;
        this.f5453e = 0;
        this.f5454f = Integer.MAX_VALUE;
        this.f5455g = Integer.MAX_VALUE;
        this.f5456h = true;
        this.f5457i = 257;
        this.f5458j = null;
        this.f5459k = null;
        this.f5460l = -1;
        this.f5446H = new HashMap();
        this.f5447I = new SparseArray();
        this.f5448J = new ij1(this, this);
        m1967i(attributeSet, i, i2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        hj1 hj1Var = new hj1(layoutParams);
        hj1Var.f42442a = -1;
        hj1Var.f42444b = -1;
        hj1Var.f42446c = -1.0f;
        hj1Var.f42448d = true;
        hj1Var.f42450e = -1;
        hj1Var.f42452f = -1;
        hj1Var.f42454g = -1;
        hj1Var.f42456h = -1;
        hj1Var.f42458i = -1;
        hj1Var.f42460j = -1;
        hj1Var.f42462k = -1;
        hj1Var.f42464l = -1;
        hj1Var.f42466m = -1;
        hj1Var.f42468n = -1;
        hj1Var.f42470o = -1;
        hj1Var.f42472p = -1;
        hj1Var.f42474q = 0;
        hj1Var.f42475r = 0.0f;
        hj1Var.f42476s = -1;
        hj1Var.f42477t = -1;
        hj1Var.f42478u = -1;
        hj1Var.f42479v = -1;
        hj1Var.f42480w = Integer.MIN_VALUE;
        hj1Var.f42481x = Integer.MIN_VALUE;
        hj1Var.f42482y = Integer.MIN_VALUE;
        hj1Var.f42483z = Integer.MIN_VALUE;
        hj1Var.f42416A = Integer.MIN_VALUE;
        hj1Var.f42417B = Integer.MIN_VALUE;
        hj1Var.f42418C = Integer.MIN_VALUE;
        hj1Var.f42419D = 0;
        hj1Var.f42420E = 0.5f;
        hj1Var.f42421F = 0.5f;
        hj1Var.f42422G = null;
        hj1Var.f42423H = -1.0f;
        hj1Var.f42424I = -1.0f;
        hj1Var.f42425J = 0;
        hj1Var.f42426K = 0;
        hj1Var.f42427L = 0;
        hj1Var.f42428M = 0;
        hj1Var.f42429N = 0;
        hj1Var.f42430O = 0;
        hj1Var.f42431P = 0;
        hj1Var.f42432Q = 0;
        hj1Var.f42433R = 1.0f;
        hj1Var.f42434S = 1.0f;
        hj1Var.f42435T = -1;
        hj1Var.f42436U = -1;
        hj1Var.f42437V = -1;
        hj1Var.f42438W = false;
        hj1Var.f42439X = false;
        hj1Var.f42440Y = null;
        hj1Var.f42441Z = 0;
        hj1Var.f42443a0 = true;
        hj1Var.f42445b0 = true;
        hj1Var.f42447c0 = false;
        hj1Var.f42449d0 = false;
        hj1Var.f42451e0 = false;
        hj1Var.f42453f0 = -1;
        hj1Var.f42455g0 = -1;
        hj1Var.f42457h0 = -1;
        hj1Var.f42459i0 = -1;
        hj1Var.f42461j0 = Integer.MIN_VALUE;
        hj1Var.f42463k0 = Integer.MIN_VALUE;
        hj1Var.f42465l0 = 0.5f;
        hj1Var.f42473p0 = new vj1();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) hj1Var).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) hj1Var).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) hj1Var).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) hj1Var).bottomMargin = marginLayoutParams.bottomMargin;
            hj1Var.setMarginStart(marginLayoutParams.getMarginStart());
            hj1Var.setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (!(layoutParams instanceof hj1)) {
            return hj1Var;
        }
        hj1 hj1Var2 = (hj1) layoutParams;
        hj1Var.f42442a = hj1Var2.f42442a;
        hj1Var.f42444b = hj1Var2.f42444b;
        hj1Var.f42446c = hj1Var2.f42446c;
        hj1Var.f42448d = hj1Var2.f42448d;
        hj1Var.f42450e = hj1Var2.f42450e;
        hj1Var.f42452f = hj1Var2.f42452f;
        hj1Var.f42454g = hj1Var2.f42454g;
        hj1Var.f42456h = hj1Var2.f42456h;
        hj1Var.f42458i = hj1Var2.f42458i;
        hj1Var.f42460j = hj1Var2.f42460j;
        hj1Var.f42462k = hj1Var2.f42462k;
        hj1Var.f42464l = hj1Var2.f42464l;
        hj1Var.f42466m = hj1Var2.f42466m;
        hj1Var.f42468n = hj1Var2.f42468n;
        hj1Var.f42470o = hj1Var2.f42470o;
        hj1Var.f42472p = hj1Var2.f42472p;
        hj1Var.f42474q = hj1Var2.f42474q;
        hj1Var.f42475r = hj1Var2.f42475r;
        hj1Var.f42476s = hj1Var2.f42476s;
        hj1Var.f42477t = hj1Var2.f42477t;
        hj1Var.f42478u = hj1Var2.f42478u;
        hj1Var.f42479v = hj1Var2.f42479v;
        hj1Var.f42480w = hj1Var2.f42480w;
        hj1Var.f42481x = hj1Var2.f42481x;
        hj1Var.f42482y = hj1Var2.f42482y;
        hj1Var.f42483z = hj1Var2.f42483z;
        hj1Var.f42416A = hj1Var2.f42416A;
        hj1Var.f42417B = hj1Var2.f42417B;
        hj1Var.f42418C = hj1Var2.f42418C;
        hj1Var.f42419D = hj1Var2.f42419D;
        hj1Var.f42420E = hj1Var2.f42420E;
        hj1Var.f42421F = hj1Var2.f42421F;
        hj1Var.f42422G = hj1Var2.f42422G;
        hj1Var.f42423H = hj1Var2.f42423H;
        hj1Var.f42424I = hj1Var2.f42424I;
        hj1Var.f42425J = hj1Var2.f42425J;
        hj1Var.f42426K = hj1Var2.f42426K;
        hj1Var.f42438W = hj1Var2.f42438W;
        hj1Var.f42439X = hj1Var2.f42439X;
        hj1Var.f42427L = hj1Var2.f42427L;
        hj1Var.f42428M = hj1Var2.f42428M;
        hj1Var.f42429N = hj1Var2.f42429N;
        hj1Var.f42431P = hj1Var2.f42431P;
        hj1Var.f42430O = hj1Var2.f42430O;
        hj1Var.f42432Q = hj1Var2.f42432Q;
        hj1Var.f42433R = hj1Var2.f42433R;
        hj1Var.f42434S = hj1Var2.f42434S;
        hj1Var.f42435T = hj1Var2.f42435T;
        hj1Var.f42436U = hj1Var2.f42436U;
        hj1Var.f42437V = hj1Var2.f42437V;
        hj1Var.f42443a0 = hj1Var2.f42443a0;
        hj1Var.f42445b0 = hj1Var2.f42445b0;
        hj1Var.f42447c0 = hj1Var2.f42447c0;
        hj1Var.f42449d0 = hj1Var2.f42449d0;
        hj1Var.f42453f0 = hj1Var2.f42453f0;
        hj1Var.f42455g0 = hj1Var2.f42455g0;
        hj1Var.f42457h0 = hj1Var2.f42457h0;
        hj1Var.f42459i0 = hj1Var2.f42459i0;
        hj1Var.f42461j0 = hj1Var2.f42461j0;
        hj1Var.f42463k0 = hj1Var2.f42463k0;
        hj1Var.f42465l0 = hj1Var2.f42465l0;
        hj1Var.f42440Y = hj1Var2.f42440Y;
        hj1Var.f42441Z = hj1Var2.f42441Z;
        hj1Var.f42473p0 = hj1Var2.f42473p0;
        return hj1Var;
    }
}
