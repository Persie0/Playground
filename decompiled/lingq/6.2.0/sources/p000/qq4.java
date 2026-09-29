package p000;

import androidx.compose.p002ui.node.AbstractC0362l;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.node.C0360j;
import androidx.compose.p002ui.node.C0361k;
import androidx.compose.p002ui.node.C0364n;
import androidx.compose.p002ui.node.LayoutNode$LayoutState;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;

/* JADX INFO: loaded from: classes.dex */
public final class qq4 {

    /* JADX INFO: renamed from: a */
    public final C0357g f58055a;

    /* JADX INFO: renamed from: b */
    public boolean f58056b;

    /* JADX INFO: renamed from: c */
    public boolean f58057c;

    /* JADX INFO: renamed from: e */
    public boolean f58059e;

    /* JADX INFO: renamed from: f */
    public boolean f58060f;

    /* JADX INFO: renamed from: g */
    public boolean f58061g;

    /* JADX INFO: renamed from: h */
    public int f58062h;

    /* JADX INFO: renamed from: i */
    public int f58063i;

    /* JADX INFO: renamed from: j */
    public boolean f58064j;

    /* JADX INFO: renamed from: k */
    public boolean f58065k;

    /* JADX INFO: renamed from: l */
    public int f58066l;

    /* JADX INFO: renamed from: m */
    public boolean f58067m;

    /* JADX INFO: renamed from: n */
    public boolean f58068n;

    /* JADX INFO: renamed from: o */
    public int f58069o;

    /* JADX INFO: renamed from: q */
    public C0360j f58071q;

    /* JADX INFO: renamed from: d */
    public LayoutNode$LayoutState f58058d = LayoutNode$LayoutState.Idle;

    /* JADX INFO: renamed from: p */
    public final C0361k f58070p = new C0361k(this);

