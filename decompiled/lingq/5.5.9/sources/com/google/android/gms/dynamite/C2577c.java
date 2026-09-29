package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.dynamite.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2577c implements DynamiteModule.InterfaceC2574a {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC2574a
    /* JADX INFO: renamed from: a */
    public final DynamiteModule.InterfaceC2574a.b mo7632a(Context context, String str, DynamiteModule.InterfaceC2574a.a aVar) throws DynamiteModule.LoadingException {
        int iMo7633a;
        DynamiteModule.InterfaceC2574a.b bVar = new DynamiteModule.InterfaceC2574a.b();
        int iMo7634b = aVar.mo7634b(context, str);
        bVar.f14037a = iMo7634b;
        int i10 = 0;
        if (iMo7634b != 0) {
            iMo7633a = aVar.mo7633a(context, str, false);
            bVar.f14038b = iMo7633a;
        } else {
            iMo7633a = aVar.mo7633a(context, str, true);
            bVar.f14038b = iMo7633a;
        }
        int i11 = bVar.f14037a;
        if (i11 == 0) {
            if (iMo7633a == 0) {
                bVar.f14039c = 0;
            }
            return bVar;
        }
        i10 = i11;
        if (i10 >= iMo7633a) {
            bVar.f14039c = -1;
        } else {
            bVar.f14039c = 1;
        }
        return bVar;
    }
}
