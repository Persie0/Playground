package p289o5;

import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzu;
import java.util.ArrayList;

/* JADX INFO: renamed from: o5.d */
/* JADX INFO: loaded from: classes.dex */
public final class C7924d {

    /* JADX INFO: renamed from: a */
    public boolean f43170a;

    /* JADX INFO: renamed from: b */
    public String f43171b;

    /* JADX INFO: renamed from: c */
    public String f43172c;

    /* JADX INFO: renamed from: d */
    public b f43173d;

    /* JADX INFO: renamed from: e */
    public zzu f43174e;

    /* JADX INFO: renamed from: f */
    public ArrayList f43175f;

    /* JADX INFO: renamed from: g */
    public boolean f43176g;

    /* JADX INFO: renamed from: o5.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final C7926f f43177a;

        /* JADX INFO: renamed from: b */
        public final String f43178b;

        /* JADX INFO: renamed from: o5.d$a$a, reason: collision with other inner class name */
        public static class C10664a {

            /* JADX INFO: renamed from: a */
            public C7926f f43179a;

            /* JADX INFO: renamed from: b */
            public String f43180b;
        }

        public /* synthetic */ a(C10664a c10664a) {
            this.f43177a = c10664a.f43179a;
            this.f43178b = c10664a.f43180b;
        }
    }

    /* JADX INFO: renamed from: o5.d$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public String f43181a;

        /* JADX INFO: renamed from: b */
        public int f43182b = 0;

        /* JADX INFO: renamed from: o5.d$b$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            public String f43183a;

            /* JADX INFO: renamed from: b */
            public boolean f43184b;

            /* JADX INFO: renamed from: c */
            public int f43185c = 0;

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            /* JADX INFO: renamed from: a */
            public final b m15743a() {
                boolean z10 = (TextUtils.isEmpty(this.f43183a) && TextUtils.isEmpty(null)) ? false : true;
                boolean z11 = !TextUtils.isEmpty(null);
                if (z10 && z11) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!this.f43184b && !z10 && !z11) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                b bVar = new b();
                bVar.f43181a = this.f43183a;
                bVar.f43182b = this.f43185c;
                return bVar;
            }
        }
    }
}
