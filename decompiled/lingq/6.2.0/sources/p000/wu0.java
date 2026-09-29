package p000;

import java.text.CharacterIterator;

/* JADX INFO: loaded from: classes.dex */
public final class wu0 implements CharacterIterator {

    /* JADX INFO: renamed from: a */
    public final CharSequence f67290a;

    /* JADX INFO: renamed from: b */
    public final int f67291b;

    /* JADX INFO: renamed from: c */
    public int f67292c = 0;

    public wu0(CharSequence charSequence, int i) {
        this.f67290a = charSequence;
        this.f67291b = i;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.f67292c;
        if (i == this.f67291b) {
            return (char) 65535;
        }
        return this.f67290a.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f67292c = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f67291b;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f67292c;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.f67291b;
        if (i == 0) {
            this.f67292c = i;
            return (char) 65535;
        }
        int i2 = i - 1;
        this.f67292c = i2;
        return this.f67290a.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.f67292c + 1;
        this.f67292c = i;
        int i2 = this.f67291b;
        if (i < i2) {
            return this.f67290a.charAt(i);
        }
        this.f67292c = i2;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.f67292c;
        if (i <= 0) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.f67292c = i2;
        return this.f67290a.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i > this.f67291b || i < 0) {
            C3386nv.m17626m("invalid position");
            return (char) 0;
        }
        this.f67292c = i;
        return current();
    }
}
