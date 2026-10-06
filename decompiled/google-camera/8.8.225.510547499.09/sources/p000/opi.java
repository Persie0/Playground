package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class opi implements Iterator {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ opj f46378a;

    /* JADX INFO: renamed from: b */
    private int f46379b = -1;

    /* JADX INFO: renamed from: c */
    private int f46380c;

    /* JADX INFO: renamed from: d */
    private int f46381d;

    /* JADX INFO: renamed from: e */
    private oot f46382e;

    /* JADX INFO: renamed from: f */
    private int f46383f;

    public opi(opj opjVar) {
        this.f46378a = opjVar;
        int iM18791e = ook.m18791e(0, 0, opjVar.f46384a.length());
        this.f46380c = iM18791e;
        this.f46381d = iM18791e;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    /* JADX WARN: Code duplicated, block: B:15:0x0048  */
    /* JADX WARN: Code duplicated, block: B:16:0x005c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0074  */
    /* JADX WARN: Code duplicated, block: B:19:0x0077  */
    /* JADX WARN: Code duplicated, block: B:22:0x0086  */
    /* JADX INFO: renamed from: a */
    private final void m18841a() {
        Object objMo560a;
        int iIntValue;
        int i;
        oot ootVar;
        int i2 = this.f46381d;
        if (i2 < 0) {
            this.f46379b = 0;
            this.f46382e = null;
            return;
        }
        opj opjVar = this.f46378a;
        int i3 = opjVar.f46385b;
        if (i3 > 0) {
            int i4 = this.f46383f + 1;
            this.f46383f = i4;
            if (i4 >= i3) {
                this.f46382e = new oot(this.f46380c, ook.m18801o(this.f46378a.f46384a));
                this.f46381d = -1;
            } else if (i2 > opjVar.f46384a.length()) {
                this.f46382e = new oot(this.f46380c, ook.m18801o(this.f46378a.f46384a));
                this.f46381d = -1;
            } else {
                opj opjVar2 = this.f46378a;
                objMo560a = opjVar2.f46386c.mo560a(opjVar2.f46384a, Integer.valueOf(this.f46381d));
                if (objMo560a == null) {
                    this.f46382e = new oot(this.f46380c, ook.m18801o(this.f46378a.f46384a));
                    this.f46381d = -1;
                } else {
                    okb okbVar = (okb) objMo560a;
                    iIntValue = ((Number) okbVar.f46186a).intValue();
                    int iIntValue2 = ((Number) okbVar.f46187b).intValue();
                    i = this.f46380c;
                    if (iIntValue <= Integer.MIN_VALUE) {
                        ootVar = oot.f46360d;
                    } else {
                        ootVar = new oot(i, iIntValue - 1);
                    }
                    this.f46382e = ootVar;
                    int i5 = iIntValue + iIntValue2;
                    this.f46380c = i5;
                    this.f46381d = i5 + (iIntValue2 == 0 ? 1 : 0);
                }
            }
        } else if (i2 > opjVar.f46384a.length()) {
            this.f46382e = new oot(this.f46380c, ook.m18801o(this.f46378a.f46384a));
            this.f46381d = -1;
        } else {
            opj opjVar3 = this.f46378a;
            objMo560a = opjVar3.f46386c.mo560a(opjVar3.f46384a, Integer.valueOf(this.f46381d));
            if (objMo560a == null) {
                this.f46382e = new oot(this.f46380c, ook.m18801o(this.f46378a.f46384a));
                this.f46381d = -1;
            } else {
                okb okbVar2 = (okb) objMo560a;
                iIntValue = ((Number) okbVar2.f46186a).intValue();
                int iIntValue3 = ((Number) okbVar2.f46187b).intValue();
                i = this.f46380c;
                if (iIntValue <= Integer.MIN_VALUE) {
                    ootVar = oot.f46360d;
                } else {
                    ootVar = new oot(i, iIntValue - 1);
                }
                this.f46382e = ootVar;
                int i6 = iIntValue + iIntValue3;
                this.f46380c = i6;
                this.f46381d = i6 + (iIntValue3 == 0 ? 1 : 0);
            }
        }
        this.f46379b = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f46379b == -1) {
            m18841a();
        }
        return this.f46379b == 1;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f46379b == -1) {
            m18841a();
        }
        if (this.f46379b == 0) {
            throw new NoSuchElementException();
        }
        oot ootVar = this.f46382e;
        ootVar.getClass();
        this.f46382e = null;
        this.f46379b = -1;
        return ootVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
