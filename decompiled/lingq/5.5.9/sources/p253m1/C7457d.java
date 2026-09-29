package p253m1;

import dm.C5207g;
import java.text.CharacterIterator;

/* JADX INFO: renamed from: m1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C7457d implements CharacterIterator {

    /* JADX INFO: renamed from: a */
    public final CharSequence f41274a;

    /* JADX INFO: renamed from: c */
    public final int f41276c;

    /* JADX INFO: renamed from: b */
    public final int f41275b = 0;

    /* JADX INFO: renamed from: d */
    public int f41277d = 0;

    public C7457d(CharSequence charSequence, int i10) {
        this.f41274a = charSequence;
        this.f41276c = i10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            Object objClone = super.clone();
            C5207g.m11110e(objClone, "{\n            @Suppress(…  super.clone()\n        }");
            return objClone;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i10 = this.f41277d;
        if (i10 == this.f41276c) {
            return (char) 65535;
        }
        return this.f41274a.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f41277d = this.f41275b;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return this.f41275b;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f41276c;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f41277d;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i10 = this.f41275b;
        int i11 = this.f41276c;
        if (i10 == i11) {
            this.f41277d = i11;
            return (char) 65535;
        }
        int i12 = i11 - 1;
        this.f41277d = i12;
        return this.f41274a.charAt(i12);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i10 = this.f41277d + 1;
        this.f41277d = i10;
        int i11 = this.f41276c;
        if (i10 < i11) {
            return this.f41274a.charAt(i10);
        }
        this.f41277d = i11;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i10 = this.f41277d;
        if (i10 <= this.f41275b) {
            return (char) 65535;
        }
        int i11 = i10 - 1;
        this.f41277d = i11;
        return this.f41274a.charAt(i11);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.text.CharacterIterator
    public final char setIndex(int i10) {
        boolean z10 = false;
        if (i10 <= this.f41276c && this.f41275b <= i10) {
            z10 = true;
        }
        if (!z10) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f41277d = i10;
        return current();
    }
}
