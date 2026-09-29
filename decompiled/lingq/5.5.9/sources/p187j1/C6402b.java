package p187j1;

import android.content.res.Resources;
import androidx.activity.result.C0204c;
import dm.C5207g;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import p469x0.C10002c;

/* JADX INFO: renamed from: j1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6402b {

    /* JADX INFO: renamed from: a */
    public final HashMap<b, WeakReference<a>> f36862a = new HashMap<>();

    /* JADX INFO: renamed from: j1.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final C10002c f36863a;

        /* JADX INFO: renamed from: b */
        public final int f36864b;

        public a(C10002c c10002c, int i10) {
            this.f36863a = c10002c;
            this.f36864b = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (C5207g.m11106a(this.f36863a, aVar.f36863a) && this.f36864b == aVar.f36864b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f36864b) + (this.f36863a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ImageVectorEntry(imageVector=");
            sb2.append(this.f36863a);
            sb2.append(", configFlags=");
            return C0204c.m853l(sb2, this.f36864b, ')');
        }
    }

    /* JADX INFO: renamed from: j1.b$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final Resources.Theme f36865a;

        /* JADX INFO: renamed from: b */
        public final int f36866b;

        public b(int i10, Resources.Theme theme) {
            this.f36865a = theme;
            this.f36866b = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C5207g.m11106a(this.f36865a, bVar.f36865a) && this.f36866b == bVar.f36866b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f36866b) + (this.f36865a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Key(theme=");
            sb2.append(this.f36865a);
            sb2.append(", id=");
            return C0204c.m853l(sb2, this.f36866b, ')');
        }
    }
}
