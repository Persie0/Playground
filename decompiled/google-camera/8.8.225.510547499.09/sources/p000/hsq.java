package p000;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hsq implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ View f29434a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f29435b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f29436c;

    public hsq(View view, Runnable runnable, int i) {
        this.f29436c = i;
        this.f29434a = view;
        this.f29435b = runnable;
    }

    public hsq(dav davVar, View view, int i) {
        this.f29436c = i;
        this.f29435b = davVar;
        this.f29434a = view;
    }

    public hsq(icr icrVar, View view, int i) {
        this.f29436c = i;
        this.f29435b = icrVar;
        this.f29434a = view;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.Runnable] */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f29436c) {
            case 0:
                this.f29434a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                this.f29435b.run();
                break;
            case 1:
                this.f29434a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                igt igtVar = new igt(((dav) this.f29435b).f10325f.getResources().getString(C0100R.string.try_stabilization_tooltip));
                ilk ilkVar = ilk.PORTRAIT;
                switch (((dav) this.f29435b).f10332m.f6585d.ordinal()) {
                    case 1:
                        igtVar.m11306j(this.f29434a, 0);
                        break;
                    case 2:
                        igtVar.m11304h(this.f29434a, 0);
                        break;
                    default:
                        igtVar.m11313q(this.f29434a);
                        break;
                }
                Object obj = this.f29435b;
                igtVar.mo11305i();
                igtVar.mo11307k();
                byte[] bArr = null;
                igtVar.mo11303g(new czx(this, 4, bArr), ((dav) this.f29435b).f10324e);
                igtVar.mo11302f(new czx(this, 5, bArr), ((dav) this.f29435b).f10324e);
                igtVar.f30869d = 1000;
                igtVar.f30870e = 5000;
                igtVar.f30878m = 11;
                igtVar.f30874i = ((dav) this.f29435b).f10322c;
                igtVar.f30871f = false;
                igtVar.f30872g = true;
                igtVar.mo11308l();
                igtVar.mo11311o();
                ((dav) obj).f10340u = igtVar.mo11297a();
                break;
            default:
                this.f29434a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                jvb jvbVar = new jvb();
                gxn gxnVar = new gxn(this, this.f29434a, jvbVar, 13, (byte[]) null);
                Handler handlerM13556d = jvh.m13556d();
                handlerM13556d.postDelayed(gxnVar, 300L);
                jvbVar.m13537d(new gto(handlerM13556d, gxnVar, 19));
                ((icr) this.f29435b).f30385n = mrm.m16829i(jvbVar);
                break;
        }
    }
}
