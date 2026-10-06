package p000;

import androidx.wear.widget.iZcI.hiCTUJiAxf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cbg {

    /* JADX INFO: renamed from: a */
    private Class f4951a;

    /* JADX INFO: renamed from: b */
    private Class f4952b;

    /* JADX INFO: renamed from: c */
    private Class f4953c;

    public cbg() {
    }

    public cbg(Class cls, Class cls2, Class cls3) {
        m3379a(cls, cls2, cls3);
    }

    /* JADX INFO: renamed from: a */
    public final void m3379a(Class cls, Class cls2, Class cls3) {
        this.f4951a = cls;
        this.f4952b = cls2;
        this.f4953c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cbg cbgVar = (cbg) obj;
        return this.f4951a.equals(cbgVar.f4951a) && this.f4952b.equals(cbgVar.f4952b) && cbi.m3389j(this.f4953c, cbgVar.f4953c);
    }

    public final int hashCode() {
        int iHashCode = (this.f4951a.hashCode() * 31) + this.f4952b.hashCode();
        Class cls = this.f4953c;
        return (iHashCode * 31) + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + String.valueOf(this.f4951a) + ", second=" + String.valueOf(this.f4952b) + hiCTUJiAxf.RswcSLmHttgiGrq;
    }
}
