package p273n7;

import java.io.File;
import java.util.List;
import p148h7.C5899b;
import p216k7.C6626a;

/* JADX INFO: renamed from: n7.b */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC7714b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42243a;

    public RunnableC7714b(int i10) {
        this.f42243a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<C5899b> listMo5439f = C6626a.f37566f.m13255a().mo5439f(this.f42243a);
        if (listMo5439f != null) {
            for (C5899b c5899b : listMo5439f) {
                String strM15306b = C7715c.m15306b(c5899b.f35239d, c5899b.f35240e);
                C6626a.f37566f.m13255a().remove(c5899b.f35236a);
                File file = new File(strM15306b);
                if (file.exists()) {
                    file.delete();
                }
            }
        }
    }
}
