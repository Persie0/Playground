package p200jf;

import android.content.Context;
import p118fe.C5509a;
import p118fe.C5511c;
import p118fe.C5521m;
import p118fe.C5528t;
import p118fe.InterfaceC5514f;

/* JADX INFO: renamed from: jf.f */
/* JADX INFO: loaded from: classes.dex */
public final class C6474f {

    /* JADX INFO: renamed from: jf.f$a */
    public interface a<T> {
        /* JADX INFO: renamed from: e */
        String mo12176e(Context context);
    }

    /* JADX INFO: renamed from: a */
    public static C5511c<?> m13081a(String str, String str2) {
        C6469a c6469a = new C6469a(str, str2);
        C5511c.a aVarM11743a = C5511c.m11743a(AbstractC6472d.class);
        aVarM11743a.f34161e = 1;
        aVarM11743a.f34162f = new C5509a(0, c6469a);
        return aVarM11743a.m11746b();
    }

    /* JADX INFO: renamed from: b */
    public static C5511c<?> m13082b(final String str, final a<Context> aVar) {
        C5511c.a aVarM11743a = C5511c.m11743a(AbstractC6472d.class);
        aVarM11743a.f34161e = 1;
        aVarM11743a.m11745a(C5521m.m11761a(Context.class));
        aVarM11743a.f34162f = new InterfaceC5514f() { // from class: jf.e
            @Override // p118fe.InterfaceC5514f
            /* JADX INFO: renamed from: k */
            public final Object mo35k(C5528t c5528t) {
                return new C6469a(str, aVar.mo12176e((Context) c5528t.mo11748a(Context.class)));
            }
        };
        return aVarM11743a.m11746b();
    }
}
