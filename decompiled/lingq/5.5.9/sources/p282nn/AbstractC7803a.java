package p282nn;

import com.kochava.tracker.BuildConfig;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: renamed from: nn.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7803a implements Iterable<Byte> {

    /* JADX INFO: renamed from: a */
    public static final C7807e f42882a = new C7807e(new byte[0]);

    /* JADX INFO: renamed from: nn.a$a */
    public interface a extends Iterator<Byte> {
    }

    /* JADX INFO: renamed from: nn.a$b */
    public static final class b extends OutputStream {

        /* JADX INFO: renamed from: f */
        public static final byte[] f42883f = new byte[0];

        /* JADX INFO: renamed from: c */
        public int f42886c;

        /* JADX INFO: renamed from: e */
        public int f42888e;

        /* JADX INFO: renamed from: a */
        public final int f42884a = BuildConfig.SDK_TRUNCATE_LENGTH;

        /* JADX INFO: renamed from: b */
        public final ArrayList<AbstractC7803a> f42885b = new ArrayList<>();

        /* JADX INFO: renamed from: d */
        public byte[] f42887d = new byte[BuildConfig.SDK_TRUNCATE_LENGTH];

        /* JADX INFO: renamed from: a */
        public final void m15531a(int i10) {
            this.f42885b.add(new C7807e(this.f42887d));
            int length = this.f42886c + this.f42887d.length;
            this.f42886c = length;
            this.f42887d = new byte[Math.max(this.f42884a, Math.max(i10, length >>> 1))];
            this.f42888e = 0;
        }

        /* JADX INFO: renamed from: b */
        public final void m15532b() {
            int i10 = this.f42888e;
            byte[] bArr = this.f42887d;
            int length = bArr.length;
            ArrayList<AbstractC7803a> arrayList = this.f42885b;
            if (i10 < length) {
                if (i10 > 0) {
                    byte[] bArr2 = new byte[i10];
                    System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i10));
                    arrayList.add(new C7807e(bArr2));
                }
                this.f42886c += this.f42888e;
                this.f42888e = 0;
            }
            arrayList.add(new C7807e(this.f42887d));
            this.f42887d = f42883f;
            this.f42886c += this.f42888e;
            this.f42888e = 0;
        }

        /* JADX INFO: renamed from: l */
        public final synchronized AbstractC7803a m15533l() {
            ArrayList<AbstractC7803a> arrayList;
            m15532b();
            arrayList = this.f42885b;
            if (!(arrayList instanceof Collection)) {
                ArrayList<AbstractC7803a> arrayList2 = new ArrayList<>();
                Iterator<AbstractC7803a> it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(it.next());
                }
                arrayList = arrayList2;
            }
            return arrayList.isEmpty() ? AbstractC7803a.f42882a : AbstractC7803a.m15517a(arrayList.iterator(), arrayList.size());
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public final String toString() {
            int i10;
            Object[] objArr = new Object[2];
            objArr[0] = Integer.toHexString(System.identityHashCode(this));
            synchronized (this) {
                try {
                    i10 = this.f42886c + this.f42888e;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            objArr[1] = Integer.valueOf(i10);
            return String.format("<ByteString.Output@%s size=%d>", objArr);
        }

        @Override // java.io.OutputStream
        public final synchronized void write(int i10) {
            if (this.f42888e == this.f42887d.length) {
                m15531a(1);
            }
            byte[] bArr = this.f42887d;
            int i11 = this.f42888e;
            this.f42888e = i11 + 1;
            bArr[i11] = (byte) i10;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.io.OutputStream
        public final synchronized void write(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = this.f42887d;
            int length = bArr2.length;
            int i12 = this.f42888e;
            if (i11 <= length - i12) {
                System.arraycopy(bArr, i10, bArr2, i12, i11);
                this.f42888e += i11;
            } else {
                int length2 = bArr2.length - i12;
                System.arraycopy(bArr, i10, bArr2, i12, length2);
                int i13 = i11 - length2;
                m15531a(i13);
                System.arraycopy(bArr, i10 + length2, this.f42887d, 0, i13);
                this.f42888e = i13;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC7803a m15517a(Iterator<AbstractC7803a> it, int i10) {
        if (i10 == 1) {
            return it.next();
        }
        int i11 = i10 >>> 1;
        return m15517a(it, i11).m15519f(m15517a(it, i10 - i11));
    }

    /* JADX INFO: renamed from: q */
    public static b m15518q() {
        return new b();
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC7803a m15519f(AbstractC7803a abstractC7803a) {
        AbstractC7803a abstractC7803aPop;
        int size = size();
        int size2 = abstractC7803a.size();
        if (((long) size) + ((long) size2) >= 2147483647L) {
            StringBuilder sb2 = new StringBuilder(53);
            sb2.append("ByteString would be too long: ");
            sb2.append(size);
            sb2.append("+");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        }
        int[] iArr = C7810h.f42898h;
        C7810h c7810h = this instanceof C7810h ? (C7810h) this : null;
        if (abstractC7803a.size() == 0) {
            return this;
        }
        if (size() == 0) {
            return abstractC7803a;
        }
        int size3 = abstractC7803a.size() + size();
        if (size3 < 128) {
            int size4 = size();
            int size5 = abstractC7803a.size();
            byte[] bArr = new byte[size4 + size5];
            m15520g(0, 0, size4, bArr);
            abstractC7803a.m15520g(0, size4, size5, bArr);
            return new C7807e(bArr);
        }
        if (c7810h != null) {
            AbstractC7803a abstractC7803a2 = c7810h.f42901d;
            if (abstractC7803a.size() + abstractC7803a2.size() < 128) {
                int size6 = abstractC7803a2.size();
                int size7 = abstractC7803a.size();
                byte[] bArr2 = new byte[size6 + size7];
                abstractC7803a2.m15520g(0, 0, size6, bArr2);
                abstractC7803a.m15520g(0, size6, size7, bArr2);
                return new C7810h(c7810h.f42900c, new C7807e(bArr2));
            }
        }
        if (c7810h != null) {
            AbstractC7803a abstractC7803a3 = c7810h.f42900c;
            int iMo15522l = abstractC7803a3.mo15522l();
            AbstractC7803a abstractC7803a4 = c7810h.f42901d;
            if (iMo15522l > abstractC7803a4.mo15522l()) {
                if (c7810h.f42903f > abstractC7803a.mo15522l()) {
                    return new C7810h(abstractC7803a3, new C7810h(abstractC7803a4, abstractC7803a));
                }
            }
        }
        if (size3 >= C7810h.f42898h[Math.max(mo15522l(), abstractC7803a.mo15522l()) + 1]) {
            abstractC7803aPop = new C7810h(this, abstractC7803a);
        } else {
            C7810h.a aVar = new C7810h.a();
            aVar.m15541a(this);
            aVar.m15541a(abstractC7803a);
            Stack<AbstractC7803a> stack = aVar.f42905a;
            abstractC7803aPop = stack.pop();
            while (!stack.isEmpty()) {
                abstractC7803aPop = new C7810h(stack.pop(), abstractC7803aPop);
            }
        }
        return abstractC7803aPop;
    }

    /* JADX WARN: Unreachable blocks removed: 4, instructions: 4 */
    /* JADX INFO: renamed from: g */
    public final void m15520g(int i10, int i11, int i12, byte[] bArr) {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i10);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i11 < 0) {
            StringBuilder sb3 = new StringBuilder(30);
            sb3.append("Target offset < 0: ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        if (i12 < 0) {
            StringBuilder sb4 = new StringBuilder(23);
            sb4.append("Length < 0: ");
            sb4.append(i12);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        int i13 = i10 + i12;
        if (i13 > size()) {
            StringBuilder sb5 = new StringBuilder(34);
            sb5.append("Source end offset < 0: ");
            sb5.append(i13);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
        int i14 = i11 + i12;
        if (i14 <= bArr.length) {
            if (i12 > 0) {
                mo15521i(i10, i11, i12, bArr);
            }
        } else {
            StringBuilder sb6 = new StringBuilder(34);
            sb6.append("Target end offset < 0: ");
            sb6.append(i14);
            throw new IndexOutOfBoundsException(sb6.toString());
        }
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo15521i(int i10, int i11, int i12, byte[] bArr);

    /* JADX INFO: renamed from: l */
    public abstract int mo15522l();

    /* JADX INFO: renamed from: m */
    public abstract boolean mo15523m();

    /* JADX INFO: renamed from: o */
    public abstract boolean mo15524o();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public abstract a iterator();

    /* JADX INFO: renamed from: s */
    public abstract int mo15526s(int i10, int i11, int i12);

    public abstract int size();

    /* JADX INFO: renamed from: t */
    public abstract int mo15527t(int i10, int i11, int i12);

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    /* JADX INFO: renamed from: u */
    public abstract int mo15528u();

    /* JADX INFO: renamed from: v */
    public abstract String mo15529v() throws UnsupportedEncodingException;

    /* JADX INFO: renamed from: y */
    public abstract void mo15530y(OutputStream outputStream, int i10, int i11) throws IOException;
}
