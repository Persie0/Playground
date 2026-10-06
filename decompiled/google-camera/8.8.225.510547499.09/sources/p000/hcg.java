package p000;

import android.content.Context;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hcg {

    /* JADX INFO: renamed from: a */
    private final Supplier f27236a;

    public hcg(Context context) {
        fff fffVar = new fff(context, 2);
        this.f27236a = fffVar;
        ((Long) fffVar.get()).longValue();
    }

    /* JADX INFO: renamed from: a */
    public final long m10103a() {
        return ((Long) this.f27236a.get()).longValue();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m10104b() {
        return m10103a() >= 107703678;
    }

    public final String toString() {
        return "sideline-version=" + m10103a();
    }
}
