package p406u4;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import p286o2.C7911k;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: renamed from: u4.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C9405d0 extends AbstractC9447y0 {

    /* JADX INFO: renamed from: b0 */
    public static final DecelerateInterpolator f48249b0 = new DecelerateInterpolator();

    /* JADX INFO: renamed from: c0 */
    public static final AccelerateInterpolator f48250c0 = new AccelerateInterpolator();

    /* JADX INFO: renamed from: d0 */
    public static final a f48251d0 = new a();

    /* JADX INFO: renamed from: e0 */
    public static final b f48252e0 = new b();

    /* JADX INFO: renamed from: f0 */
    public static final c f48253f0 = new c();

    /* JADX INFO: renamed from: g0 */
    public static final d f48254g0 = new d();

    /* JADX INFO: renamed from: h0 */
    public static final e f48255h0 = new e();

    /* JADX INFO: renamed from: i0 */
    public static final f f48256i0 = new f();

    /* JADX INFO: renamed from: a0 */
    public g f48257a0;

    /* JADX INFO: renamed from: u4.d0$a */
    public class a extends h {
        @Override // p406u4.C9405d0.g
        /* JADX INFO: renamed from: b */
        public final float mo17769b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* JADX INFO: renamed from: u4.d0$b */
    public class b extends h {
        @Override // p406u4.C9405d0.g
        /* JADX INFO: renamed from: b */
        public final float mo17769b(ViewGroup viewGroup, View view) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            boolean z10 = true;
            if (C10029b0.e.m18686d(viewGroup) != 1) {
                z10 = false;
            }
            return z10 ? view.getTranslationX() + viewGroup.getWidth() : view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* JADX INFO: renamed from: u4.d0$c */
    public class c extends i {
        @Override // p406u4.C9405d0.g
        /* JADX INFO: renamed from: a */
        public final float mo17770a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    }

    /* JADX INFO: renamed from: u4.d0$d */
    public class d extends h {
        @Override // p406u4.C9405d0.g
        /* JADX INFO: renamed from: b */
        public final float mo17769b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* JADX INFO: renamed from: u4.d0$e */
    public class e extends h {
        @Override // p406u4.C9405d0.g
        /* JADX INFO: renamed from: b */
        public final float mo17769b(ViewGroup viewGroup, View view) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            boolean z10 = true;
            if (C10029b0.e.m18686d(viewGroup) != 1) {
                z10 = false;
            }
            return z10 ? view.getTranslationX() - viewGroup.getWidth() : view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* JADX INFO: renamed from: u4.d0$f */
    public class f extends i {
        @Override // p406u4.C9405d0.g
        /* JADX INFO: renamed from: a */
        public final float mo17770a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    }

    /* JADX INFO: renamed from: u4.d0$g */
    public interface g {
        /* JADX INFO: renamed from: a */
        float mo17770a(ViewGroup viewGroup, View view);

        /* JADX INFO: renamed from: b */
        float mo17769b(ViewGroup viewGroup, View view);
    }

    /* JADX INFO: renamed from: u4.d0$h */
    public static abstract class h implements g {
        @Override // p406u4.C9405d0.g
        /* JADX INFO: renamed from: a */
        public final float mo17770a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }
    }

    /* JADX INFO: renamed from: u4.d0$i */
    public static abstract class i implements g {
        @Override // p406u4.C9405d0.g
        /* JADX INFO: renamed from: b */
        public final float mo17769b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }
    }

    @SuppressLint({"RestrictedApi"})
    public C9405d0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        f fVar = f48256i0;
        this.f48257a0 = fVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9407e0.f48266g);
        int iM15688f = C7911k.m15688f(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        typedArrayObtainStyledAttributes.recycle();
        if (iM15688f == 3) {
            this.f48257a0 = f48251d0;
        } else if (iM15688f == 5) {
            this.f48257a0 = f48254g0;
        } else if (iM15688f == 48) {
            this.f48257a0 = f48253f0;
        } else if (iM15688f == 80) {
            this.f48257a0 = fVar;
        } else if (iM15688f == 8388611) {
            this.f48257a0 = f48252e0;
        } else {
            if (iM15688f != 8388613) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            this.f48257a0 = f48255h0;
        }
        C9403c0 c9403c0 = new C9403c0();
        c9403c0.f48223b = iM15688f;
        this.f48288S = c9403c0;
    }

    @Override // p406u4.AbstractC9447y0
    /* JADX INFO: renamed from: V */
    public final Animator mo16372V(ViewGroup viewGroup, View view, C9425n0 c9425n0, C9425n0 c9425n1) {
        if (c9425n1 == null) {
            return null;
        }
        int[] iArr = (int[]) c9425n1.f48372a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return C9429p0.m17828a(view, c9425n1, iArr[0], iArr[1], this.f48257a0.mo17769b(viewGroup, view), this.f48257a0.mo17770a(viewGroup, view), translationX, translationY, f48249b0, this);
    }

    @Override // p406u4.AbstractC9447y0
    /* JADX INFO: renamed from: W */
    public final Animator mo16373W(ViewGroup viewGroup, View view, C9425n0 c9425n0) {
        if (c9425n0 == null) {
            return null;
        }
        int[] iArr = (int[]) c9425n0.f48372a.get("android:slide:screenPosition");
        return C9429p0.m17828a(view, c9425n0, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f48257a0.mo17769b(viewGroup, view), this.f48257a0.mo17770a(viewGroup, view), f48250c0, this);
    }

    @Override // p406u4.AbstractC9447y0, p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: h */
    public final void mo17761h(C9425n0 c9425n0) {
        m17843S(c9425n0);
        int[] iArr = new int[2];
        c9425n0.f48373b.getLocationOnScreen(iArr);
        c9425n0.f48372a.put("android:slide:screenPosition", iArr);
    }

    @Override // p406u4.AbstractC9447y0, p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: k */
    public final void mo17762k(C9425n0 c9425n0) {
        m17843S(c9425n0);
        int[] iArr = new int[2];
        c9425n0.f48373b.getLocationOnScreen(iArr);
        c9425n0.f48372a.put("android:slide:screenPosition", iArr);
    }
}
