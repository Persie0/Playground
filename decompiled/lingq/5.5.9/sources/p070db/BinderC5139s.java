package p070db;

import android.content.Context;
import android.os.Binder;
import android.support.v4.media.session.C0166e;
import p262mb.C7533f;

/* JADX INFO: renamed from: db.s */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC5139s extends AbstractBinderC5135o {

    /* JADX INFO: renamed from: a */
    public final Context f33119a;

    public BinderC5139s(Context context) {
        this.f33119a = context;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: j */
    public final void m10917j() {
        if (!C7533f.m15045a(this.f33119a, Binder.getCallingUid())) {
            throw new SecurityException(C0166e.m762h("Calling UID ", Binder.getCallingUid(), " is not Google Play services."));
        }
    }
}
