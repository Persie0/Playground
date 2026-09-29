package p166i1;

import androidx.compose.p017ui.InterfaceC0500b;
import dm.C5207g;

/* JADX INFO: renamed from: i1.v */
/* JADX INFO: loaded from: classes.dex */
public final class C6167v {

    /* JADX INFO: renamed from: a */
    public static final a f36008a;

    /* JADX INFO: renamed from: i1.v$a */
    public static final class a extends InterfaceC0500b.c {
        public final String toString() {
            return "<Head>";
        }
    }

    static {
        a aVar = new a();
        aVar.f3328c = -1;
        f36008a = aVar;
    }

    /* JADX INFO: renamed from: a */
    public static final int m12690a(InterfaceC0500b.b bVar, InterfaceC0500b.b bVar2) {
        C5207g.m11111f(bVar, "prev");
        C5207g.m11111f(bVar2, "next");
        if (C5207g.m11106a(bVar, bVar2)) {
            return 2;
        }
        return bVar.getClass() == bVar2.getClass() ? 1 : 0;
    }
}
