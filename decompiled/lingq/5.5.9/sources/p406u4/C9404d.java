package p406u4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.WeakHashMap;
import p286o2.C7911k;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: renamed from: u4.d */
/* JADX INFO: loaded from: classes.dex */
public final class C9404d extends AbstractC9409f0 {

    /* JADX INFO: renamed from: Z */
    public static final String[] f48224Z = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: a0 */
    public static final b f48225a0;

    /* JADX INFO: renamed from: b0 */
    public static final c f48226b0;

    /* JADX INFO: renamed from: c0 */
    public static final d f48227c0;

    /* JADX INFO: renamed from: d0 */
    public static final e f48228d0;

    /* JADX INFO: renamed from: e0 */
    public static final f f48229e0;

    /* JADX INFO: renamed from: f0 */
    public static final C9398a0 f48230f0;

    /* JADX INFO: renamed from: Y */
    public boolean f48231Y;

    /* JADX INFO: renamed from: u4.d$a */
    public class a extends Property<Drawable, PointF> {

        /* JADX INFO: renamed from: a */
        public final Rect f48232a;

        public a() {
            super(PointF.class, "boundsOrigin");
            this.f48232a = new Rect();
        }

        @Override // android.util.Property
        public final PointF get(Drawable drawable) {
            Rect rect = this.f48232a;
            drawable.copyBounds(rect);
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        public final void set(Drawable drawable, PointF pointF) {
            Drawable drawable2 = drawable;
            PointF pointF2 = pointF;
            Rect rect = this.f48232a;
            drawable2.copyBounds(rect);
            rect.offsetTo(Math.round(pointF2.x), Math.round(pointF2.y));
            drawable2.setBounds(rect);
        }
    }

