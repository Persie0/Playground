package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jwe implements jvz {

    /* JADX INFO: renamed from: a */
    private final kbz f34938a;

    public jwe(kbz kbzVar) {
        this.f34938a = kbzVar;
    }

    @Override // p000.jvz
    /* JADX INFO: renamed from: a */
    public final void mo13607a(kba kbaVar) {
        if (!(kbaVar instanceof jwd)) {
            kbaVar.close();
            return;
        }
        try {
            this.f34938a.mo13961e(((jwd) kbaVar).mo9070b());
            kbaVar.close();
        } finally {
            this.f34938a.mo13962f();
        }
    }

    @Override // p000.jvz
    /* JADX INFO: renamed from: b */
    public final void mo13608b(Iterable iterable) {
        try {
            this.f34938a.mo13961e("Lifetime#close");
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                mo13607a((kba) it.next());
            }
            this.f34938a.mo13962f();
        } catch (Throwable th) {
            this.f34938a.mo13962f();
            throw th;
        }
    }
}
