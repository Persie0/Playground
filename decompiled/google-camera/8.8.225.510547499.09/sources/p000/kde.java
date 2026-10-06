package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kde implements kdf {

    /* JADX INFO: renamed from: a */
    private final kme f35636a;

    /* JADX INFO: renamed from: b */
    private final List f35637b;

    /* JADX INFO: renamed from: c */
    private int f35638c;

    public kde(kme kmeVar) {
        this.f35636a = kmeVar;
        ArrayList arrayList = new ArrayList();
        this.f35637b = arrayList;
        try {
            arrayList.addAll(kmeVar.mo13860g());
        } catch (kmi e) {
        } catch (kml e2) {
        } catch (kmm e3) {
        }
        this.f35638c = 0;
    }

    @Override // p000.kdf
    /* JADX INFO: renamed from: a */
    public final kmd mo13994a() {
        if (this.f35638c == this.f35637b.size()) {
            return null;
        }
        kme kmeVar = this.f35636a;
        List list = this.f35637b;
        int i = this.f35638c;
        this.f35638c = i + 1;
        return kmeVar.mo13854a((kmg) list.get(i));
    }

    @Override // p000.kdf
    /* JADX INFO: renamed from: b */
    public final void mo13995b() {
        this.f35638c = 0;
    }
}
