package p026b5;

import android.annotation.SuppressLint;

/* JADX INFO: renamed from: b5.i */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1316i {

    /* JADX INFO: renamed from: a */
    @SuppressLint({"SyntheticAccessor"})
    public static final a.c f8063a = new a.c();

    /* JADX INFO: renamed from: b */
    @SuppressLint({"SyntheticAccessor"})
    public static final a.b f8064b = new a.b();

    /* JADX INFO: renamed from: b5.i$a */
    public static abstract class a {

        /* JADX INFO: renamed from: b5.i$a$a, reason: collision with other inner class name */
        public static final class C10595a extends a {

            /* JADX INFO: renamed from: a */
            public final Throwable f8065a;

            public C10595a(Throwable th2) {
                this.f8065a = th2;
            }

            public final String toString() {
                return "FAILURE (" + this.f8065a.getMessage() + ")";
            }
        }

        /* JADX INFO: renamed from: b5.i$a$b */
        public static final class b extends a {
            public final String toString() {
                return "IN_PROGRESS";
            }
        }

        /* JADX INFO: renamed from: b5.i$a$c */
        public static final class c extends a {
            public final String toString() {
                return "SUCCESS";
            }
        }
    }
}
