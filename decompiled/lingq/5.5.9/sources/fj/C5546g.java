package fj;

import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import com.lingq.shared.uimodel.LearningLevel;
import dm.C5207g;
import p003a2.C0009a;

/* JADX INFO: renamed from: fj.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C5546g {

    /* JADX INFO: renamed from: a */
    public String f34280a;

    /* JADX INFO: renamed from: b */
    public String f34281b;

    /* JADX INFO: renamed from: c */
    public String f34282c;

    /* JADX INFO: renamed from: d */
    public String f34283d;

    /* JADX INFO: renamed from: e */
    public String f34284e;

    /* JADX INFO: renamed from: f */
    public String f34285f;

    /* JADX INFO: renamed from: g */
    public String f34286g;

    public C5546g() {
        this(null, 127);
    }

    public C5546g(String str, int i10) {
        String str2 = "";
        str = (i10 & 1) != 0 ? str2 : str;
        String str3 = (i10 & 2) != 0 ? str2 : null;
        String str4 = (i10 & 4) != 0 ? "Quick Imports" : null;
        String serverName = (i10 & 8) != 0 ? LearningLevel.Beginner1.getServerName() : null;
        String str5 = (i10 & 16) != 0 ? "URL" : null;
        String str6 = (i10 & 32) != 0 ? str2 : null;
        str2 = (i10 & 64) == 0 ? null : "";
        C5207g.m11111f(str, "languageCode");
        C5207g.m11111f(str3, "title");
        C5207g.m11111f(str4, "courseTitle");
        C5207g.m11111f(serverName, "level");
        C5207g.m11111f(str5, "source");
        C5207g.m11111f(str6, "content");
        C5207g.m11111f(str2, "text");
        this.f34280a = str;
        this.f34281b = str3;
        this.f34282c = str4;
        this.f34283d = serverName;
        this.f34284e = str5;
        this.f34285f = str6;
        this.f34286g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5546g)) {
            return false;
        }
        C5546g c5546g = (C5546g) obj;
        if (C5207g.m11106a(this.f34280a, c5546g.f34280a) && C5207g.m11106a(this.f34281b, c5546g.f34281b) && C5207g.m11106a(this.f34282c, c5546g.f34282c) && C5207g.m11106a(this.f34283d, c5546g.f34283d) && C5207g.m11106a(this.f34284e, c5546g.f34284e) && C5207g.m11106a(this.f34285f, c5546g.f34285f) && C5207g.m11106a(this.f34286g, c5546g.f34286g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f34286g.hashCode() + C0166e.m758d(this.f34285f, C0166e.m758d(this.f34284e, C0166e.m758d(this.f34283d, C0166e.m758d(this.f34282c, C0166e.m758d(this.f34281b, this.f34280a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String str = this.f34280a;
        String str2 = this.f34281b;
        String str3 = this.f34282c;
        String str4 = this.f34283d;
        String str5 = this.f34284e;
        String str6 = this.f34285f;
        String str7 = this.f34286g;
        StringBuilder sbM855o = C0204c.m855o("UserImportData(languageCode=", str, ", title=", str2, ", courseTitle=");
        C0166e.m777x(sbM855o, str3, ", level=", str4, ", source=");
        C0166e.m777x(sbM855o, str5, ", content=", str6, ", text=");
        return C0009a.m23l(sbM855o, str7, ")");
    }
}
