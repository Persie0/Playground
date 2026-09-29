package p322pd;

import android.support.v4.media.session.C0166e;
import com.linguist.R;

/* JADX INFO: renamed from: pd.i */
/* JADX INFO: loaded from: classes.dex */
public final class C8228i extends AbstractC8229j<InterfaceC8236q> {
    public C8228i(int i10, boolean z10) {
        InterfaceC8236q c8234o;
        if (i10 == 0) {
            c8234o = new C8234o(z10 ? 8388613 : 8388611);
        } else if (i10 == 1) {
            c8234o = new C8234o(z10 ? 80 : 48);
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException(C0166e.m761g("Invalid axis: ", i10));
            }
            c8234o = new C8231l(z10);
        }
        super(c8234o, new C8225f());
    }

    @Override // p322pd.AbstractC8229j
    /* JADX INFO: renamed from: a0 */
    public final int mo16369a0(boolean z10) {
        return R.attr.motionDurationLong1;
    }

    @Override // p322pd.AbstractC8229j
    /* JADX INFO: renamed from: b0 */
    public final int mo16370b0(boolean z10) {
        return R.attr.motionEasingEmphasizedInterpolator;
    }
}
