package p000;

import java.util.Iterator;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class cb2 implements Iterator, tg4 {

    /* JADX INFO: renamed from: a */
    public int f9824a = -1;

    /* JADX INFO: renamed from: b */
    public int f9825b;

    /* JADX INFO: renamed from: c */
    public int f9826c;

    /* JADX INFO: renamed from: d */
    public i84 f9827d;

    /* JADX INFO: renamed from: e */
    public int f9828e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ db2 f9829f;

    public cb2(db2 db2Var) {
        this.f9829f = db2Var;
        int iM15945h = l70.m15945h(0, 0, db2Var.f35348a.length());
        this.f9825b = iM15945h;
        this.f9826c = iM15945h;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c  */
    /* JADX WARN: Code duplicated, block: B:12:0x0022 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:18:0x006f  */
    /* JADX INFO: renamed from: a */
    public final void m4486a() {
        Pair pair;
        db2 db2Var = this.f9829f;
        CharSequence charSequence = db2Var.f35348a;
        int i = this.f9826c;
        if (i < 0) {
            this.f9824a = 0;
            this.f9827d = null;
            return;
        }
        int i2 = db2Var.f35349b;
        if (i2 > 0) {
            int i3 = this.f9828e + 1;
            this.f9828e = i3;
            if (i3 >= i2) {
                this.f9827d = new i84(this.f9825b, vk9.m23384g0(charSequence), 1);
                this.f9826c = -1;
            } else if (i > charSequence.length() && (pair = (Pair) db2Var.f35350c.invoke(charSequence, Integer.valueOf(this.f9826c))) != null) {
                int iIntValue = ((Number) pair.f47623a).intValue();
                int iIntValue2 = ((Number) pair.f47624b).intValue();
                this.f9827d = l70.m15922M(this.f9825b, iIntValue);
                int i4 = iIntValue + iIntValue2;
                this.f9825b = i4;
                this.f9826c = i4 + (iIntValue2 == 0 ? 1 : 0);
            } else {
                this.f9827d = new i84(this.f9825b, vk9.m23384g0(charSequence), 1);
                this.f9826c = -1;
            }
        } else if (i > charSequence.length()) {
            this.f9827d = new i84(this.f9825b, vk9.m23384g0(charSequence), 1);
            this.f9826c = -1;
        } else {
            int iIntValue3 = ((Number) pair.f47623a).intValue();
            int iIntValue4 = ((Number) pair.f47624b).intValue();
            this.f9827d = l70.m15922M(this.f9825b, iIntValue3);
            int i5 = iIntValue3 + iIntValue4;
            this.f9825b = i5;
            this.f9826c = i5 + (iIntValue4 == 0 ? 1 : 0);
        }
        this.f9824a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f9824a == -1) {
            m4486a();
        }
        return this.f9824a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f9824a == -1) {
            m4486a();
        }
        if (this.f9824a == 0) {
            uk9.m22784s();
            return null;
        }
        i84 i84Var = this.f9827d;
        i84Var.getClass();
        this.f9827d = null;
        this.f9824a = -1;
        return i84Var;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
