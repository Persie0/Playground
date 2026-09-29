package p466wn;

/* JADX INFO: renamed from: wn.c */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9980c {

    /* JADX INFO: renamed from: wn.c$a */
    public static final class a extends AbstractC9980c {

        /* JADX INFO: renamed from: a */
        public static final a f50708a = new a();

        /* JADX INFO: renamed from: b */
        public static final int f50709b;

        static {
            C9981d.a aVar = C9981d.f50711c;
            aVar.getClass();
            int i10 = C9981d.f50719k;
            aVar.getClass();
            int i11 = C9981d.f50717i;
            aVar.getClass();
            f50709b = (~(C9981d.f50718j | i11)) & i10;
        }

        @Override // p466wn.AbstractC9980c
        /* JADX INFO: renamed from: a */
        public final int mo18556a() {
            return f50709b;
        }
    }

    /* JADX INFO: renamed from: wn.c$b */
    public static final class b extends AbstractC9980c {

        /* JADX INFO: renamed from: a */
        public static final b f50710a = new b();

        @Override // p466wn.AbstractC9980c
        /* JADX INFO: renamed from: a */
        public final int mo18556a() {
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo18556a();

    public final String toString() {
        return getClass().getSimpleName();
    }
}
