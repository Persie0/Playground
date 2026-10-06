package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mry implements Iterable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ CharSequence f41491a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ msa f41492b;

    public mry(msa msaVar, CharSequence charSequence) {
        this.f41492b = msaVar;
        this.f41491a = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f41492b.m16850e(this.f41491a);
    }

    public final String toString() {
        lyz lyzVarM16212h = lyz.m16212h(", ");
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        lyzVarM16212h.m16216e(sb, iterator());
        sb.append(']');
        return sb.toString();
    }
}
