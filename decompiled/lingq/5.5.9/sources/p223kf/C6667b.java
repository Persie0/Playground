package p223kf;

import android.os.Trace;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import p118fe.C5511c;
import p118fe.C5528t;
import p118fe.InterfaceC5514f;
import p118fe.InterfaceC5515g;

/* JADX INFO: renamed from: kf.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6667b implements InterfaceC5515g {
    @Override // p118fe.InterfaceC5515g
    /* JADX INFO: renamed from: a */
    public final List<C5511c<?>> mo11755a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final C5511c<?> c5511c : componentRegistrar.getComponents()) {
            final String str = c5511c.f34150a;
            if (str != null) {
                c5511c = new C5511c<>(str, c5511c.f34151b, c5511c.f34152c, c5511c.f34153d, c5511c.f34154e, new InterfaceC5514f() { // from class: kf.a
                    @Override // p118fe.InterfaceC5514f
                    /* JADX INFO: renamed from: k */
                    public final Object mo35k(C5528t c5528t) {
                        String str2 = str;
                        C5511c c5511c2 = c5511c;
                        try {
                            Trace.beginSection(str2);
                            return c5511c2.f34155f.mo35k(c5528t);
                        } finally {
                            Trace.endSection();
                        }
                    }
                }, c5511c.f34156g);
            }
            arrayList.add(c5511c);
        }
        return arrayList;
    }
}
