package p322pd;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import p177ic.C6308a;
import p260m8.C7499b;
import p322pd.InterfaceC8236q;
import p406u4.AbstractC9447y0;
import p406u4.C9425n0;
import p531zc.C10477a;

/* JADX INFO: renamed from: pd.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8229j<P extends InterfaceC8236q> extends AbstractC9447y0 {

    /* JADX INFO: renamed from: a0 */
    public final P f44488a0;

    /* JADX INFO: renamed from: b0 */
    public final InterfaceC8236q f44489b0;

    /* JADX INFO: renamed from: c0 */
    public final ArrayList f44490c0 = new ArrayList();

    public AbstractC8229j(P p10, InterfaceC8236q interfaceC8236q) {
        this.f44488a0 = p10;
        this.f44489b0 = interfaceC8236q;
    }

    /* JADX INFO: renamed from: X */
    public static void m16371X(ArrayList arrayList, InterfaceC8236q interfaceC8236q, ViewGroup viewGroup, View view, boolean z10) {
        if (interfaceC8236q == null) {
            return;
        }
        Animator animatorMo16365a = z10 ? interfaceC8236q.mo16365a(viewGroup, view) : interfaceC8236q.mo16366b(viewGroup, view);
        if (animatorMo16365a != null) {
            arrayList.add(animatorMo16365a);
        }
    }

    @Override // p406u4.AbstractC9447y0
    /* JADX INFO: renamed from: V */
    public final Animator mo16372V(ViewGroup viewGroup, View view, C9425n0 c9425n0, C9425n0 c9425n1) {
        return m16374Y(viewGroup, view, true);
    }

    @Override // p406u4.AbstractC9447y0
    /* JADX INFO: renamed from: W */
    public final Animator mo16373W(ViewGroup viewGroup, View view, C9425n0 c9425n0) {
        return m16374Y(viewGroup, view, false);
    }

    /* JADX INFO: renamed from: Y */
    public final AnimatorSet m16374Y(ViewGroup viewGroup, View view, boolean z10) {
        int iM19428c;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        m16371X(arrayList, this.f44488a0, viewGroup, view, z10);
        m16371X(arrayList, this.f44489b0, viewGroup, view, z10);
        Iterator it = this.f44490c0.iterator();
        while (it.hasNext()) {
            m16371X(arrayList, (InterfaceC8236q) it.next(), viewGroup, view, z10);
        }
        Context context = viewGroup.getContext();
        int iMo16369a0 = mo16369a0(z10);
        int i10 = C8235p.f44502a;
        if (iMo16369a0 != 0 && this.f48293c == -1 && (iM19428c = C10477a.m19428c(iMo16369a0, context, -1)) != -1) {
            this.f48293c = iM19428c;
        }
        int iMo16370b0 = mo16370b0(z10);
        TimeInterpolator timeInterpolatorMo16368Z = mo16368Z();
        if (iMo16370b0 != 0 && this.f48294d == null) {
            this.f48294d = C10477a.m19429d(context, iMo16370b0, timeInterpolatorMo16368Z);
        }
        C7499b.m14952m0(animatorSet, arrayList);
        return animatorSet;
    }

    /* JADX INFO: renamed from: Z */
    public TimeInterpolator mo16368Z() {
        return C6308a.f36524b;
    }

    /* JADX INFO: renamed from: a0 */
    public abstract int mo16369a0(boolean z10);

    /* JADX INFO: renamed from: b0 */
    public abstract int mo16370b0(boolean z10);
}
