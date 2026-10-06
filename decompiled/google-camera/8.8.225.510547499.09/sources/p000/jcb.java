package p000;

import android.content.Context;
import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jcb extends jby {

    /* JADX INFO: renamed from: j */
    public static final List f33699j = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: k */
    public final List f33700k;

    public jcb(Context context, String str, EnumSet enumSet, msi msiVar) {
        super(context, str, enumSet);
        this.f33700k = new CopyOnWriteArrayList();
    }

    @Deprecated
    /* JADX INFO: renamed from: e */
    public final jbz m12888e(nyw nywVar) {
        jib.m13205j(nywVar);
        return new jbz(this, nywVar);
    }
}
