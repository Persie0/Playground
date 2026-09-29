package p372rm;

import kotlin.collections.builders.MapBuilder;

/* JADX INFO: renamed from: rm.p0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8857p0 {

    /* JADX INFO: renamed from: a */
    public static final MapBuilder f46752a;

    /* JADX INFO: renamed from: rm.p0$a */
    public static final class a extends AbstractC8859q0 {

        /* JADX INFO: renamed from: c */
        public static final a f46753c = new a();

        public a() {
            super("inherited", false);
        }
    }

    /* JADX INFO: renamed from: rm.p0$b */
    public static final class b extends AbstractC8859q0 {

        /* JADX INFO: renamed from: c */
        public static final b f46754c = new b();

        public b() {
            super("internal", false);
        }
    }

    /* JADX INFO: renamed from: rm.p0$c */
    public static final class c extends AbstractC8859q0 {

        /* JADX INFO: renamed from: c */
        public static final c f46755c = new c();

        public c() {
            super("invisible_fake", false);
        }
    }

    /* JADX INFO: renamed from: rm.p0$d */
    public static final class d extends AbstractC8859q0 {

        /* JADX INFO: renamed from: c */
        public static final d f46756c = new d();

        public d() {
            super("local", false);
        }
    }

    /* JADX INFO: renamed from: rm.p0$e */
    public static final class e extends AbstractC8859q0 {

        /* JADX INFO: renamed from: c */
        public static final e f46757c = new e();

        public e() {
            super("private", false);
        }
    }

    /* JADX INFO: renamed from: rm.p0$f */
    public static final class f extends AbstractC8859q0 {

        /* JADX INFO: renamed from: c */
        public static final f f46758c = new f();

        public f() {
            super("private_to_this", false);
        }

        @Override // p372rm.AbstractC8859q0
        /* JADX INFO: renamed from: b */
        public final String mo17116b() {
            return "private/*private to this*/";
        }
    }

    /* JADX INFO: renamed from: rm.p0$g */
    public static final class g extends AbstractC8859q0 {

        /* JADX INFO: renamed from: c */
        public static final g f46759c = new g();

        public g() {
            super("protected", true);
        }
    }

    /* JADX INFO: renamed from: rm.p0$h */
    public static final class h extends AbstractC8859q0 {

        /* JADX INFO: renamed from: c */
        public static final h f46760c = new h();

        public h() {
            super("public", true);
        }
    }

    /* JADX INFO: renamed from: rm.p0$i */
    public static final class i extends AbstractC8859q0 {

        /* JADX INFO: renamed from: c */
        public static final i f46761c = new i();

        public i() {
            super("unknown", false);
        }
    }

    static {
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put(f.f46758c, 0);
        mapBuilder.put(e.f46757c, 0);
        mapBuilder.put(b.f46754c, 1);
        mapBuilder.put(g.f46759c, 1);
        mapBuilder.put(h.f46760c, 2);
        mapBuilder.m13403b();
        mapBuilder.f38069l = true;
        f46752a = mapBuilder;
    }
}
