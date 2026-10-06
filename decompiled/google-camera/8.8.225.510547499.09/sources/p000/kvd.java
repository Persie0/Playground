package p000;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.apps.camera.facemetadata.conversions.FaceToBeautify;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kvd {

    /* JADX INFO: renamed from: a */
    public Object f37318a;

    /* JADX INFO: renamed from: b */
    public Object f37319b;

    /* JADX INFO: renamed from: c */
    public Object f37320c;

    /* JADX INFO: renamed from: d */
    public Object f37321d;

    /* JADX INFO: renamed from: e */
    public Object f37322e;

    /* JADX INFO: renamed from: f */
    public Object f37323f;

    /* JADX INFO: renamed from: g */
    public Object f37324g;

    /* JADX INFO: renamed from: h */
    public Object f37325h;

    /* JADX INFO: renamed from: i */
    public Object f37326i;

    /* JADX INFO: renamed from: j */
    public Object f37327j;

    /* JADX INFO: renamed from: k */
    public Object f37328k;

    public kvd() {
    }

    public kvd(byte[] bArr) {
        mqu mquVar = mqu.f41450a;
        this.f37321d = mquVar;
        this.f37322e = mquVar;
        this.f37323f = mquVar;
        this.f37324g = mquVar;
        this.f37325h = mquVar;
        this.f37326i = mquVar;
        this.f37327j = mquVar;
        this.f37328k = mquVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m14928a(kve kveVar) {
        if (kveVar == null) {
            throw new NullPointerException("Null engineType");
        }
        this.f37319b = kveVar;
    }

    /* JADX INFO: renamed from: b */
    public final FaceToBeautify m14929b() {
        Object obj = this.f37321d;
        if (obj == null) {
            throw new IllegalStateException("Missing required properties: bounds");
        }
        Object obj2 = this.f37328k;
        Object obj3 = this.f37326i;
        Object obj4 = this.f37327j;
        Object obj5 = this.f37318a;
        Object obj6 = this.f37325h;
        Object obj7 = this.f37324g;
        Object obj8 = this.f37323f;
        Object obj9 = this.f37319b;
        Object obj10 = this.f37322e;
        Point point = (Point) obj10;
        Point point2 = (Point) obj9;
        Point point3 = (Point) obj8;
        Point point4 = (Point) obj7;
        Point point5 = (Point) obj6;
        Point point6 = (Point) obj5;
        Float f = (Float) obj3;
        return new drp((Rect) obj, (Integer) obj2, f, (Float) obj4, point6, point5, point4, point3, point2, point, (float[]) this.f37320c);
    }
}
