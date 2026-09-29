package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class kkd {

    /* JADX INFO: renamed from: a */
    public Object[] f47464a;

    /* JADX INFO: renamed from: b */
    public int f47465b;

    /* JADX INFO: renamed from: c */
    public boolean f47466c;

    /* JADX INFO: renamed from: a */
    public final void m15326a(Object obj) {
        int i;
        int length = this.f47464a.length;
        int i2 = this.f47465b;
        int i3 = i2 + 1;
        if (i3 < 0) {
            C3386nv.m17626m("cannot store more than Integer.MAX_VALUE elements");
            return;
        }
        if (i3 <= length) {
            i = length;
        } else {
            i = (length >> 1) + length + 1;
            if (i < i3) {
                int iHighestOneBit = Integer.highestOneBit(i2);
                i = iHighestOneBit + iHighestOneBit;
            }
            if (i < 0) {
                i = Integer.MAX_VALUE;
            }
        }
        if (i > length || this.f47466c) {
            this.f47464a = Arrays.copyOf(this.f47464a, i);
            this.f47466c = false;
        }
        Object[] objArr = this.f47464a;
        int i4 = this.f47465b;
        this.f47465b = i4 + 1;
        objArr[i4] = obj;
    }
}
