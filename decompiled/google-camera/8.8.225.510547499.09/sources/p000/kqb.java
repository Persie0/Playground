package p000;

import android.util.ArraySet;
import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kqb implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f36826a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f36827b;

    public /* synthetic */ kqb(ArraySet arraySet, int i) {
        this.f36827b = i;
        this.f36826a = arraySet;
    }

    public /* synthetic */ kqb(hfx hfxVar, int i) {
        this.f36827b = i;
        this.f36826a = hfxVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f36827b) {
            case 0:
                Object obj3 = this.f36826a;
                kqe kqeVar = (kqe) obj;
                kqe kqeVar2 = (kqe) obj2;
                long j = kqeVar.f36835b;
                long j2 = kqeVar2.f36835b;
                int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                if (j != j2) {
                    return i;
                }
                int iCompareToIgnoreCase = kqeVar.f36836c.compareToIgnoreCase(kqeVar2.f36836c);
                if (iCompareToIgnoreCase != 0) {
                    return iCompareToIgnoreCase;
                }
                ArraySet arraySet = (ArraySet) obj3;
                if (!arraySet.isEmpty()) {
                    if (arraySet.contains(mpw.m16769h(kqeVar.f36838e.mo14768i().f37088d)) && !arraySet.contains(mpw.m16769h(kqeVar2.f36838e.mo14768i().f37088d))) {
                        return 1;
                    }
                    if (arraySet.contains(mpw.m16769h(kqeVar2.f36838e.mo14768i().f37088d)) && !arraySet.contains(mpw.m16769h(kqeVar.f36838e.mo14768i().f37088d))) {
                        return -1;
                    }
                }
                int iCompareToIgnoreCase2 = kqeVar.f36838e.mo14768i().f37088d.compareToIgnoreCase(kqeVar2.f36838e.mo14768i().f37088d);
                return iCompareToIgnoreCase2 == 0 ? (kqeVar.f36834a > kqeVar2.f36834a ? 1 : (kqeVar.f36834a == kqeVar2.f36834a ? 0 : -1)) : iCompareToIgnoreCase2;
            default:
                hhs hhsVar = (hhs) obj;
                hhs hhsVar2 = (hhs) obj2;
                int iCompare = ((hfx) this.f36826a).f27638a.mo10265b().compare(hhsVar.f27855a, hhsVar2.f27855a);
                if (iCompare != 0) {
                    return iCompare;
                }
                boolean z = hhsVar.f27858d;
                if (z != hhsVar2.f27858d) {
                    return true != z ? 1 : -1;
                }
                return 0;
        }
    }
}
