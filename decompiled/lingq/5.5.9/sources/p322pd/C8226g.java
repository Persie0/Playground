package p322pd;

import android.animation.TimeInterpolator;
import com.linguist.R;
import p177ic.C6308a;

/* JADX INFO: renamed from: pd.g */
/* JADX INFO: loaded from: classes.dex */
public final class C8226g extends AbstractC8229j<C8222c> {
    public C8226g() {
        C8222c c8222c = new C8222c();
        c8222c.f44480a = 0.3f;
        C8231l c8231l = new C8231l(true);
        c8231l.f44496c = false;
        c8231l.f44494a = 0.8f;
        super(c8222c, c8231l);
    }

    @Override // p322pd.AbstractC8229j
    /* JADX INFO: renamed from: Z */
    public final TimeInterpolator mo16368Z() {
        return C6308a.f36523a;
    }

    @Override // p322pd.AbstractC8229j
    /* JADX INFO: renamed from: a0 */
    public final int mo16369a0(boolean z10) {
        return z10 ? R.attr.motionDurationMedium4 : R.attr.motionDurationShort3;
    }

    @Override // p322pd.AbstractC8229j
    /* JADX INFO: renamed from: b0 */
    public final int mo16370b0(boolean z10) {
        return z10 ? R.attr.motionEasingEmphasizedDecelerateInterpolator : R.attr.motionEasingEmphasizedAccelerateInterpolator;
    }
}
