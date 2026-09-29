package jm;

import java.util.NoSuchElementException;
import tl.AbstractC9334v;

/* JADX INFO: renamed from: jm.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C6525h extends AbstractC9334v {

    /* JADX INFO: renamed from: a */
    public final int f37166a;

    /* JADX INFO: renamed from: b */
    public final int f37167b;

    /* JADX INFO: renamed from: c */
    public boolean f37168c;

    /* JADX INFO: renamed from: d */
    public int f37169d;

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public C6525h(int i10, int i11, int i12) {
        this.f37166a = i12;
        this.f37167b = i11;
        boolean z10 = true;
        if (i12 > 0) {
            if (i10 > i11) {
                z10 = false;
            }
        } else if (i10 < i11) {
            z10 = false;
        }
        this.f37168c = z10;
        this.f37169d = z10 ? i10 : i11;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // tl.AbstractC9334v
    /* JADX INFO: renamed from: a */
    public final int mo13105a() {
        int i10 = this.f37169d;
        if (i10 != this.f37167b) {
            this.f37169d = this.f37166a + i10;
        } else {
            if (!this.f37168c) {
                throw new NoSuchElementException();
            }
            this.f37168c = false;
        }
        return i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f37168c;
    }
}
