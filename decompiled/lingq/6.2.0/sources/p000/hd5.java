package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class hd5 implements Iterator, tg4 {

    /* JADX INFO: renamed from: a */
    public final String f42217a;

    /* JADX INFO: renamed from: b */
    public int f42218b;

    /* JADX INFO: renamed from: c */
    public int f42219c;

    /* JADX INFO: renamed from: d */
    public int f42220d;

    /* JADX INFO: renamed from: e */
    public int f42221e;

    public hd5(String str) {
        this.f42217a = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.f42218b;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.f42221e < 0) {
            this.f42218b = 2;
            return false;
        }
        String str = this.f42217a;
        int length = str.length();
        int length2 = str.length();
        for (int i4 = this.f42219c; i4 < length2; i4++) {
            char cCharAt = str.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < str.length() && str.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.f42218b = 1;
                this.f42221e = i;
                this.f42220d = length;
                return true;
            }
        }
        i = -1;
        this.f42218b = 1;
        this.f42221e = i;
        this.f42220d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            uk9.m22784s();
            return null;
        }
        this.f42218b = 0;
        int i = this.f42220d;
        int i2 = this.f42219c;
        this.f42219c = this.f42221e + i;
        return this.f42217a.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
