package androidx.compose.p002ui.platform;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p002ui.R$id;
import androidx.compose.runtime.internal.C0282a;
import kotlinx.coroutines.channels.C3211a;
import p000.cfa;
import p000.do7;
import p000.kn1;
import p000.l9b;
import p000.nc9;
import p000.pf1;
import p000.u91;
import p000.vi3;
import p000.vz1;
import p000.wfb;
import p000.xfa;
import p000.zn3;

/* JADX INFO: renamed from: androidx.compose.ui.platform.z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0414z {

    /* JADX INFO: renamed from: a */
    public static final ViewGroup.LayoutParams f4878a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Code duplicated, block: B:23:0x005f  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:29:0x008a  */
    /* JADX WARN: Code duplicated, block: B:31:0x008f  */
    /* JADX INFO: renamed from: a */
    public static final C0413y m1825a(AbstractC0389a abstractC0389a, C0401m c0401m, C0282a c0282a) {
        ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c;
        C0413y c0413y;
        if (zn3.f71793a.compareAndSet(false, true)) {
            final C3211a c3211aM10525a = do7.m10525a(1, 6, null);
            wfb.m23926u(vz1.m23619a((kn1) C0397i.f4770H.getValue()), null, null, new GlobalSnapshotManager$ensureStarted$1(c3211aM10525a, null), 3);
            vi3 vi3Var = new vi3() { // from class: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$2
                {
                    super(1);
                }

                @Override // p000.vi3
                public final Object invoke(Object obj) {
                    boolean zCompareAndSet = zn3.f71794b.compareAndSet(false, true);
                    xfa xfaVar = xfa.f68157a;
                    if (zCompareAndSet) {
                        c3211aM10525a.mo4677k(xfaVar);
                    }
                    return xfaVar;
                }
            };
            synchronized (nc9.f52602c) {
                nc9.f52608i = u91.m22604V0(nc9.f52608i, vi3Var);
            }
            nc9.m17349a();
        }
        if (abstractC0389a.getChildCount() > 0) {
            View childAt = abstractC0389a.getChildAt(0);
            viewTreeObserverOnGlobalLayoutListenerC0391c = childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC0391c ? (ViewTreeObserverOnGlobalLayoutListenerC0391c) childAt : null;
            if (viewTreeObserverOnGlobalLayoutListenerC0391c != null) {
                viewTreeObserverOnGlobalLayoutListenerC0391c.setComposeViewContext(c0401m);
            }
            if (viewTreeObserverOnGlobalLayoutListenerC0391c == null) {
                viewTreeObserverOnGlobalLayoutListenerC0391c = new ViewTreeObserverOnGlobalLayoutListenerC0391c(abstractC0389a.getContext(), c0401m);
                abstractC0389a.addView(viewTreeObserverOnGlobalLayoutListenerC0391c.getView(), f4878a);
            }
            viewTreeObserverOnGlobalLayoutListenerC0391c.setComposeViewContext(c0401m);
            if (abstractC0389a.getComposeViewContext$ui() != null) {
                c0401m.m1802c();
                viewTreeObserverOnGlobalLayoutListenerC0391c.setComposeViewContextIncrementedDuringInit$ui(true);
            }
            Object tag = viewTreeObserverOnGlobalLayoutListenerC0391c.getTag(R$id.wrapped_composition_tag);
            c0413y = tag instanceof C0413y ? (C0413y) tag : null;
            if (c0413y == null) {
                c0413y = new C0413y(viewTreeObserverOnGlobalLayoutListenerC0391c, new pf1(c0401m.f4787b, new cfa(viewTreeObserverOnGlobalLayoutListenerC0391c.getRoot())));
                viewTreeObserverOnGlobalLayoutListenerC0391c.setTag(R$id.wrapped_composition_tag, c0413y);
            }
            c0413y.m1824d(c0282a);
            viewTreeObserverOnGlobalLayoutListenerC0391c.setFrameEndScheduler$ui(new l9b(c0401m.f4787b));
            return c0413y;
        }
        abstractC0389a.removeAllViews();
        viewTreeObserverOnGlobalLayoutListenerC0391c = null;
        if (viewTreeObserverOnGlobalLayoutListenerC0391c == null) {
            viewTreeObserverOnGlobalLayoutListenerC0391c = new ViewTreeObserverOnGlobalLayoutListenerC0391c(abstractC0389a.getContext(), c0401m);
            abstractC0389a.addView(viewTreeObserverOnGlobalLayoutListenerC0391c.getView(), f4878a);
        }
        viewTreeObserverOnGlobalLayoutListenerC0391c.setComposeViewContext(c0401m);
        if (abstractC0389a.getComposeViewContext$ui() != null) {
            c0401m.m1802c();
            viewTreeObserverOnGlobalLayoutListenerC0391c.setComposeViewContextIncrementedDuringInit$ui(true);
        }
        Object tag2 = viewTreeObserverOnGlobalLayoutListenerC0391c.getTag(R$id.wrapped_composition_tag);
        if (tag2 instanceof C0413y) {
        }
        if (c0413y == null) {
            c0413y = new C0413y(viewTreeObserverOnGlobalLayoutListenerC0391c, new pf1(c0401m.f4787b, new cfa(viewTreeObserverOnGlobalLayoutListenerC0391c.getRoot())));
            viewTreeObserverOnGlobalLayoutListenerC0391c.setTag(R$id.wrapped_composition_tag, c0413y);
        }
        c0413y.m1824d(c0282a);
        viewTreeObserverOnGlobalLayoutListenerC0391c.setFrameEndScheduler$ui(new l9b(c0401m.f4787b));
        return c0413y;
    }
}
