package p000;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class i40 extends mr1 {

    /* JADX INFO: renamed from: a */
    public final Context f43470a;

    /* JADX INFO: renamed from: b */
    public final a41 f43471b;

    /* JADX INFO: renamed from: c */
    public final a41 f43472c;

    /* JADX INFO: renamed from: d */
    public final String f43473d;

    public i40(Context context, a41 a41Var, a41 a41Var2, String str) {
        if (context == null) {
            C3386nv.m17635v("Null applicationContext");
            throw null;
        }
        this.f43470a = context;
        if (a41Var == null) {
            C3386nv.m17635v("Null wallClock");
            throw null;
        }
        this.f43471b = a41Var;
        if (a41Var2 == null) {
            C3386nv.m17635v("Null monotonicClock");
            throw null;
        }
        this.f43472c = a41Var2;
        if (str != null) {
            this.f43473d = str;
        } else {
            C3386nv.m17635v("Null backendName");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mr1) {
            i40 i40Var = (i40) ((mr1) obj);
            if (this.f43470a.equals(i40Var.f43470a) && this.f43471b.equals(i40Var.f43471b) && this.f43472c.equals(i40Var.f43472c) && this.f43473d.equals(i40Var.f43473d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f43473d.hashCode() ^ ((((((this.f43470a.hashCode() ^ 1000003) * 1000003) ^ this.f43471b.hashCode()) * 1000003) ^ this.f43472c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f43470a);
        sb.append(", wallClock=");
        sb.append(this.f43471b);
        sb.append(", monotonicClock=");
        sb.append(this.f43472c);
        sb.append(", backendName=");
        return AbstractC3393o1.m17738m(sb, this.f43473d, "}");
    }
}
