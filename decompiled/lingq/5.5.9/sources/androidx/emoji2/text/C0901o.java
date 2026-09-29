package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import dm.C5212l;
import p255m3.C7475a;
import p255m3.C7476b;

/* JADX INFO: renamed from: androidx.emoji2.text.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0901o {

    /* JADX INFO: renamed from: a */
    public final C7476b f6036a;

    /* JADX INFO: renamed from: b */
    public final char[] f6037b;

    /* JADX INFO: renamed from: c */
    public final a f6038c = new a(1024);

    /* JADX INFO: renamed from: d */
    public final Typeface f6039d;

    /* JADX INFO: renamed from: androidx.emoji2.text.o$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final SparseArray<a> f6040a;

        /* JADX INFO: renamed from: b */
        public C0903q f6041b;

        public a() {
            this(1);
        }

        public a(int i10) {
            this.f6040a = new SparseArray<>(i10);
        }

        /* JADX INFO: renamed from: a */
        public final void m3544a(C0903q c0903q, int i10, int i11) {
            int iM3550a = c0903q.m3550a(i10);
            SparseArray<a> sparseArray = this.f6040a;
            a aVar = sparseArray == null ? null : sparseArray.get(iM3550a);
            if (aVar == null) {
                aVar = new a();
                sparseArray.put(c0903q.m3550a(i10), aVar);
            }
            if (i11 > i10) {
                aVar.m3544a(c0903q, i10 + 1, i11);
            } else {
                aVar.f6041b = c0903q;
            }
        }
    }

    public C0901o(Typeface typeface, C7476b c7476b) {
        int i10;
        int i11;
        this.f6039d = typeface;
        this.f6036a = c7476b;
        int iM14859a = c7476b.m14859a(6);
        if (iM14859a != 0) {
            int i12 = iM14859a + c7476b.f41324a;
            i10 = c7476b.f41325b.getInt(c7476b.f41325b.getInt(i12) + i12);
        } else {
            i10 = 0;
        }
        this.f6037b = new char[i10 * 2];
        int iM14859a2 = c7476b.m14859a(6);
        if (iM14859a2 != 0) {
            int i13 = iM14859a2 + c7476b.f41324a;
            i11 = c7476b.f41325b.getInt(c7476b.f41325b.getInt(i13) + i13);
        } else {
            i11 = 0;
        }
        for (int i14 = 0; i14 < i11; i14++) {
            C0903q c0903q = new C0903q(this, i14);
            C7475a c7475aM3552c = c0903q.m3552c();
            int iM14859a3 = c7475aM3552c.m14859a(4);
            Character.toChars(iM14859a3 != 0 ? c7475aM3552c.f41325b.getInt(iM14859a3 + c7475aM3552c.f41324a) : 0, this.f6037b, i14 * 2);
            C5212l.m11130A("invalid metadata codepoint length", c0903q.m3551b() > 0);
            this.f6038c.m3544a(c0903q, 0, c0903q.m3551b() - 1);
        }
    }
}
