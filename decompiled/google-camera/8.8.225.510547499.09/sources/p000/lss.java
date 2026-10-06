package p000;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lss implements lsa {

    /* JADX INFO: renamed from: a */
    private final nzd f39141a;

    /* JADX INFO: renamed from: b */
    private final nxf f39142b = nxf.f44904a;

    public lss(nzd nzdVar) {
        this.f39141a = nzdVar;
    }

    @Override // p000.lsa
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo15928a(lie lieVar) throws IOException {
        InputStream inputStreamM15950b = lst.m15950b(lieVar);
        try {
            Object objMo17766a = this.f39141a.mo17766a(inputStreamM15950b, this.f39142b);
            if (inputStreamM15950b != null) {
                inputStreamM15950b.close();
            }
            return objMo17766a;
        } catch (Throwable th) {
            if (inputStreamM15950b != null) {
                try {
                    inputStreamM15950b.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    } catch (Exception e) {
                    }
                }
            }
            throw th;
        }
    }
}
