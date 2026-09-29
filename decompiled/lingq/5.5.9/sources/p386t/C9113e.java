package p386t;

import java.util.Iterator;
import java.util.Map;
import p081e0.InterfaceC5312g0;
import p081e0.InterfaceC5327o;
import p423v.C9614l;
import p423v.C9615m;
import p423v.InterfaceC9612j;

/* JADX INFO: renamed from: t.e */
/* JADX INFO: loaded from: classes.dex */
public final class C9113e implements InterfaceC5327o {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC5312g0 f47610a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Map f47611b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC9612j f47612c;

    public C9113e(InterfaceC5312g0 interfaceC5312g0, Map map, InterfaceC9612j interfaceC9612j) {
        this.f47610a = interfaceC5312g0;
        this.f47611b = map;
        this.f47612c = interfaceC9612j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p081e0.InterfaceC5327o
    /* JADX INFO: renamed from: a */
    public final void mo2504a() {
        InterfaceC5312g0 interfaceC5312g0 = this.f47610a;
        C9615m c9615m = (C9615m) interfaceC5312g0.getValue();
        InterfaceC9612j interfaceC9612j = this.f47612c;
        if (c9615m != null) {
            interfaceC9612j.mo18073a(new C9614l(c9615m));
            interfaceC5312g0.setValue(null);
        }
        Map map = this.f47611b;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            interfaceC9612j.mo18073a(new C9614l((C9615m) it.next()));
        }
        map.clear();
    }
}
