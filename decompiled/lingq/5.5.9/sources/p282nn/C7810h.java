package p282nn;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import kotlin.reflect.jvm.internal.impl.protobuf.C6995f;
import p003a2.C0009a;
import p282nn.C7807e.a;

/* JADX INFO: renamed from: nn.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C7810h extends AbstractC7803a {

    /* JADX INFO: renamed from: h */
    public static final int[] f42898h;

    /* JADX INFO: renamed from: b */
    public final int f42899b;

    /* JADX INFO: renamed from: c */
    public final AbstractC7803a f42900c;

    /* JADX INFO: renamed from: d */
    public final AbstractC7803a f42901d;

    /* JADX INFO: renamed from: e */
    public final int f42902e;

    /* JADX INFO: renamed from: f */
    public final int f42903f;

    /* JADX INFO: renamed from: g */
    public int f42904g;

    /* JADX INFO: renamed from: nn.h$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final Stack<AbstractC7803a> f42905a = new Stack<>();

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public final void m15541a(AbstractC7803a abstractC7803a) {
            if (!abstractC7803a.mo15523m()) {
                if (!(abstractC7803a instanceof C7810h)) {
                    String strValueOf = String.valueOf(abstractC7803a.getClass());
                    throw new IllegalArgumentException(C0009a.m23l(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
                }
                C7810h c7810h = (C7810h) abstractC7803a;
                m15541a(c7810h.f42900c);
                m15541a(c7810h.f42901d);
                return;
            }
            int size = abstractC7803a.size();
            int[] iArr = C7810h.f42898h;
            int iBinarySearch = Arrays.binarySearch(iArr, size);
            if (iBinarySearch < 0) {
                iBinarySearch = (-(iBinarySearch + 1)) - 1;
            }
            int i10 = iArr[iBinarySearch + 1];
            Stack<AbstractC7803a> stack = this.f42905a;
            if (!stack.isEmpty() && stack.peek().size() < i10) {
                int i11 = iArr[iBinarySearch];
                AbstractC7803a abstractC7803aPop = stack.pop();
                while (!stack.isEmpty() && stack.peek().size() < i11) {
                    abstractC7803aPop = new C7810h(stack.pop(), abstractC7803aPop);
                }
                C7810h c7810h2 = new C7810h(abstractC7803aPop, abstractC7803a);
                while (!stack.isEmpty()) {
                    int[] iArr2 = C7810h.f42898h;
                    int iBinarySearch2 = Arrays.binarySearch(iArr2, c7810h2.f42899b);
                    if (iBinarySearch2 < 0) {
                        iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
                    }
                    if (stack.peek().size() >= iArr2[iBinarySearch2 + 1]) {
                        break;
                    } else {
                        c7810h2 = new C7810h(stack.pop(), c7810h2);
                    }
                }
                stack.push(c7810h2);
                return;
            }
            stack.push(abstractC7803a);
        }
    }

    /* JADX INFO: renamed from: nn.h$b */
    public static class b implements Iterator<C7807e> {

        /* JADX INFO: renamed from: a */
        public final Stack<C7810h> f42906a = new Stack<>();

        /* JADX INFO: renamed from: b */
        public C7807e f42907b;

        public b(AbstractC7803a abstractC7803a) {
            while (abstractC7803a instanceof C7810h) {
                C7810h c7810h = (C7810h) abstractC7803a;
                this.f42906a.push(c7810h);
                abstractC7803a = c7810h.f42900c;
            }
            this.f42907b = (C7807e) abstractC7803a;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C7807e next() {
            C7807e c7807e;
            C7807e c7807e2 = this.f42907b;
            if (c7807e2 == null) {
                throw new NoSuchElementException();
            }
            do {
                Stack<C7810h> stack = this.f42906a;
                if (stack.isEmpty()) {
                    c7807e = null;
                    break;
                }
                AbstractC7803a abstractC7803a = stack.pop().f42901d;
                while (abstractC7803a instanceof C7810h) {
                    C7810h c7810h = (C7810h) abstractC7803a;
                    stack.push(c7810h);
                    abstractC7803a = c7810h.f42900c;
                }
                c7807e = (C7807e) abstractC7803a;
            } while (c7807e.f42893b.length == 0);
            this.f42907b = c7807e;
            return c7807e2;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f42907b != null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: nn.h$c */
    public class c implements AbstractC7803a.a {

        /* JADX INFO: renamed from: a */
        public final b f42908a;

        /* JADX INFO: renamed from: b */
        public C7807e.a f42909b;

        /* JADX INFO: renamed from: c */
        public int f42910c;

        public c(C7810h c7810h) {
            b bVar = new b(c7810h);
            this.f42908a = bVar;
            this.f42909b = bVar.next().new a();
            this.f42910c = c7810h.f42899b;
        }

        /* JADX INFO: renamed from: a */
        public final byte m15543a() {
            if (!this.f42909b.hasNext()) {
                this.f42909b = this.f42908a.next().new a();
            }
            this.f42910c--;
            return this.f42909b.m15540a();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f42910c > 0;
        }

        @Override // java.util.Iterator
        public final Byte next() {
            return Byte.valueOf(m15543a());
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        int i11 = 1;
        while (i10 > 0) {
            arrayList.add(Integer.valueOf(i10));
            int i12 = i11 + i10;
            i11 = i10;
            i10 = i12;
        }
        arrayList.add(Integer.MAX_VALUE);
        f42898h = new int[arrayList.size()];
        int i13 = 0;
        while (true) {
            int[] iArr = f42898h;
            if (i13 >= iArr.length) {
                return;
            }
            iArr[i13] = ((Integer) arrayList.get(i13)).intValue();
            i13++;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public /* synthetic */ C7810h() {
        throw null;
    }

    public C7810h(AbstractC7803a abstractC7803a, AbstractC7803a abstractC7803a2) {
        this.f42904g = 0;
        this.f42900c = abstractC7803a;
        this.f42901d = abstractC7803a2;
        int size = abstractC7803a.size();
        this.f42902e = size;
        this.f42899b = abstractC7803a2.size() + size;
        this.f42903f = Math.max(abstractC7803a.mo15522l(), abstractC7803a2.mo15522l()) + 1;
    }

    public final boolean equals(Object obj) {
        int iMo15528u;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7803a)) {
            return false;
        }
        AbstractC7803a abstractC7803a = (AbstractC7803a) obj;
        int size = abstractC7803a.size();
        int i10 = this.f42899b;
        if (i10 != size) {
            return false;
        }
        if (i10 == 0) {
            return true;
        }
        if (this.f42904g != 0 && (iMo15528u = abstractC7803a.mo15528u()) != 0 && this.f42904g != iMo15528u) {
            return false;
        }
        b bVar = new b(this);
        C7807e next = bVar.next();
        b bVar2 = new b(abstractC7803a);
        C7807e next2 = bVar2.next();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int length = next.f42893b.length - i11;
            int length2 = next2.f42893b.length - i12;
            int iMin = Math.min(length, length2);
            if (!(i11 == 0 ? next.m15538B(next2, i12, iMin) : next2.m15538B(next, i11, iMin))) {
                return false;
            }
            i13 += iMin;
            if (i13 >= i10) {
                if (i13 == i10) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == length) {
                next = bVar.next();
                i11 = 0;
            } else {
                i11 += iMin;
            }
            if (iMin == length2) {
                next2 = bVar2.next();
                i12 = 0;
            } else {
                i12 += iMin;
            }
        }
    }

    public final int hashCode() {
        int iMo15526s = this.f42904g;
        if (iMo15526s == 0) {
            int i10 = this.f42899b;
            iMo15526s = mo15526s(i10, 0, i10);
            if (iMo15526s == 0) {
                iMo15526s = 1;
            }
            this.f42904g = iMo15526s;
        }
        return iMo15526s;
    }

    @Override // p282nn.AbstractC7803a
    /* JADX INFO: renamed from: i */
    public final void mo15521i(int i10, int i11, int i12, byte[] bArr) {
        int i13 = i10 + i12;
        AbstractC7803a abstractC7803a = this.f42900c;
        int i14 = this.f42902e;
        if (i13 <= i14) {
            abstractC7803a.mo15521i(i10, i11, i12, bArr);
            return;
        }
        AbstractC7803a abstractC7803a2 = this.f42901d;
        if (i10 >= i14) {
            abstractC7803a2.mo15521i(i10 - i14, i11, i12, bArr);
            return;
        }
        int i15 = i14 - i10;
        abstractC7803a.mo15521i(i10, i11, i15, bArr);
        abstractC7803a2.mo15521i(0, i11 + i15, i12 - i15, bArr);
    }

    @Override // p282nn.AbstractC7803a
    /* JADX INFO: renamed from: l */
    public final int mo15522l() {
        return this.f42903f;
    }

    @Override // p282nn.AbstractC7803a
    /* JADX INFO: renamed from: m */
    public final boolean mo15523m() {
        return this.f42899b >= f42898h[this.f42903f];
    }

    @Override // p282nn.AbstractC7803a
    /* JADX INFO: renamed from: o */
    public final boolean mo15524o() {
        boolean z10 = false;
        int iMo15527t = this.f42900c.mo15527t(0, 0, this.f42902e);
        AbstractC7803a abstractC7803a = this.f42901d;
        if (abstractC7803a.mo15527t(iMo15527t, 0, abstractC7803a.size()) == 0) {
            z10 = true;
        }
        return z10;
    }

    @Override // p282nn.AbstractC7803a, java.lang.Iterable
    /* JADX INFO: renamed from: p */
    public final AbstractC7803a.a iterator() {
        return new c(this);
    }

    @Override // p282nn.AbstractC7803a
    /* JADX INFO: renamed from: s */
    public final int mo15526s(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        AbstractC7803a abstractC7803a = this.f42900c;
        int i14 = this.f42902e;
        if (i13 <= i14) {
            return abstractC7803a.mo15526s(i10, i11, i12);
        }
        AbstractC7803a abstractC7803a2 = this.f42901d;
        if (i11 >= i14) {
            return abstractC7803a2.mo15526s(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return abstractC7803a2.mo15526s(abstractC7803a.mo15526s(i10, i11, i15), 0, i12 - i15);
    }

    @Override // p282nn.AbstractC7803a
    public final int size() {
        return this.f42899b;
    }

    @Override // p282nn.AbstractC7803a
    /* JADX INFO: renamed from: t */
    public final int mo15527t(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        AbstractC7803a abstractC7803a = this.f42900c;
        int i14 = this.f42902e;
        if (i13 <= i14) {
            return abstractC7803a.mo15527t(i10, i11, i12);
        }
        AbstractC7803a abstractC7803a2 = this.f42901d;
        if (i11 >= i14) {
            return abstractC7803a2.mo15527t(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return abstractC7803a2.mo15527t(abstractC7803a.mo15527t(i10, i11, i15), 0, i12 - i15);
    }

    @Override // p282nn.AbstractC7803a
    /* JADX INFO: renamed from: u */
    public final int mo15528u() {
        return this.f42904g;
    }

    @Override // p282nn.AbstractC7803a
    /* JADX INFO: renamed from: v */
    public final String mo15529v() throws UnsupportedEncodingException {
        byte[] bArr;
        int i10 = this.f42899b;
        if (i10 == 0) {
            bArr = C6995f.f39527a;
        } else {
            byte[] bArr2 = new byte[i10];
            mo15521i(0, 0, i10, bArr2);
            bArr = bArr2;
        }
        return new String(bArr, "UTF-8");
    }

    @Override // p282nn.AbstractC7803a
    /* JADX INFO: renamed from: y */
    public final void mo15530y(OutputStream outputStream, int i10, int i11) throws IOException {
        int i12 = i10 + i11;
        AbstractC7803a abstractC7803a = this.f42900c;
        int i13 = this.f42902e;
        if (i12 <= i13) {
            abstractC7803a.mo15530y(outputStream, i10, i11);
            return;
        }
        AbstractC7803a abstractC7803a2 = this.f42901d;
        if (i10 >= i13) {
            abstractC7803a2.mo15530y(outputStream, i10 - i13, i11);
            return;
        }
        int i14 = i13 - i10;
        abstractC7803a.mo15530y(outputStream, i10, i14);
        abstractC7803a2.mo15530y(outputStream, 0, i11 - i14);
    }
}
