package p000;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: ch */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0089ch implements InterfaceC0918pw {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0111cq f5713a;

    public C0089ch(C0111cq c0111cq) {
        this.f5713a = c0111cq;
    }

    @Override // p000.InterfaceC0918pw
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo3666a(Object obj) {
        Map map = (Map) obj;
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = true != ((Boolean) arrayList.get(i)).booleanValue() ? -1 : 0;
        }
        C0095cn c0095cn = (C0095cn) this.f5713a.f8796p.pollFirst();
        if (c0095cn == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("No permissions were requested for ");
            sb.append(this);
            Log.w("FragmentManager", "No permissions were requested for ".concat(toString()));
            return;
        }
        String str = c0095cn.f6333a;
        if (this.f5713a.f8781a.m5547c(str) == null) {
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment ".concat(String.valueOf(str)));
        }
    }
}
