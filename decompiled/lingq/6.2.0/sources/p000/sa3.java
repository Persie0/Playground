package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class sa3 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f60579a;

    /* JADX INFO: renamed from: b */
    public final char f60580b;

    /* JADX INFO: renamed from: c */
    public final double f60581c;

    /* JADX INFO: renamed from: d */
    public final String f60582d;

    /* JADX INFO: renamed from: e */
    public final String f60583e;

    public sa3(ArrayList arrayList, char c, double d, String str, String str2) {
        this.f60579a = arrayList;
        this.f60580b = c;
        this.f60581c = d;
        this.f60582d = str;
        this.f60583e = str2;
    }

    /* JADX INFO: renamed from: a */
    public static int m21187a(char c, String str, String str2) {
        return str2.hashCode() + ux5.m22980c(c * 31, str, 31);
    }

    public final int hashCode() {
        return m21187a(this.f60580b, this.f60583e, this.f60582d);
    }
}
