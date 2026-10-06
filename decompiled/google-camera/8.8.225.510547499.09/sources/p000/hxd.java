package p000;

import android.os.Handler;
import android.support.p001v8.renderscript.ScriptIntrinsicBLAS;
import android.view.Choreographer;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.widget.TracedFrameLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hxd extends TracedFrameLayout {

    /* JADX INFO: renamed from: a */
    public int f29780a;

    /* JADX INFO: renamed from: b */
    public hxc f29781b;

    /* JADX INFO: renamed from: c */
    public final ViewGroup f29782c;

    /* JADX INFO: renamed from: d */
    public boolean f29783d;

    /* JADX INFO: renamed from: e */
    private final TextView f29784e;

    /* JADX INFO: renamed from: f */
    private final Handler f29785f;

    public hxd(FrameLayout frameLayout) {
        super(frameLayout.getContext());
        this.f29780a = 0;
        this.f29785f = new hxb(this);
        this.f29783d = true;
        this.f29782c = frameLayout;
        setTag("countdown");
        TextView textView = new TextView(frameLayout.getContext(), null, C0100R.style.CountdownTextStyle);
        jvh.m13572t(textView);
        this.f29784e = textView;
        textView.setTextAppearance(C0100R.style.CountdownTextStyle);
        textView.setGravity(17);
        addView(textView);
    }

    /* JADX INFO: renamed from: a */
    public final void m10801a() {
        if (this.f29780a > 0) {
            this.f29780a = 0;
            this.f29785f.removeMessages(1);
            this.f29782c.removeView(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0039 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX WARN: Code duplicated, block: B:21:0x0054  */
    /* JADX WARN: Code duplicated, block: B:23:0x0059  */
    /* JADX WARN: Code duplicated, block: B:25:0x0066  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    /* JADX WARN: Code duplicated, block: B:59:0x0111  */
    /* JADX INFO: renamed from: b */
    public final void m10802b(boolean z, int i) {
        int i2;
        hwx hwxVar;
        hxa hxaVar;
        this.f29780a = i;
        hxc hxcVar = this.f29781b;
        if (hxcVar != null) {
            if (z) {
                hwx hwxVar2 = (hwx) hxcVar;
                if (hwxVar2.f29743b.isTouchExplorationEnabled()) {
                    hwxVar2.f29743b.interrupt();
                }
                hwxVar2.f29745d.m6560b();
            } else {
                if (i == 0) {
                    ((hwx) hxcVar).f29745d.m6561c();
                    i = 0;
                    i2 = 0;
                }
                hwxVar = (hwx) hxcVar;
                hxaVar = hwxVar.f29755n;
                if (hxaVar != null) {
                    if (z) {
                        if (hwxVar.f29749h.mo16813g()) {
                            ((clc) hwxVar.f29749h.mo16809c()).mo3890u();
                        }
                        hwxVar.f29755n.mo7905b();
                    } else {
                        hxaVar.mo7906bK(i);
                    }
                    if (i == 0) {
                        hwxVar.f29755n.mo7904a();
                        if (hwxVar.f29749h.mo16813g()) {
                            ((clc) hwxVar.f29749h.mo16809c()).mo3876g();
                        }
                        hwxVar.f29752k.m9147e();
                    } else if (hwxVar.f29754m.mo16813g() || hwxVar.f29744c.m5901j() || !hwxVar.f29746e.mo6184l(dib.f11304bK) || !gtd.m9733e() || !((Boolean) hwxVar.f29748g.mo3831be()).booleanValue() || ((Boolean) hwxVar.f29747f.mo3831be()).booleanValue() || hwxVar.f29751j.mo10518e().m10520a(hwxVar.f29750i)) {
                        ((nbe) ((nbe) hwx.f29742a.m17251b()).mo17276G((char) 4009)).mo17290o("Should not fire Led indicator");
                    } else {
                        if (i > 1) {
                            try {
                                ((hwx) hxcVar).f29756o = ((kfk) hwxVar.f29754m.mo16809c()).mo14117d();
                                ((hwx) hxcVar).m10789b(true, ((hwx) hxcVar).f29756o, false, false);
                            } catch (InterruptedException e) {
                            } catch (kec e2) {
                            }
                        }
                        if (i > 3) {
                            hwxVar.m10790c(false, 300, true, false);
                        } else if (i > 1) {
                            hwxVar.m10790c(false, 66, false, false);
                            hwxVar.m10790c(true, ScriptIntrinsicBLAS.UNIT, false, false);
                            hwxVar.m10790c(false, 198, true, i <= 2);
                        }
                    }
                    i = i2;
                } else {
                    i = i2;
                }
            }
            i2 = i;
            hwxVar = (hwx) hxcVar;
            hxaVar = hwxVar.f29755n;
            if (hxaVar != null) {
                if (z) {
                    if (hwxVar.f29749h.mo16813g()) {
                        ((clc) hwxVar.f29749h.mo16809c()).mo3890u();
                    }
                    hwxVar.f29755n.mo7905b();
                } else {
                    hxaVar.mo7906bK(i);
                }
                if (i == 0) {
                    hwxVar.f29755n.mo7904a();
                    if (hwxVar.f29749h.mo16813g()) {
                        ((clc) hwxVar.f29749h.mo16809c()).mo3876g();
                    }
                    hwxVar.f29752k.m9147e();
                } else {
                    if (hwxVar.f29754m.mo16813g()) {
                    }
                    ((nbe) ((nbe) hwx.f29742a.m17251b()).mo17276G((char) 4009)).mo17290o("Should not fire Led indicator");
                }
                i = i2;
            } else {
                i = i2;
            }
        }
        if (i == 0) {
            this.f29782c.removeView(this);
            return;
        }
        String str = String.format(getResources().getConfiguration().locale, "%d", Integer.valueOf(i));
        this.f29784e.setImportantForAccessibility(2);
        this.f29784e.setText(str);
        this.f29784e.announceForAccessibility(str);
        if (this.f29783d) {
            m10804d();
        }
        this.f29785f.sendEmptyMessageDelayed(1, 1000L);
    }

    /* JADX INFO: renamed from: c */
    public final void m10803c() {
        int measuredWidth = this.f29784e.getMeasuredWidth();
        int measuredHeight = this.f29784e.getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Choreographer.getInstance().postFrameCallback(new cij(this, 3));
            return;
        }
        this.f29784e.setScaleX(1.0f);
        this.f29784e.setScaleY(1.0f);
        this.f29784e.setPivotX(measuredWidth / 2.0f);
        this.f29784e.setPivotY(measuredHeight / 2.0f);
        this.f29784e.setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: d */
    public final void m10804d() {
        if (this.f29784e.getMeasuredWidth() <= 0 || this.f29784e.getMeasuredHeight() <= 0) {
            Choreographer.getInstance().postFrameCallback(new cij(this, 4));
        } else {
            m10803c();
            this.f29784e.animate().scaleX(1.375f).scaleY(1.375f).alpha(0.0f).setDuration(800L).start();
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m10805e() {
        return this.f29780a > 0;
    }
}
