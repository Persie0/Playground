package p000;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class kn2 {

    /* JADX INFO: renamed from: a */
    public final int f47535a;

    /* JADX INFO: renamed from: b */
    public final int f47536b;

    /* JADX INFO: renamed from: c */
    public final int f47537c;

    /* JADX INFO: renamed from: d */
    public final int f47538d;

    /* JADX INFO: renamed from: e */
    public final int f47539e;

    /* JADX INFO: renamed from: f */
    public final int f47540f;

    public /* synthetic */ kn2(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f47535a = i;
        this.f47536b = i2;
        this.f47537c = i3;
        this.f47538d = i4;
        this.f47539e = i5;
        this.f47540f = i6;
    }

    /* JADX INFO: renamed from: a */
    public static kn2 m15338a(String str) {
        bna.m3969q(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        for (int i6 = 0; i6 < strArrSplit.length; i6++) {
            String strM21625f0 = AbstractC3584sr.m21625f0(strArrSplit[i6].trim());
            strM21625f0.getClass();
            switch (strM21625f0) {
                case "end":
                    i3 = i6;
                    break;
                case "text":
                    i5 = i6;
                    break;
                case "layer":
                    i = i6;
                    break;
                case "start":
                    i2 = i6;
                    break;
                case "style":
                    i4 = i6;
                    break;
            }
        }
        if (i2 == -1 || i3 == -1 || i5 == -1) {
            return null;
        }
        return new kn2(i, i2, i3, i4, i5, strArrSplit.length);
    }
}
