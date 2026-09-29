package p404u2;

import java.util.ArrayList;
import p326q.C8452h;
import p446w2.InterfaceC9803a;

/* JADX INFO: renamed from: u2.j */
/* JADX INFO: loaded from: classes.dex */
public final class C9390j implements InterfaceC9803a<C9391k.a> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f48193a;

    public C9390j(String str) {
        this.f48193a = str;
    }

    @Override // p446w2.InterfaceC9803a
    /* JADX INFO: renamed from: a */
    public final void mo3724a(C9391k.a aVar) {
        C9391k.a aVar2 = aVar;
        synchronized (C9391k.f48196c) {
            C8452h<String, ArrayList<InterfaceC9803a<C9391k.a>>> c8452h = C9391k.f48197d;
            ArrayList<InterfaceC9803a<C9391k.a>> orDefault = c8452h.getOrDefault(this.f48193a, null);
            if (orDefault == null) {
                return;
            }
            c8452h.remove(this.f48193a);
            for (int i10 = 0; i10 < orDefault.size(); i10++) {
                orDefault.get(i10).mo3724a(aVar2);
            }
        }
    }
}
