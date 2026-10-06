package p000;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ofk {

    /* JADX INFO: renamed from: a */
    public Object f45853a;

    /* JADX INFO: renamed from: b */
    public Object f45854b;

    /* JADX INFO: renamed from: c */
    public Object f45855c;

    /* JADX INFO: renamed from: d */
    public Object f45856d;

    /* JADX INFO: renamed from: e */
    public Object f45857e;

    /* JADX INFO: renamed from: f */
    public Object f45858f;

    /* JADX INFO: renamed from: g */
    public Object f45859g;

    public ofk() {
    }

    public ofk(String str, String str2, String str3, String str4, float f, float f2) {
        this(str, str2, str3, str4, Float.valueOf(f), Float.valueOf(f2), null);
    }

    public ofk(String str, String str2, String str3, String str4, Float f, Float f2, Float f3) {
        this.f45853a = str;
        this.f45854b = str2;
        this.f45855c = str3;
        this.f45856d = str4;
        this.f45857e = f;
        this.f45858f = f2;
        this.f45859g = f3;
    }

    public ofk(nvn nvnVar) {
        this.f45858f = nvnVar.f44759a;
        this.f45859g = nvnVar.f44760b;
        this.f45855c = nvnVar.f44761c;
        this.f45854b = nvnVar.f44762d;
        this.f45853a = nvnVar.f44763e;
        this.f45856d = nvnVar.f44764f;
        this.f45857e = nvnVar.f44765g;
    }

    /* JADX INFO: renamed from: a */
    final boolean m18464a(String str, String str2, String str3, String str4) {
        Object obj = this.f45853a;
        if (obj != null && !((String) obj).equals(str)) {
            return false;
        }
        Object obj2 = this.f45854b;
        if (obj2 != null && !((String) obj2).equals(str2)) {
            return false;
        }
        Object obj3 = this.f45855c;
        if (obj3 != null && !((String) obj3).equals(str3)) {
            return false;
        }
        Object obj4 = this.f45856d;
        return obj4 == null || ((String) obj4).equals(str4);
    }

    /* JADX INFO: renamed from: b */
    public final nvn m18465b() {
        Object obj = this.f45858f;
        Object obj2 = this.f45859g;
        Object obj3 = this.f45855c;
        Object obj4 = this.f45854b;
        Object obj5 = this.f45853a;
        Object obj6 = this.f45856d;
        Integer num = (Integer) obj6;
        Integer num2 = (Integer) obj5;
        nvg nvgVar = (nvg) obj4;
        Long l = (Long) obj3;
        return new nvn((Uri) obj, (Bitmap) obj2, l, nvgVar, num2, num, (PointF) this.f45857e);
    }
}
