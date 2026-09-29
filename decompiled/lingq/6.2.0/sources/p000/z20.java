package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class z20 {

    /* JADX INFO: renamed from: a */
    public int f70770a;

    /* JADX INFO: renamed from: b */
    public String f70771b;

    /* JADX INFO: renamed from: c */
    public int f70772c;

    /* JADX INFO: renamed from: d */
    public int f70773d;

    /* JADX INFO: renamed from: e */
    public long f70774e;

    /* JADX INFO: renamed from: f */
    public long f70775f;

    /* JADX INFO: renamed from: g */
    public long f70776g;

    /* JADX INFO: renamed from: h */
    public String f70777h;

    /* JADX INFO: renamed from: i */
    public List f70778i;

    /* JADX INFO: renamed from: j */
    public byte f70779j;

    /* JADX INFO: renamed from: a */
    public final a30 m25403a() {
        String str;
        if (this.f70779j == 63 && (str = this.f70771b) != null) {
            return new a30(this.f70770a, str, this.f70772c, this.f70773d, this.f70774e, this.f70775f, this.f70776g, this.f70777h, this.f70778i);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f70779j & 1) == 0) {
            sb.append(" pid");
        }
        if (this.f70771b == null) {
            sb.append(" processName");
        }
        if ((this.f70779j & 2) == 0) {
            sb.append(" reasonCode");
        }
        if ((this.f70779j & 4) == 0) {
            sb.append(" importance");
        }
        if ((this.f70779j & 8) == 0) {
            sb.append(" pss");
        }
        if ((this.f70779j & 16) == 0) {
            sb.append(" rss");
        }
        if ((this.f70779j & 32) == 0) {
            sb.append(" timestamp");
        }
        C3386nv.m17633t(wq1.m24120p("Missing required properties:", sb));
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m25404b(List list) {
        this.f70778i = list;
    }

    /* JADX INFO: renamed from: c */
    public final void m25405c(int i) {
        this.f70773d = i;
        this.f70779j = (byte) (this.f70779j | 4);
    }

    /* JADX INFO: renamed from: d */
    public final void m25406d(int i) {
        this.f70770a = i;
        this.f70779j = (byte) (this.f70779j | 1);
    }

    /* JADX INFO: renamed from: e */
    public final void m25407e(String str) {
        if (str != null) {
            this.f70771b = str;
        } else {
            C3386nv.m17635v("Null processName");
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m25408f(long j) {
        this.f70774e = j;
        this.f70779j = (byte) (this.f70779j | 8);
    }

    /* JADX INFO: renamed from: g */
    public final void m25409g(int i) {
        this.f70772c = i;
        this.f70779j = (byte) (this.f70779j | 2);
    }

    /* JADX INFO: renamed from: h */
    public final void m25410h(long j) {
        this.f70775f = j;
        this.f70779j = (byte) (this.f70779j | 16);
    }

    /* JADX INFO: renamed from: i */
    public final void m25411i(long j) {
        this.f70776g = j;
        this.f70779j = (byte) (this.f70779j | 32);
    }

    /* JADX INFO: renamed from: j */
    public final void m25412j(String str) {
        this.f70777h = str;
    }
}
