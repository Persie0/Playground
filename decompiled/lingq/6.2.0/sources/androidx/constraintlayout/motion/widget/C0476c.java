package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.R$id;
import androidx.constraintlayout.widget.R$styleable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC3393o1;
import p000.a34;
import p000.cj1;
import p000.ck6;
import p000.di4;
import p000.ej1;
import p000.fo2;
import p000.hj1;
import p000.ho2;
import p000.m36;
import p000.n36;
import p000.nj1;
import p000.oj1;
import p000.pj1;
import p000.qad;
import p000.qj1;
import p000.rj1;
import p000.sj1;
import p000.uva;
import p000.x26;
import p000.y26;
import p000.y7a;
import p000.ztb;

/* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C0476c {

    /* JADX INFO: renamed from: a */
    public final AbstractC0475b f5423a;

    /* JADX INFO: renamed from: b */
    public final ztb f5424b;

    /* JADX INFO: renamed from: c */
    public n36 f5425c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f5426d;

    /* JADX INFO: renamed from: e */
    public final n36 f5427e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f5428f;

    /* JADX INFO: renamed from: g */
    public final SparseArray f5429g;

    /* JADX INFO: renamed from: h */
    public final HashMap f5430h;

    /* JADX INFO: renamed from: i */
    public final SparseIntArray f5431i;

    /* JADX INFO: renamed from: j */
    public int f5432j;

    /* JADX INFO: renamed from: k */
    public int f5433k;

    /* JADX INFO: renamed from: l */
    public MotionEvent f5434l;

    /* JADX INFO: renamed from: m */
    public boolean f5435m;

    /* JADX INFO: renamed from: n */
    public boolean f5436n;

    /* JADX INFO: renamed from: o */
    public ck6 f5437o;

    /* JADX INFO: renamed from: p */
    public boolean f5438p;

    /* JADX INFO: renamed from: q */
    public final a34 f5439q;

    /* JADX INFO: renamed from: r */
    public float f5440r;

    /* JADX INFO: renamed from: s */
    public float f5441s;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public C0476c(Context context, AbstractC0475b abstractC0475b, int i) {
        this.f5424b = null;
        this.f5425c = null;
        ArrayList arrayList = new ArrayList();
        this.f5426d = arrayList;
        this.f5427e = null;
        this.f5428f = new ArrayList();
        this.f5429g = new SparseArray();
        this.f5430h = new HashMap();
        this.f5431i = new SparseIntArray();
        this.f5432j = 400;
        this.f5433k = 0;
        this.f5435m = false;
        this.f5436n = false;
        this.f5423a = abstractC0475b;
        a34 a34Var = new a34();
        a34Var.f174b = new ArrayList();
        a34Var.f176d = "ViewTransitionController";
        a34Var.f178f = new ArrayList();
        a34Var.f173a = abstractC0475b;
        this.f5439q = a34Var;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            n36 n36Var = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                m1957h(context, xml);
                            }
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                di4 di4Var = new di4(context, xml);
                                if (n36Var != null) {
                                    n36Var.f52280k.add(di4Var);
                                }
                            }
                            break;
                        case -687739768:
                            if (name.equals("Include")) {
                                m1959j(context, xml);
                            }
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                uva uvaVar = new uva(context, xml);
                                a34 a34Var2 = this.f5439q;
                                ((ArrayList) a34Var2.f174b).add(uvaVar);
                                a34Var2.f175c = null;
                                int i2 = uvaVar.f64416b;
                                if (i2 == 4) {
                                    a34.m60d(uvaVar);
                                } else if (i2 == 5) {
                                    a34.m60d(uvaVar);
                                }
                            }
                            break;
                        case 269306229:
                            if (name.equals("Transition")) {
                                n36Var = new n36(this, context, xml);
                                boolean z = n36Var.f52271b;
                                arrayList.add(n36Var);
                                if (this.f5425c == null && !z) {
                                    this.f5425c = n36Var;
                                    y7a y7aVar = n36Var.f52281l;
                                    if (y7aVar != null) {
                                        y7aVar.m24981c(this.f5438p);
                                    }
                                }
                                if (z) {
                                    if (n36Var.f52272c == -1) {
                                        this.f5427e = n36Var;
                                    } else {
                                        this.f5428f.add(n36Var);
                                    }
                                    arrayList.remove(n36Var);
                                }
                            }
                            break;
                        case 312750793:
                            if (name.equals("OnClick") && n36Var != null && !abstractC0475b.isInEditMode()) {
                                n36Var.f52282m.add(new m36(context, n36Var, xml));
                            }
                            break;
                        case 327855227:
                            if (name.equals("OnSwipe")) {
                                if (n36Var == null) {
                                    Log.v("MotionScene", " OnSwipe (" + context.getResources().getResourceEntryName(i) + ".xml:" + xml.getLineNumber() + ")");
                                }
                                if (n36Var != null) {
                                    n36Var.f52281l = new y7a(context, abstractC0475b, xml);
                                }
                            }
                            break;
                        case 793277014:
                            if (name.equals("MotionScene")) {
                                m1960k(context, xml);
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                this.f5424b = new ztb(context, xml);
                            }
                            break;
                        case 1942574248:
                            if (name.equals("include")) {
                                m1959j(context, xml);
                            }
                            break;
                    }
                }
            }
        } catch (IOException e) {
            Log.e("MotionScene", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("MotionScene", "Error parsing resource: " + i, e2);
        }
        this.f5429g.put(R$id.motion_base, new sj1());
        this.f5430h.put("motion_base", Integer.valueOf(R$id.motion_base));
    }

    /* JADX INFO: renamed from: c */
    public static int m1950c(Context context, String str) {
        int identifier;
        if (str.contains("/")) {
            identifier = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            identifier = -1;
        }
        if (identifier == -1) {
            if (str.length() > 1) {
                return Integer.parseInt(str.substring(1));
            }
            Log.e("MotionScene", "error in parsing id");
        }
        return identifier;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1951a(int i, AbstractC0475b abstractC0475b) {
        n36 n36Var;
        if (this.f5437o != null) {
            return false;
        }
        for (n36 n36Var2 : this.f5426d) {
            int i2 = n36Var2.f52283n;
            if (i2 != 0 && ((n36Var = this.f5425c) != n36Var2 || (n36Var.f52287r & 2) == 0)) {
                if (i == n36Var2.f52273d && (i2 == 4 || i2 == 2)) {
                    MotionLayout$TransitionState motionLayout$TransitionState = MotionLayout$TransitionState.FINISHED;
                    abstractC0475b.setState(motionLayout$TransitionState);
                    abstractC0475b.setTransition(n36Var2);
                    if (n36Var2.f52283n == 4) {
                        abstractC0475b.m1939p(1.0f);
                        abstractC0475b.f5376J0 = null;
                        abstractC0475b.setState(MotionLayout$TransitionState.SETUP);
                        abstractC0475b.setState(MotionLayout$TransitionState.MOVING);
                        return true;
                    }
                    abstractC0475b.setProgress(1.0f);
                    abstractC0475b.m1941r(true);
                    abstractC0475b.setState(MotionLayout$TransitionState.SETUP);
                    abstractC0475b.setState(MotionLayout$TransitionState.MOVING);
                    abstractC0475b.setState(motionLayout$TransitionState);
                    abstractC0475b.m1944u();
                    return true;
                }
                if (i == n36Var2.f52272c && (i2 == 3 || i2 == 1)) {
                    MotionLayout$TransitionState motionLayout$TransitionState2 = MotionLayout$TransitionState.FINISHED;
                    abstractC0475b.setState(motionLayout$TransitionState2);
                    abstractC0475b.setTransition(n36Var2);
                    if (n36Var2.f52283n == 3) {
                        abstractC0475b.m1939p(0.0f);
                        abstractC0475b.setState(MotionLayout$TransitionState.SETUP);
                        abstractC0475b.setState(MotionLayout$TransitionState.MOVING);
                        return true;
                    }
                    abstractC0475b.setProgress(0.0f);
                    abstractC0475b.m1941r(true);
                    abstractC0475b.setState(MotionLayout$TransitionState.SETUP);
                    abstractC0475b.setState(MotionLayout$TransitionState.MOVING);
                    abstractC0475b.setState(motionLayout$TransitionState2);
                    abstractC0475b.m1944u();
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final sj1 m1952b(int i) {
        int iM25786h;
        ztb ztbVar = this.f5424b;
        if (ztbVar != null && (iM25786h = ztbVar.m25786h(i)) != -1) {
            i = iM25786h;
        }
        SparseArray sparseArray = this.f5429g;
        if (sparseArray.get(i) != null) {
            return (sj1) sparseArray.get(i);
        }
        Log.e("MotionScene", "Warning could not find ConstraintSet id/" + qad.m19841c(this.f5423a.getContext(), i) + " In MotionScene");
        return (sj1) sparseArray.get(sparseArray.keyAt(0));
    }

    /* JADX INFO: renamed from: d */
    public final Interpolator m1953d() {
        n36 n36Var = this.f5425c;
        int i = n36Var.f52274e;
        if (i == -2) {
            return AnimationUtils.loadInterpolator(this.f5423a.getContext(), this.f5425c.f52276g);
        }
        if (i == -1) {
            return new x26(fo2.m11964d(n36Var.f52275f), 1);
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new BounceInterpolator();
        }
        if (i == 5) {
            return new OvershootInterpolator();
        }
        if (i != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    /* JADX INFO: renamed from: e */
    public final void m1954e(y26 y26Var) {
        n36 n36Var = this.f5425c;
        if (n36Var != null) {
            Iterator it = n36Var.f52280k.iterator();
            while (it.hasNext()) {
                ((di4) it.next()).m10403a(y26Var);
            }
        } else {
            n36 n36Var2 = this.f5427e;
            if (n36Var2 != null) {
                Iterator it2 = n36Var2.f52280k.iterator();
                while (it2.hasNext()) {
                    ((di4) it2.next()).m10403a(y26Var);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final float m1955f() {
        y7a y7aVar;
        n36 n36Var = this.f5425c;
        if (n36Var == null || (y7aVar = n36Var.f52281l) == null) {
            return 0.0f;
        }
        return y7aVar.f69445t;
    }

    /* JADX INFO: renamed from: g */
    public final int m1956g() {
        n36 n36Var = this.f5425c;
        if (n36Var == null) {
            return -1;
        }
        return n36Var.f52273d;
    }

    /* JADX INFO: renamed from: h */
    public final int m1957h(Context context, XmlResourceParser xmlResourceParser) {
        sj1 sj1Var = new sj1();
        sj1Var.f60921f = false;
        int attributeCount = xmlResourceParser.getAttributeCount();
        int iM1950c = -1;
        int iM1950c2 = -1;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            attributeName.getClass();
            switch (attributeName) {
                case "deriveConstraintsFrom":
                    iM1950c2 = m1950c(context, attributeValue);
                    break;
                case "constraintRotate":
                    try {
                        sj1Var.f60919d = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.getClass();
                        switch (attributeValue) {
                            case "x_left":
                                sj1Var.f60919d = 4;
                                break;
                            case "left":
                                sj1Var.f60919d = 2;
                                break;
                            case "none":
                                sj1Var.f60919d = 0;
                                break;
                            case "right":
                                sj1Var.f60919d = 1;
                                break;
                            case "x_right":
                                sj1Var.f60919d = 3;
                                break;
                        }
                    }
                    break;
                case "id":
                    iM1950c = m1950c(context, attributeValue);
                    int iIndexOf = attributeValue.indexOf(47);
                    if (iIndexOf >= 0) {
                        attributeValue = attributeValue.substring(iIndexOf + 1);
                    }
                    this.f5430h.put(attributeValue, Integer.valueOf(iM1950c));
                    sj1Var.f60916a = qad.m19841c(context, iM1950c);
                    break;
                case "stateLabels":
                    sj1Var.f60918c = attributeValue.split(",");
                    int i2 = 0;
                    while (true) {
                        String[] strArr = sj1Var.f60918c;
                        if (i2 < strArr.length) {
                            strArr[i2] = strArr[i2].trim();
                            i2++;
                        }
                    }
                    break;
            }
        }
        if (iM1950c != -1) {
            int i3 = this.f5423a.f5404h0;
            sj1Var.m21414k(context, xmlResourceParser);
            if (iM1950c2 != -1) {
                this.f5431i.put(iM1950c, iM1950c2);
            }
            this.f5429g.put(iM1950c, sj1Var);
        }
        return iM1950c;
    }

    /* JADX INFO: renamed from: i */
    public final int m1958i(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return m1957h(context, xml);
                }
            }
            return -1;
        } catch (IOException e) {
            Log.e("MotionScene", "Error parsing resource: " + i, e);
            return -1;
        } catch (XmlPullParserException e2) {
            Log.e("MotionScene", "Error parsing resource: " + i, e2);
            return -1;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m1959j(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.include);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == R$styleable.include_constraintSet) {
                m1958i(context, typedArrayObtainStyledAttributes.getResourceId(index, -1));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: k */
    public final void m1960k(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.MotionScene);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == R$styleable.MotionScene_defaultDuration) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f5432j);
                this.f5432j = i2;
                if (i2 < 8) {
                    this.f5432j = 8;
                }
            } else if (index == R$styleable.MotionScene_layoutDuringTransition) {
                this.f5433k = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: l */
    public final void m1961l(int i, AbstractC0475b abstractC0475b) {
        SparseArray sparseArray = this.f5429g;
        sj1 sj1Var = (sj1) sparseArray.get(i);
        String str = sj1Var.f60916a;
        HashMap map = sj1Var.f60922g;
        sj1Var.f60917b = str;
        int i2 = this.f5431i.get(i);
        if (i2 > 0) {
            m1961l(i2, abstractC0475b);
            sj1 sj1Var2 = (sj1) sparseArray.get(i2);
            if (sj1Var2 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + qad.m19841c(this.f5423a.getContext(), i2));
                return;
            }
            HashMap map2 = sj1Var2.f60922g;
            sj1Var.f60917b += "/" + sj1Var2.f60917b;
            for (Integer num : map2.keySet()) {
                num.getClass();
                nj1 nj1Var = (nj1) map2.get(num);
                if (!map.containsKey(num)) {
                    map.put(num, new nj1());
                }
                nj1 nj1Var2 = (nj1) map.get(num);
                if (nj1Var2 != null) {
                    oj1 oj1Var = nj1Var2.f52823e;
                    if (!oj1Var.f54418b) {
                        oj1Var.m18037a(nj1Var.f52823e);
                    }
                    qj1 qj1Var = nj1Var2.f52821c;
                    if (!qj1Var.f57843a) {
                        qj1Var.m19999a(nj1Var.f52821c);
                    }
                    rj1 rj1Var = nj1Var2.f52824f;
                    if (!rj1Var.f59387a) {
                        rj1Var.m20673a(nj1Var.f52824f);
                    }
                    pj1 pj1Var = nj1Var2.f52822d;
                    if (!pj1Var.f56297a) {
                        pj1Var.m19193a(nj1Var.f52822d);
                    }
                    for (String str2 : nj1Var.f52825g.keySet()) {
                        if (!nj1Var2.f52825g.containsKey(str2)) {
                            nj1Var2.f52825g.put(str2, (cj1) nj1Var.f52825g.get(str2));
                        }
                    }
                }
            }
        } else {
            sj1Var.f60917b = AbstractC3393o1.m17738m(new StringBuilder(), sj1Var.f60917b, "  layout");
            int childCount = abstractC0475b.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = abstractC0475b.getChildAt(i3);
                hj1 hj1Var = (hj1) childAt.getLayoutParams();
                int id = childAt.getId();
                if (sj1Var.f60921f && id == -1) {
                    ho2.m13385e("All children of ConstraintLayout must have ids to use ConstraintSet");
                    return;
                }
                if (!map.containsKey(Integer.valueOf(id))) {
                    map.put(Integer.valueOf(id), new nj1());
                }
                nj1 nj1Var3 = (nj1) map.get(Integer.valueOf(id));
                if (nj1Var3 != null) {
                    qj1 qj1Var2 = nj1Var3.f52821c;
                    oj1 oj1Var2 = nj1Var3.f52823e;
                    rj1 rj1Var2 = nj1Var3.f52824f;
                    if (!oj1Var2.f54418b) {
                        nj1.m17456a(nj1Var3, id, hj1Var);
                        if (childAt instanceof ej1) {
                            oj1Var2.f54435j0 = ((ej1) childAt).getReferencedIds();
                            if (childAt instanceof Barrier) {
                                Barrier barrier = (Barrier) childAt;
                                oj1Var2.f54445o0 = barrier.getAllowsGoneWidget();
                                oj1Var2.f54429g0 = barrier.getType();
                                oj1Var2.f54431h0 = barrier.getMargin();
                            }
                        }
                        oj1Var2.f54418b = true;
                    }
                    if (!qj1Var2.f57843a) {
                        qj1Var2.f57844b = childAt.getVisibility();
                        qj1Var2.f57846d = childAt.getAlpha();
                        qj1Var2.f57843a = true;
                    }
                    if (!rj1Var2.f59387a) {
                        rj1Var2.f59387a = true;
                        rj1Var2.f59388b = childAt.getRotation();
                        rj1Var2.f59389c = childAt.getRotationX();
                        rj1Var2.f59390d = childAt.getRotationY();
                        rj1Var2.f59391e = childAt.getScaleX();
                        rj1Var2.f59392f = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (pivotX != 0.0d || pivotY != 0.0d) {
                            rj1Var2.f59393g = pivotX;
                            rj1Var2.f59394h = pivotY;
                        }
                        rj1Var2.f59396j = childAt.getTranslationX();
                        rj1Var2.f59397k = childAt.getTranslationY();
                        rj1Var2.f59398l = childAt.getTranslationZ();
                        if (rj1Var2.f59399m) {
                            rj1Var2.f59400n = childAt.getElevation();
                        }
                    }
                }
            }
        }
        for (nj1 nj1Var4 : map.values()) {
            if (nj1Var4.f52826h != null) {
                if (nj1Var4.f52820b == null) {
                    nj1Var4.f52826h.m16854e(sj1Var.m21412i(nj1Var4.f52819a));
                } else {
                    Iterator it = map.keySet().iterator();
                    while (it.hasNext()) {
                        nj1 nj1VarM21412i = sj1Var.m21412i(((Integer) it.next()).intValue());
                        String str3 = nj1VarM21412i.f52823e.f54439l0;
                        if (str3 != null && nj1Var4.f52820b.matches(str3)) {
                            nj1Var4.f52826h.m16854e(nj1VarM21412i);
                            nj1VarM21412i.f52825g.putAll((HashMap) nj1Var4.f52825g.clone());
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0031  */
    /* JADX WARN: Code duplicated, block: B:32:0x004b  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: m */
    public final void m1962m(int i, int i2) {
        int iM25786h;
        int iM25786h2;
        n36 n36Var;
        ArrayList arrayList;
        Iterator it;
        n36 n36Var2;
        n36 n36Var3;
        n36 n36Var4;
        int i3;
        y7a y7aVar;
        ztb ztbVar = this.f5424b;
        if (ztbVar != null) {
            iM25786h = ztbVar.m25786h(i);
            if (iM25786h == -1) {
                iM25786h = i;
            }
            iM25786h2 = ztbVar.m25786h(i2);
            if (iM25786h2 == -1) {
            }
            n36Var = this.f5425c;
            if (n36Var == null && n36Var.f52272c == i2 && n36Var.f52273d == i) {
                return;
            }
            arrayList = this.f5426d;
            it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    n36Var2 = this.f5427e;
                    for (n36 n36Var5 : this.f5428f) {
                        if (n36Var5.f52272c == i2) {
                            n36Var2 = n36Var5;
                        }
                    }
                    n36Var3 = new n36(this, n36Var2);
                    n36Var3.f52273d = iM25786h;
                    n36Var3.f52272c = iM25786h2;
                    if (iM25786h != -1) {
                        arrayList.add(n36Var3);
                    }
                    this.f5425c = n36Var3;
                    return;
                }
                n36Var4 = (n36) it.next();
                i3 = n36Var4.f52272c;
                if ((i3 != iM25786h2 && n36Var4.f52273d == iM25786h) || (i3 == i2 && n36Var4.f52273d == i)) {
                    break;
                }
            }
            this.f5425c = n36Var4;
            y7aVar = n36Var4.f52281l;
            if (y7aVar != null) {
                y7aVar.m24981c(this.f5438p);
            }
        }
        iM25786h = i;
        iM25786h2 = i2;
        n36Var = this.f5425c;
        if (n36Var == null) {
        }
        arrayList = this.f5426d;
        it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                n36Var2 = this.f5427e;
                while (r9.hasNext()) {
                    if (n36Var5.f52272c == i2) {
                        n36Var2 = n36Var5;
                    }
                }
                n36Var3 = new n36(this, n36Var2);
                n36Var3.f52273d = iM25786h;
                n36Var3.f52272c = iM25786h2;
                if (iM25786h != -1) {
                    arrayList.add(n36Var3);
                }
                this.f5425c = n36Var3;
                return;
            }
            n36Var4 = (n36) it.next();
            i3 = n36Var4.f52272c;
            if (i3 != iM25786h2) {
            }
        }
        this.f5425c = n36Var4;
        y7aVar = n36Var4.f52281l;
        if (y7aVar != null) {
            y7aVar.m24981c(this.f5438p);
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m1963n() {
        Iterator it = this.f5426d.iterator();
        while (it.hasNext()) {
            if (((n36) it.next()).f52281l != null) {
                return true;
            }
        }
        n36 n36Var = this.f5425c;
        return (n36Var == null || n36Var.f52281l == null) ? false : true;
    }
}
