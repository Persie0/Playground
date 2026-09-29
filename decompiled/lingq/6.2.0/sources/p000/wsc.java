package p000;

import com.google.android.gms.internal.vision.zzke;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class wsc {
    /* JADX INFO: renamed from: a */
    public static zzke m24150a(Object obj, Object obj2) {
        zzke zzkeVar = (zzke) obj;
        zzke zzkeVar2 = (zzke) obj2;
        if (!zzkeVar2.isEmpty()) {
            if (!zzkeVar.f12300a) {
                if (zzkeVar.isEmpty()) {
                    zzkeVar = new zzke();
                } else {
                    zzke zzkeVar3 = new zzke(zzkeVar);
                    zzkeVar3.f12300a = true;
                    zzkeVar = zzkeVar3;
                }
            }
            zzkeVar.m5839b();
            if (!zzkeVar2.isEmpty()) {
                zzkeVar.putAll(zzkeVar2);
            }
        }
        return zzkeVar;
    }

    /* JADX INFO: renamed from: b */
    public static void m24151b(Object obj, Object obj2) {
        zzke zzkeVar = (zzke) obj;
        if (obj2 != null) {
            ho2.m13383c();
            return;
        }
        if (zzkeVar.isEmpty()) {
            return;
        }
        Iterator it = zzkeVar.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw new NoSuchMethodError();
        }
    }
}
