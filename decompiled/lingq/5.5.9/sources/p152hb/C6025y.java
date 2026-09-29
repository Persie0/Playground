package p152hb;

import android.content.Context;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C2542a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p071dc.InterfaceC5147f;
import p176ib.C6302x;

/* JADX INFO: renamed from: hb.y */
/* JADX INFO: loaded from: classes.dex */
public final class C6025y extends AbstractRunnableC5962d0 {

    /* JADX INFO: renamed from: b */
    public final Map<C2542a.e, C6016v> f35625b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C5966e0 f35626c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6025y(C5966e0 c5966e0, HashMap map) {
        super(c5966e0);
        this.f35626c = c5966e0;
        this.f35625b = map;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008f  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bd  */
    @Override // p152hb.AbstractRunnableC5962d0
    /* JADX INFO: renamed from: a */
    public final void mo12406a() {
        C5990m0 c5990m0;
        C6016v c6016v;
        InterfaceC5147f interfaceC5147f;
        C5966e0 c5966e0 = this.f35626c;
        C6302x c6302x = new C6302x(c5966e0.f35466d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Map<C2542a.e, C6016v> map = this.f35625b;
        for (C2542a.e eVar : map.keySet()) {
            if (!eVar.mo7547k() || map.get(eVar).f35607c) {
                arrayList2.add(eVar);
            } else {
                arrayList.add(eVar);
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        Context context = c5966e0.f35465c;
        int iM12932a = -1;
        int i10 = 0;
        if (zIsEmpty) {
            int size = arrayList2.size();
            do {
                if (i10 < size) {
                    iM12932a = c6302x.m12932a(context, (C2542a.e) arrayList2.get(i10));
                    i10++;
                }
            } while (iM12932a != 0);
            c5990m0 = c5966e0.f35463a;
            if (iM12932a != 0) {
                c5990m0.m12441j(new C6019w(this, c5966e0, new ConnectionResult(iM12932a, null)));
                return;
            }
            if (c5966e0.f35475m && (interfaceC5147f = c5966e0.f35473k) != null) {
                interfaceC5147f.mo10921u();
            }
            for (C2542a.e eVar2 : map.keySet()) {
                c6016v = map.get(eVar2);
                if (eVar2.mo7547k() || c6302x.m12932a(context, eVar2) == 0) {
                    eVar2.mo7538b(c6016v);
                } else {
                    c5990m0.m12441j(new C6022x(c5966e0, c6016v));
                }
            }
        }
        int size2 = arrayList.size();
        while (i10 < size2) {
            iM12932a = c6302x.m12932a(context, (C2542a.e) arrayList.get(i10));
            i10++;
            if (iM12932a != 0) {
                break;
            }
        }
        c5990m0 = c5966e0.f35463a;
        if (iM12932a != 0) {
            c5990m0.m12441j(new C6019w(this, c5966e0, new ConnectionResult(iM12932a, null)));
            return;
        }
        if (c5966e0.f35475m) {
            interfaceC5147f.mo10921u();
        }
        while (r3.hasNext()) {
            c6016v = map.get(eVar2);
            if (eVar2.mo7547k()) {
            }
            eVar2.mo7538b(c6016v);
        }
    }
}
