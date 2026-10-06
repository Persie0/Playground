package p000;

import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dky {

    /* JADX INFO: renamed from: a */
    public static final nbh f11908a = nbh.m17259h("com/google/android/apps/camera/debug/contentprovider/TimingContentProvider");

    /* JADX INFO: renamed from: b */
    public static final dkw f11909b = new dkw() { // from class: dku
        @Override // p000.dkw
        /* JADX INFO: renamed from: a */
        public final boolean mo6319a(List list, int i, hkw hkwVar) {
            return dky.m6320c(list, i);
        }
    };

    /* JADX INFO: renamed from: c */
    public final UriMatcher f11910c = new UriMatcher(-1);

    /* JADX INFO: renamed from: d */
    public final Map f11911d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final Map f11912e = new HashMap();

    /* JADX INFO: renamed from: f */
    private final String f11913f;

    public dky(String str) {
        this.f11913f = str;
    }

    /* JADX INFO: renamed from: c */
    static /* synthetic */ boolean m6320c(List list, int i) {
        return list.size() + (-1) == i;
    }

    /* JADX INFO: renamed from: d */
    private final void m6321d(String str, String str2, msi msiVar) {
        int size = this.f11911d.size() + 1;
        this.f11910c.addURI(str, str2, size);
        this.f11911d.put(Integer.valueOf(size), msiVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: a */
    public final Cursor m6322a(dkx dkxVar, boolean z, dkw dkwVar) {
        ?? A = dkxVar.mo6051a();
        int i = 1;
        MatrixCursor matrixCursor = new MatrixCursor(z ? new String[]{"_id", "run", "name", "time_ns"} : new String[]{"run", "time_ns"});
        if (!A.isEmpty()) {
            int i2 = 0;
            while (i2 < A.size()) {
                hlc hlcVar = (hlc) A.get(i2);
                ArrayList<hkw> arrayList = new ArrayList(hlcVar.f28242n.length + i);
                arrayList.add(hkw.m10427a("TIMING_CREATION", -1, hlcVar.f28241m));
                Enum[] enumArr = hlcVar.f28242n;
                int length = enumArr.length;
                int i3 = 0;
                while (i3 < length) {
                    Enum r14 = enumArr[i3];
                    arrayList.add(hkw.m10427a(r14.name(), r14.ordinal(), hlcVar.m10436g(r14)));
                    i3++;
                    i2 = i2;
                }
                int i4 = i2;
                for (hkw hkwVar : arrayList) {
                    i4 = i4;
                    if (dkwVar.mo6319a(A, i4, hkwVar)) {
                        int i5 = hkwVar.f28223b;
                        String str = hkwVar.f28222a;
                        long j = hkwVar.f28224c;
                        if (z) {
                            matrixCursor.newRow().add("_id", Integer.valueOf(i5)).add("run", Integer.valueOf(i4)).add("name", str).add("time_ns", Long.valueOf(j));
                        } else {
                            matrixCursor.newRow().add("run", Integer.valueOf(i4)).add("time_ns", Long.valueOf(j));
                        }
                    }
                }
                i2 = i4 + 1;
                i = 1;
            }
        }
        return matrixCursor;
    }

    /* JADX INFO: renamed from: b */
    public final void m6323b(String str, Class cls, final dkx dkxVar) {
        int i = 0;
        m6321d(this.f11913f, str, new dks(this, dkxVar, i));
        hlb hlbVar = hlc.f28236j;
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        lku.m15662p(enumArr);
        int length = enumArr.length;
        ArrayList<String> arrayList = new ArrayList(length + 1);
        arrayList.add("TIMING_CREATION");
        while (i < length) {
            arrayList.add(enumArr[i].name());
            i++;
        }
        for (final String str2 : arrayList) {
            m6321d(this.f11913f, str + "/" + str2, new msi() { // from class: dkt
                @Override // p000.msi
                /* JADX INFO: renamed from: a */
                public final Object mo6051a() {
                    dky dkyVar = this.f11903a;
                    dkx dkxVar2 = dkxVar;
                    final String str3 = str2;
                    return dkyVar.m6322a(dkxVar2, false, new dkw() { // from class: dkv
                        @Override // p000.dkw
                        /* JADX INFO: renamed from: a */
                        public final boolean mo6319a(List list, int i2, hkw hkwVar) {
                            return dky.m6320c(list, i2) && hkwVar.f28222a.equals(str3);
                        }
                    });
                }
            });
        }
        this.f11912e.put(str, dkxVar);
    }
}
