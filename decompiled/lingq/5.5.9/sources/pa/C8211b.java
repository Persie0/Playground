package pa;

import ae.C0062b;
import android.text.TextUtils;
import p479xa.C10129a;

/* JADX INFO: renamed from: pa.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8211b {

    /* JADX INFO: renamed from: a */
    public final int f44439a;

    /* JADX INFO: renamed from: b */
    public final int f44440b;

    /* JADX INFO: renamed from: c */
    public final int f44441c;

    /* JADX INFO: renamed from: d */
    public final int f44442d;

    /* JADX INFO: renamed from: e */
    public final int f44443e;

    public C8211b(int i10, int i11, int i12, int i13, int i14) {
        this.f44439a = i10;
        this.f44440b = i11;
        this.f44441c = i12;
        this.f44442d = i13;
        this.f44443e = i14;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x003b  */
    /* JADX INFO: renamed from: a */
    public static C8211b m16356a(String str) {
        C10129a.m18990b(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < strArrSplit.length; i14++) {
            String strM383p2 = C0062b.m383p2(strArrSplit[i14].trim());
            strM383p2.getClass();
            switch (strM383p2) {
                case "end":
                    i11 = i14;
                    break;
                case "text":
                    i13 = i14;
                    break;
                case "start":
                    i10 = i14;
                    break;
                case "style":
                    i12 = i14;
                    break;
            }
        }
        if (i10 == -1 || i11 == -1 || i13 == -1) {
            return null;
        }
        return new C8211b(i10, i11, i12, i13, strArrSplit.length);
    }
}
