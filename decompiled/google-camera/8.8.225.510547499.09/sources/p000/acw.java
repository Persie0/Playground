package p000;

import android.graphics.drawable.Drawable;
import java.io.FileOutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class acw {
    /* JADX INFO: renamed from: a */
    public static int m244a(Drawable drawable) {
        return drawable.getLayoutDirection();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m245b(Drawable drawable, int i) {
        return drawable.setLayoutDirection(i);
    }

    /* JADX INFO: renamed from: c */
    public static amv m246c(FileOutputStream fileOutputStream, oyo oyoVar) {
        amt amtVar = new amt();
        bck bckVar = new bck(amtVar, oyoVar, (byte[]) null, (byte[]) null, (byte[]) null);
        mca mcaVar = new mca();
        ams amsVar = new ams(null);
        amsVar.m972c("isom", 131072);
        amsVar.m971b("isom");
        amsVar.m971b("iso2");
        amsVar.m971b("mp41");
        amz amzVar = new amz(fileOutputStream, bckVar, mcaVar, amsVar, null, null, null, null);
        short[][] sArr = ana.f837a;
        return new amv(amzVar, amtVar);
    }
}
