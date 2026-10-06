package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ListView;

/* JADX INFO: renamed from: kq */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0777kq implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    private final float f36817a;

    /* JADX INFO: renamed from: b */
    private final int f36818b;

    /* JADX INFO: renamed from: c */
    public final View f36819c;

    /* JADX INFO: renamed from: d */
    public boolean f36820d;

    /* JADX INFO: renamed from: e */
    private final int f36821e;

    /* JADX INFO: renamed from: f */
    private Runnable f36822f;

    /* JADX INFO: renamed from: g */
    private Runnable f36823g;

    /* JADX INFO: renamed from: h */
    private int f36824h;

    /* JADX INFO: renamed from: i */
    private final int[] f36825i = new int[2];

    public AbstractViewOnTouchListenerC0777kq(View view) {
        this.f36819c = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f36817a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f36818b = tapTimeout;
        this.f36821e = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* JADX INFO: renamed from: a */
    public abstract InterfaceC0243hn mo9397a();

    /* JADX INFO: renamed from: b */
    public boolean mo9398b() {
        throw null;
    }

    /* JADX INFO: renamed from: c */
    protected boolean mo10889c() {
        InterfaceC0243hn interfaceC0243hnMo9397a = mo9397a();
        if (interfaceC0243hnMo9397a == null || !interfaceC0243hnMo9397a.mo9636u()) {
            return true;
        }
        interfaceC0243hnMo9397a.mo9626k();
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m14680d() {
        Runnable runnable = this.f36823g;
        if (runnable != null) {
            this.f36819c.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f36822f;
        if (runnable2 != null) {
            this.f36819c.removeCallbacks(runnable2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:24:0x0068  */
    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d0  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        ListView listViewMo9624aP;
        boolean z2 = this.f36820d;
        if (z2) {
            View view2 = this.f36819c;
            InterfaceC0243hn interfaceC0243hnMo9397a = mo9397a();
            if (interfaceC0243hnMo9397a != null && interfaceC0243hnMo9397a.mo9636u() && (listViewMo9624aP = interfaceC0243hnMo9397a.mo9624aP()) != null) {
                C0773km c0773km = (C0773km) listViewMo9624aP;
                if (c0773km.isShown()) {
                    MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                    int[] iArr = this.f36825i;
                    view2.getLocationOnScreen(iArr);
                    motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                    int[] iArr2 = this.f36825i;
                    listViewMo9624aP.getLocationOnScreen(iArr2);
                    motionEventObtainNoHistory.offsetLocation(-iArr2[0], -iArr2[1]);
                    boolean zM14529a = c0773km.m14529a(motionEventObtainNoHistory, this.f36824h);
                    motionEventObtainNoHistory.recycle();
                    int actionMasked = motionEvent.getActionMasked();
                    boolean z3 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                    if (zM14529a && z3) {
                        z = true;
                    } else if (mo10889c()) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else if (mo10889c()) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (mo10889c()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            View view3 = this.f36819c;
            if (view3.isEnabled()) {
                switch (motionEvent.getActionMasked()) {
                    case 0:
                        this.f36824h = motionEvent.getPointerId(0);
                        if (this.f36822f == null) {
                            this.f36822f = new RunnableC0059be(this, 15);
                        }
                        view3.postDelayed(this.f36822f, this.f36818b);
                        if (this.f36823g == null) {
                            this.f36823g = new RunnableC0059be(this, 16);
                        }
                        view3.postDelayed(this.f36823g, this.f36821e);
                        z = false;
                        break;
                    case 1:
                    case 3:
                        m14680d();
                        z = false;
                        break;
                    case 2:
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.f36824h);
                        if (iFindPointerIndex < 0) {
                            z = false;
                        } else {
                            float x = motionEvent.getX(iFindPointerIndex);
                            float y = motionEvent.getY(iFindPointerIndex);
                            float f = this.f36817a;
                            float f2 = -f;
                            if (x >= f2 && y >= f2 && x < (view3.getRight() - view3.getLeft()) + f && y < (view3.getBottom() - view3.getTop()) + f) {
                                z = false;
                            } else {
                                m14680d();
                                view3.getParent().requestDisallowInterceptTouchEvent(true);
                                if (!mo9398b()) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                            }
                        }
                        break;
                    default:
                        z = false;
                        break;
                }
            } else {
                z = false;
            }
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f36819c.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f36820d = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f36820d = false;
        this.f36824h = -1;
        Runnable runnable = this.f36822f;
        if (runnable != null) {
            this.f36819c.removeCallbacks(runnable);
        }
    }
}
