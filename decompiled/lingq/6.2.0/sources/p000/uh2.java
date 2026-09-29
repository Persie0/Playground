package p000;

import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public final class uh2 implements i99 {

    /* JADX INFO: renamed from: a */
    public final Context f63925a;

    public uh2(Context context) {
        this.f63925a = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uh2) {
            return fa4.m11650l(this.f63925a, ((uh2) obj).f63925a);
        }
        return false;
    }

    @Override // p000.i99
    /* JADX INFO: renamed from: h */
    public final Object mo11204h(Continuation continuation) {
        DisplayMetrics displayMetrics = this.f63925a.getResources().getDisplayMetrics();
        lg2 lg2Var = new lg2(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new w89(lg2Var, lg2Var);
    }

    public final int hashCode() {
        return this.f63925a.hashCode();
    }
}
