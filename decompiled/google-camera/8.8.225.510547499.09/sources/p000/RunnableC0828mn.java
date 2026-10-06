package p000;

import android.support.v7.widget.RecyclerView;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* JADX INFO: renamed from: mn */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0828mn implements Runnable {

    /* JADX INFO: renamed from: a */
    public OverScroller f41084a;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ RecyclerView f41086c;

    /* JADX INFO: renamed from: d */
    private int f41087d;

    /* JADX INFO: renamed from: e */
    private int f41088e;

    /* JADX INFO: renamed from: b */
    Interpolator f41085b = RecyclerView.f1061d;

    /* JADX INFO: renamed from: f */
    private boolean f41089f = false;

    /* JADX INFO: renamed from: g */
    private boolean f41090g = false;

    public RunnableC0828mn(RecyclerView recyclerView) {
        this.f41086c = recyclerView;
        this.f41084a = new OverScroller(recyclerView.getContext(), RecyclerView.f1061d);
    }

    /* JADX INFO: renamed from: e */
    private final void m16647e() {
        this.f41086c.removeCallbacks(this);
        afb.m428i(this.f41086c, this);
    }

    /* JADX INFO: renamed from: a */
    public final void m16648a(int i, int i2) {
        this.f41086c.m1229ab(2);
        this.f41088e = 0;
        this.f41087d = 0;
        Interpolator interpolator = this.f41085b;
        Interpolator interpolator2 = RecyclerView.f1061d;
        if (interpolator != interpolator2) {
            this.f41085b = interpolator2;
            this.f41084a = new OverScroller(this.f41086c.getContext(), RecyclerView.f1061d);
        }
        this.f41084a.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        m16649b();
    }

    /* JADX INFO: renamed from: b */
    final void m16649b() {
        if (this.f41089f) {
            this.f41090g = true;
        } else {
            m16647e();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m16650c(int i, int i2, int i3, Interpolator interpolator) {
        int iMin;
        if (i3 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean z = iAbs > iAbs2;
            int width = z ? this.f41086c.getWidth() : this.f41086c.getHeight();
            if (true != z) {
                iAbs = iAbs2;
            }
            iMin = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        } else {
            iMin = i3;
        }
        if (interpolator == null) {
            interpolator = RecyclerView.f1061d;
        }
        if (this.f41085b != interpolator) {
            this.f41085b = interpolator;
            this.f41084a = new OverScroller(this.f41086c.getContext(), interpolator);
        }
        this.f41088e = 0;
        this.f41087d = 0;
        this.f41086c.m1229ab(2);
        this.f41084a.startScroll(0, 0, i, i2, iMin);
        m16649b();
    }

    /* JADX INFO: renamed from: d */
    public final void m16651d() {
        this.f41086c.removeCallbacks(this);
        this.f41084a.abortAnimation();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        boolean z;
        int i3;
        RecyclerView recyclerView = this.f41086c;
        if (recyclerView.f1124n == null) {
            m16651d();
            return;
        }
        this.f41090g = false;
        this.f41089f = true;
        recyclerView.m1263u();
        OverScroller overScroller = this.f41084a;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i4 = currX - this.f41087d;
            int i5 = currY - this.f41088e;
            this.f41087d = currX;
            this.f41088e = currY;
            RecyclerView recyclerView2 = this.f41086c;
            int iM1194ap = RecyclerView.m1194ap(i4, recyclerView2.f1064B, recyclerView2.f1066D, recyclerView2.getWidth());
            RecyclerView recyclerView3 = this.f41086c;
            int iM1194ap2 = RecyclerView.m1194ap(i5, recyclerView3.f1065C, recyclerView3.f1067E, recyclerView3.getHeight());
            RecyclerView recyclerView4 = this.f41086c;
            int[] iArr = recyclerView4.f1080R;
            iArr[0] = 0;
            iArr[1] = 0;
            if (recyclerView4.m1236aj(iM1194ap, iM1194ap2, iArr, null, 1)) {
                int[] iArr2 = this.f41086c.f1080R;
                iM1194ap -= iArr2[0];
                iM1194ap2 -= iArr2[1];
            }
            if (this.f41086c.getOverScrollMode() != 2) {
                this.f41086c.m1262t(iM1194ap, iM1194ap2);
            }
            RecyclerView recyclerView5 = this.f41086c;
            if (recyclerView5.f1123m != null) {
                int[] iArr3 = recyclerView5.f1080R;
                iArr3[0] = 0;
                iArr3[1] = 0;
                recyclerView5.m1223V(iM1194ap, iM1194ap2, iArr3);
                RecyclerView recyclerView6 = this.f41086c;
                int[] iArr4 = recyclerView6.f1080R;
                i2 = iArr4[0];
                i = iArr4[1];
                iM1194ap -= i2;
                iM1194ap2 -= i;
                C0825mk c0825mk = recyclerView6.f1124n.f39551r;
                if (c0825mk != null && !c0825mk.f40799e && c0825mk.f40800f) {
                    int iM16585a = recyclerView6.f1075M.m16585a();
                    if (iM16585a == 0) {
                        c0825mk.m16483f();
                    } else if (c0825mk.f40796b >= iM16585a) {
                        c0825mk.f40796b = iM16585a - 1;
                        c0825mk.m16482e(i2, i);
                    } else {
                        c0825mk.m16482e(i2, i);
                    }
                }
            } else {
                i = 0;
                i2 = 0;
            }
            if (!this.f41086c.f1126p.isEmpty()) {
                this.f41086c.invalidate();
            }
            RecyclerView recyclerView7 = this.f41086c;
            int[] iArr5 = recyclerView7.f1080R;
            iArr5[0] = 0;
            iArr5[1] = 0;
            recyclerView7.m1267y(i2, i, iM1194ap, iM1194ap2, null, 1, iArr5);
            RecyclerView recyclerView8 = this.f41086c;
            int[] iArr6 = recyclerView8.f1080R;
            int i6 = iM1194ap - iArr6[0];
            int i7 = iM1194ap2 - iArr6[1];
            if (i2 != 0) {
                recyclerView8.m1268z(i2, i);
            } else if (i != 0) {
                i2 = 0;
                recyclerView8.m1268z(i2, i);
            } else {
                i = 0;
                i2 = 0;
            }
            if (!this.f41086c.awakenScrollBars()) {
                this.f41086c.invalidate();
            }
            int currX2 = overScroller.getCurrX();
            int finalX = overScroller.getFinalX();
            int currY2 = overScroller.getCurrY();
            int finalY = overScroller.getFinalY();
            if (overScroller.isFinished()) {
                z = true;
            } else {
                if (currX2 != finalX && i6 == 0) {
                    i6 = 0;
                } else if (currY2 == finalY || i7 != 0) {
                    z = true;
                } else {
                    i7 = 0;
                }
                z = false;
            }
            RecyclerView recyclerView9 = this.f41086c;
            C0825mk c0825mk2 = recyclerView9.f1124n.f39551r;
            if ((c0825mk2 == null || !c0825mk2.f40799e) && z) {
                if (recyclerView9.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i6 < 0) {
                        i3 = -currVelocity;
                    } else {
                        i3 = i6 > 0 ? currVelocity : 0;
                    }
                    if (i7 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i7 <= 0) {
                        currVelocity = 0;
                    }
                    RecyclerView recyclerView10 = this.f41086c;
                    if (i3 < 0) {
                        recyclerView10.m1204B();
                        if (recyclerView10.f1064B.isFinished()) {
                            recyclerView10.f1064B.onAbsorb(-i3);
                        }
                    } else if (i3 > 0) {
                        recyclerView10.m1205C();
                        if (recyclerView10.f1066D.isFinished()) {
                            recyclerView10.f1066D.onAbsorb(i3);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView10.m1206D();
                        if (recyclerView10.f1065C.isFinished()) {
                            recyclerView10.f1065C.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView10.m1203A();
                        if (recyclerView10.f1067E.isFinished()) {
                            recyclerView10.f1067E.onAbsorb(currVelocity);
                        }
                    }
                    if (i3 != 0 || currVelocity != 0) {
                        afb.m426g(recyclerView10);
                    }
                }
                if (RecyclerView.f1060c) {
                    this.f41086c.f1074L.m14736b();
                }
            } else {
                m16649b();
                RecyclerView recyclerView11 = this.f41086c;
                RunnableC0780kt runnableC0780kt = recyclerView11.f1073K;
                if (runnableC0780kt != null) {
                    runnableC0780kt.m14832a(recyclerView11, i2, i);
                }
            }
        }
        C0825mk c0825mk3 = this.f41086c.f1124n.f39551r;
        if (c0825mk3 != null && c0825mk3.f40799e) {
            c0825mk3.m16482e(0, 0);
        }
        this.f41089f = false;
        if (this.f41090g) {
            m16647e();
        } else {
            this.f41086c.m1229ab(0);
            this.f41086c.m1234ag(1);
        }
    }
}
