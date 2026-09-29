package p406u4;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.linguist.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import p080e.C5288t;
import p286o2.C7911k;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: renamed from: u4.h */
/* JADX INFO: loaded from: classes.dex */
public final class C9412h extends AbstractC9409f0 {

    /* JADX INFO: renamed from: b0 */
    public static final String[] f48311b0 = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};

    /* JADX INFO: renamed from: c0 */
    public static final a f48312c0 = new a();

    /* JADX INFO: renamed from: d0 */
    public static final b f48313d0 = new b();

    /* JADX INFO: renamed from: e0 */
    public static final boolean f48314e0 = true;

    /* JADX INFO: renamed from: Y */
    public final boolean f48315Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f48316Z;

    /* JADX INFO: renamed from: a0 */
    public final Matrix f48317a0;

    /* JADX INFO: renamed from: u4.h$a */
    public class a extends Property<d, float[]> {
        public a() {
            super(float[].class, "nonTranslations");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ float[] get(d dVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(d dVar, float[] fArr) {
            d dVar2 = dVar;
            float[] fArr2 = fArr;
            dVar2.getClass();
            System.arraycopy(fArr2, 0, dVar2.f48322c, 0, fArr2.length);
            dVar2.m17813a();
        }
    }

    /* JADX INFO: renamed from: u4.h$b */
    public class b extends Property<d, PointF> {
        public b() {
            super(PointF.class, "translations");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(d dVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(d dVar, PointF pointF) {
            d dVar2 = dVar;
            PointF pointF2 = pointF;
            dVar2.getClass();
            dVar2.f48323d = pointF2.x;
            dVar2.f48324e = pointF2.y;
            dVar2.m17813a();
        }
    }

    /* JADX INFO: renamed from: u4.h$c */
    public static class c extends C9417j0 {

        /* JADX INFO: renamed from: a */
        public final View f48318a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC9436t f48319b;

        public c(View view, InterfaceC9436t interfaceC9436t) {
            this.f48318a = view;
            this.f48319b = interfaceC9436t;
        }

        @Override // p406u4.C9417j0, p406u4.AbstractC9409f0.e
        /* JADX INFO: renamed from: a */
        public final void mo17765a() {
            this.f48319b.setVisibility(4);
        }

        @Override // p406u4.C9417j0, p406u4.AbstractC9409f0.e
        /* JADX INFO: renamed from: d */
        public final void mo17767d() {
            this.f48319b.setVisibility(0);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p406u4.AbstractC9409f0.e
        /* JADX INFO: renamed from: e */
        public final void mo17768e(AbstractC9409f0 abstractC9409f0) {
            abstractC9409f0.mo17779F(this);
            int i10 = Build.VERSION.SDK_INT;
            View view = this.f48318a;
            if (i10 == 28) {
                if (!C5288t.f33501h) {
                    try {
                        if (!C5288t.f33497d) {
                            try {
                                C5288t.f33496c = Class.forName("android.view.GhostView");
                            } catch (ClassNotFoundException e10) {
                                Log.i("GhostViewApi21", "Failed to retrieve GhostView class", e10);
                            }
                            C5288t.f33497d = true;
                        }
                        Method declaredMethod = C5288t.f33496c.getDeclaredMethod("removeGhost", View.class);
                        C5288t.f33500g = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException e11) {
                        Log.i("GhostViewApi21", "Failed to retrieve removeGhost method", e11);
                    }
                    C5288t.f33501h = true;
                }
                Method method = C5288t.f33500g;
                if (method != null) {
                    try {
                        method.invoke(null, view);
                    } catch (IllegalAccessException unused) {
                    } catch (InvocationTargetException e12) {
                        throw new RuntimeException(e12.getCause());
                    }
                }
            } else {
                int i11 = C9440v.f48415g;
                C9440v c9440v = (C9440v) view.getTag(R.id.ghost_view);
                if (c9440v != null) {
                    int i12 = c9440v.f48419d - 1;
                    c9440v.f48419d = i12;
                    if (i12 <= 0) {
                        ((C9438u) c9440v.getParent()).removeView(c9440v);
                    }
                }
            }
            view.setTag(R.id.transition_transform, null);
            view.setTag(R.id.parent_matrix, null);
        }
    }

    /* JADX INFO: renamed from: u4.h$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public final Matrix f48320a = new Matrix();

        /* JADX INFO: renamed from: b */
        public final View f48321b;

        /* JADX INFO: renamed from: c */
        public final float[] f48322c;

        /* JADX INFO: renamed from: d */
        public float f48323d;

        /* JADX INFO: renamed from: e */
        public float f48324e;

        public d(View view, float[] fArr) {
            this.f48321b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f48322c = fArr2;
            this.f48323d = fArr2[2];
            this.f48324e = fArr2[5];
            m17813a();
        }

        /* JADX INFO: renamed from: a */
        public final void m17813a() {
            float f3 = this.f48323d;
            float[] fArr = this.f48322c;
            fArr[2] = f3;
            fArr[5] = this.f48324e;
            Matrix matrix = this.f48320a;
            matrix.setValues(fArr);
            C9433r0.f48403a.mo17835G(this.f48321b, matrix);
        }
    }

    /* JADX INFO: renamed from: u4.h$e */
    public static class e {

        /* JADX INFO: renamed from: a */
        public final float f48325a;

        /* JADX INFO: renamed from: b */
        public final float f48326b;

        /* JADX INFO: renamed from: c */
        public final float f48327c;

        /* JADX INFO: renamed from: d */
        public final float f48328d;

        /* JADX INFO: renamed from: e */
        public final float f48329e;

        /* JADX INFO: renamed from: f */
        public final float f48330f;

        /* JADX INFO: renamed from: g */
        public final float f48331g;

        /* JADX INFO: renamed from: h */
        public final float f48332h;

        public e(View view) {
            this.f48325a = view.getTranslationX();
            this.f48326b = view.getTranslationY();
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            this.f48327c = C10029b0.i.m18718l(view);
            this.f48328d = view.getScaleX();
            this.f48329e = view.getScaleY();
            this.f48330f = view.getRotationX();
            this.f48331g = view.getRotationY();
            this.f48332h = view.getRotation();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return eVar.f48325a == this.f48325a && eVar.f48326b == this.f48326b && eVar.f48327c == this.f48327c && eVar.f48328d == this.f48328d && eVar.f48329e == this.f48329e && eVar.f48330f == this.f48330f && eVar.f48331g == this.f48331g && eVar.f48332h == this.f48332h;
        }

        public final int hashCode() {
            float f3 = this.f48325a;
            int iFloatToIntBits = (f3 != 0.0f ? Float.floatToIntBits(f3) : 0) * 31;
            float f10 = this.f48326b;
            int iFloatToIntBits2 = (iFloatToIntBits + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
            float f11 = this.f48327c;
            int iFloatToIntBits3 = (iFloatToIntBits2 + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0)) * 31;
            float f12 = this.f48328d;
            int iFloatToIntBits4 = (iFloatToIntBits3 + (f12 != 0.0f ? Float.floatToIntBits(f12) : 0)) * 31;
            float f13 = this.f48329e;
            int iFloatToIntBits5 = (iFloatToIntBits4 + (f13 != 0.0f ? Float.floatToIntBits(f13) : 0)) * 31;
            float f14 = this.f48330f;
            int iFloatToIntBits6 = (iFloatToIntBits5 + (f14 != 0.0f ? Float.floatToIntBits(f14) : 0)) * 31;
            float f15 = this.f48331g;
            int iFloatToIntBits7 = (iFloatToIntBits6 + (f15 != 0.0f ? Float.floatToIntBits(f15) : 0)) * 31;
            float f16 = this.f48332h;
            return iFloatToIntBits7 + (f16 != 0.0f ? Float.floatToIntBits(f16) : 0);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public C9412h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48315Y = true;
        this.f48316Z = true;
        this.f48317a0 = new Matrix();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9407e0.f48265f);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.f48315Y = C7911k.m15684b(typedArrayObtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.f48316Z = C7911k.m15684b(typedArrayObtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: S */
    public final void m17812S(C9425n0 c9425n0) {
        View view = c9425n0.f48373b;
        if (view.getVisibility() == 8) {
            return;
        }
        HashMap map = c9425n0.f48372a;
        map.put("android:changeTransform:parent", view.getParent());
        map.put("android:changeTransform:transforms", new e(view));
        Matrix matrix = view.getMatrix();
        map.put("android:changeTransform:matrix", (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
        if (this.f48316Z) {
            Matrix matrix2 = new Matrix();
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            C9433r0.f48403a.mo17836H(viewGroup, matrix2);
            matrix2.preTranslate(-viewGroup.getScrollX(), -viewGroup.getScrollY());
            map.put("android:changeTransform:parentMatrix", matrix2);
            map.put("android:changeTransform:intermediateMatrix", view.getTag(R.id.transition_transform));
            map.put("android:changeTransform:intermediateParentMatrix", view.getTag(R.id.parent_matrix));
        }
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: h */
    public final void mo17761h(C9425n0 c9425n0) {
        m17812S(c9425n0);
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: k */
    public final void mo17762k(C9425n0 c9425n0) {
        m17812S(c9425n0);
        if (!f48314e0) {
            View view = c9425n0.f48373b;
            ((ViewGroup) view.getParent()).startViewTransition(view);
        }
    }

    /* JADX WARN: Code duplicated, block: B:165:0x03eb A[PHI: r4 r16 r18 r19 r21 r27 r29
      0x03eb: PHI (r4v17 char) = (r4v16 char), (r4v29 char), (r4v34 char) binds: [B:163:0x03e8, B:234:0x03eb, B:123:0x0316] A[DONT_GENERATE, DONT_INLINE]
      0x03eb: PHI (r16v9 int) = (r16v8 int), (r16v14 int), (r16v15 int) binds: [B:163:0x03e8, B:234:0x03eb, B:123:0x0316] A[DONT_GENERATE, DONT_INLINE]
      0x03eb: PHI (r18v4 int) = (r18v3 int), (r18v14 int), (r18v17 int) binds: [B:163:0x03e8, B:234:0x03eb, B:123:0x0316] A[DONT_GENERATE, DONT_INLINE]
      0x03eb: PHI (r19v10 boolean) = (r19v9 boolean), (r19v15 boolean), (r19v17 boolean) binds: [B:163:0x03e8, B:234:0x03eb, B:123:0x0316] A[DONT_GENERATE, DONT_INLINE]
      0x03eb: PHI (r21v9 android.view.View) = (r21v8 android.view.View), (r21v17 android.view.View), (r21v19 android.view.View) binds: [B:163:0x03e8, B:234:0x03eb, B:123:0x0316] A[DONT_GENERATE, DONT_INLINE]
      0x03eb: PHI (r27v5 java.util.ArrayList) = (r27v4 java.util.ArrayList), (r27v6 java.util.ArrayList), (r27v6 java.util.ArrayList) binds: [B:163:0x03e8, B:234:0x03eb, B:123:0x0316] A[DONT_GENERATE, DONT_INLINE]
      0x03eb: PHI (r29v10 android.animation.Animator) = (r29v9 android.animation.Animator), (r29v12 android.animation.Animator), (r29v13 android.animation.Animator) binds: [B:163:0x03e8, B:234:0x03eb, B:123:0x0316] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:169:0x0400  */
    /* JADX WARN: Code duplicated, block: B:170:0x0406  */
    /* JADX WARN: Code duplicated, block: B:186:0x0450  */
    /* JADX WARN: Code duplicated, block: B:189:0x0463 A[LOOP:0: B:187:0x045f->B:189:0x0463, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:192:0x0471 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:193:0x0473  */
    /* JADX WARN: Code duplicated, block: B:224:0x01f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x0465 A[EDGE_INSN: B:228:0x0465->B:190:0x0465 BREAK  A[LOOP:0: B:187:0x045f->B:189:0x0463], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:27:0x0057  */
    /* JADX WARN: Code duplicated, block: B:89:0x0219  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator mo17763p(ViewGroup viewGroup, C9425n0 c9425n0, C9425n0 c9425n1) {
        boolean z10;
        View view;
        Object obj;
        ?? r13;
        Animator animator;
        Animator animator2;
        int i10;
        boolean z11;
        View view2;
        ArrayList arrayList;
        Animator animator3;
        View view3;
        int i11;
        int i12;
        char c10;
        int i13;
        int iIntValue;
        boolean z12;
        C9438u c9438u;
        InterfaceC9436t interfaceC9436t;
        AbstractC9409f0 abstractC9409f0;
        AbstractC9409f0 abstractC9409f1;
        View view4;
        char c11;
        char c12;
        Method method;
        View view5;
        C5288t c5288t;
        boolean z13;
        if (c9425n0 == null || c9425n1 == null) {
            return null;
        }
        HashMap map = c9425n0.f48372a;
        if (!map.containsKey("android:changeTransform:parent")) {
            return null;
        }
        HashMap map2 = c9425n1.f48372a;
        if (!map2.containsKey("android:changeTransform:parent")) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeTransform:parent");
        View view6 = (ViewGroup) map2.get("android:changeTransform:parent");
        if (!this.f48316Z) {
            z10 = false;
        } else if (m17777B(viewGroup2)) {
            z13 = false;
            if (z13) {
                z10 = false;
            } else {
                z10 = true;
            }
        } else {
            z13 = false;
            if (z13) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        Matrix matrix = (Matrix) map.get("android:changeTransform:intermediateMatrix");
        if (matrix != null) {
            map.put("android:changeTransform:matrix", matrix);
        }
        Matrix matrix2 = (Matrix) map.get("android:changeTransform:intermediateParentMatrix");
        if (matrix2 != null) {
            map.put("android:changeTransform:parentMatrix", matrix2);
        }
        View view7 = c9425n1.f48373b;
        if (z10) {
            Matrix matrix3 = (Matrix) map2.get("android:changeTransform:parentMatrix");
            view7.setTag(R.id.parent_matrix, matrix3);
            Matrix matrix4 = this.f48317a0;
            matrix4.reset();
            matrix3.invert(matrix4);
            Matrix matrix5 = (Matrix) map.get("android:changeTransform:matrix");
            if (matrix5 == null) {
                matrix5 = new Matrix();
                map.put("android:changeTransform:matrix", matrix5);
            }
            matrix5.postConcat((Matrix) map.get("android:changeTransform:parentMatrix"));
            matrix5.postConcat(matrix4);
        }
        Matrix matrix6 = (Matrix) map.get("android:changeTransform:matrix");
        Matrix matrix7 = (Matrix) map2.get("android:changeTransform:matrix");
        if (matrix6 == null) {
            matrix6 = C9444x.f48425a;
        }
        if (matrix7 == null) {
            matrix7 = C9444x.f48425a;
        }
        Matrix matrix8 = matrix7;
        if (matrix6.equals(matrix8)) {
            view = view7;
            animator = null;
            r13 = 1;
            obj = "android:changeTransform:parentMatrix";
        } else {
            e eVar = (e) map2.get("android:changeTransform:transforms");
            view7.setTranslationX(0.0f);
            view7.setTranslationY(0.0f);
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.i.m18729w(view7, 0.0f);
            view7.setScaleX(1.0f);
            view7.setScaleY(1.0f);
            view7.setRotationX(0.0f);
            view7.setRotationY(0.0f);
            view7.setRotation(0.0f);
            float[] fArr = new float[9];
            matrix6.getValues(fArr);
            float[] fArr2 = new float[9];
            matrix8.getValues(fArr2);
            d dVar = new d(view7, fArr);
            view = view7;
            Animator animatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(dVar, PropertyValuesHolder.ofObject(f48312c0, new C9424n(new float[9]), fArr, fArr2), PropertyValuesHolder.ofObject(f48313d0, (TypeConverter) null, this.f48290U.mo17757a(fArr[2], fArr[5], fArr2[2], fArr2[5])));
            obj = "android:changeTransform:parentMatrix";
            r13 = 1;
            C9414i c9414i = new C9414i(this, z10, matrix8, view, eVar, dVar);
            animatorOfPropertyValuesHolder.addListener(c9414i);
            animatorOfPropertyValuesHolder.addPauseListener(c9414i);
            animator = animatorOfPropertyValuesHolder;
        }
        boolean z14 = f48314e0;
        View view8 = c9425n0.f48373b;
        if (z10 && animator != null && this.f48315Y) {
            Matrix matrix9 = new Matrix((Matrix) map2.get(obj));
            C9433r0.f48403a.mo17837I(viewGroup, matrix9);
            if (Build.VERSION.SDK_INT == 28) {
                if (C5288t.f33499f) {
                    c11 = 2;
                    c12 = 0;
                } else {
                    try {
                        if (!C5288t.f33497d) {
                            try {
                                C5288t.f33496c = Class.forName("android.view.GhostView");
                            } catch (ClassNotFoundException e10) {
                                Log.i("GhostViewApi21", "Failed to retrieve GhostView class", e10);
                            }
                            C5288t.f33497d = r13;
                        }
                        Class cls = C5288t.f33496c;
                        Class<?>[] clsArr = new Class[3];
                        c12 = 0;
                        try {
                            clsArr[0] = View.class;
                            clsArr[r13] = ViewGroup.class;
                            c11 = 2;
                            try {
                                clsArr[2] = Matrix.class;
                                Method declaredMethod = cls.getDeclaredMethod("addGhost", clsArr);
                                C5288t.f33498e = declaredMethod;
                                declaredMethod.setAccessible(r13);
                            } catch (NoSuchMethodException e11) {
                                e = e11;
                                Log.i("GhostViewApi21", "Failed to retrieve addGhost method", e);
                            }
                        } catch (NoSuchMethodException e12) {
                            e = e12;
                            c11 = 2;
                        }
                    } catch (NoSuchMethodException e13) {
                        e = e13;
                        c11 = 2;
                        c12 = 0;
                        Log.i("GhostViewApi21", "Failed to retrieve addGhost method", e);
                        C5288t.f33499f = r13;
                        method = C5288t.f33498e;
                        if (method != null) {
                            try {
                                try {
                                    Object[] objArr = new Object[3];
                                    view5 = view;
                                    try {
                                        objArr[c12] = view5;
                                        objArr[r13] = viewGroup;
                                        objArr[c11] = matrix9;
                                        c5288t = new C5288t(4, (View) method.invoke(null, objArr));
                                    } catch (IllegalAccessException unused) {
                                        c5288t = null;
                                    }
                                } catch (InvocationTargetException e14) {
                                    throw new RuntimeException(e14.getCause());
                                }
                            } catch (IllegalAccessException unused2) {
                                view5 = view;
                            }
                        } else {
                            view5 = view;
                            c5288t = null;
                        }
                        z11 = z14;
                        animator2 = animator;
                        view2 = view5;
                        interfaceC9436t = c5288t;
                        if (interfaceC9436t != null) {
                            interfaceC9436t.mo11403b((ViewGroup) map.get("android:changeTransform:parent"), view8);
                            abstractC9409f0 = this;
                            while (true) {
                                abstractC9409f1 = abstractC9409f0.f48278I;
                                if (abstractC9409f1 != null) {
                                    break;
                                }
                                abstractC9409f0 = abstractC9409f1;
                            }
                            view4 = view2;
                            abstractC9409f0.mo17791b(new c(view4, interfaceC9436t));
                            if (z11) {
                                if (view8 != view4) {
                                    C9433r0.m17831b(view8, 0.0f);
                                }
                                C9433r0.m17831b(view4, 1.0f);
                            }
                        }
                        return animator2;
                    }
                    C5288t.f33499f = r13;
                }
                method = C5288t.f33498e;
                if (method != null) {
                    Object[] objArr2 = new Object[3];
                    view5 = view;
                    objArr2[c12] = view5;
                    objArr2[r13] = viewGroup;
                    objArr2[c11] = matrix9;
                    c5288t = new C5288t(4, (View) method.invoke(null, objArr2));
                } else {
                    view5 = view;
                    c5288t = null;
                }
                z11 = z14;
                animator2 = animator;
                view2 = view5;
                interfaceC9436t = c5288t;
            } else {
                View view9 = view;
                int i14 = 0;
                int i15 = C9440v.f48415g;
                if (!(view9.getParent() instanceof ViewGroup)) {
                    throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
                }
                int i16 = C9438u.f48411c;
                C9438u c9438u2 = (C9438u) viewGroup.getTag(R.id.ghost_view_holder);
                C9440v c9440v = (C9440v) view9.getTag(R.id.ghost_view);
                if (c9440v == null || (c9438u = (C9438u) c9440v.getParent()) == c9438u2) {
                    i10 = 0;
                } else {
                    i10 = c9440v.f48419d;
                    c9438u.removeView(c9440v);
                    c9440v = null;
                }
                if (c9440v == null) {
                    c9440v = new C9440v(view9);
                    c9440v.f48420e = matrix9;
                    if (c9438u2 == null) {
                        c9438u2 = new C9438u(viewGroup);
                    } else {
                        if (!c9438u2.f48413b) {
                            throw new IllegalStateException("This GhostViewHolder is detached!");
                        }
                        ViewGroup viewGroup3 = c9438u2.f48412a;
                        viewGroup3.getOverlay().remove(c9438u2);
                        viewGroup3.getOverlay().add(c9438u2);
                    }
                    C9440v.m17840a(viewGroup, c9438u2);
                    C9440v.m17840a(viewGroup, c9440v);
                    ArrayList arrayList2 = new ArrayList();
                    C9438u.m17838a(c9440v.f48418c, arrayList2);
                    ArrayList arrayList3 = new ArrayList();
                    int childCount = c9438u2.getChildCount() - r13;
                    int i17 = 0;
                    while (i17 <= childCount) {
                        int i18 = (i17 + childCount) / 2;
                        C9438u.m17838a(((C9440v) c9438u2.getChildAt(i18)).f48418c, arrayList3);
                        if (arrayList2.isEmpty() || arrayList3.isEmpty() || arrayList2.get(i14) != arrayList3.get(i14)) {
                            z14 = z14;
                            arrayList = arrayList2;
                            animator3 = animator;
                            view3 = view9;
                            i11 = i14;
                            i12 = childCount;
                            c10 = 2;
                        } else {
                            int iMin = Math.min(arrayList2.size(), arrayList3.size());
                            int i19 = 1;
                            while (true) {
                                if (i19 < iMin) {
                                    View view10 = (View) arrayList2.get(i19);
                                    arrayList = arrayList2;
                                    View view11 = (View) arrayList3.get(i19);
                                    if (view10 != view11) {
                                        ViewGroup viewGroup4 = (ViewGroup) view10.getParent();
                                        int childCount2 = viewGroup4.getChildCount();
                                        if (view10.getZ() != view11.getZ()) {
                                            z14 = z14;
                                            animator3 = animator;
                                            view3 = view9;
                                            i12 = childCount;
                                            c10 = 2;
                                            i11 = 0;
                                            if (view10.getZ() <= view11.getZ()) {
                                                i13 = i11;
                                            }
                                        } else {
                                            i12 = childCount;
                                            int i20 = 0;
                                            while (true) {
                                                if (i20 < childCount2) {
                                                    int i21 = childCount2;
                                                    animator3 = animator;
                                                    if (Build.VERSION.SDK_INT >= 29) {
                                                        z14 = z14;
                                                        iIntValue = viewGroup4.getChildDrawingOrder(i20);
                                                        view3 = view9;
                                                        c10 = 2;
                                                        i11 = 0;
                                                    } else {
                                                        if (C9431q0.f48401c) {
                                                            view3 = view9;
                                                        } else {
                                                            try {
                                                                Class[] clsArr2 = new Class[2];
                                                                Class cls2 = Integer.TYPE;
                                                                clsArr2[0] = cls2;
                                                                view3 = view9;
                                                                try {
                                                                    clsArr2[1] = cls2;
                                                                    Method declaredMethod2 = ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", clsArr2);
                                                                    C9431q0.f48400b = declaredMethod2;
                                                                    declaredMethod2.setAccessible(true);
                                                                } catch (NoSuchMethodException unused3) {
                                                                    z12 = true;
                                                                }
                                                            } catch (NoSuchMethodException unused4) {
                                                                view3 = view9;
                                                            }
                                                            z12 = true;
                                                            C9431q0.f48401c = z12;
                                                        }
                                                        Method method2 = C9431q0.f48400b;
                                                        if (method2 != null) {
                                                            c10 = 2;
                                                            try {
                                                                Object[] objArr3 = new Object[2];
                                                                i11 = 0;
                                                                try {
                                                                    objArr3[0] = Integer.valueOf(viewGroup4.getChildCount());
                                                                    objArr3[1] = Integer.valueOf(i20);
                                                                    iIntValue = ((Integer) method2.invoke(viewGroup4, objArr3)).intValue();
                                                                } catch (IllegalAccessException | InvocationTargetException unused5) {
                                                                    iIntValue = i20;
                                                                }
                                                            } catch (IllegalAccessException | InvocationTargetException unused6) {
                                                                i11 = 0;
                                                            }
                                                        } else {
                                                            c10 = 2;
                                                        }
                                                        i11 = 0;
                                                        iIntValue = i20;
                                                    }
                                                    View childAt = viewGroup4.getChildAt(iIntValue);
                                                    if (childAt == view10) {
                                                        i13 = i11;
                                                    } else if (childAt != view11) {
                                                        i20++;
                                                        childCount2 = i21;
                                                        animator = animator3;
                                                        z14 = z14;
                                                        view9 = view3;
                                                    }
                                                } else {
                                                    z14 = z14;
                                                    animator3 = animator;
                                                    view3 = view9;
                                                    c10 = 2;
                                                    i11 = 0;
                                                }
                                            }
                                        }
                                    } else {
                                        i19++;
                                        arrayList2 = arrayList;
                                        animator = animator;
                                        i14 = 0;
                                    }
                                } else {
                                    z14 = z14;
                                    arrayList = arrayList2;
                                    animator3 = animator;
                                    view3 = view9;
                                    i11 = i14;
                                    i12 = childCount;
                                    c10 = 2;
                                    if (arrayList3.size() != iMin) {
                                        i13 = i11;
                                    }
                                }
                                if (i13 != 0) {
                                    i17 = i18 + 1;
                                    childCount = i12;
                                } else {
                                    childCount = i18 - 1;
                                }
                                arrayList3.clear();
                                arrayList2 = arrayList;
                                i14 = i11;
                                z14 = z14;
                                view9 = view3;
                                animator = animator3;
                            }
                        }
                        i13 = 1;
                        if (i13 != 0) {
                            i17 = i18 + 1;
                            childCount = i12;
                        } else {
                            childCount = i18 - 1;
                        }
                        arrayList3.clear();
                        arrayList2 = arrayList;
                        i14 = i11;
                        z14 = z14;
                        view9 = view3;
                        animator = animator3;
                    }
                    z11 = z14;
                    animator2 = animator;
                    view2 = view9;
                    if (i17 < 0 || i17 >= c9438u2.getChildCount()) {
                        c9438u2.addView(c9440v);
                    } else {
                        c9438u2.addView(c9440v, i17);
                    }
                    c9440v.f48419d = i10;
                } else {
                    z11 = z14;
                    animator2 = animator;
                    view2 = view9;
                    c9440v.f48420e = matrix9;
                }
                C9440v c9440v2 = c9440v;
                c9440v2.f48419d++;
                interfaceC9436t = c9440v2;
            }
            if (interfaceC9436t != null) {
                interfaceC9436t.mo11403b((ViewGroup) map.get("android:changeTransform:parent"), view8);
                abstractC9409f0 = this;
                while (true) {
                    abstractC9409f1 = abstractC9409f0.f48278I;
                    if (abstractC9409f1 != null) {
                        break;
                        break;
                    }
                    abstractC9409f0 = abstractC9409f1;
                }
                view4 = view2;
                abstractC9409f0.mo17791b(new c(view4, interfaceC9436t));
                if (z11) {
                    if (view8 != view4) {
                        C9433r0.m17831b(view8, 0.0f);
                    }
                    C9433r0.m17831b(view4, 1.0f);
                }
            }
        } else {
            animator2 = animator;
            if (!z14) {
                viewGroup2.endViewTransition(view8);
            }
        }
        return animator2;
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: y */
    public final String[] mo17764y() {
        return f48311b0;
    }
}
