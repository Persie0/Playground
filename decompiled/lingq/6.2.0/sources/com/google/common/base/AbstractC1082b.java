package com.google.common.base;

import java.util.Iterator;
import p000.bna;
import p000.kg0;
import p000.ru0;
import p000.uk9;

/* JADX INFO: renamed from: com.google.common.base.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1082b implements Iterator {

    /* JADX INFO: renamed from: b */
    public String f13375b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f13376c;

    /* JADX INFO: renamed from: d */
    public final ru0 f13377d;

    /* JADX INFO: renamed from: e */
    public final boolean f13378e;

    /* JADX INFO: renamed from: g */
    public int f13380g;

    /* JADX INFO: renamed from: a */
    public AbstractIterator$State f13374a = AbstractIterator$State.NOT_READY;

    /* JADX INFO: renamed from: f */
    public int f13379f = 0;

    public AbstractC1082b(kg0 kg0Var, CharSequence charSequence) {
        this.f13377d = (ru0) kg0Var.f47157d;
        this.f13378e = kg0Var.f47156c;
        this.f13380g = kg0Var.f47155b;
        this.f13376c = charSequence;
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo6267a(int i);

    /* JADX INFO: renamed from: b */
    public abstract int mo6268b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        ru0 ru0Var;
        AbstractIterator$State abstractIterator$State = this.f13374a;
        AbstractIterator$State abstractIterator$State2 = AbstractIterator$State.FAILED;
        bna.m3987z(abstractIterator$State != abstractIterator$State2);
        int iOrdinal = this.f13374a.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            this.f13374a = abstractIterator$State2;
            int i = this.f13379f;
            while (true) {
                int i2 = this.f13379f;
                if (i2 == -1) {
                    this.f13374a = AbstractIterator$State.DONE;
                    string = null;
                    break;
                }
                int iMo6268b = mo6268b(i2);
                CharSequence charSequence = this.f13376c;
                if (iMo6268b == -1) {
                    iMo6268b = charSequence.length();
                    this.f13379f = -1;
                } else {
                    this.f13379f = mo6267a(iMo6268b);
                }
                int i3 = this.f13379f;
                if (i3 == i) {
                    int i4 = i3 + 1;
                    this.f13379f = i4;
                    if (i4 > charSequence.length()) {
                        this.f13379f = -1;
                    }
                } else {
                    while (true) {
                        ru0Var = this.f13377d;
                        if (i >= iMo6268b || !ru0Var.mo20819a(charSequence.charAt(i))) {
                            break;
                        }
                        i++;
                    }
                    while (iMo6268b > i && ru0Var.mo20819a(charSequence.charAt(iMo6268b - 1))) {
                        iMo6268b--;
                    }
                    if (!this.f13378e || i != iMo6268b) {
                        int i5 = this.f13380g;
                        if (i5 == 1) {
                            iMo6268b = charSequence.length();
                            this.f13379f = -1;
                            while (iMo6268b > i && ru0Var.mo20819a(charSequence.charAt(iMo6268b - 1))) {
                                iMo6268b--;
                            }
                        } else {
                            this.f13380g = i5 - 1;
                        }
                        string = charSequence.subSequence(i, iMo6268b).toString();
                        break;
                    }
                    i = this.f13379f;
                }
            }
            this.f13375b = string;
            if (this.f13374a != AbstractIterator$State.DONE) {
                this.f13374a = AbstractIterator$State.READY;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            uk9.m22784s();
            return null;
        }
        this.f13374a = AbstractIterator$State.NOT_READY;
        String str = this.f13375b;
        this.f13375b = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
