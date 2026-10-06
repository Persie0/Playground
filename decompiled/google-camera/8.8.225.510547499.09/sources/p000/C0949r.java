package p000;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: renamed from: r */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C0949r {

    /* JADX INFO: renamed from: a */
    @Deprecated
    public final Set f47529a;

    /* JADX INFO: renamed from: b */
    @Deprecated
    public final boolean f47530b;

    /* JADX INFO: renamed from: c */
    @Deprecated
    public final int f47531c;

    private C0949r(int i, Set set, boolean z) {
        this.f47531c = i;
        this.f47529a = set;
        this.f47530b = z;
    }

    /* JADX INFO: renamed from: a */
    static C0949r m19366a(String str) {
        int i;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (str.startsWith("integer")) {
            i = 1;
        } else {
            if (!str.startsWith("decimal")) {
                throw new IllegalArgumentException("Samples must start with 'integer' or 'decimal'");
            }
            i = 2;
        }
        boolean z = true;
        boolean z2 = false;
        for (String str2 : C1084w.f47891e.split(str.substring(7).trim())) {
            if (str2.equals("…")) {
                z = false;
                z2 = true;
            } else if (str2.equals("...")) {
                z = false;
                z2 = true;
            } else {
                if (z2) {
                    throw new IllegalArgumentException("Can only have … at the end of samples: ".concat(String.valueOf(str2)));
                }
                String[] strArrSplit = C1084w.f47892f.split(str2);
                switch (strArrSplit.length) {
                    case 1:
                        C0895p c0895p = new C0895p(strArrSplit[0]);
                        m19367b(i, c0895p);
                        linkedHashSet.add(new C0922q(c0895p, c0895p));
                        break;
                    case 2:
                        C0895p c0895p2 = new C0895p(strArrSplit[0]);
                        C0895p c0895p3 = new C0895p(strArrSplit[1]);
                        m19367b(i, c0895p2);
                        m19367b(i, c0895p3);
                        linkedHashSet.add(new C0922q(c0895p2, c0895p3));
                        break;
                    default:
                        throw new IllegalArgumentException("Ill-formed number range: ".concat(String.valueOf(str2)));
                }
            }
        }
        return new C0949r(i, Collections.unmodifiableSet(linkedHashSet), z);
    }

    /* JADX INFO: renamed from: b */
    private static void m19367b(int i, C0895p c0895p) {
        if ((i == 1) != (c0895p.f47133b == 0)) {
            throw new IllegalArgumentException("Ill-formed number range: ".concat(c0895p.toString()));
        }
    }

    @Deprecated
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("@");
        switch (this.f47531c) {
            case 1:
                str = "INTEGER";
                break;
            default:
                str = "DECIMAL";
                break;
        }
        sb.append(str.toLowerCase(Locale.ENGLISH));
        boolean z = true;
        for (C0922q c0922q : this.f47529a) {
            if (!z) {
                sb.append(",");
            }
            sb.append(' ');
            sb.append(c0922q);
            z = false;
        }
        if (!this.f47530b) {
            sb.append(", …");
        }
        return sb.toString();
    }
}
