package jm;

import dm.C5207g;

/* JADX INFO: renamed from: jm.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C6520c extends C6518a implements InterfaceC6523f<Character> {
    static {
        new C6520c((char) 1, (char) 0);
    }

    public C6520c(char c10, char c11) {
        super(c10, c11);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    public final boolean equals(Object obj) {
        C6520c c6520c;
        boolean z10 = false;
        if (obj instanceof C6520c) {
            char c10 = this.f37154a;
            char c11 = this.f37155b;
            if (C5207g.m11113h(c10, c11) > 0) {
                C6520c c6520c2 = (C6520c) obj;
                if (C5207g.m11113h(c6520c2.f37154a, c6520c2.f37155b) > 0) {
                    z10 = true;
                } else {
                    c6520c = (C6520c) obj;
                    if (c10 == c6520c.f37154a && c11 == c6520c.f37155b) {
                        z10 = true;
                    }
                }
            } else {
                c6520c = (C6520c) obj;
                if (c10 == c6520c.f37154a) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public final int hashCode() {
        char c10 = this.f37154a;
        char c11 = this.f37155b;
        if (C5207g.m11113h(c10, c11) > 0) {
            return -1;
        }
        return (c10 * 31) + c11;
    }

    public final String toString() {
        return this.f37154a + ".." + this.f37155b;
    }
}
