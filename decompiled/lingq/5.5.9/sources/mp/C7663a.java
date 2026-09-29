package mp;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import p385sf.C9000b;

/* JADX INFO: renamed from: mp.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C7663a {

    /* JADX INFO: renamed from: a */
    public static final b f42133a = new b();

    /* JADX INFO: renamed from: b */
    public static final ArrayList<c> f42134b = new ArrayList<>();

    /* JADX INFO: renamed from: mp.a$a */
    public static class a extends c {

        /* JADX INFO: renamed from: a */
        public final List<String> f42135a = C9000b.m17252r(C7663a.class.getName(), b.class.getName(), c.class.getName(), a.class.getName());

        static {
            Pattern.compile("(\\$\\d+)+$");
        }
    }

    /* JADX INFO: renamed from: mp.a$b */
    public static final class b extends c {
    }

    /* JADX INFO: renamed from: mp.a$c */
    public static abstract class c {
        public c() {
            new ThreadLocal();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C7663a() {
        throw new AssertionError();
    }
}
