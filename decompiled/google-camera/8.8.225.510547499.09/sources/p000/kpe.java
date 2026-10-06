package p000;

import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.camera2.params.Face;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kpe {

    /* JADX INFO: renamed from: a */
    public final int f36795a;

    /* JADX INFO: renamed from: b */
    public final int f36796b;

    /* JADX INFO: renamed from: c */
    public final Rect f36797c;

    /* JADX INFO: renamed from: d */
    public final Point f36798d;

    /* JADX INFO: renamed from: e */
    public final Point f36799e;

    /* JADX INFO: renamed from: f */
    public final Point f36800f;

    public kpe(int i, Rect rect, int i2, Point point, Point point2, Point point3) {
        this.f36797c = rect;
        this.f36796b = i2;
        this.f36798d = point;
        this.f36799e = point2;
        this.f36800f = point3;
        this.f36795a = i;
    }

    /* JADX INFO: renamed from: a */
    public static kpe m14671a(Face face) {
        return new kpe(face.getId(), face.getBounds(), face.getScore(), face.getLeftEyePosition(), face.getRightEyePosition(), face.getMouthPosition());
    }
}