    /* JADX INFO: renamed from: u4.d$b */
    public class b extends Property<j, PointF> {
        public b() {
            super(PointF.class, "topLeft");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(j jVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(j jVar, PointF pointF) {
            j jVar2 = jVar;
            PointF pointF2 = pointF;
            jVar2.getClass();
            jVar2.f48242a = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            jVar2.f48243b = iRound;
            int i10 = jVar2.f48247f + 1;
            jVar2.f48247f = i10;
            if (i10 == jVar2.f48248g) {
                C9433r0.m17830a(jVar2.f48246e, jVar2.f48242a, iRound, jVar2.f48244c, jVar2.f48245d);
                jVar2.f48247f = 0;
                jVar2.f48248g = 0;
            }
        }
    }

    /* JADX INFO: renamed from: u4.d$c */
    public class c extends Property<j, PointF> {
        public c() {
            super(PointF.class, "bottomRight");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(j jVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(j jVar, PointF pointF) {
            j jVar2 = jVar;
            PointF pointF2 = pointF;
            jVar2.getClass();
            jVar2.f48244c = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            jVar2.f48245d = iRound;
            int i10 = jVar2.f48248g + 1;
            jVar2.f48248g = i10;
            if (jVar2.f48247f == i10) {
                C9433r0.m17830a(jVar2.f48246e, jVar2.f48242a, jVar2.f48243b, jVar2.f48244c, iRound);
                jVar2.f48247f = 0;
                jVar2.f48248g = 0;
            }
        }
    }

    /* JADX INFO: renamed from: u4.d$d */
    public class d extends Property<View, PointF> {
        public d() {
            super(PointF.class, "bottomRight");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            C9433r0.m17830a(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    /* JADX INFO: renamed from: u4.d$e */
    public class e extends Property<View, PointF> {
        public e() {
            super(PointF.class, "topLeft");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            C9433r0.m17830a(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    /* JADX INFO: renamed from: u4.d$f */
    public class f extends Property<View, PointF> {
        public f() {
            super(PointF.class, "position");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int iRound = Math.round(pointF2.x);
            int iRound2 = Math.round(pointF2.y);
            C9433r0.m17830a(view2, iRound, iRound2, view2.getWidth() + iRound, view2.getHeight() + iRound2);
        }
    }

    /* JADX INFO: renamed from: u4.d$g */
    public class g extends AnimatorListenerAdapter {
        private j mViewBounds;

        public g(j jVar) {
            this.mViewBounds = jVar;
        }
    }

    /* JADX INFO: renamed from: u4.d$h */
    public class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public boolean f48233a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f48234b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Rect f48235c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f48236d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f48237e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f48238f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f48239g;

        public h(View view, Rect rect, int i10, int i11, int i12, int i13) {
            this.f48234b = view;
            this.f48235c = rect;
            this.f48236d = i10;
            this.f48237e = i11;
            this.f48238f = i12;
            this.f48239g = i13;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f48233a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (!this.f48233a) {
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                View view = this.f48234b;
                C10029b0.f.m18696c(view, this.f48235c);
                C9433r0.m17830a(view, this.f48236d, this.f48237e, this.f48238f, this.f48239g);
            }
        }
    }

    /* JADX INFO: renamed from: u4.d$i */
    public class i extends C9417j0 {

        /* JADX INFO: renamed from: a */
        public boolean f48240a = false;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewGroup f48241b;

        public i(ViewGroup viewGroup) {
            this.f48241b = viewGroup;
        }

        @Override // p406u4.C9417j0, p406u4.AbstractC9409f0.e
        /* JADX INFO: renamed from: a */
        public final void mo17765a() {
            C9431q0.m17829a(this.f48241b, false);
        }

        @Override // p406u4.C9417j0, p406u4.AbstractC9409f0.e
        /* JADX INFO: renamed from: c */
        public final void mo17766c() {
            C9431q0.m17829a(this.f48241b, false);
            this.f48240a = true;
        }

        @Override // p406u4.C9417j0, p406u4.AbstractC9409f0.e
        /* JADX INFO: renamed from: d */
        public final void mo17767d() {
            C9431q0.m17829a(this.f48241b, true);
        }

        @Override // p406u4.AbstractC9409f0.e
        /* JADX INFO: renamed from: e */
        public final void mo17768e(AbstractC9409f0 abstractC9409f0) {
            if (!this.f48240a) {
                C9431q0.m17829a(this.f48241b, false);
            }
            abstractC9409f0.mo17779F(this);
        }
    }

    /* JADX INFO: renamed from: u4.d$j */
    public static class j {

        /* JADX INFO: renamed from: a */
        public int f48242a;

        /* JADX INFO: renamed from: b */
        public int f48243b;

        /* JADX INFO: renamed from: c */
        public int f48244c;

        /* JADX INFO: renamed from: d */
        public int f48245d;

        /* JADX INFO: renamed from: e */
        public final View f48246e;

        /* JADX INFO: renamed from: f */
        public int f48247f;

        /* JADX INFO: renamed from: g */
        public int f48248g;

        public j(View view) {
            this.f48246e = view;
        }
    }

    static {
        new a();
        f48225a0 = new b();
        f48226b0 = new c();
        f48227c0 = new d();
        f48228d0 = new e();
        f48229e0 = new f();
        f48230f0 = new C9398a0();
    }

    public C9404d() {
        this.f48231Y = false;
    }

    @SuppressLint({"RestrictedApi"})
    public C9404d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48231Y = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9407e0.f48262c);
        boolean zM15684b = C7911k.m15684b(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        typedArrayObtainStyledAttributes.recycle();
        this.f48231Y = zM15684b;
    }

    /* JADX INFO: renamed from: S */
    public final void m17760S(C9425n0 c9425n0) {
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        View view = c9425n0.f48373b;
        if (!C10029b0.g.m18699c(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap map = c9425n0.f48372a;
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
        if (this.f48231Y) {
            map.put("android:changeBounds:clip", C10029b0.f.m18694a(view));
        }
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: h */
    public final void mo17761h(C9425n0 c9425n0) {
        m17760S(c9425n0);
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: k */
    public final void mo17762k(C9425n0 c9425n0) {
        m17760S(c9425n0);
    }

    /* JADX WARN: Code duplicated, block: B:72:0x01b7  */
    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: p */
    public final Animator mo17763p(ViewGroup viewGroup, C9425n0 c9425n0, C9425n0 c9425n1) {
        int i10;
        View view;
        ObjectAnimator objectAnimatorOfObject;
        int i11;
        Rect rect;
        Rect rect2;
        ObjectAnimator objectAnimatorOfObject2;
        boolean z10;
        Animator animator;
        Animator animator2;
        ObjectAnimator objectAnimatorOfObject3;
        if (c9425n0 == null || c9425n1 == null) {
            return null;
        }
        HashMap map = c9425n0.f48372a;
        HashMap map2 = c9425n1.f48372a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = c9425n1.f48373b;
        Rect rect3 = (Rect) map.get("android:changeBounds:bounds");
        Rect rect4 = (Rect) map2.get("android:changeBounds:bounds");
        int i12 = rect3.left;
        int i13 = rect4.left;
        int i14 = rect3.top;
        int i15 = rect4.top;
        int i16 = rect3.right;
        int i17 = rect4.right;
        int i18 = rect3.bottom;
        int i19 = rect4.bottom;
        int i20 = i16 - i12;
        int i21 = i18 - i14;
        int i22 = i17 - i13;
        int i23 = i19 - i15;
        Rect rect5 = (Rect) map.get("android:changeBounds:clip");
        Rect rect6 = (Rect) map2.get("android:changeBounds:clip");
        if ((i20 == 0 || i21 == 0) && (i22 == 0 || i23 == 0)) {
            i10 = 0;
        } else {
            i10 = (i12 == i13 && i14 == i15) ? 0 : 1;
            if (i16 != i17 || i18 != i19) {
                i10++;
            }
        }
        if ((rect5 != null && !rect5.equals(rect6)) || (rect5 == null && rect6 != null)) {
            i10++;
        }
        int i24 = i10;
        if (i24 <= 0) {
            return null;
        }
        boolean z11 = this.f48231Y;
        f fVar = f48229e0;
        if (z11) {
            C9433r0.m17830a(view, i12, i14, Math.max(i20, i22) + i12, Math.max(i21, i23) + i14);
            if (i12 == i13 && i14 == i15) {
                objectAnimatorOfObject = null;
            } else {
                view = view2;
                objectAnimatorOfObject = ObjectAnimator.ofObject(view, fVar, (TypeConverter) null, this.f48290U.mo17757a(i12, i14, i13, i15));
            }
            if (rect5 == null) {
                i11 = 0;
                rect = new Rect(0, 0, i20, i21);
            } else {
                i11 = 0;
            }
            if (rect6 == null) {
                rect = rect5;
                rect2 = new Rect(i11, i11, i22, i23);
            } else {
                rect = rect5;
                rect2 = rect6;
            }
            if (rect.equals(rect2)) {
                objectAnimatorOfObject2 = null;
            } else {
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                C10029b0.f.m18696c(view, rect);
                Object[] objArr = new Object[2];
                objArr[i11] = rect;
                objArr[1] = rect2;
                objectAnimatorOfObject2 = ObjectAnimator.ofObject(view, "clipBounds", f48230f0, objArr);
                objectAnimatorOfObject2.addListener(new h(view, rect6, i13, i15, i17, i19));
            }
            boolean z12 = C9423m0.f48365a;
            if (objectAnimatorOfObject != null) {
                if (objectAnimatorOfObject2 == null) {
                    animator2 = objectAnimatorOfObject;
                } else {
                    AnimatorSet animatorSet = new AnimatorSet();
                    z10 = true;
                    animatorSet.playTogether(objectAnimatorOfObject, objectAnimatorOfObject2);
                    animator = animatorSet;
                }
                if (view.getParent() instanceof ViewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                    C9431q0.m17829a(viewGroup4, z10);
                    mo17791b(new i(viewGroup4));
                }
                return animator;
            }
            animator2 = objectAnimatorOfObject2;
        } else {
            C9433r0.m17830a(view, i12, i14, i16, i18);
            if (i24 == 2) {
                if (i20 == i22 && i21 == i23) {
                    objectAnimatorOfObject3 = ObjectAnimator.ofObject(view, fVar, (TypeConverter) null, this.f48290U.mo17757a(i12, i14, i13, i15));
                } else {
                    j jVar = new j(view);
                    ObjectAnimator objectAnimatorOfObject4 = ObjectAnimator.ofObject(jVar, f48225a0, (TypeConverter) null, this.f48290U.mo17757a(i12, i14, i13, i15));
                    ObjectAnimator objectAnimatorOfObject5 = ObjectAnimator.ofObject(jVar, f48226b0, (TypeConverter) null, this.f48290U.mo17757a(i16, i18, i17, i19));
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(objectAnimatorOfObject4, objectAnimatorOfObject5);
                    animatorSet2.addListener(new g(jVar));
                    animator2 = animatorSet2;
                }
            } else if (i12 == i13 && i14 == i15) {
                objectAnimatorOfObject3 = ObjectAnimator.ofObject(view, f48227c0, (TypeConverter) null, this.f48290U.mo17757a(i16, i18, i17, i19));
            } else {
                view = view2;
                objectAnimatorOfObject3 = ObjectAnimator.ofObject(view, f48228d0, (TypeConverter) null, this.f48290U.mo17757a(i12, i14, i13, i15));
            }
            animator2 = objectAnimatorOfObject3;
        }
        z10 = true;
        animator = animator2;
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup5 = (ViewGroup) view.getParent();
            C9431q0.m17829a(viewGroup5, z10);
            mo17791b(new i(viewGroup5));
        }
        return animator;
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: y */
    public final String[] mo17764y() {
        return f48224Z;
    }
}
