package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.motion.widget.C0476c;
import androidx.constraintlayout.widget.R$styleable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class n36 {

    /* JADX INFO: renamed from: a */
    public final int f52270a;

    /* JADX INFO: renamed from: b */
    public final boolean f52271b;

    /* JADX INFO: renamed from: c */
    public int f52272c;

    /* JADX INFO: renamed from: d */
    public int f52273d;

    /* JADX INFO: renamed from: e */
    public int f52274e;

    /* JADX INFO: renamed from: f */
    public String f52275f;

    /* JADX INFO: renamed from: g */
    public int f52276g;

    /* JADX INFO: renamed from: h */
    public int f52277h;

    /* JADX INFO: renamed from: i */
    public final float f52278i;

    /* JADX INFO: renamed from: j */
    public final C0476c f52279j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f52280k;

    /* JADX INFO: renamed from: l */
    public y7a f52281l;

    /* JADX INFO: renamed from: m */
    public final ArrayList f52282m;

    /* JADX INFO: renamed from: n */
    public final int f52283n;

    /* JADX INFO: renamed from: o */
    public final boolean f52284o;

    /* JADX INFO: renamed from: p */
    public int f52285p;

    /* JADX INFO: renamed from: q */
    public final int f52286q;

    /* JADX INFO: renamed from: r */
    public final int f52287r;

    public n36(C0476c c0476c, Context context, XmlResourceParser xmlResourceParser) {
        this.f52270a = -1;
        this.f52271b = false;
        this.f52272c = -1;
        this.f52273d = -1;
        this.f52274e = 0;
        this.f52275f = null;
        this.f52276g = -1;
        this.f52277h = 400;
        this.f52278i = 0.0f;
        this.f52280k = new ArrayList();
        this.f52281l = null;
        this.f52282m = new ArrayList();
        this.f52283n = 0;
        this.f52284o = false;
        this.f52285p = -1;
        this.f52287r = 0;
        int i = c0476c.f5432j;
        SparseArray sparseArray = c0476c.f5429g;
        this.f52277h = i;
        this.f52286q = c0476c.f5433k;
        this.f52279j = c0476c;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.Transition);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == R$styleable.Transition_constraintSetEnd) {
                this.f52272c = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                String resourceTypeName = context.getResources().getResourceTypeName(this.f52272c);
                if ("layout".equals(resourceTypeName)) {
                    sj1 sj1Var = new sj1();
                    sj1Var.m21413j(context, this.f52272c);
                    sparseArray.append(this.f52272c, sj1Var);
                } else if ("xml".equals(resourceTypeName)) {
                    this.f52272c = c0476c.m1958i(context, this.f52272c);
                }
            } else if (index == R$styleable.Transition_constraintSetStart) {
                this.f52273d = typedArrayObtainStyledAttributes.getResourceId(index, this.f52273d);
                String resourceTypeName2 = context.getResources().getResourceTypeName(this.f52273d);
                if ("layout".equals(resourceTypeName2)) {
                    sj1 sj1Var2 = new sj1();
                    sj1Var2.m21413j(context, this.f52273d);
                    sparseArray.append(this.f52273d, sj1Var2);
                } else if ("xml".equals(resourceTypeName2)) {
                    this.f52273d = c0476c.m1958i(context, this.f52273d);
                }
            } else if (index == R$styleable.Transition_motionInterpolator) {
                int i3 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i3 == 1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.f52276g = resourceId;
                    if (resourceId != -1) {
                        this.f52274e = -2;
                    }
                } else if (i3 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f52275f = string;
                    if (string != null) {
                        if (string.indexOf("/") > 0) {
                            this.f52276g = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f52274e = -2;
                        } else {
                            this.f52274e = -1;
                        }
                    }
                } else {
                    this.f52274e = typedArrayObtainStyledAttributes.getInteger(index, this.f52274e);
                }
            } else if (index == R$styleable.Transition_duration) {
                int i4 = typedArrayObtainStyledAttributes.getInt(index, this.f52277h);
                this.f52277h = i4;
                if (i4 < 8) {
                    this.f52277h = 8;
                }
            } else if (index == R$styleable.Transition_staggered) {
                this.f52278i = typedArrayObtainStyledAttributes.getFloat(index, this.f52278i);
            } else if (index == R$styleable.Transition_autoTransition) {
                this.f52283n = typedArrayObtainStyledAttributes.getInteger(index, this.f52283n);
            } else if (index == R$styleable.Transition_android_id) {
                this.f52270a = typedArrayObtainStyledAttributes.getResourceId(index, this.f52270a);
            } else if (index == R$styleable.Transition_transitionDisable) {
                this.f52284o = typedArrayObtainStyledAttributes.getBoolean(index, this.f52284o);
            } else if (index == R$styleable.Transition_pathMotionArc) {
                this.f52285p = typedArrayObtainStyledAttributes.getInteger(index, -1);
            } else if (index == R$styleable.Transition_layoutDuringTransition) {
                this.f52286q = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == R$styleable.Transition_transitionFlags) {
                this.f52287r = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        if (this.f52273d == -1) {
            this.f52271b = true;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public n36(C0476c c0476c, int i, int i2) {
        this.f52270a = -1;
        this.f52271b = false;
        this.f52272c = -1;
        this.f52273d = -1;
        this.f52274e = 0;
        this.f52275f = null;
        this.f52276g = -1;
        this.f52277h = 400;
        this.f52278i = 0.0f;
        this.f52280k = new ArrayList();
        this.f52281l = null;
        this.f52282m = new ArrayList();
        this.f52283n = 0;
        this.f52284o = false;
        this.f52285p = -1;
        this.f52286q = 0;
        this.f52287r = 0;
        this.f52270a = -1;
        this.f52279j = c0476c;
        this.f52273d = i;
        this.f52272c = i2;
        this.f52277h = c0476c.f5432j;
        this.f52286q = c0476c.f5433k;
    }

    public n36(C0476c c0476c, n36 n36Var) {
        this.f52270a = -1;
        this.f52271b = false;
        this.f52272c = -1;
        this.f52273d = -1;
        this.f52274e = 0;
        this.f52275f = null;
        this.f52276g = -1;
        this.f52277h = 400;
        this.f52278i = 0.0f;
        this.f52280k = new ArrayList();
        this.f52281l = null;
        this.f52282m = new ArrayList();
        this.f52283n = 0;
        this.f52284o = false;
        this.f52285p = -1;
        this.f52286q = 0;
        this.f52287r = 0;
        this.f52279j = c0476c;
        this.f52277h = c0476c.f5432j;
        if (n36Var != null) {
            this.f52285p = n36Var.f52285p;
            this.f52274e = n36Var.f52274e;
            this.f52275f = n36Var.f52275f;
            this.f52276g = n36Var.f52276g;
            this.f52277h = n36Var.f52277h;
            this.f52280k = n36Var.f52280k;
            this.f52278i = n36Var.f52278i;
            this.f52286q = n36Var.f52286q;
        }
    }
}