    public qq4(C0357g c0357g) {
        this.f58055a = c0357g;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0362l m20104a() {
        return (AbstractC0362l) this.f58055a.f4335a0.f46677e;
    }

    /* JADX INFO: renamed from: b */
    public final void m20105b() {
        LayoutNode$LayoutState layoutNode$LayoutState = this.f58055a.f4337b0.f58058d;
        if (layoutNode$LayoutState == LayoutNode$LayoutState.LayingOut || layoutNode$LayoutState == LayoutNode$LayoutState.LookaheadLayingOut) {
            if (this.f58070p.f4408W) {
                m20110g(true);
            } else {
                m20109f(true);
            }
        }
        if (layoutNode$LayoutState == LayoutNode$LayoutState.LookaheadLayingOut) {
            C0360j c0360j = this.f58071q;
            if (c0360j == null || !c0360j.f4378Q) {
                m20111h(true);
            } else {
                m20112i(true);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m20106c(long j) {
        C0360j c0360j = this.f58071q;
        if (c0360j != null) {
            LayoutNode$LayoutState layoutNode$LayoutState = LayoutNode$LayoutState.LookaheadMeasuring;
            qq4 qq4Var = c0360j.f4386f;
            qq4Var.f58058d = layoutNode$LayoutState;
            C0357g c0357g = qq4Var.f58055a;
            qq4Var.f58059e = false;
            c0360j.f4382U = j;
            C0364n snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0391c) pq4.m19457a(c0357g)).getSnapshotObserver();
            ui3 ui3Var = c0360j.f4383V;
            snapshotObserver.f4460a.m11067c(c0357g, snapshotObserver.f4461b, ui3Var);
            qq4Var.f58060f = true;
            qq4Var.f58061g = true;
            boolean zM3256x = b34.m3256x(c0357g);
            C0361k c0361k = qq4Var.f58070p;
            if (zM3256x) {
                c0361k.f4403R = true;
                c0361k.f4404S = true;
            } else {
                c0361k.f4402Q = true;
            }
            qq4Var.f58058d = LayoutNode$LayoutState.Idle;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m20107d(int i) {
        int i2 = this.f58066l;
        this.f58066l = i;
        if ((i2 == 0) != (i == 0)) {
            C0357g c0357gM1610w = this.f58055a.m1610w();
            qq4 qq4Var = c0357gM1610w != null ? c0357gM1610w.f4337b0 : null;
            if (qq4Var != null) {
                int i3 = qq4Var.f58066l;
                if (i == 0) {
                    qq4Var.m20107d(i3 - 1);
                } else {
                    qq4Var.m20107d(i3 + 1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m20108e(int i) {
        int i2 = this.f58069o;
        this.f58069o = i;
        if ((i2 == 0) != (i == 0)) {
            C0357g c0357gM1610w = this.f58055a.m1610w();
            qq4 qq4Var = c0357gM1610w != null ? c0357gM1610w.f4337b0 : null;
            if (qq4Var != null) {
                int i3 = qq4Var.f58069o;
                if (i == 0) {
                    qq4Var.m20108e(i3 - 1);
                } else {
                    qq4Var.m20108e(i3 + 1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m20109f(boolean z) {
        if (this.f58065k != z) {
            this.f58065k = z;
            if (z && !this.f58064j) {
                m20107d(this.f58066l + 1);
            } else {
                if (z || this.f58064j) {
                    return;
                }
                m20107d(this.f58066l - 1);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m20110g(boolean z) {
        if (this.f58064j != z) {
            this.f58064j = z;
            if (z && !this.f58065k) {
                m20107d(this.f58066l + 1);
            } else {
                if (z || this.f58065k) {
                    return;
                }
                m20107d(this.f58066l - 1);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m20111h(boolean z) {
        if (this.f58068n != z) {
            this.f58068n = z;
            if (z && !this.f58067m) {
                m20108e(this.f58069o + 1);
            } else {
                if (z || this.f58067m) {
                    return;
                }
                m20108e(this.f58069o - 1);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m20112i(boolean z) {
        if (this.f58067m != z) {
            this.f58067m = z;
            if (z && !this.f58068n) {
                m20108e(this.f58069o + 1);
            } else {
                if (z || this.f58068n) {
                    return;
                }
                m20108e(this.f58069o - 1);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m20113j() {
        C0361k c0361k = this.f58070p;
        qq4 qq4Var = c0361k.f4417f;
        Object obj = c0361k.f4399N;
        C0357g c0357g = this.f58055a;
        if ((obj != null || qq4Var.m20104a().mo1509A() != null) && c0361k.f4398M) {
            c0361k.f4398M = false;
            c0361k.f4399N = qq4Var.m20104a().mo1509A();
            C0357g c0357gM1610w = c0357g.m1610w();
            if (c0357gM1610w != null) {
                C0357g.m1555b0(c0357gM1610w, false, 7);
            }
        }
        C0360j c0360j = this.f58071q;
        if (c0360j != null) {
            qq4 qq4Var2 = c0360j.f4386f;
            if (c0360j.f4381T == null) {
                yk5 yk5VarMo1542d1 = qq4Var2.m20104a().mo1542d1();
                yk5VarMo1542d1.getClass();
                if (yk5VarMo1542d1.f69928J.mo1509A() == null) {
                    return;
                }
            }
            if (c0360j.f4380S) {
                c0360j.f4380S = false;
                yk5 yk5VarMo1542d2 = qq4Var2.m20104a().mo1542d1();
                yk5VarMo1542d2.getClass();
                c0360j.f4381T = yk5VarMo1542d2.f69928J.mo1509A();
                if (b34.m3256x(c0357g)) {
                    C0357g c0357gM1610w2 = c0357g.m1610w();
                    if (c0357gM1610w2 != null) {
                        C0357g.m1555b0(c0357gM1610w2, false, 7);
                        return;
                    }
                    return;
                }
                C0357g c0357gM1610w3 = c0357g.m1610w();
                if (c0357gM1610w3 != null) {
                    C0357g.m1554Z(c0357gM1610w3, false, 7);
                }
            }
        }
    }
}
