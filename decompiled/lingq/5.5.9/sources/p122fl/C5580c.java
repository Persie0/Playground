package p122fl;

import android.util.Log;
import dm.C5207g;

/* JADX INFO: renamed from: fl.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C5580c implements InterfaceC5587j {

    /* JADX INFO: renamed from: a */
    public boolean f34388a = false;

    /* JADX INFO: renamed from: b */
    public String f34389b = "fetch2";

    public C5580c(int i10) {
    }

    @Override // p122fl.InterfaceC5587j
    /* JADX INFO: renamed from: a */
    public final void mo11828a(String str) {
        C5207g.m11112g(str, "message");
        if (this.f34388a) {
            Log.e(m11832e(), str);
        }
    }

    @Override // p122fl.InterfaceC5587j
    /* JADX INFO: renamed from: b */
    public final void mo11829b(String str) {
        C5207g.m11112g(str, "message");
        if (this.f34388a) {
            Log.d(m11832e(), str);
        }
    }

    @Override // p122fl.InterfaceC5587j
    /* JADX INFO: renamed from: c */
    public final void mo11830c(Exception exc) {
        if (this.f34388a) {
            Log.d(m11832e(), "PriorityIterator failed access database", exc);
        }
    }

    @Override // p122fl.InterfaceC5587j
    /* JADX INFO: renamed from: d */
    public final void mo11831d(String str, Exception exc) {
        C5207g.m11112g(str, "message");
        if (this.f34388a) {
            Log.e(m11832e(), str, exc);
        }
    }

    /* JADX INFO: renamed from: e */
    public final String m11832e() {
        return this.f34389b.length() > 23 ? "fetch2" : this.f34389b;
    }
}
