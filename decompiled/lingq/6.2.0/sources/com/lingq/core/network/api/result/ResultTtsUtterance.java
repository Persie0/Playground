package com.lingq.core.network.api.result;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultTtsUtterance {
    public static final C1713p4 Companion = new C1713p4();

    /* JADX INFO: renamed from: a */
    public final String f21626a;

    /* JADX INFO: renamed from: b */
    public final Requested f21627b;

    /* JADX INFO: renamed from: c */
    public final Generated f21628c;

    /* JADX INFO: renamed from: d */
    public final boolean f21629d;

    /* JADX INFO: renamed from: e */
    public final String f21630e;

    public ResultTtsUtterance(int i, String str, Requested requested, Generated generated, boolean z, String str2) {
        this.f21626a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.f21627b = new Requested();
        } else {
            this.f21627b = requested;
        }
        if ((i & 4) == 0) {
            this.f21628c = new Generated();
        } else {
            this.f21628c = generated;
        }
        if ((i & 8) == 0) {
            this.f21629d = false;
        } else {
            this.f21629d = z;
        }
        if ((i & 16) == 0) {
            this.f21630e = this.f21628c.f21637g;
        } else {
            this.f21630e = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultTtsUtterance)) {
            return false;
        }
        ResultTtsUtterance resultTtsUtterance = (ResultTtsUtterance) obj;
        return fa4.m11650l(this.f21626a, resultTtsUtterance.f21626a) && fa4.m11650l(this.f21627b, resultTtsUtterance.f21627b) && fa4.m11650l(this.f21628c, resultTtsUtterance.f21628c) && this.f21629d == resultTtsUtterance.f21629d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f21629d) + ((this.f21628c.hashCode() + ((this.f21627b.hashCode() + (this.f21626a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ResultTtsUtterance(type=" + this.f21626a + ", requested=" + this.f21627b + ", generated=" + this.f21628c + ", amended=" + this.f21629d + ")";
    }

    @ey8
    public static final class GeneratedLanguage {
        public static final C1725r4 Companion = new C1725r4();

        /* JADX INFO: renamed from: a */
        public final int f21642a;

        /* JADX INFO: renamed from: b */
        public final String f21643b;

        /* JADX INFO: renamed from: c */
        public final String f21644c;

        /* JADX INFO: renamed from: d */
        public final String f21645d;

        public /* synthetic */ GeneratedLanguage(int i, int i2, String str, String str2, String str3) {
            this.f21642a = (i & 1) == 0 ? 0 : i2;
            if ((i & 2) == 0) {
                this.f21643b = null;
            } else {
                this.f21643b = str;
            }
            if ((i & 4) == 0) {
                this.f21644c = "";
            } else {
                this.f21644c = str2;
            }
            if ((i & 8) == 0) {
                this.f21645d = null;
            } else {
                this.f21645d = str3;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GeneratedLanguage)) {
                return false;
            }
            GeneratedLanguage generatedLanguage = (GeneratedLanguage) obj;
            return this.f21642a == generatedLanguage.f21642a && fa4.m11650l(this.f21643b, generatedLanguage.f21643b) && fa4.m11650l(this.f21644c, generatedLanguage.f21644c) && fa4.m11650l(this.f21645d, generatedLanguage.f21645d);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f21642a) * 31;
            String str = this.f21643b;
            int iM22980c = ux5.m22980c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, this.f21644c, 31);
            String str2 = this.f21645d;
            return iM22980c + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return wq1.m24125u(ux5.m22995r(this.f21642a, "GeneratedLanguage(id=", ", url=", this.f21643b, ", code="), this.f21644c, ", title=", this.f21645d, ")");
        }

        public GeneratedLanguage() {
            this.f21642a = 0;
            this.f21643b = null;
            this.f21644c = "";
            this.f21645d = null;
        }
    }

    @ey8
    public static final class Requested {
        public static final C1731s4 Companion = new C1731s4();

        /* JADX INFO: renamed from: a */
        public final String f21646a;

        /* JADX INFO: renamed from: b */
        public final String f21647b;

        /* JADX INFO: renamed from: c */
        public final String f21648c;

        /* JADX INFO: renamed from: d */
        public final String f21649d;

        public /* synthetic */ Requested(int i, String str, String str2, String str3, String str4) {
            if ((i & 1) == 0) {
                this.f21646a = "";
            } else {
                this.f21646a = str;
            }
            if ((i & 2) == 0) {
                this.f21647b = "";
            } else {
                this.f21647b = str2;
            }
            if ((i & 4) == 0) {
                this.f21648c = "";
            } else {
                this.f21648c = str3;
            }
            if ((i & 8) == 0) {
                this.f21649d = "";
            } else {
                this.f21649d = str4;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Requested)) {
                return false;
            }
            Requested requested = (Requested) obj;
            return fa4.m11650l(this.f21646a, requested.f21646a) && fa4.m11650l(this.f21647b, requested.f21647b) && fa4.m11650l(this.f21648c, requested.f21648c) && fa4.m11650l(this.f21649d, requested.f21649d);
        }

        public final int hashCode() {
            return this.f21649d.hashCode() + ux5.m22980c(ux5.m22980c(this.f21646a.hashCode() * 31, this.f21647b, 31), this.f21648c, 31);
        }

        public final String toString() {
            return wq1.m24125u(ux5.m23000w("Requested(appName=", this.f21646a, ", voice=", this.f21647b, ", text="), this.f21648c, ", language=", this.f21649d, ")");
        }

        public Requested() {
            this.f21646a = "";
            this.f21647b = "";
            this.f21648c = "";
            this.f21649d = "";
        }
    }

    @ey8
    public static final class Generated {
        public static final C1719q4 Companion = new C1719q4();

        /* JADX INFO: renamed from: a */
        public final int f21631a;

        /* JADX INFO: renamed from: b */
        public final GeneratedLanguage f21632b;

        /* JADX INFO: renamed from: c */
        public final String f21633c;

        /* JADX INFO: renamed from: d */
        public final String f21634d;

        /* JADX INFO: renamed from: e */
        public final String f21635e;

        /* JADX INFO: renamed from: f */
        public final String f21636f;

        /* JADX INFO: renamed from: g */
        public final String f21637g;

        /* JADX INFO: renamed from: h */
        public final String f21638h;

        /* JADX INFO: renamed from: i */
        public final String f21639i;

        /* JADX INFO: renamed from: j */
        public final String f21640j;

        /* JADX INFO: renamed from: k */
        public final String f21641k;

        public /* synthetic */ Generated(int i, int i2, GeneratedLanguage generatedLanguage, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            this.f21631a = (i & 1) == 0 ? 0 : i2;
            if ((i & 2) == 0) {
                this.f21632b = new GeneratedLanguage();
            } else {
                this.f21632b = generatedLanguage;
            }
            if ((i & 4) == 0) {
                this.f21633c = null;
            } else {
                this.f21633c = str;
            }
            if ((i & 8) == 0) {
                this.f21634d = null;
            } else {
                this.f21634d = str2;
            }
            if ((i & 16) == 0) {
                this.f21635e = null;
            } else {
                this.f21635e = str3;
            }
            if ((i & 32) == 0) {
                this.f21636f = "";
            } else {
                this.f21636f = str4;
            }
            if ((i & 64) == 0) {
                this.f21637g = "";
            } else {
                this.f21637g = str5;
            }
            if ((i & 128) == 0) {
                this.f21638h = null;
            } else {
                this.f21638h = str6;
            }
            if ((i & 256) == 0) {
                this.f21639i = null;
            } else {
                this.f21639i = str7;
            }
            if ((i & 512) == 0) {
                this.f21640j = null;
            } else {
                this.f21640j = str8;
            }
            if ((i & 1024) == 0) {
                this.f21641k = null;
            } else {
                this.f21641k = str9;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Generated)) {
                return false;
            }
            Generated generated = (Generated) obj;
            return this.f21631a == generated.f21631a && fa4.m11650l(this.f21632b, generated.f21632b) && fa4.m11650l(this.f21633c, generated.f21633c) && fa4.m11650l(this.f21634d, generated.f21634d) && fa4.m11650l(this.f21635e, generated.f21635e) && fa4.m11650l(this.f21636f, generated.f21636f) && fa4.m11650l(this.f21637g, generated.f21637g) && fa4.m11650l(this.f21638h, generated.f21638h) && fa4.m11650l(this.f21639i, generated.f21639i) && fa4.m11650l(this.f21640j, generated.f21640j) && fa4.m11650l(this.f21641k, generated.f21641k);
        }

        public final int hashCode() {
            int iHashCode = (this.f21632b.hashCode() + (Integer.hashCode(this.f21631a) * 31)) * 31;
            String str = this.f21633c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f21634d;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f21635e;
            int iM22980c = ux5.m22980c(ux5.m22980c((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, this.f21636f, 31), this.f21637g, 31);
            String str4 = this.f21638h;
            int iHashCode4 = (iM22980c + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f21639i;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f21640j;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.f21641k;
            return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Generated(id=");
            sb.append(this.f21631a);
            sb.append(", language=");
            sb.append(this.f21632b);
            sb.append(", appName=");
            AbstractC3393o1.m17725C(sb, this.f21633c, ", voice=", this.f21634d, ", voiceType=");
            AbstractC3393o1.m17725C(sb, this.f21635e, ", text=", this.f21636f, ", audio=");
            AbstractC3393o1.m17725C(sb, this.f21637g, ", ctime=", this.f21638h, ", ftime=");
            AbstractC3393o1.m17725C(sb, this.f21639i, ", fixed=", this.f21640j, ", db=");
            return AbstractC3393o1.m17738m(sb, this.f21641k, ")");
        }

        public Generated() {
            GeneratedLanguage generatedLanguage = new GeneratedLanguage();
            this.f21631a = 0;
            this.f21632b = generatedLanguage;
            this.f21633c = null;
            this.f21634d = null;
            this.f21635e = null;
            this.f21636f = "";
            this.f21637g = "";
            this.f21638h = null;
            this.f21639i = null;
            this.f21640j = null;
            this.f21641k = null;
        }
    }
}
