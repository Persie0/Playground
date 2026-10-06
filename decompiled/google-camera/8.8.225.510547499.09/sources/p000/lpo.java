package p000;

import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lpo extends lpv {
    public lpo(lpt lptVar, String str, Integer num) {
        super(lptVar, str, num, false);
    }

    @Override // p000.lpv
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo15831a(Object obj) {
        try {
            return Integer.valueOf(Integer.parseInt((String) obj));
        } catch (NumberFormatException e) {
            Log.e("PhenotypeFlag", "Invalid int value for " + super.m15846f() + ": " + ((String) obj));
            return null;
        }
    }
}
