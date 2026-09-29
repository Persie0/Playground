package p000;

import com.google.android.gms.internal.clearcut.zzdi;

/* JADX INFO: loaded from: classes2.dex */
public final class byb {
    /* JADX INFO: renamed from: a */
    public static zzdi m4226a(Object obj, Object obj2) {
        zzdi zzdiVar = (zzdi) obj;
        zzdi zzdiVar2 = (zzdi) obj2;
        if (!zzdiVar2.isEmpty()) {
            if (!zzdiVar.f11807a) {
                if (zzdiVar.isEmpty()) {
                    zzdiVar = new zzdi();
                } else {
                    zzdi zzdiVar3 = new zzdi(zzdiVar);
                    zzdiVar3.f11807a = true;
                    zzdiVar = zzdiVar3;
                }
            }
            zzdiVar.m5349a();
            if (!zzdiVar2.isEmpty()) {
                zzdiVar.putAll(zzdiVar2);
            }
        }
        return zzdiVar;
    }
}
