package p000;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzji;
import com.google.android.gms.measurement.internal.zzjj;
import com.google.android.gms.measurement.internal.zzjk;
import java.util.EnumMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class npc {

    /* JADX INFO: renamed from: c */
    public static final npc f53108c = new npc(100);

    /* JADX INFO: renamed from: a */
    public final EnumMap f53109a;

    /* JADX INFO: renamed from: b */
    public final int f53110b;

    public npc(int i) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        this.f53109a = enumMap;
        zzjk zzjkVar = zzjk.AD_STORAGE;
        zzji zzjiVar = zzji.UNINITIALIZED;
        enumMap.put(zzjkVar, zzjiVar);
        enumMap.put(zzjk.ANALYTICS_STORAGE, zzjiVar);
        this.f53110b = i;
    }

    /* JADX INFO: renamed from: a */
    public static String m17581a(int i) {
        if (i == -30) {
            return "TCF";
        }
        if (i == -20) {
            return "API";
        }
        if (i == -10) {
            return "MANIFEST";
        }
        if (i == 0) {
            return "1P_API";
        }
        if (i == 30) {
            return "1P_INIT";
        }
        if (i != 90) {
            return i != 100 ? "OTHER" : "UNKNOWN";
        }
        return "REMOTE_CONFIG";
    }

    /* JADX INFO: renamed from: b */
    public static npc m17582b(int i, Bundle bundle) {
        if (bundle == null) {
            return new npc(i);
        }
        EnumMap enumMap = new EnumMap(zzjk.class);
        for (zzjk zzjkVar : zzjj.STORAGE.zzb()) {
            enumMap.put(zzjkVar, m17584d(bundle.getString(zzjkVar.zze)));
        }
        return new npc(enumMap, i);
    }

    /* JADX INFO: renamed from: c */
    public static npc m17583c(int i, String str) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        zzjk[] zzjkVarArrZza = zzjj.STORAGE.zza();
        for (int i2 = 0; i2 < zzjkVarArrZza.length; i2++) {
            String str2 = str == null ? "" : str;
            zzjk zzjkVar = zzjkVarArrZza[i2];
            int i3 = i2 + 2;
            if (i3 < str2.length()) {
                enumMap.put(zzjkVar, m17585e(str2.charAt(i3)));
            } else {
                enumMap.put(zzjkVar, zzji.UNINITIALIZED);
            }
        }
        return new npc(enumMap, i);
    }

    /* JADX INFO: renamed from: d */
    public static zzji m17584d(String str) {
        if (str == null) {
            return zzji.UNINITIALIZED;
        }
        if (str.equals("granted")) {
            return zzji.GRANTED;
        }
        return str.equals("denied") ? zzji.DENIED : zzji.UNINITIALIZED;
    }

    /* JADX INFO: renamed from: e */
    public static zzji m17585e(char c) {
        if (c == '+') {
            return zzji.POLICY;
        }
        if (c != '0') {
            return c != '1' ? zzji.UNINITIALIZED : zzji.GRANTED;
        }
        return zzji.DENIED;
    }

    /* JADX INFO: renamed from: h */
    public static char m17586h(zzji zzjiVar) {
        if (zzjiVar == null) {
            return '-';
        }
        int iOrdinal = zzjiVar.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    /* JADX INFO: renamed from: l */
    public static boolean m17587l(int i, int i2) {
        int i3 = -30;
        if (i == -20) {
            if (i2 == -30) {
                return true;
            }
            i = -20;
        }
        if (i != -30) {
            i3 = i;
        } else if (i2 == -20) {
            return true;
        }
        return i3 == i2 || i < i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof npc)) {
            return false;
        }
        npc npcVar = (npc) obj;
        for (zzjk zzjkVar : zzjj.STORAGE.zzb()) {
            if (this.f53109a.get(zzjkVar) != npcVar.f53109a.get(zzjkVar)) {
                return false;
            }
        }
        return this.f53110b == npcVar.f53110b;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX INFO: renamed from: f */
    public final String m17588f() {
        int iOrdinal;
        StringBuilder sb = new StringBuilder("G1");
        for (zzjk zzjkVar : zzjj.STORAGE.zza()) {
            zzji zzjiVar = (zzji) this.f53109a.get(zzjkVar);
            char c = '-';
            if (zzjiVar != null && (iOrdinal = zzjiVar.ordinal()) != 0) {
                if (iOrdinal == 1) {
                    c = '1';
                } else if (iOrdinal == 2) {
                    c = '0';
                } else if (iOrdinal == 3) {
                    c = '1';
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: g */
    public final String m17589g() {
        StringBuilder sb = new StringBuilder("G1");
        for (zzjk zzjkVar : zzjj.STORAGE.zza()) {
            sb.append(m17586h((zzji) this.f53109a.get(zzjkVar)));
        }
        return sb.toString();
    }

    public final int hashCode() {
        Iterator it = this.f53109a.values().iterator();
        int iHashCode = this.f53110b * 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((zzji) it.next()).hashCode();
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m17590i(zzjk zzjkVar) {
        return ((zzji) this.f53109a.get(zzjkVar)) != zzji.DENIED;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    /* JADX INFO: renamed from: j */
    public final npc m17591j(npc npcVar) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        for (zzjk zzjkVar : zzjj.STORAGE.zzb()) {
            zzji zzjiVar = (zzji) this.f53109a.get(zzjkVar);
            zzji zzjiVar2 = (zzji) npcVar.f53109a.get(zzjkVar);
            if (zzjiVar == null) {
                zzjiVar = zzjiVar2;
            } else if (zzjiVar2 != null) {
                zzji zzjiVar3 = zzji.UNINITIALIZED;
                if (zzjiVar == zzjiVar3) {
                    zzjiVar = zzjiVar2;
                } else if (zzjiVar2 != zzjiVar3) {
                    zzji zzjiVar4 = zzji.POLICY;
                    if (zzjiVar == zzjiVar4) {
                        zzjiVar = zzjiVar2;
                    } else if (zzjiVar2 != zzjiVar4) {
                        zzji zzjiVar5 = zzji.DENIED;
                        zzjiVar = (zzjiVar == zzjiVar5 || zzjiVar2 == zzjiVar5) ? zzjiVar5 : zzji.GRANTED;
                    }
                }
            }
            if (zzjiVar != null) {
                enumMap.put(zzjkVar, zzjiVar);
            }
        }
        return new npc(enumMap, 100);
    }

    /* JADX INFO: renamed from: k */
    public final npc m17592k(npc npcVar) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        for (zzjk zzjkVar : zzjj.STORAGE.zzb()) {
            zzji zzjiVar = (zzji) this.f53109a.get(zzjkVar);
            if (zzjiVar == zzji.UNINITIALIZED) {
                zzjiVar = (zzji) npcVar.f53109a.get(zzjkVar);
            }
            if (zzjiVar != null) {
                enumMap.put(zzjkVar, zzjiVar);
            }
        }
        return new npc(enumMap, this.f53110b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(m17581a(this.f53110b));
        for (zzjk zzjkVar : zzjj.STORAGE.zzb()) {
            sb.append(",");
            sb.append(zzjkVar.zze);
            sb.append("=");
            zzji zzjiVar = (zzji) this.f53109a.get(zzjkVar);
            if (zzjiVar == null) {
                zzjiVar = zzji.UNINITIALIZED;
            }
            sb.append(zzjiVar);
        }
        return sb.toString();
    }

    public npc(EnumMap enumMap, int i) {
        EnumMap enumMap2 = new EnumMap(zzjk.class);
        this.f53109a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f53110b = i;
    }
}
