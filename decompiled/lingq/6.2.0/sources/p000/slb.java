package p000;

import com.google.android.gms.internal.mlkit_vision_text_common.C0974e;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class slb extends dib implements ListIterator {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0974e f60990e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public slb(C0974e c0974e, int i) {
        super(c0974e, ((List) c0974e.f12029b).listIterator(i));
        this.f60990e = c0974e;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        C0974e c0974e = this.f60990e;
        boolean zIsEmpty = c0974e.isEmpty();
        m10407a();
        ((ListIterator) this.f35695b).add(obj);
        if (zIsEmpty) {
            c0974e.m5471d();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        m10407a();
        return ((ListIterator) this.f35695b).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        m10407a();
        return ((ListIterator) this.f35695b).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m10407a();
        return ((ListIterator) this.f35695b).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        m10407a();
        return ((ListIterator) this.f35695b).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m10407a();
        ((ListIterator) this.f35695b).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public slb(C0974e c0974e) {
        super(c0974e);
        this.f60990e = c0974e;
    }
}
