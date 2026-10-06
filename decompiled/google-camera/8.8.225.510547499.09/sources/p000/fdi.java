package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fdi implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f21431a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f21432b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f21433c;

    public fdi(bgv bgvVar, FrameLayout frameLayout, int i) {
        this.f21433c = i;
        this.f21431a = bgvVar;
        this.f21432b = frameLayout;
    }

    public fdi(LayoutInflaterFactory2C0087cf layoutInflaterFactory2C0087cf, jew jewVar, int i, byte[] bArr) {
        this.f21433c = i;
        this.f21432b = layoutInflaterFactory2C0087cf;
        this.f21431a = jewVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f21433c) {
            case 0:
                ((bgv) this.f21431a).m2440g();
                ((FrameLayout) this.f21432b).removeOnAttachStateChangeListener(this);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f21433c) {
            case 0:
                ((bgv) this.f21431a).m2444k();
                break;
            default:
                jew jewVar = (jew) this.f21431a;
                Object obj = jewVar.f33848c;
                jewVar.m13002e();
                C0134dm.m6385b((ViewGroup) ((ComponentCallbacksC0077bw) obj).f4586N.getParent(), ((LayoutInflaterFactory2C0087cf) this.f21432b).f5491a).m6392d();
                break;
        }
    }
}
