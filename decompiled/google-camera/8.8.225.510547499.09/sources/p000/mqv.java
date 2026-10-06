package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
abstract class mqv implements Iterator {

    /* JADX INFO: renamed from: b */
    final CharSequence f41452b;

    /* JADX INFO: renamed from: c */
    final boolean f41453c;

    /* JADX INFO: renamed from: f */
    private Object f41456f;

    /* JADX INFO: renamed from: a */
    public int f41451a = 2;

    /* JADX INFO: renamed from: d */
    int f41454d = 0;

    /* JADX INFO: renamed from: e */
    int f41455e = Integer.MAX_VALUE;

    protected mqv(msa msaVar, CharSequence charSequence) {
        this.f41453c = msaVar.f41501a;
        this.f41452b = charSequence;
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo16814a(int i);

    /* JADX INFO: renamed from: b */
    public abstract int mo16815b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int iMo16814a;
        lku.m15613H(this.f41451a != 4);
        int i = this.f41451a;
        int i2 = i - 1;
        String string = null;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 0:
                return true;
            case 1:
            default:
                this.f41451a = 4;
                int i3 = this.f41454d;
                while (true) {
                    int i4 = this.f41454d;
                    if (i4 != -1) {
                        int iMo16815b = mo16815b(i4);
                        if (iMo16815b == -1) {
                            iMo16815b = this.f41452b.length();
                            this.f41454d = -1;
                            iMo16814a = -1;
                        } else {
                            iMo16814a = mo16814a(iMo16815b);
                            this.f41454d = iMo16814a;
                        }
                        if (iMo16814a == i3) {
                            int i5 = iMo16814a + 1;
                            this.f41454d = i5;
                            if (i5 > this.f41452b.length()) {
                                this.f41454d = -1;
                            }
                        } else {
                            if (i3 < iMo16815b) {
                                this.f41452b.charAt(i3);
                            }
                            if (i3 < iMo16815b) {
                                this.f41452b.charAt(iMo16815b - 1);
                            }
                            if (this.f41453c && i3 == iMo16815b) {
                                i3 = this.f41454d;
                            } else {
                                int i6 = this.f41455e;
                                if (i6 == 1) {
                                    iMo16815b = this.f41452b.length();
                                    this.f41454d = -1;
                                    if (iMo16815b > i3) {
                                        this.f41452b.charAt(iMo16815b - 1);
                                    }
                                } else {
                                    this.f41455e = i6 - 1;
                                }
                                string = this.f41452b.subSequence(i3, iMo16815b).toString();
                            }
                        }
                    } else {
                        this.f41451a = 3;
                    }
                }
                this.f41456f = string;
                if (this.f41451a == 3) {
                    return false;
                }
                this.f41451a = 1;
                return true;
            case 2:
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f41451a = 2;
        Object obj = this.f41456f;
        this.f41456f = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
