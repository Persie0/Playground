package jp;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p124fp.C5608e;
import p250lp.InterfaceC7446w;
import retrofit2.C8778b;
import sl.C9072e;
import so.AbstractC9105w;
import so.AbstractC9107y;
import so.C9108z;

/* JADX INFO: renamed from: jp.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C6533a extends InterfaceC6538f.a {

    /* JADX INFO: renamed from: a */
    public boolean f37199a = true;

    /* JADX INFO: renamed from: jp.a$a */
    public static final class a implements InterfaceC6538f<AbstractC9107y, AbstractC9107y> {

        /* JADX INFO: renamed from: a */
        public static final a f37200a = new a();

        @Override // jp.InterfaceC6538f
        /* JADX INFO: renamed from: a */
        public final AbstractC9107y mo13122a(AbstractC9107y abstractC9107y) throws IOException {
            AbstractC9107y abstractC9107y2 = abstractC9107y;
            try {
                C5608e c5608e = new C5608e();
                abstractC9107y2.mo13138q().mo11948X(c5608e);
                return new C9108z(abstractC9107y2.mo13137l(), abstractC9107y2.mo13136b(), c5608e);
            } finally {
                abstractC9107y2.close();
            }
        }
    }

    /* JADX INFO: renamed from: jp.a$b */
    public static final class b implements InterfaceC6538f<AbstractC9105w, AbstractC9105w> {

        /* JADX INFO: renamed from: a */
        public static final b f37201a = new b();

        @Override // jp.InterfaceC6538f
        /* JADX INFO: renamed from: a */
        public final AbstractC9105w mo13122a(AbstractC9105w abstractC9105w) throws IOException {
            return abstractC9105w;
        }
    }

    /* JADX INFO: renamed from: jp.a$c */
    public static final class c implements InterfaceC6538f<AbstractC9107y, AbstractC9107y> {

        /* JADX INFO: renamed from: a */
        public static final c f37202a = new c();

        @Override // jp.InterfaceC6538f
        /* JADX INFO: renamed from: a */
        public final AbstractC9107y mo13122a(AbstractC9107y abstractC9107y) throws IOException {
            return abstractC9107y;
        }
    }

    /* JADX INFO: renamed from: jp.a$d */
    public static final class d implements InterfaceC6538f<Object, String> {

        /* JADX INFO: renamed from: a */
        public static final d f37203a = new d();

        @Override // jp.InterfaceC6538f
        /* JADX INFO: renamed from: a */
        public final String mo13122a(Object obj) throws IOException {
            return obj.toString();
        }
    }

    /* JADX INFO: renamed from: jp.a$e */
    public static final class e implements InterfaceC6538f<AbstractC9107y, C9072e> {

        /* JADX INFO: renamed from: a */
        public static final e f37204a = new e();

        @Override // jp.InterfaceC6538f
        /* JADX INFO: renamed from: a */
        public final C9072e mo13122a(AbstractC9107y abstractC9107y) throws IOException {
            abstractC9107y.close();
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: jp.a$f */
    public static final class f implements InterfaceC6538f<AbstractC9107y, Void> {

        /* JADX INFO: renamed from: a */
        public static final f f37205a = new f();

        @Override // jp.InterfaceC6538f
        /* JADX INFO: renamed from: a */
        public final Void mo13122a(AbstractC9107y abstractC9107y) throws IOException {
            abstractC9107y.close();
            return null;
        }
    }

    @Override // jp.InterfaceC6538f.a
    /* JADX INFO: renamed from: a */
    public final InterfaceC6538f mo13120a(Type type, Annotation[] annotationArr) {
        if (AbstractC9105w.class.isAssignableFrom(C8778b.m17027e(type))) {
            return b.f37201a;
        }
        return null;
    }

    @Override // jp.InterfaceC6538f.a
    /* JADX INFO: renamed from: b */
    public final InterfaceC6538f<AbstractC9107y, ?> mo13121b(Type type, Annotation[] annotationArr, C6554v c6554v) {
        if (type == AbstractC9107y.class) {
            return C8778b.m17030h(annotationArr, InterfaceC7446w.class) ? c.f37202a : a.f37200a;
        }
        if (type == Void.class) {
            return f.f37205a;
        }
        if (this.f37199a && type == C9072e.class) {
            try {
                return e.f37204a;
            } catch (NoClassDefFoundError unused) {
                this.f37199a = false;
            }
        }
        return null;
    }
}
