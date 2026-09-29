package p474x5;

import java.util.HashMap;
import java.util.List;
import p272n6.C7709a;

/* JADX INFO: renamed from: x5.q */
/* JADX INFO: loaded from: classes.dex */
public final class C10092q {

    /* JADX INFO: renamed from: a */
    public final C10094s f51182a;

    /* JADX INFO: renamed from: b */
    public final a f51183b;

    /* JADX INFO: renamed from: x5.q$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final HashMap f51184a = new HashMap();

        /* JADX INFO: renamed from: x5.q$a$a, reason: collision with other inner class name */
        public static class C10683a<Model> {

            /* JADX INFO: renamed from: a */
            public final List<InterfaceC10090o<Model, ?>> f51185a;

            public C10683a(List<InterfaceC10090o<Model, ?>> list) {
                this.f51185a = list;
            }
        }
    }

    public C10092q(C7709a.c cVar) {
        C10094s c10094s = new C10094s(cVar);
        this.f51183b = new a();
        this.f51182a = c10094s;
    }
}
