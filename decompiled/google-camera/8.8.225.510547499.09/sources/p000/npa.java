package p000;

import android.graphics.PointF;
import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class npa {

    /* JADX INFO: renamed from: a */
    public Object f44016a;

    /* JADX INFO: renamed from: b */
    public Object f44017b;

    /* JADX INFO: renamed from: c */
    public Object f44018c;

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: a */
    public final kvu m17578a() {
        ?? r1;
        Object obj;
        Object obj2 = this.f44016a;
        if (obj2 != null && (r1 = this.f44018c) != 0 && (obj = this.f44017b) != null) {
            return new kvu((kwe) obj2, r1, (kvw) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f44016a == null) {
            sb.append(" linkDataResult");
        }
        if (this.f44018c == null) {
            sb.append(" linkChipResult");
        }
        if (this.f44017b == null) {
            sb.append(" linkChipResultMetadata");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final void m17579b(List list) {
        if (list == null) {
            throw new NullPointerException("Null linkChipResult");
        }
        this.f44018c = list;
    }

    /* JADX INFO: renamed from: c */
    public final void m17580c(kvw kvwVar) {
        if (kvwVar == null) {
            throw new NullPointerException("Null linkChipResultMetadata");
        }
        this.f44017b = kvwVar;
    }

    /* JADX INFO: renamed from: d */
    public final void m17581d(kwe kweVar) {
        if (kweVar == null) {
            throw new NullPointerException("Null linkDataResult");
        }
        this.f44016a = kweVar;
    }

    /* JADX INFO: renamed from: e */
    public final hgt m17582e() {
        Object obj;
        Object obj2;
        Object obj3 = this.f44018c;
        if (obj3 != null && (obj = this.f44017b) != null && (obj2 = this.f44016a) != null) {
            return new hgt((String) obj3, (mxk) obj, (mxk) obj2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f44018c == null) {
            sb.append(" packageName");
        }
        if (this.f44017b == null) {
            sb.append(" photoActivityNames");
        }
        if (this.f44016a == null) {
            sb.append(" videoActivityNames");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: f */
    public final void m17583f(String str) {
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.f44018c = str;
    }

    /* JADX INFO: renamed from: g */
    public final void m17584g(mxk mxkVar) {
        if (mxkVar == null) {
            throw new NullPointerException("Null photoActivityNames");
        }
        this.f44017b = mxkVar;
    }

    /* JADX INFO: renamed from: h */
    public final void m17585h(mxk mxkVar) {
        if (mxkVar == null) {
            throw new NullPointerException("Null videoActivityNames");
        }
        this.f44016a = mxkVar;
    }

    /* JADX INFO: renamed from: i */
    public final synchronized float m17586i() {
        Object obj = this.f44017b;
        if (obj != null && this.f44016a != null) {
            return ((PointF) obj).y - ((PointF) this.f44016a).y;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m17587j(MotionEvent motionEvent) {
        PointF pointF = new PointF(motionEvent.getRawX(), motionEvent.getRawY());
        Object obj = this.f44016a;
        this.f44018c = obj;
        Object obj2 = this.f44017b;
        this.f44016a = obj2;
        this.f44017b = pointF;
        if (obj2 == null) {
            this.f44016a = pointF;
        }
        if (obj == null) {
            this.f44018c = pointF;
        }
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m17588k() {
        this.f44017b = null;
        this.f44016a = null;
        this.f44018c = null;
    }

    /* JADX INFO: renamed from: l */
    public final dhx m17589l() {
        Object obj = this.f44017b;
        Object obj2 = this.f44018c;
        Object obj3 = this.f44016a;
        if (obj3 == null) {
            obj3 = mzx.f41874a;
        }
        return new dhx((String) obj, (String) obj2, (mxk) obj3);
    }

    /* JADX INFO: renamed from: m */
    public final void m17590m(String str) {
        this.f44018c = str;
    }

    /* JADX INFO: renamed from: n */
    public final void m17591n(String str) {
        this.f44017b = str;
    }

    /* JADX INFO: renamed from: o */
    public final void m17592o(mxk mxkVar) {
        this.f44016a = mxkVar;
    }

    /* JADX INFO: renamed from: p */
    public final dhw m17593p() {
        return new dhw((String) this.f44017b, (String) this.f44018c);
    }

    /* JADX INFO: renamed from: q */
    public final dhw m17594q() {
        return new dhw((String) this.f44017b, (String) this.f44018c);
    }

    /* JADX INFO: renamed from: r */
    public final dhw m17595r() {
        return new dhw((String) this.f44017b, (String) this.f44018c);
    }

    /* JADX INFO: renamed from: s */
    public final dhw m17596s() {
        return new dhw((String) this.f44017b, (String) this.f44018c);
    }

    /* JADX INFO: renamed from: t */
    public final dhw m17597t() {
        return new dhw((String) this.f44017b, (String) this.f44018c);
    }

    /* JADX INFO: renamed from: u */
    public final dhw m17598u() {
        return new dhw((String) this.f44017b, (String) this.f44018c);
    }

    /* JADX INFO: renamed from: v */
    public final dhw m17599v() {
        return new dhw((String) this.f44017b, null);
    }

    /* JADX INFO: renamed from: w */
    public final boolean m17600w() {
        return this.f44017b != null;
    }
}
