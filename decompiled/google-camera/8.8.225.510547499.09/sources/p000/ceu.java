package p000;

import com.google.android.apps.camera.p014ui.captureframe.Tjcw.xRFdVyfdeve;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ceu implements nbi {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f5471a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f5472b;

    public /* synthetic */ ceu(cno cnoVar, int i) {
        this.f5472b = i;
        this.f5471a = cnoVar;
    }

    public /* synthetic */ ceu(dlf dlfVar, int i) {
        this.f5472b = i;
        this.f5471a = dlfVar;
    }

    public /* synthetic */ ceu(dsx dsxVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f5472b = i;
        this.f5471a = dsxVar;
    }

    public /* synthetic */ ceu(AtomicInteger atomicInteger, int i) {
        this.f5472b = i;
        this.f5471a = atomicInteger;
    }

    public /* synthetic */ ceu(jwn jwnVar, int i) {
        this.f5472b = i;
        this.f5471a = jwnVar;
    }

    public /* synthetic */ ceu(knh knhVar, int i) {
        this.f5472b = i;
        this.f5471a = knhVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, knh] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, jwn] */
    @Override // p000.nbi
    /* JADX INFO: renamed from: a */
    public final Object mo3585a() {
        switch (this.f5472b) {
            case 0:
                return (Boolean) this.f5471a.mo3831be();
            case 1:
                return (Integer) this.f5471a.mo3831be();
            case 2:
                return ((cno) this.f5471a).f6362b;
            case 3:
                return Arrays.toString(((cno) this.f5471a).m3990b());
            case 4:
                return ((dsx) this.f5471a).f12521a;
            case 5:
                return Arrays.toString(((dsx) this.f5471a).m6702q());
            case 6:
                Object obj = this.f5471a;
                StringBuilder sb = new StringBuilder();
                dlf dlfVar = (dlf) obj;
                sb.append(String.format(Locale.US, "REPORT %d %d %d", Integer.valueOf(dlfVar.f11933e - 1), Integer.valueOf(dlfVar.f11929a.f31412u), Integer.valueOf(dlfVar.f11932d)));
                Iterator it = dlfVar.f11930b.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    String str = xRFdVyfdeve.hRSO;
                    if (!zHasNext) {
                        for (Map.Entry entry : dlfVar.f11931c.entrySet()) {
                            sb.append(String.format(Locale.US, str, Integer.valueOf(((Integer) entry.getKey()).intValue()), Integer.valueOf(((Integer) entry.getValue()).intValue())));
                        }
                        return sb;
                    }
                    int iIntValue = ((Integer) it.next()).intValue();
                    Map map = dlfVar.f11930b;
                    Integer numValueOf = Integer.valueOf(iIntValue);
                    dle dleVar = (dle) map.get(numValueOf);
                    sb.append(String.format(Locale.US, str, numValueOf, Integer.valueOf(dleVar.f11925a + dleVar.f11926b + dleVar.f11927c + dleVar.f11928d)));
                }
                break;
            case 7:
                return this.f5471a.mo6998a();
            default:
                return Integer.valueOf(((AtomicInteger) this.f5471a).get());
        }
    }
}
