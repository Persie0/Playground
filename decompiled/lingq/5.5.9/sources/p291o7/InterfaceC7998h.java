package p291o7;

import android.content.Intent;
import dm.C5207g;
import p003a2.C0009a;

/* JADX INFO: renamed from: o7.h */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC7998h {

    /* JADX INFO: renamed from: o7.h$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f43535a;

        /* JADX INFO: renamed from: b */
        public final int f43536b;

        /* JADX INFO: renamed from: c */
        public final Intent f43537c;

        public a(int i10, int i11, Intent intent) {
            this.f43535a = i10;
            this.f43536b = i11;
            this.f43537c = intent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f43535a == aVar.f43535a && this.f43536b == aVar.f43536b && C5207g.m11106a(this.f43537c, aVar.f43537c);
        }

        public final int hashCode() {
            int iM16d = C0009a.m16d(this.f43536b, Integer.hashCode(this.f43535a) * 31, 31);
            Intent intent = this.f43537c;
            return iM16d + (intent == null ? 0 : intent.hashCode());
        }

        public final String toString() {
            return "ActivityResultParameters(requestCode=" + this.f43535a + ", resultCode=" + this.f43536b + ", data=" + this.f43537c + ')';
        }
    }

    /* JADX INFO: renamed from: a */
    boolean mo6662a(int i10, int i11, Intent intent);
}
