package p000;

import android.content.Context;
import androidx.sqlite.p006db.framework.C0762a;
import kotlin.AbstractC3192a;

/* JADX INFO: loaded from: classes.dex */
public final class ah3 implements yn9 {

    /* JADX INFO: renamed from: a */
    public final Context f646a;

    /* JADX INFO: renamed from: b */
    public final String f647b;

    /* JADX INFO: renamed from: c */
    public final C3126ix f648c;

    /* JADX INFO: renamed from: d */
    public final boolean f649d;

    /* JADX INFO: renamed from: e */
    public final boolean f650e;

    /* JADX INFO: renamed from: f */
    public final cs4 f651f;

    /* JADX INFO: renamed from: g */
    public boolean f652g;

    public ah3(Context context, String str, C3126ix c3126ix, boolean z, boolean z2) {
        context.getClass();
        c3126ix.getClass();
        this.f646a = context;
        this.f647b = str;
        this.f648c = c3126ix;
        this.f649d = z;
        this.f650e = z2;
        this.f651f = AbstractC3192a.m15356a(new C3757xf(this, 13));
    }

    @Override // p000.yn9
    /* JADX INFO: renamed from: I */
    public final xg3 mo397I() {
        return ((C0762a) this.f651f.getValue()).m2869a(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        cs4 cs4Var = this.f651f;
        if (cs4Var.isInitialized()) {
            ((C0762a) cs4Var.getValue()).close();
        }
    }

    @Override // p000.yn9
    public final String getDatabaseName() {
        return this.f647b;
    }

    @Override // p000.yn9
    public final void setWriteAheadLoggingEnabled(boolean z) {
        cs4 cs4Var = this.f651f;
        if (cs4Var.isInitialized()) {
            ((C0762a) cs4Var.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.f652g = z;
    }
}
