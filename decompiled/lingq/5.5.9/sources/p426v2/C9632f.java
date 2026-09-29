package p426v2;

/* JADX INFO: renamed from: v2.f */
/* JADX INFO: loaded from: classes.dex */
public final class C9632f {

    /* JADX INFO: renamed from: a */
    public static final d f49321a = new d(null, false);

    /* JADX INFO: renamed from: b */
    public static final d f49322b = new d(null, true);

    /* JADX INFO: renamed from: c */
    public static final d f49323c;

    /* JADX INFO: renamed from: d */
    public static final d f49324d;

    /* JADX INFO: renamed from: v2.f$a */
    public static class a implements b {

        /* JADX INFO: renamed from: a */
        public static final a f49325a = new a();

        /* JADX WARN: Code duplicated, block: B:13:0x0023  */
        @Override // p426v2.C9632f.b
        /* JADX INFO: renamed from: a */
        public final int mo18106a(CharSequence charSequence, int i10) {
            int i11 = i10 + 0;
            int i12 = 2;
            for (int i13 = 0; i13 < i11 && i12 == 2; i13++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i13));
                d dVar = C9632f.f49321a;
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                i12 = 0;
                                break;
                            default:
                                i12 = 2;
                                break;
                        }
                    } else {
                        i12 = 0;
                    }
                }
                i12 = 1;
            }
            return i12;
        }
    }

    /* JADX INFO: renamed from: v2.f$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        int mo18106a(CharSequence charSequence, int i10);
    }

    /* JADX INFO: renamed from: v2.f$c */
    public static abstract class c implements InterfaceC9631e {

        /* JADX INFO: renamed from: a */
        public final b f49326a;

        public c(a aVar) {
            this.f49326a = aVar;
        }

        /* JADX INFO: renamed from: a */
        public abstract boolean mo18107a();

        /* JADX INFO: renamed from: b */
        public final boolean m18108b(CharSequence charSequence, int i10) {
            if (charSequence == null || i10 < 0 || charSequence.length() - i10 < 0) {
                throw new IllegalArgumentException();
            }
            b bVar = this.f49326a;
            if (bVar == null) {
                return mo18107a();
            }
            int iMo18106a = bVar.mo18106a(charSequence, i10);
            if (iMo18106a == 0) {
                return true;
            }
            if (iMo18106a != 1) {
                return mo18107a();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: v2.f$d */
    public static class d extends c {

        /* JADX INFO: renamed from: b */
        public final boolean f49327b;

        public d(a aVar, boolean z10) {
            super(aVar);
            this.f49327b = z10;
        }

        @Override // p426v2.C9632f.c
        /* JADX INFO: renamed from: a */
        public final boolean mo18107a() {
            return this.f49327b;
        }
    }

    static {
        a aVar = a.f49325a;
        f49323c = new d(aVar, false);
        f49324d = new d(aVar, true);
    }
}
