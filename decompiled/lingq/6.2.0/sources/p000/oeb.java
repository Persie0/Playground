package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class oeb implements InterfaceC3691vn {

    /* JADX INFO: renamed from: c */
    public static final oeb f54252c;

    /* JADX INFO: renamed from: a */
    public final boolean f54253a;

    /* JADX INFO: renamed from: b */
    public final String f54254b;

    static {
        cdb cdbVar = new cdb(5, false);
        cdbVar.f9945b = Boolean.FALSE;
        f54252c = new oeb(cdbVar);
    }

    public oeb(cdb cdbVar) {
        this.f54253a = ((Boolean) cdbVar.f9945b).booleanValue();
        this.f54254b = (String) cdbVar.f9946c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oeb)) {
            return false;
        }
        oeb oebVar = (oeb) obj;
        return x74.m24360q(null, null) && this.f54253a == oebVar.f54253a && x74.m24360q(this.f54254b, oebVar.f54254b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f54253a), this.f54254b});
    }
}
