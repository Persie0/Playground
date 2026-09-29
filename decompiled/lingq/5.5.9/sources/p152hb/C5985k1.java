package p152hb;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: hb.k1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5985k1 {

    /* JADX INFO: renamed from: c */
    public static final Status f35522c = new Status("The connection to Google Play services was lost", 8);

    /* JADX INFO: renamed from: a */
    public final Set<BasePendingResult<?>> f35523a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* JADX INFO: renamed from: b */
    public final C5982j1 f35524b = new C5982j1(this);
}
