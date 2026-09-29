package p406u4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.linguist.R;
import java.util.HashMap;
import p286o2.C7911k;

/* JADX INFO: renamed from: u4.y0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9447y0 extends AbstractC9409f0 {

    /* JADX INFO: renamed from: Z */
    public static final String[] f48430Z = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: Y */
    public int f48431Y;

    /* JADX INFO: renamed from: u4.y0$a */
    public static class a extends AnimatorListenerAdapter implements AbstractC9409f0.e {

        /* JADX INFO: renamed from: a */
        public final View f48432a;

        /* JADX INFO: renamed from: b */
        public final int f48433b;

        /* JADX INFO: renamed from: c */
        public final ViewGroup f48434c;

        /* JADX INFO: renamed from: e */
        public boolean f48436e;

        /* JADX INFO: renamed from: f */
        public boolean f48437f = false;

        /* JADX INFO: renamed from: d */
        public final boolean f48435d = true;

        public a(View view, int i10) {
            this.f48432a = view;
            this.f48433b = i10;
            this.f48434c = (ViewGroup) view.getParent();
            m17844f(true);
        }

        @Override // p406u4.AbstractC9409f0.e
        /* JADX INFO: renamed from: a */
        public final void mo17765a() {
            m17844f(false);
        }

        @Override // p406u4.AbstractC9409f0.e
        /* JADX INFO: renamed from: b */
        public final void mo17810b(AbstractC9409f0 abstractC9409f0) {
        }

        @Override // p406u4.AbstractC9409f0.e
        /* JADX INFO: renamed from: c */
        public final void mo17766c() {
        }

        @Override // p406u4.AbstractC9409f0.e
        /* JADX INFO: renamed from: d */
        public final void mo17767d() {
            m17844f(true);
        }

        @Override // p406u4.AbstractC9409f0.e
        /* JADX INFO: renamed from: e */
        public final void mo17768e(AbstractC9409f0 abstractC9409f0) {
            if (!this.f48437f) {
                C9433r0.m17832c(this.f48432a, this.f48433b);
                ViewGroup viewGroup = this.f48434c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m17844f(false);
            abstractC9409f0.mo17779F(this);
        }

        /* JADX INFO: renamed from: f */
        public final void m17844f(boolean z10) {
            ViewGroup viewGroup;
            if (!this.f48435d || this.f48436e == z10 || (viewGroup = this.f48434c) == null) {
                return;
            }
            this.f48436e = z10;
            C9431q0.m17829a(viewGroup, z10);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f48437f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (!this.f48437f) {
                C9433r0.m17832c(this.f48432a, this.f48433b);
                ViewGroup viewGroup = this.f48434c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m17844f(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            if (!this.f48437f) {
                C9433r0.m17832c(this.f48432a, this.f48433b);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            if (this.f48437f) {
                return;
            }
            C9433r0.m17832c(this.f48432a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: u4.y0$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public boolean f48438a;

        /* JADX INFO: renamed from: b */
        public boolean f48439b;

        /* JADX INFO: renamed from: c */
        public int f48440c;

        /* JADX INFO: renamed from: d */
        public int f48441d;

        /* JADX INFO: renamed from: e */
        public ViewGroup f48442e;

        /* JADX INFO: renamed from: f */
        public ViewGroup f48443f;
    }

    public AbstractC9447y0() {
        this.f48431Y = 3;
    }

    @SuppressLint({"RestrictedApi"})
    public AbstractC9447y0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48431Y = 3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9407e0.f48263d);
        int iM15688f = C7911k.m15688f(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (iM15688f != 0) {
            if ((iM15688f & (-4)) != 0) {
                throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
            }
            this.f48431Y = iM15688f;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0064  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:7:0x003c  */
    /* JADX INFO: renamed from: T */
    public static b m17842T(C9425n0 c9425n0, C9425n0 c9425n1) {
        b bVar = new b();
        bVar.f48438a = false;
        bVar.f48439b = false;
        if (c9425n0 != null) {
            HashMap map = c9425n0.f48372a;
            if (map.containsKey("android:visibility:visibility")) {
                bVar.f48440c = ((Integer) map.get("android:visibility:visibility")).intValue();
                bVar.f48442e = (ViewGroup) map.get("android:visibility:parent");
            } else {
                bVar.f48440c = -1;
                bVar.f48442e = null;
            }
        } else {
            bVar.f48440c = -1;
            bVar.f48442e = null;
        }
        if (c9425n1 != null) {
            HashMap map2 = c9425n1.f48372a;
            if (map2.containsKey("android:visibility:visibility")) {
                bVar.f48441d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                bVar.f48443f = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                bVar.f48441d = -1;
                bVar.f48443f = null;
            }
        } else {
            bVar.f48441d = -1;
            bVar.f48443f = null;
        }
        if (c9425n0 != null && c9425n1 != null) {
            int i10 = bVar.f48440c;
            int i11 = bVar.f48441d;
            if (i10 == i11 && bVar.f48442e == bVar.f48443f) {
                return bVar;
            }
            if (i10 != i11) {
                if (i10 == 0) {
                    bVar.f48439b = false;
                    bVar.f48438a = true;
                } else if (i11 == 0) {
                    bVar.f48439b = true;
                    bVar.f48438a = true;
                }
            } else if (bVar.f48443f == null) {
                bVar.f48439b = false;
                bVar.f48438a = true;
            } else if (bVar.f48442e == null) {
                bVar.f48439b = true;
                bVar.f48438a = true;
            }
        } else if (c9425n0 == null && bVar.f48441d == 0) {
            bVar.f48439b = true;
            bVar.f48438a = true;
        } else if (c9425n1 == null && bVar.f48440c == 0) {
            bVar.f48439b = false;
            bVar.f48438a = true;
        }
        return bVar;
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: A */
    public final boolean mo17776A(C9425n0 c9425n0, C9425n0 c9425n1) {
        boolean z10 = false;
        if (c9425n0 == null && c9425n1 == null) {
            return false;
        }
        if (c9425n0 != null && c9425n1 != null && c9425n1.f48372a.containsKey("android:visibility:visibility") != c9425n0.f48372a.containsKey("android:visibility:visibility")) {
            return false;
        }
        b bVarM17842T = m17842T(c9425n0, c9425n1);
        if (bVarM17842T.f48438a && (bVarM17842T.f48440c == 0 || bVarM17842T.f48441d == 0)) {
            z10 = true;
        }
        return z10;
    }

    /* JADX INFO: renamed from: S */
    public final void m17843S(C9425n0 c9425n0) {
        View view = c9425n0.f48373b;
        int visibility = view.getVisibility();
        HashMap map = c9425n0.f48372a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX INFO: renamed from: V */
    public abstract Animator mo16372V(ViewGroup viewGroup, View view, C9425n0 c9425n0, C9425n0 c9425n1);

    /* JADX INFO: renamed from: W */
    public abstract Animator mo16373W(ViewGroup viewGroup, View view, C9425n0 c9425n0);

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: h */
    public void mo17761h(C9425n0 c9425n0) {
        m17843S(c9425n0);
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: k */
    public void mo17762k(C9425n0 c9425n0) {
        m17843S(c9425n0);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x008b  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f5  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (m17842T(m17806w(r5, false), m17807z(r5, false)).f48438a != false) goto L20;
     */
    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator mo17763p(ViewGroup viewGroup, C9425n0 c9425n0, C9425n0 c9425n1) {
        boolean z10;
        View view;
        int i10;
        boolean z11;
        boolean zIsAttachedToWindow;
        ViewGroup viewGroup2;
        int i11;
        Bitmap bitmapCreateBitmap;
        b bVarM17842T = m17842T(c9425n0, c9425n1);
        if (!bVarM17842T.f48438a || (bVarM17842T.f48442e == null && bVarM17842T.f48443f == null)) {
            return null;
        }
        boolean z12 = true;
        if (bVarM17842T.f48439b) {
            if ((this.f48431Y & 1) == 1 && c9425n1 != null) {
                View view2 = c9425n1.f48373b;
                if (c9425n0 == null) {
                    View view3 = (View) view2.getParent();
                }
                return mo16372V(viewGroup, view2, c9425n0, c9425n1);
            }
            return null;
        }
        int i12 = bVarM17842T.f48441d;
        if ((this.f48431Y & 2) == 2 && c9425n0 != null) {
            View view4 = c9425n1 != null ? c9425n1.f48373b : null;
            View view5 = c9425n0.f48373b;
            View view6 = (View) view5.getTag(R.id.save_overlay_view);
            if (view6 != null) {
                i10 = i12;
                view4 = null;
            } else {
                if (view4 == null || view4.getParent() == null) {
                    if (view4 != null) {
                        view6 = view4;
                        view4 = null;
                        z10 = false;
                    } else {
                        z10 = true;
                        view4 = null;
                        view6 = null;
                    }
                } else if (i12 == 4 || view5 == view4) {
                    view6 = null;
                    z10 = false;
                } else {
                    z10 = true;
                    view4 = null;
                    view6 = null;
                }
                if (!z10) {
                    view = view4;
                    i10 = i12;
                    view4 = view;
                    z12 = false;
                } else if (view5.getParent() == null) {
                    i10 = i12;
                    view6 = view5;
                    z12 = false;
                } else {
                    if (view5.getParent() instanceof View) {
                        View view7 = (View) view5.getParent();
                        if (m17842T(m17807z(view7, true), m17806w(view7, true)).f48438a) {
                            view = view4;
                            i10 = i12;
                            int id2 = view7.getId();
                            if (view7.getParent() == null && id2 != -1) {
                                viewGroup.findViewById(id2);
                            }
                        } else {
                            boolean z13 = C9423m0.f48365a;
                            Matrix matrix = new Matrix();
                            matrix.setTranslate(-view7.getScrollX(), -view7.getScrollY());
                            C9441v0 c9441v0 = C9433r0.f48403a;
                            c9441v0.mo17836H(view5, matrix);
                            c9441v0.mo17837I(viewGroup, matrix);
                            RectF rectF = new RectF(0.0f, 0.0f, view5.getWidth(), view5.getHeight());
                            matrix.mapRect(rectF);
                            int iRound = Math.round(rectF.left);
                            int iRound2 = Math.round(rectF.top);
                            int iRound3 = Math.round(rectF.right);
                            int iRound4 = Math.round(rectF.bottom);
                            ImageView imageView = new ImageView(view5.getContext());
                            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            if (C9423m0.f48365a) {
                                z11 = !view5.isAttachedToWindow();
                                zIsAttachedToWindow = viewGroup.isAttachedToWindow();
                            } else {
                                z11 = false;
                                zIsAttachedToWindow = false;
                            }
                            boolean z14 = C9423m0.f48366b;
                            if (z14 && z11) {
                                if (zIsAttachedToWindow) {
                                    viewGroup2 = (ViewGroup) view5.getParent();
                                    int iIndexOfChild = viewGroup2.indexOfChild(view5);
                                    viewGroup.getOverlay().add(view5);
                                    i11 = iIndexOfChild;
                                } else {
                                    view = view4;
                                    i10 = i12;
                                    bitmapCreateBitmap = null;
                                }
                                if (bitmapCreateBitmap != null) {
                                    imageView.setImageBitmap(bitmapCreateBitmap);
                                }
                                imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
                                imageView.layout(iRound, iRound2, iRound3, iRound4);
                                view6 = imageView;
                            } else {
                                viewGroup2 = null;
                                i11 = 0;
                            }
                            view = view4;
                            int iRound5 = Math.round(rectF.width());
                            i10 = i12;
                            int iRound6 = Math.round(rectF.height());
                            if (iRound5 <= 0 || iRound6 <= 0) {
                                bitmapCreateBitmap = null;
                            } else {
                                float fMin = Math.min(1.0f, 1048576.0f / (iRound5 * iRound6));
                                int iRound7 = Math.round(iRound5 * fMin);
                                int iRound8 = Math.round(iRound6 * fMin);
                                matrix.postTranslate(-rectF.left, -rectF.top);
                                matrix.postScale(fMin, fMin);
                                if (C9423m0.f48367c) {
                                    Picture picture = new Picture();
                                    Canvas canvasBeginRecording = picture.beginRecording(iRound7, iRound8);
                                    canvasBeginRecording.concat(matrix);
                                    view5.draw(canvasBeginRecording);
                                    picture.endRecording();
                                    bitmapCreateBitmap = Bitmap.createBitmap(picture);
                                } else {
                                    bitmapCreateBitmap = Bitmap.createBitmap(iRound7, iRound8, Bitmap.Config.ARGB_8888);
                                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                                    canvas.concat(matrix);
                                    view5.draw(canvas);
                                }
                            }
                            if (z14 && z11) {
                                viewGroup.getOverlay().remove(view5);
                                viewGroup2.addView(view5, i11);
                            }
                            if (bitmapCreateBitmap != null) {
                                imageView.setImageBitmap(bitmapCreateBitmap);
                            }
                            imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
                            imageView.layout(iRound, iRound2, iRound3, iRound4);
                            view6 = imageView;
                        }
                    } else {
                        view = view4;
                        i10 = i12;
                    }
                    view4 = view;
                    z12 = false;
                }
            }
            if (view6 != null) {
                if (!z12) {
                    int[] iArr = (int[]) c9425n0.f48372a.get("android:visibility:screenLocation");
                    int i13 = iArr[0];
                    int i14 = iArr[1];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr2);
                    view6.offsetLeftAndRight((i13 - iArr2[0]) - view6.getLeft());
                    view6.offsetTopAndBottom((i14 - iArr2[1]) - view6.getTop());
                    viewGroup.getOverlay().add(view6);
                }
                Animator animatorMo16373W = mo16373W(viewGroup, view6, c9425n0);
                if (z12) {
                    return animatorMo16373W;
                }
                if (animatorMo16373W == null) {
                    viewGroup.getOverlay().remove(view6);
                    return animatorMo16373W;
                }
                view5.setTag(R.id.save_overlay_view, view6);
                mo17791b(new C9445x0(this, viewGroup, view6, view5));
                return animatorMo16373W;
            }
            if (view4 != null) {
                int visibility = view4.getVisibility();
                C9433r0.m17832c(view4, 0);
                Animator animatorMo16373W2 = mo16373W(viewGroup, view4, c9425n0);
                if (animatorMo16373W2 == null) {
                    C9433r0.m17832c(view4, visibility);
                    return animatorMo16373W2;
                }
                a aVar = new a(view4, i10);
                animatorMo16373W2.addListener(aVar);
                animatorMo16373W2.addPauseListener(aVar);
                mo17791b(aVar);
                return animatorMo16373W2;
            }
        }
        return null;
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: y */
    public final String[] mo17764y() {
        return f48430Z;
    }
}
