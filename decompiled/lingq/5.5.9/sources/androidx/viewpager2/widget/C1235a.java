package androidx.viewpager2.widget;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.viewpager2.widget.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1235a extends ViewPager2.AbstractC1229e {

    /* JADX INFO: renamed from: a */
    public final ArrayList f7767a = new ArrayList(3);

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1229e
    /* JADX INFO: renamed from: a */
    public final void mo4680a(int i10) {
        try {
            Iterator it = this.f7767a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.AbstractC1229e) it.next()).mo4680a(i10);
            }
        } catch (ConcurrentModificationException e10) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e10);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1229e
    /* JADX INFO: renamed from: b */
    public final void mo4686b(float f3, int i10, int i11) {
        try {
            Iterator it = this.f7767a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.AbstractC1229e) it.next()).mo4686b(f3, i10, i11);
            }
        } catch (ConcurrentModificationException e10) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e10);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1229e
    /* JADX INFO: renamed from: c */
    public final void mo4681c(int i10) {
        try {
            Iterator it = this.f7767a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.AbstractC1229e) it.next()).mo4681c(i10);
            }
        } catch (ConcurrentModificationException e10) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e10);
        }
    }
}
