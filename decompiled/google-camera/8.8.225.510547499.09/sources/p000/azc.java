package p000;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class azc extends aqc {

    /* JADX INFO: renamed from: c */
    private final Context f2757c;

    public azc(Context context, int i, int i2) {
        super(i, i2);
        this.f2757c = context;
    }

    @Override // p000.aqc
    /* JADX INFO: renamed from: a */
    public final void mo1857a(aqp aqpVar) {
        if (this.f2110b >= 10) {
            aqpVar.mo1874m(new Object[]{"reschedule_needed", 1});
        } else {
            this.f2757c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
