package jm;

import dm.C5207g;
import java.util.NoSuchElementException;
import tl.AbstractC9324l;

/* JADX INFO: renamed from: jm.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C6519b extends AbstractC9324l {

    /* JADX INFO: renamed from: a */
    public final int f37157a;

    /* JADX INFO: renamed from: b */
    public final int f37158b;

    /* JADX INFO: renamed from: c */
    public boolean f37159c;

    /* JADX INFO: renamed from: d */
    public int f37160d;

    public C6519b(char c10, char c11, int i10) {
        this.f37157a = i10;
        this.f37158b = c11;
        boolean z10 = true;
        if (i10 <= 0 ? C5207g.m11113h(c10, c11) < 0 : C5207g.m11113h(c10, c11) > 0) {
            z10 = false;
        }
        this.f37159c = z10;
        if (!z10) {
            c10 = c11;
        }
        this.f37160d = c10;
    }

    @Override // tl.AbstractC9324l
    /* JADX INFO: renamed from: a */
    public final char mo13101a() {
        int i10 = this.f37160d;
        if (i10 != this.f37158b) {
            this.f37160d = this.f37157a + i10;
        } else {
            if (!this.f37159c) {
                throw new NoSuchElementException();
            }
            this.f37159c = false;
        }
        return (char) i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f37159c;
    }
}
