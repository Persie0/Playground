package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class cb9 implements mf1, Iterable, tg4 {

    /* JADX INFO: renamed from: b */
    public int f9843b;

    /* JADX INFO: renamed from: d */
    public int f9845d;

    /* JADX INFO: renamed from: e */
    public int f9846e;

    /* JADX INFO: renamed from: g */
    public boolean f9848g;

    /* JADX INFO: renamed from: h */
    public int f9849h;

    /* JADX INFO: renamed from: j */
    public HashMap f9851j;

    /* JADX INFO: renamed from: k */
    public t56 f9852k;

    /* JADX INFO: renamed from: a */
    public int[] f9842a = new int[0];

    /* JADX INFO: renamed from: c */
    public Object[] f9844c = new Object[0];

    /* JADX INFO: renamed from: f */
    public final Object f9847f = new Object();

    /* JADX INFO: renamed from: i */
    public ArrayList f9850i = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final int m4489d(oj3 oj3Var) {
        if (this.f9848g) {
            cf1.m4605a("Use active SlotWriter to determine anchor location instead");
        }
        if (!oj3Var.m18039a()) {
            hi7.m13278a("Anchor refers to a group that was removed");
        }
        return oj3Var.f54459a;
    }

    /* JADX INFO: renamed from: f */
    public final void m4490f() {
        this.f9851j = new HashMap();
    }

    /* JADX INFO: renamed from: g */
    public final bb9 m4491g() {
        if (this.f9848g) {
            C3386nv.m17633t("Cannot read while a writer is pending");
            return null;
        }
        this.f9846e++;
        return new bb9(this);
    }

    /* JADX INFO: renamed from: h */
    public final fb9 m4492h() {
        if (this.f9848g) {
            cf1.m4605a("Cannot start a writer when another writer is pending");
        }
        if (this.f9846e > 0) {
            cf1.m4605a("Cannot start a writer when a reader is pending");
        }
        this.f9848g = true;
        this.f9849h++;
        return new fb9(this);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m4493i(oj3 oj3Var) {
        int iM11014e;
        return oj3Var.m18039a() && (iM11014e = eb9.m11014e(this.f9850i, oj3Var.f54459a, this.f9843b)) >= 0 && fa4.m11650l(this.f9850i.get(iM11014e), oj3Var);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new eq3(this, 0, this.f9843b);
    }

    /* JADX INFO: renamed from: j */
    public final vj3 m4494j(int i) {
        int i2;
        ArrayList arrayList;
        int iM11014e;
        HashMap map = this.f9851j;
        if (map != null) {
            if (this.f9848g) {
                cf1.m4605a("use active SlotWriter to crate an anchor for location instead");
            }
            oj3 oj3Var = (i < 0 || i >= (i2 = this.f9843b) || (iM11014e = eb9.m11014e((arrayList = this.f9850i), i, i2)) < 0) ? null : (oj3) arrayList.get(iM11014e);
            if (oj3Var != null) {
                return (vj3) map.get(oj3Var);
            }
        }
        return null;
    }
}
