package p218k9;

import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayDeque;
import p218k9.AbstractC6636f;
import p219ka.AbstractC6645f;
import p219ka.C6644e;
import p219ka.C6649j;
import p479xa.C10129a;

/* JADX INFO: renamed from: k9.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6638h<I extends DecoderInputBuffer, O extends AbstractC6636f, E extends DecoderException> implements InterfaceC6634d<I, O, E> {

    /* JADX INFO: renamed from: a */
    public final a f37622a;

    /* JADX INFO: renamed from: b */
    public final Object f37623b = new Object();

    /* JADX INFO: renamed from: c */
    public final ArrayDeque<I> f37624c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d */
    public final ArrayDeque<O> f37625d = new ArrayDeque<>();

    /* JADX INFO: renamed from: e */
    public final I[] f37626e;

    /* JADX INFO: renamed from: f */
    public final O[] f37627f;

    /* JADX INFO: renamed from: g */
    public int f37628g;

    /* JADX INFO: renamed from: h */
    public int f37629h;

    /* JADX INFO: renamed from: i */
    public I f37630i;

    /* JADX INFO: renamed from: j */
    public SubtitleDecoderException f37631j;

    /* JADX INFO: renamed from: k */
    public boolean f37632k;

    /* JADX INFO: renamed from: l */
    public boolean f37633l;

    /* JADX INFO: renamed from: k9.h$a */
    public class a extends Thread {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC6638h f37634a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC6645f abstractC6645f) {
            super("ExoPlayer:SimpleDecoder");
            this.f37634a = abstractC6645f;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            AbstractC6638h abstractC6638h = this.f37634a;
            abstractC6638h.getClass();
            do {
                try {
                } catch (InterruptedException e10) {
                    throw new IllegalStateException(e10);
                }
            } while (abstractC6638h.m13276f());
        }
    }

    public AbstractC6638h(I[] iArr, O[] oArr) {
        this.f37626e = iArr;
        this.f37628g = iArr.length;
        for (int i10 = 0; i10 < this.f37628g; i10++) {
            this.f37626e[i10] = new C6649j();
        }
        this.f37627f = oArr;
        this.f37629h = oArr.length;
        for (int i11 = 0; i11 < this.f37629h; i11++) {
            this.f37627f[i11] = new C6644e((AbstractC6645f) this);
        }
        a aVar = new a((AbstractC6645f) this);
        this.f37622a = aVar;
        aVar.start();
    }

    @Override // p218k9.InterfaceC6634d
    /* JADX INFO: renamed from: a */
    public final void mo13271a(C6649j c6649j) throws DecoderException {
        synchronized (this.f37623b) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.f37631j;
                if (subtitleDecoderException != null) {
                    throw subtitleDecoderException;
                }
                boolean z10 = true;
                C10129a.m18990b(c6649j == this.f37630i);
                this.f37624c.addLast(c6649j);
                if (this.f37624c.isEmpty() || this.f37629h <= 0) {
                    z10 = false;
                }
                if (z10) {
                    this.f37623b.notify();
                }
                this.f37630i = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p218k9.InterfaceC6634d
    /* JADX INFO: renamed from: c */
    public final Object mo13272c() throws DecoderException {
        synchronized (this.f37623b) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.f37631j;
                if (subtitleDecoderException != null) {
                    throw subtitleDecoderException;
                }
                if (this.f37625d.isEmpty()) {
                    return null;
                }
                return this.f37625d.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p218k9.InterfaceC6634d
    /* JADX INFO: renamed from: d */
    public final Object mo13273d() throws DecoderException {
        I i10;
        synchronized (this.f37623b) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.f37631j;
                if (subtitleDecoderException != null) {
                    throw subtitleDecoderException;
                }
                C10129a.m18992d(this.f37630i == null);
                int i11 = this.f37628g;
                if (i11 == 0) {
                    i10 = null;
                } else {
                    I[] iArr = this.f37626e;
                    int i12 = i11 - 1;
                    this.f37628g = i12;
                    i10 = iArr[i12];
                }
                this.f37630i = i10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    /* JADX INFO: renamed from: e */
    public abstract SubtitleDecoderException mo13275e(DecoderInputBuffer decoderInputBuffer, AbstractC6636f abstractC6636f, boolean z10);

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: f */
    public final boolean m13276f() throws InterruptedException {
        SubtitleDecoderException subtitleDecoderException;
        SubtitleDecoderException subtitleDecoderExceptionMo13275e;
        synchronized (this.f37623b) {
            while (!this.f37633l) {
                try {
                    if (!this.f37624c.isEmpty() && this.f37629h > 0) {
                        break;
                    }
                    this.f37623b.wait();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f37633l) {
                return false;
            }
            I iRemoveFirst = this.f37624c.removeFirst();
            O[] oArr = this.f37627f;
            int i10 = this.f37629h - 1;
            this.f37629h = i10;
            O o10 = oArr[i10];
            boolean z10 = this.f37632k;
            this.f37632k = false;
            if (iRemoveFirst.m13269m(4)) {
                o10.m13268l(4);
            } else {
                if (iRemoveFirst.m13270o()) {
                    o10.m13268l(Integer.MIN_VALUE);
                }
                if (iRemoveFirst.m13269m(134217728)) {
                    o10.m13268l(134217728);
                }
                try {
                    subtitleDecoderExceptionMo13275e = mo13275e(iRemoveFirst, o10, z10);
                } catch (OutOfMemoryError e10) {
                    subtitleDecoderException = new SubtitleDecoderException("Unexpected decode error", e10);
                    subtitleDecoderExceptionMo13275e = subtitleDecoderException;
                } catch (RuntimeException e11) {
                    subtitleDecoderException = new SubtitleDecoderException("Unexpected decode error", e11);
                    subtitleDecoderExceptionMo13275e = subtitleDecoderException;
                }
                if (subtitleDecoderExceptionMo13275e != null) {
                    synchronized (this.f37623b) {
                        this.f37631j = subtitleDecoderExceptionMo13275e;
                    }
                    return false;
                }
            }
            synchronized (this.f37623b) {
                if (this.f37632k || o10.m13270o()) {
                    o10.mo13274p();
                } else {
                    this.f37625d.addLast(o10);
                }
                iRemoveFirst.mo6927p();
                int i11 = this.f37628g;
                this.f37628g = i11 + 1;
                this.f37626e[i11] = iRemoveFirst;
            }
            return true;
        }
    }

    @Override // p218k9.InterfaceC6634d
    public final void flush() {
        synchronized (this.f37623b) {
            this.f37632k = true;
            I i10 = this.f37630i;
            if (i10 != null) {
                i10.mo6927p();
                int i11 = this.f37628g;
                this.f37628g = i11 + 1;
                this.f37626e[i11] = i10;
                this.f37630i = null;
            }
            while (!this.f37624c.isEmpty()) {
                I iRemoveFirst = this.f37624c.removeFirst();
                iRemoveFirst.mo6927p();
                int i12 = this.f37628g;
                this.f37628g = i12 + 1;
                this.f37626e[i12] = iRemoveFirst;
            }
            while (!this.f37625d.isEmpty()) {
                this.f37625d.removeFirst().mo13274p();
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p218k9.InterfaceC6634d
    public final void release() {
        synchronized (this.f37623b) {
            this.f37633l = true;
            this.f37623b.notify();
        }
        try {
            this.f37622a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
