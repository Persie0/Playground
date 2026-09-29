package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.dynamite.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2576b implements DynamiteModule.InterfaceC2574a {
    /* JADX WARN: Code duplicated, block: B:7:0x0025 A[DONT_INVERT, PHI: r6
      0x0025: PHI (r6v2 int) = (r6v1 int), (r6v3 int) binds: [B:3:0x001a, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x0027  */
    /* JADX WARN: Code duplicated, block: B:9:0x002e  */
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC2574a
    /* JADX INFO: renamed from: a */
    public final DynamiteModule.InterfaceC2574a.b mo7632a(Context context, String str, DynamiteModule.InterfaceC2574a.a aVar) throws DynamiteModule.LoadingException {
        DynamiteModule.InterfaceC2574a.b bVar = new DynamiteModule.InterfaceC2574a.b();
        bVar.f14037a = aVar.mo7634b(context, str);
        int iMo7633a = aVar.mo7633a(context, str, true);
        bVar.f14038b = iMo7633a;
        int i10 = bVar.f14037a;
        if (i10 == 0) {
            i10 = 0;
            if (iMo7633a == 0) {
                bVar.f14039c = 0;
            } else if (i10 >= iMo7633a) {
                bVar.f14039c = -1;
            } else {
                bVar.f14039c = 1;
            }
        } else if (i10 >= iMo7633a) {
            bVar.f14039c = -1;
        } else {
            bVar.f14039c = 1;
        }
        return bVar;
    }
}
