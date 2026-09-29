package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import p185j.InterfaceC6396f;

/* JADX INFO: renamed from: androidx.appcompat.widget.i0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0320i0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final float f1226a;

    /* JADX INFO: renamed from: b */
    public final int f1227b;

    /* JADX INFO: renamed from: c */
    public final int f1228c;

    /* JADX INFO: renamed from: d */
    public final View f1229d;

    /* JADX INFO: renamed from: e */
    public a f1230e;

    /* JADX INFO: renamed from: f */
    public b f1231f;

    /* JADX INFO: renamed from: g */
    public boolean f1232g;

    /* JADX INFO: renamed from: h */
    public int f1233h;

    /* JADX INFO: renamed from: i */
    public final int[] f1234i = new int[2];

    /* JADX INFO: renamed from: androidx.appcompat.widget.i0$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewParent parent = AbstractViewOnTouchListenerC0320i0.this.f1229d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.i0$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AbstractViewOnTouchListenerC0320i0 abstractViewOnTouchListenerC0320i0 = AbstractViewOnTouchListenerC0320i0.this;
            abstractViewOnTouchListenerC0320i0.m1211a();
            View view = abstractViewOnTouchListenerC0320i0.f1229d;
            if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0320i0.mo888c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
                abstractViewOnTouchListenerC0320i0.f1232g = true;
            }
        }
    }

    public AbstractViewOnTouchListenerC0320i0(View view) {
        this.f1229d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1226a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1227b = tapTimeout;
        this.f1228c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* JADX INFO: renamed from: a */
    public final void m1211a() {
        b bVar = this.f1231f;
        View view = this.f1229d;
        if (bVar != null) {
            view.removeCallbacks(bVar);
        }
        a aVar = this.f1230e;
        if (aVar != null) {
            view.removeCallbacks(aVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract InterfaceC6396f mo887b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo888c();

    /* JADX INFO: renamed from: d */
    public boolean mo982d() {
        InterfaceC6396f interfaceC6396fMo887b = mo887b();
        if (interfaceC6396fMo887b == null || !interfaceC6396fMo887b.mo893a()) {
            return true;
        }
        interfaceC6396fMo887b.dismiss();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0075 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:57:0x00fd  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        C0314g0 c0314g0Mo899j;
        boolean z13 = this.f1232g;
        View view2 = this.f1229d;
        if (z13) {
            InterfaceC6396f interfaceC6396fMo887b = mo887b();
            if (interfaceC6396fMo887b != null) {
                if (interfaceC6396fMo887b.mo893a() && ((c0314g0Mo899j = interfaceC6396fMo887b.mo899j()) != null && c0314g0Mo899j.isShown())) {
                    MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                    int[] iArr = this.f1234i;
                    view2.getLocationOnScreen(iArr);
                    motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                    c0314g0Mo899j.getLocationOnScreen(iArr);
                    motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                    boolean zM1194b = c0314g0Mo899j.m1194b(motionEventObtainNoHistory, this.f1233h);
                    motionEventObtainNoHistory.recycle();
                    int actionMasked = motionEvent.getActionMasked();
                    z12 = zM1194b && (actionMasked != 1 && actionMasked != 3);
                }
            }
            z11 = z12 || !mo982d();
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.f1233h = motionEvent.getPointerId(0);
                    if (this.f1230e == null) {
                        this.f1230e = new a();
                    }
                    view2.postDelayed(this.f1230e, this.f1227b);
                    if (this.f1231f == null) {
                        this.f1231f = new b();
                    }
                    view2.postDelayed(this.f1231f, this.f1228c);
                } else if (actionMasked2 == 1) {
                    m1211a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f1233h);
                    if (iFindPointerIndex >= 0) {
                        float x10 = motionEvent.getX(iFindPointerIndex);
                        float y10 = motionEvent.getY(iFindPointerIndex);
                        float f3 = this.f1226a;
                        float f10 = -f3;
                        if (!(x10 >= f10 && y10 >= f10 && x10 < ((float) (view2.getRight() - view2.getLeft())) + f3 && y10 < ((float) (view2.getBottom() - view2.getTop())) + f3)) {
                            m1211a();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            z10 = true;
                        }
                    }
                } else if (actionMasked2 == 3) {
                    m1211a();
                }
                z10 = false;
            } else {
                z10 = false;
            }
            z11 = z10 && mo888c();
            if (z11) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f1232g = z11;
        if (!z11 && !z13) {
            return false;
        }
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f1232g = false;
        this.f1233h = -1;
        a aVar = this.f1230e;
        if (aVar != null) {
            this.f1229d.removeCallbacks(aVar);
        }
    }
}
