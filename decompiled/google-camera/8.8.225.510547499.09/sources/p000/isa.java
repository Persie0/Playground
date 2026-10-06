package p000;

import android.R;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import androidx.work.impl.background.systemalarm.vIy.VCYBIzY;
import com.google.android.apps.camera.whitebalance.ManualWhiteBalanceUi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class isa extends iru {

    /* JADX INFO: renamed from: f */
    public static final nbh f31965f = nbh.m17259h(VCYBIzY.AtgjcDld);

    /* JADX INFO: renamed from: g */
    public final ManualWhiteBalanceUi f31966g;

    /* JADX INFO: renamed from: h */
    public final jvd f31967h;

    /* JADX INFO: renamed from: i */
    public final hxn f31968i;

    /* JADX INFO: renamed from: j */
    public final ObjectAnimator f31969j;

    /* JADX INFO: renamed from: k */
    public final jww f31970k = new jwf(true);

    /* JADX INFO: renamed from: l */
    public boolean f31971l = false;

    /* JADX INFO: renamed from: m */
    public final Runnable f31972m = new ipa(this, 16);

    /* JADX INFO: renamed from: n */
    public final ihk f31973n;

    public isa(ManualWhiteBalanceUi manualWhiteBalanceUi, jvd jvdVar, hxn hxnVar, ihk ihkVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f31966g = manualWhiteBalanceUi;
        this.f31967h = jvdVar;
        this.f31968i = hxnVar;
        ObjectAnimator objectAnimator = (ObjectAnimator) AnimatorInflater.loadAnimator(manualWhiteBalanceUi.getContext(), R.animator.fade_in);
        objectAnimator.setTarget(manualWhiteBalanceUi);
        objectAnimator.addListener(new irv(this, manualWhiteBalanceUi, 0));
        this.f31969j = objectAnimator;
        this.f31973n = ihkVar;
    }

    /* JADX INFO: renamed from: k */
    final void m11670k() {
        this.f31966g.removeCallbacks(this.f31972m);
    }

    /* JADX INFO: renamed from: l */
    public final void m11671l(boolean z, boolean z2) {
        this.f31967h.m13541c(new irp(this, z2, z, 3));
    }

    /* JADX INFO: renamed from: m */
    public final void m11672m() {
        this.f31970k.mo3415bf(true);
    }

    /* JADX INFO: renamed from: n */
    public final void m11673n(boolean z, boolean z2) {
        this.f31967h.m13541c(new irp(this, z2, z, 4));
    }
}
