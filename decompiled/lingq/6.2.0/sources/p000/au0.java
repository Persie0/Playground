package p000;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.R$id;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class au0 extends daa {

    /* JADX INFO: renamed from: h0 */
    public static final String[] f7498h0 = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};

    /* JADX INFO: renamed from: i0 */
    public static final r90 f7499i0 = new r90(float[].class, "nonTranslations", 2);

    /* JADX INFO: renamed from: j0 */
    public static final r90 f7500j0 = new r90(PointF.class, "translations", 3);

    /* JADX INFO: renamed from: k0 */
    public static final boolean f7501k0 = true;

    /* JADX INFO: renamed from: e0 */
    public boolean f7502e0;

    /* JADX INFO: renamed from: f0 */
    public boolean f7503f0;

    /* JADX INFO: renamed from: g0 */
    public Matrix f7504g0;

    /* JADX INFO: renamed from: W */
    public final void m3041W(waa waaVar) {
        View view = waaVar.f66571b;
        HashMap map = waaVar.f66570a;
        if (view.getVisibility() == 8) {
            return;
        }
        map.put("android:changeTransform:parent", view.getParent());
        map.put("android:changeTransform:transforms", new zt0(view));
        Matrix matrix = view.getMatrix();
        map.put("android:changeTransform:matrix", (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
        if (this.f7503f0) {
            Matrix matrix2 = new Matrix();
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            r90 r90Var = awa.f7627a;
            viewGroup.transformMatrixToGlobal(matrix2);
            matrix2.preTranslate(-viewGroup.getScrollX(), -viewGroup.getScrollY());
            map.put("android:changeTransform:parentMatrix", matrix2);
            map.put("android:changeTransform:intermediateMatrix", view.getTag(R$id.transition_transform));
            map.put("android:changeTransform:intermediateParentMatrix", view.getTag(R$id.parent_matrix));
        }
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: g */
    public final void mo3042g(waa waaVar) {
        m3041W(waaVar);
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: j */
    public final void mo3043j(waa waaVar) {
        m3041W(waaVar);
        View view = waaVar.f66571b;
        if (f7501k0) {
            return;
        }
        ((ViewGroup) view.getParent()).startViewTransition(view);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02d8 A[PHI: r19 r25 r26
      0x02d8: PHI (r19v6 boolean) = (r19v7 boolean), (r19v8 boolean), (r19v11 boolean), (r19v11 boolean), (r19v12 boolean) binds: [B:77:0x0255, B:97:0x02cb, B:136:0x02d8, B:138:0x02d8, B:85:0x029e] A[DONT_GENERATE, DONT_INLINE]
      0x02d8: PHI (r25v3 java.util.ArrayList) = 
      (r1v6 java.util.ArrayList)
      (r25v5 java.util.ArrayList)
      (r25v7 java.util.ArrayList)
      (r25v7 java.util.ArrayList)
      (r25v7 java.util.ArrayList)
     binds: [B:77:0x0255, B:97:0x02cb, B:136:0x02d8, B:138:0x02d8, B:85:0x029e] A[DONT_GENERATE, DONT_INLINE]
      0x02d8: PHI (r26v8 android.animation.ObjectAnimator) = 
      (r26v9 android.animation.ObjectAnimator)
      (r26v10 android.animation.ObjectAnimator)
      (r26v10 android.animation.ObjectAnimator)
      (r26v10 android.animation.ObjectAnimator)
      (r26v10 android.animation.ObjectAnimator)
     binds: [B:77:0x0255, B:97:0x02cb, B:136:0x02d8, B:138:0x02d8, B:85:0x029e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:99:0x02ce A[PHI: r19 r25
      0x02ce: PHI (r19v9 boolean) = (r19v8 boolean), (r19v11 boolean), (r19v12 boolean) binds: [B:97:0x02cb, B:137:0x02ce, B:85:0x029e] A[DONT_GENERATE, DONT_INLINE]
      0x02ce: PHI (r25v6 java.util.ArrayList) = (r25v5 java.util.ArrayList), (r25v7 java.util.ArrayList), (r25v7 java.util.ArrayList) binds: [B:97:0x02cb, B:137:0x02ce, B:85:0x029e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.daa
    /* JADX INFO: renamed from: o */
    public final Animator mo3044o(ViewGroup viewGroup, waa waaVar, waa waaVar2) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder;
        ObjectAnimator objectAnimator2;
        int i;
        en3 en3Var;
        boolean z;
        en3 en3Var2;
        dn3 dn3Var;
        ObjectAnimator objectAnimator3;
        boolean z2;
        dn3 dn3Var2;
        waa waaVarM10217v;
        if (waaVar == null) {
            return null;
        }
        View view = waaVar.f66571b;
        HashMap map = waaVar.f66570a;
        if (waaVar2 == null) {
            return null;
        }
        View view2 = waaVar2.f66571b;
        HashMap map2 = waaVar2.f66570a;
        if (!map.containsKey("android:changeTransform:parent") || !map2.containsKey("android:changeTransform:parent")) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeTransform:parent");
        View view3 = (ViewGroup) map2.get("android:changeTransform:parent");
        boolean z3 = this.f7503f0 && (!(m10185D(viewGroup2) && m10185D(view3)) ? viewGroup2 == view3 : !((waaVarM10217v = m10217v(viewGroup2, true)) == null || view3 != waaVarM10217v.f66571b));
        Matrix matrix = (Matrix) map.get("android:changeTransform:intermediateMatrix");
        if (matrix != null) {
            map.put("android:changeTransform:matrix", matrix);
        }
        Matrix matrix2 = (Matrix) map.get("android:changeTransform:intermediateParentMatrix");
        if (matrix2 != null) {
            map.put("android:changeTransform:parentMatrix", matrix2);
        }
        if (z3) {
            Matrix matrix3 = (Matrix) map2.get("android:changeTransform:parentMatrix");
            view2.setTag(R$id.parent_matrix, matrix3);
            Matrix matrix4 = this.f7504g0;
            matrix4.reset();
            matrix3.invert(matrix4);
            Matrix matrix5 = (Matrix) map.get("android:changeTransform:matrix");
            if (matrix5 == null) {
                matrix5 = new Matrix();
                map.put("android:changeTransform:matrix", matrix5);
            }
            objectAnimator = null;
            matrix5.postConcat((Matrix) map.get("android:changeTransform:parentMatrix"));
            matrix5.postConcat(matrix4);
        } else {
            objectAnimator = null;
        }
        Matrix matrix6 = (Matrix) map.get("android:changeTransform:matrix");
        Matrix matrix7 = (Matrix) map2.get("android:changeTransform:matrix");
        if (matrix6 == null) {
            matrix6 = vs5.f65857a;
        }
        if (matrix7 == null) {
            matrix7 = vs5.f65857a;
        }
        if (matrix6.equals(matrix7)) {
            objectAnimatorOfPropertyValuesHolder = objectAnimator;
        } else {
            zt0 zt0Var = (zt0) map2.get("android:changeTransform:transforms");
            view2.setTranslationX(0.0f);
            view2.setTranslationY(0.0f);
            WeakHashMap weakHashMap = dta.f36217a;
            view2.setTranslationZ(0.0f);
            view2.setScaleX(1.0f);
            view2.setScaleY(1.0f);
            view2.setRotationX(0.0f);
            view2.setRotationY(0.0f);
            view2.setRotation(0.0f);
            float[] fArr = new float[9];
            matrix6.getValues(fArr);
            float[] fArr2 = new float[9];
            matrix7.getValues(fArr2);
            yt0 yt0Var = new yt0(view2, fArr);
            Matrix matrix8 = matrix7;
            d73 d73Var = new d73();
            d73Var.f35076a = new float[9];
            objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(yt0Var, PropertyValuesHolder.ofObject(f7499i0, d73Var, fArr, fArr2), wn7.m24082a(f7500j0, this.f35325W.mo10646a(fArr[2], fArr[5], fArr2[2], fArr2[5])));
            view2 = view2;
            xt0 xt0Var = new xt0(view2, zt0Var, yt0Var, matrix8, z3, this.f7502e0);
            objectAnimatorOfPropertyValuesHolder.addListener(xt0Var);
            objectAnimatorOfPropertyValuesHolder.addPauseListener(xt0Var);
        }
        boolean z4 = f7501k0;
        if (z3 && objectAnimatorOfPropertyValuesHolder != null && this.f7502e0) {
            Matrix matrix9 = new Matrix((Matrix) map2.get("android:changeTransform:parentMatrix"));
            r90 r90Var = awa.f7627a;
            viewGroup.transformMatrixToLocal(matrix9);
            int i2 = en3.f37553g;
            if (!(view2.getParent() instanceof ViewGroup)) {
                C3386nv.m17626m("Ghosted views must be parented by a ViewGroup");
                return objectAnimator;
            }
            int i3 = dn3.f35888c;
            dn3 dn3Var3 = (dn3) viewGroup.getTag(R$id.ghost_view_holder);
            en3 en3Var3 = (en3) view2.getTag(R$id.ghost_view);
            if (en3Var3 == null || (dn3Var2 = (dn3) en3Var3.getParent()) == dn3Var3) {
                i = 0;
                en3Var = en3Var3;
            } else {
                i = en3Var3.f37557d;
                dn3Var2.removeView(en3Var3);
                en3Var = objectAnimator;
            }
            if (en3Var == 0) {
                en3 en3Var4 = new en3(view2);
                en3Var4.f37558e = matrix9;
                if (dn3Var3 == null) {
                    dn3 dn3Var4 = new dn3(viewGroup.getContext());
                    dn3Var4.setClipChildren(false);
                    dn3Var4.f35889a = viewGroup;
                    viewGroup.setTag(R$id.ghost_view_holder, dn3Var4);
                    viewGroup.getOverlay().add(dn3Var4);
                    dn3Var4.f35890b = true;
                    dn3Var = dn3Var4;
                } else {
                    ViewGroup viewGroup3 = dn3Var3.f35889a;
                    if (!dn3Var3.f35890b) {
                        C3386nv.m17633t("This GhostViewHolder is detached!");
                        return objectAnimator;
                    }
                    viewGroup3.getOverlay().remove(dn3Var3);
                    viewGroup3.getOverlay().add(dn3Var3);
                    dn3Var = dn3Var3;
                }
                dn3Var.setLeftTopRightBottom(dn3Var.getLeft(), dn3Var.getTop(), viewGroup.getWidth() + dn3Var.getLeft(), viewGroup.getHeight() + dn3Var.getTop());
                en3Var4.setLeftTopRightBottom(en3Var4.getLeft(), en3Var4.getTop(), viewGroup.getWidth() + en3Var4.getLeft(), viewGroup.getHeight() + en3Var4.getTop());
                ArrayList arrayList = new ArrayList();
                dn3.m10490a(en3Var4.f37556c, arrayList);
                ArrayList arrayList2 = new ArrayList();
                int childCount = dn3Var.getChildCount() - 1;
                int i4 = 0;
                while (i4 <= childCount) {
                    int i5 = (i4 + childCount) / 2;
                    dn3.m10490a(((en3) dn3Var.getChildAt(i5)).f37556c, arrayList2);
                    if (arrayList.isEmpty() || arrayList2.isEmpty()) {
                        objectAnimator3 = objectAnimatorOfPropertyValuesHolder;
                    } else {
                        objectAnimator3 = objectAnimatorOfPropertyValuesHolder;
                        if (arrayList.get(0) == arrayList2.get(0)) {
                            int iMin = Math.min(arrayList.size(), arrayList2.size());
                            int i6 = 1;
                            while (true) {
                                if (i6 < iMin) {
                                    View view4 = (View) arrayList.get(i6);
                                    arrayList = arrayList;
                                    View view5 = (View) arrayList2.get(i6);
                                    if (view4 != view5) {
                                        ViewGroup viewGroup4 = (ViewGroup) view4.getParent();
                                        int childCount2 = viewGroup4.getChildCount();
                                        if (cn3.m4893a(view4) != cn3.m4893a(view5)) {
                                            z2 = z4;
                                            if (cn3.m4893a(view4) > cn3.m4893a(view5)) {
                                                i4 = i5 + 1;
                                            } else {
                                                childCount = i5 - 1;
                                            }
                                        } else {
                                            z2 = z4;
                                            int i7 = 0;
                                            while (true) {
                                                if (i7 < childCount2) {
                                                    int i8 = childCount2;
                                                    View childAt = viewGroup4.getChildAt(kta.m15688a(viewGroup4, i7));
                                                    if (childAt == view4) {
                                                        childCount = i5 - 1;
                                                    } else if (childAt != view5) {
                                                        i7++;
                                                        childCount2 = i8;
                                                    }
                                                }
                                                i4 = i5 + 1;
                                            }
                                        }
                                    } else {
                                        i6++;
                                        arrayList = arrayList;
                                    }
                                } else {
                                    arrayList = arrayList;
                                    z2 = z4;
                                    if (arrayList2.size() == iMin) {
                                        i4 = i5 + 1;
                                    } else {
                                        childCount = i5 - 1;
                                    }
                                }
                            }
                        }
                        arrayList2.clear();
                        arrayList = arrayList;
                        objectAnimatorOfPropertyValuesHolder = objectAnimator3;
                        z4 = z2;
                    }
                    z2 = z4;
                    i4 = i5 + 1;
                    arrayList2.clear();
                    arrayList = arrayList;
                    objectAnimatorOfPropertyValuesHolder = objectAnimator3;
                    z4 = z2;
                }
                objectAnimator2 = objectAnimatorOfPropertyValuesHolder;
                z = z4;
                if (i4 < 0 || i4 >= dn3Var.getChildCount()) {
                    dn3Var.addView(en3Var4);
                } else {
                    dn3Var.addView(en3Var4, i4);
                }
                en3Var4.f37557d = i;
                en3Var2 = en3Var4;
            } else {
                objectAnimator2 = objectAnimatorOfPropertyValuesHolder;
                z = z4;
                en3Var.f37558e = matrix9;
                en3Var2 = en3Var;
            }
            en3Var2.f37557d++;
            en3Var2.f37554a = (ViewGroup) map.get("android:changeTransform:parent");
            en3Var2.f37555b = view;
            daa daaVar = this;
            while (true) {
                daa daaVar2 = daaVar.f35311I;
                if (daaVar2 == null) {
                    break;
                }
                daaVar = daaVar2;
            }
            wt0 wt0Var = new wt0();
            wt0Var.f67263a = view2;
            wt0Var.f67264b = en3Var2;
            daaVar.m10202a(wt0Var);
            if (z) {
                if (view != view2) {
                    view.setTransitionAlpha(0.0f);
                }
                view2.setTransitionAlpha(1.0f);
                return objectAnimator2;
            }
        } else {
            objectAnimator2 = objectAnimatorOfPropertyValuesHolder;
            if (!z4) {
                viewGroup2.endViewTransition(view);
            }
        }
        return objectAnimator2;
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: y */
    public final String[] mo3045y() {
        return f7498h0;
    }
}
