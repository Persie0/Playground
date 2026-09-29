package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class h42 extends tad {

    /* JADX INFO: renamed from: a */
    public final String f41767a;

    /* JADX INFO: renamed from: b */
    public final Integer f41768b;

    /* JADX INFO: renamed from: c */
    public final String f41769c;

    /* JADX INFO: renamed from: d */
    public final String f41770d;

    public h42(String str, Integer num, String str2, String str3) {
        this.f41767a = str;
        this.f41768b = num;
        this.f41769c = str2;
        this.f41770d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h42)) {
            return false;
        }
        h42 h42Var = (h42) obj;
        return fa4.m11650l(this.f41767a, h42Var.f41767a) && fa4.m11650l(this.f41768b, h42Var.f41768b) && fa4.m11650l(this.f41769c, h42Var.f41769c) && fa4.m11650l(this.f41770d, h42Var.f41770d);
    }

    public final int hashCode() {
        String str = this.f41767a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f41768b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f41769c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f41770d;
        return (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Lesson(language=");
        sb.append(this.f41767a);
        sb.append(", lessonId=");
        sb.append(this.f41768b);
        sb.append(", medium=");
        return wq1.m24125u(sb, this.f41769c, ", source=", this.f41770d, ", path=null)");
    }
}
