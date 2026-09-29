package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class n77 implements Iterator, tg4 {

    /* JADX INFO: renamed from: a */
    public final zba[] f52442a;

    /* JADX INFO: renamed from: b */
    public int f52443b;

    /* JADX INFO: renamed from: c */
    public boolean f52444c = true;

    public n77(yba ybaVar, zba[] zbaVarArr) {
        this.f52442a = zbaVarArr;
        zbaVarArr[0].m25541a(ybaVar.f69615d, Integer.bitCount(ybaVar.f69612a) * 2, 0);
        this.f52443b = 0;
        m17273a();
    }

    /* JADX INFO: renamed from: a */
    public final void m17273a() {
        int i = this.f52443b;
        zba[] zbaVarArr = this.f52442a;
        zba zbaVar = zbaVarArr[i];
        if (zbaVar.f71321c < zbaVar.f71320b) {
            return;
        }
        while (-1 < i) {
            int iM17274b = m17274b(i);
            if (iM17274b == -1) {
                zba zbaVar2 = zbaVarArr[i];
                int i2 = zbaVar2.f71321c;
                Object[] objArr = zbaVar2.f71319a;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    zbaVar2.f71321c = i2 + 1;
                    iM17274b = m17274b(i);
                }
            }
            if (iM17274b != -1) {
                this.f52443b = iM17274b;
                return;
            }
            if (i > 0) {
                zba zbaVar3 = zbaVarArr[i - 1];
                int i3 = zbaVar3.f71321c;
                int length2 = zbaVar3.f71319a.length;
                zbaVar3.f71321c = i3 + 1;
            }
            zbaVarArr[i].m25541a(yba.f69611e.f69615d, 0, 0);
            i--;
        }
        this.f52444c = false;
    }

    /* JADX INFO: renamed from: b */
    public final int m17274b(int i) {
        zba[] zbaVarArr = this.f52442a;
        zba zbaVar = zbaVarArr[i];
        int i2 = zbaVar.f71321c;
        if (i2 < zbaVar.f71320b) {
            return i;
        }
        Object[] objArr = zbaVar.f71319a;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        obj.getClass();
        yba ybaVar = (yba) obj;
        if (i == 6) {
            zba zbaVar2 = zbaVarArr[i + 1];
            Object[] objArr2 = ybaVar.f69615d;
            zbaVar2.m25541a(objArr2, objArr2.length, 0);
        } else {
            zbaVarArr[i + 1].m25541a(ybaVar.f69615d, Integer.bitCount(ybaVar.f69612a) * 2, 0);
        }
        return m17274b(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f52444c;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f52444c) {
            uk9.m22784s();
            return null;
        }
        Object next = this.f52442a[this.f52443b].next();
        m17273a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
