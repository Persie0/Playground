package p000;

import android.animation.ValueAnimator;
import android.content.ComponentName;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: be */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0059be implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f3018a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f3019b;

    public /* synthetic */ RunnableC0059be(Context context, int i) {
        this.f3019b = i;
        this.f3018a = context;
    }

    public RunnableC0059be(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f3019b = i;
        this.f3018a = actionBarOverlayLayout;
    }

    public RunnableC0059be(RecyclerView recyclerView, int i) {
        this.f3019b = i;
        this.f3018a = recyclerView;
    }

    public RunnableC0059be(AnimationAnimationListenerC0055ba animationAnimationListenerC0055ba, int i) {
        this.f3019b = i;
        this.f3018a = animationAnimationListenerC0055ba;
    }

    public /* synthetic */ RunnableC0059be(ComponentCallbacksC0077bw componentCallbacksC0077bw, int i) {
        this.f3019b = i;
        this.f3018a = componentCallbacksC0077bw;
    }

    public RunnableC0059be(ComponentCallbacksC0077bw componentCallbacksC0077bw, int i, byte[] bArr) {
        this.f3019b = i;
        this.f3018a = componentCallbacksC0077bw;
    }

    public RunnableC0059be(ComponentCallbacksC0077bw componentCallbacksC0077bw, int i, char[] cArr) {
        this.f3019b = i;
        this.f3018a = componentCallbacksC0077bw;
    }

    public RunnableC0059be(C0111cq c0111cq, int i) {
        this.f3019b = i;
        this.f3018a = c0111cq;
    }

    public RunnableC0059be(C0134dm c0134dm, int i) {
        this.f3019b = i;
        this.f3018a = c0134dm;
    }

    public RunnableC0059be(LayoutInflaterFactory2C0179fd layoutInflaterFactory2C0179fd, int i) {
        this.f3019b = i;
        this.f3018a = layoutInflaterFactory2C0179fd;
    }

    public RunnableC0059be(C0186fk c0186fk, int i) {
        this.f3019b = i;
        this.f3018a = c0186fk;
    }

    public RunnableC0059be(ArrayList arrayList, int i) {
        this.f3019b = i;
        this.f3018a = arrayList;
    }

    public RunnableC0059be(C0773km c0773km, int i) {
        this.f3019b = i;
        this.f3018a = c0773km;
    }

    public RunnableC0059be(C0776kp c0776kp, int i) {
        this.f3019b = i;
        this.f3018a = c0776kp;
    }

    public RunnableC0059be(AbstractViewOnTouchListenerC0777kq abstractViewOnTouchListenerC0777kq, int i) {
        this.f3019b = i;
        this.f3018a = abstractViewOnTouchListenerC0777kq;
    }

    public RunnableC0059be(C0794lg c0794lg, int i) {
        this.f3019b = i;
        this.f3018a = c0794lg;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0264  */
    /* JADX WARN: Code duplicated, block: B:107:0x026d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0279  */
    /* JADX WARN: Code duplicated, block: B:112:0x0283  */
    @Override // java.lang.Runnable
    public final void run() {
        adn adnVarM301b;
        String strM6520q;
        Object systemService;
        Context contextMo7432a;
        Object systemService2 = null;
        switch (this.f3019b) {
            case 0:
                C0119cy.m5729b((ArrayList) this.f3018a, 4);
                return;
            case 1:
                AnimationAnimationListenerC0055ba animationAnimationListenerC0055ba = (AnimationAnimationListenerC0055ba) this.f3018a;
                animationAnimationListenerC0055ba.f2834b.endViewTransition(animationAnimationListenerC0055ba.f2835c);
                ((AnimationAnimationListenerC0055ba) this.f3018a).f2836d.m2373b();
                return;
            case 2:
                ComponentCallbacksC0077bw componentCallbacksC0077bw = (ComponentCallbacksC0077bw) this.f3018a;
                componentCallbacksC0077bw.f4595W.f10832b.m3225h(componentCallbacksC0077bw.f4607i);
                componentCallbacksC0077bw.f4607i = null;
                return;
            case 3:
                ComponentCallbacksC0077bw componentCallbacksC0077bw2 = (ComponentCallbacksC0077bw) this.f3018a;
                if (componentCallbacksC0077bw2.f4589Q == null || !componentCallbacksC0077bw2.m3114i().f4273s) {
                    return;
                }
                if (componentCallbacksC0077bw2.f4624z == null) {
                    componentCallbacksC0077bw2.m3114i().f4273s = false;
                    return;
                } else if (Looper.myLooper() != componentCallbacksC0077bw2.f4624z.f5400d.getLooper()) {
                    componentCallbacksC0077bw2.f4624z.f5400d.postAtFrontOfQueue(new RunnableC0059be(componentCallbacksC0077bw2, 4, (char[]) null));
                    return;
                } else {
                    componentCallbacksC0077bw2.m3118m(true);
                    return;
                }
            case 4:
                ((ComponentCallbacksC0077bw) this.f3018a).m3118m(false);
                return;
            case 5:
                ((C0134dm) this.f3018a).m6391c();
                return;
            case 6:
                ((C0111cq) this.f3018a).m5317ab(true);
                return;
            case 7:
                Context context = (Context) this.f3018a;
                ComponentName componentName = new ComponentName(context, "android.support.v7.app.AppLocalesMetadataHolderService");
                if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                    Iterator it = AbstractC0160el.f14536d.iterator();
                    while (it.hasNext()) {
                        AbstractC0160el abstractC0160el = (AbstractC0160el) ((WeakReference) it.next()).get();
                        if (abstractC0160el != null && (contextMo7432a = abstractC0160el.mo7432a()) != null) {
                            systemService2 = contextMo7432a.getSystemService("locale");
                            if (systemService2 != null) {
                                adnVarM301b = adn.m301b(C0159ek.m7404a(systemService2));
                            } else {
                                adnVarM301b = adn.f164a;
                            }
                            if (adnVarM301b.f165b.f166a.isEmpty()) {
                                strM6520q = C0137dp.m6520q(context);
                                systemService = context.getSystemService("locale");
                                if (systemService != null) {
                                    C0159ek.m7405b(systemService, C0158ej.m7377a(strM6520q));
                                }
                            }
                            context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        }
                    }
                    if (systemService2 != null) {
                        adnVarM301b = adn.m301b(C0159ek.m7404a(systemService2));
                    } else {
                        adnVarM301b = adn.f164a;
                    }
                    if (adnVarM301b.f165b.f166a.isEmpty()) {
                        strM6520q = C0137dp.m6520q(context);
                        systemService = context.getSystemService("locale");
                        if (systemService != null) {
                            C0159ek.m7405b(systemService, C0158ej.m7377a(strM6520q));
                        }
                    }
                    context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                }
                AbstractC0160el.f14535c = true;
                return;
            case 8:
                LayoutInflaterFactory2C0179fd layoutInflaterFactory2C0179fd = (LayoutInflaterFactory2C0179fd) this.f3018a;
                if ((layoutInflaterFactory2C0179fd.f21349H & 1) != 0) {
                    layoutInflaterFactory2C0179fd.m8259z(0);
                }
                LayoutInflaterFactory2C0179fd layoutInflaterFactory2C0179fd2 = (LayoutInflaterFactory2C0179fd) this.f3018a;
                if ((layoutInflaterFactory2C0179fd2.f21349H & 4096) != 0) {
                    layoutInflaterFactory2C0179fd2.m8259z(108);
                }
                LayoutInflaterFactory2C0179fd layoutInflaterFactory2C0179fd3 = (LayoutInflaterFactory2C0179fd) this.f3018a;
                layoutInflaterFactory2C0179fd3.f21348G = false;
                layoutInflaterFactory2C0179fd3.f21349H = 0;
                return;
            case 9:
                LayoutInflaterFactory2C0179fd layoutInflaterFactory2C0179fd4 = (LayoutInflaterFactory2C0179fd) this.f3018a;
                layoutInflaterFactory2C0179fd4.f21382q.showAtLocation(layoutInflaterFactory2C0179fd4.f21381p, 55, 0, 0);
                ((LayoutInflaterFactory2C0179fd) this.f3018a).m8234A();
                if (!((LayoutInflaterFactory2C0179fd) this.f3018a).m8243J()) {
                    ((LayoutInflaterFactory2C0179fd) this.f3018a).f21381p.setAlpha(1.0f);
                    ((LayoutInflaterFactory2C0179fd) this.f3018a).f21381p.setVisibility(0);
                    return;
                }
                ((LayoutInflaterFactory2C0179fd) this.f3018a).f21381p.setAlpha(0.0f);
                LayoutInflaterFactory2C0179fd layoutInflaterFactory2C0179fd5 = (LayoutInflaterFactory2C0179fd) this.f3018a;
                bkn bknVarM551k = afq.m551k(layoutInflaterFactory2C0179fd5.f21381p);
                bknVarM551k.m2594o(1.0f);
                layoutInflaterFactory2C0179fd5.f21352K = bknVarM551k;
                ((LayoutInflaterFactory2C0179fd) this.f3018a).f21352K.m2596q(new C0162en(this, null));
                return;
            case 10:
                Object obj = this.f3018a;
                Menu menuM8502v = ((C0186fk) obj).m8502v();
                Menu menu = true != (menuM8502v instanceof C0225gw) ? null : menuM8502v;
                if (menu != null) {
                    ((C0225gw) menu).m9839s();
                }
                try {
                    menuM8502v.clear();
                    if (!((C0186fk) obj).f22354b.onCreatePanelMenu(0, menuM8502v) || !((C0186fk) obj).f22354b.onPreparePanel(0, null, menuM8502v)) {
                        menuM8502v.clear();
                    }
                    if (menu != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (menu != null) {
                        ((C0225gw) menu).m9838r();
                    }
                }
                break;
            case 11:
                ((ActionBarOverlayLayout) this.f3018a).m1054b();
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f3018a;
                actionBarOverlayLayout.f969i = actionBarOverlayLayout.f963c.animate().translationY(0.0f).setListener(((ActionBarOverlayLayout) this.f3018a).f970j);
                return;
            case 12:
                ((ActionBarOverlayLayout) this.f3018a).m1054b();
                ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f3018a;
                actionBarOverlayLayout2.f969i = actionBarOverlayLayout2.f963c.animate().translationY(-((ActionBarOverlayLayout) this.f3018a).f963c.getHeight()).setListener(((ActionBarOverlayLayout) this.f3018a).f970j);
                return;
            case 13:
                C0773km c0773km = (C0773km) this.f3018a;
                c0773km.f36512b = null;
                c0773km.drawableStateChanged();
                return;
            case 14:
                C0776kp c0776kp = (C0776kp) this.f3018a;
                switch (c0776kp.f36749q) {
                    case 1:
                        c0776kp.f36748p.cancel();
                        break;
                    case 2:
                        break;
                    default:
                        return;
                }
                c0776kp.f36749q = 3;
                ValueAnimator valueAnimator = c0776kp.f36748p;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                c0776kp.f36748p.setDuration(500L);
                c0776kp.f36748p.start();
                return;
            case 15:
                ViewParent parent = ((AbstractViewOnTouchListenerC0777kq) this.f3018a).f36819c.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            case 16:
                AbstractViewOnTouchListenerC0777kq abstractViewOnTouchListenerC0777kq = (AbstractViewOnTouchListenerC0777kq) this.f3018a;
                abstractViewOnTouchListenerC0777kq.m14680d();
                View view = abstractViewOnTouchListenerC0777kq.f36819c;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0777kq.mo9398b()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    abstractViewOnTouchListenerC0777kq.f36820d = true;
                    return;
                }
                return;
            case 17:
                ((C0794lg) this.f3018a).m15305q();
                return;
            case 18:
                C0773km c0773km2 = ((C0794lg) this.f3018a).f38176e;
                if (c0773km2 == null || !afe.m461e(c0773km2) || ((C0794lg) this.f3018a).f38176e.getCount() <= ((C0794lg) this.f3018a).f38176e.getChildCount()) {
                    return;
                }
                int childCount = ((C0794lg) this.f3018a).f38176e.getChildCount();
                C0794lg c0794lg = (C0794lg) this.f3018a;
                if (childCount <= c0794lg.f38182k) {
                    c0794lg.f38188q.setInputMethodMode(2);
                    ((C0794lg) this.f3018a).mo9634s();
                    return;
                }
                return;
            case 19:
                RecyclerView recyclerView = (RecyclerView) this.f3018a;
                if (!recyclerView.f1131u || recyclerView.isLayoutRequested()) {
                    return;
                }
                RecyclerView recyclerView2 = (RecyclerView) this.f3018a;
                if (!recyclerView2.f1129s) {
                    recyclerView2.requestLayout();
                    return;
                } else if (recyclerView2.f1133w) {
                    recyclerView2.f1132v = true;
                    return;
                } else {
                    recyclerView2.m1263u();
                    return;
                }
            default:
                AbstractC0809lv abstractC0809lv = ((RecyclerView) this.f3018a).f1068F;
                if (abstractC0809lv != null) {
                    abstractC0809lv.mo11861d();
                }
                ((RecyclerView) this.f3018a).f1078P = false;
                return;
        }
    }
}
