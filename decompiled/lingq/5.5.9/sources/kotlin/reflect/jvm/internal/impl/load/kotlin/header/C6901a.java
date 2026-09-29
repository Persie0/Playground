package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import in.InterfaceC6367k;
import java.util.ArrayList;
import java.util.HashMap;
import mn.C7645b;
import mn.C7646c;
import mn.C7648e;
import p373rn.C8874f;
import p465wm.C9971a;
import zm.C10534s;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C6901a implements InterfaceC6367k.c {

    /* JADX INFO: renamed from: i */
    public static final boolean f38916i = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));

    /* JADX INFO: renamed from: j */
    public static final HashMap f38917j;

    /* JADX INFO: renamed from: a */
    public int[] f38918a = null;

    /* JADX INFO: renamed from: b */
    public String f38919b = null;

    /* JADX INFO: renamed from: c */
    public int f38920c = 0;

    /* JADX INFO: renamed from: d */
    public String[] f38921d = null;

    /* JADX INFO: renamed from: e */
    public String[] f38922e = null;

    /* JADX INFO: renamed from: f */
    public String[] f38923f = null;

    /* JADX INFO: renamed from: g */
    public KotlinClassHeader.Kind f38924g = null;

    /* JADX INFO: renamed from: h */
    public String[] f38925h = null;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$a */
    public static abstract class a implements InterfaceC6367k.b {

        /* JADX INFO: renamed from: a */
        public final ArrayList f38926a = new ArrayList();

        @Override // in.InterfaceC6367k.b
        /* JADX INFO: renamed from: a */
        public final void mo12983a() {
            mo13779f((String[]) this.f38926a.toArray(new String[0]));
        }

        @Override // in.InterfaceC6367k.b
        /* JADX INFO: renamed from: b */
        public final void mo12984b(C7645b c7645b, C7648e c7648e) {
        }

        @Override // in.InterfaceC6367k.b
        /* JADX INFO: renamed from: c */
        public final InterfaceC6367k.a mo12985c(C7645b c7645b) {
            return null;
        }

        @Override // in.InterfaceC6367k.b
        /* JADX INFO: renamed from: d */
        public final void mo12986d(C8874f c8874f) {
        }

        @Override // in.InterfaceC6367k.b
        /* JADX INFO: renamed from: e */
        public final void mo12987e(Object obj) {
            if (obj instanceof String) {
                this.f38926a.add((String) obj);
            }
        }

        /* JADX INFO: renamed from: f */
        public abstract void mo13779f(String[] strArr);
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$b */
    public class b implements InterfaceC6367k.a {
        public b() {
        }

        @Override // in.InterfaceC6367k.a
        /* JADX INFO: renamed from: a */
        public final void mo12974a() {
        }

        @Override // in.InterfaceC6367k.a
        /* JADX INFO: renamed from: b */
        public final void mo12975b(C7648e c7648e, C8874f c8874f) {
        }

        @Override // in.InterfaceC6367k.a
        /* JADX INFO: renamed from: c */
        public final InterfaceC6367k.b mo12976c(C7648e c7648e) {
            String strM15235f = c7648e.m15235f();
            if ("d1".equals(strM15235f)) {
                return new C6902b(this);
            }
            if ("d2".equals(strM15235f)) {
                return new C6903c(this);
            }
            return null;
        }

        @Override // in.InterfaceC6367k.a
        /* JADX INFO: renamed from: d */
        public final void mo12977d(C7648e c7648e, C7645b c7645b, C7648e c7648e2) {
        }

        @Override // in.InterfaceC6367k.a
        /* JADX INFO: renamed from: e */
        public final void mo12978e(Object obj, C7648e c7648e) {
            String strM15235f = c7648e.m15235f();
            boolean zEquals = "k".equals(strM15235f);
            C6901a c6901a = C6901a.this;
            if (zEquals) {
                if (obj instanceof Integer) {
                    c6901a.f38924g = KotlinClassHeader.Kind.getById(((Integer) obj).intValue());
                    return;
                }
                return;
            }
            if ("mv".equals(strM15235f)) {
                if (obj instanceof int[]) {
                    c6901a.f38918a = (int[]) obj;
                    return;
                }
                return;
            }
            if ("xs".equals(strM15235f)) {
                if (obj instanceof String) {
                    c6901a.f38919b = (String) obj;
                }
            } else if ("xi".equals(strM15235f)) {
                if (obj instanceof Integer) {
                    c6901a.f38920c = ((Integer) obj).intValue();
                }
            } else if ("pn".equals(strM15235f) && (obj instanceof String)) {
                c6901a.getClass();
            }
        }

        @Override // in.InterfaceC6367k.a
        /* JADX INFO: renamed from: f */
        public final InterfaceC6367k.a mo12979f(C7645b c7645b, C7648e c7648e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$c */
    public class c implements InterfaceC6367k.a {
        public c() {
        }

        @Override // in.InterfaceC6367k.a
        /* JADX INFO: renamed from: a */
        public final void mo12974a() {
        }

        @Override // in.InterfaceC6367k.a
        /* JADX INFO: renamed from: b */
        public final void mo12975b(C7648e c7648e, C8874f c8874f) {
        }

        @Override // in.InterfaceC6367k.a
        /* JADX INFO: renamed from: c */
        public final InterfaceC6367k.b mo12976c(C7648e c7648e) {
            if ("b".equals(c7648e.m15235f())) {
                return new C6904d(this);
            }
            return null;
        }

        @Override // in.InterfaceC6367k.a
        /* JADX INFO: renamed from: d */
        public final void mo12977d(C7648e c7648e, C7645b c7645b, C7648e c7648e2) {
        }

        @Override // in.InterfaceC6367k.a
        /* JADX INFO: renamed from: e */
        public final void mo12978e(Object obj, C7648e c7648e) {
        }

        @Override // in.InterfaceC6367k.a
        /* JADX INFO: renamed from: f */
        public final InterfaceC6367k.a mo12979f(C7645b c7645b, C7648e c7648e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$d */
    public class d implements InterfaceC6367k.a {
        public d() {
        }

        @Override // in.InterfaceC6367k.a
        /* JADX INFO: renamed from: a */
        public final void mo12974a() {
        }

        @Override // in.InterfaceC6367k.a
        /* JADX INFO: renamed from: b */
        public final void mo12975b(C7648e c7648e, C8874f c8874f) {
        }

        @Override // in.InterfaceC6367k.a
        /* JADX INFO: renamed from: c */
        public final InterfaceC6367k.b mo12976c(C7648e c7648e) {
            String strM15235f = c7648e.m15235f();
            if ("data".equals(strM15235f) || "filePartClassNames".equals(strM15235f)) {
                return new C6905e(this);
            }
            if ("strings".equals(strM15235f)) {
                return new C6906f(this);
            }
            return null;
        }

        @Override // in.InterfaceC6367k.a
        /* JADX INFO: renamed from: d */
        public final void mo12977d(C7648e c7648e, C7645b c7645b, C7648e c7648e2) {
        }

        @Override // in.InterfaceC6367k.a
        /* JADX INFO: renamed from: e */
        public final void mo12978e(Object obj, C7648e c7648e) {
            String strM15235f = c7648e.m15235f();
            boolean zEquals = "version".equals(strM15235f);
            C6901a c6901a = C6901a.this;
            if (zEquals) {
                if (obj instanceof int[]) {
                    c6901a.f38918a = (int[]) obj;
                }
            } else if ("multifileClassName".equals(strM15235f)) {
                c6901a.f38919b = obj instanceof String ? (String) obj : null;
            }
        }

        @Override // in.InterfaceC6367k.a
        /* JADX INFO: renamed from: f */
        public final InterfaceC6367k.a mo12979f(C7645b c7645b, C7648e c7648e) {
            return null;
        }
    }

    static {
        HashMap map = new HashMap();
        f38917j = map;
        map.put(C7645b.m15203l(new C7646c("kotlin.jvm.internal.KotlinClass")), KotlinClassHeader.Kind.CLASS);
        map.put(C7645b.m15203l(new C7646c("kotlin.jvm.internal.KotlinFileFacade")), KotlinClassHeader.Kind.FILE_FACADE);
        map.put(C7645b.m15203l(new C7646c("kotlin.jvm.internal.KotlinMultifileClass")), KotlinClassHeader.Kind.MULTIFILE_CLASS);
        map.put(C7645b.m15203l(new C7646c("kotlin.jvm.internal.KotlinMultifileClassPart")), KotlinClassHeader.Kind.MULTIFILE_CLASS_PART);
        map.put(C7645b.m15203l(new C7646c("kotlin.jvm.internal.KotlinSyntheticClass")), KotlinClassHeader.Kind.SYNTHETIC_CLASS);
    }

    @Override // in.InterfaceC6367k.c
    /* JADX INFO: renamed from: a */
    public final void mo12972a() {
    }

    @Override // in.InterfaceC6367k.c
    /* JADX INFO: renamed from: b */
    public final InterfaceC6367k.a mo12973b(C7645b c7645b, C9971a c9971a) {
        KotlinClassHeader.Kind kind;
        C7646c c7646cM15204b = c7645b.m15204b();
        if (c7646cM15204b.equals(C10534s.f52534a)) {
            return new b();
        }
        if (c7646cM15204b.equals(C10534s.f52548o)) {
            return new c();
        }
        if (!f38916i && this.f38924g == null && (kind = (KotlinClassHeader.Kind) f38917j.get(c7645b)) != null) {
            this.f38924g = kind;
            return new d();
        }
        return null;
    }
}
