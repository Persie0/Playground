package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class amf implements ale {

    /* JADX INFO: renamed from: a */
    public final amk f687a;

    /* JADX INFO: renamed from: b */
    public final amc f688b;

    /* JADX INFO: renamed from: c */
    public boolean f689c = false;

    public amf(amk amkVar, amc amcVar) {
        this.f687a = amkVar;
        this.f688b = amcVar;
    }

    @Override // p000.ale
    /* JADX INFO: renamed from: a */
    public final void mo906a(Object obj) {
        if (amd.m937b(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("  onLoadFinished in ");
            sb.append(this.f687a);
            sb.append(": ");
            sb.append(amk.m954j(obj));
        }
        this.f689c = true;
        this.f688b.mo934b(obj);
    }

    public final String toString() {
        return this.f688b.toString();
    }
}
