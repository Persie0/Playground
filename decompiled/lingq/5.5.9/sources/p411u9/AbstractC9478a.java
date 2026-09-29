package p411u9;

import java.util.ArrayList;
import java.util.Arrays;
import p479xa.C10151t;

/* JADX INFO: renamed from: u9.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9478a {

    /* JADX INFO: renamed from: a */
    public final int f48603a;

    /* JADX INFO: renamed from: u9.a$a */
    public static final class a extends AbstractC9478a {

        /* JADX INFO: renamed from: b */
        public final long f48604b;

        /* JADX INFO: renamed from: c */
        public final ArrayList f48605c;

        /* JADX INFO: renamed from: d */
        public final ArrayList f48606d;

        public a(int i10, long j10) {
            super(i10);
            this.f48604b = j10;
            this.f48605c = new ArrayList();
            this.f48606d = new ArrayList();
        }

        /* JADX INFO: renamed from: b */
        public final a m17902b(int i10) {
            ArrayList arrayList = this.f48606d;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                a aVar = (a) arrayList.get(i11);
                if (aVar.f48603a == i10) {
                    return aVar;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: c */
        public final b m17903c(int i10) {
            ArrayList arrayList = this.f48605c;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = (b) arrayList.get(i11);
                if (bVar.f48603a == i10) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // p411u9.AbstractC9478a
        public final String toString() {
            return AbstractC9478a.m17901a(this.f48603a) + " leaves: " + Arrays.toString(this.f48605c.toArray()) + " containers: " + Arrays.toString(this.f48606d.toArray());
        }
    }

    /* JADX INFO: renamed from: u9.a$b */
    public static final class b extends AbstractC9478a {

        /* JADX INFO: renamed from: b */
        public final C10151t f48607b;

        public b(int i10, C10151t c10151t) {
            super(i10);
            this.f48607b = c10151t;
        }
    }

    public AbstractC9478a(int i10) {
        this.f48603a = i10;
    }

    /* JADX INFO: renamed from: a */
    public static String m17901a(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public String toString() {
        return m17901a(this.f48603a);
    }
}
