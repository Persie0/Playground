package p130g4;

import android.graphics.Color;
import java.util.Arrays;
import p312p2.C8169a;

/* JADX INFO: renamed from: g4.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5695b {

    /* JADX INFO: renamed from: a */
    public static final a f34688a = new a();

    /* JADX INFO: renamed from: g4.b$a */
    public static class a implements b {
        @Override // p130g4.C5695b.b
        /* JADX INFO: renamed from: a */
        public final boolean mo12059a(float[] fArr) {
            float f3 = fArr[2];
            if (!(f3 >= 0.95f)) {
                if (!(f3 <= 0.05f)) {
                    float f10 = fArr[0];
                    if (!(f10 >= 10.0f && f10 <= 37.0f && fArr[1] <= 0.82f)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: g4.b$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        boolean mo12059a(float[] fArr);
    }

    /* JADX INFO: renamed from: g4.b$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final int f34689a;

        /* JADX INFO: renamed from: b */
        public final int f34690b;

        /* JADX INFO: renamed from: c */
        public final int f34691c;

        /* JADX INFO: renamed from: d */
        public final int f34692d;

        /* JADX INFO: renamed from: e */
        public final int f34693e;

        /* JADX INFO: renamed from: f */
        public boolean f34694f;

        /* JADX INFO: renamed from: g */
        public int f34695g;

        /* JADX INFO: renamed from: h */
        public int f34696h;

        /* JADX INFO: renamed from: i */
        public float[] f34697i;

        public c(int i10, int i11) {
            this.f34689a = Color.red(i10);
            this.f34690b = Color.green(i10);
            this.f34691c = Color.blue(i10);
            this.f34692d = i10;
            this.f34693e = i11;
        }

        /* JADX INFO: renamed from: a */
        public final void m12060a() {
            if (!this.f34694f) {
                int i10 = this.f34692d;
                int iM16214f = C8169a.m16214f(4.5f, -1, i10);
                int iM16214f2 = C8169a.m16214f(3.0f, -1, i10);
                if (iM16214f != -1 && iM16214f2 != -1) {
                    this.f34696h = C8169a.m16216h(-1, iM16214f);
                    this.f34695g = C8169a.m16216h(-1, iM16214f2);
                    this.f34694f = true;
                    return;
                }
                int iM16214f3 = C8169a.m16214f(4.5f, -16777216, i10);
                int iM16214f4 = C8169a.m16214f(3.0f, -16777216, i10);
                if (iM16214f3 != -1 && iM16214f4 != -1) {
                    this.f34696h = C8169a.m16216h(-16777216, iM16214f3);
                    this.f34695g = C8169a.m16216h(-16777216, iM16214f4);
                    this.f34694f = true;
                } else {
                    this.f34696h = iM16214f != -1 ? C8169a.m16216h(-1, iM16214f) : C8169a.m16216h(-16777216, iM16214f3);
                    this.f34695g = iM16214f2 != -1 ? C8169a.m16216h(-1, iM16214f2) : C8169a.m16216h(-16777216, iM16214f4);
                    this.f34694f = true;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public final float[] m12061b() {
            if (this.f34697i == null) {
                this.f34697i = new float[3];
            }
            C8169a.m16209a(this.f34689a, this.f34690b, this.f34691c, this.f34697i);
            return this.f34697i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.f34693e == cVar.f34693e && this.f34692d == cVar.f34692d;
        }

        public final int hashCode() {
            return (this.f34692d * 31) + this.f34693e;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(c.class.getSimpleName());
            sb2.append(" [RGB: #");
            sb2.append(Integer.toHexString(this.f34692d));
            sb2.append("] [HSL: ");
            sb2.append(Arrays.toString(m12061b()));
            sb2.append("] [Population: ");
            sb2.append(this.f34693e);
            sb2.append("] [Title Text: #");
            m12060a();
            sb2.append(Integer.toHexString(this.f34695g));
            sb2.append("] [Body Text: #");
            m12060a();
            sb2.append(Integer.toHexString(this.f34696h));
            sb2.append(']');
            return sb2.toString();
        }
    }
}
