package p406u4;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.HashMap;

/* JADX INFO: renamed from: u4.f */
/* JADX INFO: loaded from: classes.dex */
public final class C9408f extends AbstractC9409f0 {

    /* JADX INFO: renamed from: Y */
    public static final String[] f48270Y = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};

    /* JADX INFO: renamed from: Z */
    public static final a f48271Z = new a();

    /* JADX INFO: renamed from: a0 */
    public static final b f48272a0 = new b();

    /* JADX INFO: renamed from: u4.f$a */
    public class a implements TypeEvaluator<Matrix> {
        @Override // android.animation.TypeEvaluator
        public final /* bridge */ /* synthetic */ Matrix evaluate(float f3, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: u4.f$b */
    public class b extends Property<ImageView, Matrix> {
        public b() {
            super(Matrix.class, "animatedTransform");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ Matrix get(ImageView imageView) {
            return null;
        }

        @Override // android.util.Property
        public final void set(ImageView imageView, Matrix matrix) {
            ImageView imageView2 = imageView;
            Matrix matrix2 = matrix;
            if (Build.VERSION.SDK_INT >= 29) {
                imageView2.animateTransform(matrix2);
                return;
            }
            if (matrix2 == null) {
                Drawable drawable = imageView2.getDrawable();
                if (drawable != null) {
                    drawable.setBounds(0, 0, (imageView2.getWidth() - imageView2.getPaddingLeft()) - imageView2.getPaddingRight(), (imageView2.getHeight() - imageView2.getPaddingTop()) - imageView2.getPaddingBottom());
                    imageView2.invalidate();
                    return;
                }
                return;
            }
            if (C9442w.f48424a) {
                try {
                    imageView2.animateTransform(matrix2);
                } catch (NoSuchMethodError unused) {
                    C9442w.f48424a = false;
                }
            }
        }
    }

    /* JADX INFO: renamed from: u4.f$c */
    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f48273a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f48273a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f48273a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C9408f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: S */
    public final void m17772S(C9425n0 c9425n0) {
        Matrix matrix;
        View view = c9425n0.f48373b;
        if (view instanceof ImageView) {
            if (view.getVisibility() != 0) {
                return;
            }
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            HashMap map = c9425n0.f48372a;
            map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            Drawable drawable = imageView.getDrawable();
            if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
                matrix = new Matrix(imageView.getImageMatrix());
            } else {
                int i10 = c.f48273a[imageView.getScaleType().ordinal()];
                if (i10 == 1) {
                    Drawable drawable2 = imageView.getDrawable();
                    Matrix matrix2 = new Matrix();
                    matrix2.postScale(imageView.getWidth() / drawable2.getIntrinsicWidth(), imageView.getHeight() / drawable2.getIntrinsicHeight());
                    matrix = matrix2;
                } else if (i10 != 2) {
                    matrix = new Matrix(imageView.getImageMatrix());
                } else {
                    Drawable drawable3 = imageView.getDrawable();
                    int intrinsicWidth = drawable3.getIntrinsicWidth();
                    float width = imageView.getWidth();
                    float f3 = intrinsicWidth;
                    int intrinsicHeight = drawable3.getIntrinsicHeight();
                    float height = imageView.getHeight();
                    float f10 = intrinsicHeight;
                    float fMax = Math.max(width / f3, height / f10);
                    float f11 = f10 * fMax;
                    int iRound = Math.round((width - (f3 * fMax)) / 2.0f);
                    int iRound2 = Math.round((height - f11) / 2.0f);
                    Matrix matrix3 = new Matrix();
                    matrix3.postScale(fMax, fMax);
                    matrix3.postTranslate(iRound, iRound2);
                    matrix = matrix3;
                }
            }
            map.put("android:changeImageTransform:matrix", matrix);
        }
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: h */
    public final void mo17761h(C9425n0 c9425n0) {
        m17772S(c9425n0);
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: k */
    public final void mo17762k(C9425n0 c9425n0) {
        m17772S(c9425n0);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: p */
    public final Animator mo17763p(ViewGroup viewGroup, C9425n0 c9425n0, C9425n0 c9425n1) {
        boolean z10;
        ObjectAnimator objectAnimatorOfObject = null;
        if (c9425n0 != null) {
            if (c9425n1 == null) {
                return null;
            }
            HashMap map = c9425n0.f48372a;
            Rect rect = (Rect) map.get("android:changeImageTransform:bounds");
            HashMap map2 = c9425n1.f48372a;
            Rect rect2 = (Rect) map2.get("android:changeImageTransform:bounds");
            if (rect != null) {
                if (rect2 == null) {
                    return null;
                }
                Matrix matrix = (Matrix) map.get("android:changeImageTransform:matrix");
                Matrix matrix2 = (Matrix) map2.get("android:changeImageTransform:matrix");
                if (matrix == null && matrix2 == null) {
                    z10 = true;
                } else if (matrix == null || !matrix.equals(matrix2)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (rect.equals(rect2) && z10) {
                    return null;
                }
                ImageView imageView = (ImageView) c9425n1.f48373b;
                Drawable drawable = imageView.getDrawable();
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                b bVar = f48272a0;
                if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                    if (matrix == null) {
                        matrix = C9444x.f48425a;
                    }
                    if (matrix2 == null) {
                        matrix2 = C9444x.f48425a;
                    }
                    bVar.set(imageView, matrix);
                    return ObjectAnimator.ofObject(imageView, bVar, new C9423m0.a(), matrix, matrix2);
                }
                a aVar = f48271Z;
                C9444x.a aVar2 = C9444x.f48425a;
                objectAnimatorOfObject = ObjectAnimator.ofObject(imageView, bVar, aVar, aVar2, aVar2);
            }
        }
        return objectAnimatorOfObject;
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: y */
    public final String[] mo17764y() {
        return f48270Y;
    }
}
