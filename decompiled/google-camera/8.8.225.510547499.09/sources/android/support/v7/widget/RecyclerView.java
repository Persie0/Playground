package android.support.v7.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.wear.ambient.AmbientMode;
import androidx.work.impl.diagnostics.p003tK.KMNlNMe;
import com.google.android.apps.camera.bottombar.C0100R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC0806ls;
import p000.AbstractC0809lv;
import p000.AbstractC0812ly;
import p000.AbstractC0815ma;
import p000.C0159ek;
import p000.C0166er;
import p000.C0167es;
import p000.C0196fu;
import p000.C0264ih;
import p000.C0756jw;
import p000.C0766kf;
import p000.C0776kp;
import p000.C0778kr;
import p000.C0813lz;
import p000.C0817mc;
import p000.C0818md;
import p000.C0820mf;
import p000.C0822mh;
import p000.C0825mk;
import p000.C0826ml;
import p000.C0827mm;
import p000.C0829mo;
import p000.C0831mq;
import p000.C0863nv;
import p000.C1114xc;
import p000.C1117xf;
import p000.InterfaceC0816mb;
import p000.InterfaceC0824mj;
import p000.RunnableC0059be;
import p000.RunnableC0780kt;
import p000.RunnableC0828mn;
import p000.abi;
import p000.abn;
import p000.adq;
import p000.aer;
import p000.aes;
import p000.aev;
import p000.afb;
import p000.afc;
import p000.afk;
import p000.afn;
import p000.afq;
import p000.afr;
import p000.agq;
import p000.ahi;
import p000.ahy;
import p000.aie;
import p000.ilo;
import p000.jvx;
import p000.opd;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements aer {

    /* JADX INFO: renamed from: A */
    boolean f1063A;

    /* JADX INFO: renamed from: B */
    public EdgeEffect f1064B;

    /* JADX INFO: renamed from: C */
    public EdgeEffect f1065C;

    /* JADX INFO: renamed from: D */
    public EdgeEffect f1066D;

    /* JADX INFO: renamed from: E */
    public EdgeEffect f1067E;

    /* JADX INFO: renamed from: F */
    public AbstractC0809lv f1068F;

    /* JADX INFO: renamed from: G */
    public int f1069G;

    /* JADX INFO: renamed from: H */
    public AbstractC0815ma f1070H;

    /* JADX INFO: renamed from: I */
    public final int f1071I;

    /* JADX INFO: renamed from: J */
    public final RunnableC0828mn f1072J;

    /* JADX INFO: renamed from: K */
    public RunnableC0780kt f1073K;

    /* JADX INFO: renamed from: L */
    public C0778kr f1074L;

    /* JADX INFO: renamed from: M */
    public final C0826ml f1075M;

    /* JADX INFO: renamed from: N */
    public boolean f1076N;

    /* JADX INFO: renamed from: O */
    public boolean f1077O;

    /* JADX INFO: renamed from: P */
    public boolean f1078P;

    /* JADX INFO: renamed from: Q */
    public C0831mq f1079Q;

    /* JADX INFO: renamed from: R */
    public final int[] f1080R;

    /* JADX INFO: renamed from: S */
    final List f1081S;

    /* JADX INFO: renamed from: T */
    public jvx f1082T;

    /* JADX INFO: renamed from: U */
    public C0159ek f1083U;

    /* JADX INFO: renamed from: V */
    public final aie f1084V;

    /* JADX INFO: renamed from: aA */
    private final int[] f1085aA;

    /* JADX INFO: renamed from: aB */
    private Runnable f1086aB;

    /* JADX INFO: renamed from: aC */
    private boolean f1087aC;

    /* JADX INFO: renamed from: aD */
    private int f1088aD;

    /* JADX INFO: renamed from: aE */
    private int f1089aE;

    /* JADX INFO: renamed from: aF */
    private AmbientMode.AmbientController f1090aF;

    /* JADX INFO: renamed from: aG */
    private final AmbientMode.AmbientController f1091aG;

    /* JADX INFO: renamed from: ac */
    private final float f1092ac;

    /* JADX INFO: renamed from: ad */
    private final C0820mf f1093ad;

    /* JADX INFO: renamed from: ae */
    private final Rect f1094ae;

    /* JADX INFO: renamed from: af */
    private int f1095af;

    /* JADX INFO: renamed from: ag */
    private boolean f1096ag;

    /* JADX INFO: renamed from: ah */
    private int f1097ah;

    /* JADX INFO: renamed from: ai */
    private final AccessibilityManager f1098ai;

    /* JADX INFO: renamed from: aj */
    private int f1099aj;

    /* JADX INFO: renamed from: ak */
    private int f1100ak;

    /* JADX INFO: renamed from: al */
    private int f1101al;

    /* JADX INFO: renamed from: am */
    private int f1102am;

    /* JADX INFO: renamed from: an */
    private VelocityTracker f1103an;

    /* JADX INFO: renamed from: ao */
    private int f1104ao;

    /* JADX INFO: renamed from: ap */
    private int f1105ap;

    /* JADX INFO: renamed from: aq */
    private int f1106aq;

    /* JADX INFO: renamed from: ar */
    private int f1107ar;

    /* JADX INFO: renamed from: as */
    private final int f1108as;

    /* JADX INFO: renamed from: at */
    private float f1109at;

    /* JADX INFO: renamed from: au */
    private float f1110au;

    /* JADX INFO: renamed from: av */
    private boolean f1111av;

    /* JADX INFO: renamed from: aw */
    private List f1112aw;

    /* JADX INFO: renamed from: ax */
    private final int[] f1113ax;

    /* JADX INFO: renamed from: ay */
    private aes f1114ay;

    /* JADX INFO: renamed from: az */
    private final int[] f1115az;

    /* JADX INFO: renamed from: f */
    public final C0818md f1116f;

    /* JADX INFO: renamed from: g */
    C0822mh f1117g;

    /* JADX INFO: renamed from: h */
    public C0756jw f1118h;

    /* JADX INFO: renamed from: i */
    boolean f1119i;

    /* JADX INFO: renamed from: j */
    public final Runnable f1120j;

    /* JADX INFO: renamed from: k */
    public final Rect f1121k;

    /* JADX INFO: renamed from: l */
    public final RectF f1122l;

    /* JADX INFO: renamed from: m */
    public AbstractC0806ls f1123m;

    /* JADX INFO: renamed from: n */
    public AbstractC0812ly f1124n;

    /* JADX INFO: renamed from: o */
    public final List f1125o;

    /* JADX INFO: renamed from: p */
    public final ArrayList f1126p;

    /* JADX INFO: renamed from: q */
    public final ArrayList f1127q;

    /* JADX INFO: renamed from: r */
    public InterfaceC0816mb f1128r;

    /* JADX INFO: renamed from: s */
    public boolean f1129s;

    /* JADX INFO: renamed from: t */
    public boolean f1130t;

    /* JADX INFO: renamed from: u */
    public boolean f1131u;

    /* JADX INFO: renamed from: v */
    public boolean f1132v;

    /* JADX INFO: renamed from: w */
    public boolean f1133w;

    /* JADX INFO: renamed from: x */
    public boolean f1134x;

    /* JADX INFO: renamed from: y */
    public List f1135y;

    /* JADX INFO: renamed from: z */
    public boolean f1136z;

    /* JADX INFO: renamed from: W */
    private static final int[] f1055W = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: aa */
    private static final float f1057aa = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: a */
    public static final boolean f1056a = true;

    /* JADX INFO: renamed from: b */
    public static final boolean f1059b = true;

    /* JADX INFO: renamed from: c */
    public static final boolean f1060c = true;

    /* JADX INFO: renamed from: ab */
    private static final Class[] f1058ab = {Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};

    /* JADX INFO: renamed from: d */
    public static final Interpolator f1061d = new ahy(1);

    /* JADX INFO: renamed from: e */
    static final C0827mm f1062e = new C0827mm();

    public RecyclerView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: F */
    public static void m1176F(View view, Rect rect) {
        C0813lz c0813lz = (C0813lz) view.getLayoutParams();
        Rect rect2 = c0813lz.f39586d;
        rect.set((view.getLeft() - rect2.left) - c0813lz.leftMargin, (view.getTop() - rect2.top) - c0813lz.topMargin, view.getRight() + rect2.right + c0813lz.rightMargin, view.getBottom() + rect2.bottom + c0813lz.bottomMargin);
    }

    /* JADX INFO: renamed from: a */
    private final int m1177a(int i, float f) {
        float height = getHeight();
        float width = i / getWidth();
        float f2 = f / height;
        EdgeEffect edgeEffect = this.f1064B;
        float f3 = 0.0f;
        if (edgeEffect == null || ahi.m670a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f1066D;
            if (edgeEffect2 != null && ahi.m670a(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.f1066D.onRelease();
                } else {
                    float fM671b = ahi.m671b(this.f1066D, width, f2);
                    if (ahi.m670a(this.f1066D) == 0.0f) {
                        this.f1066D.onRelease();
                    }
                    f3 = fM671b;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.f1064B.onRelease();
            } else {
                float f4 = -ahi.m671b(this.f1064B, -width, 1.0f - f2);
                if (ahi.m670a(this.f1064B) == 0.0f) {
                    this.f1064B.onRelease();
                }
                f3 = f4;
            }
            invalidate();
        }
        return Math.round(f3 * getWidth());
    }

    /* JADX INFO: renamed from: aA */
    private final aes m1178aA() {
        if (this.f1114ay == null) {
            this.f1114ay = new aes(this);
        }
        return this.f1114ay;
    }

    /* JADX INFO: renamed from: aB */
    private final void m1179aB() {
        m1187aJ();
        m1229ab(0);
    }

    /* JADX INFO: renamed from: aC */
    private final void m1180aC() {
        C0863nv c0863nv;
        View viewM1256j;
        this.f1075M.m16586b(1);
        m1207E(this.f1075M);
        this.f1075M.f40924i = false;
        m1232ae();
        this.f1084V.m760e();
        m1215N();
        m1184aG();
        C0829mo c0829moM1255g = null;
        View focusedChild = (this.f1111av && hasFocus() && this.f1123m != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewM1256j = m1256j(focusedChild)) != null) {
            c0829moM1255g = m1255g(viewM1256j);
        }
        if (c0829moM1255g == null) {
            m1186aI();
        } else {
            C0826ml c0826ml = this.f1075M;
            c0826ml.f40928m = this.f1123m.f39115b ? c0829moM1255g.f41159e : -1L;
            c0826ml.f40927l = this.f1136z ? -1 : c0829moM1255g.m16694u() ? c0829moM1255g.f41158d : c0829moM1255g.m16674a();
            C0826ml c0826ml2 = this.f1075M;
            View focusedChild2 = c0829moM1255g.f41155a;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            c0826ml2.f40929n = id;
        }
        C0826ml c0826ml3 = this.f1075M;
        c0826ml3.f40923h = c0826ml3.f40925j && this.f1077O;
        this.f1077O = false;
        this.f1076N = false;
        c0826ml3.f40922g = c0826ml3.f40926k;
        c0826ml3.f40920e = this.f1123m.mo1762a();
        m1182aE(this.f1113ax);
        if (this.f1075M.f40925j) {
            int iM13609a = this.f1118h.m13609a();
            for (int i = 0; i < iM13609a; i++) {
                C0829mo c0829moM1197h = m1197h(this.f1118h.m13613e(i));
                if (!c0829moM1197h.m16699z() && (!c0829moM1197h.m16692s() || this.f1123m.f39115b)) {
                    AbstractC0809lv.m16073o(c0829moM1197h);
                    c0829moM1197h.m16676c();
                    this.f1084V.m766k(c0829moM1197h, AbstractC0809lv.m16075u(c0829moM1197h));
                    if (this.f1075M.f40923h && c0829moM1197h.m16697x() && !c0829moM1197h.m16694u() && !c0829moM1197h.m16699z() && !c0829moM1197h.m16692s()) {
                        this.f1084V.m759d(m1252d(c0829moM1197h), c0829moM1197h);
                    }
                }
            }
        }
        if (this.f1075M.f40926k) {
            int iM13611c = this.f1118h.m13611c();
            for (int i2 = 0; i2 < iM13611c; i2++) {
                C0829mo c0829moM1197h2 = m1197h(this.f1118h.m13614f(i2));
                if (!c0829moM1197h2.m16699z() && c0829moM1197h2.f41158d == -1) {
                    c0829moM1197h2.f41158d = c0829moM1197h2.f41157c;
                }
            }
            C0826ml c0826ml4 = this.f1075M;
            boolean z = c0826ml4.f40921f;
            c0826ml4.f40921f = false;
            this.f1124n.mo1107o(this.f1116f, c0826ml4);
            this.f1075M.f40921f = z;
            for (int i3 = 0; i3 < this.f1118h.m13609a(); i3++) {
                C0829mo c0829moM1197h3 = m1197h(this.f1118h.m13613e(i3));
                if (!c0829moM1197h3.m16699z() && ((c0863nv = (C0863nv) ((C1117xf) this.f1084V.f427b).get(c0829moM1197h3)) == null || (c0863nv.f44723b & 4) == 0)) {
                    AbstractC0809lv.m16073o(c0829moM1197h3);
                    boolean zM16689p = c0829moM1197h3.m16689p(8192);
                    c0829moM1197h3.m16676c();
                    aev aevVarM16075u = AbstractC0809lv.m16075u(c0829moM1197h3);
                    if (zM16689p) {
                        m1248ax(c0829moM1197h3, aevVarM16075u);
                    } else {
                        aie aieVar = this.f1084V;
                        C0863nv c0863nvM17741a = (C0863nv) ((C1117xf) aieVar.f427b).get(c0829moM1197h3);
                        if (c0863nvM17741a == null) {
                            c0863nvM17741a = C0863nv.m17741a();
                            ((C1117xf) aieVar.f427b).put(c0829moM1197h3, c0863nvM17741a);
                        }
                        c0863nvM17741a.f44723b |= 2;
                        c0863nvM17741a.f44724c = aevVarM16075u;
                    }
                }
            }
            m1261s();
        } else {
            m1261s();
        }
        m1216O();
        m1233af(false);
        this.f1075M.f40919d = 2;
    }

    /* JADX INFO: renamed from: aD */
    private final void m1181aD() {
        m1232ae();
        m1215N();
        this.f1075M.m16586b(6);
        this.f1082T.m13599f();
        this.f1075M.f40920e = this.f1123m.mo1762a();
        this.f1075M.f40918c = 0;
        C0822mh c0822mh = this.f1117g;
        if (c0822mh != null) {
            int i = this.f1123m.f39116c;
            Parcelable parcelable = c0822mh.f40471a;
            if (parcelable != null) {
                this.f1124n.mo1158R(parcelable);
            }
            this.f1117g = null;
        }
        C0826ml c0826ml = this.f1075M;
        c0826ml.f40922g = false;
        this.f1124n.mo1107o(this.f1116f, c0826ml);
        C0826ml c0826ml2 = this.f1075M;
        c0826ml2.f40921f = false;
        c0826ml2.f40925j = c0826ml2.f40925j && this.f1068F != null;
        c0826ml2.f40919d = 4;
        m1216O();
        m1233af(false);
    }

    /* JADX INFO: renamed from: aE */
    private final void m1182aE(int[] iArr) {
        int iM13609a = this.f1118h.m13609a();
        if (iM13609a == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < iM13609a; i3++) {
            C0829mo c0829moM1197h = m1197h(this.f1118h.m13613e(i3));
            if (!c0829moM1197h.m16699z()) {
                int iM16675b = c0829moM1197h.m16675b();
                if (iM16675b < i2) {
                    i2 = iM16675b;
                }
                if (iM16675b > i) {
                    i = iM16675b;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i;
    }

    /* JADX INFO: renamed from: aF */
    private final void m1183aF(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1102am) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1102am = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f1106aq = x;
            this.f1104ao = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f1107ar = y;
            this.f1105ap = y;
        }
    }

    /* JADX INFO: renamed from: aG */
    private final void m1184aG() {
        boolean z;
        if (this.f1136z) {
            this.f1082T.m13604k();
            if (this.f1063A) {
                this.f1124n.mo1115w();
            }
        }
        if (m1190aM()) {
            this.f1082T.m13601h();
        } else {
            this.f1082T.m13599f();
        }
        boolean z2 = this.f1076N || this.f1077O;
        C0826ml c0826ml = this.f1075M;
        boolean z3 = this.f1131u && this.f1068F != null && ((z = this.f1136z) || z2 || this.f1124n.f39552s) && (!z || this.f1123m.f39115b);
        c0826ml.f40925j = z3;
        c0826ml.f40926k = z3 && z2 && !this.f1136z && m1190aM();
    }

    /* JADX INFO: renamed from: aH */
    private final void m1185aH(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f1121k.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0813lz) {
            C0813lz c0813lz = (C0813lz) layoutParams;
            if (!c0813lz.f39587e) {
                Rect rect = c0813lz.f39586d;
                this.f1121k.left -= rect.left;
                this.f1121k.right += rect.right;
                this.f1121k.top -= rect.top;
                this.f1121k.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f1121k);
            offsetRectIntoDescendantCoords(view, this.f1121k);
        } else {
            view2 = null;
        }
        this.f1124n.mo2043aY(this, view, this.f1121k, !this.f1131u, view2 == null);
    }

    /* JADX INFO: renamed from: aI */
    private final void m1186aI() {
        C0826ml c0826ml = this.f1075M;
        c0826ml.f40928m = -1L;
        c0826ml.f40927l = -1;
        c0826ml.f40929n = -1;
    }

    /* JADX INFO: renamed from: aJ */
    private final void m1187aJ() {
        VelocityTracker velocityTracker = this.f1103an;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        m1234ag(0);
        EdgeEffect edgeEffect = this.f1064B;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f1064B.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1065C;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f1065C.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1066D;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f1066D.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1067E;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f1067E.isFinished();
        }
        if (zIsFinished) {
            afb.m426g(this);
        }
    }

    /* JADX INFO: renamed from: aK */
    private final void m1188aK() {
        C0825mk c0825mk;
        this.f1072J.m16651d();
        AbstractC0812ly abstractC0812ly = this.f1124n;
        if (abstractC0812ly == null || (c0825mk = abstractC0812ly.f39551r) == null) {
            return;
        }
        c0825mk.m16483f();
    }

    /* JADX INFO: renamed from: aL */
    private final boolean m1189aL(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f1127q.size();
        for (int i = 0; i < size; i++) {
            InterfaceC0816mb interfaceC0816mb = (InterfaceC0816mb) this.f1127q.get(i);
            if (interfaceC0816mb.mo11898y(motionEvent) && action != 3) {
                this.f1128r = interfaceC0816mb;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: aM */
    private final boolean m1190aM() {
        return this.f1068F != null && this.f1124n.mo1112t();
    }

    /* JADX INFO: renamed from: aN */
    private final boolean m1191aN(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float fM670a = ahi.m670a(edgeEffect) * i2;
        double dLog = Math.log((Math.abs(-i) * 0.35f) / (this.f1092ac * 0.015f));
        double d = f1057aa;
        float f = this.f1092ac * 0.015f;
        Double.isNaN(d);
        Double.isNaN(d);
        double d2 = (d / ((-1.0d) + d)) * dLog;
        double d3 = f;
        double dExp = Math.exp(d2);
        Double.isNaN(d3);
        return ((float) (d3 * dExp)) < fM670a;
    }

    /* JADX INFO: renamed from: aO */
    private final void m1192aO(Context context, String str, AttributeSet attributeSet, int i) {
        Constructor constructor;
        Object[] objArr;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            if (strTrim.charAt(0) == '.') {
                strTrim = String.valueOf(context.getPackageName()).concat(String.valueOf(strTrim));
            } else if (!strTrim.contains(".")) {
                strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
            }
            try {
                Class<? extends U> clsAsSubclass = Class.forName(strTrim, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC0812ly.class);
                try {
                    constructor = clsAsSubclass.getConstructor(f1058ab);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i), 0};
                } catch (NoSuchMethodException e) {
                    try {
                        constructor = clsAsSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    } catch (NoSuchMethodException e2) {
                        e2.initCause(e);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strTrim, e2);
                    }
                }
                constructor.setAccessible(true);
                m1228aa((AbstractC0812ly) constructor.newInstance(objArr));
            } catch (ClassCastException e3) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strTrim, e3);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strTrim, e4);
            } catch (IllegalAccessException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strTrim, e5);
            } catch (InstantiationException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strTrim, e6);
            } catch (InvocationTargetException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strTrim, e7);
            }
        }
    }

    /* JADX INFO: renamed from: ap */
    public static final int m1194ap(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && ahi.m670a(edgeEffect) != 0.0f) {
            int iRound = Math.round(((-i2) / 4.0f) * ahi.m671b(edgeEffect, ((-i) * 4.0f) / i2, 0.5f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || ahi.m670a(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int iRound2 = Math.round((f / 4.0f) * ahi.m671b(edgeEffect2, (i * 4.0f) / f, 0.5f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    /* JADX INFO: renamed from: aq */
    public static final long m1195aq() {
        if (f1060c) {
            return System.nanoTime();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: az */
    private final int m1196az(int i, float f) {
        float width = getWidth();
        float height = i / getHeight();
        float f2 = f / width;
        EdgeEffect edgeEffect = this.f1065C;
        float f3 = 0.0f;
        if (edgeEffect == null || ahi.m670a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f1067E;
            if (edgeEffect2 != null && ahi.m670a(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.f1067E.onRelease();
                } else {
                    float fM671b = ahi.m671b(this.f1067E, height, 1.0f - f2);
                    if (ahi.m670a(this.f1067E) == 0.0f) {
                        this.f1067E.onRelease();
                    }
                    f3 = fM671b;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.f1065C.onRelease();
            } else {
                float f4 = -ahi.m671b(this.f1065C, -height, f2);
                if (ahi.m670a(this.f1065C) == 0.0f) {
                    this.f1065C.onRelease();
                }
                f3 = f4;
            }
            invalidate();
        }
        return Math.round(f3 * getHeight());
    }

    /* JADX INFO: renamed from: h */
    public static C0829mo m1197h(View view) {
        if (view == null) {
            return null;
        }
        return ((C0813lz) view.getLayoutParams()).f39585c;
    }

    /* JADX INFO: renamed from: i */
    public static RecyclerView m1198i(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewM1198i = m1198i(viewGroup.getChildAt(i));
            if (recyclerViewM1198i != null) {
                return recyclerViewM1198i;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public static void m1202r(C0829mo c0829mo) {
        WeakReference weakReference = c0829mo.f41156b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == c0829mo.f41155a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            c0829mo.f41156b = null;
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m1203A() {
        if (this.f1067E != null) {
            return;
        }
        EdgeEffect edgeEffectMo7407c = this.f1083U.mo7407c(this);
        this.f1067E = edgeEffectMo7407c;
        if (this.f1119i) {
            edgeEffectMo7407c.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectMo7407c.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m1204B() {
        if (this.f1064B != null) {
            return;
        }
        EdgeEffect edgeEffectMo7407c = this.f1083U.mo7407c(this);
        this.f1064B = edgeEffectMo7407c;
        if (this.f1119i) {
            edgeEffectMo7407c.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectMo7407c.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m1205C() {
        if (this.f1066D != null) {
            return;
        }
        EdgeEffect edgeEffectMo7407c = this.f1083U.mo7407c(this);
        this.f1066D = edgeEffectMo7407c;
        if (this.f1119i) {
            edgeEffectMo7407c.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectMo7407c.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m1206D() {
        if (this.f1065C != null) {
            return;
        }
        EdgeEffect edgeEffectMo7407c = this.f1083U.mo7407c(this);
        this.f1065C = edgeEffectMo7407c;
        if (this.f1119i) {
            edgeEffectMo7407c.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectMo7407c.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: E */
    final void m1207E(C0826ml c0826ml) {
        if (this.f1101al != 2) {
            c0826ml.f40930o = 0;
            c0826ml.f40931p = 0;
        } else {
            OverScroller overScroller = this.f1072J.f41084a;
            c0826ml.f40930o = overScroller.getFinalX() - overScroller.getCurrX();
            c0826ml.f40931p = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m1208G() {
        this.f1067E = null;
        this.f1065C = null;
        this.f1066D = null;
        this.f1064B = null;
    }

    /* JADX INFO: renamed from: H */
    public final void m1209H() {
        if (this.f1126p.size() == 0) {
            return;
        }
        AbstractC0812ly abstractC0812ly = this.f1124n;
        if (abstractC0812ly != null) {
            abstractC0812ly.mo1154N("Cannot invalidate item decorations during a scroll or layout");
        }
        m1211J();
        requestLayout();
    }

    /* JADX INFO: renamed from: I */
    public final void m1210I(int i) {
        if (this.f1124n == null) {
            return;
        }
        m1229ab(2);
        this.f1124n.mo1159S(i);
        awakenScrollBars();
    }

    /* JADX INFO: renamed from: J */
    public final void m1211J() {
        int iM13611c = this.f1118h.m13611c();
        for (int i = 0; i < iM13611c; i++) {
            ((C0813lz) this.f1118h.m13614f(i).getLayoutParams()).f39587e = true;
        }
        C0818md c0818md = this.f1116f;
        int size = c0818md.f40023c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0813lz c0813lz = (C0813lz) ((C0829mo) c0818md.f40023c.get(i2)).f41155a.getLayoutParams();
            if (c0813lz != null) {
                c0813lz.f39587e = true;
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m1212K(int i) {
        int iM13609a = this.f1118h.m13609a();
        for (int i2 = 0; i2 < iM13609a; i2++) {
            this.f1118h.m13613e(i2).offsetLeftAndRight(i);
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m1213L(int i) {
        int iM13609a = this.f1118h.m13609a();
        for (int i2 = 0; i2 < iM13609a; i2++) {
            this.f1118h.m13613e(i2).offsetTopAndBottom(i);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m1214M(int i, int i2, boolean z) {
        int iM13611c = this.f1118h.m13611c();
        for (int i3 = 0; i3 < iM13611c; i3++) {
            C0829mo c0829moM1197h = m1197h(this.f1118h.m13614f(i3));
            if (c0829moM1197h != null && !c0829moM1197h.m16699z()) {
                int i4 = i + i2;
                int i5 = c0829moM1197h.f41157c;
                if (i5 >= i4) {
                    c0829moM1197h.m16683j(-i2, z);
                    this.f1075M.f40921f = true;
                } else if (i5 >= i) {
                    c0829moM1197h.m16678e(8);
                    c0829moM1197h.m16683j(-i2, z);
                    c0829moM1197h.f41157c = i - 1;
                    this.f1075M.f40921f = true;
                }
            }
        }
        C0818md c0818md = this.f1116f;
        int i6 = i + i2;
        for (int size = c0818md.f40023c.size() - 1; size >= 0; size--) {
            C0829mo c0829mo = (C0829mo) c0818md.f40023c.get(size);
            if (c0829mo != null) {
                int i7 = c0829mo.f41157c;
                if (i7 >= i6) {
                    c0829mo.m16683j(-i2, z);
                } else if (i7 >= i) {
                    c0829mo.m16678e(8);
                    c0818md.m16320i(size);
                }
            }
        }
        requestLayout();
    }

    /* JADX INFO: renamed from: N */
    public final void m1215N() {
        this.f1099aj++;
    }

    /* JADX INFO: renamed from: O */
    final void m1216O() {
        m1217P(true);
    }

    /* JADX INFO: renamed from: P */
    public final void m1217P(boolean z) {
        int i;
        int i2 = this.f1099aj - 1;
        this.f1099aj = i2;
        if (i2 <= 0) {
            this.f1099aj = 0;
            if (z) {
                int i3 = this.f1097ah;
                this.f1097ah = 0;
                if (i3 != 0 && m1239am()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    agq.m618b(accessibilityEventObtain, i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                for (int size = this.f1081S.size() - 1; size >= 0; size--) {
                    C0829mo c0829mo = (C0829mo) this.f1081S.get(size);
                    if (c0829mo.f41155a.getParent() == this && !c0829mo.m16699z() && (i = c0829mo.f41170p) != -1) {
                        afb.m434o(c0829mo.f41155a, i);
                        c0829mo.f41170p = -1;
                    }
                }
                this.f1081S.clear();
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public void mo1218Q(int i) {
    }

    /* JADX INFO: renamed from: R */
    public void mo1219R(int i, int i2) {
    }

    /* JADX INFO: renamed from: S */
    public final void m1220S() {
        if (this.f1078P || !this.f1129s) {
            return;
        }
        afb.m428i(this, this.f1086aB);
        this.f1078P = true;
    }

    /* JADX INFO: renamed from: T */
    public final void m1221T(boolean z) {
        this.f1063A = z | this.f1063A;
        this.f1136z = true;
        int iM13611c = this.f1118h.m13611c();
        for (int i = 0; i < iM13611c; i++) {
            C0829mo c0829moM1197h = m1197h(this.f1118h.m13614f(i));
            if (c0829moM1197h != null && !c0829moM1197h.m16699z()) {
                c0829moM1197h.m16678e(6);
            }
        }
        m1211J();
        C0818md c0818md = this.f1116f;
        int size = c0818md.f40023c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0829mo c0829mo = (C0829mo) c0818md.f40023c.get(i2);
            if (c0829mo != null) {
                c0829mo.m16678e(6);
                c0829mo.m16677d(null);
            }
        }
        AbstractC0806ls abstractC0806ls = c0818md.f40026f.f1123m;
        if (abstractC0806ls == null || !abstractC0806ls.f39115b) {
            c0818md.m16319h();
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m1222U() {
        AbstractC0809lv abstractC0809lv = this.f1068F;
        if (abstractC0809lv != null) {
            abstractC0809lv.mo11860c();
        }
        AbstractC0812ly abstractC0812ly = this.f1124n;
        if (abstractC0812ly != null) {
            abstractC0812ly.m16150aK(this.f1116f);
            this.f1124n.m16151aL(this.f1116f);
        }
        this.f1116f.m16315d();
    }

    /* JADX INFO: renamed from: V */
    public final void m1223V(int i, int i2, int[] iArr) {
        C0829mo c0829mo;
        m1232ae();
        m1215N();
        adq.m303a("RV Scroll");
        m1207E(this.f1075M);
        int iMo1096d = i != 0 ? this.f1124n.mo1096d(i, this.f1116f, this.f1075M) : 0;
        int iMo1097e = i2 != 0 ? this.f1124n.mo1097e(i2, this.f1116f, this.f1075M) : 0;
        adq.m304b();
        int iM13609a = this.f1118h.m13609a();
        for (int i3 = 0; i3 < iM13609a; i3++) {
            View viewM13613e = this.f1118h.m13613e(i3);
            C0829mo c0829moM1255g = m1255g(viewM13613e);
            if (c0829moM1255g != null && (c0829mo = c0829moM1255g.f41163i) != null) {
                View view = c0829mo.f41155a;
                int left = viewM13613e.getLeft();
                int top = viewM13613e.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        m1216O();
        m1233af(false);
        if (iArr != null) {
            iArr[0] = iMo1096d;
            iArr[1] = iMo1097e;
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m1224W(int i) {
        if (this.f1133w) {
            return;
        }
        m1235ah();
        AbstractC0812ly abstractC0812ly = this.f1124n;
        if (abstractC0812ly == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC0812ly.mo1159S(i);
            awakenScrollBars();
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m1225X(C0831mq c0831mq) {
        this.f1079Q = c0831mq;
        afq.m547g(this, c0831mq);
    }

    /* JADX INFO: renamed from: Y */
    public void mo1226Y(AbstractC0806ls abstractC0806ls) {
        suppressLayout(false);
        AbstractC0806ls abstractC0806ls2 = this.f1123m;
        if (abstractC0806ls2 != null) {
            abstractC0806ls2.m15927i(this.f1093ad);
        }
        m1222U();
        this.f1082T.m13604k();
        AbstractC0806ls abstractC0806ls3 = this.f1123m;
        this.f1123m = abstractC0806ls;
        if (abstractC0806ls != null) {
            abstractC0806ls.m15926h(this.f1093ad);
        }
        AbstractC0812ly abstractC0812ly = this.f1124n;
        if (abstractC0812ly != null) {
            abstractC0812ly.mo1298bk();
        }
        C0818md c0818md = this.f1116f;
        AbstractC0806ls abstractC0806ls4 = this.f1123m;
        c0818md.m16315d();
        c0818md.m16317f(abstractC0806ls3, true);
        ilo iloVarM16327p = c0818md.m16327p();
        if (abstractC0806ls3 != null) {
            iloVarM16327p.f31455a--;
        }
        if (iloVarM16327p.f31455a == 0) {
            for (int i = 0; i < ((SparseArray) iloVarM16327p.f31457c).size(); i++) {
                C0817mc c0817mc = (C0817mc) ((SparseArray) iloVarM16327p.f31457c).valueAt(i);
                ArrayList arrayList = c0817mc.f39909a;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    abn.m143c(((C0829mo) arrayList.get(i2)).f41155a);
                }
                c0817mc.f39909a.clear();
            }
        }
        if (abstractC0806ls4 != null) {
            iloVarM16327p.f31455a++;
        }
        c0818md.m16316e();
        this.f1075M.f40921f = true;
        m1221T(false);
        requestLayout();
    }

    /* JADX INFO: renamed from: Z */
    public final void m1227Z(AbstractC0809lv abstractC0809lv) {
        AbstractC0809lv abstractC0809lv2 = this.f1068F;
        if (abstractC0809lv2 != null) {
            abstractC0809lv2.mo11860c();
            this.f1068F.f39375l = null;
        }
        this.f1068F = abstractC0809lv;
        if (abstractC0809lv != null) {
            abstractC0809lv.f39375l = this.f1090aF;
        }
    }

    /* JADX INFO: renamed from: aa */
    public final void m1228aa(AbstractC0812ly abstractC0812ly) {
        if (abstractC0812ly == this.f1124n) {
            return;
        }
        m1235ah();
        if (this.f1124n != null) {
            AbstractC0809lv abstractC0809lv = this.f1068F;
            if (abstractC0809lv != null) {
                abstractC0809lv.mo11860c();
            }
            this.f1124n.m16150aK(this.f1116f);
            this.f1124n.m16151aL(this.f1116f);
            this.f1116f.m16315d();
            if (this.f1129s) {
                this.f1124n.m16182bn(this);
            }
            this.f1124n.m16160aU(null);
            this.f1124n = null;
        } else {
            this.f1116f.m16315d();
        }
        C0756jw c0756jw = this.f1118h;
        c0756jw.f34932a.m13532d();
        for (int size = c0756jw.f34933b.size() - 1; size >= 0; size--) {
            c0756jw.f34934c.m1639l((View) c0756jw.f34933b.get(size));
            c0756jw.f34933b.remove(size);
        }
        AmbientMode.AmbientController ambientController = c0756jw.f34934c;
        int iM1636i = ambientController.m1636i();
        for (int i = 0; i < iM1636i; i++) {
            View viewM1638k = ambientController.m1638k(i);
            ((RecyclerView) ambientController.f1697a).m1265w(viewM1638k);
            viewM1638k.clearAnimation();
        }
        ((RecyclerView) ambientController.f1697a).removeAllViews();
        this.f1124n = abstractC0812ly;
        if (abstractC0812ly != null) {
            if (abstractC0812ly.f39550q != null) {
                throw new IllegalArgumentException("LayoutManager " + abstractC0812ly + " is already attached to a RecyclerView:" + abstractC0812ly.f39550q.m1257k());
            }
            this.f1124n.m16160aU(this);
            if (this.f1129s) {
                this.f1124n.m16148aE(this);
            }
        }
        this.f1116f.m16325n();
        requestLayout();
    }

    /* JADX INFO: renamed from: ab */
    public final void m1229ab(int i) {
        if (i == this.f1101al) {
            return;
        }
        this.f1101al = i;
        if (i != 2) {
            m1188aK();
        }
        AbstractC0812ly abstractC0812ly = this.f1124n;
        if (abstractC0812ly != null) {
            abstractC0812ly.mo1297aJ(i);
        }
        mo1218Q(i);
        List list = this.f1112aw;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((C0167es) this.f1112aw.get(size)).mo2035d(i);
            }
        }
    }

    /* JADX INFO: renamed from: ac */
    public final void m1230ac(int i, int i2) {
        m1244at(i, i2, false);
    }

    /* JADX INFO: renamed from: ad */
    public final void m1231ad(int i) {
        if (this.f1133w) {
            return;
        }
        AbstractC0812ly abstractC0812ly = this.f1124n;
        if (abstractC0812ly == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC0812ly.mo1174ah(this, i);
        }
    }

    /* JADX INFO: renamed from: ae */
    public final void m1232ae() {
        int i = this.f1095af + 1;
        this.f1095af = i;
        if (i != 1 || this.f1133w) {
            return;
        }
        this.f1132v = false;
    }

    /* JADX INFO: renamed from: af */
    public final void m1233af(boolean z) {
        int i = this.f1095af;
        if (i <= 0) {
            this.f1095af = 1;
            i = 1;
        }
        if (!z && !this.f1133w) {
            this.f1132v = false;
        }
        if (i == 1) {
            if (z && this.f1132v && !this.f1133w && this.f1124n != null && this.f1123m != null) {
                m1266x();
            }
            if (!this.f1133w) {
                this.f1132v = false;
            }
        }
        this.f1095af--;
    }

    /* JADX INFO: renamed from: ag */
    public final void m1234ag(int i) {
        m1178aA().m384b(i);
    }

    /* JADX INFO: renamed from: ah */
    public final void m1235ah() {
        m1229ab(0);
        m1188aK();
    }

    /* JADX INFO: renamed from: aj */
    public final boolean m1236aj(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return m1178aA().m387e(i, i2, iArr, iArr2, i3);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX INFO: renamed from: ak */
    public boolean mo1237ak(int i, int i2) {
        int i3;
        int i4;
        int iMax;
        int iMax2;
        RecyclerView recyclerView;
        AbstractC0812ly abstractC0812ly;
        int i5;
        C0825mk c0825mkMo11873d;
        int iMo11871a;
        AbstractC0812ly abstractC0812ly2 = this.f1124n;
        if (abstractC0812ly2 == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.f1133w) {
            return false;
        }
        int iMo1162V = abstractC0812ly2.mo1162V();
        boolean zMo1163W = abstractC0812ly2.mo1163W();
        if (iMo1162V == 0 || Math.abs(i) < this.f1071I) {
            i = 0;
        }
        if (!zMo1163W || Math.abs(i2) < this.f1071I) {
            i2 = 0;
        }
        if (i == 0) {
            if (i2 == 0) {
                return false;
            }
            i = 0;
        }
        if (i == 0) {
            i3 = 0;
        } else {
            EdgeEffect edgeEffect = this.f1064B;
            if (edgeEffect == null || ahi.m670a(edgeEffect) == 0.0f) {
                EdgeEffect edgeEffect2 = this.f1066D;
                if (edgeEffect2 == null || ahi.m670a(edgeEffect2) == 0.0f) {
                    i3 = 0;
                } else {
                    if (m1191aN(this.f1066D, i, getWidth())) {
                        this.f1066D.onAbsorb(i);
                        i = 0;
                    }
                    i3 = i;
                    i = 0;
                }
            } else {
                int i6 = -i;
                if (m1191aN(this.f1064B, i6, getWidth())) {
                    this.f1064B.onAbsorb(i6);
                    i = 0;
                }
                i3 = i;
                i = 0;
            }
        }
        if (i2 == 0) {
            i4 = i2;
            i2 = 0;
        } else {
            EdgeEffect edgeEffect3 = this.f1065C;
            if (edgeEffect3 == null || ahi.m670a(edgeEffect3) == 0.0f) {
                EdgeEffect edgeEffect4 = this.f1067E;
                if (edgeEffect4 == null || ahi.m670a(edgeEffect4) == 0.0f) {
                    i4 = i2;
                    i2 = 0;
                } else {
                    if (m1191aN(this.f1067E, i2, getHeight())) {
                        this.f1067E.onAbsorb(i2);
                        i2 = 0;
                    }
                    i4 = 0;
                }
            } else {
                int i7 = -i2;
                if (m1191aN(this.f1065C, i7, getHeight())) {
                    this.f1065C.onAbsorb(i7);
                    i2 = 0;
                }
                i4 = 0;
            }
        }
        if (i3 != 0) {
            int i8 = this.f1108as;
            iMax = Math.max(-i8, Math.min(i3, i8));
            int i9 = this.f1108as;
            iMax2 = Math.max(-i9, Math.min(i2, i9));
            this.f1072J.m16648a(iMax, iMax2);
        } else if (i2 != 0) {
            i3 = 0;
            int i10 = this.f1108as;
            iMax = Math.max(-i10, Math.min(i3, i10));
            int i11 = this.f1108as;
            iMax2 = Math.max(-i11, Math.min(i2, i11));
            this.f1072J.m16648a(iMax, iMax2);
        } else {
            iMax2 = 0;
            iMax = 0;
        }
        if (i == 0) {
            if (i4 == 0) {
                return (iMax == 0 && iMax2 == 0) ? false : true;
            }
            i = 0;
        }
        float f = i;
        float f2 = i4;
        if (!dispatchNestedPreFling(f, f2)) {
            boolean z = iMo1162V != 0 || zMo1163W;
            dispatchNestedFling(f, f2, z);
            AbstractC0815ma abstractC0815ma = this.f1070H;
            if (abstractC0815ma != null && (abstractC0812ly = (recyclerView = abstractC0815ma.f39692a).f1124n) != null && recyclerView.f1123m != null && ((Math.abs(i4) > (i5 = recyclerView.f1071I) || Math.abs(i) > i5) && (abstractC0812ly instanceof InterfaceC0824mj) && (c0825mkMo11873d = abstractC0815ma.mo11873d(abstractC0812ly)) != null && (iMo11871a = abstractC0815ma.mo11871a(abstractC0812ly, i, i4)) != -1)) {
                c0825mkMo11873d.f40796b = iMo11871a;
                abstractC0812ly.m16161aV(c0825mkMo11873d);
                return true;
            }
            if (z) {
                if (zMo1163W) {
                    iMo1162V = (iMo1162V == true ? 1 : 0) | 2;
                }
                m1245au(iMo1162V, 1);
                int i12 = this.f1108as;
                int iMax3 = Math.max(-i12, Math.min(i, i12));
                int i13 = this.f1108as;
                this.f1072J.m16648a(iMax3, Math.max(-i13, Math.min(i4, i13)));
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: al */
    public final boolean m1238al() {
        return !this.f1131u || this.f1136z || this.f1082T.m13606m();
    }

    /* JADX INFO: renamed from: am */
    public final boolean m1239am() {
        AccessibilityManager accessibilityManager = this.f1098ai;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    /* JADX INFO: renamed from: an */
    public final boolean m1240an() {
        return this.f1099aj > 0;
    }

    /* JADX INFO: renamed from: ao */
    final boolean m1241ao(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        m1263u();
        if (this.f1123m != null) {
            int[] iArr = this.f1080R;
            iArr[0] = 0;
            iArr[1] = 0;
            m1223V(i, i2, iArr);
            int[] iArr2 = this.f1080R;
            int i8 = iArr2[0];
            int i9 = iArr2[1];
            i4 = i9;
            i5 = i8;
            i6 = i - i8;
            i7 = i2 - i9;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.f1126p.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f1080R;
        iArr3[0] = 0;
        iArr3[1] = 0;
        m1267y(i5, i4, i6, i7, this.f1115az, i3, iArr3);
        int[] iArr4 = this.f1080R;
        int i10 = iArr4[0];
        int i11 = i6 - i10;
        int i12 = iArr4[1];
        int i13 = i7 - i12;
        boolean z2 = (i10 == 0 && i12 == 0) ? false : true;
        int i14 = this.f1106aq;
        int[] iArr5 = this.f1115az;
        int i15 = iArr5[0];
        this.f1106aq = i14 - i15;
        int i16 = this.f1107ar;
        int i17 = iArr5[1];
        this.f1107ar = i16 - i17;
        int[] iArr6 = this.f1085aA;
        iArr6[0] = iArr6[0] + i15;
        iArr6[1] = iArr6[1] + i17;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !abi.m111c(motionEvent, 8194)) {
                float x = motionEvent.getX();
                float f = i11;
                float y = motionEvent.getY();
                float f2 = i13;
                if (f < 0.0f) {
                    m1204B();
                    ahi.m671b(this.f1064B, (-f) / getWidth(), 1.0f - (y / getHeight()));
                    z = true;
                } else if (f > 0.0f) {
                    m1205C();
                    ahi.m671b(this.f1066D, f / getWidth(), y / getHeight());
                    z = true;
                } else {
                    z = false;
                }
                if (f2 < 0.0f) {
                    m1206D();
                    ahi.m671b(this.f1065C, (-f2) / getHeight(), x / getWidth());
                } else if (f2 > 0.0f) {
                    m1203A();
                    ahi.m671b(this.f1067E, f2 / getHeight(), 1.0f - (x / getWidth()));
                } else if (z || f != 0.0f || f2 != 0.0f) {
                }
                afb.m426g(this);
            }
            m1262t(i, i2);
        }
        if (i5 != 0) {
            m1268z(i5, i4);
        } else if (i4 != 0) {
            i5 = 0;
            m1268z(i5, i4);
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z2 && i5 == 0 && i4 == 0) ? false : true;
    }

    /* JADX INFO: renamed from: ar */
    public final void m1242ar(C0829mo c0829mo, int i) {
        if (!m1240an()) {
            afb.m434o(c0829mo.f41155a, i);
        } else {
            c0829mo.f41170p = i;
            this.f1081S.add(c0829mo);
        }
    }

    /* JADX INFO: renamed from: as */
    public final void m1243as() {
        this.f1130t = true;
    }

    /* JADX INFO: renamed from: at */
    public final void m1244at(int i, int i2, boolean z) {
        AbstractC0812ly abstractC0812ly = this.f1124n;
        if (abstractC0812ly == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f1133w) {
            return;
        }
        if (true != abstractC0812ly.mo1162V()) {
            i = 0;
        }
        if (true != abstractC0812ly.mo1163W()) {
            i2 = 0;
        }
        if (i == 0) {
            if (i2 == 0) {
                return;
            } else {
                i = 0;
            }
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            m1245au(i3, 1);
        }
        this.f1072J.m16650c(i, i2, Integer.MIN_VALUE, null);
    }

    /* JADX INFO: renamed from: au */
    public final void m1245au(int i, int i2) {
        m1178aA().m391i(i, i2);
    }

    /* JADX INFO: renamed from: av */
    public final void m1246av(C0166er c0166er) {
        AbstractC0812ly abstractC0812ly = this.f1124n;
        if (abstractC0812ly != null) {
            abstractC0812ly.mo1154N("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f1126p.isEmpty()) {
            setWillNotDraw(false);
        }
        this.f1126p.add(c0166er);
        m1211J();
        requestLayout();
    }

    /* JADX INFO: renamed from: aw */
    public final void m1247aw(C0167es c0167es) {
        if (this.f1112aw == null) {
            this.f1112aw = new ArrayList();
        }
        this.f1112aw.add(c0167es);
    }

    /* JADX INFO: renamed from: ax */
    public final void m1248ax(C0829mo c0829mo, aev aevVar) {
        c0829mo.m16685l(0, 8192);
        if (this.f1075M.f40923h && c0829mo.m16697x() && !c0829mo.m16694u() && !c0829mo.m16699z()) {
            this.f1084V.m759d(m1252d(c0829mo), c0829mo);
        }
        this.f1084V.m766k(c0829mo, aevVar);
    }

    /* JADX INFO: renamed from: ay */
    public final void m1249ay(C0167es c0167es) {
        List list = this.f1112aw;
        if (list != null) {
            list.remove(c0167es);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m1250b(C0829mo c0829mo) {
        if (c0829mo.m16689p(524) || !c0829mo.m16691r()) {
            return -1;
        }
        jvx jvxVar = this.f1082T;
        int i = c0829mo.f41157c;
        int size = ((ArrayList) jvxVar.f34928d).size();
        for (int i2 = 0; i2 < size; i2++) {
            C0264ih c0264ih = (C0264ih) ((ArrayList) jvxVar.f34928d).get(i2);
            switch (c0264ih.f30905a) {
                case 1:
                    if (c0264ih.f30906b <= i) {
                        i += c0264ih.f30908d;
                    }
                    break;
                case 2:
                    int i3 = c0264ih.f30906b;
                    if (i3 > i) {
                        continue;
                    } else {
                        int i4 = c0264ih.f30908d;
                        if (i3 + i4 > i) {
                            return -1;
                        }
                        i -= i4;
                    }
                    break;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: c */
    public final int m1251c(View view) {
        C0829mo c0829moM1197h = m1197h(view);
        if (c0829moM1197h != null) {
            return c0829moM1197h.m16674a();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0813lz) && this.f1124n.mo1111s((C0813lz) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC0812ly abstractC0812ly = this.f1124n;
        if (abstractC0812ly != null && abstractC0812ly.mo1162V()) {
            return abstractC0812ly.mo1175z(this.f1075M);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC0812ly abstractC0812ly = this.f1124n;
        if (abstractC0812ly != null && abstractC0812ly.mo1162V()) {
            return abstractC0812ly.mo1141A(this.f1075M);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC0812ly abstractC0812ly = this.f1124n;
        if (abstractC0812ly != null && abstractC0812ly.mo1162V()) {
            return abstractC0812ly.mo1142B(this.f1075M);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        AbstractC0812ly abstractC0812ly = this.f1124n;
        if (abstractC0812ly != null && abstractC0812ly.mo1163W()) {
            return abstractC0812ly.mo1143C(this.f1075M);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        AbstractC0812ly abstractC0812ly = this.f1124n;
        if (abstractC0812ly != null && abstractC0812ly.mo1163W()) {
            return abstractC0812ly.mo1144D(this.f1075M);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC0812ly abstractC0812ly = this.f1124n;
        if (abstractC0812ly != null && abstractC0812ly.mo1163W()) {
            return abstractC0812ly.mo1145E(this.f1075M);
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    final long m1252d(C0829mo c0829mo) {
        return this.f1123m.f39115b ? c0829mo.f41159e : c0829mo.f41157c;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return m1178aA().m385c(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return m1178aA().m386d(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return m1178aA().m387e(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return m1178aA().m388f(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        int size = this.f1126p.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((C0166er) this.f1126p.get(i)).mo1750g(canvas, this);
        }
        EdgeEffect edgeEffect = this.f1064B;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f1119i ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f1064B;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f1065C;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f1119i) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f1065C;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f1066D;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f1119i ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f1066D;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f1067E;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f1119i) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f1067E;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if (z || (this.f1068F != null && this.f1126p.size() > 0 && this.f1068F.mo11863h())) {
            afb.m426g(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* JADX INFO: renamed from: e */
    public final Rect m1253e(View view) {
        C0813lz c0813lz = (C0813lz) view.getLayoutParams();
        if (!c0813lz.f39587e) {
            return c0813lz.f39586d;
        }
        if (this.f1075M.f40922g && (c0813lz.m16219b() || c0813lz.f39585c.m16692s())) {
            return c0813lz.f39586d;
        }
        Rect rect = c0813lz.f39586d;
        rect.set(0, 0, 0, 0);
        int size = this.f1126p.size();
        for (int i = 0; i < size; i++) {
            this.f1121k.set(0, 0, 0, 0);
            ((C0166er) this.f1126p.get(i)).mo1749f(this.f1121k, view, this);
            rect.left += this.f1121k.left;
            rect.top += this.f1121k.top;
            rect.right += this.f1121k.right;
            rect.bottom += this.f1121k.bottom;
        }
        c0813lz.f39587e = false;
        return rect;
    }

    /* JADX INFO: renamed from: f */
    public final C0829mo m1254f(int i) {
        C0829mo c0829mo = null;
        if (this.f1136z) {
            return null;
        }
        int iM13611c = this.f1118h.m13611c();
        for (int i2 = 0; i2 < iM13611c; i2++) {
            C0829mo c0829moM1197h = m1197h(this.f1118h.m13614f(i2));
            if (c0829moM1197h != null && !c0829moM1197h.m16694u() && m1250b(c0829moM1197h) == i) {
                if (!this.f1118h.m13619k(c0829moM1197h.f41155a)) {
                    return c0829moM1197h;
                }
                c0829mo = c0829moM1197h;
            }
        }
        return c0829mo;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:129:0x01c5 A[DONT_INVERT, PHI: r1
      0x01c5: PHI (r1v1 boolean) = (r1v0 boolean), (r1v0 boolean), (r1v2 boolean), (r1v0 boolean), (r1v0 boolean) binds: [B:123:0x01bb, B:126:0x01c1, B:128:0x01c4, B:118:0x01b2, B:121:0x01b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x003b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0043  */
    /* JADX WARN: Code duplicated, block: B:30:0x004b  */
    /* JADX WARN: Code duplicated, block: B:31:0x004d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0050  */
    /* JADX WARN: Code duplicated, block: B:34:0x0052  */
    /* JADX WARN: Code duplicated, block: B:37:0x0056  */
    /* JADX WARN: Code duplicated, block: B:38:0x0059  */
    /* JADX WARN: Code duplicated, block: B:41:0x0061  */
    /* JADX WARN: Code duplicated, block: B:43:0x006a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x006b  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a2  */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01a6, code lost:
    
        if (r4 > 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01a9, code lost:
    
        if (r5 > 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01ac, code lost:
    
        if (r4 < 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01af, code lost:
    
        if (r5 < 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01c5, code lost:
    
        if (r1 != false) goto L131;
     */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View focusSearch(View view, int i) {
        View viewFindNextFocus;
        View viewMo1102j;
        int i2;
        boolean z;
        boolean z2;
        int i3;
        boolean z3 = true;
        boolean z4 = (this.f1123m == null || this.f1124n == null || m1240an() || this.f1133w) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z4) {
            if (i != 2) {
                if (i == 1) {
                    i = 1;
                } else {
                    viewFindNextFocus = focusFinder.findNextFocus(this, view, i);
                    if (viewFindNextFocus == null) {
                        viewMo1102j = viewFindNextFocus;
                    } else {
                        viewMo1102j = viewFindNextFocus;
                    }
                }
            }
            if (this.f1124n.mo1163W()) {
                if (focusFinder.findNextFocus(this, view, i == 2 ? 130 : 33) == null) {
                    m1263u();
                    if (m1256j(view) == null) {
                        return null;
                    }
                    m1232ae();
                    this.f1124n.mo1102j(view, i, this.f1116f, this.f1075M);
                    m1233af(false);
                } else if (this.f1124n.mo1162V()) {
                    if (this.f1124n.m16166am() == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i == 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (true != (z ^ z2)) {
                        i3 = 17;
                    } else {
                        i3 = 66;
                    }
                    if (focusFinder.findNextFocus(this, view, i3) == null) {
                        m1263u();
                        if (m1256j(view) == null) {
                            return null;
                        }
                        m1232ae();
                        this.f1124n.mo1102j(view, i, this.f1116f, this.f1075M);
                        m1233af(false);
                    }
                }
            } else if (this.f1124n.mo1162V()) {
                if (this.f1124n.m16166am() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (i == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (true != (z ^ z2)) {
                    i3 = 17;
                } else {
                    i3 = 66;
                }
                if (focusFinder.findNextFocus(this, view, i3) == null) {
                    m1263u();
                    if (m1256j(view) == null) {
                        return null;
                    }
                    m1232ae();
                    this.f1124n.mo1102j(view, i, this.f1116f, this.f1075M);
                    m1233af(false);
                }
            }
            viewMo1102j = focusFinder.findNextFocus(this, view, i);
        } else {
            viewFindNextFocus = focusFinder.findNextFocus(this, view, i);
            if (viewFindNextFocus == null || !z4) {
                viewMo1102j = viewFindNextFocus;
            } else {
                m1263u();
                if (m1256j(view) == null) {
                    return null;
                }
                m1232ae();
                viewMo1102j = this.f1124n.mo1102j(view, i, this.f1116f, this.f1075M);
                m1233af(false);
            }
        }
        if (viewMo1102j != null && !viewMo1102j.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i);
            }
            m1185aH(viewMo1102j, null);
            return view;
        }
        if (viewMo1102j != null && viewMo1102j != this && viewMo1102j != view && m1256j(viewMo1102j) != null) {
            if (view != null && m1256j(view) != null) {
                this.f1121k.set(0, 0, view.getWidth(), view.getHeight());
                this.f1094ae.set(0, 0, viewMo1102j.getWidth(), viewMo1102j.getHeight());
                offsetDescendantRectToMyCoords(view, this.f1121k);
                offsetDescendantRectToMyCoords(viewMo1102j, this.f1094ae);
                byte b = -1;
                int i4 = this.f1124n.m16166am() == 1 ? -1 : 1;
                if ((this.f1121k.left < this.f1094ae.left || this.f1121k.right <= this.f1094ae.left) && this.f1121k.right < this.f1094ae.right) {
                    i2 = 1;
                } else {
                    i2 = ((this.f1121k.right > this.f1094ae.right || this.f1121k.left >= this.f1094ae.right) && this.f1121k.left > this.f1094ae.left) ? -1 : 0;
                }
                if ((this.f1121k.top < this.f1094ae.top || this.f1121k.bottom <= this.f1094ae.top) && this.f1121k.bottom < this.f1094ae.bottom) {
                    b = 1;
                } else if ((this.f1121k.bottom <= this.f1094ae.bottom && this.f1121k.top < this.f1094ae.bottom) || this.f1121k.top <= this.f1094ae.top) {
                    b = 0;
                }
                switch (i) {
                    case 1:
                        if (b >= 0) {
                            if (b != 0) {
                                z3 = false;
                                break;
                            } else if (i2 * i4 < 0) {
                            }
                        }
                        break;
                    case 2:
                        if (b <= 0) {
                            if (b != 0) {
                                z3 = false;
                                break;
                            } else if (i2 * i4 > 0) {
                            }
                        }
                        break;
                    case 17:
                        break;
                    case 33:
                        break;
                    case 66:
                        break;
                    case 130:
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid direction: " + i + m1257k());
                }
            }
            return viewMo1102j;
        }
        return super.focusSearch(view, i);
    }

    /* JADX INFO: renamed from: g */
    public final C0829mo m1255g(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m1197h(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC0812ly abstractC0812ly = this.f1124n;
        if (abstractC0812ly != null) {
            return abstractC0812ly.mo1098f();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(m1257k()));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC0812ly abstractC0812ly = this.f1124n;
        if (abstractC0812ly != null) {
            return abstractC0812ly.mo1100h(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(m1257k()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "android.support.v7.widget.RecyclerView";
    }

    @Override // android.view.View
    public final int getBaseline() {
        if (this.f1124n != null) {
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final boolean getClipToPadding() {
        return this.f1119i;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return m1178aA().m390h(0);
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f1129s;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f1133w;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return m1178aA().f258a;
    }

    /* JADX INFO: renamed from: j */
    public final View m1256j(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final String m1257k() {
        return " " + super.toString() + ", adapter:" + this.f1123m + ", layout:" + this.f1124n + ", context:" + getContext();
    }

    /* JADX INFO: renamed from: o */
    public final void m1258o(C0829mo c0829mo) {
        View view = c0829mo.f41155a;
        ViewParent parent = view.getParent();
        this.f1116f.m16324m(m1255g(view));
        if (c0829mo.m16696w()) {
            this.f1118h.m13616h(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (parent != this) {
            this.f1118h.m13615g(view, -1, true);
            return;
        }
        C0756jw c0756jw = this.f1118h;
        int iM1637j = c0756jw.f34934c.m1637j(view);
        if (iM1637j >= 0) {
            c0756jw.f34932a.m13533e(iM1637j);
            c0756jw.m13618j(view);
        } else {
            StringBuilder sb = new StringBuilder();
            String str = KMNlNMe.anDxDFRUy;
            sb.append(str);
            sb.append(view);
            throw new IllegalArgumentException(str.concat(view.toString()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1099aj = 0;
        this.f1129s = true;
        this.f1131u = this.f1131u && !isLayoutRequested();
        this.f1116f.m16316e();
        AbstractC0812ly abstractC0812ly = this.f1124n;
        if (abstractC0812ly != null) {
            abstractC0812ly.m16148aE(this);
        }
        this.f1078P = false;
        if (f1060c) {
            RunnableC0780kt runnableC0780kt = (RunnableC0780kt) RunnableC0780kt.f37151a.get();
            this.f1073K = runnableC0780kt;
            if (runnableC0780kt == null) {
                this.f1073K = new RunnableC0780kt();
                Display displayM445f = afc.m445f(this);
                float f = 60.0f;
                if (!isInEditMode() && displayM445f != null) {
                    float refreshRate = displayM445f.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                RunnableC0780kt runnableC0780kt2 = this.f1073K;
                runnableC0780kt2.f37155e = (long) (1.0E9f / f);
                RunnableC0780kt.f37151a.set(runnableC0780kt2);
            }
            this.f1073K.f37153c.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        RunnableC0780kt runnableC0780kt;
        super.onDetachedFromWindow();
        AbstractC0809lv abstractC0809lv = this.f1068F;
        if (abstractC0809lv != null) {
            abstractC0809lv.mo11860c();
        }
        m1235ah();
        this.f1129s = false;
        AbstractC0812ly abstractC0812ly = this.f1124n;
        if (abstractC0812ly != null) {
            abstractC0812ly.m16182bn(this);
        }
        this.f1081S.clear();
        removeCallbacks(this.f1086aB);
        while (C0863nv.f44722a.mo320a() != null) {
        }
        C0818md c0818md = this.f1116f;
        for (int i = 0; i < c0818md.f40023c.size(); i++) {
            abn.m143c(((C0829mo) c0818md.f40023c.get(i)).f41155a);
        }
        c0818md.m16317f(c0818md.f40026f.f1123m, false);
        Iterator itMo18817a = new opd(this, 1).mo18817a();
        while (itMo18817a.hasNext()) {
            abn.m144d((View) itMo18817a.next()).m2592m();
        }
        if (!f1060c || (runnableC0780kt = this.f1073K) == null) {
            return;
        }
        runnableC0780kt.f37153c.remove(this);
        this.f1073K = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f1126p.size();
        for (int i = 0; i < size; i++) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float axisValue;
        if (this.f1124n != null && !this.f1133w && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f = this.f1124n.mo1163W() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.f1124n.mo1162V() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                axisValue = motionEvent.getAxisValue(26);
                if (this.f1124n.mo1163W()) {
                    f = -axisValue;
                    axisValue = 0.0f;
                } else if (this.f1124n.mo1162V()) {
                    f = 0.0f;
                } else {
                    f = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                f = 0.0f;
                axisValue = 0.0f;
            }
            if (f != 0.0f || axisValue != 0.0f) {
                float f2 = axisValue * this.f1109at;
                float f3 = f * this.f1110au;
                AbstractC0812ly abstractC0812ly = this.f1124n;
                if (abstractC0812ly == null) {
                    Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else if (!this.f1133w) {
                    int[] iArr = this.f1080R;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean zMo1162V = abstractC0812ly.mo1162V();
                    boolean zMo1163W = abstractC0812ly.mo1163W();
                    int i = zMo1162V ? 1 : 0;
                    if (zMo1163W) {
                        i |= 2;
                    }
                    float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
                    float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
                    int i2 = (int) f3;
                    int i3 = (int) f2;
                    int iM1177a = i3 - m1177a(i3, height);
                    int iM1196az = i2 - m1196az(i2, width);
                    m1245au(i, 1);
                    if (m1236aj(true != zMo1162V ? 0 : iM1177a, true != zMo1163W ? 0 : iM1196az, this.f1080R, this.f1115az, 1)) {
                        int[] iArr2 = this.f1080R;
                        iM1177a -= iArr2[0];
                        iM1196az -= iArr2[1];
                    }
                    m1241ao(true != zMo1162V ? 0 : iM1177a, true != zMo1163W ? 0 : iM1196az, motionEvent, 1);
                    RunnableC0780kt runnableC0780kt = this.f1073K;
                    if (runnableC0780kt != null) {
                        if (iM1177a != 0) {
                            runnableC0780kt.m14832a(this, iM1177a, iM1196az);
                        } else if (iM1196az != 0) {
                            iM1177a = 0;
                            runnableC0780kt.m14832a(this, iM1177a, iM1196az);
                        }
                    }
                    m1234ag(1);
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:79:0x019e  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int i;
        boolean z2;
        if (this.f1133w) {
            return false;
        }
        this.f1128r = null;
        if (m1189aL(motionEvent)) {
            m1179aB();
            return true;
        }
        AbstractC0812ly abstractC0812ly = this.f1124n;
        if (abstractC0812ly == null) {
            return false;
        }
        boolean zMo1162V = abstractC0812ly.mo1162V();
        boolean zMo1163W = abstractC0812ly.mo1163W();
        if (this.f1103an == null) {
            this.f1103an = VelocityTracker.obtain();
        }
        this.f1103an.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        switch (actionMasked) {
            case 0:
                if (this.f1096ag) {
                    this.f1096ag = false;
                }
                this.f1102am = motionEvent.getPointerId(0);
                int x = (int) (motionEvent.getX() + 0.5f);
                this.f1106aq = x;
                this.f1104ao = x;
                int y = (int) (motionEvent.getY() + 0.5f);
                this.f1107ar = y;
                this.f1105ap = y;
                EdgeEffect edgeEffect = this.f1064B;
                if (edgeEffect == null || ahi.m670a(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                    z = false;
                } else {
                    ahi.m671b(this.f1064B, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                    z = true;
                }
                EdgeEffect edgeEffect2 = this.f1066D;
                if (edgeEffect2 != null && ahi.m670a(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                    ahi.m671b(this.f1066D, 0.0f, motionEvent.getY() / getHeight());
                    z = true;
                }
                EdgeEffect edgeEffect3 = this.f1065C;
                if (edgeEffect3 != null && ahi.m670a(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                    ahi.m671b(this.f1065C, 0.0f, motionEvent.getX() / getWidth());
                    z = true;
                }
                EdgeEffect edgeEffect4 = this.f1067E;
                if (edgeEffect4 == null || ahi.m670a(edgeEffect4) == 0.0f || canScrollVertically(1)) {
                    if (z || this.f1101al == 2) {
                    }
                    int[] iArr = this.f1085aA;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    i = zMo1162V;
                    if (zMo1163W) {
                        i = (zMo1162V ? 1 : 0) | 2;
                    }
                    m1245au(i, 0);
                } else {
                    ahi.m671b(this.f1067E, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                m1229ab(1);
                m1234ag(1);
                int[] iArr2 = this.f1085aA;
                iArr2[1] = 0;
                iArr2[0] = 0;
                i = zMo1162V;
                if (zMo1163W) {
                    i = (zMo1162V ? 1 : 0) | 2;
                }
                m1245au(i, 0);
                break;
            case 1:
                this.f1103an.clear();
                m1234ag(0);
                break;
            case 2:
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f1102am);
                if (iFindPointerIndex < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1102am + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                float x2 = motionEvent.getX(iFindPointerIndex) + 0.5f;
                float y2 = motionEvent.getY(iFindPointerIndex) + 0.5f;
                if (this.f1101al != 1) {
                    int i2 = (int) y2;
                    int i3 = (int) x2;
                    int i4 = i3 - this.f1104ao;
                    int i5 = i2 - this.f1105ap;
                    if (!zMo1162V || Math.abs(i4) <= this.f1069G) {
                        z2 = false;
                    } else {
                        this.f1106aq = i3;
                        z2 = true;
                    }
                    if (zMo1163W && Math.abs(i5) > this.f1069G) {
                        this.f1107ar = i2;
                    } else if (z2) {
                    }
                    m1229ab(1);
                }
                break;
            case 3:
                m1179aB();
                break;
            case 5:
                this.f1102am = motionEvent.getPointerId(actionIndex);
                int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.f1106aq = x3;
                this.f1104ao = x3;
                int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.f1107ar = y3;
                this.f1105ap = y3;
                break;
            case 6:
                m1183aF(motionEvent);
                break;
        }
        return this.f1101al == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        adq.m303a("RV OnLayout");
        m1266x();
        adq.m304b();
        this.f1131u = true;
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        AbstractC0812ly abstractC0812ly = this.f1124n;
        if (abstractC0812ly == null) {
            m1264v(i, i2);
            return;
        }
        boolean z = false;
        if (abstractC0812ly.mo1164X()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f1124n.m16180bl(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.f1087aC = z;
            if (z || this.f1123m == null) {
                return;
            }
            if (this.f1075M.f40919d == 1) {
                m1180aC();
            }
            this.f1124n.m16157aR(i, i2);
            this.f1075M.f40924i = true;
            m1181aD();
            this.f1124n.m16159aT(i, i2);
            if (this.f1124n.mo1167aa()) {
                this.f1124n.m16157aR(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f1075M.f40924i = true;
                m1181aD();
                this.f1124n.m16159aT(i, i2);
            }
            this.f1088aD = getMeasuredWidth();
            this.f1089aE = getMeasuredHeight();
            return;
        }
        if (this.f1130t) {
            abstractC0812ly.m16180bl(i, i2);
            return;
        }
        if (this.f1134x) {
            m1232ae();
            m1215N();
            m1184aG();
            m1216O();
            C0826ml c0826ml = this.f1075M;
            if (c0826ml.f40926k) {
                c0826ml.f40922g = true;
            } else {
                this.f1082T.m13599f();
                this.f1075M.f40922g = false;
            }
            this.f1134x = false;
            m1233af(false);
        } else if (this.f1075M.f40926k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC0806ls abstractC0806ls = this.f1123m;
        if (abstractC0806ls != null) {
            this.f1075M.f40920e = abstractC0806ls.mo1762a();
        } else {
            this.f1075M.f40920e = 0;
        }
        m1232ae();
        this.f1124n.m16180bl(i, i2);
        m1233af(false);
        this.f1075M.f40922g = false;
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (m1240an()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0822mh)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0822mh c0822mh = (C0822mh) parcelable;
        this.f1117g = c0822mh;
        super.onRestoreInstanceState(c0822mh.f394d);
        requestLayout();
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        C0822mh c0822mh = new C0822mh(super.onSaveInstanceState());
        C0822mh c0822mh2 = this.f1117g;
        if (c0822mh2 != null) {
            c0822mh.f40471a = c0822mh2.f40471a;
        } else {
            AbstractC0812ly abstractC0812ly = this.f1124n;
            c0822mh.f40471a = abstractC0812ly != null ? abstractC0812ly.mo1151K() : null;
        }
        return c0822mh;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        m1208G();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        boolean z;
        int i2 = 0;
        if (this.f1133w || this.f1096ag) {
            return false;
        }
        InterfaceC0816mb interfaceC0816mb = this.f1128r;
        if (interfaceC0816mb != null) {
            interfaceC0816mb.mo11897A(motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.f1128r = null;
            }
        } else if (motionEvent.getAction() == 0 || !m1189aL(motionEvent)) {
            AbstractC0812ly abstractC0812ly = this.f1124n;
            if (abstractC0812ly == null) {
                return false;
            }
            boolean zMo1162V = abstractC0812ly.mo1162V();
            boolean zMo1163W = abstractC0812ly.mo1163W();
            if (this.f1103an == null) {
                this.f1103an = VelocityTracker.obtain();
            }
            int actionMasked = motionEvent.getActionMasked();
            int actionIndex = motionEvent.getActionIndex();
            if (actionMasked == 0) {
                int[] iArr = this.f1085aA;
                iArr[1] = 0;
                iArr[0] = 0;
                actionMasked = 0;
            }
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            int[] iArr2 = this.f1085aA;
            motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
            switch (actionMasked) {
                case 0:
                    this.f1102am = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.f1106aq = x;
                    this.f1104ao = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.f1107ar = y;
                    this.f1105ap = y;
                    int i3 = zMo1162V;
                    if (zMo1163W) {
                        i3 = (zMo1162V ? 1 : 0) | 2;
                    }
                    m1245au(i3, 0);
                    this.f1103an.addMovement(motionEventObtain);
                    motionEventObtain.recycle();
                    return true;
                case 1:
                    this.f1103an.addMovement(motionEventObtain);
                    this.f1103an.computeCurrentVelocity(1000, this.f1108as);
                    float f = zMo1162V ? -this.f1103an.getXVelocity(this.f1102am) : 0.0f;
                    float f2 = zMo1163W ? -this.f1103an.getYVelocity(this.f1102am) : 0.0f;
                    if ((f == 0.0f && f2 == 0.0f) || !mo1237ak((int) f, (int) f2)) {
                        m1229ab(0);
                    }
                    m1187aJ();
                    motionEventObtain.recycle();
                    return true;
                case 2:
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f1102am);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1102am + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    float x2 = motionEvent.getX(iFindPointerIndex) + 0.5f;
                    float y2 = motionEvent.getY(iFindPointerIndex) + 0.5f;
                    int i4 = (int) x2;
                    int i5 = this.f1106aq - i4;
                    int i6 = (int) y2;
                    int iMax = this.f1107ar - i6;
                    if (this.f1101al != 1) {
                        if (zMo1162V) {
                            int iMax2 = i5 > 0 ? Math.max(0, i5 - this.f1069G) : Math.min(0, i5 + this.f1069G);
                            if (iMax2 != 0) {
                                i5 = iMax2;
                                z = true;
                            } else {
                                i5 = iMax2;
                                z = false;
                            }
                        } else {
                            z = false;
                        }
                        if (zMo1163W) {
                            iMax = iMax > 0 ? Math.max(0, iMax - this.f1069G) : Math.min(0, iMax + this.f1069G);
                            if (iMax != 0) {
                                z = true;
                            }
                        }
                        if (z) {
                            m1229ab(1);
                        }
                    }
                    if (this.f1101al == 1) {
                        int[] iArr3 = this.f1080R;
                        iArr3[0] = 0;
                        iArr3[1] = 0;
                        int iM1177a = i5 - m1177a(i5, motionEvent.getY());
                        int iM1196az = iMax - m1196az(iMax, motionEvent.getX());
                        if (m1236aj(true != zMo1162V ? 0 : iM1177a, true != zMo1163W ? 0 : iM1196az, this.f1080R, this.f1115az, 0)) {
                            int[] iArr4 = this.f1080R;
                            iM1177a -= iArr4[0];
                            int i7 = iM1196az - iArr4[1];
                            int[] iArr5 = this.f1085aA;
                            int i8 = iArr5[0];
                            int[] iArr6 = this.f1115az;
                            iArr5[0] = i8 + iArr6[0];
                            iArr5[1] = iArr5[1] + iArr6[1];
                            getParent().requestDisallowInterceptTouchEvent(true);
                            i = i7;
                        } else {
                            i = iM1196az;
                        }
                        int[] iArr7 = this.f1115az;
                        this.f1106aq = i4 - iArr7[0];
                        this.f1107ar = i6 - iArr7[1];
                        if (m1241ao(true != zMo1162V ? 0 : iM1177a, true != zMo1163W ? 0 : i, motionEvent, 0)) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        RunnableC0780kt runnableC0780kt = this.f1073K;
                        if (runnableC0780kt != null) {
                            if (iM1177a != 0) {
                                i2 = iM1177a;
                            } else if (i != 0) {
                            }
                            runnableC0780kt.m14832a(this, i2, i);
                        }
                    }
                    this.f1103an.addMovement(motionEventObtain);
                    motionEventObtain.recycle();
                    return true;
                case 3:
                    m1179aB();
                    this.f1103an.addMovement(motionEventObtain);
                    motionEventObtain.recycle();
                    return true;
                case 4:
                default:
                    this.f1103an.addMovement(motionEventObtain);
                    motionEventObtain.recycle();
                    return true;
                case 5:
                    this.f1102am = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f1106aq = x3;
                    this.f1104ao = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f1107ar = y3;
                    this.f1105ap = y3;
                    this.f1103an.addMovement(motionEventObtain);
                    motionEventObtain.recycle();
                    return true;
                case 6:
                    m1183aF(motionEvent);
                    this.f1103an.addMovement(motionEventObtain);
                    motionEventObtain.recycle();
                    return true;
            }
        }
        m1179aB();
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m1259p(InterfaceC0816mb interfaceC0816mb) {
        this.f1127q.add(interfaceC0816mb);
    }

    /* JADX INFO: renamed from: q */
    public final void m1260q(String str) {
        if (m1240an()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(m1257k()));
        }
        if (this.f1100ak > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("".concat(m1257k())));
        }
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        C0829mo c0829moM1197h = m1197h(view);
        if (c0829moM1197h != null) {
            if (c0829moM1197h.m16696w()) {
                c0829moM1197h.m16682i();
            } else if (!c0829moM1197h.m16699z()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + c0829moM1197h + m1257k());
            }
        }
        view.clearAnimation();
        m1265w(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.f1124n.m16162aX() && !m1240an() && view2 != null) {
            m1185aH(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f1124n.mo2043aY(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f1127q.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC0816mb) this.f1127q.get(i)).mo11899z();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f1095af != 0 || this.f1133w) {
            this.f1132v = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX INFO: renamed from: s */
    final void m1261s() {
        int iM13611c = this.f1118h.m13611c();
        for (int i = 0; i < iM13611c; i++) {
            C0829mo c0829moM1197h = m1197h(this.f1118h.m13614f(i));
            if (!c0829moM1197h.m16699z()) {
                c0829moM1197h.m16679f();
            }
        }
        C0818md c0818md = this.f1116f;
        int size = c0818md.f40023c.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0829mo) c0818md.f40023c.get(i2)).m16679f();
        }
        int size2 = c0818md.f40021a.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((C0829mo) c0818md.f40021a.get(i3)).m16679f();
        }
        ArrayList arrayList = c0818md.f40022b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((C0829mo) c0818md.f40022b.get(i4)).m16679f();
            }
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        AbstractC0812ly abstractC0812ly = this.f1124n;
        if (abstractC0812ly == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f1133w) {
            return;
        }
        boolean zMo1162V = abstractC0812ly.mo1162V();
        boolean zMo1163W = abstractC0812ly.mo1163W();
        if (!zMo1162V) {
            if (!zMo1163W) {
                return;
            } else {
                zMo1163W = true;
            }
        }
        if (true != zMo1162V) {
            i = 0;
        }
        if (true != zMo1163W) {
            i2 = 0;
        }
        m1241ao(i, i2, null, 0);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!m1240an()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int iM617a = accessibilityEvent != null ? agq.m617a(accessibilityEvent) : 0;
            this.f1097ah |= iM617a != 0 ? iM617a : 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void setClipToPadding(boolean z) {
        if (z != this.f1119i) {
            m1208G();
        }
        this.f1119i = z;
        super.setClipToPadding(z);
        if (this.f1131u) {
            requestLayout();
        }
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        m1178aA().m383a(z);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return m1178aA().m391i(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        m1178aA().m384b(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.f1133w) {
            m1260q("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f1133w = true;
                this.f1096ag = true;
                m1235ah();
                return;
            }
            this.f1133w = false;
            if (this.f1132v && this.f1124n != null && this.f1123m != null) {
                requestLayout();
            }
            this.f1132v = false;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m1262t(int i, int i2) {
        EdgeEffect edgeEffect = this.f1064B;
        boolean zIsFinished = false;
        if (edgeEffect != null && !edgeEffect.isFinished() && i > 0) {
            this.f1064B.onRelease();
            zIsFinished = this.f1064B.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1066D;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f1066D.onRelease();
            zIsFinished |= this.f1066D.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1065C;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f1065C.onRelease();
            zIsFinished |= this.f1065C.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1067E;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f1067E.onRelease();
            zIsFinished |= this.f1067E.isFinished();
        }
        if (zIsFinished) {
            afb.m426g(this);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m1263u() {
        if (!this.f1131u || this.f1136z) {
            adq.m303a("RV FullInvalidate");
            m1266x();
            adq.m304b();
            return;
        }
        if (this.f1082T.m13606m()) {
            if (!this.f1082T.m13605l(4) || this.f1082T.m13605l(11)) {
                if (this.f1082T.m13606m()) {
                    adq.m303a("RV FullInvalidate");
                    m1266x();
                    adq.m304b();
                    return;
                }
                return;
            }
            adq.m303a("RV PartialInvalidate");
            m1232ae();
            m1215N();
            this.f1082T.m13601h();
            if (!this.f1132v) {
                int iM13609a = this.f1118h.m13609a();
                for (int i = 0; i < iM13609a; i++) {
                    C0829mo c0829moM1197h = m1197h(this.f1118h.m13613e(i));
                    if (c0829moM1197h != null && !c0829moM1197h.m16699z() && c0829moM1197h.m16697x()) {
                        m1266x();
                    }
                }
                this.f1082T.m13598e();
            }
            m1233af(true);
            m1216O();
            adq.m304b();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m1264v(int i, int i2) {
        setMeasuredDimension(AbstractC0812ly.m16128ai(i, getPaddingLeft() + getPaddingRight(), afb.m422c(this)), AbstractC0812ly.m16128ai(i2, getPaddingTop() + getPaddingBottom(), afb.m421b(this)));
    }

    /* JADX INFO: renamed from: w */
    public final void m1265w(View view) {
        m1197h(view);
        List list = this.f1135y;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:139:0x0301  */
    /* JADX WARN: Code duplicated, block: B:141:0x030b  */
    /* JADX WARN: Code duplicated, block: B:157:0x0346  */
    /* JADX WARN: Code duplicated, block: B:165:0x035f  */
    /* JADX WARN: Code duplicated, block: B:167:0x0367  */
    /* JADX WARN: Code duplicated, block: B:170:0x036e  */
    /* JADX WARN: Code duplicated, block: B:173:0x0376  */
    /* JADX WARN: Code duplicated, block: B:176:0x037d  */
    /* JADX WARN: Code duplicated, block: B:179:0x0388 A[LOOP:4: B:172:0x0374->B:179:0x0388, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:182:0x0392  */
    /* JADX WARN: Code duplicated, block: B:185:0x0399  */
    /* JADX WARN: Code duplicated, block: B:188:0x03a4 A[LOOP:5: B:181:0x0390->B:188:0x03a4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:192:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:231:0x0385 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x038b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x038b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x03a9 A[EDGE_INSN: B:235:0x03a9->B:191:0x03a9 BREAK  A[LOOP:5: B:181:0x0390->B:188:0x03a4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x03a1 A[SYNTHETIC] */
    /* JADX INFO: renamed from: x */
    final void m1266x() {
        long j;
        C0829mo c0829mo;
        int i;
        int iM16585a;
        int i2;
        int iMin;
        C0829mo c0829moM1254f;
        C0829mo c0829moM1254f2;
        int i3;
        View viewFindViewById;
        AbstractC0806ls abstractC0806ls;
        if (this.f1123m == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f1124n == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        this.f1075M.f40924i = false;
        boolean z = this.f1087aC ? (this.f1088aD == getWidth() && this.f1089aE == getHeight()) ? false : true : false;
        this.f1088aD = 0;
        this.f1089aE = 0;
        this.f1087aC = false;
        if (this.f1075M.f40919d == 1) {
            m1180aC();
            this.f1124n.m16156aQ(this);
            m1181aD();
        } else {
            jvx jvxVar = this.f1082T;
            if ((((ArrayList) jvxVar.f34927c).isEmpty() || ((ArrayList) jvxVar.f34928d).isEmpty()) && !z && this.f1124n.f39543A == getWidth() && this.f1124n.f39544B == getHeight()) {
                this.f1124n.m16156aQ(this);
            } else {
                this.f1124n.m16156aQ(this);
                m1181aD();
            }
        }
        int i4 = 4;
        this.f1075M.m16586b(4);
        m1232ae();
        m1215N();
        C0826ml c0826ml = this.f1075M;
        c0826ml.f40919d = 1;
        View view = null;
        if (c0826ml.f40925j) {
            int iM13609a = this.f1118h.m13609a() - 1;
            while (iM13609a >= 0) {
                C0829mo c0829moM1197h = m1197h(this.f1118h.m13613e(iM13609a));
                if (!c0829moM1197h.m16699z()) {
                    long jM1252d = m1252d(c0829moM1197h);
                    aev aevVarM16074t = AbstractC0809lv.m16074t();
                    aevVarM16074t.m401d(c0829moM1197h);
                    C0829mo c0829mo2 = (C0829mo) ((C1114xc) this.f1084V.f426a).m19546d(jM1252d);
                    if (c0829mo2 == null || c0829mo2.m16699z()) {
                        this.f1084V.m765j(c0829moM1197h, aevVarM16074t);
                    } else {
                        boolean zM763h = this.f1084V.m763h(c0829mo2);
                        boolean zM763h2 = this.f1084V.m763h(c0829moM1197h);
                        if (zM763h && c0829mo2 == c0829moM1197h) {
                            this.f1084V.m765j(c0829moM1197h, aevVarM16074t);
                        } else {
                            aev aevVarM764i = this.f1084V.m764i(c0829mo2, i4);
                            this.f1084V.m765j(c0829moM1197h, aevVarM16074t);
                            aev aevVarM764i2 = this.f1084V.m764i(c0829moM1197h, 8);
                            if (aevVarM764i == null) {
                                int iM13609a2 = this.f1118h.m13609a();
                                for (int i5 = 0; i5 < iM13609a2; i5++) {
                                    C0829mo c0829moM1197h2 = m1197h(this.f1118h.m13613e(i5));
                                    if (c0829moM1197h2 != c0829moM1197h && m1252d(c0829moM1197h2) == jM1252d) {
                                        AbstractC0806ls abstractC0806ls2 = this.f1123m;
                                        if (abstractC0806ls2 == null || !abstractC0806ls2.f39115b) {
                                            throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + c0829moM1197h2 + " \n View Holder 2:" + c0829moM1197h + m1257k());
                                        }
                                        throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + c0829moM1197h2 + " \n View Holder 2:" + c0829moM1197h + m1257k());
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + c0829mo2 + " cannot be found but it is necessary for " + c0829moM1197h + m1257k());
                            } else {
                                c0829mo2.m16686m(false);
                                if (zM763h) {
                                    m1258o(c0829mo2);
                                }
                                if (c0829mo2 != c0829moM1197h) {
                                    if (zM763h2) {
                                        m1258o(c0829moM1197h);
                                    }
                                    c0829mo2.f41162h = c0829moM1197h;
                                    m1258o(c0829mo2);
                                    this.f1116f.m16324m(c0829mo2);
                                    c0829moM1197h.m16686m(false);
                                    c0829moM1197h.f41163i = c0829mo2;
                                }
                                if (this.f1068F.mo16080q(c0829mo2, c0829moM1197h, aevVarM764i, aevVarM764i2)) {
                                    m1220S();
                                }
                            }
                        }
                    }
                }
                iM13609a--;
                i4 = 4;
            }
            aie aieVar = this.f1084V;
            AmbientMode.AmbientController ambientController = this.f1091aG;
            for (int i6 = ((C1117xf) aieVar.f427b).f48004d - 1; i6 >= 0; i6--) {
                C0829mo c0829mo3 = (C0829mo) ((C1117xf) aieVar.f427b).m19559d(i6);
                C0863nv c0863nv = (C0863nv) ((C1117xf) aieVar.f427b).mo3366e(i6);
                int i7 = c0863nv.f44723b;
                if ((i7 & 3) == 3) {
                    ambientController.m1641n(c0829mo3);
                } else if ((i7 & 1) != 0) {
                    aev aevVar = c0863nv.f44724c;
                    if (aevVar == null) {
                        ambientController.m1641n(c0829mo3);
                    } else {
                        ambientController.m1643p(c0829mo3, aevVar, c0863nv.f44725d);
                    }
                } else if ((i7 & 14) == 14) {
                    ambientController.m1642o(c0829mo3, c0863nv.f44724c, c0863nv.f44725d);
                } else if ((i7 & 12) == 12) {
                    aev aevVar2 = c0863nv.f44724c;
                    aev aevVar3 = c0863nv.f44725d;
                    c0829mo3.m16686m(false);
                    RecyclerView recyclerView = (RecyclerView) ambientController.f1697a;
                    if (recyclerView.f1136z) {
                        if (recyclerView.f1068F.mo16080q(c0829mo3, c0829mo3, aevVar2, aevVar3)) {
                            ((RecyclerView) ambientController.f1697a).m1220S();
                        }
                    } else if (recyclerView.f1068F.mo16082s(c0829mo3, aevVar2, aevVar3)) {
                        ((RecyclerView) ambientController.f1697a).m1220S();
                    }
                } else if ((i7 & 4) != 0) {
                    ambientController.m1643p(c0829mo3, c0863nv.f44724c, null);
                } else if ((i7 & 8) != 0) {
                    ambientController.m1642o(c0829mo3, c0863nv.f44724c, c0863nv.f44725d);
                }
                C0863nv.m17742b(c0863nv);
            }
        }
        this.f1124n.m16151aL(this.f1116f);
        C0826ml c0826ml2 = this.f1075M;
        c0826ml2.f40917b = c0826ml2.f40920e;
        this.f1136z = false;
        this.f1063A = false;
        c0826ml2.f40925j = false;
        c0826ml2.f40926k = false;
        this.f1124n.f39552s = false;
        ArrayList arrayList = this.f1116f.f40022b;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC0812ly abstractC0812ly = this.f1124n;
        if (abstractC0812ly.f39557x) {
            abstractC0812ly.f39556w = 0;
            abstractC0812ly.f39557x = false;
            this.f1116f.m16325n();
        }
        this.f1124n.mo1108p(this.f1075M);
        m1216O();
        m1233af(false);
        this.f1084V.m760e();
        int[] iArr = this.f1113ax;
        int i8 = iArr[0];
        int i9 = iArr[1];
        m1182aE(iArr);
        int[] iArr2 = this.f1113ax;
        if (iArr2[0] != i8 || iArr2[1] != i9) {
            m1268z(0, 0);
        }
        if (this.f1111av && this.f1123m != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (isFocused()) {
                j = this.f1075M.f40928m;
                if (j != -1) {
                    abstractC0806ls = this.f1123m;
                    if (abstractC0806ls.f39115b) {
                        c0829mo = null;
                    } else {
                        c0829mo = null;
                    }
                } else {
                    c0829mo = null;
                }
                if (c0829mo != null) {
                    if (this.f1118h.m13609a() > 0) {
                        C0826ml c0826ml3 = this.f1075M;
                        int i10 = c0826ml3.f40927l;
                        if (i10 != -1) {
                        }
                        iM16585a = c0826ml3.m16585a();
                        i2 = i;
                        while (true) {
                            if (i2 < iM16585a) {
                                c0829moM1254f2 = m1254f(i2);
                                if (c0829moM1254f2 != null) {
                                    if (c0829moM1254f2.f41155a.hasFocusable()) {
                                        view = c0829moM1254f2.f41155a;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                            for (iMin = Math.min(iM16585a, i) - 1; iMin >= 0; iMin--) {
                                c0829moM1254f = m1254f(iMin);
                                if (c0829moM1254f == null) {
                                    break;
                                    break;
                                } else {
                                    if (c0829moM1254f.f41155a.hasFocusable()) {
                                        view = c0829moM1254f.f41155a;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                } else if (this.f1118h.m13609a() > 0) {
                    C0826ml c0826ml4 = this.f1075M;
                    int i11 = c0826ml4.f40927l;
                    if (i11 != -1) {
                    }
                    iM16585a = c0826ml4.m16585a();
                    i2 = i;
                    while (true) {
                        if (i2 < iM16585a) {
                            c0829moM1254f2 = m1254f(i2);
                            if (c0829moM1254f2 != null) {
                                if (c0829moM1254f2.f41155a.hasFocusable()) {
                                    view = c0829moM1254f2.f41155a;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            c0829moM1254f = m1254f(iMin);
                            if (c0829moM1254f == null) {
                                break;
                                break;
                            } else {
                                if (c0829moM1254f.f41155a.hasFocusable()) {
                                    view = c0829moM1254f.f41155a;
                                    break;
                                }
                            }
                        }
                    }
                }
                if (view != null) {
                    i3 = this.f1075M.f40929n;
                    if (i3 != -1) {
                        view = viewFindViewById;
                    }
                    view.requestFocus();
                }
            } else if (this.f1118h.m13619k(getFocusedChild())) {
                j = this.f1075M.f40928m;
                if (j != -1) {
                    abstractC0806ls = this.f1123m;
                    if (abstractC0806ls.f39115b || abstractC0806ls == null) {
                        c0829mo = null;
                    } else {
                        int iM13611c = this.f1118h.m13611c();
                        c0829mo = null;
                        for (int i12 = 0; i12 < iM13611c; i12++) {
                            C0829mo c0829moM1197h3 = m1197h(this.f1118h.m13614f(i12));
                            if (c0829moM1197h3 != null && !c0829moM1197h3.m16694u() && c0829moM1197h3.f41159e == j) {
                                if (!this.f1118h.m13619k(c0829moM1197h3.f41155a)) {
                                    c0829mo = c0829moM1197h3;
                                    break;
                                }
                                c0829mo = c0829moM1197h3;
                            }
                        }
                    }
                } else {
                    c0829mo = null;
                }
                if (c0829mo != null && !this.f1118h.m13619k(c0829mo.f41155a) && c0829mo.f41155a.hasFocusable()) {
                    view = c0829mo.f41155a;
                } else if (this.f1118h.m13609a() > 0) {
                    C0826ml c0826ml5 = this.f1075M;
                    int i13 = c0826ml5.f40927l;
                    i = i13 != -1 ? i13 : 0;
                    iM16585a = c0826ml5.m16585a();
                    i2 = i;
                    while (true) {
                        if (i2 < iM16585a) {
                            c0829moM1254f2 = m1254f(i2);
                            if (c0829moM1254f2 != null) {
                                if (c0829moM1254f2.f41155a.hasFocusable()) {
                                    view = c0829moM1254f2.f41155a;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            c0829moM1254f = m1254f(iMin);
                            if (c0829moM1254f == null) {
                                break;
                            }
                            if (c0829moM1254f.f41155a.hasFocusable()) {
                                view = c0829moM1254f.f41155a;
                                break;
                            }
                        }
                    }
                }
                if (view != null) {
                    i3 = this.f1075M.f40929n;
                    if (i3 != -1 && (viewFindViewById = view.findViewById(i3)) != null && viewFindViewById.isFocusable()) {
                        view = viewFindViewById;
                    }
                    view.requestFocus();
                }
            }
        }
        m1186aI();
    }

    /* JADX INFO: renamed from: y */
    public final void m1267y(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        m1178aA().m389g(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* JADX INFO: renamed from: z */
    public final void m1268z(int i, int i2) {
        this.f1100ak++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        mo1219R(i, i2);
        List list = this.f1112aw;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((C0167es) this.f1112aw.get(size)).mo2034c(this, i, i2);
            }
        }
        this.f1100ak--;
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0100R.attr.recyclerViewStyle);
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1093ad = new C0820mf(this);
        this.f1116f = new C0818md(this);
        this.f1084V = new aie((byte[]) null);
        this.f1120j = new RunnableC0059be(this, 19);
        this.f1121k = new Rect();
        this.f1094ae = new Rect();
        this.f1122l = new RectF();
        this.f1125o = new ArrayList();
        this.f1126p = new ArrayList();
        this.f1127q = new ArrayList();
        this.f1095af = 0;
        this.f1136z = false;
        this.f1063A = false;
        this.f1099aj = 0;
        this.f1100ak = 0;
        this.f1083U = f1062e;
        this.f1068F = new C0766kf();
        this.f1101al = 0;
        this.f1102am = -1;
        this.f1109at = Float.MIN_VALUE;
        this.f1110au = Float.MIN_VALUE;
        this.f1111av = true;
        this.f1072J = new RunnableC0828mn(this);
        this.f1074L = f1060c ? new C0778kr() : null;
        this.f1075M = new C0826ml();
        this.f1076N = false;
        this.f1077O = false;
        this.f1090aF = new AmbientMode.AmbientController(this);
        this.f1078P = false;
        this.f1113ax = new int[2];
        this.f1115az = new int[2];
        this.f1085aA = new int[2];
        this.f1080R = new int[2];
        this.f1081S = new ArrayList();
        this.f1086aB = new RunnableC0059be(this, 20);
        this.f1088aD = 0;
        this.f1089aE = 0;
        this.f1091aG = new AmbientMode.AmbientController(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1069G = viewConfiguration.getScaledTouchSlop();
        this.f1109at = afr.m553a(viewConfiguration);
        this.f1110au = afr.m554b(viewConfiguration);
        this.f1071I = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1108as = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1092ac = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f1068F.f39375l = this.f1090aF;
        this.f1082T = new jvx(new AmbientMode.AmbientController(this), null, null, null);
        this.f1118h = new C0756jw(new AmbientMode.AmbientController(this), null, null, null);
        if (afk.m509a(this) == 0) {
            afk.m515g(this, 8);
        }
        if (afb.m420a(this) == 0) {
            afb.m434o(this, 1);
        }
        this.f1098ai = (AccessibilityManager) getContext().getSystemService("accessibility");
        m1225X(new C0831mq(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0196fu.f23572a, i, 0);
        afn.m536c(this, context, C0196fu.f23572a, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f1119i = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables.".concat(m1257k()));
            }
            Resources resources = getContext().getResources();
            new C0776kp(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C0100R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(C0100R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(C0100R.dimen.fastscroll_margin));
        }
        typedArrayObtainStyledAttributes.recycle();
        m1192aO(context, string, attributeSet, i);
        int[] iArr = f1055W;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        afn.m536c(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes2, i, 0);
        boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z);
        setTag(C0100R.id.is_pooling_container_tag, true);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC0812ly abstractC0812ly = this.f1124n;
        if (abstractC0812ly == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager".concat(m1257k()));
        }
        return abstractC0812ly.mo1099g(layoutParams);
    }
}
