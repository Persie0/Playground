package p000;

import android.graphics.Color;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class c37 {

    /* JADX INFO: renamed from: a */
    public final int f9414a;

    /* JADX INFO: renamed from: b */
    public final int f9415b;

    /* JADX INFO: renamed from: c */
    public final int f9416c;

    /* JADX INFO: renamed from: d */
    public final int f9417d;

    /* JADX INFO: renamed from: e */
    public final int f9418e;

    /* JADX INFO: renamed from: f */
    public boolean f9419f;

    /* JADX INFO: renamed from: g */
    public int f9420g;

    /* JADX INFO: renamed from: h */
    public int f9421h;

    /* JADX INFO: renamed from: i */
    public float[] f9422i;

    public c37(int i, int i2) {
        this.f9414a = Color.red(i);
        this.f9415b = Color.green(i);
        this.f9416c = Color.blue(i);
        this.f9417d = i;
        this.f9418e = i2;
    }

    /* JADX INFO: renamed from: a */
    public final void m4299a() {
        if (this.f9419f) {
            return;
        }
        int i = this.f9417d;
        int iM25013f = ya1.m25013f(-1, 4.5f, i);
        int iM25013f2 = ya1.m25013f(-1, 3.0f, i);
        if (iM25013f != -1 && iM25013f2 != -1) {
            this.f9421h = ya1.m25016i(-1, iM25013f);
            this.f9420g = ya1.m25016i(-1, iM25013f2);
            this.f9419f = true;
            return;
        }
        int iM25013f3 = ya1.m25013f(-16777216, 4.5f, i);
        int iM25013f4 = ya1.m25013f(-16777216, 3.0f, i);
        if (iM25013f3 == -1 || iM25013f4 == -1) {
            this.f9421h = iM25013f != -1 ? ya1.m25016i(-1, iM25013f) : ya1.m25016i(-16777216, iM25013f3);
            this.f9420g = iM25013f2 != -1 ? ya1.m25016i(-1, iM25013f2) : ya1.m25016i(-16777216, iM25013f4);
            this.f9419f = true;
        } else {
            this.f9421h = ya1.m25016i(-16777216, iM25013f3);
            this.f9420g = ya1.m25016i(-16777216, iM25013f4);
            this.f9419f = true;
        }
    }

    /* JADX INFO: renamed from: b */
    public final float[] m4300b() {
        if (this.f9422i == null) {
            this.f9422i = new float[3];
        }
        ya1.m25008a(this.f9414a, this.f9415b, this.f9416c, this.f9422i);
        return this.f9422i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c37.class == obj.getClass()) {
            c37 c37Var = (c37) obj;
            if (this.f9418e == c37Var.f9418e && this.f9417d == c37Var.f9417d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f9417d * 31) + this.f9418e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(c37.class.getSimpleName());
        sb.append(" [RGB: #");
        sb.append(Integer.toHexString(this.f9417d));
        sb.append("] [HSL: ");
        sb.append(Arrays.toString(m4300b()));
        sb.append("] [Population: ");
        sb.append(this.f9418e);
        sb.append("] [Title Text: #");
        m4299a();
        sb.append(Integer.toHexString(this.f9420g));
        sb.append("] [Body Text: #");
        m4299a();
        sb.append(Integer.toHexString(this.f9421h));
        sb.append(']');
        return sb.toString();
    }
}
