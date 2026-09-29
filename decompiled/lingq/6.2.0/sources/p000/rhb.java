package p000;

import com.google.android.gms.internal.measurement.AbstractC0961e;
import com.google.android.gms.internal.measurement.zzacr;
import com.google.android.gms.internal.measurement.zzagm;
import com.google.android.gms.internal.measurement.zzagn;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class rhb {

    /* JADX INFO: renamed from: a */
    public final hjb f59325a = new hjb();

    /* JADX INFO: renamed from: b */
    public boolean f59326b;

    static {
        new rhb(0);
    }

    public rhb(int i) {
        m20665a();
        m20665a();
    }

    /* JADX INFO: renamed from: b */
    public static void m20663b(nhb nhbVar, zzagm zzagmVar, int i, Object obj) {
        if (zzagmVar == zzagm.zzj) {
            nhbVar.mo13256d(i, 3);
            ((whb) ((bhb) obj)).m23961e(nhbVar);
            nhbVar.mo13256d(i, 4);
            return;
        }
        nhbVar.mo13256d(i, zzagmVar.zzb());
        zzagn zzagnVar = zzagn.INT;
        switch (zzagmVar.ordinal()) {
            case 0:
                nhbVar.mo13273u(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                nhbVar.mo13271s(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                nhbVar.mo13272t(((Long) obj).longValue());
                break;
            case 3:
                nhbVar.mo13272t(((Long) obj).longValue());
                break;
            case 4:
                nhbVar.mo13269q(((Integer) obj).intValue());
                break;
            case 5:
                nhbVar.mo13273u(((Long) obj).longValue());
                break;
            case 6:
                nhbVar.mo13271s(((Integer) obj).intValue());
                break;
            case 7:
                nhbVar.mo13268p(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof zzacr)) {
                    nhbVar.mo13274v((String) obj);
                } else {
                    nhbVar.mo13265m((zzacr) obj);
                }
                break;
            case 9:
                ((whb) ((bhb) obj)).m23961e(nhbVar);
                break;
            case 10:
                nhbVar.mo13267o((bhb) obj);
                break;
            case 11:
                if (!(obj instanceof zzacr)) {
                    byte[] bArr = (byte[]) obj;
                    nhbVar.mo13266n(bArr.length, bArr);
                } else {
                    nhbVar.mo13265m((zzacr) obj);
                }
                break;
            case 12:
                nhbVar.mo13270r(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof yhb)) {
                    nhbVar.mo13269q(((Integer) obj).intValue());
                } else {
                    nhbVar.mo13269q(((yhb) obj).zza());
                }
                break;
            case 14:
                nhbVar.mo13271s(((Integer) obj).intValue());
                break;
            case 15:
                nhbVar.mo13273u(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                nhbVar.mo13270r((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                nhbVar.mo13272t((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m20664c(zzagm zzagmVar, int i, Object obj) {
        int iM5405b;
        int iM17434a;
        int iM17434a2 = nhb.m17434a(i << 3);
        if (zzagmVar == zzagm.zzj) {
            iM17434a2 += iM17434a2;
        }
        zzagn zzagnVar = zzagn.INT;
        int iM17435b = 4;
        switch (zzagmVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                iM17435b = 8;
                return iM17435b + iM17434a2;
            case 1:
                ((Float) obj).getClass();
                return iM17435b + iM17434a2;
            case 2:
                iM17435b = nhb.m17435b(((Long) obj).longValue());
                return iM17435b + iM17434a2;
            case 3:
                iM17435b = nhb.m17435b(((Long) obj).longValue());
                return iM17435b + iM17434a2;
            case 4:
                iM17435b = nhb.m17435b(((Integer) obj).intValue());
                return iM17435b + iM17434a2;
            case 5:
                ((Long) obj).getClass();
                iM17435b = 8;
                return iM17435b + iM17434a2;
            case 6:
                ((Integer) obj).getClass();
                return iM17435b + iM17434a2;
            case 7:
                ((Boolean) obj).getClass();
                iM17435b = 1;
                return iM17435b + iM17434a2;
            case 8:
                if (obj instanceof zzacr) {
                    iM5405b = ((zzacr) obj).mo5422f();
                    iM17434a = nhb.m17434a(iM5405b);
                } else {
                    iM5405b = AbstractC0961e.m5405b((String) obj);
                    iM17434a = nhb.m17434a(iM5405b);
                }
                iM17435b = iM17434a + iM5405b;
                return iM17435b + iM17434a2;
            case 9:
                iM17435b = ((whb) ((bhb) obj)).m23968l();
                return iM17435b + iM17434a2;
            case 10:
                iM5405b = ((whb) ((bhb) obj)).m23968l();
                iM17434a = nhb.m17434a(iM5405b);
                iM17435b = iM17434a + iM5405b;
                return iM17435b + iM17434a2;
            case 11:
                if (obj instanceof zzacr) {
                    iM5405b = ((zzacr) obj).mo5422f();
                    iM17434a = nhb.m17434a(iM5405b);
                } else {
                    iM5405b = ((byte[]) obj).length;
                    iM17434a = nhb.m17434a(iM5405b);
                }
                iM17435b = iM17434a + iM5405b;
                return iM17435b + iM17434a2;
            case 12:
                iM17435b = nhb.m17434a(((Integer) obj).intValue());
                return iM17435b + iM17434a2;
            case 13:
                iM17435b = obj instanceof yhb ? nhb.m17435b(((yhb) obj).zza()) : nhb.m17435b(((Integer) obj).intValue());
                return iM17435b + iM17434a2;
            case 14:
                ((Integer) obj).getClass();
                return iM17435b + iM17434a2;
            case 15:
                ((Long) obj).getClass();
                iM17435b = 8;
                return iM17435b + iM17434a2;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                iM17435b = nhb.m17434a((iIntValue >> 31) ^ (iIntValue + iIntValue));
                return iM17435b + iM17434a2;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                iM17435b = nhb.m17435b((jLongValue >> 63) ^ (jLongValue + jLongValue));
                return iM17435b + iM17434a2;
            default:
                ho2.m13385e("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m20665a() {
        if (this.f59326b) {
            return;
        }
        hjb hjbVar = this.f59325a;
        int i = hjbVar.f42508b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = hjbVar.m13295a(i2).f44204b;
            if (obj instanceof whb) {
                whb whbVar = (whb) obj;
                cjb.f10181c.m4784a(whbVar.getClass()).mo11892a(whbVar);
                whbVar.m23963g();
            }
        }
        Iterator it = hjbVar.m13296b().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof whb) {
                whb whbVar2 = (whb) value;
                cjb.f10181c.m4784a(whbVar2.getClass()).mo11892a(whbVar2);
                whbVar2.m23963g();
            }
        }
        if (!hjbVar.f42510d) {
            if (hjbVar.f42508b > 0) {
                hjbVar.m13295a(0).f44203a.getClass();
                ho2.m13383c();
                return;
            } else {
                Iterator it2 = hjbVar.m13296b().iterator();
                if (it2.hasNext()) {
                    ((Map.Entry) it2.next()).getKey().getClass();
                    ho2.m13383c();
                    return;
                }
            }
        }
        if (!hjbVar.f42510d) {
            hjbVar.f42509c = hjbVar.f42509c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(hjbVar.f42509c);
            hjbVar.f42512f = hjbVar.f42512f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(hjbVar.f42512f);
            hjbVar.f42510d = true;
        }
        this.f59326b = true;
    }

    public final Object clone() {
        rhb rhbVar = new rhb();
        hjb hjbVar = this.f59325a;
        if (hjbVar.f42508b > 0) {
            hjbVar.m13295a(0).f44203a.getClass();
            ho2.m13383c();
            return null;
        }
        Iterator it = hjbVar.m13296b().iterator();
        if (!it.hasNext()) {
            return rhbVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            ho2.m13383c();
            return null;
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rhb) {
            return this.f59325a.equals(((rhb) obj).f59325a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f59325a.hashCode();
    }

    public rhb() {
    }
}
