package p000;

import java.util.Set;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes2.dex */
public final class wy5 {
    public static final vy5 Companion = new vy5();

    /* JADX INFO: renamed from: d */
    public static final Regex f67518d = new Regex("advanced([1-9]\\d*)");

    /* JADX INFO: renamed from: e */
    public static final Set f67519e = AbstractC3550rv.m20855w0(new String[]{"beginner1", "beginner2", "intermediate1", "intermediate2"});

    /* JADX INFO: renamed from: a */
    public final String f67520a;

    /* JADX INFO: renamed from: b */
    public final String f67521b;

    /* JADX INFO: renamed from: c */
    public final String f67522c;

    public wy5(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f67520a = str;
        this.f67521b = str2;
        this.f67522c = vk9.m23368D0(str, "level.", str);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public final String m24216a() {
        String str;
        String str2 = this.f67522c;
        switch (str2.hashCode()) {
            case -1072069089:
                if (str2.equals("beginner1")) {
                    return "B1";
                }
                break;
            case -1072069088:
                if (str2.equals("beginner2")) {
                    return "B2";
                }
                break;
            case -881435048:
                if (str2.equals("intermediate1")) {
                    return "I1";
                }
                break;
            case -881435047:
                if (str2.equals("intermediate2")) {
                    return "I2";
                }
                break;
        }
        dr5 dr5VarM15426e = f67518d.m15426e(str2);
        return (dr5VarM15426e == null || (str = (String) ((br5) dr5VarM15426e.m10610a()).get(1)) == null) ? this.f67521b : "A".concat(str);
    }

    /* JADX INFO: renamed from: b */
    public final String m24217b() {
        return this.f67522c;
    }

    /* JADX INFO: renamed from: c */
    public final String m24218c() {
        return this.f67521b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wy5)) {
            return false;
        }
        wy5 wy5Var = (wy5) obj;
        return fa4.m11650l(this.f67520a, wy5Var.f67520a) && fa4.m11650l(this.f67521b, wy5Var.f67521b);
    }

    public final int hashCode() {
        return this.f67521b.hashCode() + (this.f67520a.hashCode() * 31);
    }

    public final String toString() {
        return ux5.m22991n("MilestoneLevel(slug=", this.f67520a, ", name=", this.f67521b, ")");
    }
}
