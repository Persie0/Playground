package p000;

import android.app.Activity;
import android.view.WindowManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class emc implements ohi {

    /* JADX INFO: renamed from: a */
    private final gtd f14700a;

    public emc(gtd gtdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f14700a = gtdVar;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final WindowManager get() {
        WindowManager windowManager = ((Activity) this.f14700a.f26334a).getWindowManager();
        windowManager.getClass();
        return windowManager;
    }
}
