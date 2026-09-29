package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.AbstractC0475b;
import androidx.constraintlayout.motion.widget.C0476c;
import androidx.constraintlayout.widget.R$id;
import androidx.constraintlayout.widget.R$styleable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public final class uva {

    /* JADX INFO: renamed from: a */
    public int f64415a;

    /* JADX INFO: renamed from: e */
    public int f64419e;

    /* JADX INFO: renamed from: f */
    public final di4 f64420f;

    /* JADX INFO: renamed from: g */
    public final nj1 f64421g;

    /* JADX INFO: renamed from: j */
    public int f64424j;

    /* JADX INFO: renamed from: k */
    public String f64425k;

    /* JADX INFO: renamed from: o */
    public final Context f64429o;

    /* JADX INFO: renamed from: b */
    public int f64416b = -1;

    /* JADX INFO: renamed from: c */
    public boolean f64417c = false;

    /* JADX INFO: renamed from: d */
    public int f64418d = 0;

    /* JADX INFO: renamed from: h */
    public int f64422h = -1;

    /* JADX INFO: renamed from: i */
    public int f64423i = -1;

    /* JADX INFO: renamed from: l */
    public int f64426l = 0;

    /* JADX INFO: renamed from: m */
    public String f64427m = null;

    /* JADX INFO: renamed from: n */
    public int f64428n = -1;

    /* JADX INFO: renamed from: p */
    public int f64430p = -1;

    /* JADX INFO: renamed from: q */
    public int f64431q = -1;

    /* JADX INFO: renamed from: r */
    public int f64432r = -1;

    /* JADX INFO: renamed from: s */
    public int f64433s = -1;

    /* JADX INFO: renamed from: t */
    public int f64434t = -1;

    /* JADX INFO: renamed from: u */
    public int f64435u = -1;

    /* JADX WARN: Code duplicated, block: B:36:0x0097 A[Catch: IOException -> 0x0043, XmlPullParserException -> 0x0046, TryCatch #2 {IOException -> 0x0043, XmlPullParserException -> 0x0046, blocks: (B:3:0x0028, B:37:0x00ca, B:11:0x0037, B:18:0x0049, B:19:0x0051, B:36:0x0097, B:21:0x0055, B:26:0x0066, B:24:0x005e, B:27:0x006e, B:29:0x0074, B:30:0x0078, B:32:0x0080, B:33:0x0088, B:35:0x0090), top: B:42:0x0028 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:36:0x0097, please report this as an issue */
    public uva(Context context, XmlResourceParser xmlResourceParser) {
        this.f64429o = context;
        try {
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (!name.equals("ConstraintOverride")) {
                                Log.e("ViewTransition", qad.m19839a() + " unknown tag " + name);
                                StringBuilder sb = new StringBuilder();
                                sb.append(".xml:");
                                sb.append(xmlResourceParser.getLineNumber());
                                Log.e("ViewTransition", sb.toString());
                            } else {
                                this.f64421g = sj1.m21400d(context, xmlResourceParser);
                            }
                            break;
                        case -1239391468:
                            if (!name.equals("KeyFrameSet")) {
                                Log.e("ViewTransition", qad.m19839a() + " unknown tag " + name);
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(".xml:");
                                sb2.append(xmlResourceParser.getLineNumber());
                                Log.e("ViewTransition", sb2.toString());
                            } else {
                                this.f64420f = new di4(context, xmlResourceParser);
                            }
                            break;
                        case 61998586:
                            if (!name.equals("ViewTransition")) {
                                Log.e("ViewTransition", qad.m19839a() + " unknown tag " + name);
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(".xml:");
                                sb3.append(xmlResourceParser.getLineNumber());
                                Log.e("ViewTransition", sb3.toString());
                            } else {
                                m22950d(context, xmlResourceParser);
                            }
                            break;
                        case 366511058:
                            if (!name.equals("CustomMethod")) {
                                Log.e("ViewTransition", qad.m19839a() + " unknown tag " + name);
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(".xml:");
                                sb4.append(xmlResourceParser.getLineNumber());
                                Log.e("ViewTransition", sb4.toString());
                            } else {
                                cj1.m4763e(context, xmlResourceParser, this.f64421g.f52825g);
                            }
                            break;
                        case 1791837707:
                            if (!name.equals("CustomAttribute")) {
                                Log.e("ViewTransition", qad.m19839a() + " unknown tag " + name);
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append(".xml:");
                                sb5.append(xmlResourceParser.getLineNumber());
                                Log.e("ViewTransition", sb5.toString());
                            } else {
                                cj1.m4763e(context, xmlResourceParser, this.f64421g.f52825g);
                            }
                            break;
                        default:
                            Log.e("ViewTransition", qad.m19839a() + " unknown tag " + name);
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append(".xml:");
                            sb6.append(xmlResourceParser.getLineNumber());
                            Log.e("ViewTransition", sb6.toString());
                            break;
                    }
                } else if (eventType == 3 && "ViewTransition".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e) {
            Log.e("ViewTransition", "Error parsing XML resource", e);
        } catch (XmlPullParserException e2) {
            Log.e("ViewTransition", "Error parsing XML resource", e2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m22947a(a34 a34Var, AbstractC0475b abstractC0475b, int i, sj1 sj1Var, View... viewArr) {
        Interpolator interpolatorLoadInterpolator;
        Interpolator interpolator;
        if (this.f64417c) {
            return;
        }
        int i2 = this.f64419e;
        di4 di4Var = this.f64420f;
        int i3 = 0;
        if (i2 != 2) {
            nj1 nj1Var = this.f64421g;
            if (i2 == 1) {
                int[] constraintSetIds = abstractC0475b.getConstraintSetIds();
                int i4 = 0;
                while (i4 < constraintSetIds.length) {
                    int i5 = constraintSetIds[i4];
                    if (i5 != i) {
                        C0476c c0476c = abstractC0475b.f5378L;
                        sj1 sj1VarM1952b = c0476c == null ? null : c0476c.m1952b(i5);
                        int length = viewArr.length;
                        for (int i6 = i3; i6 < length; i6++) {
                            nj1 nj1VarM21412i = sj1VarM1952b.m21412i(viewArr[i6].getId());
                            if (nj1Var != null) {
                                mj1 mj1Var = nj1Var.f52826h;
                                if (mj1Var != null) {
                                    mj1Var.m16854e(nj1VarM21412i);
                                }
                                nj1VarM21412i.f52825g.putAll(nj1Var.f52825g);
                            }
                        }
                    }
                    i4++;
                    i3 = 0;
                }
            }
            sj1 sj1Var2 = new sj1();
            HashMap map = sj1Var2.f60922g;
            map.clear();
            for (Integer num : sj1Var.f60922g.keySet()) {
                nj1 nj1Var2 = (nj1) sj1Var.f60922g.get(num);
                if (nj1Var2 != null) {
                    map.put(num, nj1Var2.clone());
                }
            }
            for (View view : viewArr) {
                nj1 nj1VarM21412i2 = sj1Var2.m21412i(view.getId());
                if (nj1Var != null) {
                    mj1 mj1Var2 = nj1Var.f52826h;
                    if (mj1Var2 != null) {
                        mj1Var2.m16854e(nj1VarM21412i2);
                    }
                    nj1VarM21412i2.f52825g.putAll(nj1Var.f52825g);
                }
            }
            abstractC0475b.m1936A(i, sj1Var2);
            abstractC0475b.m1936A(R$id.view_transition, sj1Var);
            abstractC0475b.m1946w(R$id.view_transition);
            n36 n36Var = new n36(abstractC0475b.f5378L, R$id.view_transition, i);
            for (View view2 : viewArr) {
                int i7 = this.f64422h;
                if (i7 != -1) {
                    n36Var.f52277h = Math.max(i7, 8);
                }
                n36Var.f52285p = this.f64418d;
                int i8 = this.f64426l;
                String str = this.f64427m;
                int i9 = this.f64428n;
                n36Var.f52274e = i8;
                n36Var.f52275f = str;
                n36Var.f52276g = i9;
                int id = view2.getId();
                if (di4Var != null) {
                    ArrayList arrayList = (ArrayList) di4Var.f35685a.get(-1);
                    di4 di4Var2 = new di4();
                    di4Var2.f35685a = new HashMap();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        qh4 qh4VarMo3771b = ((qh4) it.next()).clone();
                        qh4VarMo3771b.f57780b = id;
                        di4Var2.m10404b(qh4VarMo3771b);
                    }
                    n36Var.f52280k.add(di4Var2);
                }
            }
            abstractC0475b.setTransition(n36Var);
            mv5 mv5Var = new mv5(19, this, viewArr);
            abstractC0475b.m1939p(1.0f);
            abstractC0475b.f5376J0 = mv5Var;
            return;
        }
        View view3 = viewArr[0];
        y26 y26Var = new y26(view3);
        i36 i36Var = y26Var.f69146f;
        i36Var.f43415c = 0.0f;
        i36Var.f43416d = 0.0f;
        y26Var.f69140H = true;
        i36Var.m13641d(view3.getX(), view3.getY(), view3.getWidth(), view3.getHeight());
        y26Var.f69147g.m13641d(view3.getX(), view3.getY(), view3.getWidth(), view3.getHeight());
        w26 w26Var = y26Var.f69148h;
        w26Var.getClass();
        view3.getX();
        view3.getY();
        view3.getWidth();
        view3.getHeight();
        w26Var.f66296c = view3.getVisibility();
        w26Var.f66298e = view3.getVisibility() != 0 ? 0.0f : view3.getAlpha();
        w26Var.f66299f = view3.getElevation();
        w26Var.f66300g = view3.getRotation();
        w26Var.f66301h = view3.getRotationX();
        w26Var.f66294a = view3.getRotationY();
        w26Var.f66302i = view3.getScaleX();
        w26Var.f66303j = view3.getScaleY();
        w26Var.f66304k = view3.getPivotX();
        w26Var.f66305l = view3.getPivotY();
        w26Var.f66289H = view3.getTranslationX();
        w26Var.f66290I = view3.getTranslationY();
        w26Var.f66291J = view3.getTranslationZ();
        w26 w26Var2 = y26Var.f69149i;
        w26Var2.getClass();
        view3.getX();
        view3.getY();
        view3.getWidth();
        view3.getHeight();
        w26Var2.f66296c = view3.getVisibility();
        w26Var2.f66298e = view3.getVisibility() == 0 ? view3.getAlpha() : 0.0f;
        w26Var2.f66299f = view3.getElevation();
        w26Var2.f66300g = view3.getRotation();
        w26Var2.f66301h = view3.getRotationX();
        w26Var2.f66294a = view3.getRotationY();
        w26Var2.f66302i = view3.getScaleX();
        w26Var2.f66303j = view3.getScaleY();
        w26Var2.f66304k = view3.getPivotX();
        w26Var2.f66305l = view3.getPivotY();
        w26Var2.f66289H = view3.getTranslationX();
        w26Var2.f66290I = view3.getTranslationY();
        w26Var2.f66291J = view3.getTranslationZ();
        ArrayList arrayList2 = (ArrayList) di4Var.f35685a.get(-1);
        if (arrayList2 != null) {
            y26Var.f69163w.addAll(arrayList2);
        }
        y26Var.m24870g(System.nanoTime(), abstractC0475b.getWidth(), abstractC0475b.getHeight());
        int i10 = this.f64422h;
        int i11 = this.f64423i;
        int i12 = this.f64416b;
        Context context = abstractC0475b.getContext();
        int i13 = this.f64426l;
        if (i13 == -2) {
            interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, this.f64428n);
        } else if (i13 == -1) {
            interpolatorLoadInterpolator = new x26(fo2.m11964d(this.f64427m), 2);
        } else if (i13 == 0) {
            interpolatorLoadInterpolator = new AccelerateDecelerateInterpolator();
        } else if (i13 == 1) {
            interpolatorLoadInterpolator = new AccelerateInterpolator();
        } else if (i13 == 2) {
            interpolatorLoadInterpolator = new DecelerateInterpolator();
        } else if (i13 == 4) {
            interpolatorLoadInterpolator = new BounceInterpolator();
        } else {
            if (i13 != 5) {
                if (i13 != 6) {
                    interpolator = null;
                } else {
                    interpolatorLoadInterpolator = new AnticipateInterpolator();
                }
                new tva(a34Var, y26Var, i10, i11, i12, interpolator, this.f64430p, this.f64431q);
            }
            interpolatorLoadInterpolator = new OvershootInterpolator();
        }
        interpolator = interpolatorLoadInterpolator;
        new tva(a34Var, y26Var, i10, i11, i12, interpolator, this.f64430p, this.f64431q);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m22948b(View view) {
        int i = this.f64432r;
        boolean z = i == -1 || view.getTag(i) != null;
        int i2 = this.f64433s;
        return z && (i2 == -1 || view.getTag(i2) == null);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m22949c(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.f64424j == -1 && this.f64425k == null) || !m22948b(view)) {
            return false;
        }
        if (view.getId() == this.f64424j) {
            return true;
        }
        return this.f64425k != null && (view.getLayoutParams() instanceof hj1) && (str = ((hj1) view.getLayoutParams()).f42440Y) != null && str.matches(this.f64425k);
    }

    /* JADX INFO: renamed from: d */
    public final void m22950d(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.ViewTransition);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == R$styleable.ViewTransition_android_id) {
                this.f64415a = typedArrayObtainStyledAttributes.getResourceId(index, this.f64415a);
            } else if (index == R$styleable.ViewTransition_motionTarget) {
                if (AbstractC0475b.f5366S0) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f64424j);
                    this.f64424j = resourceId;
                    if (resourceId == -1) {
                        this.f64425k = typedArrayObtainStyledAttributes.getString(index);
                    }
                } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                    this.f64425k = typedArrayObtainStyledAttributes.getString(index);
                } else {
                    this.f64424j = typedArrayObtainStyledAttributes.getResourceId(index, this.f64424j);
                }
            } else if (index == R$styleable.ViewTransition_onStateTransition) {
                this.f64416b = typedArrayObtainStyledAttributes.getInt(index, this.f64416b);
            } else if (index == R$styleable.ViewTransition_transitionDisable) {
                this.f64417c = typedArrayObtainStyledAttributes.getBoolean(index, this.f64417c);
            } else if (index == R$styleable.ViewTransition_pathMotionArc) {
                this.f64418d = typedArrayObtainStyledAttributes.getInt(index, this.f64418d);
            } else if (index == R$styleable.ViewTransition_duration) {
                this.f64422h = typedArrayObtainStyledAttributes.getInt(index, this.f64422h);
            } else if (index == R$styleable.ViewTransition_upDuration) {
                this.f64423i = typedArrayObtainStyledAttributes.getInt(index, this.f64423i);
            } else if (index == R$styleable.ViewTransition_viewTransitionMode) {
                this.f64419e = typedArrayObtainStyledAttributes.getInt(index, this.f64419e);
            } else if (index == R$styleable.ViewTransition_motionInterpolator) {
                int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i2 == 1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.f64428n = resourceId2;
                    if (resourceId2 != -1) {
                        this.f64426l = -2;
                    }
                } else if (i2 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f64427m = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.f64426l = -1;
                    } else {
                        this.f64428n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.f64426l = -2;
                    }
                } else {
                    this.f64426l = typedArrayObtainStyledAttributes.getInteger(index, this.f64426l);
                }
            } else if (index == R$styleable.ViewTransition_setsTag) {
                this.f64430p = typedArrayObtainStyledAttributes.getResourceId(index, this.f64430p);
            } else if (index == R$styleable.ViewTransition_clearsTag) {
                this.f64431q = typedArrayObtainStyledAttributes.getResourceId(index, this.f64431q);
            } else if (index == R$styleable.ViewTransition_ifTagSet) {
                this.f64432r = typedArrayObtainStyledAttributes.getResourceId(index, this.f64432r);
            } else if (index == R$styleable.ViewTransition_ifTagNotSet) {
                this.f64433s = typedArrayObtainStyledAttributes.getResourceId(index, this.f64433s);
            } else if (index == R$styleable.ViewTransition_SharedValueId) {
                this.f64435u = typedArrayObtainStyledAttributes.getResourceId(index, this.f64435u);
            } else if (index == R$styleable.ViewTransition_SharedValue) {
                this.f64434t = typedArrayObtainStyledAttributes.getInteger(index, this.f64434t);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final String toString() {
        return "ViewTransition(" + qad.m19841c(this.f64429o, this.f64415a) + ")";
    }
}
