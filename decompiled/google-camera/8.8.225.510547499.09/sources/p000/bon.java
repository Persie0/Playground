package p000;

import android.graphics.Point;
import android.hardware.Camera;
import android.util.Size;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bon {

    /* JADX INFO: renamed from: a */
    private final Point f4020a;

    public bon(int i, int i2) {
        this.f4020a = new Point(i, i2);
    }

    /* JADX INFO: renamed from: c */
    public static List m2809c(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new bon((Size) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final int m2810a() {
        return this.f4020a.y;
    }

    /* JADX INFO: renamed from: b */
    public final int m2811b() {
        return this.f4020a.x;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bon) {
            return this.f4020a.equals(((bon) obj).f4020a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4020a.hashCode();
    }

    public final String toString() {
        return "Size: (" + m2811b() + " x " + m2810a() + ")";
    }

    public bon(Camera.Size size) {
        if (size == null) {
            this.f4020a = new Point(0, 0);
        } else {
            this.f4020a = new Point(size.width, size.height);
        }
    }

    public bon(Size size) {
        if (size == null) {
            this.f4020a = new Point(0, 0);
        } else {
            this.f4020a = new Point(size.getWidth(), size.getHeight());
        }
    }

    public bon(bon bonVar) {
        if (bonVar == null) {
            this.f4020a = new Point(0, 0);
        } else {
            this.f4020a = new Point(bonVar.m2811b(), bonVar.m2810a());
        }
    }
}
