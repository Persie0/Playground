package p026b5;

import android.annotation.SuppressLint;
import androidx.work.ExistingWorkPolicy;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: b5.j */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AddedAbstractMethod"})
public abstract class AbstractC1317j {
    /* JADX INFO: renamed from: a */
    public abstract InterfaceC1316i mo4876a(List<? extends AbstractC1318k> list);

    /* JADX INFO: renamed from: b */
    public final void m4877b(C1315h c1315h) {
        mo4876a(Collections.singletonList(c1315h));
    }

    /* JADX INFO: renamed from: c */
    public abstract InterfaceC1316i mo4878c(String str, ExistingWorkPolicy existingWorkPolicy, List<C1315h> list);
}
