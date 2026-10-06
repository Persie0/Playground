package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import p021j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dtj {

    /* JADX INFO: renamed from: a */
    private final String f12557a;

    /* JADX INFO: renamed from: b */
    private final dtj[] f12558b;

    public dtj(String str, dtj[] dtjVarArr) {
        this.f12557a = str;
        this.f12558b = dtjVarArr;
    }

    /* JADX INFO: renamed from: b */
    public static dtj m6731b(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (Pattern.matches("feature\\.[a-z0-9\\-]+\\.[a-z0-9\\-]+\\.[a-z0-9\\-]+(:\\d+)?", str)) {
            return dti.m6727a(str, arrayList, arrayList2);
        }
        throw new IllegalArgumentException("Feature with bad type name '" + str + "'!");
    }

    /* JADX INFO: renamed from: a */
    public final int m6732a() {
        int iM6732a = -1;
        for (dtj dtjVar : this.f12558b) {
            if (dtjVar.m6732a() > iM6732a) {
                iM6732a = dtjVar.m6732a();
            }
        }
        return iM6732a + 1;
    }

    /* JADX INFO: renamed from: c */
    public final Set m6733c() {
        HashSet hashSet = new HashSet();
        for (dtj dtjVar : this.f12558b) {
            hashSet.add(dtjVar);
            hashSet.addAll(dtjVar.m6733c());
        }
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f12557a.equals(((dtj) obj).f12557a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f12557a);
    }

    public final String toString() {
        return this.f12557a;
    }
}
