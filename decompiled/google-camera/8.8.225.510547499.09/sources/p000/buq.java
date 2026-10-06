package p000;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class buq implements bqf {
    @Override // p000.bqf
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo2915a(Object obj, File file, bqr bqrVar) throws Throwable {
        try {
            cav.m3365d((ByteBuffer) obj, file);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
