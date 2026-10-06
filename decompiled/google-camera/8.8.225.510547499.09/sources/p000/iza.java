package p000;

import android.graphics.PorterDuff;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum iza {
    NONE(PorterDuff.Mode.SRC_ATOP),
    COLOR(PorterDuff.Mode.SRC_ATOP),
    ALPHA(PorterDuff.Mode.DST_OUT);


    /* JADX INFO: renamed from: d */
    public final PorterDuff.Mode f32702d;

    iza(PorterDuff.Mode mode) {
        this.f32702d = mode;
    }
}
