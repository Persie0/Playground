package p000;

import com.google.android.apps.camera.stats.timing.TimingSession;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class hlc implements TimingSession {

    /* JADX INFO: renamed from: j */
    public static final hlb f28236j = hlb.m10435a().m10432a();

    /* JADX INFO: renamed from: k */
    public static final hlb f28237k;

    /* JADX INFO: renamed from: a */
    private final long[] f28238a;

    /* JADX INFO: renamed from: b */
    private Runnable f28239b;

    /* JADX INFO: renamed from: l */
    public final ksc f28240l;

    /* JADX INFO: renamed from: m */
    public long f28241m;

    /* JADX INFO: renamed from: n */
    public final Enum[] f28242n;

    /* JADX INFO: renamed from: o */
    public final jeu f28243o;

    static {
        hla hlaVarM10435a = hlb.m10435a();
        hlaVarM10435a.m10434c(false);
        hlaVarM10435a.m10433b(false);
        f28237k = hlaVarM10435a.m10432a();
    }

    protected hlc(ksc kscVar, jeu jeuVar, long j, Enum[] enumArr, byte[] bArr, byte[] bArr2) {
        this.f28240l = kscVar;
        this.f28243o = jeuVar;
        this.f28241m = j;
        this.f28242n = enumArr;
        long[] jArr = new long[enumArr.length];
        this.f28238a = jArr;
        Arrays.fill(jArr, -1L);
    }

    /* JADX INFO: renamed from: a */
    protected void mo4304a() {
        Arrays.fill(this.f28238a, -1L);
        this.f28241m = this.f28240l.mo8353a();
    }

    @Override // com.google.android.apps.camera.stats.timing.TimingSession
    /* JADX INFO: renamed from: b */
    public final void mo4303b(Runnable runnable) {
        this.f28239b = runnable;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        Runnable runnable = this.f28239b;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: g */
    public final long m10436g(Enum r4) {
        return this.f28238a[r4.ordinal()];
    }

    /* JADX INFO: renamed from: h */
    public final void m10437h(Enum r4) {
        m10439j(r4, this.f28240l.mo8353a(), f28236j);
    }

    /* JADX INFO: renamed from: i */
    public final void m10438i(Enum r3, hlb hlbVar) {
        m10439j(r3, this.f28240l.mo8353a(), hlbVar);
    }

    /* JADX INFO: renamed from: j */
    public final void m10439j(Enum r6, long j, hlb hlbVar) {
        if (m10440k(r6)) {
            return;
        }
        int iOrdinal = r6.ordinal();
        Enum[] enumArr = this.f28242n;
        enumArr[iOrdinal] = r6;
        long[] jArr = this.f28238a;
        jArr[iOrdinal] = j;
        long j2 = iOrdinal > 0 ? jArr[iOrdinal - 1] : -1L;
        Enum r0 = iOrdinal > 0 ? enumArr[iOrdinal - 1] : null;
        boolean z = false;
        if (j2 >= 0 && hlbVar.f28235b) {
            z = true;
        }
        boolean z2 = hlbVar.f28234a;
        if (z && z2) {
            if (r0 != null) {
                r0.name();
            }
            r6.name();
        } else if (z) {
            if (r0 != null) {
                r0.name();
            }
            r6.name();
        } else if (z2) {
            r6.name();
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m10440k(Enum r7) {
        int iOrdinal = r7.ordinal();
        lku.m15669w(this.f28242n[iOrdinal] == r7);
        return this.f28238a[iOrdinal] >= 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append("{\n");
        long j = Long.MAX_VALUE;
        int i = 0;
        while (true) {
            long[] jArr = this.f28238a;
            if (i >= jArr.length) {
                break;
            }
            long j2 = jArr[i];
            if (j2 >= 0 && j2 < j) {
                j = j2;
            }
            i++;
        }
        for (int i2 = 0; i2 < this.f28238a.length; i2++) {
            sb.append("\t");
            sb.append(this.f28242n[i2]);
            sb.append(": ");
            sb.append(this.f28238a[i2]);
            if (this.f28238a[i2] >= 0) {
                sb.append(" (");
                sb.append(jzn.m13811N(this.f28238a[i2] - j));
                sb.append("ms)");
            }
            sb.append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

    protected hlc(ksc kscVar, long j, Enum[] enumArr) {
        this(kscVar, new jeu(), j, enumArr, null, null);
    }

    protected hlc(ksc kscVar, Enum[] enumArr) {
        this(kscVar, new jeu(), kscVar.mo8353a(), enumArr, null, null);
    }
}
