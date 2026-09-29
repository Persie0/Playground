package p000;

import com.lingq.feature.reader.old.ReaderFragment;
import com.lingq.feature.reader.shared.p018ui.components.ReaderProgressBar;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes3.dex */
public final class hf1 extends rua {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42293a;

    /* JADX INFO: renamed from: b */
    public final Object f42294b;

    public hf1() {
        this.f42293a = 0;
        this.f42294b = new ArrayList(3);
    }

    @Override // p000.rua
    /* JADX INFO: renamed from: a */
    public final void mo10797a(int i) {
        int i2 = this.f42293a;
        Object obj = this.f42294b;
        switch (i2) {
            case 0:
                try {
                    Iterator it = ((ArrayList) obj).iterator();
                    while (it.hasNext()) {
                        ((rua) it.next()).mo10797a(i);
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                }
            case 1:
                ((rg1) obj).m20658b(false);
                return;
            default:
                ReaderFragment readerFragment = (ReaderFragment) obj;
                if (i == 0) {
                    bh4[] bh4VarArr = ReaderFragment.f28218P0;
                    readerFragment.m9288U0().f66708n.m9427k();
                    return;
                } else {
                    if (i != 2) {
                        return;
                    }
                    bh4[] bh4VarArr2 = ReaderFragment.f28218P0;
                    C3244l c3244l = readerFragment.m9290W0().f29325W;
                    Boolean bool = Boolean.TRUE;
                    c3244l.getClass();
                    c3244l.m15572j(null, bool);
                    return;
                }
        }
    }

    @Override // p000.rua
    /* JADX INFO: renamed from: b */
    public void mo10798b(int i, float f, int i2) {
        int i3 = this.f42293a;
        Object obj = this.f42294b;
        switch (i3) {
            case 0:
                try {
                    Iterator it = ((ArrayList) obj).iterator();
                    while (it.hasNext()) {
                        ((rua) it.next()).mo10798b(i, f, i2);
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                }
            case 1:
            default:
                return;
            case 2:
                bh4[] bh4VarArr = ReaderFragment.f28218P0;
                ReaderProgressBar readerProgressBar = ((ReaderFragment) obj).m9288U0().f66708n;
                float fM9421h = ReaderProgressBar.m9421h(readerProgressBar, i + f);
                boolean z = readerProgressBar.f30421b0;
                if (z || fM9421h <= 0.0f || readerProgressBar.f30416V || !readerProgressBar.f30425d0) {
                    return;
                }
                readerProgressBar.f30407M = fM9421h;
                readerProgressBar.f30417W = true;
                if (!readerProgressBar.f30429f0 && !readerProgressBar.f30431g0 && f != 0.0f) {
                    readerProgressBar.f30424d.setAlpha(255);
                    readerProgressBar.f30422c.setAlpha(255);
                } else if (f == 0.0f && !z) {
                    float f2 = readerProgressBar.f30405K;
                    if (f2 - ((int) f2) == 0.0f) {
                        readerProgressBar.f30417W = false;
                        readerProgressBar.postDelayed(new oy7(readerProgressBar, 1), readerProgressBar.f30411Q);
                    }
                }
                readerProgressBar.m9429m();
                readerProgressBar.m9428l();
                return;
        }
    }

    @Override // p000.rua
    /* JADX INFO: renamed from: c */
    public final void mo10799c(int i) {
        int i2 = this.f42293a;
        Object obj = this.f42294b;
        switch (i2) {
            case 0:
                try {
                    Iterator it = ((ArrayList) obj).iterator();
                    while (it.hasNext()) {
                        ((rua) it.next()).mo10799c(i);
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                }
            case 1:
                ((rg1) obj).m20658b(false);
                return;
            default:
                bh4[] bh4VarArr = ReaderFragment.f28218P0;
                ((ReaderFragment) obj).m9290W0().m9341u3(i, true);
                return;
        }
    }

    public /* synthetic */ hf1(Object obj, int i) {
        this.f42293a = i;
        this.f42294b = obj;
    }
}
