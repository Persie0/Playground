package p000;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class kva {

    /* JADX INFO: renamed from: a */
    public final Object f48477a;

    /* JADX INFO: renamed from: b */
    public final String f48478b;

    /* JADX INFO: renamed from: c */
    public final String f48479c;

    /* JADX INFO: renamed from: d */
    public final String f48480d;

    /* JADX INFO: renamed from: e */
    public final String f48481e;

    /* JADX INFO: renamed from: f */
    public final String f48482f;

    /* JADX INFO: renamed from: g */
    public final String f48483g;

    /* JADX INFO: renamed from: h */
    public final String f48484h;

    /* JADX INFO: renamed from: i */
    public final boolean f48485i;

    /* JADX INFO: renamed from: j */
    public final boolean f48486j;

    public kva(View view, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2) {
        this.f48477a = view;
        this.f48478b = str;
        this.f48479c = str2;
        this.f48480d = str3;
        this.f48481e = str4;
        this.f48482f = str5;
        this.f48483g = str6;
        this.f48484h = str7;
        this.f48485i = z;
        this.f48486j = z2;
        new WeakReference(view);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kva)) {
            return false;
        }
        kva kvaVar = (kva) obj;
        return fa4.m11650l(this.f48477a, kvaVar.f48477a) && fa4.m11650l(this.f48478b, kvaVar.f48478b) && fa4.m11650l(this.f48479c, kvaVar.f48479c) && fa4.m11650l(this.f48480d, kvaVar.f48480d) && fa4.m11650l(this.f48481e, kvaVar.f48481e) && fa4.m11650l(this.f48482f, kvaVar.f48482f) && this.f48483g.equals(kvaVar.f48483g) && fa4.m11650l(this.f48484h, kvaVar.f48484h) && this.f48485i == kvaVar.f48485i && this.f48486j == kvaVar.f48486j;
    }

    public final int hashCode() {
        Object obj = this.f48477a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        String str = this.f48478b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f48479c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f48480d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f48481e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f48482f;
        int iM22980c = ux5.m22980c((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31, this.f48483g, 31);
        String str6 = this.f48484h;
        return Boolean.hashCode(this.f48486j) + g9a.m12428e((iM22980c + (str6 != null ? str6.hashCode() : 0)) * 31, 31, this.f48485i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewTarget(_view=");
        sb.append(this.f48477a);
        sb.append(", className=");
        sb.append(this.f48478b);
        sb.append(", resourceName=");
        sb.append(this.f48479c);
        sb.append(", tag=");
        sb.append(this.f48480d);
        sb.append(", text=");
        sb.append(this.f48481e);
        sb.append(", accessibilityLabel=");
        sb.append(this.f48482f);
        sb.append(", source=");
        sb.append(this.f48483g);
        sb.append(", hierarchy=");
        sb.append(this.f48484h);
        sb.append(", ampIgnoreRageClick=");
        sb.append(this.f48485i);
        sb.append(", ampIgnoreDeadClick=");
        return ux5.m22993p(sb, this.f48486j, ')');
    }
}
