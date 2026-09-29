package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import p000.c54;
import p000.cm7;
import p000.nj0;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements c54 {
    @Override // p000.c54
    /* JADX INFO: renamed from: a */
    public final List mo2060a() {
        return Collections.EMPTY_LIST;
    }

    @Override // p000.c54
    /* JADX INFO: renamed from: b */
    public final Object mo2061b(Context context) {
        Choreographer.getInstance().postFrameCallback(new cm7(this, context.getApplicationContext()));
        return new nj0(15);
    }
}
