package p021j$.util.stream;

import java.util.function.Consumer;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.U1 */
/* JADX INFO: loaded from: classes3.dex */
final class C0632U1 extends AbstractC0717w1 {
    C0632U1(AbstractC0586F abstractC0586F, Spliterator spliterator, boolean z) {
        super(abstractC0586F, spliterator, z);
    }

    @Override // p021j$.util.stream.AbstractC0717w1
    /* JADX INFO: renamed from: d */
    final void mo12638d() {
        C0702r1 c0702r1 = new C0702r1();
        this.f33522h = c0702r1;
        this.f33519e = this.f33516b.mo12661B(new C0629T1(c0702r1, 0));
        this.f33520f = new C0648a(6, this);
    }

    @Override // p021j$.util.stream.AbstractC0717w1
    /* JADX INFO: renamed from: e */
    final AbstractC0717w1 mo12639e(Spliterator spliterator) {
        return new C0632U1(this.f33516b, spliterator, this.f33515a);
    }

    @Override // p021j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f33522h != null || this.f33523i) {
            while (tryAdvance(consumer)) {
            }
            return;
        }
        consumer.getClass();
        m12746c();
        C0629T1 c0629t1 = new C0629T1(consumer, 1);
        this.f33516b.mo12660A(this.f33518d, c0629t1);
        this.f33523i = true;
    }

    @Override // p021j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        consumer.getClass();
        boolean zM12745a = m12745a();
        if (zM12745a) {
            C0702r1 c0702r1 = (C0702r1) this.f33522h;
            long j = this.f33521g;
            if (c0702r1.f33404b != 0) {
                if (j >= c0702r1.count()) {
                    throw new IndexOutOfBoundsException(Long.toString(j));
                }
                for (int i = 0; i <= c0702r1.f33404b; i++) {
                    long j2 = c0702r1.f33405c[i];
                    Object[] objArr = c0702r1.f33465e[i];
                    if (j < ((long) objArr.length) + j2) {
                        obj = objArr[(int) (j - j2)];
                    }
                }
                throw new IndexOutOfBoundsException(Long.toString(j));
            }
            if (j >= c0702r1.f33403a) {
                throw new IndexOutOfBoundsException(Long.toString(j));
            }
            obj = c0702r1.f33464d[(int) j];
            consumer.accept(obj);
        }
        return zM12745a;
    }

    C0632U1(AbstractC0586F abstractC0586F, C0648a c0648a, boolean z) {
        super(abstractC0586F, c0648a, z);
    }
}
