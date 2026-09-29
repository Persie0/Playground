package p523z3;

import android.text.TextUtils;
import p446w2.C9804b;

/* JADX INFO: renamed from: z3.c */
/* JADX INFO: loaded from: classes.dex */
public class C10440c {

    /* JADX INFO: renamed from: a */
    public final String f52280a;

    /* JADX INFO: renamed from: b */
    public final int f52281b;

    /* JADX INFO: renamed from: c */
    public final int f52282c;

    public C10440c(String str, int i10, int i11) {
        this.f52280a = str;
        this.f52281b = i10;
        this.f52282c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10440c)) {
            return false;
        }
        C10440c c10440c = (C10440c) obj;
        int i10 = this.f52282c;
        String str = this.f52280a;
        int i11 = this.f52281b;
        if (i11 >= 0 && c10440c.f52281b >= 0) {
            return TextUtils.equals(str, c10440c.f52280a) && i11 == c10440c.f52281b && i10 == c10440c.f52282c;
        }
        return TextUtils.equals(str, c10440c.f52280a) && i10 == c10440c.f52282c;
    }

    public final int hashCode() {
        return C9804b.m18287b(this.f52280a, Integer.valueOf(this.f52282c));
    }
}
