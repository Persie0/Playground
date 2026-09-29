package p465wm;

import dm.C5207g;
import gn.InterfaceC5832l;
import p123fn.InterfaceC5593a;
import p123fn.InterfaceC5594b;
import p491xm.AbstractC10238m;

/* JADX INFO: renamed from: wm.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C9977g implements InterfaceC5594b {

    /* JADX INFO: renamed from: a */
    public static final C9977g f50704a = new C9977g();

    /* JADX INFO: renamed from: wm.g$a */
    public static final class a implements InterfaceC5593a {

        /* JADX INFO: renamed from: b */
        public final AbstractC10238m f50705b;

        public a(AbstractC10238m abstractC10238m) {
            C5207g.m11111f(abstractC10238m, "javaElement");
            this.f50705b = abstractC10238m;
        }

        @Override // p372rm.InterfaceC8837f0
        /* JADX INFO: renamed from: a */
        public final void mo12989a() {
        }

        @Override // p123fn.InterfaceC5593a
        /* JADX INFO: renamed from: b */
        public final AbstractC10238m mo11842b() {
            return this.f50705b;
        }

        public final String toString() {
            return a.class.getName() + ": " + this.f50705b;
        }
    }

    @Override // p123fn.InterfaceC5594b
    /* JADX INFO: renamed from: a */
    public final a mo11843a(InterfaceC5832l interfaceC5832l) {
        C5207g.m11111f(interfaceC5832l, "javaElement");
        return new a((AbstractC10238m) interfaceC5832l);
    }
}
