package p176ib;

import java.util.ArrayList;

/* JADX INFO: renamed from: ib.g */
/* JADX INFO: loaded from: classes.dex */
public final class C6268g {

    /* JADX INFO: renamed from: ib.g$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final ArrayList f36465a;

        /* JADX INFO: renamed from: b */
        public final Object f36466b;

        public /* synthetic */ a(Object obj) {
            C6272i.m12915i(obj);
            this.f36466b = obj;
            this.f36465a = new ArrayList();
        }

        /* JADX INFO: renamed from: a */
        public final void m12906a(Object obj, String str) {
            this.f36465a.add(str + "=" + String.valueOf(obj));
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.f36466b.getClass().getSimpleName());
            sb2.append('{');
            ArrayList arrayList = this.f36465a;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append((String) arrayList.get(i10));
                if (i10 < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m12905a(Object obj, Object obj2) {
        boolean z10 = true;
        if (obj != obj2) {
            if (obj == null) {
                z10 = false;
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return z10;
    }
}
