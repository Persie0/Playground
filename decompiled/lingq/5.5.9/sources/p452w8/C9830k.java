package p452w8;

import android.content.Context;
import java.util.concurrent.Executor;
import p030b9.C1346e;
import p030b9.C1347f;
import p045c9.C1754h;
import p045c9.C1756j;
import p068d9.C5104r;
import p068d9.C5105s;
import p068d9.C5111y;
import p113f9.C5479b;
import p113f9.C5480c;
import p371rl.InterfaceC8825a;
import p477x8.C10121h;
import p477x8.C10123j;
import p503y8.C10305a;
import p503y8.C10307c;

/* JADX INFO: renamed from: w8.k */
/* JADX INFO: loaded from: classes.dex */
public final class C9830k extends AbstractC9843x {

    /* JADX INFO: renamed from: a */
    public InterfaceC8825a<Executor> f50031a = C10305a.m19313a(C9834o.a.f50040a);

    /* JADX INFO: renamed from: b */
    public C10307c f50032b;

    /* JADX INFO: renamed from: c */
    public InterfaceC8825a f50033c;

    /* JADX INFO: renamed from: d */
    public C5111y f50034d;

    /* JADX INFO: renamed from: e */
    public InterfaceC8825a<String> f50035e;

    /* JADX INFO: renamed from: f */
    public InterfaceC8825a<C5104r> f50036f;

    /* JADX INFO: renamed from: g */
    public InterfaceC8825a<C9842w> f50037g;

    public C9830k(Context context) {
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        C10307c c10307c = new C10307c(context);
        this.f50032b = c10307c;
        C5479b c5479b = C5479b.a.f34066a;
        C5480c c5480c = C5480c.a.f34067a;
        this.f50033c = C10305a.m19313a(new C10123j(c10307c, new C10121h(c10307c)));
        C10307c c10307c2 = this.f50032b;
        this.f50034d = new C5111y(c10307c2);
        InterfaceC8825a<String> interfaceC8825aM19313a = C10305a.m19313a(new C1346e(c10307c2, 1));
        this.f50035e = interfaceC8825aM19313a;
        InterfaceC8825a<C5104r> interfaceC8825aM19313a2 = C10305a.m19313a(new C5105s(this.f50034d, interfaceC8825aM19313a));
        this.f50036f = interfaceC8825aM19313a2;
        C1346e c1346e = new C1346e(c5479b, 0);
        C10307c c10307c3 = this.f50032b;
        C1347f c1347f = new C1347f(c10307c3, interfaceC8825aM19313a2, c1346e);
        InterfaceC8825a<Executor> interfaceC8825a = this.f50031a;
        InterfaceC8825a interfaceC8825a2 = this.f50033c;
        this.f50037g = C10305a.m19313a(new C9844y(c5479b, c5480c, new C9844y(interfaceC8825a, interfaceC8825a2, c1347f, interfaceC8825aM19313a2, interfaceC8825aM19313a2, 1), new C1754h(c10307c3, interfaceC8825a2, interfaceC8825aM19313a2, c1347f, interfaceC8825a, interfaceC8825aM19313a2, interfaceC8825aM19313a2), new C1756j(interfaceC8825a, interfaceC8825aM19313a2, c1347f, interfaceC8825aM19313a2), 0));
    }
}
