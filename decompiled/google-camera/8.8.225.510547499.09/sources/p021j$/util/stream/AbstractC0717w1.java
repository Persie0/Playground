package p021j$.util.stream;

import java.util.Comparator;
import java.util.function.Supplier;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.w1 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0717w1 implements Spliterator {

    /* JADX INFO: renamed from: a */
    final boolean f33515a;

    /* JADX INFO: renamed from: b */
    final AbstractC0586F f33516b;

    /* JADX INFO: renamed from: c */
    private Supplier f33517c;

    /* JADX INFO: renamed from: d */
    Spliterator f33518d;

    /* JADX INFO: renamed from: e */
    InterfaceC0646Z0 f33519e;

    /* JADX INFO: renamed from: f */
    C0648a f33520f;

    /* JADX INFO: renamed from: g */
    long f33521g;

    /* JADX INFO: renamed from: h */
    AbstractC0661e f33522h;

    /* JADX INFO: renamed from: i */
    boolean f33523i;

    AbstractC0717w1(AbstractC0586F abstractC0586F, Spliterator spliterator, boolean z) {
        this.f33516b = abstractC0586F;
        this.f33517c = null;
        this.f33518d = spliterator;
        this.f33515a = z;
    }

    /* JADX INFO: renamed from: b */
    private boolean m12744b() {
        while (this.f33522h.count() == 0) {
            if (this.f33519e.mo12600m() || !this.f33520f.getAsBoolean()) {
                if (this.f33523i) {
                    return false;
                }
                this.f33519e.mo12598f();
                this.f33523i = true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    final boolean m12745a() {
        AbstractC0661e abstractC0661e = this.f33522h;
        if (abstractC0661e == null) {
            if (this.f33523i) {
                return false;
            }
            m12746c();
            mo12638d();
            this.f33521g = 0L;
            this.f33519e.mo12599h(this.f33518d.getExactSizeIfKnown());
            return m12744b();
        }
        long j = this.f33521g + 1;
        this.f33521g = j;
        boolean z = j < abstractC0661e.count();
        if (z) {
            return z;
        }
        this.f33521g = 0L;
        this.f33522h.clear();
        return m12744b();
    }

    /* JADX INFO: renamed from: c */
    final void m12746c() {
        if (this.f33518d == null) {
            this.f33518d = (Spliterator) this.f33517c.get();
            this.f33517c = null;
        }
    }

    @Override // p021j$.util.Spliterator
    public final int characteristics() {
        m12746c();
        int iM12739i = EnumC0711u1.m12739i(this.f33516b.mo12665x()) & EnumC0711u1.f33489f;
        return (iM12739i & 64) != 0 ? (iM12739i & (-16449)) | (this.f33518d.characteristics() & 16448) : iM12739i;
    }

    /* JADX INFO: renamed from: d */
    abstract void mo12638d();

    /* JADX INFO: renamed from: e */
    abstract AbstractC0717w1 mo12639e(Spliterator spliterator);

    @Override // p021j$.util.Spliterator
    public final long estimateSize() {
        m12746c();
        return this.f33518d.estimateSize();
    }

    @Override // p021j$.util.Spliterator
    public final Comparator getComparator() {
        if (Spliterator.CC.$default$hasCharacteristics(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // p021j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        m12746c();
        if (EnumC0711u1.SIZED.m12740e(this.f33516b.mo12665x())) {
            return this.f33518d.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.f33518d);
    }

    @Override // p021j$.util.Spliterator
    public Spliterator trySplit() {
        if (!this.f33515a || this.f33522h != null || this.f33523i) {
            return null;
        }
        m12746c();
        Spliterator spliteratorTrySplit = this.f33518d.trySplit();
        if (spliteratorTrySplit == null) {
            return null;
        }
        return mo12639e(spliteratorTrySplit);
    }

    AbstractC0717w1(AbstractC0586F abstractC0586F, C0648a c0648a, boolean z) {
        this.f33516b = abstractC0586F;
        this.f33517c = c0648a;
        this.f33518d = null;
        this.f33515a = z;
    }
}
