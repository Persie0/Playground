package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public final class qr3 implements Iterable, tg4 {

    /* JADX INFO: renamed from: b */
    public static final qr3 f58109b = new qr3(new String[0]);

    /* JADX INFO: renamed from: a */
    public final String[] f58110a;

    public qr3(String[] strArr) {
        strArr.getClass();
        this.f58110a = strArr;
    }

    /* JADX INFO: renamed from: d */
    public final String m20121d(String str) {
        String[] strArr = this.f58110a;
        strArr.getClass();
        int length = strArr.length - 2;
        int iM23507r = AbstractC3695vr.m23507r(length, 0, -2);
        if (iM23507r > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == iM23507r) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qr3) {
            return Arrays.equals(this.f58110a, ((qr3) obj).f58110a);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final String m20122f(int i) {
        String str = (String) AbstractC3550rv.m20842j0(this.f58110a, i * 2);
        if (str != null) {
            return str;
        }
        v63.m23143u(wq1.m24114j("name[", i, ']'));
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final or3 m20123g() {
        or3 or3Var = new or3(0);
        ArrayList arrayList = (ArrayList) or3Var.f54782a;
        arrayList.getClass();
        String[] strArr = this.f58110a;
        strArr.getClass();
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        arrayList.addAll(listAsList);
        return or3Var;
    }

    /* JADX INFO: renamed from: h */
    public final String m20124h(int i) {
        String str = (String) AbstractC3550rv.m20842j0(this.f58110a, (i * 2) + 1);
        if (str != null) {
            return str;
        }
        v63.m23143u(wq1.m24114j("value[", i, ']'));
        return null;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f58110a);
    }

    /* JADX INFO: renamed from: i */
    public final List m20125i(String str) {
        str.getClass();
        int size = size();
        List listUnmodifiableList = null;
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(m20122f(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m20124h(i));
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            listUnmodifiableList.getClass();
        }
        return listUnmodifiableList == null ? EmptyList.f47638a : listUnmodifiableList;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i = 0; i < size; i++) {
            pairArr[i] = new Pair(m20122f(i), m20124h(i));
        }
        return new C3705w0(pairArr);
    }

    public final int size() {
        return this.f58110a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strM20122f = m20122f(i);
            String strM20124h = m20124h(i);
            sb.append(strM20122f);
            sb.append(": ");
            if (icb.m13776l(strM20122f)) {
                strM20124h = "██";
            }
            sb.append(strM20124h);
            sb.append("\n");
        }
        return sb.toString();
    }
}
