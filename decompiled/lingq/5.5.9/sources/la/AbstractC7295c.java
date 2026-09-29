package la;

import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import p218k9.AbstractC6636f;
import p219ka.AbstractC6650k;
import p219ka.C6649j;
import p219ka.InterfaceC6647h;
import p402u0.C9371n;
import p479xa.C10129a;
import p479xa.C10134c0;

/* JADX INFO: renamed from: la.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7295c implements InterfaceC6647h {

    /* JADX INFO: renamed from: a */
    public final ArrayDeque<a> f40897a = new ArrayDeque<>();

    /* JADX INFO: renamed from: b */
    public final ArrayDeque<AbstractC6650k> f40898b;

    /* JADX INFO: renamed from: c */
    public final PriorityQueue<a> f40899c;

    /* JADX INFO: renamed from: d */
    public a f40900d;

    /* JADX INFO: renamed from: e */
    public long f40901e;

    /* JADX INFO: renamed from: f */
    public long f40902f;

    /* JADX INFO: renamed from: la.c$a */
    public static final class a extends C6649j implements Comparable<a> {

        /* JADX INFO: renamed from: j */
        public long f40903j;

        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            a aVar2 = aVar;
            if (m13269m(4) == aVar2.m13269m(4)) {
                long j10 = this.f12118e - aVar2.f12118e;
                if (j10 == 0) {
                    j10 = this.f40903j - aVar2.f40903j;
                    if (j10 == 0) {
                        return 0;
                    }
                }
                if (j10 > 0) {
                    return 1;
                }
            } else if (m13269m(4)) {
                return 1;
            }
            return -1;
        }
    }

    /* JADX INFO: renamed from: la.c$b */
    public static final class b extends AbstractC6650k {

        /* JADX INFO: renamed from: e */
        public final AbstractC6636f.a<b> f40904e;

        public b(C9371n c9371n) {
            this.f40904e = c9371n;
        }

        @Override // p218k9.AbstractC6636f
        /* JADX INFO: renamed from: p */
        public final void mo13274p() {
            AbstractC7295c abstractC7295c = (AbstractC7295c) ((C9371n) this.f40904e).f48145b;
            abstractC7295c.getClass();
            this.f37591a = 0;
            this.f37701c = null;
            abstractC7295c.f40898b.add(this);
        }
    }

    public AbstractC7295c() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f40897a.add(new a());
        }
        this.f40898b = new ArrayDeque<>();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f40898b.add(new b(new C9371n(8, this)));
        }
        this.f40899c = new PriorityQueue<>();
    }

    @Override // p218k9.InterfaceC6634d
    /* JADX INFO: renamed from: a */
    public final void mo13271a(C6649j c6649j) throws DecoderException {
        C10129a.m18990b(c6649j == this.f40900d);
        a aVar = (a) c6649j;
        if (aVar.m13270o()) {
            aVar.mo6927p();
            this.f40897a.add(aVar);
        } else {
            long j10 = this.f40902f;
            this.f40902f = 1 + j10;
            aVar.f40903j = j10;
            this.f40899c.add(aVar);
        }
        this.f40900d = null;
    }

    @Override // p219ka.InterfaceC6647h
    /* JADX INFO: renamed from: b */
    public final void mo13278b(long j10) {
        this.f40901e = j10;
    }

    @Override // p218k9.InterfaceC6634d
    /* JADX INFO: renamed from: d */
    public final C6649j mo13273d() throws DecoderException {
        C10129a.m18992d(this.f40900d == null);
        ArrayDeque<a> arrayDeque = this.f40897a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        a aVarPollFirst = arrayDeque.pollFirst();
        this.f40900d = aVarPollFirst;
        return aVarPollFirst;
    }

    /* JADX INFO: renamed from: e */
    public abstract C7296d mo14667e();

    /* JADX INFO: renamed from: f */
    public abstract void mo14668f(a aVar);

    @Override // p218k9.InterfaceC6634d
    public void flush() {
        ArrayDeque<a> arrayDeque;
        this.f40902f = 0L;
        this.f40901e = 0L;
        while (true) {
            PriorityQueue<a> priorityQueue = this.f40899c;
            boolean zIsEmpty = priorityQueue.isEmpty();
            arrayDeque = this.f40897a;
            if (zIsEmpty) {
                break;
            }
            a aVarPoll = priorityQueue.poll();
            int i10 = C10134c0.f51354a;
            aVarPoll.mo6927p();
            arrayDeque.add(aVarPoll);
        }
        a aVar = this.f40900d;
        if (aVar != null) {
            aVar.mo6927p();
            arrayDeque.add(aVar);
            this.f40900d = null;
        }
    }

    @Override // p218k9.InterfaceC6634d
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public AbstractC6650k mo13272c() throws SubtitleDecoderException {
        ArrayDeque<AbstractC6650k> arrayDeque = this.f40898b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            PriorityQueue<a> priorityQueue = this.f40899c;
            if (!priorityQueue.isEmpty()) {
                a aVarPeek = priorityQueue.peek();
                int i10 = C10134c0.f51354a;
                if (aVarPeek.f12118e <= this.f40901e) {
                    a aVarPoll = priorityQueue.poll();
                    boolean zM13269m = aVarPoll.m13269m(4);
                    ArrayDeque<a> arrayDeque2 = this.f40897a;
                    if (zM13269m) {
                        AbstractC6650k abstractC6650kPollFirst = arrayDeque.pollFirst();
                        abstractC6650kPollFirst.m13268l(4);
                        aVarPoll.mo6927p();
                        arrayDeque2.add(aVarPoll);
                        return abstractC6650kPollFirst;
                    }
                    mo14668f(aVarPoll);
                    if (mo14670h()) {
                        C7296d c7296dMo14667e = mo14667e();
                        AbstractC6650k abstractC6650kPollFirst2 = arrayDeque.pollFirst();
                        abstractC6650kPollFirst2.m13282q(aVarPoll.f12118e, c7296dMo14667e, Long.MAX_VALUE);
                        aVarPoll.mo6927p();
                        arrayDeque2.add(aVarPoll);
                        return abstractC6650kPollFirst2;
                    }
                    aVarPoll.mo6927p();
                    arrayDeque2.add(aVarPoll);
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public abstract boolean mo14670h();

    @Override // p218k9.InterfaceC6634d
    public void release() {
    }
}
