package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: gv */
/* JADX INFO: loaded from: classes.dex */
public final class C3052gv implements Iterator, tg4 {

    /* JADX INFO: renamed from: a */
    public int f41358a;

    /* JADX INFO: renamed from: b */
    public int f41359b;

    /* JADX INFO: renamed from: c */
    public boolean f41360c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f41361d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f41362e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3052gv(C3275kv c3275kv, int i) {
        this(c3275kv.f49254c);
        this.f41361d = i;
        switch (i) {
            case 1:
                this.f41362e = c3275kv;
                this(c3275kv.f49254c);
                break;
            default:
                this.f41362e = c3275kv;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41359b < this.f41358a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objM15974f;
        if (!hasNext()) {
            uk9.m22784s();
            return null;
        }
        int i = this.f41359b;
        int i2 = this.f41361d;
        Object obj = this.f41362e;
        switch (i2) {
            case 0:
                objM15974f = ((C3275kv) obj).m15974f(i);
                break;
            case 1:
                objM15974f = ((C3275kv) obj).m15977i(i);
                break;
            default:
                objM15974f = ((C3437ov) obj).f55022b[i];
                break;
        }
        this.f41359b++;
        this.f41360c = true;
        return objM15974f;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f41360c) {
            C3386nv.m17633t("Call next() before removing an element.");
            return;
        }
        int i = this.f41359b - 1;
        this.f41359b = i;
        int i2 = this.f41361d;
        Object obj = this.f41362e;
        switch (i2) {
            case 0:
                ((C3275kv) obj).m15975g(i);
                break;
            case 1:
                ((C3275kv) obj).m15975g(i);
                break;
            default:
                ((C3437ov) obj).m18522d(i);
                break;
        }
        this.f41358a--;
        this.f41360c = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3052gv(C3437ov c3437ov) {
        this(c3437ov.f55023c);
        this.f41361d = 2;
        this.f41362e = c3437ov;
    }

    public C3052gv(int i) {
        this.f41358a = i;
    }
}
