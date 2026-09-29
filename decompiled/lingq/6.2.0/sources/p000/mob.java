package p000;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzji;
import com.google.android.gms.measurement.internal.zzjj;
import com.google.android.gms.measurement.internal.zzjk;
import java.util.EnumMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class mob {

    /* JADX INFO: renamed from: f */
    public static final mob f51666f = new mob((Boolean) null, 100, (Boolean) null, (String) null);

    /* JADX INFO: renamed from: a */
    public final int f51667a;

    /* JADX INFO: renamed from: b */
    public final String f51668b;

    /* JADX INFO: renamed from: c */
    public final Boolean f51669c;

    /* JADX INFO: renamed from: d */
    public final String f51670d;

    /* JADX INFO: renamed from: e */
    public final EnumMap f51671e;

    public mob(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        this.f51671e = enumMap;
        enumMap.put(zzjk.AD_USER_DATA, bool == null ? zzji.UNINITIALIZED : bool.booleanValue() ? zzji.GRANTED : zzji.DENIED);
        this.f51667a = i;
        this.f51668b = m16964e();
        this.f51669c = bool2;
        this.f51670d = str;
    }

    /* JADX INFO: renamed from: b */
    public static mob m16960b(String str) {
        if (str == null || str.length() <= 0) {
            return f51666f;
        }
        String[] strArrSplit = str.split(":");
        int i = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(zzjk.class);
        zzjk[] zzjkVarArrZza = zzjj.DMA.zza();
        int length = zzjkVarArrZza.length;
        int i2 = 1;
        int i3 = 0;
        while (i3 < length) {
            enumMap.put(zzjkVarArrZza[i3], npc.m17585e(strArrSplit[i2].charAt(0)));
            i3++;
            i2++;
        }
        return new mob(enumMap, i, (Boolean) null, (String) null);
    }

    /* JADX INFO: renamed from: c */
    public static mob m16961c(int i, Bundle bundle) {
        if (bundle == null) {
            return new mob((Boolean) null, i, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(zzjk.class);
        for (zzjk zzjkVar : zzjj.DMA.zza()) {
            enumMap.put(zzjkVar, npc.m17584d(bundle.getString(zzjkVar.zze)));
        }
        return new mob(enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    /* JADX INFO: renamed from: d */
    public static Boolean m16962d(Bundle bundle) {
        zzji zzjiVarM17584d;
        if (bundle == null || (zzjiVarM17584d = npc.m17584d(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int iOrdinal = zzjiVarM17584d.ordinal();
        if (iOrdinal == 2) {
            return Boolean.FALSE;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: a */
    public final zzji m16963a() {
        zzji zzjiVar = (zzji) this.f51671e.get(zzjk.AD_USER_DATA);
        return zzjiVar == null ? zzji.UNINITIALIZED : zzjiVar;
    }

    /* JADX INFO: renamed from: e */
    public final String m16964e() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f51667a);
        for (zzjk zzjkVar : zzjj.DMA.zza()) {
            sb.append(":");
            sb.append(npc.m17586h((zzji) this.f51671e.get(zzjkVar)));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mob)) {
            return false;
        }
        mob mobVar = (mob) obj;
        if (this.f51668b.equalsIgnoreCase(mobVar.f51668b) && Objects.equals(this.f51669c, mobVar.f51669c)) {
            return Objects.equals(this.f51670d, mobVar.f51670d);
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Boolean bool = this.f51669c;
        if (bool == null) {
            i = 3;
        } else {
            i = true != bool.booleanValue() ? 13 : 7;
        }
        String str = this.f51670d;
        return ((str == null ? 17 : str.hashCode()) * 137) + this.f51668b.hashCode() + (i * 29);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(npc.m17581a(this.f51667a));
        for (zzjk zzjkVar : zzjj.DMA.zza()) {
            sb.append(",");
            sb.append(zzjkVar.zze);
            sb.append("=");
            zzji zzjiVar = (zzji) this.f51671e.get(zzjkVar);
            if (zzjiVar == null) {
                sb.append("uninitialized");
            } else {
                int iOrdinal = zzjiVar.ordinal();
                if (iOrdinal == 0) {
                    sb.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb.append("eu_consent_policy");
                } else if (iOrdinal == 2) {
                    sb.append("denied");
                } else if (iOrdinal == 3) {
                    sb.append("granted");
                }
            }
        }
        Boolean bool = this.f51669c;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str = this.f51670d;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    public mob(EnumMap enumMap, int i, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(zzjk.class);
        this.f51671e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f51667a = i;
        this.f51668b = m16964e();
        this.f51669c = bool;
        this.f51670d = str;
    }
}
