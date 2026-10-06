package p000;

import android.content.Context;
import android.view.Display;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum ilk {
    PORTRAIT(0),
    LANDSCAPE(270),
    REVERSE_LANDSCAPE(90),
    REVERSE_PORTRAIT(180);


    /* JADX INFO: renamed from: e */
    public final int f31449e;

    ilk(int i) {
        this.f31449e = i;
    }

    /* JADX INFO: renamed from: a */
    public static ilk m11425a(int i) {
        switch (i) {
            case 0:
                return PORTRAIT;
            case 90:
                return REVERSE_LANDSCAPE;
            case 180:
                return REVERSE_PORTRAIT;
            case 270:
                return LANDSCAPE;
            default:
                throw new IllegalArgumentException("Unsupported orientation degrees: " + i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static ilk m11426b(Display display, Context context) {
        int rotation;
        if (!jpd.m13432m(context, display) && (rotation = display.getRotation()) != 0) {
            if (rotation == 2) {
                return REVERSE_PORTRAIT;
            }
            if (rotation == 1) {
                return LANDSCAPE;
            }
            if (rotation == 3) {
                return REVERSE_LANDSCAPE;
            }
            throw new IllegalStateException("Unknown display rotation");
        }
        return PORTRAIT;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m11427e(ilk ilkVar) {
        return ilkVar.equals(PORTRAIT) || ilkVar.equals(REVERSE_PORTRAIT);
    }

    /* JADX INFO: renamed from: c */
    public final ilk m11428c() {
        switch (this) {
            case PORTRAIT:
                return REVERSE_PORTRAIT;
            case LANDSCAPE:
                return REVERSE_LANDSCAPE;
            case REVERSE_LANDSCAPE:
                return LANDSCAPE;
            case REVERSE_PORTRAIT:
                return PORTRAIT;
            default:
                throw new IllegalArgumentException("unsupported orientation: ".concat(toString()));
        }
    }

    /* JADX INFO: renamed from: d */
    public final ilk m11429d() {
        switch (this) {
            case PORTRAIT:
                return LANDSCAPE;
            case LANDSCAPE:
                return PORTRAIT;
            case REVERSE_LANDSCAPE:
                return REVERSE_PORTRAIT;
            case REVERSE_PORTRAIT:
                return REVERSE_LANDSCAPE;
            default:
                throw new IllegalArgumentException("unsupported orientation: ".concat(toString()));
        }
    }
}
