package androidx.compose.p002ui.window;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.compose.p002ui.R$string;
import androidx.compose.p002ui.platform.AbstractC0389a;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.AbstractC0278f;
import androidx.lifecycle.runtime.R$id;
import java.util.UUID;
import kotlin.jvm.internal.Ref$LongRef;
import p000.AbstractC3745x3;
import p000.C0854co;
import p000.RunnableC3501qk;
import p000.aq4;
import p000.c41;
import p000.dja;
import p000.ed9;
import p000.eja;
import p000.fa4;
import p000.fb2;
import p000.gc2;
import p000.gm5;
import p000.gna;
import p000.j84;
import p000.kf1;
import p000.n84;
import p000.nh7;
import p000.oh7;
import p000.ph7;
import p000.pk9;
import p000.qh7;
import p000.sd3;
import p000.t66;
import p000.tj3;
import p000.ui3;
import p000.vi3;
import p000.vz1;
import p000.x18;
import p000.xc9;
import p000.xfa;
import p000.xwc;
import p000.ye1;
import p000.zha;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.ui.window.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C0461i extends AbstractC0389a {

    /* JADX INFO: renamed from: H */
    public final View f5306H;

    /* JADX INFO: renamed from: I */
    public final boolean f5307I;

    /* JADX INFO: renamed from: J */
    public final gna f5308J;

    /* JADX INFO: renamed from: K */
    public final WindowManager f5309K;

    /* JADX INFO: renamed from: L */
    public final WindowManager.LayoutParams f5310L;

    /* JADX INFO: renamed from: M */
    public ph7 f5311M;

    /* JADX INFO: renamed from: N */
    public LayoutDirection f5312N;

    /* JADX INFO: renamed from: O */
    public final t66 f5313O;

    /* JADX INFO: renamed from: P */
    public final t66 f5314P;

    /* JADX INFO: renamed from: Q */
    public j84 f5315Q;

    /* JADX INFO: renamed from: R */
    public final gc2 f5316R;

    /* JADX INFO: renamed from: S */
    public final Rect f5317S;

    /* JADX INFO: renamed from: T */
    public final ed9 f5318T;

    /* JADX INFO: renamed from: U */
    public C0854co f5319U;

    /* JADX INFO: renamed from: V */
    public final t66 f5320V;

    /* JADX INFO: renamed from: W */
    public boolean f5321W;

    /* JADX INFO: renamed from: a0 */
    public final int[] f5322a0;

    /* JADX INFO: renamed from: j */
    public ui3 f5323j;

    /* JADX INFO: renamed from: k */
    public qh7 f5324k;

    /* JADX INFO: renamed from: l */
    public String f5325l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0461i(ui3 ui3Var, qh7 qh7Var, String str, View view, fb2 fb2Var, ph7 ph7Var, UUID uuid, boolean z) {
        super(view.getContext());
        gna oh7Var = Build.VERSION.SDK_INT >= 30 ? new oh7() : new gna();
        this.f5323j = ui3Var;
        this.f5324k = qh7Var;
        this.f5325l = str;
        this.f5306H = view;
        this.f5307I = z;
        this.f5308J = oh7Var;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.f5309K = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        qh7 qh7Var2 = this.f5324k;
        boolean zM1899c = AbstractC0456d.m1899c(view);
        boolean z2 = qh7Var2.f57786b;
        int i = qh7Var2.f57785a;
        if (z2 && zM1899c) {
            i |= 8192;
        } else if (z2 && !zM1899c) {
            i &= -8193;
        }
        layoutParams.flags = i;
        layoutParams.type = this.f5324k.f57790f;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R$string.default_popup_window_title));
        this.f5310L = layoutParams;
        this.f5311M = ph7Var;
        this.f5312N = LayoutDirection.Ltr;
        this.f5313O = AbstractC0278f.m1260j(null);
        this.f5314P = AbstractC0278f.m1260j(null);
        this.f5316R = AbstractC0278f.m1254d(new ui3() { // from class: androidx.compose.ui.window.PopupLayout$canCalculatePosition$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                C0461i c0461i = this.f5281b;
                aq4 parentLayoutCoordinates = c0461i.getParentLayoutCoordinates();
                if (parentLayoutCoordinates == null || !parentLayoutCoordinates.mo1691n()) {
                    parentLayoutCoordinates = null;
                }
                return Boolean.valueOf((parentLayoutCoordinates == null || c0461i.m25914getPopupContentSizebOM6tXw() == null) ? false : true);
            }
        });
        this.f5317S = new Rect();
        this.f5318T = new ed9(new vi3() { // from class: androidx.compose.ui.window.PopupLayout$snapshotStateObserver$1
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                ui3 ui3Var2 = (ui3) obj;
                C0461i c0461i = this.f5282b;
                Handler handler = c0461i.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    ui3Var2.mo0a();
                } else {
                    Handler handler2 = c0461i.getHandler();
                    if (handler2 != null) {
                        handler2.post(new RunnableC3501qk(3, ui3Var2));
                    }
                }
                return xfa.f68157a;
            }
        });
        setId(R.id.content);
        setTag(R$id.view_tree_lifecycle_owner, zha.m25659b(view));
        setTag(androidx.lifecycle.viewmodel.R$id.view_tree_view_model_store_owner, eja.m11183a(view));
        setTag(androidx.savedstate.R$id.view_tree_saved_state_registry_owner, dja.m10417a(view));
        setTag(androidx.compose.p002ui.R$id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(fb2Var.mo912g0(8.0f));
        setOutlineProvider(new c41(3));
        this.f5320V = AbstractC0278f.m1260j(AbstractC0458f.f5294a);
        this.f5322a0 = new int[2];
    }

    private final zi3 getContent() {
        return (zi3) ((xc9) this.f5320V).getValue();
    }

    private final j84 getDisplayBounds() {
        int i = this.f5324k.f57785a & 512;
        View view = this.f5306H;
        Rect rect = this.f5317S;
        gna gnaVar = this.f5308J;
        if (i == 0) {
            gnaVar.getClass();
            view.getWindowVisibleDisplayFrame(rect);
        } else {
            gnaVar.mo12767k(view, rect);
        }
        return new j84(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final aq4 getParentLayoutCoordinates() {
        return (aq4) ((xc9) this.f5314P).getValue();
    }

    private final void setContent(zi3 zi3Var) {
        ((xc9) this.f5320V).setValue(zi3Var);
    }

    private final void setParentLayoutCoordinates(aq4 aq4Var) {
        ((xc9) this.f5314P).setValue(aq4Var);
    }

    @Override // androidx.compose.p002ui.platform.AbstractC0389a
    /* JADX INFO: renamed from: a */
    public final void mo1707a(ye1 ye1Var, final int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-857613600);
        int i2 = (tj3Var.m22124i(this) ? 4 : 2) | i;
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            getContent().invoke(tj3Var, 0);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(i) { // from class: androidx.compose.ui.window.PopupLayout$Content$4
                {
                    super(2);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iM19383z = pk9.m19383z(1);
                    this.f5280b.mo1707a((ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f5324k.f57787c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                ui3 ui3Var = this.f5323j;
                if (ui3Var != null) {
                    ui3Var.mo0a();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.compose.p002ui.platform.AbstractC0389a
    /* JADX INFO: renamed from: g */
    public final void mo1713g(boolean z, int i, int i2, int i3, int i4) {
        super.mo1713g(z, i, i2, i3, i4);
        this.f5324k.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.f5310L;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.f5308J.getClass();
        this.f5309K.updateViewLayout(this, layoutParams);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f5316R.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui() {
        return this.f5310L;
    }

    public final LayoutDirection getParentLayoutDirection() {
        return this.f5312N;
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final n84 m25914getPopupContentSizebOM6tXw() {
        return (n84) ((xc9) this.f5313O).getValue();
    }

    public final ph7 getPositionProvider() {
        return this.f5311M;
    }

    @Override // androidx.compose.p002ui.platform.AbstractC0389a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f5321W;
    }

    public AbstractC0389a getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.f5325l;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    @Override // androidx.compose.p002ui.platform.AbstractC0389a
    /* JADX INFO: renamed from: h */
    public final void mo1714h(int i, int i2) {
        this.f5324k.getClass();
        j84 displayBounds = getDisplayBounds();
        super.mo1714h(View.MeasureSpec.makeMeasureSpec(displayBounds.m14324d(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayBounds.m14322b(), Integer.MIN_VALUE));
    }

    /* JADX INFO: renamed from: m */
    public final void m1903m(kf1 kf1Var, zi3 zi3Var) {
        setParentCompositionContext(kf1Var);
        setContent(zi3Var);
        this.f5321W = true;
    }

    /* JADX INFO: renamed from: n */
    public final void m1904n(ui3 ui3Var, qh7 qh7Var, String str, LayoutDirection layoutDirection) {
        this.f5323j = ui3Var;
        this.f5325l = str;
        if (!fa4.m11650l(this.f5324k, qh7Var)) {
            qh7Var.getClass();
            this.f5324k = qh7Var;
            boolean zM1899c = AbstractC0456d.m1899c(this.f5306H);
            boolean z = qh7Var.f57786b;
            int i = qh7Var.f57785a;
            if (z && zM1899c) {
                i |= 8192;
            } else if (z && !zM1899c) {
                i &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.f5310L;
            layoutParams.flags = i;
            this.f5308J.getClass();
            this.f5309K.updateViewLayout(this, layoutParams);
        }
        int i2 = nh7.f52738a[layoutDirection.ordinal()];
        int i3 = 1;
        if (i2 == 1) {
            i3 = 0;
        } else if (i2 != 2) {
            gm5.m12750e();
            return;
        }
        super.setLayoutDirection(i3);
    }

    /* JADX INFO: renamed from: o */
    public final void m1905o() {
        aq4 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.mo1691n()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jMo1687j = parentLayoutCoordinates.mo1687j();
            long jMo1695q = this.f5307I ? parentLayoutCoordinates.mo1695q(0L) : parentLayoutCoordinates.mo1680d(0L);
            j84 j84VarM24756b = xwc.m24756b((((long) Math.round(Float.intBitsToFloat((int) (jMo1695q >> 32)))) << 32) | (4294967295L & ((long) Math.round(Float.intBitsToFloat((int) (jMo1695q & 4294967295L))))), jMo1687j);
            if (j84VarM24756b.equals(this.f5315Q)) {
                return;
            }
            this.f5315Q = j84VarM24756b;
            m1907q();
        }
    }

    @Override // androidx.compose.p002ui.platform.AbstractC0389a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5318T.m11068d();
        if (!this.f5324k.f57787c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.f5319U == null) {
            this.f5319U = new C0854co(this.f5323j, 0);
        }
        AbstractC3745x3.m24250d(this, this.f5319U);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ed9 ed9Var = this.f5318T;
        sd3 sd3Var = ed9Var.f37077h;
        if (sd3Var != null) {
            sd3Var.mo19438a();
        }
        ed9Var.m11065a();
        if (Build.VERSION.SDK_INT >= 33) {
            AbstractC3745x3.m24251e(this, this.f5319U);
        }
        this.f5319U = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f5324k.f57788d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            ui3 ui3Var = this.f5323j;
            if (ui3Var != null) {
                ui3Var.mo0a();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            ui3 ui3Var2 = this.f5323j;
            if (ui3Var2 != null) {
                ui3Var2.mo0a();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m1906p(aq4 aq4Var) {
        setParentLayoutCoordinates(aq4Var);
        m1905o();
    }

    /* JADX INFO: renamed from: q */
    public final void m1907q() {
        n84 n84VarM25914getPopupContentSizebOM6tXw;
        final j84 j84Var = this.f5315Q;
        if (j84Var == null || (n84VarM25914getPopupContentSizebOM6tXw = m25914getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        final long j = n84VarM25914getPopupContentSizebOM6tXw.f52482a;
        j84 displayBounds = getDisplayBounds();
        final long jM14322b = (((long) displayBounds.m14322b()) & 4294967295L) | (((long) displayBounds.m14324d()) << 32);
        final Ref$LongRef ref$LongRef = new Ref$LongRef();
        ref$LongRef.f47717a = 0L;
        this.f5318T.m11067c(this, PopupLayout$Companion$onCommitAffectingPopupPosition$1.f5279b, new ui3() { // from class: androidx.compose.ui.window.PopupLayout$updatePosition$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                C0461i c0461i = this;
                ref$LongRef.f47717a = c0461i.getPositionProvider().mo12788f(j84Var, jM14322b, c0461i.getParentLayoutDirection(), j);
                return xfa.f68157a;
            }
        });
        long j2 = ref$LongRef.f47717a;
        WindowManager.LayoutParams layoutParams = this.f5310L;
        layoutParams.x = (int) (j2 >> 32);
        layoutParams.y = (int) (j2 & 4294967295L);
        boolean z = this.f5324k.f57789e;
        gna gnaVar = this.f5308J;
        if (z) {
            gnaVar.getClass();
            setSystemGestureExclusionRects(vz1.m23608N(new Rect(0, 0, (int) (jM14322b >> 32), (int) (jM14322b & 4294967295L))));
        }
        gnaVar.getClass();
        this.f5309K.updateViewLayout(this, layoutParams);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }

    public final void setParentLayoutDirection(LayoutDirection layoutDirection) {
        this.f5312N = layoutDirection;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m25915setPopupContentSizefhxjrPA(n84 n84Var) {
        ((xc9) this.f5313O).setValue(n84Var);
    }

    public final void setPositionProvider(ph7 ph7Var) {
        this.f5311M = ph7Var;
    }

    public final void setTestTag(String str) {
        this.f5325l = str;
    }
}
