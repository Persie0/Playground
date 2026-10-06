package p000;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lbs extends lcf {
    protected lbs(lby lbyVar, kzx kzxVar) {
        super(lbyVar, kzxVar);
    }

    /* JADX INFO: renamed from: b */
    public static lbs m15151b(lby lbyVar, int i, ByteBuffer byteBuffer) {
        return new lbs(lbyVar, lcf.m15165d(lbyVar, new lbr(lbyVar, i, byteBuffer)));
    }

    public final String toString() {
        return "GLBuffer{" + ((ldh) m15167f()).toString() + "}";
    }
}
