package p021j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* JADX INFO: renamed from: j$.util.stream.D0 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0581D0 extends CountedCompleter {

    /* JADX INFO: renamed from: a */
    protected final InterfaceC0613O f33299a;

    /* JADX INFO: renamed from: b */
    protected final int f33300b;

    AbstractC0581D0(InterfaceC0613O interfaceC0613O) {
        this.f33299a = interfaceC0613O;
        this.f33300b = 0;
    }

    /* JADX INFO: renamed from: a */
    abstract void mo12609a();

    /* JADX INFO: renamed from: b */
    abstract C0578C0 mo12610b(int i, int i2);

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        AbstractC0581D0 abstractC0581D0Mo12610b = this;
        while (abstractC0581D0Mo12610b.f33299a.mo12604u() != 0) {
            abstractC0581D0Mo12610b.setPendingCount(abstractC0581D0Mo12610b.f33299a.mo12604u() - 1);
            int i = 0;
            int iCount = 0;
            while (i < abstractC0581D0Mo12610b.f33299a.mo12604u() - 1) {
                C0578C0 c0578c0Mo12610b = abstractC0581D0Mo12610b.mo12610b(i, abstractC0581D0Mo12610b.f33300b + iCount);
                iCount = (int) (((long) iCount) + c0578c0Mo12610b.f33299a.count());
                c0578c0Mo12610b.fork();
                i++;
            }
            abstractC0581D0Mo12610b = abstractC0581D0Mo12610b.mo12610b(i, abstractC0581D0Mo12610b.f33300b + iCount);
        }
        abstractC0581D0Mo12610b.mo12609a();
        abstractC0581D0Mo12610b.propagateCompletion();
    }

    AbstractC0581D0(AbstractC0581D0 abstractC0581D0, InterfaceC0613O interfaceC0613O, int i) {
        super(abstractC0581D0);
        this.f33299a = interfaceC0613O;
        this.f33300b = i;
    }
}
