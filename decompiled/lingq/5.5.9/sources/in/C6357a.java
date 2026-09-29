package in;

import dm.C5207g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader;
import mn.C7645b;
import mn.C7648e;
import p465wm.C9971a;

/* JADX INFO: renamed from: in.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C6357a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractBinaryClassAnnotationAndConstantLoader<Object, Object> f36706a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ HashMap<C6370n, List<Object>> f36707b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC6367k f36708c;

    /* JADX INFO: renamed from: in.a$a */
    public final class a extends b {
        public a(C6370n c6370n) {
            super(c6370n);
        }

        /* JADX INFO: renamed from: c */
        public final C6361e m12971c(int i10, C7645b c7645b, C9971a c9971a) {
            C6370n c6370n = this.f36710a;
            C5207g.m11111f(c6370n, "signature");
            C6370n c6370n2 = new C6370n(c6370n.f36759a + '@' + i10);
            C6357a c6357a = C6357a.this;
            List<Object> arrayList = c6357a.f36707b.get(c6370n2);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                c6357a.f36707b.put(c6370n2, arrayList);
            }
            return c6357a.f36706a.m13765t(c7645b, c9971a, arrayList);
        }
    }

    /* JADX INFO: renamed from: in.a$b */
    public class b implements InterfaceC6367k.c {

        /* JADX INFO: renamed from: a */
        public final C6370n f36710a;

        /* JADX INFO: renamed from: b */
        public final ArrayList<Object> f36711b = new ArrayList<>();

        public b(C6370n c6370n) {
            this.f36710a = c6370n;
        }

        @Override // in.InterfaceC6367k.c
        /* JADX INFO: renamed from: a */
        public final void mo12972a() {
            ArrayList<Object> arrayList = this.f36711b;
            if (!arrayList.isEmpty()) {
                C6357a.this.f36707b.put(this.f36710a, arrayList);
            }
        }

        @Override // in.InterfaceC6367k.c
        /* JADX INFO: renamed from: b */
        public final InterfaceC6367k.a mo12973b(C7645b c7645b, C9971a c9971a) {
            return C6357a.this.f36706a.m13765t(c7645b, c9971a, this.f36711b);
        }
    }

    public C6357a(AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader, HashMap map, InterfaceC6367k interfaceC6367k, HashMap map2) {
        this.f36706a = abstractBinaryClassAnnotationAndConstantLoader;
        this.f36707b = map;
        this.f36708c = interfaceC6367k;
    }

    /* JADX INFO: renamed from: a */
    public final b m12969a(C7648e c7648e, String str) {
        C5207g.m11111f(str, "desc");
        String strM15235f = c7648e.m15235f();
        C5207g.m11110e(strM15235f, "name.asString()");
        return new b(new C6370n(strM15235f + '#' + str));
    }

    /* JADX INFO: renamed from: b */
    public final a m12970b(C7648e c7648e, String str) {
        C5207g.m11111f(c7648e, "name");
        String strM15235f = c7648e.m15235f();
        C5207g.m11110e(strM15235f, "name.asString()");
        return new a(new C6370n(strM15235f.concat(str)));
    }
}
