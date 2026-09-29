package p000;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.R$id;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class hwa extends daa {

    /* JADX INFO: renamed from: f0 */
    public static final String[] f43080f0 = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: e0 */
    public int f43081e0;

    public hwa(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43081e0 = 3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ywc.f70606d);
        int iM17380d = nda.m17380d(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (iM17380d != 0) {
            m13545b0(iM17380d);
        }
    }

    /* JADX INFO: renamed from: W */
    public static void m13543W(waa waaVar) {
        View view = waaVar.f66571b;
        int visibility = view.getVisibility();
        HashMap map = waaVar.f66570a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    /* JADX INFO: renamed from: X */
    public static c68 m13544X(waa waaVar, waa waaVar2) {
        c68 c68Var = new c68();
        c68Var.f9638a = false;
        c68Var.f9639b = false;
        if (waaVar != null) {
            HashMap map = waaVar.f66570a;
            if (map.containsKey("android:visibility:visibility")) {
                c68Var.f9640c = ((Integer) map.get("android:visibility:visibility")).intValue();
                c68Var.f9642e = (ViewGroup) map.get("android:visibility:parent");
            } else {
                c68Var.f9640c = -1;
                c68Var.f9642e = null;
            }
        } else {
            c68Var.f9640c = -1;
            c68Var.f9642e = null;
        }
        if (waaVar2 != null) {
            HashMap map2 = waaVar2.f66570a;
            if (map2.containsKey("android:visibility:visibility")) {
                c68Var.f9641d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                c68Var.f9643f = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                c68Var.f9641d = -1;
                c68Var.f9643f = null;
            }
        } else {
            c68Var.f9641d = -1;
            c68Var.f9643f = null;
        }
        if (waaVar != null && waaVar2 != null) {
            int i = c68Var.f9640c;
            int i2 = c68Var.f9641d;
            if (i != i2 || ((ViewGroup) c68Var.f9642e) != ((ViewGroup) c68Var.f9643f)) {
                if (i != i2) {
                    if (i == 0) {
                        c68Var.f9639b = false;
                        c68Var.f9638a = true;
                        return c68Var;
                    }
                    if (i2 == 0) {
                        c68Var.f9639b = true;
                        c68Var.f9638a = true;
                        return c68Var;
                    }
                } else {
                    if (((ViewGroup) c68Var.f9643f) == null) {
                        c68Var.f9639b = false;
                        c68Var.f9638a = true;
                        return c68Var;
                    }
                    if (((ViewGroup) c68Var.f9642e) == null) {
                        c68Var.f9639b = true;
                        c68Var.f9638a = true;
                        return c68Var;
                    }
                }
            }
        } else {
            if (waaVar == null && c68Var.f9641d == 0) {
                c68Var.f9639b = true;
                c68Var.f9638a = true;
                return c68Var;
            }
            if (waaVar2 == null && c68Var.f9640c == 0) {
                c68Var.f9639b = false;
                c68Var.f9638a = true;
            }
        }
        return c68Var;
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: C */
    public final boolean mo10184C(waa waaVar, waa waaVar2) {
        if (waaVar == null && waaVar2 == null) {
            return false;
        }
        if (waaVar != null && waaVar2 != null && waaVar2.f66570a.containsKey("android:visibility:visibility") != waaVar.f66570a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c68 c68VarM13544X = m13544X(waaVar, waaVar2);
        if (c68VarM13544X.f9638a) {
            return c68VarM13544X.f9640c == 0 || c68VarM13544X.f9641d == 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: Y */
    public abstract Animator mo3531Y(ViewGroup viewGroup, View view, waa waaVar, waa waaVar2);

    /* JADX INFO: renamed from: a0 */
    public abstract Animator mo3532a0(ViewGroup viewGroup, View view, waa waaVar, waa waaVar2);

    /* JADX INFO: renamed from: b0 */
    public final void m13545b0(int i) {
        if ((i & (-4)) == 0) {
            this.f43081e0 = i;
        } else {
            C3386nv.m17626m("Only MODE_IN and MODE_OUT flags are allowed");
        }
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: g */
    public void mo3042g(waa waaVar) {
        m13543W(waaVar);
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: j */
    public void mo3043j(waa waaVar) {
        m13543W(waaVar);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        if (m13544X(m10217v(r1, false), m10219z(r1, false)).f9638a != false) goto L77;
     */
    @Override // p000.daa
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator mo3044o(ViewGroup viewGroup, waa waaVar, waa waaVar2) {
        View view;
        boolean z;
        View view2;
        boolean z2;
        c68 c68VarM13544X = m13544X(waaVar, waaVar2);
        if (c68VarM13544X.f9638a && (((ViewGroup) c68VarM13544X.f9642e) != null || ((ViewGroup) c68VarM13544X.f9643f) != null)) {
            if (!c68VarM13544X.f9639b) {
                int i = c68VarM13544X.f9641d;
                if ((this.f43081e0 & 2) == 2 && waaVar != null) {
                    View view3 = waaVar.f66571b;
                    View viewM16028b = waaVar2 != null ? waaVar2.f66571b : null;
                    View view4 = (View) view3.getTag(R$id.save_overlay_view);
                    if (view4 != null) {
                        view2 = null;
                        z2 = true;
                    } else {
                        if (viewM16028b == null || viewM16028b.getParent() == null) {
                            if (viewM16028b != null) {
                                view = null;
                                z = false;
                            } else {
                                viewM16028b = null;
                                view = null;
                                z = true;
                            }
                        } else if (i == 4 || view3 == viewM16028b) {
                            z = false;
                            view = viewM16028b;
                            viewM16028b = null;
                        } else {
                            viewM16028b = null;
                            view = null;
                            z = true;
                        }
                        if (!z) {
                            View view5 = view;
                            view4 = viewM16028b;
                            view2 = view5;
                            z2 = false;
                        } else if (view3.getParent() == null) {
                            z2 = false;
                            view2 = view;
                            view4 = view3;
                        } else {
                            if (view3.getParent() instanceof View) {
                                View view6 = (View) view3.getParent();
                                if (m13544X(m10219z(view6, true), m10217v(view6, true)).f9638a) {
                                    int id = view6.getId();
                                    if (view6.getParent() == null && id != -1) {
                                        viewGroup.findViewById(id);
                                    }
                                } else {
                                    viewM16028b = l8d.m16028b(viewGroup, view3, view6);
                                }
                            }
                            View view7 = view;
                            view4 = viewM16028b;
                            view2 = view7;
                            z2 = false;
                        }
                    }
                    if (view4 != null) {
                        if (!z2) {
                            int[] iArr = (int[]) waaVar.f66570a.get("android:visibility:screenLocation");
                            int i2 = iArr[0];
                            int i3 = iArr[1];
                            int[] iArr2 = new int[2];
                            viewGroup.getLocationOnScreen(iArr2);
                            view4.offsetLeftAndRight((i2 - iArr2[0]) - view4.getLeft());
                            view4.offsetTopAndBottom((i3 - iArr2[1]) - view4.getTop());
                            viewGroup.getOverlay().add(view4);
                        }
                        Animator animatorMo3532a0 = mo3532a0(viewGroup, view4, waaVar, waaVar2);
                        if (!z2) {
                            if (animatorMo3532a0 == null) {
                                viewGroup.getOverlay().remove(view4);
                                return animatorMo3532a0;
                            }
                            view3.setTag(R$id.save_overlay_view, view4);
                            gwa gwaVar = new gwa(this, viewGroup, view4, view3);
                            animatorMo3532a0.addListener(gwaVar);
                            animatorMo3532a0.addPauseListener(gwaVar);
                            m10218w().m10202a(gwaVar);
                        }
                        return animatorMo3532a0;
                    }
                    if (view2 != null) {
                        int visibility = view2.getVisibility();
                        awa.m3103d(view2, 0);
                        Animator animatorMo3532a1 = mo3532a0(viewGroup, view2, waaVar, waaVar2);
                        if (animatorMo3532a1 == null) {
                            awa.m3103d(view2, visibility);
                            return animatorMo3532a1;
                        }
                        fwa fwaVar = new fwa(view2, i);
                        animatorMo3532a1.addListener(fwaVar);
                        m10218w().m10202a(fwaVar);
                        return animatorMo3532a1;
                    }
                }
            } else if ((this.f43081e0 & 1) == 1 && waaVar2 != null) {
                View view8 = waaVar2.f66571b;
                if (waaVar == null) {
                    View view9 = (View) view8.getParent();
                }
                return mo3531Y(viewGroup, view8, waaVar, waaVar2);
            }
        }
        return null;
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: y */
    public final String[] mo3045y() {
        return f43080f0;
    }

    public hwa() {
        this.f43081e0 = 3;
    }
}
