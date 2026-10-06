package p000;

import android.animation.Animator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class asy extends asf {

    /* JADX INFO: renamed from: o */
    private static final String[] f2281o = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: n */
    public int f2282n = 3;

    /* JADX INFO: renamed from: H */
    public static final void m1976H(asq asqVar) {
        asqVar.f2260a.put("android:visibility:visibility", Integer.valueOf(asqVar.f2261b.getVisibility()));
        asqVar.f2260a.put("android:visibility:parent", asqVar.f2261b.getParent());
        int[] iArr = new int[2];
        asqVar.f2261b.getLocationOnScreen(iArr);
        asqVar.f2260a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0094  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        if (r8 == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        if (r0.f2279e == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0092, code lost:
    
        if (r0.f2277c == 0) goto L41;
     */
    /* JADX INFO: renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final asx m1977I(asq asqVar, asq asqVar2) {
        asx asxVar = new asx();
        asxVar.f2275a = false;
        asxVar.f2276b = false;
        if (asqVar == null || !asqVar.f2260a.containsKey("android:visibility:visibility")) {
            asxVar.f2277c = -1;
            asxVar.f2279e = null;
        } else {
            asxVar.f2277c = ((Integer) asqVar.f2260a.get("android:visibility:visibility")).intValue();
            asxVar.f2279e = (ViewGroup) asqVar.f2260a.get("android:visibility:parent");
        }
        if (asqVar2 == null || !asqVar2.f2260a.containsKey("android:visibility:visibility")) {
            asxVar.f2278d = -1;
            asxVar.f2280f = null;
        } else {
            asxVar.f2278d = ((Integer) asqVar2.f2260a.get("android:visibility:visibility")).intValue();
            asxVar.f2280f = (ViewGroup) asqVar2.f2260a.get("android:visibility:parent");
        }
        if (asqVar != null && asqVar2 != null) {
            int i = asxVar.f2277c;
            int i2 = asxVar.f2278d;
            if (i == i2 && asxVar.f2279e == asxVar.f2280f) {
                return asxVar;
            }
            if (i != i2) {
                if (i == 0) {
                    asxVar.f2276b = false;
                    asxVar.f2275a = true;
                }
            } else if (asxVar.f2280f == null) {
                asxVar.f2276b = false;
                asxVar.f2275a = true;
            }
        } else if (asqVar == null && asxVar.f2278d == 0) {
            asxVar.f2276b = true;
            asxVar.f2275a = true;
        } else if (asqVar2 == null) {
        }
        return asxVar;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x008c  */
    /* JADX WARN: Code duplicated, block: B:69:0x019a  */
    /* JADX WARN: Code duplicated, block: B:77:0x01cd  */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (m1977I(m1939i(r1, false), m1940j(r1, false)).f2275a == false) goto L19;
     */
    @Override // p000.asf
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator mo1899a(ViewGroup viewGroup, asq asqVar, asq asqVar2) {
        boolean z;
        ViewGroup viewGroup2;
        View view;
        Bitmap bitmapM1968a;
        asq asqVar3;
        asx asxVarM1977I = m1977I(asqVar, asqVar2);
        if (!asxVarM1977I.f2275a) {
            return null;
        }
        if (asxVarM1977I.f2279e == null && asxVarM1977I.f2280f == null) {
            return null;
        }
        boolean z2 = true;
        int i = 0;
        if (asxVarM1977I.f2276b) {
            if ((this.f2282n & 1) == 1 && asqVar2 != null) {
                if (asqVar == null) {
                    View view2 = (View) asqVar2.f2261b.getParent();
                }
                return mo1905e(asqVar2.f2261b, asqVar);
            }
            return null;
        }
        int i2 = asxVarM1977I.f2278d;
        if ((this.f2282n & 2) != 2 || asqVar == null) {
            return null;
        }
        View view3 = asqVar.f2261b;
        View view4 = asqVar2 != null ? asqVar2.f2261b : null;
        View view5 = (View) view3.getTag(C0100R.id.save_overlay_view);
        if (view5 != null) {
            i2 = i2;
            view4 = null;
        } else {
            if (view4 == null || view4.getParent() == null) {
                if (view4 != null) {
                    view5 = view4;
                    view4 = null;
                    z = false;
                } else {
                    view4 = null;
                    view5 = null;
                    z = true;
                }
            } else if (i2 == 4 || view3 == view4) {
                view5 = null;
                z = false;
            } else {
                view4 = null;
                view5 = null;
                z = true;
            }
            if (!z) {
                z2 = false;
            } else if (view3.getParent() == null) {
                i2 = i2;
                view5 = view3;
                z2 = false;
            } else {
                if (view3.getParent() instanceof View) {
                    View view6 = (View) view3.getParent();
                    if (m1977I(m1940j(view6, true), m1939i(view6, true)).f2275a) {
                        View view7 = view4;
                        int id = view6.getId();
                        if (view6.getParent() == null && id != -1) {
                            viewGroup.findViewById(id);
                        }
                        view4 = view7;
                    } else {
                        Matrix matrix = new Matrix();
                        matrix.setTranslate(-view6.getScrollX(), -view6.getScrollY());
                        int i3 = asu.f2264b;
                        view3.transformMatrixToGlobal(matrix);
                        viewGroup.transformMatrixToLocal(matrix);
                        RectF rectF = new RectF(0.0f, 0.0f, view3.getWidth(), view3.getHeight());
                        matrix.mapRect(rectF);
                        int iRound = Math.round(rectF.left);
                        int iRound2 = Math.round(rectF.top);
                        int iRound3 = Math.round(rectF.right);
                        int iRound4 = Math.round(rectF.bottom);
                        ImageView imageView = new ImageView(view3.getContext());
                        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        boolean z3 = !aso.m1966a(view3);
                        boolean zM1966a = aso.m1966a(viewGroup);
                        if (z3) {
                            if (zM1966a) {
                                viewGroup2 = (ViewGroup) view3.getParent();
                                int iIndexOfChild = viewGroup2.indexOfChild(view3);
                                asn.m1964a(viewGroup, view3);
                                i = iIndexOfChild;
                            } else {
                                view = view4;
                                i2 = i2;
                                bitmapM1968a = null;
                            }
                            if (bitmapM1968a != null) {
                                imageView.setImageBitmap(bitmapM1968a);
                            }
                            imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
                            imageView.layout(iRound, iRound2, iRound3, iRound4);
                            view5 = imageView;
                            view4 = view;
                            z2 = false;
                        } else {
                            viewGroup2 = null;
                        }
                        view = view4;
                        int iRound5 = Math.round(rectF.width());
                        i2 = i2;
                        int iRound6 = Math.round(rectF.height());
                        if (iRound5 <= 0 || iRound6 <= 0) {
                            bitmapM1968a = null;
                        } else {
                            float fMin = Math.min(1.0f, 1048576.0f / (iRound5 * iRound6));
                            int iRound7 = Math.round(iRound5 * fMin);
                            int iRound8 = Math.round(iRound6 * fMin);
                            matrix.postTranslate(-rectF.left, -rectF.top);
                            matrix.postScale(fMin, fMin);
                            Picture picture = new Picture();
                            Canvas canvasBeginRecording = picture.beginRecording(iRound7, iRound8);
                            canvasBeginRecording.concat(matrix);
                            view3.draw(canvasBeginRecording);
                            picture.endRecording();
                            bitmapM1968a = asp.m1968a(picture);
                        }
                        if (z3) {
                            asn.m1965b(viewGroup, view3);
                            viewGroup2.addView(view3, i);
                        }
                        if (bitmapM1968a != null) {
                            imageView.setImageBitmap(bitmapM1968a);
                        }
                        imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
                        imageView.layout(iRound, iRound2, iRound3, iRound4);
                        view5 = imageView;
                        view4 = view;
                        z2 = false;
                    }
                }
                z2 = false;
            }
        }
        if (view5 == null) {
            if (view4 == null) {
                return null;
            }
            int visibility = view4.getVisibility();
            int i4 = asu.f2264b;
            view4.setTransitionVisibility(0);
            Animator animatorMo1906f = mo1906f(view4, asqVar);
            if (animatorMo1906f == null) {
                view4.setTransitionVisibility(visibility);
                return animatorMo1906f;
            }
            asw aswVar = new asw(view4, i2);
            animatorMo1906f.addListener(aswVar);
            ari.m1889a(animatorMo1906f, aswVar);
            m1953w(aswVar);
            return animatorMo1906f;
        }
        if (z2) {
            asqVar3 = asqVar;
        } else {
            asqVar3 = asqVar;
            int[] iArr = (int[]) asqVar3.f2260a.get("android:visibility:screenLocation");
            int i5 = iArr[0];
            int i6 = iArr[1];
            int[] iArr2 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            view5.offsetLeftAndRight((i5 - iArr2[0]) - view5.getLeft());
            view5.offsetTopAndBottom((i6 - iArr2[1]) - view5.getTop());
            viewGroup.getOverlay().add(view5);
        }
        Animator animatorMo1906f2 = mo1906f(view5, asqVar3);
        if (z2) {
            return animatorMo1906f2;
        }
        if (animatorMo1906f2 == null) {
            viewGroup.getOverlay().remove(view5);
            return animatorMo1906f2;
        }
        view3.setTag(C0100R.id.save_overlay_view, view5);
        m1953w(new asv(this, viewGroup, view5, view3));
        return animatorMo1906f2;
    }

    @Override // p000.asf
    /* JADX INFO: renamed from: b */
    public final void mo1900b(asq asqVar) {
        m1976H(asqVar);
    }

    @Override // p000.asf
    /* JADX INFO: renamed from: c */
    public void mo1901c(asq asqVar) {
        throw null;
    }

    @Override // p000.asf
    /* JADX INFO: renamed from: d */
    public final String[] mo1902d() {
        return f2281o;
    }

    /* JADX INFO: renamed from: e */
    public Animator mo1905e(View view, asq asqVar) {
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public Animator mo1906f(View view, asq asqVar) {
        throw null;
    }

    @Override // p000.asf
    /* JADX INFO: renamed from: u */
    public final boolean mo1951u(asq asqVar, asq asqVar2) {
        if (asqVar == null && asqVar2 == null) {
            return false;
        }
        if (asqVar != null && asqVar2 != null && asqVar2.f2260a.containsKey("android:visibility:visibility") != asqVar.f2260a.containsKey("android:visibility:visibility")) {
            return false;
        }
        asx asxVarM1977I = m1977I(asqVar, asqVar2);
        if (asxVarM1977I.f2275a) {
            return asxVarM1977I.f2277c == 0 || asxVarM1977I.f2278d == 0;
        }
        return false;
    }
}
